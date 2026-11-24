package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class nv40 implements trn {
    public String e;
    public ncs0 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public byte d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f24174a = new fq80(new byte[15], 2);
    public final q8b b = new q8b();
    public final fq80 c = new fq80();
    public final w04 p = new w04();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // a.trn
    public final void a(fq80 fq80Var) throws kq80 {
        int i;
        byte b;
        int iG;
        int iG2;
        int i2;
        char c;
        byte[] bArr;
        long j;
        long j2;
        rcf0 rcf0VarV;
        int iG3;
        long j3;
        boolean z;
        int i3;
        this.f.getClass();
        while (fq80Var.a() > 0) {
            byte b2 = this.d;
            int i4 = 8;
            int i5 = 3;
            int i6 = 1;
            if (b2 != 0) {
                fq80 fq80Var2 = this.c;
                w04 w04Var = this.p;
                if (b2 == 1) {
                    int iA = fq80Var.a();
                    fq80 fq80Var3 = this.f24174a;
                    int iMin = Math.min(iA, fq80Var3.a());
                    fq80Var.k(fq80Var3.f9961a, fq80Var3.b, iMin);
                    fq80Var3.N(iMin);
                    if (fq80Var3.a() == 0) {
                        int i7 = fq80Var3.c;
                        byte[] bArr2 = fq80Var3.f9961a;
                        q8b q8bVar = this.b;
                        q8bVar.l(bArr2, i7);
                        q8bVar.d();
                        int iL = n7x.L(q8bVar, 3, 8, 8);
                        w04Var.b = iL;
                        if (iL != -1) {
                            x0x.A(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (q8bVar.b() < 2) {
                                j3 = -1;
                            } else {
                                long jI = q8bVar.i(2);
                                if (jI == 3) {
                                    if (q8bVar.b() >= 8) {
                                        long jI2 = q8bVar.i(8);
                                        jI += jI2;
                                        if (jI2 == 255) {
                                            if (q8bVar.b() >= 32) {
                                                jI = q8bVar.i(32) + jI;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jI;
                            }
                            w04Var.c = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw kq80.e("Contains sub-stream with an invalid packet label " + w04Var.c);
                                }
                                if (j3 == 0) {
                                    int i8 = w04Var.b;
                                    if (i8 == 1) {
                                        throw kq80.a("Mpegh3daConfig packet with invalid packet label 0", null);
                                    }
                                    if (i8 == 2) {
                                        throw kq80.a("Mpegh3daFrame packet with invalid packet label 0", null);
                                    }
                                    if (i8 == 17) {
                                        throw kq80.a("AudioTruncation packet with invalid packet label 0", null);
                                    }
                                }
                                int iL2 = n7x.L(q8bVar, 11, 24, 24);
                                w04Var.d = iL2;
                                if (iL2 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i3 = 0;
                            this.n = 0;
                            this.o = w04Var.d + i7 + this.o;
                        } else {
                            i3 = 0;
                        }
                        if (z) {
                            fq80Var3.M(i3);
                            this.f.a(fq80Var3.c, fq80Var3);
                            fq80Var3.J(2);
                            fq80Var2.J(w04Var.d);
                            this.m = true;
                            this.d = (byte) 2;
                        } else {
                            int i9 = fq80Var3.c;
                            if (i9 < 15) {
                                fq80Var3.L(i9 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (b2 != 2) {
                        v4i0.e();
                        return;
                    }
                    int i10 = w04Var.b;
                    if (i10 == 1 || i10 == 17) {
                        int i11 = fq80Var.b;
                        int iMin2 = Math.min(fq80Var.a(), fq80Var2.a());
                        fq80Var.k(fq80Var2.f9961a, fq80Var2.b, iMin2);
                        fq80Var2.N(iMin2);
                        fq80Var.M(i11);
                    }
                    int iMin3 = Math.min(fq80Var.a(), w04Var.d - this.n);
                    this.f.a(iMin3, fq80Var);
                    int i12 = this.n + iMin3;
                    this.n = i12;
                    if (i12 != w04Var.d) {
                        continue;
                    } else {
                        int i13 = w04Var.b;
                        if (i13 == 1) {
                            byte[] bArr3 = fq80Var2.f9961a;
                            q8b q8bVar2 = new q8b(bArr3, bArr3.length);
                            int iG4 = q8bVar2.g(8);
                            int iG5 = q8bVar2.g(5);
                            if (iG5 != 31) {
                                switch (iG5) {
                                    case 0:
                                        iG2 = 96000;
                                        break;
                                    case 1:
                                        iG2 = 88200;
                                        break;
                                    case 2:
                                        iG2 = 64000;
                                        break;
                                    case 3:
                                        iG2 = 48000;
                                        break;
                                    case 4:
                                        iG2 = 44100;
                                        break;
                                    case 5:
                                        iG2 = 32000;
                                        break;
                                    case 6:
                                        iG2 = 24000;
                                        break;
                                    case 7:
                                        iG2 = 22050;
                                        break;
                                    case 8:
                                        iG2 = 16000;
                                        break;
                                    case 9:
                                        iG2 = 12000;
                                        break;
                                    case 10:
                                        iG2 = 11025;
                                        break;
                                    case 11:
                                        iG2 = JosStatusCodes.RTN_CODE_COMMON_ERROR;
                                        break;
                                    case 12:
                                        iG2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw kq80.e("Unsupported sampling rate index " + iG5);
                                    case 15:
                                        iG2 = 57600;
                                        break;
                                    case 16:
                                        iG2 = 51200;
                                        break;
                                    case 17:
                                        iG2 = 40000;
                                        break;
                                    case 18:
                                        iG2 = 38400;
                                        break;
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        iG2 = 34150;
                                        break;
                                    case 20:
                                        iG2 = 28800;
                                        break;
                                    case 21:
                                        iG2 = 25600;
                                        break;
                                    case 22:
                                        iG2 = 20000;
                                        break;
                                    case 23:
                                        iG2 = 19200;
                                        break;
                                    case 24:
                                        iG2 = 17075;
                                        break;
                                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                        iG2 = 14400;
                                        break;
                                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                        iG2 = 12800;
                                        break;
                                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                        iG2 = 9600;
                                        break;
                                }
                            } else {
                                iG2 = q8bVar2.g(24);
                            }
                            int iG6 = q8bVar2.g(3);
                            if (iG6 == 0) {
                                i2 = 768;
                            } else if (iG6 == 1) {
                                i2 = 1024;
                            } else if (iG6 == 2 || iG6 == 3) {
                                i2 = 2048;
                            } else {
                                if (iG6 != 4) {
                                    throw kq80.e("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                i2 = 4096;
                            }
                            int i14 = i2;
                            if (iG6 == 0 || iG6 == 1) {
                                c = 0;
                            } else if (iG6 == 2) {
                                c = 2;
                            } else if (iG6 == 3) {
                                c = 3;
                            } else {
                                if (iG6 != 4) {
                                    throw kq80.e("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                c = 1;
                            }
                            q8bVar2.o(2);
                            n7x.P(q8bVar2);
                            int iG7 = q8bVar2.g(5);
                            int i15 = 0;
                            int iL3 = 0;
                            while (true) {
                                int i16 = i6;
                                int i17 = 16;
                                if (i15 < iG7 + 1) {
                                    int iG8 = q8bVar2.g(3);
                                    iL3 = n7x.L(q8bVar2, 5, 8, 16) + 1 + iL3;
                                    if ((iG8 == 0 || iG8 == 2) && q8bVar2.f()) {
                                        n7x.P(q8bVar2);
                                    }
                                    i15++;
                                    i6 = i16;
                                } else {
                                    int iL4 = n7x.L(q8bVar2, 4, 8, 16) + 1;
                                    q8bVar2.n();
                                    int i18 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i18 < iL4) {
                                            int iG9 = q8bVar2.g(2);
                                            if (iG9 == 0) {
                                                q8bVar2.o(i5);
                                                if (q8bVar2.f()) {
                                                    q8bVar2.o(13);
                                                }
                                                if (c > 0) {
                                                    n7x.O(q8bVar2);
                                                }
                                            } else if (iG9 == i16) {
                                                q8bVar2.o(i5);
                                                boolean zF = q8bVar2.f();
                                                if (zF) {
                                                    q8bVar2.o(13);
                                                }
                                                if (zF) {
                                                    q8bVar2.n();
                                                }
                                                if (c > 0) {
                                                    n7x.O(q8bVar2);
                                                    iG3 = q8bVar2.g(2);
                                                } else {
                                                    iG3 = 0;
                                                }
                                                if (iG3 > 0) {
                                                    q8bVar2.o(6);
                                                    int iG10 = q8bVar2.g(2);
                                                    q8bVar2.o(4);
                                                    if (q8bVar2.f()) {
                                                        q8bVar2.o(5);
                                                    }
                                                    if (iG3 == 2 || iG3 == i5) {
                                                        q8bVar2.o(6);
                                                    }
                                                    if (iG10 == 2) {
                                                        q8bVar2.n();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iL3 - 1) / Math.log(2.0d))) + 1;
                                                int iG11 = q8bVar2.g(2);
                                                if (iG11 > 0 && q8bVar2.f()) {
                                                    q8bVar2.o(iFloor);
                                                }
                                                if (q8bVar2.f()) {
                                                    q8bVar2.o(iFloor);
                                                }
                                                if (c == 0 && iG11 == 0) {
                                                    q8bVar2.n();
                                                }
                                            } else if (iG9 == i5) {
                                                n7x.L(q8bVar2, 4, i4, i17);
                                                int iL5 = n7x.L(q8bVar2, 4, i4, i17);
                                                if (q8bVar2.f()) {
                                                    n7x.L(q8bVar2, i4, i17, 0);
                                                }
                                                q8bVar2.n();
                                                if (iL5 > 0) {
                                                    q8bVar2.o(iL5 * 8);
                                                }
                                            }
                                            i18++;
                                            i4 = 8;
                                            i5 = 3;
                                            i17 = 16;
                                            i16 = 1;
                                        } else {
                                            if (q8bVar2.f()) {
                                                int i19 = 8;
                                                int iL6 = n7x.L(q8bVar2, 2, 4, 8) + 1;
                                                int i20 = 0;
                                                bArr = null;
                                                while (i20 < iL6) {
                                                    int iL7 = n7x.L(q8bVar2, 4, i19, 16);
                                                    int iL8 = n7x.L(q8bVar2, 4, i19, 16);
                                                    if (iL7 == 7) {
                                                        int iG12 = q8bVar2.g(4) + 1;
                                                        q8bVar2.o(4);
                                                        byte[] bArr4 = new byte[iG12];
                                                        for (int i21 = 0; i21 < iG12; i21++) {
                                                            bArr4[i21] = (byte) q8bVar2.g(i19);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        q8bVar2.o(iL8 * i19);
                                                    }
                                                    i20++;
                                                    i19 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iG2) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = w04Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = iG4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iG4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            rcf0VarV = null;
                                                        } else {
                                                            rcf0VarV = b4x.v(vtt0.b, bArr);
                                                        }
                                                        awq awqVar = new awq();
                                                        awqVar.f1587a = this.e;
                                                        awqVar.n = mg40.n("video/mp2t");
                                                        awqVar.o = mg40.n("audio/mhm1");
                                                        awqVar.K = this.q;
                                                        awqVar.k = strConcat;
                                                        awqVar.r = rcf0VarV;
                                                        this.f.c(new androidx.media3.common.b(awqVar));
                                                    }
                                                    b = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = w04Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            rcf0VarV = null;
                                                        } else {
                                                            rcf0VarV = null;
                                                        }
                                                        awq awqVar2 = new awq();
                                                        awqVar2.f1587a = this.e;
                                                        awqVar2.n = mg40.n("video/mp2t");
                                                        awqVar2.o = mg40.n("audio/mhm1");
                                                        awqVar2.K = this.q;
                                                        awqVar2.k = strConcat;
                                                        awqVar2.r = rcf0VarV;
                                                        this.f.c(new androidx.media3.common.b(awqVar2));
                                                    }
                                                    b = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = w04Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            rcf0VarV = null;
                                                        } else {
                                                            rcf0VarV = null;
                                                        }
                                                        awq awqVar3 = new awq();
                                                        awqVar3.f1587a = this.e;
                                                        awqVar3.n = mg40.n("video/mp2t");
                                                        awqVar3.o = mg40.n("audio/mhm1");
                                                        awqVar3.K = this.q;
                                                        awqVar3.k = strConcat;
                                                        awqVar3.r = rcf0VarV;
                                                        this.f.c(new androidx.media3.common.b(awqVar3));
                                                    }
                                                    b = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = w04Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            rcf0VarV = null;
                                                        } else {
                                                            rcf0VarV = null;
                                                        }
                                                        awq awqVar4 = new awq();
                                                        awqVar4.f1587a = this.e;
                                                        awqVar4.n = mg40.n("video/mp2t");
                                                        awqVar4.o = mg40.n("audio/mhm1");
                                                        awqVar4.K = this.q;
                                                        awqVar4.k = strConcat;
                                                        awqVar4.r = rcf0VarV;
                                                        this.f.c(new androidx.media3.common.b(awqVar4));
                                                    }
                                                    b = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw kq80.e("Unsupported sampling rate " + iG2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i13 == 17) {
                                byte[] bArr5 = fq80Var2.f9961a;
                                q8b q8bVar3 = new q8b(bArr5, bArr5.length);
                                if (q8bVar3.f()) {
                                    q8bVar3.o(2);
                                    iG = q8bVar3.g(13);
                                } else {
                                    iG = 0;
                                }
                                this.s = iG;
                            } else if (i13 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
                                long jRound = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.b(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            b = 1;
                        }
                        this.d = b;
                    }
                }
            } else {
                int i22 = this.k;
                if ((i22 & 2) == 0) {
                    fq80Var.M(fq80Var.c);
                } else {
                    if ((i22 & 4) == 0) {
                        while (true) {
                            if (fq80Var.a() > 0) {
                                int i23 = this.l << 8;
                                this.l = i23;
                                int iZ = i23 | fq80Var.z();
                                this.l = iZ;
                                if ((iZ & 16777215) == 12583333) {
                                    fq80Var.M(fq80Var.b - 3);
                                    this.l = 0;
                                }
                            }
                        }
                    }
                    this.d = (byte) 1;
                }
            }
        }
    }

    @Override // a.trn
    public final void c() {
        this.d = (byte) 0;
        this.l = 0;
        this.f24174a.J(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        zrs0Var.a();
        zrs0Var.b();
        this.e = zrs0Var.e;
        zrs0Var.b();
        this.f = huoVar.q(zrs0Var.d, 1);
    }

    @Override // a.trn
    public final void g(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }
}
