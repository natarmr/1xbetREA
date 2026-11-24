package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tpt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sje f34352a;
    public final Executor b;
    public final rgi0 c;
    public final ThreadLocal d;
    public final ex2 e;
    public final sje f;

    public tpt0(sje sjeVar, Executor executor, lne lneVar) {
        executor.getClass();
        this.f34352a = sjeVar;
        this.b = executor;
        new Handler(Looper.getMainLooper());
        this.c = new rgi0(executor);
        this.d = new ThreadLocal();
        ex2 ex2Var = new ex2(this, (byte) 2);
        this.e = ex2Var;
        this.f = d5c.a(sjeVar.f32300a.plus(qem0.e()).plus(obb.Y(ex2Var)));
    }
}
