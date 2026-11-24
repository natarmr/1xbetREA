package a;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gpq implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f11695a = new fq80(4);
    public final fq80 b = new fq80(9);
    public final fq80 c = new fq80(11);
    public final fq80 d = new fq80();
    public final p9h0 e;
    public huo f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public e44 o;
    public tfu0 p;

    public gpq() {
        p9h0 p9h0Var = new p9h0(new pnk(), (byte) 11);
        p9h0Var.c = -9223372036854775807L;
        p9h0Var.d = new long[0];
        p9h0Var.e = new long[0];
        this.e = p9h0Var;
        this.g = (byte) 1;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x017d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b8  */
    /* JADX WARN: Type inference failed for: r3v4, types: [int, short] */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        int i;
        long j;
        long j2;
        long j3;
        short s;
        boolean z;
        boolean z2;
        long j4;
        byte b;
        this.f.getClass();
        while (true) {
            byte b2 = this.g;
            byte b3 = 11;
            boolean z3 = true;
            if (b2 == 1) {
                fq80 fq80Var = this.b;
                if (!guoVar.h(fq80Var.f9961a, 0, 9, true)) {
                    return -1;
                }
                fq80Var.M(0);
                fq80Var.N(4);
                int iZ = fq80Var.z();
                boolean z4 = (iZ & 4) != 0;
                boolean z5 = (iZ & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new e44(this.f.q(8, 1), b3);
                }
                if (z5 && this.p == null) {
                    b = 2;
                    this.p = new tfu0(this.f.q(9, 2));
                } else {
                    b = 2;
                }
                this.f.o();
                this.j = fq80Var.m() - 5;
                this.g = b;
            } else if (b2 == 2) {
                guoVar.m(this.j);
                this.j = 0;
                this.g = (byte) 3;
            } else if (b2 == 3) {
                fq80 fq80Var2 = this.c;
                if (!guoVar.h(fq80Var2.f9961a, 0, 11, true)) {
                    return -1;
                }
                fq80Var2.M(0);
                this.k = fq80Var2.z();
                this.l = fq80Var2.C();
                this.m = fq80Var2.C();
                this.m = (((long) (fq80Var2.z() << 24)) | this.m) * 1000;
                fq80Var2.N(3);
                this.g = (byte) 4;
            } else {
                if (b2 != 4) {
                    v4i0.e();
                    return 0;
                }
                boolean z6 = this.h;
                p9h0 p9h0Var = this.e;
                if (z6) {
                    j = 1000;
                    i = 3;
                    j2 = this.i + this.m;
                } else {
                    i = 3;
                    j = 1000;
                    if (p9h0Var.c == -9223372036854775807L) {
                        j3 = 0;
                    } else {
                        j2 = this.m;
                    }
                    s = this.k;
                    if (s == 8 || this.o == null) {
                        int i2 = 4;
                        if (s != 9 && this.p != null) {
                            if (!this.n) {
                                this.f.f(new ca5(-9223372036854775807L));
                                this.n = true;
                            }
                            tfu0 tfu0Var = this.p;
                            fq80 fq80VarG = g(guoVar);
                            tfu0Var.getClass();
                            int iZ2 = fq80VarG.z();
                            int i3 = (iZ2 >> 4) & 15;
                            int i4 = iZ2 & 15;
                            if (i4 != 7) {
                                throw new voo0(twn.m(i4, "Video format not supported: "));
                            }
                            tfu0Var.h = i3;
                            if (i3 != 5) {
                                fq80 fq80Var3 = tfu0Var.c;
                                ncs0 ncs0Var = (ncs0) tfu0Var.b;
                                fq80 fq80Var4 = tfu0Var.d;
                                int iZ3 = fq80VarG.z();
                                fq80VarG.f(i);
                                byte[] bArr = fq80VarG.f9961a;
                                int i5 = fq80VarG.b;
                                int i6 = i5 + 1;
                                fq80VarG.b = i6;
                                int i7 = ((bArr[i5] & 255) << 24) >> 8;
                                int i8 = i5 + 2;
                                fq80VarG.b = i8;
                                int i9 = ((bArr[i6] & 255) << 8) | i7;
                                fq80VarG.b = i5 + 3;
                                long j5 = (((long) (i9 | (bArr[i8] & 255))) * j) + j3;
                                if (iZ3 != 0 || tfu0Var.f) {
                                    if (iZ3 == 1 && tfu0Var.f) {
                                        int i10 = tfu0Var.h == 1 ? 1 : 0;
                                        if (tfu0Var.g || i10 != 0) {
                                            byte[] bArr2 = fq80Var4.f9961a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i11 = 4 - tfu0Var.e;
                                            int i12 = 0;
                                            while (fq80VarG.a() > 0) {
                                                fq80VarG.k(fq80Var4.f9961a, i11, tfu0Var.e);
                                                fq80Var4.M(0);
                                                int iD = fq80Var4.D();
                                                fq80Var3.M(0);
                                                ncs0Var.a(i2, fq80Var3);
                                                ncs0Var.a(iD, fq80VarG);
                                                i12 = i12 + 4 + iD;
                                                i2 = 4;
                                            }
                                            ((ncs0) tfu0Var.b).b(j5, i10, i12, 0, null);
                                            tfu0Var.g = true;
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    z3 = true;
                                } else {
                                    byte[] bArr3 = new byte[fq80VarG.a()];
                                    fq80 fq80Var5 = new fq80(bArr3);
                                    fq80VarG.k(bArr3, 0, fq80VarG.a());
                                    z95 z95VarA = z95.a(fq80Var5);
                                    tfu0Var.e = z95VarA.b;
                                    awq awqVar = new awq();
                                    awqVar.n = mg40.n("video/x-flv");
                                    awqVar.o = mg40.n("video/avc");
                                    awqVar.k = z95VarA.l;
                                    awqVar.v = z95VarA.c;
                                    awqVar.w = z95VarA.d;
                                    awqVar.D = z95VarA.k;
                                    awqVar.r = z95VarA.f44001a;
                                    ohs0.w(awqVar, ncs0Var);
                                    tfu0Var.f = true;
                                }
                                z2 = false;
                                if (z2) {
                                }
                                z3 = true;
                            }
                        } else if (s == 18 || this.n) {
                            guoVar.m(this.l);
                            z = false;
                            z3 = false;
                        } else {
                            fq80 fq80VarG2 = g(guoVar);
                            if (fq80VarG2.z() == 2 && "onMetaData".equals(p9h0.p1(fq80VarG2)) && fq80VarG2.a() != 0 && fq80VarG2.z() == 8) {
                                HashMap mapO1 = p9h0.o1(fq80VarG2);
                                Object obj = mapO1.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        p9h0Var.c = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapO1.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        p9h0Var.d = new long[size];
                                        p9h0Var.e = new long[size];
                                        for (int i13 = 0; i13 < size; i13++) {
                                            Object obj5 = list.get(i13);
                                            Object obj6 = list2.get(i13);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                p9h0Var.d = new long[0];
                                                p9h0Var.e = new long[0];
                                                break;
                                            }
                                            p9h0Var.d[i13] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            p9h0Var.e[i13] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j6 = p9h0Var.c;
                            if (j6 != -9223372036854775807L) {
                                this.f.f(new e5x(j6, p9h0Var.e, p9h0Var.d));
                                this.n = true;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!this.n) {
                            this.f.f(new ca5(-9223372036854775807L));
                            this.n = true;
                        }
                        e44 e44Var = this.o;
                        fq80 fq80VarG3 = g(guoVar);
                        ncs0 ncs0Var2 = (ncs0) e44Var.b;
                        if (e44Var.c) {
                            fq80VarG3.N(1);
                        } else {
                            int iZ4 = fq80VarG3.z();
                            int i14 = (iZ4 >> 4) & 15;
                            e44Var.e = i14;
                            if (i14 == 2) {
                                int i15 = e44.f[(iZ4 >> 2) & 3];
                                awq awqVar2 = new awq();
                                awqVar2.n = mg40.n("video/x-flv");
                                awqVar2.o = mg40.n("audio/mpeg");
                                awqVar2.I = 1;
                                awqVar2.K = i15;
                                ohs0.w(awqVar2, ncs0Var2);
                                e44Var.d = true;
                            } else if (i14 == 7 || i14 == 8) {
                                String str = i14 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                awq awqVar3 = new awq();
                                awqVar3.n = mg40.n("video/x-flv");
                                awqVar3.o = mg40.n(str);
                                awqVar3.I = 1;
                                awqVar3.K = JosStatusCodes.RTN_CODE_COMMON_ERROR;
                                ohs0.w(awqVar3, ncs0Var2);
                                e44Var.d = true;
                            } else if (i14 != 10) {
                                throw new voo0("Audio format not supported: " + e44Var.e);
                            }
                            e44Var.c = true;
                        }
                        ncs0 ncs0Var3 = (ncs0) e44Var.b;
                        if (e44Var.e == 2) {
                            int iA = fq80VarG3.a();
                            ncs0Var3.a(iA, fq80VarG3);
                            ((ncs0) e44Var.b).b(j3, 1, iA, 0, null);
                        } else {
                            int iZ5 = fq80VarG3.z();
                            if (iZ5 == 0 && !e44Var.d) {
                                int iA2 = fq80VarG3.a();
                                byte[] bArr4 = new byte[iA2];
                                fq80VarG3.k(bArr4, 0, iA2);
                                cf60 cf60VarE = cy2.E(new q8b(bArr4, iA2), false);
                                awq awqVar4 = new awq();
                                awqVar4.n = mg40.n("video/x-flv");
                                awqVar4.o = mg40.n("audio/mp4a-latm");
                                awqVar4.k = (String) cf60VarE.d;
                                awqVar4.I = cf60VarE.c;
                                awqVar4.K = cf60VarE.b;
                                awqVar4.r = Collections.singletonList(bArr4);
                                ohs0.w(awqVar4, ncs0Var3);
                                e44Var.d = true;
                            } else if (e44Var.e != 10 || iZ5 == 1) {
                                int iA3 = fq80VarG3.a();
                                ncs0Var3.a(iA3, fq80VarG3);
                                ((ncs0) e44Var.b).b(j3, 1, iA3, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        if (p9h0Var.c == -9223372036854775807L) {
                            j4 = -this.m;
                        } else {
                            j4 = 0;
                        }
                        this.i = j4;
                    }
                    this.j = 4;
                    this.g = (byte) 2;
                    if (z3) {
                        return 0;
                    }
                }
                j3 = j2;
                s = this.k;
                if (s == 8) {
                    int i16 = 4;
                    if (s != 9) {
                        if (s == 18) {
                        }
                        guoVar.m(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (s == 18) {
                        }
                        guoVar.m(this.l);
                        z = false;
                        z3 = false;
                    }
                } else {
                    int i17 = 4;
                    if (s != 9) {
                        if (s == 18) {
                        }
                        guoVar.m(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (s == 18) {
                        }
                        guoVar.m(this.l);
                        z = false;
                        z3 = false;
                    }
                }
                if (!this.h) {
                    this.h = true;
                    if (p9h0Var.c == -9223372036854775807L) {
                        j4 = -this.m;
                    } else {
                        j4 = 0;
                    }
                    this.i = j4;
                }
                this.j = 4;
                this.g = (byte) 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 1;
            this.h = false;
        } else {
            this.g = (byte) 3;
        }
        this.j = 0;
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) throws EOFException, InterruptedIOException {
        fq80 fq80Var = this.f11695a;
        guj gujVar = (guj) guoVar;
        gujVar.b(fq80Var.f9961a, 0, 3, false);
        fq80Var.M(0);
        if (fq80Var.C() == 4607062) {
            gujVar.b(fq80Var.f9961a, 0, 2, false);
            fq80Var.M(0);
            if ((fq80Var.G() & 250) == 0) {
                gujVar.b(fq80Var.f9961a, 0, 4, false);
                fq80Var.M(0);
                int iM = fq80Var.m();
                gujVar.f = 0;
                gujVar.f(iM, false);
                gujVar.b(fq80Var.f9961a, 0, 4, false);
                fq80Var.M(0);
                if (fq80Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.f = huoVar;
    }

    public final fq80 g(guo guoVar) {
        int i = this.l;
        fq80 fq80Var = this.d;
        byte[] bArr = fq80Var.f9961a;
        if (i > bArr.length) {
            fq80Var.K(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            fq80Var.M(0);
        }
        fq80Var.L(this.l);
        guoVar.readFully(fq80Var.f9961a, 0, this.l);
        return fq80Var;
    }

    @Override // a.fuo
    public final void release() {
    }
}
