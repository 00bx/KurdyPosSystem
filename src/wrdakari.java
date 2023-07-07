import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class wrdakari extends JDialog {
    public wrdakari(JFrame parent) {
        super(parent, "فێرکاری سیستەم", true);
        initComponents();
        setDialogLayout();
    }

    private void initComponents() {
        JTextArea textArea = new JTextArea();
        textArea.setText("ڕوونکردنەوە:\n\n" +
                "ڕێکخستنی بەرهەمەکان:\n" +
                "   - بەکارهێنانی دوگمەی زیادکردن بۆ زیادکردنی ئەشیاکان بۆ ناو سیستەم.\n" +
                "   - بەکارهێنانی دوگمەی داگرتنی کاڵا بۆ دەسکاریکردنی ئەشیاکان؛ بۆ دەسکاریکردنی ناوەکەی یان بارکۆد.\n" +
                "   - بۆ سڕینەوەی ئەشیاکان، تەنها کلیک لەسەر ناوەکەیان یان بارکۆدەکەی بکە و کلیک لەسەر سڕینەوە بکە.\n\n" +
                "بینینی هەموو کاڵاکان:\n" +
                "   - بەکارهێنانی دوگمەی ڕیفرێش بۆ بینینی داتای ئەشیاکان کە ئێستا نمایش داکات.\n\n" +
                "ڕێکخستنی جۆرەکان:\n" +
                "   - ڕێکخستنی جۆرەکن لەبۆ بابەتی ناو مارکێتە مەسەلەن ماست لە بابەتی سپیاتیە لەو بەشەی سپیاتی زیاد دەکەی کە ماستت لەبۆ دێت \n" +
                " لە کاتی زیادکردنی ماستەکە لەبۆ ناو سیستەم لەنا وبەشی ڕێسختنی بەرهەمەکان لەوێ لە بەشی بابەت سپیاتی هەلدەبژێری\n" +
                "  سوودی  ئەوەش لەکاتی فرۆشتن شتەکم دانایە کە دەتانی سپیاتی هەلبژێری لەسەرێ هەموو ئەو شتانەی سەربە بابەتی سپیاتین لەبۆت دەینتەوە\n\n" +
                "ڕێکستنی قەرددەکان:\n" +
                "   ئەو بەشە لەبۆ قەردەکانە کە قەردار زیاد دەکەی و دەخەیە ناو ئەرشیفی قەردەکان ،.\n" +
                " دەتانی چەندجارەک قەردەکان زیاد بکەی ئەگەر هاتوو کابرا لە جارەک زیاتر شتی برد بڕە پارەکەی دەخەیە سەر و دەجتە ناو ئەرشیفی قەردەکان\n\n" +
                                "  قازانجی هەفتانە ئەو بەشە لۆوەیە جیاوازی ناو هەفتەکان جیا بکاتەوە مەسەلەن لە هەفتەک  سی هەزار فرۆشرایە بەراوارد دەکەی لەگەل هەفتەی پێشوو قازانجەکەی دەبینی، \n\n" +

                "بەشی فرۆشتنیش لەبۆ فرۆشتنە کاتەک کەسەک دێت شتت دەبات لە مارکێتەکە سیستەمە بە بارکۆد ئیش دەکات ماوسەکەی دەبەیە سەر بۆشای بارکۆدەکە  وبارکۆدەکان چێک دەکەی لەوێ" +
                                                " لەبۆ هەر کێشەک تێلبکەنبۆ  \n\n" +    "٠٧٥٠٠٤٨٤٢١٢\n\n"

        
        
        );

        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setPreferredSize(new Dimension(400, 200));

        JButton closeButton = new JButton("داخستن");
        closeButton.setBackground(new Color(142, 191, 119)); // Soft Green Color
        closeButton.setForeground(Color.WHITE);
        closeButton.setFocusPainted(false);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(240, 240, 240));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        buttonPanel.add(closeButton);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPanel.add(scrollPane, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);

        JPanel shadowPanel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D graphics = (Graphics2D) g.create();
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                int shadowGap = 10;
                int shadowSize = 20;
                int shadowOffset = 10;
                int componentWidth = getWidth() - shadowOffset;
                int componentHeight = getHeight() - shadowOffset;

                // Draw shadow
                Color shadowColor = new Color(0, 0, 0, 150); // Soft black shadow color
                graphics.setColor(shadowColor);
                graphics.fillRoundRect(shadowOffset, shadowOffset, componentWidth, componentHeight, shadowSize, shadowSize);

                // Draw panel background
                graphics.setColor(Color.WHITE);
                graphics.fillRoundRect(0, 0, componentWidth, componentHeight, shadowSize, shadowSize);

                graphics.dispose();
            }
        };
        shadowPanel.setLayout(new BorderLayout());
        shadowPanel.add(contentPanel, BorderLayout.CENTER);
        shadowPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        getContentPane().setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE); // Set background color to white
        setUndecorated(true); // Remove window decorations
        getContentPane().add(shadowPanel, BorderLayout.CENTER);

        // Add sound effect for taking notes
        String soundFile = "D:\\Documents\\NetBeansProjects\\Pos\\1.wav";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setDialogLayout() {
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame parentFrame = new JFrame();
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parentFrame.setSize(600, 400);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.setVisible(true);

        wrdakari dialog = new wrdakari(parentFrame);
        dialog.setVisible(true);
    }
}