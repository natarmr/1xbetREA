package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jcy extends kc5 {
    public final fp l;
    public final qaj m;

    public jcy(fp fpVar, vby vbyVar) {
        vbyVar.getClass();
        this.l = fpVar;
        this.m = vbyVar.b;
    }

    @Override // a.kc5, a.rkj
    public final byte D() {
        fp fpVar = this.l;
        String strN = fpVar.n();
        try {
            return kotlin.text.g.a(strN);
        } catch (IllegalArgumentException unused) {
            fp.t(fpVar, hne.l('\'', "Failed to parse type 'UByte' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // a.bld
    public final qaj b() {
        return this.m;
    }

    @Override // a.bld
    public final int f(ugi0 ugi0Var) {
        ugi0Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // a.kc5, a.rkj
    public final int h() {
        fp fpVar = this.l;
        String strN = fpVar.n();
        try {
            return kotlin.text.g.b(strN);
        } catch (IllegalArgumentException unused) {
            fp.t(fpVar, hne.l('\'', "Failed to parse type 'UInt' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // a.kc5, a.rkj
    public final long i() {
        fp fpVar = this.l;
        String strN = fpVar.n();
        try {
            return kotlin.text.g.d(strN);
        } catch (IllegalArgumentException unused) {
            fp.t(fpVar, hne.l('\'', "Failed to parse type 'ULong' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // a.kc5, a.rkj
    public final short p() {
        fp fpVar = this.l;
        String strN = fpVar.n();
        try {
            return kotlin.text.g.f(strN);
        } catch (IllegalArgumentException unused) {
            fp.t(fpVar, hne.l('\'', "Failed to parse type 'UShort' for input '", strN), 0, null, 6);
            throw null;
        }
    }
}
