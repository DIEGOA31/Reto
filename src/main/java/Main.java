import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.invoke.SwitchPoint;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String participante[][] = new String[10][2];
        int puntaje = 0;
        int a = 0;
        int nivel = 1;


        CategoriaUno categoriaUno = new CategoriaUno();
        CategoriaDos categoriaDos = new CategoriaDos();
        CategoriaTres categoriaTres = new CategoriaTres();
        CategoriaCuatro categoriaCuatro = new CategoriaCuatro();
        CategoriaCinco categoriaCinco = new CategoriaCinco();
        Auxiliar auxiliar = new Auxiliar();


        int numero = 0;
        String respuesta = "";
        int whileDos = 0;


        System.out.println("****************************************");
        System.out.println("* Bienvenido al juego ¿Quien sabe más? *");
        System.out.println("****************************************");
        System.out.println("Digite el nombre del participante");
        participante[0][0] = leer.next();
        while(whileDos == 0) {
            switch (nivel) {
                case 1:


                    System.out.println("Nivel uno");
                    numero = auxiliar.numeroAleatorio();
                    switch (numero) {
                        case 1:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaUno.getPreguntaUno());
                                System.out.println("A. " + categoriaUno.getRespuestaUnoBuenaCuatro());
                                System.out.println("B. " + categoriaUno.getRespuestaUnoMala());
                                System.out.println("C. " + categoriaUno.getRespuestaUnoMalaDos());
                                System.out.println("D. " + categoriaUno.getRespuestaUnoMalaTres());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 1 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 100;
                                        nivel = 2;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 2:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaUno.getPreguntaDos());
                                System.out.println("A. " + categoriaUno.getRespuestaDosBuenaTres());
                                System.out.println("B. " + categoriaUno.getRespuestaDosMalaCuatro());
                                System.out.println("C. " + categoriaUno.getRespuestaDosMalaDos());
                                System.out.println("D. " + categoriaUno.getRespuestaDosMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 2 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 100;
                                        nivel = 2;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 3:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaUno.getPreguntaTres());
                                System.out.println("A. " + categoriaUno.getRespuestaTresBuenaCuatro());
                                System.out.println("B. " + categoriaUno.getRespuestaTresMalaDos());
                                System.out.println("C. " + categoriaUno.getRespuestaTresMalaUno());
                                System.out.println("D. " + categoriaUno.getRespuestaTresMalaTres());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 3 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 100;
                                        nivel = 2;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 4:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaUno.getPreguntaCuatro());
                                System.out.println("A. " + categoriaUno.getRespuestaCuatroMalaCuatro());
                                System.out.println("B. " + categoriaUno.getRespuestaCuatroMalaTres());
                                System.out.println("C. " + categoriaUno.getRespuestaCuatroBuenaDos());
                                System.out.println("D. " + categoriaUno.getRespuestaCuatroMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 4 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("C")) {
                                        System.out.println("Correcto");
                                        puntaje = 100;
                                        nivel = 2;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 5:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaUno.getPreguntaCinco());
                                System.out.println("A. " + categoriaUno.getRespuestaCincoMalaCuatro());
                                System.out.println("B. " + categoriaUno.getRespuestaCincoBuenaDos());
                                System.out.println("C. " + categoriaUno.getRespuestaCincoMalaTres());
                                System.out.println("D. " + categoriaUno.getRespuestaCincoMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 5 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("B")) {
                                        System.out.println("Correcto");
                                        puntaje = 100;
                                        nivel = 2;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;


                    }

                    break;

                case 2:
                    System.out.println("Nivel 2");
                    numero = auxiliar.numeroAleatorio();
                    switch (numero) {
                        case 1:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaDos.getPreguntaUno());
                                System.out.println("A. " + categoriaDos.getRespuestaUnoBuenaUno());
                                System.out.println("B. " + categoriaDos.getRespuestaUnoMalaDos());
                                System.out.println("C. " + categoriaDos.getRespuestaUnoMalaTres());
                                System.out.println("D. " + categoriaDos.getRespuestaUnoMalaCuatro());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 1 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 200;
                                        nivel = 3;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 2:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaDos.getPreguntaDos());
                                System.out.println("A. " + categoriaDos.getRespuestaDosBuenaCuatro());
                                System.out.println("B. " + categoriaDos.getRespuestaDosMalaTres());
                                System.out.println("C. " + categoriaDos.getRespuestaDosMalaDos());
                                System.out.println("D. " + categoriaDos.getRespuestaDosMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 2 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 200;
                                        nivel = 3;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 3:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaDos.getPreguntaTres());
                                System.out.println("A. " + categoriaDos.getRespuestaTresBuenaUno());
                                System.out.println("B. " + categoriaDos.getRespuestaTresMalaDos());
                                System.out.println("C. " + categoriaDos.getRespuestaTresMalaCuatro());
                                System.out.println("D. " + categoriaDos.getRespuestaTresMalaTres());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 3 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 200;
                                        nivel = 3;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 4:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaDos.getPreguntaCuatro());
                                System.out.println("A. " + categoriaDos.getRespuestaCuatroMalaCuatro());
                                System.out.println("B. " + categoriaDos.getRespuestaCuatroMalaTres());
                                System.out.println("C. " + categoriaDos.getRespuestaCuatroBuenaDos());
                                System.out.println("D. " + categoriaDos.getRespuestaCuatroMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 4 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("C")) {
                                        System.out.println("Correcto");
                                        puntaje = 200;
                                        nivel = 3;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 5:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaDos.getPreguntaCinco());
                                System.out.println("A. " + categoriaDos.getRespuestaCincoMalaCuatro());
                                System.out.println("B. " + categoriaDos.getRespuestaCincoBuenaDos());
                                System.out.println("C. " + categoriaDos.getRespuestaCincoMalaTres());
                                System.out.println("D. " + categoriaDos.getRespuestaCincoMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 5 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("B")) {
                                        System.out.println("Correcto");
                                        puntaje = 200;
                                        nivel = 3;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;


                    }
                    break;
                case 3:
                    System.out.println("Nivel 3");
                    numero = auxiliar.numeroAleatorio();
                    switch (numero) {
                        case 1:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaTres.getPreguntaUno());
                                System.out.println("A. " + categoriaTres.getRespuestaUnoBuenaUno());
                                System.out.println("B. " + categoriaTres.getRespuestaUnoMalaDos());
                                System.out.println("C. " + categoriaTres.getRespuestaUnoMalaTres());
                                System.out.println("D. " + categoriaTres.getRespuestaUnoMalaCuatro());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 1 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 300;
                                        nivel = 4;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 2:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaTres.getPreguntaDos());
                                System.out.println("A. " + categoriaTres.getRespuestaUnoBuenaUno());
                                System.out.println("B. " + categoriaTres.getRespuestaDosMalaTres());
                                System.out.println("C. " + categoriaTres.getRespuestaDosMalaDos());
                                System.out.println("D. " + categoriaTres.getRespuestaUnoMalaCuatro());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 2 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 300;
                                        nivel = 4;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 3:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaTres.getPreguntaTres());
                                System.out.println("A. " + categoriaTres.getRespuestaTresBuenaDos());
                                System.out.println("B. " + categoriaTres.getRespuestaTresMalaUno());
                                System.out.println("C. " + categoriaTres.getRespuestaTresMalaCuatro());
                                System.out.println("D. " + categoriaTres.getRespuestaTresMalaTres());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 3 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 300;
                                        nivel = 4;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 4:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaTres.getPreguntaCuatro());
                                System.out.println("A. " + categoriaTres.getRespuestaCuatroMalaCuatro());
                                System.out.println("B. " + categoriaTres.getRespuestaCuatroMalaTres());
                                System.out.println("C. " + categoriaTres.getRespuestaCuatroBuenaDos());
                                System.out.println("D. " + categoriaTres.getRespuestaCuatroMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 4 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("C")) {
                                        System.out.println("Correcto");
                                        puntaje = 300;
                                        nivel = 4;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 5:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaTres.getPreguntaCinco());
                                System.out.println("A. " + categoriaTres.getRespuestaCincoMalaCuatro());
                                System.out.println("B. " + categoriaTres.getRespuestaCincoBuenaDos());
                                System.out.println("C. " + categoriaTres.getRespuestaCincoMalaTres());
                                System.out.println("D. " + categoriaTres.getRespuestaCincoMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 5 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("B")) {
                                        System.out.println("Correcto");
                                        puntaje = 300;
                                        nivel = 4;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;


                    }
                    break;
                case 4:
                    System.out.println("Nivel 4");
                    numero = auxiliar.numeroAleatorio();
                    switch (numero) {
                        case 1:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCuatro.getPreguntaUno());
                                System.out.println("A. " + categoriaCuatro.getRespuestaUnoBuenaDos());
                                System.out.println("B. " + categoriaCuatro.getRespuestaUnoMalaUno());
                                System.out.println("C. " + categoriaCuatro.getRespuestaUnoMalaTres());
                                System.out.println("D. " + categoriaCuatro.getRespuestaUnoMalaCuatro());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 1 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 400;
                                        nivel = 5;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 2:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCuatro.getPreguntaDos());
                                System.out.println("A. " + categoriaCuatro.getRespuestaDosBuenaTres());
                                System.out.println("B. " + categoriaCuatro.getRespuestaDosMalaUno());
                                System.out.println("C. " + categoriaCuatro.getRespuestaDosMalaDos());
                                System.out.println("D. " + categoriaCuatro.getRespuestaUnoMalaCuatro());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 2 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 400;
                                        nivel = 5;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 3:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCuatro.getPreguntaTres());
                                System.out.println("A. " + categoriaCuatro.getRespuestaTresBuenaUno());
                                System.out.println("B. " + categoriaCuatro.getRespuestaTresMalaDos());
                                System.out.println("C. " + categoriaCuatro.getRespuestaTresMalaCuatro());
                                System.out.println("D. " + categoriaCuatro.getRespuestaTresMalaTres());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 3 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 400;
                                        nivel = 5;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 4:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCuatro.getPreguntaCuatro());
                                System.out.println("A. " + categoriaCuatro.getRespuestaCuatroMalaCuatro());
                                System.out.println("B. " + categoriaCuatro.getRespuestaCuatroMalaDos());
                                System.out.println("C. " + categoriaCuatro.getRespuestaCuatroBuenaTres());
                                System.out.println("D. " + categoriaCuatro.getRespuestaCuatroMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 4 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("C")) {
                                        System.out.println("Correcto");
                                        puntaje = 400;
                                        nivel = 5;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 5:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCuatro.getPreguntaCinco());
                                System.out.println("A. " + categoriaCuatro.getRespuestaCincoMalaCuatro());
                                System.out.println("B. " + categoriaCuatro.getRespuestaCincoBuenaTres());
                                System.out.println("C. " + categoriaCuatro.getRespuestaCincoMalaDos());
                                System.out.println("D. " + categoriaCuatro.getRespuestaCincoMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 5 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("B")) {
                                        System.out.println("Correcto");
                                        puntaje = 400;
                                        nivel = 5;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;


                    }
                    break;
                case 5:
                    System.out.println("Nivel 5");
                    numero = auxiliar.numeroAleatorio();
                    switch (numero) {
                        case 1:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCinco.getPreguntaUno());
                                System.out.println("A. " + categoriaCinco.getRespuestaUnoBuenaCuatro());
                                System.out.println("B. " + categoriaCinco.getRespuestaUnoMalaUno());
                                System.out.println("C. " + categoriaCinco.getRespuestaUnoMalaTres());
                                System.out.println("D. " + categoriaCinco.getRespuestaUnoMalaDos());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 1 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 500;
                                        nivel = 6;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 2:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCinco.getPreguntaDos());
                                System.out.println("A. " + categoriaCinco.getRespuestaDosBuenaCuatro());
                                System.out.println("B. " + categoriaCinco.getRespuestaDosMalaUno());
                                System.out.println("C. " + categoriaCinco.getRespuestaDosMalaDos());
                                System.out.println("D. " + categoriaCinco.getRespuestaUnoMalaTres());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 2 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 500;
                                        nivel = 6;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 3:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCinco.getPreguntaTres());
                                System.out.println("A. " + categoriaCinco.getRespuestaTresBuenaDos());
                                System.out.println("B. " + categoriaCinco.getRespuestaTresMalaUno());
                                System.out.println("C. " + categoriaCinco.getRespuestaTresMalaCuatro());
                                System.out.println("D. " + categoriaCinco.getRespuestaTresMalaTres());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 3 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("A")) {
                                        System.out.println("Correcto");
                                        puntaje = 500;
                                        nivel = 6;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 4:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCinco.getPreguntaCuatro());
                                System.out.println("A. " + categoriaCinco.getRespuestaCuatroMalaCuatro());
                                System.out.println("B. " + categoriaCinco.getRespuestaCuatroMalaTres());
                                System.out.println("C. " + categoriaCinco.getRespuestaCuatroBuenaDos());
                                System.out.println("D. " + categoriaCinco.getRespuestaCuatroMalaUno());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 4 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("C")) {
                                        System.out.println("Correcto");
                                        puntaje = 500;
                                        nivel = 6;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;
                        case 5:
                            a = 0;
                            while (a == 0) {
                                System.out.println("Digite A, B, C o D según su respuesta");
                                System.out.println(categoriaCinco.getPreguntaCinco());
                                System.out.println("A. " + categoriaCinco.getRespuestaCincoMalaCuatro());
                                System.out.println("B. " + categoriaCinco.getRespuestaCincoBuenaUno());
                                System.out.println("C. " + categoriaCinco.getRespuestaCincoMalaDos());
                                System.out.println("D. " + categoriaCinco.getRespuestaCincoMalaTres());
                                respuesta = leer.next().toUpperCase();
                                System.out.println("respuesta 5 " + respuesta);

                                if (respuesta.equals("A") || respuesta.equals("B") || respuesta.equals("C") || respuesta.equals("D")) {
                                    if (respuesta.equals("B")) {
                                        System.out.println("Correcto");
                                        puntaje = 500;
                                        nivel = 6;
                                        a = 1;
                                    } else {
                                        System.out.println("Incorrecto");
                                        participante[0][1] = "" + puntaje;
                                        a = 1;
                                        whileDos = 1;
                                    }
                                } else {
                                    System.out.println("Opción no valida, por favor digite la opcion A, B, C, D");
                                }
                            }
                            break;


                    }
                    break;
                case 6:
                    System.out.println("GANASTE " + participante[0][0]);
                    whileDos = 1;
                    break;
            }//fin switch principal
        }


        

    }
}
