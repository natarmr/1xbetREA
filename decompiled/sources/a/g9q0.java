package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mrq f10929a;
    public final w6k b;
    public final k6z c;
    public final yuu d = new yuu();

    public g9q0(mrq mrqVar, w6k w6kVar, k6z k6zVar) {
        this.f10929a = mrqVar;
        this.b = w6kVar;
        this.c = k6zVar;
    }

    public static a9q0 a(g9q0 g9q0Var, String str, y9q0 y9q0Var, int i, int i2, long j, k6z k6zVar, int i3) {
        int i4 = (i3 & 4) != 0 ? 1 : i;
        boolean z = (i3 & 8) != 0;
        int i5 = (i3 & 16) != 0 ? Integer.MAX_VALUE : i2;
        long jB = (i3 & 32) != 0 ? r4e.b(0, 0, 0, 0, 15) : j;
        k6z k6zVar2 = (i3 & 64) != 0 ? g9q0Var.c : k6zVar;
        w6k w6kVar = g9q0Var.b;
        mrq mrqVar = g9q0Var.f10929a;
        g9q0Var.getClass();
        return b(g9q0Var, new j83(str), y9q0Var, i4, z, i5, jB, k6zVar2, w6kVar, mrqVar, 32);
    }

    public static a9q0 b(g9q0 g9q0Var, j83 j83Var, y9q0 y9q0Var, int i, boolean z, int i2, long j, k6z k6zVar, w6k w6kVar, mrq mrqVar, int i3) {
        a9q0 a9q0Var;
        int i4 = 1;
        int i5 = (i3 & 4) != 0 ? 1 : i;
        boolean z2 = (i3 & 8) != 0 ? true : z;
        int i6 = Integer.MAX_VALUE;
        int i7 = (i3 & 16) != 0 ? Integer.MAX_VALUE : i2;
        iun iunVar = iun.f15405a;
        long jB = (i3 & 64) != 0 ? r4e.b(0, 0, 0, 0, 15) : j;
        k6z k6zVar2 = (i3 & 128) != 0 ? g9q0Var.c : k6zVar;
        w6k w6kVar2 = (i3 & 256) != 0 ? g9q0Var.b : w6kVar;
        mrq mrqVar2 = (i3 & 512) != 0 ? g9q0Var.f10929a : mrqVar;
        yuu yuuVar = g9q0Var.d;
        z8q0 z8q0Var = new z8q0(j83Var, y9q0Var, iunVar, i7, z2, i5, w6kVar2, k6zVar2, mrqVar2, jB);
        a9q0 a9q0Var2 = null;
        if (yuuVar != null) {
            ej9 ej9Var = new ej9(z8q0Var);
            dj10 dj10Var = (dj10) yuuVar.b;
            if (dj10Var != null) {
                a9q0Var = (a9q0) dj10Var.c(ej9Var);
            } else if (Intrinsics.d((ej9) yuuVar.c, ej9Var)) {
                a9q0Var = (a9q0) yuuVar.d;
            }
            if (a9q0Var != null && !a9q0Var.b.f3309a.b()) {
                a9q0Var2 = a9q0Var;
            }
        }
        if (a9q0Var2 != null) {
            bw40 bw40Var = a9q0Var2.b;
            return new a9q0(z8q0Var, bw40Var, r4e.d(jB, (((long) ((int) Math.ceil(bw40Var.e))) & 4294967295L) | (((long) ((int) Math.ceil(bw40Var.d))) << 32)));
        }
        w5z w5zVar = new w5z(j83Var, w6kVar2, mrqVar2, afn0.A(y9q0Var, k6zVar2), iunVar, z2);
        int iK = p4e.k(jB);
        if ((z2 || i5 == 2 || i5 == 4 || i5 == 5) && p4e.e(jB)) {
            i6 = p4e.i(jB);
        }
        int iD = i6;
        if (z2 || (i5 != 2 && i5 != 4 && i5 != 5)) {
            i4 = i7;
        }
        if (iK != iD) {
            iD = l1e0.d((int) Math.ceil(w5zVar.e()), iK, iD);
        }
        bw40 bw40Var2 = new bw40(w5zVar, lgb.O(0, iD, 0, p4e.h(jB)), i4, i5);
        a9q0 a9q0Var3 = new a9q0(z8q0Var, bw40Var2, r4e.d(jB, (((long) ((int) Math.ceil(bw40Var2.e))) & 4294967295L) | (((long) ((int) Math.ceil(bw40Var2.d))) << 32)));
        if (yuuVar != null) {
            dj10 dj10Var2 = (dj10) yuuVar.b;
            if (dj10Var2 != null) {
                dj10Var2.d(new ej9(z8q0Var), a9q0Var3);
                return a9q0Var3;
            }
            yuuVar.c = new ej9(z8q0Var);
            yuuVar.d = a9q0Var3;
        }
        return a9q0Var3;
    }
}
