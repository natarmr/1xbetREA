package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e2t0 extends wvb0 {
    public static final e2t0 c;

    static {
        b2t0.b.getClass();
        c = new e2t0(f2t0.f8830a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        return ((c2t0) obj).f3642a.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        d2t0 d2t0Var = (d2t0) obj;
        d2t0Var.getClass();
        int iH = bldVar.C(this.b, i).h();
        a2t0 a2t0Var = b2t0.b;
        d2t0Var.b(d2t0Var.d() + 1);
        int[] iArr = d2t0Var.f5375a;
        int i2 = d2t0Var.b;
        d2t0Var.b = i2 + 1;
        iArr[i2] = iH;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        int[] iArr = ((c2t0) obj).f3642a;
        d2t0 d2t0Var = new d2t0();
        d2t0Var.f5375a = iArr;
        d2t0Var.b = iArr.length;
        d2t0Var.b(10);
        return d2t0Var;
    }

    @Override // a.wvb0
    public final Object j() {
        return new c2t0(new int[0]);
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        int[] iArr = ((c2t0) obj).f3642a;
        cldVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bwn bwnVarV = cldVar.v(this.b, i2);
            int i3 = iArr[i2];
            a2t0 a2t0Var = b2t0.b;
            bwnVarV.B(i3);
        }
    }
}
