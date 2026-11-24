package a;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sj30 extends pu90 implements pj30, b22, tt40 {
    public boolean B;
    public final rj30 Z;
    public final i7z f;
    public final rj30 f1;
    public boolean g;
    public float g1;
    public boolean h1;
    public Function1 i1;
    public boolean j;
    public dfv j1;
    public boolean k;
    public float l1;
    public boolean m;
    public final rj30 m1;
    public boolean n1;
    public Function1 o;
    public dfv p;
    public float q;
    public Object s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public c7z l = c7z.c;
    public long n = 0;
    public boolean r = true;
    public final f7z y = new f7z(this, (byte) 0);
    public final xz40 z = new xz40(new sj30[16]);
    public boolean A = true;
    public long Y = r4e.b(0, 0, 0, 0, 15);
    public long k1 = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [a.rj30] */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.rj30] */
    /* JADX WARN: Type inference failed for: r7v4, types: [a.rj30] */
    public sj30(i7z i7zVar) {
        this.f = i7zVar;
        final byte b = 1;
        final byte b2 = 0;
        this.Z = new Function0(this) { // from class: a.rj30
            public final /* synthetic */ sj30 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x0129  */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z;
                byte b3 = b2;
                sj30 sj30Var = this.b;
                switch (b3) {
                    case 0:
                        sj30Var.f.a().S(sj30Var.Y);
                        break;
                    case 1:
                        i7z i7zVar2 = sj30Var.f;
                        i7zVar2.i = 0;
                        e7z e7zVar = i7zVar2.f14317a;
                        xz40 xz40VarA = e7zVar.A();
                        Object[] objArr = xz40VarA.f41739a;
                        int i = xz40VarA.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            sj30 sj30Var2 = ((e7z) objArr[i2]).i1.p;
                            sj30Var2.h = sj30Var2.i;
                            sj30Var2.i = Integer.MAX_VALUE;
                            sj30Var2.u = false;
                            if (sj30Var2.l == c7z.b) {
                                sj30Var2.l = c7z.c;
                            }
                        }
                        xz40 xz40VarA2 = e7zVar.A();
                        Object[] objArr2 = xz40VarA2.f41739a;
                        int i3 = xz40VarA2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((e7z) objArr2[i4]).i1.p.y.d = false;
                        }
                        mie0 mie0Var = new mie0();
                        ty40 ty40Var = (ty40) e7zVar.o();
                        int i5 = ((xz40) ty40Var.b).c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            e7z e7zVar2 = (e7z) ty40Var.get(i6);
                            if (((s460) e7zVar2.h1.e).o) {
                                vy40 vy40Var = (vy40) mie0Var.f21842a;
                                if (vy40Var == null) {
                                    vy40Var = new vy40();
                                    mie0Var.f21842a = vy40Var;
                                }
                                mie0Var.f21842a = vy40Var;
                                vy40Var.a(e7zVar2);
                            }
                            ((s460) e7zVar2.h1.e).o = sj30Var.H().o;
                        }
                        sj30Var.H().N0().b();
                        ty40 ty40Var2 = (ty40) e7zVar.o();
                        int i7 = ((xz40) ty40Var2.b).c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            e7z e7zVar3 = (e7z) ty40Var2.get(i8);
                            vy40 vy40Var2 = (vy40) mie0Var.f21842a;
                            if (vy40Var2 != null) {
                                z = true;
                                if (!vy40Var2.e(e7zVar3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            ((s460) e7zVar3.h1.e).o = z;
                        }
                        xz40 xz40VarA3 = e7zVar.A();
                        Object[] objArr3 = xz40VarA3.f41739a;
                        int i9 = xz40VarA3.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            e7z e7zVar4 = (e7z) objArr3[i10];
                            i7z i7zVar3 = e7zVar4.i1;
                            if (i7zVar3.p.h != e7zVar4.w()) {
                                e7zVar.P();
                                e7zVar.D();
                                if (e7zVar4.w() == Integer.MAX_VALUE) {
                                    if (i7zVar3.c || p7x.E(e7zVar4)) {
                                        i810 i810Var = i7zVar3.q;
                                        i810Var.getClass();
                                        i810Var.y0(false);
                                    }
                                    i7zVar3.p.z0();
                                }
                            }
                        }
                        xz40 xz40VarA4 = e7zVar.A();
                        Object[] objArr4 = xz40VarA4.f41739a;
                        int i11 = xz40VarA4.c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            f7z f7zVar = ((e7z) objArr4[i12]).i1.p.y;
                            f7zVar.e = f7zVar.d;
                        }
                        break;
                    default:
                        i7z i7zVar4 = sj30Var.f;
                        s460 s460Var = i7zVar4.a().w;
                        ou90 placementScope = s460Var != null ? s460Var.p : h7z.a(i7zVar4.f14317a).getPlacementScope();
                        Function1 function1 = sj30Var.i1;
                        dfv dfvVar = sj30Var.j1;
                        if (dfvVar != null) {
                            s460 s460VarA = i7zVar4.a();
                            long j = sj30Var.k1;
                            float f = sj30Var.l1;
                            placementScope.e(s460VarA);
                            s460VarA.l0(ikx.d(j, s460VarA.e), f, dfvVar);
                        } else if (function1 == null) {
                            s460 s460VarA2 = i7zVar4.a();
                            long j2 = sj30Var.k1;
                            float f2 = sj30Var.l1;
                            placementScope.e(s460VarA2);
                            s460VarA2.n0(ikx.d(j2, s460VarA2.e), f2, null);
                        } else {
                            s460 s460VarA3 = i7zVar4.a();
                            long j3 = sj30Var.k1;
                            float f3 = sj30Var.l1;
                            placementScope.e(s460VarA3);
                            s460VarA3.n0(ikx.d(j3, s460VarA3.e), f3, function1);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        };
        this.f1 = new Function0(this) { // from class: a.rj30
            public final /* synthetic */ sj30 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x0129  */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z;
                byte b3 = b;
                sj30 sj30Var = this.b;
                switch (b3) {
                    case 0:
                        sj30Var.f.a().S(sj30Var.Y);
                        break;
                    case 1:
                        i7z i7zVar2 = sj30Var.f;
                        i7zVar2.i = 0;
                        e7z e7zVar = i7zVar2.f14317a;
                        xz40 xz40VarA = e7zVar.A();
                        Object[] objArr = xz40VarA.f41739a;
                        int i = xz40VarA.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            sj30 sj30Var2 = ((e7z) objArr[i2]).i1.p;
                            sj30Var2.h = sj30Var2.i;
                            sj30Var2.i = Integer.MAX_VALUE;
                            sj30Var2.u = false;
                            if (sj30Var2.l == c7z.b) {
                                sj30Var2.l = c7z.c;
                            }
                        }
                        xz40 xz40VarA2 = e7zVar.A();
                        Object[] objArr2 = xz40VarA2.f41739a;
                        int i3 = xz40VarA2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((e7z) objArr2[i4]).i1.p.y.d = false;
                        }
                        mie0 mie0Var = new mie0();
                        ty40 ty40Var = (ty40) e7zVar.o();
                        int i5 = ((xz40) ty40Var.b).c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            e7z e7zVar2 = (e7z) ty40Var.get(i6);
                            if (((s460) e7zVar2.h1.e).o) {
                                vy40 vy40Var = (vy40) mie0Var.f21842a;
                                if (vy40Var == null) {
                                    vy40Var = new vy40();
                                    mie0Var.f21842a = vy40Var;
                                }
                                mie0Var.f21842a = vy40Var;
                                vy40Var.a(e7zVar2);
                            }
                            ((s460) e7zVar2.h1.e).o = sj30Var.H().o;
                        }
                        sj30Var.H().N0().b();
                        ty40 ty40Var2 = (ty40) e7zVar.o();
                        int i7 = ((xz40) ty40Var2.b).c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            e7z e7zVar3 = (e7z) ty40Var2.get(i8);
                            vy40 vy40Var2 = (vy40) mie0Var.f21842a;
                            if (vy40Var2 != null) {
                                z = true;
                                if (!vy40Var2.e(e7zVar3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            ((s460) e7zVar3.h1.e).o = z;
                        }
                        xz40 xz40VarA3 = e7zVar.A();
                        Object[] objArr3 = xz40VarA3.f41739a;
                        int i9 = xz40VarA3.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            e7z e7zVar4 = (e7z) objArr3[i10];
                            i7z i7zVar3 = e7zVar4.i1;
                            if (i7zVar3.p.h != e7zVar4.w()) {
                                e7zVar.P();
                                e7zVar.D();
                                if (e7zVar4.w() == Integer.MAX_VALUE) {
                                    if (i7zVar3.c || p7x.E(e7zVar4)) {
                                        i810 i810Var = i7zVar3.q;
                                        i810Var.getClass();
                                        i810Var.y0(false);
                                    }
                                    i7zVar3.p.z0();
                                }
                            }
                        }
                        xz40 xz40VarA4 = e7zVar.A();
                        Object[] objArr4 = xz40VarA4.f41739a;
                        int i11 = xz40VarA4.c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            f7z f7zVar = ((e7z) objArr4[i12]).i1.p.y;
                            f7zVar.e = f7zVar.d;
                        }
                        break;
                    default:
                        i7z i7zVar4 = sj30Var.f;
                        s460 s460Var = i7zVar4.a().w;
                        ou90 placementScope = s460Var != null ? s460Var.p : h7z.a(i7zVar4.f14317a).getPlacementScope();
                        Function1 function1 = sj30Var.i1;
                        dfv dfvVar = sj30Var.j1;
                        if (dfvVar != null) {
                            s460 s460VarA = i7zVar4.a();
                            long j = sj30Var.k1;
                            float f = sj30Var.l1;
                            placementScope.e(s460VarA);
                            s460VarA.l0(ikx.d(j, s460VarA.e), f, dfvVar);
                        } else if (function1 == null) {
                            s460 s460VarA2 = i7zVar4.a();
                            long j2 = sj30Var.k1;
                            float f2 = sj30Var.l1;
                            placementScope.e(s460VarA2);
                            s460VarA2.n0(ikx.d(j2, s460VarA2.e), f2, null);
                        } else {
                            s460 s460VarA3 = i7zVar4.a();
                            long j3 = sj30Var.k1;
                            float f3 = sj30Var.l1;
                            placementScope.e(s460VarA3);
                            s460VarA3.n0(ikx.d(j3, s460VarA3.e), f3, function1);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        };
        final byte b3 = 2;
        this.m1 = new Function0(this) { // from class: a.rj30
            public final /* synthetic */ sj30 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x0129  */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z;
                byte b4 = b3;
                sj30 sj30Var = this.b;
                switch (b4) {
                    case 0:
                        sj30Var.f.a().S(sj30Var.Y);
                        break;
                    case 1:
                        i7z i7zVar2 = sj30Var.f;
                        i7zVar2.i = 0;
                        e7z e7zVar = i7zVar2.f14317a;
                        xz40 xz40VarA = e7zVar.A();
                        Object[] objArr = xz40VarA.f41739a;
                        int i = xz40VarA.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            sj30 sj30Var2 = ((e7z) objArr[i2]).i1.p;
                            sj30Var2.h = sj30Var2.i;
                            sj30Var2.i = Integer.MAX_VALUE;
                            sj30Var2.u = false;
                            if (sj30Var2.l == c7z.b) {
                                sj30Var2.l = c7z.c;
                            }
                        }
                        xz40 xz40VarA2 = e7zVar.A();
                        Object[] objArr2 = xz40VarA2.f41739a;
                        int i3 = xz40VarA2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((e7z) objArr2[i4]).i1.p.y.d = false;
                        }
                        mie0 mie0Var = new mie0();
                        ty40 ty40Var = (ty40) e7zVar.o();
                        int i5 = ((xz40) ty40Var.b).c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            e7z e7zVar2 = (e7z) ty40Var.get(i6);
                            if (((s460) e7zVar2.h1.e).o) {
                                vy40 vy40Var = (vy40) mie0Var.f21842a;
                                if (vy40Var == null) {
                                    vy40Var = new vy40();
                                    mie0Var.f21842a = vy40Var;
                                }
                                mie0Var.f21842a = vy40Var;
                                vy40Var.a(e7zVar2);
                            }
                            ((s460) e7zVar2.h1.e).o = sj30Var.H().o;
                        }
                        sj30Var.H().N0().b();
                        ty40 ty40Var2 = (ty40) e7zVar.o();
                        int i7 = ((xz40) ty40Var2.b).c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            e7z e7zVar3 = (e7z) ty40Var2.get(i8);
                            vy40 vy40Var2 = (vy40) mie0Var.f21842a;
                            if (vy40Var2 != null) {
                                z = true;
                                if (!vy40Var2.e(e7zVar3)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            ((s460) e7zVar3.h1.e).o = z;
                        }
                        xz40 xz40VarA3 = e7zVar.A();
                        Object[] objArr3 = xz40VarA3.f41739a;
                        int i9 = xz40VarA3.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            e7z e7zVar4 = (e7z) objArr3[i10];
                            i7z i7zVar3 = e7zVar4.i1;
                            if (i7zVar3.p.h != e7zVar4.w()) {
                                e7zVar.P();
                                e7zVar.D();
                                if (e7zVar4.w() == Integer.MAX_VALUE) {
                                    if (i7zVar3.c || p7x.E(e7zVar4)) {
                                        i810 i810Var = i7zVar3.q;
                                        i810Var.getClass();
                                        i810Var.y0(false);
                                    }
                                    i7zVar3.p.z0();
                                }
                            }
                        }
                        xz40 xz40VarA4 = e7zVar.A();
                        Object[] objArr4 = xz40VarA4.f41739a;
                        int i11 = xz40VarA4.c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            f7z f7zVar = ((e7z) objArr4[i12]).i1.p.y;
                            f7zVar.e = f7zVar.d;
                        }
                        break;
                    default:
                        i7z i7zVar4 = sj30Var.f;
                        s460 s460Var = i7zVar4.a().w;
                        ou90 placementScope = s460Var != null ? s460Var.p : h7z.a(i7zVar4.f14317a).getPlacementScope();
                        Function1 function1 = sj30Var.i1;
                        dfv dfvVar = sj30Var.j1;
                        if (dfvVar != null) {
                            s460 s460VarA = i7zVar4.a();
                            long j = sj30Var.k1;
                            float f = sj30Var.l1;
                            placementScope.e(s460VarA);
                            s460VarA.l0(ikx.d(j, s460VarA.e), f, dfvVar);
                        } else if (function1 == null) {
                            s460 s460VarA2 = i7zVar4.a();
                            long j2 = sj30Var.k1;
                            float f2 = sj30Var.l1;
                            placementScope.e(s460VarA2);
                            s460VarA2.n0(ikx.d(j2, s460VarA2.e), f2, null);
                        } else {
                            s460 s460VarA3 = i7zVar4.a();
                            long j3 = sj30Var.k1;
                            float f3 = sj30Var.l1;
                            placementScope.e(s460VarA3);
                            s460VarA3.n0(ikx.d(j3, s460VarA3.e), f3, function1);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        };
    }

    @Override // a.pj30
    public final int D(int i) {
        i7z i7zVar = this.f;
        if (!p7x.E(i7zVar.f14317a)) {
            F0();
            return i7zVar.a().D(i);
        }
        i810 i810Var = i7zVar.q;
        i810Var.getClass();
        return i810Var.D(i);
    }

    public final void F0() {
        c7z c7zVar;
        i7z i7zVar = this.f;
        e7z.W(i7zVar.f14317a, false, 7);
        e7z e7zVar = i7zVar.f14317a;
        e7z e7zVarV = e7zVar.v();
        if (e7zVarV == null || e7zVar.Z != c7z.c) {
            return;
        }
        int iOrdinal = e7zVarV.i1.d.ordinal();
        if (iOrdinal != 0) {
            c7zVar = iOrdinal != 2 ? e7zVarV.Z : c7z.b;
        } else {
            c7zVar = c7z.f3886a;
        }
        e7zVar.Z = c7zVar;
    }

    @Override // a.b22
    public final rdx H() {
        return (rdx) this.f.f14317a.h1.d;
    }

    public final void H0() {
        this.h1 = true;
        i7z i7zVar = this.f;
        e7z e7zVarV = i7zVar.f14317a.v();
        float f = H().h1;
        e7z e7zVar = i7zVar.f14317a;
        tzi tziVar = e7zVar.h1;
        s460 s460Var = (s460) tziVar.e;
        rdx rdxVar = (rdx) tziVar.d;
        while (s460Var != rdxVar) {
            s460Var.getClass();
            x6z x6zVar = (x6z) s460Var;
            f += x6zVar.h1;
            s460Var = x6zVar.v;
        }
        if (f != this.g1) {
            this.g1 = f;
            if (e7zVarV != null) {
                e7zVarV.P();
            }
            if (e7zVarV != null) {
                e7zVarV.D();
            }
        }
        if (!H().o) {
            boolean z = this.t;
            if (!z || this.y.d()) {
                y0();
            }
            if (z) {
                ((rdx) e7zVar.h1.d).s1();
            } else {
                if (e7zVarV != null) {
                    e7zVarV.D();
                }
                if (this.g && e7zVarV != null) {
                    e7zVarV.V(false);
                }
            }
        }
        if (e7zVarV != null) {
            i7z i7zVar2 = e7zVarV.i1;
            if (!this.g && i7zVar2.d == a7z.c) {
                if (this.i != Integer.MAX_VALUE) {
                    xcx.b("Place was called on a node which was placed already");
                }
                int i = i7zVar2.i;
                this.i = i;
                i7zVar2.i = i + 1;
            }
        } else {
            this.i = 0;
        }
        y();
    }

    public final void I0(long j, float f, Function1 function1, dfv dfvVar) {
        i7z i7zVar = this.f;
        e7z e7zVar = i7zVar.f14317a;
        e7z e7zVar2 = i7zVar.f14317a;
        if (e7zVar.s1) {
            xcx.a("place is called on a deactivated node");
        }
        i7zVar.d = a7z.c;
        this.n = j;
        this.q = f;
        this.o = function1;
        this.p = dfvVar;
        this.h1 = false;
        cg80 cg80VarA = h7z.a(e7zVar2);
        if (this.w || !this.t) {
            this.y.g = false;
            i7zVar.f(false);
            this.i1 = function1;
            this.k1 = j;
            this.l1 = f;
            this.j1 = dfvVar;
            eg80 snapshotObserver = cg80VarA.getSnapshotObserver();
            snapshotObserver.f7752a.d(e7zVar2, snapshotObserver.f, this.m1);
        } else {
            s460 s460VarA = i7zVar.a();
            s460VarA.x1(ikx.d(j, s460VarA.e), f, function1, dfvVar);
            H0();
        }
        i7zVar.d = a7z.e;
        if (i7zVar.a().o && (i7zVar.k || i7zVar.j)) {
            requestLayout();
        }
        this.k = true;
    }

    public final void J0(long j, float f, Function1 function1, dfv dfvVar) throws Throwable {
        i7z i7zVar = this.f;
        e7z e7zVar = i7zVar.f14317a;
        e7z e7zVar2 = i7zVar.f14317a;
        try {
            this.u = true;
            if (!ikx.b(j, this.n) || function1 != this.o || this.n1) {
                if (i7zVar.k || i7zVar.j || this.n1) {
                    this.w = true;
                    this.n1 = false;
                }
            }
            i810 i810Var = i7zVar.q;
            if (i810Var != null) {
                i7z i7zVar2 = i810Var.f;
                if (i810Var.r == h810.c && !p7x.E(i7zVar2.f14317a)) {
                    i7zVar2.c = true;
                }
            }
            i810 i810Var2 = i7zVar.q;
            if (i810Var2 != null && i810Var2.x0()) {
                s460 s460Var = i7zVar.a().w;
                ou90 placementScope = s460Var != null ? s460Var.p : h7z.a(e7zVar2).getPlacementScope();
                i810 i810Var3 = i7zVar.q;
                i810Var3.getClass();
                e7z e7zVarV = e7zVar2.v();
                if (e7zVarV != null) {
                    e7zVarV.i1.h = 0;
                }
                i810Var3.i = Integer.MAX_VALUE;
                placementScope.g(i810Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            i810 i810Var4 = i7zVar.q;
            if (i810Var4 != null && !i810Var4.l) {
                xcx.b("Error: Placement happened before lookahead.");
            }
            I0(j, f, function1, dfvVar);
        } catch (Throwable th) {
            e7zVar.Z(th);
            throw null;
        }
    }

    @Override // a.pj30
    public final int L(int i) {
        i7z i7zVar = this.f;
        if (!p7x.E(i7zVar.f14317a)) {
            F0();
            return i7zVar.a().L(i);
        }
        i810 i810Var = i7zVar.q;
        i810Var.getClass();
        return i810Var.L(i);
    }

    public final boolean L0(long j) {
        i7z i7zVar = this.f;
        e7z e7zVar = i7zVar.f14317a;
        e7z e7zVar2 = i7zVar.f14317a;
        try {
            if (e7zVar.s1) {
                xcx.a("measure is called on a deactivated node");
            }
            cg80 cg80VarA = h7z.a(e7zVar2);
            e7z e7zVarV = e7zVar2.v();
            boolean z = true;
            e7zVar2.g1 = e7zVar2.g1 || (e7zVarV != null && e7zVarV.g1);
            if (!e7zVar2.r() && p4e.c(this.d, j)) {
                ((AndroidComposeView) cg80VarA).h(e7zVar2, false);
                e7zVar2.Y();
                return false;
            }
            this.y.f = false;
            xz40 xz40VarA = e7zVar2.A();
            Object[] objArr = xz40VarA.f41739a;
            int i = xz40VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((e7z) objArr[i2]).i1.p.y.c = false;
            }
            this.j = true;
            long j2 = i7zVar.a().c;
            u0(j);
            a7z a7zVar = i7zVar.d;
            a7z a7zVar2 = a7z.e;
            if (a7zVar != a7zVar2) {
                xcx.b("layout state is not idle before measure starts");
            }
            this.Y = j;
            a7z a7zVar3 = a7z.f398a;
            i7zVar.d = a7zVar3;
            this.v = false;
            eg80 snapshotObserver = h7z.a(e7zVar2).getSnapshotObserver();
            snapshotObserver.f7752a.d(e7zVar2, snapshotObserver.c, this.Z);
            if (i7zVar.d == a7zVar3) {
                this.w = true;
                this.x = true;
                i7zVar.d = a7zVar2;
            }
            if (qkx.a(i7zVar.a().c, j2) && i7zVar.a().f27604a == this.f27604a && i7zVar.a().b == this.b) {
                z = false;
            }
            p0((((long) i7zVar.a().b) & 4294967295L) | (((long) i7zVar.a().f27604a) << 32));
            return z;
        } catch (Throwable th) {
            e7zVar.Z(th);
            throw null;
        }
    }

    @Override // a.b22
    public final int N() {
        return this.i;
    }

    public final void N0() {
        i7z i7zVar = this.f;
        e7z e7zVar = i7zVar.f14317a;
        e7z e7zVar2 = i7zVar.f14317a;
        if (!e7zVar.J() || i7zVar.l <= 0) {
            return;
        }
        i7z i7zVar2 = e7zVar2.i1;
        if ((i7zVar2.j || i7zVar2.k) && !i7zVar2.p.w) {
            e7zVar2.V(false);
        }
        xz40 xz40VarA = e7zVar2.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((e7z) objArr[i2]).i1.p.N0();
        }
    }

    @Override // a.pj30
    public final int P(int i) {
        i7z i7zVar = this.f;
        if (!p7x.E(i7zVar.f14317a)) {
            F0();
            return i7zVar.a().P(i);
        }
        i810 i810Var = i7zVar.q;
        i810Var.getClass();
        return i810Var.P(i);
    }

    @Override // a.pj30
    public final pu90 S(long j) {
        c7z c7zVar;
        i7z i7zVar = this.f;
        e7z e7zVar = i7zVar.f14317a;
        e7z e7zVar2 = i7zVar.f14317a;
        c7z c7zVar2 = e7zVar.Z;
        c7z c7zVar3 = c7z.c;
        if (c7zVar2 == c7zVar3) {
            e7zVar.d();
        }
        if (p7x.E(e7zVar2)) {
            i810 i810Var = i7zVar.q;
            i810Var.getClass();
            i810Var.j = c7zVar3;
            i810Var.S(j);
        }
        e7z e7zVarV = e7zVar2.v();
        if (e7zVarV != null) {
            i7z i7zVar2 = e7zVarV.i1;
            if (this.l != c7zVar3 && !e7zVar2.g1) {
                xcx.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = i7zVar2.d.ordinal();
            if (iOrdinal == 0) {
                c7zVar = c7z.f3886a;
            } else {
                if (iOrdinal != 2) {
                    hny.w(i7zVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                c7zVar = c7z.b;
            }
            this.l = c7zVar;
        } else {
            this.l = c7zVar3;
        }
        L0(j);
        return this;
    }

    @Override // a.b22
    public final f7z a() {
        return this.y;
    }

    @Override // a.b22
    public final void a0() {
        e7z.W(this.f.f14317a, false, 7);
    }

    @Override // a.pj30
    public final int b(int i) {
        i7z i7zVar = this.f;
        if (!p7x.E(i7zVar.f14317a)) {
            F0();
            return i7zVar.a().b(i);
        }
        i810 i810Var = i7zVar.q;
        i810Var.getClass();
        return i810Var.b(i);
    }

    @Override // a.b22
    public final b22 c() {
        i7z i7zVar;
        e7z e7zVarV = this.f.f14317a.v();
        if (e7zVarV == null || (i7zVar = e7zVarV.i1) == null) {
            return null;
        }
        return i7zVar.p;
    }

    @Override // a.pu90
    public final int c0(w12 w12Var) {
        i7z i7zVar = this.f;
        e7z e7zVarV = i7zVar.f14317a.v();
        a7z a7zVar = e7zVarV != null ? e7zVarV.i1.d : null;
        a7z a7zVar2 = a7z.f398a;
        f7z f7zVar = this.y;
        if (a7zVar == a7zVar2) {
            f7zVar.c = true;
        } else {
            e7z e7zVarV2 = i7zVar.f14317a.v();
            if ((e7zVarV2 != null ? e7zVarV2.i1.d : null) == a7z.c) {
                f7zVar.d = true;
            }
        }
        this.m = true;
        int iC0 = i7zVar.a().c0(w12Var);
        this.m = false;
        return iC0;
    }

    @Override // a.pu90
    public final int d0() {
        return this.f.a().d0();
    }

    @Override // a.b22
    public final void e(m51 m51Var) {
        xz40 xz40VarA = this.f.f14317a.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            m51Var.invoke(((e7z) objArr[i2]).i1.p);
        }
    }

    @Override // a.pu90
    public final int e0() {
        return this.f.a().e0();
    }

    @Override // a.pu90
    public final void l0(long j, float f, dfv dfvVar) throws Throwable {
        J0(j, f, null, dfvVar);
    }

    @Override // a.pu90, a.pj30
    public final Object n() {
        return this.s;
    }

    @Override // a.pu90
    public final void n0(long j, float f, Function1 function1) throws Throwable {
        J0(j, f, function1, null);
    }

    @Override // a.b22
    public final void requestLayout() {
        this.f.f14317a.V(false);
    }

    @Override // a.tt40
    public final void v(boolean z) {
        i7z i7zVar = this.f;
        if (z != i7zVar.a().l) {
            i7zVar.a().l = z;
            this.n1 = true;
        }
    }

    public final List x0() {
        i7z i7zVar = this.f;
        i7zVar.f14317a.g0();
        boolean z = this.A;
        xz40 xz40Var = this.z;
        if (!z) {
            return xz40Var.f();
        }
        e7z e7zVar = i7zVar.f14317a;
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar2 = (e7z) objArr[i2];
            if (xz40Var.c <= i2) {
                xz40Var.b(e7zVar2.i1.p);
            } else {
                sj30 sj30Var = e7zVar2.i1.p;
                Object[] objArr2 = xz40Var.f41739a;
                Object obj = objArr2[i2];
                objArr2[i2] = sj30Var;
            }
        }
        xz40Var.l(((xz40) ((ty40) e7zVar.o()).b).c, xz40Var.c);
        this.A = false;
        return xz40Var.f();
    }

    @Override // a.b22
    public final void y() {
        boolean zL0;
        this.B = true;
        f7z f7zVar = this.y;
        f7zVar.h();
        boolean z = this.w;
        i7z i7zVar = this.f;
        if (z) {
            xz40 xz40VarA = i7zVar.f14317a.A();
            Object[] objArr = xz40VarA.f41739a;
            int i = xz40VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                e7z e7zVar = (e7z) objArr[i2];
                boolean zR = e7zVar.r();
                i7z i7zVar2 = e7zVar.i1;
                if (zR && e7zVar.s() == c7z.f3886a) {
                    sj30 sj30Var = i7zVar2.p;
                    p4e p4eVar = sj30Var.j ? new p4e(sj30Var.d) : null;
                    if (p4eVar != null) {
                        if (e7zVar.Z == c7z.c) {
                            e7zVar.d();
                        }
                        zL0 = i7zVar2.p.L0(p4eVar.f26347a);
                    } else {
                        zL0 = false;
                    }
                    if (zL0) {
                        e7z.W(i7zVar.f14317a, false, 7);
                    }
                }
            }
        }
        if (this.x || (!this.m && !H().o && this.w)) {
            this.w = false;
            a7z a7zVar = i7zVar.d;
            i7zVar.d = a7z.c;
            i7zVar.g(false);
            e7z e7zVar2 = i7zVar.f14317a;
            eg80 snapshotObserver = h7z.a(e7zVar2).getSnapshotObserver();
            snapshotObserver.f7752a.d(e7zVar2, snapshotObserver.e, this.f1);
            i7zVar.d = a7zVar;
            this.x = false;
        }
        if (f7zVar.d) {
            f7zVar.e = true;
        }
        if (f7zVar.b && f7zVar.e()) {
            f7zVar.g();
        }
        this.B = false;
    }

    public final void y0() {
        boolean z = this.t;
        this.t = true;
        i7z i7zVar = this.f;
        e7z e7zVar = i7zVar.f14317a;
        tzi tziVar = e7zVar.h1;
        if (!z) {
            ((rdx) tziVar.d).s1();
            h7z.a(e7zVar).getRectManager().g(i7zVar.f14317a);
            if (e7zVar.r()) {
                e7z.W(e7zVar, true, 6);
            } else if (e7zVar.i1.e) {
                e7z.U(e7zVar, true, 6);
            }
        }
        s460 s460Var = ((rdx) tziVar.d).v;
        for (s460 s460Var2 = (s460) tziVar.e; !Intrinsics.d(s460Var2, s460Var) && s460Var2 != null; s460Var2 = s460Var2.v) {
            if (s460Var2.t1) {
                s460Var2.o1();
            }
        }
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar2 = (e7z) objArr[i2];
            if (e7zVar2.w() != Integer.MAX_VALUE) {
                e7zVar2.i1.p.y0();
                e7z.X(e7zVar2);
            }
        }
    }

    public final void z0() {
        if (this.t) {
            this.t = false;
            i7z i7zVar = this.f;
            e7z e7zVar = i7zVar.f14317a;
            e7z e7zVar2 = i7zVar.f14317a;
            h7z.a(e7zVar).getRectManager().h(e7zVar2);
            tzi tziVar = e7zVar2.h1;
            s460 s460Var = ((rdx) tziVar.d).v;
            for (s460 s460Var2 = (s460) tziVar.e; !Intrinsics.d(s460Var2, s460Var) && s460Var2 != null; s460Var2 = s460Var2.v) {
                s460Var2.u1();
                s460Var2.z1();
            }
            xz40 xz40VarA = e7zVar2.A();
            Object[] objArr = xz40VarA.f41739a;
            int i = xz40VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((e7z) objArr[i2]).i1.p.z0();
            }
        }
    }
}
