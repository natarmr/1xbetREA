package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public interface k0t0 {
    static int a(String str) {
        str.getClass();
        switch (str) {
            case "easing":
                return Response.BAD_EXTENSION;
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
            case "alpha":
                return Response.FORBIDDEN;
            case "curveFit":
                return Response.UNAUTHORIZED;
            case "pathRotate":
                return Response.UNSUPPORTED_URI_SCHEME;
            case "visibility":
                return Response.PAYMENT_REQUIRED;
            default:
                return -1;
        }
    }
}
