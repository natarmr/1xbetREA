package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class osj {
    public long A;
    public long B;
    public long C;
    public int D;
    public int E;
    public long F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public float K;
    public ByteBuffer L;
    public int M;
    public ByteBuffer N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public y55 V;
    public AudioDeviceInfo W;
    public int X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25784a;
    public boolean a0;
    public final khf0 b;
    public boolean b0;
    public final wtb c;
    public long c0;
    public final ors0 d;
    public long d0;
    public final ytq0 e;
    public Handler e0;
    public final ytq0 f;
    public final rcf0 g;
    public final ArrayDeque h;
    public byte i;
    public ksj j;
    public final dr8 k;
    public final dr8 l;
    public a4a0 m;
    public yox n;
    public msj o;
    public msj p;
    public p34 q;
    public n44 r;
    public jsj s;
    public l44 t;
    public m24 u;
    public nsj v;
    public nsj w;
    public zx90 x;
    public boolean y;
    public long z;

    public osj(lsj lsjVar) {
        int deviceId;
        Context context = (Context) lsjVar.b;
        this.f25784a = context == null ? null : context.getApplicationContext();
        this.u = m24.b;
        this.b = (khf0) lsjVar.d;
        this.i = (byte) 0;
        this.r = (n44) lsjVar.f;
        wtb wtbVar = new wtb();
        this.c = wtbVar;
        ors0 ors0Var = new ors0();
        ors0Var.m = vtt0.b;
        this.d = ors0Var;
        this.e = new ytq0((byte) 1);
        this.f = new ytq0((byte) 0);
        this.g = b4x.v(ors0Var, wtbVar);
        this.K = 1.0f;
        this.T = 0;
        this.V = new y55();
        zx90 zx90Var = zx90.d;
        this.w = new nsj(zx90Var, 0L, 0L);
        this.x = zx90Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new dr8(this);
        this.l = new dr8(this);
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.X = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    public static int i(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((zvw.U(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = vtt0.f38024a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i6 = (iReverseBytes >>> 19) & 3) == 1 || (i7 = (iReverseBytes >>> 17) & 3) == 0) {
                        i5 = -1;
                    } else {
                        int i14 = (iReverseBytes >>> 12) & 15;
                        int i15 = (iReverseBytes >>> 10) & 3;
                        if (i14 == 0 || i14 == 15 || i15 == 3) {
                            i5 = -1;
                        } else {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        e9d0.o();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                        }
                    }
                    if (i5 != -1) {
                        return i5;
                    }
                    e9d0.o();
                    return 0;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition2;
                            while (true) {
                                if (i16 <= iLimit) {
                                    String str2 = vtt0.f38024a;
                                    int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i8 = i16 - iPosition2;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return b34.p0(new q8b(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            jf4.n(twn.m(i, "Unexpected audio encoding: "));
                            return 0;
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return ay3.f1652a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b5 = byteBuffer.get(iPosition4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b = byteBuffer.get(iPosition4 + 5);
            } else {
                i3 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b = byteBuffer.get(iPosition4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    public final void a(long j) {
        zx90 zx90Var;
        boolean zV = v();
        boolean z = false;
        khf0 khf0Var = this.b;
        if (zV) {
            zx90Var = zx90.d;
        } else {
            if (this.Y || !this.p.f()) {
                zx90Var = zx90.d;
            } else {
                int i = ((androidx.media3.common.b) this.p.c).M;
                zx90Var = this.x;
                zkk0 zkk0Var = (zkk0) khf0Var.d;
                float f = zx90Var.f45148a;
                x0x.A(f > 0.0f);
                if (zkk0Var.b != f) {
                    zkk0Var.b = f;
                    zkk0Var.h = true;
                }
                float f2 = zx90Var.b;
                x0x.A(f2 > 0.0f);
                if (zkk0Var.c != f2) {
                    zkk0Var.c = f2;
                    zkk0Var.h = true;
                }
            }
            this.x = zx90Var;
        }
        zx90 zx90Var2 = zx90Var;
        if (!this.Y && this.p.f()) {
            int i2 = ((androidx.media3.common.b) this.p.c).M;
            z = this.y;
            ((muj0) khf0Var.c).j = z;
        }
        this.y = z;
        this.h.add(new nsj(zx90Var2, Math.max(0L, j), vtt0.R(((k34) this.p.e).b, j())));
        u(j);
        yox yoxVar = this.n;
        if (yoxVar != null) {
            boolean z2 = this.y;
            xex xexVar = ((fm30) yoxVar.f43005a).l2;
            Handler handler = (Handler) xexVar.f40764a;
            if (handler != null) {
                handler.post(new hp2(xexVar, z2, (byte) 1));
            }
        }
    }

    public final l44 b(k34 k34Var) throws b44 {
        try {
            return this.r.a(k34Var);
        } catch (i34 e) {
            b44 b44Var = new b44(k34Var.b, k34Var.c, k34Var.f17601a, k34Var.f, (androidx.media3.common.b) this.p.c, k34Var.e, e);
            yox yoxVar = this.n;
            if (yoxVar == null) {
                throw b44Var;
            }
            yoxVar.s(b44Var);
            throw b44Var;
        }
    }

    public final void c(z34 z34Var) {
        int i;
        p34 p34Var;
        androidx.media3.common.b bVar;
        int iQ;
        if (this.s == null && this.f25784a != null) {
            jsj jsjVar = new jsj(this);
            this.s = jsjVar;
            n44 n44Var = this.r;
            n44Var.f();
            vg00 vg00Var = n44Var.e;
            if (vg00Var == null) {
                vg00Var = new vg00(Thread.currentThread());
                n44Var.e = vg00Var;
            }
            vg00Var.a(jsjVar);
        }
        androidx.media3.common.b bVar2 = z34Var.f43701a;
        String str = bVar2.p;
        int i2 = bVar2.J;
        int i3 = bVar2.M;
        if ("audio/raw".equals(str)) {
            x0x.A(vtt0.I(i3));
            int iQ2 = vtt0.q(i3) * i2;
            u3x u3xVar = new u3x(4);
            u3xVar.c(this.g);
            u3xVar.b(this.e);
            u3xVar.f((u34[]) this.b.b);
            p34 p34Var2 = new p34(u3xVar.g());
            if (p34Var2.equals(this.q)) {
                p34Var2 = this.q;
            }
            int i4 = bVar2.N;
            int i5 = bVar2.O;
            ors0 ors0Var = this.d;
            ors0Var.i = i4;
            ors0Var.j = i5;
            this.c.i = z34Var.b;
            q34 q34Var = new q34(bVar2.L, i2, i3);
            try {
                b4x b4xVar = p34Var2.f26281a;
                if (q34Var.equals(q34.e)) {
                    throw new t34(q34Var);
                }
                for (int i6 = 0; i6 < b4xVar.size(); i6++) {
                    u34 u34Var = (u34) b4xVar.get(i6);
                    q34 q34VarF = u34Var.f(q34Var);
                    if (u34Var.isActive()) {
                        x0x.K(!q34VarF.equals(q34.e));
                        q34Var = q34VarF;
                    }
                }
                int i7 = q34Var.b;
                int i8 = q34Var.c;
                awq awqVarA = bVar2.a();
                awqVarA.L = i8;
                awqVarA.K = q34Var.f28032a;
                awqVarA.I = i7;
                awqVarA.J = i7 == i2 ? bVar2.K : -1;
                androidx.media3.common.b bVar3 = new androidx.media3.common.b(awqVarA);
                i = iQ2;
                p34Var = p34Var2;
                iQ = vtt0.q(i8) * i7;
                bVar = bVar3;
            } catch (t34 e) {
                throw new a44(e, bVar2);
            }
        } else {
            v3x v3xVar = b4x.b;
            i = -1;
            p34Var = new p34(rcf0.e);
            bVar = bVar2;
            iQ = -1;
        }
        g34 g34VarG = g(bVar);
        androidx.media3.common.b bVar4 = g34VarG.f10594a;
        try {
            k34 k34VarC = this.r.c(g34VarG);
            boolean z = k34VarC.e;
            if (k34VarC.f17601a == 0) {
                throw new a44(defpackage.c.d("Invalid output encoding (isOffload=", Separators.RPAREN, z), bVar4);
            }
            if (k34VarC.c == 0) {
                throw new a44(defpackage.c.d("Invalid output channel config (isOffload=", Separators.RPAREN, z), bVar4);
            }
            this.a0 = false;
            bmq0 bmq0Var = z34Var.c;
            vn30 vn30Var = z34Var.d;
            msj msjVar = new msj(bVar2, bVar, i, iQ, k34VarC, p34Var, bmq0Var, vn30Var != null ? vn30Var.f37698a : null);
            if (m()) {
                this.o = msjVar;
            } else {
                this.p = msjVar;
            }
        } catch (f34 e2) {
            throw new a44(e2, bVar2);
        }
    }

    public final void d(long j) throws Exception {
        yox yoxVar;
        ylo yloVar;
        boolean z;
        dr8 dr8Var = this.l;
        if (this.N == null) {
            return;
        }
        boolean z2 = false;
        if (((Exception) dr8Var.c) != null) {
            ((osj) dr8Var.d).r.getClass();
            synchronized (l44.r) {
                z = l44.t > 0;
            }
            if (z || SystemClock.elapsedRealtime() < dr8Var.b) {
                return;
            }
        }
        int iRemaining = this.N.remaining();
        try {
            boolean zD = this.t.d(this.N, this.M, j);
            this.Z = SystemClock.elapsedRealtime();
            dr8Var.c = null;
            dr8Var.f6545a = -9223372036854775807L;
            dr8Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.b0 = false;
                }
                if (this.R && (yoxVar = this.n) != null && !zD && !this.b0 && (yloVar = ((fm30) yoxVar.f43005a).i1) != null) {
                    yloVar.f42854a.t1 = true;
                }
            }
            int iRemaining2 = iRemaining - this.N.remaining();
            if (this.p.f()) {
                this.B += (long) iRemaining2;
            }
            msj msjVar = this.p;
            if (zD) {
                if (!msjVar.f()) {
                    x0x.K(this.N == this.L);
                    this.C = ((((long) this.D) * ((long) this.M)) - this.F) + this.C;
                    this.F = 0L;
                }
                this.N = null;
                return;
            }
            if (msjVar.f() || iRemaining2 <= 0) {
                return;
            }
            x0x.K(this.E > 0);
            long jT = vtt0.T(this.E - this.N.remaining(), ((long) this.M) * ((long) this.D), this.E, RoundingMode.CEILING);
            this.C += jT - this.F;
            this.F = jT;
        } catch (e34 e) {
            boolean z3 = e.b;
            if (z3) {
                if (j() > 0) {
                    z2 = true;
                } else if (this.t.c()) {
                    if (((k34) this.p.e).e) {
                        this.a0 = true;
                    }
                    z2 = true;
                }
            }
            d44 d44Var = new d44(e.f7117a, (androidx.media3.common.b) this.p.c, z2);
            yox yoxVar2 = this.n;
            if (yoxVar2 != null) {
                yoxVar2.s(d44Var);
            }
            if (z3) {
                throw d44Var;
            }
            dr8Var.p(d44Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean e() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.q.c()) {
            d(Long.MIN_VALUE);
            if (this.N == null) {
                return true;
            }
            return false;
        }
        p34 p34Var = this.q;
        if (p34Var.c() && !p34Var.d) {
            p34Var.d = true;
            ((u34) p34Var.b.get(0)).e();
        }
        p(Long.MIN_VALUE);
        if (!this.q.b() || ((byteBuffer = this.N) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (m()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.b0 = false;
            this.D = 0;
            this.E = 0;
            this.F = 0L;
            this.w = new nsj(this.x, 0L, 0L);
            this.I = 0L;
            this.v = null;
            this.h.clear();
            this.L = null;
            this.M = 0;
            this.N = null;
            this.P = false;
            this.O = false;
            this.Q = false;
            this.d.o = 0L;
            u(-9223372036854775807L);
            this.j = null;
            msj msjVar = this.o;
            if (msjVar != null) {
                this.p = msjVar;
                this.o = null;
            }
            l44 l44Var = this.t;
            byte b = 3;
            if (l44Var.e.d.getPlayState() == 3) {
                l44Var.f19386a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && l44Var.c()) {
                oif0 oif0Var = l44Var.h;
                oif0Var.getClass();
                ((l44) oif0Var.d).f19386a.unregisterStreamEventCallback((k44) oif0Var.c);
                ((Handler) oif0Var.b).removeCallbacksAndMessages(null);
            }
            nhf0 nhf0Var = l44Var.d;
            if (nhf0Var != null) {
                AudioTrack audioTrack = (AudioTrack) nhf0Var.f23530a;
                h44 h44Var = (h44) nhf0Var.d;
                h44Var.getClass();
                audioTrack.removeOnRoutingChangedListener(h44Var);
                nhf0Var.d = null;
                l44Var.d = null;
            }
            AudioTrack audioTrack2 = l44Var.f19386a;
            vg00 vg00Var = l44Var.i;
            Handler handlerN = vtt0.n(null);
            synchronized (l44.r) {
                try {
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = l44.s;
                    if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                        scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new stt0((byte) 0));
                        l44.s = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                    }
                    l44.t++;
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new b1(audioTrack2, handlerN, vg00Var, b), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.t = null;
        }
        dr8 dr8Var = this.l;
        dr8Var.c = null;
        dr8Var.f6545a = -9223372036854775807L;
        dr8Var.b = -9223372036854775807L;
        dr8 dr8Var2 = this.k;
        dr8Var2.c = null;
        dr8Var2.f6545a = -9223372036854775807L;
        dr8Var2.b = -9223372036854775807L;
        this.c0 = 0L;
        this.d0 = 0L;
        Handler handler = this.e0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final g34 g(androidx.media3.common.b bVar) {
        g34 g34Var = new g34(bVar);
        g34Var.b = this.u;
        g34Var.d = this.i != 0;
        g34Var.c = this.W;
        g34Var.e = this.T;
        g34Var.g = this.Y;
        g34Var.f = this.X;
        return new g34(g34Var);
    }

    public final int h(androidx.media3.common.b bVar) {
        boolean z;
        if (!vtt0.I(bVar.M) || bVar.M == 2) {
            z = false;
        } else {
            awq awqVarA = bVar.a();
            awqVarA.L = 2;
            bVar = new androidx.media3.common.b(awqVarA);
            z = true;
        }
        int i = this.r.b(g(bVar)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!this.p.f()) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.b;
        return ((j + j2) - 1) / j2;
    }

    public final boolean k() {
        if (!m()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.c() && this.Q) {
            return false;
        }
        long j = j();
        long jA = this.t.a();
        l44 l44Var = this.t;
        l44Var.getClass();
        return j > vtt0.T(jA, (long) l44Var.f19386a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean l() throws b44 {
        int iQ;
        l44 l44VarB;
        dq00 dq00Var;
        boolean z;
        dr8 dr8Var = this.k;
        if (((Exception) dr8Var.c) != null) {
            ((osj) dr8Var.d).r.getClass();
            synchronized (l44.r) {
                z = l44.t > 0;
            }
            if (z || SystemClock.elapsedRealtime() < dr8Var.b) {
                return false;
            }
        }
        try {
            l44VarB = b((k34) this.p.e);
        } catch (b44 e) {
            k34 k34Var = (k34) this.p.e;
            int iMax = k34Var.f;
            boolean zI = vtt0.I(k34Var.f17601a);
            msj msjVar = this.p;
            if (zI) {
                iQ = ((k34) msjVar.e).b * msjVar.b;
            } else {
                int i = ((androidx.media3.common.b) msjVar.c).k;
                if (i != -1) {
                    iQ = i / 8;
                } else {
                    iQ = obc.Q(((k34) msjVar.e).f17601a);
                    if (iQ == -2147483647) {
                        iQ = 1000000;
                    }
                }
            }
            k34 k34Var2 = (k34) this.p.e;
            int iMax2 = Math.max(iQ, AudioTrack.getMinBufferSize(k34Var2.b, k34Var2.c, k34Var2.f17601a));
            int i2 = this.p.b;
            if (i2 == -1) {
                i2 = 1;
            }
            while (true) {
                if (iMax <= iMax2) {
                    if (!((k34) this.p.e).e) {
                        throw e;
                    }
                    this.a0 = true;
                    throw e;
                }
                iMax = Math.max(iMax2, iMax / 2);
                int i3 = iMax % i2;
                if (i3 != 0) {
                    iMax = (i2 - i3) + iMax;
                }
                j34 j34VarA = ((k34) this.p.e).a();
                j34VarA.f = iMax;
                k34 k34Var3 = new k34(j34VarA);
                try {
                    l44 l44VarB2 = b(k34Var3);
                    this.p = this.p.c(k34Var3);
                    l44VarB = l44VarB2;
                    break;
                } catch (b44 e2) {
                    e.addSuppressed(e2);
                }
            }
        }
        this.t = l44VarB;
        ksj ksjVar = new ksj(this, (k34) this.p.e);
        this.j = ksjVar;
        l44VarB.i.a(ksjVar);
        if (this.t.c()) {
            msj msjVar2 = this.p;
            if (((k34) msjVar2.e).k) {
                l44 l44Var = this.t;
                androidx.media3.common.b bVar = (androidx.media3.common.b) msjVar2.c;
                int i4 = bVar.N;
                int i5 = bVar.O;
                if (Build.VERSION.SDK_INT < 29) {
                    l44Var.getClass();
                } else {
                    l44Var.f19386a.setOffloadDelayPadding(i4, i5);
                }
            }
        }
        a4a0 a4a0Var = this.m;
        if (a4a0Var != null) {
            l44 l44Var2 = this.t;
            l44Var2.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                LogSessionId logSessionIdA = a4a0Var.a();
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    l44Var2.f19386a.setLogSessionId(logSessionIdA);
                }
            }
        }
        if (m()) {
            this.t.f19386a.setVolume(this.K);
        }
        this.V.getClass();
        AudioDeviceInfo audioDeviceInfo = this.W;
        if (audioDeviceInfo != null) {
            this.t.f19386a.setPreferredDevice(audioDeviceInfo);
        }
        this.H = true;
        int audioSessionId = this.t.f19386a.getAudioSessionId();
        boolean z2 = audioSessionId != this.T;
        this.T = audioSessionId;
        yox yoxVar = this.n;
        if (yoxVar != null) {
            Object obj = this.p.e;
            rek0 rek0Var = new rek0((byte) 24);
            xex xexVar = ((fm30) yoxVar.f43005a).l2;
            Handler handler = (Handler) xexVar.f40764a;
            if (handler != null) {
                handler.post(new w34(xexVar, (Object) rek0Var, (byte) 9));
            }
            if (z2) {
                this.U = true;
                msj msjVar3 = this.p;
                j34 j34VarA2 = ((k34) msjVar3.e).a();
                j34VarA2.h = this.T;
                this.p = msjVar3.c(new k34(j34VarA2));
                msj msjVar4 = this.o;
                if (msjVar4 != null) {
                    j34 j34VarA3 = ((k34) msjVar4.e).a();
                    j34VarA3.h = this.T;
                    this.o = msjVar4.c(new k34(j34VarA3));
                }
                yox yoxVar2 = this.n;
                int i6 = this.T;
                fm30 fm30Var = (fm30) yoxVar2.f43005a;
                if (Build.VERSION.SDK_INT >= 35 && (dq00Var = fm30Var.n2) != null) {
                    dq00Var.j(i6);
                }
                xex xexVar2 = fm30Var.l2;
                Handler handler2 = (Handler) xexVar2.f40764a;
                if (handler2 != null) {
                    handler2.post(new n23(xexVar2, i6, (byte) 3));
                }
            }
        }
        return true;
    }

    public final boolean m() {
        return this.t != null;
    }

    public final void n() {
        this.R = true;
        if (m()) {
            l44 l44Var = this.t;
            o44 o44Var = l44Var.e;
            if (o44Var.u != -9223372036854775807L) {
                o44Var.b.getClass();
                o44Var.u = vtt0.M(SystemClock.elapsedRealtime());
            }
            o44Var.j = vtt0.R(o44Var.e, o44Var.a());
            o44Var.h.a(0);
            if (!l44Var.j || l44Var.c()) {
                l44Var.f19386a.play();
            }
        }
    }

    public final void o() {
        if (this.P) {
            return;
        }
        this.P = true;
        if (this.t.c()) {
            this.Q = false;
        }
        l44 l44Var = this.t;
        if (l44Var.j) {
            return;
        }
        l44Var.j = true;
        o44 o44Var = l44Var.e;
        long jB = l44Var.b();
        o44Var.w = o44Var.a();
        o44Var.b.getClass();
        o44Var.u = vtt0.M(SystemClock.elapsedRealtime());
        o44Var.x = jB;
        l44Var.f19386a.stop();
        l44Var.o = 0;
    }

    public final void p(long j) throws Exception {
        ByteBuffer byteBuffer;
        d(j);
        if (this.N != null) {
            return;
        }
        if (!this.q.c()) {
            ByteBuffer byteBuffer2 = this.L;
            if (byteBuffer2 != null) {
                t(byteBuffer2);
                d(j);
                return;
            }
            return;
        }
        while (!this.q.b()) {
            do {
                p34 p34Var = this.q;
                if (p34Var.c()) {
                    ByteBuffer byteBuffer3 = p34Var.c[p34Var.a()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        p34Var.d(u34.f34978a);
                        byteBuffer = p34Var.c[p34Var.a()];
                    }
                } else {
                    byteBuffer = u34.f34978a;
                }
                if (byteBuffer.hasRemaining()) {
                    t(byteBuffer);
                    d(j);
                } else {
                    ByteBuffer byteBuffer4 = this.L;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    p34 p34Var2 = this.q;
                    ByteBuffer byteBuffer5 = this.L;
                    if (p34Var2.c() && !p34Var2.d) {
                        p34Var2.d(byteBuffer5);
                    }
                }
            } while (this.N == null);
            return;
        }
    }

    public final void q() {
        msj msjVar = this.p;
        if (msjVar != null) {
            msj msjVar2 = this.o;
            if (msjVar2 != null) {
                this.p = msjVar2;
                this.o = null;
                msjVar = msjVar2;
            }
            try {
                this.p = this.p.c(this.r.c(g((androidx.media3.common.b) msjVar.d)));
            } catch (f34 e) {
                itt0.o(new a44(e, (androidx.media3.common.b) this.p.c));
                return;
            }
        }
        f();
    }

    public final void r() {
        f();
        v3x v3xVarListIterator = this.g.listIterator(0);
        while (v3xVarListIterator.hasNext()) {
            ((u34) v3xVarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        p34 p34Var = this.q;
        if (p34Var != null) {
            b4x b4xVar = p34Var.f26281a;
            for (int i = 0; i < b4xVar.size(); i++) {
                u34 u34Var = (u34) b4xVar.get(i);
                u34Var.c(s34.d);
                u34Var.reset();
            }
            p34Var.b.clear();
            p34Var.c = new ByteBuffer[0];
            q34 q34Var = q34.e;
            p34Var.d = false;
        }
        this.R = false;
        this.a0 = false;
    }

    public final void s() {
        if (m()) {
            l44 l44Var = this.t;
            zx90 zx90Var = this.x;
            AudioTrack audioTrack = l44Var.f19386a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(vtt0.h(zx90Var.f45148a, 0.1f, 8.0f)).setPitch(vtt0.h(zx90Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                f1t0.h0("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            o44 o44Var = l44Var.e;
            o44Var.i = audioTrack.getPlaybackParams().getSpeed();
            o44Var.h.a(0);
            o44Var.e();
            PlaybackParams playbackParams = this.t.f19386a.getPlaybackParams();
            this.x = new zx90(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0245  */
    /* JADX WARN: Code duplicated, block: B:101:0x0252  */
    /* JADX WARN: Code duplicated, block: B:102:0x0269  */
    /* JADX WARN: Code duplicated, block: B:103:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x027e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0286  */
    /* JADX WARN: Code duplicated, block: B:106:0x028d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0296  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1 A[PHI: r9
  0x00c1: PHI (r9v94 double) = (r9v89 double), (r9v101 double) binds: [B:49:0x00f9, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7 A[PHI: r9
  0x00c7: PHI (r9v90 double) = (r9v89 double), (r9v101 double) binds: [B:49:0x00f9, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2 A[PHI: r9
  0x00e2: PHI (r9v65 float) = (r9v60 float), (r9v100 float) binds: [B:59:0x018b, B:44:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8 A[PHI: r9
  0x00e8: PHI (r9v61 float) = (r9v60 float), (r9v100 float) binds: [B:59:0x018b, B:44:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01af  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0209  */
    /* JADX WARN: Code duplicated, block: B:97:0x0212  */
    /* JADX WARN: Code duplicated, block: B:98:0x021a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0232  */
    public final void t(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        float f;
        double d;
        float fH;
        float f2;
        double dMax;
        double d2;
        x0x.K(this.N == null);
        if (byteBuffer.hasRemaining()) {
            if (this.p.f()) {
                int iT = (int) vtt0.T(vtt0.M(20L), ((k34) this.p.e).b, 1000000L, RoundingMode.UP);
                long j = j();
                long j2 = iT;
                if (j >= j2) {
                    byteBufferOrder = byteBuffer;
                } else {
                    msj msjVar = this.p;
                    int i5 = ((k34) msjVar.e).f17601a;
                    int i6 = msjVar.b;
                    int i7 = (int) j;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iT) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = ((byteBuffer.get() & 255) - 128) << 24;
                            } else if (i5 == 4) {
                                fH = vtt0.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fH < 0.0f) {
                                    f2 = (-fH) * (-2.1474836E9f);
                                } else {
                                    f2 = fH * 2.1474836E9f;
                                }
                                i3 = (int) f2;
                            } else if (i5 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i5 != 22) {
                                if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 != 1610612736) {
                                    if (i5 == 1879048192) {
                                        dMax = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                        if (dMax < 0.0d) {
                                            d2 = (-dMax) * (-2.147483648E9d);
                                        } else {
                                            d2 = dMax * 2.147483647E9d;
                                        }
                                    } else if (i5 == 1895825408) {
                                        fH = vtt0.h(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                                        if (fH < 0.0f) {
                                            f2 = (-fH) * (-2.1474836E9f);
                                        } else {
                                            f2 = fH * 2.1474836E9f;
                                        }
                                        i3 = (int) f2;
                                    } else {
                                        if (i5 != 1912602624) {
                                            v4i0.e();
                                            return;
                                        }
                                        dMax = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                        if (dMax < 0.0d) {
                                            d2 = (-dMax) * (-2.147483648E9d);
                                        } else {
                                            d2 = dMax * 2.147483647E9d;
                                        }
                                    }
                                    i3 = (int) d2;
                                } else {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) ((i4 >> 24) + 128));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i5 != 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else if (i5 != 1879048192) {
                                    if (i5 != 1895825408) {
                                        if (i4 < 0) {
                                            f = (-i4) / (-2.1474836E9f);
                                        } else {
                                            f = i4 / 2.1474836E9f;
                                        }
                                        byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                    } else {
                                        if (i5 == 1912602624) {
                                            v4i0.e();
                                            return;
                                        }
                                        if (i4 < 0) {
                                            d = (-i4) / (-2.147483648E9d);
                                        } else {
                                            d = ((double) i4) / 2.147483647E9d;
                                        }
                                        byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                    }
                                } else if (i4 < 0) {
                                    byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) ((i4 >> 24) + 128));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i5 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i5 != 1879048192) {
                                if (i5 != 1895825408) {
                                    if (i4 < 0) {
                                        f = (-i4) / (-2.1474836E9f);
                                    } else {
                                        f = i4 / 2.1474836E9f;
                                    }
                                    byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                } else {
                                    if (i5 == 1912602624) {
                                        v4i0.e();
                                        return;
                                    }
                                    if (i4 < 0) {
                                        d = (-i4) / (-2.147483648E9d);
                                    } else {
                                        d = ((double) i4) / 2.147483647E9d;
                                    }
                                    byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.N = byteBufferOrder;
        }
    }

    public final void u(long j) {
        long j2;
        msj msjVar = this.p;
        this.q = (p34) msjVar.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.J;
            if (((bmq0) msjVar.g) != bmq0.f2849a && msjVar.h != null) {
                amq0 amq0Var = new amq0();
                msj msjVar2 = this.p;
                ((bmq0) msjVar2.g).g(msjVar2.h, amq0Var);
                j2 += amq0Var.e;
            }
        }
        p34 p34Var = this.q;
        r34 r34Var = new r34((byte) 0);
        msj msjVar3 = this.p;
        r34Var.b = (bmq0) msjVar3.g;
        r34Var.c = msjVar3.h;
        r34Var.f29768a = j2;
        s34 s34VarD = r34Var.d();
        b4x b4xVar = p34Var.f26281a;
        ArrayList arrayList = p34Var.b;
        arrayList.clear();
        p34Var.d = false;
        for (int i = 0; i < b4xVar.size(); i++) {
            u34 u34Var = (u34) b4xVar.get(i);
            u34Var.c(s34VarD);
            if (u34Var.isActive()) {
                r34 r34Var2 = new r34();
                long j3 = s34VarD.f31538a;
                r34Var2.f29768a = j3;
                r34Var2.b = s34VarD.b;
                r34Var2.c = s34VarD.c;
                r34Var2.f29768a = u34Var.g(j3);
                s34VarD = r34Var2.d();
                arrayList.add(u34Var);
            }
        }
        p34Var.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= p34Var.a(); i2++) {
            p34Var.c[i2] = ((u34) arrayList.get(i2)).b();
        }
    }

    public final boolean v() {
        msj msjVar = this.p;
        return msjVar != null && ((k34) msjVar.e).j;
    }
}
