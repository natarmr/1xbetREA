package a;

import android.javax.sip.header.WarningHeader;

/* JADX INFO: loaded from: classes.dex */
public interface j0t0 {
    static int a(String str) {
        str.getClass();
        switch (str) {
            case "easing":
                return 317;
            case "rotationX":
                return 308;
            case "rotationY":
                return 309;
            case "rotationZ":
                return 310;
            case "translationX":
                return WarningHeader.MEDIA_TYPE_NOT_AVAILABLE;
            case "translationY":
                return 305;
            case "translationZ":
                return WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD;
            case "progress":
                return 315;
            case "pivotX":
                return 313;
            case "pivotY":
                return 314;
            case "scaleX":
                return 311;
            case "scaleY":
                return 312;
            case "target":
                return 101;
            case "elevation":
                return WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD;
            case "alpha":
                return WarningHeader.INCOMPATIBLE_BANDWIDTH_UNITS;
            case "frame":
                return 100;
            case "curveFit":
                return 301;
            case "pathRotate":
                return 316;
            case "pivotTarget":
                return 318;
            case "visibility":
                return 302;
            default:
                return -1;
        }
    }
}
