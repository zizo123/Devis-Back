-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Mer 30 Août 2017 à 16:07
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `devis`
--

-- --------------------------------------------------------

--
-- Structure de la table `devis`
--

CREATE TABLE `devis` (
  `id_devis` bigint(20) NOT NULL,
  `datecreation` date DEFAULT NULL,
  `etat_devis` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `reference` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `fourn_devis` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `devis`
--

INSERT INTO `devis` (`id_devis`, `datecreation`, `etat_devis`, `reference`, `fourn_devis`) VALUES
(1, '2017-08-29', 'en cours', 'N123451', 1);

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE `fournisseur` (
  `id_f` bigint(20) NOT NULL,
  `adresse_f` varchar(50) COLLATE utf8_bin NOT NULL,
  `email_f` varchar(100) COLLATE utf8_bin NOT NULL,
  `nom_f` varchar(50) COLLATE utf8_bin NOT NULL,
  `telephone_f` varchar(15) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `fournisseur`
--

INSERT INTO `fournisseur` (`id_f`, `adresse_f`, `email_f`, `nom_f`, `telephone_f`) VALUES
(1, 'avenue fal ould oumeir', 'chakib-cha@gmail.com', 'chakib', '0675362987');

-- --------------------------------------------------------

--
-- Structure de la table `materiel`
--

CREATE TABLE `materiel` (
  `id_materiel` bigint(20) NOT NULL,
  `nummat` varchar(255) COLLATE utf8_bin NOT NULL,
  `description` varchar(255) COLLATE utf8_bin NOT NULL,
  `marque` varchar(20) COLLATE utf8_bin NOT NULL,
  `prixmateriel` float NOT NULL,
  `typemateriel` varchar(20) COLLATE utf8_bin NOT NULL,
  `fourn_materiel` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `materiel`
--

INSERT INTO `materiel` (`id_materiel`, `nummat`, `description`, `marque`, `prixmateriel`, `typemateriel`, `fourn_materiel`) VALUES
(1, '12', 'aaaaabbb', 'toshiba', 300000, 'pc portable', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `offre_fournisseur`
--

CREATE TABLE `offre_fournisseur` (
  `id_offre` bigint(20) NOT NULL,
  `prixfournisseur` float NOT NULL,
  `qte` int(11) NOT NULL,
  `id_devis_offre` bigint(20) DEFAULT NULL,
  `id_fourn_ofr_fourni` bigint(20) DEFAULT NULL,
  `id_mater_ofr_fourni` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `offre_fournisseur`
--

INSERT INTO `offre_fournisseur` (`id_offre`, `prixfournisseur`, `qte`, `id_devis_offre`, `id_fourn_ofr_fourni`, `id_mater_ofr_fourni`) VALUES
(1, 300000, 0, 1, 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
  `id` int(10) NOT NULL,
  `email` varchar(50) COLLATE utf8_bin NOT NULL,
  `password` varchar(10) COLLATE utf8_bin NOT NULL,
  `firstname` varchar(10) COLLATE utf8_bin NOT NULL,
  `lastname` varchar(10) COLLATE utf8_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `firstname`, `lastname`) VALUES
(1, 'drouach@gmail.com', 'azerty', 'ouijdane', 'chakib'),
(2, 'aaa@gmail.com', '1234', 'aaa', 'bbb');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `devis`
--
ALTER TABLE `devis`
  ADD PRIMARY KEY (`id_devis`),
  ADD KEY `FKnnxrlbqrou6yf9i1y6tu87ewy` (`fourn_devis`);

--
-- Index pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  ADD PRIMARY KEY (`id_f`);

--
-- Index pour la table `materiel`
--
ALTER TABLE `materiel`
  ADD PRIMARY KEY (`id_materiel`),
  ADD KEY `FKa2wroww8qk5cygyh69jef7yay` (`fourn_materiel`);

--
-- Index pour la table `offre_fournisseur`
--
ALTER TABLE `offre_fournisseur`
  ADD PRIMARY KEY (`id_offre`),
  ADD KEY `FKtan1np56dn2vo0524odgct4eh` (`id_devis_offre`),
  ADD KEY `FKa25nyy9mpk5ve2myby08bqctw` (`id_fourn_ofr_fourni`),
  ADD KEY `FKfcwvnm6bdcc0p69cihxkqp8ey` (`id_mater_ofr_fourni`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `devis`
--
ALTER TABLE `devis`
  MODIFY `id_devis` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  MODIFY `id_f` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `materiel`
--
ALTER TABLE `materiel`
  MODIFY `id_materiel` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `offre_fournisseur`
--
ALTER TABLE `offre_fournisseur`
  MODIFY `id_offre` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `devis`
--
ALTER TABLE `devis`
  ADD CONSTRAINT `FKnnxrlbqrou6yf9i1y6tu87ewy` FOREIGN KEY (`fourn_devis`) REFERENCES `fournisseur` (`id_f`);

--
-- Contraintes pour la table `materiel`
--
ALTER TABLE `materiel`
  ADD CONSTRAINT `FKa2wroww8qk5cygyh69jef7yay` FOREIGN KEY (`fourn_materiel`) REFERENCES `fournisseur` (`id_f`);

--
-- Contraintes pour la table `offre_fournisseur`
--
ALTER TABLE `offre_fournisseur`
  ADD CONSTRAINT `FKa25nyy9mpk5ve2myby08bqctw` FOREIGN KEY (`id_fourn_ofr_fourni`) REFERENCES `fournisseur` (`id_f`),
  ADD CONSTRAINT `FKfcwvnm6bdcc0p69cihxkqp8ey` FOREIGN KEY (`id_mater_ofr_fourni`) REFERENCES `materiel` (`id_materiel`),
  ADD CONSTRAINT `FKtan1np56dn2vo0524odgct4eh` FOREIGN KEY (`id_devis_offre`) REFERENCES `devis` (`id_devis`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
