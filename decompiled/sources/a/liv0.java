package a;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class liv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xiv0 f20124a;
    public pfx[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public liv0(xiv0 xiv0Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.f20124a = xiv0Var;
        c(xiv0Var);
    }

    public final void a() {
        pfx[] pfxVarArr = this.b;
        if (pfxVarArr != null) {
            pfx pfxVarI = pfxVarArr[0];
            pfx pfxVarI2 = pfxVarArr[1];
            xiv0 xiv0Var = this.f20124a;
            if (pfxVarI2 == null) {
                pfxVarI2 = xiv0Var.f40966a.i(2);
            }
            if (pfxVarI == null) {
                pfxVarI = xiv0Var.f40966a.i(1);
            }
            h(pfx.a(pfxVarI, pfxVarI2));
            pfx pfxVar = this.b[xcm0.k(16)];
            if (pfxVar != null) {
                g(pfxVar);
            }
            pfx pfxVar2 = this.b[xcm0.k(32)];
            if (pfxVar2 != null) {
                e(pfxVar2);
            }
            pfx pfxVar3 = this.b[xcm0.k(64)];
            if (pfxVar3 != null) {
                i(pfxVar3);
            }
        }
    }

    public abstract xiv0 b();

    public void c(xiv0 xiv0Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listF = xiv0Var.f40966a.f(i);
            int iK = xcm0.k(i);
            this.c[iK] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = xiv0Var.f40966a.g(i);
                this.d[iK] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public void d(int i, pfx pfxVar) {
        if (this.b == null) {
            this.b = new pfx[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[xcm0.k(i2)] = pfxVar;
            }
        }
    }

    public abstract void f(pfx pfxVar);

    public abstract void h(pfx pfxVar);

    public liv0() {
        this(new xiv0((xiv0) null));
    }

    public void e(pfx pfxVar) {
    }

    public void g(pfx pfxVar) {
    }

    public void i(pfx pfxVar) {
    }
}
