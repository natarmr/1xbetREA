package a;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class olo implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25465a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ olo(ywq0 ywq0Var, n9f n9fVar, qeo qeoVar, boolean z) {
        this.c = ywq0Var;
        this.d = n9fVar;
        this.e = qeoVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25465a) {
            case 0:
                Context context = (Context) this.c;
                boolean z = this.b;
                ulo uloVar = (ulo) this.d;
                a4a0 a4a0Var = (a4a0) this.e;
                MediaMetricsManager mediaMetricsManagerE = isj.e(context.getSystemService("media_metrics"));
                kn30 kn30Var = mediaMetricsManagerE != null ? new kn30(context, mediaMetricsManagerE.createPlaybackSession()) : null;
                if (kn30Var == null) {
                    f1t0.g0("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    fsj fsjVar = uloVar.s;
                    fsjVar.getClass();
                    fsjVar.f.a(kn30Var);
                }
                LogSessionId sessionId = kn30Var.d.getSessionId();
                synchronized (a4a0Var) {
                    yox yoxVar = a4a0Var.b;
                    yoxVar.getClass();
                    LogSessionId logSessionId = (LogSessionId) yoxVar.f43005a;
                    LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                    x0x.K(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                    yoxVar.f43005a = sessionId;
                }
                return;
            default:
                ywq0 ywq0Var = (ywq0) this.c;
                n9f n9fVar = (n9f) this.d;
                qeo qeoVar = (qeo) this.e;
                boolean z2 = this.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((x9f) ywq0Var.b).e(n9fVar, qeoVar.f28593a, z2);
                return;
        }
    }

    public /* synthetic */ olo(Context context, boolean z, ulo uloVar, a4a0 a4a0Var) {
        this.c = context;
        this.b = z;
        this.d = uloVar;
        this.e = a4a0Var;
    }
}
