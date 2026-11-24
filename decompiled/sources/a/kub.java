package a;

/* JADX INFO: loaded from: classes2.dex */
public final class kub extends wvb0 {
    public static final kub c;

    static {
        qub.f29338a.getClass();
        c = new kub(pvb.f27654a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        iub iubVar = (iub) obj;
        iubVar.getClass();
        char cE = bldVar.E(this.b, i);
        iubVar.b(iubVar.d() + 1);
        char[] cArr = iubVar.f15388a;
        int i2 = iubVar.b;
        iubVar.b = i2 + 1;
        cArr[i2] = cE;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        iub iubVar = new iub();
        iubVar.f15388a = cArr;
        iubVar.b = cArr.length;
        iubVar.b(10);
        return iubVar;
    }

    @Override // a.wvb0
    public final Object j() {
        return new char[0];
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        cldVar.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            cldVar.D(this.b, i2, cArr[i2]);
        }
    }
}
