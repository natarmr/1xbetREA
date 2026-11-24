package a;

/* JADX INFO: loaded from: classes2.dex */
public final class y610 extends wvb0 {
    public static final y610 c;

    static {
        c710.f3840a.getClass();
        c = new y610(s710.f31729a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        w610 w610Var = (w610) obj;
        w610Var.getClass();
        long jR = bldVar.r(this.b, i);
        w610Var.b(w610Var.d() + 1);
        long[] jArr = w610Var.f38606a;
        int i2 = w610Var.b;
        w610Var.b = i2 + 1;
        jArr[i2] = jR;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        w610 w610Var = new w610();
        w610Var.f38606a = jArr;
        w610Var.b = jArr.length;
        w610Var.b(10);
        return w610Var;
    }

    @Override // a.wvb0
    public final Object j() {
        return new long[0];
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        cldVar.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            cldVar.n(this.b, i2, jArr[i2]);
        }
    }
}
