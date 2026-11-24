package a;

/* JADX INFO: loaded from: classes.dex */
public final class w6r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncs0 f38638a;
    public ocs0 d;
    public qwj e;
    public int f;
    public int g;
    public int h;
    public int i;
    public androidx.media3.common.b l;
    public androidx.media3.common.b m;
    public boolean n;
    public final xbs0 b = new xbs0();
    public final fq80 c = new fq80();
    public final fq80 j = new fq80(1);
    public final fq80 k = new fq80();

    public w6r(ncs0 ncs0Var, ocs0 ocs0Var, qwj qwjVar, androidx.media3.common.b bVar) {
        this.f38638a = ncs0Var;
        this.d = ocs0Var;
        this.e = qwjVar;
        this.m = bVar;
        if (hew0.P(bVar.p)) {
            this.l = bVar;
        }
        this.d = ocs0Var;
        this.e = qwjVar;
        if (this.l == null) {
            ncs0Var.c(this.m);
        }
        e();
    }

    public final int a() {
        int i;
        if (this.n) {
            i = this.b.j[this.f] ? 1 : 0;
        } else {
            i = this.d.g[this.f];
        }
        return b() != null ? 1073741824 | i : i;
    }

    public final vbs0 b() {
        if (this.n) {
            xbs0 xbs0Var = this.b;
            qwj qwjVar = xbs0Var.f40615a;
            String str = vtt0.f38024a;
            int i = qwjVar.f29438a;
            vbs0 vbs0Var = xbs0Var.m;
            if (vbs0Var == null) {
                vbs0[] vbs0VarArr = this.d.f25043a.n;
                vbs0Var = vbs0VarArr == null ? null : vbs0VarArr[i];
            }
            if (vbs0Var != null && vbs0Var.f37155a) {
                return vbs0Var;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f++;
        if (!this.n) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        fq80 fq80Var;
        vbs0 vbs0VarB = b();
        if (vbs0VarB == null) {
            return 0;
        }
        int length = vbs0VarB.d;
        xbs0 xbs0Var = this.b;
        if (length != 0) {
            fq80Var = xbs0Var.n;
        } else {
            byte[] bArr = vbs0VarB.e;
            String str = vtt0.f38024a;
            int length2 = bArr.length;
            fq80 fq80Var2 = this.k;
            fq80Var2.K(bArr, length2);
            length = bArr.length;
            fq80Var = fq80Var2;
        }
        boolean z = xbs0Var.k && xbs0Var.l[this.f];
        boolean z2 = z || i2 != 0;
        fq80 fq80Var3 = this.j;
        fq80Var3.f9961a[0] = (byte) ((z2 ? 128 : 0) | length);
        fq80Var3.M(0);
        ncs0 ncs0Var = this.f38638a;
        ncs0Var.d(fq80Var3, 1, 1);
        ncs0Var.d(fq80Var, length, 1);
        if (!z2) {
            return length + 1;
        }
        fq80 fq80Var4 = this.c;
        if (!z) {
            fq80Var4.J(8);
            byte[] bArr2 = fq80Var4.f9961a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            ncs0Var.d(fq80Var4, 8, 1);
            return length + 9;
        }
        fq80 fq80Var5 = xbs0Var.n;
        int iG = fq80Var5.G();
        fq80Var5.N(-2);
        int i3 = (iG * 6) + 2;
        if (i2 != 0) {
            fq80Var4.J(i3);
            byte[] bArr3 = fq80Var4.f9961a;
            fq80Var5.k(bArr3, 0, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            fq80Var4 = fq80Var5;
        }
        ncs0Var.d(fq80Var4, i3, 1);
        return length + 1 + i3;
    }

    public final void e() {
        xbs0 xbs0Var = this.b;
        xbs0Var.d = 0;
        xbs0Var.p = 0L;
        xbs0Var.q = false;
        xbs0Var.k = false;
        xbs0Var.o = false;
        xbs0Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.n = false;
    }
}
