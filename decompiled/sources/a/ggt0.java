package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ggt0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11268a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ggt0(Object obj, byte b) {
        this.f11268a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        iun iunVar;
        Object value2;
        txu0 txu0Var;
        fwu0 fwu0Var;
        Object tmj0Var;
        fet fetVar;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.f11268a;
        yje yjeVar = null;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 3;
        byte b3 = 2;
        byte b4 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                a8z a8zVar = ((igt0) obj3).O1;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                bzs0 bzs0Var = igt0.Q1;
                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar2);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar2.i(k3t0Var);
                    Object objP = fetVar2.P();
                    if (zI || objP == cl5Var) {
                        las0 las0Var = new las0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                        fetVar2.o0(las0Var);
                        objP = las0Var;
                    }
                    dwi0.E(pz40VarY, (Function1) ((jhy) objP), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                xgt0 xgt0Var = (xgt0) obj3;
                oyg0 oyg0Var = xgt0Var.f;
                ocj ocjVar = xgt0Var.i;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                if (th instanceof ff5) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                        iunVar = iun.f15405a;
                        iunVar.getClass();
                    } while (!p7m0Var.m(value, new sgt0(iunVar, false, false)));
                } else {
                    boolean z = false;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    while (true) {
                        Object value6 = p7m0Var2.getValue();
                        value6.getClass();
                        oyg0Var.getClass();
                        if (!p7m0Var2.m(value6, sgt0.a((sgt0) value6, z, true))) {
                            z = false;
                        }
                    }
                }
                return Unit.f46060a;
            case 2:
                sxt0 sxt0Var = (sxt0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                svs0 svs0Var = sxt0.b2;
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z1u0 z1u0Var = (z1u0) ((i3t0) sxt0Var.H0()).y(fetVar3).getValue();
                    sek sekVar = sxt0Var.M1;
                    if (sekVar == null) {
                        Intrinsics.h("gameVideoFragmentFactory");
                        throw null;
                    }
                    bek bekVar = sxt0Var.N1;
                    if (bekVar == null) {
                        Intrinsics.h("gameZoneFragmentFactory");
                        throw null;
                    }
                    z5s z5sVar = new z5s(sxt0Var.G0().f46542a, sxt0Var.G0().b, sxt0Var.G0().e, sxt0Var.G0().c, sxt0Var.G0().d);
                    qdz qdzVar = sxt0Var.a2;
                    xex xexVar = sxt0Var.S1;
                    if (xexVar == null) {
                        Intrinsics.h("cyberBottomSheetFactory");
                        throw null;
                    }
                    CyberBottomSheetParams cyberBottomSheetParams = new CyberBottomSheetParams(sxt0Var.G0().f46542a, sxt0Var.G0().b, sxt0Var.G0().d, sxt0Var.G0().e, 27L, sxt0Var.G0().h, new lq2(), grs.b, sxt0.class.getSimpleName());
                    k3t0 k3t0VarH0 = sxt0Var.H0();
                    boolean zI2 = fetVar3.i(k3t0VarH0);
                    Object objP2 = fetVar3.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new las0(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                        fetVar3.o0(objP2);
                    }
                    ycm0.i(z1u0Var, sekVar, bekVar, z5sVar, qdzVar, xexVar, cyberBottomSheetParams, (Function1) ((jhy) objP2), fetVar3, 0);
                    k3t0 k3t0VarH1 = sxt0Var.H0();
                    boolean zI3 = fetVar3.i(sxt0Var);
                    Object objP3 = fetVar3.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new pxt0(sxt0Var, (byte) 0);
                        fetVar3.o0(objP3);
                    }
                    clz clzVar = (clz) fetVar3.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP3, fetVar3);
                    boolean zI4 = fetVar3.i(k3t0VarH1) | fetVar3.i(clzVar) | fetVar3.e(3) | fetVar3.g(pz40VarF);
                    Object objP4 = fetVar3.P();
                    if (zI4 || objP4 == cl5Var) {
                        rxt0 rxt0Var = new rxt0(k3t0VarH1, clzVar, pz40VarF, null, (byte) 0);
                        fetVar3.o0(rxt0Var);
                        objP4 = rxt0Var;
                    }
                    m0x0.t(fetVar3, clzVar, (Function2) objP4);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                czt0 czt0Var = (czt0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                wxs0 wxs0Var = czt0.U1;
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tzt0 tzt0Var = (tzt0) czt0Var.O1.getValue();
                    qdz qdzVar2 = czt0Var.Q1;
                    g2v g2vVar = czt0Var.L1;
                    if (g2vVar == null) {
                        Intrinsics.h("lottieEmptyConfigurator");
                        throw null;
                    }
                    boolean zI5 = fetVar4.i(czt0Var);
                    Object objP5 = fetVar4.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new azt0(czt0Var, b4);
                        fetVar4.o0(objP5);
                    }
                    b34.R(g2vVar, qdzVar2, tzt0Var, (Function0) objP5, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                dnm0.g((l4m0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                v8u0 v8u0Var = (v8u0) obj3;
                a8z a8zVar2 = v8u0Var.O1;
                fet fetVar5 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                sxs0 sxs0Var = v8u0.P1;
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI6 = fetVar5.i(v8u0Var);
                    Object objP6 = fetVar5.P();
                    if (zI6 || objP6 == cl5Var) {
                        las0 las0Var2 = new las0(1, v8u0Var, v8u0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/verification/options/impl/presentation/models/VerificationOptionsSideEffect;)V", 0, (byte) 17);
                        fetVar5.o0(las0Var2);
                        objP6 = las0Var2;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP6), fetVar5);
                    boolean zI7 = fetVar5.i(k3t0Var2) | fetVar5.i(v8u0Var) | fetVar5.e(3) | fetVar5.g(pz40VarF2);
                    Object objP7 = fetVar5.P();
                    if (zI7 || objP7 == cl5Var) {
                        tmj0 tmj0Var2 = new tmj0(k3t0Var2, v8u0Var, pz40VarF2, null, (byte) 24);
                        fetVar5.o0(tmj0Var2);
                        objP7 = tmj0Var2;
                    }
                    m0x0.t(fetVar5, v8u0Var, (Function2) objP7);
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar5);
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI8 = fetVar5.i(k3t0Var3);
                    Object objP8 = fetVar5.P();
                    if (zI8 || objP8 == cl5Var) {
                        las0 las0Var3 = new las0(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                        fetVar5.o0(las0Var3);
                        objP8 = las0Var3;
                    }
                    j47.s0(pz40VarY2, (Function1) ((jhy) objP8), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 6:
                mbu0 mbu0Var = (mbu0) obj;
                String str = (String) obj2;
                uxs0 uxs0Var = a9u0.R1;
                mbu0Var.getClass();
                str.getClass();
                i9u0 i9u0Var = (i9u0) ((a9u0) obj3).P1.getValue();
                i1w0 i1w0Var = i9u0Var.b;
                int iOrdinal = mbu0Var.ordinal();
                if (iOrdinal != 0 && iOrdinal != 2) {
                    i1w0Var.d(new c9u0(i9u0Var, mbu0Var, b4));
                } else if (str.length() > 0) {
                    sac.V(jiu0.a(i9u0Var), new d4u0((byte) 4), null, i9u0Var.f.f22085a, new n7t0(i9u0Var, str, yjeVar, (byte) 5), 10);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    FragmentScreen fragmentScreenA = ((clc) i9u0Var.d.b).d().a();
                    if (fragmentScreenA instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 7:
                gau0 gau0Var = (gau0) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                kys0 kys0Var = gau0.P1;
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    k3t0 k3t0VarG0 = gau0Var.G0();
                    boolean zI9 = fetVar6.i(gau0Var);
                    Object objP9 = fetVar6.P();
                    if (zI9 || objP9 == cl5Var) {
                        las0 las0Var4 = new las0(1, gau0Var, gau0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/verification/status/impl/presentation/models/verification_status/VerificationStatusSideEffect;)V", 0, (byte) 19);
                        fetVar6.o0(las0Var4);
                        objP9 = las0Var4;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP9), fetVar6);
                    boolean zI10 = fetVar6.i(k3t0VarG0) | fetVar6.i(gau0Var) | fetVar6.e(3) | fetVar6.g(pz40VarF3);
                    Object objP10 = fetVar6.P();
                    if (zI10 || objP10 == cl5Var) {
                        tmj0 tmj0Var3 = new tmj0(k3t0VarG0, gau0Var, pz40VarF3, null, (byte) 25);
                        fetVar6.o0(tmj0Var3);
                        objP10 = tmj0Var3;
                    }
                    m0x0.t(fetVar6, gau0Var, (Function2) objP10);
                    pz40 pz40VarY3 = ((i3t0) gau0Var.G0()).y(fetVar6);
                    k3t0 k3t0VarG1 = gau0Var.G0();
                    boolean zI11 = fetVar6.i(k3t0VarG1);
                    Object objP11 = fetVar6.P();
                    if (zI11 || objP11 == cl5Var) {
                        las0 las0Var5 = new las0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                        fetVar6.o0(las0Var5);
                        objP11 = las0Var5;
                    }
                    jd8.W(pz40VarY3, (Function1) ((jhy) objP11), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                jou0 jou0Var = (jou0) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                sxs0 sxs0Var2 = jou0.R1;
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) jou0Var.O1.getValue())).y(fetVar7);
                    qdz qdzVar3 = jou0Var.Q1;
                    boolean zI12 = fetVar7.i(jou0Var);
                    Object objP12 = fetVar7.P();
                    if (zI12 || objP12 == cl5Var) {
                        objP12 = new npt0(jou0Var, (byte) 13);
                        fetVar7.o0(objP12);
                    }
                    ny9.M(pz40VarY4, qdzVar3, (Function1) objP12, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 9:
                opu0 opu0Var = (opu0) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                uxs0 uxs0Var2 = opu0.W1;
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    k3t0 k3t0VarG2 = opu0Var.G0();
                    boolean zI13 = fetVar8.i(opu0Var);
                    Object objP13 = fetVar8.P();
                    if (zI13 || objP13 == cl5Var) {
                        las0 las0Var6 = new las0(1, opu0Var, opu0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/virtualgamescategories/presentation/categorymain/model/VirtualGameCategoryMainSideEffect;)V", 0, (byte) 23);
                        fetVar8.o0(las0Var6);
                        objP13 = las0Var6;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP13), fetVar8);
                    boolean zI14 = fetVar8.i(k3t0VarG2) | fetVar8.i(opu0Var) | fetVar8.e(3) | fetVar8.g(pz40VarF4);
                    Object objP14 = fetVar8.P();
                    if (zI14 || objP14 == cl5Var) {
                        tmj0 tmj0Var4 = new tmj0(k3t0VarG2, opu0Var, pz40VarF4, null, (byte) 26);
                        fetVar8.o0(tmj0Var4);
                        objP14 = tmj0Var4;
                    }
                    m0x0.t(fetVar8, opu0Var, (Function2) objP14);
                    qdz qdzVar4 = opu0Var.U1;
                    d930 d930Var = opu0Var.V1;
                    pz40 pz40VarY5 = ((i3t0) opu0Var.G0()).y(fetVar8);
                    boolean zI15 = fetVar8.i(opu0Var);
                    Object objP15 = fetVar8.P();
                    if (zI15 || objP15 == cl5Var) {
                        objP15 = new lpu0(opu0Var, (byte) 1);
                        fetVar8.o0(objP15);
                    }
                    Function1 function1 = (Function1) objP15;
                    boolean zI16 = fetVar8.i(opu0Var);
                    Object objP16 = fetVar8.P();
                    if (zI16 || objP16 == cl5Var) {
                        objP16 = new lpu0(opu0Var, (byte) 2);
                        fetVar8.o0(objP16);
                    }
                    Function1 function2 = (Function1) objP16;
                    pz40VarY5.getClass();
                    qdzVar4.getClass();
                    d930Var.getClass();
                    function1.getClass();
                    function2.getClass();
                    boolean zG = fetVar8.g(function1);
                    Object objP17 = fetVar8.P();
                    if (zG || objP17 == cl5Var) {
                        objP17 = new zbt0(function1, (byte) 20);
                        fetVar8.o0(objP17);
                    }
                    Function0 function0 = (Function0) objP17;
                    boolean zG2 = fetVar8.g(function1);
                    Object objP18 = fetVar8.P();
                    if (zG2 || objP18 == cl5Var) {
                        objP18 = new zbt0(function1, (byte) 21);
                        fetVar8.o0(objP18);
                    }
                    v3c.z(function0, (Function0) objP18, null, fetVar8, 0, 4);
                    float fH0 = lgb.h0(fetVar8);
                    zcl zclVar = qmk.f28987a;
                    float f = 152.0f + fH0;
                    float f2 = 56.0f + fH0;
                    Object objP19 = fetVar8.P();
                    if (objP19 == cl5Var) {
                        objP19 = jgk0.b(new jxr0(pz40VarY5, (byte) 6));
                        fetVar8.o0(objP19);
                    }
                    m0x0.d(null, f, ((StaticColors) fetVar8.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), ((ThemeColors) fetVar8.k(zaq0.b)).getBackground(), false, 12.0f, null, 0L, 0.0f, null, null, u1c.M(-701954042, new lkb(pz40VarY5, f, f2, function1, (byte) 6), fetVar8), u1c.M(-186889332, new rpu0(qdzVar4, d930Var, function1, function2, (l7m0) objP19, pz40VarY5), fetVar8), fetVar8, 24576, 432, 1985);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 10:
                eru0 eru0Var = (eru0) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                wxs0 wxs0Var2 = eru0.Q1;
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pz40 pz40VarY6 = ((i3t0) ((k3t0) eru0Var.N1.getValue())).y(fetVar9);
                    qdz qdzVar5 = eru0Var.P1;
                    boolean zI17 = fetVar9.i(eru0Var);
                    Object objP20 = fetVar9.P();
                    if (zI17 || objP20 == cl5Var) {
                        objP20 = new npt0(eru0Var, (byte) 15);
                        fetVar9.o0(objP20);
                    }
                    y9a.N(pz40VarY6, qdzVar5, (Function1) objP20, fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 11:
                csu0 csu0Var = (csu0) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                bzs0 bzs0Var2 = csu0.R1;
                if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    esu0 esu0Var = (esu0) csu0Var.O1.getValue();
                    g2v g2vVar2 = csu0Var.K1;
                    if (g2vVar2 == null) {
                        Intrinsics.h("lottieEmptyConfigurator");
                        throw null;
                    }
                    zgc.H(g2vVar2, esu0Var, fetVar10, 64);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 12:
                a8z a8zVar3 = ((rsu0) obj3).M1;
                fet fetVar11 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                sxs0 sxs0Var3 = rsu0.O1;
                if (fetVar11.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    pz40 pz40VarY7 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar11);
                    k3t0 k3t0Var4 = (k3t0) a8zVar3.getValue();
                    boolean zI18 = fetVar11.i(k3t0Var4);
                    Object objP21 = fetVar11.P();
                    if (zI18 || objP21 == cl5Var) {
                        las0 las0Var7 = new las0(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                        fetVar11.o0(las0Var7);
                        objP21 = las0Var7;
                    }
                    x8f.V(pz40VarY7, (Function1) ((jhy) objP21), fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 13:
                dyu0 dyu0Var = (dyu0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var3 = dyu0Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    txu0Var = (txu0) value2;
                    dyu0Var.f.getClass();
                    fwu0Var = txu0Var.e;
                } while (!p7m0Var3.m(value2, txu0.a(txu0Var, null, false, null, new fwu0(fwu0Var.f10278a, fwu0Var.b, false), null, false, false, 0.0d, 495)));
                return Unit.f46060a;
            case 14:
                xzu0 xzu0Var = (xzu0) obj3;
                fet fetVar12 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                uxs0 uxs0Var3 = xzu0.S1;
                if (fetVar12.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    n0v0 n0v0Var = (n0v0) ((i3t0) xzu0Var.G0()).y(fetVar12).getValue();
                    k3t0 k3t0VarG3 = xzu0Var.G0();
                    boolean zI19 = fetVar12.i(k3t0VarG3);
                    Object objP22 = fetVar12.P();
                    if (zI19 || objP22 == cl5Var) {
                        wzu0 wzu0Var = new wzu0(1, k3t0VarG3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                        fetVar12.o0(wzu0Var);
                        objP22 = wzu0Var;
                    }
                    eeq.P(n0v0Var, (Function1) ((jhy) objP22), fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 15:
                s7v0 s7v0Var = (s7v0) obj3;
                fet fetVar13 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                wxs0 wxs0Var3 = s7v0.P1;
                if (fetVar13.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zI20 = fetVar13.i(s7v0Var);
                    Object objP23 = fetVar13.P();
                    if (zI20 || objP23 == cl5Var) {
                        objP23 = new q7v0(s7v0Var, b3);
                        fetVar13.o0(objP23);
                    }
                    Function0 function3 = (Function0) objP23;
                    boolean zI21 = fetVar13.i(s7v0Var);
                    Object objP24 = fetVar13.P();
                    if (zI21 || objP24 == cl5Var) {
                        objP24 = new q7v0(s7v0Var, b2);
                        fetVar13.o0(objP24);
                    }
                    v3c.z(function3, (Function0) objP24, null, fetVar13, 0, 4);
                    pz40 pz40VarY8 = ((i3t0) ((k3t0) s7v0Var.N1.getValue())).y(fetVar13);
                    boolean zI22 = fetVar13.i(s7v0Var);
                    Object objP25 = fetVar13.P();
                    if (zI22 || objP25 == cl5Var) {
                        objP25 = new npt0(s7v0Var, (byte) 26);
                        fetVar13.o0(objP25);
                    }
                    cjx.L(pz40VarY8, (Function1) objP25, fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 16:
                v8v0 v8v0Var = (v8v0) obj3;
                a8z a8zVar4 = v8v0Var.O1;
                fet fetVar14 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                bzs0 bzs0Var3 = v8v0.P1;
                if (fetVar14.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    k3t0 k3t0Var5 = (k3t0) a8zVar4.getValue();
                    boolean zI23 = fetVar14.i(v8v0Var);
                    Object objP26 = fetVar14.P();
                    if (zI23 || objP26 == cl5Var) {
                        objP26 = new wzu0(1, v8v0Var, v8v0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/welcome_bonus/impl/presentation/models/WelcomeBonusSideEffect;)V", 0, (byte) 10);
                        fetVar14.o0(objP26);
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP26), fetVar14);
                    boolean zE = fetVar14.e(3) | fetVar14.i(k3t0Var5) | fetVar14.i(v8v0Var) | fetVar14.g(pz40VarF5);
                    Object objP27 = fetVar14.P();
                    if (zE || objP27 == cl5Var) {
                        fetVar = fetVar14;
                        tmj0Var = new tmj0(k3t0Var5, v8v0Var, pz40VarF5, null, (byte) 27);
                        fetVar.o0(tmj0Var);
                    } else {
                        fetVar = fetVar14;
                        tmj0Var = objP27;
                    }
                    m0x0.t(fetVar, v8v0Var, (Function2) tmj0Var);
                    knx.O((k3t0) a8zVar4.getValue(), fetVar, 0);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 17:
                rdv0 rdv0Var = (rdv0) obj3;
                fet fetVar15 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (fetVar15.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 16.0f, 0.0f, 12.0f, 5);
                    nw3 nw3Var = uc9.e;
                    yx7 yx7Var = gqw0.k;
                    thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar15, 54);
                    int iHashCode = Long.hashCode(fetVar15.T);
                    bh90 bh90VarM = fetVar15.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar15, mm40VarN);
                    mkd.c0.getClass();
                    fetVar15.i0();
                    if (fetVar15.S) {
                        fetVar15.l(e7z.u1);
                    } else {
                        fetVar15.r0();
                    }
                    jpm0.o(fetVar15, thg0VarA, gqw0.x);
                    jpm0.o(fetVar15, bh90VarM, gqw0.w);
                    jpm0.o(fetVar15, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar15);
                    jpm0.o(fetVar15, mm40VarC0, gqw0.v);
                    iym0.m(rdv0Var.e, fetVar15, 0);
                    iym0.n(new ecu0(yx7Var), rdv0Var.g, rdv0Var.h, fetVar15, 0);
                    iym0.m(rdv0Var.f, fetVar15, 0);
                    fetVar15.r(true);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                iym0.j((ndv0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                iym0.m((qdv0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                wim wimVar = (wim) obj;
                int i = ffv0.k2;
                wimVar.getClass();
                ((i3t0) obj3).x(new bfv0(wimVar, (String) obj2));
                return Unit.f46060a;
            case 21:
                a8z a8zVar5 = ((ulv0) obj3).Q1;
                fet fetVar16 = (fet) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                uxs0 uxs0Var4 = ulv0.R1;
                if (fetVar16.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    pz40 pz40VarY9 = ((i3t0) ((k3t0) a8zVar5.getValue())).y(fetVar16);
                    k3t0 k3t0Var6 = (k3t0) a8zVar5.getValue();
                    boolean zI24 = fetVar16.i(k3t0Var6);
                    Object objP28 = fetVar16.P();
                    if (zI24 || objP28 == cl5Var) {
                        wzu0 wzu0Var2 = new wzu0(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                        fetVar16.o0(wzu0Var2);
                        objP28 = wzu0Var2;
                    }
                    ihm0.e(pz40VarY9, (Function1) ((jhy) objP28), fetVar16, 0);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 22:
                emv0 emv0Var = (emv0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var4 = emv0Var.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    emv0Var.f.getClass();
                } while (!p7m0Var4.m(value3, vlv0.a((vlv0) value3, null, false, true, false, null, null, null, null, null, iun.f15405a, 8079)));
                return Unit.f46060a;
            case 23:
                a8z a8zVar6 = ((lmv0) obj3).N1;
                fet fetVar17 = (fet) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                wxs0 wxs0Var4 = lmv0.P1;
                if (fetVar17.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    pz40 pz40VarY10 = ((i3t0) ((k3t0) a8zVar6.getValue())).y(fetVar17);
                    k3t0 k3t0Var7 = (k3t0) a8zVar6.getValue();
                    boolean zI25 = fetVar17.i(k3t0Var7);
                    Object objP29 = fetVar17.P();
                    if (zI25 || objP29 == cl5Var) {
                        wzu0 wzu0Var3 = new wzu0(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                        fetVar17.o0(wzu0Var3);
                        objP29 = wzu0Var3;
                    }
                    gq80.Z(pz40VarY10, (Function1) ((jhy) objP29), fetVar17, 0);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                gq80.o((omv0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                gq80.K((nmv0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                tmv0 tmv0Var = (tmv0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var5 = tmv0Var.i.f25029a;
                do {
                    value4 = p7m0Var5.getValue();
                    value4.getClass();
                    tmv0Var.f.getClass();
                } while (!p7m0Var5.m(value4, mmv0.a((mmv0) value4, false, true, false, null, 24)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                a8z a8zVar7 = ((hnv0) obj3).O1;
                fet fetVar18 = (fet) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                kys0 kys0Var2 = hnv0.Q1;
                if (fetVar18.U(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    pz40 pz40VarY11 = ((i3t0) ((k3t0) a8zVar7.getValue())).y(fetVar18);
                    k3t0 k3t0Var8 = (k3t0) a8zVar7.getValue();
                    boolean zI26 = fetVar18.i(k3t0Var8);
                    Object objP30 = fetVar18.P();
                    if (zI26 || objP30 == cl5Var) {
                        wzu0 wzu0Var4 = new wzu0(1, k3t0Var8, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar18.o0(wzu0Var4);
                        objP30 = wzu0Var4;
                    }
                    wha0.H(pz40VarY11, (Function1) ((jhy) objP30), fetVar18, 0);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                qnv0 qnv0Var = (qnv0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var6 = qnv0Var.i.f25029a;
                do {
                    value5 = p7m0Var6.getValue();
                    value5.getClass();
                    qnv0Var.f.getClass();
                } while (!p7m0Var6.m(value5, jnv0.a((jnv0) value5, false, true, false, null, 24)));
                return Unit.f46060a;
            default:
                return new ikx(((long) ((xx7) obj3).a(0, (int) (((qkx) obj).f28908a >> 32), (k6z) obj2)) << 32);
        }
    }

    public /* synthetic */ ggt0(Object obj, int i, byte b) {
        this.f11268a = b;
        this.b = obj;
    }
}
