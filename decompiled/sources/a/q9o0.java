package a;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q9o0 {
    public static final ArrayList b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f28360a;

    public q9o0(Handler handler) {
        this.f28360a = handler;
    }

    public static p9o0 d() {
        p9o0 p9o0Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                p9o0Var = arrayList.isEmpty() ? new p9o0() : (p9o0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return p9o0Var;
    }

    public final p9o0 a(int i) {
        p9o0 p9o0VarD = d();
        p9o0VarD.f26617a = this.f28360a.obtainMessage(i);
        return p9o0VarD;
    }

    public final p9o0 b(int i, int i2, int i3) {
        p9o0 p9o0VarD = d();
        p9o0VarD.f26617a = this.f28360a.obtainMessage(i, i2, i3);
        return p9o0VarD;
    }

    public final p9o0 c(int i, Object obj) {
        p9o0 p9o0VarD = d();
        p9o0VarD.f26617a = this.f28360a.obtainMessage(i, obj);
        return p9o0VarD;
    }

    public final void e(Runnable runnable) {
        this.f28360a.post(runnable);
    }

    public final void f() {
        this.f28360a.removeCallbacksAndMessages(null);
    }

    public final void g(int i) {
        x0x.A(i != 0);
        this.f28360a.removeMessages(i);
    }

    public final void h(int i) {
        this.f28360a.sendEmptyMessage(i);
    }
}
