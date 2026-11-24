package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ujx extends wvb0 {
    public static final ujx c;

    static {
        yjx.f42760a.getClass();
        c = new ujx(okx.f25427a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        rjx rjxVar = (rjx) obj;
        rjxVar.getClass();
        int iJ = bldVar.j(this.b, i);
        rjxVar.b(rjxVar.d() + 1);
        int[] iArr = rjxVar.f30619a;
        int i2 = rjxVar.b;
        rjxVar.b = i2 + 1;
        iArr[i2] = iJ;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        rjx rjxVar = new rjx();
        rjxVar.f30619a = iArr;
        rjxVar.b = iArr.length;
        rjxVar.b(10);
        return rjxVar;
    }

    @Override // a.wvb0
    public final Object j() {
        return new int[0];
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        cldVar.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            cldVar.i(i2, iArr[i2], this.b);
        }
    }
}
