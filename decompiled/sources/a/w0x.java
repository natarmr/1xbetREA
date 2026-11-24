package a;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface w0x extends qae0 {
    public static final u15 k0 = new u15("camerax.core.imageOutput.targetAspectRatio", ay3.class, null);
    public static final u15 l0;
    public static final u15 m0;
    public static final u15 n0;
    public static final u15 o0;
    public static final u15 p0;
    public static final u15 q0;
    public static final u15 r0;
    public static final u15 s0;
    public static final u15 t0;

    static {
        Class cls = Integer.TYPE;
        l0 = new u15("camerax.core.imageOutput.targetRotation", cls, null);
        m0 = new u15("camerax.core.imageOutput.appTargetRotation", cls, null);
        n0 = new u15("camerax.core.imageOutput.mirrorMode", cls, null);
        o0 = new u15("camerax.core.imageOutput.targetResolution", Size.class, null);
        p0 = new u15("camerax.core.imageOutput.defaultResolution", Size.class, null);
        q0 = new u15("camerax.core.imageOutput.maxResolution", Size.class, null);
        r0 = new u15("camerax.core.imageOutput.supportedResolutions", List.class, null);
        s0 = new u15("camerax.core.imageOutput.resolutionSelector", isf0.class, null);
        t0 = new u15("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void t(w0x w0xVar) {
        boolean zF = w0xVar.f(k0);
        boolean z = ((Size) w0xVar.e(o0, null)) != null;
        if (zF && z) {
            jf4.o("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((isf0) w0xVar.e(s0, null)) != null) {
            if (zF || z) {
                jf4.o("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int s(int i) {
        return ((Integer) e(l0, Integer.valueOf(i))).intValue();
    }
}
