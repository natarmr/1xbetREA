package a;

/* JADX INFO: loaded from: classes2.dex */
public final class oox extends mjq {
    public final mjq d;

    public oox(mjq mjqVar) {
        super(mjqVar.b, mjqVar.c, (byte) 1);
        this.d = mjqVar;
    }

    @Override // a.mjq
    public final byte[] g() {
        byte[] bArrG = this.d.g();
        int i = this.b * this.c;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (bArrG[i2] & 255));
        }
        return bArr;
    }

    @Override // a.mjq
    public final byte[] h(byte[] bArr, int i) {
        byte[] bArrH = this.d.h(bArr, i);
        for (int i2 = 0; i2 < this.b; i2++) {
            bArrH[i2] = (byte) (255 - (bArrH[i2] & 255));
        }
        return bArrH;
    }

    @Override // a.mjq
    public final boolean i() {
        return this.d.i();
    }

    @Override // a.mjq
    public final mjq j() {
        return new oox(this.d.j());
    }
}
