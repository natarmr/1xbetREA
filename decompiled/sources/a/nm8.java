package a;

/* JADX INFO: loaded from: classes2.dex */
public final class nm8 extends wvb0 {
    public static final nm8 c;

    static {
        rm8.f30733a.getClass();
        c = new nm8(sm8.f32432a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        lm8 lm8Var = (lm8) obj;
        lm8Var.getClass();
        boolean zB = bldVar.B(this.b, i);
        lm8Var.b(lm8Var.d() + 1);
        boolean[] zArr = lm8Var.f20285a;
        int i2 = lm8Var.b;
        lm8Var.b = i2 + 1;
        zArr[i2] = zB;
    }
}
