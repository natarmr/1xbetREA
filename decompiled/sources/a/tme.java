package a;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tme implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ djz f34190a;
    public final /* synthetic */ k7q0 b;
    public final /* synthetic */ rhv0 c;
    public final /* synthetic */ vne d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ a8q0 f;
    public final /* synthetic */ qe60 g;
    public final /* synthetic */ w6k h;
    public final /* synthetic */ d39 i;
    public final /* synthetic */ int j;

    public tme(djz djzVar, k7q0 k7q0Var, rhv0 rhv0Var, vne vneVar, Function1 function1, a8q0 a8q0Var, qe60 qe60Var, w6k w6kVar, d39 d39Var, int i) {
        this.f34190a = djzVar;
        this.b = k7q0Var;
        this.c = rhv0Var;
        this.d = vneVar;
        this.e = function1;
        this.f = a8q0Var;
        this.g = qe60Var;
        this.h = w6kVar;
        this.i = d39Var;
        this.j = i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:98:0x02bb  */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        a9q0 a9q0Var;
        int iK;
        w5z w5zVar;
        a9q0 a9q0Var2;
        a9q0 a9q0Var3;
        w5z w5zVar2;
        tme tmeVar;
        djz djzVar;
        z8q0 z8q0Var;
        djz djzVar2 = this.f34190a;
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            b9q0 b9q0VarD = djzVar2.d();
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            a9q0 a9q0Var4 = b9q0VarD != null ? b9q0VarD.f2224a : null;
            hhk hhkVar = djzVar2.f6209a;
            k6z layoutDirection = vj30Var.getLayoutDirection();
            boolean z = hhkVar.f13068a;
            int iD = Integer.MAX_VALUE;
            if (a9q0Var4 != null) {
                bw40 bw40Var = a9q0Var4.b;
                z8q0 z8q0Var2 = a9q0Var4.f491a;
                j83 j83Var = (j83) hhkVar.b;
                y9q0 y9q0Var = (y9q0) hhkVar.c;
                List list2 = (List) hhkVar.f;
                w6k w6kVar = (w6k) hhkVar.d;
                mrq mrqVar = (mrq) hhkVar.e;
                if (bw40Var.f3309a.b()) {
                    a9q0Var = a9q0Var4;
                } else {
                    j83 j83Var2 = z8q0Var2.f43981a;
                    a9q0 a9q0Var5 = a9q0Var4;
                    long j2 = z8q0Var2.j;
                    if (Intrinsics.d(j83Var2, j83Var) && z8q0Var2.b.c(y9q0Var) && Intrinsics.d(z8q0Var2.c, list2) && z8q0Var2.d == Integer.MAX_VALUE && z8q0Var2.e == z && z8q0Var2.f == 1 && Intrinsics.d(z8q0Var2.g, w6kVar) && z8q0Var2.h == layoutDirection && Intrinsics.d(z8q0Var2.i, mrqVar) && p4e.k(j) == p4e.k(j2) && (!z || (p4e.i(j) == p4e.i(j2) && p4e.h(j) == p4e.h(j2)))) {
                        a9q0Var3 = new a9q0(new z8q0(z8q0Var2.f43981a, (y9q0) hhkVar.c, z8q0Var2.c, z8q0Var2.d, z8q0Var2.e, z8q0Var2.f, z8q0Var2.g, z8q0Var2.h, z8q0Var2.i, j), bw40Var, r4e.d(j, (((long) jtm0.j(bw40Var.e)) & 4294967295L) | (((long) jtm0.j(bw40Var.d)) << 32)));
                        a9q0Var2 = a9q0Var5;
                    } else {
                        a9q0Var = a9q0Var5;
                    }
                }
                hhkVar.e(layoutDirection);
                iK = p4e.k(j);
                if (z && p4e.e(j)) {
                    iD = p4e.i(j);
                }
                if (iK != iD) {
                    w5zVar2 = (w5z) hhkVar.g;
                    if (w5zVar2 != null) {
                        jf4.n("layoutIntrinsics must be called first");
                        return null;
                    }
                    iD = l1e0.d(jtm0.j(w5zVar2.e()), iK, iD);
                }
                w5zVar = (w5z) hhkVar.g;
                if (w5zVar != null) {
                    jf4.n("layoutIntrinsics must be called first");
                    return null;
                }
                bw40 bw40Var2 = new bw40(w5zVar, lgb.O(0, iD, 0, p4e.h(j)), Integer.MAX_VALUE, 1);
                a9q0Var2 = a9q0Var;
                a9q0Var3 = new a9q0(new z8q0((j83) hhkVar.b, (y9q0) hhkVar.c, (List) hhkVar.f, Integer.MAX_VALUE, hhkVar.f13068a, 1, (w6k) hhkVar.d, layoutDirection, (mrq) hhkVar.e, j), bw40Var2, r4e.d(j, (((long) jtm0.j(bw40Var2.d)) << 32) | (((long) jtm0.j(bw40Var2.e)) & 4294967295L)));
            } else {
                a9q0Var = a9q0Var4;
                hhkVar.e(layoutDirection);
                iK = p4e.k(j);
                if (z) {
                    iD = p4e.i(j);
                }
                if (iK != iD) {
                    w5zVar2 = (w5z) hhkVar.g;
                    if (w5zVar2 != null) {
                        jf4.n("layoutIntrinsics must be called first");
                        return null;
                    }
                    iD = l1e0.d(jtm0.j(w5zVar2.e()), iK, iD);
                }
                w5zVar = (w5z) hhkVar.g;
                if (w5zVar != null) {
                    jf4.n("layoutIntrinsics must be called first");
                    return null;
                }
                bw40 bw40Var3 = new bw40(w5zVar, lgb.O(0, iD, 0, p4e.h(j)), Integer.MAX_VALUE, 1);
                a9q0Var2 = a9q0Var;
                a9q0Var3 = new a9q0(new z8q0((j83) hhkVar.b, (y9q0) hhkVar.c, (List) hhkVar.f, Integer.MAX_VALUE, hhkVar.f13068a, 1, (w6k) hhkVar.d, layoutDirection, (mrq) hhkVar.e, j), bw40Var3, r4e.d(j, (((long) jtm0.j(bw40Var3.d)) << 32) | (((long) jtm0.j(bw40Var3.e)) & 4294967295L)));
            }
            long j3 = a9q0Var3.c;
            Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
            Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            bw40 bw40Var4 = a9q0Var3.b;
            bw40Var4.f3309a.b();
            a9q0 a9q0Var6 = a9q0Var2;
            if (Intrinsics.d(a9q0Var6, a9q0Var3)) {
                tmeVar = this;
                djzVar = djzVar2;
            } else {
                djzVar = djzVar2;
                ((hgk0) djzVar.i).setValue(new b9q0(a9q0Var3, b9q0VarD != 0 ? b9q0VarD.c : null));
                djzVar.p = false;
                tmeVar = this;
                k7q0 k7q0Var = tmeVar.b;
                if (k7q0Var.i() && k7q0Var.h() && ((yez) tmeVar.c).c() && o9q0.c(((o9q0) ((hgk0) djzVar.A).getValue()).f24893a) && o9q0.c(((o9q0) ((hgk0) djzVar.B).getValue()).f24893a) && djzVar.b()) {
                    if (!Intrinsics.d((a9q0Var6 == null || (z8q0Var = a9q0Var6.f491a) == null) ? null : z8q0Var.f43981a, a9q0Var3.f491a.f43981a)) {
                        qjj.W(tmeVar.d, null, null, new jtb(k7q0Var, tmeVar.i, null, (byte) 22), 3);
                    }
                }
                tmeVar.e.invoke(a9q0Var3);
                dyb.f0(djzVar, tmeVar.f, tmeVar.g);
            }
            ((hgk0) djzVar.g).setValue(new ycl(tmeVar.h.r0(tmeVar.j == 1 ? jtm0.j(bw40Var4.b(0)) : 0)));
            return vj30Var.i0(iIntValue, iIntValue2, xp20.f(new Pair(z12.f43597a, Integer.valueOf(Math.round(a9q0Var3.d))), new Pair(z12.b, Integer.valueOf(Math.round(a9q0Var3.e)))), new vzd((byte) 6));
        } catch (Throwable th) {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            throw th;
        }
    }

    @Override // a.tj30
    public final int e(cnx cnxVar, List list, int i) {
        djz djzVar = this.f34190a;
        djzVar.f6209a.e(cnxVar.getLayoutDirection());
        w5z w5zVar = (w5z) djzVar.f6209a.g;
        if (w5zVar != null) {
            return jtm0.j(w5zVar.e());
        }
        jf4.n("layoutIntrinsics must be called first");
        return 0;
    }
}
