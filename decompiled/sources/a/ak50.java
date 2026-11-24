package a;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ak50 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1005a;
    public final bch0 b;
    public final ik50 c;
    public final int[] d;

    public ak50(View view, bch0 bch0Var) {
        view.getClass();
        bch0Var.getClass();
        this.f1005a = view;
        this.b = bch0Var;
        ik50 ik50Var = new ik50(view);
        ik50Var.g(true);
        this.c = ik50Var;
        this.d = new int[2];
        WeakHashMap weakHashMap = rgu0.f30456a;
        view.setNestedScrollingEnabled(true);
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        int iX = a8k0.x(j);
        int i2 = i == 1 ? 1 : 0;
        ik50 ik50Var = this.c;
        if (!ik50Var.h(iX, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.d;
        qx3.o(iArr, 0, 0, 6);
        int i3 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i3) > 0.0f && this.b.c()) {
            return 0L;
        }
        ik50Var.c(a8k0.r(Float.intBitsToFloat((int) (j >> 32))), a8k0.r(Float.intBitsToFloat(i3)), (i == 1 ? 1 : 0) ^ 1, iArr, null);
        return a8k0.N(iArr, j);
    }

    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        float fB = g6u0.b(j) * (-1.0f);
        float fC = g6u0.c(j) * (-1.0f);
        ik50 ik50Var = this.c;
        if (!ik50Var.b(fB, fC) && !ik50Var.a(g6u0.b(j) * (-1.0f), g6u0.c(j) * (-1.0f), true)) {
            j = 0;
        }
        return new g6u0(j);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        int iX = a8k0.x(j2);
        int i2 = i == 1 ? 1 : 0;
        ik50 ik50Var = this.c;
        if (!ik50Var.h(iX, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.d;
        qx3.o(iArr, 0, 0, 6);
        ik50Var.d(a8k0.r(Float.intBitsToFloat((int) (j >> 32))), a8k0.r(Float.intBitsToFloat((int) (j & 4294967295L))), a8k0.r(Float.intBitsToFloat((int) (j2 >> 32))), a8k0.r(Float.intBitsToFloat((int) (4294967295L & j2))), null, (i == 1 ? 1 : 0) ^ 1, iArr);
        return a8k0.N(iArr, j2);
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        ik50 ik50Var = this.c;
        if (ik50Var.f(0)) {
            ik50Var.i(0);
        }
        if (ik50Var.f(1)) {
            ik50Var.i(1);
        }
        return new g6u0(0L);
    }
}
