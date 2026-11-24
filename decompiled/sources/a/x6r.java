package a;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class x6r implements fuo {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final androidx.media3.common.b P;
    public long A;
    public w6r B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public huo H;
    public ncs0[] I;
    public ncs0[] J;
    public boolean K;
    public boolean L;
    public long M;
    public long N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jfn0 f40377a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final fq80 i;
    public final coq0 j;
    public final fp o;
    public final ajc p;
    public rcf0 q;
    public byte r;
    public int s;
    public long t;
    public int u;
    public fq80 v;
    public long w;
    public int x;
    public long y;
    public long z;
    public final iqi k = new iqi();
    public final fq80 l = new fq80(16);
    public final fq80 e = new fq80(ntr.j);
    public final fq80 f = new fq80(6);
    public final fq80 g = new fq80();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        awq awqVar = new awq();
        awqVar.o = mg40.n("application/x-emsg");
        P = new androidx.media3.common.b(awqVar);
    }

    public x6r(jfn0 jfn0Var, int i, coq0 coq0Var, List list) {
        this.f40377a = jfn0Var;
        this.b = i;
        this.j = coq0Var;
        this.c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new fq80(bArr);
        v3x v3xVar = b4x.b;
        this.q = rcf0.e;
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = huo.f0;
        this.I = new ncs0[0];
        this.J = new ncs0[0];
        this.o = new fp(new viq(this, (byte) 2));
        this.p = new ajc((byte) 0);
        this.M = -1L;
        this.N = -1L;
    }

    public static DrmInitData h(ArrayList arrayList) {
        UUID[] uuidArr;
        pv00 pv00Var;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList2 = null;
        while (i2 < size) {
            fv40 fv40Var = (fv40) arrayList.get(i2);
            if (fv40Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = fv40Var.e.f9961a;
                fq80 fq80Var = new fq80(bArr);
                if (fq80Var.c < 32) {
                    pv00Var = null;
                } else {
                    fq80Var.M(i);
                    int iA = fq80Var.a();
                    int iM = fq80Var.m();
                    if (iM != iA) {
                        f1t0.g0("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
                    } else {
                        int iM2 = fq80Var.m();
                        if (iM2 != 1886614376) {
                            rw2.u(iM2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int iE = hr8.e(fq80Var.m());
                            if (iE > 1) {
                                rw2.u(iE, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid = new UUID(fq80Var.t(), fq80Var.t());
                                if (iE == 1) {
                                    int iD = fq80Var.D();
                                    uuidArr = new UUID[iD];
                                    int i3 = i;
                                    while (i3 < iD) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(fq80Var.t(), fq80Var.t());
                                        i3 = i4 + 1;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                int iD2 = fq80Var.D();
                                int iA2 = fq80Var.a();
                                if (iD2 != iA2) {
                                    f1t0.g0("PsshAtomUtil", "Atom data size (" + iD2 + ") does not match the bytes left: " + iA2);
                                } else {
                                    byte[] bArr2 = new byte[iD2];
                                    fq80Var.k(bArr2, 0, iD2);
                                    pv00Var = new pv00(uuid, iE, bArr2, uuidArr);
                                }
                            }
                        }
                    }
                    pv00Var = null;
                }
                UUID uuid2 = pv00Var == null ? null : (UUID) pv00Var.f27640a;
                if (uuid2 == null) {
                    f1t0.g0("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid2, null, "video/mp4", bArr));
                }
            }
            i2++;
            i = 0;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void j(fq80 fq80Var, int i, xbs0 xbs0Var) throws kq80 {
        fq80Var.M(i + 8);
        int iM = fq80Var.m();
        byte[] bArr = hr8.f13518a;
        if ((iM & 1) != 0) {
            throw kq80.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM & 2) != 0;
        int iD = fq80Var.D();
        if (iD == 0) {
            Arrays.fill(xbs0Var.l, 0, xbs0Var.e, false);
            return;
        }
        int i2 = xbs0Var.e;
        fq80 fq80Var2 = xbs0Var.n;
        if (iD != i2) {
            StringBuilder sbM = b1j.m(iD, "Senc sample count ", " is different from fragment sample count");
            sbM.append(xbs0Var.e);
            throw kq80.a(sbM.toString(), null);
        }
        Arrays.fill(xbs0Var.l, 0, iD, z);
        fq80Var2.J(fq80Var.a());
        xbs0Var.k = true;
        xbs0Var.o = true;
        fq80Var.k(fq80Var2.f9961a, 0, fq80Var2.c);
        fq80Var2.M(0);
        xbs0Var.o = false;
    }

    public static Pair k(long j, fq80 fq80Var) throws kq80 {
        long jF;
        long jF2;
        fq80 fq80Var2 = fq80Var;
        fq80Var2.M(8);
        int iE = hr8.e(fq80Var2.m());
        fq80Var2.N(4);
        long jB = fq80Var2.B();
        if (iE == 0) {
            jF = fq80Var2.B();
            jF2 = fq80Var2.B();
        } else {
            jF = fq80Var2.F();
            jF2 = fq80Var2.F();
        }
        long j2 = jF2 + j;
        String str = vtt0.f38024a;
        long jT = vtt0.T(jF, 1000000L, jB, RoundingMode.DOWN);
        fq80Var2.N(2);
        int iG = fq80Var2.G();
        int[] iArr = new int[iG];
        long[] jArr = new long[iG];
        long[] jArr2 = new long[iG];
        long[] jArr3 = new long[iG];
        long j3 = j2;
        long j4 = jT;
        int i = 0;
        while (i < iG) {
            int iM = fq80Var2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw kq80.a("Unhandled indirect reference", null);
            }
            long jB2 = fq80Var2.B();
            iArr[i] = iM & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jF += jB2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jT2 = vtt0.T(jF, 1000000L, jB, RoundingMode.DOWN);
            jArr4[i] = jT2 - jArr5[i];
            fq80Var2.N(4);
            j3 += (long) iArr[i];
            i++;
            iG = iG;
            fq80Var2 = fq80Var;
            j4 = jT2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jT), new zic(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x021f  */
    /* JADX WARN: Code duplicated, block: B:123:0x025f  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:430:0x0919  */
    /* JADX WARN: Code duplicated, block: B:437:0x0931  */
    /* JADX WARN: Code duplicated, block: B:440:0x0939  */
    /* JADX WARN: Code duplicated, block: B:442:0x0940  */
    /* JADX WARN: Code duplicated, block: B:443:0x096a  */
    /* JADX WARN: Code duplicated, block: B:445:0x0976  */
    /* JADX WARN: Code duplicated, block: B:452:0x0996  */
    /* JADX WARN: Code duplicated, block: B:460:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:462:0x09ca A[LOOP:2: B:461:0x09c8->B:462:0x09ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:465:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:466:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:468:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:562:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:569:0x0b3c  */
    /* JADX WARN: Code duplicated, block: B:570:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b4b  */
    /* JADX WARN: Code duplicated, block: B:584:0x05cf A[SYNTHETIC] */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        ArrayDeque arrayDeque;
        fp fpVar;
        ajc ajcVar;
        int i;
        fq80 fq80Var;
        ArrayDeque arrayDeque2;
        coq0 coq0Var;
        String strU;
        String strU2;
        long jT;
        long jB;
        long j;
        long jA;
        int i2;
        char c;
        w6r w6rVar;
        boolean z;
        ArrayDeque arrayDeque3;
        int iE;
        int i3;
        boolean z2;
        String strE0;
        byte b;
        int i4;
        int iD;
        int i5;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long position;
        int i6;
        int i7;
        long j7;
        long j8;
        int size;
        int i8;
        guo guoVar2 = guoVar;
        loop0: while (true) {
            mtc mtcVar2 = mtcVar;
            while (true) {
                byte b2 = this.r;
                arrayDeque = this.m;
                fpVar = this.o;
                ajcVar = this.p;
                i = this.b;
                SparseArray sparseArray = this.d;
                fq80Var = this.i;
                boolean z3 = true;
                if (b2 != 0) {
                    arrayDeque2 = this.n;
                    coq0Var = this.j;
                    if (b2 != 1) {
                        if (b2 != 2) {
                            int i9 = 2;
                            c = 6;
                            if (b2 == 5) {
                                fq80Var.J(16);
                                if (guoVar2.h(fq80Var.f9961a, 0, 16, true)) {
                                    fq80Var.M(0);
                                    int iM = fq80Var.m();
                                    int iM2 = fq80Var.m();
                                    if (iM == 16 && iM2 == 1835430511) {
                                        fq80Var.N(4);
                                        long jB2 = fq80Var.B();
                                        long length = guoVar2.getLength() - jB2;
                                        if (jB2 <= 0 || jB2 > 2147483647L || length < 0 || length < this.N) {
                                            i(new ca5(this.z, this.N), mtcVar2);
                                        } else {
                                            mtcVar2.f22363a = length;
                                            this.r = (byte) 6;
                                        }
                                    } else {
                                        i(new ca5(this.z, this.N), mtcVar2);
                                    }
                                } else {
                                    i(new ca5(this.z, this.N), mtcVar2);
                                }
                                byte b3 = this.r;
                                if (b3 == 6 || b3 == 0) {
                                    return 1;
                                }
                            } else if (b2 != 6) {
                                w6rVar = this.B;
                                if (w6rVar != null) {
                                    z = true;
                                    break loop0;
                                }
                                int size2 = sparseArray.size();
                                int i10 = 0;
                                w6r w6rVar2 = null;
                                long j9 = Long.MAX_VALUE;
                                while (i10 < size2) {
                                    w6r w6rVar3 = (w6r) sparseArray.valueAt(i10);
                                    boolean z4 = z3;
                                    boolean z5 = w6rVar3.n;
                                    xbs0 xbs0Var = w6rVar3.b;
                                    int i11 = size2;
                                    if (z5 || w6rVar3.f != w6rVar3.d.b) {
                                        if (z5 == 0 || w6rVar3.h != xbs0Var.d) {
                                            long j10 = !z5 ? w6rVar3.d.c[w6rVar3.f] : xbs0Var.f[w6rVar3.h];
                                            if (j10 < j9) {
                                                w6rVar2 = w6rVar3;
                                                j9 = j10;
                                            }
                                        }
                                    }
                                    i10++;
                                    size2 = i11;
                                    z3 = z4;
                                }
                                z = z3;
                                if (w6rVar2 != null) {
                                    int position2 = (int) ((!w6rVar2.n ? w6rVar2.d.c[w6rVar2.f] : w6rVar2.b.f[w6rVar2.h]) - guoVar2.getPosition());
                                    if (position2 < 0) {
                                        f1t0.g0("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        position2 = 0;
                                    }
                                    guoVar2.m(position2);
                                    this.B = w6rVar2;
                                    w6rVar = w6rVar2;
                                    break loop0;
                                }
                                int position3 = (int) (this.w - guoVar2.getPosition());
                                if (position3 < 0) {
                                    throw kq80.a("Offset to end of mdat was negative.", null);
                                }
                                guoVar2.m(position3);
                                g();
                            } else {
                                long length2 = guoVar2.getLength() - guoVar2.getPosition();
                                fq80Var.J(8);
                                if (guoVar2.b(fq80Var.f9961a, 0, 8, true)) {
                                    fq80Var.M(0);
                                    int iM3 = fq80Var.m();
                                    if (fq80Var.m() != 1835430497) {
                                        i(new ca5(this.z, this.N), mtcVar2);
                                    } else {
                                        int i12 = (int) length2;
                                        fq80 fq80Var2 = new fq80(i12);
                                        guoVar2.readFully(fq80Var2.f9961a, 0, i12);
                                        fq80Var2.M(iM3 == 1 ? 16 : 8);
                                        SparseArray sparseArray2 = new SparseArray();
                                        SparseArray sparseArray3 = new SparseArray();
                                        while (fq80Var2.a() >= 8) {
                                            int i13 = fq80Var2.b;
                                            long jB3 = fq80Var2.B();
                                            int iM4 = fq80Var2.m();
                                            if (jB3 == 1) {
                                                if (fq80Var2.a() < 8) {
                                                    break;
                                                }
                                                jB3 = fq80Var2.t();
                                            } else if (jB3 == 0) {
                                                jB3 = ((long) fq80Var2.c) - ((long) i13);
                                            }
                                            int i14 = jB3 == 1 ? 16 : 8;
                                            if (jB3 < i14) {
                                                break;
                                            }
                                            long j11 = i13;
                                            if (jB3 > ((long) fq80Var2.c) - j11) {
                                                break;
                                            }
                                            if (iM4 != 1952871009) {
                                                j2 = jB3;
                                                j3 = j11;
                                            } else if (jB3 < i14 + 16) {
                                                fq80Var2.M((int) (j11 + jB3));
                                            } else {
                                                int iE2 = hr8.e(fq80Var2.m());
                                                int iM5 = fq80Var2.m();
                                                w6r w6rVar4 = (w6r) sparseArray.get(iM5);
                                                if (w6rVar4 == null) {
                                                    fq80Var2.M((int) (j11 + jB3));
                                                } else {
                                                    long j12 = w6rVar4.d.f25043a.c;
                                                    int iM6 = fq80Var2.m();
                                                    int i15 = (iM6 >> 4) & 3;
                                                    int i16 = (iM6 >> 2) & 3;
                                                    int i17 = iM6 & 3;
                                                    j2 = jB3;
                                                    long jB4 = fq80Var2.B();
                                                    int i18 = i15 + 1;
                                                    int i19 = i16 + 1;
                                                    j3 = j11;
                                                    int i20 = i17 + 1;
                                                    if (((iE2 == 1 ? 16L : 8L) + ((long) i18) + ((long) i19) + ((long) i20)) * jB4 > fq80Var2.a()) {
                                                        fq80Var2.M((int) (j3 + j2));
                                                    } else {
                                                        int i21 = (int) jB4;
                                                        long[] jArr = new long[i21];
                                                        long[] jArr2 = new long[i21];
                                                        int i22 = 0;
                                                        while (i22 < i21) {
                                                            int i23 = i21;
                                                            long jF = iE2 == 1 ? fq80Var2.F() : fq80Var2.B();
                                                            long jF2 = iE2 == 1 ? fq80Var2.F() : fq80Var2.B();
                                                            fq80Var2.N(i18 + i19 + i20);
                                                            if (j12 != -9223372036854775807L) {
                                                                jF = vtt0.T(jF, 1000000L, j12, RoundingMode.DOWN);
                                                            }
                                                            jArr[i22] = jF;
                                                            jArr2[i22] = jF2;
                                                            i22++;
                                                            i21 = i23;
                                                        }
                                                        sparseArray2.put(iM5, jArr);
                                                        sparseArray3.put(iM5, jArr2);
                                                    }
                                                }
                                            }
                                            fq80Var2.M((int) (j3 + j2));
                                        }
                                        if (sparseArray2.size() == 0) {
                                            i(new ca5(this.z, this.N), mtcVar2);
                                        } else {
                                            int iKeyAt = -1;
                                            int i24 = -1;
                                            int i25 = 0;
                                            while (i25 < sparseArray2.size()) {
                                                int iKeyAt2 = sparseArray2.keyAt(i25);
                                                w6r w6rVar5 = (w6r) sparseArray.get(iKeyAt2);
                                                if (w6rVar5 != null) {
                                                    int i26 = w6rVar5.d.f25043a.b;
                                                    if (iKeyAt == -1 && i26 == i9) {
                                                        iKeyAt = iKeyAt2;
                                                    } else if (i24 == -1 && i26 == 1) {
                                                        i24 = iKeyAt2;
                                                    }
                                                }
                                                i25++;
                                                i9 = 2;
                                            }
                                            if (iKeyAt != -1) {
                                                i5 = iKeyAt;
                                            } else if (i24 != -1) {
                                                i5 = i24;
                                            } else {
                                                iKeyAt = sparseArray2.keyAt(0);
                                                i5 = iKeyAt;
                                            }
                                            i(new v6r(sparseArray2, sparseArray3, this.z, this.N, i5), mtcVar2);
                                        }
                                    }
                                } else {
                                    i(new ca5(this.z, this.N), mtcVar2);
                                }
                                if (this.r == 0) {
                                    return 1;
                                }
                            }
                        } else {
                            int size3 = sparseArray.size();
                            w6r w6rVar6 = null;
                            long j13 = Long.MAX_VALUE;
                            for (int i27 = 0; i27 < size3; i27++) {
                                xbs0 xbs0Var2 = ((w6r) sparseArray.valueAt(i27)).b;
                                if (xbs0Var2.o) {
                                    long j14 = xbs0Var2.c;
                                    if (j14 < j13) {
                                        w6rVar6 = (w6r) sparseArray.valueAt(i27);
                                        j13 = j14;
                                    }
                                }
                            }
                            if (w6rVar6 == null) {
                                this.r = (byte) 3;
                            } else {
                                int position4 = (int) (j13 - guoVar2.getPosition());
                                if (position4 < 0) {
                                    throw kq80.a("Offset to encryption data was negative.", null);
                                }
                                guoVar2.m(position4);
                                xbs0 xbs0Var3 = w6rVar6.b;
                                fq80 fq80Var3 = xbs0Var3.n;
                                guoVar2.readFully(fq80Var3.f9961a, 0, fq80Var3.c);
                                fq80Var3.M(0);
                                xbs0Var3.o = false;
                            }
                        }
                    }
                } else {
                    int i28 = this.u;
                    fq80 fq80Var4 = this.l;
                    if (i28 == 0) {
                        if (!guoVar2.h(fq80Var4.f9961a, 0, 8, true)) {
                            long j15 = this.M;
                            if (j15 == -1) {
                                fpVar.v(0);
                                return -1;
                            }
                            mtcVar.f22363a = j15;
                            this.M = -1L;
                            this.H.f(ajcVar.c());
                            this.L = true;
                            return 1;
                        }
                        this.u = 8;
                        fq80Var4.M(0);
                        this.t = fq80Var4.B();
                        this.s = fq80Var4.m();
                    }
                    long j16 = this.t;
                    if (j16 == 1) {
                        guoVar2.readFully(fq80Var4.f9961a, 8, 8);
                        this.u += 8;
                        this.t = fq80Var4.F();
                    } else {
                        if (j16 == 0) {
                            long length3 = guoVar2.getLength();
                            if (length3 == -1 && !arrayDeque.isEmpty()) {
                                length3 = ((ev40) arrayDeque.peek()).e;
                            }
                            if (length3 != -1) {
                                this.t = (length3 - guoVar2.getPosition()) + ((long) this.u);
                            }
                        }
                        j4 = this.t;
                        int i29 = this.u;
                        j5 = i29;
                        if (j4 >= j5) {
                            j6 = j5;
                        } else {
                            if (this.s == 1718773093 || i29 != 8) {
                                throw kq80.e("Atom size less than header length (unsupported).");
                            }
                            this.t = j5;
                            j4 = j5;
                            j6 = j4;
                        }
                        if (this.M != r3) {
                            if (this.s == 1936286840) {
                                fq80Var.J((int) j4);
                                System.arraycopy(fq80Var4.f9961a, 0, fq80Var.f9961a, 0, 8);
                                guoVar2.readFully(fq80Var.f9961a, 8, (int) (this.t - ((long) this.u)));
                                ajcVar.a((zic) k(guoVar2.i(), fq80Var).second);
                            } else {
                                guoVar2.a((int) (j4 - j6), true);
                            }
                            g();
                        } else {
                            position = guoVar2.getPosition() - ((long) this.u);
                            i6 = this.s;
                            if ((i6 == 1836019558 && i6 != 1835295092) || this.K) {
                                if (this.s == 1836019558) {
                                    size = sparseArray.size();
                                    for (i8 = 0; i8 < size; i8++) {
                                        xbs0 xbs0Var4 = ((w6r) sparseArray.valueAt(i8)).b;
                                        xbs0Var4.getClass();
                                        xbs0Var4.c = position;
                                        xbs0Var4.b = position;
                                    }
                                }
                                i7 = this.s;
                                if (i7 == 1835295092) {
                                    this.B = null;
                                    this.w = position + this.t;
                                    this.r = (byte) 2;
                                } else if (i7 != 1836019574) {
                                    long position5 = guoVar2.getPosition();
                                    j7 = this.t;
                                    j8 = (position5 + j7) - 8;
                                    if (j7 != this.u) {
                                        fq80Var.J(8);
                                        guoVar2.n(fq80Var.f9961a, 0, 8);
                                        hr8.a(fq80Var);
                                        guoVar2.m(fq80Var.b);
                                        guoVar2.g();
                                    }
                                    arrayDeque.push(new ev40(this.s, j8));
                                    if (this.t == this.u) {
                                        l(j8);
                                    } else {
                                        g();
                                    }
                                } else {
                                    long position6 = guoVar2.getPosition();
                                    j7 = this.t;
                                    j8 = (position6 + j7) - 8;
                                    if (j7 != this.u) {
                                        fq80Var.J(8);
                                        guoVar2.n(fq80Var.f9961a, 0, 8);
                                        hr8.a(fq80Var);
                                        guoVar2.m(fq80Var.b);
                                        guoVar2.g();
                                    }
                                    arrayDeque.push(new ev40(this.s, j8));
                                    if (this.t == this.u) {
                                        l(j8);
                                    } else {
                                        g();
                                    }
                                }
                            } else if (guoVar2.getLength() == r3 && this.N == -1 && (i & 512) != 0) {
                                this.N = position;
                                mtcVar.f22363a = guoVar2.getLength() - 16;
                                this.r = (byte) 5;
                            } else {
                                this.H.f(new ca5(this.z, position));
                                this.K = true;
                                if (this.s == 1836019558) {
                                    size = sparseArray.size();
                                    while (i8 < size) {
                                        xbs0 xbs0Var5 = ((w6r) sparseArray.valueAt(i8)).b;
                                        xbs0Var5.getClass();
                                        xbs0Var5.c = position;
                                        xbs0Var5.b = position;
                                    }
                                }
                                i7 = this.s;
                                if (i7 == 1835295092) {
                                    this.B = null;
                                    this.w = position + this.t;
                                    this.r = (byte) 2;
                                } else if (i7 != 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1836019558 || i7 == 1953653094 || i7 == 1836475768 || i7 == 1701082227 || i7 == 1835365473) {
                                    long position7 = guoVar2.getPosition();
                                    j7 = this.t;
                                    j8 = (position7 + j7) - 8;
                                    if (j7 != this.u && this.s == 1835365473) {
                                        fq80Var.J(8);
                                        guoVar2.n(fq80Var.f9961a, 0, 8);
                                        hr8.a(fq80Var);
                                        guoVar2.m(fq80Var.b);
                                        guoVar2.g();
                                    }
                                    arrayDeque.push(new ev40(this.s, j8));
                                    if (this.t == this.u) {
                                        l(j8);
                                    } else {
                                        g();
                                    }
                                } else if (i7 == 1751411826 || i7 == 1835296868 || i7 == 1836476516 || i7 == 1936286840 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1668576371 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1937011571 || i7 == 1952867444 || i7 == 1952868452 || i7 == 1953196132 || i7 == 1953654136 || i7 == 1953658222 || i7 == 1886614376 || i7 == 1935763834 || i7 == 1935763823 || i7 == 1936027235 || i7 == 1970628964 || i7 == 1935828848 || i7 == 1936158820 || i7 == 1701606260 || i7 == 1835362404 || i7 == 1701671783 || i7 == 1969517665 || i7 == 1801812339 || i7 == 1768715124) {
                                    if (this.u != 8) {
                                        throw kq80.e("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    if (this.t > 2147483647L) {
                                        throw kq80.e("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    fq80 fq80Var5 = new fq80((int) this.t);
                                    System.arraycopy(fq80Var4.f9961a, 0, fq80Var5.f9961a, 0, 8);
                                    this.v = fq80Var5;
                                    this.r = (byte) 1;
                                } else {
                                    if (this.t > 2147483647L) {
                                        throw kq80.e("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    this.v = null;
                                    this.r = (byte) 1;
                                }
                            }
                        }
                        if (this.r == 5) {
                            return 1;
                        }
                        mtcVar2 = mtcVar;
                    }
                    j4 = this.t;
                    int i210 = this.u;
                    j5 = i210;
                    if (j4 >= j5) {
                        if (this.s == 1718773093) {
                        }
                        throw kq80.e("Atom size less than header length (unsupported).");
                    }
                    j6 = j5;
                    if (this.M != r3) {
                        if (this.s == 1936286840) {
                            fq80Var.J((int) j4);
                            System.arraycopy(fq80Var4.f9961a, 0, fq80Var.f9961a, 0, 8);
                            guoVar2.readFully(fq80Var.f9961a, 8, (int) (this.t - ((long) this.u)));
                            ajcVar.a((zic) k(guoVar2.i(), fq80Var).second);
                        } else {
                            guoVar2.a((int) (j4 - j6), true);
                        }
                        g();
                    } else {
                        position = guoVar2.getPosition() - ((long) this.u);
                        i6 = this.s;
                        if (i6 == 1836019558) {
                            if (guoVar2.getLength() == r3) {
                            }
                            this.H.f(new ca5(this.z, position));
                            this.K = true;
                            if (this.s == 1836019558) {
                                size = sparseArray.size();
                                while (i8 < size) {
                                    xbs0 xbs0Var6 = ((w6r) sparseArray.valueAt(i8)).b;
                                    xbs0Var6.getClass();
                                    xbs0Var6.c = position;
                                    xbs0Var6.b = position;
                                }
                            }
                            i7 = this.s;
                            if (i7 == 1835295092) {
                                this.B = null;
                                this.w = position + this.t;
                                this.r = (byte) 2;
                            } else if (i7 != 1836019574) {
                                long position8 = guoVar2.getPosition();
                                j7 = this.t;
                                j8 = (position8 + j7) - 8;
                                if (j7 != this.u) {
                                    fq80Var.J(8);
                                    guoVar2.n(fq80Var.f9961a, 0, 8);
                                    hr8.a(fq80Var);
                                    guoVar2.m(fq80Var.b);
                                    guoVar2.g();
                                }
                                arrayDeque.push(new ev40(this.s, j8));
                                if (this.t == this.u) {
                                    l(j8);
                                } else {
                                    g();
                                }
                            } else {
                                long position9 = guoVar2.getPosition();
                                j7 = this.t;
                                j8 = (position9 + j7) - 8;
                                if (j7 != this.u) {
                                    fq80Var.J(8);
                                    guoVar2.n(fq80Var.f9961a, 0, 8);
                                    hr8.a(fq80Var);
                                    guoVar2.m(fq80Var.b);
                                    guoVar2.g();
                                }
                                arrayDeque.push(new ev40(this.s, j8));
                                if (this.t == this.u) {
                                    l(j8);
                                } else {
                                    g();
                                }
                            }
                        } else {
                            if (guoVar2.getLength() == r3) {
                            }
                            this.H.f(new ca5(this.z, position));
                            this.K = true;
                            if (this.s == 1836019558) {
                                size = sparseArray.size();
                                while (i8 < size) {
                                    xbs0 xbs0Var7 = ((w6r) sparseArray.valueAt(i8)).b;
                                    xbs0Var7.getClass();
                                    xbs0Var7.c = position;
                                    xbs0Var7.b = position;
                                }
                            }
                            i7 = this.s;
                            if (i7 == 1835295092) {
                                this.B = null;
                                this.w = position + this.t;
                                this.r = (byte) 2;
                            } else if (i7 != 1836019574) {
                                long position10 = guoVar2.getPosition();
                                j7 = this.t;
                                j8 = (position10 + j7) - 8;
                                if (j7 != this.u) {
                                    fq80Var.J(8);
                                    guoVar2.n(fq80Var.f9961a, 0, 8);
                                    hr8.a(fq80Var);
                                    guoVar2.m(fq80Var.b);
                                    guoVar2.g();
                                }
                                arrayDeque.push(new ev40(this.s, j8));
                                if (this.t == this.u) {
                                    l(j8);
                                } else {
                                    g();
                                }
                            } else {
                                long position11 = guoVar2.getPosition();
                                j7 = this.t;
                                j8 = (position11 + j7) - 8;
                                if (j7 != this.u) {
                                    fq80Var.J(8);
                                    guoVar2.n(fq80Var.f9961a, 0, 8);
                                    hr8.a(fq80Var);
                                    guoVar2.m(fq80Var.b);
                                    guoVar2.g();
                                }
                                arrayDeque.push(new ev40(this.s, j8));
                                if (this.t == this.u) {
                                    l(j8);
                                } else {
                                    g();
                                }
                            }
                        }
                    }
                    if (this.r == 5) {
                        return 1;
                    }
                    mtcVar2 = mtcVar;
                }
            }
            int i30 = (int) (this.t - ((long) this.u));
            fq80 fq80Var6 = this.v;
            if (fq80Var6 != null) {
                guoVar2.readFully(fq80Var6.f9961a, 8, i30);
                int i31 = this.s;
                fv40 fv40Var = new fv40(i31, fq80Var6);
                if (!arrayDeque.isEmpty()) {
                    ((ev40) arrayDeque.peek()).f.add(fv40Var);
                } else if (i31 == 1936286840) {
                    Pair pairK = k(guoVar2.getPosition(), fq80Var6);
                    ajcVar.a((zic) pairK.second);
                    LinkedHashMap linkedHashMap = ajcVar.f967a;
                    this.A = ((Long) pairK.first).longValue();
                    if (this.L) {
                        i2 = 1;
                    } else {
                        i2 = 1;
                        this.H.f(linkedHashMap.size() == 1 ? (fvh0) pairK.second : ajcVar.c());
                        this.K = true;
                    }
                    if ((i & 256) != 0 && !this.L && linkedHashMap.size() > i2) {
                        this.M = guoVar2.getPosition();
                    }
                } else if (i31 == 1701671783 && this.I.length != 0) {
                    fq80Var6.M(8);
                    int iE3 = hr8.e(fq80Var6.m());
                    if (iE3 == 0) {
                        strU = fq80Var6.u();
                        strU.getClass();
                        strU2 = fq80Var6.u();
                        strU2.getClass();
                        long jB5 = fq80Var6.B();
                        long jB6 = fq80Var6.B();
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long jT2 = vtt0.T(jB6, 1000000L, jB5, roundingMode);
                        long j17 = this.A;
                        long j18 = j17 != -9223372036854775807L ? j17 + jT2 : -9223372036854775807L;
                        jT = vtt0.T(fq80Var6.B(), 1000L, jB5, roundingMode);
                        jB = fq80Var6.B();
                        long j19 = j18;
                        j = jT2;
                        jA = j19;
                    } else if (iE3 != 1) {
                        rw2.u(iE3, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                    } else {
                        long jB7 = fq80Var6.B();
                        long jF3 = fq80Var6.F();
                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                        jA = vtt0.T(jF3, 1000000L, jB7, roundingMode2);
                        long jT3 = vtt0.T(fq80Var6.B(), 1000L, jB7, roundingMode2);
                        long jB8 = fq80Var6.B();
                        strU = fq80Var6.u();
                        strU.getClass();
                        strU2 = fq80Var6.u();
                        strU2.getClass();
                        jB = jB8;
                        jT = jT3;
                        j = -9223372036854775807L;
                    }
                    byte[] bArr = new byte[fq80Var6.a()];
                    fq80Var6.k(bArr, 0, fq80Var6.a());
                    iqi iqiVar = this.k;
                    DataOutputStream dataOutputStream = (DataOutputStream) iqiVar.b;
                    ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) iqiVar.c;
                    byteArrayOutputStream.reset();
                    try {
                        dataOutputStream.writeBytes(strU);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeBytes(strU2);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeLong(jT);
                        dataOutputStream.writeLong(jB);
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        fq80 fq80Var7 = new fq80(byteArrayOutputStream.toByteArray());
                        int iA = fq80Var7.a();
                        for (ncs0 ncs0Var : this.I) {
                            fq80Var7.M(0);
                            ncs0Var.a(iA, fq80Var7);
                        }
                        if (jA == -9223372036854775807L) {
                            arrayDeque2.addLast(new u6r(iA, j, true));
                            this.x += iA;
                        } else if (!arrayDeque2.isEmpty()) {
                            arrayDeque2.addLast(new u6r(iA, jA, false));
                            this.x += iA;
                        } else if (coq0Var == null || coq0Var.e()) {
                            if (coq0Var != null) {
                                jA = coq0Var.a(jA);
                            }
                            long j20 = jA;
                            for (ncs0 ncs0Var2 : this.I) {
                                ncs0Var2.b(j20, 1, iA, 0, null);
                            }
                        } else {
                            arrayDeque2.addLast(new u6r(iA, jA, false));
                            this.x += iA;
                        }
                    } catch (IOException e) {
                        ohq.p(e);
                        return 0;
                    }
                }
                guoVar2 = guoVar;
            } else {
                guoVar2.m(i30);
            }
            l(guoVar2.getPosition());
        }
        ncs0 ncs0Var3 = w6rVar.f38638a;
        xbs0 xbs0Var8 = w6rVar.b;
        String str = "video/hevc";
        if (this.r == 3) {
            this.C = !w6rVar.n ? w6rVar.d.d[w6rVar.f] : xbs0Var8.h[w6rVar.f];
            androidx.media3.common.b bVar = w6rVar.d.f25043a.g;
            this.F = !((!Objects.equals(bVar.p, "video/avc") ? !(!Objects.equals(bVar.p, "video/hevc") || (i & 128) == 0) : (i & 64) != 0) ? false : z);
            if (w6rVar.f < w6rVar.i) {
                guoVar2.m(this.C);
                vbs0 vbs0VarB = w6rVar.b();
                if (vbs0VarB != null) {
                    fq80 fq80Var8 = xbs0Var8.n;
                    short s = vbs0VarB.d;
                    if (s != 0) {
                        fq80Var8.N(s);
                    }
                    int i32 = w6rVar.f;
                    if (xbs0Var8.k && xbs0Var8.l[i32]) {
                        fq80Var8.N(fq80Var8.G() * 6);
                    }
                }
                if (!w6rVar.c()) {
                    this.B = null;
                }
                this.r = (byte) 3;
                return 0;
            }
            if (w6rVar.d.f25043a.h == z) {
                this.C -= 8;
                guoVar2.m(8);
            }
            boolean zEquals = "audio/ac4".equals(w6rVar.d.f25043a.g.p);
            int i33 = this.C;
            if (zEquals) {
                this.D = w6rVar.d(i33, 7);
                b34.f0(this.C, fq80Var);
                ncs0Var3.a(7, fq80Var);
                iD = this.D + 7;
                this.D = iD;
                i4 = 0;
            } else {
                i4 = 0;
                iD = w6rVar.d(i33, 0);
                this.D = iD;
            }
            this.C += iD;
            this.r = (byte) 4;
            this.E = i4;
        }
        ocs0 ocs0Var = w6rVar.d;
        lbs0 lbs0Var = ocs0Var.f25043a;
        long jA2 = !w6rVar.n ? ocs0Var.f[w6rVar.f] : xbs0Var8.i[w6rVar.f];
        if (coq0Var != null) {
            jA2 = coq0Var.a(jA2);
        }
        int i34 = lbs0Var.k;
        androidx.media3.common.b bVar2 = lbs0Var.g;
        if (i34 == 0) {
            arrayDeque3 = arrayDeque2;
            androidx.media3.common.b bVar3 = w6rVar.l;
            if (bVar3 != null && hew0.P(bVar2.p)) {
                androidx.media3.common.b bVarZ = hew0.Z(guoVar2, this.C, w6rVar.m);
                w6rVar.m = bVarZ;
                awq awqVarA = bVarZ.a();
                awqVarA.s = bVar3.t;
                ohs0.w(awqVarA, ncs0Var3);
                w6rVar.l = null;
            }
            while (true) {
                int i35 = this.D;
                int i36 = this.C;
                if (i35 >= i36) {
                    break;
                }
                this.D += ncs0Var3.e(guoVar2, i36 - i35, false);
            }
        } else {
            fq80 fq80Var9 = this.f;
            byte[] bArr2 = fq80Var9.f9961a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i37 = 4 - i34;
            while (true) {
                arrayDeque3 = arrayDeque2;
                if (this.D < this.C) {
                    int i38 = this.E;
                    if (i38 == 0) {
                        if (this.J.length > 0 || !this.F) {
                            int iJ0 = ntr.j0(bVar2);
                            if (i34 + iJ0 <= this.C - this.D) {
                                i3 = iJ0;
                            } else {
                                i3 = 0;
                            }
                        } else {
                            i3 = 0;
                        }
                        guoVar2.readFully(bArr2, i37, i34 + i3);
                        fq80Var9.M(0);
                        int iM7 = fq80Var9.m();
                        if (iM7 < 0) {
                            throw kq80.a("Invalid NAL length", null);
                        }
                        this.E = iM7 - i3;
                        fq80 fq80Var10 = this.e;
                        int i39 = i37;
                        fq80Var10.M(0);
                        ncs0Var3.a(4, fq80Var10);
                        this.D += 4;
                        this.C += i39;
                        if (this.J.length > 0 && i3 > 0 && (strE0 = ntr.e0(bVar2)) != null) {
                            switch (strE0.hashCode()) {
                                case -1662541442:
                                    if (strE0.equals(str)) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1331836730:
                                    if (strE0.equals("video/avc")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1331856911:
                                    if (strE0.equals("video/vvc")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    if (((bArr2[4] & 126) >> 1) == 39) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    break;
                                case 1:
                                    if ((bArr2[4] & 31) == c) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    break;
                                case 2:
                                    if (((bArr2[5] & 248) >> 3) == 23) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    break;
                                default:
                                    z2 = false;
                                    break;
                            }
                        } else {
                            z2 = false;
                        }
                        this.G = z2;
                        ncs0Var3.a(i3, fq80Var9);
                        this.D += i3;
                        if (i3 > 0 && !this.F && ntr.g0(bArr2, i3, bVar2)) {
                            this.F = true;
                        }
                        i37 = i39;
                    } else {
                        int i40 = i37;
                        if (this.G) {
                            fq80 fq80Var11 = this.g;
                            fq80Var11.J(i38);
                            guoVar2.readFully(fq80Var11.f9961a, 0, this.E);
                            ncs0Var3.a(this.E, fq80Var11);
                            int i41 = this.E;
                            int iW0 = ntr.w0(fq80Var11.f9961a, fq80Var11.c);
                            fq80Var11.M(0);
                            fq80Var11.L(iW0);
                            int i42 = bVar2.r;
                            if (i42 == -1) {
                                if (fpVar.b != 0) {
                                    fpVar.O(0);
                                }
                            } else if (fpVar.b != i42) {
                                fpVar.O(i42);
                            }
                            fpVar.a(jA2, fq80Var11);
                            if ((w6rVar.a() & 4) != 0) {
                                fpVar.v(0);
                            }
                            iE = i41;
                        } else {
                            iE = ncs0Var3.e(guoVar2, i38, false);
                        }
                        this.D += iE;
                        this.E -= iE;
                        i37 = i40;
                        str = str;
                    }
                    arrayDeque2 = arrayDeque3;
                    c = 6;
                }
            }
        }
        int iA2 = w6rVar.a();
        if (!this.F) {
            iA2 |= 67108864;
        }
        int i43 = iA2;
        vbs0 vbs0VarB2 = w6rVar.b();
        long j21 = jA2;
        ncs0Var3.b(j21, i43, this.C, 0, vbs0VarB2 != null ? vbs0VarB2.c : null);
        while (!arrayDeque3.isEmpty()) {
            u6r u6rVar = (u6r) arrayDeque3.removeFirst();
            this.x -= u6rVar.c;
            long jA3 = u6rVar.f35151a;
            if (u6rVar.b) {
                jA3 += j21;
            }
            if (coq0Var != null) {
                jA3 = coq0Var.a(jA3);
            }
            long j22 = jA3;
            for (ncs0 ncs0Var4 : this.I) {
                ncs0Var4.b(j22, 1, u6rVar.c, this.x, null);
            }
        }
        if (!w6rVar.c()) {
            this.B = null;
        }
        this.r = (byte) 3;
        return 0;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((w6r) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.x = 0;
        ((PriorityQueue) this.o.f).clear();
        this.y = j2;
        this.m.clear();
        this.N = -1L;
        g();
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        rcf0 rcf0VarT;
        qgk0 qgk0VarO = zgc.O(guoVar, true);
        if (qgk0VarO != null) {
            rcf0VarT = b4x.t(qgk0VarO);
        } else {
            v3x v3xVar = b4x.b;
            rcf0VarT = rcf0.e;
        }
        this.q = rcf0VarT;
        return qgk0VarO == null;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            huoVar = new o24(huoVar, this.f40377a);
        }
        this.H = huoVar;
        g();
        ncs0[] ncs0VarArr = new ncs0[2];
        this.I = ncs0VarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            ncs0VarArr[0] = this.H.q(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        ncs0[] ncs0VarArr2 = (ncs0[]) vtt0.O(i, this.I);
        this.I = ncs0VarArr2;
        for (ncs0 ncs0Var : ncs0VarArr2) {
            ncs0Var.c(P);
        }
        List list = this.c;
        this.J = new ncs0[list.size()];
        while (i4 < this.J.length) {
            ncs0 ncs0VarQ = this.H.q(i3, 3);
            ncs0VarQ.c((androidx.media3.common.b) list.get(i4));
            this.J[i4] = ncs0VarQ;
            i4++;
            i3++;
        }
    }

    @Override // a.fuo
    public final List f() {
        return this.q;
    }

    public final void g() {
        this.r = (byte) 0;
        this.u = 0;
    }

    public final void i(fvh0 fvh0Var, mtc mtcVar) {
        this.H.f(fvh0Var);
        this.K = true;
        mtcVar.f22363a = this.N;
        g();
    }

    /* JADX WARN: Code duplicated, block: B:299:0x06ac  */
    public final void l(long j) throws kq80 {
        ed40 ed40Var;
        long j2;
        qwj qwjVar;
        int i;
        qwj qwjVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        boolean z;
        ArrayList arrayList4;
        int i5;
        boolean z2;
        int i6;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((ev40) arrayDeque.peek()).e != j) {
                break;
            }
            ev40 ev40Var = (ev40) arrayDeque.pop();
            int i7 = ev40Var.b;
            ArrayList arrayList5 = ev40Var.g;
            ArrayList arrayList6 = ev40Var.f;
            int i8 = 12;
            SparseArray sparseArray = this.d;
            int i9 = this.b;
            if (i7 == 1836019574) {
                DrmInitData drmInitDataH = h(arrayList6);
                ev40 ev40VarV = ev40Var.v(1836475768);
                ev40VarV.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList7 = ev40VarV.f;
                int size = arrayList7.size();
                int i10 = 0;
                long jB = -9223372036854775807L;
                while (i10 < size) {
                    fv40 fv40Var = (fv40) arrayList7.get(i10);
                    int i11 = fv40Var.b;
                    fq80 fq80Var = fv40Var.e;
                    if (i11 == 1953654136) {
                        fq80Var.M(i8);
                        arrayList = arrayList7;
                        Pair pairCreate = Pair.create(Integer.valueOf(fq80Var.m()), new qwj(fq80Var.m() - 1, fq80Var.m(), fq80Var.m(), fq80Var.m()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (qwj) pairCreate.second);
                    } else {
                        arrayList = arrayList7;
                        if (i11 == 1835362404) {
                            fq80Var.M(8);
                            jB = hr8.e(fq80Var.m()) == 0 ? fq80Var.B() : fq80Var.F();
                        }
                    }
                    i10++;
                    arrayList7 = arrayList;
                    i8 = 12;
                }
                ev40 ev40VarV2 = ev40Var.v(1835365473);
                ed40 ed40VarF = ev40VarV2 != null ? hr8.f(ev40VarV2) : null;
                met metVar = new met();
                fv40 fv40VarW = ev40Var.w(1969517665);
                if (fv40VarW != null) {
                    ed40 ed40VarK = hr8.k(fv40VarW, (i9 & 1024) != 0);
                    metVar.b(ed40VarK);
                    ed40Var = ed40VarK;
                } else {
                    ed40Var = null;
                }
                fv40 fv40VarW2 = ev40Var.w(1836476516);
                fv40VarW2.getClass();
                ed40 ed40Var2 = new ed40(hr8.g(fv40VarW2.e));
                ArrayList arrayListJ = hr8.j(ev40Var, metVar, jB, drmInitDataH, (i9 & 16) != 0, false, new t6r(this, (byte) 0), false);
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strK = d9x.K(arrayListJ);
                    int i12 = 0;
                    while (i12 < size2) {
                        ocs0 ocs0Var = (ocs0) arrayListJ.get(i12);
                        lbs0 lbs0Var = ocs0Var.f25043a;
                        boolean z3 = lbs0Var.m;
                        int i13 = lbs0Var.f19766a;
                        androidx.media3.common.b bVar = lbs0Var.g;
                        int i14 = size2;
                        String str = strK;
                        long j3 = lbs0Var.e;
                        int i15 = lbs0Var.b;
                        if (z3) {
                            ncs0 ncs0VarQ = this.H.q(i12, i15);
                            ncs0VarQ.f(j3);
                            awq awqVarA = bVar.a();
                            awqVarA.n = mg40.n(str);
                            if (i15 == 1) {
                                int i16 = metVar.f21663a;
                                j2 = j3;
                                if (i16 != -1 && (i = metVar.b) != -1) {
                                    awqVarA.M = i16;
                                    awqVarA.N = i;
                                }
                            } else {
                                j2 = j3;
                            }
                            l7x.Z(i15, ed40VarF, awqVarA, bVar.m, ed40Var, ed40Var2);
                            if (sparseArray2.size() == 1) {
                                qwjVar = (qwj) sparseArray2.valueAt(0);
                            } else {
                                qwjVar = (qwj) sparseArray2.get(i13);
                                qwjVar.getClass();
                            }
                            sparseArray.put(i13, new w6r(ncs0VarQ, ocs0Var, qwjVar, new androidx.media3.common.b(awqVarA)));
                            this.z = Math.max(this.z, j2);
                        }
                        i12++;
                        size2 = i14;
                        strK = str;
                        arrayListJ = arrayListJ;
                    }
                    this.H.o();
                } else {
                    ArrayList arrayList8 = arrayListJ;
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        if (((ocs0) arrayList9.get(i17)).f25043a.m) {
                            i18++;
                        }
                        i17++;
                        arrayList8 = arrayList9;
                    }
                    ArrayList arrayList10 = arrayList8;
                    x0x.K(sparseArray.size() == i18);
                    for (int i19 = 0; i19 < size2; i19++) {
                        ocs0 ocs0Var2 = (ocs0) arrayList10.get(i19);
                        lbs0 lbs0Var2 = ocs0Var2.f25043a;
                        boolean z4 = lbs0Var2.m;
                        int i20 = lbs0Var2.f19766a;
                        if (z4) {
                            w6r w6rVar = (w6r) sparseArray.get(i20);
                            if (sparseArray2.size() == 1) {
                                qwjVar2 = (qwj) sparseArray2.valueAt(0);
                            } else {
                                qwjVar2 = (qwj) sparseArray2.get(i20);
                                qwjVar2.getClass();
                            }
                            w6rVar.d = ocs0Var2;
                            w6rVar.e = qwjVar2;
                            if (w6rVar.l == null) {
                                w6rVar.f38638a.c(w6rVar.m);
                            }
                            w6rVar.e();
                        }
                    }
                }
            } else if (i7 == 1836019558) {
                int size3 = arrayList5.size();
                int i21 = 0;
                while (i21 < size3) {
                    ev40 ev40Var2 = (ev40) arrayList5.get(i21);
                    if (ev40Var2.b == 1953653094) {
                        fv40 fv40VarW3 = ev40Var2.w(1952868452);
                        ArrayList arrayList11 = ev40Var2.f;
                        fv40VarW3.getClass();
                        fq80 fq80Var2 = fv40VarW3.e;
                        fq80Var2.M(8);
                        int iM = fq80Var2.m();
                        byte[] bArr2 = hr8.f13518a;
                        w6r w6rVar2 = (w6r) sparseArray.get(fq80Var2.m());
                        if (w6rVar2 == null) {
                            size3 = size3;
                            w6rVar2 = null;
                        } else {
                            xbs0 xbs0Var = w6rVar2.b;
                            if ((iM & 1) != 0) {
                                long jF = fq80Var2.F();
                                xbs0Var.b = jF;
                                xbs0Var.c = jF;
                            }
                            qwj qwjVar3 = w6rVar2.e;
                            xbs0Var.f40615a = new qwj((iM & 2) != 0 ? fq80Var2.m() - 1 : qwjVar3.f29438a, (iM & 8) != 0 ? fq80Var2.m() : qwjVar3.b, (iM & 16) != 0 ? fq80Var2.m() : qwjVar3.c, (iM & 32) != 0 ? fq80Var2.m() : qwjVar3.d);
                        }
                        if (w6rVar2 != null) {
                            xbs0 xbs0Var2 = w6rVar2.b;
                            long j4 = xbs0Var2.p;
                            boolean z5 = xbs0Var2.q;
                            w6rVar2.e();
                            w6rVar2.n = true;
                            fv40 fv40VarW4 = ev40Var2.w(1952867444);
                            if (fv40VarW4 == null || (i9 & 2) != 0) {
                                xbs0Var2.p = j4;
                                xbs0Var2.q = z5;
                            } else {
                                fq80 fq80Var3 = fv40VarW4.e;
                                fq80Var3.M(8);
                                xbs0Var2.p = hr8.e(fq80Var3.m()) == 1 ? fq80Var3.F() : fq80Var3.B();
                                xbs0Var2.q = true;
                            }
                            int size4 = arrayList11.size();
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                i3 = 1953658222;
                                if (i22 >= size4) {
                                    break;
                                }
                                fv40 fv40Var2 = (fv40) arrayList11.get(i22);
                                ArrayList arrayList12 = arrayList5;
                                if (fv40Var2.b == 1953658222) {
                                    fq80 fq80Var4 = fv40Var2.e;
                                    fq80Var4.M(12);
                                    int iD = fq80Var4.D();
                                    if (iD > 0) {
                                        i24 += iD;
                                        i23++;
                                    }
                                }
                                i22++;
                                arrayList5 = arrayList12;
                            }
                            arrayList2 = arrayList5;
                            w6rVar2.h = 0;
                            w6rVar2.g = 0;
                            w6rVar2.f = 0;
                            xbs0Var2.d = i23;
                            xbs0Var2.e = i24;
                            if (xbs0Var2.g.length < i23) {
                                xbs0Var2.f = new long[i23];
                                xbs0Var2.g = new int[i23];
                            }
                            if (xbs0Var2.h.length < i24) {
                                int i25 = (i24 * 125) / 100;
                                xbs0Var2.h = new int[i25];
                                xbs0Var2.i = new long[i25];
                                xbs0Var2.j = new boolean[i25];
                                xbs0Var2.l = new boolean[i25];
                            }
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            while (true) {
                                long jA = 0;
                                if (i26 >= size4) {
                                    arrayList3 = arrayList6;
                                    ArrayList arrayList13 = arrayList11;
                                    i2 = i21;
                                    lbs0 lbs0Var3 = w6rVar2.d.f25043a;
                                    qwj qwjVar4 = xbs0Var2.f40615a;
                                    qwjVar4.getClass();
                                    int i29 = qwjVar4.f29438a;
                                    vbs0[] vbs0VarArr = lbs0Var3.n;
                                    vbs0 vbs0Var = vbs0VarArr == null ? null : vbs0VarArr[i29];
                                    fv40 fv40VarW5 = ev40Var2.w(1935763834);
                                    if (fv40VarW5 != null) {
                                        vbs0Var.getClass();
                                        fq80 fq80Var5 = fv40VarW5.e;
                                        short s = vbs0Var.d;
                                        fq80Var5.M(8);
                                        int iM2 = fq80Var5.m();
                                        byte[] bArr3 = hr8.f13518a;
                                        if ((iM2 & 1) == 1) {
                                            fq80Var5.N(8);
                                        }
                                        int iZ = fq80Var5.z();
                                        int iD2 = fq80Var5.D();
                                        if (iD2 > xbs0Var2.e) {
                                            StringBuilder sbM = b1j.m(iD2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbM.append(xbs0Var2.e);
                                            throw kq80.a(sbM.toString(), null);
                                        }
                                        if (iZ == 0) {
                                            boolean[] zArr = xbs0Var2.l;
                                            i4 = 0;
                                            for (int i30 = 0; i30 < iD2; i30++) {
                                                int iZ2 = fq80Var5.z();
                                                i4 += iZ2;
                                                zArr[i30] = iZ2 > s;
                                            }
                                            z = false;
                                        } else {
                                            boolean z6 = iZ > s;
                                            i4 = iZ * iD2;
                                            z = false;
                                            Arrays.fill(xbs0Var2.l, 0, iD2, z6);
                                        }
                                        Arrays.fill(xbs0Var2.l, iD2, xbs0Var2.e, z);
                                        if (i4 > 0) {
                                            xbs0Var2.n.J(i4);
                                            xbs0Var2.k = true;
                                            xbs0Var2.o = true;
                                        }
                                    }
                                    fv40 fv40VarW6 = ev40Var2.w(1935763823);
                                    if (fv40VarW6 != null) {
                                        fq80 fq80Var6 = fv40VarW6.e;
                                        fq80Var6.M(8);
                                        int iM3 = fq80Var6.m();
                                        byte[] bArr4 = hr8.f13518a;
                                        if ((iM3 & 1) == 1) {
                                            fq80Var6.N(8);
                                        }
                                        int iD3 = fq80Var6.D();
                                        if (iD3 != 1) {
                                            throw kq80.a("Unexpected saio entry count: " + iD3, null);
                                        }
                                        xbs0Var2.c += hr8.e(iM3) == 0 ? fq80Var6.B() : fq80Var6.F();
                                    }
                                    fv40 fv40VarW7 = ev40Var2.w(1936027235);
                                    if (fv40VarW7 != null) {
                                        j(fv40VarW7.e, 0, xbs0Var2);
                                    }
                                    String str2 = vbs0Var != null ? vbs0Var.b : null;
                                    fq80 fq80Var7 = null;
                                    fq80 fq80Var8 = null;
                                    int i31 = 0;
                                    while (i31 < arrayList13.size()) {
                                        ArrayList arrayList14 = arrayList13;
                                        fv40 fv40Var3 = (fv40) arrayList14.get(i31);
                                        fq80 fq80Var9 = fv40Var3.e;
                                        int i32 = fv40Var3.b;
                                        if (i32 == 1935828848) {
                                            fq80Var9.M(12);
                                            if (fq80Var9.m() == 1936025959) {
                                                fq80Var8 = fq80Var9;
                                            }
                                        } else if (i32 == 1936158820) {
                                            fq80Var9.M(12);
                                            if (fq80Var9.m() == 1936025959) {
                                                fq80Var7 = fq80Var9;
                                            }
                                        }
                                        i31++;
                                        arrayList13 = arrayList14;
                                    }
                                    ArrayList arrayList15 = arrayList13;
                                    if (fq80Var8 != null && fq80Var7 != null) {
                                        fq80Var8.M(8);
                                        int iE = hr8.e(fq80Var8.m());
                                        fq80Var8.N(4);
                                        if (iE == 1) {
                                            fq80Var8.N(4);
                                        }
                                        if (fq80Var8.m() != 1) {
                                            throw kq80.e("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        fq80Var7.M(8);
                                        int iE2 = hr8.e(fq80Var7.m());
                                        fq80Var7.N(4);
                                        long jB2 = iE2 >= 1 ? fq80Var7.B() : 0L;
                                        if (iE2 >= 2) {
                                            fq80Var7.N(4);
                                        }
                                        if (fq80Var7.B() != 1) {
                                            throw kq80.e("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        if (iE2 >= 1 && jB2 == 0) {
                                            fq80Var7.N(4);
                                        }
                                        fq80Var7.N(1);
                                        int iZ3 = fq80Var7.z();
                                        int i33 = (iZ3 & 240) >> 4;
                                        int i34 = iZ3 & 15;
                                        boolean z7 = fq80Var7.z() == 1;
                                        if (z7) {
                                            int iZ4 = fq80Var7.z();
                                            byte[] bArr5 = new byte[16];
                                            fq80Var7.k(bArr5, 0, 16);
                                            if (iZ4 == 0) {
                                                int iZ5 = fq80Var7.z();
                                                byte[] bArr6 = new byte[iZ5];
                                                fq80Var7.k(bArr6, 0, iZ5);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            xbs0Var2.k = true;
                                            xbs0Var2.m = new vbs0(z7, str2, iZ4, bArr5, i33, i34, bArr);
                                        }
                                    }
                                    int size5 = arrayList15.size();
                                    for (int i35 = 0; i35 < size5; i35++) {
                                        fv40 fv40Var4 = (fv40) arrayList15.get(i35);
                                        if (fv40Var4.b == 1970628964) {
                                            fq80 fq80Var10 = fv40Var4.e;
                                            fq80Var10.M(8);
                                            byte[] bArr7 = this.h;
                                            fq80Var10.k(bArr7, 0, 16);
                                            if (Arrays.equals(bArr7, O)) {
                                                j(fq80Var10, 16, xbs0Var2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                fv40 fv40Var5 = (fv40) arrayList11.get(i26);
                                if (fv40Var5.b == i3) {
                                    int i36 = i27 + 1;
                                    fq80 fq80Var11 = fv40Var5.e;
                                    fq80Var11.M(8);
                                    int iM4 = fq80Var11.m();
                                    byte[] bArr8 = hr8.f13518a;
                                    lbs0 lbs0Var4 = w6rVar2.d.f25043a;
                                    qwj qwjVar5 = xbs0Var2.f40615a;
                                    String str3 = vtt0.f38024a;
                                    xbs0Var2.g[i27] = fq80Var11.D();
                                    long[] jArr = xbs0Var2.f;
                                    int i37 = i28;
                                    long j5 = xbs0Var2.b;
                                    jArr[i27] = j5;
                                    if ((iM4 & 1) != 0) {
                                        jArr[i27] = j5 + ((long) fq80Var11.m());
                                    }
                                    boolean z8 = (iM4 & 4) != 0;
                                    int iM5 = qwjVar5.d;
                                    if (z8) {
                                        iM5 = fq80Var11.m();
                                    }
                                    boolean z9 = (iM4 & 256) != 0;
                                    boolean z10 = z8;
                                    boolean z11 = (iM4 & 512) != 0;
                                    boolean z12 = (iM4 & 1024) != 0;
                                    boolean z13 = (iM4 & 2048) != 0;
                                    boolean z14 = z12;
                                    c4x c4xVar = lbs0Var4.i;
                                    int i38 = i27;
                                    c4x c4xVar2 = lbs0Var4.j;
                                    if (c4xVar != null) {
                                        i5 = iM5;
                                        z2 = z9;
                                        if (c4xVar.b != 1 || c4xVar2 == null) {
                                            arrayList4 = arrayList11;
                                        } else {
                                            if (c4xVar.a(0) == 0) {
                                                arrayList4 = arrayList11;
                                            } else {
                                                long jA2 = c4xVar.a(0);
                                                long j6 = lbs0Var4.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                long jT = vtt0.T(jA2, 1000000L, j6, roundingMode);
                                                arrayList4 = arrayList11;
                                                i6 = jT + vtt0.T(c4xVar2.a(0), 1000000L, lbs0Var4.c, roundingMode) >= lbs0Var4.e ? 0 : 0;
                                            }
                                            jA = c4xVar2.a(i6);
                                        }
                                    } else {
                                        arrayList4 = arrayList11;
                                        i5 = iM5;
                                        z2 = z9;
                                    }
                                    int[] iArr = xbs0Var2.h;
                                    long[] jArr2 = xbs0Var2.i;
                                    boolean[] zArr2 = xbs0Var2.j;
                                    boolean z15 = lbs0Var4.b == 2 && (i9 & 1) != 0;
                                    i28 = i37 + xbs0Var2.g[i38];
                                    long j7 = lbs0Var4.c;
                                    long j8 = xbs0Var2.p;
                                    int i39 = i37;
                                    while (i39 < i28) {
                                        int iM6 = z2 ? fq80Var11.m() : qwjVar5.b;
                                        boolean[] zArr3 = zArr2;
                                        if (iM6 < 0) {
                                            throw kq80.a("Unexpected negative value: " + iM6, null);
                                        }
                                        int iM7 = z11 ? fq80Var11.m() : qwjVar5.c;
                                        if (iM7 < 0) {
                                            throw kq80.a("Unexpected negative value: " + iM7, null);
                                        }
                                        int iM8 = z14 ? fq80Var11.m() : (i39 == 0 && z10) ? i5 : qwjVar5.d;
                                        long jT2 = vtt0.T((((long) (z13 ? fq80Var11.m() : 0)) + j8) - jA, 1000000L, j7, RoundingMode.DOWN);
                                        jArr2[i39] = jT2;
                                        if (!xbs0Var2.q) {
                                            jArr2[i39] = jT2 + w6rVar2.d.i;
                                        }
                                        iArr[i39] = iM7;
                                        zArr3[i39] = ((iM8 >> 16) & 1) == 0 && (!z15 || i39 == 0);
                                        j8 += (long) iM6;
                                        i39++;
                                        i28 = i28;
                                        zArr2 = zArr3;
                                        z15 = z15;
                                        qwjVar5 = qwjVar5;
                                        fq80Var11 = fq80Var11;
                                    }
                                    xbs0Var2.p = j8;
                                    i27 = i36;
                                } else {
                                    arrayList4 = arrayList11;
                                }
                                i26++;
                                size4 = size4;
                                arrayList6 = arrayList6;
                                i21 = i21;
                                arrayList11 = arrayList4;
                                i3 = 1953658222;
                            }
                        } else {
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            i2 = i21;
                        }
                    } else {
                        size3 = size3;
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList6;
                        i2 = i21;
                    }
                    i21 = i2 + 1;
                    size3 = size3;
                    arrayList5 = arrayList2;
                    arrayList6 = arrayList3;
                }
                DrmInitData drmInitDataH2 = h(arrayList6);
                if (drmInitDataH2 != null) {
                    int size6 = sparseArray.size();
                    for (int i40 = 0; i40 < size6; i40++) {
                        w6r w6rVar3 = (w6r) sparseArray.valueAt(i40);
                        lbs0 lbs0Var5 = w6rVar3.d.f25043a;
                        qwj qwjVar6 = w6rVar3.b.f40615a;
                        String str4 = vtt0.f38024a;
                        int i41 = qwjVar6.f29438a;
                        vbs0[] vbs0VarArr2 = lbs0Var5.n;
                        vbs0 vbs0Var2 = vbs0VarArr2 == null ? null : vbs0VarArr2[i41];
                        DrmInitData drmInitDataA = drmInitDataH2.a(vbs0Var2 != null ? vbs0Var2.b : null);
                        awq awqVarA2 = w6rVar3.m.a();
                        awqVarA2.s = drmInitDataA;
                        androidx.media3.common.b bVar2 = new androidx.media3.common.b(awqVarA2);
                        if (w6rVar3.l != null) {
                            w6rVar3.l = bVar2;
                        } else {
                            w6rVar3.f38638a.c(bVar2);
                        }
                    }
                }
                if (this.y != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i42 = 0; i42 < size7; i42++) {
                        w6r w6rVar4 = (w6r) sparseArray.valueAt(i42);
                        long j9 = this.y;
                        int i43 = w6rVar4.f;
                        while (true) {
                            xbs0 xbs0Var3 = w6rVar4.b;
                            if (i43 >= xbs0Var3.e || xbs0Var3.i[i43] > j9) {
                                break;
                            }
                            if (xbs0Var3.j[i43]) {
                                w6rVar4.i = i43;
                            }
                            i43++;
                        }
                    }
                    this.y = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((ev40) arrayDeque.peek()).g.add(ev40Var);
            }
        }
        g();
    }

    @Override // a.fuo
    public final void release() {
    }
}
