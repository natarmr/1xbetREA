package a;

import android.util.LongSparseArray;
import android.util.SparseArray;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class cj30 implements fuo {
    public static final byte[] r0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] s0;
    public static final byte[] t0;
    public static final byte[] u0;
    public static final UUID v0;
    public static final Map w0;
    public yi30 A;
    public bj30 B;
    public boolean C;
    public int D;
    public long E;
    public final SparseArray F;
    public boolean G;
    public long H;
    public int I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public long N;
    public long O;
    public long P;
    public boolean Q;
    public long R;
    public boolean S;
    public long T;
    public boolean U;
    public byte V;
    public long W;
    public long X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final buj f4441a;
    public int[] a0;
    public final u3u0 b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final LongSparseArray d;
    public int d0;
    public final boolean e;
    public int e0;
    public final boolean f;
    public boolean f0;
    public final boolean g;
    public long g0;
    public final jfn0 h;
    public int h0;
    public final fq80 i;
    public int i0;
    public final fq80 j;
    public int j0;
    public final fq80 k;
    public boolean k0;
    public final fq80 l;
    public boolean l0;
    public final fq80 m;
    public boolean m0;
    public final fq80 n;
    public short n0;
    public final fq80 o;
    public byte o0;
    public final fq80 p;
    public boolean p0;
    public final fq80 q;
    public huo q0;
    public final fq80 r;
    public ByteBuffer s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public boolean z;

    static {
        String str = vtt0.f38024a;
        s0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        t0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        u0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        v0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        kng0.x(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        kng0.x(180, map, "htc_video_rotA-180", SubsamplingScaleImageView.ORIENTATION_270, "htc_video_rotA-270");
        w0 = Collections.unmodifiableMap(map);
    }

    public cj30(jfn0 jfn0Var, int i) {
        buj bujVar = new buj();
        this.u = -1L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1L;
        this.K = -1L;
        this.L = -1;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.R = -1L;
        this.T = -9223372036854775807L;
        this.f4441a = bujVar;
        bujVar.d = new pv00(this);
        this.h = jfn0Var;
        this.F = new SparseArray();
        this.e = (i & 1) == 0;
        this.g = (i & 2) == 0;
        this.f = (i & 4) == 0;
        this.b = new u3u0();
        this.d = new LongSparseArray();
        this.c = new SparseArray();
        this.k = new fq80(4);
        this.l = new fq80(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new fq80(4);
        this.i = new fq80(ntr.j);
        this.j = new fq80(4);
        this.n = new fq80();
        this.o = new fq80();
        this.p = new fq80(8);
        this.q = new fq80();
        this.r = new fq80();
        this.a0 = new int[1];
        this.z = true;
    }

    public static byte[] j(long j, long j2, String str) {
        x0x.A(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = vtt0.f38024a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) {
        int i = 0;
        this.U = false;
        boolean zA = true;
        while (zA && !this.U) {
            zA = this.f4441a.a(guoVar);
            if (zA) {
                long position = guoVar.getPosition();
                if (this.Q) {
                    this.R = position;
                    mtcVar.f22363a = this.P;
                    this.Q = false;
                    return 1;
                }
                if (this.S) {
                    long j = this.R;
                    if (j != -1) {
                        mtcVar.f22363a = j;
                        this.R = -1L;
                        return 1;
                    }
                }
                long position2 = guoVar.getPosition();
                if (this.M) {
                    this.O = position2;
                    mtcVar.f22363a = this.N;
                    this.M = false;
                    return 1;
                }
                if (this.C) {
                    long j2 = this.O;
                    if (j2 != -1) {
                        mtcVar.f22363a = j2;
                        this.O = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (zA) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return -1;
            }
            bj30 bj30Var = (bj30) sparseArray.valueAt(i);
            bj30Var.d0.getClass();
            rrs0 rrs0Var = bj30Var.W;
            if (rrs0Var != null) {
                rrs0Var.a(bj30Var.d0, bj30Var.l);
            }
            i++;
        }
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        this.T = -9223372036854775807L;
        this.V = (byte) 0;
        buj bujVar = this.f4441a;
        bujVar.e = (byte) 0;
        bujVar.b.clear();
        u3u0 u3u0Var = bujVar.c;
        u3u0Var.b = false;
        u3u0Var.f35015a = 0;
        u3u0 u3u0Var2 = this.b;
        u3u0Var2.b = false;
        u3u0Var2.f35015a = 0;
        o();
        this.G = false;
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1L;
        this.K = -1L;
        if (!this.C) {
            this.F.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            rrs0 rrs0Var = ((bj30) sparseArray.valueAt(i)).W;
            if (rrs0Var != null) {
                rrs0Var.b = false;
                rrs0Var.c = 0;
            }
            i++;
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) throws EOFException, InterruptedIOException {
        y78 y78Var = new y78((byte) 17);
        fq80 fq80Var = (fq80) y78Var.c;
        guj gujVar = (guj) guoVar;
        long j = gujVar.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        gujVar.b(fq80Var.f9961a, 0, 4, false);
        y78Var.b = 4;
        for (long jB = fq80Var.B(); jB != 440786851; jB = ((jB << 8) & (-256)) | ((long) (fq80Var.f9961a[0] & 255))) {
            int i2 = y78Var.b + 1;
            y78Var.b = i2;
            if (i2 == i) {
                return false;
            }
            gujVar.b(fq80Var.f9961a, 0, 1, false);
        }
        long jT = y78Var.t(gujVar);
        long j3 = y78Var.b;
        if (jT != Long.MIN_VALUE && (j == -1 || j3 + jT < j)) {
            while (true) {
                long j4 = y78Var.b;
                long j5 = j3 + jT;
                if (j4 < j5) {
                    if (y78Var.t(gujVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jT2 = y78Var.t(gujVar);
                    if (jT2 < 0 || jT2 > 2147483647L) {
                        break;
                    }
                    if (jT2 != 0) {
                        int i3 = (int) jT2;
                        gujVar.f(i3, false);
                        y78Var.b += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        if (this.g) {
            huoVar = new o24(huoVar, this.h);
        }
        this.q0 = huoVar;
    }

    public final void g(int i) {
        if (this.G) {
            return;
        }
        throw kq80.a("Element " + i + " must be in a Cues", null);
    }

    public final void h(int i) {
        if (this.B != null) {
            return;
        }
        throw kq80.a("Element " + i + " must be in a TrackEntry", null);
    }

    public final void i(bj30 bj30Var, long j, int i, int i2, int i3) {
        byte[] bArrJ;
        int i4;
        int i5;
        rrs0 rrs0Var = bj30Var.W;
        if (rrs0Var != null) {
            rrs0Var.b(bj30Var.d0, j, i, i2, i3, bj30Var.l);
        } else {
            if ("S_TEXT/UTF8".equals(bj30Var.c) || "S_TEXT/ASS".equals(bj30Var.c) || "S_TEXT/SSA".equals(bj30Var.c) || "S_TEXT/WEBVTT".equals(bj30Var.c)) {
                if (this.Z > 1) {
                    f1t0.g0("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.X;
                    if (j2 == -9223372036854775807L) {
                        f1t0.g0("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = bj30Var.c;
                        fq80 fq80Var = this.o;
                        byte[] bArr = fq80Var.f9961a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrJ = j(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrJ = j(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrJ = j(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                e9d0.o();
                                return;
                        }
                        System.arraycopy(bArrJ, 0, bArr, i4, bArrJ.length);
                        for (int i6 = fq80Var.b; i6 < fq80Var.c; i6++) {
                            if (fq80Var.f9961a[i6] == 0) {
                                fq80Var.L(i6);
                                bj30Var.d0.a(fq80Var.c, fq80Var);
                                i5 = i2 + fq80Var.c;
                            }
                        }
                        bj30Var.d0.a(fq80Var.c, fq80Var);
                        i5 = i2 + fq80Var.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.Z;
                fq80 fq80Var2 = this.r;
                if (i7 > 1) {
                    fq80Var2.J(0);
                } else {
                    int i8 = fq80Var2.c;
                    bj30Var.d0.d(fq80Var2, i8, 2);
                    i5 += i8;
                }
            }
            bj30Var.d0.b(j, i, i5, i3, bj30Var.l);
        }
        this.U = true;
    }

    public final yi30 k(int i) throws kq80 {
        yi30 yi30Var = this.A;
        if (yi30Var != null) {
            return yi30Var;
        }
        throw kq80.a("Element " + i + " must be in an EditionEntry", null);
    }

    public final void l() {
        if (!this.z) {
            return;
        }
        if (this.P != -1 && !this.S) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                huo huoVar = this.q0;
                huoVar.getClass();
                huoVar.o();
                this.z = false;
                return;
            }
            if (((bj30) sparseArray.valueAt(i)).X) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void m() {
        if (this.C) {
            return;
        }
        if (this.e && this.N != -1) {
            this.M = true;
            return;
        }
        huo huoVar = this.q0;
        huoVar.getClass();
        huoVar.f(new ca5(this.x));
        this.C = true;
    }

    public final void n(guo guoVar, int i) {
        fq80 fq80Var = this.k;
        if (fq80Var.c >= i) {
            return;
        }
        byte[] bArr = fq80Var.f9961a;
        if (bArr.length < i) {
            fq80Var.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = fq80Var.f9961a;
        int i2 = fq80Var.c;
        guoVar.readFully(bArr2, i2, i - i2);
        fq80Var.L(i);
    }

    public final void o() {
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = (short) 0;
        this.o0 = (byte) 0;
        this.p0 = false;
        this.n.J(0);
    }

    public final long p(long j) throws kq80 {
        long j2 = this.v;
        if (j2 == -9223372036854775807L) {
            throw kq80.a("Can't scale timecode prior to timecodeScale being set.", null);
        }
        String str = vtt0.f38024a;
        return vtt0.T(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public final void q(bj30 bj30Var) {
        long j;
        char c;
        long j2;
        long j3;
        long j4;
        long j5;
        ed40 ed40Var;
        kdq0 kdq0Var;
        boolean z;
        ed40 ed40VarA;
        long j6 = 0;
        int i = 1;
        char c2 = 0;
        if (!bj30Var.Y) {
            LongSparseArray longSparseArray = this.d;
            if (longSparseArray.size() != 0) {
                ArrayList arrayList = new ArrayList(longSparseArray.size());
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    yi30 yi30Var = (yi30) longSparseArray.valueAt(i2);
                    long j7 = yi30Var.e;
                    if (j7 == 0 || j7 == bj30Var.e) {
                        long j8 = yi30Var.b;
                        String str = vtt0.f38024a;
                        if (j8 != -9223372036854775807L && j8 != Long.MIN_VALUE) {
                            j8 /= 1000000;
                        }
                        long j9 = j8;
                        long j10 = yi30Var.c;
                        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
                            j10 /= 1000000;
                        }
                        arrayList.add(new gub(j9, j10, yi30Var.d, yi30Var.f != null ? new uty(yi30Var.g, yi30Var.f) : null));
                    }
                }
                if (!arrayList.isEmpty()) {
                    androidx.media3.common.b bVar = bj30Var.e0;
                    bVar.getClass();
                    awq awqVarA = bVar.a();
                    ed40 ed40Var2 = bj30Var.e0.m;
                    awqVarA.l = ed40Var2 != null ? ed40Var2.a((cd40[]) arrayList.toArray(new eub[0])) : new ed40(arrayList);
                    bj30Var.e0 = new androidx.media3.common.b(awqVarA);
                    bj30Var.Y = true;
                }
            }
        }
        long j11 = this.x;
        long j12 = this.u;
        long j13 = this.t;
        if (bj30Var.f != 2) {
            return;
        }
        List list = (List) this.F.get(bj30Var.d);
        if (bj30Var.Z || list == null || list.isEmpty()) {
            return;
        }
        if (!list.isEmpty()) {
            int iMin = Math.min(list.size(), 20);
            double d = 0.0d;
            j = -9223372036854775807L;
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (i3 >= iMin) {
                    c = c2;
                    break;
                }
                long j14 = j6;
                zi30 zi30Var = (zi30) list.get(i3);
                char c3 = c2;
                long j15 = j11;
                long j16 = zi30Var.f44422a;
                c = c3;
                int i5 = i;
                long j17 = zi30Var.c;
                long j18 = j12;
                long j19 = zi30Var.b;
                if (j16 > 10000000) {
                    break;
                }
                if (i3 < list.size() - i5) {
                    zi30 zi30Var2 = (zi30) list.get(i3 + 1);
                    j3 = j13;
                    j4 = (zi30Var2.b + zi30Var2.c) - (j19 + j17);
                    j5 = zi30Var2.f44422a - j16;
                } else {
                    j3 = j13;
                    j4 = (j18 + j3) - (j19 + j17);
                    j5 = j15 - j16;
                }
                if (j5 > j14) {
                    double d2 = j4 / j5;
                    if (d2 > d) {
                        i4 = i3;
                        d = d2;
                    }
                }
                i3++;
                c2 = c;
                j6 = j14;
                j11 = j15;
                j12 = j18;
                j13 = j3;
                i = 1;
            }
            if (i4 != -1) {
                j2 = ((zi30) list.get(i4)).f44422a;
            }
            if (j2 != j) {
                androidx.media3.common.b bVar2 = bj30Var.e0;
                bVar2.getClass();
                ed40Var = bVar2.m;
                kdq0Var = new kdq0(j2);
                if (ed40Var == null) {
                    z = true;
                    cd40[] cd40VarArr = new cd40[1];
                    cd40VarArr[c] = kdq0Var;
                    ed40VarA = new ed40(cd40VarArr);
                } else {
                    z = true;
                    cd40[] cd40VarArr2 = new cd40[1];
                    cd40VarArr2[c] = kdq0Var;
                    ed40VarA = ed40Var.a(cd40VarArr2);
                }
                awq awqVarA2 = bj30Var.e0.a();
                awqVarA2.l = ed40VarA;
                bj30Var.e0 = new androidx.media3.common.b(awqVarA2);
                bj30Var.Z = z;
            }
        }
        j = -9223372036854775807L;
        c = 0;
        j2 = j;
        if (j2 != j) {
            androidx.media3.common.b bVar3 = bj30Var.e0;
            bVar3.getClass();
            ed40Var = bVar3.m;
            kdq0Var = new kdq0(j2);
            if (ed40Var == null) {
                z = true;
                cd40[] cd40VarArr3 = new cd40[1];
                cd40VarArr3[c] = kdq0Var;
                ed40VarA = new ed40(cd40VarArr3);
            } else {
                z = true;
                cd40[] cd40VarArr4 = new cd40[1];
                cd40VarArr4[c] = kdq0Var;
                ed40VarA = ed40Var.a(cd40VarArr4);
            }
            awq awqVarA3 = bj30Var.e0.a();
            awqVarA3.l = ed40VarA;
            bj30Var.e0 = new androidx.media3.common.b(awqVarA3);
            bj30Var.Z = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Type inference failed for: r6v64, types: [int, short] */
    public final int r(guo guoVar, bj30 bj30Var, int i, boolean z) {
        int iE;
        int iE2;
        int i2;
        boolean z2;
        short s;
        if ("S_TEXT/UTF8".equals(bj30Var.c)) {
            s(guoVar, r0, i);
            int i3 = this.i0;
            o();
            return i3;
        }
        if ("S_TEXT/ASS".equals(bj30Var.c) || "S_TEXT/SSA".equals(bj30Var.c)) {
            s(guoVar, t0, i);
            int i4 = this.i0;
            o();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(bj30Var.c)) {
            s(guoVar, u0, i);
            int i5 = this.i0;
            o();
            return i5;
        }
        if (bj30Var.X) {
            bj30Var.e0.getClass();
            androidx.media3.common.b bVarZ = hew0.Z(guoVar, i, bj30Var.e0);
            bj30Var.e0 = bVarZ;
            bj30Var.d0.c(bVarZ);
            bj30Var.X = false;
            l();
        }
        ncs0 ncs0Var = bj30Var.d0;
        boolean z3 = this.k0;
        fq80 fq80Var = this.n;
        int i6 = 2;
        if (!z3) {
            boolean z4 = bj30Var.j;
            fq80 fq80Var2 = this.k;
            if (z4) {
                this.d0 &= -1073741825;
                if (!this.l0) {
                    guoVar.readFully(fq80Var2.f9961a, 0, 1);
                    this.h0++;
                    byte b = fq80Var2.f9961a[0];
                    if ((b & 128) == 128) {
                        throw kq80.a("Extension bit is set in signal byte", null);
                    }
                    this.o0 = b;
                    this.l0 = true;
                }
                byte b2 = this.o0;
                if ((b2 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z5 = (b2 & 2) == 2;
                    this.d0 |= 1073741824;
                    if (!this.p0) {
                        fq80 fq80Var3 = this.p;
                        guoVar.readFully(fq80Var3.f9961a, 0, 8);
                        this.h0 += 8;
                        this.p0 = true;
                        fq80Var2.f9961a[0] = (byte) ((z5 ? 128 : 0) | 8);
                        fq80Var2.M(0);
                        ncs0Var.d(fq80Var2, 1, 1);
                        this.i0++;
                        fq80Var3.M(0);
                        ncs0Var.d(fq80Var3, 8, 1);
                        this.i0 += 8;
                    }
                    if (z5) {
                        if (!this.m0) {
                            guoVar.readFully(fq80Var2.f9961a, 0, 1);
                            this.h0++;
                            fq80Var2.M(0);
                            this.n0 = fq80Var2.z();
                            this.m0 = true;
                        }
                        int i7 = this.n0 * 4;
                        fq80Var2.J(i7);
                        guoVar.readFully(fq80Var2.f9961a, 0, i7);
                        this.h0 += i7;
                        short s2 = (short) ((this.n0 / 2) + 1);
                        int i8 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.s;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.s = ByteBuffer.allocate(i8);
                        }
                        this.s.position(0);
                        this.s.putShort(s2);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            s = this.n0;
                            if (i9 >= s) {
                                break;
                            }
                            int iD = fq80Var2.D();
                            int i11 = i9 % 2;
                            int i12 = i6;
                            ByteBuffer byteBuffer2 = this.s;
                            if (i11 == 0) {
                                byteBuffer2.putShort((short) (iD - i10));
                            } else {
                                byteBuffer2.putInt(iD - i10);
                            }
                            i9++;
                            i10 = iD;
                            i6 = i12;
                        }
                        i2 = i6;
                        int i13 = (i - this.h0) - i10;
                        int i14 = s % 2;
                        ByteBuffer byteBuffer3 = this.s;
                        if (i14 == 1) {
                            byteBuffer3.putInt(i13);
                        } else {
                            byteBuffer3.putShort((short) i13);
                            this.s.putInt(0);
                        }
                        byte[] bArrArray = this.s.array();
                        fq80 fq80Var4 = this.q;
                        fq80Var4.K(bArrArray, i8);
                        ncs0Var.d(fq80Var4, i8, 1);
                        this.i0 += i8;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr = bj30Var.k;
                if (bArr != null) {
                    fq80Var.K(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(bj30Var.c)) {
                z2 = z;
            } else {
                z2 = bj30Var.h > 0;
            }
            if (z2) {
                this.d0 |= 268435456;
                this.r.J(0);
                int i15 = (fq80Var.c + i) - this.h0;
                fq80Var2.J(4);
                byte[] bArr2 = fq80Var2.f9961a;
                bArr2[0] = (byte) ((i15 >> 24) & 255);
                bArr2[1] = (byte) ((i15 >> 16) & 255);
                bArr2[i2] = (byte) ((i15 >> 8) & 255);
                bArr2[3] = (byte) (i15 & 255);
                ncs0Var.d(fq80Var2, 4, i2);
                this.i0 += 4;
            }
            this.k0 = true;
        }
        int i16 = i + fq80Var.c;
        if (!"V_MPEG4/ISO/AVC".equals(bj30Var.c) && !"V_MPEGH/ISO/HEVC".equals(bj30Var.c)) {
            if (bj30Var.W != null) {
                x0x.K(fq80Var.c == 0);
                bj30Var.W.c(guoVar);
            }
            while (true) {
                int i17 = this.h0;
                if (i17 >= i16) {
                    break;
                }
                int i18 = i16 - i17;
                int iA = fq80Var.a();
                if (iA > 0) {
                    iE2 = Math.min(i18, iA);
                    ncs0Var.a(iE2, fq80Var);
                } else {
                    iE2 = ncs0Var.e(guoVar, i18, false);
                }
                this.h0 += iE2;
                this.i0 += iE2;
            }
        } else {
            fq80 fq80Var5 = this.j;
            byte[] bArr3 = fq80Var5.f9961a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i19 = bj30Var.f0;
            int i20 = 4 - i19;
            while (this.h0 < i16) {
                int i21 = this.j0;
                if (i21 == 0) {
                    int iMin = Math.min(i19, fq80Var.a());
                    guoVar.readFully(bArr3, i20 + iMin, i19 - iMin);
                    if (iMin > 0) {
                        fq80Var.k(bArr3, i20, iMin);
                    }
                    this.h0 += i19;
                    fq80Var5.M(0);
                    this.j0 = fq80Var5.D();
                    fq80 fq80Var6 = this.i;
                    fq80Var6.M(0);
                    ncs0Var.a(4, fq80Var6);
                    this.i0 += 4;
                } else {
                    int iA2 = fq80Var.a();
                    if (iA2 > 0) {
                        iE = Math.min(i21, iA2);
                        ncs0Var.a(iE, fq80Var);
                    } else {
                        iE = ncs0Var.e(guoVar, i21, false);
                    }
                    this.h0 += iE;
                    this.i0 += iE;
                    this.j0 -= iE;
                }
            }
        }
        if ("A_VORBIS".equals(bj30Var.c)) {
            fq80 fq80Var7 = this.l;
            fq80Var7.M(0);
            ncs0Var.a(4, fq80Var7);
            this.i0 += 4;
        }
        int i22 = this.i0;
        o();
        return i22;
    }

    public final void s(guo guoVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        fq80 fq80Var = this.o;
        byte[] bArr2 = fq80Var.f9961a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            fq80Var.getClass();
            fq80Var.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        guoVar.readFully(fq80Var.f9961a, bArr.length, i);
        fq80Var.M(0);
        fq80Var.L(length);
    }

    @Override // a.fuo
    public final void release() {
    }
}
