package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g6 implements trn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10739a;
    public final q8b b;
    public final fq80 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public ncs0 h;
    public byte i;
    public int j;
    public boolean k;
    public long l;
    public androidx.media3.common.b m;
    public int n;
    public long o;

    public g6(byte b, int i, String str, String str2) {
        this.f10739a = b;
        switch (b) {
            case 1:
                q8b q8bVar = new q8b(new byte[16], 16);
                this.b = q8bVar;
                this.c = new fq80(q8bVar.b);
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                q8b q8bVar2 = new q8b(new byte[128], 128);
                this.b = q8bVar2;
                this.c = new fq80(q8bVar2.b);
                this.i = (byte) 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0369  */
    /* JADX WARN: Code duplicated, block: B:186:0x0377  */
    /* JADX WARN: Code duplicated, block: B:188:0x037f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0395 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0397  */
    /* JADX WARN: Code duplicated, block: B:197:0x039c  */
    /* JADX WARN: Code duplicated, block: B:199:0x039f  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b1  */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13341. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:61)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:298)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
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
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int iG;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j;
        fq80Var = fq80Var;
        byte b2 = this.f10739a;
        int i18 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        q8b q8bVar = this.b;
        long j2 = -9223372036854775807L;
        byte b3 = 0;
        byte b4 = 1;
        byte b5 = 2;
        fq80 fq80Var2 = this.c;
        int i19 = 16;
        switch (b2) {
            case 0:
                this.h.getClass();
                while (fq80Var.a() > 0) {
                    byte b6 = this.i;
                    if (b6 == 0) {
                        while (true) {
                            if (fq80Var.a() <= 0) {
                                b3 = 0;
                                b4 = 1;
                                b5 = 2;
                            } else if (this.k) {
                                int iZ = fq80Var.z();
                                if (iZ == 119) {
                                    this.k = false;
                                    b4 = 1;
                                    this.i = (byte) 1;
                                    byte[] bArr = fq80Var2.f9961a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    b5 = 2;
                                    b3 = 0;
                                } else {
                                    this.k = iZ == 11;
                                }
                            } else {
                                this.k = fq80Var.z() == 11;
                            }
                        }
                    } else if (b6 == b4) {
                        byte[] bArr2 = fq80Var2.f9961a;
                        int iMin = Math.min(fq80Var.a(), 128 - this.j);
                        fq80Var.k(bArr2, this.j, iMin);
                        int i20 = this.j + iMin;
                        this.j = i20;
                        if (i20 == 128) {
                            q8bVar.m(b3);
                            int[] iArr = ay3.d;
                            int[] iArr2 = ay3.b;
                            int iE = q8bVar.e();
                            q8bVar.o(40);
                            byte b7 = q8bVar.g(5) > 10 ? b4 : (byte) 0;
                            q8bVar.m(iE);
                            if (b7 != 0) {
                                q8bVar.o(i19);
                                int iG2 = q8bVar.g(b5);
                                if (iG2 == 0) {
                                    b = 0;
                                } else if (iG2 != b4) {
                                    b = iG2 != b5 ? (byte) -1 : b5;
                                } else {
                                    b = b4;
                                }
                                q8bVar.o(3);
                                iG = (q8bVar.g(11) + b4) * b5;
                                int iG3 = q8bVar.g(b5);
                                if (iG3 == 3) {
                                    i5 = ay3.c[q8bVar.g(b5)];
                                    i6 = 3;
                                    i7 = 6;
                                } else {
                                    int iG4 = q8bVar.g(b5);
                                    int i21 = ay3.f1652a[iG4];
                                    i5 = iArr2[iG3];
                                    i6 = iG4;
                                    i7 = i21;
                                }
                                i4 = i7 * 256;
                                int i22 = (iG * i5) / (i7 * 32);
                                int iG5 = q8bVar.g(3);
                                boolean zF = q8bVar.f();
                                int i23 = iArr[iG5] + (zF ? 1 : 0);
                                q8bVar.o(10);
                                if (q8bVar.f()) {
                                    q8bVar.o(8);
                                }
                                if (iG5 == 0) {
                                    q8bVar.o(5);
                                    if (q8bVar.f()) {
                                        q8bVar.o(8);
                                    }
                                }
                                if (b == 1 && q8bVar.f()) {
                                    q8bVar.o(16);
                                }
                                if (q8bVar.f()) {
                                    if (iG5 > 2) {
                                        q8bVar.o(2);
                                    }
                                    if ((iG5 & 1) == 0 || iG5 <= 2) {
                                        i13 = 6;
                                    } else {
                                        i13 = 6;
                                        q8bVar.o(6);
                                    }
                                    if ((iG5 & 4) != 0) {
                                        q8bVar.o(i13);
                                    }
                                    if (zF && q8bVar.f()) {
                                        q8bVar.o(5);
                                    }
                                    if (b == 0) {
                                        if (q8bVar.f()) {
                                            i14 = 6;
                                            q8bVar.o(6);
                                        } else {
                                            i14 = 6;
                                        }
                                        if (iG5 == 0 && q8bVar.f()) {
                                            q8bVar.o(i14);
                                        }
                                        if (q8bVar.f()) {
                                            q8bVar.o(i14);
                                        }
                                        i8 = i23;
                                        int iG6 = q8bVar.g(2);
                                        if (iG6 == 1) {
                                            q8bVar.o(5);
                                        } else if (iG6 == 2) {
                                            q8bVar.o(12);
                                        } else {
                                            if (iG6 == 3) {
                                                int iG7 = q8bVar.g(5);
                                                if (q8bVar.f()) {
                                                    q8bVar.o(5);
                                                    if (q8bVar.f()) {
                                                        i16 = 4;
                                                        q8bVar.o(4);
                                                    } else {
                                                        i16 = 4;
                                                    }
                                                    if (q8bVar.f()) {
                                                        q8bVar.o(i16);
                                                    }
                                                    if (q8bVar.f()) {
                                                        q8bVar.o(i16);
                                                    }
                                                    if (q8bVar.f()) {
                                                        q8bVar.o(i16);
                                                    }
                                                    if (q8bVar.f()) {
                                                        q8bVar.o(i16);
                                                    }
                                                    if (q8bVar.f()) {
                                                        q8bVar.o(i16);
                                                    }
                                                    if (q8bVar.f()) {
                                                        q8bVar.o(i16);
                                                    }
                                                    if (q8bVar.f()) {
                                                        if (q8bVar.f()) {
                                                            q8bVar.o(i16);
                                                        }
                                                        if (q8bVar.f()) {
                                                            q8bVar.o(i16);
                                                        }
                                                    }
                                                }
                                                if (q8bVar.f()) {
                                                    q8bVar.o(5);
                                                    if (q8bVar.f()) {
                                                        q8bVar.o(7);
                                                        if (q8bVar.f()) {
                                                            q8bVar.o(8);
                                                            i15 = 2;
                                                        } else {
                                                            i15 = 2;
                                                        }
                                                    } else {
                                                        i15 = 2;
                                                    }
                                                } else {
                                                    i15 = 2;
                                                }
                                                q8bVar.o((iG7 + i15) * 8);
                                                q8bVar.c();
                                            }
                                            if (iG5 < i15) {
                                                if (q8bVar.f()) {
                                                    q8bVar.o(14);
                                                }
                                                if (iG5 == 0 && q8bVar.f()) {
                                                    q8bVar.o(14);
                                                }
                                            }
                                            i9 = i6;
                                            if (q8bVar.f()) {
                                                if (i9 == 0) {
                                                    q8bVar.o(5);
                                                } else {
                                                    for (i17 = 0; i17 < i7; i17++) {
                                                        if (q8bVar.f()) {
                                                            q8bVar.o(5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i15 = 2;
                                        if (iG5 < i15) {
                                            if (q8bVar.f()) {
                                                q8bVar.o(14);
                                            }
                                            if (iG5 == 0) {
                                                q8bVar.o(14);
                                            }
                                        }
                                        i9 = i6;
                                        if (q8bVar.f()) {
                                            if (i9 == 0) {
                                                q8bVar.o(5);
                                            } else {
                                                while (i17 < i7) {
                                                    if (q8bVar.f()) {
                                                        q8bVar.o(5);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i8 = i23;
                                        i9 = i6;
                                    }
                                } else {
                                    i8 = i23;
                                    i9 = i6;
                                }
                                if (q8bVar.f()) {
                                    q8bVar.o(5);
                                    if (iG5 == 2) {
                                        q8bVar.o(4);
                                    }
                                    if (iG5 >= 6) {
                                        q8bVar.o(2);
                                    }
                                    if (q8bVar.f()) {
                                        i12 = 8;
                                        q8bVar.o(8);
                                    } else {
                                        i12 = 8;
                                    }
                                    if (iG5 == 0 && q8bVar.f()) {
                                        q8bVar.o(i12);
                                    }
                                    i10 = 3;
                                    if (iG3 < 3) {
                                        q8bVar.n();
                                    }
                                } else {
                                    i10 = 3;
                                }
                                if (b == 0 && i9 != i10) {
                                    q8bVar.n();
                                }
                                if (b == 2 && (i9 == i10 || q8bVar.f())) {
                                    i11 = 6;
                                    q8bVar.o(6);
                                } else {
                                    i11 = 6;
                                }
                                str = (q8bVar.f() && q8bVar.g(i11) == 1 && q8bVar.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i = i22;
                                i3 = i8;
                            } else {
                                q8bVar.o(32);
                                int iG8 = q8bVar.g(2);
                                String str4 = iG8 == 3 ? null : "audio/ac3";
                                int iG9 = q8bVar.g(6);
                                i = ay3.e[iG9 / 2] * 1000;
                                int iP = ay3.P(iG8, iG9);
                                q8bVar.o(8);
                                int iG10 = q8bVar.g(3);
                                if ((iG10 & 1) == 0 || iG10 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    q8bVar.o(2);
                                }
                                if ((iG10 & 4) != 0) {
                                    q8bVar.o(i2);
                                }
                                if (iG10 == i2) {
                                    q8bVar.o(i2);
                                }
                                int i24 = iG8 < 3 ? iArr2[iG8] : -1;
                                i3 = iArr[iG10] + (q8bVar.f() ? 1 : 0);
                                i4 = 1536;
                                str = str4;
                                iG = iP;
                                i5 = i24;
                            }
                            androidx.media3.common.b bVar = this.m;
                            if (bVar == null || i3 != bVar.J || i5 != bVar.L || !Objects.equals(str, bVar.p)) {
                                awq awqVar = new awq();
                                awqVar.f1587a = this.g;
                                awqVar.n = mg40.n(str3);
                                awqVar.o = mg40.n(str);
                                awqVar.I = i3;
                                awqVar.K = i5;
                                awqVar.d = str2;
                                awqVar.f = i18;
                                awqVar.j = i;
                                if ("audio/ac3".equals(str)) {
                                    awqVar.i = i;
                                }
                                androidx.media3.common.b bVar2 = new androidx.media3.common.b(awqVar);
                                this.m = bVar2;
                                this.h.c(bVar2);
                            }
                            this.n = iG;
                            this.l = (((long) i4) * 1000000) / ((long) this.m.L);
                            fq80Var2.M(0);
                            this.h.a(128, fq80Var2);
                            this.i = (byte) 2;
                            b5 = 2;
                            b3 = 0;
                            b4 = 1;
                        } else {
                            fq80Var = fq80Var;
                        }
                    } else if (b6 == b5) {
                        int iMin2 = Math.min(fq80Var.a(), this.n - this.j);
                        this.h.a(iMin2, fq80Var);
                        int i25 = this.j + iMin2;
                        this.j = i25;
                        if (i25 == this.n) {
                            x0x.K(this.o != -9223372036854775807L ? b4 : b3);
                            this.h.b(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = b3;
                        }
                    }
                    i19 = 16;
                }
                break;
            default:
                this.h.getClass();
                while (fq80Var.a() > 0) {
                    byte b8 = this.i;
                    if (b8 == 0) {
                        j = j2;
                        while (fq80Var.a() > 0) {
                            if (this.k) {
                                int iZ2 = fq80Var.z();
                                this.k = iZ2 == 172;
                                if (iZ2 == 64 || iZ2 == 65) {
                                    Object[] objArr = iZ2 == 65;
                                    this.i = (byte) 1;
                                    byte[] bArr3 = fq80Var2.f9961a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = fq80Var.z() == 172;
                            }
                        }
                    } else if (b8 == 1) {
                        j = j2;
                        byte[] bArr4 = fq80Var2.f9961a;
                        int iMin3 = Math.min(fq80Var.a(), 16 - this.j);
                        fq80Var.k(bArr4, this.j, iMin3);
                        int i26 = this.j + iMin3;
                        this.j = i26;
                        if (i26 == 16) {
                            q8bVar.m(0);
                            j6 j6VarP0 = b34.p0(q8bVar);
                            int i27 = j6VarP0.f15959a;
                            androidx.media3.common.b bVar3 = this.m;
                            if (bVar3 == null || 2 != bVar3.J || i27 != bVar3.L || !"audio/ac4".equals(bVar3.p)) {
                                awq awqVar2 = new awq();
                                awqVar2.f1587a = this.g;
                                awqVar2.n = mg40.n(str3);
                                awqVar2.o = mg40.n("audio/ac4");
                                awqVar2.I = 2;
                                awqVar2.K = i27;
                                awqVar2.d = str2;
                                awqVar2.f = i18;
                                androidx.media3.common.b bVar4 = new androidx.media3.common.b(awqVar2);
                                this.m = bVar4;
                                this.h.c(bVar4);
                            }
                            this.n = j6VarP0.b;
                            this.l = (((long) j6VarP0.c) * 1000000) / ((long) this.m.L);
                            fq80Var2.M(0);
                            this.h.a(16, fq80Var2);
                            this.i = (byte) 2;
                        }
                    } else if (b8 == 2) {
                        int iMin4 = Math.min(fq80Var.a(), this.n - this.j);
                        this.h.a(iMin4, fq80Var);
                        int i28 = this.j + iMin4;
                        this.j = i28;
                        if (i28 == this.n) {
                            x0x.K(this.o != j2);
                            j = j2;
                            this.h.b(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = (byte) 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // a.trn
    public final void c() {
        switch (this.f10739a) {
            case 0:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        switch (this.f10739a) {
            case 0:
                zrs0Var.a();
                zrs0Var.b();
                this.g = zrs0Var.e;
                zrs0Var.b();
                this.h = huoVar.q(zrs0Var.d, 1);
                break;
            default:
                zrs0Var.a();
                zrs0Var.b();
                this.g = zrs0Var.e;
                zrs0Var.b();
                this.h = huoVar.q(zrs0Var.d, 1);
                break;
        }
    }

    @Override // a.trn
    public final void g(int i, long j) {
        switch (this.f10739a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g6(String str) {
        this((byte) 0, 0, null, str);
        this.f10739a = (byte) 0;
    }
}
