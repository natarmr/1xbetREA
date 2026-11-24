package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class htc extends s1 {
    public dpa0 l1;
    public x6x m1;

    @Override // a.h7x
    public final void Y(zz2 zz2Var, xoa0 xoa0Var) {
        ArrayList arrayList = (ArrayList) zz2Var.b;
        k1();
        if (this.v && this.z == null) {
            amt amtVar = new amt(this);
            Z0(amtVar);
            this.z = amtVar;
        }
        if (xoa0Var != xoa0.b) {
            if (xoa0Var == xoa0.c) {
                if (this.m1 != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        x6x x6xVar = (x6x) arrayList.get(i);
                        if (x6xVar.i && x6xVar != this.m1) {
                            q1(true);
                            break;
                        }
                    }
                }
                if (Intrinsics.d(this.A, "recognized")) {
                    this.A = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.m1 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (g7x.v((x6x) arrayList.get(i2))) {
                    x6x x6xVar2 = (x6x) arrayList.get(0);
                    x6xVar2.i = true;
                    this.m1 = x6xVar2;
                    if (this.v) {
                        this.A = "waiting";
                        i1(x6xVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            x6x x6xVar3 = (x6x) arrayList.get(i3);
            if (x6xVar3.i || !x6xVar3.h || x6xVar3.d) {
                float fH = ((wgu0) mbc.R(this, bmd.t)).h();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    x6x x6xVar4 = (x6x) arrayList.get(i4);
                    long j = x6xVar4.c;
                    x6x x6xVar5 = this.m1;
                    x6xVar5.getClass();
                    boolean z = Math.abs(ne60.d(ne60.e(j, x6xVar5.c))) > fH;
                    if (x6xVar4.i || z) {
                        q1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((x6x) arrayList.get(0)).i = true;
        if (this.v) {
            this.A = "recognized";
            x6x x6xVar6 = this.m1;
            x6xVar6.getClass();
            h1(true, x6xVar6.c);
            o1();
        }
        this.m1 = null;
    }

    @Override // a.s1, a.gpa0
    public final void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        super.h(woa0Var, xoa0Var, j);
        if (xoa0Var != xoa0.b) {
            if (xoa0Var == xoa0.c) {
                if (this.l1 != null) {
                    List list = woa0Var.f39485a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        dpa0 dpa0Var = (dpa0) list.get(i);
                        if (dpa0Var.c() && dpa0Var != this.l1) {
                            q1(false);
                            break;
                        }
                    }
                }
                if (Intrinsics.d(this.A, "recognized")) {
                    this.A = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.l1 == null) {
            if (tto0.e(woa0Var, true)) {
                dpa0 dpa0Var2 = (dpa0) woa0Var.f39485a.get(0);
                dpa0Var2.a();
                this.l1 = dpa0Var2;
                if (this.v) {
                    this.A = "waiting";
                    j1(dpa0Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = woa0Var.f39485a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!x2x.K((dpa0) list2.get(i2))) {
                long jF1 = f1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    dpa0 dpa0Var3 = (dpa0) list2.get(i3);
                    if (dpa0Var3.c() || x2x.h0(dpa0Var3, j, jF1)) {
                        q1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((dpa0) list2.get(0)).a();
        if (this.v) {
            this.A = "recognized";
            dpa0 dpa0Var4 = this.l1;
            dpa0Var4.getClass();
            h1(false, dpa0Var4.c);
            o1();
        }
        this.l1 = null;
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

    public final void q1(boolean z) {
        if (z) {
            this.m1 = null;
        } else {
            this.l1 = null;
        }
        g1(z);
        this.A = "idle";
    }

    @Override // a.h7x
    public final void z0() {
        q1(true);
    }
}
