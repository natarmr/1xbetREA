package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hbl extends wvb0 {
    public static final hbl c;

    static {
        pbl.f26714a.getClass();
        c = new hbl(tbl.f33669a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        fbl fblVar = (fbl) obj;
        fblVar.getClass();
        double dT = bldVar.t(this.b, i);
        fblVar.b(fblVar.d() + 1);
        double[] dArr = fblVar.f9264a;
        int i2 = fblVar.b;
        fblVar.b = i2 + 1;
        dArr[i2] = dT;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        fbl fblVar = new fbl();
        fblVar.f9264a = dArr;
        fblVar.b = dArr.length;
        fblVar.b(10);
        return fblVar;
    }

    @Override // a.wvb0
    public final Object j() {
        return new double[0];
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        cldVar.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            cldVar.j(this.b, i2, dArr[i2]);
        }
    }
}
