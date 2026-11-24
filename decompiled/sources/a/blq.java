package a;

/* JADX INFO: loaded from: classes2.dex */
public final class blq extends wvb0 {
    public static final blq c;

    static {
        flq.f9751a.getClass();
        c = new blq(klq.f18504a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        ykq ykqVar = (ykq) obj;
        ykqVar.getClass();
        float fN = bldVar.n(this.b, i);
        ykqVar.b(ykqVar.d() + 1);
        float[] fArr = ykqVar.f42803a;
        int i2 = ykqVar.b;
        ykqVar.b = i2 + 1;
        fArr[i2] = fN;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ykq ykqVar = new ykq();
        ykqVar.f42803a = fArr;
        ykqVar.b = fArr.length;
        ykqVar.b(10);
        return ykqVar;
    }

    @Override // a.wvb0
    public final Object j() {
        return new float[0];
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        cldVar.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            cldVar.o(this.b, i2, fArr[i2]);
        }
    }
}
