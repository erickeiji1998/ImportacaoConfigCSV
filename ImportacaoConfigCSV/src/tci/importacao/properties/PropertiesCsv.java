/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tci.importacao.properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import tci.importacao.bean.ConfigBean;

/**
 *
 * @author erick.nagano
 */
public class PropertiesCsv {

    public String propetiesImportacaoCsv(ConfigBean configBean) {

        StringBuilder sb = new StringBuilder();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String dateAtual = sdf.format(new Date());

        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#------------------------------------ Importação CSV ---------------------------------#\n");
        sb.append("#----------------------------------- Data de criação do arquivo " + dateAtual + " -----------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");

        sb.append("#------------------------------------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#-------------------------------------------- CONFIGURAÇÃO VALIDA PARA TODAS AS IMPORTAÇÕES -----------------------------------------------#\n");
        sb.append("#------------------------------------------------------------------------------------------------------------------------------------------#\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- usuario web service content  ---------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.csv.usuario=" + configBean.getUsuarioText() + "\n");
        sb.append("arquivo.csv.cript.senha=" + configBean.getSenhaText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#---------------- caminho arquivo -----------------#\n");
        sb.append("#-caminho de arquivo deve ser passado duas barras -#\n");
        sb.append("#--------------------------------------------------#\n");
        sb.append("#---------------------- Exemplo -------------------#\n");
        sb.append("#-------------- c:\\arquivo\\fontes\\ -------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.csv.caminho.raiz=" + configBean.getCaminhocsvText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------Caminho dos arquivos de log ------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.log.repositorio=" + configBean.getCaminhologText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Configuração digitalização -----------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.digitalizacao=" + configBean.getConfigdigitalizacaoText() + "\n");

        sb.append("#------------------------------------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#-------------------------------------------------------- CONFIGURAÇÃO VALIDA PARA TODAS AS IMPORTAÇÕES FIM -------------------------------#\n");
        sb.append("#------------------------------------------------------------------------------------------------------------------------------------------#\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#-----------    Web Service  content plus  --------#\n");
        sb.append("#-  web service do content deve ser colocado aqui -#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.web.Service.content.url=" + configBean.getUrlwebserviceText() + "\n");

        sb.append("#---------------------------------------------------------------------------------#\n");
        sb.append("#----- replace campos do web service ---------------------------------------------#\n");
        sb.append("#----- Campo recebido - campo novo; Campo recebido - campo novo; -----------------#\n");
        sb.append("#----------- exemplo -------------------------------------------------------------#\n");
        sb.append("#----- seqNireSede - nire;nomeEmpresa-empresa ------------------------------------#\n");
        sb.append("#---------------------------------------------------------------------------------#\n");

        sb.append("arquivo.config.replace.indice.webservice=" + configBean.getCampowebserviceText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#------ metadados ou meta dados com imagem --------#\n");
        sb.append("#------- 0 = sim e 1 = Não ------------------------#\n");
        sb.append("#------- 0 = sim será inserido dados sem imagem ---#\n");
        sb.append("#------- 1 = Será inserido dados e imagem ---------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.metadados.imagem=" + configBean.getMetaSelect() + "\n");
        sb.append("arquivo.config.metadados.imagem=" + configBean.getMetaimgSelect() + "\n");

        sb.append(" #--------------------------------------------------#\n");
        sb.append("#---------- Possui cabeçalho  1= sim ou  0 = nao --#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.csv.possui.cabecalho=" + configBean.getCabecalhosSelect() + "\n");
        sb.append("arquivo.config.metadados.imagem=" + configBean.getMetaSelect() + "\n");

        sb.append("#------------------------------------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#--------------------------------------------------------------------------- IMAGEM -------------------------------------------------------#\n");
        sb.append("#------------------------------------------------------------------------------------------------------------------------------------------#\n");

        sb.append("#----------------------------- Tipo Envio -----------------------------#\n");
        sb.append("#-------------------0 = ENVIO JUCEC    		---------------------------#\n");
        sb.append("#-------------------1 = ENVIO DE IMAGEM SEM INDICE --------------------#\n");
        sb.append("#-------------------2 = ENVIO DE IMAGEM NOME DA IMAGEM COMO INDICE  ---#\n");
        sb.append("#----------------------------------------------------------------------#\n");

        sb.append("tipo.envio=" + configBean.getTipodenvioBox() + "\n");

        sb.append("#----------------------------------------------------------------------#\n");
        sb.append("#----------------------------- Tipo Envio Informar Nome do indice -----#\n");
        sb.append("#----------------------------------------------------------------------#\n");

        sb.append("tipo.envio.nmindice=" + configBean.getIndiceImagem() + "\n");

        sb.append("#------------------------------------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#--------------------------------------------------------------------- FIM IMAGEM ---------------------------------------------------------#\n");
        sb.append("#------------------------------------------------------------------------------------------------------------------------------------------#\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#---------- Insere status na coluna blockChain ----#\n");
        sb.append("#---------- tab documento e ta imagem -------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.csv.set.status" + configBean.getStatusblockchainInt() + "\n");

        sb.append(" #--------------------------------------------------#\n");
        sb.append("#------------------- Tipo Arquivo -----------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.tipo=.csv" + configBean.getTipoarquivoText() + "\n");

        sb.append(" #--------------------------------------------------#\n");
        sb.append("#--- separetor exemplo : ou ; ou ,  e Etcetera ----#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.csv.separetor =" + configBean.getSeparadorText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#-------------------Tipo Arquivo -----------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.tipo =" + configBean.getTipoarquivoText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#--- separetor exemplo : ou ; ou ,  e Etcetera ----#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.csv.separetor=;" + configBean.getSeparadorText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#------------------- Tipo DOCUMENTO ---------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.tipo.desc.documento=" + configBean.getTipodocumentoText() + "\n");

        sb.append(" #--------------------------------------------------#\n");
        sb.append("#-------------------TIPO PROCESSO ----------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.tipo.desc.processo =" + configBean.getTipoprocessoText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Lote Configuração modulo entrada -----#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.entrada.modulo =" + configBean.getModuloentradaBox() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Lote Configiguração modulo saida -----#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.saida.modulo = Content" + configBean.getModulosaidaBox() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Processo Configiguração modulo -------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.processo.modulo =" + configBean.getModuloprocessoBox() + "\n");
        sb.append("arquivo.config.nome.processo.modulo =" + configBean.getIdmoduloInt() + "\n");

        sb.append("#-------------------------------------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#------------------- Qual coluna será utilizada para o nome documento informe o nome da coluna que tem no seu arquivo csv ------------------#\n");
        sb.append("#------------------- caso deixe as propriedades a abaixo vazio a aplicação irá como padrão a data atual no formato dd-MM-yyyy --------------#\n");
        sb.append("#-------------------------------------------------------------------------------------------------------------------------------------------#\n");

        sb.append("#-- Caixa\n");

        sb.append("arquivo.csv.nome.caixa=" + configBean.getNomecaixaText() + "\n");
        sb.append("arquivo.csv.nome.lote=" + configBean.getNomeloteText() + "\n");

        sb.append("#-- Processo\n");

        sb.append("arquivo.csv.nome.processo=" + configBean.getNomeProcessoText() + "\n");

        sb.append("#-- Documento\n");
        sb.append("arquivo.csv.nome.documento=" + configBean.getNomeProcessoText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#---- Configiguração Web Service Siarco Ativado-- - #\n");
        sb.append("#--------------------------------------------------#\n");
        sb.append("#------------ Ativo = 1-- desativar = 0----------#\n");

        sb.append("arquivo.ativar.web.service =" + configBean.getSiarcosSelect() + "\n");
        sb.append("arquivo.ativar.web.service =" + configBean.getSiarconSelect() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Config web service siarco ------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("ws.siarco.protocolo.url =" + configBean.getUrlsiarcoText() + "\n");

        sb.append("#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#-----------    Campos do {web}  service que serão utlizados------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#-----------    Campos do web service que serão utlizados     ------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#----------- obs: esses campos devem ser informados pelo o usuario, se houver mais de um a campo deverão ser separados por - traço como no exemplo abaixo:    ----------#\n");
        sb.append("#----------- Exemplo: campo1-campo2-campo3-......    ---------------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------#\n");

        sb.append("web.service.campos=" + configBean.getCampowebserviceText() + "\n");

        sb.append("#----------------------------------------------------------------------------------------------------------------#\n");
        sb.append("#-------------------------------------------- config regra por coluna -------------------------------------------#\n");
        sb.append("#----------------------------------------------------------------------------------------------------------------#\n");
        sb.append("arquivo.coluna.caminho.imagem= " + configBean.getNumerocolunaInt() + "\n");

        return sb.toString();

    }

    public String propetiesImportacaoImagemPasta(ConfigBean configBean) {

        StringBuilder sb = new StringBuilder();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String dateAtual = sdf.format(new Date());

        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#------------------------------------ Importação imagem Pasta ------------------------#\n");
        sb.append("#----------------------------------- Data de criação do arquivo " + dateAtual + " -----------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");

        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#----------------------------------- tipo indice -------------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("tipo.envio.nmindice=" + configBean.getIndiceImagem() + "\n");

        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#----------------------------------- caminho origem imagem ---------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("arquivo.csv.caminho.raiz=" + configBean.getCaminhocsvText() + "\n");

        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#----------------------------------- Tipo arquivo executar ---------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("arquivo.tipo =" + configBean.getTipoarquivoText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Lote Configuração modulo entrada -----#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.entrada.modulo =" + configBean.getModuloentradaBox() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Lote Configiguração modulo saida -----#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.saida.modulo = Content" + configBean.getModulosaidaBox() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Processo Configiguração modulo -------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.processo.modulo =" + configBean.getModuloprocessoBox() + "\n");
        sb.append("arquivo.config.nome.processo.modulo =" + configBean.getIdmoduloInt() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#---------- Insere status na coluna blockChain ----#\n");
        sb.append("#---------- tab documento e ta imagem -------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.csv.set.status" + configBean.getStatusblockchainInt() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#-----------    Web Service  content plus  --------#\n");
        sb.append("#-  web service do content deve ser colocado aqui -#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.web.Service.content.url=" + configBean.getUrlwebserviceText() + "\n");
        
        

// tipo.envio
// arquivo.csv.caminho.raiz
// arquivo.tipo
// arquivo.config.entrada.modulo
// arquivo.config.saida.modulo
// arquivo.config.processo.modulo
// arquivo.csv.set.status
// arquivo.web.Service.content.url

        // TO DO
        return sb.toString();
    }

    public String propetiesImportacaoImagemComIdice(ConfigBean configBean) {

        StringBuilder sb = new StringBuilder();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String dateAtual = sdf.format(new Date());

        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#------------------------------------ Importação imagem Pasta ------------------------#\n");
        sb.append("#----------------------------------- Data de criação do arquivo " + dateAtual + " -----------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");

        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#----------------------------------- tipo indice -------------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("tipo.envio.nmindice=" + configBean.getIndiceImagem() + "\n");

        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#----------------------------------- caminho origem imagem ---------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("arquivo.csv.caminho.raiz=" + configBean.getCaminhocsvText() + "\n");

        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("#----------------------------------- Tipo arquivo executar ---------------------------------#\n");
        sb.append("#-------------------------------------------------------------------------------------#\n");
        sb.append("arquivo.tipo =" + configBean.getTipoarquivoText() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Lote Configuração modulo entrada -----#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.entrada.modulo =" + configBean.getModuloentradaBox() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Lote Configiguração modulo saida -----#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.saida.modulo = Content" + configBean.getModulosaidaBox() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#----------- Processo Configiguração modulo -------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.config.processo.modulo =" + configBean.getModuloprocessoBox() + "\n");
        sb.append("arquivo.config.nome.processo.modulo =" + configBean.getIdmoduloInt() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#---------- Insere status na coluna blockChain ----#\n");
        sb.append("#---------- tab documento e ta imagem -------------#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.csv.set.status" + configBean.getStatusblockchainInt() + "\n");

        sb.append("#--------------------------------------------------#\n");
        sb.append("#-----------    Web Service  content plus  --------#\n");
        sb.append("#-  web service do content deve ser colocado aqui -#\n");
        sb.append("#--------------------------------------------------#\n");

        sb.append("arquivo.web.Service.content.url=" + configBean.getUrlwebserviceText() + "\n");

        // TO DO
        return sb.toString();
    }

    /**
     * Gera arquivo properties no caminho passado cmo parametro
     *
     * @param strProperties
     * @param configBean
     */
    public void expurgoArquivoProperties(String strProperties, ConfigBean configBean) {

        FileWriter fw;

        try {

            fw = new FileWriter(new File("C:\\git hub\\ImportacaoConfigCSV\\ImportacaoConfigCSV\\importacaoJucec.properties"));

            fw.write(strProperties);

            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(PropertiesCsv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
