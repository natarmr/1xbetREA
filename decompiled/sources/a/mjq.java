package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mjq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21908a;
    public final int b;
    public final int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mjq(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (byte) 2);
        this.f21908a = (byte) 2;
    }

    public static ljq a(mjq mjqVar, vlx[] vlxVarArr) {
        return new ljq(mjqVar.b + mjqVar.c, vlxVarArr);
    }

    public static kjq b(mjq mjqVar) {
        return new kjq(mjqVar.b + mjqVar.c, 1, (byte) 0);
    }

    public static kjq c() {
        return new kjq(0, 1, (byte) 0);
    }

    public void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        t9k0Var.a(hu5Var.f(0));
    }

    public abstract Object e(int i);

    public bet f(hu5 hu5Var) {
        return null;
    }

    public abstract byte[] g();

    public abstract byte[] h(byte[] bArr, int i);

    public boolean i() {
        return false;
    }

    public mjq j() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public String toString() {
        char c;
        switch (this.f21908a) {
            case 1:
                int i = this.b;
                byte[] bArrH = new byte[i];
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i + 1) * i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    bArrH = h(bArrH, i3);
                    for (int i4 = 0; i4 < i; i4++) {
                        int i5 = bArrH[i4] & 255;
                        if (i5 < 64) {
                            c = '#';
                        } else if (i5 < 128) {
                            c = '+';
                        } else {
                            c = i5 < 192 ? '.' : ' ';
                        }
                        sb.append(c);
                    }
                    sb.append('\n');
                }
                return sb.toString();
            case 2:
                String strJ = sre0.f32672a.b(getClass()).J();
                return strJ == null ? "" : strJ;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mjq(int i, int i2, byte b) {
        this.f21908a = b;
        this.b = i;
        this.c = i2;
    }
}
