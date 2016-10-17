package com.example.android.latourguide;

/**
 * {@link Place} represents a place that the user might be interested in.
 * It contains resource IDs for the name, addres, and optional image file for that place.
 */
public class Place {

    /** String resource ID for the name of the place/attraction */
    private int mNameId;

    /** String resource ID for the address of the place/attraction */
    private int mAddressId;

    /** String resource ID for the description of the place/attraction */
    private int mDescriptionId;

    /** Image resource ID for the place/attraction */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param nameId is the string resource ID for the name of the popular attraction
     * @param descriptionId is the short descripton of the popular attraction
     * @param imageResourceId is the picture of the popular attraction
     */
    public Place(int nameId, int descriptionId, int imageResourceId) {
        mNameId = nameId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID for the name of the place.
     */
    public int getNameId() {    return mNameId; }

    /**
     * Get the string resource ID for the short description of the place.
     */
    public int getDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
