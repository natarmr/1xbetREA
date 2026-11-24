package a;

import android.javax.sip.message.Response;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x2g implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40165a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x2g(w6k w6kVar, gy30 gy30Var, Function0 function0, pz40 pz40Var) {
        this.f40165a = (byte) 13;
        this.c = w6kVar;
        this.d = gy30Var;
        this.b = function0;
        this.e = pz40Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        xpj0 xpj0Var = (xpj0) this.c;
        vne vneVar = (vne) this.d;
        Function1 function1 = (Function1) this.e;
        fq8 fq8Var = (fq8) this.b;
        String str = fq8Var.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((y5d) obj).getClass();
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zI = fetVar.i(vneVar) | fetVar.g(xpj0Var) | fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new vuc(vneVar, xpj0Var, function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG = fetVar.g(function1) | fetVar.g(fq8Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new yw9(function1, fq8Var, (byte) 14);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            String str2 = fq8Var.d;
            boolean zG2 = fetVar.g(str);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                wul wulVar = new wul(nul.e, oe9.f25112a, new ue9(str), true, false, false);
                fetVar.o0(wulVar);
                objP3 = wulVar;
            }
            wul wulVar2 = (wul) objP3;
            boolean zG3 = fetVar.g(str2);
            Object objP4 = fetVar.P();
            if (zG3 || objP4 == cl5Var) {
                wul wulVar3 = new wul(lul.e, oe9.f25112a, new ue9(str2), true, false, false);
                fetVar.o0(wulVar3);
                objP4 = wulVar3;
            }
            zcl zclVar = qmk.f28987a;
            gkb.i(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), vul.f38053a, wulVar2, (wul) objP4, 0L, function0, function2, fetVar, 48, 16);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) this.c;
        pje pjeVar = (pje) this.d;
        xdr xdrVar = (xdr) this.e;
        Function0 function0 = (Function0) this.b;
        oje ojeVar = (oje) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ojeVar) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            String str = (String) function2.invoke(fetVar, 0);
            if (StringsKt.W(str)) {
                adx.c("Label must not be blank");
            }
            pjeVar.getClass();
            ro4.c.f(jm40.b, str, Boolean.TRUE, ojeVar, xdrVar, function0, fetVar, Integer.valueOf((iIntValue << 9) & 7168));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    private final Object c(Object obj, Object obj2, Object obj3) {
        mm40 mm40VarN;
        w6k w6kVar = (w6k) this.c;
        gy30 gy30Var = (gy30) this.d;
        Function0 function0 = (Function0) this.b;
        pz40 pz40Var = (pz40) this.e;
        sx30 sx30Var = (sx30) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        sx30Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(sx30Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zG = fetVar.g(w6kVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new a1i(w6kVar, pz40Var, (byte) 0);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = fre0.Y(jm40.b, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarY, 12.0f, 0.0f, 2);
            tx30 tx30Var = gy30Var.b;
            if (tx30Var == null) {
                mm40VarN = o7k0.n(mm40VarL, 24.0f);
            } else if (tx30Var instanceof rx30) {
                mm40VarN = o7k0.p(mm40VarL, 40.0f, 40.0f);
            } else if (tx30Var instanceof qx30) {
                mm40VarN = o7k0.n(mm40VarL, ((qx30) tx30Var).f);
            } else {
                mm40VarN = o7k0.n(mm40VarL, 24.0f);
            }
            jiq0.M(mm40VarN, sx30Var, function0, fetVar, (iIntValue << 6) & 896);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        wul wulVar = (wul) this.c;
        wul wulVar2 = (wul) this.d;
        vcj vcjVar = (vcj) this.e;
        hdj hdjVar = (hdj) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kud kudVar = vcj.m2;
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            vtb.t(null, qqm.b, null, 0L, fetVar, 48, 13);
            vul vulVar = vul.f38053a;
            boolean zI = fetVar.i(vcjVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                oye oyeVar = new oye(0, vcjVar, vcj.class, "dismiss", "dismiss()V", 0, (byte) 28);
                fetVar.o0(oyeVar);
                objP = oyeVar;
            }
            Function0 function0 = (Function0) ((jhy) objP);
            boolean zG = fetVar.g(hdjVar) | fetVar.i(vcjVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new vef(hdjVar, vcjVar, (byte) 20);
                fetVar.o0(objP2);
            }
            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP2, fetVar, 48, 17);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        wul wulVar = (wul) this.c;
        wul wulVar2 = (wul) this.d;
        dej dejVar = (dej) this.e;
        jej jejVar = (jej) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kwd kwdVar = dej.l2;
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            vtb.t(null, qqm.b, null, 0L, fetVar, 48, 13);
            vul vulVar = vul.f38053a;
            boolean zI = fetVar.i(dejVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                oye oyeVar = new oye(0, dejVar, dej.class, "dismiss", "dismiss()V", 0, (byte) 29);
                fetVar.o0(oyeVar);
                objP = oyeVar;
            }
            Function0 function0 = (Function0) ((jhy) objP);
            boolean zG = fetVar.g(jejVar) | fetVar.i(dejVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new vef(jejVar, dejVar, (byte) 21);
                fetVar.o0(objP2);
            }
            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP2, fetVar, 48, 17);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        qdz qdzVar = (qdz) this.c;
        Function1 function1 = (Function1) this.d;
        Function1 function2 = (Function1) this.e;
        wfn wfnVar = (wfn) this.b;
        p6t0 p6t0Var = (p6t0) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        p6t0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(p6t0Var) ? 4 : 2;
        }
        byte b = 18;
        if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            fetVar.X();
        } else if (p6t0Var instanceof ojw) {
            fetVar.e0(-1344760935);
            n4c.u((ojw) p6t0Var, fetVar, ((iIntValue << 3) & 112) | 6);
            fetVar.r(false);
        } else {
            boolean z = p6t0Var instanceof kuj;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-1344577849);
                zcl zclVar = qmk.f28987a;
                sac.l(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 8.0f, 5), (kuj) p6t0Var, qdzVar, function1, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else {
                boolean z2 = p6t0Var instanceof wjw;
                cl5 cl5Var = ukd.f35823a;
                if (z2) {
                    fetVar.e0(-1344213568);
                    wjw wjwVar = (wjw) p6t0Var;
                    boolean zG = fetVar.g(function2);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new ag0(function2, (byte) 26);
                        fetVar.o0(objP);
                    }
                    d5c.r(null, wjwVar, (Function2) objP, fetVar, (iIntValue << 3) & 112);
                    fetVar.r(false);
                } else if (p6t0Var instanceof nuj) {
                    fetVar.e0(-1343883263);
                    mm40 mm40VarL = s5x0.L(jm40Var, wfnVar.e, 0.0f, 2);
                    nuj nujVar = (nuj) p6t0Var;
                    boolean zG2 = fetVar.g(function2) | ((iIntValue & 14) == 4);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new vwj(function2, p6t0Var, (byte) 0);
                        fetVar.o0(objP2);
                    }
                    fbc.t(mm40VarL, nujVar, (Function0) objP2, fetVar, (iIntValue << 3) & 112);
                    fetVar.r(false);
                } else {
                    byte b2 = 14;
                    if (p6t0Var instanceof akw) {
                        fetVar.e0(-1343460144);
                        akw akwVar = (akw) p6t0Var;
                        int i = iIntValue & 14;
                        boolean zG3 = fetVar.g(function2) | (i == 4);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new vwj(function2, p6t0Var, (byte) 1);
                            fetVar.o0(objP3);
                        }
                        aac.v(akwVar, (Function0) objP3, fetVar, i);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof ciw) {
                        fetVar.e0(-1342980140);
                        ciw ciwVar = (ciw) p6t0Var;
                        boolean zG4 = fetVar.g(function2);
                        Object objP4 = fetVar.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new ag0(function2, (byte) 27);
                            fetVar.o0(objP4);
                        }
                        qzb.y(null, ciwVar, qdzVar, (Function2) objP4, fetVar, (iIntValue << 3) & 112);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof mtj) {
                        fetVar.e0(-1342408903);
                        mtj mtjVar = (mtj) p6t0Var;
                        boolean zG5 = fetVar.g(function2);
                        Object objP5 = fetVar.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new olh(function2, (byte) 17);
                            fetVar.o0(objP5);
                        }
                        n4c.e(mtjVar, qdzVar, (Function1) objP5, fetVar, ((iIntValue << 3) & 112) | 6);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof oxj) {
                        fetVar.e0(-1341925954);
                        float f = wfnVar.c;
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40Var, f, 0.0f, f, 8.0f, 2);
                        vrm vrmVar = ((oxj) p6t0Var).b;
                        boolean zG6 = fetVar.g(function2);
                        Object objP6 = fetVar.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new olh(function2, b);
                            fetVar.o0(objP6);
                        }
                        ccq0.s(mm40VarN, vrmVar, (Function1) objP6, fetVar, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof vkw) {
                        fetVar.e0(-1341305148);
                        float f2 = wfnVar.c;
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarN2 = s5x0.N(jm40Var, f2, 8.0f, f2, 0.0f, 8);
                        vkw vkwVar = (vkw) p6t0Var;
                        boolean zG7 = fetVar.g(function2);
                        Object objP7 = fetVar.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new ouh(function2, b2);
                            fetVar.o0(objP7);
                        }
                        aad.n(mm40VarN2, vkwVar, (Function0) objP7, fetVar, (iIntValue << 3) & 112, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof diw) {
                        fetVar.e0(-1340624357);
                        diw diwVar = (diw) p6t0Var;
                        g5h g5hVar = g5h.DEFAULT;
                        boolean zG8 = fetVar.g(function2);
                        Object objP8 = fetVar.P();
                        if (zG8 || objP8 == cl5Var) {
                            objP8 = new olh(function2, (byte) 19);
                            fetVar.o0(objP8);
                        }
                        uzb.C(jm40Var, diwVar, qdzVar, g5hVar, (Function1) objP8, fetVar, ((iIntValue << 3) & 112) | 3078, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof ztj) {
                        fetVar.e0(-1340059692);
                        a4x a4xVar = ((ztj) p6t0Var).b;
                        boolean zG9 = fetVar.g(function2);
                        Object objP9 = fetVar.P();
                        if (zG9 || objP9 == cl5Var) {
                            objP9 = new olh(function2, (byte) 20);
                            fetVar.o0(objP9);
                        }
                        Function1 function3 = (Function1) objP9;
                        boolean zG10 = fetVar.g(function2);
                        Object objP10 = fetVar.P();
                        if (zG10 || objP10 == cl5Var) {
                            objP10 = new olh(function2, (byte) 21);
                            fetVar.o0(objP10);
                        }
                        Function1 function4 = (Function1) objP10;
                        boolean zG11 = fetVar.g(function2);
                        Object objP11 = fetVar.P();
                        if (zG11 || objP11 == cl5Var) {
                            objP11 = new olh(function2, (byte) 22);
                            fetVar.o0(objP11);
                        }
                        Function1 function5 = (Function1) objP11;
                        boolean zG12 = fetVar.g(function2);
                        Object objP12 = fetVar.P();
                        if (zG12 || objP12 == cl5Var) {
                            objP12 = new olh(function2, (byte) 23);
                            fetVar.o0(objP12);
                        }
                        Function1 function6 = (Function1) objP12;
                        boolean zG13 = fetVar.g(function2);
                        Object objP13 = fetVar.P();
                        if (zG13 || objP13 == cl5Var) {
                            objP13 = new olh(function2, (byte) 24);
                            fetVar.o0(objP13);
                        }
                        feb.m(null, a4xVar, null, function3, function4, function5, function6, (Function1) objP13, fetVar, 0, 5);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1339345886);
                        fetVar.r(false);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        pt0 pt0Var = (pt0) this.c;
        Function1 function1 = (Function1) this.d;
        Function1 function2 = (Function1) this.e;
        Function1 function3 = (Function1) this.b;
        pe0 pe0Var = (pe0) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        pe0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? fetVar.g(pe0Var) : fetVar.i(pe0Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            int iOrdinal = pt0Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1253479682);
                zcl zclVar = qmk.f28987a;
                lt0.a(null, pe0Var, 160.0f, function1, function2, function3, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1253959314);
                zcl zclVar2 = qmk.f28987a;
                ro4.d(null, pe0Var, 160.0f, function2, function1, function3, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(1254386277);
                zcl zclVar3 = qmk.f28987a;
                o2e.c(null, pe0Var, 224.0f, function1, function2, function3, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                fetVar.e0(1254838753);
                zcl zclVar4 = qmk.f28987a;
                ohq0.b(null, pe0Var, 160.0f, function1, function2, function3, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(-375208271, fetVar, false);
                }
                fetVar.e0(1255291973);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        mm40 mm40Var = (mm40) this.c;
        xcz xczVar = (xcz) this.d;
        a4x a4xVar = (a4x) this.e;
        Function1 function1 = (Function1) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 20.0f, 0.0f, 36.0f, 5), fetVar);
            boolean zG = fetVar.g(a4xVar) | fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 15);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarD, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        mm40 mm40Var = (mm40) this.c;
        d9z d9zVar = (d9z) this.d;
        a4x a4xVar = (a4x) this.e;
        Function1 function1 = (Function1) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            float f = xfn.a(fetVar).d;
            float f2 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f, 20.0f, f2, 36.0f, fetVar);
            boolean zG = fetVar.g(a4xVar) | fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new q0h(a4xVar, function1);
                fetVar.o0(objP);
            }
            uzb.z(mm40VarD, ch80VarF, d9zVar, false, (Function2) objP, fetVar, 0, 8);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        dnr dnrVar = (dnr) this.c;
        mm40 mm40Var = (mm40) this.d;
        mm40 mm40Var2 = (mm40) this.e;
        Function1 function1 = (Function1) this.b;
        MarketsCategoriesParams marketsCategoriesParams = (MarketsCategoriesParams) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ddk ddkVar = dnr.c2;
        marketsCategoriesParams.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? fetVar.g(marketsCategoriesParams) : fetVar.i(marketsCategoriesParams) ? 4 : 2;
        }
        if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            fetVar.X();
        } else {
            if (dnrVar.U1 == null) {
                Intrinsics.h("marketsCategoriesFactory");
                throw null;
            }
            uuz.c(mm40Var, mm40Var2, dnrVar, marketsCategoriesParams, function1, fetVar, (iIntValue << 9) & 7168);
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.c;
        fpw fpwVar = (fpw) this.d;
        l7m0 l7m0Var = (l7m0) this.e;
        ugd ugdVar = (ugd) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean zG = fetVar.g(function1) | fetVar.g(fpwVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new wqv(function1, fpwVar, (byte) 11);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarD2, gy40Var, null, false, null, (Function0) objP2, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zcl zclVar = qmk.f28987a;
            v8q0.a(fpwVar.b, dw9.h(1.0f, s5x0.K(jm40Var, 8.0f, 16.0f), true), 0L, null, qmk.s, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.l(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, 0, 24960, 110572);
            pm80 pm80VarF = a8k0.F(R.drawable.accordion_drawable_down, 0, fetVar);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11);
            boolean zG2 = fetVar.g(l7m0Var);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new ufp(l7m0Var, (byte) 8);
                fetVar.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(mm40VarN, (Function1) objP3);
            zfn zfnVar = zaq0.b;
            dww.c(pm80VarF, null, mm40VarT, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar, 56, 0);
            fetVar.r(true);
            b34.e(y5d.f42040a, fpwVar.c, i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n), null, null, null, u1c.M(461009889, new eyn(ugdVar, fpwVar, function1, (byte) 13), fetVar), fetVar, 1572870, 28);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        a4x<ym6> a4xVar = (a4x) this.c;
        xdr xdrVar = (xdr) this.d;
        eao eaoVar = (eao) this.e;
        ugd ugdVar = (ugd) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        byte b = 0;
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (ym6 ym6Var : a4xVar) {
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar);
                }
                gy40 gy40Var = (gy40) objP;
                boolean zG = fetVar.g(xdrVar) | fetVar.i(ym6Var) | fetVar.i(eaoVar);
                Object objP2 = fetVar.P();
                if (zG || objP2 == cl5Var) {
                    objP2 = new zt20(xdrVar, ym6Var, eaoVar, b);
                    fetVar.o0(objP2);
                }
                ugdVar.j(y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP2, 28), ym6Var, fetVar, 0);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.c;
        l7m0 l7m0Var2 = (l7m0) this.d;
        l7m0 l7m0Var3 = (l7m0) this.e;
        l7m0 l7m0Var4 = (l7m0) this.b;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xuz xuzVar = v330.Q1;
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            obc.e(new l5d0[]{kr00.f18743a.a(l7m0Var.getValue()), c030.f3505a.a(Boolean.FALSE)}, u1c.M(-963672949, new zx(mm40Var, l7m0Var2, l7m0Var3, l7m0Var4, (byte) 2), fetVar), fetVar, 48);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        final z77 z77Var = (z77) this.c;
        final Function1 function1 = (Function1) this.d;
        final xcz xczVar = (xcz) this.e;
        final Function1 function2 = (Function1) this.b;
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        zx7 zx7Var = gqw0.e;
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            if (z77Var != null) {
                boolean z = z77Var instanceof u77;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar.e0(1529827749);
                    mm40 mm40VarB = ir8Var.b(jm40Var, zx7Var);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                    mdm mdmVar = ((u77) z77Var).f;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new xv50(function1, (byte) 12);
                        fetVar.o0(objP);
                    }
                    jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
                    fetVar.r(false);
                } else if (z77Var instanceof v77) {
                    fetVar.e0(1530268011);
                    mm40 mm40VarB2 = ir8Var.b(jm40Var, zx7Var);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarB2, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                    mdm mdmVar2 = ((v77) z77Var).f;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new xv50(function1, (byte) 13);
                        fetVar.o0(objP2);
                    }
                    jcb.l(mm40VarN2, mdmVar2, false, (Function0) objP2, fetVar, 0, 4);
                    fetVar.r(false);
                } else if (z77Var instanceof w77) {
                    fetVar.e0(1530722130);
                    w2w w2wVar = ((w77) z77Var).b;
                    u7x.g(0, fetVar, null, w2wVar.c, w2wVar.b);
                    fetVar.r(false);
                } else if (z77Var instanceof x77) {
                    fetVar.e0(1531196244);
                    x77 x77Var = (x77) z77Var;
                    final boolean z2 = x77Var.b.c;
                    final qgv0 qgv0Var = x77Var.i;
                    final boolean z3 = x77Var.j;
                    final boolean z4 = x77Var.k;
                    q0x.m(xczVar, x77Var, function1, fetVar, 0);
                    obc.d(xf80.f40779a.a(null), u1c.M(-207020689, new Function2() { // from class: a.x360
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            fet fetVar2 = (fet) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                                zcl zclVar3 = qmk.f28987a;
                                lh80 lh80Var = new lh80(xfn.a(fetVar2).d, 4.0f, xfn.a(fetVar2).d, 32.0f);
                                qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
                                final z77 z77Var2 = z77Var;
                                boolean zG3 = fetVar2.g(z77Var2);
                                final Function1 function3 = function2;
                                boolean zG4 = zG3 | fetVar2.g(function3);
                                final qgv0 qgv0Var2 = qgv0Var;
                                boolean zG5 = zG4 | fetVar2.g(qgv0Var2);
                                final Function1 function4 = function1;
                                boolean zG6 = zG5 | fetVar2.g(function4);
                                final boolean z5 = z2;
                                boolean zH = zG6 | fetVar2.h(z5);
                                final boolean z6 = z3;
                                boolean zH2 = zH | fetVar2.h(z6);
                                final boolean z7 = z4;
                                boolean zH3 = zH2 | fetVar2.h(z7);
                                Object objP3 = fetVar2.P();
                                if (zH3 || objP3 == ukd.f35823a) {
                                    Function1 function5 = new Function1() { // from class: a.y360
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            hcz hczVar = (hcz) obj6;
                                            hczVar.getClass();
                                            z77 z77Var3 = z77Var2;
                                            x77 x77Var2 = (x77) z77Var3;
                                            byte b = 1;
                                            if (x77Var2.h instanceof pv7) {
                                                hcz.e(hczVar, null, null, new ugd(-1448901572, true, new h57(z77Var3, function3, b)), 3);
                                            }
                                            ArrayList arrayList = x77Var2.g;
                                            rj50 rj50Var = new rj50((byte) 22);
                                            int size = arrayList.size();
                                            m160 m160Var = new m160(rj50Var, arrayList, (byte) 7);
                                            qgv0 qgv0Var3 = qgv0Var2;
                                            hczVar.f(size, m160Var, new m160(arrayList, qgv0Var3, (byte) 8), new ugd(2039820996, true, new vfe((List) arrayList, (Object) qgv0Var3, function4, z5, (byte) 3)));
                                            if (z6 && !z7) {
                                                hcz.e(hczVar, null, null, mrv.h, 3);
                                            }
                                            return Unit.f46060a;
                                        }
                                    };
                                    fetVar2.o0(function5);
                                    objP3 = function5;
                                }
                                b8k0.e(mm40VarD, xczVar, lh80Var, qw3Var, null, null, false, null, (Function1) objP3, fetVar2, 6, Response.NOT_ACCEPTABLE_HERE);
                            } else {
                                fetVar2.X();
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 48);
                    fetVar.r(false);
                } else if (z77Var instanceof y77) {
                    fetVar.e0(1536277702);
                    mm40 mm40VarB3 = ir8Var.b(jm40Var, zx7Var);
                    zcl zclVar3 = qmk.f28987a;
                    jcb.l(s5x0.N(mm40VarB3, 0.0f, 0.0f, 0.0f, 32.0f, 7), ((y77) z77Var).f, false, null, fetVar, 0, 12);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-1197572610, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        boolean z;
        pl7 pl7Var = (pl7) this.c;
        xcz xczVar = (xcz) this.d;
        Function1 function1 = (Function1) this.e;
        Function0 function0 = (Function0) this.b;
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        zx7 zx7Var = gqw0.e;
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            if (pl7Var instanceof ll7) {
                fetVar.e0(852747878);
                q0x.n(xczVar, (ll7) pl7Var, function1, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(852850705);
                fetVar.r(false);
            }
            if (pl7Var != null) {
                boolean z2 = pl7Var instanceof ml7;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                if (z2) {
                    fetVar.e0(852942217);
                    mm40 mm40VarB = ir8Var.b(jm40Var, zx7Var);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                    mdm mdmVar = ((ml7) pl7Var).d;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new xv50(function1, (byte) 18);
                        fetVar.o0(objP);
                    }
                    jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
                    fetVar.r(false);
                } else if (pl7Var instanceof nl7) {
                    fetVar.e0(853371350);
                    mm40 mm40VarB2 = ir8Var.b(jm40Var, zx7Var);
                    zcl zclVar2 = qmk.f28987a;
                    jcb.l(s5x0.N(mm40VarB2, 0.0f, 0.0f, 0.0f, 32.0f, 7), ((nl7) pl7Var).d, false, function0, fetVar, 0, 4);
                    fetVar.r(false);
                } else if (pl7Var instanceof ol7) {
                    fetVar.e0(853694618);
                    xf0.e(432, fetVar, null, true, false);
                    fetVar.r(false);
                } else if (pl7Var instanceof ll7) {
                    fetVar.e0(854026752);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    lh80 lh80Var = new lh80(8.0f, 4.0f, 8.0f, 32.0f);
                    qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
                    boolean zG2 = fetVar.g(pl7Var) | fetVar.g(function1) | fetVar.h(false) | fetVar.h(false);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new zbd(pl7Var, function1, b);
                        fetVar.o0(objP2);
                    }
                    b8k0.e(mm40VarD, xczVar, lh80Var, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 6, Response.NOT_ACCEPTABLE_HERE);
                    fetVar.r(false);
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            throw b1j.f(27516373, fetVar, z);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5 */
    private final Object w(Object obj, Object obj2, Object obj3) {
        int i;
        l7m0 l7m0Var = (l7m0) this.c;
        ccb0 ccb0Var = (ccb0) this.d;
        l7m0 l7m0Var2 = (l7m0) this.e;
        pv40 pv40Var = (pv40) this.b;
        y5d y5dVar = (y5d) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mi70 mi70Var = ccb0.X1;
        y5dVar.getClass();
        byte b = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) l7m0Var2.getValue()).booleanValue();
            cl5 cl5Var = ukd.f35823a;
            if (zBooleanValue) {
                fetVar.e0(522822777);
                int i2 = ((emb0) l7m0Var.getValue()).b;
                a4x a4xVar = ((emb0) l7m0Var.getValue()).g;
                aoo0 aoo0Var = ((emb0) l7m0Var.getValue()).f;
                boolean zI = fetVar.i(ccb0Var);
                Object objP = fetVar.P();
                if (zI || objP == cl5Var) {
                    objP = new ybb0(ccb0Var, b);
                    fetVar.o0(objP);
                }
                i = 0;
                z5n.h(i2, a4xVar, aoo0Var, null, null, false, (Function1) objP, fetVar, 0, 56);
                fetVar.r(false);
            } else {
                i = 0;
                fetVar.e0(523226397);
                fetVar.r(false);
            }
            Object[] objArr = new Object[i];
            boolean zG = fetVar.g(l7m0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new wda0(l7m0Var, (byte) 7);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP2, fetVar);
            Object[] objArr2 = new Object[i];
            boolean zG2 = fetVar.g(l7m0Var);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new wda0(l7m0Var, (byte) 8);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP3, fetVar);
            mm40 mm40VarB = y5dVar.b(o7k0.d(jm40.b, 1.0f), true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, i);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarB);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ib50 ib50Var = ccb0Var.Q1;
            if (ib50Var == null) {
                Intrinsics.h("navDestinations");
                throw null;
            }
            LinkedHashMap linkedHashMapD = pv40Var.d(mrv.n0(ib50Var.f14471a, null, fetVar, i, b), fetVar, i);
            int iIntValue2 = ((Number) l7m0VarY2.getValue()).intValue();
            int i3 = iIntValue2;
            if (iIntValue2 < 0) {
                i3 = i;
            }
            boolean zG3 = fetVar.g(l7m0VarY);
            Object objP4 = fetVar.P();
            if (zG3 || objP4 == cl5Var) {
                objP4 = new wda0(l7m0VarY, (byte) 9);
                fetVar.o0(objP4);
            }
            obc.d(mr00.f22246a.a(ccb0Var), u1c.M(-32990293, new acb0(l7m0VarY2, zk80.b(i3, (Function0) objP4, fetVar, i, 2), pv40Var, l7m0Var, l7m0VarY, linkedHashMapD), fetVar), fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.c;
        wpq wpqVar = (wpq) this.d;
        pkk0 pkk0Var = (pkk0) this.e;
        z3f0 z3f0Var = (z3f0) this.b;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        zie0 zie0Var = z3f0.Y1;
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            imm immVar = (imm) l7m0Var.getValue();
            boolean zI = fetVar.i(wpqVar) | fetVar.g(pkk0Var) | fetVar.i(z3f0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new ck60(wpqVar, pkk0Var, z3f0Var, (byte) 15);
                fetVar.o0(objP);
            }
            hlm.c(mm40Var, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, iIntValue & 14, 0, 4084);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object y(Object obj, Object obj2, Object obj3) {
        List list = (List) this.c;
        cgk0 cgk0Var = (cgk0) this.d;
        cgk0 cgk0Var2 = (cgk0) this.e;
        cgk0 cgk0Var3 = (cgk0) this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        ((Integer) obj3).getClass();
        int iOrdinal = ((t9v0) list.get(iIntValue)).f33588a.ordinal();
        if (iOrdinal == 0) {
            cgk0Var.m(iIntValue2);
        } else if (iOrdinal == 1) {
            cgk0Var2.m(iIntValue2);
        } else if (iOrdinal == 2) {
            cgk0Var3.m(iIntValue2);
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Object obj4;
        mm40 mm40VarE;
        Object obj5;
        mm40 mm40VarV;
        byte b = this.f40165a;
        pcy pcyVar = e7z.u1;
        mm40 mm40Var = jm40.b;
        byte b2 = 5;
        byte b3 = 18;
        byte b4 = 4;
        cl5 cl5Var = ukd.f35823a;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.b;
        Object obj9 = this.c;
        switch (b) {
            case 0:
                x3m x3mVar = (x3m) obj9;
                Fragment fragment = (Fragment) obj7;
                CyberBottomSheetParams cyberBottomSheetParams = (CyberBottomSheetParams) obj6;
                Function0 function0 = (Function0) obj8;
                String str = (String) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(str) ? (byte) 4 : (byte) 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    jtv.f0(o7k0.c, fragment, cyberBottomSheetParams, false, str, x3mVar.c() != y3m.f41958a, function0, fetVar, ((iIntValue << 12) & 57344) | 3078);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                kjj kjjVar = (kjj) obj9;
                Function0 function1 = (Function0) obj8;
                Function0 function2 = (Function0) obj7;
                Function0 function3 = (Function0) obj6;
                lr8 lr8Var = (lr8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(lr8Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    w6k w6kVar = (w6k) fetVar2.k(bmd.h);
                    long jT = (((long) w6kVar.T(lr8Var.c())) & 4294967295L) | (((long) w6kVar.T(lr8Var.d())) << 32);
                    float fD = lr8Var.d() * 0.9f;
                    float fC = lr8Var.c() * 0.9f;
                    Object objP = fetVar2.P();
                    Object obj10 = objP;
                    if (objP == cl5Var) {
                        pz40 pz40VarE = androidx.compose.runtime.e.e(new qkx(0L));
                        fetVar2.o0(pz40VarE);
                        obj10 = pz40VarE;
                    }
                    pz40 pz40Var = (pz40) obj10;
                    Object objP2 = fetVar2.P();
                    yje yjeVar = null;
                    Object obj11 = objP2;
                    if (objP2 == cl5Var) {
                        pz40 pz40VarE2 = androidx.compose.runtime.e.e(null);
                        fetVar2.o0(pz40VarE2);
                        obj11 = pz40VarE2;
                    }
                    pz40 pz40Var2 = (pz40) obj11;
                    Object objP3 = fetVar2.P();
                    Object obj12 = objP3;
                    if (objP3 == cl5Var) {
                        pz40 pz40VarE3 = androidx.compose.runtime.e.e(new ycl(jjj.b));
                        fetVar2.o0(pz40VarE3);
                        obj12 = pz40VarE3;
                    }
                    pz40 pz40Var3 = (pz40) obj12;
                    Object objP4 = fetVar2.P();
                    Object obj13 = objP4;
                    if (objP4 == cl5Var) {
                        pz40 pz40VarE4 = androidx.compose.runtime.e.e(new ycl(jjj.c));
                        fetVar2.o0(pz40VarE4);
                        obj13 = pz40VarE4;
                    }
                    pz40 pz40Var4 = (pz40) obj13;
                    Object objP5 = fetVar2.P();
                    Object obj14 = objP5;
                    if (objP5 == cl5Var) {
                        pz40 pz40VarE5 = androidx.compose.runtime.e.e(0);
                        fetVar2.o0(pz40VarE5);
                        obj14 = pz40VarE5;
                    }
                    pz40 pz40Var5 = (pz40) obj14;
                    Object objP6 = fetVar2.P();
                    Object obj15 = objP6;
                    if (objP6 == cl5Var) {
                        pz40 pz40VarE6 = androidx.compose.runtime.e.e(Float.valueOf(0.0f));
                        fetVar2.o0(pz40VarE6);
                        obj15 = pz40VarE6;
                    }
                    pz40 pz40Var6 = (pz40) obj15;
                    Object objP7 = fetVar2.P();
                    Object obj16 = objP7;
                    if (objP7 == cl5Var) {
                        ycl yclVar = (ycl) pz40Var3.getValue();
                        float f = yclVar.f42389a;
                        pz40 pz40VarE7 = androidx.compose.runtime.e.e(yclVar);
                        fetVar2.o0(pz40VarE7);
                        obj16 = pz40VarE7;
                    }
                    pz40 pz40Var7 = (pz40) obj16;
                    Object objP8 = fetVar2.P();
                    Object obj17 = objP8;
                    if (objP8 == cl5Var) {
                        ycl yclVar2 = (ycl) pz40Var4.getValue();
                        float f2 = yclVar2.f42389a;
                        pz40 pz40VarE8 = androidx.compose.runtime.e.e(yclVar2);
                        fetVar2.o0(pz40VarE8);
                        obj17 = pz40VarE8;
                    }
                    pz40 pz40Var8 = (pz40) obj17;
                    Object objP9 = fetVar2.P();
                    Object obj18 = objP9;
                    if (objP9 == cl5Var) {
                        pz40 pz40VarE9 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar2.o0(pz40VarE9);
                        obj18 = pz40VarE9;
                    }
                    pz40 pz40Var9 = (pz40) obj18;
                    Object objP10 = fetVar2.P();
                    Object obj19 = objP10;
                    if (objP10 == cl5Var) {
                        pz40 pz40VarE10 = androidx.compose.runtime.e.e(0L);
                        fetVar2.o0(pz40VarE10);
                        obj19 = pz40VarE10;
                    }
                    pz40 pz40Var10 = (pz40) obj19;
                    a4x a4xVar = kjjVar.b;
                    Long lValueOf = Long.valueOf(((Number) pz40Var10.getValue()).longValue());
                    Integer numValueOf = Integer.valueOf(((Number) pz40Var5.getValue()).intValue());
                    Object objP11 = fetVar2.P();
                    if (objP11 == cl5Var) {
                        objP11 = new g8g((Object) pz40Var10, pz40Var5, pz40Var9, yjeVar, (byte) 29);
                        fetVar2.o0(objP11);
                    }
                    m0x0.v(lValueOf, numValueOf, (Function2) objP11, fetVar2);
                    boolean zF = fetVar2.f(jT);
                    Object objP12 = fetVar2.P();
                    if (zF || objP12 == cl5Var) {
                        objP12 = new gjj(jT, pz40Var2, pz40Var, (byte) 0);
                        fetVar2.o0(objP12);
                    }
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarP = ffb0.P(jm40Var, (Function1) objP12);
                    Object objP13 = fetVar2.P();
                    Object obj20 = objP13;
                    if (objP13 == cl5Var) {
                        ca6 ca6Var = new ca6(pz40Var, (byte) 24);
                        fetVar2.o0(ca6Var);
                        obj20 = ca6Var;
                    }
                    mm40 mm40VarY = fre0.Y(mm40VarP, (Function1) obj20);
                    Unit unit = Unit.f46060a;
                    boolean zF2 = fetVar2.f(jT) | fetVar2.d(fD) | fetVar2.d(fC);
                    Object objP14 = fetVar2.P();
                    if (zF2 || objP14 == cl5Var) {
                        objP14 = new ijj(fD, fC, pz40Var5, pz40Var10, pz40Var6, pz40Var3, pz40Var7, pz40Var4, pz40Var8, pz40Var9, jT, pz40Var2, pz40Var);
                        fetVar2.o0(objP14);
                    }
                    mm40 mm40VarA = fnn0.a(mm40VarY, unit, (PointerInputEventHandler) objP14);
                    zcl zclVar = qmk.c;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarE2 = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarA);
                    long jF = fbc.f(4279900698L);
                    ljc ljcVar = jd8.n;
                    mm40 mm40VarE3 = o7k0.e(o7k0.s(s5x0.K(i120.Q(mm40VarE2, jF, ljcVar), 4.0f, 4.0f), ((ycl) pz40Var3.getValue()).f42389a), ((ycl) pz40Var4.getValue()).f42389a);
                    zx7 zx7Var = gqw0.f11754a;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE3);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf2, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    n0q n0qVar = o7k0.c;
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    zfn zfnVar = m8m0.f21378a;
                    long jM131getWhite800d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU();
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    y9q0 y9q0VarF = g1t0.f();
                    boolean zF3 = fetVar2.f(jM131getWhite800d7_KjU);
                    Object objP15 = fetVar2.P();
                    Object obj21 = objP15;
                    if (zF3 || objP15 == cl5Var) {
                        f15 f15Var = new f15((byte) 5, jM131getWhite800d7_KjU);
                        fetVar2.o0(f15Var);
                        obj21 = f15Var;
                    }
                    aad.e("📋 Analytics Logs", s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), y9q0VarF, null, 0, false, 0, 0, (n4d) obj21, null, fetVar2, 6, 760);
                    xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
                    Integer numValueOf3 = Integer.valueOf(a4xVar.size());
                    boolean zG = fetVar2.g(a4xVar) | fetVar2.g(xczVarA);
                    Object objP16 = fetVar2.P();
                    if (zG || objP16 == cl5Var) {
                        b18 b18Var = new b18(a4xVar, xczVarA, null, (byte) 2);
                        fetVar2.o0(b18Var);
                        obj4 = b18Var;
                    } else {
                        obj4 = objP16;
                    }
                    m0x0.t(fetVar2, numValueOf3, (Function2) obj4);
                    mm40 mm40VarE4 = s5x0.K(i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), ljcVar), 4.0f, 4.0f).e(((Boolean) pz40Var9.getValue()).booleanValue() ? jd8.Z(1.0f, 1.0f) : jm40Var);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE4);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
                    boolean z = !((Boolean) pz40Var9.getValue()).booleanValue();
                    boolean zG2 = fetVar2.g(a4xVar);
                    Object objP17 = fetVar2.P();
                    Object obj22 = objP17;
                    if (zG2 || objP17 == cl5Var) {
                        oea oeaVar = new oea(a4xVar, (byte) 6);
                        fetVar2.o0(oeaVar);
                        obj22 = oeaVar;
                    }
                    b8k0.e(n0qVar, xczVarA, null, qw3Var, null, null, z, null, (Function1) obj22, fetVar2, 6, 364);
                    fetVar2.r(true);
                    mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    thg0 thg0VarA = shg0.a(uc9.f, gqw0.j, fetVar2, 6);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, shdVar);
                    jpm0.o(fetVar2, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar4);
                    jjj.b(R.drawable.ic_glyph_clear, 384, ((StaticColors) fetVar2.k(zfnVar)).m79getBlue0d7_KjU(), fetVar2, null, "Clear", function1);
                    jjj.b(R.drawable.ic_glyph_copy, 384, ((StaticColors) fetVar2.k(zfnVar)).m98getGreen0d7_KjU(), fetVar2, null, "Copy", function2);
                    jjj.b(R.drawable.ic_glyph_clear_ios, 384, ((StaticColors) fetVar2.k(zfnVar)).m113getRed0d7_KjU(), fetVar2, null, "Close", function3);
                    ohs0.x(fetVar2, true, true, true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                mm40 mm40Var2 = (mm40) obj9;
                lhe lheVar = (lhe) obj7;
                d9z d9zVar = (d9z) obj6;
                Function1 function4 = (Function1) obj8;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    ch80 ch80VarF = h97.f(xfn.a(fetVar3).d, 12.0f, xfn.a(fetVar3).d, 36.0f, fetVar3);
                    mm40 mm40VarE5 = mm40Var2.e(o7k0.c);
                    zll zllVar = lheVar.f20051a;
                    boolean zG3 = fetVar3.g(function4);
                    Object objP18 = fetVar3.P();
                    if (zG3 || objP18 == cl5Var) {
                        objP18 = new qyo(function4, (byte) 3);
                        fetVar3.o0(objP18);
                    }
                    Function1 function5 = (Function1) objP18;
                    boolean zG4 = fetVar3.g(function4);
                    Object objP19 = fetVar3.P();
                    if (zG4 || objP19 == cl5Var) {
                        objP19 = new qyo(function4, (byte) 4);
                        fetVar3.o0(objP19);
                    }
                    Function1 function6 = (Function1) objP19;
                    boolean zG5 = fetVar3.g(function4);
                    Object objP20 = fetVar3.P();
                    if (zG5 || objP20 == cl5Var) {
                        objP20 = new qyo(function4, (byte) 5);
                        fetVar3.o0(objP20);
                    }
                    ckb.f(mm40VarE5, zllVar, d9zVar, ch80VarF, null, function5, function6, (Function1) objP20, fetVar3, 0, 16);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                mm40 mm40Var3 = (mm40) obj9;
                khe kheVar = (khe) obj7;
                d9z d9zVar2 = (d9z) obj6;
                Function1 function7 = (Function1) obj8;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    ch80 ch80VarF2 = h97.f(xfn.a(fetVar4).d, 12.0f, xfn.a(fetVar4).d, 36.0f, fetVar4);
                    mm40 mm40VarE6 = mm40Var3.e(o7k0.c);
                    ftr ftrVar = kheVar.f18287a;
                    boolean zG6 = fetVar4.g(function7);
                    Object objP21 = fetVar4.P();
                    if (zG6 || objP21 == cl5Var) {
                        objP21 = new ag0(function7, (byte) 28);
                        fetVar4.o0(objP21);
                    }
                    Function2 function8 = (Function2) objP21;
                    boolean zG7 = fetVar4.g(function7);
                    Object objP22 = fetVar4.P();
                    if (zG7 || objP22 == cl5Var) {
                        objP22 = new qyo(function7, (byte) 9);
                        fetVar4.o0(objP22);
                    }
                    uzb.y(mm40VarE6, ftrVar, ch80VarF2, d9zVar2, function8, (Function1) objP22, fetVar4, 0, 64);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                tbz tbzVar = (tbz) obj9;
                mm40 mm40Var4 = (mm40) obj7;
                ibz ibzVar = (ibz) obj6;
                pz40 pz40Var11 = (pz40) obj8;
                bzg0 bzg0Var = (bzg0) obj;
                fet fetVar5 = (fet) obj2;
                ((Integer) obj3).getClass();
                Object objP23 = fetVar5.P();
                Object obj23 = objP23;
                if (objP23 == cl5Var) {
                    gbz gbzVar = new gbz(bzg0Var, new rip(pz40Var11, (byte) 6));
                    fetVar5.o0(gbzVar);
                    obj23 = gbzVar;
                }
                gbz gbzVar2 = (gbz) obj23;
                Object objP24 = fetVar5.P();
                Object obj24 = objP24;
                if (objP24 == cl5Var) {
                    b5n0 b5n0Var = new b5n0(new u8u(gbzVar2));
                    fetVar5.o0(b5n0Var);
                    obj24 = b5n0Var;
                }
                b5n0 b5n0Var2 = (b5n0) obj24;
                if (tbzVar != null) {
                    fetVar5.e0(1743490539);
                    fetVar5.e0(887527095);
                    String str2 = Build.FINGERPRINT;
                    if (str2 == null || !str2.equals("robolectric")) {
                        fetVar5.e0(1345729441);
                        View view = (View) fetVar5.k(dy2.f);
                        boolean zG8 = fetVar5.g(view);
                        Object objP25 = fetVar5.P();
                        if (zG8 || objP25 == cl5Var) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            ltb0 m13Var = tag instanceof ltb0 ? (ltb0) tag : null;
                            if (m13Var == null) {
                                m13Var = new m13(view);
                                view.setTag(R.id.compose_prefetch_scheduler, m13Var);
                            }
                            objP25 = m13Var;
                            fetVar5.o0(objP25);
                        }
                        obj5 = (ltb0) objP25;
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(1345548711);
                        Object objP26 = fetVar5.P();
                        if (objP26 == cl5Var) {
                            objP26 = new mtb0();
                            fetVar5.o0(objP26);
                        }
                        obj5 = (mtb0) objP26;
                        fetVar5.r(false);
                    }
                    Object obj25 = obj5;
                    fetVar5.r(false);
                    Object[] objArr = {tbzVar, gbzVar2, b5n0Var2, obj25};
                    boolean zG9 = fetVar5.g(tbzVar) | fetVar5.i(gbzVar2) | fetVar5.i(b5n0Var2) | fetVar5.i(obj25);
                    Object objP27 = fetVar5.P();
                    Object obj26 = objP27;
                    if (zG9 || objP27 == cl5Var) {
                        enm enmVar = new enm((Object) tbzVar, (Object) gbzVar2, (Object) b5n0Var2, obj25, (byte) 17);
                        fetVar5.o0(enmVar);
                        obj26 = enmVar;
                    }
                    m0x0.p(objArr, (Function1) obj26, fetVar5);
                    fetVar5.r(false);
                } else {
                    fetVar5.e0(1744076749);
                    fetVar5.r(false);
                }
                int i = ubz.f35405a;
                if (tbzVar != null && (mm40VarE = mm40Var4.e(new ips0(tbzVar))) != null) {
                    mm40Var4 = mm40VarE;
                }
                boolean zG10 = fetVar5.g(gbzVar2) | fetVar5.g(ibzVar);
                Object objP28 = fetVar5.P();
                Object obj27 = objP28;
                if (zG10 || objP28 == cl5Var) {
                    r7y r7yVar = new r7y(gbzVar2, ibzVar, (byte) 11);
                    fetVar5.o0(r7yVar);
                    obj27 = r7yVar;
                }
                x4n0.b(b5n0Var2, mm40Var4, (Function2) obj27, fetVar5, 8);
                return Unit.f46060a;
            case 5:
                mm40 mm40Var5 = (mm40) obj9;
                Function1 function9 = (Function1) obj7;
                xcz xczVar = (xcz) obj6;
                l7m0 l7m0Var = (l7m0) obj8;
                hh80 hh80Var = (hh80) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar6.g(hh80Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    mm40 mm40VarE7 = s5x0.I(o7k0.c, hh80Var).e(mm40Var5);
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iHashCode5 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM5 = fetVar6.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar6, mm40VarE7);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC4, gqw0.v);
                    fpb0 fpb0Var = (fpb0) ((l7m0) l7m0Var.getValue()).getValue();
                    if (fpb0Var instanceof cpb0) {
                        fetVar6.e0(626265099);
                        mm40 mm40VarB = jr8.f16991a.b(mm40Var, gqw0.e);
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarN2 = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                        mdm mdmVar = ((cpb0) fpb0Var).f4738a;
                        boolean zG11 = fetVar6.g(function9);
                        Object objP29 = fetVar6.P();
                        if (zG11 || objP29 == cl5Var) {
                            objP29 = new wta0(function9, b3);
                            fetVar6.o0(objP29);
                        }
                        jcb.l(mm40VarN2, mdmVar, false, (Function0) objP29, fetVar6, 0, 4);
                        fetVar6.r(false);
                    } else if (Intrinsics.d(fpb0Var, dpb0.f6457a)) {
                        fetVar6.e0(627281651);
                        ro4.Q(0, fetVar6, s5x0.L(mm40Var, xfn.a(fetVar6).d, 0.0f, 2));
                        fetVar6.r(false);
                    } else {
                        if (!(fpb0Var instanceof epb0)) {
                            throw b1j.f(-949630204, fetVar6, false);
                        }
                        fetVar6.e0(627593325);
                        mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                        zcl zclVar5 = qmk.f28987a;
                        lh80 lh80Var = new lh80(xfn.a(fetVar6).d, 8.0f, xfn.a(fetVar6).d, 32.0f);
                        boolean zI = fetVar6.i(fpb0Var);
                        Object objP30 = fetVar6.P();
                        if (zI || objP30 == cl5Var) {
                            objP30 = new yr80((epb0) fpb0Var, (byte) 29);
                            fetVar6.o0(objP30);
                        }
                        b8k0.e(mm40VarD, xczVar, lh80Var, null, null, null, false, null, (Function1) objP30, fetVar6, 6, Response.SERVER_TIMEOUT);
                        fetVar6.r(false);
                    }
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                l7m0 l7m0Var2 = (l7m0) obj9;
                rv2 rv2Var = (rv2) obj7;
                cqq cqqVar = (cqq) obj6;
                Function1 function10 = (Function1) obj8;
                l7m0 l7m0Var3 = (l7m0) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                l7m0Var3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar7.g(l7m0Var3) ? (byte) 4 : (byte) 2;
                }
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    zgc.C(i120.Q(o7k0.c, ((ThemeColors) fetVar7.k(zaq0.b)).getBackgroundContent(), jd8.n), (y9f0) ((nbf0) l7m0Var2.getValue()).b.getValue(), ((Number) l7m0Var3.getValue()).floatValue() > 0.5f, rv2Var, cqqVar, function10, fetVar7, 24576);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                l7m0 l7m0Var4 = (l7m0) obj9;
                xcz xczVar2 = (xcz) obj7;
                lh80 lh80Var2 = (lh80) obj6;
                Function1 function11 = (Function1) obj8;
                fet fetVar8 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    e2d e2dVar = (e2d) fetVar8.k(nip.f23600a);
                    boolean zG12 = fetVar8.g(l7m0Var4);
                    Object objP31 = fetVar8.P();
                    if (zG12 || objP31 == cl5Var) {
                        objP31 = new f7f0(l7m0Var4, (byte) 21);
                        fetVar8.o0(objP31);
                    }
                    Function0 function12 = (Function0) objP31;
                    if (e2dVar != null && (mm40VarV = cjx.V(mm40Var, e2d.b(e2dVar, new xhl0(function12, (byte) 5)), null)) != null) {
                        mm40Var = mm40VarV;
                    }
                    mm40 mm40VarE8 = mm40Var.e(o7k0.c);
                    pz40 pz40Var12 = s6t0.f31722a;
                    mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarE8, s6t0.b().f33626a.getBackground(), jd8.n), "LAZY_COLUMN_SPORTS");
                    boolean zG13 = fetVar8.g(function11);
                    Object objP32 = fetVar8.P();
                    if (zG13 || objP32 == cl5Var) {
                        objP32 = new elk0(function11, (byte) 15);
                        fetVar8.o0(objP32);
                    }
                    b8k0.e(mm40VarE0, xczVar2, lh80Var2, null, null, null, false, null, (Function1) objP32, fetVar8, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                l7m0 l7m0Var5 = (l7m0) obj9;
                f3d f3dVar = (f3d) obj7;
                y82 y82Var = (y82) obj6;
                l7m0 l7m0Var6 = (l7m0) obj8;
                mm40 mm40Var6 = (mm40) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                qek0 qek0Var = y82.V1;
                mm40Var6.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar9.g(mm40Var6) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    boolean zBooleanValue = ((Boolean) l7m0Var6.getValue()).booleanValue();
                    boolean zI2 = fetVar9.i(y82Var);
                    Object objP33 = fetVar9.P();
                    if (zI2 || objP33 == cl5Var) {
                        objP33 = new m82(y82Var, b4);
                        fetVar9.o0(objP33);
                    }
                    Function0 function13 = (Function0) objP33;
                    boolean zI3 = fetVar9.i(y82Var);
                    Object objP34 = fetVar9.P();
                    if (zI3 || objP34 == cl5Var) {
                        objP34 = new m82(y82Var, b2);
                        fetVar9.o0(objP34);
                    }
                    wwb.b(mm40Var6, l7m0Var5, f3dVar, zBooleanValue, function13, (Function0) objP34, fetVar9, iIntValue8 & 14);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                wul wulVar = (wul) obj9;
                wpq wpqVar = (wpq) obj7;
                pkk0 pkk0Var = (pkk0) obj6;
                ze4 ze4Var = (ze4) obj8;
                mm40 mm40Var7 = (mm40) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                qek0 qek0Var2 = ze4.g2;
                mm40Var7.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar10.g(mm40Var7) ? (byte) 4 : (byte) 2;
                }
                if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    boolean zI4 = fetVar10.i(wpqVar) | fetVar10.g(pkk0Var) | fetVar10.i(ze4Var);
                    Object objP35 = fetVar10.P();
                    if (zI4 || objP35 == cl5Var) {
                        objP35 = new ue4(wpqVar, pkk0Var, ze4Var, (byte) 0);
                        fetVar10.o0(objP35);
                    }
                    qzb.n(mm40Var7, wulVar, (Function0) objP35, fetVar10, iIntValue9 & 14, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                xpj0 xpj0Var = (xpj0) obj9;
                vne vneVar = (vne) obj7;
                Function1 function14 = (Function1) obj6;
                eq8 eq8Var = (eq8) obj8;
                String str3 = eq8Var.c;
                fet fetVar11 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar11.U(1 & iIntValue10, (iIntValue10 & 17) != 16)) {
                    boolean zI5 = fetVar11.i(vneVar) | fetVar11.g(xpj0Var) | fetVar11.g(function14);
                    Object objP36 = fetVar11.P();
                    Object obj28 = objP36;
                    if (zI5 || objP36 == cl5Var) {
                        vuc vucVar = new vuc(vneVar, xpj0Var, function14, false ? (byte) 1 : (byte) 0);
                        fetVar11.o0(vucVar);
                        obj28 = vucVar;
                    }
                    Function0 function15 = (Function0) obj28;
                    boolean zG14 = fetVar11.g(function14);
                    Object objP37 = fetVar11.P();
                    Object obj29 = objP37;
                    if (zG14 || objP37 == cl5Var) {
                        dib dibVar = new dib(function14, (byte) 13);
                        fetVar11.o0(dibVar);
                        obj29 = dibVar;
                    }
                    Function0 function16 = (Function0) obj29;
                    String str4 = eq8Var.d;
                    boolean zG15 = fetVar11.g(str3);
                    Object objP38 = fetVar11.P();
                    if (zG15 || objP38 == cl5Var) {
                        wul wulVar2 = new wul(nul.e, oe9.f25112a, new ue9(str3), true, false, false);
                        fetVar11.o0(wulVar2);
                        objP38 = wulVar2;
                    }
                    wul wulVar3 = (wul) objP38;
                    boolean zG16 = fetVar11.g(str4);
                    Object objP39 = fetVar11.P();
                    if (zG16 || objP39 == cl5Var) {
                        wul wulVar4 = new wul(lul.e, oe9.f25112a, new ue9(str4), true, false, false);
                        fetVar11.o0(wulVar4);
                        objP39 = wulVar4;
                    }
                    zcl zclVar6 = qmk.f28987a;
                    gkb.i(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), vul.f38053a, wulVar3, (wul) objP39, 0L, function15, function16, fetVar11, 48, 16);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                return a(obj, obj2, obj3);
            case 12:
                return b(obj, obj2, obj3);
            case 13:
                return c(obj, obj2, obj3);
            case 14:
                return g(obj, obj2, obj3);
            case 15:
                return h(obj, obj2, obj3);
            case 16:
                return i(obj, obj2, obj3);
            case 17:
                return l(obj, obj2, obj3);
            case 18:
                return m(obj, obj2, obj3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return o(obj, obj2, obj3);
            case 20:
                return p(obj, obj2, obj3);
            case 21:
                return r(obj, obj2, obj3);
            case 22:
                return s(obj, obj2, obj3);
            case 23:
                return t(obj, obj2, obj3);
            case 24:
                return u(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return v(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return w(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return x(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return y(obj, obj2, obj3);
            default:
                l7m0 l7m0Var7 = (l7m0) obj9;
                Function0 function17 = (Function0) obj8;
                Function0 function18 = (Function0) obj7;
                Function1 function19 = (Function1) obj6;
                fet fetVar12 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar12.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar12, 0);
                    int iHashCode6 = Long.hashCode(fetVar12.T);
                    bh90 bh90VarM6 = fetVar12.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar12, mm40VarD2);
                    mkd.c0.getClass();
                    fetVar12.i0();
                    if (fetVar12.S) {
                        fetVar12.l(pcyVar);
                    } else {
                        fetVar12.r0();
                    }
                    jpm0.o(fetVar12, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar12, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar12, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar12);
                    jpm0.o(fetVar12, mm40VarC5, gqw0.v);
                    j2e.n(l7m0Var7, function17, fetVar12, 0);
                    unh0.q(0, fetVar12, l7m0Var7, function18, function19);
                    fetVar12.r(true);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ x2g(x3m x3mVar, jtv jtvVar, Fragment fragment, CyberBottomSheetParams cyberBottomSheetParams, Function0 function0) {
        this.f40165a = (byte) 0;
        this.c = x3mVar;
        this.d = fragment;
        this.e = cyberBottomSheetParams;
        this.b = function0;
    }

    public /* synthetic */ x2g(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f40165a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    public /* synthetic */ x2g(Object obj, Function0 function0, Function0 function1, wdr wdrVar, byte b) {
        this.f40165a = b;
        this.c = obj;
        this.b = function0;
        this.d = function1;
        this.e = wdrVar;
    }

    public /* synthetic */ x2g(Function2 function2, pje pjeVar, xdr xdrVar, Function0 function0) {
        this.f40165a = (byte) 12;
        this.c = function2;
        this.d = pjeVar;
        this.e = xdrVar;
        this.b = function0;
    }
}
