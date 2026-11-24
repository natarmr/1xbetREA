package a;

import android.content.Context;
import android.media.MediaFormat;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline$Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dmo implements Handler.Callback, ln30, seu0 {
    public static final long H1 = vtt0.Y(10000);
    public boolean A;
    public boolean A1;
    public gvh0 B;
    public dlo B1;
    public long C1;
    public flo D1;
    public long E1;
    public boolean F1;
    public float G1;
    public uch0 Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ujf0[] f6331a;
    public final j16[] b;
    public final boolean[] c;
    public final syj d;
    public final ucs0 e;
    public final xvj f;
    public boolean f1;
    public final q9o0 g;
    public cmo g1;
    public final sbx0 h;
    public int h1;
    public final Looper i;
    public yx90 i1;
    public final Timeline$Window j;
    public amo j1;
    public final amq0 k;
    public boolean k1;
    public final long l;
    public boolean l1;
    public final cwj m;
    public boolean m1;
    public final ArrayList n;
    public boolean n1;
    public final l9o0 o;
    public long o1;
    public final klo p;
    public boolean p1;
    public final pn30 q;
    public int q1;
    public final jo30 r;
    public boolean r1;
    public final vvj s;
    public boolean s1;
    public final short t;
    public boolean t1;
    public final a4a0 u;
    public boolean u1;
    public final boolean v;
    public int v1;
    public final fsj w;
    public cmo w1;
    public final q9o0 x;
    public long x1;
    public final boolean y;
    public long y1;
    public final x24 z;
    public int z1;

    /* JADX WARN: Type inference failed for: r9v5, types: [int, short] */
    public dmo(Context context, j16[] j16VarArr, j16[] j16VarArr2, syj syjVar, ucs0 ucs0Var, xvj xvjVar, rsj rsjVar, int i, boolean z, fsj fsjVar, gvh0 gvh0Var, vvj vvjVar, long j, boolean z2, Looper looper, l9o0 l9o0Var, klo kloVar, a4a0 a4a0Var, final seu0 seu0Var, boolean z3) {
        Looper looper2;
        flo floVar = flo.f9748a;
        this.E1 = -9223372036854775807L;
        this.p = kloVar;
        this.d = syjVar;
        this.e = ucs0Var;
        this.f = xvjVar;
        this.q1 = i;
        this.r1 = z;
        this.B = gvh0Var;
        this.s = vvjVar;
        this.t = (int) j;
        boolean z4 = false;
        this.l1 = false;
        this.v = z2;
        this.o = l9o0Var;
        this.u = a4a0Var;
        this.D1 = floVar;
        this.w = fsjVar;
        this.G1 = 1.0f;
        this.Y = uch0.b;
        this.A = z3;
        this.C1 = -9223372036854775807L;
        this.o1 = -9223372036854775807L;
        this.l = xvjVar.l;
        zlq0 zlq0Var = bmq0.f2849a;
        yx90 yx90VarK = yx90.k(ucs0Var);
        this.i1 = yx90VarK;
        this.j1 = new amo(yx90VarK);
        this.b = new j16[j16VarArr.length];
        this.c = new boolean[j16VarArr.length];
        syjVar.getClass();
        this.f6331a = new ujf0[j16VarArr.length];
        boolean z5 = false;
        for (int i2 = 0; i2 < j16VarArr.length; i2++) {
            j16 j16Var = j16VarArr[i2];
            j16Var.e = i2;
            j16Var.f = a4a0Var;
            j16Var.g = l9o0Var;
            this.b[i2] = j16Var;
            j16 j16Var2 = this.b[i2];
            synchronized (j16Var2.f15717a) {
                j16Var2.s = syjVar;
            }
            j16 j16Var3 = j16VarArr2[i2];
            if (j16Var3 != null) {
                j16Var3.e = i2;
                j16Var3.f = a4a0Var;
                j16Var3.g = l9o0Var;
                z5 = true;
            }
            ujf0[] ujf0VarArr = this.f6331a;
            j16 j16Var4 = j16VarArr[i2];
            ujf0 ujf0Var = new ujf0();
            ujf0Var.e = j16Var4;
            ujf0Var.c = i2;
            ujf0Var.f = j16Var3;
            ujf0Var.d = 0;
            ujf0Var.f35776a = false;
            ujf0Var.b = false;
            ujf0VarArr[i2] = ujf0Var;
        }
        this.y = z5;
        this.m = new cwj(this, l9o0Var);
        this.n = new ArrayList();
        this.j = new Timeline$Window();
        this.k = new amq0();
        x0x.K(syjVar.f33026a == null);
        syjVar.f33026a = this;
        syjVar.b = rsjVar;
        syjVar.f = syjVar.e;
        this.A1 = true;
        q9o0 q9o0VarA = l9o0Var.a(looper, null);
        this.x = q9o0VarA;
        this.q = new pn30(fsjVar, q9o0VarA, new z9f(this, (byte) 23), j16VarArr.length);
        this.r = new jo30(this, fsjVar, q9o0VarA, a4a0Var, rsjVar);
        sbx0 sbx0Var = new sbx0((byte) 8);
        this.h = sbx0Var;
        synchronized (sbx0Var.c) {
            try {
                looper2 = (Looper) sbx0Var.d;
                if (looper2 == null) {
                    if (sbx0Var.b == 0 && ((HandlerThread) sbx0Var.e) == null) {
                        z4 = true;
                    }
                    x0x.K(z4);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    sbx0Var.e = handlerThread;
                    handlerThread.start();
                    looper2 = ((HandlerThread) sbx0Var.e).getLooper();
                    sbx0Var.d = looper2;
                }
                sbx0Var.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = looper2;
        q9o0 q9o0VarA2 = l9o0Var.a(looper2, this);
        this.g = q9o0VarA2;
        this.z = new x24(context, looper2, this);
        q9o0VarA2.c(35, new seu0() { // from class: a.wlo
            @Override // a.seu0
            public final void d(long j2, long j3, androidx.media3.common.b bVar, MediaFormat mediaFormat) {
                seu0Var.d(j2, j3, bVar, mediaFormat);
                this.f39364a.d(j2, j3, bVar, mediaFormat);
            }
        }).b();
        q9o0VarA2.c(39, new xlo(this)).b();
    }

    public static Pair S(bmq0 bmq0Var, cmo cmoVar, boolean z, int i, boolean z2, Timeline$Window timeline$Window, amq0 amq0Var) {
        int iT;
        bmq0 bmq0Var2 = cmoVar.f4615a;
        if (bmq0Var.p()) {
            return null;
        }
        bmq0 bmq0Var3 = bmq0Var2.p() ? bmq0Var : bmq0Var2;
        try {
            Pair pairI = bmq0Var3.i(timeline$Window, amq0Var, cmoVar.b, cmoVar.c);
            if (!bmq0Var.equals(bmq0Var3)) {
                if (bmq0Var.b(pairI.first) == -1) {
                    if (!z || (iT = T(timeline$Window, amq0Var, i, z2, pairI.first, bmq0Var3, bmq0Var)) == -1) {
                        return null;
                    }
                    return bmq0Var.i(timeline$Window, amq0Var, iT, -9223372036854775807L);
                }
                if (bmq0Var3.g(pairI.first, amq0Var).f && bmq0Var3.m(amq0Var.c, timeline$Window, 0L).m == bmq0Var3.b(pairI.first)) {
                    return bmq0Var.i(timeline$Window, amq0Var, bmq0Var.g(pairI.first, amq0Var).c, cmoVar.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(Timeline$Window timeline$Window, amq0 amq0Var, int i, boolean z, Object obj, bmq0 bmq0Var, bmq0 bmq0Var2) {
        bmq0 bmq0Var3 = bmq0Var;
        Object obj2 = bmq0Var3.m(bmq0Var3.g(obj, amq0Var).c, timeline$Window, 0L).f45385a;
        for (int i2 = 0; i2 < bmq0Var2.o(); i2++) {
            if (bmq0Var2.m(i2, timeline$Window, 0L).f45385a.equals(obj2)) {
                return i2;
            }
        }
        int iB = bmq0Var3.b(obj);
        int iH = bmq0Var3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            bmq0 bmq0Var4 = bmq0Var3;
            int iD = bmq0Var4.d(iB, amq0Var, timeline$Window, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = bmq0Var2.b(bmq0Var4.l(iD));
            i3++;
            bmq0Var3 = bmq0Var4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return bmq0Var2.f(iB2, amq0Var, false).c;
    }

    public static boolean y(nn30 nn30Var) {
        if (nn30Var != null) {
            try {
                f930 f930Var = nn30Var.f23800a;
                if (nn30Var.e) {
                    for (ixg0 ixg0Var : nn30Var.c) {
                        if (ixg0Var != null) {
                            ixg0Var.c();
                        }
                    }
                } else {
                    f930Var.l();
                }
                if ((!nn30Var.e ? 0L : f930Var.b()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, vn30 vn30Var) {
        pn30 pn30Var = this.q;
        nn30 nn30Var = pn30Var.k[i];
        if (nn30Var == null || !nn30Var.g.f25528a.equals(vn30Var)) {
            return false;
        }
        return this.f6331a[i].h(pn30Var.k[i]);
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.Z;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        yx90 yx90Var = this.i1;
        if (yx90Var.l == z2 && yx90Var.n == i2 && yx90Var.m == i3) {
            return;
        }
        this.i1 = yx90Var.e(i3, i2, z2);
        D0(false, false);
        pn30 pn30Var = this.q;
        for (nn30 nn30Var = pn30Var.i; nn30Var != null; nn30Var = nn30Var.m) {
            for (fmo fmoVar : (fmo[]) nn30Var.o.d) {
                if (fmoVar != null) {
                    fmoVar.o(z2);
                }
            }
        }
        if (!s0()) {
            w0();
            B0();
            yx90 yx90Var2 = this.i1;
            if (yx90Var2.p) {
                this.i1 = yx90Var2.i(false);
            }
            pn30Var.r(this.x1);
            return;
        }
        int i4 = this.i1.e;
        q9o0 q9o0Var = this.g;
        if (i4 != 3) {
            if (i4 == 2) {
                q9o0Var.h(2);
            }
        } else {
            cwj cwjVar = this.m;
            cwjVar.b = true;
            ((d4m0) cwjVar.c).f();
            u0();
            q9o0Var.h(2);
        }
    }

    public final boolean B() {
        nn30 nn30Var = this.q.i;
        long j = nn30Var.g.e;
        if (nn30Var.e) {
            return j == -9223372036854775807L || this.i1.s < j || !s0();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    public final void B0() {
        zx90 zx90VarD;
        long j;
        float f;
        long j2;
        nn30 nn30Var = this.q.i;
        if (nn30Var == null) {
            return;
        }
        long jH = nn30Var.e ? nn30Var.f23800a.h() : -9223372036854775807L;
        if (jH != -9223372036854775807L) {
            if (!nn30Var.g()) {
                this.q.s(nn30Var);
                g();
                t(false);
                C();
            }
            Q(true, jH);
            if (jH != this.i1.s) {
                yx90 yx90Var = this.i1;
                this.i1 = x(yx90Var.b, jH, yx90Var.c, jH, true, 5);
            }
        } else {
            cwj cwjVar = this.m;
            boolean z = z();
            d4m0 d4m0Var = (d4m0) cwjVar.c;
            j16 j16Var = (j16) cwjVar.e;
            if (j16Var == null || j16Var.m() || ((z && ((j16) cwjVar.e).h != 2) || (!((j16) cwjVar.e).o() && (z || ((j16) cwjVar.e).l())))) {
                cwjVar.f5083a = true;
                if (cwjVar.b) {
                    d4m0Var.f();
                }
            } else {
                bm30 bm30Var = (bm30) cwjVar.f;
                bm30Var.getClass();
                long jE = bm30Var.e();
                if (!cwjVar.f5083a) {
                    d4m0Var.c(jE);
                    zx90VarD = bm30Var.d();
                    if (!zx90VarD.equals(d4m0Var.e)) {
                        d4m0Var.a(zx90VarD);
                        ((dmo) cwjVar.d).g.c(16, zx90VarD).b();
                    }
                } else if (jE >= d4m0Var.e()) {
                    cwjVar.f5083a = false;
                    if (cwjVar.b) {
                        d4m0Var.f();
                    }
                    d4m0Var.c(jE);
                    zx90VarD = bm30Var.d();
                    if (!zx90VarD.equals(d4m0Var.e)) {
                        d4m0Var.a(zx90VarD);
                        ((dmo) cwjVar.d).g.c(16, zx90VarD).b();
                    }
                } else if (d4m0Var.b) {
                    d4m0Var.c(d4m0Var.e());
                    d4m0Var.b = false;
                }
            }
            long jE2 = cwjVar.e();
            this.x1 = jE2;
            long j3 = jE2 - nn30Var.p;
            long j4 = this.i1.s;
            if (!this.n.isEmpty() && !this.i1.b.c()) {
                if (this.A1) {
                    this.A1 = false;
                }
                yx90 yx90Var2 = this.i1;
                yx90Var2.f43410a.b(yx90Var2.b.f37698a);
                int iMin = Math.min(this.z1, this.n.size());
                if (iMin > 0 && this.n.get(iMin - 1) != null) {
                    hny.b();
                    return;
                } else {
                    if (iMin < this.n.size() && this.n.get(iMin) != null) {
                        hny.b();
                        return;
                    }
                    this.z1 = iMin;
                }
            }
            if (this.m.b()) {
                boolean z2 = !this.j1.e;
                yx90 yx90Var3 = this.i1;
                this.i1 = x(yx90Var3.b, j3, yx90Var3.c, j3, z2, 6);
            } else {
                yx90 yx90Var4 = this.i1;
                yx90Var4.s = j3;
                yx90Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.i1.q = this.q.l.d();
        yx90 yx90Var5 = this.i1;
        yx90Var5.r = o(yx90Var5.q);
        yx90 yx90Var6 = this.i1;
        if (yx90Var6.l && yx90Var6.e == 3 && t0(yx90Var6.f43410a, yx90Var6.b)) {
            yx90 yx90Var7 = this.i1;
            float fH = 1.0f;
            if (yx90Var7.o.f45148a == 1.0f) {
                vvj vvjVar = this.s;
                long jL = l(yx90Var7.f43410a, yx90Var7.b.f37698a, yx90Var7.s);
                long j5 = this.i1.r;
                if (vvjVar.c != -9223372036854775807L) {
                    long j6 = jL - j5;
                    long j7 = vvjVar.m;
                    if (j7 == -9223372036854775807L) {
                        vvjVar.m = j6;
                        vvjVar.n = 0L;
                    } else {
                        long jMax = Math.max(j6, (long) ((j6 * 9.999871E-4f) + (j7 * 0.999f)));
                        vvjVar.m = jMax;
                        vvjVar.n = (long) ((9.999871E-4f * Math.abs(j6 - jMax)) + (vvjVar.n * 0.999f));
                    }
                    if (vvjVar.l != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - vvjVar.l < 1000) {
                            fH = vvjVar.k;
                        }
                    } else {
                        j = 1000;
                    }
                    vvjVar.l = SystemClock.elapsedRealtime();
                    long j8 = (vvjVar.n * 3) + vvjVar.m;
                    if (vvjVar.h > j8) {
                        float fM = vtt0.M(j);
                        f = 1.0E-7f;
                        long[] jArr = {j8, vvjVar.e, vvjVar.h - (((long) ((vvjVar.k - 1.0f) * fM)) + ((long) ((vvjVar.i - 1.0f) * fM)))};
                        j2 = jArr[0];
                        for (int i = 1; i < 3; i++) {
                            long j9 = jArr[i];
                            if (j9 > j2) {
                                j2 = j9;
                            }
                        }
                        vvjVar.h = j2;
                    } else {
                        f = 1.0E-7f;
                        j2 = vtt0.j(jL - ((long) (Math.max(0.0f, vvjVar.k - 1.0f) / 1.0E-7f)), vvjVar.h, j8);
                        vvjVar.h = j2;
                        long j10 = vvjVar.g;
                        if (j10 != -9223372036854775807L && j2 > j10) {
                            vvjVar.h = j10;
                            j2 = j10;
                        }
                    }
                    long j11 = jL - j2;
                    if (Math.abs(j11) < vvjVar.f38102a) {
                        vvjVar.k = 1.0f;
                    } else {
                        fH = vtt0.h((f * j11) + 1.0f, vvjVar.j, vvjVar.i);
                        vvjVar.k = fH;
                    }
                }
                if (this.m.d().f45148a != fH) {
                    zx90 zx90Var = new zx90(fH, this.i1.o.b);
                    this.g.g(16);
                    this.m.a(zx90Var);
                    w(this.i1.o, this.m.d().f45148a, false, false);
                }
            }
        }
    }

    public final void C() {
        boolean zB;
        if (y(this.q.l)) {
            nn30 nn30Var = this.q.l;
            long jO = o(!nn30Var.e ? 0L : nn30Var.f23800a.b());
            nn30 nn30Var2 = this.q.i;
            long j = t0(this.i1.f43410a, nn30Var.g.f25528a) ? this.s.h : -9223372036854775807L;
            a4a0 a4a0Var = this.u;
            bmq0 bmq0Var = this.i1.f43410a;
            vn30 vn30Var = nn30Var.g.f25528a;
            float f = this.m.d().f45148a;
            boolean z = this.i1.l;
            rl00 rl00Var = new rl00(a4a0Var, bmq0Var, vn30Var, jO, f, this.n1, j);
            zB = this.f.b(rl00Var);
            nn30 nn30Var3 = this.q.i;
            if (!zB && nn30Var3.e && jO < 500000 && this.l > 0) {
                nn30Var3.f23800a.m(this.i1.s);
                zB = this.f.b(rl00Var);
            }
        } else {
            zB = false;
        }
        this.p1 = zB;
        if (zB) {
            nn30 nn30Var4 = this.q.l;
            nn30Var4.getClass();
            xq00 xq00Var = new xq00();
            xq00Var.f41291a = this.x1 - nn30Var4.p;
            float f2 = this.m.d().f45148a;
            x0x.A(f2 > 0.0f || f2 == -3.4028235E38f);
            xq00Var.b = f2;
            long j2 = this.o1;
            x0x.A(j2 >= 0 || j2 == -9223372036854775807L);
            xq00Var.c = j2;
            yq00 yq00Var = new yq00(xq00Var);
            x0x.K(nn30Var4.m == null);
            nn30Var4.f23800a.g(yq00Var);
        }
        x0();
    }

    public final void C0(bmq0 bmq0Var, vn30 vn30Var, bmq0 bmq0Var2, vn30 vn30Var2, long j, boolean z) {
        boolean zT0 = t0(bmq0Var, vn30Var);
        Object obj = vn30Var.f37698a;
        if (!zT0) {
            zx90 zx90Var = vn30Var.c() ? zx90.d : this.i1.o;
            cwj cwjVar = this.m;
            if (cwjVar.d().equals(zx90Var)) {
                return;
            }
            this.g.g(16);
            cwjVar.a(zx90Var);
            w(this.i1.o, zx90Var.f45148a, false, false);
            return;
        }
        amq0 amq0Var = this.k;
        int i = bmq0Var.g(obj, amq0Var).c;
        Timeline$Window timeline$Window = this.j;
        bmq0Var.n(i, timeline$Window);
        dn30 dn30Var = timeline$Window.i;
        String str = vtt0.f38024a;
        vvj vvjVar = this.s;
        vvjVar.getClass();
        vvjVar.c = vtt0.M(dn30Var.f6348a);
        vvjVar.f = vtt0.M(dn30Var.b);
        vvjVar.g = vtt0.M(dn30Var.c);
        float f = dn30Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        vvjVar.j = f;
        float f2 = dn30Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        vvjVar.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            vvjVar.c = -9223372036854775807L;
        }
        vvjVar.a();
        if (j != -9223372036854775807L) {
            vvjVar.d = l(bmq0Var, obj, j);
            vvjVar.a();
            return;
        }
        if (!Objects.equals(!bmq0Var2.p() ? bmq0Var2.m(bmq0Var2.g(vn30Var2.f37698a, amq0Var).c, timeline$Window, 0L).f45385a : null, timeline$Window.f45385a) || z) {
            vvjVar.d = -9223372036854775807L;
            vvjVar.a();
        }
    }

    public final void D() {
        pn30 pn30Var = this.q;
        pn30Var.p();
        nn30 nn30Var = pn30Var.m;
        if (nn30Var != null) {
            f930 f930Var = nn30Var.f23800a;
            if ((!nn30Var.d || nn30Var.e) && !f930Var.e()) {
                bmq0 bmq0Var = this.i1.f43410a;
                if (nn30Var.e) {
                    f930Var.s();
                }
                Iterator it = this.f.n.values().iterator();
                while (it.hasNext()) {
                    if (((wvj) it.next()).b) {
                        return;
                    }
                }
                if (!nn30Var.d) {
                    long j = nn30Var.g.b;
                    nn30Var.d = true;
                    f930Var.r(this, j);
                    return;
                }
                xq00 xq00Var = new xq00();
                xq00Var.f41291a = this.x1 - nn30Var.p;
                float f = this.m.d().f45148a;
                x0x.A(f > 0.0f || f == -3.4028235E38f);
                xq00Var.b = f;
                long j2 = this.o1;
                x0x.A(j2 >= 0 || j2 == -9223372036854775807L);
                xq00Var.c = j2;
                yq00 yq00Var = new yq00(xq00Var);
                x0x.K(nn30Var.m == null);
                f930Var.g(yq00Var);
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.n1 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.o.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.o1 = jElapsedRealtime;
    }

    public final void E(int i) {
        amo amoVar = this.j1;
        yx90 yx90Var = this.i1;
        byte b = 0;
        boolean z = amoVar.d | (((yx90) amoVar.f) != yx90Var);
        amoVar.d = z;
        amoVar.f = yx90Var;
        if (z) {
            if (!yx90Var.f43410a.p()) {
                yx90 yx90Var2 = this.i1;
                boolean z2 = yx90Var2.f43410a.b(yx90Var2.b.f37698a) != -1;
                Locale locale = Locale.US;
                yx90 yx90Var3 = this.i1;
                x0x.J(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", yx90Var3.b.f37698a, yx90Var3.f43410a.getClass().getName(), Integer.valueOf(this.i1.f43410a.o()), Integer.valueOf(i)), z2);
            }
            amo amoVar2 = this.j1;
            ulo uloVar = this.p.f18500a;
            uloVar.j.e(new llo(uloVar, amoVar2, b));
            this.j1 = new amo(this.i1);
        }
    }

    public final void F(int i) {
        ujf0 ujf0Var = this.f6331a[i];
        try {
            nn30 nn30Var = this.q.i;
            nn30Var.getClass();
            j16 j16VarD = ujf0Var.d(nn30Var);
            j16VarD.getClass();
            ixg0 ixg0Var = j16VarD.i;
            ixg0Var.getClass();
            ixg0Var.c();
        } catch (IOException | RuntimeException e) {
            byte b = ((j16) ujf0Var.e).b;
            if (b != 3 && b != 5) {
                throw e;
            }
            ucs0 ucs0Var = this.q.i.o;
            f1t0.R("ExoPlayerImplInternal", "Disabling track due to error: ".concat(androidx.media3.common.b.c(((fmo[]) ucs0Var.d)[i].r())), e);
            ucs0 ucs0Var2 = new ucs0((tjf0[]) ((tjf0[]) ucs0Var.c).clone(), (fmo[]) ((fmo[]) ucs0Var.d).clone(), (rds0) ucs0Var.e, ucs0Var.f);
            ((tjf0[]) ucs0Var2.c)[i] = null;
            ((fmo[]) ucs0Var2.d)[i] = null;
            h(i);
            nn30 nn30Var2 = this.q.i;
            nn30Var2.a(ucs0Var2, this.i1.s, false, new boolean[nn30Var2.j.length]);
        }
    }

    public final void G(final int i, final boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.x.e(new Runnable() { // from class: a.vlo
                @Override // java.lang.Runnable
                public final void run() {
                    dmo dmoVar = this.f37635a;
                    fsj fsjVar = dmoVar.w;
                    ujf0[] ujf0VarArr = dmoVar.f6331a;
                    int i2 = i;
                    byte b = ((j16) ujf0VarArr[i2].e).b;
                    ft2 ft2VarM = fsjVar.M();
                    fsjVar.N(ft2VarM, 1033, new t9f(ft2VarM, i2, b, z));
                }
            });
        }
    }

    public final void H() throws Throwable {
        u(this.r.b(), true);
    }

    public final void I() {
        this.j1.c(1);
        throw null;
    }

    public final void J() {
        this.j1.c(1);
        O(false, false, false, true);
        xvj xvjVar = this.f;
        ConcurrentHashMap concurrentHashMap = xvjVar.n;
        long id = Thread.currentThread().getId();
        long j = xvjVar.o;
        x0x.J("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        xvjVar.o = id;
        a4a0 a4a0Var = this.u;
        wvj wvjVar = (wvj) concurrentHashMap.get(a4a0Var);
        if (wvjVar == null) {
            wvj wvjVar2 = new wvj();
            wvjVar2.f39839a = 1;
            concurrentHashMap.put(a4a0Var, wvjVar2);
        } else {
            wvjVar.f39839a++;
        }
        wvj wvjVar3 = (wvj) concurrentHashMap.get(a4a0Var);
        wvjVar3.getClass();
        Integer num = (Integer) xvjVar.m.get(a4a0Var.f214a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        wvjVar3.c = iIntValue;
        wvjVar3.b = false;
        o0(this.i1.f43410a.p() ? 4 : 2);
        yx90 yx90Var = this.i1;
        boolean z = yx90Var.l;
        A0(this.z.c(yx90Var.e, z), yx90Var.n, yx90Var.m, z);
        jo30 jo30Var = this.r;
        ArrayList arrayList = jo30Var.c;
        x0x.K(!jo30Var.l);
        for (int i = 0; i < arrayList.size(); i++) {
            io30 io30Var = (io30) arrayList.get(i);
            jo30Var.e(io30Var);
            jo30Var.h.add(io30Var);
        }
        jo30Var.l = true;
        this.g.h(2);
    }

    public final void K(brd brdVar) {
        o24 o24Var;
        lnk0 lnk0Var;
        try {
            O(true, false, true, false);
            L();
            xvj xvjVar = this.f;
            a4a0 a4a0Var = this.u;
            ConcurrentHashMap concurrentHashMap = xvjVar.n;
            wvj wvjVar = (wvj) concurrentHashMap.get(a4a0Var);
            if (wvjVar != null) {
                int i = wvjVar.f39839a - 1;
                wvjVar.f39839a = i;
                if (i == 0) {
                    concurrentHashMap.remove(a4a0Var);
                    xvjVar.c();
                }
            }
            if (xvjVar.n.isEmpty()) {
                xvjVar.o = -1L;
            }
            x24 x24Var = this.z;
            x24Var.c = null;
            x24Var.a();
            x24Var.b(0);
            syj syjVar = this.d;
            if (syjVar.g != null) {
                x0x.J("DefaultTrackSelector is accessed on the wrong thread.", Thread.currentThread().equals(syjVar.g));
            }
            if (Build.VERSION.SDK_INT >= 32 && (o24Var = syjVar.h) != null) {
                Handler handler = (Handler) o24Var.c;
                Spatializer spatializer = (Spatializer) o24Var.b;
                if (spatializer != null && (lnk0Var = (lnk0) o24Var.d) != null && handler != null) {
                    spatializer.removeOnSpatializerStateChangedListener(lnk0Var);
                    handler.removeCallbacksAndMessages(null);
                }
                syjVar.h = null;
            }
            syjVar.f33026a = null;
            syjVar.b = null;
            o0(1);
        } finally {
            this.g.f();
            this.h.j();
            brdVar.c();
        }
    }

    public final void L() {
        for (int i = 0; i < this.f6331a.length; i++) {
            j16 j16Var = this.b[i];
            synchronized (j16Var.f15717a) {
                j16Var.s = null;
            }
            ujf0 ujf0Var = this.f6331a[i];
            j16 j16Var2 = (j16) ujf0Var.e;
            x0x.K(j16Var2.h == 0);
            j16Var2.s();
            ujf0Var.f35776a = false;
            j16 j16Var3 = (j16) ujf0Var.f;
            if (j16Var3 != null) {
                x0x.K(j16Var3.h == 0);
                j16Var3.s();
                ujf0Var.b = false;
            }
        }
    }

    public final void M(int i, int i2, itj0 itj0Var) throws Throwable {
        this.j1.c(1);
        jo30 jo30Var = this.r;
        jo30Var.getClass();
        x0x.A(i >= 0 && i <= i2 && i2 <= jo30Var.c.size());
        jo30Var.k = itj0Var;
        jo30Var.f(i, i2);
        u(jo30Var.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192 A[ORIG_RETURN, RETURN] */
    public final void N() throws dlo {
        int i;
        int i2;
        float f = this.m.d().f45148a;
        pn30 pn30Var = this.q;
        nn30 nn30Var = pn30Var.i;
        nn30 nn30VarF = pn30Var.f();
        ucs0 ucs0Var = null;
        nn30 nn30Var2 = nn30Var;
        boolean z = true;
        while (nn30Var2 != null && nn30Var2.e) {
            yx90 yx90Var = this.i1;
            ucs0 ucs0VarJ = nn30Var2.j(f, yx90Var.f43410a, yx90Var.l);
            ucs0 ucs0Var2 = nn30Var2 == this.q.i ? ucs0VarJ : ucs0Var;
            ucs0 ucs0Var3 = nn30Var2.o;
            fmo[] fmoVarArr = (fmo[]) ucs0VarJ.d;
            boolean z2 = false;
            if (((fmo[]) ucs0Var3.d).length == fmoVarArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= fmoVarArr.length) {
                        ucs0 ucs0Var4 = ucs0Var2;
                        if (nn30Var2 == nn30VarF) {
                            z = false;
                        }
                        nn30Var2 = nn30Var2.m;
                        ucs0Var = ucs0Var4;
                    } else if (ucs0VarJ.o(ucs0Var3, i3)) {
                        i3++;
                        ucs0Var2 = ucs0Var2;
                        ucs0VarJ = ucs0VarJ;
                    }
                }
            }
            pn30 pn30Var2 = this.q;
            if (!z) {
                i = 4;
                pn30Var2.s(nn30Var2);
                if (nn30Var2.e) {
                    long jMax = Math.max(nn30Var2.g.b, this.x1 - nn30Var2.p);
                    if (this.y) {
                        int i4 = 0;
                        while (true) {
                            ujf0[] ujf0VarArr = this.f6331a;
                            if (i4 >= ujf0VarArr.length) {
                                break;
                            }
                            if (this.q.k[i4] == nn30Var2 && ujf0VarArr[i4].h(nn30Var2)) {
                                g();
                                break;
                            }
                            i4++;
                        }
                    }
                    i2 = 4;
                    nn30Var2.a(ucs0VarJ, jMax, false, new boolean[nn30Var2.j.length]);
                }
                t(true);
                if (this.i1.e != i2) {
                    C();
                    B0();
                    this.g.h(2);
                    return;
                }
                return;
            }
            nn30 nn30Var3 = pn30Var2.i;
            boolean z3 = (pn30Var2.s(nn30Var3) & 1) != 0;
            boolean[] zArr = new boolean[this.f6331a.length];
            ucs0Var2.getClass();
            long jA = nn30Var3.a(ucs0Var2, this.i1.s, z3, zArr);
            yx90 yx90Var2 = this.i1;
            if (yx90Var2.e != 4 && jA != yx90Var2.s) {
                z2 = true;
            }
            yx90 yx90Var3 = this.i1;
            i = 4;
            this.i1 = x(yx90Var3.b, jA, yx90Var3.c, yx90Var3.d, z2, 5);
            if (z2) {
                Q(true, jA);
            }
            g();
            boolean[] zArr2 = new boolean[this.f6331a.length];
            int i5 = 0;
            while (true) {
                ujf0[] ujf0VarArr2 = this.f6331a;
                if (i5 >= ujf0VarArr2.length) {
                    break;
                }
                int iC = ujf0VarArr2[i5].c();
                zArr2[i5] = this.f6331a[i5].j();
                ujf0 ujf0Var = this.f6331a[i5];
                ixg0 ixg0Var = nn30Var3.c[i5];
                cwj cwjVar = this.m;
                long j = this.x1;
                boolean z4 = zArr[i5];
                j16 j16Var = (j16) ujf0Var.e;
                if (ujf0.k(j16Var)) {
                    if (ixg0Var != j16Var.i) {
                        ujf0Var.a(j16Var, cwjVar);
                    } else if (z4) {
                        j16Var.B(j, false, true);
                    }
                }
                j16 j16Var2 = (j16) ujf0Var.f;
                if (j16Var2 != null && ujf0.k(j16Var2)) {
                    if (ixg0Var != j16Var2.i) {
                        ujf0Var.a(j16Var2, cwjVar);
                    } else if (z4) {
                        j16Var2.B(j, false, true);
                    }
                }
                if (iC - this.f6331a[i5].c() > 0) {
                    G(i5, false);
                }
                this.v1 -= iC - this.f6331a[i5].c();
                i5++;
            }
            k(zArr2, this.x1);
            a0(nn30Var3);
            i2 = i;
            t(true);
            if (this.i1.e != i2) {
                C();
                B0();
                this.g.h(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198 A[LOOP:3: B:80:0x0190->B:82:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
    public final void O(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        bmq0 wna0Var;
        vn30 vn30Var;
        yx90 yx90Var;
        dlo dloVar;
        dcs0 dcs0Var;
        ucs0 ucs0Var;
        List list;
        pn30 pn30Var;
        int i;
        this.g.g(2);
        this.f1 = false;
        if (this.g1 != null) {
            this.j1.c(1);
            this.g1 = null;
        }
        this.B1 = null;
        D0(false, true);
        cwj cwjVar = this.m;
        cwjVar.b = false;
        d4m0 d4m0Var = (d4m0) cwjVar.c;
        if (d4m0Var.b) {
            d4m0Var.c(d4m0Var.e());
            d4m0Var.b = false;
        }
        this.x1 = 1000000000000L;
        for (int i2 = 0; i2 < this.f6331a.length; i2++) {
            try {
                h(i2);
            } catch (dlo e) {
                e = e;
                f1t0.R("ExoPlayerImplInternal", "Disable failed.", e);
            } catch (RuntimeException e2) {
                e = e2;
                f1t0.R("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.E1 = -9223372036854775807L;
        if (z) {
            for (ujf0 ujf0Var : this.f6331a) {
                try {
                    ujf0Var.n();
                } catch (RuntimeException e3) {
                    f1t0.R("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.v1 = 0;
        yx90 yx90Var2 = this.i1;
        vn30 vn30Var2 = yx90Var2.b;
        long j4 = yx90Var2.s;
        if (this.i1.b.c()) {
            j = this.i1.c;
        } else {
            yx90 yx90Var3 = this.i1;
            amq0 amq0Var = this.k;
            vn30 vn30Var3 = yx90Var3.b;
            bmq0 bmq0Var = yx90Var3.f43410a;
            if (bmq0Var.p() || bmq0Var.g(vn30Var3.f37698a, amq0Var).f) {
                j = this.i1.c;
            } else {
                j = this.i1.s;
            }
        }
        if (z2) {
            this.w1 = null;
            Pair pairM = m(this.i1.f43410a);
            vn30Var2 = (vn30) pairM.first;
            long jLongValue = ((Long) pairM.second).longValue();
            z5 = vn30Var2.equals(this.i1.b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.q.b();
        this.p1 = false;
        bmq0 bmq0Var2 = this.i1.f43410a;
        if (z3 && (bmq0Var2 instanceof wna0)) {
            wna0 wna0Var2 = (wna0) bmq0Var2;
            itj0 itj0Var = this.r.k;
            bmq0[] bmq0VarArr = wna0Var2.h;
            bmq0[] bmq0VarArr2 = new bmq0[bmq0VarArr.length];
            for (int i3 = 0; i3 < bmq0VarArr.length; i3++) {
                bmq0VarArr2[i3] = new vna0(bmq0VarArr[i3]);
            }
            wna0Var = new wna0(bmq0VarArr2, wna0Var2.i, itj0Var);
            if (vn30Var2.b != -1) {
                wna0Var.g(vn30Var2.f37698a, this.k);
                int i4 = this.k.c;
                Timeline$Window timeline$Window = this.j;
                wna0Var.m(i4, timeline$Window, 0L);
                if (timeline$Window.a()) {
                    vn30Var = new vn30(vn30Var2.f37698a, vn30Var2.d);
                }
            }
            yx90Var = this.i1;
            int i5 = yx90Var.e;
            if (z4) {
                dloVar = null;
            } else {
                dloVar = yx90Var.f;
            }
            if (z5) {
                dcs0Var = dcs0.d;
            } else {
                dcs0Var = yx90Var.h;
            }
            dcs0 dcs0Var2 = dcs0Var;
            if (z5) {
                ucs0Var = this.e;
            } else {
                ucs0Var = yx90Var.i;
            }
            ucs0 ucs0Var2 = ucs0Var;
            if (z5) {
                v3x v3xVar = b4x.b;
                list = rcf0.e;
            } else {
                list = yx90Var.j;
            }
            this.i1 = new yx90(wna0Var, vn30Var, j3, j2, i5, dloVar, false, dcs0Var2, ucs0Var2, list, vn30Var, yx90Var.l, yx90Var.m, yx90Var.n, yx90Var.o, j2, 0L, j2, 0L, false);
            if (z3) {
                pn30Var = this.q;
                if (!pn30Var.q.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (i = 0; i < pn30Var.q.size(); i++) {
                        ((nn30) pn30Var.q.get(i)).i();
                    }
                    pn30Var.q = arrayList;
                    pn30Var.m = null;
                    pn30Var.p();
                }
                jo30 jo30Var = this.r;
                HashMap map = jo30Var.g;
                for (ho30 ho30Var : map.values()) {
                    try {
                        ho30Var.f13375a.n(ho30Var.b);
                    } catch (RuntimeException e4) {
                        f1t0.R("MediaSourceList", "Failed to release child source.", e4);
                    }
                    e06 e06Var = ho30Var.f13375a;
                    go30 go30Var = ho30Var.c;
                    e06Var.q(go30Var);
                    ho30Var.f13375a.p(go30Var);
                }
                map.clear();
                jo30Var.h.clear();
                jo30Var.l = false;
            }
        }
        wna0Var = bmq0Var2;
        vn30Var = vn30Var2;
        yx90Var = this.i1;
        int i6 = yx90Var.e;
        if (z4) {
            dloVar = null;
        } else {
            dloVar = yx90Var.f;
        }
        if (z5) {
            dcs0Var = dcs0.d;
        } else {
            dcs0Var = yx90Var.h;
        }
        dcs0 dcs0Var3 = dcs0Var;
        if (z5) {
            ucs0Var = this.e;
        } else {
            ucs0Var = yx90Var.i;
        }
        ucs0 ucs0Var3 = ucs0Var;
        if (z5) {
            v3x v3xVar2 = b4x.b;
            list = rcf0.e;
        } else {
            list = yx90Var.j;
        }
        this.i1 = new yx90(wna0Var, vn30Var, j3, j2, i6, dloVar, false, dcs0Var3, ucs0Var3, list, vn30Var, yx90Var.l, yx90Var.m, yx90Var.n, yx90Var.o, j2, 0L, j2, 0L, false);
        if (z3) {
            pn30Var = this.q;
            if (!pn30Var.q.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (i < pn30Var.q.size()) {
                    ((nn30) pn30Var.q.get(i)).i();
                }
                pn30Var.q = arrayList2;
                pn30Var.m = null;
                pn30Var.p();
            }
            jo30 jo30Var2 = this.r;
            HashMap map2 = jo30Var2.g;
            while (r4.hasNext()) {
                ho30Var.f13375a.n(ho30Var.b);
                e06 e06Var2 = ho30Var.f13375a;
                go30 go30Var2 = ho30Var.c;
                e06Var2.q(go30Var2);
                ho30Var.f13375a.p(go30Var2);
            }
            map2.clear();
            jo30Var2.h.clear();
            jo30Var2.l = false;
        }
    }

    public final void P() {
        nn30 nn30Var = this.q.i;
        this.m1 = nn30Var != null && nn30Var.g.h && this.l1;
    }

    public final void Q(boolean z, long j) {
        nn30 nn30Var = this.q.i;
        long j2 = j + (nn30Var == null ? 1000000000000L : nn30Var.p);
        this.x1 = j2;
        ((d4m0) this.m.c).c(j2);
        for (ujf0 ujf0Var : this.f6331a) {
            long j3 = this.x1;
            j16 j16VarD = ujf0Var.d(nn30Var);
            if (j16VarD != null) {
                j16VarD.B(j3, false, z);
            }
        }
        for (nn30 nn30Var2 = r0.i; nn30Var2 != null; nn30Var2 = nn30Var2.m) {
            for (fmo fmoVar : (fmo[]) nn30Var2.o.d) {
                if (fmoVar != null) {
                    fmoVar.k();
                }
            }
        }
    }

    public final void R(bmq0 bmq0Var, bmq0 bmq0Var2) {
        if (bmq0Var.p() && bmq0Var2.p()) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            rw2.w(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        boolean z;
        if (this.v) {
            z = true;
        } else if (this.Z) {
            this.Y.getClass();
            z = true;
        } else {
            z = false;
        }
        yx90 yx90Var = this.i1;
        long jMin = 1000;
        long j2 = H1;
        if (z) {
            jMin = yx90Var.e != 3 ? j2 : 1000L;
            for (ujf0 ujf0Var : this.f6331a) {
                long j3 = this.x1;
                long j4 = this.y1;
                j16 j16Var = (j16) ujf0Var.f;
                j16 j16Var2 = (j16) ujf0Var.e;
                long jI = ujf0.k(j16Var2) ? j16Var2.i(j3, j4) : Long.MAX_VALUE;
                if (j16Var != null && j16Var.h != 0) {
                    jI = Math.min(jI, j16Var.i(j3, j4));
                }
                jMin = Math.min(jMin, vtt0.Y(jI));
            }
            if (this.i1.m()) {
                nn30 nn30Var = this.q.i;
                nn30 nn30Var2 = nn30Var != null ? nn30Var.m : null;
                if (nn30Var2 != null) {
                    if ((vtt0.M(jMin) * this.i1.o.f45148a) + this.x1 >= nn30Var2.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (yx90Var.e != 3 || s0()) {
            jMin = j2;
        }
        this.g.f28360a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void V(boolean z) throws dlo {
        vn30 vn30Var = this.q.i.g.f25528a;
        long jX = X(vn30Var, this.i1.s, true, false);
        if (jX != this.i1.s) {
            yx90 yx90Var = this.i1;
            this.i1 = x(vn30Var, jX, yx90Var.c, yx90Var.d, z, 5);
        }
    }

    public final void W(cmo cmoVar) throws Throwable {
        vn30 vn30VarU;
        boolean z;
        long jMax;
        long jLongValue;
        long j;
        long j2;
        long jC;
        yx90 yx90Var;
        int i;
        long j3;
        int i2;
        long j4;
        vn30 vn30Var;
        long j5;
        dmo dmoVar = this;
        if (dmoVar.f1) {
            if (dmoVar.g1 != null) {
                dmoVar.h1++;
                dmoVar.j1.c(1);
            }
            dmoVar.g1 = cmoVar;
            return;
        }
        dmoVar.j1.c(1);
        Pair pairS = S(dmoVar.i1.f43410a, cmoVar, true, dmoVar.q1, dmoVar.r1, dmoVar.j, dmoVar.k);
        if (pairS == null) {
            Pair pairM = dmoVar.m(dmoVar.i1.f43410a);
            vn30VarU = (vn30) pairM.first;
            jLongValue = ((Long) pairM.second).longValue();
            z = !dmoVar.i1.f43410a.p();
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairS.first;
            long jLongValue2 = ((Long) pairS.second).longValue();
            long j6 = cmoVar.c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            pn30 pn30Var = dmoVar.q;
            yx90 yx90Var2 = dmoVar.i1;
            vn30VarU = pn30Var.u(yx90Var2, yx90Var2.f43410a, obj, jLongValue2, true, false);
            if (vn30VarU.c()) {
                dmoVar.i1.f43410a.g(vn30VarU.f37698a, dmoVar.k);
                if (dmoVar.k.e(vn30VarU.b) == vn30VarU.c) {
                    dmoVar.k.getClass();
                    uo uoVar = uo.c;
                }
                dmoVar.k.getClass();
                uo.c.a(vn30VarU.b).getClass();
                z = true;
                jMax = Math.max(j6, 0L);
                jLongValue = 0;
            } else {
                z = cmoVar.c == -9223372036854775807L;
                jMax = j6;
                jLongValue = jLongValue2;
            }
        }
        try {
            try {
                if (!dmoVar.i1.f43410a.p()) {
                    yx90 yx90Var3 = dmoVar.i1;
                    if (pairS == null) {
                        if (yx90Var3.e != 1) {
                            dmoVar.o0(4);
                        }
                        dmoVar.O(false, true, false, true);
                    } else {
                        if (vn30VarU.equals(yx90Var3.b)) {
                            try {
                                nn30 nn30Var = dmoVar.q.i;
                                if (nn30Var == null || !nn30Var.e || jLongValue == 0) {
                                    jC = jLongValue;
                                } else {
                                    f930 f930Var = nn30Var.f23800a;
                                    long j7 = dmoVar.j.l;
                                    if (dmoVar.Z && j7 != -9223372036854775807L) {
                                        dmoVar.Y.getClass();
                                    }
                                    jC = f930Var.c(jLongValue, dmoVar.B);
                                }
                                if (vtt0.Y(jC) == vtt0.Y(dmoVar.i1.s) && ((i = (yx90Var = dmoVar.i1).e) == 2 || i == 3)) {
                                    j3 = yx90Var.s;
                                    i2 = 2;
                                    j4 = j3;
                                    z = z;
                                    vn30Var = vn30VarU;
                                    j5 = jMax;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z = z;
                                vn30VarU = vn30VarU;
                                jMax = jMax;
                                j = jMax;
                                j2 = jLongValue;
                                dmoVar.i1 = dmoVar.x(vn30VarU, j2, j, j2, z, 2);
                                throw th;
                            }
                        } else {
                            jC = jLongValue;
                        }
                        try {
                            try {
                                long jX = dmoVar.X(vn30VarU, jC, dmoVar.z(), dmoVar.i1.e == 4);
                                z |= jLongValue != jX;
                                try {
                                    yx90 yx90Var4 = dmoVar.i1;
                                    vn30 vn30Var2 = vn30VarU;
                                    try {
                                        bmq0 bmq0Var = yx90Var4.f43410a;
                                        long j8 = jMax;
                                        try {
                                            dmoVar.C0(bmq0Var, vn30Var2, bmq0Var, yx90Var4.b, j8, true);
                                            vn30Var = vn30Var2;
                                            j5 = j8;
                                            j3 = jX;
                                            i2 = 2;
                                            j4 = j3;
                                            dmoVar = this;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            vn30VarU = vn30Var2;
                                            j = j8;
                                            j2 = jX;
                                            dmoVar.i1 = dmoVar.x(vn30VarU, j2, j, j2, z, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        vn30VarU = vn30Var2;
                                        j = jMax;
                                        j2 = jX;
                                        dmoVar.i1 = dmoVar.x(vn30VarU, j2, j, j2, z, 2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                j = jMax;
                                j2 = jLongValue;
                                dmoVar.i1 = dmoVar.x(vn30VarU, j2, j, j2, z, 2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    dmoVar.i1 = dmoVar.x(vn30Var, j3, j5, j4, z, i2);
                }
                dmoVar.w1 = cmoVar;
                z = z;
                vn30Var = vn30VarU;
                j3 = jLongValue;
                j5 = jMax;
                i2 = 2;
                j4 = j3;
                dmoVar = this;
                dmoVar.i1 = dmoVar.x(vn30Var, j3, j5, j4, z, i2);
            } catch (Throwable th7) {
                th = th7;
                z = z;
                vn30VarU = vn30VarU;
                j2 = jLongValue;
                j = jMax;
            }
        } catch (Throwable th8) {
            th = th8;
            z = z;
            vn30VarU = vn30VarU;
            j = jMax;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0120  */
    public final long X(vn30 vn30Var, long j, boolean z, boolean z2) throws dlo {
        pn30 pn30Var;
        byte b;
        w0();
        boolean z3 = true;
        D0(false, true);
        if (z2 || this.i1.e == 3) {
            o0(2);
        }
        nn30 nn30Var = this.q.i;
        nn30 nn30Var2 = nn30Var;
        while (nn30Var2 != null && !vn30Var.equals(nn30Var2.g.f25528a)) {
            nn30Var2 = nn30Var2.m;
        }
        if (z || nn30Var != nn30Var2 || (nn30Var2 != null && nn30Var2.p + j < 0)) {
            for (int i = 0; i < this.f6331a.length; i++) {
                h(i);
            }
            this.E1 = -9223372036854775807L;
            if (nn30Var2 != null) {
                while (true) {
                    pn30Var = this.q;
                    if (pn30Var.i == nn30Var2) {
                        break;
                    }
                    pn30Var.a();
                }
                pn30Var.s(nn30Var2);
                nn30Var2.p = 1000000000000L;
                x0x.K(!z());
                k(new boolean[this.f6331a.length], this.q.d().e());
                a0(nn30Var2);
            }
        }
        g();
        if (this.Z) {
            for (ujf0 ujf0Var : this.f6331a) {
                if (ujf0Var.j() && ((b = ((j16) ujf0Var.e).b) == 2 || b == 4)) {
                    this.f1 = true;
                    break;
                }
            }
        }
        pn30 pn30Var2 = this.q;
        if (nn30Var2 != null) {
            pn30Var2.s(nn30Var2);
            if (!nn30Var2.e) {
                nn30Var2.g = nn30Var2.g.b(j, -9223372036854775807L);
            } else if (nn30Var2.f) {
                if (this.Z) {
                    this.Y.getClass();
                    if (this.i1.f43410a.p() || !nn30Var2.g.f25528a.equals(this.i1.b)) {
                        j = nn30Var2.f23800a.d(j);
                        nn30Var2.f23800a.m(j - this.l);
                    } else {
                        long j2 = nn30Var2.p + j;
                        boolean z4 = true;
                        for (ujf0 ujf0Var2 : this.f6331a) {
                            if (ujf0Var2.j()) {
                                j16 j16VarD = ujf0Var2.d(nn30Var2);
                                z4 &= j16VarD != null && j16VarD.F(j2);
                            }
                        }
                        if (z4) {
                            f930 f930Var = nn30Var2.f23800a;
                            long j3 = this.i1.s;
                            gvh0 gvh0Var = gvh0.c;
                            if (f930Var.c(j3, gvh0Var) == nn30Var2.f23800a.c(j, gvh0Var)) {
                                z3 = false;
                            } else {
                                j = nn30Var2.f23800a.d(j);
                                nn30Var2.f23800a.m(j - this.l);
                            }
                        } else {
                            j = nn30Var2.f23800a.d(j);
                            nn30Var2.f23800a.m(j - this.l);
                        }
                    }
                } else {
                    j = nn30Var2.f23800a.d(j);
                    nn30Var2.f23800a.m(j - this.l);
                }
            }
            Q(z3, j);
            C();
        } else {
            pn30Var2.b();
            Q(true, j);
        }
        t(false);
        this.g.h(2);
        return j;
    }

    public final void Y(y8a0 y8a0Var) {
        y8a0Var.getClass();
        q9o0 q9o0Var = this.g;
        if (y8a0Var.e != this.i) {
            q9o0Var.c(15, y8a0Var).b();
            return;
        }
        synchronized (y8a0Var) {
        }
        try {
            y8a0Var.f42187a.c(y8a0Var.c, y8a0Var.d);
            y8a0Var.a(true);
            int i = this.i1.e;
            if (i == 3 || i == 2) {
                q9o0Var.h(2);
            }
        } catch (Throwable th) {
            y8a0Var.a(true);
            throw th;
        }
    }

    public final void Z(y8a0 y8a0Var) {
        Looper looper = y8a0Var.e;
        if (looper.getThread().isAlive()) {
            this.o.a(looper, null).e(new ccf(this, y8a0Var));
        } else {
            f1t0.g0("TAG", "Trying to send message on a dead thread.");
            y8a0Var.a(false);
        }
    }

    @Override // a.ggi0
    public final void a(hgi0 hgi0Var) {
        this.g.c(9, (mn30) hgi0Var).b();
    }

    public final void a0(nn30 nn30Var) {
        for (int i = 0; i < this.f6331a.length; i++) {
            nn30Var.h[i] = true;
        }
    }

    public final void b(zlo zloVar, int i) throws Throwable {
        this.j1.c(1);
        jo30 jo30Var = this.r;
        if (i == -1) {
            i = jo30Var.c.size();
        }
        u(jo30Var.a(i, zloVar.f44590a, zloVar.b), false);
    }

    public final void b0(m24 m24Var, boolean z) {
        o24 o24Var;
        dmo dmoVar;
        syj syjVar = this.d;
        if (!syjVar.i.equals(m24Var)) {
            syjVar.i = m24Var;
            if (syjVar.f.C && Build.VERSION.SDK_INT >= 32 && (o24Var = syjVar.h) != null && o24Var.f24513a && (dmoVar = syjVar.f33026a) != null) {
                dmoVar.g.c(10, null).b();
            }
        }
        if (!z) {
            m24Var = null;
        }
        x24 x24Var = this.z;
        if (!Objects.equals(x24Var.d, m24Var)) {
            x24Var.d = m24Var;
            int i = m24Var == null ? 0 : 1;
            x24Var.f = i;
            x0x.z("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        yx90 yx90Var = this.i1;
        boolean z2 = yx90Var.l;
        A0(x24Var.c(yx90Var.e, z2), yx90Var.n, yx90Var.m, z2);
    }

    public final void c() {
        for (ujf0 ujf0Var : this.f6331a) {
            uch0 uch0Var = this.Z ? this.Y : null;
            ((j16) ujf0Var.e).c(18, uch0Var);
            j16 j16Var = (j16) ujf0Var.f;
            if (j16Var != null) {
                j16Var.c(18, uch0Var);
            }
        }
    }

    public final void c0(int i) {
        for (ujf0 ujf0Var : this.f6331a) {
            j16 j16Var = (j16) ujf0Var.e;
            byte b = j16Var.b;
            if (b == 1 || b == 2) {
                j16Var.c(10, Integer.valueOf(i));
                j16 j16Var2 = (j16) ujf0Var.f;
                if (j16Var2 != null) {
                    j16Var2.c(10, Integer.valueOf(i));
                }
            }
        }
    }

    @Override // a.seu0
    public final void d(long j, long j2, androidx.media3.common.b bVar, MediaFormat mediaFormat) {
        if (this.f1) {
            this.g.a(37).b();
        }
    }

    public final void d0(boolean z, brd brdVar) {
        if (this.s1 != z) {
            this.s1 = z;
            if (!z) {
                for (ujf0 ujf0Var : this.f6331a) {
                    ujf0Var.n();
                }
            }
        }
        if (brdVar != null) {
            brdVar.c();
        }
    }

    public final boolean e() {
        if (!this.y) {
            return false;
        }
        for (ujf0 ujf0Var : this.f6331a) {
            if (ujf0Var.g()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(xlo xloVar) {
        for (ujf0 ujf0Var : this.f6331a) {
            j16 j16Var = (j16) ujf0Var.e;
            if (j16Var.b == 4) {
                j16Var.c(23, xloVar);
                j16 j16Var2 = (j16) ujf0Var.f;
                if (j16Var2 != null) {
                    j16Var2.c(23, xloVar);
                }
            }
        }
    }

    @Override // a.ln30
    public final void f(mn30 mn30Var) {
        this.g.c(8, mn30Var).b();
    }

    public final void f0(zlo zloVar) throws Throwable {
        this.j1.c(1);
        int i = zloVar.c;
        itj0 itj0Var = zloVar.b;
        ArrayList arrayList = zloVar.f44590a;
        if (i != -1) {
            this.w1 = new cmo(new wna0(arrayList, itj0Var), zloVar.c, zloVar.d);
        }
        jo30 jo30Var = this.r;
        ArrayList arrayList2 = jo30Var.c;
        jo30Var.f(0, arrayList2.size());
        u(jo30Var.a(arrayList2.size(), arrayList, itj0Var), false);
    }

    public final void g() {
        j16 j16Var;
        if (this.y && e()) {
            for (ujf0 ujf0Var : this.f6331a) {
                int iC = ujf0Var.c();
                cwj cwjVar = this.m;
                if (ujf0Var.g()) {
                    int i = ujf0Var.d;
                    int i2 = 1;
                    boolean z = i == 5 || i == 2;
                    if (i != 5 && i != 3) {
                        i2 = 0;
                    }
                    if (z) {
                        try {
                            j16Var = (j16) ujf0Var.e;
                        } catch (RuntimeException e) {
                            f1t0.R("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        j16Var = (j16) ujf0Var.f;
                        j16Var.getClass();
                    }
                    ujf0Var.a(j16Var, cwjVar);
                    try {
                        ujf0Var.l(z);
                    } catch (RuntimeException e2) {
                        f1t0.R("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    ujf0Var.d = i2;
                }
                this.v1 -= iC - ujf0Var.c();
            }
            this.E1 = -9223372036854775807L;
        }
    }

    public final void g0(boolean z) throws dlo {
        this.l1 = z;
        P();
        if (this.m1 && z()) {
            V(true);
            t(false);
        }
    }

    public final void h(int i) {
        ujf0[] ujf0VarArr = this.f6331a;
        int iC = ujf0VarArr[i].c();
        ujf0 ujf0Var = ujf0VarArr[i];
        j16 j16Var = (j16) ujf0Var.e;
        cwj cwjVar = this.m;
        ujf0Var.a(j16Var, cwjVar);
        j16 j16Var2 = (j16) ujf0Var.f;
        if (j16Var2 != null) {
            int i2 = ujf0Var.d;
            boolean z = true;
            if (i2 != 5 && i2 != 1 && i2 != 3) {
                z = false;
            }
            ujf0Var.a(j16Var2, cwjVar);
            ujf0Var.l(false);
            if (z) {
                j16 j16Var3 = (j16) ujf0Var.e;
                j16Var2.getClass();
                j16Var2.c(17, j16Var3);
            }
        }
        ujf0Var.d = 0;
        G(i, false);
        this.v1 -= iC;
    }

    public final void h0(zx90 zx90Var) {
        this.g.g(16);
        cwj cwjVar = this.m;
        cwjVar.a(zx90Var);
        zx90 zx90VarD = cwjVar.d();
        w(zx90VarD, zx90VarD.f45148a, true, true);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        q9o0 q9o0Var;
        int i2;
        nn30 nn30Var;
        vn30 vn30Var;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.j1.c(1);
                    A0(this.z.c(this.i1.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((cmo) message.obj);
                    break;
                case 4:
                    h0((zx90) message.obj);
                    break;
                case 5:
                    this.B = (gvh0) message.obj;
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((brd) message.obj);
                    return true;
                case 8:
                    v((mn30) message.obj);
                    break;
                case 9:
                    r((mn30) message.obj);
                    break;
                case 10:
                    this.d.i((scs0) message.obj);
                    N();
                    break;
                case 11:
                    j0(message.arg1);
                    break;
                case 12:
                    m0(message.arg1 != 0);
                    break;
                case 13:
                    d0(message.arg1 != 0, (brd) message.obj);
                    break;
                case 14:
                    Y((y8a0) message.obj);
                    break;
                case 15:
                    Z((y8a0) message.obj);
                    break;
                case 16:
                    zx90 zx90Var = (zx90) message.obj;
                    w(zx90Var, zx90Var.f45148a, true, false);
                    break;
                case 17:
                    f0((zlo) message.obj);
                    break;
                case 18:
                    b((zlo) message.obj, message.arg1);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    rw2.w(message.obj);
                    I();
                    throw null;
                case 20:
                    M(message.arg1, message.arg2, (itj0) message.obj);
                    break;
                case 21:
                    n0((itj0) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    g0(message.arg1 != 0);
                    break;
                case 24:
                    this.A = message.arg1 != 0;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    N();
                    V(true);
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    N();
                    V(true);
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    z0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    i0((flo) message.obj);
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    J();
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (brd) pair.second);
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    b0((m24) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    r0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    p0((seu0) message.obj);
                    break;
                case 36:
                    k0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f1 = false;
                    cmo cmoVar = this.g1;
                    if (cmoVar != null) {
                        W(cmoVar);
                        this.g1 = null;
                    }
                    break;
                case 38:
                    l0((uch0) message.obj);
                    break;
                case 39:
                    e0((xlo) message.obj);
                    break;
                case 40:
                    c0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (dlo e) {
            e = e;
            byte b = e.c;
            pn30 pn30Var = this.q;
            if (b == 1 && e.h == null) {
                ujf0 ujf0Var = this.f6331a[e.e];
                nn30 nn30VarD = pn30Var.i;
                while (nn30VarD != null && !ujf0Var.i(nn30VarD)) {
                    nn30VarD = nn30VarD.m;
                }
                if (nn30VarD == null) {
                    nn30VarD = pn30Var.d();
                }
                if (nn30VarD != null) {
                    e = e.a(nn30VarD.g.f25528a);
                }
            }
            int i5 = e.e;
            byte b2 = e.c;
            q9o0 q9o0Var2 = this.g;
            if (b2 == 1 && (vn30Var = e.h) != null && A(i5, vn30Var)) {
                this.F1 = true;
                g();
                nn30 nn30VarK = pn30Var.k(i5);
                nn30 nn30Var2 = pn30Var.i;
                if (nn30Var2 != nn30VarK) {
                    while (nn30Var2 != null) {
                        nn30 nn30Var3 = nn30Var2.m;
                        if (nn30Var3 == nn30VarK) {
                            break;
                        }
                        nn30Var2 = nn30Var3;
                    }
                }
                pn30Var.s(nn30Var2);
                if (this.i1.e != 4) {
                    C();
                    q9o0Var2.h(2);
                }
            } else {
                dlo dloVar = this.B1;
                if (dloVar != null) {
                    dloVar.addSuppressed(e);
                    e = this.B1;
                }
                if (e.c != 1 || pn30Var.i == pn30Var.f()) {
                    q9o0Var = q9o0Var2;
                } else {
                    nn30 nn30VarD2 = pn30Var.i;
                    while (nn30VarD2 != null && !nn30VarD2.g.f25528a.equals(e.h)) {
                        nn30VarD2 = nn30VarD2.m;
                    }
                    if (nn30VarD2 == null) {
                        nn30VarD2 = pn30Var.d();
                    }
                    while (true) {
                        nn30Var = pn30Var.i;
                        if (nn30Var == nn30VarD2) {
                            break;
                        }
                        pn30Var.a();
                    }
                    x0x.F(nn30Var);
                    E(message.what);
                    on30 on30Var = nn30Var.g;
                    vn30 vn30Var2 = on30Var.f25528a;
                    long j = on30Var.b;
                    q9o0Var = q9o0Var2;
                    this.i1 = x(vn30Var2, j, on30Var.d, j, true, 0);
                }
                if (e.i && (this.B1 == null || (i2 = e.f6293a) == 5004 || i2 == 5003)) {
                    f1t0.h0("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.B1 == null) {
                        this.B1 = e;
                    }
                    p9o0 p9o0VarC = q9o0Var.c(25, e);
                    Handler handler = q9o0Var.f28360a;
                    Message message2 = p9o0VarC.f26617a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    p9o0VarC.a();
                } else {
                    f1t0.R("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.i1 = this.i1.f(e);
                }
            }
        } catch (kbj e2) {
            s(e2, e2.f18017a);
        } catch (kq80 e3) {
            boolean z2 = e3.f18709a;
            byte b3 = e3.b;
            if (b3 == 1) {
                i = z2 ? 3001 : 3003;
            } else {
                if (b3 == 4) {
                    i = z2 ? 3002 : 3004;
                }
                s(e3, i3);
            }
            i3 = i;
            s(e3, i3);
        } catch (lb6 e4) {
            s(e4, CommonCode.BusInterceptor.PRIVACY_CANCEL);
        } catch (xhl e5) {
            s(e5, e5.f40897a);
        } catch (IOException e6) {
            s(e6, 2000);
        } catch (RuntimeException e7) {
            dlo dloVar2 = new dlo(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            f1t0.R("ExoPlayerImplInternal", "Playback error", dloVar2);
            v0(true, false);
            this.i1 = this.i1.f(dloVar2);
        }
        E(message.what);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x031f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0327  */
    /* JADX WARN: Code duplicated, block: B:170:0x0330  */
    /* JADX WARN: Code duplicated, block: B:223:0x042e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0433  */
    /* JADX WARN: Code duplicated, block: B:227:0x044f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0460  */
    /* JADX WARN: Code duplicated, block: B:238:0x0464  */
    /* JADX WARN: Code duplicated, block: B:252:0x0490  */
    /* JADX WARN: Code duplicated, block: B:350:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:485:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:486:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:488:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:490:0x0800  */
    /* JADX WARN: Code duplicated, block: B:491:0x0808 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:492:0x080a  */
    /* JADX WARN: Code duplicated, block: B:494:0x080f  */
    /* JADX WARN: Code duplicated, block: B:496:0x0813  */
    /* JADX WARN: Code duplicated, block: B:498:0x0818  */
    /* JADX WARN: Code duplicated, block: B:500:0x0826  */
    /* JADX WARN: Code duplicated, block: B:501:0x082b  */
    /* JADX WARN: Code duplicated, block: B:504:0x0834  */
    /* JADX WARN: Code duplicated, block: B:507:0x083c  */
    /* JADX WARN: Code duplicated, block: B:510:0x0847  */
    /* JADX WARN: Code duplicated, block: B:513:0x084d  */
    /* JADX WARN: Code duplicated, block: B:515:0x0850 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:519:0x0894  */
    /* JADX WARN: Code duplicated, block: B:552:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:554:0x090b  */
    /* JADX WARN: Code duplicated, block: B:556:0x0922  */
    /* JADX WARN: Code duplicated, block: B:559:0x092c  */
    /* JADX WARN: Code duplicated, block: B:567:0x0949  */
    /* JADX WARN: Code duplicated, block: B:569:0x094f  */
    /* JADX WARN: Code duplicated, block: B:571:0x0959  */
    /* JADX WARN: Code duplicated, block: B:573:0x095d  */
    /* JADX WARN: Code duplicated, block: B:579:0x096f  */
    /* JADX WARN: Code duplicated, block: B:581:0x097a  */
    /* JADX WARN: Code duplicated, block: B:588:0x098e  */
    /* JADX WARN: Code duplicated, block: B:591:0x0994  */
    /* JADX WARN: Code duplicated, block: B:593:0x099c  */
    /* JADX WARN: Code duplicated, block: B:597:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:611:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:614:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:617:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:620:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:624:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:627:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:630:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:648:0x034b A[EDGE_INSN: B:648:0x034b->B:172:0x034b BREAK  A[LOOP:1: B:165:0x0322->B:171:0x0337], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x09a2 A[EDGE_INSN: B:686:0x09a2->B:595:0x09a2 BREAK  A[LOOP:12: B:589:0x098f->B:594:0x099f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x099f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0960 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c0 A[PHI: r2
  0x01c0: PHI (r2v4 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v56 int) binds: [B:73:0x01a3, B:75:0x01a7, B:77:0x01ab, B:79:0x01b1, B:82:0x01b8, B:84:0x01be, B:87:0x01c7, B:89:0x01cb, B:99:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:569:0x094f, please report this as an issue */
    public final void i() throws dlo {
        int i;
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        yx90 yx90Var;
        long j2;
        boolean z4;
        nn30 nn30Var;
        vvj vvjVar;
        long j3;
        long j4;
        int i2;
        pn30 pn30Var;
        nn30 nn30Var2;
        long j5;
        nn30 nn30Var3;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        boolean zB;
        boolean z8;
        boolean z9;
        yx90 yx90VarI;
        int i4;
        int i5;
        ujf0[] ujf0VarArr;
        yx90 yx90Var2;
        byte b;
        long j6;
        nn30 nn30Var4;
        long j7;
        int i6;
        int i7;
        nn30 nn30Var5;
        nn30 nn30Var6;
        boolean z10;
        boolean z11;
        ucs0 ucs0Var;
        int i8;
        nn30[] nn30VarArr;
        nn30 nn30Var7;
        ucs0 ucs0Var2;
        long j8;
        int length;
        int i9;
        j16 j16Var;
        boolean zP;
        j16 j16Var2;
        byte b2;
        int i10;
        int i11;
        int i12;
        nn30[] nn30VarArr2;
        nn30 nn30Var8;
        nn30 nn30Var9;
        nn30 nn30VarC;
        nn30 nn30Var10;
        boolean z12;
        ucs0 ucs0Var3;
        boolean z13;
        this.o.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.g.g(2);
        yx90 yx90Var3 = this.i1;
        int i13 = yx90Var3.e;
        if (i13 == 1 || i13 == 4) {
            return;
        }
        int i14 = 0;
        if (yx90Var3.f43410a.p() || !this.r.l) {
            jUptimeMillis = jUptimeMillis;
            i = 5;
        } else {
            this.q.r(this.x1);
            pn30 pn30Var2 = this.q;
            nn30 nn30Var11 = pn30Var2.l;
            if (nn30Var11 == null || (!nn30Var11.g.i && nn30Var11.g() && pn30Var2.l.g.e != -9223372036854775807L && pn30Var2.n < 100)) {
                pn30 pn30Var3 = this.q;
                long j9 = this.x1;
                yx90 yx90Var4 = this.i1;
                j6 = -9223372036854775807L;
                nn30 nn30Var12 = pn30Var3.l;
                on30 on30VarH = nn30Var12 == null ? pn30Var3.h(yx90Var4.f43410a, yx90Var4.b, yx90Var4.c, yx90Var4.s, -9223372036854775807L) : pn30Var3.e(yx90Var4.f43410a, nn30Var12, j9);
                if (on30VarH != null) {
                    pn30 pn30Var4 = this.q;
                    nn30 nn30Var13 = pn30Var4.l;
                    long j10 = nn30Var13 == null ? 1000000000000L : (nn30Var13.p + nn30Var13.g.e) - on30VarH.b;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= pn30Var4.q.size()) {
                            nn30Var4 = null;
                            break;
                        }
                        on30 on30Var = ((nn30) pn30Var4.q.get(i15)).g;
                        long j11 = on30Var.e;
                        long j12 = on30VarH.e;
                        if ((j11 == -9223372036854775807L || j11 == j12) && on30Var.b == on30VarH.b && on30Var.f25528a.equals(on30VarH.f25528a)) {
                            nn30Var4 = (nn30) pn30Var4.q.remove(i15);
                            break;
                        }
                        i15++;
                    }
                    if (nn30Var4 == null) {
                        dmo dmoVar = (dmo) pn30Var4.e.b;
                        j16[] j16VarArr = dmoVar.b;
                        syj syjVar = dmoVar.d;
                        xvj xvjVar = dmoVar.f;
                        a4a0 a4a0Var = dmoVar.u;
                        xvjVar.getClass();
                        lhf0 lhf0Var = new lhf0(xvjVar, a4a0Var);
                        jo30 jo30Var = dmoVar.r;
                        ucs0 ucs0Var4 = dmoVar.e;
                        dmoVar.D1.getClass();
                        nn30Var4 = new nn30(j16VarArr, j10, syjVar, lhf0Var, jo30Var, on30VarH, ucs0Var4);
                    } else {
                        nn30Var4.g = on30VarH;
                        nn30Var4.p = j10;
                    }
                    nn30 nn30Var14 = pn30Var4.l;
                    if (nn30Var14 == null) {
                        pn30Var4.i = nn30Var4;
                        Arrays.fill(pn30Var4.j, nn30Var4);
                        Arrays.fill(pn30Var4.k, nn30Var4);
                    } else if (nn30Var4 != nn30Var14.m) {
                        nn30Var14.b();
                        nn30Var14.m = nn30Var4;
                        nn30Var14.c();
                    }
                    pn30Var4.o = null;
                    pn30Var4.l = nn30Var4;
                    pn30Var4.n++;
                    pn30Var4.q();
                    if (!nn30Var4.d) {
                        long j13 = on30VarH.b;
                        nn30Var4.d = true;
                        nn30Var4.f23800a.r(this, j13);
                    } else if (nn30Var4.e) {
                        this.g.c(8, nn30Var4.f23800a).b();
                    }
                    if (this.q.i == nn30Var4) {
                        Q(true, on30VarH.b);
                    }
                    t(false);
                }
            } else {
                j6 = -9223372036854775807L;
                jUptimeMillis = jUptimeMillis;
            }
            if (this.p1) {
                this.p1 = y(this.q.l);
                x0();
            } else {
                C();
            }
            pn30 pn30Var5 = this.q;
            long j14 = 10000000;
            if (this.m1 || !this.y || this.F1 || e() || (nn30VarC = pn30Var5.c()) == null || nn30VarC != pn30Var5.d() || (nn30Var10 = nn30VarC.m) == null || !(z12 = nn30Var10.e)) {
                j7 = 10000000;
                i6 = i14;
            } else {
                x0x.K(z12);
                if (((long) ((nn30Var10.e() - this.x1) / this.m.d().f45148a)) > 10000000) {
                    j7 = 10000000;
                    i6 = 0;
                } else {
                    int i16 = 0;
                    while (true) {
                        nn30[] nn30VarArr3 = pn30Var5.k;
                        if (i16 >= nn30VarArr3.length) {
                            break;
                        }
                        nn30 nn30Var15 = nn30VarArr3[i16];
                        nn30Var15.getClass();
                        nn30VarArr3[i16] = nn30Var15.m;
                        pn30Var5.q();
                        i16++;
                    }
                    ujf0[] ujf0VarArr2 = this.f6331a;
                    i14 = 0;
                    nn30 nn30VarC2 = pn30Var5.c();
                    if (nn30VarC2 == null) {
                        j7 = 10000000;
                        i6 = i14;
                    } else {
                        ucs0 ucs0Var5 = nn30VarC2.o;
                        boolean z14 = false;
                        while (i14 < ujf0VarArr2.length) {
                            if (ucs0Var5.p(i14)) {
                                ujf0 ujf0Var = ujf0VarArr2[i14];
                                if (((j16) ujf0Var.f) == null || ujf0Var.g()) {
                                    ucs0Var3 = ucs0Var5;
                                    z13 = false;
                                } else {
                                    ujf0 ujf0Var2 = ujf0VarArr2[i14];
                                    x0x.K(!ujf0Var2.g());
                                    if (ujf0.k((j16) ujf0Var2.e)) {
                                        ujf0Var2.d = 4;
                                    } else {
                                        j16 j16Var3 = (j16) ujf0Var2.f;
                                        if (j16Var3 != null && j16Var3.h != 0) {
                                            ujf0Var2.d = 5;
                                        } else if (ujf0Var2.d == 0) {
                                            ujf0Var2.d = 2;
                                        } else {
                                            ujf0Var2.d = 3;
                                        }
                                    }
                                    ucs0Var3 = ucs0Var5;
                                    z13 = false;
                                    j(nn30VarC2, i14, false, nn30VarC2.e());
                                }
                            } else {
                                ucs0Var3 = ucs0Var5;
                                z13 = z14;
                            }
                            i14++;
                            z14 = z13;
                            ucs0Var5 = ucs0Var3;
                            j14 = j14;
                        }
                        j7 = j14;
                        boolean z15 = z14;
                        i6 = z15;
                        if (e()) {
                            this.E1 = nn30VarC2.f23800a.h();
                            i6 = z15;
                            if (!nn30VarC2.g()) {
                                pn30Var5.s(nn30VarC2);
                                t(z15);
                                C();
                                i6 = z15;
                            }
                        }
                    }
                }
            }
            boolean z16 = this.y;
            ujf0[] ujf0VarArr3 = this.f6331a;
            pn30 pn30Var6 = this.q;
            nn30 nn30VarD = pn30Var6.d();
            if (nn30VarD != null) {
                if (nn30VarD.m != null && !this.m1) {
                    nn30 nn30VarD2 = pn30Var6.d();
                    if (nn30VarD2.e) {
                        ujf0[] ujf0VarArr4 = this.f6331a;
                        int length2 = ujf0VarArr4.length;
                        int i17 = i6;
                        while (true) {
                            if (i17 >= length2) {
                                if (!e() || pn30Var6.c() != pn30Var6.d()) {
                                    nn30 nn30Var16 = nn30VarD.m;
                                    if (!nn30Var16.e && this.x1 < nn30Var16.e()) {
                                        break;
                                    }
                                    nn30 nn30Var17 = nn30VarD.m;
                                    boolean z17 = nn30Var17.e;
                                    if (!z17) {
                                        ucs0Var = nn30VarD.o;
                                        i8 = i6;
                                        while (true) {
                                            nn30VarArr = pn30Var6.j;
                                            if (i8 < nn30VarArr.length) {
                                                break;
                                                break;
                                            }
                                            nn30VarArr2 = pn30Var6.k;
                                            nn30Var8 = nn30VarArr2[i8];
                                            nn30Var9 = nn30VarArr[i8];
                                            if (nn30Var8 != nn30Var9) {
                                                nn30Var9.getClass();
                                                nn30VarArr2[i8] = nn30Var9.m;
                                            }
                                            nn30 nn30Var18 = nn30VarArr[i8];
                                            nn30Var18.getClass();
                                            nn30VarArr[i8] = nn30Var18.m;
                                            pn30Var6.q();
                                            nn30VarArr[i8].getClass();
                                            i8++;
                                        }
                                        nn30Var7 = nn30VarArr[i6];
                                        nn30Var7.getClass();
                                        ucs0Var2 = nn30Var7.o;
                                        bmq0 bmq0Var = this.i1.f43410a;
                                        j8 = j6;
                                        C0(bmq0Var, nn30Var7.g.f25528a, bmq0Var, nn30VarD.g.f25528a, -9223372036854775807L, false);
                                        if (nn30Var7.e) {
                                            length = ujf0VarArr3.length;
                                            i9 = 0;
                                            while (i9 < length) {
                                                ujf0 ujf0Var3 = ujf0VarArr3[i9];
                                                long jE = nn30Var7.e();
                                                j16Var = (j16) ujf0Var3.e;
                                                long j15 = j8;
                                                int i18 = ujf0Var3.c;
                                                zP = ucs0Var.p(i18);
                                                boolean zP2 = ucs0Var2.p(i18);
                                                j16Var2 = (j16) ujf0Var3.f;
                                                if (j16Var2 == null) {
                                                }
                                                if (zP) {
                                                    b2 = -2;
                                                } else {
                                                    b2 = -2;
                                                }
                                                i9++;
                                                j8 = j15;
                                            }
                                        } else {
                                            length = ujf0VarArr3.length;
                                            i9 = 0;
                                            while (i9 < length) {
                                                ujf0 ujf0Var4 = ujf0VarArr3[i9];
                                                long jE2 = nn30Var7.e();
                                                j16Var = (j16) ujf0Var4.e;
                                                long j16 = j8;
                                                int i19 = ujf0Var4.c;
                                                zP = ucs0Var.p(i19);
                                                boolean zP3 = ucs0Var2.p(i19);
                                                j16Var2 = (j16) ujf0Var4.f;
                                                if (j16Var2 == null) {
                                                }
                                                if (zP) {
                                                    b2 = -2;
                                                } else {
                                                    b2 = -2;
                                                }
                                                i9++;
                                                j8 = j16;
                                            }
                                        }
                                        break;
                                        break;
                                    }
                                    x0x.K(z17);
                                    if (((long) ((nn30Var17.e() - this.x1) / this.m.d().f45148a)) > j7) {
                                        break;
                                    }
                                    ucs0Var = nn30VarD.o;
                                    i8 = i6;
                                    while (true) {
                                        nn30VarArr = pn30Var6.j;
                                        if (i8 < nn30VarArr.length) {
                                            break;
                                        }
                                        nn30VarArr2 = pn30Var6.k;
                                        nn30Var8 = nn30VarArr2[i8];
                                        nn30Var9 = nn30VarArr[i8];
                                        if (nn30Var8 != nn30Var9) {
                                            nn30Var9.getClass();
                                            nn30VarArr2[i8] = nn30Var9.m;
                                        }
                                        nn30 nn30Var19 = nn30VarArr[i8];
                                        nn30Var19.getClass();
                                        nn30VarArr[i8] = nn30Var19.m;
                                        pn30Var6.q();
                                        nn30VarArr[i8].getClass();
                                        i8++;
                                    }
                                    nn30Var7 = nn30VarArr[i6];
                                    nn30Var7.getClass();
                                    ucs0Var2 = nn30Var7.o;
                                    bmq0 bmq0Var2 = this.i1.f43410a;
                                    j8 = j6;
                                    C0(bmq0Var2, nn30Var7.g.f25528a, bmq0Var2, nn30VarD.g.f25528a, -9223372036854775807L, false);
                                    if (nn30Var7.e || ((!z16 || this.E1 == j8) && nn30Var7.f23800a.h() == j8)) {
                                        length = ujf0VarArr3.length;
                                        i9 = 0;
                                        while (i9 < length) {
                                            ujf0 ujf0Var5 = ujf0VarArr3[i9];
                                            long jE3 = nn30Var7.e();
                                            j16Var = (j16) ujf0Var5.e;
                                            long j17 = j8;
                                            int i110 = ujf0Var5.c;
                                            zP = ucs0Var.p(i110);
                                            boolean zP4 = ucs0Var2.p(i110);
                                            j16Var2 = (j16) ujf0Var5.f;
                                            if (j16Var2 == null && (i10 = ujf0Var5.d) != 4) {
                                                if (i10 == 3 || (i10 == 0 && ujf0.k(j16Var))) {
                                                }
                                                if (zP || j16Var2.n) {
                                                    b2 = -2;
                                                } else {
                                                    b2 = -2;
                                                    boolean z18 = j16Var.b == -2;
                                                    tjf0 tjf0Var = ((tjf0[]) ucs0Var.c)[i110];
                                                    tjf0 tjf0Var2 = ((tjf0[]) ucs0Var2.c)[i110];
                                                    if (!zP4 || !Objects.equals(tjf0Var2, tjf0Var) || z18 || ujf0Var5.g()) {
                                                        ujf0.o(j16Var2, jE3);
                                                    }
                                                }
                                                i9++;
                                                j8 = j17;
                                            }
                                            if (zP) {
                                                b2 = -2;
                                            } else {
                                                b2 = -2;
                                            }
                                            i9++;
                                            j8 = j17;
                                        }
                                    } else {
                                        this.E1 = j8;
                                        boolean z19 = z16 && !this.F1;
                                        if (z19) {
                                            for (int i20 = 0; i20 < ujf0VarArr3.length; i20++) {
                                                boolean zP5 = ucs0Var2.p(i20);
                                                fmo[] fmoVarArr = (fmo[]) ucs0Var2.d;
                                                if (zP5 && ((j16) ujf0VarArr3[i20].e).b != -2 && !mg40.a(fmoVarArr[i20].r().p, fmoVarArr[i20].r().l) && !ujf0VarArr3[i20].g()) {
                                                    z19 = false;
                                                    break;
                                                }
                                            }
                                        }
                                        if (z19) {
                                            length = ujf0VarArr3.length;
                                            i9 = 0;
                                            while (i9 < length) {
                                                ujf0 ujf0Var6 = ujf0VarArr3[i9];
                                                long jE4 = nn30Var7.e();
                                                j16Var = (j16) ujf0Var6.e;
                                                long j18 = j8;
                                                int i111 = ujf0Var6.c;
                                                zP = ucs0Var.p(i111);
                                                boolean zP6 = ucs0Var2.p(i111);
                                                j16Var2 = (j16) ujf0Var6.f;
                                                j16Var2 = j16Var2 == null ? j16Var : j16Var;
                                                if (zP) {
                                                    b2 = -2;
                                                } else {
                                                    b2 = -2;
                                                }
                                                i9++;
                                                j8 = j18;
                                            }
                                        } else {
                                            long jE5 = nn30Var7.e();
                                            int length3 = ujf0VarArr3.length;
                                            int i21 = 0;
                                            while (i21 < length3) {
                                                ujf0 ujf0Var7 = ujf0VarArr3[i21];
                                                j16 j16Var4 = (j16) ujf0Var7.f;
                                                j16 j16Var5 = (j16) ujf0Var7.e;
                                                if (ujf0.k(j16Var5) && (i12 = ujf0Var7.d) != 5 && i12 != 2) {
                                                    ujf0.o(j16Var5, jE5);
                                                }
                                                if (j16Var4 != null && j16Var4.h != 0 && (i11 = ujf0Var7.d) != 4 && i11 != 3) {
                                                    ujf0.o(j16Var4, jE5);
                                                }
                                                i21++;
                                                nn30Var7 = nn30Var7;
                                            }
                                            nn30 nn30Var20 = nn30Var7;
                                            if (!nn30Var20.g()) {
                                                pn30Var6.s(nn30Var20);
                                                t(false);
                                                C();
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            ujf0 ujf0Var8 = ujf0VarArr4[i17];
                            if (!ujf0Var8.e(nn30VarD2, (j16) ujf0Var8.e) || !ujf0Var8.e(nn30VarD2, (j16) ujf0Var8.f)) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                } else if (nn30VarD.g.i || this.m1) {
                    for (ujf0 ujf0Var9 : ujf0VarArr3) {
                        if (ujf0Var9.i(nn30VarD)) {
                            j16 j16VarD = ujf0Var9.d(nn30VarD);
                            j16VarD.getClass();
                            if (j16VarD.l()) {
                                long j19 = nn30VarD.g.e;
                                long j20 = (j19 == j6 || j19 == Long.MIN_VALUE) ? j6 : nn30VarD.p + j19;
                                j16 j16VarD2 = ujf0Var9.d(nn30VarD);
                                j16VarD2.getClass();
                                ujf0.o(j16VarD2, j20);
                            }
                        }
                    }
                }
            }
            pn30 pn30Var7 = this.q;
            nn30 nn30VarD3 = pn30Var7.d();
            if (nn30VarD3 == null || pn30Var7.i == nn30VarD3) {
                i7 = 3;
                break;
            }
            int i22 = 0;
            while (true) {
                if (i22 >= this.f6331a.length) {
                    i7 = 3;
                    break;
                }
                if (!nn30VarD3.h[i22]) {
                    nn30 nn30VarD4 = pn30Var7.d();
                    ucs0 ucs0Var6 = nn30VarD4.o;
                    ujf0[] ujf0VarArr5 = this.f6331a;
                    boolean z20 = true;
                    for (ujf0 ujf0Var10 : ujf0VarArr5) {
                        int iC = ujf0Var10.c();
                        cwj cwjVar = this.m;
                        int iM = ujf0Var10.m((j16) ujf0Var10.e, nn30VarD4, ucs0Var6, cwjVar);
                        int iM2 = ujf0Var10.m((j16) ujf0Var10.f, nn30VarD4, ucs0Var6, cwjVar);
                        if (iM == 1) {
                            iM = iM2;
                        }
                        if ((iM & 2) != 0 && (z11 = this.u1) && z11) {
                            this.u1 = false;
                            if (this.i1.p) {
                                this.g.h(2);
                            }
                        }
                        this.v1 -= iC - ujf0Var10.c();
                        z20 &= (iM & 1) != 0;
                    }
                    if (z20) {
                        for (int i23 = 0; i23 < ujf0VarArr5.length; i23++) {
                            if (ucs0Var6.p(i23) && !ujf0VarArr5[i23].i(nn30VarD4)) {
                                j(nn30VarD4, i23, false, nn30VarD4.e());
                            }
                        }
                    }
                    i7 = 3;
                    if (!z20) {
                        break;
                    }
                    a0(pn30Var7.d());
                    break;
                }
                i22++;
            }
            ujf0[] ujf0VarArr6 = this.f6331a;
            pn30 pn30Var8 = this.q;
            boolean z21 = false;
            loop9: while (s0() && !this.m1 && (nn30Var5 = pn30Var8.i) != null && (nn30Var6 = nn30Var5.m) != null && this.x1 >= nn30Var6.e()) {
                for (int i24 = 0; i24 < this.f6331a.length; i24++) {
                    if (!nn30Var6.h[i24]) {
                        break loop9;
                    }
                }
                if (z21) {
                    E(-1);
                }
                this.F1 = false;
                nn30 nn30VarA = pn30Var8.a();
                nn30VarA.getClass();
                if (this.i1.b.f37698a.equals(nn30VarA.g.f25528a.f37698a)) {
                    vn30 vn30Var = this.i1.b;
                    if (vn30Var.b == -1) {
                        vn30 vn30Var2 = nn30VarA.g.f25528a;
                        if (vn30Var2.b != -1 || vn30Var.e == vn30Var2.e) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                on30 on30Var2 = nn30VarA.g;
                vn30 vn30Var3 = on30Var2.f25528a;
                boolean z22 = z10;
                long j21 = on30Var2.b;
                int i25 = i7;
                this.i1 = x(vn30Var3, j21, on30Var2.d, j21, !z22, 0);
                P();
                B0();
                for (int i26 = 0; i26 < ujf0VarArr6.length; i26++) {
                    if ((!this.y ? false : this.f6331a[i26].g()) && nn30VarA == pn30Var8.k[i26]) {
                        ujf0 ujf0Var11 = ujf0VarArr6[i26];
                        int i27 = ujf0Var11.d;
                        if (i27 == 4 || i27 == 5) {
                            boolean z23 = i27 == 5;
                            j16 j16Var6 = (j16) ujf0Var11.e;
                            j16 j16Var7 = (j16) ujf0Var11.f;
                            if (z23) {
                                j16Var7.getClass();
                                j16Var7.c(17, j16Var6);
                            } else {
                                j16Var7.getClass();
                                j16Var6.c(17, j16Var7);
                            }
                            ujf0Var11.d = ujf0Var11.d == 5 ? 0 : 1;
                        } else if (i27 == 2) {
                            ujf0Var11.d = 0;
                        } else if (i27 == i25) {
                            ujf0Var11.d = 1;
                        }
                    }
                }
                if (this.i1.e == i25) {
                    u0();
                }
                ucs0 ucs0Var7 = pn30Var8.i.o;
                for (int i28 = 0; i28 < ujf0VarArr6.length; i28++) {
                    if (ucs0Var7.p(i28)) {
                        ujf0 ujf0Var12 = ujf0VarArr6[i28];
                        j16 j16Var8 = (j16) ujf0Var12.f;
                        j16 j16Var9 = (j16) ujf0Var12.e;
                        if (ujf0.k(j16Var9)) {
                            j16Var9.h();
                        } else if (j16Var8 != null && j16Var8.h != 0) {
                            j16Var8.h();
                        }
                    }
                }
                i7 = i25;
                z21 = true;
            }
            i = 5;
            this.D1.getClass();
        }
        nn30 nn30Var21 = this.q.i;
        if (nn30Var21 == null) {
            U(jUptimeMillis);
            return;
        }
        long j22 = jUptimeMillis;
        Trace.beginSection("doSomeWork");
        B0();
        if (nn30Var21.e) {
            this.o.getClass();
            this.y1 = vtt0.M(SystemClock.elapsedRealtime());
            nn30Var21.f23800a.m(this.i1.s - this.l);
            int i29 = 0;
            boolean z24 = false;
            z = true;
            z2 = true;
            while (true) {
                ujf0[] ujf0VarArr7 = this.f6331a;
                if (i29 >= ujf0VarArr7.length) {
                    break;
                }
                ujf0 ujf0Var13 = ujf0VarArr7[i29];
                if (ujf0Var13.c() == 0) {
                    G(i29, false);
                } else {
                    long j23 = this.x1;
                    long j24 = this.y1;
                    j16 j16Var10 = (j16) ujf0Var13.f;
                    j16 j16Var11 = (j16) ujf0Var13.e;
                    if (ujf0.k(j16Var11)) {
                        j16Var11.z(j23, j24);
                    }
                    if (j16Var10 != null && j16Var10.h != 0) {
                        j16Var10.z(j23, j24);
                    }
                    boolean z25 = z2 && ujf0Var13.f();
                    boolean z26 = (this.f1 && ujf0Var13.j() && ((b = ((j16) ujf0Var13.e).b) == 2 || b == 4) && !ujf0Var13.f()) ? true : z24;
                    j16 j16VarD3 = ujf0Var13.d(nn30Var21);
                    boolean z27 = j16VarD3 == null || j16VarD3.l() || j16VarD3.o() || j16VarD3.m();
                    G(i29, z27);
                    z = z && z27;
                    if (!z27) {
                        F(i29);
                    }
                    z24 = z26;
                    z2 = z25;
                }
                i29++;
            }
            if (this.f1 && !z24 && !this.g.f28360a.hasMessages(37)) {
                this.g.a(37).b();
            }
        } else {
            nn30Var21.f23800a.l();
            z = true;
            z2 = true;
        }
        long j25 = nn30Var21.g.e;
        if (z2 && nn30Var21.e) {
            j = -9223372036854775807L;
            z3 = j25 == -9223372036854775807L || j25 <= this.i1.s;
            if (z3 && this.m1) {
                this.m1 = false;
                int i30 = this.i1.n;
                this.j1.c(0);
                A0(this.z.c(this.i1.e, false), i30, i, false);
            }
            if (z3 || !nn30Var21.g.i) {
                yx90Var = this.i1;
                if (yx90Var.e == 2) {
                    pn30Var = this.q;
                    if (this.v1 == 0) {
                        zB = B();
                        j2 = j;
                    } else {
                        if (z) {
                            if (yx90Var.g) {
                                nn30Var2 = pn30Var.i;
                                if (t0(yx90Var.f43410a, nn30Var2.g.f25528a)) {
                                    j5 = this.s.h;
                                } else {
                                    j5 = j;
                                }
                                nn30Var3 = pn30Var.l;
                                if (nn30Var3.g() || !nn30Var3.g.i) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (nn30Var3.g.f25528a.c() || nn30Var3.e) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                if (!z5 || z6) {
                                    j2 = j;
                                } else {
                                    long jO = o(nn30Var3.d());
                                    xvj xvjVar2 = this.f;
                                    a4a0 a4a0Var2 = this.u;
                                    bmq0 bmq0Var3 = this.i1.f43410a;
                                    vn30 vn30Var4 = nn30Var2.g.f25528a;
                                    float f = this.m.d().f45148a;
                                    j2 = j;
                                    boolean z28 = this.i1.l;
                                    boolean z29 = this.n1;
                                    xvjVar2.getClass();
                                    long j26 = j5;
                                    en30 en30Var = bmq0Var3.m(bmq0Var3.g(vn30Var4.f37698a, xvjVar2.b).c, xvjVar2.f41562a, 0L).b.b;
                                    if (en30Var == null) {
                                        z7 = false;
                                    } else {
                                        String scheme = en30Var.f8073a.getScheme();
                                        if (TextUtils.isEmpty(scheme) || xvj.p.contains(scheme)) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                    }
                                    long jA = vtt0.A(f, jO);
                                    long jMin = z29 ? z7 ? xvjVar2.k : xvjVar2.j : z7 ? xvjVar2.i : xvjVar2.h;
                                    if (j26 != j2) {
                                        jMin = Math.min(j26 / 2, jMin);
                                    }
                                    if (jMin > 0 && jA < jMin) {
                                        if (!z7) {
                                            wvj wvjVar = (wvj) xvjVar2.n.get(a4a0Var2);
                                            wvjVar.getClass();
                                            synchronized (wvjVar) {
                                                i3 = wvjVar.d;
                                            }
                                            int i31 = i3 * 65536;
                                            wvj wvjVar2 = (wvj) xvjVar2.n.get(a4a0Var2);
                                            wvjVar2.getClass();
                                            if (i31 >= wvjVar2.c) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                j2 = j;
                            }
                            zB = true;
                        } else {
                            j2 = j;
                        }
                        zB = false;
                    }
                    if (zB) {
                        o0(3);
                        this.B1 = null;
                        if (s0()) {
                            D0(false, false);
                            cwj cwjVar2 = this.m;
                            z4 = true;
                            cwjVar2.b = true;
                            ((d4m0) cwjVar2.c).f();
                            u0();
                        }
                    }
                    if (this.i1.e == 2) {
                        i5 = 0;
                        while (true) {
                            ujf0VarArr = this.f6331a;
                            if (i5 < ujf0VarArr.length) {
                                break;
                            }
                            if (ujf0VarArr[i5].i(nn30Var21)) {
                                F(i5);
                            }
                            i5++;
                        }
                        yx90Var2 = this.i1;
                        if (yx90Var2.g && yx90Var2.r < 500000 && y(this.q.l) && s0()) {
                            long j27 = this.C1;
                            l9o0 l9o0Var = this.o;
                            if (j27 == -9223372036854775807L) {
                                l9o0Var.getClass();
                                this.C1 = SystemClock.elapsedRealtime();
                            } else {
                                l9o0Var.getClass();
                                if (SystemClock.elapsedRealtime() - this.C1 >= 4000) {
                                    throw new gum0(0, 4000);
                                }
                            }
                        } else {
                            this.C1 = -9223372036854775807L;
                        }
                    } else {
                        this.C1 = -9223372036854775807L;
                    }
                    if (s0() || this.i1.e != 3) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (!this.u1 && this.t1 && z8) {
                        z9 = z4;
                    } else {
                        z9 = false;
                    }
                    yx90VarI = this.i1;
                    if (yx90VarI.p != z9) {
                        yx90VarI = yx90VarI.i(z9);
                        this.i1 = yx90VarI;
                    }
                    this.t1 = false;
                    if (!z9 && (i4 = yx90VarI.e) != 4 && (z8 || i4 == 2 || (i4 == 3 && this.v1 != 0))) {
                        U(j22);
                    }
                    Trace.endSection();
                }
                j2 = j;
                z4 = true;
                if (this.i1.e == 3 && (this.v1 != 0 ? !z : !B())) {
                    D0(s0(), false);
                    o0(2);
                    if (this.n1) {
                        for (nn30Var = this.q.i; nn30Var != null; nn30Var = nn30Var.m) {
                            for (fmo fmoVar : (fmo[]) nn30Var.o.d) {
                                if (fmoVar != null) {
                                    fmoVar.u();
                                }
                            }
                        }
                        vvjVar = this.s;
                        j3 = vvjVar.h;
                        if (j3 != j2) {
                            long j28 = j3 + vvjVar.b;
                            vvjVar.h = j28;
                            j4 = vvjVar.g;
                            if (j4 != j2 && j28 > j4) {
                                vvjVar.h = j4;
                            }
                            vvjVar.l = j2;
                        }
                    }
                    w0();
                }
                if (this.i1.e == 2) {
                    i5 = 0;
                    while (true) {
                        ujf0VarArr = this.f6331a;
                        if (i5 < ujf0VarArr.length) {
                            break;
                            break;
                        } else {
                            if (ujf0VarArr[i5].i(nn30Var21)) {
                                F(i5);
                            }
                            i5++;
                        }
                    }
                    yx90Var2 = this.i1;
                    if (yx90Var2.g) {
                        this.C1 = -9223372036854775807L;
                    } else {
                        this.C1 = -9223372036854775807L;
                    }
                } else {
                    this.C1 = -9223372036854775807L;
                }
                if (s0()) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (!this.u1) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                yx90VarI = this.i1;
                if (yx90VarI.p != z9) {
                    yx90VarI = yx90VarI.i(z9);
                    this.i1 = yx90VarI;
                }
                this.t1 = false;
                if (!z9) {
                    U(j22);
                }
                Trace.endSection();
            }
            o0(4);
            w0();
            z4 = true;
            if (this.i1.e == 2) {
                i5 = 0;
                while (true) {
                    ujf0VarArr = this.f6331a;
                    if (i5 < ujf0VarArr.length) {
                        break;
                        break;
                    } else {
                        if (ujf0VarArr[i5].i(nn30Var21)) {
                            F(i5);
                        }
                        i5++;
                    }
                }
                yx90Var2 = this.i1;
                if (yx90Var2.g) {
                    this.C1 = -9223372036854775807L;
                } else {
                    this.C1 = -9223372036854775807L;
                }
            } else {
                this.C1 = -9223372036854775807L;
            }
            if (s0()) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (!this.u1) {
                z9 = false;
            } else {
                z9 = false;
            }
            yx90VarI = this.i1;
            if (yx90VarI.p != z9) {
                yx90VarI = yx90VarI.i(z9);
                this.i1 = yx90VarI;
            }
            this.t1 = false;
            if (!z9) {
                U(j22);
            }
            Trace.endSection();
        }
        j = -9223372036854775807L;
        if (z3) {
            this.m1 = false;
            int i32 = this.i1.n;
            this.j1.c(0);
            A0(this.z.c(this.i1.e, false), i32, i, false);
        }
        if (z3) {
            yx90Var = this.i1;
            if (yx90Var.e == 2) {
                pn30Var = this.q;
                if (this.v1 == 0) {
                    zB = B();
                    j2 = j;
                } else {
                    if (z) {
                        j2 = j;
                    } else {
                        if (yx90Var.g) {
                            j2 = j;
                        } else {
                            nn30Var2 = pn30Var.i;
                            if (t0(yx90Var.f43410a, nn30Var2.g.f25528a)) {
                                j5 = this.s.h;
                            } else {
                                j5 = j;
                            }
                            nn30Var3 = pn30Var.l;
                            if (nn30Var3.g()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (nn30Var3.g.f25528a.c()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                                j2 = j;
                            } else {
                                j2 = j;
                            }
                        }
                        zB = true;
                    }
                    zB = false;
                }
                if (zB) {
                    o0(3);
                    this.B1 = null;
                    if (s0()) {
                        D0(false, false);
                        cwj cwjVar3 = this.m;
                        z4 = true;
                        cwjVar3.b = true;
                        ((d4m0) cwjVar3.c).f();
                        u0();
                    } else {
                        z4 = true;
                    }
                }
            } else {
                j2 = j;
            }
            z4 = true;
            if (this.i1.e == 3) {
                D0(s0(), false);
                o0(2);
                if (this.n1) {
                    while (nn30Var != null) {
                        while (i2 < r6) {
                            if (fmoVar != null) {
                                fmoVar.u();
                            }
                        }
                    }
                    vvjVar = this.s;
                    j3 = vvjVar.h;
                    if (j3 != j2) {
                        long j29 = j3 + vvjVar.b;
                        vvjVar.h = j29;
                        j4 = vvjVar.g;
                        if (j4 != j2) {
                            vvjVar.h = j4;
                        }
                        vvjVar.l = j2;
                    }
                }
                w0();
            }
        } else {
            yx90Var = this.i1;
            if (yx90Var.e == 2) {
                pn30Var = this.q;
                if (this.v1 == 0) {
                    zB = B();
                    j2 = j;
                } else {
                    if (z) {
                        j2 = j;
                    } else {
                        if (yx90Var.g) {
                            j2 = j;
                        } else {
                            nn30Var2 = pn30Var.i;
                            if (t0(yx90Var.f43410a, nn30Var2.g.f25528a)) {
                                j5 = this.s.h;
                            } else {
                                j5 = j;
                            }
                            nn30Var3 = pn30Var.l;
                            if (nn30Var3.g()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (nn30Var3.g.f25528a.c()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                                j2 = j;
                            } else {
                                j2 = j;
                            }
                        }
                        zB = true;
                    }
                    zB = false;
                }
                if (zB) {
                    o0(3);
                    this.B1 = null;
                    if (s0()) {
                        D0(false, false);
                        cwj cwjVar4 = this.m;
                        z4 = true;
                        cwjVar4.b = true;
                        ((d4m0) cwjVar4.c).f();
                        u0();
                    } else {
                        z4 = true;
                    }
                }
            } else {
                j2 = j;
            }
            z4 = true;
            if (this.i1.e == 3) {
                D0(s0(), false);
                o0(2);
                if (this.n1) {
                    while (nn30Var != null) {
                        while (i2 < r6) {
                            if (fmoVar != null) {
                                fmoVar.u();
                            }
                        }
                    }
                    vvjVar = this.s;
                    j3 = vvjVar.h;
                    if (j3 != j2) {
                        long j210 = j3 + vvjVar.b;
                        vvjVar.h = j210;
                        j4 = vvjVar.g;
                        if (j4 != j2) {
                            vvjVar.h = j4;
                        }
                        vvjVar.l = j2;
                    }
                }
                w0();
            }
        }
        if (this.i1.e == 2) {
            i5 = 0;
            while (true) {
                ujf0VarArr = this.f6331a;
                if (i5 < ujf0VarArr.length) {
                    break;
                    break;
                } else {
                    if (ujf0VarArr[i5].i(nn30Var21)) {
                        F(i5);
                    }
                    i5++;
                }
            }
            yx90Var2 = this.i1;
            if (yx90Var2.g) {
                this.C1 = -9223372036854775807L;
            } else {
                this.C1 = -9223372036854775807L;
            }
        } else {
            this.C1 = -9223372036854775807L;
        }
        if (s0()) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (!this.u1) {
            z9 = false;
        } else {
            z9 = false;
        }
        yx90VarI = this.i1;
        if (yx90VarI.p != z9) {
            yx90VarI = yx90VarI.i(z9);
            this.i1 = yx90VarI;
        }
        this.t1 = false;
        if (!z9) {
            U(j22);
        }
        Trace.endSection();
    }

    public final void i0(flo floVar) {
        this.D1 = floVar;
        bmq0 bmq0Var = this.i1.f43410a;
        pn30 pn30Var = this.q;
        pn30Var.getClass();
        floVar.getClass();
        if (pn30Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < pn30Var.q.size(); i++) {
            ((nn30) pn30Var.q.get(i)).i();
        }
        pn30Var.q = arrayList;
        pn30Var.m = null;
        pn30Var.p();
    }

    public final void j(nn30 nn30Var, int i, boolean z, long j) throws dlo {
        ujf0 ujf0Var = this.f6331a[i];
        boolean zJ = ujf0Var.j();
        j16 j16Var = (j16) ujf0Var.e;
        if (zJ) {
            return;
        }
        boolean z2 = nn30Var == this.q.i;
        ucs0 ucs0Var = nn30Var.o;
        tjf0 tjf0Var = ((tjf0[]) ucs0Var.c)[i];
        fmo fmoVar = ((fmo[]) ucs0Var.d)[i];
        boolean z3 = s0() && this.i1.e == 3;
        boolean z4 = !z && z3;
        this.v1++;
        ixg0 ixg0Var = nn30Var.c[i];
        long j2 = nn30Var.p;
        vn30 vn30Var = nn30Var.g.f25528a;
        j16 j16Var2 = (j16) ujf0Var.f;
        int length = fmoVar != null ? fmoVar.length() : 0;
        androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[length];
        for (int i2 = 0; i2 < length; i2++) {
            fmoVar.getClass();
            bVarArr[i2] = fmoVar.f(i2);
        }
        int i3 = ujf0Var.d;
        cwj cwjVar = this.m;
        if (i3 == 0 || i3 == 2 || i3 == 5) {
            ujf0Var.f35776a = true;
            x0x.K(j16Var.h == 0);
            j16Var.d = tjf0Var;
            j16Var.q = vn30Var;
            j16Var.h = (byte) 1;
            j16Var.q(z4, z2);
            j16Var.A(bVarArr, ixg0Var, j, j2, vn30Var);
            j16Var.B(j, z4, true);
            cwjVar.f(j16Var);
        } else {
            ujf0Var.b = true;
            j16Var2.getClass();
            x0x.K(j16Var2.h == 0);
            j16Var2.d = tjf0Var;
            j16Var2.q = vn30Var;
            j16Var2.h = (byte) 1;
            j16Var2.q(z4, z2);
            j16Var2.A(bVarArr, ixg0Var, j, j2, vn30Var);
            j16Var2.B(j, z4, true);
            cwjVar.f(j16Var2);
        }
        ylo yloVar = new ylo(this);
        j16 j16VarD = ujf0Var.d(nn30Var);
        j16VarD.getClass();
        j16VarD.c(11, yloVar);
        if (z3 && z2) {
            ujf0Var.p();
        }
    }

    public final void j0(int i) throws dlo {
        this.q1 = i;
        bmq0 bmq0Var = this.i1.f43410a;
        pn30 pn30Var = this.q;
        pn30Var.g = i;
        int iW = pn30Var.w(bmq0Var);
        if ((iW & 1) != 0) {
            V(true);
        } else if ((iW & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void k(boolean[] zArr, long j) throws dlo {
        ujf0[] ujf0VarArr;
        dmo dmoVar;
        long j2;
        x0x.K(!z());
        nn30 nn30VarD = this.q.d();
        ucs0 ucs0Var = nn30VarD.o;
        int i = 0;
        while (true) {
            ujf0VarArr = this.f6331a;
            if (i >= ujf0VarArr.length) {
                break;
            }
            if (!ucs0Var.p(i)) {
                ujf0VarArr[i].n();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < ujf0VarArr.length) {
            if (!ucs0Var.p(i2) || ujf0VarArr[i2].i(nn30VarD)) {
                dmoVar = this;
                j2 = j;
            } else {
                dmoVar = this;
                j2 = j;
                dmoVar.j(nn30VarD, i2, zArr[i2], j2);
            }
            i2++;
            this = dmoVar;
            j = j2;
        }
    }

    public final void k0(boolean z) throws Throwable {
        if (!z) {
            cmo cmoVar = this.g1;
            q9o0 q9o0Var = this.g;
            if (cmoVar != null && this.f1 && !q9o0Var.f28360a.hasMessages(37)) {
                this.h1++;
            }
            int i = this.h1;
            if (i > 0) {
                this.x.e(new ccf(this, i));
            }
            this.h1 = 0;
            this.f1 = false;
            q9o0Var.g(37);
            cmo cmoVar2 = this.g1;
            if (cmoVar2 != null) {
                W(cmoVar2);
                this.g1 = null;
                this.f1 = false;
            }
        }
        this.Z = z;
        c();
    }

    public final long l(bmq0 bmq0Var, Object obj, long j) {
        amq0 amq0Var = this.k;
        int i = bmq0Var.g(obj, amq0Var).c;
        Timeline$Window timeline$Window = this.j;
        bmq0Var.n(i, timeline$Window);
        if (timeline$Window.e == -9223372036854775807L || !timeline$Window.a() || !timeline$Window.h) {
            return -9223372036854775807L;
        }
        long j2 = timeline$Window.f;
        return vtt0.M((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - timeline$Window.e) - (j + amq0Var.e);
    }

    public final void l0(uch0 uch0Var) {
        this.Y = uch0Var;
        c();
    }

    public final Pair m(bmq0 bmq0Var) {
        long j = 0;
        if (bmq0Var.p()) {
            return Pair.create(yx90.u, 0L);
        }
        int iA = bmq0Var.a(this.r1);
        Pair pairI = bmq0Var.i(this.j, this.k, iA, -9223372036854775807L);
        vn30 vn30VarU = this.q.u(this.i1, bmq0Var, pairI.first, 0L, true, false);
        long jLongValue = ((Long) pairI.second).longValue();
        if (vn30VarU.c()) {
            Object obj = vn30VarU.f37698a;
            amq0 amq0Var = this.k;
            bmq0Var.g(obj, amq0Var);
            if (vn30VarU.c == amq0Var.e(vn30VarU.b)) {
                uo uoVar = uo.c;
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(vn30VarU, Long.valueOf(j));
    }

    public final void m0(boolean z) throws dlo {
        this.r1 = z;
        bmq0 bmq0Var = this.i1.f43410a;
        pn30 pn30Var = this.q;
        pn30Var.h = z;
        int iW = pn30Var.w(bmq0Var);
        if ((iW & 1) != 0) {
            V(true);
        } else if ((iW & 2) != 0) {
            g();
        }
        t(false);
    }

    public final long n(nn30 nn30Var, int i) {
        if (nn30Var == null) {
            return 0L;
        }
        if (nn30Var.e) {
            ujf0[] ujf0VarArr = this.f6331a;
            if (ujf0VarArr[i].i(nn30Var)) {
                j16 j16VarD = ujf0VarArr[i].d(nn30Var);
                Objects.requireNonNull(j16VarD);
                return j16VarD.m;
            }
        }
        return nn30Var.p;
    }

    public final void n0(itj0 itj0Var) throws Throwable {
        this.j1.c(1);
        jo30 jo30Var = this.r;
        int size = jo30Var.c.size();
        if (itj0Var.b.length != size) {
            itj0Var = new itj0(new Random(itj0Var.f15356a.nextLong())).a(size);
        }
        jo30Var.k = itj0Var;
        u(jo30Var.b(), false);
    }

    public final long o(long j) {
        nn30 nn30Var = this.q.l;
        if (nn30Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.x1 - nn30Var.p));
    }

    public final void o0(int i) {
        yx90 yx90VarI = this.i1;
        if (yx90VarI.e != i) {
            if (i != 2) {
                this.C1 = -9223372036854775807L;
            }
            if (i != 3 && yx90VarI.p) {
                yx90VarI = yx90VarI.i(false);
                this.i1 = yx90VarI;
            }
            this.i1 = yx90VarI.h(i);
        }
    }

    public final void p(int i) {
        yx90 yx90Var = this.i1;
        A0(i, yx90Var.n, yx90Var.m, yx90Var.l);
    }

    public final void p0(seu0 seu0Var) {
        for (ujf0 ujf0Var : this.f6331a) {
            j16 j16Var = (j16) ujf0Var.e;
            byte b = j16Var.b;
            if (b == 2 || b == 4) {
                j16Var.c(7, seu0Var);
                j16 j16Var2 = (j16) ujf0Var.f;
                if (j16Var2 != null) {
                    j16Var2.c(7, seu0Var);
                }
            }
        }
    }

    public final void q() {
        r0(this.G1);
    }

    public final void q0(Object obj, brd brdVar) {
        for (ujf0 ujf0Var : this.f6331a) {
            j16 j16Var = (j16) ujf0Var.e;
            if (j16Var.b == 2) {
                int i = ujf0Var.d;
                if (i == 5 || i == 3 || i == 1) {
                    j16 j16Var2 = (j16) ujf0Var.f;
                    j16Var2.getClass();
                    j16Var2.c(1, obj);
                } else {
                    j16Var.c(1, obj);
                }
            }
        }
        int i2 = this.i1.e;
        if (i2 == 3 || i2 == 2) {
            this.g.h(2);
        }
        if (brdVar != null) {
            brdVar.c();
        }
    }

    public final void r(mn30 mn30Var) {
        pn30 pn30Var = this.q;
        nn30 nn30Var = pn30Var.l;
        if (nn30Var != null && nn30Var.f23800a == mn30Var) {
            pn30Var.r(this.x1);
            C();
            return;
        }
        nn30 nn30Var2 = pn30Var.m;
        if (nn30Var2 == null || nn30Var2.f23800a != mn30Var) {
            return;
        }
        D();
    }

    public final void r0(float f) {
        this.G1 = f;
        float f2 = f * this.z.g;
        for (ujf0 ujf0Var : this.f6331a) {
            j16 j16Var = (j16) ujf0Var.e;
            if (j16Var.b == 1) {
                j16Var.c(2, Float.valueOf(f2));
                j16 j16Var2 = (j16) ujf0Var.f;
                if (j16Var2 != null) {
                    j16Var2.c(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void s(IOException iOException, int i) {
        dlo dloVar = new dlo(0, iOException, i);
        nn30 nn30Var = this.q.i;
        if (nn30Var != null) {
            dloVar = dloVar.a(nn30Var.g.f25528a);
        }
        f1t0.R("ExoPlayerImplInternal", "Playback error", dloVar);
        v0(false, false);
        this.i1 = this.i1.f(dloVar);
    }

    public final boolean s0() {
        yx90 yx90Var = this.i1;
        return yx90Var.l && yx90Var.n == 0;
    }

    public final void t(boolean z) {
        nn30 nn30Var = this.q.l;
        vn30 vn30Var = nn30Var == null ? this.i1.b : nn30Var.g.f25528a;
        boolean zEquals = this.i1.k.equals(vn30Var);
        if (!zEquals) {
            this.i1 = this.i1.c(vn30Var);
        }
        yx90 yx90Var = this.i1;
        yx90Var.q = nn30Var == null ? yx90Var.s : nn30Var.d();
        yx90 yx90Var2 = this.i1;
        yx90Var2.r = o(yx90Var2.q);
        if ((!zEquals || z) && nn30Var != null && nn30Var.e) {
            y0(nn30Var.g.f25528a, nn30Var.o);
        }
    }

    public final boolean t0(bmq0 bmq0Var, vn30 vn30Var) {
        if (vn30Var.c() || bmq0Var.p()) {
            return false;
        }
        int i = bmq0Var.g(vn30Var.f37698a, this.k).c;
        Timeline$Window timeline$Window = this.j;
        bmq0Var.n(i, timeline$Window);
        return timeline$Window.a() && timeline$Window.h && timeline$Window.e != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:158:0x0311 A[PHI: r7
  0x0311: PHI (r7v13 ??) = (r7v39 ??), (r7v40 ??), (r7v41 ??) binds: [B:150:0x02eb, B:152:0x02ef, B:156:0x030c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:237:0x042a  */
    /* JADX WARN: Code duplicated, block: B:238:0x042c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0445  */
    /* JADX WARN: Code duplicated, block: B:245:0x044b  */
    /* JADX WARN: Code duplicated, block: B:246:0x044e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0475  */
    /* JADX WARN: Code duplicated, block: B:255:0x048c  */
    /* JADX WARN: Code duplicated, block: B:256:0x048e  */
    /* JADX WARN: Code duplicated, block: B:259:0x049b  */
    /* JADX WARN: Code duplicated, block: B:261:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:263:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:264:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:268:0x04d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [a.bmq0] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r2v17, types: [a.bmq0] */
    /* JADX WARN: Type inference failed for: r2v22, types: [a.yx90] */
    /* JADX WARN: Type inference failed for: r44v0, types: [a.dmo] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(bmq0 bmq0Var, boolean z) throws Throwable {
        vn30 vn30Var;
        long j;
        bmq0 bmq0Var2;
        Timeline$Window timeline$Window;
        int iA;
        long j2;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA2;
        boolean z5;
        long j3;
        bmq0 bmq0Var3;
        long jMin;
        long j4;
        int i2;
        ?? r7;
        bmo bmoVar;
        int i3;
        long jLongValue;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ?? r13;
        vn30 vn30Var2;
        ?? r14;
        long j5;
        vn30 vn30Var3;
        boolean z10;
        long j6;
        ujf0[] ujf0VarArr;
        pn30 pn30Var;
        long j7;
        vn30 vn30Var4;
        boolean z11;
        long j8;
        long j9;
        yx90 yx90Var = this.i1;
        cmo cmoVar = this.w1;
        pn30 pn30Var2 = this.q;
        int i4 = this.q1;
        boolean z12 = this.r1;
        Timeline$Window timeline$Window2 = this.j;
        amq0 amq0Var = this.k;
        boolean z13 = this.A;
        if (bmq0Var.p()) {
            vn30 vn30Var5 = yx90.u;
            boolean z14 = (vn30Var5.equals(yx90Var.b) && yx90Var.s == 0) ? false : true;
            bmq0Var3 = bmq0Var;
            bmoVar = new bmo(vn30Var5, 0L, -9223372036854775807L, false, true, false, z14, z14 && z && !yx90Var.f43410a.p() && !yx90Var.f43410a.g(yx90Var.b.f37698a, amq0Var).f, 4);
        } else {
            vn30 vn30Var6 = yx90Var.b;
            Object obj = vn30Var6.f37698a;
            bmq0 bmq0Var4 = yx90Var.f43410a;
            boolean z15 = bmq0Var4.p() || bmq0Var4.g(vn30Var6.f37698a, amq0Var).f;
            long jLongValue2 = (yx90Var.b.c() || z15) ? yx90Var.c : yx90Var.s;
            if (cmoVar != null) {
                vn30Var = vn30Var6;
                j = 1;
                bmq0Var2 = bmq0Var;
                Pair pairS = S(bmq0Var2, cmoVar, true, i4, z12, timeline$Window2, amq0Var);
                if (pairS == null) {
                    iA = bmq0Var2.a(z12);
                    jLongValue = jLongValue2;
                    z9 = true;
                    z8 = false;
                    z7 = false;
                } else {
                    long j10 = cmoVar.c;
                    Object obj2 = pairS.first;
                    if (j10 == -9223372036854775807L) {
                        iA = bmq0Var2.g(obj2, amq0Var).c;
                        jLongValue = jLongValue2;
                        z6 = false;
                    } else {
                        jLongValue = ((Long) pairS.second).longValue();
                        obj = obj2;
                        iA = -1;
                        z6 = true;
                    }
                    z7 = yx90Var.e == 4;
                    z8 = z6;
                    z9 = false;
                }
                z3 = z9;
                z4 = z8;
                z2 = z7;
                i = -1;
                long j11 = jLongValue;
                timeline$Window = timeline$Window2;
                jLongValue2 = j11;
            } else {
                vn30Var = vn30Var6;
                j = 1;
                bmq0Var2 = bmq0Var;
                if (yx90Var.f43410a.p()) {
                    iA = bmq0Var2.a(z12);
                    timeline$Window = timeline$Window2;
                } else if (bmq0Var2.b(obj) == -1) {
                    int iT = T(timeline$Window2, amq0Var, i4, z12, obj, yx90Var.f43410a, bmq0Var2);
                    timeline$Window = timeline$Window2;
                    bmq0Var2 = bmq0Var2;
                    amq0Var = amq0Var;
                    if (iT == -1) {
                        iA2 = bmq0Var2.a(z12);
                        z5 = true;
                    } else {
                        iA2 = iT;
                        z5 = false;
                    }
                    z3 = z5;
                    obj = obj;
                    iA = iA2;
                    jLongValue2 = jLongValue2;
                    i = -1;
                    z2 = false;
                    z4 = false;
                } else {
                    timeline$Window = timeline$Window2;
                    if (jLongValue2 == -9223372036854775807L) {
                        int i5 = bmq0Var2.g(obj, amq0Var).c;
                        obj = obj;
                        iA = i5;
                    } else if (z15) {
                        yx90Var.f43410a.g(vn30Var.f37698a, amq0Var);
                        if (yx90Var.f43410a.m(amq0Var.c, timeline$Window, 0L).m == yx90Var.f43410a.b(vn30Var.f37698a)) {
                            Pair pairI = bmq0Var2.i(timeline$Window, amq0Var, bmq0Var2.g(obj, amq0Var).c, jLongValue2 + amq0Var.e);
                            obj = pairI.first;
                            j2 = ((Long) pairI.second).longValue();
                        } else if (bmq0Var2.g(obj, amq0Var).d != -9223372036854775807L) {
                            j2 = vtt0.j(jLongValue2, 0L, amq0Var.d - 1);
                            obj = obj;
                        } else {
                            obj = obj;
                            j2 = jLongValue2;
                        }
                        jLongValue2 = j2;
                        iA = -1;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        obj = obj;
                        iA = -1;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                i = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (iA != i) {
                Pair pairI2 = bmq0Var2.i(timeline$Window, amq0Var, iA, -9223372036854775807L);
                obj = pairI2.first;
                jLongValue2 = ((Long) pairI2.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                j3 = jLongValue2;
            }
            Object obj3 = obj;
            vn30 vn30VarU = pn30Var2.u(yx90Var, bmq0Var, obj3, jLongValue2, z13, z15);
            bmq0Var3 = bmq0Var;
            int i6 = vn30VarU.e;
            boolean z16 = i6 == i || ((i3 = vn30Var.e) != i && i6 >= i3);
            boolean zEquals = vn30Var.f37698a.equals(obj3);
            boolean z17 = zEquals && !vn30Var.c() && !vn30VarU.c() && z16;
            if (!z15 && jLongValue2 == j3) {
                Object obj4 = vn30Var.f37698a;
                int i7 = vn30Var.b;
                if (obj4.equals(vn30VarU.f37698a)) {
                    bmq0Var3.g(vn30VarU.f37698a, amq0Var);
                    if (vn30Var.c()) {
                        amq0Var.g(i7);
                    }
                    if (vn30VarU.c()) {
                        amq0Var.g(vn30VarU.b);
                    }
                }
            }
            if (z17) {
                vn30VarU = vn30Var;
            }
            if (vn30VarU.c()) {
                if (vn30VarU.equals(vn30Var)) {
                    j4 = j3;
                    jMin = yx90Var.s;
                } else {
                    bmq0Var3.g(vn30VarU.f37698a, amq0Var);
                    if (vn30VarU.c == amq0Var.e(vn30VarU.b)) {
                        uo uoVar = uo.c;
                    }
                    j4 = j3;
                    jMin = 0;
                }
            } else if (zEquals && vn30Var.c()) {
                bmq0Var3.g(obj3, amq0Var).getClass();
                so soVarA = uo.c.a(vn30Var.b);
                soVarA.getClass();
                long j12 = yx90Var.c;
                if (j12 == -9223372036854775807L || 0 > j12) {
                    int i8 = soVarA.f32518a;
                    int i9 = vn30Var.c;
                    if (i8 <= i9 || soVarA.d[i9] != 2) {
                        jMin = jLongValue2;
                        j4 = j3;
                    } else {
                        long j13 = bmq0Var3.g(obj3, amq0Var).d;
                        jMin = j13 != -9223372036854775807L ? Math.min(j13 - j, jLongValue2) : jLongValue2;
                        j4 = jMin;
                    }
                } else {
                    jMin = jLongValue2;
                    j4 = j3;
                }
            } else {
                jMin = jLongValue2;
                j4 = j3;
            }
            boolean z18 = (vn30VarU.equals(yx90Var.b) && jMin == yx90Var.s) ? false : true;
            int i10 = bmq0Var3.b(yx90Var.b.f37698a) == -1 ? 4 : 3;
            Object obj5 = vn30VarU.f37698a;
            Object obj6 = yx90Var.b.f37698a;
            boolean zEquals2 = obj5.equals(obj6);
            ?? r8 = obj6;
            if (zEquals2) {
                r8 = obj6;
                if (vn30VarU.b != -1) {
                    bmq0Var3.g(vn30VarU.f37698a, amq0Var).getClass();
                    so soVarA2 = uo.c.a(vn30VarU.b);
                    int i11 = vn30VarU.c;
                    int[] iArr = soVarA2.d;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        r8 = i11;
                        if (i12 == 2) {
                            i2 = i10;
                            r7 = r8;
                        }
                    }
                    i2 = 0;
                    r7 = i11;
                } else {
                    i2 = i10;
                    r7 = r8;
                }
            } else {
                i2 = i10;
                r7 = r8;
            }
            bmoVar = new bmo(vn30VarU, jMin, j4, z2, z3, z4, z18, z18 && z && !yx90Var.f43410a.p() && !yx90Var.f43410a.g(yx90Var.b.f37698a, amq0Var).f, i2);
        }
        vn30 vn30Var7 = bmoVar.f2844a;
        long jX = bmoVar.b;
        try {
            if (bmoVar.e) {
                if (this.i1.e != 1) {
                    o0(4);
                }
                O(false, false, false, true);
            }
            ujf0[] ujf0VarArr2 = this.f6331a;
            int length = ujf0VarArr2.length;
            int i13 = 0;
            ?? r9 = r7;
            while (i13 < length) {
                ujf0 ujf0Var = ujf0VarArr2[i13];
                j16 j16Var = (j16) ujf0Var.e;
                boolean zEquals3 = j16Var.p.equals(bmq0Var3);
                if (!zEquals3) {
                    j16Var.p = bmq0Var3;
                    j16Var.G();
                    j16Var.x();
                }
                j16 j16Var2 = (j16) ujf0Var.f;
                if (j16Var2 != null && !j16Var2.p.equals(bmq0Var3)) {
                    j16Var2.p = bmq0Var3;
                    j16Var2.G();
                    j16Var2.x();
                }
                i13++;
                r9 = zEquals3;
            }
            try {
                if (bmoVar.g) {
                    bmq0 bmq0Var5 = bmq0Var3;
                    if (!bmq0Var5.p()) {
                        try {
                            for (nn30 nn30Var = this.q.i; nn30Var != null; nn30Var = nn30Var.m) {
                                if (nn30Var.g.f25528a.equals(vn30Var7)) {
                                    nn30Var.g = this.q.l(bmq0Var5, nn30Var.g);
                                }
                            }
                            vn30Var2 = vn30Var7;
                            try {
                                jX = X(vn30Var2, jX, z(), bmoVar.d);
                            } catch (Throwable th) {
                                th = th;
                                jX = jX;
                                r14 = bmq0Var5;
                                yx90 yx90Var2 = this.i1;
                                bmq0 bmq0Var6 = yx90Var2.f43410a;
                                vn30 vn30Var8 = yx90Var2.b;
                                if (bmoVar.f) {
                                    j5 = jX;
                                } else {
                                    j5 = -9223372036854775807L;
                                }
                                vn30Var3 = vn30Var2;
                                C0(r14, vn30Var3, bmq0Var6, vn30Var8, j5, false);
                                if (bmoVar.g) {
                                    long j14 = bmoVar.c;
                                    z10 = bmoVar.h;
                                    if (z10) {
                                        j6 = jX;
                                    } else {
                                        j6 = this.i1.d;
                                    }
                                    this.i1 = x(vn30Var3, jX, j14, j6, z10, bmoVar.i);
                                } else {
                                    long j15 = bmoVar.c;
                                    z10 = bmoVar.h;
                                    if (z10) {
                                        j6 = jX;
                                    } else {
                                        j6 = this.i1.d;
                                    }
                                    this.i1 = x(vn30Var3, jX, j15, j6, z10, bmoVar.i);
                                }
                                P();
                                R(r14, this.i1.f43410a);
                                this.i1 = this.i1.j(r14);
                                if (!r14.p()) {
                                    this.w1 = null;
                                }
                                t(false);
                                this.g.h(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            vn30Var2 = vn30Var7;
                        }
                    }
                    yx90 yx90Var3 = this.i1;
                    bmq0 bmq0Var7 = yx90Var3.f43410a;
                    vn30 vn30Var9 = yx90Var3.b;
                    if (bmoVar.f) {
                        j7 = jX;
                    } else {
                        j7 = -9223372036854775807L;
                    }
                    vn30Var4 = vn30Var2;
                    C0(bmq0Var, vn30Var4, bmq0Var7, vn30Var9, j7, false);
                    if (bmoVar.g || bmoVar.c != this.i1.c) {
                        long j16 = bmoVar.c;
                        z11 = bmoVar.h;
                        if (z11) {
                            j9 = jX;
                            j8 = j9;
                        } else {
                            j8 = this.i1.d;
                            j9 = jX;
                        }
                        this.i1 = x(vn30Var4, j9, j16, j8, z11, bmoVar.i);
                    }
                    P();
                    R(bmq0Var, this.i1.f43410a);
                    this.i1 = this.i1.j(bmq0Var);
                    if (!bmq0Var.p()) {
                        this.w1 = null;
                    }
                    t(false);
                    this.g.h(2);
                }
                try {
                    long[] jArr = new long[this.f6331a.length];
                    int i14 = 0;
                    while (true) {
                        ujf0VarArr = this.f6331a;
                        if (i14 >= ujf0VarArr.length) {
                            break;
                        }
                        jArr[i14] = n(this.q.j[i14], i14);
                        i14++;
                    }
                    long[] jArr2 = new long[ujf0VarArr.length];
                    int i15 = 0;
                    while (true) {
                        int length2 = this.f6331a.length;
                        pn30Var = this.q;
                        if (i15 >= length2) {
                            break;
                        }
                        jArr2[i15] = n(pn30Var.k[i15], i15);
                        i15++;
                        vn30Var2 = vn30Var7;
                        r14 = r13;
                        yx90 yx90Var4 = this.i1;
                        bmq0 bmq0Var8 = yx90Var4.f43410a;
                        vn30 vn30Var10 = yx90Var4.b;
                        if (bmoVar.f) {
                            j5 = jX;
                        } else {
                            j5 = -9223372036854775807L;
                        }
                        vn30Var3 = vn30Var2;
                        C0(r14, vn30Var3, bmq0Var8, vn30Var10, j5, false);
                        if (bmoVar.g || bmoVar.c != this.i1.c) {
                            long j17 = bmoVar.c;
                            z10 = bmoVar.h;
                            if (z10) {
                                j6 = jX;
                            } else {
                                j6 = this.i1.d;
                            }
                            this.i1 = x(vn30Var3, jX, j17, j6, z10, bmoVar.i);
                        }
                        P();
                        R(r14, this.i1.f43410a);
                        this.i1 = this.i1.j(r14);
                        if (!r14.p()) {
                            this.w1 = null;
                        }
                        t(false);
                        this.g.h(2);
                        throw th;
                    }
                    int iX = pn30Var.x(bmq0Var3, this.x1, jArr, jArr2);
                    if ((iX & 1) != 0) {
                        V(false);
                    } else if ((iX & 2) != 0) {
                        g();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r9 = bmq0Var3;
                    r13 = r9;
                    vn30Var2 = vn30Var7;
                    r14 = r13;
                    yx90 yx90Var5 = this.i1;
                    bmq0 bmq0Var9 = yx90Var5.f43410a;
                    vn30 vn30Var11 = yx90Var5.b;
                    if (bmoVar.f) {
                        j5 = jX;
                    } else {
                        j5 = -9223372036854775807L;
                    }
                    vn30Var3 = vn30Var2;
                    C0(r14, vn30Var3, bmq0Var9, vn30Var11, j5, false);
                    if (bmoVar.g) {
                        long j18 = bmoVar.c;
                        z10 = bmoVar.h;
                        if (z10) {
                            j6 = jX;
                        } else {
                            j6 = this.i1.d;
                        }
                        this.i1 = x(vn30Var3, jX, j18, j6, z10, bmoVar.i);
                    } else {
                        long j19 = bmoVar.c;
                        z10 = bmoVar.h;
                        if (z10) {
                            j6 = jX;
                        } else {
                            j6 = this.i1.d;
                        }
                        this.i1 = x(vn30Var3, jX, j19, j6, z10, bmoVar.i);
                    }
                    P();
                    R(r14, this.i1.f43410a);
                    this.i1 = this.i1.j(r14);
                    if (!r14.p()) {
                        this.w1 = null;
                    }
                    t(false);
                    this.g.h(2);
                    throw th;
                }
                vn30Var2 = vn30Var7;
                yx90 yx90Var6 = this.i1;
                bmq0 bmq0Var10 = yx90Var6.f43410a;
                vn30 vn30Var12 = yx90Var6.b;
                if (bmoVar.f) {
                    j7 = jX;
                } else {
                    j7 = -9223372036854775807L;
                }
                vn30Var4 = vn30Var2;
                C0(bmq0Var, vn30Var4, bmq0Var10, vn30Var12, j7, false);
                if (bmoVar.g) {
                    long j110 = bmoVar.c;
                    z11 = bmoVar.h;
                    if (z11) {
                        j9 = jX;
                        j8 = j9;
                    } else {
                        j8 = this.i1.d;
                        j9 = jX;
                    }
                    this.i1 = x(vn30Var4, j9, j110, j8, z11, bmoVar.i);
                } else {
                    long j111 = bmoVar.c;
                    z11 = bmoVar.h;
                    if (z11) {
                        j9 = jX;
                        j8 = j9;
                    } else {
                        j8 = this.i1.d;
                        j9 = jX;
                    }
                    this.i1 = x(vn30Var4, j9, j111, j8, z11, bmoVar.i);
                }
                P();
                R(bmq0Var, this.i1.f43410a);
                this.i1 = this.i1.j(bmq0Var);
                if (!bmq0Var.p()) {
                    this.w1 = null;
                }
                t(false);
                this.g.h(2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            r13 = bmq0Var3;
        }
    }

    public final void u0() {
        nn30 nn30Var = this.q.i;
        if (nn30Var == null) {
            return;
        }
        ucs0 ucs0Var = nn30Var.o;
        int i = 0;
        while (true) {
            ujf0[] ujf0VarArr = this.f6331a;
            if (i >= ujf0VarArr.length) {
                return;
            }
            if (ucs0Var.p(i)) {
                ujf0VarArr[i].p();
            }
            i++;
        }
    }

    public final void v(mn30 mn30Var) throws dlo {
        nn30 nn30Var;
        dmo dmoVar;
        pn30 pn30Var = this.q;
        nn30 nn30Var2 = pn30Var.l;
        cwj cwjVar = this.m;
        if (nn30Var2 != null && nn30Var2.f23800a == mn30Var) {
            nn30Var2.getClass();
            if (!nn30Var2.e) {
                float f = cwjVar.d().f45148a;
                yx90 yx90Var = this.i1;
                nn30Var2.f(f, yx90Var.f43410a, yx90Var.l);
            }
            y0(nn30Var2.g.f25528a, nn30Var2.o);
            if (nn30Var2 == pn30Var.i) {
                Q(true, nn30Var2.g.b);
                x0x.K(!z());
                k(new boolean[this.f6331a.length], pn30Var.d().e());
                a0(nn30Var2);
                yx90 yx90Var2 = this.i1;
                vn30 vn30Var = yx90Var2.b;
                long j = nn30Var2.g.b;
                dmoVar = this;
                dmoVar.i1 = x(vn30Var, j, yx90Var2.c, j, false, 5);
            } else {
                dmoVar = this;
            }
            dmoVar.C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= pn30Var.q.size()) {
                nn30Var = null;
                break;
            }
            nn30Var = (nn30) pn30Var.q.get(i);
            if (nn30Var.f23800a == mn30Var) {
                break;
            } else {
                i++;
            }
        }
        if (nn30Var != null) {
            x0x.K(!nn30Var.e);
            float f2 = cwjVar.d().f45148a;
            yx90 yx90Var3 = this.i1;
            nn30Var.f(f2, yx90Var3.f43410a, yx90Var3.l);
            nn30 nn30Var3 = pn30Var.m;
            if (nn30Var3 == null || nn30Var3.f23800a != mn30Var) {
                return;
            }
            D();
        }
    }

    public final void v0(boolean z, boolean z2) {
        O(z || !this.s1, false, true, false);
        this.j1.c(z2 ? 1 : 0);
        xvj xvjVar = this.f;
        ConcurrentHashMap concurrentHashMap = xvjVar.n;
        a4a0 a4a0Var = this.u;
        wvj wvjVar = (wvj) concurrentHashMap.get(a4a0Var);
        if (wvjVar != null) {
            int i = wvjVar.f39839a - 1;
            wvjVar.f39839a = i;
            if (i == 0) {
                concurrentHashMap.remove(a4a0Var);
                xvjVar.c();
            }
        }
        this.z.c(1, this.i1.l);
        o0(1);
    }

    public final void w(zx90 zx90Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.j1.c(1);
            }
            this.i1 = this.i1.g(zx90Var);
        }
        float f2 = zx90Var.f45148a;
        nn30 nn30Var = this.q.i;
        while (true) {
            i = 0;
            if (nn30Var == null) {
                break;
            }
            fmo[] fmoVarArr = (fmo[]) nn30Var.o.d;
            int length = fmoVarArr.length;
            while (i < length) {
                fmo fmoVar = fmoVarArr[i];
                if (fmoVar != null) {
                    fmoVar.i(f2);
                }
                i++;
            }
            nn30Var = nn30Var.m;
        }
        ujf0[] ujf0VarArr = this.f6331a;
        int length2 = ujf0VarArr.length;
        while (i < length2) {
            ujf0 ujf0Var = ujf0VarArr[i];
            float f3 = zx90Var.f45148a;
            ((j16) ujf0Var.e).C(f, f3);
            j16 j16Var = (j16) ujf0Var.f;
            if (j16Var != null) {
                j16Var.C(f, f3);
            }
            i++;
        }
    }

    public final void w0() {
        cwj cwjVar = this.m;
        cwjVar.b = false;
        d4m0 d4m0Var = (d4m0) cwjVar.c;
        if (d4m0Var.b) {
            d4m0Var.c(d4m0Var.e());
            d4m0Var.b = false;
        }
        for (ujf0 ujf0Var : this.f6331a) {
            j16 j16Var = (j16) ujf0Var.f;
            j16 j16Var2 = (j16) ujf0Var.e;
            if (ujf0.k(j16Var2)) {
                ujf0.b(j16Var2);
            }
            if (j16Var != null && j16Var.h != 0) {
                ujf0.b(j16Var);
            }
        }
    }

    public final yx90 x(vn30 vn30Var, long j, long j2, long j3, boolean z, int i) {
        rcf0 rcf0VarG;
        nn30 nn30Var;
        boolean z2;
        this.A1 = (!this.A1 && j == this.i1.s && vn30Var.equals(this.i1.b)) ? false : true;
        P();
        yx90 yx90Var = this.i1;
        dcs0 dcs0Var = yx90Var.h;
        ucs0 ucs0Var = yx90Var.i;
        List list = yx90Var.j;
        if (this.r.l) {
            nn30 nn30Var2 = this.q.i;
            dcs0Var = nn30Var2 == null ? dcs0.d : nn30Var2.n;
            ucs0Var = nn30Var2 == null ? this.e : nn30Var2.o;
            fmo[] fmoVarArr = (fmo[]) ucs0Var.d;
            u3x u3xVar = new u3x(4);
            boolean z3 = false;
            for (fmo fmoVar : fmoVarArr) {
                if (fmoVar != null) {
                    ed40 ed40Var = fmoVar.f(0).m;
                    if (ed40Var == null) {
                        u3xVar.b(new ed40(new cd40[0]));
                    } else {
                        u3xVar.b(ed40Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                rcf0VarG = u3xVar.g();
            } else {
                v3x v3xVar = b4x.b;
                rcf0VarG = rcf0.e;
            }
            list = rcf0VarG;
            if (nn30Var2 != null) {
                on30 on30Var = nn30Var2.g;
                if (on30Var.d != j2) {
                    nn30Var2.g = on30Var.a(j2);
                }
            }
            ujf0[] ujf0VarArr = this.f6331a;
            if (!z() && (nn30Var = this.q.i) != null) {
                ucs0 ucs0Var2 = nn30Var.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= ujf0VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (ucs0Var2.p(i2)) {
                        if (((j16) ujf0VarArr[i2].e).b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((tjf0[]) ucs0Var2.c)[i2].f34046a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.u1) {
                    this.u1 = z5;
                    if (!z5 && this.i1.p) {
                        this.g.h(2);
                    }
                }
            }
        } else if (!vn30Var.equals(yx90Var.b)) {
            dcs0Var = dcs0.d;
            ucs0Var = this.e;
            v3x v3xVar2 = b4x.b;
            list = rcf0.e;
        }
        ucs0 ucs0Var3 = ucs0Var;
        List list2 = list;
        dcs0 dcs0Var2 = dcs0Var;
        if (z) {
            amo amoVar = this.j1;
            if (!amoVar.e || amoVar.c == 5) {
                amoVar.d = true;
                amoVar.e = true;
                amoVar.c = i;
            } else {
                x0x.A(i == 5);
            }
        }
        yx90 yx90Var2 = this.i1;
        return yx90Var2.d(vn30Var, j, j2, j3, o(yx90Var2.q), dcs0Var2, ucs0Var3, list2);
    }

    public final void x0() {
        nn30 nn30Var = this.q.l;
        boolean z = this.p1 || (nn30Var != null && nn30Var.f23800a.e());
        yx90 yx90Var = this.i1;
        if (z != yx90Var.g) {
            this.i1 = yx90Var.b(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    public final void y0(vn30 vn30Var, ucs0 ucs0Var) {
        boolean z;
        nn30 nn30Var = this.q.l;
        nn30Var.getClass();
        o(nn30Var.d());
        if (t0(this.i1.f43410a, nn30Var.g.f25528a)) {
            long j = this.s.h;
        }
        bmq0 bmq0Var = this.i1.f43410a;
        float f = this.m.d().f45148a;
        boolean z2 = this.i1.l;
        fmo[] fmoVarArr = (fmo[]) ucs0Var.d;
        xvj xvjVar = this.f;
        xvjVar.getClass();
        wcf0 wcf0Var = xvjVar.m;
        a4a0 a4a0Var = this.u;
        Integer num = (Integer) wcf0Var.get(a4a0Var.f214a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        wvj wvjVar = (wvj) xvjVar.n.get(a4a0Var);
        wvjVar.getClass();
        if (iIntValue == -1) {
            en30 en30Var = bmq0Var.m(bmq0Var.g(vn30Var.f37698a, xvjVar.b).c, xvjVar.f41562a, 0L).b.b;
            if (en30Var == null) {
                z = false;
            } else {
                String scheme = en30Var.f8073a.getScheme();
                if (TextUtils.isEmpty(scheme) || xvj.p.contains(scheme)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            int length = fmoVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    fmo fmoVar = fmoVarArr[i];
                    if (fmoVar != null) {
                        switch (fmoVar.n().c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = z ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                e9d0.o();
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iIntValue = vtt0.i(i2, 13107200, 210239488);
                }
            }
        }
        wvjVar.c = iIntValue;
        xvjVar.c();
    }

    public final boolean z() {
        for (int i = 0; i < this.f6331a.length; i++) {
            pn30 pn30Var = this.q;
            if (pn30Var.i != pn30Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void z0(int i, int i2, List list) throws Throwable {
        this.j1.c(1);
        jo30 jo30Var = this.r;
        jo30Var.getClass();
        ArrayList arrayList = jo30Var.c;
        x0x.A(i >= 0 && i <= i2 && i2 <= arrayList.size());
        x0x.A(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((io30) arrayList.get(i3)).f15100a.r((MediaItem) list.get(i3 - i));
        }
        u(jo30Var.b(), false);
    }
}
