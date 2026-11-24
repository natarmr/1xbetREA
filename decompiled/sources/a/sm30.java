package a;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class sm30 implements nfu0 {
    public final /* synthetic */ xm30 b;

    public sm30(xm30 xm30Var) {
        this.b = xm30Var;
    }

    @Override // a.nfu0
    public final void b() {
        xm30 xm30Var = this.b;
        Surface surface = xm30Var.F2;
        if (surface != null) {
            fck0 fck0Var = xm30Var.m2;
            Handler handler = (Handler) fck0Var.b;
            if (handler != null) {
                handler.post(new tx9(fck0Var, surface, SystemClock.elapsedRealtime(), (byte) 3));
            }
            xm30Var.I2 = true;
        }
    }

    @Override // a.nfu0
    public final void c() {
        xm30 xm30Var = this.b;
        if (xm30Var.F2 != null) {
            xm30Var.U0(0, 1);
        }
    }

    @Override // a.nfu0
    public final void d() {
        ylo yloVar = this.b.i1;
        if (yloVar != null) {
            yloVar.a();
        }
    }

    @Override // a.nfu0
    public final void a(qfu0 qfu0Var) {
    }
}
