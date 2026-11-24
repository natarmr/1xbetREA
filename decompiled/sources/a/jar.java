package a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jar implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16204a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jar(Object obj, byte b) {
        this.f16204a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        ddv ddvVar = (ddv) this.b;
        a8z a8zVar = ddvVar.O1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        art artVar = ddv.Q1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(ddvVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                vft vftVar = new vft(1, ddvVar, ddv.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/statistic/grand_prix/presentation/model/GrandPrixTableSideEffect;)V", 0, (byte) 4);
                fetVar.o0(vftVar);
                objP = vftVar;
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                pc pcVar = new pc(k3t0Var, clzVar, pz40VarF, null, (byte) 21);
                fetVar.o0(pcVar);
                objP2 = pcVar;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP2);
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            boolean zI3 = fetVar.i(k3t0Var2);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                vft vftVar2 = new vft(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                fetVar.o0(vftVar2);
                objP3 = vftVar2;
            }
            epv0.u(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        Object value;
        Object value2;
        iun iunVar;
        ndv ndvVar = (ndv) this.b;
        oyg0 oyg0Var = ndvVar.f;
        ocj ocjVar = ndvVar.i;
        Throwable th = (Throwable) obj;
        th.getClass();
        ((String) obj2).getClass();
        if (th instanceof ff5) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
                iunVar = iun.f15405a;
                iunVar.getClass();
            } while (!p7m0Var.m(value2, new fdv(iunVar, iunVar, false, false)));
        } else {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, fdv.a((fdv) value, false, null, null, 12)));
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2) {
        a8z a8zVar = ((xtv) this.b).O1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        art artVar = xtv.P1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                vft vftVar = new vft(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                fetVar.o0(vftVar);
                objP = vftVar;
            }
            hew0.q(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kuw kuwVar;
        dja djaVar;
        Object value;
        Object value2;
        Object value3;
        byte b = this.f16204a;
        byte b2 = 17;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        int iCompare = 0;
        byte b3 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                a8z a8zVar = ((lar) obj3).O1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                xak xakVar = lar.Q1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar.i(k3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        pop popVar = new pop(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar.o0(popVar);
                        objP = popVar;
                    }
                    nia0.A(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                qcr qcrVar = (qcr) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                bek bekVar = qcr.Q1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ffb0.s((k3t0) qcrVar.P1.getValue(), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                lgb.p((efr) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                a8z a8zVar2 = ((vjr) obj3).N1;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                xak xakVar2 = vjr.P1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fkr fkrVar = (fkr) ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar3).getValue();
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI2 = fetVar3.i(k3t0Var2);
                    Object objP2 = fetVar3.P();
                    if (zI2 || objP2 == cl5Var) {
                        pop popVar2 = new pop(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                        fetVar3.o0(popVar2);
                        objP2 = popVar2;
                    }
                    x4d0.E(fkrVar, (Function1) ((jhy) objP2), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                hkr hkrVar = (hkr) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                hkrVar.G(new bkr(hkrVar.r.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            case 5:
                vkr vkrVar = (vkr) obj3;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                if ((th instanceof zhi0) && ((kuwVar = ((zhi0) th).c) == i2o.TokenExpiredError || kuwVar == i2o.LimitChangeFailed || kuwVar == i2o.GamblingExamFailed)) {
                    vkrVar.w(new rkr(str));
                } else {
                    vkrVar.w(new tkr(str));
                }
                return Unit.f46060a;
            case 6:
                mqr mqrVar = (mqr) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    mqrVar.getClass();
                    if (mqrVar instanceof iqr) {
                        fetVar4.e0(2123392807);
                        dtb.r(mm40VarD, (iqr) mqrVar, fetVar4, 6);
                        fetVar4.r(false);
                    } else {
                        if (!(mqrVar instanceof kqr)) {
                            throw b1j.f(2123390914, fetVar4, false);
                        }
                        fetVar4.e0(2123397573);
                        vtb.y(mm40VarD, (kqr) mqrVar, fetVar4, 6);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 7:
                oyg0 oyg0Var = (oyg0) obj;
                z2s z2sVar = (z2s) obj2;
                oyg0Var.getClass();
                z2sVar.getClass();
                irs irsVar = irs.b;
                q7x.F(oyg0Var, irsVar, "KEY_CURRENT_TAB");
                usr usrVar = (usr) ((xsr) obj3);
                if (usrVar != null) {
                    if (usrVar instanceof ssr) {
                        djaVar = dja.BROADCASTING_VIDEO;
                    } else if (usrVar instanceof tsr) {
                        djaVar = dja.BROADCASTING_ZONE;
                    }
                    q7x.F(oyg0Var, djaVar, "KEY_CURRENT_BROADCASTING_TYPE");
                    return z2s.a(z2sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, irsVar, djaVar, null, null, null, null, null, false, null, -1, 65343);
                }
                t9f.b();
                return null;
            case 8:
                r7s r7sVar = (r7s) obj2;
                ((oyg0) obj).getClass();
                r7sVar.getClass();
                i6s i6sVar = (i6s) ((v6s) obj3);
                return r7s.a(r7sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, i6sVar.f14257a, i6sVar.b, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -2013265921, 1048575);
            case 9:
                r7s r7sVarA = r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, true, null, null, null, null, null, null, null, null, null, false, -1, 1048351);
                ((g9s) obj3).o.e("KEY_SHOW_SUB_GAMES", Boolean.valueOf(r7sVarA.M));
                return r7sVarA;
            case 10:
                pas pasVar = (pas) obj3;
                das dasVar = (das) obj2;
                ((String) obj).getClass();
                if (dasVar == null) {
                    dasVar = new das();
                }
                return das.a(dasVar, null, null, pasVar, 3);
            case 11:
                a8z a8zVar3 = ((jbs) obj3).P1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                xak xakVar3 = jbs.R1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar5);
                    k3t0 k3t0Var3 = (k3t0) a8zVar3.getValue();
                    boolean zI3 = fetVar5.i(k3t0Var3);
                    Object objP3 = fetVar5.P();
                    if (zI3 || objP3 == cl5Var) {
                        h2s h2sVar = new h2s(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                        fetVar5.o0(h2sVar);
                        objP3 = h2sVar;
                    }
                    jiq0.C(pz40VarY2, (Function1) ((jhy) objP3), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 12:
                sbs sbsVar = (sbs) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = sbsVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    sbsVar.f.getClass();
                } while (!p7m0Var.m(value, uas.a((uas) value, false, false, true, null, null, false, null, null, 2035)));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                aac.u((xaa) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 14:
                mcs mcsVar = (mcs) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                bek bekVar2 = mcs.Z1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    gws gwsVar = (gws) ((i3t0) mcsVar.H0()).y(fetVar6).getValue();
                    sek sekVar = mcsVar.M1;
                    if (sekVar == null) {
                        Intrinsics.h("gameVideoFragmentFactory");
                        throw null;
                    }
                    bek bekVar3 = mcsVar.N1;
                    if (bekVar3 == null) {
                        Intrinsics.h("gameZoneFragmentFactory");
                        throw null;
                    }
                    z5s z5sVar = new z5s(mcsVar.G0().f47170a, mcsVar.G0().d, 189L, 0L, mcsVar.G0().b);
                    xex xexVar = mcsVar.R1;
                    if (xexVar == null) {
                        Intrinsics.h("cyberBottomSheetFactory");
                        throw null;
                    }
                    CyberBottomSheetParams cyberBottomSheetParams = new CyberBottomSheetParams(mcsVar.G0().f47170a, mcsVar.G0().d, mcsVar.G0().b, 189L, 0L, mcsVar.G0().e, new lq2(), grs.b, mcs.class.getSimpleName());
                    k3t0 k3t0VarH0 = mcsVar.H0();
                    boolean zI4 = fetVar6.i(k3t0VarH0);
                    Object objP4 = fetVar6.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new h2s(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                        fetVar6.o0(objP4);
                    }
                    slb.x(gwsVar, sekVar, bekVar3, z5sVar, xexVar, cyberBottomSheetParams, (Function1) ((jhy) objP4), fetVar6, 0);
                    k3t0 k3t0VarH1 = mcsVar.H0();
                    boolean zI5 = fetVar6.i(mcsVar);
                    Object objP5 = fetVar6.P();
                    Object obj4 = objP5;
                    if (zI5 || objP5 == cl5Var) {
                        kcs kcsVar = new kcs(mcsVar, (byte) 0);
                        fetVar6.o0(kcsVar);
                        obj4 = kcsVar;
                    }
                    clz clzVar = (clz) fetVar6.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) obj4, fetVar6);
                    boolean zI6 = fetVar6.i(k3t0VarH1) | fetVar6.i(clzVar) | fetVar6.e(3) | fetVar6.g(pz40VarF);
                    Object objP6 = fetVar6.P();
                    if (zI6 || objP6 == cl5Var) {
                        pc pcVar = new pc(k3t0VarH1, clzVar, pz40VarF, null, (byte) 19);
                        fetVar6.o0(pcVar);
                        objP6 = pcVar;
                    }
                    m0x0.t(fetVar6, clzVar, (Function2) objP6);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 15:
                uhs uhsVar = (uhs) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = uhsVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    uhsVar.f.getClass();
                } while (!p7m0Var2.m(value2, cis.a((cis) value2, null, null, ais.b, null, false, false, 107)));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                plc.p((uls) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                gns gnsVar = (gns) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                pek pekVar = gns.R1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) gnsVar.G0()).y(fetVar7);
                    k3t0 k3t0VarG0 = gnsVar.G0();
                    boolean zI7 = fetVar7.i(gnsVar);
                    Object objP7 = fetVar7.P();
                    if (zI7 || objP7 == cl5Var) {
                        h2s h2sVar2 = new h2s(1, gnsVar, gns.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationSideEffect;)V", 0, (byte) 14);
                        fetVar7.o0(h2sVar2);
                        objP7 = h2sVar2;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP7), fetVar7);
                    boolean zI8 = fetVar7.i(k3t0VarG0) | fetVar7.i(gnsVar) | fetVar7.e(3) | fetVar7.g(pz40VarF2);
                    Object objP8 = fetVar7.P();
                    if (zI8 || objP8 == cl5Var) {
                        bio bioVar = new bio(k3t0VarG0, gnsVar, pz40VarF2, null, (byte) 11);
                        fetVar7.o0(bioVar);
                        objP8 = bioVar;
                    }
                    m0x0.t(fetVar7, gnsVar, (Function2) objP8);
                    k3t0 k3t0VarG1 = gnsVar.G0();
                    boolean zI9 = fetVar7.i(k3t0VarG1);
                    Object objP9 = fetVar7.P();
                    if (zI9 || objP9 == cl5Var) {
                        h2s h2sVar3 = new h2s(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar7.o0(h2sVar3);
                        objP9 = h2sVar3;
                    }
                    jar0.o(pz40VarY3, (Function1) ((jhy) objP9), fetVar7, 0);
                    boolean zI10 = fetVar7.i(gnsVar);
                    Object objP10 = fetVar7.P();
                    Object obj5 = objP10;
                    if (zI10 || objP10 == cl5Var) {
                        cns cnsVar = new cns(gnsVar, b3);
                        fetVar7.o0(cnsVar);
                        obj5 = cnsVar;
                    }
                    Function0 function0 = (Function0) obj5;
                    Object objP11 = fetVar7.P();
                    Object obj6 = objP11;
                    if (objP11 == cl5Var) {
                        o9s o9sVar = new o9s((byte) 17);
                        fetVar7.o0(o9sVar);
                        obj6 = o9sVar;
                    }
                    v3c.z(function0, (Function0) obj6, null, fetVar7, 48, 4);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 18:
                Bundle bundle = (Bundle) obj2;
                pek pekVar2 = wws.S1;
                ((String) obj).getClass();
                bundle.getClass();
                long j = bundle.getLong("BUNDLE_KEY_GAME_ID");
                p7m0 p7m0Var3 = ((wws) obj3).H0().B;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, ixs.a((ixs) value3, j, null, false, false, false, false, null, false, false, null, false, null, false, false, 524286)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                iiy[] iiyVarArr = b8t.Q1;
                ((b8t) obj3).I0().A(zBooleanValue, zBooleanValue2);
                return Unit.f46060a;
            case 20:
                kit kitVar = (kit) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                bek bekVar4 = kit.Q1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Context context = (Context) fetVar8.k(dy2.b);
                    boolean zI11 = fetVar8.i(context);
                    Object objP12 = fetVar8.P();
                    byte b4 = 13;
                    if (zI11 || objP12 == cl5Var) {
                        objP12 = new i7q(context, (byte) 13);
                        fetVar8.o0(objP12);
                    }
                    Function0 function1 = (Function0) objP12;
                    boolean zI12 = fetVar8.i(context);
                    Object objP13 = fetVar8.P();
                    if (zI12 || objP13 == cl5Var) {
                        objP13 = new i7q(context, (byte) 12);
                        fetVar8.o0(objP13);
                    }
                    v3c.z(function1, (Function0) objP13, null, fetVar8, 0, 4);
                    k3t0 k3t0VarG2 = kitVar.G0();
                    boolean zI13 = fetVar8.i(kitVar);
                    Object objP14 = fetVar8.P();
                    if (zI13 || objP14 == cl5Var) {
                        vft vftVar = new vft(1, kitVar, kit.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponSideEffect;)V", 0, (byte) 1);
                        fetVar8.o0(vftVar);
                        objP14 = vftVar;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP14), fetVar8);
                    boolean zI14 = fetVar8.i(k3t0VarG2) | fetVar8.i(kitVar) | fetVar8.e(3) | fetVar8.g(pz40VarF3);
                    Object objP15 = fetVar8.P();
                    if (zI14 || objP15 == cl5Var) {
                        bio bioVar2 = new bio(k3t0VarG2, kitVar, pz40VarF3, null, (byte) 12);
                        fetVar8.o0(bioVar2);
                        objP15 = bioVar2;
                    }
                    m0x0.t(fetVar8, kitVar, (Function2) objP15);
                    pz40 pz40VarY4 = ((i3t0) kitVar.G0()).y(fetVar8);
                    Object[] objArr = new Object[0];
                    boolean zG = fetVar8.g(pz40VarY4);
                    Object objP16 = fetVar8.P();
                    if (zG || objP16 == cl5Var) {
                        objP16 = new z6s(pz40VarY4, b2);
                        fetVar8.o0(objP16);
                    }
                    l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP16, fetVar8);
                    Object[] objArr2 = new Object[0];
                    boolean zG2 = fetVar8.g(pz40VarY4);
                    Object objP17 = fetVar8.P();
                    if (zG2 || objP17 == cl5Var) {
                        objP17 = new z6s(pz40VarY4, (byte) 18);
                        fetVar8.o0(objP17);
                    }
                    l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP17, fetVar8);
                    Object[] objArr3 = new Object[0];
                    boolean zG3 = fetVar8.g(pz40VarY4);
                    Object objP18 = fetVar8.P();
                    if (zG3 || objP18 == cl5Var) {
                        objP18 = new z6s(pz40VarY4, (byte) 19);
                        fetVar8.o0(objP18);
                    }
                    l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP18, fetVar8);
                    Object[] objArr4 = new Object[0];
                    boolean zG4 = fetVar8.g(pz40VarY4);
                    Object objP19 = fetVar8.P();
                    if (zG4 || objP19 == cl5Var) {
                        objP19 = new z6s(pz40VarY4, (byte) 20);
                        fetVar8.o0(objP19);
                    }
                    l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP19, fetVar8);
                    Object[] objArr5 = new Object[0];
                    boolean zG5 = fetVar8.g(pz40VarY4);
                    Object objP20 = fetVar8.P();
                    if (zG5 || objP20 == cl5Var) {
                        objP20 = new z6s(pz40VarY4, (byte) 21);
                        fetVar8.o0(objP20);
                    }
                    l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP20, fetVar8);
                    Object[] objArr6 = new Object[0];
                    boolean zG6 = fetVar8.g(pz40VarY4);
                    Object objP21 = fetVar8.P();
                    if (zG6 || objP21 == cl5Var) {
                        objP21 = new z6s(pz40VarY4, (byte) 22);
                        fetVar8.o0(objP21);
                    }
                    l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP21, fetVar8);
                    Object[] objArr7 = new Object[0];
                    boolean zG7 = fetVar8.g(pz40VarY4);
                    Object objP22 = fetVar8.P();
                    if (zG7 || objP22 == cl5Var) {
                        objP22 = new z6s(pz40VarY4, (byte) 23);
                        fetVar8.o0(objP22);
                    }
                    l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP22, fetVar8);
                    Object[] objArr8 = new Object[0];
                    boolean zG8 = fetVar8.g(pz40VarY4);
                    Object objP23 = fetVar8.P();
                    if (zG8 || objP23 == cl5Var) {
                        objP23 = new z6s(pz40VarY4, (byte) 24);
                        fetVar8.o0(objP23);
                    }
                    l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP23, fetVar8);
                    Object[] objArr9 = new Object[0];
                    boolean zG9 = fetVar8.g(pz40VarY4);
                    Object objP24 = fetVar8.P();
                    if (zG9 || objP24 == cl5Var) {
                        objP24 = new z6s(pz40VarY4, (byte) 25);
                        fetVar8.o0(objP24);
                    }
                    l7m0 l7m0VarY9 = v3c.Y(objArr9, (Function0) objP24, fetVar8);
                    Object[] objArr10 = new Object[0];
                    boolean zG10 = fetVar8.g(pz40VarY4);
                    Object objP25 = fetVar8.P();
                    if (zG10 || objP25 == cl5Var) {
                        objP25 = new z6s(pz40VarY4, (byte) 26);
                        fetVar8.o0(objP25);
                    }
                    l7m0 l7m0VarY10 = v3c.Y(objArr10, (Function0) objP25, fetVar8);
                    Object[] objArr11 = new Object[0];
                    boolean zG11 = fetVar8.g(pz40VarY4);
                    Object objP26 = fetVar8.P();
                    if (zG11 || objP26 == cl5Var) {
                        objP26 = new z6s(pz40VarY4, (byte) 27);
                        fetVar8.o0(objP26);
                    }
                    l7m0 l7m0VarY11 = v3c.Y(objArr11, (Function0) objP26, fetVar8);
                    Object[] objArr12 = new Object[0];
                    boolean zG12 = fetVar8.g(pz40VarY4);
                    Object objP27 = fetVar8.P();
                    if (zG12 || objP27 == cl5Var) {
                        objP27 = new z6s(pz40VarY4, (byte) 28);
                        fetVar8.o0(objP27);
                    }
                    l7m0 l7m0VarY12 = v3c.Y(objArr12, (Function0) objP27, fetVar8);
                    Object[] objArr13 = new Object[0];
                    boolean zG13 = fetVar8.g(pz40VarY4);
                    Object objP28 = fetVar8.P();
                    if (zG13 || objP28 == cl5Var) {
                        objP28 = new z6s(pz40VarY4, (byte) 29);
                        fetVar8.o0(objP28);
                    }
                    l7m0 l7m0VarY13 = v3c.Y(objArr13, (Function0) objP28, fetVar8);
                    Object[] objArr14 = new Object[0];
                    boolean zG14 = fetVar8.g(pz40VarY4);
                    Object objP29 = fetVar8.P();
                    if (zG14 || objP29 == cl5Var) {
                        objP29 = new z6s(pz40VarY4, b4);
                        fetVar8.o0(objP29);
                    }
                    l7m0 l7m0VarY14 = v3c.Y(objArr14, (Function0) objP29, fetVar8);
                    Object[] objArr15 = new Object[0];
                    boolean zG15 = fetVar8.g(pz40VarY4);
                    Object objP30 = fetVar8.P();
                    if (zG15 || objP30 == cl5Var) {
                        objP30 = new z6s(pz40VarY4, (byte) 14);
                        fetVar8.o0(objP30);
                    }
                    l7m0 l7m0VarY15 = v3c.Y(objArr15, (Function0) objP30, fetVar8);
                    Object[] objArr16 = new Object[0];
                    boolean zG16 = fetVar8.g(pz40VarY4);
                    Object objP31 = fetVar8.P();
                    if (zG16 || objP31 == cl5Var) {
                        objP31 = new z6s(pz40VarY4, (byte) 15);
                        fetVar8.o0(objP31);
                    }
                    l7m0 l7m0VarY16 = v3c.Y(objArr16, (Function0) objP31, fetVar8);
                    Object[] objArr17 = new Object[0];
                    boolean zG17 = fetVar8.g(pz40VarY4);
                    Object objP32 = fetVar8.P();
                    if (zG17 || objP32 == cl5Var) {
                        objP32 = new z6s(pz40VarY4, (byte) 16);
                        fetVar8.o0(objP32);
                    }
                    l7m0 l7m0VarY17 = v3c.Y(objArr17, (Function0) objP32, fetVar8);
                    zfn zfnVar = zaq0.b;
                    ilm ilmVar = new ilm(((ThemeColors) fetVar8.k(zfnVar)).getSecondary());
                    plm plmVar = new plm(((ait) l7m0VarY8.getValue()).c, ((ThemeColors) fetVar8.k(zfnVar)).getSecondary(), fa50.f9191a);
                    pz40 pz40Var = s6t0.f31722a;
                    tht thtVar = new tht(new imm(ilmVar, plmVar, fmm.f9790a, ((ThemeColors) fetVar8.k(zfnVar)).getBackgroundContent(), true, new y3d(s6t0.b().f33626a.getSeparator60())), new wul(lul.e, oe9.f25112a, new ue9(((ait) l7m0VarY8.getValue()).d), ((Boolean) l7m0VarY9.getValue()).booleanValue(), ((Boolean) l7m0VarY11.getValue()).booleanValue(), true));
                    k3t0 k3t0VarG3 = kitVar.G0();
                    boolean zI15 = fetVar8.i(k3t0VarG3);
                    Object objP33 = fetVar8.P();
                    if (zI15 || objP33 == cl5Var) {
                        objP33 = new vft(1, k3t0VarG3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 2);
                        fetVar8.o0(objP33);
                    }
                    f1t0.w(null, l7m0VarY, l7m0VarY16, l7m0VarY2, l7m0VarY4, l7m0VarY10, l7m0VarY5, l7m0VarY3, l7m0VarY8, l7m0VarY6, l7m0VarY7, l7m0VarY12, l7m0VarY13, l7m0VarY14, l7m0VarY15, l7m0VarY17, thtVar, (Function1) ((jhy) objP33), fetVar8, 0, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 21:
                pbv pbvVar = (pbv) obj;
                pbv pbvVar2 = (pbv) obj2;
                pbvVar.getClass();
                String str2 = pbvVar.f;
                pbvVar2.getClass();
                String str3 = pbvVar2.f;
                byte b5 = ((my60) ((uyn) ((x4u) ((nr) obj3).d).f40284a).f36498a).f22591a;
                if (b5 == 1) {
                    Double dI = kotlin.text.b.i(str2);
                    double dDoubleValue = dI != null ? dI.doubleValue() : -1.7976931348623157E308d;
                    Double dI2 = kotlin.text.b.i(str3);
                    iCompare = Double.compare(dDoubleValue, dI2 != null ? dI2.doubleValue() : -1.7976931348623157E308d);
                } else if (b5 == 2) {
                    Double dI3 = kotlin.text.b.i(str2);
                    double dDoubleValue2 = dI3 != null ? dI3.doubleValue() : -1.7976931348623157E308d;
                    Double dI4 = kotlin.text.b.i(str3);
                    iCompare = Double.compare(dI4 != null ? dI4.doubleValue() : -1.7976931348623157E308d, dDoubleValue2);
                } else if (b5 == 3) {
                    iCompare = pbvVar.c.compareTo(pbvVar2.c);
                }
                return Integer.valueOf(iCompare);
            case 22:
                g8v g8vVar = (g8v) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                rqt rqtVar = g8v.P1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    s8v s8vVar = (s8v) ((i3t0) g8vVar.I0()).y(fetVar9).getValue();
                    k3t0 k3t0VarI0 = g8vVar.I0();
                    boolean zI16 = fetVar9.i(k3t0VarI0);
                    Object objP34 = fetVar9.P();
                    if (zI16 || objP34 == cl5Var) {
                        vft vftVar2 = new vft(1, k3t0VarI0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                        fetVar9.o0(vftVar2);
                        objP34 = vftVar2;
                    }
                    d5c.q(null, s8vVar, (Function1) ((jhy) objP34), fetVar9, 0);
                    clz clzVar2 = (clz) fetVar9.k(or00.f25714a);
                    bfo0 bfo0Var = s8vVar.c;
                    boolean zI17 = fetVar9.i(clzVar2) | fetVar9.i(g8vVar) | fetVar9.g(s8vVar);
                    Object objP35 = fetVar9.P();
                    Object obj7 = objP35;
                    if (zI17 || objP35 == cl5Var) {
                        fns fnsVar = new fns(clzVar2, g8vVar, s8vVar, (yje) null);
                        fetVar9.o0(fnsVar);
                        obj7 = fnsVar;
                    }
                    m0x0.t(fetVar9, bfo0Var, (Function2) obj7);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 23:
                w9v w9vVar = (w9v) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    k7x.a(w9vVar.c, null, o2e.e0(jm40Var, "GOLD_RUSH_GOLD_ICON"), gqw0.A, null, fetVar10, 1573296, 1976);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 24:
                return a(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                epv0.L((jdv) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return b(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                rcb.M((yiv) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return c(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                hew0.C((ztv) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ jar(Object obj, int i, byte b) {
        this.f16204a = b;
        this.b = obj;
    }
}
