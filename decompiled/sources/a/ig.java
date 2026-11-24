package a;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pair[] f14711a;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        f14711a = new Pair[]{new Pair(fValueOf, new y3d(staticColors.m121getTransparent0d7_KjU())), new Pair(Float.valueOf(0.5f), new y3d(staticColors.m127getWhite300d7_KjU())), new Pair(Float.valueOf(1.0f), new y3d(staticColors.m121getTransparent0d7_KjU()))};
    }

    public static final mm40 a(fet fetVar, mm40 mm40Var) {
        mm40Var.getClass();
        zcl zclVar = qmk.f28987a;
        byte b = 1;
        final boolean z = fetVar.k(bmd.n) == k6z.b;
        double d = z ? -30.0d : 30.0d;
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = androidx.compose.runtime.e.e(new qkx(0L));
            fetVar.o0(objP);
        }
        final pz40 pz40Var = (pz40) objP;
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            objP2 = xf0.c(0.0f);
            fetVar.o0(objP2);
        }
        final t33 t33Var = (t33) objP2;
        boolean zH = fetVar.h(z);
        Object objP3 = fetVar.P();
        if (zH || objP3 == obj) {
            objP3 = Double.valueOf(Math.toRadians(d));
            fetVar.o0(objP3);
        }
        final double dDoubleValue = ((Number) objP3).doubleValue();
        qkx qkxVar = new qkx(((qkx) pz40Var.getValue()).f28908a);
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zH2 = fetVar.h(z) | fetVar.i(t33Var);
        Object objP4 = fetVar.P();
        if (zH2 || objP4 == obj) {
            objP4 = new hg(z, t33Var, pz40Var, null);
            fetVar.o0(objP4);
        }
        m0x0.v(qkxVar, boolValueOf, (Function2) objP4, fetVar);
        Object objP5 = fetVar.P();
        if (objP5 == obj) {
            objP5 = new we(pz40Var, b);
            fetVar.o0(objP5);
        }
        mm40 mm40VarY = fre0.Y(mm40Var, (Function1) objP5);
        boolean zC = fetVar.c(dDoubleValue) | fetVar.i(t33Var) | fetVar.h(z) | fetVar.d(10.0f);
        Object objP6 = fetVar.P();
        if (zC || objP6 == obj) {
            objP6 = new Function1() { // from class: a.gg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    pz40 pz40Var2 = pz40Var;
                    g7z g7zVar = (g7z) obj2;
                    g7zVar.getClass();
                    g7zVar.a();
                    a6a a6aVar = g7zVar.f10839a;
                    if (Float.intBitsToFloat((int) (a6aVar.d() >> 32)) > 0.0f && Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)) > 0.0f) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)) * 2.0f;
                        double d2 = (float) dDoubleValue;
                        float fCos = ((float) Math.cos(d2)) * fIntBitsToFloat;
                        float fSin = fIntBitsToFloat * ((float) Math.sin(d2));
                        float fFloatValue = ((Number) t33Var.d()).floatValue();
                        float f = z ? (-fSin) / 2.0f : 0.0f;
                        float f2 = fCos + fFloatValue;
                        float f3 = fSin + f;
                        float fW0 = g7zVar.w0(10.0f);
                        w03 w03VarA = z03.a();
                        w03.b(w03VarA, r8x.t(0.0f, 0.0f, Float.intBitsToFloat((int) (a6aVar.d() >> 32)), Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)), fW0, fW0));
                        nr nrVar = a6aVar.b;
                        long jP = nrVar.p();
                        nrVar.i().l();
                        try {
                            ((fvt0) nrVar.b).i(w03VarA);
                            Pair[] pairArr = ig.f14711a;
                            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                            ArrayList arrayList = new ArrayList(pairArr2.length);
                            for (Pair pair : pairArr2) {
                                y3d y3dVar = (y3d) pair.b;
                                long j = y3dVar.f41946a;
                                arrayList.add(y3dVar);
                            }
                            ArrayList arrayList2 = new ArrayList(pairArr2.length);
                            for (Pair pair2 : pairArr2) {
                                arrayList2.add(Float.valueOf(((Number) pair2.f46059a).floatValue()));
                            }
                            fhl.r(g7zVar, new e900(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2), 0L, n2x.Q(((qkx) pz40Var2.getValue()).f28908a), 0.0f, null, null, 3, 58);
                        } finally {
                            defpackage.c.g(nrVar, jP);
                        }
                    }
                    return Unit.f46060a;
                }
            };
            fetVar.o0(objP6);
        }
        return rq8.M(mm40VarY, (Function1) objP6);
    }
}
