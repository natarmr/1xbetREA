package a;

/* JADX INFO: loaded from: classes2.dex */
public final class uvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f36348a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public uvh0 f;
    public uvh0 g;

    public uvh0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.f36348a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final uvh0 a() {
        uvh0 uvh0Var = this.f;
        if (uvh0Var == this) {
            uvh0Var = null;
        }
        uvh0 uvh0Var2 = this.g;
        uvh0Var2.getClass();
        uvh0Var2.f = this.f;
        uvh0 uvh0Var3 = this.f;
        uvh0Var3.getClass();
        uvh0Var3.g = this.g;
        this.f = null;
        this.g = null;
        return uvh0Var;
    }

    public final void b(uvh0 uvh0Var) {
        uvh0Var.getClass();
        uvh0Var.g = this;
        uvh0Var.f = this.f;
        uvh0 uvh0Var2 = this.f;
        uvh0Var2.getClass();
        uvh0Var2.g = uvh0Var;
        this.f = uvh0Var;
    }

    public final uvh0 c() {
        this.d = true;
        return new uvh0(this.f36348a, this.b, this.c, true, false);
    }

    public final void d(uvh0 uvh0Var, int i) {
        uvh0Var.getClass();
        byte[] bArr = uvh0Var.f36348a;
        if (!uvh0Var.e) {
            jf4.n("only owner can write");
            return;
        }
        int i2 = uvh0Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (uvh0Var.d) {
                e9d0.o();
                return;
            }
            int i4 = uvh0Var.b;
            if (i3 - i4 > 8192) {
                e9d0.o();
                return;
            }
            qx3.f(bArr, 0, bArr, i4, i2);
            i2 = uvh0Var.c - uvh0Var.b;
            uvh0Var.c = i2;
            uvh0Var.b = 0;
        }
        int i5 = this.b;
        qx3.f(this.f36348a, i2, bArr, i5, i5 + i);
        uvh0Var.c += i;
        this.b += i;
    }

    public uvh0() {
        this.f36348a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
