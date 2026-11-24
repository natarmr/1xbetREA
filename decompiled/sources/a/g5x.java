package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g5x extends vzs0 {
    public final hzs0[] b;
    public final pzs0[] c;
    public final boolean d;

    public g5x(hzs0[] hzs0VarArr, pzs0[] pzs0VarArr, boolean z) {
        hzs0VarArr.getClass();
        pzs0VarArr.getClass();
        this.b = hzs0VarArr;
        this.c = pzs0VarArr;
        this.d = z;
    }

    @Override // a.vzs0
    public final boolean b() {
        return this.d;
    }

    @Override // a.vzs0
    public final pzs0 d(wsy wsyVar) {
        wsyVar.getClass();
        foc focVarN = wsyVar.S().n();
        hzs0 hzs0Var = focVarN instanceof hzs0 ? (hzs0) focVarN : null;
        if (hzs0Var != null) {
            int index = hzs0Var.getIndex();
            hzs0[] hzs0VarArr = this.b;
            if (index < hzs0VarArr.length && Intrinsics.d(hzs0VarArr[index].h(), hzs0Var.h())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // a.vzs0
    public final boolean e() {
        return this.c.length == 0;
    }
}
