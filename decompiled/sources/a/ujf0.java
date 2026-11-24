package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ujf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35776a;
    public boolean b;
    public int c;
    public int d;
    public Object e;
    public Object f;

    public static void b(j16 j16Var) {
        byte b = j16Var.h;
        if (b == 2) {
            x0x.K(b == 2);
            j16Var.h = (byte) 1;
            j16Var.v();
        }
    }

    public static boolean k(j16 j16Var) {
        return j16Var.h != 0;
    }

    public static void o(j16 j16Var, long j) {
        j16Var.n = true;
        if (j16Var instanceof r9q0) {
            r9q0 r9q0Var = (r9q0) j16Var;
            x0x.K(r9q0Var.n);
            r9q0Var.m1 = j;
        }
    }

    public void a(j16 j16Var, cwj cwjVar) {
        x0x.K(((j16) this.e) == j16Var || ((j16) this.f) == j16Var);
        if (k(j16Var)) {
            if (j16Var == ((j16) cwjVar.e)) {
                cwjVar.f = null;
                cwjVar.e = null;
                cwjVar.f5083a = true;
            }
            b(j16Var);
            x0x.K(j16Var.h == 1);
            j16Var.c.e();
            j16Var.h = (byte) 0;
            j16Var.i = null;
            j16Var.j = null;
            j16Var.n = false;
            j16Var.p();
            j16Var.q = null;
            j16Var.r = -9223372036854775807L;
        }
    }

    public int c() {
        boolean zK = k((j16) this.e);
        j16 j16Var = (j16) this.f;
        return (zK ? 1 : 0) + ((j16Var == null || !k(j16Var)) ? 0 : 1);
    }

    public j16 d(nn30 nn30Var) {
        ixg0 ixg0Var;
        if (nn30Var == null || (ixg0Var = nn30Var.c[this.c]) == null) {
            return null;
        }
        j16 j16Var = (j16) this.e;
        if (j16Var.i == ixg0Var) {
            return j16Var;
        }
        j16 j16Var2 = (j16) this.f;
        if (j16Var2 == null || j16Var2.i != ixg0Var) {
            return null;
        }
        return j16Var2;
    }

    public boolean e(nn30 nn30Var, j16 j16Var) {
        int i = this.c;
        if (j16Var == null) {
            return true;
        }
        ixg0 ixg0Var = nn30Var.c[i];
        ixg0 ixg0Var2 = j16Var.i;
        if (ixg0Var2 == null) {
            return true;
        }
        if (ixg0Var2 == ixg0Var) {
            if (ixg0Var == null || j16Var.l()) {
                return true;
            }
            nn30 nn30Var2 = nn30Var.m;
            if (nn30Var.g.f && nn30Var2 != null && nn30Var2.e && ((j16Var instanceof r9q0) || (j16Var instanceof sd40) || j16Var.m >= nn30Var2.e())) {
                return true;
            }
        }
        for (nn30 nn30Var3 = nn30Var.m; nn30Var3 != null; nn30Var3 = nn30Var3.m) {
            if (Objects.equals(nn30Var3.c[i], j16Var.i)) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        j16 j16Var = (j16) this.f;
        j16 j16Var2 = (j16) this.e;
        boolean zM = k(j16Var2) ? j16Var2.m() : true;
        return (j16Var == null || j16Var.h == 0) ? zM : zM & j16Var.m();
    }

    public boolean g() {
        int i = this.d;
        return i == 2 || i == 5 || i == 3 || i == 4;
    }

    public boolean h(nn30 nn30Var) {
        int i = this.d;
        boolean z = (i == 2 || i == 5) && d(nn30Var) == ((j16) this.e);
        int i2 = this.d;
        return z || ((i2 == 3 || i2 == 4) && d(nn30Var) == ((j16) this.f));
    }

    public boolean i(nn30 nn30Var) {
        return d(nn30Var) != null;
    }

    public boolean j() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 5) {
            return k((j16) this.e);
        }
        j16 j16Var = (j16) this.f;
        j16Var.getClass();
        return j16Var.h != 0;
    }

    public void l(boolean z) {
        if (z) {
            if (this.f35776a) {
                j16 j16Var = (j16) this.e;
                x0x.K(j16Var.h == 0);
                j16Var.c.e();
                j16Var.t();
                this.f35776a = false;
                return;
            }
            return;
        }
        if (this.b) {
            j16 j16Var2 = (j16) this.f;
            j16Var2.getClass();
            x0x.K(j16Var2.h == 0);
            j16Var2.c.e();
            j16Var2.t();
            this.b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int m(j16 j16Var, nn30 nn30Var, ucs0 ucs0Var, cwj cwjVar) {
        int i;
        int i2;
        ixg0[] ixg0VarArr = nn30Var.c;
        j16 j16Var2 = (j16) this.e;
        int i3 = this.c;
        if (j16Var == null || j16Var.h == 0 || (j16Var == j16Var2 && ((i2 = this.d) == 2 || i2 == 5))) {
            return 1;
        }
        if (j16Var == ((j16) this.f) && ((i = this.d) == 3 || i == 4)) {
            return 1;
        }
        Object[] objArr = j16Var.i != ixg0VarArr[i3];
        boolean zP = ucs0Var.p(i3);
        if (!zP || objArr != false) {
            if (!j16Var.n) {
                fmo fmoVar = ((fmo[]) ucs0Var.d)[i3];
                int length = fmoVar != null ? fmoVar.length() : 0;
                androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[length];
                for (int i4 = 0; i4 < length; i4++) {
                    fmoVar.getClass();
                    bVarArr[i4] = fmoVar.f(i4);
                }
                ixg0 ixg0Var = ixg0VarArr[i3];
                ixg0Var.getClass();
                j16Var.A(bVarArr, ixg0Var, nn30Var.e(), nn30Var.p, nn30Var.g.f25528a);
                return 3;
            }
            if (!j16Var.m()) {
                return 0;
            }
            a(j16Var, cwjVar);
            if (!zP || g()) {
                l(j16Var == j16Var2);
                return 1;
            }
        }
        return 1;
    }

    public void n() {
        if (!k((j16) this.e)) {
            l(true);
        }
        j16 j16Var = (j16) this.f;
        if (j16Var == null || j16Var.h != 0) {
            return;
        }
        l(false);
    }

    public void p() {
        byte b;
        j16 j16Var = (j16) this.e;
        byte b2 = j16Var.h;
        if (b2 == 1 && this.d != 5) {
            x0x.K(b2 == 1);
            j16Var.h = (byte) 2;
            j16Var.u();
            return;
        }
        j16 j16Var2 = (j16) this.f;
        if (j16Var2 == null || (b = j16Var2.h) != 1 || this.d == 4) {
            return;
        }
        x0x.K(b == 1);
        j16Var2.h = (byte) 2;
        j16Var2.u();
    }
}
