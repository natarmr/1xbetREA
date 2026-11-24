package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class w3c0 implements ixg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38496a;
    public final boolean b;
    public final /* synthetic */ y3c0 c;

    public w3c0(y3c0 y3c0Var, int i, boolean z) {
        this.c = y3c0Var;
        this.f38496a = i;
        this.b = z;
    }

    @Override // a.ixg0
    public final int a() {
        return this.b ? 4 : 0;
    }

    @Override // a.ixg0
    public final int b(hsj hsjVar, wkj wkjVar, int i) {
        y3c0 y3c0Var = this.c;
        if (y3c0Var.H()) {
            return -3;
        }
        int i2 = this.f38496a;
        y3c0Var.C(i2);
        int iW = y3c0Var.u[i2].w(hsjVar, wkjVar, i, y3c0Var.s1);
        if (iW == -3) {
            y3c0Var.D(i2);
        }
        return iW;
    }

    @Override // a.ixg0
    public final void c() {
        int i = this.f38496a;
        y3c0 y3c0Var = this.c;
        hxg0 hxg0Var = y3c0Var.u[i];
        ivn ivnVar = hxg0Var.h;
        if (ivnVar != null && ivnVar.e() == 1) {
            xhl xhlVarC = hxg0Var.h.c();
            xhlVarC.getClass();
            throw xhlVarC;
        }
        lhf0 lhf0Var = y3c0Var.l;
        int iE = y3c0Var.d.e(y3c0Var.f1);
        IOException iOException = (IOException) lhf0Var.d;
        if (iOException != null) {
            throw iOException;
        }
        jq00 jq00Var = (jq00) lhf0Var.c;
        if (jq00Var != null) {
            if (iE == Integer.MIN_VALUE) {
                iE = jq00Var.f16926a;
            }
            IOException iOException2 = jq00Var.e;
            if (iOException2 != null && jq00Var.f > iE) {
                throw iOException2;
            }
        }
    }

    @Override // a.ixg0
    public final int d(long j) throws Throwable {
        y3c0 y3c0Var = this.c;
        if (y3c0Var.H()) {
            return 0;
        }
        int i = this.f38496a;
        y3c0Var.C(i);
        hxg0 hxg0Var = y3c0Var.u[i];
        int iQ = hxg0Var.q(y3c0Var.s1, j);
        hxg0Var.B(iQ);
        if (iQ == 0) {
            y3c0Var.D(i);
        }
        return iQ;
    }

    @Override // a.ixg0
    public final boolean isReady() {
        y3c0 y3c0Var = this.c;
        return !y3c0Var.H() && y3c0Var.u[this.f38496a].s(y3c0Var.s1);
    }
}
