package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class tn80 extends w46 {
    public final bzt b;
    public final rqt c;
    public final rqt d;
    public final ctf0 e;
    public final i1w0 f;
    public final lkd g;
    public final p7m0 h;
    public final p7m0 i;

    /* JADX WARN: Code duplicated, block: B:37:0x0845  */
    /* JADX WARN: Code duplicated, block: B:44:0x0851  */
    /* JADX WARN: Code duplicated, block: B:51:0x085d  */
    public tn80(wyu wyuVar, e1u e1uVar, bzt bztVar, rqt rqtVar, rqt rqtVar2, ctf0 ctf0Var, i1w0 i1w0Var) {
        List listJ;
        wyuVar.getClass();
        ctf0Var.getClass();
        this.b = bztVar;
        this.c = rqtVar;
        this.d = rqtVar2;
        this.e = ctf0Var;
        this.f = i1w0Var;
        ((us3) ((peg0) e1uVar.b).b).getClass();
        lkd.c.getClass();
        this.g = yk5.a();
        c0o c0oVar = jn80.h;
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Iterator it = c0oVar.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int iOrdinal = ((jn80) next).ordinal();
            if (iOrdinal == 0) {
                listJ = q3d.j(new p14(R.attr.uikitPrimary), new p14(R.attr.uikitPrimary80), new p14(R.attr.uikitPrimary60), new p14(R.attr.uikitPrimary0), new p14(R.attr.uikitPrimaryHighlight), new p14(R.attr.uikitPrimaryForeground), new p14(R.attr.uikitPrimaryForeground80), new p14(R.attr.uikitCommerce), new p14(R.attr.uikitCommerceHighlight), new p14(R.attr.uikitCommerceTint), new p14(R.attr.uikitCommerceForeground), new p14(R.attr.uikitCommerceForeground80), new p14(R.attr.uikitWarning), new p14(R.attr.uikitWarningTint), new p14(R.attr.uikitWarningTintHighlight), new p14(R.attr.uikitSecondary), new p14(R.attr.uikitSecondary60), new p14(R.attr.uikitSecondary40), new p14(R.attr.uikitSecondary20), new p14(R.attr.uikitSecondary10), new p14(R.attr.uikitTextPrimary), new p14(R.attr.uikitBackground), new p14(R.attr.uikitBackground0), new p14(R.attr.uikitBackgroundContent), new p14(R.attr.uikitBackgroundContent0), new p14(R.attr.uikitBackgroundGroup), new p14(R.attr.uikitBackgroundGroupSecondary), new p14(R.attr.uikitBackgroundDark), new p14(R.attr.uikitBackgroundLight60), new p14(R.attr.uikitSecondaryButtonBackground), new p14(R.attr.uikitSecondaryButtonBackgroundHighlight), new p14(R.attr.uikitSecondaryButtonForeground), new p14(R.attr.uikitInputBackground60), new p14(R.attr.uikitSnackbarAltBackground), new p14(R.attr.uikitSwitchOff), new p14(R.attr.uikitSeparator), new p14(R.attr.uikitSeparator60), new p14(R.attr.uikitPromoBackground), new p14(R.attr.uikitPromoCardGradientStart), new p14(R.attr.uikitPromoCardGradientEnd), new p14(R.attr.uikitRipple), new p14(R.attr.uikitCustomButtonBonusGradientStart), new p14(R.attr.uikitSocialNetworksVerticalBackground), new p14(R.attr.uikitCustomButtonBonusGradientEnd), new p14(R.attr.uikitCustomPictureSBonusGradient));
            } else if (iOrdinal == 1) {
                listJ = q3d.j(new p14(R.attr.uikitWebGamesBackground), new p14(R.attr.uikitWebGamesControlBackground), new p14(R.attr.uikitWebGamesShimmer), new p14(R.attr.uikitSplashBackground), new p14(R.attr.uikitUpdateGradientStart), new p14(R.attr.uikitUpdateGradientEnd), new p14(R.attr.uikitCoefHigher), new p14(R.attr.uikitCoefLower));
            } else if (iOrdinal == 2) {
                listJ = q3d.j(new p14(R.attr.uikitCustomPromoGradientStart), new p14(R.attr.uikitCustomPromoGradientEnd), new p14(R.attr.uikitCustomItsme), new p14(R.attr.uikitCustomQatar));
            } else if (iOrdinal == 3) {
                listJ = q3d.j(new p14(R.attr.uikitStaticWhite), new p14(R.attr.uikitStaticWhite80), new p14(R.attr.uikitStaticWhite60), new p14(R.attr.uikitStaticWhite40), new p14(R.attr.uikitStaticWhite30), new p14(R.attr.uikitStaticWhite20), new p14(R.attr.uikitStaticWhite10), new p14(R.attr.uikitStaticBlack), new p14(R.attr.uikitStaticBlack80), new p14(R.attr.uikitStaticBlack60), new p14(R.attr.uikitStaticBlack40), new p14(R.attr.uikitStaticBlack30), new p14(R.attr.uikitStaticBlack20), new p14(R.attr.uikitStaticBlack18), new p14(R.attr.uikitStaticBlack16), new p14(R.attr.uikitStaticBlack14), new p14(R.attr.uikitStaticBlack12), new p14(R.attr.uikitStaticBlack10), new p14(R.attr.uikitStaticBlack8), new p14(R.attr.uikitStaticBlack6), new p14(R.attr.uikitStaticBlack4), new p14(R.attr.uikitStaticBlack2), new p14(R.attr.uikitStaticBlack0), new p14(R.attr.uikitStaticGray), new p14(R.attr.uikitStaticGray20), new p14(R.attr.uikitStaticGray40), new p14(R.attr.uikitStaticRed), new p14(R.attr.uikitStaticRed40), new p14(R.attr.uikitStaticRed30), new p14(R.attr.uikitStaticRed20), new p14(R.attr.uikitStaticRed10), new p14(R.attr.uikitStaticGreen), new p14(R.attr.uikitStaticGreen40), new p14(R.attr.uikitStaticGreen30), new p14(R.attr.uikitStaticGreen20), new p14(R.attr.uikitStaticGreen10), new p14(R.attr.uikitStaticViolet), new p14(R.attr.uikitStaticPurple), new p14(R.attr.uikitStaticPurple10), new p14(R.attr.uikitStaticDarkBlue), new p14(R.attr.uikitStaticDarkBlue40), new p14(R.attr.uikitStaticDarkBlue30), new p14(R.attr.uikitStaticDarkBlue20), new p14(R.attr.uikitStaticDarkBlue10), new p14(R.attr.uikitStaticBlue), new p14(R.attr.uikitStaticTeal), new p14(R.attr.uikitStaticYellow), new p14(R.attr.uikitStaticYellow40), new p14(R.attr.uikitStaticYellow30), new p14(R.attr.uikitStaticYellow20), new p14(R.attr.uikitStaticYellow10), new p14(R.attr.uikitStaticOrange), new p14(R.attr.uikitStaticOrange40), new p14(R.attr.uikitStaticOrange30), new p14(R.attr.uikitStaticOrange20), new p14(R.attr.uikitStaticOrange10), new p14(R.attr.uikitStaticDarkOrange), new p14(R.attr.uikitStaticDarkOrange40), new p14(R.attr.uikitStaticDarkOrange30), new p14(R.attr.uikitStaticDarkOrange20), new p14(R.attr.uikitStaticDarkOrange10), new p14(R.attr.uikitStaticLightBrown), new p14(R.attr.uikitStaticPink), new p14(R.attr.uikitStaticDarkPink), new p14(R.attr.uikitStaticDarkGrey), new p14(R.attr.uikitStaticGamesTextVictory), new p14(R.attr.uikitStaticGamesCoefficient), new p14(R.attr.uikitStaticOverlayBackground40), new p14(R.attr.uikitStaticTransparent));
            } else if (iOrdinal == 4) {
                listJ = q3d.j(new p14(R.attr.uikitWidgetBackground), new p14(R.attr.uikitWidgetContent), new p14(R.attr.uikitWidgetText), new p14(R.attr.uikitWidgetIcon), new p14(R.attr.uikitWidgetIcon70), new p14(R.attr.uikitWidgetIcon50), new p14(R.attr.uikitWidgetUpdateButton));
            } else {
                if (iOrdinal != 5) {
                    t9f.b();
                    throw null;
                }
                listJ = q3d.j(new p14(R.attr.uiKitAggregatorBlue), new p14(R.attr.uiKitAggregatorBlue80), new p14(R.attr.uiKitAggregatorBlue0), new p14(R.attr.uiKitAggregatorGreen), new p14(R.attr.uiKitAggregatorGreen80), new p14(R.attr.uiKitAggregatorGreen40), new p14(R.attr.uiKitAggregatorPurple), new p14(R.attr.uiKitAggregatorPurple80), new p14(R.attr.uiKitAggregatorPurple0), new p14(R.attr.uiKitAggregatorRed), new p14(R.attr.uiKitAggregatorRed80), new p14(R.attr.uiKitAggregatorRed0), new p14(R.attr.uiKitAggregatorViolet), new p14(R.attr.uiKitAggregatorViolet80), new p14(R.attr.uiKitAggregatorViolet40), new p14(R.attr.uiKitAggregatorViolet0), new p14(R.attr.uiKitAggregatorLavender), new p14(R.attr.uiKitAggregatorMauve), new p14(R.attr.uiKitAggregatorSand), new p14(R.attr.uiKitAggregatorCooper), new p14(R.attr.uiKitAggregatorCooperStart), new p14(R.attr.uiKitAggregatorCooperEnd), new p14(R.attr.uiKitAggregatorCooperDarkStart), new p14(R.attr.uiKitAggregatorCooperDarkEnd), new p14(R.attr.uiKitAggregatorBronze), new p14(R.attr.uiKitAggregatorBronzeStart), new p14(R.attr.uiKitAggregatorBronzeEnd), new p14(R.attr.uiKitAggregatorBronzeDarkStart), new p14(R.attr.uiKitAggregatorBronzeDarkEnd), new p14(R.attr.uiKitAggregatorSilver), new p14(R.attr.uiKitAggregatorSilverStart), new p14(R.attr.uiKitAggregatorSilverEnd), new p14(R.attr.uiKitAggregatorSilverDarkStart), new p14(R.attr.uiKitAggregatorSilverDarkEnd), new p14(R.attr.uiKitAggregatorGold), new p14(R.attr.uiKitAggregatorGoldStart), new p14(R.attr.uiKitAggregatorGoldEnd), new p14(R.attr.uiKitAggregatorGoldDarkStart), new p14(R.attr.uiKitAggregatorGoldDarkEnd), new p14(R.attr.uiKitAggregatorRuby), new p14(R.attr.uiKitAggregatorRubyStart), new p14(R.attr.uiKitAggregatorRubyEnd), new p14(R.attr.uiKitAggregatorRubyDarkStart), new p14(R.attr.uiKitAggregatorRubyDarkEnd), new p14(R.attr.uiKitAggregatorSapphire), new p14(R.attr.uiKitAggregatorSapphireStart), new p14(R.attr.uiKitAggregatorSapphireEnd), new p14(R.attr.uiKitAggregatorSapphireDarkStart), new p14(R.attr.uiKitAggregatorSapphireDarkEnd), new p14(R.attr.uiKitAggregatorBrilliant), new p14(R.attr.uiKitAggregatorBrilliantStart), new p14(R.attr.uiKitAggregatorBrilliantEnd), new p14(R.attr.uiKitAggregatorBrilliantDarkStart), new p14(R.attr.uiKitAggregatorBrilliantDarkEnd), new p14(R.attr.uiKitAggregatorVip), new p14(R.attr.uiKitAggregatorVipStart), new p14(R.attr.uiKitAggregatorVipEnd), new p14(R.attr.uiKitAggregatorVipDarkStart), new p14(R.attr.uiKitAggregatorVipDarkEnd), new p14(R.attr.uiKitAggregatorUnknown), new p14(R.attr.uiKitAggregatorUnknownStart), new p14(R.attr.uiKitAggregatorUnknownEnd), new p14(R.attr.uiKitAggregatorUnknownDarkStart), new p14(R.attr.uiKitAggregatorUnknownDarkEnd));
            }
            linkedHashMap.put(next, listJ);
        }
        this.h = q7m0.a(linkedHashMap);
        uaq0 uaq0VarA = wyuVar.a();
        lkd lkdVar = this.g;
        lkdVar.getClass();
        bbq0 bbq0Var = lkdVar.b;
        taq0 taq0Var = bbq0Var.j;
        taq0 taq0Var2 = bbq0Var.h;
        taq0 taq0Var3 = bbq0Var.f;
        taq0 taq0Var4 = bbq0Var.d;
        taq0 taq0Var5 = bbq0Var.f2320a;
        switch (uaq0VarA.ordinal()) {
            case 0:
                taq0Var = taq0Var5;
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 1:
                taq0Var = bbq0Var.b;
                if (taq0Var == null) {
                    taq0Var = taq0Var5;
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 2:
                taq0Var = bbq0Var.c;
                if (taq0Var == null) {
                    taq0Var = taq0Var5;
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 3:
                if (taq0Var == null) {
                    taq0Var = taq0Var5;
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 4:
                taq0 taq0Var6 = bbq0Var.k;
                if (taq0Var6 != null) {
                    taq0Var = taq0Var6;
                } else if (taq0Var == null) {
                    taq0Var = taq0Var5;
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 5:
                if (taq0Var2 == null) {
                    taq0Var = taq0Var5;
                } else {
                    taq0Var = taq0Var2;
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 6:
                taq0Var = bbq0Var.i;
                if (taq0Var == null) {
                    if (taq0Var2 == null) {
                        taq0Var = taq0Var5;
                    } else {
                        taq0Var = taq0Var2;
                    }
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 7:
                if (taq0Var3 == null) {
                    taq0Var = taq0Var5;
                } else {
                    taq0Var = taq0Var3;
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 8:
                taq0Var = bbq0Var.g;
                if (taq0Var == null) {
                    if (taq0Var3 == null) {
                        taq0Var = taq0Var5;
                    } else {
                        taq0Var = taq0Var3;
                    }
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 9:
                if (taq0Var4 == null) {
                    taq0Var = taq0Var5;
                } else {
                    taq0Var = taq0Var4;
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            case 10:
                taq0Var = bbq0Var.e;
                if (taq0Var == null) {
                    if (taq0Var4 == null) {
                        taq0Var = taq0Var5;
                    } else {
                        taq0Var = taq0Var4;
                    }
                }
                this.i = q7m0.a(new ln80(uaq0VarA, taq0Var, w(uaq0VarA, false), false));
                return;
            default:
                t9f.b();
                throw null;
        }
    }

    public static v9c w(uaq0 uaq0Var, boolean z) {
        if (!z) {
            return new v9c(d4d.BACKGROUND, d4d.BACKGROUND_GROUP, false, d4d.TEXT_PRIMARY);
        }
        d4d d4dVar = d4d.PRIMARY_FOREGROUND;
        d4d d4dVar2 = d4d.SECONDARY20;
        uaq0.f35345a.getClass();
        return new v9c(d4dVar, d4dVar2, true, !s9m0.j(uaq0Var) ? d4d.BACKGROUND_GROUP : d4d.TEXT_PRIMARY);
    }

    public final void x(qn80 qn80Var) {
        Object value;
        ln80 ln80Var;
        Object value2;
        ln80 ln80Var2;
        taq0 taq0Var;
        uaq0 uaq0Var;
        Object value3;
        ln80 ln80Var3;
        if (!qn80Var.equals(mn80.f22076a)) {
            boolean zEquals = qn80Var.equals(nn80.f23809a);
            p7m0 p7m0Var = this.i;
            if (zEquals) {
                do {
                    value3 = p7m0Var.getValue();
                    ln80Var3 = (ln80) value3;
                } while (!p7m0Var.m(value3, ln80.a(ln80Var3, null, null, w(ln80Var3.f20333a, !ln80Var3.c.c), false, 11)));
                return;
            }
            if (!qn80Var.equals(on80.f25536a)) {
                if (!qn80Var.equals(pn80.f27275a)) {
                    t9f.b();
                    return;
                }
                do {
                    value = p7m0Var.getValue();
                    ln80Var = (ln80) value;
                } while (!p7m0Var.m(value, ln80.a(ln80Var, null, null, null, !ln80Var.d, 7)));
                return;
            }
            do {
                value2 = p7m0Var.getValue();
                ln80Var2 = (ln80) value2;
                s9m0 s9m0Var = uaq0.f35345a;
                uaq0 uaq0Var2 = ln80Var2.f20333a;
                s9m0Var.getClass();
                boolean zJ = s9m0.j(uaq0Var2);
                lkd lkdVar = this.g;
                if (zJ && (taq0Var = lkdVar.b.b) != null) {
                    uaq0Var = uaq0.c;
                } else if (s9m0.j(uaq0Var2) && (taq0Var = lkdVar.b.c) != null) {
                    uaq0Var = uaq0.d;
                } else if (!s9m0.i(uaq0Var2) || (taq0Var = lkdVar.b.c) == null) {
                    taq0Var = lkdVar.b.f2320a;
                    uaq0Var = uaq0.b;
                } else {
                    uaq0Var = uaq0.d;
                }
                if (taq0Var == null) {
                    taq0Var = ln80Var2.b;
                }
            } while (!p7m0Var.m(value2, ln80.a(ln80Var2, uaq0Var, taq0Var, w(uaq0Var, ln80Var2.c.c), false, 8)));
            return;
        }
        i1w0 i1w0Var = this.f;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
