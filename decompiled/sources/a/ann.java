package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardMiddleView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ann implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1164a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ann(Object obj, Object obj2, Object obj3, byte b) {
        this.f1164a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1164a;
        byte b2 = 11;
        cl5 cl5Var = ukd.f35823a;
        Long lValueOf = null;
        boolean z = false;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                hmw0.v((mm40) obj5, (onn) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                vfc.s((mm40) obj5, (jpn) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                jyn jynVar = (jyn) obj5;
                Function0 function0 = (Function0) obj4;
                Function0 function1 = (Function0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nia0.o(null, u1c.M(-2101694184, new eyn(jynVar, function0, function1, z ? (byte) 1 : (byte) 0), fetVar), fetVar, 48);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 3:
                kq20 kq20Var = (kq20) obj5;
                List list = (List) obj4;
                Context context = (Context) obj3;
                g6o0 g6o0Var = (g6o0) obj;
                jq20 jq20Var = (jq20) obj2;
                g6o0Var.getClass();
                jq20Var.getClass();
                if (jq20Var instanceof iq20) {
                    kbc.M(g6o0Var.b, kq20Var.b, list);
                } else {
                    if (!(jq20Var instanceof hq20)) {
                        t9f.b();
                        return null;
                    }
                    g6o0Var.f10778a.setBackground(sj3.U(kq20Var.f18700a, context));
                }
                return Unit.f46060a;
            case 4:
                qq20 qq20Var = (qq20) obj5;
                List list2 = (List) obj4;
                Context context2 = (Context) obj3;
                h6o0 h6o0Var = (h6o0) obj;
                pq20 pq20Var = (pq20) obj2;
                h6o0Var.getClass();
                pq20Var.getClass();
                if (pq20Var instanceof mq20) {
                    mbc.O(h6o0Var.b, qq20Var.d, list2);
                } else if (pq20Var instanceof lq20) {
                    h6o0Var.f12540a.setBackground(sj3.U(qq20Var.c, context2));
                } else if (pq20Var instanceof nq20) {
                    List list3 = u0d.f34849a;
                    u0d.n(h6o0Var.c, qq20Var.f, 0, 11);
                } else {
                    if (!(pq20Var instanceof oq20)) {
                        t9f.b();
                        return null;
                    }
                    h6o0Var.d.setText(qq20Var.e);
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                sac.t((mm40) obj5, (ah7) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                jeb.w((mm40) obj5, (ehm0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                thb.r((mm40) obj5, (String) obj4, (m0x) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                bkb.n((mm40) obj5, (nfa) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                bkb.y((mm40) obj5, (String) obj4, (n0x) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                ckb.w((mm40) obj5, (pwe) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                chl0 chl0Var = (chl0) obj5;
                cgj cgjVar = (cgj) obj4;
                ExpressCardMiddleView expressCardMiddleView = (ExpressCardMiddleView) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i = ExpressCardMiddleView.r;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pz40 pz40VarF = androidx.compose.runtime.e.f(chl0Var, fetVar2);
                    gil0 gil0Var = lhj.i;
                    boolean zI = fetVar2.i(cgjVar) | fetVar2.i(expressCardMiddleView);
                    Object objP = fetVar2.P();
                    if (zI || objP == cl5Var) {
                        objP = new qzn(cgjVar, expressCardMiddleView, (byte) 25);
                        fetVar2.o0(objP);
                    }
                    vfc.q(null, pz40VarF, gil0Var, (Function1) objP, null, fetVar2, 0, 17);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                ebc.x((mm40) obj5, (cuo) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                vfc.v((mm40) obj5, (z0p) obj4, (nrq) obj3, (fet) obj, x8x.L(449));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                obb.y((pz40) obj5, (Function2) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                rcb.G((mm40) obj5, (f7p) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                wfp.a((mm40) obj5, (zfp) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                xfp.a((mm40) obj5, (y4a0) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                yfp.a((mm40) obj5, (z4a0) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                slb.s((mm40) obj5, (b5a0) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                nip.b((mm40) obj5, (kip) obj4, (ugd) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                usv usvVar = (usv) obj5;
                e2d e2dVar = (e2d) obj4;
                Function1 function2 = (Function1) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    o2e.r(usvVar.f36229a, e2dVar, usvVar.i, function2, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                rcb.h((mm40) obj5, (ss10) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                rcb.R((gf6) obj5, (bwj0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                rcb.P((b7c0) obj5, (gf6) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                rcb.b((gf6) obj5, (rx4) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ieb.x((mm40) obj5, (jxb0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                x4d0.R((mm40) obj5, (okr) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mm40 mm40Var = (mm40) obj5;
                l7m0 l7m0Var = (l7m0) obj4;
                dnr dnrVar = (dnr) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ddk ddkVar = dnr.c2;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zI2 = fetVar4.i(dnrVar);
                    Object objP2 = fetVar4.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new anr(dnrVar, (byte) 2);
                        fetVar4.o0(objP2);
                    }
                    Function2 function3 = (Function2) objP2;
                    l7m0Var.getClass();
                    function3.getClass();
                    znd zndVar = (znd) l7m0Var.getValue();
                    if (zndVar == null) {
                        fetVar4.e0(1804920765);
                        fetVar4.r(false);
                    } else {
                        byte b3 = 19;
                        if (zndVar instanceof god) {
                            fetVar4.e0(-1465822646);
                            god godVar = (god) zndVar;
                            ny9.e(mm40Var, null, u1c.M(-676185354, new ec30(afp0.c(godVar.f11625a, godVar.b, fetVar4), godVar, (byte) 18), fetVar4), u1c.M(589885431, new awh(godVar, b3), fetVar4), fetVar4, 27648, 6);
                            fetVar4.r(false);
                        } else if (zndVar instanceof hod) {
                            fetVar4.e0(-1465817721);
                            final hod hodVar = (hod) zndVar;
                            final byte b4 = z ? (byte) 1 : (byte) 0;
                            ugd ugdVarM = u1c.M(-1905074680, new ydr() { // from class: a.dod
                                @Override // a.ydr
                                public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    byte b5 = b4;
                                    hod hodVar2 = hodVar;
                                    y5d y5dVar = (y5d) obj6;
                                    switch (b5) {
                                        case 0:
                                            mm40 mm40Var2 = (mm40) obj7;
                                            fet fetVar5 = (fet) obj8;
                                            int iD = dw9.d((Integer) obj9, y5dVar, mm40Var2);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                b34.k(q8a.k0(o7k0.d(mm40Var2, 1.0f), enx.b), kotlin.collections.a.c(u1c.M(1016628125, new sd8(hodVar2, (byte) 13), fetVar5)), oja0.f25350a, fetVar5, 0);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var3 = (mm40) obj7;
                                            fet fetVar6 = (fet) obj8;
                                            int iD2 = dw9.d((Integer) obj9, y5dVar, mm40Var3);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                vbc.j(o7k0.e(s5x0.N(mm40Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13), 12.0f), hodVar2.b, fetVar6);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4);
                            final char c5 = c4 == true ? 1 : 0;
                            ny9.e(mm40Var, null, ugdVarM, u1c.M(-1782170743, new ydr() { // from class: a.dod
                                @Override // a.ydr
                                public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    byte b5 = c5;
                                    hod hodVar2 = hodVar;
                                    y5d y5dVar = (y5d) obj6;
                                    switch (b5) {
                                        case 0:
                                            mm40 mm40Var2 = (mm40) obj7;
                                            fet fetVar5 = (fet) obj8;
                                            int iD = dw9.d((Integer) obj9, y5dVar, mm40Var2);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                b34.k(q8a.k0(o7k0.d(mm40Var2, 1.0f), enx.b), kotlin.collections.a.c(u1c.M(1016628125, new sd8(hodVar2, (byte) 13), fetVar5)), oja0.f25350a, fetVar5, 0);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var3 = (mm40) obj7;
                                            fet fetVar6 = (fet) obj8;
                                            int iD2 = dw9.d((Integer) obj9, y5dVar, mm40Var3);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                vbc.j(o7k0.e(s5x0.N(mm40Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13), 12.0f), hodVar2.b, fetVar6);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4), fetVar4, 27696, 4);
                            fetVar4.r(false);
                        } else if (zndVar instanceof fod) {
                            fetVar4.e0(-1465813924);
                            final fod fodVar = (fod) zndVar;
                            final byte b5 = z ? (byte) 1 : (byte) 0;
                            ugd ugdVarM2 = u1c.M(378005494, new ydr() { // from class: a.aod
                                @Override // a.ydr
                                public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    int i2;
                                    byte b6 = b5;
                                    fod fodVar2 = fodVar;
                                    y5d y5dVar = (y5d) obj6;
                                    mm40 mm40Var2 = (mm40) obj7;
                                    fet fetVar5 = (fet) obj8;
                                    Integer num = (Integer) obj9;
                                    switch (b6) {
                                        case 0:
                                            int iD = dw9.d(num, y5dVar, mm40Var2);
                                            if ((iD & 6) == 0) {
                                                i2 = (fetVar5.g(y5dVar) ? 4 : 2) | iD;
                                            } else {
                                                i2 = iD;
                                            }
                                            if ((iD & 48) == 0) {
                                                i2 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(i2 & 1, (i2 & 147) != 146)) {
                                                obc.d(dgp0.f6053a.a(3), u1c.M(-1311617866, new ywa(y5dVar, mm40Var2, (znd) fodVar2, (byte) 17), fetVar5), fetVar5, 56);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            int iD2 = dw9.d(num, y5dVar, mm40Var2);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                vbc.j(o7k0.e(mm40Var2, 12.0f), fodVar2.c, fetVar5);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4);
                            final char c6 = c3 == true ? 1 : 0;
                            ny9.e(mm40Var, null, ugdVarM2, u1c.M(1868574199, new ydr() { // from class: a.aod
                                @Override // a.ydr
                                public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    int i2;
                                    byte b6 = c6;
                                    fod fodVar2 = fodVar;
                                    y5d y5dVar = (y5d) obj6;
                                    mm40 mm40Var2 = (mm40) obj7;
                                    fet fetVar5 = (fet) obj8;
                                    Integer num = (Integer) obj9;
                                    switch (b6) {
                                        case 0:
                                            int iD = dw9.d(num, y5dVar, mm40Var2);
                                            if ((iD & 6) == 0) {
                                                i2 = (fetVar5.g(y5dVar) ? 4 : 2) | iD;
                                            } else {
                                                i2 = iD;
                                            }
                                            if ((iD & 48) == 0) {
                                                i2 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(i2 & 1, (i2 & 147) != 146)) {
                                                obc.d(dgp0.f6053a.a(3), u1c.M(-1311617866, new ywa(y5dVar, mm40Var2, (znd) fodVar2, (byte) 17), fetVar5), fetVar5, 56);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            int iD2 = dw9.d(num, y5dVar, mm40Var2);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                vbc.j(o7k0.e(mm40Var2, 12.0f), fodVar2.c, fetVar5);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4), fetVar4, 27696, 4);
                            fetVar4.r(false);
                        } else if (zndVar instanceof sod) {
                            fetVar4.e0(-1465810308);
                            sod sodVar = (sod) zndVar;
                            if (sodVar instanceof rod) {
                                fetVar4.e0(-503669995);
                                rod rodVar = (rod) sodVar;
                                ny9.e(mm40Var, null, u1c.M(1504367063, new n82(rodVar, androidx.compose.runtime.e.f(rodVar.c.f31653a, fetVar4), function3, b2), fetVar4), u1c.M(-1746812264, new awh(rodVar, (byte) 22), fetVar4), fetVar4, 27648, 6);
                                fetVar4.r(false);
                            } else if (sodVar instanceof qod) {
                                fetVar4.e0(-503663459);
                                qod qodVar = (qod) sodVar;
                                ny9.e(mm40Var, null, u1c.M(-1092585818, new ec30(afp0.c(qodVar.f29069a, qodVar.b, fetVar4), qodVar, b3), fetVar4), u1c.M(-1228613115, new awh(qodVar, (byte) 21), fetVar4), fetVar4, 27648, 6);
                                fetVar4.r(false);
                            } else {
                                if (!(sodVar instanceof pod)) {
                                    throw b1j.f(-503671531, fetVar4, false);
                                }
                                fetVar4.e0(-503659633);
                                pod podVar = (pod) sodVar;
                                gex gexVar = podVar.f27324a;
                                ny9.e(mm40Var, null, u1c.M(1715796312, new g54(androidx.compose.runtime.e.f(Boolean.valueOf(gexVar == gex.f11177a), fetVar4), podVar, function3, androidx.compose.runtime.e.f(Boolean.valueOf(gexVar == gex.b), fetVar4)), fetVar4), u1c.M(-157417225, new awh(podVar, (byte) 20), fetVar4), fetVar4, 27648, 6);
                                fetVar4.r(false);
                            }
                            fetVar4.r(false);
                        } else if (zndVar instanceof tod) {
                            fetVar4.e0(-1465803833);
                            final tod todVar = (tod) zndVar;
                            final byte b6 = z ? (byte) 1 : (byte) 0;
                            ugd ugdVarM3 = u1c.M(588480032, new ydr() { // from class: a.nod
                                @Override // a.ydr
                                public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    byte b7 = b6;
                                    tod todVar2 = todVar;
                                    y5d y5dVar = (y5d) obj6;
                                    switch (b7) {
                                        case 0:
                                            mm40 mm40Var2 = (mm40) obj7;
                                            fet fetVar5 = (fet) obj8;
                                            int iD = dw9.d((Integer) obj9, y5dVar, mm40Var2);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                b34.k(q8a.k0(o7k0.d(mm40Var2, 1.0f), enx.b), kotlin.collections.a.c(u1c.M(-784784459, new sd8(todVar2, (byte) 15), fetVar5)), ffb0.f9442a, fetVar5, 0);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var3 = (mm40) obj7;
                                            fet fetVar6 = (fet) obj8;
                                            int iD2 = dw9.d((Integer) obj9, y5dVar, mm40Var3);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                vbc.j(o7k0.e(s5x0.N(mm40Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13), 12.0f), todVar2.b, fetVar6);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4);
                            final char c7 = c2 == true ? 1 : 0;
                            ny9.e(mm40Var, null, ugdVarM3, u1c.M(711383969, new ydr() { // from class: a.nod
                                @Override // a.ydr
                                public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    byte b7 = c7;
                                    tod todVar2 = todVar;
                                    y5d y5dVar = (y5d) obj6;
                                    switch (b7) {
                                        case 0:
                                            mm40 mm40Var2 = (mm40) obj7;
                                            fet fetVar5 = (fet) obj8;
                                            int iD = dw9.d((Integer) obj9, y5dVar, mm40Var2);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                b34.k(q8a.k0(o7k0.d(mm40Var2, 1.0f), enx.b), kotlin.collections.a.c(u1c.M(-784784459, new sd8(todVar2, (byte) 15), fetVar5)), ffb0.f9442a, fetVar5, 0);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var3 = (mm40) obj7;
                                            fet fetVar6 = (fet) obj8;
                                            int iD2 = dw9.d((Integer) obj9, y5dVar, mm40Var3);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                vbc.j(o7k0.e(s5x0.N(mm40Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13), 12.0f), todVar2.b, fetVar6);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4), fetVar4, 27696, 4);
                            fetVar4.r(false);
                        } else if (zndVar instanceof ood) {
                            fetVar4.e0(-1465800026);
                            final ood oodVar = (ood) zndVar;
                            final byte b7 = z ? (byte) 1 : (byte) 0;
                            ugd ugdVarM4 = u1c.M(1166275054, new ydr() { // from class: a.iod
                                @Override // a.ydr
                                public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    int i2;
                                    byte b8 = b7;
                                    ood oodVar2 = oodVar;
                                    y5d y5dVar = (y5d) obj6;
                                    mm40 mm40Var2 = (mm40) obj7;
                                    fet fetVar5 = (fet) obj8;
                                    Integer num = (Integer) obj9;
                                    switch (b8) {
                                        case 0:
                                            int iD = dw9.d(num, y5dVar, mm40Var2);
                                            if ((iD & 6) == 0) {
                                                i2 = (fetVar5.g(y5dVar) ? 4 : 2) | iD;
                                            } else {
                                                i2 = iD;
                                            }
                                            if ((iD & 48) == 0) {
                                                i2 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(i2 & 1, (i2 & 147) != 146)) {
                                                obc.d(dgp0.f6053a.a(3), u1c.M(-523348306, new ywa(y5dVar, mm40Var2, (znd) oodVar2, (byte) 18), fetVar5), fetVar5, 56);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            int iD2 = dw9.d(num, y5dVar, mm40Var2);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                vbc.j(o7k0.e(mm40Var2, 12.0f), oodVar2.d, fetVar5);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4);
                            final char c8 = c == true ? 1 : 0;
                            ny9.e(mm40Var, null, ugdVarM4, u1c.M(-1638123537, new ydr() { // from class: a.iod
                                @Override // a.ydr
                                public final Object j(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    int i2;
                                    byte b8 = c8;
                                    ood oodVar2 = oodVar;
                                    y5d y5dVar = (y5d) obj6;
                                    mm40 mm40Var2 = (mm40) obj7;
                                    fet fetVar5 = (fet) obj8;
                                    Integer num = (Integer) obj9;
                                    switch (b8) {
                                        case 0:
                                            int iD = dw9.d(num, y5dVar, mm40Var2);
                                            if ((iD & 6) == 0) {
                                                i2 = (fetVar5.g(y5dVar) ? 4 : 2) | iD;
                                            } else {
                                                i2 = iD;
                                            }
                                            if ((iD & 48) == 0) {
                                                i2 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(i2 & 1, (i2 & 147) != 146)) {
                                                obc.d(dgp0.f6053a.a(3), u1c.M(-523348306, new ywa(y5dVar, mm40Var2, (znd) oodVar2, (byte) 18), fetVar5), fetVar5, 56);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            int iD2 = dw9.d(num, y5dVar, mm40Var2);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                zcl zclVar = qmk.f28987a;
                                                vbc.j(o7k0.e(mm40Var2, 12.0f), oodVar2.d, fetVar5);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4), fetVar4, 27696, 4);
                            fetVar4.r(false);
                        } else if (zndVar instanceof vnd) {
                            fetVar4.e0(-1465795938);
                            hp4.g(mm40Var, (vnd) zndVar, fetVar4, 0);
                            fetVar4.r(false);
                        } else {
                            if (!(zndVar instanceof uod)) {
                                throw b1j.f(-1465824561, fetVar4, false);
                            }
                            fetVar4.e0(1805066589);
                            fetVar4.r(false);
                        }
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                xvm0 xvm0Var = (xvm0) obj5;
                js20 js20Var = (js20) obj4;
                vzg0 vzg0Var = ((spr) obj3).o;
                qnr qnrVar = (qnr) obj2;
                long id = xvm0Var.getId();
                if (js20Var != null) {
                    if (!(js20Var instanceof gs20) && !(js20Var instanceof hs20)) {
                        if (js20Var instanceof is20) {
                            lValueOf = Long.valueOf(((is20) js20Var).f15285a);
                        }
                    }
                    qnr qnrVarA = qnr.a(qnrVar, 0L, null, null, false, 0L, id, lValueOf, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, xvm0Var, js20Var, null, null, null, null, null, null, false, null, false, -97, 523903);
                    vzg0Var.e("KEY_SUB_GAME_ID", Long.valueOf(qnrVarA.f));
                    vzg0Var.e("KEY_CATEGORY_ID", qnrVarA.g);
                    return qnrVarA;
                }
                t9f.b();
                return null;
        }
    }

    public /* synthetic */ ann(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f1164a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
