package a;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ys90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f43156a = l1e0.c(40.0f / (((float) Math.sqrt(600.0d)) * 2.0f), 0.05f, 1.0f);
    public static final float b = 60.0f / (((float) Math.sqrt(600.0d)) * 2.0f);

    public static final void a(mm40 mm40Var, final SnapshotStateList snapshotStateList, final boolean z, final float f, final int i, b8x b8xVar, final okt0 okt0Var, final boolean z2, final Function2 function2, final Function1 function1, fet fetVar, final int i2) {
        final b8x b8xVar2;
        int i3;
        b8x b8xVar3;
        Vibrator defaultVibrator;
        nul0 nul0Var;
        pz40 pz40Var;
        okt0 okt0Var2;
        vne vneVar;
        xcz xczVar;
        final float f2;
        pz40 pz40Var2;
        vne vneVar2;
        xcz xczVar2;
        pz40 pz40Var3;
        pz40 pz40Var4;
        xcz xczVar3;
        pz40 pz40Var5;
        pz40 pz40Var6;
        vne vneVar3;
        l7m0 l7m0Var;
        final vne vneVar4;
        final xcz xczVar4;
        l7m0 l7m0Var2;
        jm40 jm40Var;
        fet fetVar2;
        final mm40 mm40Var2 = mm40Var;
        fet fetVar3 = fetVar;
        function2.getClass();
        function1.getClass();
        fetVar3.g0(625396460);
        int i4 = i2 | (fetVar3.g(mm40Var2) ? 4 : 2) | (fetVar3.g(snapshotStateList) ? 32 : 16) | (fetVar3.h(z) ? 256 : 128) | (fetVar3.d(f) ? 2048 : 1024) | (fetVar3.e(i) ? 16384 : 8192) | 65536 | (fetVar3.i(okt0Var) ? 1048576 : 524288) | (fetVar3.h(z2) ? 8388608 : 4194304) | (fetVar3.i(function2) ? 67108864 : 33554432) | (fetVar3.i(function1) ? 536870912 : 268435456);
        if (fetVar3.U(i4 & 1, (i4 & 306783379) != 306783378)) {
            fetVar3.Z();
            if ((i2 & 1) == 0 || fetVar3.B()) {
                i3 = i4 & (-458753);
                b8xVar3 = new b8x();
            } else {
                fetVar3.X();
                i3 = i4 & (-458753);
                b8xVar3 = b8xVar;
            }
            fetVar3.s();
            Object objP = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = ro4.g0(b, 600.0f, null, 4);
                fetVar3.o0(objP);
            }
            final nul0 nul0Var2 = (nul0) objP;
            Object objP2 = fetVar3.P();
            if (objP2 == cl5Var) {
                objP2 = ro4.g0(f43156a, 600.0f, null, 4);
                fetVar3.o0(objP2);
            }
            nul0 nul0Var3 = (nul0) objP2;
            w6k w6kVar = (w6k) fetVar3.k(bmd.h);
            float f3 = fs90.f10056a;
            float fW0 = w6kVar.w0(f3);
            float fW1 = w6kVar.w0(f);
            boolean zD = fetVar3.d(fW1);
            Object objP3 = fetVar3.P();
            if (zD || objP3 == cl5Var) {
                objP3 = Float.valueOf(fW1 / 2.0f);
                fetVar3.o0(objP3);
            }
            final float fFloatValue = ((Number) objP3).floatValue();
            final int size = snapshotStateList.size();
            pz40 pz40VarF = androidx.compose.runtime.e.f(snapshotStateList, fetVar3);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(function2, fetVar3);
            pz40 pz40VarF3 = androidx.compose.runtime.e.f(function1, fetVar);
            int i5 = i3 & 896;
            int i6 = i3;
            boolean zE = (i5 == 256) | fetVar3.e(size) | ((i6 & 57344) == 16384) | fetVar3.g(b8xVar3);
            Object objP4 = fetVar3.P();
            if (zE || objP4 == cl5Var) {
                if (!z || size <= 0) {
                    objP4 = null;
                } else {
                    b8xVar3.getClass();
                    int i7 = size < 1 ? 1 : size;
                    int iMax = Math.max(Math.max(3, (int) Math.ceil(300.0d / ((double) i7))), 1000 / i7);
                    if (iMax % 2 != 1) {
                        iMax--;
                    }
                    int i8 = iMax < 3 ? 3 : iMax;
                    int i9 = (i8 / 2) * i7;
                    objP4 = new a8x(i7, i8, i8 * i7, i9, (((i % i7) + i7) % i7) + i9);
                }
                fetVar3.o0(objP4);
            } else {
                b8xVar3 = b8xVar3;
            }
            final a8x a8xVar = (a8x) objP4;
            pz40 pz40VarF4 = androidx.compose.runtime.e.f(a8xVar, fetVar3);
            xcz xczVarA = ddz.a(a8xVar != null ? a8xVar.e : i, 0, fetVar3, 0, 2);
            boolean zG = (i5 == 256) | fetVar3.g(a8xVar) | fetVar3.g(xczVarA) | fetVar3.d(fW0);
            Object objP5 = fetVar3.P();
            if (zG || objP5 == cl5Var) {
                objP5 = jgk0.b(new hh10(xczVarA, fW0, a8xVar, (byte) 1));
                fetVar3.o0(objP5);
            }
            l7m0 l7m0Var3 = (l7m0) objP5;
            boolean zG2 = fetVar3.g(xczVarA);
            Object objP6 = fetVar3.P();
            if (zG2 || objP6 == cl5Var) {
                objP6 = new qcz(xczVarA, gfk0.b);
                fetVar3.o0(objP6);
            }
            afk0 afk0VarM0 = bdx.m0((ffk0) objP6, fetVar3);
            float f4 = 9.0f * f3;
            Context context = (Context) fetVar3.k(dy2.b);
            omv omvVar = (omv) fetVar3.k(bmd.l);
            boolean zG3 = fetVar3.g(context);
            Object objP7 = fetVar3.P();
            if (zG3 || objP7 == cl5Var) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Object systemService = context.getSystemService("vibrator_manager");
                    systemService.getClass();
                    defaultVibrator = tl50.q(systemService).getDefaultVibrator();
                } else {
                    Object systemService2 = context.getSystemService("vibrator");
                    systemService2.getClass();
                    defaultVibrator = (Vibrator) systemService2;
                }
                objP7 = defaultVibrator;
                fetVar3.o0(objP7);
            }
            nw20 nw20Var = new nw20(omvVar, (Vibrator) objP7);
            Object objP8 = fetVar3.P();
            if (objP8 == cl5Var) {
                objP8 = androidx.compose.runtime.e.c(0L);
                fetVar3.o0(objP8);
            }
            egk0 egk0Var = (egk0) objP8;
            Object objP9 = fetVar3.P();
            if (objP9 == cl5Var) {
                objP9 = androidx.compose.runtime.e.b(i);
                fetVar3.o0(objP9);
            }
            cgk0 cgk0Var = (cgk0) objP9;
            boolean zD2 = fetVar3.d(fFloatValue);
            Object objP10 = fetVar3.P();
            if (zD2 || objP10 == cl5Var) {
                float fW2 = (w6kVar.w0(f4) / 2.0f) - fFloatValue;
                if (fW2 < 0.0f) {
                    fW2 = 0.0f;
                }
                objP10 = androidx.compose.runtime.e.a(fW2);
                fetVar3.o0(objP10);
            }
            agk0 agk0Var = (agk0) objP10;
            float fS0 = w6kVar.s0(agk0Var.l());
            boolean zD3 = fetVar3.d(agk0Var.l());
            Object objP11 = fetVar3.P();
            if (zD3 || objP11 == cl5Var) {
                objP11 = Float.valueOf(agk0Var.l() * 2.0f);
                fetVar3.o0(objP11);
            }
            final float fFloatValue2 = ((Number) objP11).floatValue();
            Object objP12 = fetVar3.P();
            if (objP12 == cl5Var) {
                objP12 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar3.o0(objP12);
            }
            pz40 pz40Var7 = (pz40) objP12;
            Object objP13 = fetVar3.P();
            if (objP13 == cl5Var) {
                objP13 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar3);
                fetVar3.o0(objP13);
            }
            vne vneVar5 = (vne) objP13;
            Object objP14 = fetVar3.P();
            if (objP14 == cl5Var) {
                objP14 = androidx.compose.runtime.e.e(null);
                fetVar3.o0(objP14);
            }
            pz40 pz40Var8 = (pz40) objP14;
            boolean zG4 = ((i6 & 3670016) == 1048576 || fetVar3.i(okt0Var)) | fetVar3.g(xczVarA) | fetVar3.d(fW0) | fetVar3.g(a8xVar) | fetVar3.g(l7m0Var3) | fetVar3.i(vneVar5) | fetVar3.g(pz40VarF4);
            Object objP15 = fetVar3.P();
            if (zG4 || objP15 == cl5Var) {
                nul0Var = nul0Var3;
                pz40Var = pz40Var8;
                objP15 = new ms90(okt0Var, nul0Var, vneVar5, pz40Var7, xczVarA, fW0, a8xVar, l7m0Var3, pz40Var, pz40VarF4, null);
                okt0Var2 = okt0Var;
                vneVar = vneVar5;
                xczVar = xczVarA;
                f2 = fW0;
                pz40Var2 = pz40VarF4;
                fetVar3.o0(objP15);
            } else {
                vneVar = vneVar5;
                pz40Var2 = pz40VarF4;
                xczVar = xczVarA;
                okt0Var2 = okt0Var;
                f2 = fW0;
                nul0Var = nul0Var3;
                pz40Var = pz40Var8;
            }
            m0x0.v(okt0Var2, xczVar, (Function2) objP15, fetVar3);
            boolean zG5 = fetVar3.g(a8xVar != null ? Integer.valueOf(a8xVar.c) : null) | fetVar3.e(size);
            Object objP16 = fetVar3.P();
            if (zG5 || objP16 == cl5Var) {
                objP16 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar3.o0(objP16);
            }
            pz40 pz40Var9 = (pz40) objP16;
            Object objP17 = fetVar3.P();
            if (objP17 == cl5Var) {
                objP17 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar3.o0(objP17);
            }
            pz40 pz40Var10 = (pz40) objP17;
            Object objP18 = fetVar3.P();
            if (objP18 == cl5Var) {
                objP18 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar3.o0(objP18);
            }
            pz40 pz40Var11 = (pz40) objP18;
            Object[] objArr = {xczVar, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(size), a8xVar != null ? Integer.valueOf(a8xVar.c) : null};
            int i10 = i6 & 29360128;
            boolean zG6 = fetVar3.g(xczVar) | fetVar3.g(pz40Var9) | fetVar3.g(pz40Var2) | fetVar3.d(f2) | fetVar3.g(pz40VarF) | (i10 == 8388608) | fetVar3.g(a8xVar) | fetVar3.g(l7m0Var3) | fetVar3.i(vneVar) | fetVar3.g(pz40VarF2);
            Object objP19 = fetVar3.P();
            if (zG6 || objP19 == cl5Var) {
                xcz xczVar5 = xczVar;
                pz40 pz40Var12 = pz40Var;
                pz40 pz40Var13 = pz40Var2;
                vne vneVar6 = vneVar;
                objP19 = new ps90(f2, nul0Var, null, vneVar6, a8xVar, xczVar5, pz40Var9, pz40Var7, pz40Var13, pz40VarF, pz40VarF2, pz40Var12, pz40Var11, cgk0Var, l7m0Var3, z2);
                vneVar2 = vneVar6;
                xczVar2 = xczVar5;
                pz40Var7 = pz40Var7;
                pz40Var3 = pz40Var13;
                pz40Var4 = pz40VarF2;
                pz40Var = pz40Var12;
                pz40Var11 = pz40Var11;
                fetVar3.o0(objP19);
            } else {
                vneVar2 = vneVar;
                xczVar2 = xczVar;
                pz40Var3 = pz40Var2;
                pz40Var4 = pz40VarF2;
            }
            m0x0.w(objArr, (Function2) objP19, fetVar3);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            xcz xczVar6 = xczVar2;
            pz40 pz40Var14 = pz40Var3;
            boolean zG7 = fetVar3.g(xczVar2) | fetVar3.g(pz40VarF3) | fetVar3.g(pz40Var3) | fetVar3.d(f2) | fetVar3.g(pz40VarF) | (i10 == 8388608) | fetVar3.g(a8xVar) | fetVar3.g(l7m0Var3) | fetVar3.i(vneVar2) | fetVar3.g(pz40Var4);
            pz40 pz40Var15 = pz40Var4;
            Object objP20 = fetVar3.P();
            if (zG7 || objP20 == cl5Var) {
                pz40 pz40Var16 = pz40Var;
                vne vneVar7 = vneVar2;
                nul0 nul0Var4 = nul0Var;
                pz40 pz40Var17 = pz40Var7;
                pz40 pz40Var18 = pz40Var11;
                objP20 = new rs90(xczVar6, pz40VarF3, pz40Var10, pz40Var18, pz40Var17, pz40Var14, pz40VarF, z2, nul0Var4, pz40Var15, f2, vneVar7, a8xVar, l7m0Var3, pz40Var16, cgk0Var, null);
                xczVar3 = xczVar6;
                pz40Var11 = pz40Var18;
                pz40Var7 = pz40Var17;
                pz40Var5 = pz40Var14;
                nul0Var = nul0Var4;
                pz40Var6 = pz40Var15;
                vneVar3 = vneVar7;
                l7m0Var = l7m0Var3;
                pz40Var = pz40Var16;
                cgk0Var = cgk0Var;
                fetVar3.o0(objP20);
            } else {
                vneVar3 = vneVar2;
                pz40Var5 = pz40Var14;
                pz40Var6 = pz40Var15;
                l7m0Var = l7m0Var3;
                xczVar3 = xczVar6;
            }
            m0x0.u(xczVar3, boolValueOf, boolValueOf2, (Function2) objP20, fetVar3);
            Boolean boolValueOf3 = Boolean.valueOf(c(pz40Var7));
            boolean zG8 = fetVar3.g(xczVar3) | fetVar3.g(pz40Var5) | fetVar3.d(f2) | fetVar3.g(pz40VarF) | (i10 == 8388608) | fetVar3.g(a8xVar) | fetVar3.g(l7m0Var) | fetVar3.i(vneVar3) | fetVar3.g(pz40Var6);
            Object objP21 = fetVar3.P();
            if (zG8 || objP21 == cl5Var) {
                xcz xczVar7 = xczVar3;
                l7m0 l7m0Var4 = l7m0Var;
                pz40 pz40Var19 = pz40Var7;
                pz40 pz40Var20 = pz40Var;
                vne vneVar8 = vneVar3;
                objP21 = new ss90(f2, nul0Var, null, vneVar8, a8xVar, xczVar7, pz40Var19, pz40Var11, pz40Var10, pz40Var5, pz40VarF, pz40Var6, pz40Var20, cgk0Var, l7m0Var4, z2);
                vneVar4 = vneVar8;
                xczVar4 = xczVar7;
                pz40Var7 = pz40Var19;
                pz40Var = pz40Var20;
                l7m0Var2 = l7m0Var4;
                fetVar3.o0(objP21);
            } else {
                vneVar4 = vneVar3;
                xczVar4 = xczVar3;
                l7m0Var2 = l7m0Var;
            }
            m0x0.t(fetVar3, boolValueOf3, (Function2) objP21);
            boolean zG9 = fetVar3.g(l7m0Var2) | fetVar3.g(xczVar4) | fetVar3.g(pz40VarF) | fetVar3.i(nw20Var);
            Object objP22 = fetVar3.P();
            if (zG9 || objP22 == cl5Var) {
                objP22 = new s6d(xczVar4, l7m0Var2, pz40Var7, pz40VarF, cgk0Var, nw20Var, egk0Var, null, (byte) 7);
                fetVar3.o0(objP22);
            }
            m0x0.v(xczVar4, a8xVar, (Function2) objP22, fetVar3);
            mm40Var2 = mm40Var;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var2, f4), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarD);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var2, "PICKER_WHEEL_LAZY_COLUMN");
            lh80 lh80VarT = s5x0.t(0.0f, fS0, 1);
            boolean zG10 = ((i6 & 112) == 32) | fetVar3.g(a8xVar) | fetVar3.e(size) | fetVar3.g(l7m0Var2) | fetVar3.g(xczVar4) | fetVar3.d(f2) | fetVar3.i(vneVar4) | fetVar3.d(fFloatValue) | fetVar3.d(fFloatValue2);
            Object objP23 = fetVar3.P();
            if (zG10 || objP23 == cl5Var) {
                jm40Var = jm40Var2;
                fetVar2 = fetVar3;
                final l7m0 l7m0Var5 = l7m0Var2;
                final pz40 pz40Var21 = pz40Var7;
                final pz40 pz40Var22 = pz40Var;
                Function1 function3 = new Function1() { // from class: a.gs90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        hcz hczVar = (hcz) obj;
                        hczVar.getClass();
                        final a8x a8xVar2 = a8xVar;
                        final SnapshotStateList snapshotStateList2 = snapshotStateList;
                        final xcz xczVar8 = xczVar4;
                        final float f5 = f2;
                        final l7m0 l7m0Var6 = l7m0Var5;
                        final vne vneVar9 = vneVar4;
                        final float f6 = fFloatValue;
                        final float f7 = fFloatValue2;
                        final j73 j73Var = nul0Var2;
                        final pz40 pz40Var23 = pz40Var21;
                        final pz40 pz40Var24 = pz40Var22;
                        if (a8xVar2 == null || size == 0) {
                            hczVar.f(snapshotStateList2.size(), new m160(new so90((byte) 6), snapshotStateList2, (byte) 29), new ts90(snapshotStateList2, (byte) 1), new ugd(2039820996, true, new xs90(snapshotStateList2, snapshotStateList2, xczVar8, f5, a8xVar2, l7m0Var6, vneVar9, f6, f7, j73Var, pz40Var23, pz40Var24)));
                        } else {
                            final int i11 = a8xVar2.c;
                            final int i12 = a8xVar2.f450a;
                            hcz.g(hczVar, i11, new er90((byte) 2), null, new ugd(-1260174421, true, new ydr() { // from class: a.is90
                                @Override // a.ydr
                                public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    ar90 ar90Var;
                                    cav0 cav0Var;
                                    final int iIntValue = ((Integer) obj3).intValue();
                                    fet fetVar4 = (fet) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((g9z) obj2).getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= fetVar4.e(iIntValue) ? 32 : 16;
                                    }
                                    int i13 = iIntValue2;
                                    if (fetVar4.U(i13 & 1, (i13 & 145) != 144)) {
                                        boolean z3 = false;
                                        final int i14 = i12;
                                        final int i15 = iIntValue % i14;
                                        if (i15 < 0) {
                                            i15 += i14;
                                        }
                                        final SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                        cav0 cav0Var2 = (cav0) snapshotStateList3.get(i15);
                                        final l7m0 l7m0Var7 = l7m0Var6;
                                        int iIntValue3 = ((Number) l7m0Var7.getValue()).intValue();
                                        if (cav0Var2.c) {
                                            ar90Var = i15 == iIntValue3 ? xq90.f41305a : zq90.f44798a;
                                        } else {
                                            ar90Var = yq90.f43066a;
                                        }
                                        ar90 ar90Var2 = ar90Var;
                                        boolean zI = fetVar4.i(snapshotStateList3) | fetVar4.e(i15);
                                        if ((i13 & 112) == 32) {
                                            z3 = true;
                                        }
                                        boolean zE2 = z3 | zI | fetVar4.e(i14);
                                        final int i16 = i11;
                                        boolean zE3 = zE2 | fetVar4.e(i16);
                                        final xcz xczVar9 = xczVar8;
                                        boolean zG11 = zE3 | fetVar4.g(xczVar9);
                                        final float f8 = f5;
                                        boolean zD4 = zG11 | fetVar4.d(f8);
                                        final a8x a8xVar3 = a8xVar2;
                                        boolean zG12 = zD4 | fetVar4.g(a8xVar3) | fetVar4.g(l7m0Var7);
                                        final vne vneVar10 = vneVar9;
                                        boolean zI2 = zG12 | fetVar4.i(vneVar10);
                                        Object objP24 = fetVar4.P();
                                        if (zI2 || objP24 == ukd.f35823a) {
                                            final j73 j73Var2 = j73Var;
                                            final pz40 pz40Var25 = pz40Var23;
                                            final pz40 pz40Var26 = pz40Var24;
                                            cav0Var = cav0Var2;
                                            Function0 function0 = new Function0() { // from class: a.js90
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    SnapshotStateList snapshotStateList4 = snapshotStateList3;
                                                    int size2 = snapshotStateList4.size();
                                                    tp90 tp90Var = new tp90(snapshotStateList4, (byte) 1);
                                                    int iIntValue4 = i15;
                                                    Integer numG = ys90.g(size2, iIntValue4, true, 0, tp90Var);
                                                    if (numG != null) {
                                                        iIntValue4 = numG.intValue();
                                                    }
                                                    ys90.d(vneVar10, pz40Var25, xczVar9, f8, a8xVar3, l7m0Var7, pz40Var26, ys90.h(iIntValue, iIntValue4, i14, i16), j73Var2);
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar4.o0(function0);
                                            objP24 = function0;
                                        } else {
                                            cav0Var = cav0Var2;
                                        }
                                        c9x.g(null, fs90.f10056a, cav0Var.b, ar90Var2, xczVar9, iIntValue, f6, null, f7, (Function0) objP24, fetVar4, ((i13 << 12) & 458752) | 48);
                                    } else {
                                        fetVar4.X();
                                    }
                                    return Unit.f46060a;
                                }
                            }), 4);
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(function3);
                objP23 = function3;
            } else {
                jm40Var = jm40Var2;
                fetVar2 = fetVar3;
            }
            fet fetVar4 = fetVar2;
            b8k0.e(mm40VarE0, xczVar4, lh80VarT, null, null, afk0VarM0, false, null, (Function1) objP23, fetVar4, 6, 440);
            fetVar3 = fetVar4;
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarD2 = o7k0.d(o7k0.e(jr8Var.b(jm40Var, zx7Var), fs90.b), 1.0f);
            zfn zfnVar = zaq0.b;
            zq8.a(0, fetVar3, i120.P(mm40VarD2, yk5.n(q3d.j(new y3d(y3d.c(0.88f, ((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent())), new y3d(((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent0())), 0.0f, 0.0f, 14), null, 6));
            zq8.a(0, fetVar3, i120.P(o7k0.d(o7k0.e(jr8Var.b(jm40Var, gqw0.h), fs90.c), 1.0f), yk5.n(q3d.j(new y3d(((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent0()), new y3d(y3d.c(0.88f, ((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent()))), 0.0f, 0.0f, 14), null, 6));
            fetVar3.r(true);
            b8xVar2 = b8xVar3;
        } else {
            fetVar3.X();
            b8xVar2 = b8xVar;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(snapshotStateList, z, f, i, b8xVar2, okt0Var, z2, function2, function1, i2) { // from class: a.hs90
                public final /* synthetic */ SnapshotStateList b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ float d;
                public final /* synthetic */ int e;
                public final /* synthetic */ b8x f;
                public final /* synthetic */ okt0 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ Function2 i;
                public final /* synthetic */ Function1 j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(2097153);
                    ys90.a(this.f13570a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(pz40 pz40Var, pz40 pz40Var2, boolean z, j73 j73Var, pz40 pz40Var3, xcz xczVar, float f, vne vneVar, pz40 pz40Var4, a8x a8xVar, l7m0 l7m0Var, pz40 pz40Var5, cgk0 cgk0Var) {
        int i;
        a8x a8xVar2 = (a8x) pz40Var.getValue();
        int iE = e(xczVar, f);
        if (a8xVar2 != null) {
            int i2 = a8xVar2.f450a;
            i = iE % i2;
            if (i < 0) {
                i += i2;
            }
        } else {
            i = iE;
        }
        List list = (List) pz40Var2.getValue();
        if (z) {
            cav0 cav0Var = (cav0) CollectionsKt.W(i, list);
            if (cav0Var == null || !cav0Var.c) {
                Integer numG = g(list.size(), i, a8xVar2 != null, 0, new gg4(list, (byte) 8));
                int iIntValue = numG != null ? numG.intValue() : i;
                if (a8xVar2 != null) {
                    iIntValue = h(iE, iIntValue, a8xVar2.f450a, a8xVar2.c);
                }
                int i3 = iIntValue;
                if (i3 != iE) {
                    d(vneVar, pz40Var4, xczVar, f, a8xVar, l7m0Var, pz40Var5, i3, j73Var);
                    return;
                }
            }
        }
        if (i != cgk0Var.l()) {
            cgk0Var.m(i);
        }
        ((Function2) pz40Var3.getValue()).invoke(Integer.valueOf(i), Integer.valueOf(iE));
    }

    public static final boolean c(pz40 pz40Var) {
        return ((Boolean) pz40Var.getValue()).booleanValue();
    }

    public static final void d(vne vneVar, pz40 pz40Var, xcz xczVar, float f, a8x a8xVar, l7m0 l7m0Var, pz40 pz40Var2, int i, j73 j73Var) {
        int i2;
        if (!c(pz40Var) && Math.abs(f(xczVar, i, f)) > 0.5f) {
            if (a8xVar != null) {
                int i3 = a8xVar.f450a;
                i2 = i % i3;
                if (i2 < 0) {
                    i2 += i3;
                }
            } else {
                i2 = i;
            }
            if (i2 == ((Number) l7m0Var.getValue()).intValue()) {
                return;
            }
            bby bbyVar = (bby) pz40Var2.getValue();
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            c4m0 c4m0VarW = qjj.W(vneVar, null, null, new ws90(xczVar, pz40Var, i, f, j73Var, null), 3);
            c4m0VarW.invokeOnCompletion(new y9v(pz40Var, (byte) 24));
            pz40Var2.setValue(c4m0VarW);
        }
    }

    public static final int e(xcz xczVar, float f) {
        mcz mczVarJ = xczVar.j();
        if (mczVarJ.o == 0 || ((int) (mczVarJ.h() & 4294967295L)) == 0) {
            return 0;
        }
        return l1e0.d(si30.b(((((xczVar.h() * f) + xczVar.i()) + ((mczVarJ.m + mczVarJ.n) / 2.0f)) / f) - 0.5f), 0, mczVarJ.o - 1);
    }

    public static final float f(xcz xczVar, int i, float f) {
        mcz mczVarJ = xczVar.j();
        return ((i + 0.5f) * f) - (((xczVar.h() * f) + xczVar.i()) + ((mczVarJ.m + mczVarJ.n) / 2.0f));
    }

    public static final Integer g(int i, int i2, boolean z, int i3, Function1 function1) {
        if (i > 0) {
            Integer numValueOf = z ? Integer.valueOf(Math.floorMod(i2, i)) : (i2 < 0 || i2 >= i) ? null : Integer.valueOf(i2);
            int i4 = 1;
            int[] iArr = (i3 >= 0 && i3 > 0) ? new int[]{1, -1} : new int[]{-1, 1};
            if (numValueOf != null) {
                if (((Boolean) function1.invoke(numValueOf)).booleanValue()) {
                    return numValueOf;
                }
                int iIntValue = numValueOf.intValue();
                int iMax = z ? i - 1 : Math.max(iIntValue, (i - 1) - iIntValue);
                if (1 <= iMax) {
                    Integer num = null;
                    while (true) {
                        for (int i5 : iArr) {
                            int i6 = (i5 * i4) + iIntValue;
                            Integer numValueOf2 = z ? Integer.valueOf(Math.floorMod(i6, i)) : (i6 < 0 || i6 >= i) ? null : Integer.valueOf(i6);
                            if (num == null && numValueOf2 != null && ((Boolean) function1.invoke(numValueOf2)).booleanValue()) {
                                num = numValueOf2;
                            }
                        }
                        if (i4 == iMax) {
                            return num;
                        }
                        i4++;
                    }
                }
            }
        }
        return null;
    }

    public static final int h(int i, int i2, int i3, int i4) {
        int i5 = i % i3;
        if (i5 < 0) {
            i5 += i3;
        }
        int i6 = (((i2 - i5) % i3) + i3) % i3;
        int i7 = i6 - i3;
        if (Math.abs(i7) < Math.abs(i6)) {
            i6 = i7;
        }
        int i8 = i + i6;
        if (i8 < 0) {
            i8 += (((-i8) / i3) + 1) * i3;
        } else if (i8 >= i4) {
            i8 -= (((i8 - i4) / i3) + 1) * i3;
        }
        return l1e0.d(i8, 0, i4 - 1);
    }
}
