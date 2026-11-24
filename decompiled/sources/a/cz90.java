package a;

import android.javax.sip.header.WarningHeader;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cz90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5215a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cz90(Object obj, byte b) {
        this.f5215a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        z1a0 z1a0Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        byte b = this.f5215a;
        byte b2 = 7;
        cl5 cl5Var = ukd.f35823a;
        byte b3 = 3;
        boolean z = false;
        final byte b4 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                a8z a8zVar = ((ez90) obj3).M1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                mi70 mi70Var = ez90.P1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c58 c58Var = (c58) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar.i(k3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        yi90 yi90Var = new yi90(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                        fetVar.o0(yi90Var);
                        objP = yi90Var;
                    }
                    unh0.g(c58Var, (Function1) ((jhy) objP), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                a8z a8zVar2 = ((f0a0) obj3).O1;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                xi70 xi70Var = f0a0.P1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar2);
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI2 = fetVar2.i(k3t0Var2);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        yi90 yi90Var2 = new yi90(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                        fetVar2.o0(yi90Var2);
                        objP2 = yi90Var2;
                    }
                    o2e.H(pz40VarY, (Function1) ((jhy) objP2), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                r0a0 r0a0Var = (r0a0) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                if (th instanceof ff5) {
                    r0a0Var.H(new so90((byte) 16));
                } else {
                    r0a0Var.H(new so90((byte) 17));
                }
                break;
            case 3:
                z1a0 z1a0Var2 = (z1a0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                fl70 fl70Var = z1a0.U1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x2a0 x2a0Var = (x2a0) ((i3t0) z1a0Var2.G0()).y(fetVar3).getValue();
                    k3t0 k3t0VarG0 = z1a0Var2.G0();
                    boolean zI3 = fetVar3.i(z1a0Var2);
                    Object objP3 = fetVar3.P();
                    Object obj4 = objP3;
                    if (zI3 || objP3 == cl5Var) {
                        yi90 yi90Var3 = new yi90(1, z1a0Var2, z1a0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/playersduel/impl/presentation/players_duel/PlayerDuelSideEffect;)V", 0, (byte) 13);
                        fetVar3.o0(yi90Var3);
                        obj4 = yi90Var3;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) obj4), fetVar3);
                    boolean zI4 = fetVar3.i(k3t0VarG0) | fetVar3.i(z1a0Var2) | fetVar3.e(3) | fetVar3.g(pz40VarF);
                    Object objP4 = fetVar3.P();
                    if (zI4 || objP4 == cl5Var) {
                        z1a0Var = z1a0Var2;
                        nu80 nu80Var = new nu80(k3t0VarG0, z1a0Var, pz40VarF, null, (byte) 4);
                        fetVar3.o0(nu80Var);
                        objP4 = nu80Var;
                    } else {
                        z1a0Var = z1a0Var2;
                    }
                    m0x0.t(fetVar3, z1a0Var, (Function2) objP4);
                    k3t0 k3t0VarG1 = z1a0Var.G0();
                    boolean zI5 = fetVar3.i(k3t0VarG1);
                    Object objP5 = fetVar3.P();
                    if (zI5 || objP5 == cl5Var) {
                        yi90 yi90Var4 = new yi90(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                        fetVar3.o0(yi90Var4);
                        objP5 = yi90Var4;
                    }
                    g2a0.a(null, x2a0Var, (Function1) ((jhy) objP5), u1c.M(586544244, new csw(z1a0Var, b2), fetVar3), fetVar3, 3072);
                } else {
                    fetVar3.X();
                }
                break;
            case 4:
                a8z a8zVar3 = ((j3a0) obj3).N1;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                jh70 jh70Var = j3a0.P1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar4);
                    k3t0 k3t0Var3 = (k3t0) a8zVar3.getValue();
                    boolean zI6 = fetVar4.i(k3t0Var3);
                    Object objP6 = fetVar4.P();
                    if (zI6 || objP6 == cl5Var) {
                        yi90 yi90Var5 = new yi90(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar4.o0(yi90Var5);
                        objP6 = yi90Var5;
                    }
                    x8f.H(pz40VarY2, (Function1) ((jhy) objP6), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                x8f.K((m1e0) obj3, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                x8f.j((h3a0) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                u3a0 u3a0Var = (u3a0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = u3a0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    u3a0Var.f.getClass();
                } while (!p7m0Var.m(value, n3a0.a((n3a0) value, null, 0, 0, 0, false, true, 15)));
                break;
            case 8:
                a8z a8zVar4 = ((r5a0) obj3).R1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                mi70 mi70Var2 = r5a0.S1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar5);
                    k3t0 k3t0Var4 = (k3t0) a8zVar4.getValue();
                    boolean zI7 = fetVar5.i(k3t0Var4);
                    Object objP7 = fetVar5.P();
                    if (zI7 || objP7 == cl5Var) {
                        yi90 yi90Var6 = new yi90(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                        fetVar5.o0(yi90Var6);
                        objP7 = yi90Var6;
                    }
                    saj.F(pz40VarY3, (Function1) ((jhy) objP7), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                break;
            case 9:
                a8z a8zVar5 = ((q7a0) obj3).N1;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                fl70 fl70Var2 = q7a0.P1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) a8zVar5.getValue())).y(fetVar6);
                    k3t0 k3t0Var5 = (k3t0) a8zVar5.getValue();
                    boolean zI8 = fetVar6.i(k3t0Var5);
                    Object objP8 = fetVar6.P();
                    if (zI8 || objP8 == cl5Var) {
                        yi90 yi90Var7 = new yi90(1, k3t0Var5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                        fetVar6.o0(yi90Var7);
                        objP8 = yi90Var7;
                    }
                    qjj.F(pz40VarY4, (Function1) ((jhy) objP8), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                qjj.j((u7a0) obj3, (fet) obj, x8x.L(1));
                break;
            case 11:
                z7a0 z7a0Var = (z7a0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = z7a0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    z7a0Var.f.getClass();
                } while (!p7m0Var2.m(value2, s7a0.a((s7a0) value2, false, true)));
                break;
            case 12:
                final hda0 hda0Var = (hda0) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                mi70 mi70Var3 = hda0.R1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zI9 = fetVar7.i(hda0Var);
                    Object objP9 = fetVar7.P();
                    Object obj5 = objP9;
                    if (zI9 || objP9 == cl5Var) {
                        eda0 eda0Var = new eda0(hda0Var, b3);
                        fetVar7.o0(eda0Var);
                        obj5 = eda0Var;
                    }
                    Function0 function0 = (Function0) obj5;
                    boolean zI10 = fetVar7.i(hda0Var);
                    Object objP10 = fetVar7.P();
                    Object obj6 = objP10;
                    if (zI10 || objP10 == cl5Var) {
                        eda0 eda0Var2 = new eda0(hda0Var, (byte) 4);
                        fetVar7.o0(eda0Var2);
                        obj6 = eda0Var2;
                    }
                    v3c.z(function0, (Function0) obj6, null, fetVar7, 0, 4);
                    pz40 pz40VarY5 = ((i3t0) hda0Var.G0()).y(fetVar7);
                    boolean zI11 = fetVar7.i(hda0Var);
                    Object objP11 = fetVar7.P();
                    Object obj7 = objP11;
                    if (zI11 || objP11 == cl5Var) {
                        final boolean z2 = z ? 1 : 0;
                        Function1 function1 = new Function1() { // from class: a.fda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                switch (z2) {
                                    case 0:
                                        yca0 yca0Var = (yca0) obj8;
                                        mi70 mi70Var4 = hda0.R1;
                                        yca0Var.getClass();
                                        hda0Var.G0().x(yca0Var);
                                        return Unit.f46060a;
                                    default:
                                        yda0 yda0Var = (yda0) obj8;
                                        mi70 mi70Var5 = hda0.R1;
                                        yda0Var.getClass();
                                        String str = yda0Var.f42424a;
                                        hda0 hda0Var2 = hda0Var;
                                        wdk0 wdk0Var = hda0Var2.L1;
                                        if (wdk0Var == null) {
                                            Intrinsics.h("snackbarManager");
                                            throw null;
                                        }
                                        wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), hda0Var2, null, null, false, null, 1020);
                                        hda0Var2.G0().x(qca0.f28476a);
                                        return Unit.f46060a;
                                }
                            }
                        };
                        fetVar7.o0(function1);
                        obj7 = function1;
                    }
                    eeq.A(pz40VarY5, (Function1) obj7, fetVar7, 0);
                    k3t0 k3t0VarG2 = hda0Var.G0();
                    boolean zI12 = fetVar7.i(hda0Var);
                    Object objP12 = fetVar7.P();
                    Object obj8 = objP12;
                    if (zI12 || objP12 == cl5Var) {
                        Function1 function2 = new Function1() { // from class: a.fda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                switch (b4) {
                                    case 0:
                                        yca0 yca0Var = (yca0) obj9;
                                        mi70 mi70Var4 = hda0.R1;
                                        yca0Var.getClass();
                                        hda0Var.G0().x(yca0Var);
                                        return Unit.f46060a;
                                    default:
                                        yda0 yda0Var = (yda0) obj9;
                                        mi70 mi70Var5 = hda0.R1;
                                        yda0Var.getClass();
                                        String str = yda0Var.f42424a;
                                        hda0 hda0Var2 = hda0Var;
                                        wdk0 wdk0Var = hda0Var2.L1;
                                        if (wdk0Var == null) {
                                            Intrinsics.h("snackbarManager");
                                            throw null;
                                        }
                                        wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), hda0Var2, null, null, false, null, 1020);
                                        hda0Var2.G0().x(qca0.f28476a);
                                        return Unit.f46060a;
                                }
                            }
                        };
                        fetVar7.o0(function2);
                        obj8 = function2;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) obj8, fetVar7);
                    boolean zI13 = fetVar7.i(k3t0VarG2) | fetVar7.i(hda0Var) | fetVar7.e(3) | fetVar7.g(pz40VarF2);
                    Object objP13 = fetVar7.P();
                    if (zI13 || objP13 == cl5Var) {
                        nu80 nu80Var2 = new nu80(k3t0VarG2, hda0Var, pz40VarF2, null, (byte) 5);
                        fetVar7.o0(nu80Var2);
                        objP13 = nu80Var2;
                    }
                    m0x0.t(fetVar7, hda0Var, (Function2) objP13);
                } else {
                    fetVar7.X();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                azw.o((q2a0) obj3, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                pzw.m((lga0) obj3, (fet) obj, x8x.L(1));
                break;
            case 15:
                a8z a8zVar6 = ((cha0) obj3).N1;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                xi70 xi70Var2 = cha0.P1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pz40 pz40VarY6 = ((i3t0) ((k3t0) a8zVar6.getValue())).y(fetVar8);
                    k3t0 k3t0Var6 = (k3t0) a8zVar6.getValue();
                    boolean zI14 = fetVar8.i(k3t0Var6);
                    Object objP14 = fetVar8.P();
                    if (zI14 || objP14 == cl5Var) {
                        yi90 yi90Var8 = new yi90(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                        fetVar8.o0(yi90Var8);
                        objP14 = yi90Var8;
                    }
                    ntr.M(0, fetVar8, null, pz40VarY6, (Function1) ((jhy) objP14));
                } else {
                    fetVar8.X();
                }
                break;
            case 16:
                iha0 iha0Var = (iha0) obj3;
                oyg0 oyg0Var = iha0Var.f;
                ocj ocjVar = iha0Var.i;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                if (th2 instanceof ff5) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value4, dha0.a((dha0) value4, null, false, true, false, 1)));
                } else {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value3, dha0.a((dha0) value3, null, false, false, true, 1)));
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                mrv.Y((j9m0) obj3, (fet) obj, x8x.L(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                mrv.R((vja0) obj3, (fet) obj, x8x.L(7));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                a8z a8zVar7 = ((tia0) obj3).P1;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                fl70 fl70Var3 = tia0.R1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pz40 pz40VarY7 = ((i3t0) ((k3t0) a8zVar7.getValue())).y(fetVar9);
                    k3t0 k3t0Var7 = (k3t0) a8zVar7.getValue();
                    boolean zI15 = fetVar9.i(k3t0Var7);
                    Object objP15 = fetVar9.P();
                    if (zI15 || objP15 == cl5Var) {
                        yi90 yi90Var9 = new yi90(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar9.o0(yi90Var9);
                        objP15 = yi90Var9;
                    }
                    mrv.T(0, fetVar9, null, pz40VarY7, (Function1) ((jhy) objP15));
                } else {
                    fetVar9.X();
                }
                break;
            case 20:
                xja0 xja0Var = (xja0) obj3;
                oyg0 oyg0Var2 = xja0Var.f;
                ocj ocjVar2 = xja0Var.i;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                if (th3 instanceof ff5) {
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value6 = p7m0Var5.getValue();
                        value6.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var5.m(value6, rja0.a((rja0) value6, null, false, 0, false, false, false, true, null, false, WarningHeader.MISCELLANEOUS_WARNING)));
                } else {
                    p7m0 p7m0Var6 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var6.getValue();
                        value5.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var6.m(value5, rja0.a((rja0) value5, null, false, 0, false, false, true, false, null, false, WarningHeader.MISCELLANEOUS_WARNING)));
                }
                break;
            case 21:
                vka0 vka0Var = (vka0) obj3;
                a8z a8zVar8 = vka0Var.P1;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                nh70 nh70Var = vka0.R1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    gmq gmqVarC = ((i3t0) ((k3t0) a8zVar8.getValue())).C();
                    boolean zI16 = fetVar10.i(vka0Var);
                    Object objP16 = fetVar10.P();
                    if (zI16 || objP16 == cl5Var) {
                        hi70 hi70Var = new hi70(2, vka0Var, vka0.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/statistic/player/impl/player/players_statistic_cricket/presentation/models/PlayersStatisticsCricketSideEffect;)V", 4, (byte) 21);
                        fetVar10.o0(hi70Var);
                        objP16 = hi70Var;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    clz clzVarW = aac.W(vka0Var);
                    qjj.W(x0x.Q(clzVarW.x()), null, null, new ji60((i89) gmqVarC, clzVarW, (Function2) objP16, null, (byte) 2), 3);
                    pz40 pz40VarY8 = ((i3t0) ((k3t0) a8zVar8.getValue())).y(fetVar10);
                    k3t0 k3t0Var8 = (k3t0) a8zVar8.getValue();
                    boolean zI17 = fetVar10.i(k3t0Var8);
                    Object objP17 = fetVar10.P();
                    if (zI17 || objP17 == cl5Var) {
                        yi90 yi90Var10 = new yi90(1, k3t0Var8, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                        fetVar10.o0(yi90Var10);
                        objP17 = yi90Var10;
                    }
                    knx.E(pz40VarY8, (Function1) ((jhy) objP17), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                break;
            case 22:
                a8z a8zVar9 = ((ala0) obj3).N1;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                mi70 mi70Var4 = ala0.O1;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    pz40 pz40VarY9 = ((i3t0) ((k3t0) a8zVar9.getValue())).y(fetVar11);
                    k3t0 k3t0Var9 = (k3t0) a8zVar9.getValue();
                    boolean zI18 = fetVar11.i(k3t0Var9);
                    Object objP18 = fetVar11.P();
                    if (zI18 || objP18 == cl5Var) {
                        yi90 yi90Var11 = new yi90(1, k3t0Var9, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar11.o0(yi90Var11);
                        objP18 = yi90Var11;
                    }
                    cjx.z(pz40VarY9, (Function1) ((jhy) objP18), fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                cjx.A((n2g0) obj3, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                cjx.C((c5g0) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                knx.t((nla0) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ola0 ola0Var = (ola0) obj3;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    knx.t(ola0Var.i, fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cma0 cma0Var = (cma0) obj3;
                oyg0 oyg0Var3 = cma0Var.f;
                ocj ocjVar3 = cma0Var.i;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((String) obj2).getClass();
                if (th4 instanceof ff5) {
                    p7m0 p7m0Var7 = ocjVar3.f25029a;
                    do {
                        value8 = p7m0Var7.getValue();
                        value8.getClass();
                        oyg0Var3.getClass();
                    } while (!p7m0Var7.m(value8, lla0.a((lla0) value8, null, null, null, null, null, 0, hko0.d, false, false, false, false, 895)));
                } else {
                    p7m0 p7m0Var8 = ocjVar3.f25029a;
                    do {
                        value7 = p7m0Var8.getValue();
                        value7.getClass();
                        oyg0Var3.getClass();
                    } while (!p7m0Var8.m(value7, lla0.a((lla0) value7, null, null, null, null, null, 0, null, false, false, false, true, 1023)));
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ema0 ema0Var = (ema0) obj3;
                a8z a8zVar10 = ema0Var.P1;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                xi70 xi70Var3 = ema0.R1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    gmq gmqVarC2 = ((i3t0) ((k3t0) a8zVar10.getValue())).C();
                    boolean zI19 = fetVar13.i(ema0Var);
                    Object objP19 = fetVar13.P();
                    if (zI19 || objP19 == cl5Var) {
                        hi70 hi70Var2 = new hi70(2, ema0Var, ema0.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/models/PlayersStatisticsSideEffect;)V", 4, (byte) 22);
                        fetVar13.o0(hi70Var2);
                        objP19 = hi70Var2;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    clz clzVarW2 = aac.W(ema0Var);
                    qjj.W(x0x.Q(clzVarW2.x()), null, null, new ji60((i89) gmqVarC2, clzVarW2, (Function2) objP19, null, (byte) 3), 3);
                    pz40 pz40VarY10 = ((i3t0) ((k3t0) a8zVar10.getValue())).y(fetVar13);
                    k3t0 k3t0Var10 = (k3t0) a8zVar10.getValue();
                    boolean zI20 = fetVar13.i(k3t0Var10);
                    Object objP20 = fetVar13.P();
                    if (zI20 || objP20 == cl5Var) {
                        yi90 yi90Var12 = new yi90(1, k3t0Var10, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar13.o0(yi90Var12);
                        objP20 = yi90Var12;
                    }
                    ahy.H(pz40VarY10, (Function1) ((jhy) objP20), fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ahy.I((rma0) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cz90(Object obj, int i, byte b) {
        this.f5215a = b;
        this.b = obj;
    }
}
