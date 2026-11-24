package a;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class mfn0 implements ncs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncs0 f21701a;
    public final jfn0 b;
    public lfn0 g;
    public androidx.media3.common.b h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = vtt0.b;
    public final fq80 c = new fq80();

    public mfn0(ncs0 ncs0Var, jfn0 jfn0Var) {
        this.f21701a = ncs0Var;
        this.b = jfn0Var;
    }

    @Override // a.ncs0
    public final void b(long j, int i, int i2, int i3, mcs0 mcs0Var) {
        int i4;
        if (this.g == null) {
            this.f21701a.b(j, i, i2, i3, mcs0Var);
            return;
        }
        x0x.z("DRM on subtitles is not supported", mcs0Var == null);
        int i5 = (this.e - i3) - i2;
        try {
            i4 = i5;
            try {
                this.g.d(this.f, i4, i2, kfn0.c, new dsj(this, j, i));
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.i) {
                    throw runtimeException;
                }
                f1t0.h0("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.d = i6;
        if (i6 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // a.ncs0
    public final void c(androidx.media3.common.b bVar) {
        bVar.p.getClass();
        String str = bVar.p;
        x0x.A(mg40.h(str) == 3);
        boolean zEquals = bVar.equals(this.h);
        jfn0 jfn0Var = this.b;
        if (!zEquals) {
            this.h = bVar;
            this.g = jfn0Var.c(bVar) ? jfn0Var.b(bVar) : null;
        }
        lfn0 lfn0Var = this.g;
        ncs0 ncs0Var = this.f21701a;
        if (lfn0Var == null) {
            ncs0Var.c(bVar);
            return;
        }
        awq awqVarA = bVar.a();
        awqVarA.o = mg40.n("application/x-media3-cues");
        awqVarA.k = str;
        awqVarA.t = Long.MAX_VALUE;
        awqVarA.P = jfn0Var.a(bVar);
        ohs0.w(awqVarA, ncs0Var);
    }

    @Override // a.ncs0
    public final void d(fq80 fq80Var, int i, int i2) {
        if (this.g == null) {
            this.f21701a.d(fq80Var, i, i2);
            return;
        }
        h(i);
        fq80Var.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // a.ncs0
    public final int g(bbj bbjVar, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.f21701a.g(bbjVar, i, z);
        }
        h(i);
        int i2 = bbjVar.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        c99.f();
        return 0;
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
