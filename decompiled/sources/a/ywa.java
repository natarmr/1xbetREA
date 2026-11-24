package a;

import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ywa implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43361a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ywa(k2d k2dVar, mm40 mm40Var, ugd ugdVar, int i) {
        this.f43361a = (byte) 10;
        this.d = k2dVar;
        this.c = mm40Var;
        this.b = ugdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strK;
        String str;
        byte b = this.f43361a;
        byte b2 = 9;
        cl5 cl5Var = ukd.f35823a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        final byte b3 = 2;
        final byte b4 = 1;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ffb0.j((mm40) obj5, (axa) obj4, (Function1) obj3, (fet) obj, x8x.L(385));
                break;
            case 1:
                ((Integer) obj2).getClass();
                qjj.i((pib) obj5, (FixedWebView) obj4, (Function1) obj3, (fet) obj, x8x.L(65));
                break;
            case 2:
                ((Integer) obj2).getClass();
                slb.a((mm40) obj5, (pjb) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                mrv.u((mm40) obj5, (wrb) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ozb.e((mm40) obj5, (rzb) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                pzb.a((mm40) obj5, (szb) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                qzb.c((mm40) obj5, (tzb) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                knx.n((mm40) obj5, (gfc) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 8:
                xhc xhcVar = (xhc) obj5;
                wpq wpqVar = (wpq) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ju70.h(null, u1c.M(-1267323369, new phc(xhcVar, wpqVar, function1), fetVar), fetVar, 48, 1);
                } else {
                    fetVar.X();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                slb.H((mm40) obj5, (o0x) obj4, (String) obj3, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                qzb.L((k2d) obj4, (mm40) obj5, (ugd) obj3, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                nia0.s((mm40) obj5, (m4d) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 12:
                rah0 rah0Var = (rah0) obj5;
                jh5 jh5Var = (jh5) obj4;
                dk5 dk5Var = (dk5) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float fL = rah0Var.f30133a.l();
                    zcl zclVar = qmk.f28987a;
                    float fB = fL - pkd.b(34.0f, fetVar2);
                    fmm fmmVar = fmm.f9790a;
                    fa50 fa50Var = fa50.f9191a;
                    if (fB <= 0.0f) {
                        fetVar2.e0(1394982159);
                        zfn zfnVar = zaq0.b;
                        ilm ilmVar = new ilm(((ThemeColors) fetVar2.k(zfnVar)).getSecondary());
                        String str2 = jh5Var != null ? jh5Var.b : null;
                        String str3 = str2 == null ? "" : str2;
                        str = jh5Var != null ? jh5Var.f16512a : null;
                        imm immVar = new imm(ilmVar, new rlm(str3, str == null ? "" : str, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fa50Var), fmmVar, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), false, null);
                        boolean zI = fetVar2.i(dk5Var);
                        Object objP = fetVar2.P();
                        if (zI || objP == cl5Var) {
                            objP = new uj5(dk5Var, b4);
                            fetVar2.o0(objP);
                        }
                        hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar2, 805306368, 54, Response.NOT_IMPLEMENTED);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1396179906);
                        zfn zfnVar2 = zaq0.b;
                        ilm ilmVar2 = new ilm(((ThemeColors) fetVar2.k(zfnVar2)).getSecondary());
                        if (jh5Var != null) {
                            pn40 pn40Var = pn40.f27267a;
                            strK = pn40.k(jh5Var.d, jh5Var.c);
                        } else {
                            strK = "";
                        }
                        str = jh5Var != null ? jh5Var.b : null;
                        imm immVar2 = new imm(ilmVar2, new olm(strK, str == null ? "" : str, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), fa50Var), fmmVar, ((ThemeColors) fetVar2.k(zfnVar2)).getBackgroundContent(), true, null);
                        boolean zI2 = fetVar2.i(dk5Var);
                        Object objP2 = fetVar2.P();
                        if (zI2 || objP2 == cl5Var) {
                            objP2 = new uj5(dk5Var, b3);
                            fetVar2.o0(objP2);
                        }
                        hlm.c(null, immVar2, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar2, 805306368, 54, Response.NOT_IMPLEMENTED);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                oja0.o((dk5) obj5, (Function0) obj4, (Function1) obj3, (fet) obj, x8x.L(9));
                break;
            case 14:
                xcz xczVar = (xcz) obj5;
                dk5 dk5Var2 = (dk5) obj4;
                l7m0 l7m0Var = (l7m0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int iH = xczVar.h();
                    fmm fmmVar2 = fmm.f9790a;
                    fa50 fa50Var2 = fa50.f9191a;
                    if (iH == 0 && xczVar.i() == 0) {
                        fetVar3.e0(713431773);
                        zfn zfnVar3 = zaq0.b;
                        imm immVar3 = new imm(new ilm(((ThemeColors) fetVar3.k(zfnVar3)).getSecondary()), new plm(rsm0.w(R.string.balance_management_title, 0, fetVar3), ha50.THREE_LINES, ((ThemeColors) fetVar3.k(zfnVar3)).getSecondary(), fa50Var2), fmmVar2, ((ThemeColors) fetVar3.k(zfnVar3)).getBackgroundContent(), false, null);
                        boolean zI3 = fetVar3.i(dk5Var2);
                        Object objP3 = fetVar3.P();
                        if (zI3 || objP3 == cl5Var) {
                            objP3 = new uj5(dk5Var2, b2);
                            fetVar3.o0(objP3);
                        }
                        hlm.c(null, immVar3, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar3, 805306368, 54, Response.NOT_IMPLEMENTED);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(714553818);
                        lh5 lh5Var = (lh5) l7m0Var.getValue();
                        lh5Var.getClass();
                        jh5 jh5Var2 = (jh5) lh5Var;
                        zfn zfnVar4 = zaq0.b;
                        ilm ilmVar3 = new ilm(((ThemeColors) fetVar3.k(zfnVar4)).getSecondary());
                        pn40 pn40Var2 = pn40.f27267a;
                        imm immVar4 = new imm(ilmVar3, new olm(pn40.k(jh5Var2.d, jh5Var2.c), jh5Var2.b, ((ThemeColors) fetVar3.k(zfnVar4)).getSecondary(), ((ThemeColors) fetVar3.k(zfnVar4)).getSecondary(), fa50Var2), fmmVar2, ((ThemeColors) fetVar3.k(zfnVar4)).getBackgroundContent(), true, null);
                        boolean zI4 = fetVar3.i(dk5Var2);
                        Object objP4 = fetVar3.P();
                        if (zI4 || objP4 == cl5Var) {
                            objP4 = new uj5(dk5Var2, (byte) 10);
                            fetVar3.o0(objP4);
                        }
                        hlm.c(null, immVar4, null, (Function0) objP4, null, null, null, null, null, null, null, null, fetVar3, 805306368, 54, Response.NOT_IMPLEMENTED);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                break;
            case 15:
                w2d w2dVar = (w2d) obj5;
                pl7 pl7Var = (pl7) obj4;
                Function1 function2 = (Function1) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, jm40.b);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(e7z.u1);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                    agc.y(null, w2dVar, u1c.M(589727328, new xbd(pl7Var, function2, objArr == true ? 1 : 0), fetVar4), u1c.M(-1221839873, new xbd(pl7Var, function2, b4), fetVar4), fetVar4, 3520);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                bmd.a((cg80) obj5, (u23) obj4, (ugd) obj3, (fet) obj, x8x.L(1));
                break;
            case 17:
                y5d y5dVar = (y5d) obj4;
                mm40 mm40Var = (mm40) obj5;
                final fod fodVar = (fod) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mm40 mm40VarB = y5dVar.b(o7k0.d(mm40Var, 1.0f), true);
                    final Object[] objArr4 = objArr2 == true ? 1 : 0;
                    b34.k(mm40VarB, q3d.j(u1c.M(-788218894, new xdr() { // from class: a.bod
                        @Override // a.xdr
                        public final Object F(Object obj6, Object obj7, Object obj8) {
                            byte b5 = objArr4;
                            fod fodVar2 = fodVar;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var2 = (mm40) obj6;
                                    fet fetVar6 = (fet) obj7;
                                    int iIntValue6 = ((Integer) obj8).intValue();
                                    mm40Var2.getClass();
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= fetVar6.g(mm40Var2) ? 4 : 2;
                                    }
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        xf0.h(mm40Var2, fodVar2.f9876a, uc9.e, null, fetVar6, (iIntValue6 & 14) | 384, 24);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                                case 1:
                                    fet fetVar7 = (fet) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    ((mm40) obj6).getClass();
                                    if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        vfc.g(fodVar2.d, fetVar7);
                                    } else {
                                        fetVar7.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var3 = (mm40) obj6;
                                    fet fetVar8 = (fet) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue8 & 6) == 0) {
                                        iIntValue8 |= fetVar8.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                        xf0.h(mm40Var3, fodVar2.b, uc9.e, null, fetVar8, (iIntValue8 & 14) | 384, 24);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar5), u1c.M(841746961, new xdr() { // from class: a.bod
                        @Override // a.xdr
                        public final Object F(Object obj6, Object obj7, Object obj8) {
                            byte b5 = b4;
                            fod fodVar2 = fodVar;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var2 = (mm40) obj6;
                                    fet fetVar6 = (fet) obj7;
                                    int iIntValue6 = ((Integer) obj8).intValue();
                                    mm40Var2.getClass();
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= fetVar6.g(mm40Var2) ? 4 : 2;
                                    }
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        xf0.h(mm40Var2, fodVar2.f9876a, uc9.e, null, fetVar6, (iIntValue6 & 14) | 384, 24);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                                case 1:
                                    fet fetVar7 = (fet) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    ((mm40) obj6).getClass();
                                    if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        vfc.g(fodVar2.d, fetVar7);
                                    } else {
                                        fetVar7.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var3 = (mm40) obj6;
                                    fet fetVar8 = (fet) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue8 & 6) == 0) {
                                        iIntValue8 |= fetVar8.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                        xf0.h(mm40Var3, fodVar2.b, uc9.e, null, fetVar8, (iIntValue8 & 14) | 384, 24);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar5), u1c.M(-1823254480, new xdr() { // from class: a.bod
                        @Override // a.xdr
                        public final Object F(Object obj6, Object obj7, Object obj8) {
                            byte b5 = b3;
                            fod fodVar2 = fodVar;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var2 = (mm40) obj6;
                                    fet fetVar6 = (fet) obj7;
                                    int iIntValue6 = ((Integer) obj8).intValue();
                                    mm40Var2.getClass();
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= fetVar6.g(mm40Var2) ? 4 : 2;
                                    }
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        xf0.h(mm40Var2, fodVar2.f9876a, uc9.e, null, fetVar6, (iIntValue6 & 14) | 384, 24);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                                case 1:
                                    fet fetVar7 = (fet) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    ((mm40) obj6).getClass();
                                    if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        vfc.g(fodVar2.d, fetVar7);
                                    } else {
                                        fetVar7.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var3 = (mm40) obj6;
                                    fet fetVar8 = (fet) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue8 & 6) == 0) {
                                        iIntValue8 |= fetVar8.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                        xf0.h(mm40Var3, fodVar2.b, uc9.e, null, fetVar8, (iIntValue8 & 14) | 384, 24);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar5)), null, fetVar5, 4);
                } else {
                    fetVar5.X();
                }
                break;
            case 18:
                y5d y5dVar2 = (y5d) obj4;
                mm40 mm40Var2 = (mm40) obj5;
                final ood oodVar = (ood) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    mm40 mm40VarB2 = y5dVar2.b(o7k0.d(mm40Var2, 1.0f), true);
                    final Object[] objArr5 = objArr3 == true ? 1 : 0;
                    b34.k(mm40VarB2, q3d.j(u1c.M(50666, new xdr() { // from class: a.jod
                        @Override // a.xdr
                        public final Object F(Object obj6, Object obj7, Object obj8) {
                            byte b5 = objArr5;
                            ood oodVar2 = oodVar;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj6;
                                    fet fetVar7 = (fet) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= fetVar7.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        xf0.h(mm40Var3, oodVar2.f25591a, uc9.e, null, fetVar7, (iIntValue7 & 14) | 384, 24);
                                    } else {
                                        fetVar7.X();
                                    }
                                    break;
                                case 1:
                                    fet fetVar8 = (fet) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    ((mm40) obj6).getClass();
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        vfc.f(oodVar2.c, fetVar8);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj6;
                                    fet fetVar9 = (fet) obj7;
                                    int iIntValue9 = ((Integer) obj8).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue9 & 6) == 0) {
                                        iIntValue9 |= fetVar9.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                                        xf0.h(mm40Var4, oodVar2.b, uc9.e, null, fetVar9, (iIntValue9 & 14) | 384, 24);
                                    } else {
                                        fetVar9.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar6), u1c.M(1630016521, new xdr() { // from class: a.jod
                        @Override // a.xdr
                        public final Object F(Object obj6, Object obj7, Object obj8) {
                            byte b5 = b4;
                            ood oodVar2 = oodVar;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj6;
                                    fet fetVar7 = (fet) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= fetVar7.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        xf0.h(mm40Var3, oodVar2.f25591a, uc9.e, null, fetVar7, (iIntValue7 & 14) | 384, 24);
                                    } else {
                                        fetVar7.X();
                                    }
                                    break;
                                case 1:
                                    fet fetVar8 = (fet) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    ((mm40) obj6).getClass();
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        vfc.f(oodVar2.c, fetVar8);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj6;
                                    fet fetVar9 = (fet) obj7;
                                    int iIntValue9 = ((Integer) obj8).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue9 & 6) == 0) {
                                        iIntValue9 |= fetVar9.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                                        xf0.h(mm40Var4, oodVar2.b, uc9.e, null, fetVar9, (iIntValue9 & 14) | 384, 24);
                                    } else {
                                        fetVar9.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar6), u1c.M(-1034984920, new xdr() { // from class: a.jod
                        @Override // a.xdr
                        public final Object F(Object obj6, Object obj7, Object obj8) {
                            byte b5 = b3;
                            ood oodVar2 = oodVar;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj6;
                                    fet fetVar7 = (fet) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= fetVar7.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        xf0.h(mm40Var3, oodVar2.f25591a, uc9.e, null, fetVar7, (iIntValue7 & 14) | 384, 24);
                                    } else {
                                        fetVar7.X();
                                    }
                                    break;
                                case 1:
                                    fet fetVar8 = (fet) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    ((mm40) obj6).getClass();
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        vfc.f(oodVar2.c, fetVar8);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj6;
                                    fet fetVar9 = (fet) obj7;
                                    int iIntValue9 = ((Integer) obj8).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue9 & 6) == 0) {
                                        iIntValue9 |= fetVar9.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                                        xf0.h(mm40Var4, oodVar2.b, uc9.e, null, fetVar9, (iIntValue9 & 14) | 384, 24);
                                    } else {
                                        fetVar9.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar6)), null, fetVar6, 4);
                } else {
                    fetVar6.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                dyb.g((mm40) obj5, (k7q0) obj4, (ugd) obj3, (fet) obj, x8x.L(385));
                break;
            case 20:
                ((Integer) obj2).getClass();
                lmc.c((mm40) obj5, (oxe) obj4, (String) obj3, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                obb.C((mm40) obj5, (String) obj4, (xdr) obj3, (fet) obj, x8x.L(385));
                break;
            case 22:
                ((Integer) obj2).getClass();
                p8a.n((mm40) obj5, (p2f) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ahb.d((mm40) obj5, (p4f) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                hkb.d((mm40) obj5, (juf) obj4, (zx7) obj3, (fet) obj, x8x.L(385));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                mbc.d((mm40) obj5, (k7h) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                tke.t((mm40) obj5, (wbg) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                eeq.q((i3t0) obj5, (Fragment) obj4, (kei) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                rcb.m((mm40) obj5, (bhh) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ieb.l((mm40) obj5, (thh) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ywa(y5d y5dVar, mm40 mm40Var, znd zndVar, byte b) {
        this.f43361a = b;
        this.d = y5dVar;
        this.c = mm40Var;
        this.b = zndVar;
    }

    public /* synthetic */ ywa(Object obj, Object obj2, Object obj3, byte b) {
        this.f43361a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ywa(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f43361a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
