package a;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bk50 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2733a;
    public final ik50 b;
    public final int[] c;

    public bk50(View view) {
        this.f2733a = view;
        ik50 ik50Var = new ik50(view);
        ik50Var.g(true);
        this.b = ik50Var;
        this.c = new int[2];
        WeakHashMap weakHashMap = rgu0.f30456a;
        view.setNestedScrollingEnabled(true);
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        int iU = x0x.U(j);
        int i2 = i == 1 ? 1 : 0;
        ik50 ik50Var = this.b;
        if (!ik50Var.h(iU, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        qx3.o(iArr, 0, 0, 6);
        int iL = x0x.L(Float.intBitsToFloat((int) (j >> 32)));
        int iL2 = x0x.L(Float.intBitsToFloat((int) (4294967295L & j)));
        ik50Var.c(iL, iL2, (i == 1 ? 1 : 0) ^ 1, iArr, null);
        return x0x.e0(iL, iL2, iArr, j);
    }

    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        float fB = g6u0.b(j) * (-1.0f);
        float fC = g6u0.c(j) * (-1.0f);
        ik50 ik50Var = this.b;
        if (!ik50Var.b(fB, fC) && !ik50Var.a(g6u0.b(j) * (-1.0f), g6u0.c(j) * (-1.0f), true)) {
            j = 0;
        }
        return new g6u0(j);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        int iU = x0x.U(j2);
        int i2 = i == 1 ? 1 : 0;
        ik50 ik50Var = this.b;
        if (!ik50Var.h(iU, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        qx3.o(iArr, 0, 0, 6);
        int iL = x0x.L(Float.intBitsToFloat((int) (j2 >> 32)));
        int iL2 = x0x.L(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        ik50Var.d(x0x.L(Float.intBitsToFloat((int) (j >> 32))), x0x.L(Float.intBitsToFloat((int) (j & 4294967295L))), iL, iL2, null, (i == 1 ? 1 : 0) ^ 1, iArr);
        return x0x.e0(iL, iL2, iArr, j2);
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        ik50 ik50Var = this.b;
        if (ik50Var.f(0)) {
            ik50Var.i(0);
        }
        if (ik50Var.f(1)) {
            ik50Var.i(1);
        }
        return new g6u0(0L);
    }
}
