package a;

import android.gov.nist.core.Separators;
import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ly9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20851a = 0;

    static {
        Pattern.compile(Separators.SEMICOLON);
    }

    public static String a(String str, List list, String... strArr) {
        StringBuilder sbT = kng0.t("Requesting ", str, " value from among: ");
        sbT.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", sbT.toString());
        Log.i("CameraConfiguration", "Supported " + str + " values: " + list);
        if (list != null) {
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strA = z ? a("flash mode", supportedFlashModes, "torch", "on") : a("flash mode", supportedFlashModes, "off");
        if (strA != null) {
            if (strA.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to ".concat(strA));
            } else {
                Log.i("CameraConfiguration", "Setting flash mode to ".concat(strA));
                parameters.setFlashMode(strA);
            }
        }
    }
}
