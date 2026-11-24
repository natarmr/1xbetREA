package a;

import android.content.ComponentCallbacks2;
import android.gov.nist.core.Separators;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.game_broadcasting.api.presentation.GameVideoPlayerColorScheme;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t39 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33255a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t39(y9j y9jVar, nek nekVar, Function0 function0, xak xakVar, Function0 function1) {
        this.f33255a = (byte) 0;
        this.b = y9jVar;
        this.c = nekVar;
        this.d = function0;
        this.f = xakVar;
        this.e = function1;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x031a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        fet fetVar;
        boolean z;
        fet fetVar2;
        boolean z2;
        Object obj5;
        boolean z3;
        byte b = this.f33255a;
        Object obj6 = ukd.f35823a;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        Object obj11 = this.b;
        switch (b) {
            case 0:
                y9j y9jVar = (y9j) obj11;
                nek nekVar = (nek) obj10;
                Function0 function0 = (Function0) obj9;
                xak xakVar = (xak) obj7;
                Function0 function1 = (Function0) obj8;
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    a4x a4xVar = y9jVar.c;
                    u9j u9jVar = y9jVar.f42249a;
                    x9j x9jVar = (x9j) a4xVar.get(iIntValue);
                    if (x9jVar == null) {
                        fetVar = fetVar3;
                    } else if (x9jVar instanceof v9j) {
                        fetVar3.e0(-450031173);
                        n0q n0qVar = o7k0.c;
                        nekVar.getClass();
                        if (u9jVar instanceof r9j) {
                            fetVar3.e0(-26442223);
                            GameBroadcastingParams gameBroadcastingParams = ((r9j) u9jVar).f30084a;
                            jxs[] jxsVarArr = jxs.f17324a;
                            nekVar.e(n0qVar, gameBroadcastingParams, new GameVideoUiConfig("16:9", R.dimen.corner_radius_16, -1, -1, GameVideoPlayerColorScheme.Static.f46687a), fetVar3, 70);
                            fetVar2 = fetVar3;
                            z2 = false;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar3;
                            if (u9jVar instanceof s9j) {
                                fetVar2.e0(-25858431);
                                String str = ((s9j) u9jVar).f31852a;
                                boolean zG = fetVar2.g(function0);
                                Object objP = fetVar2.P();
                                if (zG || objP == obj6) {
                                    objP = new xks0(function0, (byte) 3);
                                    fetVar2.o0(objP);
                                }
                                hp4.f(n0qVar, str, (Function0) objP, fetVar2, 6);
                                z2 = false;
                                fetVar2.r(false);
                            } else {
                                z2 = false;
                                if (!(u9jVar instanceof t9j)) {
                                    throw b1j.f(-854172, fetVar2, false);
                                }
                                fetVar2.e0(-25628070);
                                kc5.R(6, fetVar2, n0qVar, ((t9j) u9jVar).f33565a);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(z2);
                    } else {
                        fetVar = fetVar3;
                        if (x9jVar instanceof w9j) {
                            fetVar.e0(-449656538);
                            n0q n0qVar2 = o7k0.c;
                            xakVar.getClass();
                            if (u9jVar instanceof r9j) {
                                fetVar.e0(1131862418);
                                xakVar.o(n0qVar2, ((r9j) u9jVar).f30084a, fetVar, 70);
                                z = false;
                                fetVar.r(false);
                            } else if (u9jVar instanceof s9j) {
                                fetVar.e0(1132049255);
                                String str2 = ((s9j) u9jVar).f31852a;
                                boolean zG2 = fetVar.g(function1);
                                Object objP2 = fetVar.P();
                                if (zG2 || objP2 == obj6) {
                                    objP2 = new xks0(function1, (byte) 8);
                                    fetVar.o0(objP2);
                                }
                                hp4.f(n0qVar2, str2, (Function0) objP2, fetVar, 6);
                                z = false;
                                fetVar.r(false);
                            } else {
                                z = false;
                                if (!(u9jVar instanceof t9j)) {
                                    throw b1j.f(1283436480, fetVar, false);
                                }
                                fetVar.e0(1132248833);
                                kc5.R(6, fetVar, n0qVar2, ((t9j) u9jVar).f33565a);
                                fetVar.r(false);
                            }
                            fetVar.r(z);
                        }
                    }
                    throw b1j.f(1786595495, fetVar, false);
                }
                fetVar3.X();
                return Unit.f46060a;
            case 1:
                pz40 pz40Var = (pz40) obj11;
                Fragment fragment = (Fragment) obj10;
                CyberBottomSheetParams cyberBottomSheetParams = (CyberBottomSheetParams) obj9;
                x3m x3mVar = (x3m) obj8;
                jtv jtvVar = (jtv) obj7;
                Function0 function2 = (Function0) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((ir8) obj).getClass();
                function2.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar4.i(function2) ? 32 : 16;
                }
                int i = iIntValue3;
                if (fetVar4.U(i & 1, (i & 145) != 144)) {
                    int iOrdinal = ((h3g) pz40Var.getValue()).b.ordinal();
                    if (iOrdinal == 0) {
                        fetVar4.e0(1681255654);
                        fetVar4.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar4.e0(1681258829);
                        ugd ugdVarM = u1c.M(2008366655, new x2g(x3mVar, jtvVar, fragment, cyberBottomSheetParams, function2), fetVar4);
                        int i2 = ((i << 3) & 896) | 3072;
                        fetVar4.e0(1951849257);
                        Object objP3 = fetVar4.P();
                        if (objP3 == obj6) {
                            ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
                            af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
                            if (af3Var == null) {
                                jf4.n(b1j.i(p6h.class, "Cannot create dependency "));
                            } else {
                                o5d0 o5d0Var = (o5d0) af3Var.d().get(p6h.class);
                                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                                if (!(ze3Var instanceof p6h)) {
                                    ze3Var = null;
                                }
                                p6h p6hVar = (p6h) ze3Var;
                                if (p6hVar != null) {
                                    Fragment fragment2 = fragment;
                                    while (true) {
                                        if (fragment2 == 0) {
                                            jf4.n("Can't find feature provider!");
                                        } else if (fragment2 instanceof drs) {
                                            a4n0.f(fragment).getClass();
                                            cad cadVar = p6hVar.f26453a;
                                            xhi xhiVarQ = ((drs) fragment2).q();
                                            sue sueVar = p6hVar.b;
                                            onv onvVar = p6hVar.c;
                                            rmd0 rmd0Var = p6hVar.d;
                                            onv onvVar2 = p6hVar.e;
                                            pru pruVar = p6hVar.f;
                                            r9u r9uVar = p6hVar.g;
                                            ctf0 ctf0Var = p6hVar.h;
                                            wsz wszVar = p6hVar.i;
                                            ii iiVar = p6hVar.j;
                                            ouu ouuVar = p6hVar.k;
                                            v88 v88Var = p6hVar.l;
                                            wdk0 wdk0Var = p6hVar.m;
                                            lgn0 lgn0Var = p6hVar.n;
                                            sueVar.getClass();
                                            rmd0Var.getClass();
                                            r9uVar.getClass();
                                            ctf0Var.getClass();
                                            iiVar.getClass();
                                            wdk0Var.getClass();
                                            objP3 = new tei(cadVar, xhiVarQ, sueVar, onvVar, rmd0Var, onvVar2, pruVar, r9uVar, cyberBottomSheetParams, ctf0Var, wszVar, iiVar, ouuVar, v88Var, wdk0Var, lgn0Var);
                                            fetVar4.o0(objP3);
                                        } else {
                                            fragment2 = fragment2.y;
                                        }
                                    }
                                } else {
                                    jf4.n(b1j.i(p6h.class, "Cannot create dependency "));
                                }
                            }
                            return null;
                        }
                        tei teiVar = (tei) objP3;
                        q0h0 q0h0Var = new q0h0((sei) teiVar.q.get());
                        sgy sgyVarB = sre0.f32672a.b(a8h.class);
                        int i3 = a8h.O;
                        final k3t0 k3t0VarX = n4c.X(sgyVarB, null, q0h0Var, fetVar4, 14);
                        Object objP4 = fetVar4.P();
                        if (objP4 == obj6) {
                            e720 e720VarZ = ((ali) teiVar.i.f25567a).z();
                            vq vqVarW = teiVar.j.w();
                            x1x.x(vqVarW);
                            Object z6hVar = new z6h(fragment, e720VarZ, vqVarW, teiVar.k, teiVar.l, teiVar.m, teiVar.n, teiVar.o, teiVar.p);
                            fetVar4.o0(z6hVar);
                            objP4 = z6hVar;
                        }
                        final z6h z6hVar2 = (z6h) objP4;
                        boolean zI = fetVar4.i(z6hVar2) | fetVar4.i(k3t0VarX);
                        Object objP5 = fetVar4.P();
                        if (zI || objP5 == obj6) {
                            final byte b2 = 0;
                            objP5 = new Function1() { // from class: a.w6h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj12) {
                                    DialogFields dialogFields;
                                    byte b3 = b2;
                                    z6h z6hVar3 = z6hVar2;
                                    switch (b3) {
                                        case 0:
                                            ((lwk) obj12).getClass();
                                            z6hVar3.a(new x6f(1, k3t0VarX, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29));
                                            return new mz2((byte) 3);
                                        default:
                                            f7h f7hVar = (f7h) obj12;
                                            f7hVar.getClass();
                                            ii iiVar2 = z6hVar3.d;
                                            vq vqVar = z6hVar3.c;
                                            Fragment fragment3 = z6hVar3.f43866a;
                                            if (f7hVar instanceof kmd0) {
                                                e720 e720Var = z6hVar3.b;
                                                androidx.fragment.app.e eVarC = fragment3.C();
                                                eVarC.getClass();
                                                kmd0 kmd0Var = (kmd0) f7hVar;
                                                e720Var.b(eVarC, kmd0Var.b, kmd0Var.f18534a, kmd0Var.c);
                                            } else if (f7hVar instanceof qve) {
                                                qve qveVar = (qve) f7hVar;
                                                vqVar.a(fragment3, qveVar.f29382a, null, null, null, qveVar.b, true, qveVar.c, qveVar.d, qveVar.e);
                                            } else if (f7hVar instanceof pve) {
                                                vqVar.b(fragment3, null, null);
                                            } else if (f7hVar.equals(e430.f7164a)) {
                                                androidx.fragment.app.e eVarC2 = fragment3.C();
                                                eVarC2.getClass();
                                                wsz.i(eVarC2);
                                            } else if (f7hVar instanceof wve) {
                                                z6hVar3.c(((wve) f7hVar).f39833a);
                                            } else if (f7hVar.equals(pmd0.f27227a)) {
                                                gnm0.s(fragment3.F());
                                            } else if (f7hVar.equals(hmd0.f13300a)) {
                                                gnm0.i(fragment3.F());
                                            } else if (f7hVar instanceof nmd0) {
                                                nmd0 nmd0Var = (nmd0) f7hVar;
                                                zh7 zh7Var = nmd0Var.f23766a;
                                                String str3 = nmd0Var.g;
                                                boolean z4 = str3.length() > 0;
                                                lgn0 lgn0Var2 = z6hVar3.h;
                                                String strH = fragment3.H(R.string.bet_processed_successfully);
                                                strH.getClass();
                                                SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, null, null);
                                                String strH2 = fragment3.H(lgb.V(zh7Var.f));
                                                String str4 = zh7Var.b;
                                                lc00 lc00VarB = kotlin.collections.a.b();
                                                String strH3 = fragment3.H(z4 ? R.string.maximum_coef : R.string.coefficient);
                                                strH3.getClass();
                                                lc00VarB.add(new SuccessBetInfoItem.Simple(strH3, zh7Var.d));
                                                if (z4) {
                                                    String strH4 = fragment3.H(R.string.optional_coef);
                                                    strH4.getClass();
                                                    lc00VarB.add(new SuccessBetInfoItem.Simple(strH4, str3));
                                                }
                                                String strH5 = fragment3.H(R.string.bet_sum);
                                                strH5.getClass();
                                                pn40 pn40Var = pn40.f27267a;
                                                double d = zh7Var.e;
                                                p3u0 p3u0Var = p3u0.c;
                                                lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, fragment3.o0()), strH5, pn40.c(d, p3u0Var), nmd0Var.b, true));
                                                if (!nmd0Var.f) {
                                                    String strH6 = fragment3.H(nmd0Var.c);
                                                    strH6.getClass();
                                                    lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, fragment3.o0()), kotlin.text.c.r(strH6, Separators.COLON, "", false), pn40.c(nmd0Var.d, p3u0Var), nmd0Var.b, false));
                                                }
                                                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                                                long j = nmd0Var.e;
                                                hg7 hg7Var = hg7.f13004a;
                                                lgn0Var2.c(successBetStringModel, new SuccessBetAlertModel(strH2, str4, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(j), "SIMPLE", lc00VarA), fragment3);
                                            } else {
                                                if (f7hVar instanceof jmd0) {
                                                    String strH7 = fragment3.H(R.string.error);
                                                    String str5 = ((jmd0) f7hVar).f16759a;
                                                    String strH8 = fragment3.H(R.string.ok_new);
                                                    strH8.getClass();
                                                    dialogFields = new DialogFields((CharSequence) strH7, (CharSequence) str5, (CharSequence) strH8, fragment3.H(R.string.cancel), (String) null, "REQUEST_CODE_BET_EXIST_ERROR_BS", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                                                } else if (f7hVar instanceof lmd0) {
                                                    String strH9 = fragment3.H(R.string.error);
                                                    String str6 = ((lmd0) f7hVar).f20290a;
                                                    String strH10 = fragment3.H(R.string.replenish);
                                                    strH10.getClass();
                                                    dialogFields = new DialogFields((CharSequence) strH9, (CharSequence) str6, (CharSequence) strH10, fragment3.H(R.string.cancel), (String) null, "REQUEST_CODE_NOT_ENOUGH_MONEY_ERROR_BS", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                                                } else if (f7hVar.equals(mmd0.f22032a)) {
                                                    String strH11 = fragment3.H(R.string.quick_bet_network_error);
                                                    strH11.getClass();
                                                    z6hVar3.c(strH11);
                                                } else if (f7hVar instanceof omd0) {
                                                    z6hVar3.c(((omd0) f7hVar).f25498a);
                                                } else if (f7hVar instanceof imd0) {
                                                    v88.b(z6hVar3.f, a4n0.f(fragment3), ((imd0) f7hVar).f15019a, 2);
                                                } else if (f7hVar instanceof sve) {
                                                    String strH12 = fragment3.H(R.string.attention);
                                                    strH12.getClass();
                                                    String strH13 = fragment3.H(R.string.coupon_record_already_exists);
                                                    strH13.getClass();
                                                    z6hVar3.b(strH12, strH13);
                                                } else if (f7hVar instanceof vve) {
                                                    String strH14 = fragment3.H(R.string.attention);
                                                    String strH15 = fragment3.H(R.string.dependent_events);
                                                    String strH16 = fragment3.H(R.string.ok);
                                                    strH16.getClass();
                                                    dialogFields = new DialogFields((CharSequence) strH14, (CharSequence) strH15, (CharSequence) strH16, fragment3.H(R.string.cancel), (String) null, "REQUEST_CODE_SHOW_COUPON_HAS_SAME_EVENT_BS", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                                                } else if (f7hVar instanceof uve) {
                                                    String strH17 = fragment3.H(R.string.attention);
                                                    strH17.getClass();
                                                    String strH18 = fragment3.H(R.string.coupon_max_items_limit_exceed);
                                                    strH18.getClass();
                                                    z6hVar3.b(strH17, strH18);
                                                } else if (f7hVar instanceof tve) {
                                                    String strH19 = fragment3.H(R.string.attention);
                                                    tve tveVar = (tve) f7hVar;
                                                    String strI = fragment3.I(R.string.coupon_type_max_items_limit_exceed_v2, tveVar.f34595a, Integer.valueOf(tveVar.b));
                                                    String strH20 = fragment3.H(R.string.yes);
                                                    strH20.getClass();
                                                    ua80.r(fragment3, iiVar2, new DialogFields((CharSequence) strH19, (CharSequence) strI, (CharSequence) strH20, fragment3.H(R.string.no), (String) null, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG_BS", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
                                                } else {
                                                    if (!f7hVar.equals(rve.f31163a)) {
                                                        t9f.b();
                                                        return null;
                                                    }
                                                    ((qe50) z6hVar3.e.b).a(new za50(0, 7, 0L, 0L), false);
                                                }
                                                ua80.r(fragment3, iiVar2, dialogFields);
                                            }
                                            k3t0VarX.x(a6h.f317a);
                                            return Unit.f46060a;
                                    }
                                }
                            };
                            fetVar4.o0(objP5);
                        }
                        m0x0.o(z6hVar2, (Function1) objP5, fetVar4);
                        Object objP6 = fetVar4.P();
                        if (objP6 == obj6) {
                            objP6 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar4);
                            fetVar4.o0(objP6);
                        }
                        vne vneVar = (vne) objP6;
                        boolean zI2 = fetVar4.i(z6hVar2) | fetVar4.i(k3t0VarX);
                        Object objP7 = fetVar4.P();
                        if (zI2 || objP7 == obj6) {
                            final byte b3 = 1;
                            objP7 = new Function1() { // from class: a.w6h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj12) {
                                    DialogFields dialogFields;
                                    byte b4 = b3;
                                    z6h z6hVar3 = z6hVar2;
                                    switch (b4) {
                                        case 0:
                                            ((lwk) obj12).getClass();
                                            z6hVar3.a(new x6f(1, k3t0VarX, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29));
                                            return new mz2((byte) 3);
                                        default:
                                            f7h f7hVar = (f7h) obj12;
                                            f7hVar.getClass();
                                            ii iiVar2 = z6hVar3.d;
                                            vq vqVar = z6hVar3.c;
                                            Fragment fragment3 = z6hVar3.f43866a;
                                            if (f7hVar instanceof kmd0) {
                                                e720 e720Var = z6hVar3.b;
                                                androidx.fragment.app.e eVarC = fragment3.C();
                                                eVarC.getClass();
                                                kmd0 kmd0Var = (kmd0) f7hVar;
                                                e720Var.b(eVarC, kmd0Var.b, kmd0Var.f18534a, kmd0Var.c);
                                            } else if (f7hVar instanceof qve) {
                                                qve qveVar = (qve) f7hVar;
                                                vqVar.a(fragment3, qveVar.f29382a, null, null, null, qveVar.b, true, qveVar.c, qveVar.d, qveVar.e);
                                            } else if (f7hVar instanceof pve) {
                                                vqVar.b(fragment3, null, null);
                                            } else if (f7hVar.equals(e430.f7164a)) {
                                                androidx.fragment.app.e eVarC2 = fragment3.C();
                                                eVarC2.getClass();
                                                wsz.i(eVarC2);
                                            } else if (f7hVar instanceof wve) {
                                                z6hVar3.c(((wve) f7hVar).f39833a);
                                            } else if (f7hVar.equals(pmd0.f27227a)) {
                                                gnm0.s(fragment3.F());
                                            } else if (f7hVar.equals(hmd0.f13300a)) {
                                                gnm0.i(fragment3.F());
                                            } else if (f7hVar instanceof nmd0) {
                                                nmd0 nmd0Var = (nmd0) f7hVar;
                                                zh7 zh7Var = nmd0Var.f23766a;
                                                String str3 = nmd0Var.g;
                                                boolean z4 = str3.length() > 0;
                                                lgn0 lgn0Var2 = z6hVar3.h;
                                                String strH = fragment3.H(R.string.bet_processed_successfully);
                                                strH.getClass();
                                                SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, null, null);
                                                String strH2 = fragment3.H(lgb.V(zh7Var.f));
                                                String str4 = zh7Var.b;
                                                lc00 lc00VarB = kotlin.collections.a.b();
                                                String strH3 = fragment3.H(z4 ? R.string.maximum_coef : R.string.coefficient);
                                                strH3.getClass();
                                                lc00VarB.add(new SuccessBetInfoItem.Simple(strH3, zh7Var.d));
                                                if (z4) {
                                                    String strH4 = fragment3.H(R.string.optional_coef);
                                                    strH4.getClass();
                                                    lc00VarB.add(new SuccessBetInfoItem.Simple(strH4, str3));
                                                }
                                                String strH5 = fragment3.H(R.string.bet_sum);
                                                strH5.getClass();
                                                pn40 pn40Var = pn40.f27267a;
                                                double d = zh7Var.e;
                                                p3u0 p3u0Var = p3u0.c;
                                                lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, fragment3.o0()), strH5, pn40.c(d, p3u0Var), nmd0Var.b, true));
                                                if (!nmd0Var.f) {
                                                    String strH6 = fragment3.H(nmd0Var.c);
                                                    strH6.getClass();
                                                    lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, fragment3.o0()), kotlin.text.c.r(strH6, Separators.COLON, "", false), pn40.c(nmd0Var.d, p3u0Var), nmd0Var.b, false));
                                                }
                                                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                                                long j = nmd0Var.e;
                                                hg7 hg7Var = hg7.f13004a;
                                                lgn0Var2.c(successBetStringModel, new SuccessBetAlertModel(strH2, str4, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(j), "SIMPLE", lc00VarA), fragment3);
                                            } else {
                                                if (f7hVar instanceof jmd0) {
                                                    String strH7 = fragment3.H(R.string.error);
                                                    String str5 = ((jmd0) f7hVar).f16759a;
                                                    String strH8 = fragment3.H(R.string.ok_new);
                                                    strH8.getClass();
                                                    dialogFields = new DialogFields((CharSequence) strH7, (CharSequence) str5, (CharSequence) strH8, fragment3.H(R.string.cancel), (String) null, "REQUEST_CODE_BET_EXIST_ERROR_BS", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                                                } else if (f7hVar instanceof lmd0) {
                                                    String strH9 = fragment3.H(R.string.error);
                                                    String str6 = ((lmd0) f7hVar).f20290a;
                                                    String strH10 = fragment3.H(R.string.replenish);
                                                    strH10.getClass();
                                                    dialogFields = new DialogFields((CharSequence) strH9, (CharSequence) str6, (CharSequence) strH10, fragment3.H(R.string.cancel), (String) null, "REQUEST_CODE_NOT_ENOUGH_MONEY_ERROR_BS", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                                                } else if (f7hVar.equals(mmd0.f22032a)) {
                                                    String strH11 = fragment3.H(R.string.quick_bet_network_error);
                                                    strH11.getClass();
                                                    z6hVar3.c(strH11);
                                                } else if (f7hVar instanceof omd0) {
                                                    z6hVar3.c(((omd0) f7hVar).f25498a);
                                                } else if (f7hVar instanceof imd0) {
                                                    v88.b(z6hVar3.f, a4n0.f(fragment3), ((imd0) f7hVar).f15019a, 2);
                                                } else if (f7hVar instanceof sve) {
                                                    String strH12 = fragment3.H(R.string.attention);
                                                    strH12.getClass();
                                                    String strH13 = fragment3.H(R.string.coupon_record_already_exists);
                                                    strH13.getClass();
                                                    z6hVar3.b(strH12, strH13);
                                                } else if (f7hVar instanceof vve) {
                                                    String strH14 = fragment3.H(R.string.attention);
                                                    String strH15 = fragment3.H(R.string.dependent_events);
                                                    String strH16 = fragment3.H(R.string.ok);
                                                    strH16.getClass();
                                                    dialogFields = new DialogFields((CharSequence) strH14, (CharSequence) strH15, (CharSequence) strH16, fragment3.H(R.string.cancel), (String) null, "REQUEST_CODE_SHOW_COUPON_HAS_SAME_EVENT_BS", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                                                } else if (f7hVar instanceof uve) {
                                                    String strH17 = fragment3.H(R.string.attention);
                                                    strH17.getClass();
                                                    String strH18 = fragment3.H(R.string.coupon_max_items_limit_exceed);
                                                    strH18.getClass();
                                                    z6hVar3.b(strH17, strH18);
                                                } else if (f7hVar instanceof tve) {
                                                    String strH19 = fragment3.H(R.string.attention);
                                                    tve tveVar = (tve) f7hVar;
                                                    String strI = fragment3.I(R.string.coupon_type_max_items_limit_exceed_v2, tveVar.f34595a, Integer.valueOf(tveVar.b));
                                                    String strH20 = fragment3.H(R.string.yes);
                                                    strH20.getClass();
                                                    ua80.r(fragment3, iiVar2, new DialogFields((CharSequence) strH19, (CharSequence) strI, (CharSequence) strH20, fragment3.H(R.string.no), (String) null, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG_BS", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488));
                                                } else {
                                                    if (!f7hVar.equals(rve.f31163a)) {
                                                        t9f.b();
                                                        return null;
                                                    }
                                                    ((qe50) z6hVar3.e.b).a(new za50(0, 7, 0L, 0L), false);
                                                }
                                                ua80.r(fragment3, iiVar2, dialogFields);
                                            }
                                            k3t0VarX.x(a6h.f317a);
                                            return Unit.f46060a;
                                    }
                                }
                            };
                            fetVar4.o0(objP7);
                        }
                        Function1 function3 = (Function1) objP7;
                        Unit unit = Unit.f46060a;
                        boolean zI3 = fetVar4.i(vneVar) | fetVar4.i(k3t0VarX) | fetVar4.g(function3) | fetVar4.g(null);
                        Object objP8 = fetVar4.P();
                        if (zI3 || objP8 == obj6) {
                            objP8 = new et(vneVar, k3t0VarX, function3, (byte) 22);
                            fetVar4.o0(objP8);
                        }
                        m0x0.o(unit, (Function1) objP8, fetVar4);
                        i3t0 i3t0Var = (i3t0) k3t0VarX;
                        pz40 pz40VarY = i3t0Var.y(fetVar4);
                        boolean zI4 = fetVar4.i(i3t0Var);
                        Object objP9 = fetVar4.P();
                        if (zI4 || objP9 == obj6) {
                            objP9 = new ui6(i3t0Var, (byte) 4);
                            fetVar4.o0(objP9);
                        }
                        Function0 function4 = (Function0) objP9;
                        boolean zI5 = fetVar4.i(i3t0Var);
                        Object objP10 = fetVar4.P();
                        if (zI5 || objP10 == obj6) {
                            objP10 = new ui6(i3t0Var, (byte) 5);
                            fetVar4.o0(objP10);
                        }
                        v3c.z(function4, (Function0) objP10, null, fetVar4, 0, 4);
                        Object obj12 = (clz) fetVar4.k(or00.f25714a);
                        boolean zG3 = fetVar4.g(pz40VarY);
                        Object objP11 = fetVar4.P();
                        if (zG3 || objP11 == obj6) {
                            objP11 = new eka(pz40VarY, (byte) 28);
                            fetVar4.o0(objP11);
                        }
                        Function0 function5 = (Function0) objP11;
                        boolean zI6 = fetVar4.i(i3t0Var);
                        Object objP12 = fetVar4.P();
                        if (zI6 || objP12 == obj6) {
                            Object y6hVar = new y6h(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                            fetVar4.o0(y6hVar);
                            objP12 = y6hVar;
                        }
                        Function1 function6 = (Function1) ((jhy) objP12);
                        boolean zG4 = fetVar4.g(pz40VarY) | fetVar4.i(r16) | fetVar4.i(obj12) | fetVar4.i(i3t0Var);
                        Object objP13 = fetVar4.P();
                        if (zG4 || objP13 == obj6) {
                            Object mr0Var = new mr0(pz40VarY, fragment, obj12, i3t0Var, (byte) 8);
                            obj5 = i3t0Var;
                            fetVar4.o0(mr0Var);
                            objP13 = mr0Var;
                        } else {
                            obj5 = i3t0Var;
                        }
                        ahy.n(null, function5, function2, function6, (Function0) objP13, u1c.M(1008203693, new qb((Object) z6hVar2, obj5, (Object) ugdVarM, (byte) 26), fetVar4), fetVar4, (i2 & 896) | 196608);
                        fetVar4.r(false);
                        fetVar4.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw b1j.f(1681253939, fetVar4, false);
                        }
                        fetVar4.e0(580248189);
                        jtv.f0(o7k0.c, fragment, cyberBottomSheetParams, true, null, x3mVar.c() != y3m.f41958a, function2, fetVar4, ((i << 15) & 3670016) | 27654);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 2:
                xk80 xk80Var = (xk80) obj11;
                k6z k6zVar = (k6z) obj10;
                a4x a4xVar2 = (a4x) obj9;
                Function1 function7 = (Function1) obj8;
                zsf zsfVar = (zsf) obj7;
                int iIntValue4 = ((Integer) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= fetVar5.e(iIntValue4) ? 32 : 16;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    boolean z4 = xk80Var.r() == iIntValue4;
                    Object objP14 = fetVar5.P();
                    if (objP14 == obj6) {
                        objP14 = xf0.c(0.0f);
                        fetVar5.o0(objP14);
                    }
                    t33 t33Var = (t33) objP14;
                    Boolean boolValueOf = Boolean.valueOf(z4);
                    boolean zI7 = fetVar5.i(t33Var) | fetVar5.h(z4);
                    Object objP15 = fetVar5.P();
                    if (zI7 || objP15 == obj6) {
                        z3 = z4;
                        Object ys8Var = new ys8((Object) t33Var, z3, (Object) zsfVar, (yje) null, (byte) 5);
                        fetVar5.o0(ys8Var);
                        objP15 = ys8Var;
                    } else {
                        z3 = z4;
                    }
                    m0x0.t(fetVar5, boolValueOf, (Function2) objP15);
                    mm40 mm40VarH = k7n0.H(o7k0.d(jm40.b, 1.0f), z3 ? 1.0f : 0.0f);
                    boolean zG5 = fetVar5.g(xk80Var) | ((iIntValue5 & 112) == 32) | fetVar5.e(k6zVar.ordinal()) | fetVar5.i(t33Var);
                    Object objP16 = fetVar5.P();
                    if (zG5 || objP16 == obj6) {
                        Object ec3Var = new ec3(xk80Var, iIntValue4, k6zVar, t33Var, (byte) 6);
                        fetVar5.o0(ec3Var);
                        objP16 = ec3Var;
                    }
                    bfb.q(i4w0.T(mm40VarH, (Function1) objP16), (ghm) a4xVar2.get(iIntValue4), function7, fetVar5);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            default:
                g960 g960Var = (g960) obj11;
                nrq nrqVar = (nrq) obj10;
                l7m0 l7m0Var = (l7m0) obj9;
                l7m0 l7m0Var2 = (l7m0) obj8;
                pz40 pz40Var2 = (pz40) obj7;
                wke wkeVar = (wke) obj2;
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                wkeVar.getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= fetVar6.e(wkeVar.ordinal()) ? 32 : 16;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    int iOrdinal2 = wkeVar.ordinal();
                    if (iOrdinal2 == 0) {
                        fetVar6.e0(-1284892305);
                        dak0.a(g960Var.c, fetVar6, 0);
                        fetVar6.r(false);
                    } else if (iOrdinal2 == 1) {
                        fetVar6.e0(-1284766073);
                        dak0.d(g960Var, ((Number) l7m0Var.getValue()).floatValue(), ((Number) l7m0Var2.getValue()).floatValue(), fetVar6, 0);
                        fetVar6.r(false);
                    } else {
                        if (iOrdinal2 != 2) {
                            throw b1j.f(2036760585, fetVar6, false);
                        }
                        fetVar6.e0(-1284510819);
                        String str3 = g960Var.g;
                        e960 e960Var = (e960) pz40Var2.getValue();
                        d960 d960Var = e960Var instanceof d960 ? (d960) e960Var : null;
                        String str4 = d960Var != null ? d960Var.f5686a : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        dak0.b(str3, str4, nrqVar, fetVar6, 0);
                        fetVar6.r(false);
                    }
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ t39(pz40 pz40Var, nwd nwdVar, Fragment fragment, CyberBottomSheetParams cyberBottomSheetParams, x3m x3mVar, jtv jtvVar) {
        this.f33255a = (byte) 1;
        this.b = pz40Var;
        this.c = fragment;
        this.d = cyberBottomSheetParams;
        this.e = x3mVar;
        this.f = jtvVar;
    }

    public /* synthetic */ t39(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f33255a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
