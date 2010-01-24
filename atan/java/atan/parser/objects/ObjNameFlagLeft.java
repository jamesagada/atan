package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerPlayer;
import atan.model.enums.Flag;

/**
 *
 *
 * @author Atan
 */
public class ObjNameFlagLeft implements ObjName {
    int  number;
    char qualifier;

    /**
     *
     *
     * @param qualifier
     * @param number
     */
    public ObjNameFlagLeft(char qualifier, int number) {
        this.qualifier = qualifier;
        this.number    = number;
    }

    /**
     *
     * @param c
     * @param distance
     * @param direction
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    @Override
    public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        switch (qualifier) {
            case 't' :
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOther(Flag.RIGHT_30, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagOther(Flag.RIGHT_20, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagOther(Flag.RIGHT_10, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                }
                ;
                break;
            case 'b' :
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOther(Flag.LEFT_30, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagOther(Flag.LEFT_20, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagOther(Flag.LEFT_10, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagOther(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                   headFacingDirection);
                break;
        }
    }

    /**
     *
     * @param c
     * @param distance
     * @param direction
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    @Override
    public void infoSeeFromWest(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        switch (qualifier) {
            case 't' :
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOwn(Flag.LEFT_30, distance, direction, distChange, dirChange, bodyFacingDirection,
                                         headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagOwn(Flag.LEFT_20, distance, direction, distChange, dirChange, bodyFacingDirection,
                                         headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagOwn(Flag.LEFT_10, distance, direction, distChange, dirChange, bodyFacingDirection,
                                         headFacingDirection);
                        break;
                }
                ;
                break;
            case 'b' :
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOwn(Flag.RIGHT_30, distance, direction, distChange, dirChange,
                                         bodyFacingDirection, headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagOwn(Flag.RIGHT_20, distance, direction, distChange, dirChange,
                                         bodyFacingDirection, headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagOwn(Flag.RIGHT_10, distance, direction, distChange, dirChange,
                                         bodyFacingDirection, headFacingDirection);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagOwn(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                 headFacingDirection);
                break;
        }
    }
}