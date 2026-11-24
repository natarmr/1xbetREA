package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pqj0 extends wvb0 {
    public static final pqj0 c;

    static {
        qqj0.f29169a.getClass();
        c = new pqj0(urj0.f36166a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        oqj0 oqj0Var = (oqj0) obj;
        oqj0Var.getClass();
        short sL = bldVar.l(this.b, i);
        oqj0Var.b(oqj0Var.d() + 1);
        short[] sArr = oqj0Var.f25691a;
        int i2 = oqj0Var.b;
        oqj0Var.b = i2 + 1;
        sArr[i2] = sL;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        oqj0 oqj0Var = new oqj0();
        oqj0Var.f25691a = sArr;
        oqj0Var.b = sArr.length;
        oqj0Var.b(10);
        return oqj0Var;
    }

    @Override // a.wvb0
    public final Object j() {
        return new short[0];
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        cldVar.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            cldVar.e(this.b, i2, sArr[i2]);
        }
    }
}
