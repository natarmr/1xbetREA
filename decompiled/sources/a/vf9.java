package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vf9 extends wvb0 {
    public static final vf9 c;

    static {
        yf9.f42529a.getClass();
        c = new vf9(ag9.f814a);
    }

    @Override // a.v1
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // a.o3d, a.v1
    public final void f(bld bldVar, int i, Object obj) {
        tf9 tf9Var = (tf9) obj;
        tf9Var.getClass();
        byte bO = bldVar.o(this.b, i);
        tf9Var.b(tf9Var.d() + 1);
        byte[] bArr = tf9Var.f33856a;
        int i2 = tf9Var.b;
        tf9Var.b = i2 + 1;
        bArr[i2] = bO;
    }

    @Override // a.v1
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        tf9 tf9Var = new tf9();
        tf9Var.f33856a = bArr;
        tf9Var.b = bArr.length;
        tf9Var.b(10);
        return tf9Var;
    }

    @Override // a.wvb0
    public final Object j() {
        return new byte[0];
    }

    @Override // a.wvb0
    public final void k(cld cldVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        cldVar.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            cldVar.k(this.b, i2, bArr[i2]);
        }
    }
}
