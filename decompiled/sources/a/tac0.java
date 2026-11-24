package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.xplatform.bonus_agreements.impl.di.feature.navigation.BonusAgreementsScreenFactoryImpl$getBonusAgreementsScreen$1;
import org.xplatform.bonuses.impl.navigation.BonusesScreenFactoryImpl$getBonusesScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoListScreen$1;
import org.xplatform.promotions.loyalty.impl.navigation.PromotionsLoyaltyScreens$ChampionsClubFragmentScreen;
import org.xplatform.referral.impl.navigation.ReferralProgramScreenFactoryImpl$loadDataScreen$1;
import org.xplatform.welcome_bonus.impl.presentation.WelcomeBonusScreenFactoryImpl$getWelcomeBonusScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class tac0 extends eiu0 {
    public final fvt0 c;
    public final i1w0 d;
    public final duj e;
    public final b4j f;
    public final x20 g;
    public final peg0 h;
    public final pru i;
    public final lbu j;
    public final ls k;
    public List l;
    public final ol60 m;

    public tac0(kl5 kl5Var, jh70 jh70Var, qgd qgdVar, yk5 yk5Var, fvt0 fvt0Var, rl70 rl70Var, i1w0 i1w0Var, duj dujVar, b4j b4jVar, x20 x20Var, peg0 peg0Var, pru pruVar, lbu lbuVar, sxs0 sxs0Var, mi70 mi70Var, ls lsVar, long j) {
        i1w0Var.getClass();
        this.c = fvt0Var;
        this.d = i1w0Var;
        this.e = dujVar;
        this.f = b4jVar;
        this.g = x20Var;
        this.h = peg0Var;
        this.i = pruVar;
        this.j = lbuVar;
        this.k = lsVar;
        this.l = iun.f15405a;
        this.m = new ol60(3);
        if (j == 0) {
            return;
        }
        k0w0 k0w0Var = new k0w0(i1w0Var);
        ((esg0) this.c.f10231a).S();
        k0w0Var.h(bbw0.h(j));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public static String w(gtc0 gtc0Var) {
        switch (gtc0Var) {
            case DEFAULT:
                return "bonus_info";
            case BONUS_GAMES:
                return "bonus_games";
            case USER_PROMO_CODES:
                return "promo_codes";
            case CHAMPIONS_CLUB:
                return "champions_club";
            case PROMO_CODE_CHECK:
                return "promo_check";
            case CASHBACK:
                return "promo_cashback";
            case VIP_CASHBACK:
                return "promo_vip";
            case SPORT_CASHBACK:
            case SPORT_CASHBACK_CP:
                return "promo_sport_cashback";
            case PROMO_PARTICIPATION:
                return "promo_actions";
            case BONUSES:
                return "promo_bonuses";
            case REFERRAL_PROGRAM:
                return "promo_friend";
            case REGISTRATION_BONUS_PARTICIPATION:
                return "promo_welcome_bonus";
            default:
                t9f.b();
                return null;
        }
    }

    public final void A(o4c0 o4c0Var) {
        fl70 fl70Var = gtc0.e;
        long j = o4c0Var.f24627a;
        fl70Var.getClass();
        gtc0 gtc0Var = gtc0.DEFAULT;
        if (j != 0) {
            gtc0Var = gtc0.BONUS_GAMES;
            if (j != 1) {
                gtc0Var = gtc0.USER_PROMO_CODES;
                if (j != 2) {
                    gtc0Var = gtc0.CHAMPIONS_CLUB;
                    if (j != 12) {
                        gtc0Var = gtc0.PROMO_CODE_CHECK;
                        if (j != 3) {
                            gtc0Var = gtc0.CASHBACK;
                            if (j != 4) {
                                gtc0Var = gtc0.VIP_CASHBACK;
                                if (j != 5) {
                                    gtc0Var = gtc0.SPORT_CASHBACK;
                                    if (j != 6) {
                                        gtc0Var = gtc0.PROMO_PARTICIPATION;
                                        if (j != 7) {
                                            gtc0Var = gtc0.BONUSES;
                                            if (j != 8) {
                                                gtc0Var = gtc0.REFERRAL_PROGRAM;
                                                if (j != 9) {
                                                    gtc0Var = gtc0.REGISTRATION_BONUS_PARTICIPATION;
                                                    if (j != 11) {
                                                        e9d0.o();
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        v(gtc0Var);
    }

    public final void B() {
        i8i.D("point", "promo_shop", this.f.f1961a, "promo_menu_call");
        this.g.v(new quc0("promo_shop"));
        this.d.d(new wyb0(this, (byte) 17));
    }

    public final void v(gtc0 gtc0Var) {
        kt2 kt2Var = this.f.f1961a;
        if (gtc0Var != gtc0.BONUS_GAMES && gtc0Var != gtc0.DEFAULT) {
            this.g.v(new quc0(w(gtc0Var)));
        }
        int iOrdinal = gtc0Var.ordinal();
        i1w0 i1w0Var = this.d;
        switch (iOrdinal) {
            case 0:
                break;
            case 1:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "bonus_games")));
                i1w0Var.getClass();
                k0w0 k0w0Var = new k0w0(i1w0Var);
                ((esg0) this.c.f10231a).S();
                k0w0Var.h(bbw0.h(0L));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 2:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "promo_codes")));
                i1w0Var.getClass();
                k0w0 k0w0Var2 = new k0w0(i1w0Var);
                k0w0Var2.h(new PromoScreenFactoryImpl$getPromoListScreen$1());
                ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (pawVar2.hasNext()) {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                    break;
                }
                break;
            case 3:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "champions_club")));
                i1w0Var.getClass();
                k0w0 k0w0Var3 = new k0w0(i1w0Var);
                k0w0Var3.h(new PromotionsLoyaltyScreens$ChampionsClubFragmentScreen());
                ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0Var3.f17489a, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO3;
                    if (pawVar3.hasNext()) {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                    break;
                }
                break;
            case 4:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "promo_check")));
                i1w0Var.d(new wyb0(this, (byte) 18));
                break;
            case 5:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "promo_cashback")));
                i1w0Var.d(new wyb0(this, (byte) 19));
                break;
            case 6:
                this.i.a();
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "promo_vip")));
                i1w0Var.d(new ppb0(this, (byte) 13));
                break;
            case 7:
            case 8:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "promo_sport_cashback")));
                i1w0Var.d(new wyb0(this, (byte) 20));
                break;
            case 9:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "promo_actions")));
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                FragmentScreen bonusAgreementsScreenFactoryImpl$getBonusAgreementsScreen$1 = new BonusAgreementsScreenFactoryImpl$getBonusAgreementsScreen$1();
                if (bonusAgreementsScreenFactoryImpl$getBonusAgreementsScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) bonusAgreementsScreenFactoryImpl$getBonusAgreementsScreen$1)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(bonusAgreementsScreenFactoryImpl$getBonusAgreementsScreen$1)));
                }
                ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO4;
                    if (pawVar4.hasNext()) {
                        i1w0Var.a((oe50) pawVar4.next());
                    }
                    break;
                }
                break;
            case 10:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "promo_bonuses")));
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                FragmentScreen bonusesScreenFactoryImpl$getBonusesScreen$1 = new BonusesScreenFactoryImpl$getBonusesScreen$1();
                if (bonusesScreenFactoryImpl$getBonusesScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) bonusesScreenFactoryImpl$getBonusesScreen$1)));
                } else {
                    copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(bonusesScreenFactoryImpl$getBonusesScreen$1)));
                }
                ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorO5;
                    if (pawVar5.hasNext()) {
                        i1w0Var.a((oe50) pawVar5.next());
                    }
                    break;
                }
                break;
            case 11:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "promo_friend")));
                i1w0Var.getClass();
                k0w0 k0w0Var4 = new k0w0(i1w0Var);
                k0w0Var4.h(new ReferralProgramScreenFactoryImpl$loadDataScreen$1());
                ListIterator listIteratorO6 = b1j.o(i1w0Var, k0w0Var4.f17489a, 0);
                while (true) {
                    paw pawVar6 = (paw) listIteratorO6;
                    if (pawVar6.hasNext()) {
                        i1w0Var.a((oe50) pawVar6.next());
                    }
                    break;
                }
                break;
            case 12:
                kt2Var.a("promo_menu_call", wp20.b(new Pair("point", "promo_welcome_bonus")));
                i1w0Var.getClass();
                k0w0 k0w0Var5 = new k0w0(i1w0Var);
                k0w0Var5.h(new WelcomeBonusScreenFactoryImpl$getWelcomeBonusScreen$1());
                ListIterator listIteratorO7 = b1j.o(i1w0Var, k0w0Var5.f17489a, 0);
                while (true) {
                    paw pawVar7 = (paw) listIteratorO7;
                    if (pawVar7.hasNext()) {
                        i1w0Var.a((oe50) pawVar7.next());
                    }
                    break;
                }
                break;
            default:
                t9f.b();
                break;
        }
    }

    public final void x() {
        i1w0 i1w0Var = this.d;
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

    public final void y() {
        this.g.v(new quc0(w(gtc0.BONUS_GAMES)));
        i8i.D("point", "bonus_games", this.f.f1961a, "promo_menu_call");
        i1w0 i1w0Var = this.d;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        ((esg0) this.c.f10231a).S();
        k0w0VarI.h(bbw0.h(0L));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void z(u4s u4sVar) {
        long j = u4sVar.f35067a;
        puc0 puc0Var = new puc0(j);
        x20 x20Var = this.g;
        x20Var.v(puc0Var);
        x20Var.s(j, "promo_menu");
        this.f.l(j, "promo_menu");
        sac.V(jiu0.a(s()), new l8c0(1, this, tac0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, null, new qo6((Object) u4sVar, (Object) this, (yje) null, (byte) 4), 14);
    }
}
