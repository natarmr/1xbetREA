package a;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class z6d extends s1 {
    public boolean A1;
    public long B1;
    public boolean C1;
    public Function0 l1;
    public boolean m1;
    public final jy40 n1;
    public final jy40 o1;
    public dpa0 p1;
    public c4m0 q1;
    public c4m0 r1;
    public boolean s1;
    public boolean t1;
    public long u1;
    public boolean v1;
    public x6x w1;
    public c4m0 x1;
    public c4m0 y1;
    public boolean z1;

    public z6d(gy40 gy40Var, Function0 function0, Function0 function1, boolean z) {
        super(gy40Var, null, false, z, null, null, function0);
        this.l1 = function1;
        this.m1 = true;
        int i = f710.f9038a;
        this.n1 = new jy40(6);
        this.o1 = new jy40(6);
        this.u1 = -1L;
        this.B1 = -1L;
    }

    @Override // a.lm40
    public final void T0() {
        t1();
    }

    @Override // a.h7x
    public final void Y(zz2 zz2Var, xoa0 xoa0Var) {
        ArrayList arrayList = (ArrayList) zz2Var.b;
        k1();
        if (this.v && this.z == null) {
            amt amtVar = new amt(this);
            Z0(amtVar);
            this.z = amtVar;
        }
        byte b = 1;
        int i = 0;
        if (xoa0Var != xoa0.b) {
            if (xoa0Var != xoa0.c || this.w1 == null || this.A1) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                x6x x6xVar = (x6x) arrayList.get(i);
                if (x6xVar.i && x6xVar != this.w1) {
                    q1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.w1 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (g7x.v((x6x) arrayList.get(i2))) {
                    x6x x6xVar2 = (x6x) arrayList.get(0);
                    x6xVar2.i = true;
                    this.w1 = x6xVar2;
                    if (this.v) {
                        c4m0 c4m0Var = this.y1;
                        yje yjeVar = null;
                        if (c4m0Var != null && c4m0Var.isActive()) {
                            if (x6xVar2.b - this.B1 < ((wgu0) mbc.R(this, bmd.t)).b()) {
                                this.C1 = true;
                                return;
                            }
                            this.z1 = true;
                            c4m0 c4m0Var2 = this.y1;
                            if (c4m0Var2 != null) {
                                c4m0Var2.cancel(null);
                            }
                            this.y1 = null;
                        }
                        this.A1 = false;
                        i1(x6xVar2);
                        if (this.l1 != null) {
                            this.x1 = qjj.W(N0(), null, null, new y6d(this, yjeVar, b), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.A1) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                x6x x6xVar3 = (x6x) arrayList.get(i3);
                if (!x6xVar3.h || x6xVar3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((x6x) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            x6x x6xVar4 = (x6x) arrayList.get(0);
            x6xVar4.i = true;
            long j = x6xVar4.b;
            x6x x6xVar5 = this.w1;
            x6xVar5.getClass();
            r1(j, x6xVar5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            x6x x6xVar6 = (x6x) arrayList.get(i4);
            if (x6xVar6.i || !x6xVar6.h || x6xVar6.d) {
                float fH = ((wgu0) mbc.R(this, bmd.t)).h();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    x6x x6xVar7 = (x6x) arrayList.get(i5);
                    long j2 = x6xVar7.c;
                    x6x x6xVar8 = this.w1;
                    x6xVar8.getClass();
                    boolean z = Math.abs(ne60.d(ne60.e(j2, x6xVar8.c))) > fH;
                    if (x6xVar7.i || z) {
                        q1(true);
                        return;
                    }
                }
                return;
            }
        }
        x6x x6xVar9 = (x6x) arrayList.get(0);
        x6xVar9.i = true;
        long j3 = x6xVar9.b;
        x6x x6xVar10 = this.w1;
        x6xVar10.getClass();
        r1(j3, x6xVar10);
    }

    @Override // a.s1
    public final void c1(abi0 abi0Var) {
        if (this.l1 != null) {
            h8a h8aVar = new h8a(this, (byte) 23);
            iiy[] iiyVarArr = yai0.f42300a;
            abi0Var.b(mai0.c, new m6(null, h8aVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.s1, a.gpa0
    public final void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        super.h(woa0Var, xoa0Var, j);
        Object[] objArr = 0;
        if (xoa0Var != xoa0.b) {
            if (xoa0Var != xoa0.c || this.p1 == null || this.t1) {
                return;
            }
            List list = woa0Var.f39485a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dpa0 dpa0Var = (dpa0) list.get(i);
                if (dpa0Var.c() && dpa0Var != this.p1) {
                    q1(false);
                    return;
                }
            }
            return;
        }
        yje yjeVar = null;
        if (this.p1 == null) {
            if (tto0.e(woa0Var, true)) {
                dpa0 dpa0Var2 = (dpa0) woa0Var.f39485a.get(0);
                dpa0Var2.a();
                this.p1 = dpa0Var2;
                if (this.v) {
                    c4m0 c4m0Var = this.r1;
                    if (c4m0Var != null && c4m0Var.isActive()) {
                        if (dpa0Var2.b - this.u1 < ((wgu0) mbc.R(this, bmd.t)).b()) {
                            this.v1 = true;
                            return;
                        }
                        this.s1 = true;
                        c4m0 c4m0Var2 = this.r1;
                        if (c4m0Var2 != null) {
                            c4m0Var2.cancel(null);
                        }
                        this.r1 = null;
                    }
                    this.t1 = false;
                    j1(dpa0Var2);
                    if (this.l1 != null) {
                        this.q1 = qjj.W(N0(), null, null, new y6d(this, yjeVar, objArr == true ? 1 : 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Object[] objArr2 = woa0Var.c == 2;
        List list2 = woa0Var.f39485a;
        if (objArr2 != false && !this.t1 && this.v && this.l1 != null) {
            c4m0 c4m0Var3 = this.q1;
            if (c4m0Var3 != null) {
                c4m0Var3.cancel(null);
            }
            this.q1 = null;
            Function0 function0 = this.l1;
            if (function0 != null) {
                function0.invoke();
            }
            if (this.m1) {
                ((tv90) ((omv) mbc.R(this, bmd.l))).a(0);
            }
            this.t1 = true;
        }
        if (this.t1) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!x2x.L((dpa0) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((dpa0) list2.get(i3)).a();
                    }
                    return;
                }
            }
            dpa0 dpa0Var3 = (dpa0) list2.get(0);
            dpa0Var3.a();
            long j2 = dpa0Var3.b;
            dpa0 dpa0Var4 = this.p1;
            dpa0Var4.getClass();
            s1(j2, dpa0Var4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!x2x.K((dpa0) list2.get(i4))) {
                long jF1 = f1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    dpa0 dpa0Var5 = (dpa0) list2.get(i5);
                    if (dpa0Var5.c() || x2x.h0(dpa0Var5, j, jF1)) {
                        q1(false);
                        return;
                    }
                }
                return;
            }
        }
        dpa0 dpa0Var6 = (dpa0) list2.get(0);
        dpa0Var6.a();
        long j3 = dpa0Var6.b;
        dpa0 dpa0Var7 = this.p1;
        dpa0Var7.getClass();
        s1(j3, dpa0Var7);
    }

    @Override // a.s1
    public final void l1() {
        t1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // a.s1
    public final boolean m1(KeyEvent keyEvent) {
        boolean z;
        long jC = n7x.C(keyEvent);
        yje yjeVar = null;
        if (this.l1 != null) {
            jy40 jy40Var = this.n1;
            if (jy40Var.d(jC) == null) {
                jy40Var.g(qjj.W(N0(), null, null, new y6d(this, yjeVar, (byte) 2), 3), jC);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // a.gpa0
    public final void n0() {
        rsw rswVar;
        gy40 gy40Var = this.q;
        if (gy40Var != null && (rswVar = this.Z) != null) {
            gy40Var.b(new ssw(rswVar));
        }
        this.Z = null;
        q1(false);
    }

    @Override // a.s1
    public final void n1(KeyEvent keyEvent) {
        long jC = n7x.C(keyEvent);
        jy40 jy40Var = this.n1;
        boolean z = false;
        if (jy40Var.d(jC) != null) {
            bby bbyVar = (bby) jy40Var.d(jC);
            if (bbyVar != null) {
                if (bbyVar.isActive()) {
                    bbyVar.cancel(null);
                } else {
                    z = true;
                }
            }
            jy40Var.f(jC);
        }
        if (z) {
            return;
        }
        o1();
    }

    public final void q1(boolean z) {
        if (z) {
            this.w1 = null;
            c4m0 c4m0Var = this.x1;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.x1 = null;
            c4m0 c4m0Var2 = this.y1;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            this.y1 = null;
            this.z1 = false;
            this.A1 = false;
            this.B1 = -1L;
            this.C1 = false;
        } else {
            this.p1 = null;
            c4m0 c4m0Var3 = this.q1;
            if (c4m0Var3 != null) {
                c4m0Var3.cancel(null);
            }
            this.q1 = null;
            c4m0 c4m0Var4 = this.r1;
            if (c4m0Var4 != null) {
                c4m0Var4.cancel(null);
            }
            this.r1 = null;
            this.s1 = false;
            this.t1 = false;
            this.u1 = -1L;
            this.v1 = false;
        }
        g1(z);
    }

    public final void r1(long j, x6x x6xVar) {
        if (this.v && !this.C1) {
            h1(true, x6xVar.c);
            this.B1 = j;
            if (!this.A1 && !this.z1) {
                o1();
            }
        }
        this.w1 = null;
        this.C1 = false;
        this.z1 = false;
        c4m0 c4m0Var = this.x1;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.x1 = null;
        this.A1 = false;
    }

    public final void s1(long j, dpa0 dpa0Var) {
        if (this.v && !this.v1) {
            h1(false, dpa0Var.c);
            this.u1 = j;
            if (!this.t1 && !this.s1) {
                o1();
            }
        }
        this.p1 = null;
        this.v1 = false;
        this.s1 = false;
        c4m0 c4m0Var = this.q1;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.q1 = null;
        this.t1 = false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    public final void t1() {
        char c;
        long j;
        long j2;
        jy40 jy40Var = this.n1;
        Object[] objArr = jy40Var.c;
        long[] jArr = jy40Var.f17342a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((bby) objArr[(i << 3) + i3]).cancel(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        jy40Var.a();
        jy40 jy40Var2 = this.o1;
        Object[] objArr2 = jy40Var2.c;
        long[] jArr2 = jy40Var2.f17342a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((x6d) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        jy40Var2.a();
    }

    @Override // a.h7x
    public final void z0() {
        q1(true);
    }
}
