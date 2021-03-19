package test;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.testcontainers.shaded.com.fasterxml.jackson.core.JsonProcessingException;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;


public class dump {

    public static void main(String[] args) throws JsonProcessingException {
        String response = "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 1,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Esta pesquisa aborda as práticas pedagógicas e os impactos causados pela pandemia. Ao responder essa pesquisa, você contribui com a identificação de práticas utilizadas neste período e impacto que estas sofreram, identificando o surgimento de novas abordagens e adaptação de outras consolidadas entre professores e estudantes. <br/><br/>\\r\\nO tempo de preenchimento é de aproximadamente <b>8 minutos</b>. Os seus dados de identificação não serão coletados e suas respostas serão confidenciais, permanecerão em sigilo de pesquisa e não serão divulgadas individualmente. <br/><br/>\\r\\nO termo de consentimento livre e esclarecido se encontra disponível <a href=\\\"https://drive.google.com/file/d/1gENXo26_iqWtOCE3c7b-vvJ8zY0Q6A3c/view?usp=sharing\\\" target=\\\"_blank\\\">aqui</a>, ao clicar em prosseguir você aceita os termos de coleta dessa pesquisa.<br/><br/>\\r\\nO IFRS e seus pesquisadores agradecem a sua contribuição!\",\n" +
                "        \"type\": \"LABEL\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Práticas pedagógicas digitais no contexto de pandemia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 2,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [\n" +
                "          {\n" +
                "            \"id\": 1,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Municipal\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 2,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Estadual\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 3,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Federal\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 4,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Privada\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"id\": 2,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"Nota: você pode marcar mais de uma alternativa\",\n" +
                "        \"text\": \"Qual o âmbito da instituição de ensino que você leciona?\",\n" +
                "        \"type\": \"MULTIPLE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [\n" +
                "          {\n" +
                "            \"id\": 5,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Fundamental A\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 6,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Fundamental B\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 7,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Médio\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 8,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Técnico\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 9,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Superior ou Tecnológico\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 10,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Pós-graduação\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"id\": 3,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"Nota: você pode marcar mais de uma alternativa\",\n" +
                "        \"text\": \"Qual o nível de ensino que você atua? \",\n" +
                "        \"type\": \"MULTIPLE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [\n" +
                "          {\n" +
                "            \"id\": 11,\n" +
                "            \"level\": 1,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Fundamental\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 12,\n" +
                "            \"level\": 1,\n" +
                "            \"nextLevel\": 2,\n" +
                "            \"text\": \"Médio\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 13,\n" +
                "            \"level\": 1,\n" +
                "            \"nextLevel\": 2,\n" +
                "            \"text\": \"Magistério\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 14,\n" +
                "            \"level\": 1,\n" +
                "            \"nextLevel\": 2,\n" +
                "            \"text\": \"Técnico\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 15,\n" +
                "            \"level\": 2,\n" +
                "            \"nextLevel\": 3,\n" +
                "            \"text\": \"Tecnólogo\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 16,\n" +
                "            \"level\": 2,\n" +
                "            \"nextLevel\": 3,\n" +
                "            \"text\": \"Bacharel\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 17,\n" +
                "            \"level\": 2,\n" +
                "            \"nextLevel\": 3,\n" +
                "            \"text\": \"Licenciatura\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 18,\n" +
                "            \"level\": 3,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Mestre\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 19,\n" +
                "            \"level\": 3,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Doutor\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 20,\n" +
                "            \"level\": 3,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Pós-doutor \"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"id\": 4,\n" +
                "        \"levels\": 3,\n" +
                "        \"text\": \"Sobre a sua formação, selecione todas as concluídas:\",\n" +
                "        \"type\": \"MULTILEVEL\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [\n" +
                "          {\n" +
                "            \"id\": 21,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Ciências agrárias\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 22,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Ciências biológicas\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 23,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Ciências da saúde\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 24,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Ciências exatas e da terra\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 25,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Ciências humanas\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 26,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Ciências sociais aplicadas\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 27,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Engenharias\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 28,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Linguística, letras e artes\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"id\": 5,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Qual a área da sua última formação? \",\n" +
                "        \"type\": \"UNIQUE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 6,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Qual o ano da sua última formação?\",\n" +
                "        \"type\": \"YEAR\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Caracterização das atividades\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 3,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 7,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"1 para discordo totalmente e 5 para concordo totalmente\",\n" +
                "        \"text\": \"Posso adaptar minha abordagem de ensino com base no que os estudantes atualmente entendem\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 8,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso adaptar meu método de ensino para diferentes estudantes\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 9,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso usar uma ampla variedade de abordagens de ensino em sala de aula\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 10,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso avaliar a aprendizagem dos estudantes de várias maneiras\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Conhecimento pedagógico\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 4,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 11,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"1 para discordo totalmente e 5 para concordo totalmente\",\n" +
                "        \"text\": \"Tenho conhecimento suficiente sobre o meu conteúdo de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 12,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso empregar uma maneira específica de pensar no meu conteúdo de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 13,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Conheço as teorias e conceitos básicos do meu conteúdo de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 14,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Conheço a história e o desenvolvimento de teorias importantes do meu conteúdo de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Conhecimento de conteúdo\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 5,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 15,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"1 para discordo totalmente e 5 para concordo totalmente\",\n" +
                "        \"text\": \"Acompanho novas tecnologias importantes\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 16,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Frequentemente uso tecnologia\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 17,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Conheço muitas tecnologias diferentes\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 18,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Tenho habilidades técnicas necessárias para usar tecnologia\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Conhecimento em tecnologia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 6,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 19,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"1 para discordo totalmente e 5 para concordo totalmente\",\n" +
                "        \"text\": \"Eu sei como selecionar abordagens de ensino eficazes para orientar o pensamento e a aprendizagem do meu conteúdo de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 20,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Eu sei como desenvolver tarefas apropriadas para possibilitar aos estudantes um pensamento complexo do meu conteúdo de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 21,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Eu sei como desenvolver exercícios com os quais os estudantes podem consolidar seus conhecimentos sobre o meu conteúdo de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 22,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Eu sei como avaliar o desempenho dos estudantes no meu conteúdo de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Conhecimento pedagógico do conteúdo\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 7,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 23,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"1 para discordo totalmente e 5 para concordo totalmente\",\n" +
                "        \"text\": \"Posso escolher tecnologias que aprimorem as abordagens de ensino para uma aula\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 24,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso escolher tecnologias que aprimoram o aprendizado dos estudantes para uma aula\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 25,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso adaptar o uso das tecnologias que estou aprendendo a diferentes atividades de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 26,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Estou pensando criticamente sobre como usar tecnologia na minha sala de aula\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Conhecimento pedagógico tecnológico \"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 8,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 27,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"1 para discordo totalmente e 5 para concordo totalmente\",\n" +
                "        \"text\": \"Eu sei como os desenvolvimentos tecnológicos mudaram a área do meu assunto\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 28,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso explicar quais tecnologias foram usadas em pesquisas na minha área\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 29,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Eu sei quais novas tecnologias estão sendo desenvolvidas atualmente na área do meu assunto\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 30,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Eu sei como usar tecnologias para participar de debates científicos na minha área\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Conhecimento do conteúdo tecnológico\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 9,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 31,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"1 para discordo totalmente e 5 para concordo totalmente\",\n" +
                "        \"text\": \"Posso usar estratégias que combinam conteúdo, tecnologias e abordagens de ensino que aprendi em meus cursos na sala de aula\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 32,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso escolher tecnologias que aprimoram o conteúdo de uma aula\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 33,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso selecionar tecnologias para uso em minha sala de aula que aprimoram o que eu ensino, como ensino e o que os estudantes aprendem\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 34,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Posso ensinar lições que combinam adequadamente o meu conteúdo de ensino, tecnologias e abordagens de ensino\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Conhecimento pedagógico tecnológico do conteúdo\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 10,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 35,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"1 para discordo totalmente e 5 para concordo totalmente\",\n" +
                "        \"text\": \"A exposição durante o período pandêmico à Tecnologia Digital de Informação e Comunicação alterou significativamente as suas atividades pedagógicas\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 36,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"As Tecnologias Digitais de Informação e Comunicação utilizadas na prática docente, proporcionaram melhorias nos processos pedagógicos\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 37,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"As Tecnologias Digitais de Informação e Comunicação utilizadas na prática docente, proporcionaram maior engajamento dos estudantes\",\n" +
                "        \"type\": \"SCALE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [\n" +
                "          {\n" +
                "            \"id\": 29,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Sim\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 30,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Não\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 31,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Nenhuma das minhas práticas foi alterada na pandemia\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"id\": 38,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Você acredita que alguma de suas práticas pedagógicas no pós-pandemia permanecerão com as alterações tecnológicas realizadas durante o período de pandemia?\",\n" +
                "        \"type\": \"UNIQUE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [\n" +
                "          {\n" +
                "            \"id\": 32,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Mídias sociais particulares (Facebook, Instagram, WhatsApp, etc.)\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 33,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Mídias sociais institucionais (Facebook, Instagram, WhatsApp, etc.)\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 34,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Ferramentas de comunicação (Blog, e-mail, SMS, etc.)\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 35,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Ambientes Virtuais de Aprendizagem (Moodle, Google Classroom, etc.)\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 36,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Salas de Vídeo conferência (Zoom, Microsoft Teams, GoogleMeeting, etc.)\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 37,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Vídeos (YouTube, Vimeo, Vevo, etc.)\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 38,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Conteúdo em nuvem (Dropbox, Google Drive, Prezi, etc.)\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 39,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Nenhuma\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"id\": 39,\n" +
                "        \"levels\": 0,\n" +
                "        \"note\": \"<span class=\\\"font-weight-bold\\\">Nota:</span> você pode marcar mais de uma alternativa\",\n" +
                "        \"text\": \"Assinale as opções de ferramentas on-line utilizadas nas práticas pedagógicas durante a pandemia que você pretende continuar aplicando no pós-pandemia\",\n" +
                "        \"type\": \"MULTIPLE\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Uso de Tecnologia Digital de Informação e Comunicação \"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 11,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [\n" +
                "          {\n" +
                "            \"id\": 40,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Masculino\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 41,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Feminino\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 42,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Outros\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 43,\n" +
                "            \"level\": 0,\n" +
                "            \"nextLevel\": 0,\n" +
                "            \"text\": \"Prefiro não informar\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"id\": 40,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Gênero\",\n" +
                "        \"type\": \"UNIQUE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 41,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Idade (em anos)\",\n" +
                "        \"type\": \"AGE\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 42,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Região: estado e município\",\n" +
                "        \"type\": \"REGION\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Caracterização do respondente\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 12,\n" +
                "    \"questions\": [\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 43,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Se desejar fazer algum comentário sobre a pesquisa ou fornecer alguma informação que julgar pertinente, utilize esse espaço. Certamente será de grande relevância para a nossa pesquisa.\",\n" +
                "        \"type\": \"LABEL\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 44,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"Comentários \",\n" +
                "        \"type\": \"TEXTAREA\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"choices\": [],\n" +
                "        \"id\": 45,\n" +
                "        \"levels\": 0,\n" +
                "        \"text\": \"\",\n" +
                "        \"type\": \"SAVE\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"title\": \"Encerramento\"\n" +
                "  }\n" +
                "]";

        Gson gson = new Gson();
        Questionario[] qArray = gson.fromJson(response, Questionario[].class);
        System.out.println(qArray[qArray.length - 1].getLastQuestionID());

    }

}
