-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 04-Dez-2022 às 22:02
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `vetcamp`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `adm_cargo`
--

CREATE TABLE `adm_cargo` (
  `id_cargo` int(11) NOT NULL,
  `descricao` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `adm_cargo`
--

INSERT INTO `adm_cargo` (`id_cargo`, `descricao`) VALUES
(1, 'Administrador'),
(2, 'Atendente'),
(3, 'Veterinario');

-- --------------------------------------------------------

--
-- Estrutura da tabela `adm_control`
--

CREATE TABLE `adm_control` (
  `id_control` int(11) NOT NULL,
  `data_control` varchar(50) NOT NULL,
  `tipo_control` varchar(50) NOT NULL,
  `descricao_control` varchar(150) NOT NULL,
  `valor_control` varchar(100) NOT NULL,
  `funcionario_control` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `adm_control`
--

INSERT INTO `adm_control` (`id_control`, `data_control`, `tipo_control`, `descricao_control`, `valor_control`, `funcionario_control`) VALUES
(1, '03/06', 'ALTI', 'Água, Luz, Telefone, Internet', '265.69', 'Cézar');

-- --------------------------------------------------------

--
-- Estrutura da tabela `adm_est`
--

CREATE TABLE `adm_est` (
  `id_est` int(11) NOT NULL,
  `data_est` varchar(20) NOT NULL,
  `produto_est` varchar(11) NOT NULL,
  `quantidade` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `adm_estsaida`
--

CREATE TABLE `adm_estsaida` (
  `id_est` int(11) NOT NULL,
  `data_est` varchar(100) NOT NULL,
  `prod_est` varchar(100) NOT NULL,
  `quant_est` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `adm_fornecedor`
--

CREATE TABLE `adm_fornecedor` (
  `id_fornecedor` int(11) NOT NULL,
  `nome_fornecedor` varchar(150) NOT NULL,
  `cnpj_fornecedor` varchar(50) NOT NULL,
  `endereco_fornecedor` varchar(150) NOT NULL,
  `telefone_fornecedor` varchar(50) NOT NULL,
  `email_fornecedor` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `adm_fornecedor`
--

INSERT INTO `adm_fornecedor` (`id_fornecedor`, `nome_fornecedor`, `cnpj_fornecedor`, `endereco_fornecedor`, `telefone_fornecedor`, `email_fornecedor`) VALUES
(1, 'VetShop', '66.526.332/0002-36', 'Quartel Rodolfo Miranda', '(62) 3156-6985', 'vetshop@hotmart.com'),
(2, 'DogShow', '56.885.562/0002-26', 'Rua Constantine Melo', '(11) 3565-6935', 'dogshowoficial@hotmail.com'),
(3, 'PremierPet', '24.256.887/0001-35', 'Rua Domingo Pedro', '(24) 6599-2541', 'premierpet@eduzz.com'),
(4, 'ShopCats', '56.998.324/0001-64', 'Rua Miau Arísco', '(12) 3569-4157', 'shopcatsofc@kultivi.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `adm_produto`
--

CREATE TABLE `adm_produto` (
  `id_produto` int(11) NOT NULL,
  `nome_produto` varchar(150) NOT NULL,
  `quantidade_produto` varchar(50) NOT NULL,
  `validade_produto` varchar(50) NOT NULL,
  `preco_unitario` varchar(50) NOT NULL,
  `preco_venda` varchar(50) NOT NULL,
  `fk_fornecedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `adm_produto`
--

INSERT INTO `adm_produto` (`id_produto`, `nome_produto`, `quantidade_produto`, `validade_produto`, `preco_unitario`, `preco_venda`, `fk_fornecedor`) VALUES
(1, 'Analgésicos', '85', '13/02/23', '2.50', '3.70', 1),
(2, 'Vacina', '54', '12/06/24', '2.50', '6.00', 2),
(3, 'Cicatrizante', '69', '18/09/23', '2.40', '2.90', 3),
(4, 'Ração Comum', '23', '14/03/23', '68.00', '80.00', 4),
(5, 'Antipulgas e Carrapatos.', '65', '13/12/24', '2.50', '3.70', 1),
(6, 'Antibióticos', '48', '18/12/22', '3.60', '4.20', 4),
(7, 'Antissépticos', '65', '12/07/25', '15.25', '23.50', 3),
(8, 'Ração Pedgree', '32', '23/02/23', '90.00', '124.00', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `adm_servico`
--

CREATE TABLE `adm_servico` (
  `id_servico` int(11) NOT NULL,
  `descricao` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `adm_usuario`
--

CREATE TABLE `adm_usuario` (
  `id_usuario` int(11) NOT NULL,
  `nome_usuario` varchar(150) NOT NULL,
  `cpf_usuario` varchar(50) NOT NULL,
  `endereco_usuario` varchar(150) NOT NULL,
  `telefone_usuario` varchar(50) NOT NULL,
  `login_usuario` varchar(150) NOT NULL,
  `login_senha` varchar(150) NOT NULL,
  `fk_cargo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `adm_usuario`
--

INSERT INTO `adm_usuario` (`id_usuario`, `nome_usuario`, `cpf_usuario`, `endereco_usuario`, `telefone_usuario`, `login_usuario`, `login_senha`, `fk_cargo`) VALUES
(1, 'Cézar Monteiro', '458.656.552-89', 'Rua Nárnia', '12 99856-2546', 'Cézar', '12345', 1),
(2, 'Cornélia Almeida', '456.662.554-22', 'Rua Campo Minado', '12 99563-5624', 'Cornélia', '12345', 3),
(3, 'Augusto Machado', '394.556.254-66', 'Rua Asgard', '12 96542-6977', 'Augusto', '12345', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `atn_agenda`
--

CREATE TABLE `atn_agenda` (
  `id_agenda` int(11) NOT NULL,
  `data_agenda` varchar(50) NOT NULL,
  `tipo_agenda` varchar(100) NOT NULL,
  `sexo_agenda` varchar(20) NOT NULL,
  `categoria_agenda` varchar(50) NOT NULL,
  `descricao_agenda` varchar(100) NOT NULL,
  `nome_animal` varchar(100) NOT NULL,
  `fk_animal` int(11) NOT NULL,
  `vet_agenda` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `atn_agenda`
--

INSERT INTO `atn_agenda` (`id_agenda`, `data_agenda`, `tipo_agenda`, `sexo_agenda`, `categoria_agenda`, `descricao_agenda`, `nome_animal`, `fk_animal`, `vet_agenda`) VALUES
(2, '12/12/22', 'Exame', 'Macho', 'Cachorro', 'Hipertenso', 'Beto', 1, 'Cornélia');

-- --------------------------------------------------------

--
-- Estrutura da tabela `atn_animal`
--

CREATE TABLE `atn_animal` (
  `id_animal` int(11) NOT NULL,
  `nome_animal` varchar(150) NOT NULL,
  `idade_animal` varchar(50) NOT NULL,
  `sexo_animal` varchar(50) NOT NULL,
  `descricao_animal` varchar(150) NOT NULL,
  `fk_cliente` int(11) NOT NULL,
  `categoria_animal` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `atn_animal`
--

INSERT INTO `atn_animal` (`id_animal`, `nome_animal`, `idade_animal`, `sexo_animal`, `descricao_animal`, `fk_cliente`, `categoria_animal`) VALUES
(1, 'Beto', '5', 'Macho', 'Hipertenso', 1, 'Cachorro'),
(2, 'Petúnia', '3', 'Fêmea', 'Manca', 2, 'Gato'),
(3, 'Moon', '7', 'Fêmea', 'Nenhuma', 2, 'Furão');

-- --------------------------------------------------------

--
-- Estrutura da tabela `atn_categoria`
--

CREATE TABLE `atn_categoria` (
  `id_categoria` int(11) NOT NULL,
  `descricao` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `atn_cliente`
--

CREATE TABLE `atn_cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome_cliente` varchar(150) NOT NULL,
  `cpf_cliente` varchar(50) NOT NULL,
  `endereco_cliente` varchar(150) NOT NULL,
  `telefone_cliente` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `atn_cliente`
--

INSERT INTO `atn_cliente` (`id_cliente`, `nome_cliente`, `cpf_cliente`, `endereco_cliente`, `telefone_cliente`) VALUES
(1, 'Ana Carolina Macedo', '652.354.325-99', 'Rua Frederico José', '(24) 3144-5479'),
(2, 'Jonathan Marcelo Capuzzi', '245.663.254-02', 'Rua Major Phillipin', '(24) 3156-8546'),
(3, 'Danielle Matias Carmelita', '564.328.124-28', 'Rua Comerciante Drummond', '(31) 3694-2461');

-- --------------------------------------------------------

--
-- Estrutura da tabela `atn_vendas`
--

CREATE TABLE `atn_vendas` (
  `id_venda` int(11) NOT NULL,
  `valor_venda` varchar(50) NOT NULL,
  `prod_venda` varchar(100) NOT NULL,
  `quant_venda` varchar(50) NOT NULL,
  `data_venda` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `atn_vendas`
--

INSERT INTO `atn_vendas` (`id_venda`, `valor_venda`, `prod_venda`, `quant_venda`, `data_venda`) VALUES
(1, '160.0', 'Ração Comum', '2', '02/12/22');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vet_ficha`
--

CREATE TABLE `vet_ficha` (
  `id_ficha` int(11) NOT NULL,
  `nome_ficha` varchar(100) NOT NULL,
  `idade_ficha` varchar(50) NOT NULL,
  `sexo_ficha` varchar(50) NOT NULL,
  `categoria_ficha` varchar(100) NOT NULL,
  `descricao_ficha` varchar(100) NOT NULL,
  `prescricao_ficha` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `vet_ficha`
--

INSERT INTO `vet_ficha` (`id_ficha`, `nome_ficha`, `idade_ficha`, `sexo_ficha`, `categoria_ficha`, `descricao_ficha`, `prescricao_ficha`) VALUES
(1, 'Moon', '7', 'Fêmea', 'Furão', 'Nenhuma', 'Animal apresentou problemas com a visão, favor marcar exame imediatamente.');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `adm_cargo`
--
ALTER TABLE `adm_cargo`
  ADD PRIMARY KEY (`id_cargo`);

--
-- Índices para tabela `adm_control`
--
ALTER TABLE `adm_control`
  ADD PRIMARY KEY (`id_control`);

--
-- Índices para tabela `adm_est`
--
ALTER TABLE `adm_est`
  ADD PRIMARY KEY (`id_est`);

--
-- Índices para tabela `adm_estsaida`
--
ALTER TABLE `adm_estsaida`
  ADD PRIMARY KEY (`id_est`);

--
-- Índices para tabela `adm_fornecedor`
--
ALTER TABLE `adm_fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Índices para tabela `adm_produto`
--
ALTER TABLE `adm_produto`
  ADD PRIMARY KEY (`id_produto`),
  ADD KEY `fk_fornecedor` (`fk_fornecedor`);

--
-- Índices para tabela `adm_servico`
--
ALTER TABLE `adm_servico`
  ADD PRIMARY KEY (`id_servico`);

--
-- Índices para tabela `adm_usuario`
--
ALTER TABLE `adm_usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Índices para tabela `atn_agenda`
--
ALTER TABLE `atn_agenda`
  ADD PRIMARY KEY (`id_agenda`),
  ADD KEY `fk_animal` (`fk_animal`);

--
-- Índices para tabela `atn_animal`
--
ALTER TABLE `atn_animal`
  ADD PRIMARY KEY (`id_animal`),
  ADD KEY `fk_cliente` (`fk_cliente`);

--
-- Índices para tabela `atn_categoria`
--
ALTER TABLE `atn_categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Índices para tabela `atn_cliente`
--
ALTER TABLE `atn_cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices para tabela `atn_vendas`
--
ALTER TABLE `atn_vendas`
  ADD PRIMARY KEY (`id_venda`);

--
-- Índices para tabela `vet_ficha`
--
ALTER TABLE `vet_ficha`
  ADD PRIMARY KEY (`id_ficha`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `adm_cargo`
--
ALTER TABLE `adm_cargo`
  MODIFY `id_cargo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `adm_control`
--
ALTER TABLE `adm_control`
  MODIFY `id_control` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `adm_est`
--
ALTER TABLE `adm_est`
  MODIFY `id_est` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de tabela `adm_estsaida`
--
ALTER TABLE `adm_estsaida`
  MODIFY `id_est` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `adm_fornecedor`
--
ALTER TABLE `adm_fornecedor`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `adm_produto`
--
ALTER TABLE `adm_produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `adm_servico`
--
ALTER TABLE `adm_servico`
  MODIFY `id_servico` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `adm_usuario`
--
ALTER TABLE `adm_usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `atn_agenda`
--
ALTER TABLE `atn_agenda`
  MODIFY `id_agenda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `atn_animal`
--
ALTER TABLE `atn_animal`
  MODIFY `id_animal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `atn_categoria`
--
ALTER TABLE `atn_categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `atn_cliente`
--
ALTER TABLE `atn_cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `atn_vendas`
--
ALTER TABLE `atn_vendas`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de tabela `vet_ficha`
--
ALTER TABLE `vet_ficha`
  MODIFY `id_ficha` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `adm_produto`
--
ALTER TABLE `adm_produto`
  ADD CONSTRAINT `fk_fornecedor` FOREIGN KEY (`fk_fornecedor`) REFERENCES `adm_fornecedor` (`id_fornecedor`);

--
-- Limitadores para a tabela `atn_agenda`
--
ALTER TABLE `atn_agenda`
  ADD CONSTRAINT `fk_animal` FOREIGN KEY (`fk_animal`) REFERENCES `atn_animal` (`id_animal`);

--
-- Limitadores para a tabela `atn_animal`
--
ALTER TABLE `atn_animal`
  ADD CONSTRAINT `fk_cliente` FOREIGN KEY (`fk_cliente`) REFERENCES `atn_cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
