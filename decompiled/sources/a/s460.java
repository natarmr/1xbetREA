package a;

import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class s460 extends c810 implements pj30, j6z {
    public w6k A;
    public k6z B;
    public uj30 Z;
    public ry40 f1;
    public float h1;
    public gz40 i1;
    public b6z j1;
    public jge0 l1;
    public jge0 m1;
    public boolean n1;
    public boolean o1;
    public dfv p1;
    public x5a q1;
    public jt50 r1;
    public final p460 s1;
    public boolean t1;
    public final e7z u;
    public bg80 u1;
    public s460 v;
    public dfv v1;
    public s460 w;
    public boolean x;
    public boolean y;
    public Function1 z;
    public static final mb50 w1 = new mb50(22);
    public static final mb50 x1 = new mb50(23);
    public static final uag0 y1 = new uag0();
    public static final b6z z1 = new b6z();
    public static final float[] A1 = ui30.a();
    public static final q460 B1 = new q460();
    public static final wsz C1 = new wsz();
    public float Y = 0.8f;
    public long g1 = 0;
    public yjj0 k1 = jd8.n;

    public s460(e7z e7zVar) {
        this.u = e7zVar;
        this.A = e7zVar.z;
        this.B = e7zVar.A;
        jge0 jge0Var = jge0.e;
        this.l1 = jge0Var;
        this.m1 = jge0Var;
        this.s1 = new p460(this, (byte) 1);
    }

    public static s460 C1(j6z j6zVar) {
        s460 s460Var;
        f810 f810Var = j6zVar instanceof f810 ? (f810) j6zVar : null;
        if (f810Var != null && (s460Var = f810Var.f9086a.u) != null) {
            return s460Var;
        }
        j6zVar.getClass();
        return (s460) j6zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [a.xz40] */
    public final void A1(uj30 uj30Var) {
        s460 s460Var;
        uj30 uj30Var2 = this.Z;
        if (uj30Var != uj30Var2) {
            this.Z = uj30Var;
            e7z e7zVar = this.u;
            int i = 0;
            if (uj30Var2 == null || uj30Var.j() != uj30Var2.j() || uj30Var.f() != uj30Var2.f()) {
                int iJ = uj30Var.j();
                int iF = uj30Var.f();
                bg80 bg80Var = this.u1;
                if (bg80Var != null) {
                    ((gfv) bg80Var).e((((long) iJ) << 32) | (((long) iF) & 4294967295L));
                } else if (e7zVar.J() && (s460Var = this.w) != null) {
                    s460Var.o1();
                }
                p0((((long) iF) & 4294967295L) | (((long) iJ) << 32));
                if (this.z != null) {
                    H1(false);
                }
                boolean zG = t460.g(4);
                lm40 lm40VarG1 = g1();
                if (zG || (lm40VarG1 = lm40VarG1.e) != null) {
                    for (lm40 lm40VarJ1 = j1(zG); lm40VarJ1 != null && (lm40VarJ1.d & 4) != 0; lm40VarJ1 = lm40VarJ1.f) {
                        if ((lm40VarJ1.c & 4) != 0) {
                            ?? V = lm40VarJ1;
                            ?? xz40Var = 0;
                            while (V != 0) {
                                if (V instanceof ehl) {
                                    ((ehl) V).p0();
                                } else if ((V.c & 4) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var = ((f3k) V).p;
                                    int i2 = 0;
                                    V = V;
                                    xz40Var = xz40Var;
                                    while (lm40Var != null) {
                                        if ((lm40Var.c & 4) != 0) {
                                            i2++;
                                            xz40Var = xz40Var;
                                            if (i2 == 1) {
                                                V = lm40Var;
                                            } else {
                                                if (xz40Var == 0) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var.b(V);
                                                    V = 0;
                                                }
                                                xz40Var.b(lm40Var);
                                            }
                                        }
                                        lm40Var = lm40Var.f;
                                        V = V;
                                        xz40Var = xz40Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var);
                            }
                        }
                        if (lm40VarJ1 == lm40VarG1) {
                            break;
                        }
                    }
                }
                cg80 cg80Var = e7zVar.o;
                if (cg80Var != null) {
                    ((AndroidComposeView) cg80Var).w(e7zVar);
                }
                e7zVar.O(this);
            }
            ry40 ry40Var = this.f1;
            if ((ry40Var == null || ry40Var.e == 0) && uj30Var.a().isEmpty()) {
                return;
            }
            ry40 ry40Var2 = this.f1;
            Map mapA = uj30Var.a();
            if (ry40Var2 != null && ry40Var2.e == mapA.size()) {
                Object[] objArr = ry40Var2.b;
                int[] iArr = ry40Var2.c;
                long[] jArr = ry40Var2.f31295a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((w12) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            e7zVar.i1.p.y.f();
            ry40 ry40Var3 = this.f1;
            if (ry40Var3 == null) {
                ry40 ry40Var4 = v960.f37020a;
                ry40Var3 = new ry40();
                this.f1 = ry40Var3;
            }
            ry40Var3.a();
            for (Map.Entry entry : uj30Var.a().entrySet()) {
                ry40Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void B1(lm40 lm40Var, r460 r460Var, long j, raw rawVar, int i, boolean z, float f) {
        int i2;
        vy40 vy40Var = rawVar.f30156a;
        if (lm40Var == null) {
            n1(r460Var, j, rawVar, i, z);
            return;
        }
        if (!r460Var.e(lm40Var)) {
            B1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z, f);
            return;
        }
        if (!r460Var.h(lm40Var)) {
            v1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z, f, false);
            return;
        }
        iy40 iy40Var = rawVar.b;
        int i3 = rawVar.c;
        int i4 = vy40Var.b;
        if (i3 != i4 - 1) {
            long jB = rawVar.b();
            int i5 = rawVar.c;
            int i6 = vy40Var.b;
            int i7 = i6 - 1;
            rawVar.c = i7;
            rawVar.c(i6, vy40Var.b);
            rawVar.c++;
            vy40Var.a(lm40Var);
            iy40Var.a(vtb.l(f, z, false));
            v1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z, f, false);
            rawVar.c = i7;
            long jB2 = rawVar.b();
            if (rawVar.c + 1 >= vy40Var.b - 1 || acb.N(jB, jB2) <= 0) {
                rawVar.c(rawVar.c + 1, vy40Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zT = acb.T(jB2);
                int i9 = rawVar.c;
                rawVar.c(i8, zT ? i9 + 2 : i9 + 1);
            }
            rawVar.c = i5;
            return;
        }
        int i10 = i3 + 1;
        rawVar.c(i10, i4);
        rawVar.c++;
        vy40Var.a(lm40Var);
        iy40Var.a(vtb.l(f, z, false));
        v1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z, f, false);
        rawVar.c = i3;
        if (i10 == vy40Var.b - 1 || acb.T(rawVar.b())) {
            int i11 = rawVar.c;
            int i12 = i11 + 1;
            vy40Var.l(i12);
            if (i12 < 0 || i12 >= (i2 = iy40Var.b)) {
                v4i0.m("Index must be between 0 and size");
                return;
            }
            long[] jArr = iy40Var.f15572a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                qx3.g(jArr, jArr, i12, i11 + 2, i2);
            }
            iy40Var.b--;
        }
    }

    @Override // a.j6z
    public final long C(long j) {
        if (!g1().n) {
            xcx.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return F(k7x.C(this), ((AndroidComposeView) h7z.a(this.u)).H(j));
    }

    public final jge0 D1() {
        if (g1().n) {
            j6z j6zVarC = k7x.C(this);
            gz40 gz40Var = this.i1;
            if (gz40Var == null) {
                gz40Var = new gz40();
                this.i1 = gz40Var;
            }
            long jX0 = X0(f1());
            float f = h1() ? this.l1.f16474a : 0.0f;
            float f2 = h1() ? this.l1.b : 0.0f;
            float fE0 = h1() ? this.l1.c : e0();
            float fD0 = h1() ? this.l1.d : d0();
            int i = (int) (jX0 >> 32);
            gz40Var.b = f - Float.intBitsToFloat(i);
            int i2 = (int) (jX0 & 4294967295L);
            gz40Var.c = f2 - Float.intBitsToFloat(i2);
            gz40Var.d = Float.intBitsToFloat(i) + fE0;
            gz40Var.e = Float.intBitsToFloat(i2) + fD0;
            while (this != j6zVarC) {
                this.y1(gz40Var, false, true);
                if (!gz40Var.b()) {
                    this = this.w;
                    this.getClass();
                }
            }
            return new jge0(gz40Var.b, gz40Var.c, gz40Var.d, gz40Var.e);
        }
        return jge0.e;
    }

    public final void E1(s460 s460Var, float[] fArr) {
        float[] fArrA;
        if (Intrinsics.d(s460Var, this)) {
            return;
        }
        s460 s460Var2 = this.w;
        s460Var2.getClass();
        s460Var2.E1(s460Var, fArr);
        if (!ikx.b(this.g1, 0L)) {
            float[] fArr2 = A1;
            ui30.d(fArr2);
            long j = this.g1;
            ui30.g(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            ui30.f(fArr, fArr2);
        }
        bg80 bg80Var = this.u1;
        if (bg80Var == null || (fArrA = ((gfv) bg80Var).a()) == null) {
            return;
        }
        ui30.f(fArr, fArrA);
    }

    @Override // a.j6z
    public final long F(j6z j6zVar, long j) {
        if (j6zVar instanceof f810) {
            f810 f810Var = (f810) j6zVar;
            f810Var.f9086a.u.q1();
            return f810Var.F(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        s460 s460VarC1 = C1(j6zVar);
        s460VarC1.q1();
        s460 s460VarC2 = c1(s460VarC1);
        while (s460VarC1 != s460VarC2) {
            bg80 bg80Var = s460VarC1.u1;
            if (bg80Var != null) {
                gfv gfvVar = (gfv) bg80Var;
                float[] fArrB = gfvVar.b();
                if (!gfvVar.s) {
                    j = ui30.b(j, fArrB);
                }
            }
            j = x1x.H(j, s460VarC1.g1);
            s460VarC1 = s460VarC1.w;
            s460VarC1.getClass();
        }
        return W0(s460VarC2, j);
    }

    public final void F1(s460 s460Var, float[] fArr) {
        while (!this.equals(s460Var)) {
            bg80 bg80Var = this.u1;
            if (bg80Var != null) {
                ui30.f(fArr, ((gfv) bg80Var).b());
            }
            long j = this.g1;
            if (!ikx.b(j, 0L)) {
                float[] fArr2 = A1;
                ui30.d(fArr2);
                ui30.g(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                ui30.f(fArr, fArr2);
            }
            this = this.w;
            this.getClass();
        }
    }

    @Override // a.j6z
    public final long G(long j) {
        long jY = Y(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) h7z.a(this.u);
        androidComposeView.B();
        return ui30.b(jY, androidComposeView.y1);
    }

    public final void G1(Function1 function1, boolean z) {
        cg80 cg80Var;
        xz40 xz40Var;
        Reference referencePoll;
        if (function1 != null && this.v1 != null) {
            xcx.a("layerBlock can't be provided when explicitLayer is provided");
        }
        byte b = 0;
        e7z e7zVar = this.u;
        boolean z2 = (!z && this.z == function1 && Intrinsics.d(this.A, e7zVar.z) && this.B == e7zVar.A) ? false : true;
        this.A = e7zVar.z;
        this.B = e7zVar.A;
        boolean zI = e7zVar.I();
        p460 p460Var = this.s1;
        if (zI && function1 != null) {
            this.z = function1;
            if (this.u1 != null) {
                if (z2) {
                    H1(true);
                    return;
                }
                return;
            }
            cg80 cg80VarA = h7z.a(e7zVar);
            jt50 jt50Var = this.r1;
            if (jt50Var == null) {
                jt50 jt50Var2 = new jt50(this, new p460(this, b), (byte) 5);
                this.r1 = jt50Var2;
                jt50Var = jt50Var2;
            }
            bg80 bg80VarF = ((AndroidComposeView) cg80VarA).f(jt50Var, p460Var, null);
            gfv gfvVar = (gfv) bg80VarF;
            gfvVar.e(this.c);
            gfvVar.d(this.g1);
            this.u1 = bg80VarF;
            H1(true);
            e7zVar.l1 = true;
            p460Var.invoke();
            return;
        }
        this.z = null;
        bg80 bg80Var = this.u1;
        if (bg80Var != null) {
            gfv gfvVar2 = (gfv) bg80Var;
            if (!a8k0.z(gfvVar2.b())) {
                e7zVar.O(this);
            }
            gfvVar2.d = null;
            gfvVar2.e = null;
            gfvVar2.g = true;
            gfvVar2.f(false);
            afv afvVar = gfvVar2.b;
            if (afvVar != null) {
                afvVar.c(gfvVar2.f11224a);
                AndroidComposeView androidComposeView = gfvVar2.c;
                fck0 fck0Var = androidComposeView.P1;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) fck0Var.c;
                    xz40Var = (xz40) fck0Var.b;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        xz40Var.j(referencePoll);
                    }
                } while (referencePoll != null);
                xz40Var.b(new WeakReference(gfvVar2, (ReferenceQueue) fck0Var.c));
                androidComposeView.A.k(gfvVar2);
            }
            this.u1 = null;
            e7zVar.l1 = true;
            p460Var.invoke();
            if (g1().n && e7zVar.J() && (cg80Var = e7zVar.o) != null) {
                ((AndroidComposeView) cg80Var).w(e7zVar);
            }
        }
        this.t1 = false;
    }

    @Override // a.c810
    public final c810 H0() {
        return this.v;
    }

    public final void H1(boolean z) {
        char c;
        long j;
        boolean z2;
        e7z e7zVar;
        Function0 function0;
        int i;
        Function0 function1;
        if (this.v1 != null) {
            return;
        }
        bg80 bg80Var = this.u1;
        Function1 function2 = this.z;
        if (bg80Var == null) {
            if (function2 == null) {
                return;
            }
            xcx.b("null layer with a non-null layerBlock");
            return;
        }
        if (function2 == null) {
            throw cs0.g("updateLayerParameters requires a non-null layerBlock");
        }
        uag0 uag0Var = y1;
        uag0Var.a();
        e7z e7zVar2 = this.u;
        uag0Var.t = e7zVar2.z;
        uag0Var.u = e7zVar2.A;
        uag0Var.r = n2x.Q(this.c);
        hie0 hie0Var = new hie0();
        h7z.a(e7zVar2).getSnapshotObserver().f7752a.d(this, w1, new g8l(function2, this, hie0Var, (byte) 29));
        b6z b6zVar = this.j1;
        if (b6zVar == null) {
            b6zVar = new b6z();
            this.j1 = b6zVar;
        }
        b6z b6zVar2 = z1;
        b6zVar2.getClass();
        b6zVar2.f2079a = b6zVar.f2079a;
        b6zVar2.b = b6zVar.b;
        b6zVar2.c = b6zVar.c;
        b6zVar2.d = b6zVar.d;
        b6zVar2.e = b6zVar.e;
        b6zVar2.f = b6zVar.f;
        b6zVar2.g = b6zVar.g;
        b6zVar2.h = b6zVar.h;
        b6zVar2.i = b6zVar.i;
        b6zVar.f2079a = uag0Var.b;
        b6zVar.b = uag0Var.c;
        b6zVar.c = uag0Var.e;
        b6zVar.d = uag0Var.f;
        b6zVar.e = uag0Var.j;
        b6zVar.f = uag0Var.k;
        b6zVar.g = uag0Var.l;
        b6zVar.h = uag0Var.m;
        b6zVar.i = uag0Var.n;
        gfv gfvVar = (gfv) bg80Var;
        AndroidComposeView androidComposeView = gfvVar.c;
        int i2 = uag0Var.f35327a | gfvVar.n;
        gfvVar.l = uag0Var.u;
        w6k w6kVar = uag0Var.t;
        gfvVar.k = w6kVar;
        if ((1048576 & i2) != 0) {
            dfv dfvVar = gfvVar.f11224a;
            int iT = w6kVar.T(uag0Var.s.f43841a);
            uag0Var.s.getClass();
            int iT2 = w6kVar.T(0.0f);
            int iT3 = w6kVar.T(uag0Var.s.b);
            uag0Var.s.getClass();
            int iT4 = w6kVar.T(0.0f);
            dfvVar.v = iT;
            dfvVar.w = iT2;
            dfvVar.x = iT3;
            dfvVar.y = iT4;
            dfvVar.f6018a.s(iT, iT2, iT3, iT4);
            gfvVar.c();
        }
        int i3 = i2 & 4096;
        if (i3 != 0) {
            gfvVar.o = uag0Var.n;
        }
        if ((i2 & 1) != 0) {
            dfv dfvVar2 = gfvVar.f11224a;
            float f = uag0Var.b;
            ffv ffvVar = dfvVar2.f6018a;
            if (ffvVar.F() != f) {
                ffvVar.v(f);
            }
        }
        if ((i2 & 2) != 0) {
            dfv dfvVar3 = gfvVar.f11224a;
            float f2 = uag0Var.c;
            ffv ffvVar2 = dfvVar3.f6018a;
            if (ffvVar2.U() != f2) {
                ffvVar2.J(f2);
            }
        }
        if ((i2 & 4) != 0) {
            gfvVar.f11224a.g(uag0Var.d);
        }
        if ((i2 & 8) != 0) {
            dfv dfvVar4 = gfvVar.f11224a;
            float f3 = uag0Var.e;
            ffv ffvVar3 = dfvVar4.f6018a;
            if (ffvVar3.O() != f3) {
                ffvVar3.R(f3);
            }
        }
        if ((i2 & 16) != 0) {
            dfv dfvVar5 = gfvVar.f11224a;
            float f4 = uag0Var.f;
            ffv ffvVar4 = dfvVar5.f6018a;
            if (ffvVar4.N() != f4) {
                ffvVar4.i(f4);
            }
        }
        if ((i2 & 32) != 0) {
            dfv dfvVar6 = gfvVar.f11224a;
            float f5 = uag0Var.g;
            ffv ffvVar5 = dfvVar6.f6018a;
            if (ffvVar5.T() != f5) {
                ffvVar5.G(f5);
                dfvVar6.g = true;
                dfvVar6.a();
            }
            if (uag0Var.g > 0.0f && !gfvVar.t && (function1 = gfvVar.e) != null) {
                function1.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            dfv dfvVar7 = gfvVar.f11224a;
            long j2 = uag0Var.h;
            ffv ffvVar6 = dfvVar7.f6018a;
            long jR = ffvVar6.r();
            int i4 = y3d.h;
            if (!h2t0.a(j2, jR)) {
                ffvVar6.u(j2);
            }
        }
        if ((i2 & 128) != 0) {
            dfv dfvVar8 = gfvVar.f11224a;
            long j3 = uag0Var.i;
            ffv ffvVar7 = dfvVar8.f6018a;
            long jT = ffvVar7.t();
            int i5 = y3d.h;
            if (!h2t0.a(j3, jT)) {
                ffvVar7.y(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            dfv dfvVar9 = gfvVar.f11224a;
            float f6 = uag0Var.l;
            ffv ffvVar8 = dfvVar9.f6018a;
            if (ffvVar8.q() != f6) {
                ffvVar8.H(f6);
            }
        }
        if ((i2 & 256) != 0) {
            dfv dfvVar10 = gfvVar.f11224a;
            float f7 = uag0Var.j;
            ffv ffvVar9 = dfvVar10.f6018a;
            if (ffvVar9.P() != f7) {
                ffvVar9.C(f7);
            }
        }
        if ((i2 & 512) != 0) {
            dfv dfvVar11 = gfvVar.f11224a;
            float f8 = uag0Var.k;
            ffv ffvVar10 = dfvVar11.f6018a;
            if (ffvVar10.o() != f8) {
                ffvVar10.E(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            dfv dfvVar12 = gfvVar.f11224a;
            float f9 = uag0Var.m;
            ffv ffvVar11 = dfvVar12.f6018a;
            if (ffvVar11.w() != f9) {
                ffvVar11.B(f9);
            }
        }
        if (i3 != 0) {
            j = 4294967295L;
            boolean zA = ils0.a(gfvVar.o, ils0.b);
            dfv dfvVar13 = gfvVar.f11224a;
            if (zA) {
                c = ' ';
                if (!ne60.c(dfvVar13.z, 9205357640488583168L)) {
                    dfvVar13.z = 9205357640488583168L;
                    dfvVar13.f6018a.M(9205357640488583168L);
                }
            } else {
                c = ' ';
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gfvVar.o & 4294967295L)) * ((int) (gfvVar.f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gfvVar.o >> 32)) * ((int) (gfvVar.f >> 32)))) << 32);
                if (!ne60.c(dfvVar13.z, jFloatToRawIntBits)) {
                    dfvVar13.z = jFloatToRawIntBits;
                    dfvVar13.f6018a.M(jFloatToRawIntBits);
                }
            }
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if ((i2 & 16384) != 0) {
            dfv dfvVar14 = gfvVar.f11224a;
            boolean z3 = uag0Var.p;
            if (dfvVar14.A != z3) {
                dfvVar14.A = z3;
                dfvVar14.g = true;
                dfvVar14.a();
            }
        }
        if ((131072 & i2) != 0) {
            dfv dfvVar15 = gfvVar.f11224a;
            p4 p4Var = uag0Var.v;
            ffv ffvVar12 = dfvVar15.f6018a;
            if (!Intrinsics.d(ffvVar12.h(), p4Var)) {
                ffvVar12.S(p4Var);
            }
        }
        if ((262144 & i2) != 0) {
            dfv dfvVar16 = gfvVar.f11224a;
            a4d a4dVar = uag0Var.w;
            ffv ffvVar13 = dfvVar16.f6018a;
            if (!Intrinsics.d(ffvVar13.m(), a4dVar)) {
                ffvVar13.A(a4dVar);
            }
        }
        if ((524288 & i2) != 0) {
            dfv dfvVar17 = gfvVar.f11224a;
            int i6 = uag0Var.x;
            ffv ffvVar14 = dfvVar17.f6018a;
            if (ffvVar14.D() != i6) {
                ffvVar14.j(i6);
            }
        }
        if ((32768 & i2) != 0) {
            dfv dfvVar18 = gfvVar.f11224a;
            int i7 = uag0Var.q;
            if (i7 == 0) {
                i = 0;
            } else if (i7 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i7 != 2) {
                    jf4.n("Not supported composition strategy");
                    return;
                }
            }
            ffv ffvVar15 = dfvVar18.f6018a;
            if (ffvVar15.l() != i) {
                ffvVar15.Q(i);
            }
        }
        if ((i2 & 7963) != 0) {
            gfvVar.q = true;
            gfvVar.r = true;
        }
        if (Intrinsics.d(gfvVar.p, uag0Var.y)) {
            e7zVar2 = e7zVar2;
            hie0Var = hie0Var;
            z2 = false;
        } else {
            x1x x1xVar = uag0Var.y;
            gfvVar.p = x1xVar;
            if (x1xVar == null) {
                e7zVar2 = e7zVar2;
                hie0Var = hie0Var;
            } else {
                dfv dfvVar19 = gfvVar.f11224a;
                if (x1xVar instanceof oe80) {
                    jge0 jge0Var = ((oe80) x1xVar).f25111a;
                    char c2 = c;
                    float f10 = jge0Var.f16474a;
                    float f11 = jge0Var.b;
                    dfvVar19.h(0.0f, (((long) Float.floatToRawIntBits(f10)) << c2) | (((long) Float.floatToRawIntBits(f11)) & j), (((long) Float.floatToRawIntBits(jge0Var.c - f10)) << c2) | (((long) Float.floatToRawIntBits(jge0Var.d - f11)) & j));
                } else {
                    char c3 = c;
                    if (x1xVar instanceof ne80) {
                        w03 w03Var = ((ne80) x1xVar).f23373a;
                        dfvVar19.k = null;
                        dfvVar19.i = 9205357640488583168L;
                        dfvVar19.h = 0L;
                        dfvVar19.j = 0.0f;
                        dfvVar19.g = true;
                        dfvVar19.n = false;
                        dfvVar19.l = w03Var;
                        dfvVar19.a();
                    } else {
                        if (!(x1xVar instanceof pe80)) {
                            t9f.b();
                            return;
                        }
                        pe80 pe80Var = (pe80) x1xVar;
                        w03 w03Var2 = pe80Var.b;
                        if (w03Var2 != null) {
                            dfvVar19.k = null;
                            dfvVar19.i = 9205357640488583168L;
                            dfvVar19.h = 0L;
                            dfvVar19.j = 0.0f;
                            dfvVar19.g = true;
                            dfvVar19.n = false;
                            dfvVar19.l = w03Var2;
                            dfvVar19.a();
                        } else {
                            wfg0 wfg0Var = pe80Var.f26840a;
                            dfvVar19.h(Float.intBitsToFloat((int) (wfg0Var.h >> c3)), (((long) Float.floatToRawIntBits(wfg0Var.f39069a)) << c3) | (((long) Float.floatToRawIntBits(wfg0Var.b)) & j), (((long) Float.floatToRawIntBits(wfg0Var.b())) << c3) | (((long) Float.floatToRawIntBits(wfg0Var.a())) & j));
                        }
                    }
                    if (Build.VERSION.SDK_INT < 33 && (((x1xVar instanceof ne80) || ((x1xVar instanceof pe80) && !r8x.S(((pe80) x1xVar).f26840a))) && (function0 = gfvVar.e) != null)) {
                        function0.invoke();
                    }
                }
                if (Build.VERSION.SDK_INT < 33) {
                    function0.invoke();
                }
            }
            z2 = true;
        }
        gfvVar.n = uag0Var.f35327a;
        if (i2 != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = androidComposeView.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(androidComposeView, androidComposeView);
                }
            } else {
                androidComposeView.invalidate();
            }
            if (AndroidComposeView.m()) {
                androidComposeView.N(0.0f);
            }
        }
        boolean z4 = this.y;
        this.y = uag0Var.p;
        this.Y = uag0Var.d;
        boolean z5 = b6zVar2.f2079a == b6zVar.f2079a && b6zVar2.b == b6zVar.b && b6zVar2.c == b6zVar.c && b6zVar2.d == b6zVar.d && b6zVar2.e == b6zVar.e && b6zVar2.f == b6zVar.f && b6zVar2.g == b6zVar.g && b6zVar2.h == b6zVar.h && ils0.a(b6zVar2.i, b6zVar.i);
        if (!z || (z5 && z4 == this.y && !hie0Var.f13108a)) {
            e7zVar = e7zVar2;
        } else {
            e7zVar = e7zVar2;
            cg80 cg80Var = e7zVar.o;
            if (cg80Var != null) {
                ((AndroidComposeView) cg80Var).w(e7zVar);
            }
        }
        if (z5) {
            return;
        }
        e7zVar.O(this);
        if (e7zVar.r1 > 0) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) h7z.a(e7zVar);
            kd30 kd30Var = (kd30) androidComposeView2.t1.f;
            if (e7zVar.r1 > 0) {
                ((xz40) kd30Var.f18086a).b(e7zVar);
                e7zVar.q1 = true;
            }
            androidComposeView2.G(null);
        }
    }

    @Override // a.j6z
    public final long I(j6z j6zVar, long j) {
        return F(j6zVar, j);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    public final boolean I1(long j) {
        boolean z;
        boolean z2;
        boolean zY;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        bg80 bg80Var = this.u1;
        if (bg80Var == null || !this.y) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        dfv dfvVar = ((gfv) bg80Var).f11224a;
        if (dfvVar.A) {
            x1x x1xVarE = dfvVar.e();
            if (x1xVarE instanceof oe80) {
                jge0 jge0Var = ((oe80) x1xVarE).f25111a;
                if (jge0Var.f16474a > fIntBitsToFloat || fIntBitsToFloat >= jge0Var.c || jge0Var.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= jge0Var.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (x1xVarE instanceof pe80) {
                wfg0 wfg0Var = ((pe80) x1xVarE).f26840a;
                float f = wfg0Var.f39069a;
                long j2 = wfg0Var.f;
                long j3 = wfg0Var.h;
                long j4 = wfg0Var.g;
                float f2 = wfg0Var.d;
                float f3 = wfg0Var.b;
                z = false;
                float f4 = wfg0Var.c;
                z2 = true;
                long j5 = wfg0Var.e;
                if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                    int i = (int) (j5 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= wfg0Var.b()) {
                        int i3 = (int) (j3 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= wfg0Var.b()) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= wfg0Var.a()) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= wfg0Var.a()) {
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i) + f;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i5) + f3;
                                    float fIntBitsToFloat5 = f4 - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i7) + f3;
                                    float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat8 = f2 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat9 = f2 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat10 = Float.intBitsToFloat(i3) + f;
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        zY = cww.y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, wfg0Var.e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        zY = cww.y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat10, fIntBitsToFloat9, wfg0Var.h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) {
                                        zY = (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) ? z2 : cww.y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, wfg0Var.g);
                                    } else {
                                        zY = cww.y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, wfg0Var.f);
                                    }
                                } else {
                                    w03 w03VarA = z03.a();
                                    w03.b(w03VarA, wfg0Var);
                                    zY = cww.x(fIntBitsToFloat, fIntBitsToFloat2, w03VarA);
                                }
                            } else {
                                w03 w03VarA2 = z03.a();
                                w03.b(w03VarA2, wfg0Var);
                                zY = cww.x(fIntBitsToFloat, fIntBitsToFloat2, w03VarA2);
                            }
                        } else {
                            w03 w03VarA3 = z03.a();
                            w03.b(w03VarA3, wfg0Var);
                            zY = cww.x(fIntBitsToFloat, fIntBitsToFloat2, w03VarA3);
                        }
                    } else {
                        w03 w03VarA4 = z03.a();
                        w03.b(w03VarA4, wfg0Var);
                        zY = cww.x(fIntBitsToFloat, fIntBitsToFloat2, w03VarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(x1xVarE instanceof ne80)) {
                    t9f.b();
                    return false;
                }
                zY = cww.x(fIntBitsToFloat, fIntBitsToFloat2, ((ne80) x1xVarE).f23373a);
            }
            zY = z;
        } else {
            z = false;
            z2 = true;
        }
        return zY ? z2 : z;
    }

    @Override // a.j6z
    public final void J(float[] fArr) {
        cg80 cg80VarA = h7z.a(this.u);
        s460 s460VarC1 = C1(k7x.C(this));
        F1(s460VarC1, fArr);
        if (cg80VarA instanceof vi30) {
            ((AndroidComposeView) ((vi30) cg80VarA)).q(fArr);
            return;
        }
        long jR = s460VarC1.R(0L);
        if ((9223372034707292159L & jR) != 9205357640488583168L) {
            ui30.g(fArr, Float.intBitsToFloat((int) (jR >> 32)), Float.intBitsToFloat((int) (jR & 4294967295L)));
        }
    }

    @Override // a.c810
    public final boolean J0() {
        return this.Z != null;
    }

    @Override // a.c810
    public final e7z L0() {
        return this.u;
    }

    @Override // a.c810
    public final uj30 N0() {
        uj30 uj30Var = this.Z;
        if (uj30Var != null) {
            return uj30Var;
        }
        jf4.n("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // a.c810
    public final c810 O0() {
        return this.w;
    }

    @Override // a.c810
    public final long P0() {
        return this.g1;
    }

    @Override // a.j6z
    public final long R(long j) {
        if (!g1().n) {
            xcx.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) h7z.a(this.u)).r(Y(j));
    }

    @Override // a.c810
    public final void T0() {
        dfv dfvVar = this.v1;
        long j = this.g1;
        if (dfvVar != null) {
            l0(j, this.h1, dfvVar);
        } else {
            n0(j, this.h1, this.z);
        }
    }

    @Override // a.j6z
    public final j6z U() {
        boolean z = g1().n;
        e7z e7zVar = this.u;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (e7z e7zVarV = e7zVar; e7zVarV != null; e7zVarV = e7zVarV.v()) {
                sb.append("\n|");
                sb.append(e7zVarV);
                sb.append(" isAttached=");
                sb.append(e7zVarV.I());
                sb.append(" modifier=");
                sb.append(e7zVarV.m1);
                sb.append(" tail=");
                sb.append(g1());
            }
            xcx.b(sb.toString());
        }
        q1();
        return ((s460) e7zVar.h1.e).w;
    }

    public final void V0(s460 s460Var, gz40 gz40Var, boolean z) {
        if (s460Var == this) {
            return;
        }
        s460 s460Var2 = this.w;
        if (s460Var2 != null) {
            s460Var2.V0(s460Var, gz40Var, z);
        }
        long j = this.g1;
        float f = (int) (j >> 32);
        gz40Var.b -= f;
        gz40Var.d -= f;
        float f2 = (int) (j & 4294967295L);
        gz40Var.c -= f2;
        gz40Var.e -= f2;
        bg80 bg80Var = this.u1;
        if (bg80Var != null) {
            gfv gfvVar = (gfv) bg80Var;
            float[] fArrA = gfvVar.a();
            if (!gfvVar.s) {
                if (fArrA == null) {
                    gz40Var.b = 0.0f;
                    gz40Var.c = 0.0f;
                    gz40Var.d = 0.0f;
                    gz40Var.e = 0.0f;
                } else {
                    ui30.c(fArrA, gz40Var);
                }
            }
            if (this.y && z) {
                long j2 = this.c;
                gz40Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long W0(s460 s460Var, long j) {
        if (s460Var == this) {
            return j;
        }
        s460 s460Var2 = this.w;
        return (s460Var2 == null || Intrinsics.d(s460Var, s460Var2)) ? d1(j) : d1(s460Var2.W0(s460Var, j));
    }

    public final long X0(long j) {
        float fE0;
        float fD0;
        if (h1()) {
            jge0 jge0Var = this.l1;
            fE0 = jge0Var.c - jge0Var.f16474a;
        } else {
            fE0 = e0();
        }
        if (h1()) {
            jge0 jge0Var2 = this.l1;
            fD0 = jge0Var2.d - jge0Var2.b;
        } else {
            fD0 = d0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fE0;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fD0;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // a.j6z
    public final long Y(long j) {
        if (!g1().n) {
            xcx.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        q1();
        while (this != null) {
            e7z e7zVar = this.u;
            if (this == ((s460) e7zVar.h1.e) && !e7zVar.c) {
                long jB = h7z.a(e7zVar).getRectManager().b(e7zVar);
                if (!ikx.b(jB, 9223372034707292159L)) {
                    return x1x.H(j, jB);
                }
            }
            bg80 bg80Var = this.u1;
            if (bg80Var != null) {
                gfv gfvVar = (gfv) bg80Var;
                float[] fArrB = gfvVar.b();
                if (!gfvVar.s) {
                    j = ui30.b(j, fArrB);
                }
            }
            j = x1x.H(j, this.g1);
            this = this.w;
        }
        return j;
    }

    public final float Y0(long j, long j2) {
        if (e0() >= Float.intBitsToFloat((int) (j2 >> 32)) && d0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jX0 = X0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jX0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jX0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - e0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - d0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void Z0(x5a x5aVar, dfv dfvVar) throws Throwable {
        bg80 bg80Var = this.u1;
        if (bg80Var == null) {
            long j = this.g1;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            x5aVar.g(f, f2);
            a1(x5aVar, dfvVar);
            x5aVar.g(-f, -f2);
            return;
        }
        gfv gfvVar = (gfv) bg80Var;
        a6a a6aVar = gfvVar.m;
        gfvVar.g();
        gfvVar.t = gfvVar.f11224a.f6018a.T() > 0.0f;
        nr nrVar = a6aVar.b;
        nrVar.E(x5aVar);
        nrVar.c = dfvVar;
        agc.I(a6aVar, gfvVar.f11224a);
    }

    public final void a1(x5a x5aVar, dfv dfvVar) throws Throwable {
        s460 s460Var;
        x5a x5aVar2;
        dfv dfvVar2;
        lm40 lm40VarI1 = i1(4);
        if (lm40VarI1 == null) {
            w1(x5aVar, dfvVar);
            return;
        }
        e7z e7zVar = this.u;
        e7zVar.getClass();
        g7z sharedDrawScope = h7z.a(e7zVar).getSharedDrawScope();
        long jQ = n2x.Q(this.c);
        sharedDrawScope.getClass();
        xz40 xz40Var = null;
        while (lm40VarI1 != null) {
            if (lm40VarI1 instanceof ehl) {
                s460Var = this;
                x5aVar2 = x5aVar;
                dfvVar2 = dfvVar;
                sharedDrawScope.b(x5aVar2, jQ, s460Var, (ehl) lm40VarI1, dfvVar2);
            } else {
                s460Var = this;
                x5aVar2 = x5aVar;
                dfvVar2 = dfvVar;
                if ((lm40VarI1.c & 4) != 0 && (lm40VarI1 instanceof f3k)) {
                    int i = 0;
                    for (lm40 lm40Var = ((f3k) lm40VarI1).p; lm40Var != null; lm40Var = lm40Var.f) {
                        if ((lm40Var.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                lm40VarI1 = lm40Var;
                            } else {
                                if (xz40Var == null) {
                                    xz40Var = new xz40(new lm40[16]);
                                }
                                if (lm40VarI1 != null) {
                                    xz40Var.b(lm40VarI1);
                                    lm40VarI1 = null;
                                }
                                xz40Var.b(lm40Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                x5aVar = x5aVar2;
                this = s460Var;
                dfvVar = dfvVar2;
            }
            lm40VarI1 = vcc.V(xz40Var);
            x5aVar = x5aVar2;
            this = s460Var;
            dfvVar = dfvVar2;
        }
    }

    public abstract void b1();

    public final s460 c1(s460 s460Var) {
        e7z e7zVarV = s460Var.u;
        e7z e7zVar = this.u;
        if (e7zVarV == e7zVar) {
            lm40 lm40VarG1 = s460Var.g1();
            lm40 lm40VarG2 = g1();
            if (!lm40VarG2.f20279a.n) {
                xcx.b("visitLocalAncestors called on an unattached node");
            }
            for (lm40 lm40Var = lm40VarG2.f20279a.e; lm40Var != null; lm40Var = lm40Var.e) {
                if ((lm40Var.c & 2) != 0 && lm40Var == lm40VarG1) {
                    return s460Var;
                }
            }
            return this;
        }
        while (e7zVarV.q > e7zVar.q) {
            e7zVarV = e7zVarV.v();
            e7zVarV.getClass();
        }
        e7z e7zVarV2 = e7zVar;
        while (e7zVarV2.q > e7zVarV.q) {
            e7zVarV2 = e7zVarV2.v();
            e7zVarV2.getClass();
        }
        while (e7zVarV != e7zVarV2) {
            e7zVarV = e7zVarV.v();
            e7zVarV2 = e7zVarV2.v();
            if (e7zVarV == null || e7zVarV2 == null) {
                jf4.o("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (e7zVarV2 != e7zVar) {
            if (e7zVarV != s460Var.u) {
                return (rdx) e7zVarV.h1.d;
            }
            return s460Var;
        }
        return this;
    }

    public final long d1(long j) {
        long j2 = this.g1;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        bg80 bg80Var = this.u1;
        if (bg80Var != null) {
            gfv gfvVar = (gfv) bg80Var;
            float[] fArrA = gfvVar.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!gfvVar.s) {
                return ui30.b(jFloatToRawIntBits, fArrA);
            }
        }
        return jFloatToRawIntBits;
    }

    public abstract e810 e1();

    public final long f1() {
        return this.A.G0(this.u.B.f());
    }

    @Override // a.j6z
    public final long g() {
        return this.c;
    }

    public abstract lm40 g1();

    @Override // a.w6k
    public final float getDensity() {
        return this.u.z.getDensity();
    }

    @Override // a.cnx
    public final k6z getLayoutDirection() {
        return this.u.A;
    }

    @Override // a.j6z
    public final boolean h() {
        return g1().n;
    }

    @Override // a.c810, a.dg80
    public final boolean h0() {
        return (this.u1 == null || this.x || !this.u.I()) ? false : true;
    }

    public final boolean h1() {
        return this.n1 && !this.l1.j();
    }

    public final lm40 i1(int i) {
        boolean zG = t460.g(i);
        lm40 lm40VarG1 = g1();
        if (!zG && (lm40VarG1 = lm40VarG1.e) == null) {
            return null;
        }
        for (lm40 lm40VarJ1 = j1(zG); lm40VarJ1 != null && (lm40VarJ1.d & i) != 0; lm40VarJ1 = lm40VarJ1.f) {
            if ((lm40VarJ1.c & i) != 0) {
                return lm40VarJ1;
            }
            if (lm40VarJ1 == lm40VarG1) {
                return null;
            }
        }
        return null;
    }

    @Override // a.j6z
    public final void j(j6z j6zVar, float[] fArr) {
        s460 s460VarC1 = C1(j6zVar);
        s460VarC1.q1();
        s460 s460VarC2 = c1(s460VarC1);
        ui30.d(fArr);
        s460VarC1.F1(s460VarC2, fArr);
        E1(s460VarC2, fArr);
    }

    public final lm40 j1(boolean z) {
        lm40 lm40VarG1;
        tzi tziVar = this.u.h1;
        if (((s460) tziVar.e) == this) {
            return (lm40) tziVar.g;
        }
        s460 s460Var = this.w;
        if (!z) {
            if (s460Var != null) {
                return s460Var.g1();
            }
            return null;
        }
        if (s460Var == null || (lm40VarG1 = s460Var.g1()) == null) {
            return null;
        }
        return lm40VarG1.f;
    }

    public final void k1(lm40 lm40Var, r460 r460Var, long j, raw rawVar, int i, boolean z) {
        if (lm40Var == null) {
            n1(r460Var, j, rawVar, i, z);
            return;
        }
        if (!r460Var.e(lm40Var)) {
            k1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z);
            return;
        }
        int i2 = rawVar.c;
        vy40 vy40Var = rawVar.f30156a;
        rawVar.c(i2 + 1, vy40Var.b);
        rawVar.c++;
        vy40Var.a(lm40Var);
        rawVar.b.a(vtb.l(-1.0f, z, false));
        k1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z);
        rawVar.c = i2;
    }

    @Override // a.pu90
    public void l0(long j, float f, dfv dfvVar) {
        x1(j, f, null, dfvVar);
        if (this.n) {
            return;
        }
        this.u.i1.p.H0();
    }

    public final void l1(lm40 lm40Var, r460 r460Var, long j, raw rawVar, int i, boolean z, float f) {
        if (lm40Var == null) {
            n1(r460Var, j, rawVar, i, z);
            return;
        }
        if (!r460Var.e(lm40Var)) {
            l1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z, f);
            return;
        }
        int i2 = rawVar.c;
        vy40 vy40Var = rawVar.f30156a;
        rawVar.c(i2 + 1, vy40Var.b);
        rawVar.c++;
        vy40Var.a(lm40Var);
        rawVar.b.a(vtb.l(f, z, false));
        v1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z, f, true);
        rawVar.c = i2;
    }

    @Override // a.j6z
    public final long m(long j) {
        if (!g1().n) {
            xcx.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        j6z j6zVarC = k7x.C(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) h7z.a(this.u);
        androidComposeView.B();
        return F(j6zVarC, ne60.e(ui30.b(j, androidComposeView.z1), j6zVarC.Y(0L)));
    }

    public final void m1(r460 r460Var, long j, raw rawVar, int i, boolean z) {
        boolean z2;
        vy40 vy40Var = rawVar.f30156a;
        lm40 lm40VarI1 = i1(r460Var.b());
        boolean z3 = false;
        if (!I1(j)) {
            if (i == 1) {
                float fY0 = Y0(j, f1());
                if ((Float.floatToRawIntBits(fY0) & Integer.MAX_VALUE) < 2139095040) {
                    if (rawVar.c != vy40Var.b - 1) {
                        if (acb.N(rawVar.b(), vtb.l(fY0, false, false)) <= 0) {
                            return;
                        }
                    }
                    l1(lm40VarI1, r460Var, j, rawVar, i, false, fY0);
                    return;
                }
                return;
            }
            return;
        }
        if (lm40VarI1 == null) {
            n1(r460Var, j, rawVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < e0() && fIntBitsToFloat2 < d0()) {
            k1(lm40VarI1, r460Var, j, rawVar, i, z);
            return;
        }
        float fY1 = i == 1 ? Y0(j, f1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fY1) & Integer.MAX_VALUE) < 2139095040) {
            if (rawVar.c == vy40Var.b - 1) {
                z2 = z;
            } else {
                z2 = z;
                if (acb.N(rawVar.b(), vtb.l(fY1, z2, false)) > 0) {
                }
            }
            z3 = true;
        } else {
            z2 = z;
        }
        v1(lm40VarI1, r460Var, j, rawVar, i, z2, fY1, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // a.pu90, a.pj30
    public final Object n() {
        e7z e7zVar = this.u;
        if (!e7zVar.h1.j(64)) {
            return null;
        }
        g1();
        mie0 mie0Var = new mie0();
        for (lm40 lm40Var = (wso0) e7zVar.h1.f; lm40Var != null; lm40Var = lm40Var.e) {
            if ((lm40Var.c & 64) != 0) {
                ?? V = lm40Var;
                ?? xz40Var = 0;
                while (V != 0) {
                    if (V instanceof fp80) {
                        mie0Var.f21842a = ((fp80) V).m(e7zVar.z, mie0Var.f21842a);
                    } else if ((V.c & 64) != 0 && (V instanceof f3k)) {
                        lm40 lm40Var2 = ((f3k) V).p;
                        int i = 0;
                        V = V;
                        xz40Var = xz40Var;
                        while (lm40Var2 != null) {
                            if ((lm40Var2.c & 64) != 0) {
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
        }
        return mie0Var.f21842a;
    }

    public void n1(r460 r460Var, long j, raw rawVar, int i, boolean z) {
        s460 s460Var = this.v;
        if (s460Var != null) {
            s460Var.m1(r460Var, s460Var.d1(j), rawVar, i, z);
        }
    }

    public final void o1() {
        bg80 bg80Var = this.u1;
        if (bg80Var != null) {
            ((gfv) bg80Var).c();
            return;
        }
        s460 s460Var = this.w;
        if (s460Var != null) {
            s460Var.o1();
        }
    }

    public final boolean p1() {
        if (this.u1 != null && this.Y <= 0.0f) {
            return true;
        }
        s460 s460Var = this.w;
        if (s460Var != null) {
            return s460Var.p1();
        }
        return false;
    }

    public final void q1() {
        this.u.i1.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v7, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void r1() {
        lm40 lm40VarG1;
        boolean zG = t460.g(128);
        lm40 lm40VarJ1 = j1(zG);
        if (lm40VarJ1 == null || (lm40VarJ1.f20279a.d & 128) == 0) {
            return;
        }
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            if (!zG) {
                lm40VarG1 = g1().e;
                if (lm40VarG1 == null) {
                }
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            }
            lm40VarG1 = g1();
            for (lm40 lm40VarJ2 = j1(zG); lm40VarJ2 != null && (lm40VarJ2.d & 128) != 0; lm40VarJ2 = lm40VarJ2.f) {
                if ((lm40VarJ2.c & 128) != 0) {
                    ?? V = lm40VarJ2;
                    ?? xz40Var = 0;
                    while (V != 0) {
                        if (V instanceof xj30) {
                            ((xj30) V).a(this.c);
                        } else if ((V.c & 128) != 0 && (V instanceof f3k)) {
                            lm40 lm40Var = ((f3k) V).p;
                            int i = 0;
                            V = V;
                            xz40Var = xz40Var;
                            while (lm40Var != null) {
                                if ((lm40Var.c & 128) != 0) {
                                    i++;
                                    xz40Var = xz40Var;
                                    if (i == 1) {
                                        V = lm40Var;
                                    } else {
                                        if (xz40Var == 0) {
                                            xz40Var = new xz40(new lm40[16]);
                                        }
                                        if (V != 0) {
                                            xz40Var.b(V);
                                            V = 0;
                                        }
                                        xz40Var.b(lm40Var);
                                    }
                                }
                                lm40Var = lm40Var.f;
                                V = V;
                                xz40Var = xz40Var;
                            }
                            if (i == 1) {
                            }
                        }
                        V = vcc.V(xz40Var);
                    }
                }
                if (lm40VarJ2 == lm40VarG1) {
                    break;
                }
            }
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
        } catch (Throwable th) {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void s1() {
        boolean zG = t460.g(4194304);
        lm40 lm40VarG1 = g1();
        if (!zG && (lm40VarG1 = lm40VarG1.e) == null) {
            return;
        }
        for (lm40 lm40VarJ1 = j1(zG); lm40VarJ1 != null && (lm40VarJ1.d & 4194304) != 0; lm40VarJ1 = lm40VarJ1.f) {
            if ((lm40VarJ1.c & 4194304) != 0) {
                ?? V = lm40VarJ1;
                ?? xz40Var = 0;
                while (V != 0) {
                    if (V instanceof g6z) {
                        ((g6z) V).N(this);
                    } else if ((V.c & 4194304) != 0 && (V instanceof f3k)) {
                        lm40 lm40Var = ((f3k) V).p;
                        int i = 0;
                        V = V;
                        xz40Var = xz40Var;
                        while (lm40Var != null) {
                            if ((lm40Var.c & 4194304) != 0) {
                                i++;
                                xz40Var = xz40Var;
                                if (i == 1) {
                                    V = lm40Var;
                                } else {
                                    if (xz40Var == 0) {
                                        xz40Var = new xz40(new lm40[16]);
                                    }
                                    if (V != 0) {
                                        xz40Var.b(V);
                                        V = 0;
                                    }
                                    xz40Var.b(lm40Var);
                                }
                            }
                            lm40Var = lm40Var.f;
                            V = V;
                            xz40Var = xz40Var;
                        }
                        if (i == 1) {
                        }
                    }
                    V = vcc.V(xz40Var);
                }
            }
            if (lm40VarJ1 == lm40VarG1) {
                return;
            }
        }
    }

    public final void t1() {
        this.x = true;
        this.s1.invoke();
        z1();
        if (ikx.b(this.g1, 0L)) {
            return;
        }
        this.u.O(this);
    }

    public final void u1() {
        boolean zG = t460.g(1048576);
        lm40 lm40VarJ1 = j1(zG);
        if (lm40VarJ1 == null || (lm40VarJ1.f20279a.d & 1048576) == 0) {
            return;
        }
        lm40 lm40VarG1 = g1();
        if (!zG && (lm40VarG1 = lm40VarG1.e) == null) {
            return;
        }
        for (lm40 lm40VarJ2 = j1(zG); lm40VarJ2 != null && (lm40VarJ2.d & 1048576) != 0; lm40VarJ2 = lm40VarJ2.f) {
            if ((lm40VarJ2.c & 1048576) != 0) {
                lm40 lm40VarV = lm40VarJ2;
                xz40 xz40Var = null;
                while (lm40VarV != null) {
                    if (lm40VarV instanceof nqq) {
                    } else if ((lm40VarV.c & 1048576) != 0 && (lm40VarV instanceof f3k)) {
                        int i = 0;
                        for (lm40 lm40Var = ((f3k) lm40VarV).p; lm40Var != null; lm40Var = lm40Var.f) {
                            if ((lm40Var.c & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    lm40VarV = lm40Var;
                                } else {
                                    if (xz40Var == null) {
                                        xz40Var = new xz40(new lm40[16]);
                                    }
                                    if (lm40VarV != null) {
                                        xz40Var.b(lm40VarV);
                                        lm40VarV = null;
                                    }
                                    xz40Var.b(lm40Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    lm40VarV = vcc.V(xz40Var);
                }
            }
            if (lm40VarJ2 == lm40VarG1) {
                return;
            }
        }
    }

    @Override // a.w6k
    public final float v0() {
        return this.u.z.v0();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01d3 A[PHI: r3
  0x01d3: PHI (r3v18 ??) = (r3v1 ??), (r3v1 ??), (r3v20 ??) binds: [B:59:0x019d, B:61:0x01a1, B:75:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r2v22, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public final void v1(lm40 lm40Var, r460 r460Var, long j, raw rawVar, int i, boolean z, float f, boolean z2) {
        char c;
        int i2;
        ?? V;
        vy40 vy40Var = rawVar.f30156a;
        if (lm40Var == null) {
            n1(r460Var, j, rawVar, i, z);
            return;
        }
        if (!r460Var.e(lm40Var)) {
            v1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z, f, z2);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r2 = lm40Var;
            ?? xz40Var = 0;
            while (r2 != 0) {
                if (r2 instanceof gpa0) {
                    long jD0 = ((gpa0) r2).d0();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    e7z e7zVar = this.u;
                    k6z k6zVar = e7zVar.A;
                    int i5 = dwr0.b;
                    long j2 = Long.MIN_VALUE & jD0;
                    if (j2 == 0 || k6zVar == k6z.f17794a) {
                        c = 30;
                        i2 = (int) jD0;
                    } else {
                        c = 30;
                        i2 = (int) (jD0 >> 30);
                    }
                    if (fIntBitsToFloat < (-(i2 & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= e0() + (((j2 == 0 || e7zVar.A == k6z.f17794a) ? (int) (jD0 >> c) : (int) jD0) & 32767)) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-(((int) (jD0 >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= (((int) (jD0 >> 45)) & 32767) + d0()) {
                        break;
                    }
                    iy40 iy40Var = rawVar.b;
                    int i7 = rawVar.c;
                    int i8 = vy40Var.b;
                    if (i7 == i8 - 1) {
                        rawVar.c(i7 + 1, i8);
                        rawVar.c++;
                        vy40Var.a(lm40Var);
                        iy40Var.a(vtb.l(0.0f, z, true));
                        v1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i3, z, f, z2);
                        rawVar.c = i7;
                        return;
                    }
                    long jB = rawVar.b();
                    int i9 = rawVar.c;
                    if (!acb.T(jB)) {
                        if (acb.R(jB) > 0.0f) {
                            int i10 = rawVar.c;
                            rawVar.c(i10 + 1, vy40Var.b);
                            rawVar.c++;
                            vy40Var.a(lm40Var);
                            iy40Var.a(vtb.l(0.0f, z, true));
                            v1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z, f, z2);
                            rawVar.c = i10;
                            return;
                        }
                        return;
                    }
                    int i11 = vy40Var.b;
                    int i12 = i11 - 1;
                    rawVar.c = i12;
                    rawVar.c(i11, vy40Var.b);
                    rawVar.c++;
                    vy40Var.a(lm40Var);
                    iy40Var.a(vtb.l(0.0f, z, true));
                    v1(a8k0.D(lm40Var, r460Var.b()), r460Var, j, rawVar, i, z, f, z2);
                    rawVar.c = i12;
                    if (acb.R(rawVar.b()) < 0.0f) {
                        rawVar.c(i9 + 1, rawVar.c + 1);
                    }
                    rawVar.c = i9;
                    return;
                }
                if ((r2.c & 16) == 0 || !(r2 instanceof f3k)) {
                    V = vcc.V(xz40Var);
                } else {
                    lm40 lm40Var2 = ((f3k) r2).p;
                    int i13 = 0;
                    V = r2;
                    xz40Var = xz40Var;
                    while (lm40Var2 != null) {
                        if ((lm40Var2.c & 16) != 0) {
                            i13++;
                            xz40Var = xz40Var;
                            if (i13 == 1) {
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
                    if (i13 != 1) {
                        V = vcc.V(xz40Var);
                    }
                }
                i3 = i;
                r2 = V;
                xz40Var = xz40Var;
            }
        }
        if (z2) {
            l1(lm40Var, r460Var, j, rawVar, i, z, f);
        } else {
            B1(lm40Var, r460Var, j, rawVar, i, z, f);
        }
    }

    @Override // a.j6z
    public final jge0 w(j6z j6zVar, boolean z) {
        if (!g1().n) {
            xcx.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!j6zVar.h()) {
            xcx.b("LayoutCoordinates " + j6zVar + " is not attached!");
        }
        s460 s460VarC1 = C1(j6zVar);
        s460VarC1.q1();
        s460 s460VarC2 = c1(s460VarC1);
        gz40 gz40Var = this.i1;
        if (gz40Var == null) {
            gz40Var = new gz40();
            this.i1 = gz40Var;
        }
        gz40Var.b = 0.0f;
        gz40Var.c = 0.0f;
        gz40Var.d = (int) (j6zVar.g() >> 32);
        gz40Var.e = (int) (j6zVar.g() & 4294967295L);
        while (s460VarC1 != s460VarC2) {
            s460VarC1.y1(gz40Var, z, false);
            if (gz40Var.b()) {
                return jge0.e;
            }
            s460VarC1 = s460VarC1.w;
            s460VarC1.getClass();
        }
        V0(s460VarC2, gz40Var, z);
        return new jge0(gz40Var.b, gz40Var.c, gz40Var.d, gz40Var.e);
    }

    public void w1(x5a x5aVar, dfv dfvVar) throws Throwable {
        e7z e7zVar = this.u;
        cg80 cg80VarA = h7z.a(e7zVar);
        xz40 xz40VarZ = e7zVar.z();
        Object[] objArr = xz40VarZ.f41739a;
        int i = xz40VarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar2 = (e7z) objArr[i2];
            if (e7zVar2.J()) {
                e7zVar2.j(x5aVar, dfvVar);
            }
        }
        if (cg80VarA.getShowLayoutBounds()) {
            ucs0 ucs0Var = rdx.F1;
            long j = this.c;
            x5aVar.m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, ucs0Var);
        }
    }

    public final void x1(long j, float f, Function1 function1, dfv dfvVar) {
        byte b = 0;
        e7z e7zVar = this.u;
        if (dfvVar != null) {
            if (function1 != null) {
                xcx.a("both ways to create layers shouldn't be used together");
            }
            if (this.v1 != dfvVar) {
                this.v1 = null;
                G1(null, false);
                this.v1 = dfvVar;
            }
            if (this.u1 == null) {
                cg80 cg80VarA = h7z.a(e7zVar);
                jt50 jt50Var = this.r1;
                if (jt50Var == null) {
                    jt50 jt50Var2 = new jt50(this, new p460(this, b), (byte) 5);
                    this.r1 = jt50Var2;
                    jt50Var = jt50Var2;
                }
                p460 p460Var = this.s1;
                bg80 bg80VarF = ((AndroidComposeView) cg80VarA).f(jt50Var, p460Var, dfvVar);
                gfv gfvVar = (gfv) bg80VarF;
                gfvVar.e(this.c);
                gfvVar.d(j);
                this.u1 = bg80VarF;
                e7zVar.l1 = true;
                p460Var.invoke();
            }
        } else {
            if (this.v1 != null) {
                this.v1 = null;
                G1(null, false);
            }
            G1(function1, false);
        }
        if (!ikx.b(this.g1, j)) {
            ((AndroidComposeView) h7z.a(e7zVar)).N(-4.0f);
            this.g1 = j;
            bg80 bg80Var = this.u1;
            if (bg80Var != null) {
                ((gfv) bg80Var).d(j);
            } else {
                s460 s460Var = this.w;
                if (s460Var != null) {
                    s460Var.o1();
                }
            }
            e7zVar.O(this);
            c810.R0(this);
            cg80 cg80Var = e7zVar.o;
            if (cg80Var != null) {
                ((AndroidComposeView) cg80Var).w(e7zVar);
            }
        }
        this.h1 = f;
        if (this == ((s460) e7zVar.h1.e) && !this.o) {
            h7z.a(e7zVar).getRectManager().g(e7zVar);
        }
        if (this.o) {
            return;
        }
        F0(N0());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    public final void y1(gz40 gz40Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        bg80 bg80Var = this.u1;
        if (bg80Var != null) {
            if (this.y) {
                if (z2) {
                    long jF1 = f1();
                    float f = gz40Var.b;
                    float f2 = gz40Var.c;
                    if (gz40Var.d >= 0.0f) {
                        long j = this.c;
                        if (f > ((int) (j >> 32)) || gz40Var.e < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jF1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF1 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (gz40Var.d - gz40Var.b)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (gz40Var.e - gz40Var.c)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.c;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jF1 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jF1 & 4294967295L);
                    gz40Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.c;
                    gz40Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (gz40Var.b()) {
                    return;
                }
            }
            gfv gfvVar = (gfv) bg80Var;
            float[] fArrB = gfvVar.b();
            if (!gfvVar.s) {
                if (fArrB == null) {
                    gz40Var.b = 0.0f;
                    gz40Var.c = 0.0f;
                    gz40Var.d = 0.0f;
                    gz40Var.e = 0.0f;
                } else {
                    ui30.c(fArrB, gz40Var);
                }
            }
        }
        long j4 = this.g1;
        float f9 = (int) (j4 >> 32);
        gz40Var.b += f9;
        gz40Var.d += f9;
        float f10 = (int) (j4 & 4294967295L);
        gz40Var.c += f10;
        gz40Var.e += f10;
    }

    public final void z1() {
        if (this.u1 != null) {
            if (this.v1 != null) {
                this.v1 = null;
            }
            G1(null, false);
            this.u.V(false);
        }
    }

    @Override // a.c810
    public final j6z I0() {
        return this;
    }
}
