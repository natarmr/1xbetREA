package a;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y3c0 implements mn30, huo, iq00, lq00, gxg0 {
    public static final Map u1;
    public static final androidx.media3.common.b v1;
    public z220 A;
    public fvh0 B;
    public long Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f41945a;
    public final jbj b;
    public final cil c;
    public final x860 d;
    public final zhl e;
    public final zhl f;
    public int f1;
    public final b4c0 g;
    public final lhf0 h;
    public boolean h1;
    public boolean i1;
    public final androidx.media3.common.b j;
    public boolean j1;
    public final long k;
    public boolean k1;
    public final lhf0 l;
    public int l1;
    public final oif0 m;
    public final ArrayList m1;
    public final brd n;
    public boolean n1;
    public final s3c0 o;
    public long o1;
    public final s3c0 p;
    public long p1;
    public final Handler q;
    public boolean q1;
    public ln30 r;
    public int r1;
    public axw s;
    public boolean s1;
    public u3c0[] t;
    public boolean t1;
    public hxg0[] u;
    public x3c0[] v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final long i = 1048576;
    public final long g1 = Long.MIN_VALUE;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        u1 = Collections.unmodifiableMap(map);
        awq awqVar = new awq();
        awqVar.f1587a = "icy";
        awqVar.o = mg40.n("application/x-icy");
        v1 = new androidx.media3.common.b(awqVar);
    }

    public y3c0(Uri uri, jbj jbjVar, oif0 oif0Var, cil cilVar, zhl zhlVar, x860 x860Var, zhl zhlVar2, b4c0 b4c0Var, lhf0 lhf0Var, androidx.media3.common.b bVar, long j, gff0 gff0Var) {
        this.f41945a = uri;
        this.b = jbjVar;
        this.c = cilVar;
        this.f = zhlVar;
        this.d = x860Var;
        this.e = zhlVar2;
        this.g = b4c0Var;
        this.h = lhf0Var;
        this.j = bVar;
        this.l = gff0Var != null ? new lhf0(gff0Var) : new lhf0("ProgressiveMediaPeriod", (byte) 1);
        this.m = oif0Var;
        this.k = j;
        this.n = new brd();
        this.o = new s3c0(this, (byte) 1);
        this.p = new s3c0(this, (byte) 2);
        this.q = vtt0.n(null);
        this.v = new x3c0[0];
        this.u = new hxg0[0];
        this.t = new u3c0[0];
        this.m1 = new ArrayList();
        this.p1 = -9223372036854775807L;
        this.f1 = 1;
    }

    public final boolean A() {
        return this.p1 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        ed40 ed40VarA;
        char c;
        long j = this.k;
        if (this.t1 || this.x || !this.w || this.B == null) {
            return;
        }
        char c2 = 0;
        for (hxg0 hxg0Var : this.u) {
            if (hxg0Var.r() == null) {
                return;
            }
        }
        brd brdVar = this.n;
        synchronized (brdVar) {
            brdVar.b = false;
        }
        int length = this.u.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c3 = 1;
            if (i2 >= length) {
                break;
            }
            androidx.media3.common.b bVarR = this.u[i2].r();
            bVarR.getClass();
            int iH = mg40.h(bVarR.p);
            if (iH == 1) {
                c = 3;
            } else if (iH == 2) {
                c = 4;
            } else if (iH != 3) {
                c = iH != 4 ? (char) 0 : (char) 2;
            } else {
                c = 1;
            }
            if (i == 1) {
                c3 = 3;
            } else if (i == 2) {
                c3 = 4;
            } else if (i != 3) {
                c3 = i != 4 ? (char) 0 : (char) 2;
            }
            if (c > c3) {
                i3 = i2;
                i = iH;
            }
            i2++;
        }
        ccs0[] ccs0VarArr = new ccs0[length];
        boolean[] zArr = new boolean[length];
        int i4 = 0;
        while (i4 < length) {
            androidx.media3.common.b bVarR2 = this.u[i4].r();
            bVarR2.getClass();
            String str = bVarR2.p;
            boolean zI = mg40.i(str);
            boolean z = (zI || mg40.m(str)) ? true : c2;
            zArr[i4] = z;
            char c4 = c2;
            this.y = (this.y ? 1 : 0) | (z ? 1 : 0);
            this.z = (j != -9223372036854775807L && length == 1 && mg40.k(str)) ? 1 : c4;
            axw axwVar = this.s;
            if (axwVar != null) {
                int i5 = axwVar.f1641a;
                if (zI || this.v[i4].b) {
                    ed40 ed40Var = bVarR2.m;
                    if (ed40Var == null) {
                        cd40[] cd40VarArr = new cd40[1];
                        cd40VarArr[c4] = axwVar;
                        ed40VarA = new ed40(cd40VarArr);
                    } else {
                        cd40[] cd40VarArr2 = new cd40[1];
                        cd40VarArr2[c4] = axwVar;
                        ed40VarA = ed40Var.a(cd40VarArr2);
                    }
                    awq awqVarA = bVarR2.a();
                    awqVarA.l = ed40VarA;
                    bVarR2 = new androidx.media3.common.b(awqVarA);
                }
                if (zI && bVarR2.i == -1 && bVarR2.j == -1 && i5 != -1) {
                    awq awqVarA2 = bVarR2.a();
                    awqVarA2.i = i5;
                    bVarR2 = new androidx.media3.common.b(awqVarA2);
                }
            }
            int iD = this.c.d(bVarR2);
            awq awqVarA3 = bVarR2.a();
            awqVarA3.S = iD;
            androidx.media3.common.b bVar = new androidx.media3.common.b(awqVarA3);
            if (i4 != i3) {
                awq awqVarA4 = bVar.a();
                awqVarA4.m = Integer.toString(i3);
                bVar = new androidx.media3.common.b(awqVarA4);
            }
            ccs0VarArr[i4] = new ccs0(Integer.toString(i4), bVar);
            this.u[i4].A(this.g1);
            i4++;
            c2 = c4;
        }
        this.A = new z220(new dcs0(ccs0VarArr), zArr);
        if (this.z && this.Y == -9223372036854775807L) {
            this.Y = j;
            this.B = new t3c0(this, this.B);
        }
        this.g.t(this.Y, this.B, this.Z);
        this.x = true;
        ln30 ln30Var = this.r;
        ln30Var.getClass();
        ln30Var.f(this);
    }

    public final void C(int i) {
        x();
        z220 z220Var = this.A;
        boolean[] zArr = (boolean[]) z220Var.e;
        if (zArr[i]) {
            return;
        }
        androidx.media3.common.b bVar = ((dcs0) z220Var.b).a(i).d[0];
        zhl zhlVar = this.e;
        zhlVar.a(new uq((Object) zhlVar, (Object) new in30(1, mg40.h(bVar.p), bVar, 0, null, vtt0.Y(this.o1), -9223372036854775807L), (byte) 20));
        zArr[i] = true;
    }

    public final void D(int i) {
        x();
        if (this.q1) {
            if ((!this.y || ((boolean[]) this.A.c)[i]) && !this.u[i].s(false)) {
                this.p1 = 0L;
                this.q1 = false;
                this.i1 = true;
                this.o1 = 0L;
                this.r1 = 0;
                for (hxg0 hxg0Var : this.u) {
                    hxg0Var.x(false);
                }
                ln30 ln30Var = this.r;
                ln30Var.getClass();
                ln30Var.a(this);
            }
        }
    }

    public final ncs0 E(x3c0 x3c0Var) {
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            if (x3c0Var.equals(this.v[i])) {
                return this.u[i];
            }
        }
        if (this.w) {
            f1t0.g0("ProgressiveMediaPeriod", "Extractor added new track (id=" + x3c0Var.f40212a + ") after finishing tracks.");
            return new pnk();
        }
        hxg0 hxg0Var = new hxg0(this.h, this.c, this.f);
        u3c0 u3c0Var = new u3c0(hxg0Var);
        hxg0Var.f = this;
        int i2 = length + 1;
        x3c0[] x3c0VarArr = (x3c0[]) Arrays.copyOf(this.v, i2);
        x3c0VarArr[length] = x3c0Var;
        String str = vtt0.f38024a;
        this.v = x3c0VarArr;
        hxg0[] hxg0VarArr = (hxg0[]) Arrays.copyOf(this.u, i2);
        hxg0VarArr[length] = hxg0Var;
        this.u = hxg0VarArr;
        u3c0[] u3c0VarArr = (u3c0[]) Arrays.copyOf(this.t, i2);
        u3c0VarArr[length] = u3c0Var;
        this.t = u3c0VarArr;
        return u3c0Var;
    }

    public final void F(fvh0 fvh0Var) {
        this.B = this.s == null ? fvh0Var : new ca5(-9223372036854775807L);
        this.Y = fvh0Var.g();
        boolean z = !this.n1 && fvh0Var.g() == -9223372036854775807L;
        this.Z = z;
        this.f1 = z ? 7 : 1;
        if (this.x) {
            this.g.t(this.Y, fvh0Var, z);
        } else {
            B();
        }
    }

    public final void G() {
        v3c0 v3c0Var = new v3c0(this, this.f41945a, this.b, this.m, this, this.n);
        if (this.x) {
            x0x.K(A());
            long j = this.g1;
            if (j == Long.MIN_VALUE) {
                j = this.Y;
            }
            if (j != -9223372036854775807L && this.p1 > j) {
                this.s1 = true;
                this.p1 = -9223372036854775807L;
                return;
            }
            fvh0 fvh0Var = this.B;
            fvh0Var.getClass();
            long j2 = fvh0Var.b(this.p1).f8467a.b;
            long j3 = this.p1;
            v3c0Var.g.f22363a = j2;
            v3c0Var.j = j3;
            v3c0Var.i = true;
            v3c0Var.m = false;
            for (hxg0 hxg0Var : this.u) {
                hxg0Var.t = this.p1;
            }
            this.p1 = -9223372036854775807L;
        }
        this.r1 = y();
        this.l.J(v3c0Var, this, this.d.e(this.f1));
    }

    public final boolean H() {
        return this.i1 || A();
    }

    @Override // a.iq00
    public final void a(kq00 kq00Var, long j, long j2, int i) {
        v3c0 v3c0Var = (v3c0) kq00Var;
        enm0 enm0Var = v3c0Var.c;
        vn00 vn00Var = new vn00(v3c0Var.f36726a, v3c0Var.k, j);
        if (i != 0) {
            vn00Var.f = enm0Var.c;
            vn00Var.g = enm0Var.d;
            vn00Var.c = j2;
            vn00Var.d = enm0Var.b;
        }
        this.e.f(new wn00(vn00Var), 1, -1, null, 0, null, v3c0Var.j, this.Y, i);
    }

    @Override // a.hgi0
    public final long b() {
        return s();
    }

    @Override // a.mn30
    public final long c(long j, gvh0 gvh0Var) {
        x();
        if (!this.B.d()) {
            return 0L;
        }
        evh0 evh0VarB = this.B.b(j);
        return gvh0Var.a(j, evh0VarB.f8467a.f13726a, evh0VarB.b.f13726a);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6 A[LOOP:2: B:60:0x00d4->B:61:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee A[LOOP:3: B:65:0x00ec->B:66:0x00ee, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x00d1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x00e4, please report this as an issue */
    @Override // a.mn30
    public final long d(long j) {
        int i;
        int i2;
        long j2;
        int i3;
        Iterator it = this.m1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t340 t340Var = (t340) it.next();
            t340Var.e.clear();
            t340Var.g = null;
            t340Var.h = -9223372036854775807L;
            t340Var.i = false;
            t340Var.j = false;
            t340Var.d.v();
        }
        x();
        boolean[] zArr = (boolean[]) this.A.c;
        if (!this.B.d()) {
            j = 0;
        }
        this.i1 = false;
        boolean z = this.o1 == j;
        this.o1 = j;
        if (A()) {
            this.p1 = j;
            return j;
        }
        if (this.f1 == 7 || !(this.s1 || this.l.C())) {
            this.q1 = false;
            this.p1 = j;
            this.s1 = false;
            this.j1 = false;
            if (this.l.C()) {
                this.l.d = null;
                for (hxg0 hxg0Var : this.u) {
                    hxg0Var.x(false);
                }
                break;
            }
            for (hxg0 hxg0Var2 : this.u) {
                hxg0Var2.j();
            }
            this.l.a();
            return j;
        }
        int length = this.u.length;
        for (int i4 = 0; i4 < length; i4++) {
            hxg0 hxg0Var3 = this.u[i4];
            if (!this.t[i4].d.get()) {
                if (this.z) {
                    hxg0Var3.y(hxg0Var3.q);
                } else {
                    synchronized (hxg0Var3) {
                        j2 = hxg0Var3.p == 0 ? Long.MIN_VALUE : hxg0Var3.n[hxg0Var3.r];
                    }
                    if (j2 != Long.MIN_VALUE && j <= j2 && (i3 = hxg0Var3.q) == 0 && z) {
                        hxg0Var3.y(i3);
                    } else if (!hxg0Var3.z(this.s1, j) && (zArr[i4] || !this.y)) {
                        this.q1 = false;
                        this.p1 = j;
                        this.s1 = false;
                        this.j1 = false;
                        if (this.l.C()) {
                            this.l.d = null;
                            while (i2 < r0) {
                                hxg0Var.x(false);
                            }
                            break;
                            break;
                        }
                        while (i < r1) {
                            hxg0Var2.j();
                        }
                        this.l.a();
                        return j;
                    }
                }
            }
        }
        return j;
    }

    @Override // a.hgi0
    public final boolean e() {
        boolean z;
        if (this.s1 || !this.l.C()) {
            return false;
        }
        brd brdVar = this.n;
        synchronized (brdVar) {
            z = brdVar.b;
        }
        return z;
    }

    @Override // a.huo
    public final void f(fvh0 fvh0Var) {
        this.q.post(new oh60(this, fvh0Var, (byte) 13));
    }

    @Override // a.hgi0
    public final boolean g(yq00 yq00Var) {
        if (this.s1) {
            return false;
        }
        lhf0 lhf0Var = this.l;
        if (((IOException) lhf0Var.d) != null || this.q1) {
            return false;
        }
        if ((this.x || this.j != null) && this.l1 == 0) {
            return false;
        }
        boolean zC = this.n.c();
        if (lhf0Var.C()) {
            return zC;
        }
        G();
        return true;
    }

    @Override // a.mn30
    public final long h() {
        if (!this.k1 && this.j1) {
            this.j1 = false;
            return this.o1;
        }
        if (!this.i1) {
            return -9223372036854775807L;
        }
        if (!this.s1 && y() <= this.r1) {
            return -9223372036854775807L;
        }
        this.i1 = false;
        return this.o1;
    }

    @Override // a.lq00
    public final void i() {
        for (hxg0 hxg0Var : this.u) {
            hxg0Var.x(true);
            ivn ivnVar = hxg0Var.h;
            if (ivnVar != null) {
                ivnVar.m(hxg0Var.e);
                hxg0Var.h = null;
                hxg0Var.g = null;
            }
        }
        oif0 oif0Var = this.m;
        fuo fuoVar = (fuo) oif0Var.c;
        if (fuoVar != null) {
            fuoVar.release();
            oif0Var.c = null;
        }
        oif0Var.d = null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    @Override // a.mn30
    public final long j(fmo[] fmoVarArr, boolean[] zArr, ixg0[] ixg0VarArr, boolean[] zArr2, long j) {
        ?? r11;
        boolean z;
        ArrayList arrayList;
        fmo fmoVar;
        Object obj;
        fmo[] fmoVarArr2 = fmoVarArr;
        long jD = j;
        x();
        z220 z220Var = this.A;
        dcs0 dcs0Var = (dcs0) z220Var.b;
        boolean[] zArr3 = (boolean[]) z220Var.d;
        int i = this.l1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            r11 = 1;
            if (i3 >= fmoVarArr2.length) {
                z = false;
                break;
            }
            fmo fmoVar2 = fmoVarArr2[i3];
            if (fmoVar2 != null && Objects.equals(dcs0Var.a(dcs0Var.b(fmoVar2.n())).d[0].p, "application/x-itut-t35")) {
                z = true;
                break;
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            int length = fmoVarArr2.length;
            arrayList = this.m1;
            if (i4 >= length) {
                break;
            }
            ?? r12 = ixg0VarArr[i4];
            if (r12 != 0 && (fmoVarArr2[i4] == null || !zArr[i4] || (z && (r12 instanceof t340)))) {
                if (r12 instanceof t340) {
                    t340 t340Var = (t340) r12;
                    arrayList.remove(t340Var);
                    int i5 = t340Var.f33248a.f38496a;
                    x0x.K(zArr3[i5]);
                    this.l1--;
                    zArr3[i5] = false;
                    int i6 = t340Var.b.f38496a;
                    x0x.K(zArr3[i6]);
                    this.l1--;
                    zArr3[i6] = false;
                } else {
                    int i7 = ((w3c0) r12).f38496a;
                    x0x.K(zArr3[i7]);
                    this.l1--;
                    zArr3[i7] = false;
                }
                ixg0VarArr[i4] = 0;
            }
            i4++;
        }
        boolean z2 = !this.h1 ? jD == 0 || this.z : i != 0;
        int i8 = 0;
        boolean z3 = false;
        while (i8 < fmoVarArr2.length) {
            if (ixg0VarArr[i8] != 0 || (fmoVar = fmoVarArr2[i8]) == null) {
                zArr3 = zArr3;
                dcs0Var = dcs0Var;
            } else {
                x0x.K(fmoVar.length() == r11 ? r11 : i2);
                x0x.K(fmoVar.g(i2) == 0 ? r11 : i2);
                int iB = dcs0Var.b(fmoVar.n());
                x0x.K(!zArr3[iB]);
                boolean z4 = r11;
                this.l1++;
                zArr3[iB] = z4;
                z3 |= fmoVar.r().v;
                int i9 = i2;
                w3c0 w3c0Var = new w3c0(this, iB, fmoVar.r().v);
                if (Build.VERSION.SDK_INT < 37 || z || !mg40.m(fmoVar.r().p)) {
                    obj = w3c0Var;
                    break;
                }
                int i10 = i9;
                while (true) {
                    if (i10 >= dcs0Var.f5860a) {
                        obj = w3c0Var;
                        break;
                    }
                    if (jyc.e(dcs0Var.a(i10).d[i9])) {
                        x0x.K(!zArr3[i10]);
                        this.l1++;
                        zArr3[i10] = z4;
                        t340 t340Var2 = new t340(w3c0Var, new w3c0(this, i10, i9), fmoVar.r());
                        arrayList.add(t340Var2);
                        obj = t340Var2;
                        break;
                    }
                    i10++;
                    i9 = 0;
                }
                ixg0VarArr[i8] = obj;
                zArr2[i8] = z4;
                if (!z2) {
                    hxg0 hxg0Var = this.u[iB];
                    z2 = (hxg0Var.o() == 0 || hxg0Var.z(z4, jD)) ? false : true;
                }
            }
            i8++;
            fmoVarArr2 = fmoVarArr;
            zArr3 = zArr3;
            dcs0Var = dcs0Var;
            i2 = 0;
            r11 = 1;
        }
        if (this.j1 || !this.h1) {
            this.j1 = z3;
        }
        if (this.l1 == 0) {
            this.q1 = false;
            this.i1 = false;
            this.j1 = false;
            lhf0 lhf0Var = this.l;
            if (lhf0Var.C()) {
                for (hxg0 hxg0Var2 : this.u) {
                    hxg0Var2.j();
                }
                lhf0Var.a();
            } else {
                boolean z5 = false;
                this.s1 = false;
                hxg0[] hxg0VarArr = this.u;
                int length2 = hxg0VarArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    hxg0VarArr[i11].x(z5);
                    i11++;
                    z5 = false;
                }
            }
        } else if (z2) {
            jD = d(jD);
            for (int i12 = 0; i12 < ixg0VarArr.length; i12++) {
                ?? r1 = ixg0VarArr[i12];
                if (r1 != 0) {
                    zArr2[i12] = true;
                    if (r1 instanceof t340) {
                        t340 t340Var3 = (t340) r1;
                        t340Var3.e.clear();
                        t340Var3.g = null;
                        t340Var3.h = -9223372036854775807L;
                        t340Var3.i = false;
                        t340Var3.j = false;
                        t340Var3.d.v();
                    }
                }
            }
        }
        this.h1 = true;
        return jD;
    }

    @Override // a.mn30
    public final void k() {
        this.k1 = true;
    }

    @Override // a.mn30
    public final void l() throws IOException {
        int iE = this.d.e(this.f1);
        lhf0 lhf0Var = this.l;
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
        if (this.s1 && !this.x) {
            throw kq80.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // a.mn30
    public final void m(long j) {
        if (this.z) {
            return;
        }
        x();
        if (A()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.A.d;
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            this.u[i].i(zArr[i], j);
        }
    }

    @Override // a.iq00
    public final void n(kq00 kq00Var, long j, long j2, boolean z) {
        v3c0 v3c0Var = (v3c0) kq00Var;
        enm0 enm0Var = v3c0Var.c;
        vn00 vn00Var = new vn00(v3c0Var.f36726a, v3c0Var.k, j);
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        wn00 wn00Var = new wn00(vn00Var);
        this.d.getClass();
        this.e.b(wn00Var, 1, -1, null, 0, null, v3c0Var.j, this.Y);
        if (z) {
            return;
        }
        for (hxg0 hxg0Var : this.u) {
            hxg0Var.x(false);
        }
        if (this.l1 > 0) {
            ln30 ln30Var = this.r;
            ln30Var.getClass();
            ln30Var.a(this);
        }
    }

    @Override // a.huo
    public final void o() {
        this.w = true;
        this.q.post(this.o);
    }

    @Override // a.mn30
    public final dcs0 p() {
        x();
        return (dcs0) this.A.b;
    }

    @Override // a.huo
    public final ncs0 q(int i, int i2) {
        return E(new x3c0(i, false));
    }

    @Override // a.mn30
    public final void r(ln30 ln30Var, long j) {
        this.r = ln30Var;
        androidx.media3.common.b bVar = this.j;
        if (bVar == null) {
            this.n.c();
            G();
        } else {
            q(0, 3).c(bVar);
            F(new e5x(-9223372036854775807L, new long[]{0}, new long[]{0}));
            o();
            this.p1 = j;
        }
    }

    @Override // a.hgi0
    public final long s() {
        long jZ;
        boolean z;
        long j;
        x();
        if (this.s1 || this.l1 == 0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.p1;
        }
        if (this.y) {
            int length = this.u.length;
            jZ = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                z220 z220Var = this.A;
                if (((boolean[]) z220Var.c)[i] && ((boolean[]) z220Var.d)[i]) {
                    hxg0 hxg0Var = this.u[i];
                    synchronized (hxg0Var) {
                        z = hxg0Var.z;
                    }
                    if (z) {
                        continue;
                    } else {
                        hxg0 hxg0Var2 = this.u[i];
                        synchronized (hxg0Var2) {
                            j = hxg0Var2.w;
                        }
                        jZ = Math.min(jZ, j);
                    }
                }
            }
        } else {
            jZ = Long.MAX_VALUE;
        }
        if (jZ == Long.MAX_VALUE) {
            jZ = z(false);
        }
        return jZ == Long.MIN_VALUE ? this.o1 : jZ;
    }

    @Override // a.gxg0
    public final void t() {
        this.q.post(this.o);
    }

    @Override // a.iq00
    public final void u(kq00 kq00Var, long j, long j2) {
        v3c0 v3c0Var = (v3c0) kq00Var;
        if (this.Y == -9223372036854775807L && this.B != null) {
            long jZ = z(true);
            long j3 = jZ == Long.MIN_VALUE ? 0L : jZ + 10000;
            this.Y = j3;
            this.g.t(j3, this.B, this.Z);
        }
        enm0 enm0Var = v3c0Var.c;
        vn00 vn00Var = new vn00(v3c0Var.f36726a, v3c0Var.k, j);
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        wn00 wn00Var = new wn00(vn00Var);
        this.d.getClass();
        this.e.c(wn00Var, 1, -1, null, 0, null, v3c0Var.j, this.Y);
        this.s1 = true;
        ln30 ln30Var = this.r;
        ln30Var.getClass();
        ln30Var.a(this);
    }

    @Override // a.hgi0
    public final void v(long j) {
        boolean z;
        if (this.l1 <= 0 || A()) {
            return;
        }
        boolean z2 = false;
        if (this.g1 != Long.MIN_VALUE) {
            x();
            boolean z3 = true;
            int i = 0;
            while (true) {
                hxg0[] hxg0VarArr = this.u;
                if (i >= hxg0VarArr.length) {
                    break;
                }
                z220 z220Var = this.A;
                if (((boolean[]) z220Var.d)[i] && (((boolean[]) z220Var.c)[i] || !this.y)) {
                    hxg0 hxg0Var = hxg0VarArr[i];
                    synchronized (hxg0Var) {
                        z = hxg0Var.x != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.s1 = true;
        }
    }

    @Override // a.iq00
    public final ejx w(kq00 kq00Var, long j, long j2, IOException iOException, int i) {
        ejx ejxVar;
        fvh0 fvh0Var;
        v3c0 v3c0Var = (v3c0) kq00Var;
        enm0 enm0Var = v3c0Var.c;
        vn00 vn00Var = new vn00(v3c0Var.f36726a, v3c0Var.k, j);
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        wn00 wn00Var = new wn00(vn00Var);
        vtt0.Y(v3c0Var.j);
        vtt0.Y(this.Y);
        long jF = this.d.f(new y78((Object) iOException, i, (byte) 7));
        if (jF == -9223372036854775807L) {
            ejxVar = lhf0.g;
        } else {
            int iY = y();
            int i2 = iY > this.r1 ? 1 : 0;
            if (this.n1 || !((fvh0Var = this.B) == null || fvh0Var.g() == -9223372036854775807L)) {
                this.r1 = iY;
            } else if (!this.x || H()) {
                this.i1 = this.x;
                this.o1 = 0L;
                this.r1 = 0;
                for (hxg0 hxg0Var : this.u) {
                    hxg0Var.x(false);
                }
                v3c0Var.g.f22363a = 0L;
                v3c0Var.j = 0L;
                v3c0Var.i = true;
                v3c0Var.m = false;
            } else {
                this.q1 = true;
                ejxVar = lhf0.f;
            }
            ejxVar = new ejx(i2, jF);
        }
        int i3 = ejxVar.f7928a;
        this.e.d(wn00Var, 1, -1, null, 0, null, v3c0Var.j, this.Y, iOException, !(i3 == 0 || i3 == 1));
        return ejxVar;
    }

    public final void x() {
        x0x.K(this.x);
        this.A.getClass();
        this.B.getClass();
    }

    public final int y() {
        int i = 0;
        for (hxg0 hxg0Var : this.u) {
            i += hxg0Var.q + hxg0Var.p;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long z(boolean z) {
        hxg0 hxg0Var;
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.u.length; i++) {
            if (z) {
                hxg0Var = this.u[i];
                synchronized (hxg0Var) {
                    jMax = Math.max(jMax, hxg0Var.w);
                }
            } else {
                z220 z220Var = this.A;
                z220Var.getClass();
                if (((boolean[]) z220Var.d)[i]) {
                    hxg0Var = this.u[i];
                    synchronized (hxg0Var) {
                    }
                    jMax = Math.max(jMax, hxg0Var.w);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }
}
