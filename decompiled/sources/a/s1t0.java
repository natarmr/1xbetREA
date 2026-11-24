package a;

/* JADX INFO: loaded from: classes2.dex */
public final class s1t0 extends wvb0 {
    public static final s1t0 c;

    static {
        p1t0.b.getClass();
        c = new s1t0(t1t0.f33184a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        return ((q1t0) obj).f27971a.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        r1t0 r1t0Var = (r1t0) obj;
        r1t0Var.getClass();
        byte bD = bldVar.C(this.b, i).D();
        o1t0 o1t0Var = p1t0.b;
        r1t0Var.b(r1t0Var.d() + 1);
        byte[] bArr = r1t0Var.f29699a;
        int i2 = r1t0Var.b;
        r1t0Var.b = i2 + 1;
        bArr[i2] = bD;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        byte[] bArr = ((q1t0) obj).f27971a;
        r1t0 r1t0Var = new r1t0();
        r1t0Var.f29699a = bArr;
        r1t0Var.b = bArr.length;
        r1t0Var.b(10);
        return r1t0Var;
    }

    @Override // a.wvb0
    public final Object j() {
        return new q1t0(new byte[0]);
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        byte[] bArr = ((q1t0) obj).f27971a;
        cldVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bwn bwnVarV = cldVar.v(this.b, i2);
            byte b = bArr[i2];
            o1t0 o1t0Var = p1t0.b;
            bwnVarV.h(b);
        }
    }
}
