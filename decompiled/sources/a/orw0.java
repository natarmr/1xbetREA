package a;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class orw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25755a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ wrw0 d;

    public orw0(wrw0 wrw0Var, boolean z) {
        Objects.requireNonNull(wrw0Var);
        this.d = wrw0Var;
        this.f25755a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        wrw0 wrw0Var = this.d;
        if (wrw0Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            wrw0Var.d(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
