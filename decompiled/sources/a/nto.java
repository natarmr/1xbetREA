package a;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.extensions.ExtensionsManager$Companion;
import androidx.camera.extensions.ExtensionsManager$ExtensionsAvailability;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExtensionsManager$Companion f24111a = new ExtensionsManager$Companion(null);
    public static final Object b = new Object();
    public static wu9 c;
    public static nto d;

    public nto(ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability, e2a e2aVar, Context context) {
        extensionsManager$ExtensionsAvailability.getClass();
        e2aVar.getClass();
        context.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            ((CameraManager) context.getSystemService(CameraManager.class)).getClass();
            new LinkedHashMap();
            new LinkedHashMap();
            new LinkedHashMap();
        }
    }
}
