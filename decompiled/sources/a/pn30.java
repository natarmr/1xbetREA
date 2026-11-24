package a;

import android.util.Pair;
import androidx.media3.common.Timeline$Window;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pn30 {
    public final fsj c;
    public final q9o0 d;
    public final z9f e;
    public long f;
    public int g;
    public boolean h;
    public nn30 i;
    public final nn30[] j;
    public final nn30[] k;
    public nn30 l;
    public nn30 m;
    public int n;
    public Object o;
    public long p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amq0 f27266a = new amq0();
    public final Timeline$Window b = new Timeline$Window();
    public ArrayList q = new ArrayList();

    public pn30(fsj fsjVar, q9o0 q9o0Var, z9f z9fVar, int i) {
        this.c = fsjVar;
        this.d = q9o0Var;
        this.e = z9fVar;
        this.j = new nn30[i];
        this.k = new nn30[i];
    }

    public static boolean m(nn30[] nn30VarArr, long[] jArr, nn30 nn30Var, long j) {
        for (int i = 0; i < nn30VarArr.length; i++) {
            nn30 nn30Var2 = nn30VarArr[i];
            if (nn30Var2 != null) {
                for (nn30 nn30Var3 = nn30Var.m; nn30Var3 != null; nn30Var3 = nn30Var3.m) {
                    if (nn30Var3 == nn30Var2) {
                        return true;
                    }
                }
                if (nn30Var2 != nn30Var) {
                    continue;
                } else {
                    long j2 = jArr[i];
                    if (j2 == Long.MIN_VALUE || j2 >= j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static vn30 t(bmq0 bmq0Var, Object obj, long j, long j2, Timeline$Window timeline$Window, amq0 amq0Var) {
        bmq0Var.g(obj, amq0Var);
        bmq0Var.n(amq0Var.c, timeline$Window);
        bmq0Var.b(obj);
        int i = uo.c.f35986a;
        if (i != 0) {
            if (i == 1) {
                amq0Var.f(0);
            }
            amq0Var.g(0);
        }
        bmq0Var.g(obj, amq0Var);
        int iC = amq0Var.c(j);
        return iC == -1 ? new vn30(obj, amq0Var.b(j), j2) : new vn30(obj, iC, amq0Var.e(iC), j2, -1);
    }

    public final nn30 a() {
        nn30 nn30Var;
        if (this.i == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            nn30[] nn30VarArr = this.j;
            if (i2 >= nn30VarArr.length) {
                break;
            }
            if (this.i.equals(nn30VarArr[i2])) {
                nn30VarArr[i2] = this.i.m;
            }
            i2++;
        }
        this.i.getClass();
        while (true) {
            nn30[] nn30VarArr2 = this.k;
            int length = nn30VarArr2.length;
            nn30Var = this.i;
            if (i >= length) {
                break;
            }
            if (nn30Var.equals(nn30VarArr2[i])) {
                nn30VarArr2[i] = this.i.m;
            }
            i++;
        }
        nn30Var.getClass();
        this.i.i();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            nn30 nn30Var2 = this.i;
            this.o = nn30Var2.b;
            this.p = nn30Var2.g.f25528a.d;
        }
        this.i = this.i.m;
        q();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        nn30 nn30Var = this.i;
        nn30Var.getClass();
        this.o = nn30Var.b;
        this.p = nn30Var.g.f25528a.d;
        while (nn30Var != null) {
            nn30Var.i();
            nn30Var = nn30Var.m;
        }
        this.i = null;
        this.l = null;
        Arrays.fill(this.j, (Object) null);
        Arrays.fill(this.k, (Object) null);
        this.n = 0;
        q();
    }

    public final nn30 c() {
        nn30 nn30Var = this.i;
        while (nn30Var != null) {
            for (nn30 nn30Var2 : this.k) {
                if (nn30Var == nn30Var2) {
                    return nn30Var;
                }
            }
            nn30Var = nn30Var.m;
        }
        return nn30Var;
    }

    public final nn30 d() {
        nn30 nn30Var = this.i;
        while (nn30Var != null) {
            for (nn30 nn30Var2 : this.j) {
                if (nn30Var == nn30Var2) {
                    return nn30Var;
                }
            }
            nn30Var = nn30Var.m;
        }
        return nn30Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    public final on30 e(bmq0 bmq0Var, nn30 nn30Var, long j) {
        bmq0 bmq0Var2;
        uo uoVar;
        on30 on30Var;
        Object obj;
        long j2;
        long j3;
        Timeline$Window timeline$Window;
        long j4;
        long jMax;
        long jV;
        on30 on30Var2 = nn30Var.g;
        long j5 = (nn30Var.p + on30Var2.e) - j;
        long j6 = 0;
        long jMax2 = -9223372036854775807L;
        if (!on30Var2.g) {
            vn30 vn30Var = on30Var2.f25528a;
            Object obj2 = vn30Var.f37698a;
            int i = vn30Var.e;
            amq0 amq0Var = this.f27266a;
            bmq0Var.g(obj2, amq0Var);
            if (!vn30Var.c()) {
                if (i != -1) {
                    amq0Var.f(i);
                }
                int iE = amq0Var.e(i);
                amq0Var.g(i);
                uo uoVar2 = uo.c;
                if (iE != uoVar2.a(i).f32518a) {
                    return i(bmq0Var, vn30Var.f37698a, vn30Var.e, iE, on30Var2.e, vn30Var.d);
                }
                bmq0Var.g(obj2, amq0Var);
                amq0Var.d(i);
                uoVar2.a(i).getClass();
                return j(bmq0Var, vn30Var.f37698a, 0L, -9223372036854775807L, on30Var2.e, vn30Var.d);
            }
            int i2 = vn30Var.b;
            uo uoVar3 = uo.c;
            int i3 = uoVar3.a(i2).f32518a;
            if (i3 != -1) {
                int iA = uoVar3.a(i2).a(vn30Var.c);
                if (iA < i3) {
                    return i(bmq0Var, vn30Var.f37698a, i2, iA, on30Var2.d, vn30Var.d);
                }
                long jLongValue = on30Var2.d;
                if (jLongValue == -9223372036854775807L) {
                    int i4 = amq0Var.c;
                    long j7 = amq0Var.d;
                    Timeline$Window timeline$Window2 = this.b;
                    if (j7 == -9223372036854775807L) {
                        bmq0Var.n(i4, timeline$Window2);
                        if (timeline$Window2.h && !timeline$Window2.j) {
                            jMax2 = Math.max(0L, j5);
                        }
                    }
                    bmq0Var2 = bmq0Var;
                    uoVar = uoVar3;
                    long j8 = jMax2;
                    Pair pairJ = bmq0Var2.j(timeline$Window2, amq0Var, amq0Var.c, -9223372036854775807L, j8);
                    if (pairJ != null) {
                        jMax2 = j8;
                        jLongValue = ((Long) pairJ.second).longValue();
                    }
                } else {
                    bmq0Var2 = bmq0Var;
                    uoVar = uoVar3;
                }
                int i5 = vn30Var.b;
                bmq0Var2.g(obj2, amq0Var);
                amq0Var.d(i5);
                uoVar.a(i5).getClass();
                return j(bmq0Var2, vn30Var.f37698a, Math.max(0L, jLongValue), jMax2, on30Var2.d, vn30Var.d);
            }
            return null;
        }
        on30 on30Var3 = nn30Var.g;
        vn30 vn30Var2 = on30Var3.f25528a;
        long j9 = on30Var3.d;
        int iB = bmq0Var.b(vn30Var2.f37698a);
        int i6 = this.g;
        boolean z = this.h;
        amq0 amq0Var2 = this.f27266a;
        Timeline$Window timeline$Window3 = this.b;
        int iD = bmq0Var.d(iB, amq0Var2, timeline$Window3, i6, z);
        if (iD != -1) {
            int i7 = bmq0Var.f(iD, amq0Var2, true).c;
            Object obj3 = amq0Var2.b;
            obj3.getClass();
            long j10 = vn30Var2.d;
            on30Var = null;
            if (bmq0Var.m(i7, timeline$Window3, 0L).m == iD) {
                int i8 = amq0Var2.c;
                if (amq0Var2.d != -9223372036854775807L) {
                    jMax = -9223372036854775807L;
                } else {
                    bmq0Var.n(i8, timeline$Window3);
                    if (!timeline$Window3.h || timeline$Window3.j) {
                        jMax = -9223372036854775807L;
                    } else {
                        jMax = Math.max(0L, j5);
                    }
                }
                long j11 = jMax;
                Pair pairJ2 = bmq0Var.j(timeline$Window3, amq0Var2, i7, -9223372036854775807L, j11);
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    nn30 nn30Var2 = nn30Var.m;
                    if (nn30Var2 == null || !nn30Var2.b.equals(obj4)) {
                        jV = v(obj4);
                        if (jV == -1) {
                            jV = this.f;
                            this.f = 1 + jV;
                        }
                    } else {
                        jV = nn30Var2.g.f25528a.d;
                    }
                    j3 = j11;
                    timeline$Window = timeline$Window3;
                    obj = obj4;
                    j2 = jV;
                    j4 = jLongValue2;
                    j6 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j2 = j10;
                j3 = -9223372036854775807L;
                timeline$Window = timeline$Window3;
                j4 = 0;
            }
            vn30 vn30VarT = t(bmq0Var, obj, j4, j2, timeline$Window, amq0Var2);
            long j12 = j4;
            if (j6 != -9223372036854775807L && j9 != -9223372036854775807L) {
                bmq0Var.g(vn30Var2.f37698a, amq0Var2).getClass();
                if (uo.c.f35986a > 0) {
                    amq0Var2.g(0);
                }
            }
            return h(bmq0Var, vn30VarT, j6, j12, j3);
        }
        on30Var = null;
        return on30Var;
    }

    public final nn30 f() {
        nn30[] nn30VarArr = this.j;
        if (nn30VarArr.length == 0) {
            return null;
        }
        nn30 nn30Var = nn30VarArr[0];
        for (nn30 nn30Var2 = this.i; nn30Var2 != null; nn30Var2 = nn30Var2.m) {
            for (nn30 nn30Var3 : nn30VarArr) {
                if (nn30Var2 == nn30Var3) {
                    nn30Var = nn30Var2;
                    break;
                }
            }
        }
        return nn30Var;
    }

    public final long g(bmq0 bmq0Var, vn30 vn30Var) {
        Object obj = vn30Var.f37698a;
        amq0 amq0Var = this.f27266a;
        bmq0Var.g(obj, amq0Var);
        if (vn30Var.c()) {
            return amq0Var.a(vn30Var.b, vn30Var.c);
        }
        int i = vn30Var.e;
        if (i == -1) {
            return amq0Var.d;
        }
        amq0Var.d(i);
        return 0L;
    }

    public final on30 h(bmq0 bmq0Var, vn30 vn30Var, long j, long j2, long j3) {
        bmq0Var.g(vn30Var.f37698a, this.f27266a);
        boolean zC = vn30Var.c();
        Object obj = vn30Var.f37698a;
        return zC ? i(bmq0Var, obj, vn30Var.b, vn30Var.c, j, vn30Var.d) : j(bmq0Var, obj, j2, j3, j, vn30Var.d);
    }

    public final on30 i(bmq0 bmq0Var, Object obj, int i, int i2, long j, long j2) {
        vn30 vn30Var = new vn30(obj, i, i2, j2, -1);
        amq0 amq0Var = this.f27266a;
        long jA = bmq0Var.g(obj, amq0Var).a(i, i2);
        if (i2 == amq0Var.e(i)) {
            uo uoVar = uo.c;
        }
        amq0Var.g(i);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new on30(vn30Var, jMax, -9223372036854775807L, j, jA, false, false, false, false);
    }

    public final on30 j(bmq0 bmq0Var, Object obj, long j, long j2, long j3, long j4) {
        amq0 amq0Var = this.f27266a;
        bmq0Var.g(obj, amq0Var);
        int iB = amq0Var.b(j);
        if (iB != -1) {
            amq0Var.g(iB);
        }
        if (iB != -1) {
            amq0Var.g(iB);
        }
        vn30 vn30Var = new vn30(obj, iB, j4);
        boolean z = !vn30Var.c() && iB == -1;
        boolean zO = o(bmq0Var, vn30Var);
        boolean zN = n(bmq0Var, vn30Var, z);
        long jG = g(bmq0Var, vn30Var);
        return new on30(vn30Var, (jG == -9223372036854775807L || j < jG) ? j : Math.max(0L, jG - 1), j2, j3, jG, false, z, zO, zN);
    }

    public final nn30 k(int i) {
        return this.k[i];
    }

    public final on30 l(bmq0 bmq0Var, on30 on30Var) {
        vn30 vn30Var = on30Var.f25528a;
        int i = vn30Var.e;
        boolean z = !vn30Var.c() && i == -1;
        boolean zO = o(bmq0Var, vn30Var);
        boolean zN = n(bmq0Var, vn30Var, z);
        long jG = g(bmq0Var, vn30Var);
        Object obj = vn30Var.f37698a;
        amq0 amq0Var = this.f27266a;
        bmq0Var.g(obj, amq0Var);
        if (vn30Var.c()) {
            amq0Var.g(vn30Var.b);
        } else if (i != -1) {
            amq0Var.g(i);
        }
        return new on30(vn30Var, on30Var.b, on30Var.c, on30Var.d, jG, false, z, zO, zN);
    }

    public final boolean n(bmq0 bmq0Var, vn30 vn30Var, boolean z) {
        int iB = bmq0Var.b(vn30Var.f37698a);
        amq0 amq0Var = this.f27266a;
        int i = bmq0Var.f(iB, amq0Var, false).c;
        Timeline$Window timeline$Window = this.b;
        return !bmq0Var.m(i, timeline$Window, 0L).h && bmq0Var.d(iB, amq0Var, timeline$Window, this.g, this.h) == -1 && z;
    }

    public final boolean o(bmq0 bmq0Var, vn30 vn30Var) {
        boolean z = !vn30Var.c() && vn30Var.e == -1;
        Object obj = vn30Var.f37698a;
        if (z) {
            if (bmq0Var.m(bmq0Var.g(obj, this.f27266a).c, this.b, 0L).n == bmq0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        nn30 nn30Var = this.m;
        if (nn30Var == null || nn30Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                nn30 nn30Var2 = (nn30) this.q.get(i);
                if (!nn30Var2.h()) {
                    this.m = nn30Var2;
                    return;
                }
            }
        }
    }

    public final void q() {
        nn30 nn30Var;
        u3x u3xVarL = b4x.l();
        for (nn30 nn30Var2 = this.i; nn30Var2 != null; nn30Var2 = nn30Var2.m) {
            u3xVarL.b(nn30Var2.g.f25528a);
        }
        nn30[] nn30VarArr = this.j;
        this.d.e(new b1(this, u3xVarL, (nn30VarArr.length == 0 || (nn30Var = nn30VarArr[0]) == null) ? null : nn30Var.g.f25528a, (byte) 21));
    }

    public final void r(long j) {
        nn30 nn30Var = this.l;
        if (nn30Var != null) {
            x0x.K(nn30Var.m == null);
            if (nn30Var.e) {
                nn30Var.f23800a.v(j - nn30Var.p);
            }
        }
    }

    public final int s(nn30 nn30Var) {
        nn30[] nn30VarArr;
        nn30[] nn30VarArr2;
        nn30Var.getClass();
        if (nn30Var == this.l) {
            return 0;
        }
        this.l = nn30Var;
        int i = 0;
        while (true) {
            nn30Var = nn30Var.m;
            if (nn30Var == null) {
                break;
            }
            int i2 = 0;
            while (true) {
                nn30VarArr = this.j;
                int length = nn30VarArr.length;
                nn30VarArr2 = this.k;
                if (i2 >= length) {
                    break;
                }
                if (nn30Var == nn30VarArr[i2]) {
                    nn30 nn30Var2 = this.i;
                    nn30VarArr[i2] = nn30Var2;
                    nn30VarArr2[i2] = nn30Var2;
                    i = 3;
                }
                i2++;
            }
            for (int i3 = 0; i3 < nn30VarArr2.length; i3++) {
                if (nn30Var == nn30VarArr2[i3]) {
                    nn30VarArr2[i3] = nn30VarArr[i3];
                    i |= 2;
                }
            }
            nn30Var.i();
            this.n--;
        }
        nn30 nn30Var3 = this.l;
        nn30Var3.getClass();
        if (nn30Var3.m != null) {
            nn30Var3.b();
            nn30Var3.m = null;
            nn30Var3.c();
        }
        q();
        return i;
    }

    public final vn30 u(yx90 yx90Var, bmq0 bmq0Var, Object obj, long j, boolean z, boolean z2) {
        long jV;
        int iB;
        amq0 amq0Var = this.f27266a;
        int i = bmq0Var.g(obj, amq0Var).c;
        Object obj2 = this.o;
        boolean z3 = false;
        if (obj2 == null || (iB = bmq0Var.b(obj2)) == -1 || bmq0Var.f(iB, amq0Var, false).c != i) {
            nn30 nn30Var = this.i;
            while (true) {
                if (nn30Var == null) {
                    nn30 nn30Var2 = this.i;
                    while (true) {
                        if (nn30Var2 != null) {
                            int iB2 = bmq0Var.b(nn30Var2.b);
                            if (iB2 != -1 && bmq0Var.f(iB2, amq0Var, false).c == i) {
                                jV = nn30Var2.g.f25528a.d;
                                break;
                            }
                            nn30Var2 = nn30Var2.m;
                        } else {
                            jV = v(obj);
                            if (jV != -1) {
                                break;
                            }
                            jV = this.f;
                            this.f = 1 + jV;
                            if (this.i != null) {
                                break;
                            }
                            this.o = obj;
                            this.p = jV;
                            break;
                        }
                    }
                } else {
                    if (nn30Var.b.equals(obj)) {
                        jV = nn30Var.g.f25528a.d;
                        break;
                    }
                    nn30Var = nn30Var.m;
                }
            }
        } else {
            jV = this.p;
        }
        Timeline$Window timeline$Window = this.b;
        if (!z && !z2) {
            vn30 vn30Var = yx90Var.b;
            long j2 = jV;
            vn30 vn30VarT = t(bmq0Var, obj, j, j2, timeline$Window, amq0Var);
            if (vn30Var.c() && vn30Var.equals(vn30VarT)) {
                return vn30Var;
            }
            bmq0Var.g(obj, amq0Var);
            return new vn30(obj, amq0Var.b(j), j2);
        }
        Object obj3 = obj;
        long j3 = jV;
        bmq0Var.g(obj3, amq0Var);
        bmq0Var.n(amq0Var.c, timeline$Window);
        int iB3 = bmq0Var.b(obj);
        boolean z4 = false;
        while (iB3 >= timeline$Window.m) {
            bmq0Var.f(iB3, amq0Var, true);
            boolean z5 = uo.c.f35986a <= 0 ? z3 : true;
            z4 |= z5;
            Timeline$Window timeline$Window2 = timeline$Window;
            if (amq0Var.c(amq0Var.d) != -1) {
                obj3 = amq0Var.b;
                obj3.getClass();
            }
            if (z4 && (!z5 || amq0Var.d != 0)) {
                timeline$Window = timeline$Window2;
                break;
            }
            iB3--;
            z3 = false;
            timeline$Window = timeline$Window2;
        }
        vn30 vn30VarT2 = t(bmq0Var, obj3, j, j3, timeline$Window, amq0Var);
        Object obj4 = vn30VarT2.f37698a;
        int i2 = vn30VarT2.b;
        if (i2 != -1 && !z) {
            bmq0Var.g(obj4, amq0Var);
            uo.c.a(i2).getClass();
            if (0 != j) {
                return new vn30(obj4, amq0Var.b(j), vn30VarT2.d);
            }
        }
        return vn30VarT2;
    }

    public final long v(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            nn30 nn30Var = (nn30) this.q.get(i);
            if (nn30Var.b.equals(obj)) {
                return nn30Var.g.f25528a.d;
            }
        }
        return -1L;
    }

    public final int w(bmq0 bmq0Var) {
        bmq0 bmq0Var2;
        nn30 nn30Var;
        nn30 nn30Var2 = this.i;
        if (nn30Var2 == null) {
            return 0;
        }
        int iB = bmq0Var.b(nn30Var2.b);
        while (true) {
            bmq0Var2 = bmq0Var;
            iB = bmq0Var2.d(iB, this.f27266a, this.b, this.g, this.h);
            while (true) {
                nn30Var = nn30Var2.m;
                if (nn30Var == null || nn30Var2.g.g) {
                    break;
                }
                nn30Var2 = nn30Var;
            }
            if (iB == -1 || nn30Var == null || bmq0Var2.b(nn30Var.b) != iB) {
                break;
            }
            nn30Var2 = nn30Var;
            bmq0Var = bmq0Var2;
        }
        int iS = s(nn30Var2);
        nn30Var2.g = l(bmq0Var2, nn30Var2.g);
        return iS;
    }

    public final int x(bmq0 bmq0Var, long j, long[] jArr, long[] jArr2) {
        long j2;
        int i;
        on30 on30VarB;
        nn30 nn30Var = null;
        for (nn30 nn30Var2 = this.i; nn30Var2 != null; nn30Var2 = nn30Var2.m) {
            on30 on30Var = nn30Var2.g;
            vn30 vn30Var = on30Var.f25528a;
            if (nn30Var != null) {
                on30 on30VarE = e(bmq0Var, nn30Var, j);
                if (on30VarE != null) {
                    long j3 = on30VarE.b;
                    long j4 = on30Var.c;
                    j2 = -9223372036854775807L;
                    long j5 = on30Var.b;
                    i = 0;
                    if (vn30Var.equals(on30VarE.f25528a)) {
                        if (j5 != j3) {
                            if (j4 != -9223372036854775807L) {
                                long j6 = on30VarE.c;
                                if (j6 != -9223372036854775807L) {
                                    if (Math.abs((j3 - j6) - (j5 - j4)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        on30VarB = j5 != j3 ? on30VarE.b(j5, j4) : on30VarE;
                    }
                }
                return s(nn30Var);
            }
            on30VarB = l(bmq0Var, on30Var);
            j2 = -9223372036854775807L;
            i = 0;
            long j7 = on30Var.d;
            long j8 = on30Var.e;
            on30 on30VarA = on30VarB.a(j7);
            nn30Var2.g = on30VarA;
            long j9 = on30VarB.e;
            if (j8 != j9) {
                long j10 = j9 == j2 ? Long.MAX_VALUE : j9 + nn30Var2.p;
                int i2 = (on30VarA.f || !m(this.j, jArr, nn30Var2, j10)) ? i : 1;
                boolean zM = m(this.k, jArr2, nn30Var2, j10);
                int iS = s(nn30Var2);
                if (iS != 0) {
                    return iS;
                }
                int i3 = (i2 == 0 || (j8 == j2 && vn30Var.e == -1)) ? i : 1;
                return zM ? i3 | 2 : i3;
            }
            nn30Var = nn30Var2;
        }
        return 0;
    }
}
