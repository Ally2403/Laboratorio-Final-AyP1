package lab_final_arr_jap_pfl;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lab_Final_ARR_JAP_PFL {

    public static void main(String[] args) {
        int menu, juegos, opa, opb, opc, n, i, bblanca, bnegra, num1, num2, num3, num4, num5, num6, num7, num8, num9, num111, num112, num113, num114, num115, num116, num117, num118, num119, ganador, bingo, b, ficha, math, caso2, k, caso3, j, h, funcion, digito, pot, pow, l, sum1;
        double tot, sum, pi, deno, num, x, g, dig, angulo, angulo1, seno, cos, tan, csc, sec, cot;
        String espacio, num11, num12, num13, num14, num15, num16, num17, num18, num19, hexa, letra, hexade, vali;
        Random ran = new Random();
        menu = 0;
        espacio = " ";
        JOptionPane.showMessageDialog(null, """
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │                   BIENVENIDO AL MENÚ DE OPCIONES                  │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             En este menú podrá ejecutar diferentes procesos como juegos u
                                                                            operaciones matemáticas.
                                                                   Presione OK para entrar al programa.""",
                "MENÚ DE OPCIONES", JOptionPane.INFORMATION_MESSAGE);
        while (menu != 3) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("""
                                               Nuestro menú iterativo posee tres opciones principales, escriba el
                                               número correspondiente a la opción brindada para abrir el proceso.
                                                                          1. Miscelánea de Juegos.
                                                                          2. Procesos matemáticos.
                                                                          3. Salir."""));
            while (menu != 1 && menu != 2 && menu != 3) {
                menu = Integer.parseInt(JOptionPane.showInputDialog("""
                                               La opción que escogió no se encuentra dentro de las establecidas
                                                              anteriormente, escriba su opción nuevamente.
                                                                          1. Miscelánea de Juegos.
                                                                          2. Procesos matemáticos.
                                                                          3. Salir."""));
            }
            switch (menu) {
                case 1:
                    juegos = 0;
                    while (juegos != 4) {
                        juegos = Integer.parseInt(JOptionPane.showInputDialog("""
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │              BIENVENIDO A LA MISCELÁNEA DE JUEGOS            │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             En este menú podrá ejecutar diferentes juegos, escoja una de
                                                                          las opciones a continuación.
                                                                                        1. Ruleta.
                                                                                        2. Triqui.
                                                                                        3. Bingo.
                                                                                        4. Salir."""));
                        while (juegos != 1 && juegos != 2 && juegos != 3 && juegos != 4) {
                            juegos = Integer.parseInt(JOptionPane.showInputDialog("""
                                               La opción que escogió no se encuentra dentro de las establecidas
                                                              anteriormente, escriba su opción nuevamente.
                                                                                        1. Ruleta.
                                                                                        2. Triqui.
                                                                                        3. Bingo.
                                                                                        4. Salir."""));
                        }
                        switch (juegos) {
                            case 1:
                                JOptionPane.showMessageDialog(null, """
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │                  BIENVENIDO AL JUEGO DE LA RULETA                 │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                               En este juego usted podrá lanzar dos pelotas, una blanca y una
                                              negra. Dependiendo de las casillas en las que estas caigan y del
                                               número de jugadas que desee realizar, se le informará sobre el
                                                  proceso con el cual tiene más probabilidades de ganar una
                                                                             apuesta de entre 3 posibles.
                                                                      Presione OK para comenzar a jugar.""",
                                        "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                opa = 0;
                                opb = 0;
                                opc = 0;
                                n = Integer.parseInt(JOptionPane.showInputDialog("""
                                               Escriba cuántas jugadas desea realizar a continuación."""));
                                while (n <= 0) {
                                    n = Integer.parseInt(JOptionPane.showInputDialog("""
                                               El número de jugadas que escribió no es válido, vuelva a escribir
                                                                         su número a continuación."""));
                                }
                                for (i = 1; i <= n; i = i + 1) {
                                    bblanca = ran.nextInt(24) + 1;
                                    bnegra = ran.nextInt(24) + 1;
                                    while (bnegra == bblanca) {
                                        bnegra = ran.nextInt(24) + 1;
                                    }
                                    JOptionPane.showMessageDialog(null, """
                                            JUGADA #""" + espacio + """
                                                                """ + i + """
                                                                      
                                                                      La bola blanca cayó en la casilla""" + espacio + """
                                                                                                                   """ + bblanca + """
                                                                                                                               
                                                                                                                               La bola negra cayó en la casilla""" + espacio + """
                                                                                                                                                                           """ + bnegra,
                                            "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                    if (bblanca % 2 == 0 && bnegra % 2 != 0 && (bblanca + bnegra <= 19 || bblanca + bnegra >= 29)) {
                                        opa = opa + 1;
                                    } else {
                                        if (bblanca % 2 == 0 && bnegra % 2 != 0 && (bblanca + bnegra >= 20 && bblanca + bnegra < 29)) {
                                            opb = opb + 1;
                                        } else {
                                            if (bblanca % 2 != 0 && bnegra % 2 == 0 && bblanca + bnegra <= 21) {
                                                opc = opc + 1;
                                            }
                                        }
                                    }
                                }
                                JOptionPane.showMessageDialog(null, """
                                              Los tres sucesos por los cuales puede apostar son los siguientes:
                                                            
                                              A. La esfera blanca cae en casilla blanca y la esfera negra cae en
                                                   casilla negra y la sumatoria de las casillas es menor o igual que
                                                   19 o mayor o igual que 29.
                                                            
                                              B. La esfera blanca cae en casilla blanca y la esfera negra cae en
                                                   casilla negra y la sumatoria es mayor o igual que 20 y menor
                                                   que 29.
                                                            
                                              C. La esfera blanca cae en casilla negra y la esfera negra cae en
                                                   casilla blanca y la sumatoria de las casillas es menor o igual
                                                   que 21.
                                                            
                                             --------------------------------- RESULTADOS ---------------------------------
                                                            
                                                            """ + opa + """
                                                                    """ + espacio + """
                                                                                Jugadas cayeron en el suceso A
                                                                                
                                                                                """ + opb + """
                                                                                        """ + espacio + """
                                                                                                    Jugadas cayeron en el suceso B
                                                                                                    
                                                                                                    """ + opc + """
                                                                                                            """ + espacio + """
                                                                                                                        Jugadas cayeron en el suceso C""",
                                        "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                if (opa > opb && opa > opc) {
                                    JOptionPane.showMessageDialog(null, """
                                            Es más probable que suceda el evento A por lo que si apuesta por este
                                                                suceso obtendrá mayores ganancias.""",
                                            "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    if (opb > opa && opb > opc) {
                                        JOptionPane.showMessageDialog(null, """
                                            Es más probable que suceda el evento B por lo que si apuesta por este
                                                                    suceso obtendrá mayores ganancias.""",
                                                "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        if (opc > opa && opc > opb) {
                                            JOptionPane.showMessageDialog(null, """
                                            Es más probable que suceda el evento C por lo que si apuesta por este
                                                                     suceso obtendrá mayores ganancias.""",
                                                    "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                            if (opa == opb && opa > opc) {
                                                JOptionPane.showMessageDialog(null, """
                                            Es más probable que sucedan los eventos A y B por lo que si apuesta
                                                              por estos sucesos obtendrá mayores ganancias.""",
                                                        "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                if (opa == opc && opa > opb) {
                                                    JOptionPane.showMessageDialog(null, """
                                            Es más probable que sucedan los eventos A y C por lo que si apuesta
                                                              por estos sucesos obtendrá mayores ganancias.""",
                                                            "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                                } else {
                                                    if (opb == opc && opb > opa) {
                                                        JOptionPane.showMessageDialog(null, """
                                            Es más probable que sucedan los eventos B y C por lo que si apuesta
                                                              por estos sucesos obtendrá mayores ganancias.""",
                                                                "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                                    } else {
                                                        if (opa == opb && opa == opc && opa == 0 && opb == 0 && opc == 0) {
                                                            JOptionPane.showMessageDialog(null, """
                                                      Ninguna de las jugadas entró en alguno de los sucesos.""",
                                                                    "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                                        } else {
                                                            if (opa == opb && opa == opc) {
                                                                JOptionPane.showMessageDialog(null, """
                                             Los tres sucesos A, B y C tienen las mismas probabilidades de ocurrir
                                                            por lo que puede apostar por cualquiera de los tres""",
                                                                        "RULETA", JOptionPane.INFORMATION_MESSAGE);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                juegos = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       ¿Desea ejecutar otra opción de la miscelánea?
                                                       Escriba 1 para si o 4 para cerrar la miscelánea"""));
                                while (juegos != 1 && juegos != 4) {
                                    juegos = Integer.parseInt(JOptionPane.showInputDialog("""
                                                   Escoja una de las opciones brindadas anteriormente
                                                       Escriba 1 para si o 4 para cerrar la miscelánea"""));
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, """
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │                     BIENVENIDO AL JUEGO DE TRIQUI                     │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                                            En este juego, dos personas podrán jugar triqui,
                                                                    un jugador será O y el otro será X.
                                              El juego termina cuando alguno de los dos jugadores forme una
                                               linea vertical, horizontal o diagonal con tres símbolos similares.
                                                            También terminará cuando se llegue a 9 jugadas
                                                                                y no haya un ganador.
                                                                    Presione OK para comenzar a jugar.""",
                                        "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                num1 = 0;
                                num2 = 0;
                                num3 = 0;
                                num4 = 0;
                                num5 = 0;
                                num6 = 0;
                                num7 = 0;
                                num8 = 0;
                                num9 = 0;
                                num11 = "             ";
                                num12 = "             ";
                                num13 = "             ";
                                num14 = "             ";
                                num15 = "             ";
                                num16 = "             ";
                                num17 = "             ";
                                num18 = "             ";
                                num19 = "             ";
                                num111 = 0;
                                num112 = 0;
                                num113 = 0;
                                num114 = 0;
                                num115 = 0;
                                num116 = 0;
                                num117 = 0;
                                num118 = 0;
                                num119 = 0;
                                ganador = 0;
                                b = 1;
                                while (ganador != 1) {
                                    ficha = Integer.parseInt(JOptionPane.showInputDialog("""
                                             Turno #""" + espacio + """
                                                                          """ + b + """
                                                                                                        
                                                                  |     1     |     2     |     3     |
                                                                  |     4     |     5     |     6     |
                                                                  |     7     |     8     |     9     |
                                                                                                        
                                              Ingrese el número en el que quiere poner su ficha"""));
                                    while (ficha <= 0 || ficha > 9) {
                                        ficha = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                 Ingrese el número nuevamente"""));
                                    }
                                    if (b % 2 != 0) {
                                        while (ficha == num1 || ficha == num2 || ficha == num3 || ficha == num4 || ficha == num5 || ficha == num6 || ficha == num7 || ficha == num8 || ficha == num9) {
                                            ficha = Integer.parseInt(JOptionPane.showInputDialog("""
                                                Ya existe una ficha en esa posicion, escoja otra que se encuentre vacía"""));
                                        }
                                        if (ficha == 1) {
                                            num11 = "     O     ";
                                            num1 = 1;
                                            num111 = 1;
                                        } else {
                                            if (ficha == 2) {
                                                num12 = "     O     ";
                                                num2 = 2;
                                                num112 = 1;
                                            } else {
                                                if (ficha == 3) {
                                                    num13 = "     O     ";
                                                    num3 = 3;
                                                    num113 = 1;
                                                } else {
                                                    if (ficha == 4) {
                                                        num14 = "     O     ";
                                                        num4 = 4;
                                                        num114 = 1;
                                                    } else {
                                                        if (ficha == 5) {
                                                            num15 = "     O     ";
                                                            num5 = 5;
                                                            num115 = 1;
                                                        } else {
                                                            if (ficha == 6) {
                                                                num16 = "     O     ";
                                                                num6 = 6;
                                                                num116 = 1;
                                                            } else {
                                                                if (ficha == 7) {
                                                                    num17 = "     O     ";
                                                                    num7 = 7;
                                                                    num117 = 1;
                                                                } else {
                                                                    if (ficha == 8) {
                                                                        num18 = "     O     ";
                                                                        num8 = 8;
                                                                        num118 = 1;
                                                                    } else {
                                                                        if (ficha == 9) {
                                                                            num19 = "     O     ";
                                                                            num9 = 9;
                                                                            num119 = 1;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        while (ficha == num1 || ficha == num2 || ficha == num3 || ficha == num4 || ficha == num5 || ficha == num6 || ficha == num7 || ficha == num8 || ficha == num9) {
                                            ficha = Integer.parseInt(JOptionPane.showInputDialog("""
                                                Ya existe una ficha en esa posicion, escoja otra que se encuentre vacía"""));
                                        }
                                        if (ficha == 1) {
                                            num11 = "     X     ";
                                            num1 = 1;
                                            num111 = 2;
                                        } else {
                                            if (ficha == 2) {
                                                num12 = "     X     ";
                                                num2 = 2;
                                                num112 = 2;
                                            } else {
                                                if (ficha == 3) {
                                                    num13 = "     X     ";
                                                    num3 = 3;
                                                    num113 = 2;
                                                } else {
                                                    if (ficha == 4) {
                                                        num14 = "     X     ";
                                                        num4 = 4;
                                                        num114 = 2;
                                                    } else {
                                                        if (ficha == 5) {
                                                            num15 = "     X     ";
                                                            num5 = 5;
                                                            num115 = 2;
                                                        } else {
                                                            if (ficha == 6) {
                                                                num16 = "     X     ";
                                                                num6 = 6;
                                                                num116 = 2;
                                                            } else {
                                                                if (ficha == 7) {
                                                                    num17 = "     X     ";
                                                                    num7 = 7;
                                                                    num117 = 2;
                                                                } else {
                                                                    if (ficha == 8) {
                                                                        num18 = "     X     ";
                                                                        num8 = 8;
                                                                        num118 = 2;
                                                                    } else {
                                                                        if (ficha == 9) {
                                                                            num19 = "     X     ";
                                                                            num9 = 9;
                                                                            num119 = 2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null, """        
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |""",
                                            "TRIQUI", JOptionPane.INFORMATION_MESSAGE);

                                    if (num111 == num112 && num111 == num113 && num111 != 0 && num112 != 0 && num113 != 0) {
                                        ganador = 1;
                                        JOptionPane.showMessageDialog(null, """
                                                                            Turno #""" + espacio + """
                                                                                              """ + b + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             El jugador""" + espacio + """
                                                                                 """ + num11 + """
                                                                                           """ + espacio + """
                                                                                                       ha ganado.""",
                                                "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        if (num114 == num115 && num114 == num116 && num114 != 0 && num115 != 0 && num116 != 0) {
                                            ganador = 1;
                                            JOptionPane.showMessageDialog(null, """
                                                                            Turno #""" + espacio + """
                                                                                              """ + b + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             El jugador""" + espacio + """
                                                                                 """ + num14 + """
                                                                                           """ + espacio + """
                                                                                                       ha ganado.""",
                                                    "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                            if (num117 == num118 && num117 == num119 && num117 != 0 && num118 != 0 && num119 != 0) {
                                                ganador = 1;
                                                JOptionPane.showMessageDialog(null, """
                                                                            Turno #""" + espacio + """
                                                                                              """ + b + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             El jugador""" + espacio + """
                                                                                 """ + num17 + """
                                                                                           """ + espacio + """
                                                                                                       ha ganado.""",
                                                        "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                if (num111 == num114 && num111 == num117 && num111 != 0 && num114 != 0 && num117 != 0) {
                                                    ganador = 1;
                                                    JOptionPane.showMessageDialog(null, """
                                                                            Turno #""" + espacio + """
                                                                                              """ + b + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             El jugador""" + espacio + """
                                                                                 """ + num11 + """
                                                                                           """ + espacio + """
                                                                                                       ha ganado.""",
                                                            "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                                } else {
                                                    if (num112 == num115 && num112 == num118 && num112 != 0 && num115 != 0 && num118 != 0) {
                                                        ganador = 1;
                                                        JOptionPane.showMessageDialog(null, """
                                                                            Turno #""" + espacio + """
                                                                                              """ + b + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             El jugador""" + espacio + """
                                                                                 """ + num12 + """
                                                                                           """ + espacio + """
                                                                                                       ha ganado.""",
                                                                "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                                    } else {
                                                        if (num113 == num116 && num113 == num119 && num113 != 0 && num116 != 0 && num119 != 0) {
                                                            ganador = 1;
                                                            JOptionPane.showMessageDialog(null, """
                                                                            Turno #""" + espacio + """
                                                                                              """ + b + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             El jugador""" + espacio + """
                                                                                 """ + num13 + """
                                                                                           """ + espacio + """
                                                                                                       ha ganado.""",
                                                                    "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                                        } else {
                                                            if (num111 == num115 && num111 == num119 && num111 != 0 && num115 != 0 && num119 != 0) {
                                                                ganador = 1;
                                                                JOptionPane.showMessageDialog(null, """
                                                                            Turno #""" + espacio + """
                                                                                              """ + b + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             El jugador""" + espacio + """
                                                                                 """ + num11 + """
                                                                                           """ + espacio + """
                                                                                                       ha ganado.""",
                                                                        "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                                            } else {
                                                                if (num113 == num115 && num113 == num117 && num113 != 0 && num115 != 0 && num117 != 0) {
                                                                    ganador = 1;
                                                                    JOptionPane.showMessageDialog(null, """
                                                                            Turno #""" + espacio + """
                                                                                              """ + b + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             El jugador""" + espacio + """
                                                                                 """ + num13 + """
                                                                                           """ + espacio + """
                                                                                                       ha ganado.""",
                                                                            "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                                                } else {
                                                                    if (b == 9) {
                                                                        ganador = 1;
                                                                        JOptionPane.showMessageDialog(null, """
                                                                            Turno #""" + espacio + """
                                                                                              """ + b + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             El juego se declara en empate ya que no hubo ningun ganador""",
                                                                                "TRIQUI", JOptionPane.INFORMATION_MESSAGE);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b = b + 1;
                                }
                                juegos = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       ¿Desea ejecutar otra opción de la miscelánea?
                                                       Escriba 1 para si o 4 para cerrar la miscelánea"""));
                                while (juegos != 1 && juegos != 4) {
                                    juegos = Integer.parseInt(JOptionPane.showInputDialog("""
                                                   Escoja una de las opciones brindadas anteriormente
                                                       Escriba 1 para si o 4 para cerrar la miscelánea"""));
                                }
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, """
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │                     BIENVENIDO AL JUEGO DEL BINGO                    │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             En este juego se le brindará un cartón de bingo con números del
                                             1 al 9 y usted tendrá que ir sacando aleatoriamente balotas hasta
                                                    que en su cartón se forme una linea horizontal o vertical.
                                                       Cuando eso suceda se dará por finalizado el juego.
                                                                 Presione OK para comenzar a jugar.""",
                                        "BINGO", JOptionPane.INFORMATION_MESSAGE);

                                num1 = ran.nextInt(9) + 1;
                                num2 = ran.nextInt(9) + 1;
                                while (num2 == num1) {
                                    num2 = ran.nextInt(9) + 1;
                                }
                                num3 = ran.nextInt(9) + 1;
                                while (num3 == num1 || num3 == num2) {
                                    num3 = ran.nextInt(9) + 1;
                                }
                                num4 = ran.nextInt(9) + 1;
                                while (num4 == num1 || num4 == num2 || num4 == num3) {
                                    num4 = ran.nextInt(9) + 1;
                                }
                                num5 = ran.nextInt(9) + 1;
                                while (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4) {
                                    num5 = ran.nextInt(9) + 1;
                                }
                                num6 = ran.nextInt(9) + 1;
                                while (num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5) {
                                    num6 = ran.nextInt(9) + 1;
                                }
                                num7 = ran.nextInt(9) + 1;
                                while (num7 == num1 || num7 == num2 || num7 == num3 || num7 == num4 || num7 == num5 || num7 == num6) {
                                    num7 = ran.nextInt(9) + 1;
                                }
                                num8 = ran.nextInt(9) + 1;
                                while (num8 == num1 || num8 == num2 || num8 == num3 || num8 == num4 || num8 == num5 || num8 == num6 || num8 == num7) {
                                    num8 = ran.nextInt(9) + 1;
                                }
                                num9 = ran.nextInt(9) + 1;
                                while (num9 == num1 || num9 == num2 || num9 == num3 || num9 == num4 || num9 == num5 || num9 == num6 || num9 == num7 || num9 == num8) {
                                    num9 = ran.nextInt(9) + 1;
                                }
                                num11 = "     " + num1 + "     ";
                                num12 = "     " + num2 + "     ";
                                num13 = "     " + num3 + "     ";
                                num14 = "     " + num4 + "     ";
                                num15 = "     " + num5 + "     ";
                                num16 = "     " + num6 + "     ";
                                num17 = "     " + num7 + "     ";
                                num18 = "     " + num8 + "     ";
                                num19 = "     " + num9 + "     ";
                                ganador = 0;
                                b = 0;
                                num111 = 0;
                                num112 = 0;
                                num113 = 0;
                                num114 = 0;
                                num115 = 0;
                                num116 = 0;
                                num117 = 0;
                                num118 = 0;
                                num119 = 0;

                                JOptionPane.showMessageDialog(null, """
                                                                Su cartón de bingo es el siguiente:

                                                                            |""" + num11 + """
                                                                                       |""" + num12 + """
                                                                                                  |""" + num13 + """
                                                                            |
                                                                                        |""" + num14 + """
                                                                                                   |""" + num15 + """
                                                                                                              |""" + num16 + """
                                                                                        |
                                                                                                    |""" + num17 + """
                                                                                                               |""" + num18 + """
                                                                                                                          |""" + num19 + """
                                                                                                    |""",
                                        "BINGO", JOptionPane.INFORMATION_MESSAGE);

                                while (ganador != 1) {
                                    b = b + 1;
                                    bingo = ran.nextInt(9) + 1;
                                    while (bingo != num1 && bingo != num2 && bingo != num3 && bingo != num4 && bingo != num5 && bingo != num6 && bingo != num7 && bingo != num8 && bingo != num9 && b != 7) {
                                        bingo = ran.nextInt(9) + 1;
                                        b = b + 1;
                                        ganador = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                               Jugada #""" + espacio + """
                                                                                               """ + (b - 1) + """
                                                                                                               
                                                                       Ups! La balota sacada ya había salido anteriormente
                                                                      
                                                                                Ingrese 0 para sacar la siguiente balota"""));
                                        while (ganador != 0) {
                                            ganador = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                               Ingrese 0 para sacar la siguiente balota."""));
                                        }
                                    }
                                    if (bingo == num1) {
                                        num11 = "    ☻    ";
                                        num111 = 1;
                                        num1 = 0;
                                    } else {
                                        if (bingo == num2) {
                                            num12 = "    ☻    ";
                                            num112 = 1;
                                            num2 = 0;
                                        } else {
                                            if (bingo == num3) {
                                                num13 = "    ☻    ";
                                                num113 = 1;
                                                num3 = 0;
                                            } else {
                                                if (bingo == num4) {
                                                    num14 = "    ☻    ";
                                                    num114 = 1;
                                                    num4 = 0;
                                                } else {
                                                    if (bingo == num5) {
                                                        num15 = "    ☻    ";
                                                        num115 = 1;
                                                        num5 = 0;
                                                    } else {
                                                        if (bingo == num6) {
                                                            num16 = "    ☻    ";
                                                            num116 = 1;
                                                            num6 = 0;
                                                        } else {
                                                            if (bingo == num7) {
                                                                num17 = "    ☻    ";
                                                                num117 = 1;
                                                                num7 = 0;
                                                            } else {
                                                                if (bingo == num8) {
                                                                    num18 = "    ☻    ";
                                                                    num118 = 1;
                                                                    num8 = 0;
                                                                } else {
                                                                    if (bingo == num9) {
                                                                        num19 = "    ☻    ";
                                                                        num119 = 1;
                                                                        num9 = 0;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (num111 == num112 && num111 == num113 && num111 == num114 && num111 == num117 && num111 != 0 && num112 != 0 && num113 != 0 && num114 != 0 && num117 != 0) {
                                        JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             DOBLE BINGO DE LA PRIMERA FILA CON LA PRIMERA COLUMNA""",
                                                "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                        ganador = 1;
                                    } else {
                                        if (num111 == num112 && num111 == num113 && num111 == num115 && num111 == num118 && num111 != 0 && num112 != 0 && num113 != 0 && num115 != 0 && num118 != 0) {
                                            JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             DOBLE BINGO DE LA PRIMERA FILA CON LA SEGUNDA COLUMNA""",
                                                    "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                            ganador = 1;
                                        } else {
                                            if (num111 == num112 && num111 == num113 && num111 == num116 && num111 == num119 && num111 != 0 && num112 != 0 && num113 != 0 && num116 != 0 && num119 != 0) {
                                                JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             DOBLE BINGO DE LA PRIMERA FILA CON LA TERCERA COLUMNA""",
                                                        "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                ganador = 1;
                                            } else {
                                                if (num114 == num115 && num114 == num116 && num114 == num111 && num114 == num117 && num114 != 0 && num115 != 0 && num116 != 0 && num111 != 0 && num117 != 0) {
                                                    JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             DOBLE BINGO DE LA SEGUNDA FILA CON LA PRIMERA COLUMNA""",
                                                            "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                    ganador = 1;
                                                } else {
                                                    if (num114 == num115 && num114 == num116 && num114 == num112 && num114 == num118 && num114 != 0 && num115 != 0 && num116 != 0 && num112 != 0 && num118 != 0) {
                                                        JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             DOBLE BINGO DE LA SEGUNDA FILA CON LA SEGUNDA COLUMNA""",
                                                                "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                        ganador = 1;
                                                    } else {
                                                        if (num114 == num115 && num114 == num116 && num114 == num113 && num114 == num119 && num114 != 0 && num115 != 0 && num116 != 0 && num113 != 0 && num119 != 0) {
                                                            JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             DOBLE BINGO DE LA SEGUNDA FILA CON LA TERCERA COLUMNA""",
                                                                    "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                            ganador = 1;
                                                        } else {
                                                            if (num117 == num118 && num117 == num119 && num117 == num111 && num117 == num114 && num117 != 0 && num118 != 0 && num119 != 0 && num111 != 0 && num114 != 0) {
                                                                JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             DOBLE BINGO DE LA TERCERA FILA CON LA PRIMERA COLUMNA""",
                                                                        "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                ganador = 1;
                                                            } else {
                                                                if (num117 == num118 && num117 == num119 && num117 == num112 && num117 == num115 && num117 != 0 && num118 != 0 && num119 != 0 && num112 != 0 && num115 != 0) {
                                                                    JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             DOBLE BINGO DE LA TERCERA FILA CON LA SEGUNDA COLUMNA""",
                                                                            "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                    ganador = 1;
                                                                } else {
                                                                    if (num117 == num118 && num117 == num119 && num117 == num113 && num117 == num116 && num117 != 0 && num118 != 0 && num119 != 0 && num113 != 0 && num116 != 0) {
                                                                        JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             DOBLE BINGO DE LA TERCERA FILA CON LA TERCERA COLUMNA""",
                                                                                "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                        ganador = 1;
                                                                    } else {
                                                                        if (num111 == num112 && num111 == num113 && num111 != 0 && num112 != 0 && num113 != 0) {
                                                                            JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             BINGO EN LA PRIMERA FILA""",
                                                                                    "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                            ganador = 1;
                                                                        } else {
                                                                            if (num114 == num115 && num114 == num116 && num114 != 0 && num115 != 0 && num116 != 0) {
                                                                                JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             BINGO EN LA SEGUNDA FILA""",
                                                                                        "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                                ganador = 1;
                                                                            } else {
                                                                                if (num117 == num118 && num117 == num119 && num117 != 0 && num118 != 0 && num119 != 0) {
                                                                                    JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             BINGO EN LA TERCERA FILA""",
                                                                                            "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                                    ganador = 1;
                                                                                } else {
                                                                                    if (num111 == num114 && num111 == num117 && num111 != 0 && num114 != 0 && num117 != 0) {
                                                                                        JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             BINGO EN LA PRIMERA COLUMNA""",
                                                                                                "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                                        ganador = 1;
                                                                                    } else {
                                                                                        if (num112 == num115 && num112 == num118 && num112 != 0 && num115 != 0 && num118 != 0) {
                                                                                            JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             BINGO EN LA SEGUNDA COLUMNA""",
                                                                                                    "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                                            ganador = 1;
                                                                                        } else {
                                                                                            if (num113 == num116 && num113 == num119 && num113 != 0 && num116 != 0 && num119 != 0) {
                                                                                                JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             BINGO EN LA TERCERA COLUMNA""",
                                                                                                        "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                                                ganador = 1;
                                                                                            } else {
                                                                                                if (b == 7) {
                                                                                                    JOptionPane.showMessageDialog(null, """
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                             |""" + num15 + """
                                                                                                                                        |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                         |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             Llegó a 7 jugadas. El bingo se declara como ANULADO.""",
                                                                                                            "BINGO", JOptionPane.INFORMATION_MESSAGE);
                                                                                                    ganador = 1;
                                                                                                } else {
                                                                                                    ganador = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                            Jugada #""" + espacio + """
                                                                                              """ + b + """
                                                                                                        
                                                                      La balota sacada fué: """ + espacio + """
                                                                                                        """ + bingo + """
                                                                                                                  
                                                                                                                  |""" + num11 + """
                                                                                                                             |""" + num12 + """
                                                                                                                                        |""" + num13 + """
                                                                                                                  |
                                                                                                                  |""" + num14 + """
                                                                                                                              |""" + num15 + """
                                                                                                                                         |""" + num16 + """
                                                                                                                  |
                                                                                                                  |""" + num17 + """
                                                                                                                             |""" + num18 + """
                                                                                                                                          |""" + num19 + """
                                                             |
                                                                                                                                                        
                                                             Ingrese 0 para sacar la siguiente balota"""));
                                                                                                    while (ganador != 0) {
                                                                                                        ganador = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                            Ingrese 0 para sacar la siguiente balota."""));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                juegos = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       ¿Desea ejecutar otra opción de la miscelánea?
                                                       Escriba 1 para si o 4 para cerrar la miscelánea"""));
                                while (juegos != 1 && juegos != 4) {
                                    juegos = Integer.parseInt(JOptionPane.showInputDialog("""
                                                   Escoja una de las opciones brindadas anteriormente
                                                       Escriba 1 para si o 4 para cerrar la miscelánea"""));
                                }
                                break;
                            case 4:
                                break;
                        }
                    }
                    break;
                case 2:
                    math = 0;
                    while (math != 5) {
                        math = Integer.parseInt(JOptionPane.showInputDialog("""
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │               BIENVENIDO A PROCESOS MATEMÁTICOS             │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             En este menú podrá ejecutar diferentes procesos, escoja una de
                                                                          las opciones a continuación.
                                                                              1. Eliminar un dígito.
                                                                              2. Cálculo de PI y EULER
                                                                              3. Funciones trigonométricas
                                                                              4. Sistemas numéricos
                                                                              5. Salir"""));
                        while (math != 1 && math != 2 && math != 3 && math != 4 && math != 5) {
                            math = Integer.parseInt(JOptionPane.showInputDialog("""
                                               La opción que escogió no se encuentra dentro de las establecidas
                                                              anteriormente, escriba su opción nuevamente.
                                                                              1. Eliminar un dígito.
                                                                              2. Cálculo de PI y EULER
                                                                              3. Funciones trigonométricas
                                                                              4. Sistemas numéricos
                                                                              5. Salir"""));
                        }
                        switch (math) {
                            case 1:
                                num1 = Integer.parseInt(JOptionPane.showInputDialog("""
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │                    BIENVENIDO A ELIMINAR UN DÍGITO                   │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                                Con este algoritmo podrá escribir un número mayor que 1000
                                                                        y eliminar un dígito del mismo.
                                                                   Escriba su número a continuación:"""));
                                while (num1 <= 1000) {
                                    num1 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       Escriba un número válido mayor que 1000."""));
                                }
                                digito = Integer.parseInt(JOptionPane.showInputDialog("""
                                                            Escriba el dígito que desea eliminar."""));
                                while (digito < 0 || digito > 9) {
                                    digito = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      Escriba un dígito válido."""));
                                }
                                num111 = num1;
                                num2 = 0;
                                i = 0;
                                while (num111 != 0) {
                                    n = num111 % 10;
                                    if (n != digito) {
                                        pot = 1;
                                        for (k = 1; k <= i; k++) {
                                            pot = pot * 10;
                                        }
                                        i = i + 1;
                                        num2 = num2 + n * pot;
                                    }
                                    num111 = num111 / 10;
                                }
                                JOptionPane.showMessageDialog(null, """
                                                            Su número incial fué: """ + espacio + """
                                                                                              """ + num1 + """
                                                                                                       
                                                            Su número con el dígito""" + espacio + """
                                                                                               """ + digito + """
                                                                                                          """ + espacio + """
                                                                                                                      eliminado es: """ + espacio + """
                                                                                                                                               """ + num2,
                                        "ELIMINAR UN DÍGITO", JOptionPane.INFORMATION_MESSAGE);
                                math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       ¿Desea ejecutar otra opción de procesos matemáticos?
                                                       Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                while (math != 1 && math != 5) {
                                    math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                   Escoja una de las opciones brindadas anteriormente
                                                 Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                }
                                break;
                            case 2:
                                caso2 = Integer.parseInt(JOptionPane.showInputDialog("""
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │                BIENVENIDO AL CÁLCULO DE PI Y EULER              │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             Con este algoritmo podrá calcular el valor de PI y el valor de Euler.
                                                       Ingrese el cálculo que desee realizar a continuación:
                                                                                     1. PI
                                                                                     2. EULER"""));
                                while (caso2 != 1 && caso2 != 2) {
                                    caso2 = Integer.parseInt(JOptionPane.showInputDialog("""
                                               La opción que escogió no se encuentra dentro de las establecidas
                                                              anteriormente, escriba su opción nuevamente.
                                                                                        1. PI
                                                                                        2. EULER"""));
                                }
                                switch (caso2) {
                                    case 1:
                                        n = Integer.parseInt(JOptionPane.showInputDialog("""
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │                                      CÁLCULO DE PI                                    │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                                 Para calcular el valor de Pi deberá ingresar una cantidad de
                                                  términos. Entre mayor sea la cantidad, más exacta será su
                                                                             aproximación de Pi."""));
                                        while (n <= 0) {
                                            n = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                Ingrese una cantidad válida positiva."""));
                                        }
                                        sum = 0;
                                        for (i = 0; i <= n; i++) {
                                            num = 1;
                                            for (k = 1; k <= i; k++) {
                                                num = num * -1;
                                            }
                                            deno = 2 * i + 1;
                                            tot = num / deno;
                                            sum = sum + tot;
                                        }
                                        pi = sum * 4;
                                        JOptionPane.showMessageDialog(null, """
                                                            Su aproximación del número pi es: """ + espacio + """
                                                                                                          """ + pi,
                                                "PI", JOptionPane.INFORMATION_MESSAGE);
                                        math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       ¿Desea ejecutar otra opción de procesos matemáticos?
                                                       Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                        while (math != 1 && math != 5) {
                                            math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                   Escoja una de las opciones brindadas anteriormente
                                                 Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                        }
                                        break;
                                    case 2:
                                        n = Integer.parseInt(JOptionPane.showInputDialog("""
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │                                  CÁLCULO DE EULER                                │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                              Para calcular el valor de Euler deberá ingresar una cantidad de
                                                términos. Entre mayor sea la cantidad, más exacta será su
                                                                             aproximación de Euler.
                                                                           Ingrésela a continuación"""));
                                        while (n <= 0) {
                                            n = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                Ingrese una cantidad válida positiva."""));
                                        }
                                        x = 1;
                                        sum = 0;
                                        for (g = 0; g <= n; g++) {
                                            num = 1;
                                            for (k = 1; k <= g; k++) {
                                                num = num * x;
                                            }
                                            deno = 1;
                                            for (i = 1; i <= g; i++) {
                                                deno = deno * i;
                                            }
                                            tot = num / deno;
                                            sum = sum + tot;
                                        }

                                        JOptionPane.showMessageDialog(null, """
                                                      Su aproximación del número euler es""" + espacio + """
                                                                                                                               """ + sum,
                                                "EULER", JOptionPane.INFORMATION_MESSAGE);
                                        math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       ¿Desea ejecutar otra opción de procesos matemáticos?
                                                       Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                        while (math != 1 && math != 5) {
                                            math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                   Escoja una de las opciones brindadas anteriormente
                                                 Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                        }
                                        break;
                                }
                                break;
                            case 3:
                                angulo = Integer.parseInt(JOptionPane.showInputDialog("""
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │          BIENVENIDO A FUNCIONES TRIGONOMÉTRICAS        │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                                       Con este algoritmo podrá calcular distintas funciones
                                                                        trigonométricas de un ángulo.
                                           Escriba a continuación el ángulo al cual le quiere encontrar la función."""));
                                i = Integer.parseInt(JOptionPane.showInputDialog("""
                                                          Para calcular las funciones trigonométricas deberá
                                                         ingresar una cantidad de términos. Entre mayor sea
                                                   la cantidad, más exacta será su aproximación de las mismas.
                                                             Se recomienda ingresar valores mayores a 100. 
                                                                            Ingrésela a continuación."""));
                                while (i <= 0) {
                                    i = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                Ingrese una cantidad válida positiva."""));
                                }
                                sum = 0;
                                for (j = 0; j <= i; j++) {
                                    num = 1;
                                    for (k = 1; k <= j; k++) {
                                        num = num * -1;
                                    }
                                    deno = 2 * j + 1;
                                    tot = num / deno;
                                    sum = sum + tot;
                                }
                                pi = sum * 4;
                                angulo1 = angulo * pi / 180;
                                funcion = 0;
                                while (funcion != 1) {
                                    caso3 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                         Escoja que función trigonométrica quiere calcular: 
                                                                                    1. Seno
                                                                                    2. Coseno
                                                                                    3. Tangente
                                                                                    4. Cosecante
                                                                                    5. Secante
                                                                                    6. Cotangente"""));
                                    while (caso3 < 1 || caso3 > 6) {
                                        caso3 = Integer.parseInt(JOptionPane.showInputDialog("""
                                               La opción que escogió no se encuentra dentro de las establecidas
                                                              anteriormente, escriba su opción nuevamente.
                                                                                        1. Seno
                                                                                        2. Coseno
                                                                                        3. Tangente
                                                                                        4. Cosecante
                                                                                        5. Secante
                                                                                        6. Cotangente"""));
                                    }
                                    //seno
                                    seno = 0;
                                    for (n = 0; n <= i; n++) {
                                        num = 1;
                                        for (k = 1; k <= n; k++) {
                                            num = num * -1;
                                        }
                                        deno = 1;
                                        for (h = 1; h <= 2 * n + 1; h++) {
                                            deno = deno * h;
                                        }
                                        dig = 1;
                                        for (j = 1; j <= 2 * n + 1; j++) {
                                            dig = dig * angulo1;
                                        }
                                        tot = num / deno * dig;
                                        seno = seno + tot;
                                    }
                                    //coseno
                                    cos = 0;
                                    for (n = 0; n <= i; n++) {
                                        num = 1;
                                        for (k = 1; k <= n; k++) {
                                            num = num * -1;
                                        }
                                        deno = 1;
                                        for (h = 1; h <= 2 * n; h++) {
                                            deno = deno * h;
                                        }
                                        dig = 1;
                                        for (j = 1; j <= 2 * n; j++) {
                                            dig = dig * angulo1;
                                        }
                                        tot = num / deno * dig;
                                        cos = cos + tot;
                                    }
                                    tan = seno / cos;
                                    csc = 1 / seno;
                                    sec = 1 / cos;
                                    cot = cos / seno;
                                    switch (caso3) {
                                        case 1:
                                            JOptionPane.showMessageDialog(null, """
                                                            El seno de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es""" + espacio + """
                                                                                                                                    """ + seno,
                                                    "SENO", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        case 2:
                                            JOptionPane.showMessageDialog(null, """
                                                            El coseno de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es""" + espacio + """
                                                                                                                                    """ + cos,
                                                    "COSENO", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        case 3:
                                            if (angulo == 90 || angulo == 270 || angulo == -90 || angulo == -270 || angulo == 450) {
                                                JOptionPane.showMessageDialog(null, """
                                                            La tangente de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es Indefinida.""",
                                                        "TANGENTE", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                JOptionPane.showMessageDialog(null, """
                                                            La tangente de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es""" + espacio + """
                                                                                                                                    """ + tan,
                                                        "TANGENTE", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            break;
                                        case 4:
                                            if (angulo == 0 || angulo == 180 || angulo == 360 || angulo == -180 || angulo == -360) {
                                                JOptionPane.showMessageDialog(null, """
                                                            La cosecante de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es Indefinida.""",
                                                        "COSECANTE", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                JOptionPane.showMessageDialog(null, """
                                                            La cosecante de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es""" + espacio + """
                                                                                                                                    """ + csc,
                                                        "COSECANTE", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            break;
                                        case 5:
                                            if (angulo == 90 || angulo == 270 || angulo == -90 || angulo == -270 || angulo == 450) {
                                                JOptionPane.showMessageDialog(null, """
                                                            La secante de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es Indefinida.""",
                                                        "SECANTE", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                JOptionPane.showMessageDialog(null, """
                                                            La secante de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es""" + espacio + """
                                                                                                                                    """ + sec,
                                                        "SECANTE", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            break;
                                        case 6:
                                            if (angulo == 0 || angulo == 180 || angulo == 360 || angulo == -180 || angulo == -360) {
                                                JOptionPane.showMessageDialog(null, """
                                                            La cotangente de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es Indefinida.""",
                                                        "COTANGENTE", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                JOptionPane.showMessageDialog(null, """
                                                            La cotangente de """ + espacio + """
                                                                                              """ + angulo + """
                                                                                                             """ + espacio + """
                                                                                                                         es""" + espacio + """
                                                                                                                                    """ + cot,
                                                        "COTANGENTE", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            break;
                                    }
                                    funcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       ¿Desea encontrar otra función trigonométrica para este ángulo?
                                                                               Escriba 0 para si o 1 para no"""));
                                    while (funcion != 1 && funcion != 0) {
                                        funcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                   Escoja una de las opciones brindadas anteriormente
                                                                 Escriba 0 para si o 1 para no."""));
                                    }
                                }
                                math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       ¿Desea ejecutar otra opción de procesos matemáticos?
                                                       Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                while (math != 1 && math != 5) {
                                    math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                   Escoja una de las opciones brindadas anteriormente
                                                 Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                }
                                break;
                            case 4:
                                dig = Integer.parseInt(JOptionPane.showInputDialog("""
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │                  BIENVENIDO A SISTEMAS NUMÉRICOS                 │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                          Con este algoritmo podrá convertir un número hexadecimal a decimal.
                                           A continuación ingrese la cantidad de dígitos que tendrá su número."""));
                                while (dig < 1) {
                                    System.out.println("Digite una cantidad positiva ");
                                    dig = Integer.parseInt(JOptionPane.showInputDialog("""
                                                    Ingrese una cantidad válida de dígitos."""));
                                }
                                i = 100;
                                hexade = "_";
                                hexa = "";
                                b = 0;
                                for (h = 0; h <= i; h++) {
                                    vali = hexade.substring(b, b + 1);
                                    if ("0".equals(vali) || "1".equals(vali) || "2".equals(vali) || "3".equals(vali) || "4".equals(vali)
                                            || "5".equals(vali) || "6".equals(vali) || "7".equals(vali) || "8".equals(vali) || "9".equals(vali)
                                            || " ".equals(vali) || "A".equals(vali) || "B".equals(vali) || "C".equals(vali) || "D".equals(vali)
                                            || "E".equals(vali) || "F".equals(vali) || "a".equals(vali) || "b".equals(vali) || "c".equals(vali)
                                            || "d".equals(vali) || "e".equals(vali) || "f".equals(vali)) {
                                    } else {
                                        while (i != dig) {
                                            hexa = JOptionPane.showInputDialog("""
                                                        Ingrese un número hexadecimal válido para convertir.""");
                                            hexade = hexa + " ";
                                            n = 0;
                                            i = -1;
                                            letra = "";
                                            while (!letra.equals(" ")) {
                                                letra = hexade.substring(n, n + 1);
                                                n++;
                                                i++;
                                            }
                                        }
                                    }
                                    b++;
                                }
                                n = 0;
                                k = i - 1;
                                num1 = 0;
                                sum1 = 0;
                                for (j = 1; j <= i; j++) {
                                    while (k >= 0) {
                                        letra = hexa.substring(n, n + 1);
                                        if (letra.equals("0")) {
                                            num1 = 0;
                                        }
                                        if (letra.equals("1")) {
                                            num1 = 1;
                                        }
                                        if (letra.equals("2")) {
                                            num1 = 2;
                                        }
                                        if (letra.equals("3")) {
                                            num1 = 3;
                                        }
                                        if (letra.equals("4")) {
                                            num1 = 4;
                                        }
                                        if (letra.equals("5")) {
                                            num1 = 5;
                                        }
                                        if (letra.equals("6")) {
                                            num1 = 6;
                                        }
                                        if (letra.equals("7")) {
                                            num1 = 7;
                                        }
                                        if (letra.equals("8")) {
                                            num1 = 8;
                                        }
                                        if (letra.equals("9")) {
                                            num1 = 9;
                                        }
                                        if (letra.equals("A") || letra.equals("a")) {
                                            num1 = 10;
                                        }
                                        if (letra.equals("B") || letra.equals("b")) {
                                            num1 = 11;
                                        }
                                        if (letra.equals("C") || letra.equals("c")) {
                                            num1 = 12;
                                        }
                                        if (letra.equals("D") || letra.equals("d")) {
                                            num1 = 13;
                                        }
                                        if (letra.equals("E") || letra.equals("e")) {
                                            num1 = 14;
                                        }
                                        if (letra.equals("F") || letra.equals("f")) {
                                            num1 = 15;
                                        }
                                        pow = 1;
                                        for (l = 1; l <= k; l++) {
                                            pow = pow * 16;
                                        }
                                        sum1 = sum1 + (num1 * pow);
                                        k = k - 1;
                                        n++;
                                    }
                                }
                                JOptionPane.showMessageDialog(null, """
                                            El número """ + espacio + """
                                                                  """ + hexa + """
                                                                            """ + espacio + """
                                                                                        convertido a base 10 es igual a """ + espacio + """
                                                                                                                                                      """ + sum1,
                                        "SISTEMAS NUMÉRICOS", JOptionPane.INFORMATION_MESSAGE);
                                math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                       ¿Desea ejecutar otra opción de procesos matemáticos?
                                                       Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                while (math != 1 && math != 5) {
                                    math = Integer.parseInt(JOptionPane.showInputDialog("""
                                                   Escoja una de las opciones brindadas anteriormente
                                                 Escriba 1 para si o 5 para cerrar procesos matemáticos."""));
                                }
                                break;
                            case 5:
                                break;
                        }
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, """
                                            ⯁ ---------------------------------------------------------------------------------- ⯁
                                             │              GRACIAS POR USAR NUESTRO PROGRAMA            │
                                            ⯁ ---------------------------------------------------------------------------------- ⯁ """,
                            "MENÚ DE OPCIONES", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
    }
}
