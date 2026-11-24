package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fpv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgi0 f9946a;
    public final lne b;
    public final sje c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final vox e = new vox(this, 2);

    public fpv0(Executor executor) {
        xgi0 xgi0Var = new xgi0(executor);
        this.f9946a = xgi0Var;
        lne lneVarY = obb.Y(xgi0Var);
        this.b = lneVarY;
        obb.Y(new xgi0(executor));
        this.c = d5c.a(lneVarY);
    }

    public final void a(Runnable runnable) {
        this.f9946a.execute(runnable);
    }
}
