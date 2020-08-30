#Sistemas-Embarcados

Construa uma aplicação para realizar o monitoramento de sensores em uma estação qualquer.
● Crie uma aplicação mobile (Flutter ou Java) para cadastrar diversos tipos de sensores em uma estação de monitoramento de propósito geral por meio de um operador. O operador também poderá ligar e desligar cada sensor remotamente.

Estacao: Nome, Descricao, Proprietario, Localizacao(lat/long), 
Modelo Sensor: Nome, Tipo de Saída (Digital ou binária) ou analógica, Alcance (Range), Velocidade de resposta, Unidade Medida, Localizacao(lat/long), Status (ON/OFF)
Modelo Usuário: Nome, E-mail, Senha, Perfil

Devido a limitação de sensores / dispositivos hardwares, por causa da pandemia, recomendo criar uma aplicação Python que simule os diversos tipos de sensores cadastrados no aplicativo.
Crie uma aplicação Python que irá ler os estados dos sensores simulados e salvar em um banco de dado na nuvem (pode ser firebase ou alguma plataforma que utilize o protocolo MQTT).
A aplicação python que ler os dados dos sensores deverá se registrar através de um algum protocolo antes de realizar a transmissão de dados.
