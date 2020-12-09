package com.extrajava.midi_player;

import javax.sound.midi.*;
import java.util.Scanner;

public class ConsoleMidiPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Введите инструмент : ");
            int a = scan.nextInt();
            System.out.print("\nВведите ноту : ");
            int b = scan.nextInt();
            ConsoleMidiPlayer mini = new ConsoleMidiPlayer();
            if ((a + b) < 2) {
                System.out.println("\nНе забывайте аргументы для инструмента и ноты");
            } else {
                int instrument = a;
                int note = b;
                mini.play(instrument, note);
            }
        }
    }

    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a , 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
