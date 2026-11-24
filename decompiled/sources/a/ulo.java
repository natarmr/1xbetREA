package a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline$Window;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ulo implements ExoPlayer, my90 {
    public final nqd A;
    public final short B;
    public final fp C;
    public final tzi D;
    public final oif0 E;
    public final fhj F;
    public final fhj G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public f4x N;
    public final uch0 O;
    public itj0 P;
    public iy90 Q;
    public jn30 R;
    public Object S;
    public Surface T;
    public SurfaceHolder U;
    public qxk0 V;
    public boolean W;
    public TextureView X;
    public final boolean Y;
    public e7k0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline$Window f35882a;
    public final m24 a0;
    public final ucs0 b;
    public float b0;
    public final iy90 c;
    public boolean c0;
    public final brd d;
    public dtf d0;
    public final Context e;
    public final boolean e0;
    public final ulo f;
    public boolean f0;
    public final j16[] g;
    public final int g0;
    public final j16[] h;
    public boolean h0;
    public final syj i;
    public qfu0 i0;
    public final q9o0 j;
    public final short j0;
    public final klo k;
    public final short k0;
    public final dmo l;
    public final short l0;
    public final vg00 m;
    public jn30 m0;
    public final CopyOnWriteArraySet n;
    public yx90 n0;
    public final amq0 o;
    public int o0;
    public final ArrayList p;
    public long p0;
    public final boolean q;
    public final un30 r;
    public final fsj s;
    public final Looper t;
    public final rsj u;
    public final l9o0 v;
    public final qlo w;
    public final rlo x;
    public final o24 y;
    public final m9c z;

    static {
        hn30.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v31, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v34, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int, short] */
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
    public ulo(elo eloVar) {
        elo eloVar2;
        Handler.Callback callback;
        Looper looper = eloVar.i;
        this.f35882a = new Timeline$Window();
        this.d = new brd();
        try {
            f1t0.a0("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + vtt0.f38024a + "]");
            Context context = eloVar.f8010a;
            l9o0 l9o0Var = eloVar.b;
            this.e = context.getApplicationContext();
            eloVar.h.getClass();
            this.s = new fsj(l9o0Var);
            this.g0 = eloVar.j;
            this.a0 = eloVar.k;
            this.Y = eloVar.l;
            this.c0 = false;
            this.B = eloVar.u;
            qlo qloVar = new qlo(this);
            this.w = qloVar;
            this.x = new rlo();
            j16[] j16VarArrA = ((pwj) eloVar.c.get()).a(new Handler(looper), qloVar, qloVar, qloVar, qloVar);
            this.g = j16VarArrA;
            x0x.K(j16VarArrA.length > 0);
            this.h = new j16[j16VarArrA.length];
            int i = 0;
            while (true) {
                j16[] j16VarArr = this.h;
                if (i >= j16VarArr.length) {
                    break;
                }
                byte b = this.g[i].b;
                j16VarArr[i] = null;
                i++;
            }
            syj syjVar = (syj) eloVar.e.get();
            this.i = syjVar;
            this.r = (un30) eloVar.d.get();
            rsj rsjVar = (rsj) eloVar.g.get();
            this.u = rsjVar;
            this.q = eloVar.m;
            gvh0 gvh0Var = eloVar.n;
            this.j0 = eloVar.p;
            this.k0 = eloVar.q;
            this.l0 = eloVar.r;
            this.O = eloVar.o;
            this.t = looper;
            this.v = l9o0Var;
            this.f = this;
            this.m = new vg00(new CopyOnWriteArraySet(), looper, looper.getThread(), l9o0Var, new udk(this, (byte) 14), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.n = copyOnWriteArraySet;
            this.p = new ArrayList();
            this.P = new itj0();
            j16[] j16VarArr2 = this.g;
            ucs0 ucs0Var = new ucs0(new tjf0[j16VarArr2.length], new fmo[j16VarArr2.length], rds0.b, (Object) null);
            this.b = ucs0Var;
            this.o = new amq0();
            hy90 hy90Var = new hy90();
            s88 s88Var = hy90Var.f13849a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int i2 = 0;
            for (int i3 = 20; i2 < i3; i3 = 20) {
                s88Var.b(iArr[i2]);
                i2++;
            }
            hy90Var.a(29, true);
            jjq jjqVarE = s88Var.e();
            this.c = new iy90(jjqVarE);
            s88 s88Var2 = new hy90().f13849a;
            SparseBooleanArray sparseBooleanArray = jjqVarE.f16630a;
            for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
                x0x.D(i4, sparseBooleanArray.size());
                s88Var2.b(sparseBooleanArray.keyAt(i4));
            }
            s88Var2.b(4);
            s88Var2.b(10);
            this.Q = new iy90(s88Var2.e());
            this.j = l9o0Var.a(looper, null);
            klo kloVar = new klo(this);
            this.k = kloVar;
            this.n0 = yx90.k(ucs0Var);
            this.s.O(this, looper);
            a4a0 a4a0Var = new a4a0(eloVar.B);
            Context context2 = this.e;
            j16[] j16VarArr3 = this.g;
            j16[] j16VarArr4 = this.h;
            eloVar.f.getClass();
            dmo dmoVar = new dmo(context2, j16VarArr3, j16VarArr4, syjVar, ucs0Var, new xvj(), rsjVar, this.H, this.I, this.s, gvh0Var, eloVar.s, eloVar.t, eloVar.C, looper, l9o0Var, kloVar, a4a0Var, this.x, eloVar.D);
            q9o0 q9o0Var = dmoVar.g;
            this.l = dmoVar;
            Looper looper2 = dmoVar.i;
            this.b0 = 1.0f;
            this.H = 0;
            jn30 jn30Var = jn30.C;
            this.R = jn30Var;
            this.m0 = jn30Var;
            this.o0 = -1;
            this.d0 = dtf.c;
            this.e0 = true;
            a(this.s);
            Handler handler = new Handler(looper);
            fsj fsjVar = this.s;
            fsjVar.getClass();
            gnw0 gnw0Var = rsjVar.c;
            gnw0Var.getClass();
            CopyOnWriteArrayList<no5> copyOnWriteArrayList = gnw0Var.f11606a;
            for (no5 no5Var : copyOnWriteArrayList) {
                if (no5Var.b == fsjVar) {
                    no5Var.c = true;
                    copyOnWriteArrayList.remove(no5Var);
                }
            }
            copyOnWriteArrayList.add(new no5(handler, fsjVar));
            copyOnWriteArraySet.add(this.w);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31) {
                eloVar2 = eloVar;
                callback = null;
                l9o0Var.a(dmoVar.i, null).e(new olo(this.e, eloVar2.z, this, a4a0Var));
            } else {
                eloVar2 = eloVar;
                callback = null;
            }
            fp fpVar = new fp(0, looper2, looper, l9o0Var, new klo(this));
            this.C = fpVar;
            fpVar.M(new ccf((Object) this, (byte) 19));
            Context context3 = eloVar2.f8010a;
            Looper looper3 = eloVar2.i;
            qlo qloVar2 = this.w;
            o24 o24Var = new o24();
            o24Var.b = context3.getApplicationContext();
            o24Var.d = l9o0Var.a(looper2, callback);
            o24Var.c = new n24(o24Var, l9o0Var.a(looper3, callback), qloVar2);
            this.y = o24Var;
            o24Var.r();
            boolean z = (eloVar2.v == Integer.MAX_VALUE || eloVar2.w == Integer.MAX_VALUE || eloVar2.x == Integer.MAX_VALUE || eloVar2.y == Integer.MAX_VALUE) ? false : true;
            m9c m9cVar = new m9c(context, looper2, l9o0Var);
            this.z = m9cVar;
            if (m9cVar.f21402a != z) {
                m9cVar.f21402a = z;
                m9cVar.e(z, m9cVar.b);
            }
            this.A = new nqd(context, looper2, l9o0Var);
            int i6 = ygk.c;
            this.i0 = qfu0.d;
            this.Z = e7k0.c;
            this.E = i5 >= 34 ? new oif0(this, context) : callback;
            this.F = new fhj();
            this.G = new fhj();
            this.D = new tzi(this, this.w, this.v, eloVar2.v, eloVar2.w, eloVar2.x, eloVar2.y);
            q9o0Var.c(38, this.O).b();
            m24 m24Var = this.a0;
            p9o0 p9o0VarD = q9o0.d();
            p9o0VarD.f26617a = q9o0Var.f28360a.obtainMessage(31, 0, 0, m24Var);
            p9o0VarD.b();
            M(1, 3, this.a0);
            M(2, 4, Integer.valueOf(this.Y ? 1 : 0));
            M(2, 5, 0);
            M(1, 9, Boolean.valueOf(this.c0));
            M(6, 8, this.x);
            M(-1, 16, Integer.valueOf(this.g0));
        } finally {
            this.d.c();
        }
    }

    public static yx90 A(yx90 yx90Var, int i) {
        yx90 yx90VarH = yx90Var.h(i);
        return (i == 1 || i == 4) ? yx90VarH.b(false) : yx90VarH;
    }

    public static long u(yx90 yx90Var) {
        Timeline$Window timeline$Window = new Timeline$Window();
        amq0 amq0Var = new amq0();
        yx90Var.f43410a.g(yx90Var.b.f37698a, amq0Var);
        long j = yx90Var.c;
        return j == -9223372036854775807L ? yx90Var.f43410a.m(amq0Var.c, timeline$Window, 0L).k : amq0Var.e + j;
    }

    public final yx90 B(yx90 yx90Var, bmq0 bmq0Var, Pair pair) {
        List list;
        x0x.A(bmq0Var.p() || pair != null);
        bmq0 bmq0Var2 = yx90Var.f43410a;
        long jG = g(yx90Var);
        yx90 yx90VarJ = yx90Var.j(bmq0Var);
        if (bmq0Var.p()) {
            vn30 vn30Var = yx90.u;
            long jM = vtt0.M(this.p0);
            dcs0 dcs0Var = dcs0.d;
            ucs0 ucs0Var = this.b;
            v3x v3xVar = b4x.b;
            yx90 yx90VarC = yx90VarJ.d(vn30Var, jM, jM, jM, 0L, dcs0Var, ucs0Var, rcf0.e).c(vn30Var);
            yx90VarC.q = yx90VarC.s;
            return yx90VarC;
        }
        Object obj = yx90VarJ.b.f37698a;
        String str = vtt0.f38024a;
        boolean zEquals = obj.equals(pair.first);
        vn30 vn30Var2 = !zEquals ? new vn30(pair.first) : yx90VarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM2 = vtt0.M(jG);
        if (!bmq0Var2.p()) {
            jM2 -= bmq0Var2.g(obj, this.o).e;
            if (zEquals && jM2 - jLongValue == 1 && jM2 == bmq0Var2.g(obj, this.o).d) {
                jM2--;
            }
        }
        if (!zEquals || jLongValue < jM2) {
            vn30 vn30Var3 = vn30Var2;
            x0x.K(!vn30Var3.c());
            dcs0 dcs0Var2 = !zEquals ? dcs0.d : yx90VarJ.h;
            ucs0 ucs0Var2 = !zEquals ? this.b : yx90VarJ.i;
            if (zEquals) {
                list = yx90VarJ.j;
            } else {
                v3x v3xVar2 = b4x.b;
                list = rcf0.e;
            }
            yx90 yx90VarC2 = yx90VarJ.d(vn30Var3, jLongValue, jLongValue, jLongValue, 0L, dcs0Var2, ucs0Var2, list).c(vn30Var3);
            yx90VarC2.q = jLongValue;
            return yx90VarC2;
        }
        if (jLongValue != jM2) {
            vn30 vn30Var4 = vn30Var2;
            x0x.K(!vn30Var4.c());
            long jMax = Math.max(0L, yx90VarJ.r - (jLongValue - jM2));
            long j = yx90VarJ.q;
            if (yx90VarJ.k.equals(yx90VarJ.b)) {
                j = jLongValue + jMax;
            }
            yx90 yx90VarD = yx90VarJ.d(vn30Var4, jLongValue, jLongValue, jLongValue, jMax, yx90VarJ.h, yx90VarJ.i, yx90VarJ.j);
            yx90VarD.q = j;
            return yx90VarD;
        }
        int iB = bmq0Var.b(yx90VarJ.k.f37698a);
        if (iB != -1 && bmq0Var.f(iB, this.o, false).c == bmq0Var.g(vn30Var2.f37698a, this.o).c) {
            return yx90VarJ;
        }
        bmq0Var.g(vn30Var2.f37698a, this.o);
        boolean zC = vn30Var2.c();
        amq0 amq0Var = this.o;
        long jA = zC ? amq0Var.a(vn30Var2.b, vn30Var2.c) : amq0Var.d;
        vn30 vn30Var5 = vn30Var2;
        yx90 yx90VarC3 = yx90VarJ.d(vn30Var5, yx90VarJ.s, yx90VarJ.s, yx90VarJ.d, jA - yx90VarJ.s, yx90VarJ.h, yx90VarJ.i, yx90VarJ.j).c(vn30Var5);
        yx90VarC3.q = jA;
        return yx90VarC3;
    }

    public final Pair C(bmq0 bmq0Var, int i, long j) {
        if (bmq0Var.p()) {
            this.o0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.p0 = j;
            return null;
        }
        if (i == -1 || i >= bmq0Var.o()) {
            i = bmq0Var.a(this.I);
            j = vtt0.Y(bmq0Var.m(i, this.f35882a, 0L).k);
        }
        return bmq0Var.i(this.f35882a, this.o, i, vtt0.M(j));
    }

    public final void D(final int i, final int i2) {
        e7k0 e7k0Var = this.Z;
        if (i == e7k0Var.f7331a && i2 == e7k0Var.b) {
            return;
        }
        this.Z = new e7k0(i, i2);
        this.m.e(24, new sg00() { // from class: a.jlo
            @Override // a.sg00
            public final void invoke(Object obj) {
                ((ky90) obj).q(i, i2);
            }
        });
        M(2, 14, new e7k0(i, i2));
    }

    public final void E() {
        c0();
        yx90 yx90Var = this.n0;
        if (yx90Var.e != 1) {
            return;
        }
        yx90 yx90VarF = yx90Var.f(null);
        yx90 yx90VarA = A(yx90VarF, yx90VarF.f43410a.p() ? 4 : 2);
        this.J++;
        this.l.g.a(29).b();
        a0(yx90VarA, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void F() {
        String str;
        boolean zB;
        Context context;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.11.1] [");
        sb.append(vtt0.f38024a);
        sb.append("] [");
        HashSet hashSet = hn30.f13332a;
        synchronized (hn30.class) {
            str = hn30.b;
        }
        sb.append(str);
        sb.append("]");
        f1t0.a0("ExoPlayerImpl", sb.toString());
        c0();
        this.y.r();
        this.z.f(false);
        this.A.f(false);
        oif0 oif0Var = this.E;
        if (oif0Var != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) oif0Var.b).get()) != null) {
            context.unregisterDeviceIdChangeListener((tlo) oif0Var.c);
        }
        tzi tziVar = this.D;
        ((q9o0) tziVar.g).f();
        ((ulo) tziVar.b).G((bum0) tziVar.c);
        dmo dmoVar = this.l;
        if (dmoVar.k1 || !dmoVar.i.getThread().isAlive()) {
            zB = true;
        } else {
            dmoVar.k1 = true;
            brd brdVar = new brd(dmoVar.o);
            dmoVar.g.c(7, brdVar).b();
            zB = brdVar.b(dmoVar.t);
        }
        if (!zB) {
            this.m.e(10, new udk((byte) 13));
        }
        this.m.d();
        this.j.f();
        rsj rsjVar = this.u;
        fsj fsjVar = this.s;
        CopyOnWriteArrayList<no5> copyOnWriteArrayList = rsjVar.c.f11606a;
        for (no5 no5Var : copyOnWriteArrayList) {
            if (no5Var.b == fsjVar) {
                no5Var.c = true;
                copyOnWriteArrayList.remove(no5Var);
            }
        }
        yx90 yx90VarA = this.n0;
        if (yx90VarA.p) {
            yx90VarA = yx90VarA.a();
            this.n0 = yx90VarA;
        }
        yx90 yx90VarA2 = A(yx90VarA, 1);
        this.n0 = yx90VarA2;
        yx90 yx90VarC = yx90VarA2.c(yx90VarA2.b);
        this.n0 = yx90VarC;
        yx90VarC.q = yx90VarC.s;
        this.n0.r = 0L;
        fsj fsjVar2 = this.s;
        q9o0 q9o0Var = fsjVar2.h;
        q9o0Var.getClass();
        q9o0Var.e(new ccf((Object) fsjVar2, (byte) 4));
        H();
        Surface surface = this.T;
        if (surface != null) {
            surface.release();
            this.T = null;
        }
        this.d0 = dtf.c;
        this.h0 = true;
        if (this.n0.f43410a.p()) {
            return;
        }
        yx90 yx90Var = this.n0;
        boolean z = yx90Var.f43410a.b(yx90Var.b.f37698a) != -1;
        Locale locale = Locale.US;
        yx90 yx90Var2 = this.n0;
        x0x.J(String.format(locale, "periodUid %s not found in timeline %s with size %d", yx90Var2.b.f37698a, yx90Var2.f43410a.getClass().getName(), Integer.valueOf(this.n0.f43410a.o())), z);
    }

    public final void G(ky90 ky90Var) {
        c0();
        ky90Var.getClass();
        vg00 vg00Var = this.m;
        if (vg00Var.i) {
            x0x.K(Thread.currentThread() == vg00Var.f37360a);
        }
        CopyOnWriteArraySet<ug00> copyOnWriteArraySet = vg00Var.d;
        for (ug00 ug00Var : copyOnWriteArraySet) {
            if (ug00Var.f35600a.equals(ky90Var)) {
                tg00 tg00Var = vg00Var.c;
                ug00Var.d = true;
                if (tg00Var != null && ug00Var.c) {
                    ug00Var.c = false;
                    tg00Var.b(ug00Var.f35600a, ug00Var.b.e());
                }
                copyOnWriteArraySet.remove(ug00Var);
            }
        }
    }

    public final void H() {
        qxk0 qxk0Var = this.V;
        qlo qloVar = this.w;
        if (qxk0Var != null) {
            y8a0 y8a0VarE = e(this.x);
            x0x.K(!y8a0VarE.f);
            y8a0VarE.c = (short) 10000;
            x0x.K(!y8a0VarE.f);
            y8a0VarE.d = null;
            y8a0VarE.b();
            this.V.f29488a.remove(qloVar);
            this.V = null;
        }
        TextureView textureView = this.X;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != qloVar) {
                f1t0.g0("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.U;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(qloVar);
            this.U = null;
        }
    }

    public final void I(int i, long j, boolean z) {
        c0();
        if (i == -1) {
            return;
        }
        byte b = 0;
        x0x.A(i >= 0);
        bmq0 bmq0Var = this.n0.f43410a;
        if (bmq0Var.p() || i < bmq0Var.o()) {
            fsj fsjVar = this.s;
            if (!fsjVar.i) {
                ft2 ft2VarI = fsjVar.I();
                fsjVar.i = true;
                fsjVar.N(ft2VarI, -1, new t9f((byte) 19));
            }
            this.J++;
            if (z()) {
                f1t0.g0("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                amo amoVar = new amo(this.n0);
                amoVar.c(1);
                ulo uloVar = this.k.f18500a;
                uloVar.j.e(new llo(uloVar, amoVar, b));
                return;
            }
            yx90 yx90VarH = this.n0;
            int i2 = yx90VarH.e;
            if (i2 == 3 || (i2 == 4 && !bmq0Var.p())) {
                yx90VarH = this.n0.h(2);
            }
            int iJ = j();
            yx90 yx90VarB = B(yx90VarH, bmq0Var, C(bmq0Var, i, j));
            this.l.g.c(3, new cmo(bmq0Var, i, vtt0.M(j))).b();
            a0(yx90VarB, 0, true, 1, m(yx90VarB), iJ, z);
        }
    }

    public final void J(long j) {
        I(j(), j, false);
    }

    public final void K() {
        int iE;
        int iE2;
        if (n().p() || z()) {
            c0();
            return;
        }
        bmq0 bmq0VarN = n();
        if (bmq0VarN.p()) {
            iE = -1;
        } else {
            int iJ = j();
            c0();
            int i = this.H;
            if (i == 1) {
                i = 0;
            }
            c0();
            iE = bmq0VarN.e(iJ, i, this.I);
        }
        if (iE == -1) {
            if (x()) {
                bmq0 bmq0VarN2 = n();
                if (!bmq0VarN2.p() && bmq0VarN2.m(j(), this.f35882a, 0L).h) {
                    I(j(), -9223372036854775807L, false);
                    return;
                }
            }
            c0();
            return;
        }
        bmq0 bmq0VarN3 = n();
        if (bmq0VarN3.p()) {
            iE2 = -1;
        } else {
            int iJ2 = j();
            c0();
            int i2 = this.H;
            if (i2 == 1) {
                i2 = 0;
            }
            c0();
            iE2 = bmq0VarN3.e(iJ2, i2, this.I);
        }
        if (iE2 == -1) {
            c0();
        } else if (iE2 == j()) {
            I(j(), -9223372036854775807L, true);
        } else {
            I(iE2, -9223372036854775807L, false);
        }
    }

    public final void L() {
        int iK;
        int iK2;
        int iK3;
        if (n().p() || z()) {
            c0();
            return;
        }
        bmq0 bmq0VarN = n();
        if (bmq0VarN.p()) {
            iK = -1;
        } else {
            int iJ = j();
            c0();
            int i = this.H;
            if (i == 1) {
                i = 0;
            }
            c0();
            iK = bmq0VarN.k(iJ, i, this.I);
        }
        boolean z = iK != -1;
        if (x()) {
            bmq0 bmq0VarN2 = n();
            if (bmq0VarN2.p() || !bmq0VarN2.m(j(), this.f35882a, 0L).g) {
                if (!z) {
                    c0();
                    return;
                }
                bmq0 bmq0VarN3 = n();
                if (bmq0VarN3.p()) {
                    iK3 = -1;
                } else {
                    int iJ2 = j();
                    c0();
                    int i2 = this.H;
                    if (i2 == 1) {
                        i2 = 0;
                    }
                    c0();
                    iK3 = bmq0VarN3.k(iJ2, i2, this.I);
                }
                if (iK3 == -1) {
                    c0();
                    return;
                } else if (iK3 == j()) {
                    I(j(), -9223372036854775807L, true);
                    return;
                } else {
                    I(iK3, -9223372036854775807L, false);
                    return;
                }
            }
        }
        if (z) {
            long jL = l();
            c0();
            if (jL <= this.l0) {
                bmq0 bmq0VarN4 = n();
                if (bmq0VarN4.p()) {
                    iK2 = -1;
                } else {
                    int iJ3 = j();
                    c0();
                    int i3 = this.H;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    c0();
                    iK2 = bmq0VarN4.k(iJ3, i3, this.I);
                }
                if (iK2 == -1) {
                    c0();
                    return;
                } else if (iK2 == j()) {
                    I(j(), -9223372036854775807L, true);
                    return;
                } else {
                    I(iK2, -9223372036854775807L, false);
                    return;
                }
            }
        }
        J(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(int i, int i2, Object obj) {
        for (j16 j16Var : this.g) {
            if (i == -1 || j16Var.b == i) {
                y8a0 y8a0VarE = e(j16Var);
                x0x.K(!y8a0VarE.f);
                y8a0VarE.c = i2;
                x0x.K(!y8a0VarE.f);
                y8a0VarE.d = obj;
                y8a0VarE.b();
            }
        }
        for (j16 j16Var2 : this.h) {
            if (j16Var2 != null && (i == -1 || j16Var2.b == i)) {
                y8a0 y8a0VarE2 = e(j16Var2);
                x0x.K(!y8a0VarE2.f);
                y8a0VarE2.c = i2;
                x0x.K(!y8a0VarE2.f);
                y8a0VarE2.d = obj;
                y8a0VarE2.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00bf  */
    public final void N(MediaItem mediaItem) {
        rcf0 rcf0VarT = b4x.t(mediaItem);
        c0();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i = 0; i < rcf0VarT.d; i++) {
            arrayList.add(this.r.b((MediaItem) rcf0VarT.get(i)));
        }
        c0();
        p(this.n0);
        l();
        this.J++;
        ArrayList arrayList2 = this.p;
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            io30 io30Var = new io30((e06) arrayList.get(i2), this.q);
            arrayList3.add(io30Var);
            arrayList2.add(i2, new slo(io30Var.b, io30Var.f15100a));
        }
        itj0 itj0Var = this.P;
        int size = arrayList3.size();
        itj0Var.getClass();
        this.P = new itj0(new Random(itj0Var.f15356a.nextLong())).a(size);
        wna0 wna0Var = new wna0(arrayList2, this.P);
        boolean zP = wna0Var.p();
        int i3 = wna0Var.d;
        if (!zP && -1 >= i3) {
            throw new byw();
        }
        int iA = wna0Var.a(this.I);
        yx90 yx90VarB = B(this.n0, wna0Var, C(wna0Var, iA, -9223372036854775807L));
        int i4 = yx90VarB.e;
        if (i4 == 1) {
            i4 = 1;
        } else if (wna0Var.p()) {
            i4 = 4;
        } else if (iA != -1) {
            if (iA >= i3) {
                i4 = 4;
            } else {
                i4 = 2;
            }
        }
        yx90 yx90VarA = A(yx90VarB, i4);
        this.l.g.c(17, new zlo(arrayList3, this.P, iA, vtt0.M(-9223372036854775807L))).b();
        if (!this.n0.b.f37698a.equals(yx90VarA.b.f37698a) && !this.n0.f43410a.p()) {
            z = true;
        }
        a0(yx90VarA, 0, z, 4, m(yx90VarA), -1, false);
    }

    public final void O(SurfaceHolder surfaceHolder) {
        this.W = false;
        this.U = surfaceHolder;
        surfaceHolder.addCallback(this.w);
        Surface surface = this.U.getSurface();
        if (surface == null || !surface.isValid()) {
            D(0, 0);
        } else {
            Rect surfaceFrame = this.U.getSurfaceFrame();
            D(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void P(boolean z) {
        c0();
        Z(1, z);
    }

    public final void Q(int i) {
        c0();
        if (this.H != i) {
            this.H = i;
            this.l.g.b(11, i, 0).b();
            bsj bsjVar = new bsj(i, (byte) 1);
            vg00 vg00Var = this.m;
            vg00Var.c(8, bsjVar);
            Y();
            vg00Var.b();
        }
    }

    public final void R(scs0 scs0Var) {
        scs0 scs0VarA;
        c0();
        syj syjVar = this.i;
        syjVar.getClass();
        scs0 scs0VarV = v();
        if (this.M) {
            this.N = scs0Var.x;
            f4x f4xVar = this.O.f35429a;
            rcs0 rcs0VarA = scs0Var.a();
            eet0 eet0VarJ = f4xVar.iterator();
            while (eet0VarJ.hasNext()) {
                rcs0VarA.i(((Integer) eet0VarJ.next()).intValue(), true);
            }
            scs0VarA = rcs0VarA.a();
        } else {
            scs0VarA = scs0Var;
        }
        if (!scs0VarA.equals(syjVar.e)) {
            syjVar.l(scs0VarA);
        }
        if (scs0VarV.equals(scs0Var)) {
            return;
        }
        this.m.e(19, new z9f(scs0Var, (byte) 19));
    }

    public final void S(Object obj) {
        Object obj2 = this.S;
        boolean zB = true;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        long j = z ? this.B : -9223372036854775807L;
        dmo dmoVar = this.l;
        if (!dmoVar.k1 && dmoVar.i.getThread().isAlive()) {
            brd brdVar = new brd(dmoVar.o);
            dmoVar.g.c(30, new Pair(obj, brdVar)).b();
            if (j != -9223372036854775807L) {
                zB = brdVar.b(j);
            }
        }
        if (z) {
            Object obj3 = this.S;
            Surface surface = this.T;
            if (obj3 == surface) {
                surface.release();
                this.T = null;
            }
        }
        this.S = obj;
        if (zB) {
            return;
        }
        X(new dlo(2, new ss3("Detaching surface timed out."), 1003));
    }

    public final void T(SurfaceView surfaceView) {
        c0();
        if (surfaceView instanceof reu0) {
            H();
            S(surfaceView);
            O(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof qxk0;
        qlo qloVar = this.w;
        if (z) {
            H();
            this.V = (qxk0) surfaceView;
            y8a0 y8a0VarE = e(this.x);
            x0x.K(!y8a0VarE.f);
            y8a0VarE.c = (short) 10000;
            qxk0 qxk0Var = this.V;
            x0x.K(true ^ y8a0VarE.f);
            y8a0VarE.d = qxk0Var;
            y8a0VarE.b();
            this.V.f29488a.add(qloVar);
            S(this.V.getVideoSurface());
            O(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        c0();
        if (holder == null) {
            d();
            return;
        }
        H();
        this.W = true;
        this.U = holder;
        holder.addCallback(qloVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            S(null);
            D(0, 0);
        } else {
            S(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            D(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void U(TextureView textureView) {
        c0();
        if (textureView == null) {
            d();
            return;
        }
        H();
        this.X = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            f1t0.g0("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.w);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            S(null);
            D(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            S(surface);
            this.T = surface;
            D(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void V(float f) {
        c0();
        final float fH = vtt0.h(f, 0.0f, 1.0f);
        if (this.b0 == fH) {
            return;
        }
        this.b0 = fH;
        this.l.g.c(32, Float.valueOf(fH)).b();
        this.m.e(22, new sg00() { // from class: a.ilo
            @Override // a.sg00
            public final void invoke(Object obj) {
                ((ky90) obj).y(fH);
            }
        });
    }

    public final void W() {
        c0();
        X(null);
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        long j = this.n0.s;
        this.d0 = new dtf(rcf0Var);
    }

    public final void X(dlo dloVar) {
        yx90 yx90Var = this.n0;
        yx90 yx90VarC = yx90Var.c(yx90Var.b);
        yx90VarC.q = yx90VarC.s;
        yx90VarC.r = 0L;
        yx90 yx90VarA = A(yx90VarC, 1);
        if (dloVar != null) {
            yx90VarA = yx90VarA.f(dloVar);
        }
        this.J++;
        this.l.g.a(6).b();
        a0(yx90VarA, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void Y() {
        int iK;
        int iE;
        s88 s88Var;
        iy90 iy90Var = this.Q;
        String str = vtt0.f38024a;
        ulo uloVar = this.f;
        boolean z = uloVar.z();
        Timeline$Window timeline$Window = uloVar.f35882a;
        bmq0 bmq0VarN = uloVar.n();
        boolean z2 = !bmq0VarN.p() && bmq0VarN.m(uloVar.j(), timeline$Window, 0L).g;
        bmq0 bmq0VarN2 = uloVar.n();
        if (bmq0VarN2.p()) {
            iK = -1;
        } else {
            int iJ = uloVar.j();
            uloVar.c0();
            int i = uloVar.H;
            if (i == 1) {
                i = 0;
            }
            uloVar.c0();
            iK = bmq0VarN2.k(iJ, i, uloVar.I);
        }
        boolean z3 = iK != -1;
        bmq0 bmq0VarN3 = uloVar.n();
        if (bmq0VarN3.p()) {
            iE = -1;
        } else {
            int iJ2 = uloVar.j();
            uloVar.c0();
            int i2 = uloVar.H;
            if (i2 == 1) {
                i2 = 0;
            }
            uloVar.c0();
            iE = bmq0VarN3.e(iJ2, i2, uloVar.I);
        }
        boolean z4 = iE != -1;
        boolean zX = uloVar.x();
        bmq0 bmq0VarN4 = uloVar.n();
        boolean z5 = !bmq0VarN4.p() && bmq0VarN4.m(uloVar.j(), timeline$Window, 0L).h;
        boolean zP = uloVar.n().p();
        hy90 hy90Var = new hy90();
        SparseBooleanArray sparseBooleanArray = this.c.f15578a.f16630a;
        int i3 = 0;
        while (true) {
            int size = sparseBooleanArray.size();
            s88Var = hy90Var.f13849a;
            if (i3 >= size) {
                break;
            }
            x0x.D(i3, sparseBooleanArray.size());
            s88Var.b(sparseBooleanArray.keyAt(i3));
            i3++;
        }
        boolean z6 = !z;
        hy90Var.a(4, z6);
        hy90Var.a(5, z2 && !z);
        hy90Var.a(6, z3 && !z);
        hy90Var.a(7, !zP && (z3 || !zX || z2) && !z);
        hy90Var.a(8, z4 && !z);
        hy90Var.a(9, !zP && (z4 || (zX && z5)) && !z);
        hy90Var.a(10, z6);
        hy90Var.a(11, z2 && !z);
        hy90Var.a(12, z2 && !z);
        iy90 iy90Var2 = new iy90(s88Var.e());
        this.Q = iy90Var2;
        if (iy90Var2.equals(iy90Var)) {
            return;
        }
        this.m.c(13, new klo(this));
    }

    public final void Z(int i, boolean z) {
        int i2;
        if (this.M) {
            i2 = 4;
        } else {
            i2 = (this.n0.n != 1 || z) ? 0 : 1;
        }
        yx90 yx90VarA = this.n0;
        if (yx90VarA.l == z && yx90VarA.n == i2 && yx90VarA.m == i) {
            return;
        }
        this.J++;
        if (yx90VarA.p) {
            yx90VarA = yx90VarA.a();
        }
        yx90 yx90VarE = yx90VarA.e(i, i2, z);
        this.l.g.b(1, z ? 1 : 0, i | (i2 << 4)).b();
        a0(yx90VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void a(ky90 ky90Var) {
        ky90Var.getClass();
        this.m.a(ky90Var);
    }

    public final void a0(final yx90 yx90Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        MediaItem mediaItem;
        int i5;
        int i6;
        Object obj;
        MediaItem mediaItem2;
        Object obj2;
        long jU;
        long jU2;
        Object obj3;
        MediaItem mediaItem3;
        Object obj4;
        yx90 yx90Var2 = this.n0;
        this.n0 = yx90Var;
        if (!yx90Var.f43410a.p()) {
            x0x.J(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", yx90Var.b.f37698a, yx90Var.f43410a.getClass().getName(), Integer.valueOf(yx90Var.f43410a.o())), yx90Var.f43410a.b(yx90Var.b.f37698a) != -1);
        }
        boolean zEquals = yx90Var2.f43410a.equals(yx90Var.f43410a);
        Timeline$Window timeline$Window = this.f35882a;
        amq0 amq0Var = this.o;
        bmq0 bmq0Var = yx90Var2.f43410a;
        vn30 vn30Var = yx90Var2.b;
        bmq0 bmq0Var2 = yx90Var.f43410a;
        vn30 vn30Var2 = yx90Var.b;
        if (bmq0Var2.p() && bmq0Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (bmq0Var2.p() != bmq0Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!bmq0Var.m(bmq0Var.g(vn30Var.f37698a, amq0Var).c, timeline$Window, 0L).f45385a.equals(bmq0Var2.m(bmq0Var2.g(vn30Var2.f37698a, amq0Var).c, timeline$Window, 0L).f45385a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    v4i0.e();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && vn30Var.d < vn30Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            mediaItem = yx90Var.f43410a.p() ? null : yx90Var.f43410a.m(yx90Var.f43410a.g(yx90Var.b.f37698a, this.o).c, this.f35882a, 0L).b;
            this.m0 = jn30.C;
        } else {
            mediaItem = null;
        }
        if (zBooleanValue || !yx90Var2.j.equals(yx90Var.j)) {
            hbi hbiVarA = this.m0.a();
            List list = yx90Var.j;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ed40 ed40Var = (ed40) list.get(i7);
                int i8 = 0;
                while (true) {
                    cd40[] cd40VarArr = ed40Var.f7600a;
                    if (i8 < cd40VarArr.length) {
                        cd40VarArr[i8].b(hbiVarA);
                        i8++;
                    }
                }
            }
            this.m0 = new jn30(hbiVarA);
        }
        jn30 jn30VarB = b();
        boolean zEquals2 = jn30VarB.equals(this.R);
        this.R = jn30VarB;
        boolean z3 = yx90Var2.l != yx90Var.l;
        boolean z4 = yx90Var2.e != yx90Var.e;
        if (z4 || z3) {
            b0();
        }
        boolean z5 = yx90Var2.g != yx90Var.g;
        if (!zEquals) {
            this.m.c(0, new glo(yx90Var, i));
        }
        if (z) {
            amq0 amq0Var2 = new amq0();
            if (yx90Var2.f43410a.p()) {
                i5 = i3;
                i6 = i5;
                obj = null;
                mediaItem2 = null;
                obj2 = null;
            } else {
                Object obj5 = yx90Var2.b.f37698a;
                yx90Var2.f43410a.g(obj5, amq0Var2);
                int i9 = amq0Var2.c;
                int iB = yx90Var2.f43410a.b(obj5);
                obj = yx90Var2.f43410a.m(i9, this.f35882a, 0L).f45385a;
                mediaItem2 = this.f35882a.b;
                obj2 = obj5;
                i5 = i9;
                i6 = iB;
            }
            vn30 vn30Var3 = yx90Var2.b;
            if (i2 == 0) {
                boolean zC = vn30Var3.c();
                vn30 vn30Var4 = yx90Var2.b;
                if (zC) {
                    jU = amq0Var2.a(vn30Var4.b, vn30Var4.c);
                    jU2 = u(yx90Var2);
                } else {
                    jU = vn30Var4.e != -1 ? u(this.n0) : amq0Var2.e + amq0Var2.d;
                    jU2 = jU;
                }
            } else if (vn30Var3.c()) {
                jU = yx90Var2.s;
                jU2 = u(yx90Var2);
            } else {
                jU = amq0Var2.e + yx90Var2.s;
                jU2 = jU;
            }
            long jY = vtt0.Y(jU);
            long jY2 = vtt0.Y(jU2);
            vn30 vn30Var5 = yx90Var2.b;
            ly90 ly90Var = new ly90(obj, i5, mediaItem2, obj2, i6, jY, jY2, vn30Var5.b, vn30Var5.c);
            Timeline$Window timeline$Window2 = this.f35882a;
            int iJ = j();
            int iK = k();
            if (this.n0.f43410a.p()) {
                obj3 = null;
                mediaItem3 = null;
                obj4 = null;
            } else {
                yx90 yx90Var3 = this.n0;
                Object obj6 = yx90Var3.b.f37698a;
                yx90Var3.f43410a.g(obj6, this.o);
                iK = this.n0.f43410a.b(obj6);
                Object obj7 = this.n0.f43410a.m(iJ, timeline$Window2, 0L).f45385a;
                mediaItem3 = timeline$Window2.b;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i10 = iK;
            long jY3 = vtt0.Y(j);
            long jY4 = this.n0.b.c() ? vtt0.Y(u(this.n0)) : jY3;
            vn30 vn30Var6 = this.n0.b;
            this.m.c(11, new nlo(i2, ly90Var, new ly90(obj3, iJ, mediaItem3, obj4, i10, jY3, jY4, vn30Var6.b, vn30Var6.c)));
        } else {
            z3 = z3;
            zEquals2 = zEquals2;
            zBooleanValue = zBooleanValue;
        }
        if (zBooleanValue) {
            this.m.c(1, new qrm(mediaItem, iIntValue));
        }
        final byte b = 7;
        if (yx90Var2.f != yx90Var.f) {
            this.m.c(10, new sg00() { // from class: a.hlo
                @Override // a.sg00
                public final void invoke(Object obj8) {
                    byte b2 = b;
                    yx90 yx90Var4 = yx90Var;
                    ky90 ky90Var = (ky90) obj8;
                    switch (b2) {
                        case 0:
                            boolean z6 = yx90Var4.g;
                            ky90Var.getClass();
                            ky90Var.w(yx90Var4.g);
                            break;
                        case 1:
                            ky90Var.F(yx90Var4.e, yx90Var4.l);
                            break;
                        case 2:
                            ky90Var.f(yx90Var4.e);
                            break;
                        case 3:
                            ky90Var.x(yx90Var4.m, yx90Var4.l);
                            break;
                        case 4:
                            ky90Var.b(yx90Var4.n);
                            break;
                        case 5:
                            ky90Var.H(yx90Var4.m());
                            break;
                        case 6:
                            ky90Var.c(yx90Var4.o);
                            break;
                        case 7:
                            ky90Var.v(yx90Var4.f);
                            break;
                        case 8:
                            ky90Var.G(yx90Var4.f);
                            break;
                        default:
                            ky90Var.E((rds0) yx90Var4.i.e);
                            break;
                    }
                }
            });
            if (yx90Var.f != null) {
                final byte b2 = 8;
                this.m.c(10, new sg00() { // from class: a.hlo
                    @Override // a.sg00
                    public final void invoke(Object obj8) {
                        byte b3 = b2;
                        yx90 yx90Var4 = yx90Var;
                        ky90 ky90Var = (ky90) obj8;
                        switch (b3) {
                            case 0:
                                boolean z6 = yx90Var4.g;
                                ky90Var.getClass();
                                ky90Var.w(yx90Var4.g);
                                break;
                            case 1:
                                ky90Var.F(yx90Var4.e, yx90Var4.l);
                                break;
                            case 2:
                                ky90Var.f(yx90Var4.e);
                                break;
                            case 3:
                                ky90Var.x(yx90Var4.m, yx90Var4.l);
                                break;
                            case 4:
                                ky90Var.b(yx90Var4.n);
                                break;
                            case 5:
                                ky90Var.H(yx90Var4.m());
                                break;
                            case 6:
                                ky90Var.c(yx90Var4.o);
                                break;
                            case 7:
                                ky90Var.v(yx90Var4.f);
                                break;
                            case 8:
                                ky90Var.G(yx90Var4.f);
                                break;
                            default:
                                ky90Var.E((rds0) yx90Var4.i.e);
                                break;
                        }
                    }
                });
            }
        }
        ucs0 ucs0Var = yx90Var2.i;
        ucs0 ucs0Var2 = yx90Var.i;
        if (ucs0Var != ucs0Var2) {
            syj syjVar = this.i;
            Object obj8 = ucs0Var2.f;
            syjVar.getClass();
            final byte b3 = 9;
            this.m.c(2, new sg00() { // from class: a.hlo
                @Override // a.sg00
                public final void invoke(Object obj9) {
                    byte b4 = b3;
                    yx90 yx90Var4 = yx90Var;
                    ky90 ky90Var = (ky90) obj9;
                    switch (b4) {
                        case 0:
                            boolean z6 = yx90Var4.g;
                            ky90Var.getClass();
                            ky90Var.w(yx90Var4.g);
                            break;
                        case 1:
                            ky90Var.F(yx90Var4.e, yx90Var4.l);
                            break;
                        case 2:
                            ky90Var.f(yx90Var4.e);
                            break;
                        case 3:
                            ky90Var.x(yx90Var4.m, yx90Var4.l);
                            break;
                        case 4:
                            ky90Var.b(yx90Var4.n);
                            break;
                        case 5:
                            ky90Var.H(yx90Var4.m());
                            break;
                        case 6:
                            ky90Var.c(yx90Var4.o);
                            break;
                        case 7:
                            ky90Var.v(yx90Var4.f);
                            break;
                        case 8:
                            ky90Var.G(yx90Var4.f);
                            break;
                        default:
                            ky90Var.E((rds0) yx90Var4.i.e);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.m.c(14, new z9f(this.R, (byte) 18));
        }
        if (z5) {
            final byte b4 = 0;
            this.m.c(3, new sg00() { // from class: a.hlo
                @Override // a.sg00
                public final void invoke(Object obj9) {
                    byte b5 = b4;
                    yx90 yx90Var4 = yx90Var;
                    ky90 ky90Var = (ky90) obj9;
                    switch (b5) {
                        case 0:
                            boolean z6 = yx90Var4.g;
                            ky90Var.getClass();
                            ky90Var.w(yx90Var4.g);
                            break;
                        case 1:
                            ky90Var.F(yx90Var4.e, yx90Var4.l);
                            break;
                        case 2:
                            ky90Var.f(yx90Var4.e);
                            break;
                        case 3:
                            ky90Var.x(yx90Var4.m, yx90Var4.l);
                            break;
                        case 4:
                            ky90Var.b(yx90Var4.n);
                            break;
                        case 5:
                            ky90Var.H(yx90Var4.m());
                            break;
                        case 6:
                            ky90Var.c(yx90Var4.o);
                            break;
                        case 7:
                            ky90Var.v(yx90Var4.f);
                            break;
                        case 8:
                            ky90Var.G(yx90Var4.f);
                            break;
                        default:
                            ky90Var.E((rds0) yx90Var4.i.e);
                            break;
                    }
                }
            });
        }
        if (z4 || z3) {
            final byte b5 = 1;
            this.m.c(-1, new sg00() { // from class: a.hlo
                @Override // a.sg00
                public final void invoke(Object obj9) {
                    byte b6 = b5;
                    yx90 yx90Var4 = yx90Var;
                    ky90 ky90Var = (ky90) obj9;
                    switch (b6) {
                        case 0:
                            boolean z6 = yx90Var4.g;
                            ky90Var.getClass();
                            ky90Var.w(yx90Var4.g);
                            break;
                        case 1:
                            ky90Var.F(yx90Var4.e, yx90Var4.l);
                            break;
                        case 2:
                            ky90Var.f(yx90Var4.e);
                            break;
                        case 3:
                            ky90Var.x(yx90Var4.m, yx90Var4.l);
                            break;
                        case 4:
                            ky90Var.b(yx90Var4.n);
                            break;
                        case 5:
                            ky90Var.H(yx90Var4.m());
                            break;
                        case 6:
                            ky90Var.c(yx90Var4.o);
                            break;
                        case 7:
                            ky90Var.v(yx90Var4.f);
                            break;
                        case 8:
                            ky90Var.G(yx90Var4.f);
                            break;
                        default:
                            ky90Var.E((rds0) yx90Var4.i.e);
                            break;
                    }
                }
            });
        }
        final byte b6 = 4;
        if (z4) {
            final byte b7 = 2;
            this.m.c(4, new sg00() { // from class: a.hlo
                @Override // a.sg00
                public final void invoke(Object obj9) {
                    byte b8 = b7;
                    yx90 yx90Var4 = yx90Var;
                    ky90 ky90Var = (ky90) obj9;
                    switch (b8) {
                        case 0:
                            boolean z6 = yx90Var4.g;
                            ky90Var.getClass();
                            ky90Var.w(yx90Var4.g);
                            break;
                        case 1:
                            ky90Var.F(yx90Var4.e, yx90Var4.l);
                            break;
                        case 2:
                            ky90Var.f(yx90Var4.e);
                            break;
                        case 3:
                            ky90Var.x(yx90Var4.m, yx90Var4.l);
                            break;
                        case 4:
                            ky90Var.b(yx90Var4.n);
                            break;
                        case 5:
                            ky90Var.H(yx90Var4.m());
                            break;
                        case 6:
                            ky90Var.c(yx90Var4.o);
                            break;
                        case 7:
                            ky90Var.v(yx90Var4.f);
                            break;
                        case 8:
                            ky90Var.G(yx90Var4.f);
                            break;
                        default:
                            ky90Var.E((rds0) yx90Var4.i.e);
                            break;
                    }
                }
            });
        }
        final byte b8 = 5;
        if (z3 || yx90Var2.m != yx90Var.m) {
            final byte b9 = 3;
            this.m.c(5, new sg00() { // from class: a.hlo
                @Override // a.sg00
                public final void invoke(Object obj9) {
                    byte b10 = b9;
                    yx90 yx90Var4 = yx90Var;
                    ky90 ky90Var = (ky90) obj9;
                    switch (b10) {
                        case 0:
                            boolean z6 = yx90Var4.g;
                            ky90Var.getClass();
                            ky90Var.w(yx90Var4.g);
                            break;
                        case 1:
                            ky90Var.F(yx90Var4.e, yx90Var4.l);
                            break;
                        case 2:
                            ky90Var.f(yx90Var4.e);
                            break;
                        case 3:
                            ky90Var.x(yx90Var4.m, yx90Var4.l);
                            break;
                        case 4:
                            ky90Var.b(yx90Var4.n);
                            break;
                        case 5:
                            ky90Var.H(yx90Var4.m());
                            break;
                        case 6:
                            ky90Var.c(yx90Var4.o);
                            break;
                        case 7:
                            ky90Var.v(yx90Var4.f);
                            break;
                        case 8:
                            ky90Var.G(yx90Var4.f);
                            break;
                        default:
                            ky90Var.E((rds0) yx90Var4.i.e);
                            break;
                    }
                }
            });
        }
        final byte b10 = 6;
        if (yx90Var2.n != yx90Var.n) {
            this.m.c(6, new sg00() { // from class: a.hlo
                @Override // a.sg00
                public final void invoke(Object obj9) {
                    byte b11 = b6;
                    yx90 yx90Var4 = yx90Var;
                    ky90 ky90Var = (ky90) obj9;
                    switch (b11) {
                        case 0:
                            boolean z6 = yx90Var4.g;
                            ky90Var.getClass();
                            ky90Var.w(yx90Var4.g);
                            break;
                        case 1:
                            ky90Var.F(yx90Var4.e, yx90Var4.l);
                            break;
                        case 2:
                            ky90Var.f(yx90Var4.e);
                            break;
                        case 3:
                            ky90Var.x(yx90Var4.m, yx90Var4.l);
                            break;
                        case 4:
                            ky90Var.b(yx90Var4.n);
                            break;
                        case 5:
                            ky90Var.H(yx90Var4.m());
                            break;
                        case 6:
                            ky90Var.c(yx90Var4.o);
                            break;
                        case 7:
                            ky90Var.v(yx90Var4.f);
                            break;
                        case 8:
                            ky90Var.G(yx90Var4.f);
                            break;
                        default:
                            ky90Var.E((rds0) yx90Var4.i.e);
                            break;
                    }
                }
            });
        }
        if (yx90Var2.m() != yx90Var.m()) {
            this.m.c(7, new sg00() { // from class: a.hlo
                @Override // a.sg00
                public final void invoke(Object obj9) {
                    byte b11 = b8;
                    yx90 yx90Var4 = yx90Var;
                    ky90 ky90Var = (ky90) obj9;
                    switch (b11) {
                        case 0:
                            boolean z6 = yx90Var4.g;
                            ky90Var.getClass();
                            ky90Var.w(yx90Var4.g);
                            break;
                        case 1:
                            ky90Var.F(yx90Var4.e, yx90Var4.l);
                            break;
                        case 2:
                            ky90Var.f(yx90Var4.e);
                            break;
                        case 3:
                            ky90Var.x(yx90Var4.m, yx90Var4.l);
                            break;
                        case 4:
                            ky90Var.b(yx90Var4.n);
                            break;
                        case 5:
                            ky90Var.H(yx90Var4.m());
                            break;
                        case 6:
                            ky90Var.c(yx90Var4.o);
                            break;
                        case 7:
                            ky90Var.v(yx90Var4.f);
                            break;
                        case 8:
                            ky90Var.G(yx90Var4.f);
                            break;
                        default:
                            ky90Var.E((rds0) yx90Var4.i.e);
                            break;
                    }
                }
            });
        }
        if (!yx90Var2.o.equals(yx90Var.o)) {
            this.m.c(12, new sg00() { // from class: a.hlo
                @Override // a.sg00
                public final void invoke(Object obj9) {
                    byte b11 = b10;
                    yx90 yx90Var4 = yx90Var;
                    ky90 ky90Var = (ky90) obj9;
                    switch (b11) {
                        case 0:
                            boolean z6 = yx90Var4.g;
                            ky90Var.getClass();
                            ky90Var.w(yx90Var4.g);
                            break;
                        case 1:
                            ky90Var.F(yx90Var4.e, yx90Var4.l);
                            break;
                        case 2:
                            ky90Var.f(yx90Var4.e);
                            break;
                        case 3:
                            ky90Var.x(yx90Var4.m, yx90Var4.l);
                            break;
                        case 4:
                            ky90Var.b(yx90Var4.n);
                            break;
                        case 5:
                            ky90Var.H(yx90Var4.m());
                            break;
                        case 6:
                            ky90Var.c(yx90Var4.o);
                            break;
                        case 7:
                            ky90Var.v(yx90Var4.f);
                            break;
                        case 8:
                            ky90Var.G(yx90Var4.f);
                            break;
                        default:
                            ky90Var.E((rds0) yx90Var4.i.e);
                            break;
                    }
                }
            });
        }
        Y();
        this.m.b();
        if (yx90Var2.p != yx90Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((qlo) it.next()).f28944a.b0();
            }
        }
    }

    public final jn30 b() {
        bmq0 bmq0VarN = n();
        if (bmq0VarN.p()) {
            return this.m0;
        }
        MediaItem mediaItem = bmq0VarN.m(j(), this.f35882a, 0L).b;
        hbi hbiVarA = this.m0.a();
        jn30 jn30Var = mediaItem.d;
        if (jn30Var != null) {
            b4x b4xVar = jn30Var.B;
            byte[] bArr = jn30Var.f;
            CharSequence charSequence = jn30Var.f16793a;
            if (charSequence != null) {
                hbiVarA.b = charSequence;
            }
            CharSequence charSequence2 = jn30Var.b;
            if (charSequence2 != null) {
                hbiVarA.c = charSequence2;
            }
            CharSequence charSequence3 = jn30Var.c;
            if (charSequence3 != null) {
                hbiVarA.d = charSequence3;
            }
            CharSequence charSequence4 = jn30Var.d;
            if (charSequence4 != null) {
                hbiVarA.f12771a = charSequence4;
            }
            CharSequence charSequence5 = jn30Var.e;
            if (charSequence5 != null) {
                hbiVarA.e = charSequence5;
            }
            if (bArr != null) {
                Integer num = jn30Var.g;
                hbiVarA.f = bArr == null ? null : (byte[]) bArr.clone();
                hbiVarA.g = num;
                jn30 jn30Var2 = jn30.C;
            }
            Integer num2 = jn30Var.h;
            if (num2 != null) {
                hbiVarA.h = num2;
            }
            Integer num3 = jn30Var.i;
            if (num3 != null) {
                hbiVarA.i = num3;
            }
            Integer num4 = jn30Var.j;
            if (num4 != null) {
                hbiVarA.j = num4;
            }
            Boolean bool = jn30Var.k;
            if (bool != null) {
                hbiVarA.k = bool;
            }
            Integer num5 = jn30Var.l;
            if (num5 != null) {
                hbiVarA.l = num5;
            }
            Integer num6 = jn30Var.m;
            if (num6 != null) {
                hbiVarA.l = num6;
            }
            Integer num7 = jn30Var.n;
            if (num7 != null) {
                hbiVarA.m = num7;
            }
            Integer num8 = jn30Var.o;
            if (num8 != null) {
                hbiVarA.n = num8;
            }
            Integer num9 = jn30Var.p;
            if (num9 != null) {
                hbiVarA.o = num9;
            }
            Integer num10 = jn30Var.q;
            if (num10 != null) {
                hbiVarA.p = num10;
            }
            Integer num11 = jn30Var.r;
            if (num11 != null) {
                hbiVarA.q = num11;
            }
            CharSequence charSequence6 = jn30Var.s;
            if (charSequence6 != null) {
                hbiVarA.r = charSequence6;
            }
            CharSequence charSequence7 = jn30Var.t;
            if (charSequence7 != null) {
                hbiVarA.s = charSequence7;
            }
            CharSequence charSequence8 = jn30Var.u;
            if (charSequence8 != null) {
                hbiVarA.t = charSequence8;
            }
            CharSequence charSequence9 = jn30Var.v;
            if (charSequence9 != null) {
                hbiVarA.u = charSequence9;
            }
            Integer num12 = jn30Var.w;
            if (num12 != null) {
                hbiVarA.v = num12;
            }
            Integer num13 = jn30Var.x;
            if (num13 != null) {
                hbiVarA.w = num13;
            }
            CharSequence charSequence10 = jn30Var.y;
            if (charSequence10 != null) {
                hbiVarA.x = charSequence10;
            }
            CharSequence charSequence11 = jn30Var.z;
            if (charSequence11 != null) {
                hbiVarA.y = charSequence11;
            }
            Integer num14 = jn30Var.A;
            if (num14 != null) {
                hbiVarA.z = num14;
            }
            if (!b4xVar.isEmpty()) {
                hbiVarA.A = b4x.o(b4xVar);
            }
        }
        return new jn30(hbiVarA);
    }

    public final void b0() {
        int iS = s();
        nqd nqdVar = this.A;
        m9c m9cVar = this.z;
        boolean z = false;
        if (iS != 1) {
            if (iS == 2 || iS == 3) {
                c0();
                boolean z2 = this.n0.p;
                if (r() && !z2) {
                    z = true;
                }
                m9cVar.f(z);
                nqdVar.f(r());
                return;
            }
            if (iS != 4) {
                v4i0.e();
                return;
            }
        }
        m9cVar.f(false);
        nqdVar.f(false);
    }

    public final void c() {
        int i;
        int i2;
        Pair pairC;
        c0();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        yx90 yx90Var = this.n0;
        int iP = p(yx90Var);
        long jG = g(yx90Var);
        bmq0 bmq0Var = yx90Var.f43410a;
        this.J++;
        for (int i3 = iMin - 1; i3 >= 0; i3--) {
            arrayList.remove(i3);
        }
        itj0 itj0Var = this.P;
        int[] iArr = itj0Var.b;
        int[] iArr2 = new int[iArr.length - iMin];
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 < 0 || i6 >= iMin) {
                int i7 = i5 - i4;
                if (i6 >= 0) {
                    i6 -= iMin;
                }
                iArr2[i7] = i6;
            } else {
                i4++;
            }
        }
        this.P = new itj0(iArr2, new Random(itj0Var.f15356a.nextLong()));
        wna0 wna0Var = new wna0(arrayList, this.P);
        if (bmq0Var.p() || wna0Var.p()) {
            i = 0;
            i2 = -1;
            boolean z = !bmq0Var.p() && wna0Var.p();
            pairC = C(wna0Var, z ? -1 : iP, z ? -9223372036854775807L : jG);
        } else {
            Pair pairI = bmq0Var.i(this.f35882a, this.o, iP, vtt0.M(jG));
            Object obj = pairI.first;
            if (wna0Var.b(obj) != -1) {
                pairC = pairI;
                i = 0;
                i2 = -1;
            } else {
                i = 0;
                i2 = -1;
                int iT = dmo.T(this.f35882a, this.o, this.H, this.I, obj, bmq0Var, wna0Var);
                if (iT != -1) {
                    Timeline$Window timeline$Window = this.f35882a;
                    wna0Var.m(iT, timeline$Window, 0L);
                    pairC = C(wna0Var, iT, vtt0.Y(timeline$Window.k));
                } else {
                    pairC = C(wna0Var, -1, -9223372036854775807L);
                }
            }
        }
        yx90 yx90VarB = B(yx90Var, wna0Var, pairC);
        int i8 = yx90VarB.e;
        if (i8 != 1 && i8 != 4 && iP >= 0 && iP < iMin) {
            if (dmo.T(this.f35882a, this.o, this.H, this.I, yx90Var.b.f37698a, bmq0Var, wna0Var) == i2) {
                yx90VarB = A(yx90VarB, 4);
            }
        }
        itj0 itj0Var2 = this.P;
        q9o0 q9o0Var = this.l.g;
        q9o0Var.getClass();
        p9o0 p9o0VarD = q9o0.d();
        p9o0VarD.f26617a = q9o0Var.f28360a.obtainMessage(20, i, iMin, itj0Var2);
        p9o0VarD.b();
        yx90 yx90Var2 = yx90VarB;
        a0(yx90Var2, 0, !yx90VarB.b.f37698a.equals(this.n0.b.f37698a), 4, m(yx90Var2), -1, false);
    }

    public final void c0() {
        this.d.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = vtt0.f38024a;
            Locale locale = Locale.US;
            String strK = b1j.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.e0) {
                jf4.n(strK);
            } else {
                f1t0.h0("ExoPlayerImpl", strK, this.f0 ? null : new IllegalStateException());
                this.f0 = true;
            }
        }
    }

    public final void d() {
        c0();
        H();
        S(null);
        D(0, 0);
    }

    public final y8a0 e(x8a0 x8a0Var) {
        int iP = p(this.n0);
        bmq0 bmq0Var = this.n0.f43410a;
        if (iP == -1) {
            iP = 0;
        }
        dmo dmoVar = this.l;
        return new y8a0(dmoVar, x8a0Var, bmq0Var, iP, dmoVar.i);
    }

    public final long f() {
        c0();
        if (this.n0.f43410a.p()) {
            return this.p0;
        }
        yx90 yx90Var = this.n0;
        long j = 0;
        if (yx90Var.k.d != yx90Var.b.d) {
            return vtt0.Y(yx90Var.f43410a.m(j(), this.f35882a, 0L).l);
        }
        long j2 = yx90Var.q;
        if (this.n0.k.c()) {
            yx90 yx90Var2 = this.n0;
            yx90Var2.f43410a.g(yx90Var2.k.f37698a, this.o).d(this.n0.k.b);
        } else {
            j = j2;
        }
        yx90 yx90Var3 = this.n0;
        bmq0 bmq0Var = yx90Var3.f43410a;
        Object obj = yx90Var3.k.f37698a;
        amq0 amq0Var = this.o;
        bmq0Var.g(obj, amq0Var);
        return vtt0.Y(j + amq0Var.e);
    }

    public final long g(yx90 yx90Var) {
        vn30 vn30Var = yx90Var.b;
        long j = yx90Var.c;
        bmq0 bmq0Var = yx90Var.f43410a;
        if (!vn30Var.c()) {
            return vtt0.Y(m(yx90Var));
        }
        Object obj = yx90Var.b.f37698a;
        amq0 amq0Var = this.o;
        bmq0Var.g(obj, amq0Var);
        if (j == -9223372036854775807L) {
            return vtt0.Y(bmq0Var.m(p(yx90Var), this.f35882a, 0L).k);
        }
        return vtt0.Y(j) + vtt0.Y(amq0Var.e);
    }

    public final int h() {
        c0();
        if (z()) {
            return this.n0.b.b;
        }
        return -1;
    }

    public final int i() {
        c0();
        if (z()) {
            return this.n0.b.c;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        c0();
        return this.M;
    }

    public final int j() {
        c0();
        int iP = p(this.n0);
        if (iP == -1) {
            return 0;
        }
        return iP;
    }

    public final int k() {
        c0();
        if (!this.n0.f43410a.p()) {
            yx90 yx90Var = this.n0;
            return yx90Var.f43410a.b(yx90Var.b.f37698a);
        }
        int i = this.o0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final long l() {
        c0();
        return vtt0.Y(m(this.n0));
    }

    public final long m(yx90 yx90Var) {
        if (yx90Var.f43410a.p()) {
            return vtt0.M(this.p0);
        }
        long jL = yx90Var.p ? yx90Var.l() : yx90Var.s;
        if (yx90Var.b.c()) {
            return jL;
        }
        bmq0 bmq0Var = yx90Var.f43410a;
        Object obj = yx90Var.b.f37698a;
        amq0 amq0Var = this.o;
        bmq0Var.g(obj, amq0Var);
        return jL + amq0Var.e;
    }

    public final bmq0 n() {
        c0();
        return this.n0.f43410a;
    }

    public final rds0 o() {
        c0();
        return (rds0) this.n0.i.e;
    }

    public final int p(yx90 yx90Var) {
        return yx90Var.f43410a.p() ? this.o0 : yx90Var.f43410a.g(yx90Var.b.f37698a, this.o).c;
    }

    public final long q() {
        c0();
        if (!z()) {
            bmq0 bmq0VarN = n();
            if (bmq0VarN.p()) {
                return -9223372036854775807L;
            }
            return vtt0.Y(bmq0VarN.m(j(), this.f35882a, 0L).l);
        }
        yx90 yx90Var = this.n0;
        vn30 vn30Var = yx90Var.b;
        bmq0 bmq0Var = yx90Var.f43410a;
        Object obj = vn30Var.f37698a;
        amq0 amq0Var = this.o;
        bmq0Var.g(obj, amq0Var);
        return vtt0.Y(amq0Var.a(vn30Var.b, vn30Var.c));
    }

    public final boolean r() {
        c0();
        return this.n0.l;
    }

    public final int s() {
        c0();
        return this.n0.e;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        c0();
        M(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        scs0 scs0VarA;
        c0();
        if (z == this.M) {
            return;
        }
        this.M = z;
        uch0 uch0Var = this.O;
        if (!uch0Var.f35429a.isEmpty()) {
            syj syjVar = this.i;
            syjVar.getClass();
            nyj nyjVar = syjVar.e;
            if (z) {
                this.N = nyjVar.x;
                f4x f4xVar = uch0Var.f35429a;
                rcs0 rcs0VarA = nyjVar.a();
                eet0 eet0VarJ = f4xVar.iterator();
                while (eet0VarJ.hasNext()) {
                    rcs0VarA.i(((Integer) eet0VarJ.next()).intValue(), true);
                }
                scs0VarA = rcs0VarA.a();
            } else {
                nyjVar.getClass();
                myj myjVar = new myj(nyjVar);
                myjVar.j(this.N);
                nyj nyjVar2 = new nyj(myjVar);
                this.N = null;
                scs0VarA = nyjVar2;
            }
            if (!scs0VarA.equals(nyjVar)) {
                syjVar.l(scs0VarA);
            }
        }
        this.l.g.c(36, Boolean.valueOf(z)).b();
        yx90 yx90Var = this.n0;
        Z(yx90Var.m, yx90Var.l);
    }

    public final int t() {
        c0();
        return this.n0.n;
    }

    public final scs0 v() {
        c0();
        nyj nyjVar = this.i.e;
        if (!this.M) {
            return nyjVar;
        }
        nyjVar.getClass();
        myj myjVar = new myj(nyjVar);
        myjVar.j(this.N);
        return new nyj(myjVar);
    }

    public final boolean w(int i) {
        c0();
        return this.Q.f15578a.f16630a.get(i);
    }

    public final boolean x() {
        bmq0 bmq0VarN = n();
        return !bmq0VarN.p() && bmq0VarN.m(j(), this.f35882a, 0L).a();
    }

    public final boolean y() {
        return s() == 3 && r() && t() == 0;
    }

    public final boolean z() {
        c0();
        return this.n0.b.c();
    }
}
