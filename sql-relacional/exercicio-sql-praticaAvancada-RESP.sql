# Mostre o nome, a posição e a localização dos departamentos onde os vendedores trabalham

select fc.nome, fc.posto, dp.localidade
from funcionario fc join departamento dp on fc.depto_nro = dp.depto_nro
where fc.posto = 'vendedor';

# Mostre os departamentos com mais de cinco empregados

select dp.nome_depto, count(*) as total
from departamento dp join funcionario fc on dp.depto_nro = fc.depto_nro
group by dp.nome_depto
having total > 2;

# Mostre o nome, o salário e o nome do departamento dos empregados que têm a mesma posição que "Mito Barchuk"

select fc.nome, fc.salario, dp.nome_depto
from funcionario fc join departamento dp on fc.depto_nro = dp.depto_nro
where fc.posto =
(select posto
from funcionario
where nome = 'Daniel' and sobrenome = 'Brezezicki');

# Mostre os detalhes dos empregados que trabalham no departamento de contabilidade, ordenados por nome

select fc.*
from funcionario fc join departamento dp on fc.depto_nro = dp.depto_nro
where dp.nome_depto = 'contabilidade'
order by fc.nome;

# Mostre o nome do empregado com o salário mais baixo

select fc.nome, fc.sobrenome
from funcionario fc
where salario = 
	(select min(salario)
	from funcionario);

# Mostre os detalhes do empregado com o salário mais alto no departamento de "Vendas"

select fc.nome, fc.sobrenome
from funcionario fc join departamento dp on fc.depto_nro = dp.depto_nro
where dp.nome_depto = 'vendas' and fc. salario = 
	(select max(salario)
	from funcionario fc join departamento dp on fc.depto_nro = dp.depto_nro
    where dp.nome_depto = 'vendas');
    