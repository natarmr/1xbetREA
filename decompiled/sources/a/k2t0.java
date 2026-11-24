package a;

/* JADX INFO: loaded from: classes2.dex */
public final class k2t0 extends wvb0 {
    public static final k2t0 c;

    static {
        h2t0.b.getClass();
        c = new k2t0(l2t0.f19330a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        return ((i2t0) obj).f14069a.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        j2t0 j2t0Var = (j2t0) obj;
        j2t0Var.getClass();
        long jI = bldVar.C(this.b, i).i();
        g2t0 g2t0Var = h2t0.b;
        j2t0Var.b(j2t0Var.d() + 1);
        long[] jArr = j2t0Var.f15799a;
        int i2 = j2t0Var.b;
        j2t0Var.b = i2 + 1;
        jArr[i2] = jI;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        long[] jArr = ((i2t0) obj).f14069a;
        j2t0 j2t0Var = new j2t0();
        j2t0Var.f15799a = jArr;
        j2t0Var.b = jArr.length;
        j2t0Var.b(10);
        return j2t0Var;
    }

    @Override // a.wvb0
    public final Object j() {
        return new i2t0(new long[0]);
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        long[] jArr = ((i2t0) obj).f14069a;
        cldVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bwn bwnVarV = cldVar.v(this.b, i2);
            long j = jArr[i2];
            g2t0 g2t0Var = h2t0.b;
            bwnVarV.l(j);
        }
    }
}
