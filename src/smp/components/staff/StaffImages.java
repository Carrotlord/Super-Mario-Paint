package smp.components.staff;

import java.util.ArrayList;

import smp.components.staff.sequences.StaffNote;
import smp.components.staff.sequences.StaffNoteLine;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Wrapper class for all of the images that appear on the Staff of
 * Super Mario Paint. Contains the sprite holders for the images that
 * represent notes, the ImageView holders for each of the measure lines,
 * the lines that allow one to display notes higher than a G or lower than
 * a D on the staff, and the measure numbers.
 * @author RehdBlob
 * @since 2012.09.17
 */
public class StaffImages {

    /**
     * The line that denotes where the staffImages should begin searching
     * for images to draw.
     */
    private int beginLine;

    /**
     * The line after which StaffImages should stop looking for images to draw.
     */
    private int endLine;

    /**
     * The HBox that contains the ImageView objects that are meant to
     * hold measure numbers.
     */
    private HBox measureNums;

    /**
     * The HBox that holds the ImageView objects that are meant to hold the
     * note highlighters.
     */
    private HBox noteHighlight;

    /**
     * The HBox that contains the ImageView objects that are meant to
     * hold measure lines.
     */
    private HBox staffMLines;

    /**
     * The HBox that contains the ImageView objects that are meant to hold
     * note images on the staff.
     */
    private HBox staffNoteImages;

    /**
     * The Image for a key measure line.
     */
    private Image keyLine;

    /**
     * The Image for a regular measure line.
     */
    private Image regularLine;

    /**
     * A matrix of notes, which will be displayed on the screen
     * at any time.
     */
    private ArrayList<StaffNoteLine> noteMatrix;

    /**
     * The digits, 0-9, to be used for numbering the staff measures.
     */
    private ArrayList<Image> digits;

    /**
     * Instantiates this wrapper class with the correct HBox objects
     * such that it can begin keeping track of whatever's happening
     * on the staff, at least on the measure lines side.
     */
    public StaffImages() {
        initializeMeasureNums();
        initializeStaffMLines();
        initializeStaffNoteLines();
        initalizeNoteHighlights();
        draw();

    }

    /**
     * Sets up the staff measure lines with their
     */
    private void initializeStaffMLines() {

    }

    /**
     * Sets up the various staff note lines on the staff.
     */
    private void initializeStaffNoteLines() {

    }

    /**
     * Propagates the measure numbers across the staff.
     */
    private void initializeMeasureNums() {

    }

    /**
     * Sets up the note highlighting functionality.
     */
    private void initalizeNoteHighlights() {

    }

    /**
     * Draws the pictures on the staff.
     */
    private void draw() {

    }

    /**
     * Refreshes the staff images that are currently displaying by
     * forcing everything to redraw itself.
     */
    public void redraw() {

    }

    /**
     * Shifts the images on this staff image holder left by 1 step.
     * Does nothing if the left-hand position is already 0.
     */
    public void left() {

    }

    /**
     * Shifts the images on this staff image holder right by 1 step.
     * Does nothing if the right-hand position is already at the maximum,
     * unless the Advanced Mario Sequencer-style unlimited lines feature
     * has been enabled.
     */
    public void right() {

    }


}
