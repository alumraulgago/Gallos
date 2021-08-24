/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallagallos;

import java.awt.Color;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Raúl
 */
public class a extends javax.swing.JFrame {

    /**
     * Creates new form a
     */
    List<String> palabras = Arrays.asList("Altar","Administrar","Afectar","Apoyar","Arreglar","Celebrar","Charlar","Combinar","Contactar","Contestar","Demostrar","Derrumbar","Desencadenar","Erradicar","Escapar","Estudiar","Expulsar","Forrar","Impacientar","Llenar","Modificar","Organizar","Reiniciar","Reparar","Saquear","Silenciar","Simplificar","Soltar","Iluminar","Ampliar","Chulear","Condimentar","Cuidar","Declarar","Deleitar","Denegar","Desordenar","Despistar","Destinar","Disparar","Impresionar","Jurar","Ligar","Machacar","Marear","Prolongar","Rechazar","Registrar","Valorar","Volar","Delimitar","Pasar","Hogar","Abandonar","Ahogar","Anticipar","Anunciar","Callar","Cascar","Cesar","Curiosear","Diseñar","Empaquetar","Empujar","Espabilar","Estrellar","Exportar","Fabricar","Invitar","Liberar","Progresar","Quebrantar","Racanear","Reinstalar","Renunciar","Revitalizar","Trabajar","Collar","Acaparar","Agradar","Concursar","Contemplar","Cosechar","Desinflar","Falsificar","Ocupar","Asegurar","Alertar","Subastar","Subrayar","Superar","Ayer","Mujer","Absorber","Aparecer","Caer","Carecer","Comer","Cometer","Conceder","Convencer","Defender","Desaparecer","Desfallecer","Detener","Disolver","Distraer","Escoger","Nacer","Parecer","Romper","Socorrer","Valer","Vencer","Ver","Llover","Alquiler","Mercader","Aprender","Compadecer","Comparecer","Comprender","Conocer","Descender","Doler","Encender","Envejecer","Extraer","Mover","Obtener","Ofrecer","Perder","Prender","Pretender","Proceder","Proveer","Remover","Responder","Retroceder","Saber","Aseo","Balanceo","Boxeo","Cacareo","Cachondeo","Coqueteo","Cotilleo","Papeleo","Paseo","Picoteo","Pisoteo","Rastreo","Regateo","Ronroneo","Saqueo","Tiroteo","Vapuleo","Veraneo","Bromeo","Piropeo","Poseo","Proveo","Saboreo","Saboteo","Telefoneo","Tonteo","Actualidad","Compatibilidad","Creatividad","Dificultad","Dignidad","Generosidad","Inferioridad","Irresponsabilidad","Nacionalidad","Necesidad","Obscuridad","Oportunidad","Piedad","Selectividad","Sensibilidad","Voluntad","Vulgaridad","Aterrador","Coliflor","Conquistador","Coordinador","Corredor","Desenterrador","Devastador","Diseñador","Divulgador","Error","Gladiador","Historiador","Humor","Impostor","Leñador","Locomotor","Luchador","Olor","Patinador","Profesor","Temporizador","Terror","Volador","Acogedor","Adiestrador","Admirador","Agotador","Borrador","Cursor","Defensor","Entrenador","Escultor","Esquiador","Evasor","Helador","Ladrador","Licor","Mirador","Operador","Patrocinador","Perdedor","Pintor","Portador","Probador","Progenitor","Reactor","Receptor","Reconquistador","Reparador","Ruiseñor","Seleccionador","Simulador","Sucesor","Sudor","Triunfador","Vapor","Ventilador","Aportación","Atracción","Boquerón","Cañón","Carbón","Contradicción","Conversación","Convicción","División","Evasión","Exclusión","Gritón","Infección","Motivación","Negación","Ocupación","Ración","Recuperación","Revolución","Solución","Invasión","Adoración","Cartón","Ciclón","Civilización","Colisión","Combinación","Decoración","Edición","Explosión","Munición","Nutrición","Precisión","Prisión","Protección","Timón","Tradición","Varón","Resfriado","Amigo","Hermano","Criatura","Ser","Vida","Nacimiento","Naturaleza","Campo","Bosque","Selva","Jungla","Desierto","Costa","Playa","Río","Perro","Oveja","Mono","Ratón","Conejo","Dragón","Ciervo","León","Elefante","Gorrión","Sardina","Atún","Calamar","Insecto","Mosquito","Lagarto","Serpiente","Cocodrilo","Oro","Plata","Plomo","Sal","Barro","Mercado","Servicio","Ciencia","Historia","Geografía","Educación","Deporte","Carrera","Competición","Ayuda","Tema","Caso","Creación","Destrucción","Sentido","Sensación","Conciencia","Percepción","Fuerza","Potencia","Presencia","Existencia","Experiencia","Posibilidad","Probabilidad","Verdad","Mentira","Razón","Acierto","Equivocación","Falta","Significado","Carácter","Personalidad","Pensamiento","Memoria","Recuerdo","Deseo","Alegría","Manual","Purga","España","Europa","Teléfono","Número","Bobo","Juez","Libros","Refrescos","Consola","Mando","Presidente","Ministro","Monarca","Botiquín","Pistola","Gancho","Espada","Arco","Flecha","Armadura","Roble","Aeropuerto","Ladrido","Lamborghini","Adidas","Nike","Oso","Tanque","Avioneta","Arcoíris","Calendario","Ubrique","Cádiz","Cerveza","Cristal","Caramelo","Tenis","Fútbol","Baloncesto","Roca","Papel","Tijeras","Piedra","Mineral","Agua","Derrota","Victoria","Ejército","Electricidad","Impuestos","Fruta","Familia","Templo","Monumento","Muralla","Muro","Ventana","Barrotes","Bandera");
    List<String> tematica = Arrays.asList("Futbol", "Salud", "Alcohol", "Universidad", "Historia", "Arte", "Libertad", "Naturaleza", "Religión", "Robos", "Superhéroes", "Villanos", "España", "Andalucía"," Animales", "Videojuegos", "Series", "Deportes", "Guerra", "Monumentos", "Internet", "Educación", "Bullying", "Comida", "Paranormal", "Ropa", "Marcas", "Coches", "Armas", "Tiempo", "Cádiz", "Tecnología", "Famosos", "Primavera", "Verano", "Invierno", "Otoño", "Playa", "Dinero", "Amor", "Juguetes", "Magia", "Música", "Sentimientos","Muerte","Vida","Dibujos Animados","Ciudades","Países");
    int crono;
    int cronoPalabras;
    int cronoTematica;
    String sesenta = "60";
    String cientoVeinte = "120";
    String cientoOchenta = "180";
    String cero = "0";
    Timer t;
    
    
    public a() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Principal.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton17.setText("60");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, -1, -1));

        jButton18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton18.setText("120");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, -1, -1));

        jButton19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton19.setText("180");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 580, -1, -1));

        jButton20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton20.setText("Iniciar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 570, 100, -1));

        jButton21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton21.setText("Reiniciar");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 630, 100, -1));

        jButton22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton22.setText("Pausar");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, 100, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("0 ");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 260, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/CRONOMETRO.gif"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -130, 1920, 1080));

        jTabbedPane1.addTab("Crono", jPanel5);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 180, 160));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Palabras");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 360, 180));

        jButton6.setText("60");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 590, -1, -1));

        jButton9.setText("120");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 590, -1, -1));

        jButton23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton23.setText("Iniciar");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 590, 100, -1));

        jButton24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton24.setText("Reiniciar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 650, 100, -1));

        jButton25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton25.setText("Pausar");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 620, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/CRONO-PALABRA-FINAL_1.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -160, 1920, 1080));

        jTabbedPane1.addTab("Palabras", jPanel1);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("0");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 180, 160));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Temática");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 360, 180));

        jButton10.setText("60");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 590, -1, -1));

        jButton26.setText("120");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 590, -1, -1));

        jButton27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton27.setText("Iniciar");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 590, 100, -1));

        jButton28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton28.setText("Reiniciar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 650, 100, -1));

        jButton29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton29.setText("Pausar");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 620, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/CRONO-PALABRA-FINAL_1.gif"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -160, 1920, 1080));

        jTabbedPane1.addTab("Temática", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
   
  
    //BOTÓN DEL CRONOMETRO QUE LO PONE A 60
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jLabel15.setText(sesenta);
        crono = Integer.parseInt(sesenta);
        System.out.println(sesenta);
    }//GEN-LAST:event_jButton17ActionPerformed
    //BOTÓN DEL CRONOMETRO QUE LO PONE A 120
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jLabel15.setText(cientoVeinte);
        crono = Integer.parseInt(cientoVeinte);
    }//GEN-LAST:event_jButton18ActionPerformed
    //BOTÓN DEL CRONOMETRO QUE LO PONE A 180
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jLabel15.setText(cientoOchenta);
        crono = Integer.parseInt(cientoOchenta);
    }//GEN-LAST:event_jButton19ActionPerformed
    //BOTÓN DEL CRONOMETRO QUE LO INICIA
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton20.setVisible(false);
                jLabel15.setText(String.valueOf(crono));
                crono--;
                if(crono == -1) {
                    t.stop();
                    jLabel15.setText("TIEMPO");
                }
            }
        });
        t.start();
    }//GEN-LAST:event_jButton20ActionPerformed
    //BOTÓN QUE REINICIA EL VALOR DEL LABEL DE LA PANTALLA CRONO
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jButton20.setVisible(true);
        jLabel15.setText(cero);
        crono = Integer.parseInt(cero);
    }//GEN-LAST:event_jButton21ActionPerformed
    //BOTÓN PARA PAUSAR EL CRONO DE LA PANTALLA CRONO
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        t.stop();
    }//GEN-LAST:event_jButton22ActionPerformed
    //BOTÓN PARA PONER EL VALOR DEL CRONO DE LA PANTALLA PALABRAS A 60
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jLabel16.setText(sesenta);
        cronoPalabras = Integer.parseInt(sesenta);
    }//GEN-LAST:event_jButton6ActionPerformed
    //BOTÓN PARA PONER EL VALOR DEL CRONO DE LA PANTALLA PALABRAS A 120
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jLabel16.setText(cientoVeinte);
        cronoPalabras = Integer.parseInt(cientoVeinte);
    }//GEN-LAST:event_jButton9ActionPerformed
    //BOTÓN QUE INICIA LAS PALABRAS Y EL CRONO DE LA PANTALLA PALABRAS
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jButton23.setVisible(false);
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel16.setText(String.valueOf(cronoPalabras));
                if (cronoPalabras != 0 && cronoPalabras % 10 == 0) {
                    Random aleatorio = new Random();
                    String palabraAleatoria = palabras.get(aleatorio.nextInt(palabras.size()));
                    jLabel17.setText(palabraAleatoria);
                }
                cronoPalabras--;
                if(cronoPalabras == -1) {
                    t.stop();
                    jLabel16.setText("TIEMPO");
                }
            }
        });
        t.start();
    }//GEN-LAST:event_jButton23ActionPerformed
    //BOTÓN QUE REINICIA EL VALOR DE LOS LABEL DE PALABRAS Y CRONO DE LA PANTALLA PALABRAS
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jButton23.setVisible(true);
        jLabel16.setText(cero);
        cronoPalabras = Integer.parseInt(cero);
        jLabel17.setText("Palabras");
    }//GEN-LAST:event_jButton24ActionPerformed
    //BOTÓN QUE PAUSA EL CRONO Y LAS PALABRAS DE LA PANTALLA PALABRAS
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        t.stop();
    }//GEN-LAST:event_jButton25ActionPerformed
    //BOTÓN QUE PONE EN 60 EL VALOR DEL CRONO DE LA PANTALLA TEMÁTICA
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jLabel18.setText(sesenta);
        cronoTematica = Integer.parseInt(sesenta);
        Random aleatorio = new Random();
        String palabraAleatoria = tematica.get(aleatorio.nextInt(tematica.size()));
        jLabel19.setText(palabraAleatoria);
    }//GEN-LAST:event_jButton10ActionPerformed
    //BOTÓN QUE PONE EN 120 EL VALOR DEL CRONO DE LA PANTALLA TEMÁTICA
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jLabel18.setText(cientoVeinte);
        cronoTematica = Integer.parseInt(cientoVeinte);
        Random aleatorio = new Random();
        String palabraAleatoria = tematica.get(aleatorio.nextInt(tematica.size()));
        jLabel19.setText(palabraAleatoria);

    }//GEN-LAST:event_jButton26ActionPerformed
    //BOTÓN QUE INICIA EL CRONO Y LA TEMÁTICA DE LA PANTALLA TEMÁTICA
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton27.setVisible(false);
                jLabel18.setText(String.valueOf(cronoTematica));
                cronoTematica--;
                if(cronoTematica == -1) {
                    t.stop();
                    jLabel18.setText("TIEMPO");
                   
                }
            }
        });
        t.start();
    }//GEN-LAST:event_jButton27ActionPerformed
    //BOTÓN QUE REINICIA LOS VALORES DE LOS LABEL DE CRONO Y TEMÁTICA DE LA PANTALLA TEMÁTICA
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jButton27.setVisible(true);
        jLabel18.setText(cero);
        cronoTematica = Integer.parseInt(cero);
        jLabel19.setText("Temática");
    }//GEN-LAST:event_jButton28ActionPerformed
    //BOTÓN QUE PAUSA EL CRONO Y LA TEMÁTICA DE LA PANTALLA TEMÁTICA
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        t.stop();
    }//GEN-LAST:event_jButton29ActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
