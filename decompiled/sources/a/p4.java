package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RenderEffect;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p4 implements vde0, e83, b43, syw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26324a;
    public Object b;

    public p4(byte b) {
        this.f26324a = b;
        switch (b) {
            case 10:
                this.b = new cqj0();
                break;
            case 12:
                this.b = androidx.compose.runtime.e.e(Boolean.FALSE);
                break;
            case 16:
                this.b = new ConcurrentHashMap();
                break;
            default:
                ey40 ey40Var = hkx.f13229a;
                this.b = new ey40();
                break;
        }
    }

    public static int d1(int i, sjw0 sjw0Var) {
        int iI1 = i1(i << 3);
        int iE = sjw0Var.e();
        return ohs0.C(iE, iE, iI1);
    }

    public static int e1(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int i1(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static long j1(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void l0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public static int l1(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract Object A0();

    public boolean C0() {
        tnk0 tnk0VarC;
        rnk0 rnk0Var = (rnk0) this.b;
        View view = rnk0Var.c.l1;
        if (view != null) {
            tnk0.f34240a.getClass();
            tnk0VarC = cge0.c(view);
        } else {
            tnk0VarC = null;
        }
        tnk0 tnk0Var = rnk0Var.f30792a;
        if (tnk0VarC == tnk0Var) {
            return true;
        }
        tnk0 tnk0Var2 = tnk0.c;
        return (tnk0VarC == tnk0Var2 || tnk0Var == tnk0Var2) ? false : true;
    }

    public Map D0() {
        return Collections.EMPTY_MAP;
    }

    public void E0(String str, Exception exc) {
        str.getClass();
        ((wut0) ((vkr0) this.b).b).g.b(vv00.DEBUG, str, exc);
    }

    public void F0(Exception exc) {
        ((wut0) ((vkr0) this.b).b).g.b(vv00.WARNING, "", exc);
    }

    public abstract x3 G0(og9 og9Var);

    public p4 H0(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        cqj0 cqj0Var = (cqj0) this.b;
        cqj0Var.e = (iMin << 24) | (cqj0Var.e & 16777215);
        return B0();
    }

    public abstract void I0(Object obj);

    @Override // a.syw0
    public fxw0 J() {
        throw null;
    }

    public p4 J0(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        cqj0 cqj0Var = (cqj0) this.b;
        cqj0Var.d = (iMin << 24) | (cqj0Var.d & 16777215);
        return B0();
    }

    @Override // a.syw0
    public Context K() {
        throw null;
    }

    public abstract void M0(x3 x3Var);

    public int N0() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public abstract Object O0();

    public abstract void P0(byte b);

    public abstract void Q0(int i);

    public abstract void R0(int i, int i2);

    @Override // a.syw0
    public lwf S() {
        throw null;
    }

    public abstract void S0(int i, long j);

    public abstract void T0(int i, sjw0 sjw0Var);

    public abstract void U0(int i, String str);

    public abstract void V0(int i, boolean z);

    public abstract void W0(long j);

    public abstract void X0(byte[] bArr, int i, int i2);

    public Object Y0(lgx0 lgx0Var, wgm0 wgm0Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Object obj = concurrentHashMap.get(lgx0Var);
        if (obj != null) {
            return obj;
        }
        Object objO0 = O0();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(lgx0Var, objO0);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iY = wgm0Var.y();
        for (int i = 0; i < iY; i++) {
            if (xfx0.f.equals(wgm0Var.A(i))) {
                wgm0Var.B(i);
            }
        }
        return objO0;
    }

    public abstract void Z0(int i);

    public abstract void a1(int i, int i2);

    public abstract void b1(int i, long j);

    public abstract void c1(long j);

    public void f1() {
        if (N0() > 0) {
            jf4.n("Did not write as much data as expected.");
        } else {
            if (N0() >= 0) {
                return;
            }
            jf4.n("Wrote more data than expected.");
        }
    }

    @Override // a.b43
    public boolean g() {
        List list = (List) this.b;
        return list.isEmpty() || (list.size() == 1 && ((cmy) list.get(0)).c());
    }

    public abstract void g1(int i);

    @Override // a.e83
    public g93 getAnnotations() {
        g93 g93Var = (g93) this.b;
        if (g93Var != null) {
            return g93Var;
        }
        l0(1);
        throw null;
    }

    @Override // a.vde0, a.b3u0
    public wsy getType() {
        wsy wsyVar = (wsy) this.b;
        if (wsyVar != null) {
            return wsyVar;
        }
        k0(1);
        throw null;
    }

    public abstract void h1(int i, int i2);

    @Override // a.b43
    public List j0() {
        return (List) this.b;
    }

    public abstract void k1(int i, int i2);

    public abstract void m0(z220 z220Var);

    public void m1() {
        fxw0 fxw0Var = ((kxw0) this.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.m1();
    }

    public RenderEffect n0() {
        RenderEffect renderEffect = (RenderEffect) this.b;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectU0 = u0();
        this.b = renderEffectU0;
        return renderEffectU0;
    }

    public cqj0 o0() {
        cqj0 cqj0Var = (cqj0) this.b;
        boolean z = cqj0Var.f;
        int[] iArr = cqj0Var.b;
        if (!z) {
            int i = cqj0Var.e;
            iArr[0] = i;
            int i2 = cqj0Var.d;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
        } else {
            int i3 = cqj0Var.d;
            iArr[0] = i3;
            iArr[1] = i3;
            int i4 = cqj0Var.e;
            iArr[2] = i4;
            iArr[3] = i4;
        }
        float[] fArr = cqj0Var.f4796a;
        if (!z) {
            fArr[0] = Math.max(((1.0f - cqj0Var.k) - cqj0Var.l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - cqj0Var.k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((cqj0Var.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((cqj0Var.k + 1.0f) + cqj0Var.l) / 2.0f, 1.0f);
            return cqj0Var;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(cqj0Var.k, 1.0f);
        fArr[2] = Math.min(cqj0Var.k + cqj0Var.l, 1.0f);
        fArr[3] = 1.0f;
        return cqj0Var;
    }

    @Override // a.syw0
    public svs0 p() {
        throw null;
    }

    public j p0(ArrayList arrayList) {
        List arrayList2;
        int i = 2;
        ArrayList arrayList3 = new ArrayList(arrayList.size() * 2);
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            sgi0 sgi0Var = (sgi0) arrayList.get(i3);
            IntRange intRange = sgi0Var.f32162a;
            int i4 = intRange.f46068a;
            int i5 = intRange.b;
            arrayList3.add(new fqs0(i4, i3, sgi0Var));
            if (i5 != i4) {
                arrayList3.add(new fqs0(i5, i3, sgi0Var));
            }
        }
        v3d.t(new gi2(new y43(i, (byte) 4), (byte) 7), arrayList3);
        ty40 ty40Var = new ty40();
        ArrayList arrayList4 = (ArrayList) ty40Var.b;
        if (arrayList3.isEmpty()) {
            throw new byw("nonsense");
        }
        if (!((fqs0) CollectionsKt.U(arrayList3)).c.equals(((fqs0) CollectionsKt.d0(arrayList3)).c)) {
            StringBuilder sb = new StringBuilder("more than one root?\nfirst: ");
            sb.append(((fqs0) CollectionsKt.U(arrayList3)).c);
            sgi0 sgi0Var2 = ((fqs0) CollectionsKt.d0(arrayList3)).c;
            sb.append("\nlast: ");
            sb.append(sgi0Var2);
            throw new byw(sb.toString());
        }
        int size2 = arrayList3.size();
        while (true) {
            if (i2 >= size2) {
                c99.l("markers stack should close some time thus would not be here!");
                return null;
            }
            fqs0 fqs0Var = (fqs0) arrayList3.get(i2);
            v0(fqs0Var, arrayList4.isEmpty() ? null : (List) ((Pair) CollectionsKt.d0(ty40Var)).b);
            boolean zC = fqs0Var.c();
            sgi0 sgi0Var3 = fqs0Var.c;
            if (zC) {
                ty40Var.add(new Pair(fqs0Var, new ArrayList()));
            } else {
                if (fqs0Var.b()) {
                    arrayList2 = new ArrayList();
                } else {
                    Object objD0 = CollectionsKt.d0(ty40Var);
                    ty40Var.remove(arrayList4.size() - 1);
                    Pair pair = (Pair) objD0;
                    if (!((fqs0) pair.f46059a).c.equals(sgi0Var3)) {
                        throw new byw("Intersecting parsed nodes detected: " + ((fqs0) pair.f46059a).c + " vs " + sgi0Var3);
                    }
                    arrayList2 = (List) pair.b;
                }
                boolean zIsEmpty = arrayList4.isEmpty();
                eqs0 eqs0VarS0 = s0(fqs0Var, arrayList2, zIsEmpty);
                if (zIsEmpty) {
                    if (i2 + 1 == arrayList3.size()) {
                        return eqs0VarS0.f8252a;
                    }
                    throw new byw("");
                }
                ((List) ((Pair) CollectionsKt.d0(ty40Var)).b).add(eqs0VarS0);
            }
            i2++;
        }
    }

    public abstract Object q0(td9 td9Var);

    @Override // a.syw0
    public uuw0 r() {
        throw null;
    }

    public p4 r0(TypedArray typedArray) {
        cqj0 cqj0Var = (cqj0) this.b;
        if (typedArray.hasValue(3)) {
            cqj0Var.n = typedArray.getBoolean(3, cqj0Var.n);
        }
        if (typedArray.hasValue(0)) {
            cqj0Var.o = typedArray.getBoolean(0, cqj0Var.o);
        }
        if (typedArray.hasValue(1)) {
            H0(typedArray.getFloat(1, 0.3f));
        }
        if (typedArray.hasValue(11)) {
            J0(typedArray.getFloat(11, 1.0f));
        }
        if (typedArray.hasValue(7)) {
            long j = typedArray.getInt(7, (int) cqj0Var.s);
            if (j < 0) {
                jf4.o(h97.h(j, "Given a negative duration: "));
                return null;
            }
            cqj0Var.s = j;
        }
        if (typedArray.hasValue(14)) {
            cqj0Var.q = typedArray.getInt(14, cqj0Var.q);
        }
        if (typedArray.hasValue(15)) {
            long j2 = typedArray.getInt(15, (int) cqj0Var.t);
            if (j2 < 0) {
                jf4.o(h97.h(j2, "Given a negative repeat delay: "));
                return null;
            }
            cqj0Var.t = j2;
        }
        if (typedArray.hasValue(16)) {
            cqj0Var.r = typedArray.getInt(16, cqj0Var.r);
        }
        if (typedArray.hasValue(5)) {
            int i = typedArray.getInt(5, cqj0Var.c);
            if (i == 1) {
                cqj0Var.c = (byte) 1;
            } else if (i == 2) {
                cqj0Var.c = (byte) 2;
            } else if (i != 3) {
                cqj0Var.c = (byte) 0;
            } else {
                cqj0Var.c = (byte) 3;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, cqj0Var.f ? 1 : 0) != 1) {
                cqj0Var.f = false;
            } else {
                cqj0Var.f = true;
            }
        }
        if (typedArray.hasValue(6)) {
            float f = typedArray.getFloat(6, cqj0Var.l);
            if (f < 0.0f) {
                v4i0.h(f, "Given invalid dropoff value: ");
                return null;
            }
            cqj0Var.l = f;
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, cqj0Var.g);
            if (dimensionPixelSize < 0) {
                jf4.o(twn.m(dimensionPixelSize, "Given invalid width: "));
                return null;
            }
            cqj0Var.g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, cqj0Var.h);
            if (dimensionPixelSize2 < 0) {
                jf4.o(twn.m(dimensionPixelSize2, "Given invalid height: "));
                return null;
            }
            cqj0Var.h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            float f2 = typedArray.getFloat(13, cqj0Var.k);
            if (f2 < 0.0f) {
                v4i0.h(f2, "Given invalid intensity value: ");
                return null;
            }
            cqj0Var.k = f2;
        }
        if (typedArray.hasValue(19)) {
            float f3 = typedArray.getFloat(19, cqj0Var.i);
            if (f3 < 0.0f) {
                v4i0.h(f3, "Given invalid width ratio: ");
                return null;
            }
            cqj0Var.i = f3;
        }
        if (typedArray.hasValue(10)) {
            float f4 = typedArray.getFloat(10, cqj0Var.j);
            if (f4 < 0.0f) {
                v4i0.h(f4, "Given invalid height ratio: ");
                return null;
            }
            cqj0Var.j = f4;
        }
        if (typedArray.hasValue(18)) {
            cqj0Var.m = typedArray.getFloat(18, cqj0Var.m);
        }
        return B0();
    }

    public eqs0 s0(fqs0 fqs0Var, List list, boolean z) {
        fr20 fr20Var = cy2.j0;
        peg0 peg0Var = (peg0) this.b;
        list.getClass();
        sgi0 sgi0Var = fqs0Var.c;
        ar20 ar20Var = sgi0Var.b;
        IntRange intRange = sgi0Var.f32162a;
        int i = intRange.f46068a;
        int i2 = intRange.b;
        if (ar20Var != null && ar20Var.b) {
            return new eqs0((j) CollectionsKt.U(peg0Var.h(ar20Var, i, i2)), i, i2);
        }
        ArrayList arrayList = new ArrayList(list.size());
        eqs0 eqs0Var = (eqs0) CollectionsKt.firstOrNull(list);
        int i3 = eqs0Var != null ? eqs0Var.b : i2;
        if (i != i3) {
            arrayList.addAll(peg0Var.h(fr20Var, i, i3));
        }
        int size = list.size();
        for (int i4 = 1; i4 < size; i4++) {
            eqs0 eqs0Var2 = (eqs0) list.get(i4 - 1);
            eqs0 eqs0Var3 = (eqs0) list.get(i4);
            arrayList.add(eqs0Var2.f8252a);
            int i5 = eqs0Var2.c;
            int i6 = eqs0Var3.b;
            if (i5 != i6) {
                arrayList.addAll(peg0Var.h(fr20Var, i5, i6));
            }
        }
        if (!list.isEmpty()) {
            arrayList.add(((eqs0) CollectionsKt.d0(list)).f8252a);
            int i7 = ((eqs0) CollectionsKt.d0(list)).c;
            if (i7 != i2) {
                arrayList.addAll(peg0Var.h(fr20Var, i7, i2));
            }
        }
        return new eqs0(peg0Var.g(ar20Var, arrayList), i, i2);
    }

    public abstract x3 t0(x3 x3Var);

    public String toString() {
        switch (this.f26324a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public abstract RenderEffect u0();

    public void v0(fqs0 fqs0Var, List list) {
        fqs0Var.getClass();
    }

    public abstract kbz w0(int i, int i2, int i3, long j);

    public String x0() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public abstract Object y0();

    public List z0(jbz jbzVar, int i, long j) {
        ey40 ey40Var = (ey40) this.b;
        List list = (List) ey40Var.b(i);
        if (list != null) {
            return list;
        }
        List listA = jbzVar.a(i);
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        int iE = 0;
        while (iE < size) {
            iE = w6x.e((pj30) listA.get(iE), j, arrayList, iE, 1);
        }
        ey40Var.j(i, arrayList);
        return arrayList;
    }

    public p4 B0() {
        return this;
    }

    public void L0() {
    }

    public void K0(oms0 oms0Var) {
    }

    public /* synthetic */ p4(Object obj, byte b) {
        this.f26324a = b;
        this.b = obj;
    }

    public p4(kxw0 kxw0Var) {
        this.f26324a = (byte) 15;
        s0x.H(kxw0Var);
        this.b = kxw0Var;
    }

    public p4(g93 g93Var) {
        this.f26324a = (byte) 1;
        if (g93Var != null) {
            this.b = g93Var;
        } else {
            l0(0);
            throw null;
        }
    }

    public p4(wsy wsyVar) {
        this.f26324a = (byte) 0;
        if (wsyVar != null) {
            this.b = wsyVar;
        } else {
            k0(0);
            throw null;
        }
    }

    public /* synthetic */ p4(byte b, boolean z) {
        this.f26324a = b;
    }

    public p4(rnk0 rnk0Var) {
        this.f26324a = (byte) 4;
        rnk0Var.getClass();
        this.b = rnk0Var;
    }
}
