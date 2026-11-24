package a;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class pnk implements ncs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f27292a = new byte[4096];

    @Override // a.ncs0
    public final void d(fq80 fq80Var, int i, int i2) {
        fq80Var.N(i);
    }

    @Override // a.ncs0
    public final int g(bbj bbjVar, int i, boolean z) throws EOFException {
        byte[] bArr = this.f27292a;
        int i2 = bbjVar.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        c99.f();
        return 0;
    }

    @Override // a.ncs0
    public final void c(androidx.media3.common.b bVar) {
    }

    @Override // a.ncs0
    public final void b(long j, int i, int i2, int i3, mcs0 mcs0Var) {
    }
}
