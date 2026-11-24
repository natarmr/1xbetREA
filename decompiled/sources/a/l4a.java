package a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class l4a implements xto0 {
    public static final u15 b = new u15("camerax.core.appConfig.cameraFactoryProvider", fz9.class, null);
    public static final u15 c = new u15("camerax.core.appConfig.deviceSurfaceManagerProvider", ww9.class, null);
    public static final u15 d = new u15("camerax.core.appConfig.useCaseConfigFactoryProvider", xw9.class, null);
    public static final u15 e = new u15("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final u15 f = new u15("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final u15 g = new u15("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final u15 h = new u15("camerax.core.appConfig.availableCamerasLimiter", n2a.class, null);
    public static final u15 i = new u15("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final u15 j = new u15("camerax.core.appConfig.cameraProviderInitRetryPolicy", fag0.class, null);
    public static final u15 k = new u15("camerax.core.appConfig.quirksSettings", hpd0.class, null);
    public static final u15 l = new u15("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b780 f19393a;

    public l4a(b780 b780Var) {
        this.f19393a = b780Var;
    }

    @Override // a.qae0
    public final drd a() {
        return this.f19393a;
    }

    public final n2a j() {
        return (n2a) this.f19393a.e(h, null);
    }

    public final fz9 l() {
        return (fz9) this.f19393a.e(b, null);
    }

    public final long p() {
        return ((Long) this.f19393a.e(i, -1L)).longValue();
    }

    public final ww9 x() {
        return (ww9) this.f19393a.e(c, null);
    }

    public final xw9 y() {
        return (xw9) this.f19393a.e(d, null);
    }
}
