// -- Music Player Simulation using JList for songs and a Timer to simulate the progress bar and time updates. -- //

import java.awt.*;
import javax.swing.*;

public class MusicPlayer extends JFrame {
    private JProgressBar progressBar;
    private JLabel timeLabel;
    private Timer timer;
    private int progress = 0;

    public MusicPlayer() {
        setTitle("Simple Music Player");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Song List
        String[] songs = {"Song A", "Song B", "Song C", "Song D"};
        JList<String> songList = new JList<>(songs);
        add(new JScrollPane(songList), BorderLayout.CENTER);

        // Control Panel
        JPanel bottomPanel = new JPanel(new BorderLayout());
        
        // Progress Bar and Time
        JPanel trackerPanel = new JPanel(new BorderLayout());
        progressBar = new JProgressBar(0, 100);
        timeLabel = new JLabel("00:00 / 03:00");
        trackerPanel.add(progressBar, BorderLayout.CENTER);
        trackerPanel.add(timeLabel, BorderLayout.EAST);
        
        // Buttons
        JPanel btnPanel = new JPanel();
        String[] icons = {"|<<", ">", "||", "[]", ">>|"};
        for (String icon : icons) {
            JButton b = new JButton(icon);
            if (icon.equals(">")) {
                b.addActionListener(e -> startSimulation(songList.getSelectedValue()));
            }
            btnPanel.add(b);
        }

        bottomPanel.add(trackerPanel, BorderLayout.NORTH);
        bottomPanel.add(btnPanel, BorderLayout.SOUTH);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void startSimulation(String song) {
        if (song == null) {
            JOptionPane.showMessageDialog(this, "Please select a song!");
            return;
        }
        JOptionPane.showMessageDialog(this, "Playing: " + song);
        progress = 0;
        if (timer != null) timer.stop();
        
        timer = new Timer(500, e -> {
            progress += 5;
            progressBar.setValue(progress);
            timeLabel.setText("00:" + (progress < 10 ? "0" : "") + progress + " / 03:00");
            if (progress >= 100) timer.stop();
        });
        timer.start();
    }

    public static void main(String[] args) { new MusicPlayer(); }
}
