package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ny2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24310a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ny2(float f, Object obj, Object obj2, byte b) {
        this.f24310a = b;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0599 A[PHI: r1
  0x0599: PHI (r1v40 float) = (r1v37 float), (r1v45 float) binds: [B:109:0x05b1, B:103:0x0596] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v31, types: [a.ne60] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue;
        byte b = this.f24310a;
        byte b2 = 25;
        byte b3 = 12;
        byte b4 = 28;
        byte b5 = 2;
        byte b6 = 3;
        byte b7 = 8;
        byte b8 = 0;
        byte b9 = 1;
        float f = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                vz2 vz2Var = (vz2) obj3;
                m78 m78Var = (m78) obj2;
                g7z g7zVar = (g7z) obj;
                g7zVar.a();
                nr nrVar = g7zVar.f10839a.b;
                long jP = nrVar.p();
                nrVar.i().l();
                try {
                    fvt0 fvt0Var = (fvt0) nrVar.b;
                    fvt0Var.A(f, 0.0f);
                    fvt0Var.y(45.0f, 0L);
                    fhl.m0(g7zVar, vz2Var, 0L, 0.0f, m78Var, 0, 46);
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVar, jP);
                }
            case 1:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                a4x a4xVar = ((wmh) obj3).f39406a;
                i8zVar.e(a4xVar.size(), new vtf(new p1h((byte) 17), a4xVar, (byte) 7), null, new dx8(a4xVar, (byte) 28), new ugd(-1942245546, true, new umh(a4xVar, f, (Function1) obj2, (byte) 0)));
                return Unit.f46060a;
            case 2:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar2 = ((zpl) obj3).c;
                hczVar.f(a4xVar2.size(), new bzh(xdx.E(a4xVar2, new m7h((byte) 27)), (byte) 3), new vtf(new m7h(b4), a4xVar2, (byte) 13), new ugd(-1311333631, true, new p0i(a4xVar2, f, (Function2) obj2, (byte) 0)));
                return Unit.f46060a;
            case 3:
                wom womVar = (wom) obj3;
                yjj0 yjj0Var = (yjj0) obj2;
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                boolean z = womVar.c() > 0.0f || ((Boolean) ((hgk0) womVar.c).getValue()).booleanValue();
                uag0Var.I((womVar.c() * uag0Var.T(f)) - Float.intBitsToFloat((int) (uag0Var.r & 4294967295L)));
                uag0Var.C(z ? uag0Var.t.getDensity() * mom.c : 0.0f);
                uag0Var.D(yjj0Var);
                uag0Var.g(true);
                return Unit.f46060a;
            case 4:
                agk0 agk0Var = (agk0) obj3;
                pz40 pz40Var = (pz40) obj2;
                t33 t33Var = (t33) obj;
                if (((Number) ((hgk0) t33Var.e).getValue()).floatValue() == ((Number) t33Var.d()).floatValue()) {
                    fah0 fah0Var = (fah0) pz40Var.getValue();
                    if (fah0Var != null) {
                        if (fah0Var instanceof z9h0) {
                            f = 0.0f;
                        } else if (!(fah0Var instanceof cah0)) {
                            t9f.b();
                            return null;
                        }
                    }
                    agk0Var.m(f);
                }
                return Unit.f46060a;
            case 5:
                pz40 pz40Var2 = (pz40) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar3 = ((kcv0) pz40Var2.getValue()).f18080a;
                hczVar2.f(a4xVar3.size(), new far(xdx.E(a4xVar3, new umu(b7)), (byte) 11), new ubn(a4xVar3, (byte) 5), new ugd(-1311333631, true, new vgv(a4xVar3, pz40Var2, f, (Function1) obj2)));
                return Unit.f46060a;
            case 6:
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                a4x a4xVar4 = ((wjw) obj3).f39283a;
                i8zVar2.e(a4xVar4.size(), new d2p(new x2w((byte) 16), a4xVar4, (byte) 23), null, new far(a4xVar4, (byte) 19), new ugd(-1942245546, true, new p0i(a4xVar4, f, (Function2) obj2, b9)));
                return Unit.f46060a;
            case 7:
                jie0 jie0Var = (jie0) obj3;
                u8z u8zVar = (u8z) obj2;
                i73 i73Var = (i73) obj;
                if (f > 0.0f) {
                    fFloatValue = ((Number) ((hgk0) i73Var.e).getValue()).floatValue();
                    if (fFloatValue <= f) {
                        f = fFloatValue;
                    }
                } else if (f < 0.0f) {
                    fFloatValue = ((Number) ((hgk0) i73Var.e).getValue()).floatValue();
                    if (fFloatValue >= f) {
                        f = fFloatValue;
                    }
                } else {
                    f = 0.0f;
                }
                float f2 = f - jie0Var.f16571a;
                if (f2 != u8zVar.a(f2) || f != ((Number) ((hgk0) i73Var.e).getValue()).floatValue()) {
                    i73Var.a();
                }
                jie0Var.f16571a += f2;
                return Unit.f46060a;
            case 8:
                w03 w03Var = (w03) obj3;
                a4x a4xVar5 = (a4x) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                nr nrVarA0 = fhlVar.A0();
                long jP2 = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).i(w03Var);
                    int i = 0;
                    float f3 = 0.0f;
                    for (Object obj4 : a4xVar5) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        float fFloatValue2 = (((Number) obj4).floatValue() / f) * Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        if (fFloatValue2 > 0.5f) {
                            int i3 = i % 3;
                            fhl.u(fhlVar, i3 != 0 ? i3 != 1 ? StaticColors.INSTANCE.m132getYellow0d7_KjU() : StaticColors.INSTANCE.m81getDarkBlue0d7_KjU() : StaticColors.INSTANCE.m98getGreen0d7_KjU(), (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)))) & 4294967295L), 0.0f, null, null, 0, 120);
                        }
                        f3 += fFloatValue2;
                        i = i2;
                    }
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVarA0, jP2);
                }
            case 9:
                a4x a4xVar6 = (a4x) obj3;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hczVar3.f(a4xVar6.size(), new ygy(new o240((byte) 15), a4xVar6, b2), new ap30(a4xVar6, (byte) 16), new ugd(2039820996, true, new p0i(a4xVar6, f, (Function2) obj2, b5)));
                return Unit.f46060a;
            case 10:
                a4x a4xVar7 = (a4x) obj3;
                i8z i8zVar3 = (i8z) obj;
                i8zVar3.getClass();
                i8zVar3.e(a4xVar7.size(), new zu90((byte) 22, new ljc0(b3), a4xVar7), null, new zu90((byte) 23, new ljc0((byte) 13), a4xVar7), new ugd(-1117249557, true, new umh(a4xVar7, f, (Function1) obj2, b5)));
                return Unit.f46060a;
            case 11:
                ArrayList arrayList = (ArrayList) obj3;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(arrayList.size(), null, new j13(arrayList, (byte) 22, false), new ugd(802480018, true, new ub90(arrayList, f, (Function2) obj2)));
                return Unit.f46060a;
            case 12:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.G(osm0.e(0.8f, 0.8f));
                uag0Var2.I(((Number) ((t33) obj3).d()).floatValue() * f);
                uag0Var2.v(((Number) ((t33) obj2).d()).floatValue());
                return Unit.f46060a;
            case 13:
                mch0 mch0Var = (mch0) obj3;
                g9q0 g9q0Var = (g9q0) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) / (pzw.K(mch0Var) * 8);
                a4x a4xVar8 = mch0Var.b;
                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar8, 10));
                Iterator it = a4xVar8.iterator();
                int i4 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    float f4 = this.b;
                    if (!zHasNext) {
                        w03 w03VarA = z03.a();
                        ne60 ne60Var = (ne60) CollectionsKt.firstOrNull(arrayList2);
                        float fIntBitsToFloat2 = ne60Var != null ? Float.intBitsToFloat((int) (ne60Var.f23370a >> 32)) : 0.0f;
                        ne60 ne60Var2 = (ne60) CollectionsKt.firstOrNull(arrayList2);
                        w03VarA.f(fIntBitsToFloat2, ne60Var2 != null ? Float.intBitsToFloat((int) (ne60Var2.f23370a & 4294967295L)) : 0.0f);
                        int size = arrayList2.size() - 1;
                        int i5 = 0;
                        while (i5 < size) {
                            ne60 ne60Var3 = (ne60) arrayList2.get(i5);
                            long j = ne60Var3.f23370a;
                            int i6 = i5 + 1;
                            ?? r9 = (ne60) arrayList2.get(i6);
                            long j2 = r9.f23370a;
                            int i7 = i5 - 1;
                            int i8 = size;
                            Object obj5 = ne60Var3;
                            if (i7 >= 0) {
                                obj5 = ne60Var3;
                                if (i7 < arrayList2.size()) {
                                    obj5 = arrayList2.get(i7);
                                }
                            }
                            long j3 = ((ne60) obj5).f23370a;
                            int i9 = i5 + 2;
                            if (i9 >= 0 && i9 < arrayList2.size()) {
                                r9 = arrayList2.get(i9);
                            }
                            long j4 = ((ne60) r9).f23370a;
                            long jF = ne60.f(j, ne60.b(8.0f, ne60.e(j2, j3)));
                            long jE = ne60.e(j2, ne60.b(8.0f, ne60.e(j4, j)));
                            w03VarA.f38329a.cubicTo(Float.intBitsToFloat((int) (jF >> 32)), Float.intBitsToFloat((int) (jF & 4294967295L)), Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jE & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
                            size = i8;
                            i5 = i6;
                            f4 = f4;
                        }
                        float f5 = f4;
                        w03 w03VarA2 = z03.a();
                        w03.a(w03VarA2, w03VarA);
                        w03VarA2.e(Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)), Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)));
                        w03VarA2.e(0.0f, Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)));
                        w03VarA2.c();
                        w03 w03VarA3 = z03.a();
                        w03.a(w03VarA3, w03VarA);
                        w03VarA3.e(Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)), 0.0f);
                        w03VarA3.e(0.0f, 0.0f);
                        w03VarA3.c();
                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar8, 10));
                        Iterator it2 = a4xVar8.iterator();
                        while (it2.hasNext()) {
                            String strValueOf = String.valueOf(((nch0) it2.next()).b);
                            zcl zclVar = qmk.f28987a;
                            int density = (int) (pi9Var.getDensity() * 12.0f);
                            arrayList3.add(g9q0.a(g9q0Var, strValueOf, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), 2, 1, lgb.O(0, (int) (pi9Var.getDensity() * 32.0f), density, density), null, 968));
                        }
                        return pi9Var.a(new vta(mch0Var, w03VarA, w03VarA2, w03VarA3, arrayList3, f5));
                    }
                    Object next = it.next();
                    int i10 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    float f6 = fIntBitsToFloat;
                    arrayList2.add(new ne60((((long) Float.floatToRawIntBits(((-((nch0) next).f23294a) * f6) + (Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits((pi9Var.getDensity() * f4) * i4)) << 32)));
                    fIntBitsToFloat = f6;
                    i4 = i10;
                }
                break;
            case 14:
                i8z i8zVar4 = (i8z) obj;
                i8zVar4.getClass();
                a4x a4xVar9 = ((ier0) obj3).f14648a;
                i8zVar4.e(a4xVar9.size(), new pwe0(new ejk0((byte) 22), a4xVar9, (byte) 29), null, new o3l0(new ejk0((byte) 23), a4xVar9, b8), new ugd(-1117249557, true, new umh(a4xVar9, f, (Function1) obj2, b6)));
                return Unit.f46060a;
            case 15:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                a4x a4xVar10 = ((qxl0) obj3).f29490a;
                hczVar5.f(a4xVar10.size(), new y9k0(xdx.E(a4xVar10, new f8l0(b3)), (byte) 25), new y9k0(a4xVar10, (byte) 26), new ugd(-1311333631, true, new p0i(a4xVar10, f, (Function2) obj2, b6)));
                return Unit.f46060a;
            case 16:
                ((ou90) obj).g((pu90) obj3, ((vj30) obj2).T(f), 0, 0.0f);
                return Unit.f46060a;
            case 17:
                List list = (List) obj3;
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                hczVar6.f(list.size(), new adn0(xdx.E(list, new meo0(b9)), (byte) 3), new adn0(list, (byte) 4), new ugd(-1311333631, true, new umh(list, (Function1) obj2, f)));
                return Unit.f46060a;
            case 18:
                pu90 pu90Var = (pu90) obj3;
                ou90 ou90Var = (ou90) obj;
                t33 t33Var2 = ((jdq0) obj2).s;
                ou90Var.m(pu90Var, t33Var2 != null ? (int) ((Number) t33Var2.d()).floatValue() : (int) f, 0, 0.0f);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hcz hczVar7 = (hcz) obj;
                hczVar7.getClass();
                ArrayList arrayList4 = ((gij) obj3).b;
                hczVar7.f(arrayList4.size(), new zcn0(new t9r0(b5), arrayList4, (byte) 20), new t9l0(arrayList4, (byte) 10), new ugd(802480018, true, new idr0(arrayList4, f, (Function1) obj2, b8)));
                return Unit.f46060a;
            case 20:
                i8z i8zVar5 = (i8z) obj;
                i8zVar5.getClass();
                ArrayList arrayList5 = ((sok0) obj3).f32547a;
                i8zVar5.e(arrayList5.size(), new zcn0(new t9r0(b9), arrayList5, b4), null, new t9l0(arrayList5, (byte) 12), new ugd(-1117249557, true, new idr0(arrayList5, f, (Function1) obj2, b9)));
                return Unit.f46060a;
            default:
                aht0 aht0Var = (aht0) obj3;
                Function1 function1 = (Function1) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j5 = aht0Var.b;
                if (j5 == Long.MIN_VALUE) {
                    aht0Var.b = jLongValue;
                    j5 = jLongValue;
                }
                float f7 = aht0Var.e;
                p73 p73Var = new p73(f7);
                p73 p73Var2 = aht0.f;
                long jB = f == 0.0f ? aht0Var.f890a.b(new p73(f7), p73Var2, aht0Var.c) : si30.c((jLongValue - j5) / f);
                float f8 = ((p73) aht0Var.f890a.c(jB, p73Var, p73Var2, aht0Var.c)).f26486a;
                aht0Var.c = (p73) aht0Var.f890a.h(jB, p73Var, p73Var2, aht0Var.c);
                aht0Var.b = jLongValue;
                float f9 = aht0Var.e - f8;
                aht0Var.e = f8;
                function1.invoke(Float.valueOf(f9));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ny2(Object obj, float f, Object obj2, byte b) {
        this.f24310a = b;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }

    public /* synthetic */ ny2(Object obj, Object obj2, float f, byte b) {
        this.f24310a = b;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }
}
