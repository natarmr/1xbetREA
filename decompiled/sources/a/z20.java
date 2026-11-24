package a;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class z20 implements trn {
    public static final byte[] x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43647a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public ncs0 h;
    public ncs0 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public ncs0 v;
    public long w;
    public final q8b b = new q8b(new byte[7], 7);
    public final fq80 c = new fq80(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public byte j = 0;
    public int k = 0;
    public short l = 256;

    public z20(int i, String str, String str2, boolean z) {
        this.f43647a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0207  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.trn
    public final void a(fq80 fq80Var) {
        byte b;
        int i;
        byte b2;
        char c;
        int i2;
        char c2;
        int i3;
        int i4;
        int i5;
        this.h.getClass();
        String str = vtt0.f38024a;
        while (fq80Var.a() > 0) {
            byte b3 = this.j;
            byte b4 = -1;
            fq80 fq80Var2 = this.c;
            byte b5 = 3;
            q8b q8bVar = this.b;
            int i6 = 0;
            int i7 = 4;
            int i8 = 1;
            if (b3 == 0) {
                byte[] bArr = fq80Var.f9961a;
                int i9 = fq80Var.b;
                int i10 = fq80Var.c;
                while (true) {
                    if (i9 < i10) {
                        int i11 = i9 + 1;
                        byte b6 = b5;
                        byte b7 = bArr[i9];
                        int i12 = b7 & 255;
                        if (this.l == 512 && ((65280 | (((byte) i12) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i13 = i9 - 1;
                                fq80Var.M(i9);
                                byte[] bArr2 = q8bVar.b;
                                if (fq80Var.a() < i8) {
                                    b = -1;
                                } else {
                                    fq80Var.k(bArr2, i6, i8);
                                    q8bVar.m(i7);
                                    int iG = q8bVar.g(i8);
                                    int i14 = this.o;
                                    if (i14 == -1 || iG == i14) {
                                        if (this.p != -1) {
                                            byte[] bArr3 = q8bVar.b;
                                            if (fq80Var.a() >= i8) {
                                                fq80Var.k(bArr3, i6, i8);
                                                q8bVar.m(2);
                                                i3 = 4;
                                                if (q8bVar.g(4) != this.p) {
                                                    b = -1;
                                                } else {
                                                    fq80Var.M(i11);
                                                }
                                            }
                                        } else {
                                            i3 = 4;
                                        }
                                        byte[] bArr4 = q8bVar.b;
                                        if (fq80Var.a() >= i3) {
                                            fq80Var.k(bArr4, i6, i3);
                                            q8bVar.m(14);
                                            int iG2 = q8bVar.g(13);
                                            if (iG2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = fq80Var.f9961a;
                                                int i15 = fq80Var.c;
                                                int i16 = i13 + iG2;
                                                if (i16 < i15) {
                                                    byte b8 = bArr5[i16];
                                                    b = -1;
                                                    if (b8 == -1) {
                                                        int i17 = i16 + 1;
                                                        if (i17 != i15) {
                                                            byte b9 = bArr5[i17];
                                                            if (((65280 | (b9 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b9 & 8) >> 3) == iG) {
                                                            }
                                                        }
                                                    } else if (b8 == 73 && ((i4 = i16 + 1) == i15 || (bArr5[i4] == 68 && ((i5 = i16 + 2) == i15 || bArr5[i5] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.q = (b7 & 8) >> 3;
                            this.m = (b7 & 1) == 0;
                            if (this.n) {
                                this.j = b6;
                                this.k = 0;
                            } else {
                                this.j = (byte) 1;
                                this.k = 0;
                            }
                            fq80Var.M(i11);
                        } else {
                            b = b4;
                            i = i8;
                        }
                        short s = this.l;
                        int i18 = i12 | s;
                        if (i18 == 329) {
                            b2 = 3;
                            c = 256;
                            i2 = 0;
                            c2 = 2;
                            this.l = (short) 768;
                        } else if (i18 == 511) {
                            b2 = 3;
                            c = 256;
                            i2 = 0;
                            c2 = 2;
                            this.l = (short) 512;
                        } else if (i18 == 836) {
                            b2 = 3;
                            c = 256;
                            i2 = 0;
                            c2 = 2;
                            this.l = (short) 1024;
                        } else if (i18 != 1075) {
                            c = 256;
                            if (s != 256) {
                                this.l = (short) 256;
                                b2 = 3;
                                i2 = 0;
                                c2 = 2;
                            } else {
                                b2 = 3;
                                i2 = 0;
                                c2 = 2;
                            }
                            i8 = i;
                            b4 = b;
                            i7 = 4;
                            i6 = i2;
                            b5 = b2;
                        } else {
                            this.j = (byte) 2;
                            this.k = 3;
                            this.t = 0;
                            fq80Var2.M(0);
                            fq80Var.M(i11);
                        }
                        i9 = i11;
                        i8 = i;
                        b4 = b;
                        i7 = 4;
                        i6 = i2;
                        b5 = b2;
                    } else {
                        fq80Var.M(i9);
                    }
                }
            } else if (b3 != 1) {
                if (b3 == 2) {
                    byte[] bArr6 = fq80Var2.f9961a;
                    int iMin = Math.min(fq80Var.a(), 10 - this.k);
                    fq80Var.k(bArr6, this.k, iMin);
                    int i19 = this.k + iMin;
                    this.k = i19;
                    if (i19 == 10) {
                        this.i.a(10, fq80Var2);
                        fq80Var2.M(6);
                        ncs0 ncs0Var = this.i;
                        int iY = fq80Var2.y() + 10;
                        this.j = (byte) 4;
                        this.k = 10;
                        this.v = ncs0Var;
                        this.w = 0L;
                        this.t = iY;
                    }
                } else if (b3 == 3) {
                    int i20 = this.m ? 7 : 5;
                    byte[] bArr7 = q8bVar.b;
                    int iMin2 = Math.min(fq80Var.a(), i20 - this.k);
                    fq80Var.k(bArr7, this.k, iMin2);
                    int i21 = this.k + iMin2;
                    this.k = i21;
                    if (i21 == i20) {
                        q8bVar.m(0);
                        if (this.r) {
                            q8bVar.o(10);
                        } else {
                            int iG3 = q8bVar.g(2) + 1;
                            if (iG3 != 2) {
                                f1t0.g0("AdtsReader", "Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = 2;
                            }
                            q8bVar.o(5);
                            int iG4 = q8bVar.g(3);
                            int i22 = this.p;
                            byte[] bArr8 = {(byte) (((iG3 << 3) & 248) | ((i22 >> 1) & 7)), (byte) (((iG4 << 3) & 120) | ((i22 << 7) & 128))};
                            cf60 cf60VarE = cy2.E(new q8b(bArr8, 2), false);
                            awq awqVar = new awq();
                            awqVar.f1587a = this.g;
                            awqVar.n = mg40.n(this.f);
                            awqVar.o = mg40.n("audio/mp4a-latm");
                            awqVar.k = (String) cf60VarE.d;
                            awqVar.I = cf60VarE.c;
                            awqVar.K = cf60VarE.b;
                            awqVar.r = Collections.singletonList(bArr8);
                            awqVar.d = this.d;
                            awqVar.f = this.e;
                            androidx.media3.common.b bVar = new androidx.media3.common.b(awqVar);
                            this.s = 1024000000 / ((long) bVar.L);
                            this.h.c(bVar);
                            this.r = true;
                        }
                        q8bVar.o(4);
                        int iG5 = q8bVar.g(13);
                        int i23 = iG5 - 7;
                        if (this.m) {
                            i23 = iG5 - 9;
                        }
                        ncs0 ncs0Var2 = this.h;
                        long j = this.s;
                        this.j = (byte) 4;
                        this.k = 0;
                        this.v = ncs0Var2;
                        this.w = j;
                        this.t = i23;
                    }
                } else {
                    if (b3 != 4) {
                        v4i0.e();
                        return;
                    }
                    int iMin3 = Math.min(fq80Var.a(), this.t - this.k);
                    this.v.a(iMin3, fq80Var);
                    int i24 = this.k + iMin3;
                    this.k = i24;
                    if (i24 == this.t) {
                        x0x.K(this.u != -9223372036854775807L);
                        this.v.b(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = (byte) 0;
                        this.k = 0;
                        this.l = (short) 256;
                    }
                }
            } else if (fq80Var.a() != 0) {
                q8bVar.b[0] = fq80Var.f9961a[fq80Var.b];
                q8bVar.m(2);
                int iG6 = q8bVar.g(4);
                int i25 = this.p;
                if (i25 == -1 || iG6 == i25) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = iG6;
                    }
                    this.j = (byte) 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = (byte) 0;
                    this.k = 0;
                    this.l = (short) 256;
                }
            }
        }
    }

    @Override // a.trn
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = (byte) 0;
        this.k = 0;
        this.l = (short) 256;
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        zrs0Var.a();
        zrs0Var.b();
        this.g = zrs0Var.e;
        zrs0Var.b();
        ncs0 ncs0VarQ = huoVar.q(zrs0Var.d, 1);
        this.h = ncs0VarQ;
        this.v = ncs0VarQ;
        if (!this.f43647a) {
            this.i = new pnk();
            return;
        }
        zrs0Var.a();
        zrs0Var.b();
        ncs0 ncs0VarQ2 = huoVar.q(zrs0Var.d, 5);
        this.i = ncs0VarQ2;
        awq awqVar = new awq();
        zrs0Var.b();
        awqVar.f1587a = zrs0Var.e;
        awqVar.n = mg40.n(this.f);
        awqVar.o = mg40.n("application/id3");
        ohs0.w(awqVar, ncs0VarQ2);
    }

    @Override // a.trn
    public final void g(int i, long j) {
        this.u = j;
    }
}
