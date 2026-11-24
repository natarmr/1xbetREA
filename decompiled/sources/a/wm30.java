package a;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class wm30 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f39386a;
    public final /* synthetic */ xm30 b;

    public wm30(xm30 xm30Var, dm30 dm30Var) {
        this.b = xm30Var;
        Handler handlerN = vtt0.n(this);
        this.f39386a = handlerN;
        dm30Var.m(this, handlerN);
    }

    public final void a(long j) {
        Surface surface;
        xm30 xm30Var = this.b;
        fck0 fck0Var = xm30Var.m2;
        if (this != xm30Var.a3 || xm30Var.m1 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            xm30Var.W1 = true;
            return;
        }
        try {
            xm30Var.F0(j);
            qfu0 qfu0Var = xm30Var.V2;
            if (!qfu0Var.equals(qfu0.d) && !qfu0Var.equals(xm30Var.W2)) {
                xm30Var.W2 = qfu0Var;
                fck0Var.j(qfu0Var);
            }
            xm30Var.Y1.e++;
            ueu0 ueu0Var = xm30Var.p2;
            boolean z = ueu0Var.e != 3;
            ueu0Var.e = 3;
            ueu0Var.k.getClass();
            ueu0Var.g = vtt0.M(SystemClock.elapsedRealtime());
            if (z && (surface = xm30Var.F2) != null) {
                Handler handler = (Handler) fck0Var.b;
                if (handler != null) {
                    handler.post(new tx9(fck0Var, surface, SystemClock.elapsedRealtime(), (byte) 3));
                }
                xm30Var.I2 = true;
            }
            xm30Var.k0(j);
        } catch (dlo e) {
            xm30Var.X1 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = vtt0.f38024a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
