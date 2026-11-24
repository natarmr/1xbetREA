package a;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class z6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f43882a;
    public final long b;
    public final a9q0 c;
    public final qe60 d;
    public final n9q0 e;
    public long f;
    public final j83 g;
    public final a8q0 h;
    public final b9q0 i;

    public z6q0(a8q0 a8q0Var, qe60 qe60Var, b9q0 b9q0Var, n9q0 n9q0Var) {
        j83 j83Var = a8q0Var.f440a;
        long j = a8q0Var.b;
        a9q0 a9q0Var = b9q0Var != null ? b9q0Var.f2224a : null;
        this.f43882a = j83Var;
        this.b = j;
        this.c = a9q0Var;
        this.d = qe60Var;
        this.e = n9q0Var;
        this.f = j;
        this.g = j83Var;
        this.h = a8q0Var;
        this.i = b9q0Var;
    }

    public final List a(Function1 function1) {
        if (!o9q0.c(this.f)) {
            return q3d.j(new l8d("", 0), new fsi0(o9q0.f(this.f), o9q0.f(this.f)));
        }
        vjn vjnVar = (vjn) function1.invoke(this);
        if (vjnVar != null) {
            return kotlin.collections.a.c(vjnVar);
        }
        return null;
    }

    public final Integer b() {
        a9q0 a9q0Var = this.c;
        if (a9q0Var == null) {
            return null;
        }
        bw40 bw40Var = a9q0Var.b;
        int iE = o9q0.e(this.f);
        qe60 qe60Var = this.d;
        return Integer.valueOf(qe60Var.n(bw40Var.c(bw40Var.d(qe60Var.s(iE)), true)));
    }

    public final Integer c() {
        a9q0 a9q0Var = this.c;
        if (a9q0Var == null) {
            return null;
        }
        int iF = o9q0.f(this.f);
        qe60 qe60Var = this.d;
        return Integer.valueOf(qe60Var.n(a9q0Var.i(a9q0Var.b.d(qe60Var.s(iF)))));
    }

    public final Integer d() {
        int length;
        a9q0 a9q0Var = this.c;
        if (a9q0Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            j83 j83Var = this.f43882a;
            if (iR < j83Var.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jL = a9q0Var.l(length2);
                int i = o9q0.c;
                int i2 = (int) (jL & 4294967295L);
                if (i2 > iR) {
                    length = this.d.n(i2);
                    break;
                }
                iR++;
            } else {
                length = j83Var.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iN;
        a9q0 a9q0Var = this.c;
        if (a9q0Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.g.b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jL = a9q0Var.l(length);
            int i = o9q0.c;
            int i2 = (int) (jL >> 32);
            if (i2 < iR) {
                iN = this.d.n(i2);
                return Integer.valueOf(iN);
            }
        }
        iN = 0;
        return Integer.valueOf(iN);
    }

    public final boolean f() {
        a9q0 a9q0Var = this.c;
        return (a9q0Var != null ? a9q0Var.j(r()) : null) != xsf0.b;
    }

    public final int g(a9q0 a9q0Var, int i) {
        int iR = r();
        n9q0 n9q0Var = this.e;
        if (n9q0Var.f23154a == null) {
            n9q0Var.f23154a = Float.valueOf(a9q0Var.c(iR).f16474a);
        }
        bw40 bw40Var = a9q0Var.b;
        int iD = bw40Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= bw40Var.f) {
            return this.g.b.length();
        }
        float fB = bw40Var.b(iD) - 1.0f;
        Float f = n9q0Var.f23154a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= a9q0Var.h(iD)) || (!f() && fFloatValue <= a9q0Var.g(iD))) {
            return bw40Var.c(iD, true);
        }
        return this.d.n(bw40Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(b9q0 b9q0Var, int i) {
        jge0 jge0VarW;
        j6z j6zVar = b9q0Var.b;
        a9q0 a9q0Var = b9q0Var.f2224a;
        if (j6zVar == null) {
            jge0VarW = jge0.e;
        } else {
            j6z j6zVar2 = b9q0Var.c;
            jge0VarW = j6zVar2 != null ? j6zVar2.w(j6zVar, true) : null;
            if (jge0VarW == null) {
                jge0VarW = jge0.e;
            }
        }
        long j = this.h.b;
        int i2 = o9q0.c;
        qe60 qe60Var = this.d;
        jge0 jge0VarC = a9q0Var.c(qe60Var.s((int) (j & 4294967295L)));
        float f = jge0VarC.f16474a;
        return qe60Var.n(a9q0Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (jge0VarW.f() & 4294967295L)) * i) + jge0VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        n9q0 n9q0Var = this.e;
        n9q0Var.f23154a = null;
        j83 j83Var = this.g;
        if (j83Var.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            n9q0Var.f23154a = null;
            if (j83Var.b.length() > 0) {
                String str = j83Var.b;
                long j = this.f;
                int i = o9q0.c;
                int i2 = osm0.i((int) (j & 4294967295L), str);
                if (i2 != -1) {
                    q(i2, i2);
                }
            }
        }
    }

    public final void j() {
        this.e.f23154a = null;
        j83 j83Var = this.g;
        String str = j83Var.b;
        String str2 = j83Var.b;
        if (str.length() > 0) {
            int iP = nsm0.p(o9q0.e(this.f), str2);
            if (iP == o9q0.e(this.f) && iP != str2.length()) {
                iP = nsm0.p(iP + 1, str2);
            }
            q(iP, iP);
        }
    }

    public final void k() {
        this.e.f23154a = null;
        j83 j83Var = this.g;
        if (j83Var.b.length() > 0) {
            String str = j83Var.b;
            long j = this.f;
            int i = o9q0.c;
            int iJ = osm0.j((int) (j & 4294967295L), str);
            if (iJ != -1) {
                q(iJ, iJ);
            }
        }
    }

    public final void l() {
        this.e.f23154a = null;
        j83 j83Var = this.g;
        String str = j83Var.b;
        String str2 = j83Var.b;
        if (str.length() > 0) {
            int iQ = nsm0.q(o9q0.f(this.f), str2);
            if (iQ == o9q0.f(this.f) && iQ != 0) {
                iQ = nsm0.q(iQ - 1, str2);
            }
            q(iQ, iQ);
        }
    }

    public final void m() {
        n9q0 n9q0Var = this.e;
        n9q0Var.f23154a = null;
        j83 j83Var = this.g;
        if (j83Var.b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            n9q0Var.f23154a = null;
            if (j83Var.b.length() > 0) {
                String str = j83Var.b;
                long j = this.f;
                int i = o9q0.c;
                int i2 = osm0.i((int) (j & 4294967295L), str);
                if (i2 != -1) {
                    q(i2, i2);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.f23154a = null;
        if (this.g.b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.f23154a = null;
        if (this.g.b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = o9q0.c;
            this.f = s7n0.e((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = s7n0.e(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = o9q0.c;
        return this.d.s((int) (j & 4294967295L));
    }
}
