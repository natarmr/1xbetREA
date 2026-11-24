package a;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class yaw extends yic {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public td9 C;
    public ybw D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public b4x I;
    public boolean J;
    public long K;
    public boolean L;
    public final long j;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final jbj p;
    public final mbj q;
    public final td9 r;
    public final boolean s;
    public final boolean t;
    public final coq0 u;
    public final ruj v;
    public final List w;
    public final DrmInitData x;
    public final exw y;
    public final fq80 z;

    public yaw(ruj rujVar, jbj jbjVar, mbj mbjVar, androidx.media3.common.b bVar, boolean z, jbj jbjVar2, mbj mbjVar2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, coq0 coq0Var, DrmInitData drmInitData, td9 td9Var, exw exwVar, fq80 fq80Var, boolean z6, boolean z7, a4a0 a4a0Var, String str) {
        super(jbjVar, mbjVar, 1, bVar, i, obj, j, j2, str);
        bVar.getClass();
        this.j = j3;
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = mbjVar2;
        this.p = jbjVar2;
        this.F = mbjVar2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = coq0Var;
        this.t = z4;
        this.v = rujVar;
        this.w = list;
        this.x = drmInitData;
        this.r = td9Var;
        this.y = exwVar;
        this.z = fq80Var;
        this.L = z6;
        this.n = z7;
        v3x v3xVar = b4x.b;
        this.I = rcf0.e;
        this.k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (j47.H0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // a.kq00
    public final void a() {
        td9 td9Var;
        this.D.getClass();
        if (this.C == null && (td9Var = this.r) != null) {
            fuo fuoVarD = ((fuo) td9Var.b).d();
            if ((fuoVarD instanceof xrs0) || (fuoVarD instanceof x6r)) {
                this.C = this.r;
                this.F = false;
            }
        }
        mbj mbjVar = this.q;
        jbj jbjVar = this.p;
        if (this.F) {
            jbjVar.getClass();
            mbjVar.getClass();
            c(jbjVar, mbjVar, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // a.kq00
    public final void b() {
        this.G = true;
    }

    public final void c(jbj jbjVar, mbj mbjVar, boolean z, boolean z2) {
        mbj mbjVar2;
        boolean z3;
        long j;
        int i = this.E;
        if (z) {
            z3 = i != 0;
            mbjVar2 = mbjVar;
        } else {
            long j2 = i;
            long j3 = mbjVar.f;
            long j4 = j3 == -1 ? -1L : j3 - j2;
            mbjVar2 = (j2 == 0 && j3 == j4) ? mbjVar : new mbj(mbjVar.f21512a, mbjVar.b, mbjVar.c, mbjVar.d, mbjVar.e + j2, j4, mbjVar.g);
            z3 = false;
        }
        try {
            guj gujVarG = g(jbjVar, mbjVar2, z2);
            if (z3) {
                gujVarG.a(this.E, false);
            }
            while (!this.G && ((fuo) this.C.b).a(gujVarG, td9.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            long j5 = mbjVar.f;
                            if (j5 != -1 && gujVarG.d >= mbjVar.e + j5) {
                                throw kq80.a(null, e);
                            }
                            throw e;
                        }
                        ((fuo) this.C.b).b(0L, 0L);
                        j = gujVarG.d;
                    }
                } catch (Throwable th) {
                    this.E = (int) (gujVarG.d - mbjVar.e);
                    throw th;
                }
            }
            j = gujVarG.d;
            this.E = (int) (j - mbjVar.e);
            xkb.J(jbjVar);
        } catch (Throwable th2) {
            xkb.J(jbjVar);
            throw th2;
        }
    }

    public final int e(int i) {
        x0x.K(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    public final boolean f() {
        return this.K != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Multi-variable type inference failed */
    public final guj g(jbj jbjVar, mbj mbjVar, boolean z) throws IOException {
        int i;
        guj gujVar;
        long jT;
        long j;
        td9 td9Var;
        td9 td9Var2;
        int i2;
        Object f6Var;
        boolean zC;
        jfn0 jfn0Var;
        int i3;
        int i4;
        boolean z2;
        fuo av40Var;
        cd40 cd40Var;
        long jD = jbjVar.d(mbjVar);
        long j2 = this.g;
        coq0 coq0Var = this.u;
        if (z) {
            try {
                coq0Var.g(this.s, j2);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        guj gujVar2 = new guj(jbjVar, mbjVar.e, jD);
        int i5 = 1;
        int i6 = 0;
        if (this.C == null) {
            fq80 fq80Var = this.z;
            gujVar2.f = 0;
            try {
                fq80Var.J(10);
                gujVar2.b(fq80Var.f9961a, 0, 10, false);
                if (fq80Var.C() != 4801587) {
                    jT = -9223372036854775807L;
                    gujVar = null;
                } else {
                    fq80Var.N(3);
                    int iY = fq80Var.y();
                    int i7 = iY + 10;
                    byte[] bArr = fq80Var.f9961a;
                    if (i7 > bArr.length) {
                        fq80Var.J(i7);
                        System.arraycopy(bArr, 0, fq80Var.f9961a, 0, 10);
                    }
                    gujVar2.b(fq80Var.f9961a, 10, iY, false);
                    ed40 ed40VarQ = this.y.Q(fq80Var.f9961a, iY);
                    if (ed40VarQ == null) {
                        jT = -9223372036854775807L;
                        gujVar = null;
                    } else {
                        cd40[] cd40VarArr = ed40VarQ.f7600a;
                        int length = cd40VarArr.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                gujVar = null;
                                cd40Var = null;
                                break;
                            }
                            cd40 cd40Var2 = cd40VarArr[i8];
                            gujVar = null;
                            if (rwb0.class.isAssignableFrom(cd40Var2.getClass())) {
                                cd40Var = (cd40) rwb0.class.cast(cd40Var2);
                                if (!((rwb0) cd40Var).b.equals("com.apple.streaming.transportStreamTimestamp")) {
                                    cd40Var = null;
                                }
                            } else {
                                cd40Var = null;
                            }
                            if (cd40Var != null) {
                                break;
                            }
                            i8++;
                        }
                        rwb0 rwb0Var = (rwb0) cd40Var;
                        if (rwb0Var == null) {
                            jT = -9223372036854775807L;
                        } else {
                            System.arraycopy(rwb0Var.c, 0, fq80Var.f9961a, 0, 8);
                            fq80Var.M(0);
                            fq80Var.L(8);
                            jT = fq80Var.t() & 8589934591L;
                        }
                    }
                }
            } catch (EOFException unused2) {
                gujVar = null;
            }
            gujVar2.f = 0;
            td9 td9Var3 = this.r;
            if (td9Var3 != null) {
                coq0 coq0Var2 = (coq0) td9Var3.d;
                fuo fuoVar = (fuo) td9Var3.b;
                fuo fuoVarD = fuoVar.d();
                x0x.K(!((fuoVarD instanceof xrs0) || (fuoVarD instanceof x6r)));
                boolean z3 = fuoVar.d() == fuoVar;
                Class<?> cls = fuoVar.getClass();
                if (!z3) {
                    jf4.n(jtm0.p("Can't recreate wrapped extractors. Outer type: %s", cls));
                    return gujVar;
                }
                if (fuoVar instanceof u5v0) {
                    av40Var = new u5v0(((androidx.media3.common.b) td9Var3.c).d, coq0Var2, (jfn0) td9Var3.e, td9Var3.f33756a);
                } else if (fuoVar instanceof y20) {
                    av40Var = new y20(0);
                } else if (fuoVar instanceof f6) {
                    av40Var = new f6();
                } else if (fuoVar instanceof h6) {
                    av40Var = new h6();
                } else {
                    if (!(fuoVar instanceof av40)) {
                        jf4.n("Unexpected extractor type for recreation: ".concat(fuoVar.getClass().getSimpleName()));
                        return gujVar;
                    }
                    av40Var = new av40(0);
                }
                td9Var2 = new td9(av40Var, (androidx.media3.common.b) td9Var3.c, coq0Var2, (jfn0) td9Var3.e, td9Var3.f33756a);
                i = 0;
                j2 = j2;
                j = 0;
            } else {
                Uri uri = mbjVar.f21512a;
                Map mapE = jbjVar.e();
                ruj rujVar = this.v;
                rujVar.getClass();
                androidx.media3.common.b bVar = this.d;
                int iM = fbc.M(bVar.p);
                List list = (List) mapE.get("Content-Type");
                int iM2 = fbc.M((list == null || list.isEmpty()) ? gujVar : (String) list.get(0));
                int iN = fbc.N(uri);
                int i9 = 7;
                ArrayList arrayList = new ArrayList(7);
                ruj.b(iM, arrayList);
                ruj.b(iM2, arrayList);
                ruj.b(iN, arrayList);
                for (int i10 = 0; i10 < 7; i10++) {
                    ruj.b(ruj.d[i10], arrayList);
                }
                gujVar2.f = 0;
                Object obj = gujVar;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        i = i6;
                        j2 = j2;
                        j = 0;
                        obj.getClass();
                        td9Var = new td9((fuo) obj, bVar, coq0Var, (kwd) rujVar.c, rujVar.f31131a);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i11)).intValue();
                    if (iIntValue == 0) {
                        i11 = i11;
                        j2 = j2;
                        iIntValue = iIntValue;
                        i2 = i9;
                        bVar = bVar;
                        iM = iM;
                        arrayList = arrayList;
                        j = 0;
                        f6Var = new f6();
                    } else if (iIntValue == i5) {
                        i11 = i11;
                        j2 = j2;
                        iIntValue = iIntValue;
                        i2 = i9;
                        bVar = bVar;
                        iM = iM;
                        arrayList = arrayList;
                        j = 0;
                        f6Var = new h6();
                    } else if (iIntValue == 2) {
                        i11 = i11;
                        j2 = j2;
                        iIntValue = iIntValue;
                        i2 = i9;
                        bVar = bVar;
                        iM = iM;
                        arrayList = arrayList;
                        j = 0;
                        f6Var = new y20(0);
                    } else if (iIntValue != i9) {
                        List listSingletonList = this.w;
                        jfn0 jfn0Var2 = jfn0.f16437a;
                        if (iIntValue == 8) {
                            i11 = i11;
                            j2 = j2;
                            iIntValue = iIntValue;
                            bVar = bVar;
                            iM = iM;
                            arrayList = arrayList;
                            j = 0;
                            i2 = 7;
                            kwd kwdVar = (kwd) rujVar.c;
                            boolean z4 = rujVar.f31131a;
                            byte b = rujVar.b;
                            if (z4) {
                                jfn0Var = kwdVar;
                                i3 = 4;
                            } else {
                                i3 = 36;
                                jfn0Var = jfn0Var2;
                            }
                            byte[] bArr2 = x6r.O;
                            int i12 = (b & 1) != 0 ? 64 : 0;
                            if ((b & 2) != 0) {
                                i12 |= 128;
                            }
                            int i13 = i3 | i12;
                            if (listSingletonList == null) {
                                v3x v3xVar = b4x.b;
                                listSingletonList = rcf0.e;
                            }
                            f6Var = new x6r(jfn0Var, i13, coq0Var, listSingletonList);
                        } else if (iIntValue != 11) {
                            if (iIntValue != 13) {
                                f6Var = gujVar;
                                j = 0;
                            } else {
                                f6Var = new u5v0(bVar.d, coq0Var, (kwd) rujVar.c, rujVar.f31131a);
                                j = 0;
                            }
                            i2 = 7;
                        } else {
                            i11 = i11;
                            kwd kwdVar2 = (kwd) rujVar.c;
                            boolean z5 = rujVar.f31131a;
                            if (listSingletonList != null) {
                                i4 = 48;
                            } else {
                                awq awqVar = new awq();
                                awqVar.o = mg40.n("application/cea-608");
                                listSingletonList = Collections.singletonList(new androidx.media3.common.b(awqVar));
                                i4 = 16;
                            }
                            String str = bVar.l;
                            if (TextUtils.isEmpty(str)) {
                                z2 = z5;
                            } else {
                                boolean z6 = z5;
                                if (mg40.b(str, "audio/mp4a-latm") == null) {
                                    i4 |= 2;
                                }
                                z2 = z6;
                                if (mg40.b(str, "video/avc") == null) {
                                    i4 |= 4;
                                    z2 = z6;
                                }
                            }
                            if (z2 != 0) {
                                jfn0Var2 = kwdVar2;
                            }
                            iIntValue = iIntValue;
                            arrayList = arrayList;
                            j2 = j2;
                            bVar = bVar;
                            j = 0;
                            i2 = 7;
                            iM = iM;
                            coq0 coq0Var3 = coq0Var;
                            coq0Var = coq0Var3;
                            f6Var = new xrs0(2, !z2, jfn0Var2, coq0Var3, new tyj(i4, listSingletonList));
                        }
                    } else {
                        i11 = i11;
                        j2 = j2;
                        iIntValue = iIntValue;
                        i2 = i9;
                        bVar = bVar;
                        iM = iM;
                        arrayList = arrayList;
                        j = 0;
                        f6Var = new av40(0L);
                    }
                    f6Var.getClass();
                    fuo fuoVar2 = (fuo) f6Var;
                    try {
                        zC = fuoVar2.c(gujVar2);
                        i = 0;
                        gujVar2.f = 0;
                    } catch (EOFException unused3) {
                        i = 0;
                        gujVar2.f = 0;
                        zC = false;
                    } catch (Throwable th) {
                        gujVar2.f = 0;
                        throw th;
                    }
                    if (zC) {
                        td9Var = new td9(fuoVar2, bVar, coq0Var, (kwd) rujVar.c, rujVar.f31131a);
                        break;
                    }
                    bVar = bVar;
                    if (obj == null && (iIntValue == iM || iIntValue == iM2 || iIntValue == iN || iIntValue == 11)) {
                        obj = fuoVar2;
                    }
                    i11++;
                    iM = iM;
                    j2 = j2;
                    arrayList = arrayList;
                    i9 = i2;
                    i6 = i;
                    i5 = 1;
                }
                td9Var2 = td9Var;
            }
            td9 td9Var4 = td9Var2;
            this.C = td9Var4;
            fuo fuoVarD2 = ((fuo) td9Var4.b).d();
            if ((fuoVarD2 instanceof y20) || (fuoVarD2 instanceof f6) || (fuoVarD2 instanceof h6) || (fuoVarD2 instanceof av40)) {
                ybw ybwVar = this.D;
                long jB = jT != -9223372036854775807L ? coq0Var.b(jT) : j2;
                if (ybwVar.x1 != jB) {
                    ybwVar.x1 = jB;
                    xbw[] xbwVarArr = ybwVar.v;
                    int length2 = xbwVarArr.length;
                    for (int i14 = i; i14 < length2; i14++) {
                        xbw xbwVar = xbwVarArr[i14];
                        if (xbwVar.I != jB) {
                            xbwVar.I = jB;
                            xbwVar.C = true;
                        }
                    }
                }
            } else {
                ybw ybwVar2 = this.D;
                if (ybwVar2.x1 != j) {
                    ybwVar2.x1 = j;
                    xbw[] xbwVarArr2 = ybwVar2.v;
                    int length3 = xbwVarArr2.length;
                    for (int i15 = i; i15 < length3; i15++) {
                        xbw xbwVar2 = xbwVarArr2[i15];
                        if (xbwVar2.I != j) {
                            xbwVar2.I = j;
                            xbwVar2.C = true;
                        }
                    }
                }
            }
            this.D.x.clear();
            ((fuo) this.C.b).e(this.D);
        } else {
            i = 0;
        }
        ybw ybwVar3 = this.D;
        DrmInitData drmInitData = ybwVar3.y1;
        DrmInitData drmInitData2 = this.x;
        if (!Objects.equals(drmInitData, drmInitData2)) {
            ybwVar3.y1 = drmInitData2;
            int i16 = i;
            while (true) {
                xbw[] xbwVarArr3 = ybwVar3.v;
                if (i16 >= xbwVarArr3.length) {
                    break;
                }
                if (ybwVar3.p1[i16]) {
                    xbw xbwVar3 = xbwVarArr3[i16];
                    xbwVar3.L = drmInitData2;
                    xbwVar3.C = true;
                }
                i16++;
            }
        }
        return gujVar2;
    }
}
