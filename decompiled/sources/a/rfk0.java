package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class rfk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wfk0 f30392a;
    public long b;
    public boolean c;
    public int d;

    public rfk0(long j, wfk0 wfk0Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f30392a = wfk0Var;
        this.b = j;
        thj0 thj0Var = xfk0.f40794a;
        if (j != 0) {
            wfk0 wfk0VarD = d();
            long j2 = wfk0VarD.c;
            long[] jArr = wfk0VarD.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = wfk0VarD.b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = wfk0VarD.f39076a;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (xfk0.c) {
                iA = xfk0.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(rfk0 rfk0Var) {
        xfk0.b.P(rfk0Var);
    }

    public final void a() {
        synchronized (xfk0.c) {
            b();
            p();
        }
    }

    public void b() {
        xfk0.d = xfk0.d.c(g());
    }

    public abstract void c();

    public wfk0 d() {
        return this.f30392a;
    }

    public abstract Function1 e();

    public boolean f() {
        return false;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public Function1 i() {
        return null;
    }

    public final rfk0 j() {
        nvu nvuVar = xfk0.b;
        rfk0 rfk0Var = (rfk0) nvuVar.w();
        nvuVar.P(this);
        return rfk0Var;
    }

    public void k() {
        q8a.x0();
        throw null;
    }

    public void l() {
        q8a.x0();
        throw null;
    }

    public void n(b8m0 b8m0Var) {
        thj0 thj0Var = xfk0.f40794a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            xfk0.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(wfk0 wfk0Var) {
        this.f30392a = wfk0Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract rfk0 u(Function1 function1);

    public void m() {
    }
}
