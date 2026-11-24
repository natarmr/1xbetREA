package a;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class mjv implements trn {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cyu f21913a;
    public final fq80 b;
    public final boolean[] c = new boolean[4];
    public final kjv d;
    public final y850 e;
    public ljv f;
    public long g;
    public String h;
    public ncs0 i;
    public boolean j;
    public long k;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public mjv(cyu cyuVar) {
        this.f21913a = cyuVar;
        kjv kjvVar = new kjv();
        kjvVar.e = new byte[128];
        this.d = kjvVar;
        this.k = -9223372036854775807L;
        this.e = new y850(178);
        this.b = new fq80();
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0232  */
    @Override // a.trn
    public final void a(fq80 fq80Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = fq80Var.b;
        int i6 = fq80Var.c;
        byte[] bArr = fq80Var.f9961a;
        this.g += (long) fq80Var.a();
        this.i.a(fq80Var.a(), fq80Var);
        while (true) {
            int iA0 = ntr.a0(bArr, i5, i6, this.c);
            kjv kjvVar = this.d;
            y850 y850Var = this.e;
            if (iA0 == i6) {
                if (!this.j) {
                    kjvVar.b(bArr, i5, i6);
                }
                this.f.a(bArr, i5, i6);
                if (y850Var != null) {
                    y850Var.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iA0 + 3;
            byte b = fq80Var.f9961a[i7];
            int i8 = b & 255;
            int i9 = iA0 - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    kjvVar.b(bArr, i5, iA0);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                byte b2 = kjvVar.d;
                if (b2 != 0) {
                    i = i6;
                    if (b2 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            f1t0.g0("H263Reader", "Unexpected start code value");
                            kjvVar.c = false;
                            kjvVar.f18405a = 0;
                            kjvVar.d = (byte) 0;
                        } else {
                            kjvVar.d = (byte) 2;
                        }
                    } else if (b2 != 2) {
                        i2 = i7;
                        if (b2 != 3) {
                            if (b2 != 4) {
                                v4i0.e();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                kjvVar.f18405a -= i10;
                                kjvVar.c = false;
                                ncs0 ncs0Var = this.i;
                                int i11 = kjvVar.b;
                                String str = this.h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf((byte[]) kjvVar.e, kjvVar.f18405a);
                                q8b q8bVar = new q8b(bArrCopyOf, bArrCopyOf.length);
                                q8bVar.p(i11);
                                q8bVar.p(4);
                                q8bVar.n();
                                q8bVar.o(8);
                                if (q8bVar.f()) {
                                    q8bVar.o(4);
                                    q8bVar.o(3);
                                }
                                int iG = q8bVar.g(4);
                                if (iG == 15) {
                                    int iG2 = q8bVar.g(8);
                                    int iG3 = q8bVar.g(8);
                                    if (iG3 == 0) {
                                        f1t0.g0("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iG2 / iG3;
                                    }
                                } else if (iG < 7) {
                                    f = l[iG];
                                } else {
                                    f1t0.g0("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (q8bVar.f()) {
                                    q8bVar.o(2);
                                    q8bVar.o(1);
                                    if (q8bVar.f()) {
                                        q8bVar.o(15);
                                        q8bVar.n();
                                        q8bVar.o(15);
                                        q8bVar.n();
                                        q8bVar.o(15);
                                        q8bVar.n();
                                        q8bVar.o(3);
                                        q8bVar.o(11);
                                        q8bVar.n();
                                        q8bVar.o(15);
                                        q8bVar.n();
                                    }
                                }
                                if (q8bVar.g(2) != 0) {
                                    f1t0.g0("H263Reader", "Unhandled video object layer shape");
                                }
                                q8bVar.n();
                                int iG4 = q8bVar.g(16);
                                q8bVar.n();
                                if (q8bVar.f()) {
                                    if (iG4 == 0) {
                                        f1t0.g0("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i12 = 0;
                                        for (int i13 = iG4 - 1; i13 > 0; i13 >>= 1) {
                                            i12++;
                                        }
                                        q8bVar.o(i12);
                                    }
                                }
                                q8bVar.n();
                                int iG5 = q8bVar.g(13);
                                q8bVar.n();
                                int iG6 = q8bVar.g(13);
                                q8bVar.n();
                                q8bVar.n();
                                awq awqVar = new awq();
                                awqVar.f1587a = str;
                                awqVar.n = mg40.n("video/mp2t");
                                awqVar.o = mg40.n("video/mp4v-es");
                                awqVar.v = iG5;
                                awqVar.w = iG6;
                                awqVar.D = f;
                                awqVar.r = Collections.singletonList(bArrCopyOf);
                                ohs0.w(awqVar, ncs0Var);
                                this.j = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            f1t0.g0("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            kjvVar.c = false;
                            kjvVar.f18405a = 0;
                            kjvVar.d = (byte) 0;
                        } else {
                            i4 = 0;
                            kjvVar.b = kjvVar.f18405a;
                            kjvVar.d = (byte) 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            f1t0.g0("H263Reader", "Unexpected start code value");
                            kjvVar.c = false;
                            kjvVar.f18405a = 0;
                            kjvVar.d = (byte) 0;
                        } else {
                            kjvVar.d = (byte) 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        kjvVar.d = (byte) 1;
                        kjvVar.c = true;
                    }
                }
                kjvVar.b(kjv.f, i4, 3);
            }
            this.f.a(bArr, i5, iA0);
            if (y850Var == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    y850Var.a(bArr, i5, iA0);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (y850Var.b(i3)) {
                    int iW0 = ntr.w0(y850Var.d, y850Var.e);
                    String str2 = vtt0.f38024a;
                    byte[] bArr2 = y850Var.d;
                    fq80 fq80Var2 = this.b;
                    fq80Var2.K(bArr2, iW0);
                    this.f21913a.e(this.k, fq80Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (fq80Var.f9961a[iA0 + 2] == 1) {
                        y850Var.d(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i14 = i - iA0;
            this.f.b(i14, this.g - ((long) i14), this.j);
            ljv ljvVar = this.f;
            long j = this.k;
            ljvVar.e = i8;
            ljvVar.d = false;
            ljvVar.b = (i8 == 182 || i8 == 179) ? z : false;
            ljvVar.c = i8 == 182 ? z : false;
            ljvVar.f = 0;
            ljvVar.h = j;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // a.trn
    public final void c() {
        ntr.Y(this.c);
        kjv kjvVar = this.d;
        kjvVar.c = false;
        kjvVar.f18405a = 0;
        kjvVar.d = (byte) 0;
        ljv ljvVar = this.f;
        if (ljvVar != null) {
            ljvVar.b = false;
            ljvVar.c = false;
            ljvVar.d = false;
            ljvVar.e = -1;
        }
        y850 y850Var = this.e;
        if (y850Var != null) {
            y850Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // a.trn
    public final void d() {
        this.f.getClass();
        this.f.b(0, this.g, this.j);
        ljv ljvVar = this.f;
        ljvVar.b = false;
        ljvVar.c = false;
        ljvVar.d = false;
        ljvVar.e = -1;
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        zrs0Var.a();
        zrs0Var.b();
        this.h = zrs0Var.e;
        zrs0Var.b();
        ncs0 ncs0VarQ = huoVar.q(zrs0Var.d, 2);
        this.i = ncs0VarQ;
        this.f = new ljv(ncs0VarQ);
        this.f21913a.g(huoVar, zrs0Var);
    }

    @Override // a.trn
    public final void g(int i, long j) {
        this.k = j;
    }
}
