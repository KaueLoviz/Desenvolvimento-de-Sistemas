use dbLocadoraVeiculo

	-- B --

		-- Fabricante

		create procedure spInsereFabricante @nomeFabricante varchar(35), @cnpjFabricante varchar(14) as
		begin
			if exists(select cnpjFabricante from tbFabricante where cnpjFabricante like @cnpjFabricante)
				begin print('Fabricante já cadastrado!') end
			else
				begin
					insert into tbFabricante(nomeFabricante, cnpjFabricante) values(@nomeFabricante, @cnpjFabricante)
				end
		end

		exec spInsereFabricante 'Ford', '89434343000121'
		exec spInsereFabricante 'GM', '33873233000122'
		exec spInsereFabricante 'Honda', '73222323000192'
		exec spInsereFabricante 'Hyundai', '83222323000109'
		exec spInsereFabricante 'Toyota', '23234983000199'

		select idFabricante, nomeFabricante as 'Fabricante', cnpjFabricante as 'CNPJ' from tbFabricante

		-- Tipo Combustível

		create procedure spInsereTipoCombustivel @descCombustivel varchar(10) as
		begin
			if exists(select descricaoTipoCombustivel from tbTipoCombustivel where descricaoTipoCombustivel like @descCombustivel)
				begin print('Combustível já cadastrado!') end
			else
				begin
					insert into tbTipoCombustivel(descricaoTipoCombustivel) values(@descCombustivel)
				end
		end

		exec spInsereTipoCombustivel 'Alcool'
		exec spInsereTipoCombustivel 'Diesel'
		exec spInsereTipoCombustivel 'Gasolina'
		exec spInsereTipoCombustivel 'GNV'
		exec spInsereTipoCombustivel 'Flex'

		select idTipoCombustivel, descricaoTipoCombustivel as 'Tipo de combustível' from tbTipoCombustivel

		-- Categoria Veículo

		create procedure spInsereCategoriaVeiculo @descCategoriaVeiculo varchar(30), @valorDiariaVeiculo smallmoney as
		begin
			if exists(select descricaoCategoriaVeiculo from tbCategoriaVeiculo where descricaoCategoriaVeiculo like @descCategoriaVeiculo)
				begin print('Categoria já cadastrada!') end
			else
				begin
					insert into tbCategoriaVeiculo(descricaoCategoriaVeiculo, valorDiariaCategoria) values(@descCategoriaVeiculo, @valorDiariaVeiculo)
				end
		end

		exec spInsereCategoriaVeiculo 'Passeio Simples', 200.00
		exec spInsereCategoriaVeiculo 'Passeio Intermediario', 300.00
		exec spInsereCategoriaVeiculo 'Utilitario Peq', 300.00
		exec spInsereCategoriaVeiculo 'Utilitario Gran', 700.00
		exec spInsereCategoriaVeiculo 'SUV', 700.00

		select idCategoriaVeiculo, descricaoCategoriaVeiculo as 'Categoria', valorDiariaCategoria as 'Valor/dia' from tbCategoriaVeiculo

		-- Cliente

		create procedure spInsereCliente @nomeCliente varchar(35), @dataNascCliente date, @cpfCliente varchar(14), @idadeCliente int as
		begin
			if exists(select cpfCliente from tbCliente where cpfCliente like @cpfCliente)
				begin print('Cliente já cadastrado!') end
			else
				begin
					insert into tbCliente(nomeCliente, dataNascCliente, cpfCliente, idadeCliente) values(@nomeCliente, @dataNascCliente, @cpfCliente, @idadeCliente)
				end
		end

		exec spInsereCliente 'Vanessa Ferraz', '1984/11/18', '12345678900', 35
		exec spInsereCliente 'Rosangela Freire', '1983/06/03', '98309933399', 36
		exec spInsereCliente 'Erico Veriscimo', '1990/04/16', '12243322222', 29
		exec spInsereCliente 'Junior Santos', '1984/07/14', '33322255593', 35

		select idCliente, nomeCliente as 'Cliente', convert(varchar, dataNascCliente, 103) as 'Nascimento', cpfCliente as 'Cpf', idadeCliente as 'Idade' from tbCliente

		-- Veículo

		create procedure spInsereVeiculo @modeloVeiculo varchar(20), @placaVeiculo varchar(7), @origemVeiculo varchar(2), @kmVeiculo int,
			@idFabricante int, @idTipoCombustivel int, @idCategoriaVeiculo int as
		begin
			if exists(select placaVeiculo from tbVeiculo where placaVeiculo like @placaVeiculo) begin print('Placa já cadastrada') end
			else if not exists(select idFabricante from tbFabricante where idFabricante = @idFabricante) begin print('Fabricante não existente!') end
			else if not exists(select idTipoCombustivel from tbTipoCombustivel where idTipoCombustivel = @idTipoCombustivel) begin print('Combustível não existente!') end
			else if not exists(select idCategoriaVeiculo from tbCategoriaVeiculo where idCategoriaVeiculo = @idCategoriaVeiculo) begin print('Categoria não existente!') end
			else
				begin
					insert into tbVeiculo(modeloVeiculo, placaVeiculo, origemVeiculo, kmVeiculo, idFabricante, idTipoCombustivel, idCategoriaVeiculo)
					values(@modeloVeiculo, @placaVeiculo, @origemVeiculo, @kmVeiculo, @idFabricante, @idTipoCombustivel, @idCategoriaVeiculo)
				end
		end

		exec spInsereVeiculo 'HRV', 'ABC1234', 'SP', 10000, 3, 5, 5
		exec spInsereVeiculo 'Prisma LTZ', 'FGR1222', 'SP', 5000, 2, 5, 1
		exec spInsereVeiculo 'Hilux', 'TRE1224', 'SP', 1800, 5, 2, 4
		exec spInsereVeiculo 'HB20 S', 'WSA3220', 'RJ', 2000, 4, 5, 2
		exec spInsereVeiculo 'Ford Ka', 'RED3544', 'RJ', 12300, 1, 5, 1
		exec spInsereVeiculo 'Ford Edge', 'TPO9000', 'SP', 1500, 1, 2, 4
		exec spInsereVeiculo 'Creta', 'VCF3333', 'RJ', 2000, 4, 5, 2
		exec spInsereVeiculo 'Onix', 'BSE5444', 'SP', 2300, 2, 5, 1

		select idVeiculo, modeloVeiculo as 'Veículo', placaVeiculo as 'Placa', origemVeiculo as 'Origem', kmVeiculo as 'Km',
			idFabricante, idTipoCombustivel, idCategoriaVeiculo from tbVeiculo


	-- C --

	create procedure spInsereLocacao @dataLocacao date, @dataDevolucao date, @cpfCliente varchar(14), @placaVeiculo varchar(7) as
	begin
		if not exists(select idCliente from tbCliente where cpfCliente = @cpfCliente) begin print('Cliente não encontrado!') end
		if not exists(select idVeiculo from tbVeiculo where placaVeiculo = @placaVeiculo) begin print('Veículo não encontrado!') end
		else
			begin
				declare @idCliente int = (select idCliente from tbCliente where cpfCliente = @cpfCliente)
				declare @idVeiculo int = (select idVeiculo from tbVeiculo where placaVeiculo = @placaVeiculo)
				declare @diarias int = datediff(day, getdate(), @dataDevolucao)
				declare @valorTot smallmoney = @diarias * (select valorDiariaCategoria from tbCategoriaVeiculo
													inner join tbVeiculo on tbVeiculo.idCategoriaVeiculo = tbCategoriaVeiculo.idCategoriaVeiculo
														where idVeiculo = @idVeiculo)
				insert into tbLocacao(dataLocacao, dataDevolucao, numeroDiariasLocacao, valorTotalLocacao, idCliente, idVeiculo)
				values(@dataLocacao, @dataDevolucao, @diarias, @valorTot, @idCliente, @idVeiculo)
			end
	end


	-- D --

	declare @currentDate date = getdate()

		-- O cliente Érico alugou uma Hilux até o dia 10/06/2019
		exec spInsereLocacao @currentDate, '2020/12/10', '12243322222', 'TRE1224'

		-- A cliente Vanessa alugou um Creta até dia 05/06/2019
		exec spInsereLocacao @currentDate, '2020/12/05', '12345678900', 'VCF3333'

		-- A cliente Rosangela alugou uma HRV até dia 12/06/2019
		exec spInsereLocacao @currentDate, '2020/12/12', '98309933399', 'ABC1234'

		-- O cliente Erico alugou um ford Ka até o dia 15/06/2019
		exec spInsereLocacao @currentDate, '2020/12/15', '12243322222', 'RED3544'

		-- A cliente Vanessa alugou o HB20 S até o dia 20/06/2019
		exec spInsereLocacao @currentDate, '2020/12/20', '12345678900', 'WSA3220'

		-- A cliente Rosangela alugou um Ford Ka até 24/12/2020
		exec spInsereLocacao @currentDate, '2020/12/24', '98309933399', 'RED3544'

		select idLocacao, nomeCliente as 'Cliente', modeloVeiculo as 'Veículo', convert(varchar, dataLocacao, 103) as 'Locação',
			convert(varchar, dataDevolucao, 103) as 'Devolução', numeroDiariasLocacao as 'Diárias', valorTotalLocacao as 'Total' from tbLocacao
				inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo
					inner join tbCliente on tbLocacao.idCliente = tbCliente.idCliente
					
	-- E --

		-- 1 --

		select nomeCliente as 'Cliente', placaVeiculo as 'Placa' from tbCliente
			inner join tbLocacao on tbCliente.idCliente = tbLocacao.idCliente
				inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo

		-- 2 --

		select nomeFabricante as 'Fabricante', count(idLocacao) as 'Locações' from tbLocacao
			inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo
				inner join tbFabricante on tbVeiculo.idFabricante = tbFabricante.idFabricante
					group by nomeFabricante

		-- 3 --

		select count(idVeiculo) as 'Veículos em São Paulo' from tbVeiculo
			where origemVeiculo like 'SP'
				group by origemVeiculo


		-- 4 --

		select nomeFabricante as 'Fabricante', count(idVeiculo) as 'Total de veículos' from tbVeiculo
			inner join tbFabricante on tbVeiculo.idFabricante = tbFabricante.idFabricante
				group by nomeFabricante

		-- 5 --

		select nomeFabricante as 'Fabricante', avg(valorDiariaCategoria) as 'Média diária' from tbCategoriaVeiculo
			inner join tbVeiculo on  tbCategoriaVeiculo.idCategoriaVeiculo = tbVeiculo.idCategoriaVeiculo
				inner join tbFabricante on tbVeiculo.idFabricante = tbFabricante.idFabricante
					group by nomeFabricante

		-- 6 --
		
		select nomeFabricante as 'Fabricante', count(idLocacao) as 'Locações' from tbLocacao
			inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo
				inner join tbFabricante on tbVeiculo.idFabricante = tbFabricante.idFabricante
					group by nomeFabricante

		-- 7 --
		
		select nomeCliente as 'Cliente', count(idLocacao) as 'Locações' from tbLocacao
			inner join tbCliente on tbLocacao.idCliente = tbCliente.idCliente
					group by nomeCliente

		-- 8 --
		
		select nomeCliente as 'Cliente', valorTotalLocacao from tbLocacao
			inner join tbCliente on tbLocacao.idCliente = tbCliente.idCliente
				where valorTotalLocacao = (select max(valorTotalLocacao) from tbLocacao)

		-- 9 --

		select modeloVeiculo as 'Veículo', placaVeiculo as 'Placa' from tbVeiculo
			where idVeiculo not in (select idVeiculo from tbLocacao)

		--10--
		select count(placaVeiculo)'Qtd de veiculos locados', origemVeiculo FROM tbLocacao
		INNER JOIN tbVeiculo ON tbLocacao.codVeiculo = tbVeiculo.codVeiculo	
		GROUP BY origemVeiculo		


		-- 11 -- (Todos fizeram locações)

		select nomeCliente as 'Cliente' from tbCliente
			where idCliente not in (select idCliente from tbLocacao)

		-- 12 --

		select modeloVeiculo as 'Veículo', avg(kmVeiculo) as 'Média (km)' from tbVeiculo
			group by modeloVeiculo

		-- 13 --

		select nomeFabricante as 'Fabricante', avg(kmVeiculo) as 'Média (km)' from tbVeiculo
			inner join tbFabricante on tbVeiculo.idFabricante = tbFabricante.idFabricante
				group by nomeFabricante


		-- 14 --

		select modeloVeiculo as 'Veículo', descricaoTipoCombustivel as 'Combustível' from tbVeiculo
			inner join tbTipoCombustivel on tbVeiculo.idTipoCombustivel = tbTipoCombustivel.idTipoCombustivel

		-- 15 --

		select descricaoTipoCombustivel as 'Combustíveis sem veículos cadastrados' from tbTipoCombustivel
			where idTipoCombustivel not in (select idTipoCombustivel from tbVeiculo)

		-- 16 -- (Data de locação sempre será o GETDATE(), então todas serão iguais)

		select nomeCliente as 'Cliente', modeloVeiculo as 'Veículo', placaVeiculo as 'Placa', convert(varchar, dataLocacao, 103) as 'Locação' from tbLocacao
			inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo
				inner join tbCliente on tbLocacao.idCliente = tbCliente.idCliente

		-- 17 --

		select modeloVeiculo as 'Modelo', count(idLocacao) as 'Qntd. locações' from tbLocacao
			inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo
				group by modeloVeiculo

		-- 18 --

		select descricaoCategoriaVeiculo as 'Categoria', count(idLocacao) as 'Qntd. locações' from tbLocacao
			inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo
				inner join tbCategoriaVeiculo on tbVeiculo.idCategoriaVeiculo = tbCategoriaVeiculo.idCategoriaVeiculo
					group by descricaoCategoriaVeiculo

		-- 19 --

		select nomeFabricante as 'Fabricante', avg(valorTotalLocacao) as 'Média (Valor de locação)' from tbLocacao
			inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo
				inner join tbFabricante on tbVeiculo.idFabricante = tbFabricante.idFabricante
					group by nomeFabricante

		-- 20 --

		select nomeCliente as 'Cliente', avg(valorTotalLocacao) as 'Média (Valor de locação)' from tbLocacao
			inner join tbCliente on tbLocacao.idCliente = tbCliente.idCliente
				group by nomeCliente
	
		-- 21 --

		select descricaoCategoriaVeiculo as 'Categorias mais caras' from tbCategoriaVeiculo
		where valorDiariaCategoria = (select max(valorDiariaCategoria) from tbCategoriaVeiculo)

		-- 22 --

		select nomeFabricante as 'Fabricante' from tbCategoriaVeiculo
			inner join tbVeiculo on tbCategoriaVeiculo.idCategoriaVeiculo = tbVeiculo.idCategoriaVeiculo
				inner join tbFabricante on tbVeiculo.idFabricante = tbFabricante.idFabricante
					where valorDiariaCategoria = (select max(valorDiariaCategoria) from tbCategoriaVeiculo)

		-- 23 --

		select modeloVeiculo as 'Veículo', placaVeiculo as 'Placa' from tbLocacao
			inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo
				where valorTotalLocacao = (select max(valorTotalLocacao) from tbLocacao)
		
		-- 24 --

		select modeloVeiculo as 'Veículo', placaVeiculo as 'Placa', nomeFabricante as 'Fabricante' from tbVeiculo
			inner join tbFabricante on tbVeiculo.idFabricante = tbFabricante.idFabricante
				where idVeiculo in (select idVeiculo from tbLocacao)
					order by placaVeiculo asc

		-- 25 --

		select nomeCliente as 'Cliente', count(idLocacao) as 'Qntd. Locações' from tbLocacao
			inner join tbCliente on tbLocacao.idCliente = tbCliente.idCliente
				inner join tbVeiculo on tbLocacao.idVeiculo = tbVeiculo.idVeiculo
					inner join tbFabricante on tbVeiculo.idFabricante = tbFabricante.idFabricante
						where nomeFabricante like 'Ford'
							group by nomeCliente

		-- 26 --

		select count(idCliente) as 'Clientes acima dos 30 anos' from tbCliente
			where idadeCliente > 30

		-- 27 --

		select avg(idadeCliente) as 'Média da idade dos clientes' from tbCliente

		-- 28 --

		select nomeCliente as 'Cliente mais jovem' from tbCliente
			where idadeCliente = (select min(idadeCliente) from tbCliente)

		-- 29 --

		select nomeCliente as 'Cliente mais velho' from tbCliente
			where idadeCliente = (select max(idadeCliente) from tbCliente)

		-- 30 --

		set language Brazilian
		select nomeCliente as 'Cliente', datename(month from dataNascCliente) as 'Mês que faz aniversário' from tbCliente

		-- 31 --

		select datename(month, dataLocacao) [Mês], count(idLocacao) as 'Qtnd. Locações' from tbLocacao
			group by dataLocacao

		-- 32 --

		select count(idVeiculo) as 'Qtnd. veículo(s) proibídos na Segunda-Feira' from tbVeiculo
			where substring(placaVeiculo, 7, 7) like '1' or substring(placaVeiculo, 7, 7) like '2'

		-- 33 --

		create table tbNewCars(
			idVeiculo int primary key identity(9, 1)
			,modeloVeiculo varchar(20) not null
			,placaVeiculo varchar(7) not null
			,origemVeiculo varchar(2) not null
			,kmVeiculo int not null
			,idFabricante int foreign key references tbFabricante(idFabricante)
			,idTipoCombustivel int foreign key references tbTipoCombustivel(idTipoCombustivel)
			,idCategoriaVeiculo int foreign key references tbCategoriaVeiculo(idCategoriaVeiculo)
		)

		insert into tbNewCars(modeloVeiculo, placaVeiculo, origemVeiculo, kmVeiculo, idFabricante, idTipoCombustivel, idCategoriaVeiculo)
		values('Tucson', 'XYZ9875', 'MG', 2000, 4, 4, 5)
		,('Corolla', 'BCD2354', 'SP', 5000, 5, 3, 3)
		,('CRV', 'IJK2943', 'RJ', 7000, 3, 1, 5)
		,('Ecosport', 'LOP3187', 'MT', 1000, 1, 4, 4)

		select * from tbVeiculo
		select * from tbNewCars

		merge tbVeiculo dest using tbNewCars orig on
		dest.idVeiculo = orig.idVeiculo
		when not matched then insert values(orig.modeloVeiculo, orig.placaVeiculo, orig.origemVeiculo,
			orig.kmVeiculo, orig.idFabricante, orig.idTipoCombustivel, orig.idCategoriaVeiculo);