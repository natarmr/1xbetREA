package a;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i810 extends pu90 implements pj30, b22, tt40 {
    public final g810 A;
    public final g810 B;
    public boolean Y;
    public final i7z f;
    public boolean g;
    public boolean k;
    public boolean l;
    public boolean m;
    public p4e n;
    public Function1 p;
    public dfv q;
    public boolean v;
    public final g810 w;
    public Object y;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public c7z j = c7z.c;
    public long o = 0;
    public h810 r = h810.c;
    public final f7z s = new f7z(this, (byte) 1);
    public final xz40 t = new xz40(new i810[16]);
    public boolean u = true;
    public boolean x = true;
    public long z = r4e.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [a.g810] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.g810] */
    /* JADX WARN: Type inference failed for: r5v5, types: [a.g810] */
    public i810(i7z i7zVar) {
        this.f = i7zVar;
        final byte b = 1;
        final byte b2 = 0;
        this.w = new Function0(this) { // from class: a.g810
            public final /* synthetic */ i810 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                e810 e810VarE1;
                byte b3 = b2;
                ou90 placementScope = null;
                i810 i810Var = this.b;
                switch (b3) {
                    case 0:
                        i7z i7zVar2 = i810Var.f;
                        i7zVar2.h = 0;
                        e7z e7zVar = i7zVar2.f14317a;
                        xz40 xz40VarA = e7zVar.A();
                        Object[] objArr = xz40VarA.f41739a;
                        int i = xz40VarA.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            i810 i810Var2 = ((e7z) objArr[i2]).i1.q;
                            i810Var2.getClass();
                            i810Var2.h = i810Var2.i;
                            i810Var2.i = Integer.MAX_VALUE;
                            if (i810Var2.j == c7z.b) {
                                i810Var2.j = c7z.c;
                            }
                        }
                        xz40 xz40VarA2 = e7zVar.A();
                        Object[] objArr2 = xz40VarA2.f41739a;
                        int i3 = xz40VarA2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            i810 i810Var3 = ((e7z) objArr2[i4]).i1.q;
                            i810Var3.getClass();
                            i810Var3.s.d = false;
                        }
                        qdx qdxVar = i810Var.H().E1;
                        if (qdxVar == null) {
                            jf4.n("Expected lookahead delegate");
                            return null;
                        }
                        mie0 mie0Var = new mie0();
                        ty40 ty40Var = (ty40) e7zVar.o();
                        int i5 = ((xz40) ty40Var.b).c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            e7z e7zVar2 = (e7z) ty40Var.get(i6);
                            e810 e810VarE2 = ((s460) e7zVar2.h1.e).e1();
                            if (e810VarE2 != null) {
                                if (e810VarE2.o) {
                                    vy40 vy40Var = (vy40) mie0Var.f21842a;
                                    if (vy40Var == null) {
                                        vy40Var = new vy40();
                                        mie0Var.f21842a = vy40Var;
                                    }
                                    mie0Var.f21842a = vy40Var;
                                    vy40Var.a(e7zVar2);
                                }
                                e810VarE2.o = qdxVar.o;
                            }
                        }
                        qdxVar.N0().b();
                        ty40 ty40Var2 = (ty40) e7zVar.o();
                        int i7 = ((xz40) ty40Var2.b).c;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                xz40 xz40VarA3 = e7zVar.A();
                                Object[] objArr3 = xz40VarA3.f41739a;
                                int i9 = xz40VarA3.c;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    i810 i810Var4 = ((e7z) objArr3[i10]).i1.q;
                                    i810Var4.getClass();
                                    int i11 = i810Var4.h;
                                    int i12 = i810Var4.i;
                                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                        i810Var4.y0(true);
                                    }
                                }
                                xz40 xz40VarA4 = e7zVar.A();
                                Object[] objArr4 = xz40VarA4.f41739a;
                                int i13 = xz40VarA4.c;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    i810 i810Var5 = ((e7z) objArr4[i14]).i1.q;
                                    i810Var5.getClass();
                                    f7z f7zVar = i810Var5.s;
                                    f7zVar.e = f7zVar.d;
                                }
                                return Unit.f46060a;
                            }
                            e7z e7zVar3 = (e7z) ty40Var2.get(i8);
                            vy40 vy40Var2 = (vy40) mie0Var.f21842a;
                            boolean z = vy40Var2 != null && vy40Var2.e(e7zVar3);
                            e810 e810VarE3 = ((s460) e7zVar3.h1.e).e1();
                            if (e810VarE3 != null) {
                                e810VarE3.o = z;
                            }
                            i8++;
                        }
                        break;
                    case 1:
                        e810 e810VarE4 = i810Var.f.a().e1();
                        e810VarE4.getClass();
                        e810VarE4.S(i810Var.z);
                        return Unit.f46060a;
                    default:
                        i7z i7zVar3 = i810Var.f;
                        if (p7x.E(i7zVar3.f14317a) || i7zVar3.c) {
                            s460 s460Var = i7zVar3.a().w;
                            if (s460Var != null) {
                                placementScope = s460Var.p;
                            }
                        } else {
                            s460 s460Var2 = i7zVar3.a().w;
                            if (s460Var2 != null && (e810VarE1 = s460Var2.e1()) != null) {
                                placementScope = e810VarE1.p;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = h7z.a(i7zVar3.f14317a).getPlacementScope();
                        }
                        e810 e810VarE5 = i7zVar3.a().e1();
                        e810VarE5.getClass();
                        ou90.j(placementScope, e810VarE5, i810Var.o);
                        return Unit.f46060a;
                }
            }
        };
        this.y = i7zVar.p.s;
        this.A = new Function0(this) { // from class: a.g810
            public final /* synthetic */ i810 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                e810 e810VarE1;
                byte b3 = b;
                ou90 placementScope = null;
                i810 i810Var = this.b;
                switch (b3) {
                    case 0:
                        i7z i7zVar2 = i810Var.f;
                        i7zVar2.h = 0;
                        e7z e7zVar = i7zVar2.f14317a;
                        xz40 xz40VarA = e7zVar.A();
                        Object[] objArr = xz40VarA.f41739a;
                        int i = xz40VarA.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            i810 i810Var2 = ((e7z) objArr[i2]).i1.q;
                            i810Var2.getClass();
                            i810Var2.h = i810Var2.i;
                            i810Var2.i = Integer.MAX_VALUE;
                            if (i810Var2.j == c7z.b) {
                                i810Var2.j = c7z.c;
                            }
                        }
                        xz40 xz40VarA2 = e7zVar.A();
                        Object[] objArr2 = xz40VarA2.f41739a;
                        int i3 = xz40VarA2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            i810 i810Var3 = ((e7z) objArr2[i4]).i1.q;
                            i810Var3.getClass();
                            i810Var3.s.d = false;
                        }
                        qdx qdxVar = i810Var.H().E1;
                        if (qdxVar == null) {
                            jf4.n("Expected lookahead delegate");
                            return null;
                        }
                        mie0 mie0Var = new mie0();
                        ty40 ty40Var = (ty40) e7zVar.o();
                        int i5 = ((xz40) ty40Var.b).c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            e7z e7zVar2 = (e7z) ty40Var.get(i6);
                            e810 e810VarE2 = ((s460) e7zVar2.h1.e).e1();
                            if (e810VarE2 != null) {
                                if (e810VarE2.o) {
                                    vy40 vy40Var = (vy40) mie0Var.f21842a;
                                    if (vy40Var == null) {
                                        vy40Var = new vy40();
                                        mie0Var.f21842a = vy40Var;
                                    }
                                    mie0Var.f21842a = vy40Var;
                                    vy40Var.a(e7zVar2);
                                }
                                e810VarE2.o = qdxVar.o;
                            }
                        }
                        qdxVar.N0().b();
                        ty40 ty40Var2 = (ty40) e7zVar.o();
                        int i7 = ((xz40) ty40Var2.b).c;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                xz40 xz40VarA3 = e7zVar.A();
                                Object[] objArr3 = xz40VarA3.f41739a;
                                int i9 = xz40VarA3.c;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    i810 i810Var4 = ((e7z) objArr3[i10]).i1.q;
                                    i810Var4.getClass();
                                    int i11 = i810Var4.h;
                                    int i12 = i810Var4.i;
                                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                        i810Var4.y0(true);
                                    }
                                }
                                xz40 xz40VarA4 = e7zVar.A();
                                Object[] objArr4 = xz40VarA4.f41739a;
                                int i13 = xz40VarA4.c;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    i810 i810Var5 = ((e7z) objArr4[i14]).i1.q;
                                    i810Var5.getClass();
                                    f7z f7zVar = i810Var5.s;
                                    f7zVar.e = f7zVar.d;
                                }
                                return Unit.f46060a;
                            }
                            e7z e7zVar3 = (e7z) ty40Var2.get(i8);
                            vy40 vy40Var2 = (vy40) mie0Var.f21842a;
                            boolean z = vy40Var2 != null && vy40Var2.e(e7zVar3);
                            e810 e810VarE3 = ((s460) e7zVar3.h1.e).e1();
                            if (e810VarE3 != null) {
                                e810VarE3.o = z;
                            }
                            i8++;
                        }
                        break;
                    case 1:
                        e810 e810VarE4 = i810Var.f.a().e1();
                        e810VarE4.getClass();
                        e810VarE4.S(i810Var.z);
                        return Unit.f46060a;
                    default:
                        i7z i7zVar3 = i810Var.f;
                        if (p7x.E(i7zVar3.f14317a) || i7zVar3.c) {
                            s460 s460Var = i7zVar3.a().w;
                            if (s460Var != null) {
                                placementScope = s460Var.p;
                            }
                        } else {
                            s460 s460Var2 = i7zVar3.a().w;
                            if (s460Var2 != null && (e810VarE1 = s460Var2.e1()) != null) {
                                placementScope = e810VarE1.p;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = h7z.a(i7zVar3.f14317a).getPlacementScope();
                        }
                        e810 e810VarE5 = i7zVar3.a().e1();
                        e810VarE5.getClass();
                        ou90.j(placementScope, e810VarE5, i810Var.o);
                        return Unit.f46060a;
                }
            }
        };
        final byte b3 = 2;
        this.B = new Function0(this) { // from class: a.g810
            public final /* synthetic */ i810 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                e810 e810VarE1;
                byte b4 = b3;
                ou90 placementScope = null;
                i810 i810Var = this.b;
                switch (b4) {
                    case 0:
                        i7z i7zVar2 = i810Var.f;
                        i7zVar2.h = 0;
                        e7z e7zVar = i7zVar2.f14317a;
                        xz40 xz40VarA = e7zVar.A();
                        Object[] objArr = xz40VarA.f41739a;
                        int i = xz40VarA.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            i810 i810Var2 = ((e7z) objArr[i2]).i1.q;
                            i810Var2.getClass();
                            i810Var2.h = i810Var2.i;
                            i810Var2.i = Integer.MAX_VALUE;
                            if (i810Var2.j == c7z.b) {
                                i810Var2.j = c7z.c;
                            }
                        }
                        xz40 xz40VarA2 = e7zVar.A();
                        Object[] objArr2 = xz40VarA2.f41739a;
                        int i3 = xz40VarA2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            i810 i810Var3 = ((e7z) objArr2[i4]).i1.q;
                            i810Var3.getClass();
                            i810Var3.s.d = false;
                        }
                        qdx qdxVar = i810Var.H().E1;
                        if (qdxVar == null) {
                            jf4.n("Expected lookahead delegate");
                            return null;
                        }
                        mie0 mie0Var = new mie0();
                        ty40 ty40Var = (ty40) e7zVar.o();
                        int i5 = ((xz40) ty40Var.b).c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            e7z e7zVar2 = (e7z) ty40Var.get(i6);
                            e810 e810VarE2 = ((s460) e7zVar2.h1.e).e1();
                            if (e810VarE2 != null) {
                                if (e810VarE2.o) {
                                    vy40 vy40Var = (vy40) mie0Var.f21842a;
                                    if (vy40Var == null) {
                                        vy40Var = new vy40();
                                        mie0Var.f21842a = vy40Var;
                                    }
                                    mie0Var.f21842a = vy40Var;
                                    vy40Var.a(e7zVar2);
                                }
                                e810VarE2.o = qdxVar.o;
                            }
                        }
                        qdxVar.N0().b();
                        ty40 ty40Var2 = (ty40) e7zVar.o();
                        int i7 = ((xz40) ty40Var2.b).c;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                xz40 xz40VarA3 = e7zVar.A();
                                Object[] objArr3 = xz40VarA3.f41739a;
                                int i9 = xz40VarA3.c;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    i810 i810Var4 = ((e7z) objArr3[i10]).i1.q;
                                    i810Var4.getClass();
                                    int i11 = i810Var4.h;
                                    int i12 = i810Var4.i;
                                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                        i810Var4.y0(true);
                                    }
                                }
                                xz40 xz40VarA4 = e7zVar.A();
                                Object[] objArr4 = xz40VarA4.f41739a;
                                int i13 = xz40VarA4.c;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    i810 i810Var5 = ((e7z) objArr4[i14]).i1.q;
                                    i810Var5.getClass();
                                    f7z f7zVar = i810Var5.s;
                                    f7zVar.e = f7zVar.d;
                                }
                                return Unit.f46060a;
                            }
                            e7z e7zVar3 = (e7z) ty40Var2.get(i8);
                            vy40 vy40Var2 = (vy40) mie0Var.f21842a;
                            boolean z = vy40Var2 != null && vy40Var2.e(e7zVar3);
                            e810 e810VarE3 = ((s460) e7zVar3.h1.e).e1();
                            if (e810VarE3 != null) {
                                e810VarE3.o = z;
                            }
                            i8++;
                        }
                        break;
                    case 1:
                        e810 e810VarE4 = i810Var.f.a().e1();
                        e810VarE4.getClass();
                        e810VarE4.S(i810Var.z);
                        return Unit.f46060a;
                    default:
                        i7z i7zVar3 = i810Var.f;
                        if (p7x.E(i7zVar3.f14317a) || i7zVar3.c) {
                            s460 s460Var = i7zVar3.a().w;
                            if (s460Var != null) {
                                placementScope = s460Var.p;
                            }
                        } else {
                            s460 s460Var2 = i7zVar3.a().w;
                            if (s460Var2 != null && (e810VarE1 = s460Var2.e1()) != null) {
                                placementScope = e810VarE1.p;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = h7z.a(i7zVar3.f14317a).getPlacementScope();
                        }
                        e810 e810VarE5 = i7zVar3.a().e1();
                        e810VarE5.getClass();
                        ou90.j(placementScope, e810VarE5, i810Var.o);
                        return Unit.f46060a;
                }
            }
        };
    }

    @Override // a.pj30
    public final int D(int i) {
        H0();
        e810 e810VarE1 = this.f.a().e1();
        e810VarE1.getClass();
        return e810VarE1.D(i);
    }

    public final void F0() {
        i7z i7zVar = this.f;
        if (i7zVar.o > 0) {
            xz40 xz40VarA = i7zVar.f14317a.A();
            Object[] objArr = xz40VarA.f41739a;
            int i = xz40VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                e7z e7zVar = (e7z) objArr[i2];
                i7z i7zVar2 = e7zVar.i1;
                if ((i7zVar2.m || i7zVar2.n) && !i7zVar2.f) {
                    e7zVar.T(false);
                }
                i810 i810Var = i7zVar2.q;
                if (i810Var != null) {
                    i810Var.F0();
                }
            }
        }
    }

    @Override // a.b22
    public final rdx H() {
        return (rdx) this.f.f14317a.h1.d;
    }

    public final void H0() {
        c7z c7zVar;
        i7z i7zVar = this.f;
        e7z.U(i7zVar.f14317a, false, 7);
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

    public final void I0() {
        a7z a7zVar;
        this.Y = true;
        i7z i7zVar = this.f;
        e7z e7zVarV = i7zVar.f14317a.v();
        h810 h810Var = this.r;
        if ((h810Var != h810.f12604a && !i7zVar.c) || (h810Var != h810.b && i7zVar.c)) {
            z0();
            if (this.g && e7zVarV != null) {
                e7zVarV.T(false);
            }
        }
        if (e7zVarV != null) {
            i7z i7zVar2 = e7zVarV.i1;
            if (!this.g && ((a7zVar = i7zVar2.d) == a7z.c || a7zVar == a7z.d)) {
                if (this.i != Integer.MAX_VALUE) {
                    xcx.b("Place was called on a node which was placed already");
                }
                int i = i7zVar2.h;
                this.i = i;
                i7zVar2.h = i + 1;
            }
        } else {
            this.i = 0;
        }
        y();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0082, B:31:0x006e), top: B:36:0x0007 }] */
    public final void J0(long j, Function1 function1, dfv dfvVar) throws Throwable {
        i7z i7zVar = this.f;
        e7z e7zVar = i7zVar.f14317a;
        e7z e7zVar2 = i7zVar.f14317a;
        try {
            e7z e7zVarV = e7zVar.v();
            a7z a7zVar = e7zVarV != null ? e7zVarV.i1.d : null;
            a7z a7zVar2 = a7z.d;
            if (a7zVar == a7zVar2) {
                i7zVar.c = false;
            }
            if (e7zVar2.s1) {
                xcx.a("place is called on a deactivated node");
            }
            i7zVar.d = a7zVar2;
            boolean z = true;
            this.l = true;
            this.Y = false;
            if (!ikx.b(j, this.o)) {
                if (i7zVar.n || i7zVar.m) {
                    i7zVar.f = true;
                }
                F0();
            }
            cg80 cg80VarA = h7z.a(e7zVar2);
            this.o = j;
            if (i7zVar.f) {
                i7zVar.h(false);
                this.s.g = false;
                eg80 snapshotObserver = cg80VarA.getSnapshotObserver();
                snapshotObserver.f7752a.d(e7zVar2, snapshotObserver.g, this.B);
            } else {
                if (this.r == h810.c) {
                    z = false;
                }
                if (z) {
                    e810 e810VarE1 = i7zVar.a().e1();
                    e810VarE1.getClass();
                    e810VarE1.W0(ikx.d(j, e810VarE1.e));
                    I0();
                } else {
                    i7zVar.h(false);
                    this.s.g = false;
                    eg80 snapshotObserver2 = cg80VarA.getSnapshotObserver();
                    snapshotObserver2.f7752a.d(e7zVar2, snapshotObserver2.g, this.B);
                }
            }
            this.p = function1;
            this.q = dfvVar;
            i7zVar.d = a7z.e;
        } catch (Throwable th) {
            e7zVar.Z(th);
            throw null;
        }
    }

    @Override // a.pj30
    public final int L(int i) {
        H0();
        e810 e810VarE1 = this.f.a().e1();
        e810VarE1.getClass();
        return e810VarE1.L(i);
    }

    public final boolean L0(long j) {
        i7z i7zVar = this.f;
        e7z e7zVar = i7zVar.f14317a;
        e7z e7zVar2 = i7zVar.f14317a;
        try {
            if (e7zVar.s1) {
                xcx.a("measure is called on a deactivated node");
            }
            e7z e7zVarV = e7zVar2.v();
            e7zVar2.g1 = e7zVar2.g1 || (e7zVarV != null && e7zVarV.g1);
            if (!e7zVar2.i1.e) {
                p4e p4eVar = this.n;
                if (p4eVar == null ? false : p4e.c(p4eVar.f26347a, j)) {
                    cg80 cg80Var = e7zVar2.o;
                    if (cg80Var != null) {
                        ((AndroidComposeView) cg80Var).h(e7zVar2, true);
                    }
                    e7zVar2.Y();
                    return false;
                }
            }
            this.n = new p4e(j);
            u0(j);
            this.s.f = false;
            xz40 xz40VarA = e7zVar2.A();
            Object[] objArr = xz40VarA.f41739a;
            int i = xz40VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                i810 i810Var = ((e7z) objArr[i2]).i1.q;
                i810Var.getClass();
                i810Var.s.c = false;
            }
            long j2 = this.m ? this.c : -9223372034707292160L;
            this.m = true;
            e810 e810VarE1 = i7zVar.a().e1();
            if (e810VarE1 == null) {
                xcx.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            i7zVar.c(j);
            p0((((long) e810VarE1.f27604a) << 32) | (((long) e810VarE1.b) & 4294967295L));
            return (((int) (j2 >> 32)) == e810VarE1.f27604a && ((int) (j2 & 4294967295L)) == e810VarE1.b) ? false : true;
        } catch (Throwable th) {
            e7zVar.Z(th);
            throw null;
        }
    }

    @Override // a.b22
    public final int N() {
        return this.i;
    }

    @Override // a.pj30
    public final int P(int i) {
        H0();
        e810 e810VarE1 = this.f.a().e1();
        e810VarE1.getClass();
        return e810VarE1.P(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    @Override // a.pj30
    public final pu90 S(long j) {
        c7z c7zVar;
        c7z c7zVar2 = c7z.c;
        i7z i7zVar = this.f;
        e7z e7zVar = i7zVar.f14317a;
        e7z e7zVar2 = i7zVar.f14317a;
        e7z e7zVarV = e7zVar.v();
        if ((e7zVarV != null ? e7zVarV.i1.d : null) == a7z.b) {
            i7zVar.b = false;
        } else {
            e7z e7zVarV2 = e7zVar2.v();
            if ((e7zVarV2 != null ? e7zVarV2.i1.d : null) == a7z.d) {
                i7zVar.b = false;
            }
        }
        e7z e7zVarV3 = e7zVar2.v();
        if (e7zVarV3 != null) {
            i7z i7zVar2 = e7zVarV3.i1;
            if (this.j != c7zVar2 && !e7zVar2.g1) {
                xcx.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = i7zVar2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                c7zVar = c7z.f3886a;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    hny.w(i7zVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                c7zVar = c7z.b;
            }
            this.j = c7zVar;
        } else {
            this.j = c7zVar2;
        }
        if (e7zVar2.Z == c7zVar2) {
            e7zVar2.d();
        }
        L0(j);
        return this;
    }

    @Override // a.b22
    public final f7z a() {
        return this.s;
    }

    @Override // a.b22
    public final void a0() {
        e7z.U(this.f.f14317a, false, 7);
    }

    @Override // a.pj30
    public final int b(int i) {
        H0();
        e810 e810VarE1 = this.f.a().e1();
        e810VarE1.getClass();
        return e810VarE1.b(i);
    }

    @Override // a.b22
    public final b22 c() {
        i7z i7zVar;
        e7z e7zVarV = this.f.f14317a.v();
        if (e7zVarV == null || (i7zVar = e7zVarV.i1) == null) {
            return null;
        }
        return i7zVar.q;
    }

    @Override // a.pu90
    public final int c0(w12 w12Var) {
        i7z i7zVar = this.f;
        e7z e7zVarV = i7zVar.f14317a.v();
        a7z a7zVar = e7zVarV != null ? e7zVarV.i1.d : null;
        a7z a7zVar2 = a7z.b;
        f7z f7zVar = this.s;
        if (a7zVar == a7zVar2) {
            f7zVar.c = true;
        } else {
            e7z e7zVarV2 = i7zVar.f14317a.v();
            if ((e7zVarV2 != null ? e7zVarV2.i1.d : null) == a7z.d) {
                f7zVar.d = true;
            }
        }
        this.k = true;
        e810 e810VarE1 = i7zVar.a().e1();
        e810VarE1.getClass();
        int iC0 = e810VarE1.c0(w12Var);
        this.k = false;
        return iC0;
    }

    @Override // a.pu90
    public final int d0() {
        e810 e810VarE1 = this.f.a().e1();
        e810VarE1.getClass();
        return e810VarE1.d0();
    }

    @Override // a.b22
    public final void e(m51 m51Var) {
        xz40 xz40VarA = this.f.f14317a.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            i810 i810Var = ((e7z) objArr[i2]).i1.q;
            i810Var.getClass();
            m51Var.invoke(i810Var);
        }
    }

    @Override // a.pu90
    public final int e0() {
        e810 e810VarE1 = this.f.a().e1();
        e810VarE1.getClass();
        return e810VarE1.e0();
    }

    @Override // a.pu90
    public final void l0(long j, float f, dfv dfvVar) throws Throwable {
        J0(j, null, dfvVar);
    }

    @Override // a.pu90, a.pj30
    public final Object n() {
        return this.y;
    }

    @Override // a.pu90
    public final void n0(long j, float f, Function1 function1) throws Throwable {
        J0(j, function1, null);
    }

    @Override // a.b22
    public final void requestLayout() {
        this.f.f14317a.T(false);
    }

    @Override // a.tt40
    public final void v(boolean z) {
        e810 e810VarE1;
        i7z i7zVar = this.f;
        e810 e810VarE2 = i7zVar.a().e1();
        if (Boolean.valueOf(z).equals(e810VarE2 != null ? Boolean.valueOf(e810VarE2.l) : null) || (e810VarE1 = i7zVar.a().e1()) == null) {
            return;
        }
        e810VarE1.l = z;
    }

    public final boolean x0() {
        i7z i7zVar = this.f;
        return p7x.E(i7zVar.f14317a) || i7zVar.c;
    }

    @Override // a.b22
    public final void y() {
        this.v = true;
        f7z f7zVar = this.s;
        f7zVar.h();
        i7z i7zVar = this.f;
        boolean z = i7zVar.f;
        e7z e7zVar = i7zVar.f14317a;
        if (z) {
            xz40 xz40VarA = e7zVar.A();
            Object[] objArr = xz40VarA.f41739a;
            int i = xz40VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                e7z e7zVar2 = (e7z) objArr[i2];
                i7z i7zVar2 = e7zVar2.i1;
                if (i7zVar2.e && e7zVar2.t() == c7z.f3886a) {
                    i810 i810Var = i7zVar2.q;
                    i810Var.getClass();
                    i810 i810Var2 = i7zVar2.q;
                    p4e p4eVar = i810Var2 != null ? i810Var2.n : null;
                    p4eVar.getClass();
                    if (i810Var.L0(p4eVar.f26347a)) {
                        e7z.U(e7zVar, false, 7);
                    }
                }
            }
        }
        qdx qdxVar = H().E1;
        qdxVar.getClass();
        if (i7zVar.g || (!this.k && !qdxVar.o && i7zVar.f)) {
            i7zVar.f = false;
            a7z a7zVar = i7zVar.d;
            i7zVar.d = a7z.d;
            i7zVar.i(false);
            eg80 snapshotObserver = h7z.a(e7zVar).getSnapshotObserver();
            snapshotObserver.f7752a.d(e7zVar, snapshotObserver.h, this.w);
            i7zVar.d = a7zVar;
            if (i7zVar.m && qdxVar.o) {
                requestLayout();
            }
            i7zVar.g = false;
        }
        if (f7zVar.d) {
            f7zVar.e = true;
        }
        if (f7zVar.b && f7zVar.e()) {
            f7zVar.g();
        }
        this.v = false;
    }

    public final void y0(boolean z) {
        if (z && x0()) {
            return;
        }
        if (z || x0()) {
            this.r = h810.c;
            xz40 xz40VarA = this.f.f14317a.A();
            Object[] objArr = xz40VarA.f41739a;
            int i = xz40VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                i810 i810Var = ((e7z) objArr[i2]).i1.q;
                i810Var.getClass();
                i810Var.y0(true);
            }
        }
    }

    public final void z0() {
        h810 h810Var = this.r;
        i7z i7zVar = this.f;
        boolean z = i7zVar.c;
        e7z e7zVar = i7zVar.f14317a;
        if (z) {
            this.r = h810.b;
        } else {
            this.r = h810.f12604a;
        }
        if (h810Var != h810.f12604a && i7zVar.e) {
            e7z.U(e7zVar, true, 6);
        }
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar2 = (e7z) objArr[i2];
            i810 i810Var = e7zVar2.i1.q;
            if (i810Var == null) {
                jf4.o("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (i810Var.i != Integer.MAX_VALUE) {
                i810Var.z0();
                e7z.X(e7zVar2);
            }
        }
    }
}
