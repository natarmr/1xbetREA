package a;

import android.util.Range;
import android.util.Size;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface fpt0 extends xto0, h0x {
    public static final u15 C0 = new u15("camerax.core.useCase.defaultSessionConfig", xii0.class, null);
    public static final u15 D0 = new u15("camerax.core.useCase.defaultCaptureConfig", t7a.class, null);
    public static final u15 E0 = new u15("camerax.core.useCase.sessionConfigUnpacker", r3a.class, null);
    public static final u15 F0 = new u15("camerax.core.useCase.captureConfigUnpacker", q3a.class, null);
    public static final u15 G0;
    public static final u15 H0;
    public static final u15 I0;
    public static final u15 J0;
    public static final u15 K0;
    public static final u15 L0;
    public static final u15 M0;
    public static final u15 N0;
    public static final u15 O0;
    public static final u15 P0;
    public static final u15 Q0;
    public static final u15 R0;
    public static final u15 S0;

    static {
        Class cls = Integer.TYPE;
        G0 = new u15("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        H0 = new u15("camerax.core.useCase.sessionType", cls, null);
        I0 = new u15("camerax.core.useCase.targetFrameRate", Range.class, null);
        J0 = new u15("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        K0 = new u15("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        L0 = new u15("camerax.core.useCase.zslDisabled", cls2, null);
        M0 = new u15("camerax.core.useCase.highResolutionDisabled", cls2, null);
        N0 = new u15("camerax.core.useCase.captureType", hpt0.class, null);
        O0 = new u15("camerax.core.useCase.previewStabilizationMode", cls, null);
        P0 = new u15("camerax.core.useCase.videoStabilizationMode", cls, null);
        Q0 = new u15("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        R0 = new u15("camerax.core.useCase.takePictureManagerProvider", dpt0.class, null);
        S0 = new u15("camerax.core.useCase.streamUseCase", urm0.class, null);
    }

    default int n() {
        return ((Integer) e(P0, 0)).intValue();
    }

    default int q() {
        return ((Integer) e(O0, 0)).intValue();
    }

    default urm0 u() {
        urm0 urm0Var = (urm0) e(S0, urm0.DEFAULT);
        Objects.requireNonNull(urm0Var);
        return urm0Var;
    }

    default hpt0 v() {
        return (hpt0) d(N0);
    }

    default int w(Size size) {
        Map map = (Map) e(K0, null);
        if (map == null || !map.containsKey(size)) {
            return Integer.MAX_VALUE;
        }
        Integer num = (Integer) map.get(size);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
