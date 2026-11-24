package a;

import java.io.EOFException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class av40 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1510a;
    public final fq80 b;
    public final mv40 c;
    public final met d;
    public final hru e;
    public final pnk f;
    public huo g;
    public ncs0 h;
    public ncs0 i;
    public int j;
    public ed40 k;
    public ed40 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public rvh0 r;
    public boolean s;
    public boolean t;
    public long u;

    public av40(long j) {
        this.f1510a = j;
        this.b = new fq80(10);
        this.c = new mv40();
        this.d = new met();
        this.m = -9223372036854775807L;
        this.e = new hru((byte) 18);
        pnk pnkVar = new pnk();
        this.f = pnkVar;
        this.i = pnkVar;
        this.p = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0245  */
    /* JADX WARN: Code duplicated, block: B:104:0x0285  */
    /* JADX WARN: Code duplicated, block: B:107:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0294  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:11:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:129:0x030b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:131:0x030f  */
    /* JADX WARN: Code duplicated, block: B:133:0x031b  */
    /* JADX WARN: Code duplicated, block: B:135:0x031f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0333  */
    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:142:0x0359  */
    /* JADX WARN: Code duplicated, block: B:143:0x035d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0363  */
    /* JADX WARN: Code duplicated, block: B:147:0x0371  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0380  */
    /* JADX WARN: Code duplicated, block: B:153:0x0385 A[LOOP:0: B:144:0x0361->B:153:0x0385, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x038f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0397  */
    /* JADX WARN: Code duplicated, block: B:162:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:165:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:168:0x03be A[LOOP:1: B:159:0x0395->B:168:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:173:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ec A[LOOP:2: B:175:0x03ea->B:176:0x03ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x041d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0428 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x042a  */
    /* JADX WARN: Code duplicated, block: B:183:0x042e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0430  */
    /* JADX WARN: Code duplicated, block: B:185:0x0435  */
    /* JADX WARN: Code duplicated, block: B:189:0x046d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0488 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x048a  */
    /* JADX WARN: Code duplicated, block: B:197:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:199:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:203:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:208:0x0508  */
    /* JADX WARN: Code duplicated, block: B:209:0x050f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0527  */
    /* JADX WARN: Code duplicated, block: B:213:0x052e  */
    /* JADX WARN: Code duplicated, block: B:214:0x0535  */
    /* JADX WARN: Code duplicated, block: B:216:0x0543  */
    /* JADX WARN: Code duplicated, block: B:218:0x0555  */
    /* JADX WARN: Code duplicated, block: B:222:0x0579  */
    /* JADX WARN: Code duplicated, block: B:224:0x0586  */
    /* JADX WARN: Code duplicated, block: B:226:0x0592 A[PHI: r22
  0x0592: PHI (r22v4 long) = (r22v3 long), (r22v7 long) binds: [B:232:0x05ae, B:225:0x058c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:227:0x0595  */
    /* JADX WARN: Code duplicated, block: B:230:0x05a6 A[PHI: r22
  0x05a6: PHI (r22v5 long) = (r22v3 long), (r22v10 long) binds: [B:229:0x05a4, B:208:0x0508] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:231:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:234:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:248:0x060a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x038a A[EDGE_INSN: B:258:0x038a->B:155:0x038a BREAK  A[LOOP:0: B:144:0x0361->B:153:0x0385], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x03c3 A[EDGE_INSN: B:259:0x03c3->B:170:0x03c3 BREAK  A[LOOP:1: B:159:0x0395->B:168:0x03be], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:42:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:50:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:59:0x015e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9 A[LOOP:4: B:77:0x01b7->B:78:0x01b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x020e  */
    /* JADX WARN: Code duplicated, block: B:96:0x022b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws Throwable {
        met metVar;
        Throwable th;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        int i3;
        rvh0 rvh0Var;
        fq80 fq80Var;
        int i4;
        fq80 fq80Var2;
        long j5;
        long position;
        long j6;
        int iE;
        int i5;
        int iM;
        int i6;
        long j7;
        fq80 fq80Var3;
        int i7;
        int i8;
        int i9;
        int iM2;
        fq80 fq80Var4;
        int iM3;
        int iD;
        long jMin;
        long[] jArr;
        fq80 fq80Var5;
        cv40 cv40Var;
        int iMax;
        int i10;
        mdw0 mdw0Var;
        long j8;
        mv40 mv40Var;
        ed40 ed40Var;
        long position2;
        long length;
        long jA;
        long j9;
        long j10;
        int iV;
        rvh0 q2eVar;
        long length2;
        long jA2;
        String strX;
        float fIntBitsToFloat;
        bv40 bv40VarA;
        bv40 bv40VarA2;
        long[] jArr2;
        int i11;
        ed40 ed40Var2;
        long position3;
        cd40[] cd40VarArr;
        int length3;
        int i12;
        cd40 cd40Var;
        ol40 ol40Var;
        int[] iArr;
        cd40[] cd40VarArr2;
        int length4;
        int i13;
        cd40 cd40Var2;
        h8q0 h8q0Var;
        char c;
        long jM;
        int length5;
        long[] jArr3;
        long[] jArr4;
        long j11;
        int i14;
        pl40 pl40Var;
        cd40 cd40Var3;
        cd40 cd40Var4;
        rvh0 q2eVar2;
        ed40 ed40VarB;
        ed40 ed40Var3;
        awq awqVar;
        long length6;
        long position4;
        long j12;
        long j13;
        int iM4;
        long jR;
        int iG;
        int iG2;
        int iG3;
        long[] jArr5;
        long[] jArr6;
        long j14;
        int i15;
        long j15;
        long jMax;
        fq80 fq80Var6;
        int iZ;
        this.h.getClass();
        String str = vtt0.f38024a;
        int i16 = this.j;
        met metVar2 = this.d;
        mv40 mv40Var2 = this.c;
        if (i16 == 0) {
            try {
                i(guoVar, false);
                rvh0Var = this.r;
                th = null;
                fq80Var = this.b;
                j = 1000000;
                i4 = 1;
                if (rvh0Var == null) {
                    fq80Var3 = new fq80(mv40Var2.b);
                    j2 = 1;
                    guoVar.n(fq80Var3.f9961a, 0, mv40Var2.b);
                    i7 = mv40Var2.f22441a & 1;
                    i8 = mv40Var2.d;
                    if (i7 != 0) {
                        if (i8 != 1) {
                            i9 = 36;
                        } else {
                            i9 = 21;
                        }
                    } else if (i8 != 1) {
                        i9 = 21;
                    } else {
                        i9 = 13;
                    }
                    j5 = 0;
                    if (fq80Var3.c >= i9 + 4) {
                        fq80Var3.M(i9);
                        iM2 = fq80Var3.m();
                        if (iM2 != 1483304551 && iM2 != 1231971951) {
                            if (fq80Var3.c >= 40) {
                                fq80Var3.M(36);
                                if (fq80Var3.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (fq80Var3.c >= 40) {
                        fq80Var3.M(36);
                        if (fq80Var3.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    if (iM2 == 1231971951) {
                        fq80Var4 = fq80Var;
                        iM3 = fq80Var3.m();
                        if ((iM3 & 1) != 0) {
                            iD = fq80Var3.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = fq80Var3.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            for (i11 = 0; i11 < 100; i11++) {
                                jArr2[i11] = fq80Var3.z();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            fq80Var5 = fq80Var3;
                            fq80Var5.N(4);
                        } else {
                            fq80Var5 = fq80Var3;
                        }
                        if (fq80Var5.a() >= 24) {
                            strX = fq80Var5.x(9, StandardCharsets.UTF_8);
                            fq80Var5.N(2);
                            fIntBitsToFloat = Float.intBitsToFloat(fq80Var5.m());
                            int iG4 = fq80Var5.G();
                            int iG5 = fq80Var5.G();
                            bv40VarA = bv40.a(iG4);
                            bv40VarA2 = bv40.a(iG5);
                            if (fIntBitsToFloat > 0.0f && bv40VarA == null && bv40VarA2 == null) {
                                cv40Var = null;
                            } else {
                                cv40Var = new cv40(fIntBitsToFloat, bv40VarA, bv40VarA2);
                            }
                            fq80Var5.N(2);
                            int iC = fq80Var5.C();
                            i10 = (16773120 & iC) >> 12;
                            iMax = iC & 4095;
                            if (strX.startsWith("LAME") || strX.startsWith("Lavf") || strX.startsWith("Lavc")) {
                                i10 += 529;
                                iMax = Math.max(0, iMax - 529);
                            }
                        } else {
                            cv40Var = null;
                            iMax = -1;
                            i10 = -1;
                        }
                        j8 = iD;
                        mdw0Var = new mdw0();
                        mv40 mv40Var3 = new mv40();
                        mv40Var3.f22441a = mv40Var2.f22441a;
                        mv40Var3.g = (String) mv40Var2.g;
                        mv40Var3.b = mv40Var2.b;
                        mv40Var3.c = mv40Var2.c;
                        mv40Var3.d = mv40Var2.d;
                        mv40Var3.e = mv40Var2.e;
                        mv40Var3.f = mv40Var2.f;
                        mdw0Var.c = mv40Var3;
                        mdw0Var.b = j8;
                        mdw0Var.f21617a = i10;
                        mdw0Var.d = iMax;
                        mv40Var = (mv40) mdw0Var.c;
                        metVar = metVar2;
                        if ((metVar.f21663a != -1 || metVar.b == -1) && i10 != -1 && iMax != -1) {
                            metVar.f21663a = i10;
                            metVar.b = iMax;
                        }
                        if (cv40Var != null) {
                            ed40Var = new ed40(cv40Var);
                        } else {
                            ed40Var = null;
                        }
                        this.l = ed40Var;
                        position2 = guoVar.getPosition();
                        guoVar.m(mv40Var2.b);
                        if (iM2 == 1483304551) {
                            length2 = guoVar.getLength();
                            jA2 = mdw0Var.a();
                            if (jA2 == -9223372036854775807L) {
                                q2eVar = null;
                            } else {
                                if (jMin != -1 && length2 != -1 && position2 + jMin != length2) {
                                    long j16 = length2 - position2;
                                    StringBuilder sbQ = kng0.q(j16, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbQ.append(jMin);
                                    sbQ.append("), using smaller value.");
                                    f1t0.a0("XingSeeker", sbQ.toString());
                                    jMin = Math.min(jMin, j16);
                                }
                                q2eVar = new r1w0(position2, mv40Var.b, jA2, jMin, jArr);
                            }
                        } else {
                            length = guoVar.getLength();
                            jA = mdw0Var.a();
                            if (jA != -9223372036854775807L) {
                                if (jMin != -1) {
                                    length = position2 + jMin;
                                    j9 = jMin - ((long) mv40Var.b);
                                } else if (length != -1) {
                                    j9 = (length - position2) - ((long) mv40Var.b);
                                } else {
                                    q2eVar = null;
                                }
                                j10 = length;
                                iV = m7x.v(j9, jA);
                                if (iV == -2147483647) {
                                    q2eVar = null;
                                } else {
                                    q2eVar = new q2e(iV, n6x.s(vvw.v(j9, j8, RoundingMode.HALF_UP)), j10, position2 + ((long) mv40Var.b), jA, false, true);
                                }
                            } else {
                                q2eVar = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        length6 = guoVar.getLength();
                        position4 = guoVar.getPosition();
                        fq80Var3.N(6);
                        int iM5 = fq80Var3.m();
                        j12 = position4 + ((long) mv40Var2.b);
                        j13 = j12 + ((long) iM5);
                        iM4 = fq80Var3.m();
                        if (iM4 <= 0) {
                            jR = vtt0.R(mv40Var2.c, (((long) iM4) * ((long) mv40Var2.f)) - 1);
                            iG = fq80Var3.G();
                            iG2 = fq80Var3.G();
                            iG3 = fq80Var3.G();
                            fq80Var3.N(2);
                            jArr5 = new long[iG];
                            jArr6 = new long[iG];
                            j14 = position4 + ((long) mv40Var2.b);
                            i15 = 0;
                            while (true) {
                                if (i15 < iG) {
                                    fq80Var4 = fq80Var;
                                    if (length6 != -1 || length6 == j13) {
                                        j15 = j13;
                                    } else {
                                        StringBuilder sbQ2 = kng0.q(length6, "VBRI data size mismatch: ", ", ");
                                        j15 = j13;
                                        sbQ2.append(j15);
                                        f1t0.g0("VbriSeeker", sbQ2.toString());
                                    }
                                    if (j15 != j14) {
                                        StringBuilder sbQ3 = kng0.q(j15, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        sbQ3.append(j14);
                                        sbQ3.append("\nSeeking will be inaccurate.");
                                        f1t0.g0("VbriSeeker", sbQ3.toString());
                                        jMax = Math.max(j15, j14);
                                    } else {
                                        jMax = j15;
                                    }
                                    q2eVar = new v3u0(jArr5, jArr6, jR, j12, jMax);
                                    break;
                                }
                                fq80Var6 = fq80Var3;
                                fq80Var4 = fq80Var;
                                jArr5[i15] = (((long) i15) * jR) / ((long) iG);
                                jArr6[i15] = j14;
                                if (iG3 != i4) {
                                    iZ = fq80Var6.z();
                                } else if (iG3 != 2) {
                                    iZ = fq80Var6.G();
                                } else if (iG3 != 3) {
                                    iZ = fq80Var6.C();
                                } else {
                                    if (iG3 != 4) {
                                        q2eVar = null;
                                        break;
                                    }
                                    iZ = fq80Var6.D();
                                }
                                j14 += ((long) iZ) * ((long) iG2);
                                i15++;
                                fq80Var = fq80Var4;
                                fq80Var3 = fq80Var6;
                                iG = iG;
                                i4 = 1;
                            }
                        } else {
                            q2eVar = null;
                            fq80Var4 = fq80Var;
                        }
                        guoVar.m(mv40Var2.b);
                        metVar = metVar2;
                    } else if (iM2 != 1483304551) {
                        guoVar.g();
                        q2eVar = null;
                        fq80Var4 = fq80Var;
                        metVar = metVar2;
                    } else {
                        fq80Var4 = fq80Var;
                        iM3 = fq80Var3.m();
                        if ((iM3 & 1) != 0) {
                            iD = fq80Var3.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = fq80Var3.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            while (i11 < 100) {
                                jArr2[i11] = fq80Var3.z();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            fq80Var5 = fq80Var3;
                            fq80Var5.N(4);
                        } else {
                            fq80Var5 = fq80Var3;
                        }
                        if (fq80Var5.a() >= 24) {
                            strX = fq80Var5.x(9, StandardCharsets.UTF_8);
                            fq80Var5.N(2);
                            fIntBitsToFloat = Float.intBitsToFloat(fq80Var5.m());
                            int iG6 = fq80Var5.G();
                            int iG7 = fq80Var5.G();
                            bv40VarA = bv40.a(iG6);
                            bv40VarA2 = bv40.a(iG7);
                            if (fIntBitsToFloat > 0.0f) {
                                cv40Var = new cv40(fIntBitsToFloat, bv40VarA, bv40VarA2);
                            } else {
                                cv40Var = new cv40(fIntBitsToFloat, bv40VarA, bv40VarA2);
                            }
                            fq80Var5.N(2);
                            int iC2 = fq80Var5.C();
                            i10 = (16773120 & iC2) >> 12;
                            iMax = iC2 & 4095;
                            if (strX.startsWith("LAME")) {
                                i10 += 529;
                                iMax = Math.max(0, iMax - 529);
                            } else {
                                i10 += 529;
                                iMax = Math.max(0, iMax - 529);
                            }
                        } else {
                            cv40Var = null;
                            iMax = -1;
                            i10 = -1;
                        }
                        j8 = iD;
                        mdw0Var = new mdw0();
                        mv40 mv40Var4 = new mv40();
                        mv40Var4.f22441a = mv40Var2.f22441a;
                        mv40Var4.g = (String) mv40Var2.g;
                        mv40Var4.b = mv40Var2.b;
                        mv40Var4.c = mv40Var2.c;
                        mv40Var4.d = mv40Var2.d;
                        mv40Var4.e = mv40Var2.e;
                        mv40Var4.f = mv40Var2.f;
                        mdw0Var.c = mv40Var4;
                        mdw0Var.b = j8;
                        mdw0Var.f21617a = i10;
                        mdw0Var.d = iMax;
                        mv40Var = (mv40) mdw0Var.c;
                        metVar = metVar2;
                        if (metVar.f21663a != -1) {
                            metVar.f21663a = i10;
                            metVar.b = iMax;
                        } else {
                            metVar.f21663a = i10;
                            metVar.b = iMax;
                        }
                        if (cv40Var != null) {
                            ed40Var = new ed40(cv40Var);
                        } else {
                            ed40Var = null;
                        }
                        this.l = ed40Var;
                        position2 = guoVar.getPosition();
                        guoVar.m(mv40Var2.b);
                        if (iM2 == 1483304551) {
                            length2 = guoVar.getLength();
                            jA2 = mdw0Var.a();
                            if (jA2 == -9223372036854775807L) {
                                q2eVar = null;
                            } else {
                                if (jMin != -1) {
                                    long j17 = length2 - position2;
                                    StringBuilder sbQ4 = kng0.q(j17, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbQ4.append(jMin);
                                    sbQ4.append("), using smaller value.");
                                    f1t0.a0("XingSeeker", sbQ4.toString());
                                    jMin = Math.min(jMin, j17);
                                }
                                q2eVar = new r1w0(position2, mv40Var.b, jA2, jMin, jArr);
                            }
                        } else {
                            length = guoVar.getLength();
                            jA = mdw0Var.a();
                            if (jA != -9223372036854775807L) {
                                if (jMin != -1) {
                                    length = position2 + jMin;
                                    j9 = jMin - ((long) mv40Var.b);
                                } else if (length != -1) {
                                    j9 = (length - position2) - ((long) mv40Var.b);
                                } else {
                                    q2eVar = null;
                                }
                                j10 = length;
                                iV = m7x.v(j9, jA);
                                if (iV == -2147483647) {
                                    q2eVar = null;
                                } else {
                                    q2eVar = new q2e(iV, n6x.s(vvw.v(j9, j8, RoundingMode.HALF_UP)), j10, position2 + ((long) mv40Var.b), jA, false, true);
                                }
                            } else {
                                q2eVar = null;
                            }
                        }
                    }
                    ed40Var2 = this.k;
                    position3 = guoVar.getPosition();
                    if (ed40Var2 == null) {
                        pl40Var = null;
                    } else {
                        cd40VarArr = ed40Var2.f7600a;
                        length3 = cd40VarArr.length;
                        i12 = 0;
                        while (true) {
                            if (i12 < length3) {
                                cd40Var = null;
                                break;
                            }
                            cd40Var4 = cd40VarArr[i12];
                            if (ol40.class.isAssignableFrom(cd40Var4.getClass())) {
                                cd40Var = (cd40) ol40.class.cast(cd40Var4);
                                if (!rsb0.f31024a.apply(cd40Var)) {
                                    cd40Var = null;
                                }
                            } else {
                                cd40Var = null;
                            }
                            if (cd40Var != null) {
                                break;
                            }
                            i12++;
                        }
                        ol40Var = (ol40) cd40Var;
                        if (ol40Var == null) {
                            pl40Var = null;
                        } else {
                            iArr = ol40Var.e;
                            cd40VarArr2 = ed40Var2.f7600a;
                            length4 = cd40VarArr2.length;
                            i13 = 0;
                            while (true) {
                                if (i13 < length4) {
                                    cd40Var2 = null;
                                    break;
                                }
                                cd40Var3 = cd40VarArr2[i13];
                                if (h8q0.class.isAssignableFrom(cd40Var3.getClass())) {
                                    cd40Var2 = (cd40) h8q0.class.cast(cd40Var3);
                                    if (!((h8q0) cd40Var2).f10332a.equals("TLEN")) {
                                        cd40Var2 = null;
                                    }
                                } else {
                                    cd40Var2 = null;
                                }
                                if (cd40Var2 != null) {
                                    break;
                                }
                                i13++;
                            }
                            h8q0Var = (h8q0) cd40Var2;
                            if (h8q0Var == null) {
                                jM = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jM = vtt0.M(Long.parseLong((String) h8q0Var.c.get(0)));
                            }
                            length5 = iArr.length;
                            int i17 = length5 + 1;
                            jArr3 = new long[i17];
                            jArr4 = new long[i17];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j11 = 0;
                            i14 = 1;
                            while (i14 <= length5) {
                                int i18 = i14 - 1;
                                long j18 = position3 + ((long) (ol40Var.c + iArr[i18]));
                                j11 += (long) (ol40Var.d + ol40Var.f[i18]);
                                jArr3[i14] = j18;
                                jArr4[i14] = j11;
                                i14++;
                                length5 = length5;
                                position3 = j18;
                            }
                            pl40Var = new pl40(jM, jArr3, jArr4);
                        }
                    }
                    if (this.s) {
                        q2eVar2 = new qvh0(-9223372036854775807L);
                        fq80Var2 = fq80Var4;
                    } else {
                        if (pl40Var != null) {
                            q2eVar2 = pl40Var;
                            fq80Var2 = fq80Var4;
                        } else if (q2eVar != null) {
                            fq80Var2 = fq80Var4;
                            q2eVar2 = q2eVar;
                        } else {
                            fq80Var2 = fq80Var4;
                            guoVar.n(fq80Var2.f9961a, 0, 4);
                            fq80Var2.M(0);
                            mv40Var2.d(fq80Var2.m());
                            q2eVar2 = new q2e(mv40Var2.e, mv40Var2.b, guoVar.getLength(), guoVar.getPosition(), -9223372036854775807L, false, true);
                        }
                        if (!(q2eVar2 instanceof q2e)) {
                            q2eVar2.d();
                        }
                    }
                    this.r = q2eVar2;
                    this.h.f(q2eVar2.g());
                    this.g.f(this.r);
                    ed40VarB = this.k;
                    ed40Var3 = this.l;
                    if (ed40VarB != null) {
                        if (ed40Var3 != null) {
                            ed40VarB = ed40VarB.b(ed40Var3);
                        }
                        ed40Var3 = ed40VarB;
                    }
                    awqVar = new awq();
                    awqVar.n = mg40.n("audio/mpeg");
                    awqVar.o = mg40.n((String) mv40Var2.g);
                    awqVar.p = 4096;
                    awqVar.I = mv40Var2.d;
                    awqVar.K = mv40Var2.c;
                    awqVar.M = metVar.f21663a;
                    awqVar.N = metVar.b;
                    awqVar.l = ed40Var3;
                    if (this.r.f() != -2147483647) {
                        awqVar.i = this.r.f();
                    }
                    this.i.c(new androidx.media3.common.b(awqVar));
                    this.o = guoVar.getPosition();
                } else {
                    fq80Var2 = fq80Var;
                    metVar = metVar2;
                    j2 = 1;
                    j5 = 0;
                    if (this.o != 0) {
                        position = guoVar.getPosition();
                        j6 = this.o;
                        if (position < j6) {
                            guoVar.m((int) (j6 - position));
                        }
                    }
                }
                if (this.q == 0) {
                    guoVar.g();
                    if (h(guoVar)) {
                        j3 = -9223372036854775807L;
                    } else {
                        fq80Var2.M(0);
                        iM = fq80Var2.m();
                        if (((-128000) & iM) == (((long) this.j) & (-128000))) {
                            j3 = -9223372036854775807L;
                            i6 = 1;
                        } else if (saj.S(iM) == -1) {
                            i6 = 1;
                            j3 = -9223372036854775807L;
                        } else {
                            mv40Var2.d(iM);
                            j3 = -9223372036854775807L;
                            if (this.m == -9223372036854775807L) {
                                this.m = this.r.e(guoVar.getPosition());
                                j7 = this.f1510a;
                                if (j7 != -9223372036854775807L) {
                                    this.m = (j7 - this.r.e(j5)) + this.m;
                                }
                            }
                            this.q = mv40Var2.b;
                            this.p = guoVar.getPosition() + ((long) mv40Var2.b);
                            if (this.r instanceof f5x) {
                                long j19 = ((this.n + ((long) mv40Var2.f)) * 1000000) / ((long) mv40Var2.c);
                                throw null;
                            }
                        }
                        guoVar.m(i6);
                        this.j = 0;
                        i = -1;
                        i2 = 0;
                    }
                    i = -1;
                    i2 = -1;
                } else {
                    j3 = -9223372036854775807L;
                }
                iE = this.i.e(guoVar, this.q, true);
                if (iE == -1) {
                    i = -1;
                    i2 = -1;
                } else {
                    i5 = this.q - iE;
                    this.q = i5;
                    if (i5 > 0) {
                        i = -1;
                        i2 = 0;
                    } else {
                        this.i.b(((this.n * 1000000) / ((long) mv40Var2.c)) + this.m, 1, mv40Var2.b, 0, null);
                        this.n += (long) mv40Var2.f;
                        this.q = 0;
                        i2 = 0;
                        i = -1;
                    }
                }
            } catch (EOFException unused) {
                metVar = metVar2;
                th = null;
                i = -1;
                i2 = -1;
                j = 1000000;
                j2 = 1;
                j3 = -9223372036854775807L;
            }
        } else {
            rvh0Var = this.r;
            th = null;
            fq80Var = this.b;
            j = 1000000;
            i4 = 1;
            if (rvh0Var == null) {
                fq80Var3 = new fq80(mv40Var2.b);
                j2 = 1;
                guoVar.n(fq80Var3.f9961a, 0, mv40Var2.b);
                i7 = mv40Var2.f22441a & 1;
                i8 = mv40Var2.d;
                if (i7 != 0) {
                    if (i8 != 1) {
                        i9 = 36;
                    } else {
                        i9 = 21;
                    }
                } else if (i8 != 1) {
                    i9 = 21;
                } else {
                    i9 = 13;
                }
                j5 = 0;
                if (fq80Var3.c >= i9 + 4) {
                    fq80Var3.M(i9);
                    iM2 = fq80Var3.m();
                    if (iM2 != 1483304551) {
                        if (fq80Var3.c >= 40) {
                            fq80Var3.M(36);
                            if (fq80Var3.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                    }
                } else if (fq80Var3.c >= 40) {
                    fq80Var3.M(36);
                    if (fq80Var3.m() == 1447187017) {
                        iM2 = 1447187017;
                    } else {
                        iM2 = 0;
                    }
                } else {
                    iM2 = 0;
                }
                if (iM2 == 1231971951) {
                    fq80Var4 = fq80Var;
                    iM3 = fq80Var3.m();
                    if ((iM3 & 1) != 0) {
                        iD = fq80Var3.D();
                    } else {
                        iD = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jMin = fq80Var3.B();
                    } else {
                        jMin = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i11 < 100) {
                            jArr2[i11] = fq80Var3.z();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        fq80Var5 = fq80Var3;
                        fq80Var5.N(4);
                    } else {
                        fq80Var5 = fq80Var3;
                    }
                    if (fq80Var5.a() >= 24) {
                        strX = fq80Var5.x(9, StandardCharsets.UTF_8);
                        fq80Var5.N(2);
                        fIntBitsToFloat = Float.intBitsToFloat(fq80Var5.m());
                        int iG8 = fq80Var5.G();
                        int iG9 = fq80Var5.G();
                        bv40VarA = bv40.a(iG8);
                        bv40VarA2 = bv40.a(iG9);
                        if (fIntBitsToFloat > 0.0f) {
                            cv40Var = new cv40(fIntBitsToFloat, bv40VarA, bv40VarA2);
                        } else {
                            cv40Var = new cv40(fIntBitsToFloat, bv40VarA, bv40VarA2);
                        }
                        fq80Var5.N(2);
                        int iC3 = fq80Var5.C();
                        i10 = (16773120 & iC3) >> 12;
                        iMax = iC3 & 4095;
                        if (strX.startsWith("LAME")) {
                            i10 += 529;
                            iMax = Math.max(0, iMax - 529);
                        } else {
                            i10 += 529;
                            iMax = Math.max(0, iMax - 529);
                        }
                    } else {
                        cv40Var = null;
                        iMax = -1;
                        i10 = -1;
                    }
                    j8 = iD;
                    mdw0Var = new mdw0();
                    mv40 mv40Var5 = new mv40();
                    mv40Var5.f22441a = mv40Var2.f22441a;
                    mv40Var5.g = (String) mv40Var2.g;
                    mv40Var5.b = mv40Var2.b;
                    mv40Var5.c = mv40Var2.c;
                    mv40Var5.d = mv40Var2.d;
                    mv40Var5.e = mv40Var2.e;
                    mv40Var5.f = mv40Var2.f;
                    mdw0Var.c = mv40Var5;
                    mdw0Var.b = j8;
                    mdw0Var.f21617a = i10;
                    mdw0Var.d = iMax;
                    mv40Var = (mv40) mdw0Var.c;
                    metVar = metVar2;
                    if (metVar.f21663a != -1) {
                        metVar.f21663a = i10;
                        metVar.b = iMax;
                    } else {
                        metVar.f21663a = i10;
                        metVar.b = iMax;
                    }
                    if (cv40Var != null) {
                        ed40Var = new ed40(cv40Var);
                    } else {
                        ed40Var = null;
                    }
                    this.l = ed40Var;
                    position2 = guoVar.getPosition();
                    guoVar.m(mv40Var2.b);
                    if (iM2 == 1483304551) {
                        length2 = guoVar.getLength();
                        jA2 = mdw0Var.a();
                        if (jA2 == -9223372036854775807L) {
                            q2eVar = null;
                        } else {
                            if (jMin != -1) {
                                long j110 = length2 - position2;
                                StringBuilder sbQ5 = kng0.q(j110, "Data size mismatch between stream (", ") and Xing frame (");
                                sbQ5.append(jMin);
                                sbQ5.append("), using smaller value.");
                                f1t0.a0("XingSeeker", sbQ5.toString());
                                jMin = Math.min(jMin, j110);
                            }
                            q2eVar = new r1w0(position2, mv40Var.b, jA2, jMin, jArr);
                        }
                    } else {
                        length = guoVar.getLength();
                        jA = mdw0Var.a();
                        if (jA != -9223372036854775807L) {
                            if (jMin != -1) {
                                length = position2 + jMin;
                                j9 = jMin - ((long) mv40Var.b);
                            } else if (length != -1) {
                                j9 = (length - position2) - ((long) mv40Var.b);
                            } else {
                                q2eVar = null;
                            }
                            j10 = length;
                            iV = m7x.v(j9, jA);
                            if (iV == -2147483647) {
                                q2eVar = null;
                            } else {
                                q2eVar = new q2e(iV, n6x.s(vvw.v(j9, j8, RoundingMode.HALF_UP)), j10, position2 + ((long) mv40Var.b), jA, false, true);
                            }
                        } else {
                            q2eVar = null;
                        }
                    }
                } else if (iM2 != 1447187017) {
                    length6 = guoVar.getLength();
                    position4 = guoVar.getPosition();
                    fq80Var3.N(6);
                    int iM6 = fq80Var3.m();
                    j12 = position4 + ((long) mv40Var2.b);
                    j13 = j12 + ((long) iM6);
                    iM4 = fq80Var3.m();
                    if (iM4 <= 0) {
                        jR = vtt0.R(mv40Var2.c, (((long) iM4) * ((long) mv40Var2.f)) - 1);
                        iG = fq80Var3.G();
                        iG2 = fq80Var3.G();
                        iG3 = fq80Var3.G();
                        fq80Var3.N(2);
                        jArr5 = new long[iG];
                        jArr6 = new long[iG];
                        j14 = position4 + ((long) mv40Var2.b);
                        i15 = 0;
                        while (true) {
                            if (i15 < iG) {
                                fq80Var4 = fq80Var;
                                if (length6 != -1) {
                                    j15 = j13;
                                } else {
                                    j15 = j13;
                                }
                                if (j15 != j14) {
                                    StringBuilder sbQ6 = kng0.q(j15, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                    sbQ6.append(j14);
                                    sbQ6.append("\nSeeking will be inaccurate.");
                                    f1t0.g0("VbriSeeker", sbQ6.toString());
                                    jMax = Math.max(j15, j14);
                                } else {
                                    jMax = j15;
                                }
                                q2eVar = new v3u0(jArr5, jArr6, jR, j12, jMax);
                                break;
                            }
                            fq80Var6 = fq80Var3;
                            fq80Var4 = fq80Var;
                            jArr5[i15] = (((long) i15) * jR) / ((long) iG);
                            jArr6[i15] = j14;
                            if (iG3 != i4) {
                                iZ = fq80Var6.z();
                            } else if (iG3 != 2) {
                                iZ = fq80Var6.G();
                            } else if (iG3 != 3) {
                                iZ = fq80Var6.C();
                            } else {
                                if (iG3 != 4) {
                                    q2eVar = null;
                                    break;
                                }
                                iZ = fq80Var6.D();
                            }
                            j14 += ((long) iZ) * ((long) iG2);
                            i15++;
                            fq80Var = fq80Var4;
                            fq80Var3 = fq80Var6;
                            iG = iG;
                            i4 = 1;
                        }
                    } else {
                        q2eVar = null;
                        fq80Var4 = fq80Var;
                    }
                    guoVar.m(mv40Var2.b);
                    metVar = metVar2;
                } else if (iM2 != 1483304551) {
                    guoVar.g();
                    q2eVar = null;
                    fq80Var4 = fq80Var;
                    metVar = metVar2;
                } else {
                    fq80Var4 = fq80Var;
                    iM3 = fq80Var3.m();
                    if ((iM3 & 1) != 0) {
                        iD = fq80Var3.D();
                    } else {
                        iD = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jMin = fq80Var3.B();
                    } else {
                        jMin = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i11 < 100) {
                            jArr2[i11] = fq80Var3.z();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        fq80Var5 = fq80Var3;
                        fq80Var5.N(4);
                    } else {
                        fq80Var5 = fq80Var3;
                    }
                    if (fq80Var5.a() >= 24) {
                        strX = fq80Var5.x(9, StandardCharsets.UTF_8);
                        fq80Var5.N(2);
                        fIntBitsToFloat = Float.intBitsToFloat(fq80Var5.m());
                        int iG10 = fq80Var5.G();
                        int iG11 = fq80Var5.G();
                        bv40VarA = bv40.a(iG10);
                        bv40VarA2 = bv40.a(iG11);
                        if (fIntBitsToFloat > 0.0f) {
                            cv40Var = new cv40(fIntBitsToFloat, bv40VarA, bv40VarA2);
                        } else {
                            cv40Var = new cv40(fIntBitsToFloat, bv40VarA, bv40VarA2);
                        }
                        fq80Var5.N(2);
                        int iC4 = fq80Var5.C();
                        i10 = (16773120 & iC4) >> 12;
                        iMax = iC4 & 4095;
                        if (strX.startsWith("LAME")) {
                            i10 += 529;
                            iMax = Math.max(0, iMax - 529);
                        } else {
                            i10 += 529;
                            iMax = Math.max(0, iMax - 529);
                        }
                    } else {
                        cv40Var = null;
                        iMax = -1;
                        i10 = -1;
                    }
                    j8 = iD;
                    mdw0Var = new mdw0();
                    mv40 mv40Var6 = new mv40();
                    mv40Var6.f22441a = mv40Var2.f22441a;
                    mv40Var6.g = (String) mv40Var2.g;
                    mv40Var6.b = mv40Var2.b;
                    mv40Var6.c = mv40Var2.c;
                    mv40Var6.d = mv40Var2.d;
                    mv40Var6.e = mv40Var2.e;
                    mv40Var6.f = mv40Var2.f;
                    mdw0Var.c = mv40Var6;
                    mdw0Var.b = j8;
                    mdw0Var.f21617a = i10;
                    mdw0Var.d = iMax;
                    mv40Var = (mv40) mdw0Var.c;
                    metVar = metVar2;
                    if (metVar.f21663a != -1) {
                        metVar.f21663a = i10;
                        metVar.b = iMax;
                    } else {
                        metVar.f21663a = i10;
                        metVar.b = iMax;
                    }
                    if (cv40Var != null) {
                        ed40Var = new ed40(cv40Var);
                    } else {
                        ed40Var = null;
                    }
                    this.l = ed40Var;
                    position2 = guoVar.getPosition();
                    guoVar.m(mv40Var2.b);
                    if (iM2 == 1483304551) {
                        length2 = guoVar.getLength();
                        jA2 = mdw0Var.a();
                        if (jA2 == -9223372036854775807L) {
                            q2eVar = null;
                        } else {
                            if (jMin != -1) {
                                long j111 = length2 - position2;
                                StringBuilder sbQ7 = kng0.q(j111, "Data size mismatch between stream (", ") and Xing frame (");
                                sbQ7.append(jMin);
                                sbQ7.append("), using smaller value.");
                                f1t0.a0("XingSeeker", sbQ7.toString());
                                jMin = Math.min(jMin, j111);
                            }
                            q2eVar = new r1w0(position2, mv40Var.b, jA2, jMin, jArr);
                        }
                    } else {
                        length = guoVar.getLength();
                        jA = mdw0Var.a();
                        if (jA != -9223372036854775807L) {
                            if (jMin != -1) {
                                length = position2 + jMin;
                                j9 = jMin - ((long) mv40Var.b);
                            } else if (length != -1) {
                                j9 = (length - position2) - ((long) mv40Var.b);
                            } else {
                                q2eVar = null;
                            }
                            j10 = length;
                            iV = m7x.v(j9, jA);
                            if (iV == -2147483647) {
                                q2eVar = null;
                            } else {
                                q2eVar = new q2e(iV, n6x.s(vvw.v(j9, j8, RoundingMode.HALF_UP)), j10, position2 + ((long) mv40Var.b), jA, false, true);
                            }
                        } else {
                            q2eVar = null;
                        }
                    }
                }
                ed40Var2 = this.k;
                position3 = guoVar.getPosition();
                if (ed40Var2 == null) {
                    pl40Var = null;
                } else {
                    cd40VarArr = ed40Var2.f7600a;
                    length3 = cd40VarArr.length;
                    i12 = 0;
                    while (true) {
                        if (i12 < length3) {
                            cd40Var = null;
                            break;
                        }
                        cd40Var4 = cd40VarArr[i12];
                        if (ol40.class.isAssignableFrom(cd40Var4.getClass())) {
                            cd40Var = (cd40) ol40.class.cast(cd40Var4);
                            if (!rsb0.f31024a.apply(cd40Var)) {
                                cd40Var = null;
                            }
                        } else {
                            cd40Var = null;
                        }
                        if (cd40Var != null) {
                            break;
                            break;
                        }
                        i12++;
                    }
                    ol40Var = (ol40) cd40Var;
                    if (ol40Var == null) {
                        pl40Var = null;
                    } else {
                        iArr = ol40Var.e;
                        cd40VarArr2 = ed40Var2.f7600a;
                        length4 = cd40VarArr2.length;
                        i13 = 0;
                        while (true) {
                            if (i13 < length4) {
                                cd40Var2 = null;
                                break;
                            }
                            cd40Var3 = cd40VarArr2[i13];
                            if (h8q0.class.isAssignableFrom(cd40Var3.getClass())) {
                                cd40Var2 = (cd40) h8q0.class.cast(cd40Var3);
                                if (!((h8q0) cd40Var2).f10332a.equals("TLEN")) {
                                    cd40Var2 = null;
                                }
                            } else {
                                cd40Var2 = null;
                            }
                            if (cd40Var2 != null) {
                                break;
                                break;
                            }
                            i13++;
                        }
                        h8q0Var = (h8q0) cd40Var2;
                        if (h8q0Var == null) {
                            jM = -9223372036854775807L;
                            c = 0;
                        } else {
                            c = 0;
                            jM = vtt0.M(Long.parseLong((String) h8q0Var.c.get(0)));
                        }
                        length5 = iArr.length;
                        int i19 = length5 + 1;
                        jArr3 = new long[i19];
                        jArr4 = new long[i19];
                        jArr3[c] = position3;
                        jArr4[c] = 0;
                        j11 = 0;
                        i14 = 1;
                        while (i14 <= length5) {
                            int i110 = i14 - 1;
                            long j112 = position3 + ((long) (ol40Var.c + iArr[i110]));
                            j11 += (long) (ol40Var.d + ol40Var.f[i110]);
                            jArr3[i14] = j112;
                            jArr4[i14] = j11;
                            i14++;
                            length5 = length5;
                            position3 = j112;
                        }
                        pl40Var = new pl40(jM, jArr3, jArr4);
                    }
                }
                if (this.s) {
                    q2eVar2 = new qvh0(-9223372036854775807L);
                    fq80Var2 = fq80Var4;
                } else {
                    if (pl40Var != null) {
                        q2eVar2 = pl40Var;
                        fq80Var2 = fq80Var4;
                    } else if (q2eVar != null) {
                        fq80Var2 = fq80Var4;
                        q2eVar2 = q2eVar;
                    } else {
                        fq80Var2 = fq80Var4;
                        guoVar.n(fq80Var2.f9961a, 0, 4);
                        fq80Var2.M(0);
                        mv40Var2.d(fq80Var2.m());
                        q2eVar2 = new q2e(mv40Var2.e, mv40Var2.b, guoVar.getLength(), guoVar.getPosition(), -9223372036854775807L, false, true);
                    }
                    if (!(q2eVar2 instanceof q2e)) {
                        q2eVar2.d();
                    }
                }
                this.r = q2eVar2;
                this.h.f(q2eVar2.g());
                this.g.f(this.r);
                ed40VarB = this.k;
                ed40Var3 = this.l;
                if (ed40VarB != null) {
                    if (ed40Var3 != null) {
                        ed40VarB = ed40VarB.b(ed40Var3);
                    }
                    ed40Var3 = ed40VarB;
                }
                awqVar = new awq();
                awqVar.n = mg40.n("audio/mpeg");
                awqVar.o = mg40.n((String) mv40Var2.g);
                awqVar.p = 4096;
                awqVar.I = mv40Var2.d;
                awqVar.K = mv40Var2.c;
                awqVar.M = metVar.f21663a;
                awqVar.N = metVar.b;
                awqVar.l = ed40Var3;
                if (this.r.f() != -2147483647) {
                    awqVar.i = this.r.f();
                }
                this.i.c(new androidx.media3.common.b(awqVar));
                this.o = guoVar.getPosition();
            } else {
                fq80Var2 = fq80Var;
                metVar = metVar2;
                j2 = 1;
                j5 = 0;
                if (this.o != 0) {
                    position = guoVar.getPosition();
                    j6 = this.o;
                    if (position < j6) {
                        guoVar.m((int) (j6 - position));
                    }
                }
            }
            if (this.q == 0) {
                guoVar.g();
                if (h(guoVar)) {
                    j3 = -9223372036854775807L;
                } else {
                    fq80Var2.M(0);
                    iM = fq80Var2.m();
                    if (((-128000) & iM) == (((long) this.j) & (-128000))) {
                        j3 = -9223372036854775807L;
                        i6 = 1;
                    } else if (saj.S(iM) == -1) {
                        i6 = 1;
                        j3 = -9223372036854775807L;
                    } else {
                        mv40Var2.d(iM);
                        j3 = -9223372036854775807L;
                        if (this.m == -9223372036854775807L) {
                            this.m = this.r.e(guoVar.getPosition());
                            j7 = this.f1510a;
                            if (j7 != -9223372036854775807L) {
                                this.m = (j7 - this.r.e(j5)) + this.m;
                            }
                        }
                        this.q = mv40Var2.b;
                        this.p = guoVar.getPosition() + ((long) mv40Var2.b);
                        if (this.r instanceof f5x) {
                            long j113 = ((this.n + ((long) mv40Var2.f)) * 1000000) / ((long) mv40Var2.c);
                            throw null;
                        }
                    }
                    guoVar.m(i6);
                    this.j = 0;
                    i = -1;
                    i2 = 0;
                }
                i = -1;
                i2 = -1;
            } else {
                j3 = -9223372036854775807L;
            }
            iE = this.i.e(guoVar, this.q, true);
            if (iE == -1) {
                i = -1;
                i2 = -1;
            } else {
                i5 = this.q - iE;
                this.q = i5;
                if (i5 > 0) {
                    i = -1;
                    i2 = 0;
                } else {
                    this.i.b(((this.n * 1000000) / ((long) mv40Var2.c)) + this.m, 1, mv40Var2.b, 0, null);
                    this.n += (long) mv40Var2.f;
                    this.q = 0;
                    i2 = 0;
                    i = -1;
                }
            }
        }
        if (i2 == i) {
            rvh0 rvh0Var2 = this.r;
            if (rvh0Var2 instanceof f5x) {
                long j20 = this.n - j2;
                if (j20 < 0) {
                    j4 = j3;
                } else {
                    int i20 = metVar.f21663a;
                    if (i20 != i && (i3 = metVar.b) != i) {
                        j20 = (j20 - ((long) i20)) - ((long) i3);
                    }
                    if (j20 >= 0) {
                        j4 = ((j20 * j) / ((long) mv40Var2.c)) + this.m;
                    } else {
                        j4 = j3;
                    }
                }
                if (rvh0Var2.g() != j4) {
                    ((f5x) this.r).getClass();
                    throw th;
                }
            }
        }
        return i2;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        this.j = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        this.u = j2;
        if (this.r instanceof f5x) {
            throw null;
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        return i(guoVar, true);
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.g = huoVar;
        ncs0 ncs0VarQ = huoVar.q(0, 1);
        this.h = ncs0VarQ;
        this.i = ncs0VarQ;
        this.g.o();
    }

    public final void g() {
        rvh0 rvh0Var = this.r;
        if ((rvh0Var instanceof q2e) && ((q2e) rvh0Var).d()) {
            long j = this.p;
            if (j == -1 || j == this.r.c()) {
                return;
            }
            q2e q2eVar = (q2e) this.r;
            long j2 = this.p;
            long j3 = q2eVar.b;
            this.r = new q2e(q2eVar.e, q2eVar.c, j2, j3, q2eVar.i, q2eVar.g, false);
            huo huoVar = this.g;
            huoVar.getClass();
            huoVar.f(this.r);
            ncs0 ncs0Var = this.h;
            ncs0Var.getClass();
            ncs0Var.f(this.r.g());
        }
    }

    public final boolean h(guo guoVar) {
        rvh0 rvh0Var = this.r;
        if (rvh0Var != null) {
            long jC = rvh0Var.c();
            if (jC == -1 || guoVar.i() <= jC - 4) {
            }
            return true;
        }
        try {
            return !guoVar.b(this.b.f9961a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean i(guo guoVar, boolean z) throws EOFException {
        int i;
        int i2;
        int iS;
        guoVar.g();
        if (guoVar.getPosition() == 0) {
            ed40 ed40VarN = this.e.n(guoVar, null, 131072);
            this.k = ed40VarN;
            if (ed40VarN != null) {
                this.d.b(ed40VarN);
            }
            i = (int) guoVar.i();
            if (!z) {
                guoVar.m(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (h(guoVar)) {
                if (i3 > 0) {
                    break;
                }
                g();
                c99.f();
                return false;
            }
            fq80 fq80Var = this.b;
            fq80Var.M(0);
            int iM = fq80Var.m();
            if ((i2 == 0 || ((-128000) & iM) == (((long) i2) & (-128000))) && (iS = saj.S(iM)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.c.d(iM);
                    i2 = iM;
                }
                guoVar.j(iS - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == 131072) {
                    if (z) {
                        return false;
                    }
                    g();
                    c99.f();
                    return false;
                }
                if (z) {
                    guoVar.g();
                    guoVar.j(i + i5);
                } else {
                    guoVar.m(1);
                }
                i3 = 0;
                i4 = i5;
                i2 = 0;
            }
        }
        if (z) {
            guoVar.m(i + i4);
        } else {
            guoVar.g();
        }
        this.j = i2;
        return true;
    }

    @Override // a.fuo
    public final void release() {
    }

    public av40(int i) {
        this(-9223372036854775807L);
    }
}
