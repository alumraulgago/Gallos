/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallagallos;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    List<String> palabras = new ArrayList<String>(List.of("Altar","Administrar","Afectar","Apoyar","Arreglar","Celebrar","Charlar","Combinar","Contactar","Contestar","Demostrar","Derrumbar","Desencadenar","Erradicar","Escapar","Estudiar","Expulsar","Forrar","Impacientar","Llenar","Modificar","Organizar","Reiniciar","Reparar","Saquear","Silenciar","Simplificar","Soltar","Iluminar","Ampliar","Chulear","Condimentar","Cuidar","Declarar","Deleitar","Denegar","Desordenar","Despistar","Destinar","Disparar","Impresionar","Jurar","Ligar","Machacar","Marear","Prolongar","Rechazar","Registrar","Valorar","Volar","Delimitar","Pasar","Hogar","Abandonar","Ahogar","Anticipar","Anunciar","Callar","Cascar","Cesar","Curiosear","Diseñar","Empaquetar","Empujar","Espabilar","Estrellar","Exportar","Fabricar","Invitar","Liberar","Progresar","Quebrantar","Racanear","Reinstalar","Renunciar","Revitalizar","Trabajar","Collar","Acaparar","Agradar","Concursar","Contemplar","Cosechar","Desinflar","Falsificar","Ocupar","Asegurar","Alertar","Subastar","Subrayar","Superar","Ayer","Mujer","Absorber","Aparecer","Caer","Carecer","Comer","Cometer","Conceder","Convencer","Defender","Desaparecer","Desfallecer","Detener","Disolver","Distraer","Escoger","Nacer","Parecer","Romper","Socorrer","Valer","Vencer","Ver","Llover","Alquiler","Mercader","Aprender","Compadecer","Comparecer","Comprender","Conocer","Descender","Doler","Encender","Envejecer","Extraer","Mover","Obtener","Ofrecer","Perder","Prender","Pretender","Proceder","Proveer","Remover","Responder","Retroceder","Saber","Aseo","Balanceo","Boxeo","Cacareo","Cachondeo","Coqueteo","Cotilleo","Papeleo","Paseo","Picoteo","Pisoteo","Rastreo","Regateo","Ronroneo","Saqueo","Tiroteo","Vapuleo","Veraneo","Bromeo","Piropeo","Poseo","Proveo","Saboreo","Saboteo","Telefoneo","Tonteo","Actualidad","Compatibilidad","Creatividad","Dificultad","Dignidad","Generosidad","Inferioridad","Irresponsabilidad","Nacionalidad","Necesidad","Obscuridad","Oportunidad","Piedad","Selectividad","Sensibilidad","Voluntad","Vulgaridad","Aterrador","Coliflor","Conquistador","Coordinador","Corredor","Desenterrador","Devastador","Diseñador","Divulgador","Error","Gladiador","Historiador","Humor","Impostor","Leñador","Locomotor","Luchador","Olor","Patinador","Profesor","Temporizador","Terror","Volador","Acogedor","Adiestrador","Admirador","Agotador","Borrador","Cursor","Defensor","Entrenador","Escultor","Esquiador","Evasor","Helador","Ladrador","Licor","Mirador","Operador","Patrocinador","Perdedor","Pintor","Portador","Probador","Progenitor","Reactor","Receptor","Reconquistador","Reparador","Ruiseñor","Seleccionador","Simulador","Sucesor","Sudor","Triunfador","Vapor","Ventilador","Aportación","Atracción","Boquerón","Cañón","Carbón","Contradicción","Conversación","Convicción","División","Evasión","Exclusión","Gritón","Infección","Motivación","Negación","Ocupación","Ración","Recuperación","Revolución","Solución","Invasión","Adoración","Cartón","Ciclón","Civilización","Colisión","Combinación","Decoración","Edición","Explosión","Munición","Nutrición","Precisión","Prisión","Protección","Timón","Tradición","Varón","Resfriado","Amigo","Hermano","Criatura","Ser","Vida","Nacimiento","Naturaleza","Campo","Bosque","Selva","Jungla","Desierto","Costa","Playa","Río","Perro","Oveja","Mono","Ratón","Conejo","Dragón","Ciervo","León","Elefante","Gorrión","Sardina","Atún","Calamar","Insecto","Mosquito","Lagarto","Serpiente","Cocodrilo","Oro","Plata","Plomo","Sal","Barro","Mercado","Servicio","Ciencia","Historia","Geografía","Educación","Deporte","Carrera","Competición","Ayuda","Tema","Caso","Creación","Destrucción","Sentido","Sensación","Conciencia","Percepción","Fuerza","Potencia","Presencia","Existencia","Experiencia","Posibilidad","Probabilidad","Verdad","Mentira","Razón","Acierto","Equivocación","Falta","Significado","Carácter","Personalidad","Pensamiento","Memoria","Recuerdo","Deseo","Alegría","Manual","Purga","España","Europa","Teléfono","Número","Bobo","Juez","Libros","Refrescos","Consola","Mando","Presidente","Ministro","Monarca","Botiquín","Pistola","Gancho","Espada","Arco","Flecha","Armadura","Roble","Aeropuerto","Ladrido","Lamborghini","Adidas","Nike","Oso","Tanque","Avioneta","Arcoíris","Calendario","Ubrique","Cádiz","Cerveza","Cristal","Caramelo","Tenis","Fútbol","Baloncesto","Roca","Papel","Tijeras","Piedra","Mineral","Agua","Derrota","Victoria","Ejército","Electricidad","Impuestos","Fruta","Familia","Templo","Monumento","Muralla","Muro","Ventana","Barrotes","Bandera"));
    List<String> tematica = new ArrayList<String>(List.of("Futbol", "Salud", "Alcohol", "Universidad", "Historia", "Arte", "Libertad", "Naturaleza", "Religión", "Robos", "Superhéroes", "Villanos", "España", "Andalucía"," Animales", "Videojuegos", "Series", "Deportes", "Guerra", "Monumentos", "Internet", "Educación", "Bullying", "Comida", "Paranormal", "Ropa", "Marcas", "Coches", "Armas", "Tiempo", "Cádiz", "Tecnología", "Famosos", "Primavera", "Verano", "Invierno", "Otoño", "Playa", "Dinero", "Amor", "Juguetes", "Magia", "Música", "Sentimientos","Muerte","Vida","Dibujos Animados","Ciudades","Países"));
    int k;
    String sesenta = "60";
    String cientoVeinte = "120";
    String cientoOchenta = "180";
    Timer t;
    public a() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(this);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1390, 700));
        setResizable(false);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Fondo2.jpeg"))); // NOI18N

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
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/publicidadapp.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setText("60");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton2.setText("120");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton3.setText("180");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel3.setText("0");

        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setText("Iniciar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton9.setText("Reiniciar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton10.setText("Pausar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(283, 283, 283))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(338, 338, 338)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(620, 620, 620)
                        .addComponent(jLabel3)))
                .addContainerGap(458, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );

        jTabbedPane1.addTab("Crono", jPanel1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/publicidadapp.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/UO342x302.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel6.setText("0");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel7.setText("Palabras");

        jButton4.setText("60");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("120");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton11.setText("Iniciar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton12.setText("Reiniciar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton13.setText("Pausar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel6)
                        .addGap(260, 260, 260)
                        .addComponent(jLabel5)
                        .addGap(215, 215, 215))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115))
        );

        jTabbedPane1.addTab("Palabras", jPanel2);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/publicidadapp.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/UO342x302.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel10.setText("0");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel11.setText("Temática");

        jButton7.setText("60");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("120");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton14.setText("Iniciar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton15.setText("Reiniciar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton16.setText("Pausar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel10)
                        .addGap(260, 260, 260)
                        .addComponent(jLabel9)
                        .addGap(215, 215, 215))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );

        jTabbedPane1.addTab("Temática", jPanel3);

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
    //Botón que cambia el cronómetro de la pantalla crono
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jLabel3.setText(sesenta);
       k = Integer.parseInt(sesenta);
    }//GEN-LAST:event_jButton1ActionPerformed
    //Botón que cambia el cronómetro de la pantalla crono
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel3.setText(cientoVeinte);
        k = Integer.parseInt(cientoVeinte);
    }//GEN-LAST:event_jButton2ActionPerformed
    //Botón que cambia el cronómetro de la pantalla crono
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabel3.setText(cientoOchenta);
        k = Integer.parseInt(cientoOchenta);
    }//GEN-LAST:event_jButton3ActionPerformed

    //Botón que cambia el crono de la pantalla palabras
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabel6.setText(sesenta);
        k = Integer.parseInt(sesenta);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    //Botón que cambia el crono de la pantalla palabras
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jLabel6.setText(cientoVeinte);
        k = Integer.parseInt(cientoVeinte);
    }//GEN-LAST:event_jButton5ActionPerformed
    
  
    //Botón que inicia el cronómetro de la pantalla crono
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel3.setText(String.valueOf(k));
                k--;
            }
        });
        t.start();
    }//GEN-LAST:event_jButton6ActionPerformed
    //Botón que pone a 60 el crono de tematica
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jLabel10.setText(sesenta);
        k = Integer.parseInt(sesenta);
    }//GEN-LAST:event_jButton7ActionPerformed
    //Botón que pone a 120 el crono de tematica
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jLabel10.setText(cientoVeinte);
        k = Integer.parseInt(cientoVeinte);
    }//GEN-LAST:event_jButton8ActionPerformed
    //Botón de reiniciar el crono
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jLabel3.setText("0");
    }//GEN-LAST:event_jButton9ActionPerformed
    //Botón de pausar el crono
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        t.stop();
    }//GEN-LAST:event_jButton10ActionPerformed
    //Botón de iniciar el crono de la pantalla palabras
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel6.setText(String.valueOf(k));
                k--;
                for (int i = 0; i<417; i++) {
                    jLabel7.setText(palabras.get(i));
                }
            }
        });
        t.start();
    }//GEN-LAST:event_jButton11ActionPerformed
    //Botón para reiniciar el crono de la pantalla palabras
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jLabel6.setText("0");
    }//GEN-LAST:event_jButton12ActionPerformed
    //Botón que pausa el crono de la pantalla palabras
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        t.stop();
    }//GEN-LAST:event_jButton13ActionPerformed
    //Botón para iniciar el crono de la pantalla temática
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel10.setText(String.valueOf(k));
                k--;
                for (int x = 0; x<49; x++) {
                    jLabel11.setText(tematica.get(x));
                }
            }
        });
        t.start();
    }//GEN-LAST:event_jButton14ActionPerformed
    //Botón para reiniciar el crono de la pantalla temática
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jLabel10.setText("0");
    }//GEN-LAST:event_jButton15ActionPerformed
    //Botón que pausa el crono de la pantalla temática
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        t.stop();
    }//GEN-LAST:event_jButton16ActionPerformed
    
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
