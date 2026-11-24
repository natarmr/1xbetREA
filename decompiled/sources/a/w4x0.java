package a;

import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class w4x0 extends etw0 {
    public jaw0 d;
    public boolean e;
    public final ikt0 f;
    public final dr8 g;
    public final afm0 h;

    public w4x0(kxw0 kxw0Var) {
        super(kxw0Var);
        this.e = true;
        this.f = new ikt0(this);
        dr8 dr8Var = new dr8();
        dr8Var.d = this;
        kxw0 kxw0Var2 = (kxw0) this.b;
        dr8Var.c = new q4x0(dr8Var, kxw0Var2, (byte) 0);
        kxw0Var2.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        dr8Var.f6545a = jElapsedRealtime;
        dr8Var.b = jElapsedRealtime;
        this.g = dr8Var;
        this.h = new afm0(this);
    }

    @Override // a.etw0
    public final boolean o1() {
        return false;
    }

    public final void p1() {
        m1();
        if (this.d == null) {
            this.d = new jaw0(Looper.getMainLooper(), (byte) 1);
        }
    }
}
