package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t2t0 extends wvb0 {
    public static final t2t0 c;

    static {
        q2t0.b.getClass();
        c = new t2t0(u2t0.f34963a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        return ((r2t0) obj).f29754a.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        s2t0 s2t0Var = (s2t0) obj;
        s2t0Var.getClass();
        short sP = bldVar.C(this.b, i).p();
        p2t0 p2t0Var = q2t0.b;
        s2t0Var.b(s2t0Var.d() + 1);
        short[] sArr = s2t0Var.f31520a;
        int i2 = s2t0Var.b;
        s2t0Var.b = i2 + 1;
        sArr[i2] = sP;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        short[] sArr = ((r2t0) obj).f29754a;
        s2t0 s2t0Var = new s2t0();
        s2t0Var.f31520a = sArr;
        s2t0Var.b = sArr.length;
        s2t0Var.b(10);
        return s2t0Var;
    }

    @Override // a.wvb0
    public final Object j() {
        return new r2t0(new short[0]);
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        short[] sArr = ((r2t0) obj).f29754a;
        cldVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bwn bwnVarV = cldVar.v(this.b, i2);
            short s = sArr[i2];
            p2t0 p2t0Var = q2t0.b;
            bwnVarV.r(s);
        }
    }
}
