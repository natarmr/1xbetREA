package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ew40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j83 f8503a;
    public mrq b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public n05 h;
    public og40 i;
    public long j;
    public w6k k;
    public y9q0 l;
    public w5z m;
    public k6z n;
    public a9q0 o;
    public int p;
    public int q;
    public dw40 r;
    public long s;

    public ew40(j83 j83Var, y9q0 y9q0Var, mrq mrqVar, int i, boolean z, int i2, int i3, List list, n05 n05Var) {
        this.f8503a = j83Var;
        this.b = mrqVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = n05Var;
        int i4 = edx.b;
        this.j = edx.f7642a;
        this.l = y9q0Var;
        this.p = -1;
        this.q = -1;
    }

    public final int a(int i, k6z k6zVar) {
        int i2 = this.p;
        int i3 = this.q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = r4e.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            jA = h(jA, k6zVar);
        }
        int iJ = jtm0.j(b(jA, k6zVar).e);
        int iJ2 = p4e.j(jA);
        if (iJ < iJ2) {
            iJ = iJ2;
        }
        this.p = i;
        this.q = iJ;
        return iJ;
    }

    public final bw40 b(long j, k6z k6zVar) {
        w5z w5zVarE = e(k6zVar);
        long jD = u7x.D(j, this.d, this.c, w5zVarE.e());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new bw40(w5zVarE, jD, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, k6z k6zVar) {
        this.s = (this.s << 2) | 3;
        long jH = this.f > 1 ? h(j, k6zVar) : j;
        a9q0 a9q0Var = this.o;
        if (a9q0Var != null) {
            bw40 bw40Var = a9q0Var.b;
            z8q0 z8q0Var = a9q0Var.f491a;
            if (!bw40Var.f3309a.b()) {
                k6z k6zVar2 = z8q0Var.h;
                long j2 = z8q0Var.j;
                if (k6zVar == k6zVar2 && (p4e.c(jH, j2) || (p4e.i(jH) == p4e.i(j2) && p4e.k(jH) == p4e.k(j2) && p4e.h(jH) >= bw40Var.e && !bw40Var.c))) {
                    a9q0 a9q0Var2 = this.o;
                    a9q0Var2.getClass();
                    if (p4e.c(jH, a9q0Var2.f491a.j)) {
                        return false;
                    }
                    a9q0 a9q0Var3 = this.o;
                    a9q0Var3.getClass();
                    this.o = g(k6zVar, jH, a9q0Var3.b);
                    return true;
                }
            }
        }
        n05 n05Var = this.h;
        if (n05Var != null) {
            this.n = k6zVar;
            long j3 = this.l.f42262a.b;
            dw40 dw40Var = this.r;
            if (dw40Var == null) {
                dw40Var = new dw40(this);
                this.r = dw40Var;
            }
            float fX = dw40Var.X(n05Var.c);
            float fX2 = dw40Var.X(n05Var.f22684a);
            float fX3 = dw40Var.X(n05Var.b);
            float f = 2.0f;
            float f2 = (fX2 + fX3) / 2.0f;
            float f3 = fX3;
            float f4 = fX2;
            while (f3 - f4 >= fX) {
                float f5 = f;
                float f6 = f3;
                if (n05.a(dw40Var.a(j, dw40Var.B(f2)))) {
                    f3 = f2;
                } else {
                    f4 = f2;
                    f3 = f6;
                }
                f2 = (f4 + f3) / f5;
                f = f5;
            }
            float fFloor = (((float) Math.floor((f4 - fX2) / fX)) * fX) + fX2;
            float f7 = fX + fFloor;
            if (f7 <= fX3 && !n05.a(dw40Var.a(j, dw40Var.B(f7)))) {
                fFloor = f7;
            }
            long jB = dw40Var.B(fFloor);
            if (daq0.d(jB)) {
                jB = fw40.a(j3, jB);
            }
            long j4 = jB;
            dw40 dw40Var2 = this.r;
            if (dw40Var2 == null) {
                dw40Var2 = new dw40(this);
                this.r = dw40Var2;
            }
            a9q0 a9q0Var4 = dw40Var2.f6779a;
            if (a9q0Var4 != null) {
                z8q0 z8q0Var2 = a9q0Var4.f491a;
                if (daq0.a(j4, z8q0Var2.b.f42262a.b) && z8q0Var2.f == this.c) {
                    this.o = a9q0Var4;
                    return true;
                }
            }
            f(y9q0.a(this.l, 0L, j4, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213));
        }
        this.o = g(k6zVar, jH, b(jH, k6zVar));
        return true;
    }

    public final void d(w6k w6kVar) {
        long jA;
        w6k w6kVar2 = this.k;
        if (w6kVar != null) {
            int i = edx.b;
            jA = edx.a(w6kVar.getDensity(), w6kVar.v0());
        } else {
            jA = edx.f7642a;
        }
        if (w6kVar2 == null) {
            this.k = w6kVar;
            this.j = jA;
            return;
        }
        if (w6kVar == null || this.j != jA) {
            this.k = w6kVar;
            this.j = jA;
            this.s = (this.s << 2) | 1;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.p = -1;
            this.r = null;
        }
    }

    public final w5z e(k6z k6zVar) {
        w5z w5zVar = this.m;
        if (w5zVar == null || k6zVar != this.n || w5zVar.b()) {
            this.n = k6zVar;
            j83 j83Var = this.f8503a;
            y9q0 y9q0VarA = afn0.A(this.l, k6zVar);
            w6k w6kVar = this.k;
            w6kVar.getClass();
            mrq mrqVar = this.b;
            List list = this.g;
            if (list == null) {
                list = iun.f15405a;
            }
            w5zVar = new w5z(j83Var, w6kVar, mrqVar, y9q0VarA, list, this.d);
        }
        this.m = w5zVar;
        return w5zVar;
    }

    public final void f(y9q0 y9q0Var) {
        boolean zC = y9q0Var.c(this.l);
        this.l = y9q0Var;
        if (zC) {
            return;
        }
        this.s <<= 2;
        this.m = null;
        this.o = null;
        this.q = -1;
        this.p = -1;
    }

    public final a9q0 g(k6z k6zVar, long j, bw40 bw40Var) {
        float fMin = Math.min(bw40Var.f3309a.e(), bw40Var.d);
        j83 j83Var = this.f8503a;
        y9q0 y9q0Var = this.l;
        List list = this.g;
        if (list == null) {
            list = iun.f15405a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        w6k w6kVar = this.k;
        w6kVar.getClass();
        return new a9q0(new z8q0(j83Var, y9q0Var, list, i, z, i2, w6kVar, k6zVar, this.b, j), bw40Var, r4e.d(j, (((long) jtm0.j(fMin)) << 32) | (((long) jtm0.j(bw40Var.e)) & 4294967295L)));
    }

    public final long h(long j, k6z k6zVar) {
        og40 og40Var = this.i;
        y9q0 y9q0Var = this.l;
        w6k w6kVar = this.k;
        w6kVar.getClass();
        og40 og40VarF = t9x.F(og40Var, k6zVar, y9q0Var, w6kVar, this.b);
        this.i = og40VarF;
        return og40VarF.a(this.f, j);
    }

    public final String toString() {
        z8q0 z8q0Var;
        Object p4eVar = "null";
        String str = this.o != null ? "<TextLayoutResult>" : "null";
        String strB = edx.b(this.j);
        long j = this.s;
        a9q0 a9q0Var = this.o;
        if (a9q0Var != null && (z8q0Var = a9q0Var.f491a) != null) {
            p4eVar = new p4e(z8q0Var.j);
        }
        StringBuilder sbN = b1j.n("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strB, ", history=");
        sbN.append(j);
        sbN.append(", constraints=");
        sbN.append(p4eVar);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
