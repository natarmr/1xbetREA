package a;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e7z implements zjd, dg80, mkd {
    public static final neg0 t1 = new neg0("Undefined intrinsics block and it is required", 1);
    public static final pcy u1 = new pcy(18);
    public static final z6z v1 = new z6z();
    public static final l13 w1 = new l13((byte) 19);
    public k6z A;
    public wgu0 B;
    public xld Y;
    public c7z Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7348a;
    public int b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public c7z f1;
    public int g;
    public boolean g1;
    public boolean h;
    public final tzi h1;
    public e7z i;
    public final i7z i1;
    public int j;
    public r7z j1;
    public final nw20 k;
    public s460 k1;
    public xz40 l;
    public boolean l1;
    public boolean m;
    public mm40 m1;
    public e7z n;
    public mm40 n1;
    public cg80 o;
    public d33 o1;
    public bhu0 p;
    public e33 p1;
    public int q;
    public boolean q1;
    public boolean r;
    public int r1;
    public boolean s;
    public boolean s1;
    public nai0 t;
    public boolean u;
    public final xz40 v;
    public boolean w;
    public tj30 x;
    public u8u y;
    public w6k z;

    public e7z(boolean z, int i) {
        this.f7348a = z;
        this.b = i;
        this.d = 9223372034707292159L;
        this.e = true;
        this.f = true;
        this.g = -4;
        this.k = new nw20(new xz40(new e7z[16]), new y2x(this, (byte) 27));
        this.v = new xz40(new e7z[16]);
        this.w = true;
        this.x = t1;
        this.z = h7z.f12599a;
        this.A = k6z.f17794a;
        this.B = v1;
        xld.d0.getClass();
        this.Y = wld.b;
        c7z c7zVar = c7z.c;
        this.Z = c7zVar;
        this.f1 = c7zVar;
        this.h1 = new tzi(this);
        this.i1 = new i7z(this);
        this.l1 = true;
        this.m1 = jm40.b;
    }

    public static void U(e7z e7zVar, boolean z, int i) {
        e7z e7zVarV;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (e7zVar.i == null) {
            xcx.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        cg80 cg80Var = e7zVar.o;
        if (cg80Var == null || e7zVar.r || e7zVar.f7348a) {
            return;
        }
        ((AndroidComposeView) cg80Var).x(e7zVar, true, z, z2);
        if (z3) {
            i810 i810Var = e7zVar.i1.q;
            i810Var.getClass();
            i7z i7zVar = i810Var.f;
            e7z e7zVarV2 = i7zVar.f14317a.v();
            c7z c7zVar = i7zVar.f14317a.Z;
            if (e7zVarV2 == null || c7zVar == c7z.c) {
                return;
            }
            while (e7zVarV2.Z == c7zVar && (e7zVarV = e7zVarV2.v()) != null) {
                e7zVarV2 = e7zVarV;
            }
            int iOrdinal = c7zVar.ordinal();
            if (iOrdinal == 0) {
                if (e7zVarV2.i != null) {
                    U(e7zVarV2, z, 6);
                    return;
                } else {
                    W(e7zVarV2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                jf4.n("Intrinsics isn't used by the parent");
            } else if (e7zVarV2.i != null) {
                e7zVarV2.T(z);
            } else {
                e7zVarV2.V(z);
            }
        }
    }

    public static void W(e7z e7zVar, boolean z, int i) {
        cg80 cg80Var;
        e7z e7zVarV;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (e7zVar.r || e7zVar.f7348a || (cg80Var = e7zVar.o) == null) {
            return;
        }
        ((AndroidComposeView) cg80Var).x(e7zVar, false, z, z2);
        if (z3) {
            i7z i7zVar = e7zVar.i1.p.f;
            e7z e7zVarV2 = i7zVar.f14317a.v();
            c7z c7zVar = i7zVar.f14317a.Z;
            if (e7zVarV2 == null || c7zVar == c7z.c) {
                return;
            }
            while (e7zVarV2.Z == c7zVar && (e7zVarV = e7zVarV2.v()) != null) {
                e7zVarV2 = e7zVarV;
            }
            int iOrdinal = c7zVar.ordinal();
            if (iOrdinal == 0) {
                W(e7zVarV2, z, 6);
            } else if (iOrdinal == 1) {
                e7zVarV2.V(z);
            } else {
                jf4.n("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void X(e7z e7zVar) {
        i7z i7zVar = e7zVar.i1;
        if (d7z.f5617a[i7zVar.d.ordinal()] != 1) {
            hny.w(i7zVar.d, "Unexpected state ");
            return;
        }
        if (i7zVar.e) {
            U(e7zVar, true, 6);
            return;
        }
        if (i7zVar.f) {
            e7zVar.T(true);
        }
        if (e7zVar.r()) {
            W(e7zVar, true, 6);
        } else if (e7zVar.q()) {
            e7zVar.V(true);
        }
    }

    private final String k(e7z e7zVar) {
        String strH = h(0);
        e7z e7zVar2 = e7zVar.n;
        return "Cannot insert " + e7zVar + " because it already has a parent or an owner. This tree: " + strH + " Other tree: " + (e7zVar2 != null ? e7zVar2.h(0) : null);
    }

    public final xz40 A() {
        g0();
        if (this.j == 0) {
            return (xz40) this.k.f24215a;
        }
        xz40 xz40Var = this.l;
        xz40Var.getClass();
        return xz40Var;
    }

    public final void B(long j, raw rawVar, int i, boolean z) {
        tzi tziVar = this.h1;
        s460 s460Var = (s460) tziVar.e;
        mb50 mb50Var = s460.w1;
        ((s460) tziVar.e).m1(s460.B1, s460Var.d1(j), rawVar, i, z);
    }

    public final void C(int i, e7z e7zVar) {
        if (e7zVar.n != null && e7zVar.o != null) {
            xcx.b(k(e7zVar));
        }
        e7zVar.n = this;
        nw20 nw20Var = this.k;
        ((xz40) nw20Var.f24215a).a(i, e7zVar);
        ((y2x) nw20Var.b).invoke();
        P();
        if (e7zVar.f7348a) {
            this.j++;
        }
        H();
        cg80 cg80Var = this.o;
        if (cg80Var != null) {
            e7zVar.c(cg80Var);
        }
        if (e7zVar.i1.l > 0) {
            i7z i7zVar = this.i1;
            i7zVar.d(i7zVar.l + 1);
        }
        if (e7zVar.r1 > 0) {
            b0(this.r1 + 1);
        }
    }

    public final void D() {
        if (this.l1) {
            tzi tziVar = this.h1;
            s460 s460Var = (rdx) tziVar.d;
            s460 s460Var2 = ((s460) tziVar.e).w;
            this.k1 = null;
            while (!Intrinsics.d(s460Var, s460Var2)) {
                if ((s460Var != null ? s460Var.u1 : null) != null) {
                    this.k1 = s460Var;
                    break;
                }
                s460Var = s460Var != null ? s460Var.w : null;
            }
            this.l1 = false;
        }
        s460 s460Var3 = this.k1;
        if (s460Var3 != null && s460Var3.u1 == null) {
            throw cs0.g("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (s460Var3 != null) {
            s460Var3.o1();
            return;
        }
        e7z e7zVarV = v();
        if (e7zVarV != null) {
            e7zVarV.D();
            return;
        }
        cg80 cg80Var = this.o;
        if (cg80Var != null) {
            ((AndroidComposeView) cg80Var).invalidate();
        }
    }

    public final void E() {
        tzi tziVar = this.h1;
        s460 s460Var = (s460) tziVar.e;
        rdx rdxVar = (rdx) tziVar.d;
        while (s460Var != rdxVar) {
            s460Var.getClass();
            x6z x6zVar = (x6z) s460Var;
            bg80 bg80Var = x6zVar.u1;
            if (bg80Var != null) {
                ((gfv) bg80Var).c();
            }
            s460Var = x6zVar.v;
        }
        bg80 bg80Var2 = rdxVar.u1;
        if (bg80Var2 != null) {
            ((gfv) bg80Var2).c();
        }
    }

    public final void F() {
        if (this.f7348a) {
            e7z e7zVarV = v();
            if (e7zVarV != null) {
                e7zVarV.F();
                return;
            }
            return;
        }
        if (this.i != null) {
            U(this, false, 7);
        } else {
            W(this, false, 7);
        }
    }

    public final void G() {
        if (this.u) {
            return;
        }
        if (((o460) this.h1.c).f != null || this.n1 != null) {
            this.s = true;
            return;
        }
        nai0 nai0Var = this.t;
        this.u = true;
        mie0 mie0Var = new mie0();
        mie0Var.f21842a = new nai0();
        eg80 snapshotObserver = h7z.a(this).getSnapshotObserver();
        wqv wqvVar = new wqv(this, mie0Var, (byte) 28);
        snapshotObserver.f7752a.d(this, snapshotObserver.d, wqvVar);
        this.u = false;
        this.t = (nai0) mie0Var.f21842a;
        this.s = false;
        cg80 cg80VarA = h7z.a(this);
        cg80VarA.getSemanticsOwner().b(this, nai0Var);
        ((AndroidComposeView) cg80VarA).z();
    }

    public final void H() {
        e7z e7zVar;
        if (this.j > 0) {
            this.m = true;
        }
        if (!this.f7348a || (e7zVar = this.n) == null) {
            return;
        }
        e7zVar.H();
    }

    public final boolean I() {
        return this.o != null;
    }

    public final boolean J() {
        return this.i1.p.t;
    }

    public final Boolean K() {
        i810 i810Var = this.i1.q;
        if (i810Var != null) {
            return Boolean.valueOf(i810Var.r != h810.c);
        }
        return null;
    }

    public final void L() {
        e7z e7zVarV;
        if (this.Z == c7z.c) {
            g();
        }
        i810 i810Var = this.i1.q;
        i810Var.getClass();
        boolean z = true;
        try {
            i810Var.g = true;
            if (!i810Var.l) {
                xcx.b("replace() called on item that was not placed");
            }
            i810Var.Y = false;
            if (i810Var.r == h810.c) {
                z = false;
            }
            i810Var.J0(i810Var.o, i810Var.p, i810Var.q);
            if (z && !i810Var.Y && (e7zVarV = i810Var.f.f14317a.v()) != null) {
                e7zVarV.T(false);
            }
        } finally {
            i810Var.g = false;
        }
    }

    public final void M(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            nw20 nw20Var = this.k;
            xz40 xz40Var = (xz40) nw20Var.f24215a;
            y2x y2xVar = (y2x) nw20Var.b;
            Object objK = xz40Var.k(i5);
            y2xVar.invoke();
            ((xz40) nw20Var.f24215a).a(i6, (e7z) objK);
            y2xVar.invoke();
        }
        P();
        H();
        F();
    }

    public final void N(e7z e7zVar) {
        if (e7zVar.i1.l > 0) {
            i7z i7zVar = this.i1;
            i7zVar.d(i7zVar.l - 1);
        }
        if (this.o != null) {
            e7zVar.i();
        }
        e7zVar.n = null;
        if (e7zVar.r1 > 0) {
            b0(this.r1 - 1);
        }
        ((s460) e7zVar.h1.e).w = null;
        if (e7zVar.f7348a) {
            this.j--;
            xz40 xz40Var = (xz40) e7zVar.k.f24215a;
            Object[] objArr = xz40Var.f41739a;
            int i = xz40Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((s460) ((e7z) objArr[i2]).h1.e).w = null;
            }
        }
        H();
        P();
    }

    public final void O(s460 s460Var) {
        cg80 cg80Var = this.o;
        oge0 rectManager = cg80Var != null ? cg80Var.getRectManager() : null;
        i7z i7zVar = this.i1;
        boolean z = i7zVar.d != a7z.e || r() || q();
        if (this.g != -4 && rectManager != null) {
            if (s460Var == ((s460) this.h1.e)) {
                this.f = true;
                if (!z) {
                    rectManager.g(this);
                }
            } else {
                this.e = true;
                xz40 xz40VarA = A();
                Object[] objArr = xz40VarA.f41739a;
                int i = xz40VarA.c;
                for (int i2 = 0; i2 < i; i2++) {
                    e7z e7zVar = (e7z) objArr[i2];
                    e7zVar.f = true;
                    if (!z) {
                        rectManager.g(e7zVar);
                    }
                }
                if (this.g != -4) {
                    rectManager.f = true;
                    int iD = rectManager.d(this);
                    long[] jArr = (long[]) rectManager.c.b;
                    int i3 = iD + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.j();
            }
        }
        i7zVar.p.N0();
    }

    public final void P() {
        if (!this.f7348a) {
            this.w = true;
            return;
        }
        e7z e7zVarV = v();
        if (e7zVarV != null) {
            e7zVarV.P();
        }
    }

    public final void Q() {
        nw20 nw20Var = this.k;
        int i = ((xz40) nw20Var.f24215a).c;
        while (true) {
            i--;
            xz40 xz40Var = (xz40) nw20Var.f24215a;
            if (-1 >= i) {
                xz40Var.g();
                ((y2x) nw20Var.b).invoke();
                return;
            }
            N((e7z) xz40Var.f41739a[i]);
        }
    }

    public final void R(int i, int i2) {
        if (i2 < 0) {
            xcx.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            nw20 nw20Var = this.k;
            N((e7z) ((xz40) nw20Var.f24215a).f41739a[i3]);
            Object objK = ((xz40) nw20Var.f24215a).k(i3);
            ((y2x) nw20Var.b).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void S() {
        e7z e7zVarV;
        if (this.Z == c7z.c) {
            g();
        }
        sj30 sj30Var = this.i1.p;
        i7z i7zVar = sj30Var.f;
        try {
            sj30Var.g = true;
            if (!sj30Var.k) {
                xcx.b("replace called on unplaced item");
            }
            boolean z = sj30Var.t;
            sj30Var.I0(sj30Var.n, sj30Var.q, sj30Var.o, sj30Var.p);
            if (z && !sj30Var.h1 && (e7zVarV = i7zVar.f14317a.v()) != null) {
                e7zVarV.V(false);
            }
            sj30Var.g = false;
        } catch (Throwable th) {
            try {
                i7zVar.f14317a.Z(th);
                throw null;
            } catch (Throwable th2) {
                sj30Var.g = false;
                throw th2;
            }
        }
    }

    public final void T(boolean z) {
        cg80 cg80Var;
        if (this.f7348a || (cg80Var = this.o) == null) {
            return;
        }
        ((AndroidComposeView) cg80Var).y(this, true, z);
    }

    public final void V(boolean z) {
        cg80 cg80Var;
        if (this.f7348a || (cg80Var = this.o) == null) {
            return;
        }
        ((AndroidComposeView) cg80Var).y(this, false, z);
    }

    public final void Y() {
        xz40 xz40VarA = A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar = (e7z) objArr[i2];
            c7z c7zVar = e7zVar.f1;
            e7zVar.Z = c7zVar;
            if (c7zVar != c7z.c) {
                e7zVar.Y();
            }
        }
    }

    public final void Z(Throwable th) throws Throwable {
        xld xldVar = this.Y;
        zfn zfnVar = sld.f32394a;
        bh90 bh90Var = (bh90) xldVar;
        bh90Var.getClass();
        qld qldVar = (qld) qbc.V(bh90Var, zfnVar);
        if (qldVar == null) {
            throw th;
        }
        sac.t0(th, new yw9((rld) qldVar, this, (byte) 18));
        throw th;
    }

    @Override // a.zjd
    public final void a() {
        jw2 autofillManager;
        bhu0 bhu0Var = this.p;
        if (bhu0Var != null) {
            bhu0Var.a();
        }
        r7z r7zVar = this.j1;
        if (r7zVar != null) {
            r7zVar.j(true);
        }
        this.s1 = true;
        lm40 lm40Var = (wso0) this.h1.f;
        for (lm40 lm40Var2 = lm40Var; lm40Var2 != null; lm40Var2 = lm40Var2.e) {
            if (lm40Var2.n) {
                lm40Var2.U0();
            }
        }
        for (lm40 lm40Var3 = lm40Var; lm40Var3 != null; lm40Var3 = lm40Var3.e) {
            if (lm40Var3.n) {
                lm40Var3.W0();
            }
        }
        while (lm40Var != null) {
            if (lm40Var.n) {
                lm40Var.Q0();
            }
            lm40Var = lm40Var.e;
        }
        if (I()) {
            this.t = null;
            this.s = false;
        }
        cg80 cg80Var = this.o;
        if (cg80Var != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) cg80Var;
            if (AndroidComposeView.c() && (autofillManager = androidComposeView.getAutofillManager()) != null && autofillManager.h.g(this.b)) {
                autofillManager.f17231a.z(autofillManager.c, this.b, false);
            }
        }
    }

    public final void a0(w6k w6kVar) {
        if (Intrinsics.d(this.z, w6kVar)) {
            return;
        }
        this.z = w6kVar;
        F();
        e7z e7zVarV = v();
        if (e7zVarV != null) {
            e7zVarV.D();
        } else {
            cg80 cg80Var = this.o;
            if (cg80Var != null) {
                ((AndroidComposeView) cg80Var).invalidate();
            }
        }
        E();
        for (lm40 lm40Var = (lm40) this.h1.g; lm40Var != null; lm40Var = lm40Var.f) {
            lm40Var.b();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6011. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void b(a.mm40 r24) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e7z.b(a.mm40):void");
    }

    public final void b0(int i) {
        e7z e7zVarV;
        e7z e7zVarV2;
        int i2 = this.r1;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (e7zVarV2 = v()) != null) {
                e7zVarV2.b0(e7zVarV2.r1 + 1);
            }
            if (i == 0 && this.r1 > 0 && (e7zVarV = v()) != null) {
                e7zVarV.b0(e7zVarV.r1 - 1);
            }
            this.r1 = i;
        }
    }

    public final void c(cg80 cg80Var) {
        e7z e7zVar;
        jw2 autofillManager;
        nai0 nai0VarX;
        if (this.o != null) {
            xcx.b("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        e7z e7zVar2 = this.n;
        if (e7zVar2 != null && !Intrinsics.d(e7zVar2.o, cg80Var)) {
            e7z e7zVarV = v();
            cg80 cg80Var2 = e7zVarV != null ? e7zVarV.o : null;
            String strH = h(0);
            e7z e7zVar3 = this.n;
            xcx.b("Attaching to a different owner(" + cg80Var + ") than the parent's owner(" + cg80Var2 + "). This tree: " + strH + " Parent tree: " + (e7zVar3 != null ? e7zVar3.h(0) : null));
        }
        e7z e7zVarV2 = v();
        i7z i7zVar = this.i1;
        if (e7zVarV2 == null) {
            i7zVar.p.t = true;
            cg80Var.getRectManager().g(this);
            i810 i810Var = i7zVar.q;
            if (i810Var != null) {
                i810Var.r = h810.f12604a;
            }
        }
        tzi tziVar = this.h1;
        ((s460) tziVar.e).w = e7zVarV2 != null ? (rdx) e7zVarV2.h1.d : null;
        this.o = cg80Var;
        this.q = (e7zVarV2 != null ? e7zVarV2.q : -1) + 1;
        mm40 mm40Var = this.n1;
        if (mm40Var != null) {
            b(mm40Var);
        }
        this.n1 = null;
        ((AndroidComposeView) cg80Var).m17getLayoutNodes().j(this.b, this);
        if (this.h) {
            c0(this);
        } else {
            e7z e7zVar4 = this.n;
            if (e7zVar4 == null || (e7zVar = e7zVar4.i) == null) {
                e7zVar = this.i;
            }
            c0(e7zVar);
            if (this.i == null && tziVar.j(512)) {
                c0(this);
            }
        }
        if (!this.s1) {
            for (lm40 lm40Var = (lm40) tziVar.g; lm40Var != null; lm40Var = lm40Var.f) {
                lm40Var.P0();
            }
        }
        xz40 xz40Var = (xz40) this.k.f24215a;
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((e7z) objArr[i2]).c(cg80Var);
        }
        if (!this.s1) {
            tziVar.v();
        }
        F();
        if (e7zVarV2 != null) {
            e7zVarV2.F();
        }
        d33 d33Var = this.o1;
        if (d33Var != null) {
            d33Var.invoke(cg80Var);
        }
        i7zVar.j();
        if (!this.s1 && tziVar.j(8)) {
            G();
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) cg80Var;
        if (!AndroidComposeView.c() || (autofillManager = androidComposeView.getAutofillManager()) == null || (nai0VarX = x()) == null || !nai0VarX.f23193a.b(xai0.r)) {
            return;
        }
        autofillManager.h.a(this.b);
        autofillManager.f17231a.z(autofillManager.c, this.b, true);
    }

    public final void c0(e7z e7zVar) {
        if (Intrinsics.d(e7zVar, this.i)) {
            return;
        }
        this.i = e7zVar;
        i7z i7zVar = this.i1;
        if (e7zVar != null) {
            if (i7zVar.q == null) {
                i7zVar.q = new i810(i7zVar);
            }
            tzi tziVar = this.h1;
            s460 s460Var = ((rdx) tziVar.d).v;
            for (s460 s460Var2 = (s460) tziVar.e; !Intrinsics.d(s460Var2, s460Var) && s460Var2 != null; s460Var2 = s460Var2.v) {
                s460Var2.b1();
            }
        } else {
            i7zVar.q = null;
            i7zVar.f = false;
            i7zVar.e = false;
        }
        F();
    }

    public final void d() {
        this.f1 = this.Z;
        this.Z = c7z.c;
        xz40 xz40VarA = A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar = (e7z) objArr[i2];
            if (e7zVar.Z != c7z.c) {
                e7zVar.d();
            }
        }
    }

    public final void d0(tj30 tj30Var) {
        if (Intrinsics.d(this.x, tj30Var)) {
            return;
        }
        this.x = tj30Var;
        u8u u8uVar = this.y;
        if (u8uVar != null) {
            ((hgk0) ((pz40) u8uVar.b)).setValue(tj30Var);
        }
        F();
    }

    @Override // a.zjd
    public final void e() {
        oge0 rectManager;
        jw2 autofillManager;
        oge0 rectManager2;
        if (!I()) {
            xcx.a("onReuse is only expected on attached node");
        }
        bhu0 bhu0Var = this.p;
        if (bhu0Var != null) {
            bhu0Var.e();
        }
        r7z r7zVar = this.j1;
        if (r7zVar != null) {
            r7zVar.j(false);
        }
        this.u = false;
        boolean z = this.s1;
        tzi tziVar = this.h1;
        if (z) {
            this.s1 = false;
        } else {
            lm40 lm40Var = (wso0) tziVar.f;
            for (lm40 lm40Var2 = lm40Var; lm40Var2 != null; lm40Var2 = lm40Var2.e) {
                if (lm40Var2.n) {
                    lm40Var2.U0();
                }
            }
            for (lm40 lm40Var3 = lm40Var; lm40Var3 != null; lm40Var3 = lm40Var3.e) {
                if (lm40Var3.n) {
                    lm40Var3.W0();
                }
            }
            while (lm40Var != null) {
                if (lm40Var.n) {
                    lm40Var.Q0();
                }
                lm40Var = lm40Var.e;
            }
        }
        int i = this.b;
        cg80 cg80Var = this.o;
        if (cg80Var != null && (rectManager2 = cg80Var.getRectManager()) != null) {
            rectManager2.h(this);
        }
        this.b = pai0.f26656a.addAndGet(1);
        cg80 cg80Var2 = this.o;
        if (cg80Var2 != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) cg80Var2;
            androidComposeView.m17getLayoutNodes().h(i);
            androidComposeView.m17getLayoutNodes().j(this.b, this);
        }
        for (lm40 lm40Var4 = (lm40) tziVar.g; lm40Var4 != null; lm40Var4 = lm40Var4.f) {
            lm40Var4.P0();
        }
        tziVar.v();
        if (tziVar.j(8)) {
            G();
        }
        X(this);
        cg80 cg80Var3 = this.o;
        if (cg80Var3 != null) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) cg80Var3;
            if (AndroidComposeView.c() && (autofillManager = androidComposeView2.getAutofillManager()) != null) {
                AndroidComposeView androidComposeView3 = autofillManager.c;
                j910 j910Var = autofillManager.f17231a;
                fy40 fy40Var = autofillManager.h;
                if (fy40Var.g(i)) {
                    j910Var.z(androidComposeView3, i, false);
                }
                nai0 nai0VarX = x();
                if (nai0VarX != null && nai0VarX.f23193a.b(xai0.r)) {
                    fy40Var.a(this.b);
                    j910Var.z(androidComposeView3, this.b, true);
                }
            }
        }
        cg80 cg80Var4 = this.o;
        if (cg80Var4 == null || (rectManager = cg80Var4.getRectManager()) == null) {
            return;
        }
        rectManager.g(this);
    }

    public final void e0(mm40 mm40Var) {
        if (this.f7348a && this.m1 != jm40.b) {
            xcx.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.s1) {
            xcx.a("modifier is updated when deactivated");
        }
        if (!I()) {
            this.n1 = mm40Var;
            return;
        }
        b(mm40Var);
        if (this.s) {
            G();
        }
    }

    @Override // a.zjd
    public final void f() {
        bhu0 bhu0Var = this.p;
        if (bhu0Var != null) {
            bhu0Var.f();
        }
        r7z r7zVar = this.j1;
        if (r7zVar != null) {
            r7zVar.f();
        }
        tzi tziVar = this.h1;
        s460 s460Var = ((rdx) tziVar.d).v;
        for (s460 s460Var2 = (s460) tziVar.e; !Intrinsics.d(s460Var2, s460Var) && s460Var2 != null; s460Var2 = s460Var2.v) {
            s460Var2.t1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void f0(wgu0 wgu0Var) {
        if (Intrinsics.d(this.B, wgu0Var)) {
            return;
        }
        this.B = wgu0Var;
        lm40 lm40Var = (lm40) this.h1.g;
        if ((lm40Var.d & 16) != 0) {
            while (lm40Var != null) {
                if ((lm40Var.c & 16) != 0) {
                    ?? V = lm40Var;
                    ?? xz40Var = 0;
                    while (V != 0) {
                        if (V instanceof gpa0) {
                            ((gpa0) V).H0();
                        } else if ((V.c & 16) != 0 && (V instanceof f3k)) {
                            lm40 lm40Var2 = ((f3k) V).p;
                            int i = 0;
                            V = V;
                            xz40Var = xz40Var;
                            while (lm40Var2 != null) {
                                if ((lm40Var2.c & 16) != 0) {
                                    i++;
                                    xz40Var = xz40Var;
                                    if (i == 1) {
                                        V = lm40Var2;
                                    } else {
                                        if (xz40Var == 0) {
                                            xz40Var = new xz40(new lm40[16]);
                                        }
                                        if (V != 0) {
                                            xz40Var.b(V);
                                            V = 0;
                                        }
                                        xz40Var.b(lm40Var2);
                                    }
                                }
                                lm40Var2 = lm40Var2.f;
                                V = V;
                                xz40Var = xz40Var;
                            }
                            if (i == 1) {
                            }
                        }
                        V = vcc.V(xz40Var);
                    }
                }
                if ((lm40Var.d & 16) == 0) {
                    return;
                } else {
                    lm40Var = lm40Var.f;
                }
            }
        }
    }

    public final void g() {
        this.f1 = this.Z;
        this.Z = c7z.c;
        xz40 xz40VarA = A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar = (e7z) objArr[i2];
            if (e7zVar.Z == c7z.b) {
                e7zVar.g();
            }
        }
    }

    public final void g0() {
        if (this.j <= 0 || !this.m) {
            return;
        }
        this.m = false;
        xz40 xz40Var = this.l;
        if (xz40Var == null) {
            xz40Var = new xz40(new e7z[16]);
            this.l = xz40Var;
        }
        xz40Var.g();
        xz40 xz40Var2 = (xz40) this.k.f24215a;
        Object[] objArr = xz40Var2.f41739a;
        int i = xz40Var2.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar = (e7z) objArr[i2];
            if (e7zVar.f7348a) {
                xz40Var.c(xz40Var.c, e7zVar.A());
            } else {
                xz40Var.b(e7zVar);
            }
        }
        i7z i7zVar = this.i1;
        i7zVar.p.A = true;
        i810 i810Var = i7zVar.q;
        if (i810Var != null) {
            i810Var.u = true;
        }
    }

    public final String h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        xz40 xz40VarA = A();
        Object[] objArr = xz40VarA.f41739a;
        int i3 = xz40VarA.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((e7z) objArr[i4]).h(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? vqd.k(1, 0, string) : string;
    }

    @Override // a.dg80
    public final boolean h0() {
        return I();
    }

    public final void i() {
        jw2 autofillManager;
        f7z f7zVar;
        cg80 cg80Var = this.o;
        if (cg80Var == null) {
            e7z e7zVarV = v();
            xcx.c("Cannot detach node that is already detached!  Tree: " + (e7zVarV != null ? e7zVarV.h(0) : null));
            csj.b();
            return;
        }
        e7z e7zVarV2 = v();
        i7z i7zVar = this.i1;
        if (e7zVarV2 != null) {
            e7zVarV2.D();
            e7zVarV2.F();
            sj30 sj30Var = i7zVar.p;
            c7z c7zVar = c7z.c;
            sj30Var.l = c7zVar;
            i810 i810Var = i7zVar.q;
            if (i810Var != null) {
                i810Var.j = c7zVar;
            }
        }
        f7z f7zVar2 = i7zVar.p.y;
        f7zVar2.b = true;
        f7zVar2.c = false;
        f7zVar2.e = false;
        f7zVar2.d = false;
        f7zVar2.f = false;
        f7zVar2.g = false;
        f7zVar2.h = null;
        i810 i810Var2 = i7zVar.q;
        if (i810Var2 != null && (f7zVar = i810Var2.s) != null) {
            f7zVar.b = true;
            f7zVar.c = false;
            f7zVar.e = false;
            f7zVar.d = false;
            f7zVar.f = false;
            f7zVar.g = false;
            f7zVar.h = null;
        }
        tzi tziVar = this.h1;
        lm40 lm40Var = (wso0) tziVar.f;
        s460 s460Var = ((rdx) tziVar.d).v;
        for (s460 s460Var2 = (s460) tziVar.e; !Intrinsics.d(s460Var2, s460Var) && s460Var2 != null; s460Var2 = s460Var2.v) {
            s460Var2.z1();
            if (s460Var2.u.J()) {
                s460Var2.u1();
            }
        }
        e33 e33Var = this.p1;
        if (e33Var != null) {
            e33Var.invoke(cg80Var);
        }
        for (lm40 lm40Var2 = lm40Var; lm40Var2 != null; lm40Var2 = lm40Var2.e) {
            if (lm40Var2.n) {
                lm40Var2.W0();
            }
        }
        this.r = true;
        xz40 xz40Var = (xz40) this.k.f24215a;
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((e7z) objArr[i2]).i();
        }
        this.r = false;
        while (lm40Var != null) {
            if (lm40Var.n) {
                lm40Var.Q0();
            }
            lm40Var = lm40Var.e;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) cg80Var;
        androidComposeView.m17getLayoutNodes().h(this.b);
        h7k h7kVar = androidComposeView.t1;
        oif0 oif0Var = (oif0) h7kVar.e;
        ((clc) oif0Var.b).g(this);
        ((clc) oif0Var.c).g(this);
        ((clc) oif0Var.d).g(this);
        ((xz40) ((kd30) h7kVar.f).f18086a).j(this);
        androidComposeView.n1 = true;
        if (AndroidComposeView.c() && (autofillManager = androidComposeView.getAutofillManager()) != null && autofillManager.h.g(this.b)) {
            autofillManager.f17231a.z(autofillManager.c, this.b, false);
        }
        cg80Var.getRectManager().h(this);
        this.o = null;
        c0(null);
        this.q = 0;
        sj30 sj30Var2 = i7zVar.p;
        sj30Var2.i = Integer.MAX_VALUE;
        sj30Var2.h = Integer.MAX_VALUE;
        sj30Var2.t = false;
        i810 i810Var3 = i7zVar.q;
        if (i810Var3 != null) {
            i810Var3.i = Integer.MAX_VALUE;
            i810Var3.h = Integer.MAX_VALUE;
            i810Var3.r = h810.c;
        }
        if (tziVar.j(8)) {
            nai0 nai0Var = this.t;
            this.t = null;
            this.s = false;
            cg80Var.getSemanticsOwner().b(this, nai0Var);
            androidComposeView.z();
        }
    }

    public final void j(x5a x5aVar, dfv dfvVar) throws Throwable {
        try {
            ((s460) this.h1.e).Z0(x5aVar, dfvVar);
        } catch (Throwable th) {
            Z(th);
            throw null;
        }
    }

    public final void l() {
        if (this.i != null) {
            U(this, false, 5);
        } else {
            W(this, false, 5);
        }
        sj30 sj30Var = this.i1.p;
        p4e p4eVar = sj30Var.j ? new p4e(sj30Var.d) : null;
        cg80 cg80Var = this.o;
        if (p4eVar != null) {
            if (cg80Var != null) {
                ((AndroidComposeView) cg80Var).t(this, p4eVar.f26347a);
            }
        } else if (cg80Var != null) {
            ((AndroidComposeView) cg80Var).s(true);
        }
    }

    public final List m() {
        i810 i810Var = this.i1.q;
        i810Var.getClass();
        xz40 xz40Var = i810Var.t;
        i7z i7zVar = i810Var.f;
        i7zVar.f14317a.o();
        if (!i810Var.u) {
            return xz40Var.f();
        }
        e7z e7zVar = i7zVar.f14317a;
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar2 = (e7z) objArr[i2];
            if (xz40Var.c <= i2) {
                i810 i810Var2 = e7zVar2.i1.q;
                i810Var2.getClass();
                xz40Var.b(i810Var2);
            } else {
                i810 i810Var3 = e7zVar2.i1.q;
                i810Var3.getClass();
                Object[] objArr2 = xz40Var.f41739a;
                Object obj = objArr2[i2];
                objArr2[i2] = i810Var3;
            }
        }
        xz40Var.l(((xz40) ((ty40) e7zVar.o()).b).c, xz40Var.c);
        i810Var.u = false;
        return xz40Var.f();
    }

    public final List n() {
        return this.i1.p.x0();
    }

    public final List o() {
        return A().f();
    }

    public final List p() {
        return ((xz40) this.k.f24215a).f();
    }

    public final boolean q() {
        return this.i1.p.w;
    }

    public final boolean r() {
        return this.i1.p.v;
    }

    public final c7z s() {
        return this.i1.p.l;
    }

    public final c7z t() {
        c7z c7zVar;
        i810 i810Var = this.i1.q;
        return (i810Var == null || (c7zVar = i810Var.j) == null) ? c7z.c : c7zVar;
    }

    public final String toString() {
        String strA0 = yyw.a0(this);
        int i = ((xz40) ((ty40) o()).b).c;
        tj30 tj30Var = this.x;
        boolean z = this.s1;
        boolean zJ = J();
        StringBuilder sb = new StringBuilder(strA0);
        sb.append(" children: ");
        sb.append(i);
        sb.append(" measurePolicy: ");
        sb.append(tj30Var);
        w6x.A(" deactivated: ", " isVirtual: ", sb, z, this.f7348a);
        sb.append(" isPlaced: ");
        sb.append(zJ);
        return sb.toString();
    }

    public final u8u u() {
        u8u u8uVar = this.y;
        if (u8uVar != null) {
            return u8uVar;
        }
        u8u u8uVar2 = new u8u(this, this.x);
        this.y = u8uVar2;
        return u8uVar2;
    }

    public final e7z v() {
        e7z e7zVar = this.n;
        while (e7zVar != null && e7zVar.f7348a) {
            e7zVar = e7zVar.n;
        }
        return e7zVar;
    }

    public final int w() {
        return this.i1.p.i;
    }

    public final nai0 x() {
        if (I() && !this.s1 && this.h1.j(8)) {
            return this.t;
        }
        return null;
    }

    public final float y() {
        return this.i1.p.g1;
    }

    public final xz40 z() {
        boolean z = this.w;
        xz40 xz40Var = this.v;
        if (z) {
            xz40Var.g();
            xz40Var.c(xz40Var.c, A());
            Arrays.sort(xz40Var.f41739a, 0, xz40Var.c, w1);
            this.w = false;
        }
        return xz40Var;
    }

    public e7z(int i) {
        this((i & 1) == 0, pai0.f26656a.addAndGet(1));
    }
}
