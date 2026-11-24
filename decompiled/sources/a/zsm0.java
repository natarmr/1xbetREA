package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParser;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zsm0 {
    public static final yoq0 A(tt6 tt6Var) {
        int i;
        int i2;
        ut6 ut6Var = ut6.c;
        ut6 ut6Var2 = ut6.b;
        tt6Var.getClass();
        ut6 ut6Var3 = tt6Var.f34495a;
        ut6 ut6Var4 = ut6.f36242a;
        if (Intrinsics.d(ut6Var3, ut6Var4)) {
            i = R.string.betconstructor_tips_collect_bet_title;
        } else if (Intrinsics.d(ut6Var3, ut6Var2)) {
            i = R.string.betconstructor_tips_make_bet_title;
        } else {
            if (!Intrinsics.d(ut6Var3, ut6Var)) {
                t9f.b();
                return null;
            }
            i = R.string.betconstructor_tips_using_title;
        }
        if (Intrinsics.d(ut6Var3, ut6Var4)) {
            i2 = R.string.betconstructor_tips_collect_bet_description;
        } else if (Intrinsics.d(ut6Var3, ut6Var2)) {
            i2 = R.string.betconstructor_tips_make_bet_description;
        } else {
            if (!Intrinsics.d(ut6Var3, ut6Var)) {
                t9f.b();
                return null;
            }
            i2 = R.string.betconstructor_tips_using_description;
        }
        return new yoq0(i, i2, tt6Var.b, false);
    }

    public static final yoq0 B(f4f f4fVar) {
        int i;
        int i2;
        g4f g4fVar = g4f.e;
        g4f g4fVar2 = g4f.d;
        g4f g4fVar3 = g4f.c;
        g4f g4fVar4 = g4f.b;
        f4fVar.getClass();
        g4f g4fVar5 = f4fVar.f8911a;
        g4f g4fVar6 = g4f.f10662a;
        if (Intrinsics.d(g4fVar5, g4fVar6)) {
            i = R.string.coupone_tips_make_bet_any_command_title;
        } else if (Intrinsics.d(g4fVar5, g4fVar4)) {
            i = R.string.coupone_tips_have_promo_code_title;
        } else if (Intrinsics.d(g4fVar5, g4fVar3)) {
            i = R.string.coupone_tips_make_bet_screen_title;
        } else if (Intrinsics.d(g4fVar5, g4fVar2)) {
            i = R.string.coupone_tips_roll_up_promo_code_title;
        } else {
            if (!Intrinsics.d(g4fVar5, g4fVar)) {
                t9f.b();
                return null;
            }
            i = R.string.coupone_tips_make_settings_title;
        }
        if (Intrinsics.d(g4fVar5, g4fVar6)) {
            i2 = R.string.coupone_tips_make_bet_any_command_description;
        } else if (Intrinsics.d(g4fVar5, g4fVar4)) {
            i2 = R.string.coupone_tips_have_promo_code_description;
        } else if (Intrinsics.d(g4fVar5, g4fVar3)) {
            i2 = R.string.coupone_tips_make_bet_description;
        } else if (Intrinsics.d(g4fVar5, g4fVar2)) {
            i2 = R.string.coupone_tips_roll_up_promo_code_description;
        } else {
            if (!Intrinsics.d(g4fVar5, g4fVar)) {
                t9f.b();
                return null;
            }
            i2 = R.string.coupone_tips_update_make_settings_description;
        }
        return new yoq0(i, i2, f4fVar.b, false);
    }

    public static final yoq0 C(idh idhVar) {
        int i;
        int i2;
        kdh kdhVar = kdh.h;
        kdh kdhVar2 = kdh.g;
        kdh kdhVar3 = kdh.f;
        kdh kdhVar4 = kdh.e;
        idhVar.getClass();
        vdh vdhVar = idhVar.f14586a;
        ldh ldhVar = ldh.d;
        boolean zD = Intrinsics.d(vdhVar, ldhVar);
        pdh pdhVar = pdh.c;
        jdh jdhVar = jdh.c;
        qdh qdhVar = qdh.c;
        rdh rdhVar = rdh.c;
        if (zD) {
            i = R.string.cyber_games_tip_all_title;
        } else if (Intrinsics.d(vdhVar, mdh.d)) {
            i = R.string.cyber_games_tip_convenient_access_title;
        } else if (Intrinsics.d(vdhVar, ndh.d)) {
            i = R.string.cyber_games_tip_favorite_discipline_title;
        } else if (Intrinsics.d(vdhVar, kdhVar4)) {
            i = R.string.cyber_event_tip_broadcast_new_title;
        } else if (Intrinsics.d(vdhVar, kdhVar3)) {
            i = R.string.cyber_event_tip_live_statistics_new_title;
        } else if (Intrinsics.d(vdhVar, kdhVar2)) {
            i = R.string.cyber_event_tip_market_title;
        } else if (Intrinsics.d(vdhVar, kdhVar)) {
            i = R.string.cyber_event_tip_past_statistics_title_onboarding;
        } else if (Intrinsics.d(vdhVar, sdh.d)) {
            i = R.string.cyber_tournament_tip_tournament_title;
        } else if (Intrinsics.d(vdhVar, tdh.d)) {
            i = R.string.cyber_tournament_tip_tournament_promo_title;
        } else if (Intrinsics.d(vdhVar, rdhVar)) {
            i = R.string.cyber_team_tip_team_information_new_title;
        } else if (Intrinsics.d(vdhVar, qdhVar)) {
            i = R.string.cyber_promo_tip_all_promo_title;
        } else if (Intrinsics.d(vdhVar, jdhVar)) {
            i = R.string.cyber_calendar_tip_event_list_title;
        } else {
            if (!Intrinsics.d(vdhVar, pdhVar)) {
                t9f.b();
                return null;
            }
            i = R.string.cyber_partners_tip_partner_list_title;
        }
        if (Intrinsics.d(vdhVar, ldhVar)) {
            i2 = R.string.cyber_games_tip_all_description;
        } else if (Intrinsics.d(vdhVar, mdh.d)) {
            i2 = R.string.cyber_games_tip_convenient_access_description;
        } else if (Intrinsics.d(vdhVar, ndh.d)) {
            i2 = R.string.cyber_games_tip_favorite_discipline_description;
        } else if (Intrinsics.d(vdhVar, kdhVar4)) {
            i2 = R.string.cyber_event_tip_broadcast_new_description;
        } else if (Intrinsics.d(vdhVar, kdhVar3)) {
            i2 = R.string.cyber_event_tip_live_statistics_new_description;
        } else if (Intrinsics.d(vdhVar, kdhVar2)) {
            i2 = R.string.cyber_event_tip_market_description;
        } else if (Intrinsics.d(vdhVar, kdhVar)) {
            i2 = R.string.cyber_event_tip_past_statistics_description;
        } else if (Intrinsics.d(vdhVar, sdh.d)) {
            i2 = R.string.cyber_tournament_tip_tournament_description;
        } else if (Intrinsics.d(vdhVar, tdh.d)) {
            i2 = R.string.cyber_tournament_tip_tournament_promo_new_description;
        } else if (Intrinsics.d(vdhVar, rdhVar)) {
            i2 = R.string.cyber_team_tip_team_information_new_description;
        } else if (Intrinsics.d(vdhVar, qdhVar)) {
            i2 = R.string.cyber_promo_tip_all_promo_description;
        } else if (Intrinsics.d(vdhVar, jdhVar)) {
            i2 = R.string.cyber_calendar_tip_event_list_new_description;
        } else {
            if (!Intrinsics.d(vdhVar, pdhVar)) {
                t9f.b();
                return null;
            }
            i2 = R.string.cyber_partners_tip_partner_description;
        }
        return new yoq0(i, i2, idhVar.b, true);
    }

    public static final yoq0 D(jrs jrsVar) {
        int i;
        int i2;
        krs krsVar = krs.b;
        krs krsVar2 = krs.d;
        krs krsVar3 = krs.f18783a;
        jrsVar.getClass();
        krs krsVar4 = jrsVar.f17019a;
        krs krsVar5 = krs.c;
        if (Intrinsics.d(krsVar4, krsVar5)) {
            i = R.string.new_markets_categories;
        } else if (Intrinsics.d(krsVar4, krsVar3)) {
            i = R.string.broadcasts;
        } else if (Intrinsics.d(krsVar4, krsVar2)) {
            i = R.string.simulation_tips_title;
        } else {
            if (!Intrinsics.d(krsVar4, krsVar)) {
                t9f.b();
                return null;
            }
            i = R.string.cards_info_settings_tips_title;
        }
        if (Intrinsics.d(krsVar4, krsVar5)) {
            i2 = R.string.markets_grouped_by_categories;
        } else if (Intrinsics.d(krsVar4, krsVar3)) {
            i2 = R.string.moved_broadcasts_to_the_info;
        } else if (Intrinsics.d(krsVar4, krsVar2)) {
            i2 = R.string.simulation_tips_description;
        } else {
            if (!Intrinsics.d(krsVar4, krsVar)) {
                t9f.b();
                return null;
            }
            i2 = R.string.cards_info_settings_tips_description;
        }
        return new yoq0(i, i2, jrsVar.b, false);
    }

    public static final yoq0 E(oh00 oh00Var) {
        oh00Var.getClass();
        ph00 ph00Var = oh00Var.f25242a;
        ph00 ph00Var2 = ph00.f26974a;
        if (!Intrinsics.d(ph00Var, ph00Var2)) {
            t9f.b();
            return null;
        }
        if (Intrinsics.d(ph00Var, ph00Var2)) {
            return new yoq0(R.string.section_live_casino, R.string.section_live_description_onboarding, oh00Var.b, true);
        }
        t9f.b();
        return null;
    }

    public static final yoq0 F(q650 q650Var) {
        int i;
        int i2;
        q650Var.getClass();
        t650 t650Var = q650Var.f28185a;
        s650 s650Var = s650.f31687a;
        boolean zD = Intrinsics.d(t650Var, s650Var);
        r650 r650Var = r650.f29919a;
        if (zD) {
            i = R.string.onboarding_section_navigation;
        } else {
            if (!Intrinsics.d(t650Var, r650Var)) {
                t9f.b();
                return null;
            }
            i = R.string.section_my_casino;
        }
        if (Intrinsics.d(t650Var, s650Var)) {
            i2 = R.string.section_navigation_description_onboarding;
        } else {
            if (!Intrinsics.d(t650Var, r650Var)) {
                t9f.b();
                return null;
            }
            i2 = R.string.section_my_casino_description_onboarding;
        }
        return new yoq0(i, i2, q650Var.b, true);
    }

    public static final yoq0 G(bhb0 bhb0Var) {
        int i;
        int i2;
        bhb0Var.getClass();
        jhb0 jhb0Var = bhb0Var.f2597a;
        int iOrdinal = jhb0Var.ordinal();
        if (iOrdinal == 0) {
            i = R.string.personalization_update_top_title;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            i = R.string.personalization_fixed_order_title;
        }
        int iOrdinal2 = jhb0Var.ordinal();
        if (iOrdinal2 == 0) {
            i2 = R.string.personalization_update_top_description;
        } else {
            if (iOrdinal2 != 1) {
                t9f.b();
                return null;
            }
            i2 = R.string.personalization_fixed_order_description;
        }
        return new yoq0(i, i2, bhb0Var.b, true);
    }

    public static final yoq0 H(pdj0 pdj0Var) {
        int i;
        int i2;
        qdj0 qdj0Var = qdj0.c;
        qdj0 qdj0Var2 = qdj0.b;
        pdj0Var.getClass();
        qdj0 qdj0Var3 = pdj0Var.f26810a;
        qdj0 qdj0Var4 = qdj0.f28537a;
        if (Intrinsics.d(qdj0Var3, qdj0Var4)) {
            i = R.string.settings_tips_account_managing_title;
        } else if (Intrinsics.d(qdj0Var3, qdj0Var2)) {
            i = R.string.settings_acquaintance_tips_single_promo_section_title;
        } else {
            if (!Intrinsics.d(qdj0Var3, qdj0Var)) {
                t9f.b();
                return null;
            }
            i = R.string.settings_tips_single_section_title;
        }
        if (Intrinsics.d(qdj0Var3, qdj0Var4)) {
            i2 = R.string.settings_tips_account_managing_desc;
        } else if (Intrinsics.d(qdj0Var3, qdj0Var2)) {
            i2 = R.string.settings_tips_single_promo_section_desc;
        } else {
            if (!Intrinsics.d(qdj0Var3, qdj0Var)) {
                t9f.b();
                return null;
            }
            i2 = R.string.settings_tips_single_section_desc_new;
        }
        return new yoq0(i, i2, pdj0Var.b, false);
    }

    public static final yoq0 I(lrn0 lrn0Var) {
        int i;
        int i2;
        lrn0Var.getClass();
        ern0 ern0Var = lrn0Var.f20542a;
        crn0 crn0Var = crn0.f4853a;
        boolean zD = Intrinsics.d(ern0Var, crn0Var);
        brn0 brn0Var = brn0.f3087a;
        drn0 drn0Var = drn0.f6570a;
        if (zD) {
            i = R.string.swipe_x_onboarding_title_third_page;
        } else if (Intrinsics.d(ern0Var, drn0Var)) {
            i = R.string.swipe_x_onboarding_title_second_page;
        } else {
            if (!Intrinsics.d(ern0Var, brn0Var)) {
                t9f.b();
                return null;
            }
            i = R.string.swipe_x_onboarding_title;
        }
        ern0 ern0Var2 = lrn0Var.f20542a;
        if (Intrinsics.d(ern0Var2, crn0Var)) {
            i2 = R.string.swipe_x_onboarding_description_third_page;
        } else if (Intrinsics.d(ern0Var2, drn0Var)) {
            i2 = R.string.swipe_x_onboarding_description_second_page;
        } else {
            if (!Intrinsics.d(ern0Var2, brn0Var)) {
                t9f.b();
                return null;
            }
            i2 = R.string.swipe_x_onboarding_description;
        }
        return new yoq0(i, i2, lrn0Var.b, true);
    }

    public static final yoq0 J(r4p0 r4p0Var) {
        int i;
        int i2;
        r4p0Var.getClass();
        v4p0 v4p0Var = r4p0Var.f29848a;
        u4p0 u4p0Var = u4p0.f35062a;
        boolean zEquals = v4p0Var.equals(u4p0Var);
        s4p0 s4p0Var = s4p0.f31619a;
        t4p0 t4p0Var = t4p0.f33332a;
        if (zEquals) {
            i = R.string.team_screen;
        } else if (v4p0Var.equals(t4p0Var)) {
            i = R.string.team_bet_onboarding_notifications_title;
        } else {
            if (!v4p0Var.equals(s4p0Var)) {
                t9f.b();
                return null;
            }
            i = R.string.team_bet_onboarding_express_title;
        }
        if (v4p0Var.equals(u4p0Var)) {
            i2 = R.string.team_bet_onboarding_team_screen_description;
        } else if (v4p0Var.equals(t4p0Var)) {
            i2 = R.string.team_bet_onboarding_notifications_description;
        } else {
            if (!v4p0Var.equals(s4p0Var)) {
                t9f.b();
                return null;
            }
            i2 = R.string.team_bet_onboarding_express_description;
        }
        return new yoq0(i, i2, r4p0Var.b, true);
    }

    public static final yoq0 K(sur0 sur0Var) {
        sur0Var.getClass();
        tur0 tur0Var = sur0Var.f32836a;
        tur0 tur0Var2 = tur0.f34564a;
        if (!Intrinsics.d(tur0Var, tur0Var2)) {
            t9f.b();
            return null;
        }
        if (Intrinsics.d(tur0Var, tur0Var2)) {
            return new yoq0(R.string.toto_onboarding_title, R.string.toto_onboarding_description, sur0Var.b, true);
        }
        t9f.b();
        return null;
    }

    public static final xrt0 L(kst0 kst0Var) {
        kst0Var.getClass();
        String str = kst0Var.c;
        String str2 = kst0Var.f18833a;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -435909436) {
                if (iHashCode != 1803162211) {
                    if (iHashCode == 2021122027 && str.equals("Client")) {
                        if (str2 == null) {
                            jf4.k(null);
                            return null;
                        }
                        String str3 = kst0Var.b;
                        if (str3 != null) {
                            return new srt0(str2, str3);
                        }
                        jf4.k(null);
                        return null;
                    }
                } else if (str.equals("OperatorBot")) {
                    if (str2 != null) {
                        return new vrt0(str2);
                    }
                    jf4.k(null);
                    return null;
                }
            } else if (str.equals("Operator")) {
                if (str2 == null) {
                    jf4.k(null);
                    return null;
                }
                String str4 = kst0Var.d;
                if (str4 == null) {
                    str4 = "";
                }
                return new urt0(str2, str4, kst0Var.e);
            }
        }
        if (str2 != null) {
            return new wrt0(str2);
        }
        jf4.k(null);
        return null;
    }

    public static final void a(mm40 mm40Var, String str, ggm ggmVar, v3n v3nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(130992667);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(ggmVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(v3nVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = (i2 >> 3) & 896;
            f(new x7z(1.0f, true), ggmVar == ggm.b || ggmVar == ggm.d, v3nVar, fetVar, i3);
            xbc.t(((i2 << 3) & 896) | ((i2 >> 6) & 112), v3nVar, fetVar, null, str);
            f(new x7z(1.0f, true), ggmVar == ggm.f11256a || ggmVar == ggm.d, v3nVar, fetVar, i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new clw(mm40Var, str, ggmVar, v3nVar, i, (byte) 1);
        }
    }

    public static final void b(mm40 mm40Var, o3w o3wVar, fet fetVar, int i) {
        o3w o3wVar2;
        byte b;
        fet fetVar2 = fetVar;
        o3wVar.getClass();
        String str = o3wVar.f24605a;
        fetVar2.g0(947025963);
        byte b2 = 4;
        byte b3 = 16;
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(o3wVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = fetVar2.g(str + "FULL_ROTATE_REMEMBER_ID");
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = xf0.c(0.0f);
                fetVar2.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Object[] objArr = {ohs0.n(str, "FULL_TURN_OVER_REMEMBER_ID")};
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new fno0(b2);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP2, fetVar2, 48);
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.booleanValue();
            boolean zI = fetVar2.i(t33Var) | fetVar2.g(pz40Var);
            Object objP3 = fetVar2.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new lcd(t33Var, pz40Var, null, (byte) 3);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, bool, (Function2) objP3);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zD = fetVar2.d(8.0f) | fetVar2.f(separator60);
            Object objP4 = fetVar2.P();
            if (zD || objP4 == cl5Var) {
                objP4 = new r2a0(b3, separator60);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarK = s5x0.K(rq8.K(mm40VarD, (Function1) objP4), 8.0f, 6.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean zG2 = fetVar2.g(pz40Var);
            Object objP5 = fetVar2.P();
            if (zG2 || objP5 == cl5Var) {
                objP5 = new zhl0(pz40Var, (byte) 13);
                fetVar2.o0(objP5);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, null, null, false, null, (Function0) objP5, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            v8q0.a(o3wVar.b, ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.l(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 0, 0, 131068);
            dww.c(a8k0.F(R.drawable.accordion_drawable_down, 0, fetVar), null, a8k0.I(o7k0.n(jm40Var, 16.0f), ((Number) t33Var.d()).floatValue()), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            b = 1;
            fetVar.r(true);
            o3wVar2 = o3wVar;
            b34.e(y5d.f42040a, ((Boolean) pz40Var.getValue()).booleanValue(), null, null, null, null, u1c.M(-903093731, new jcd(o3wVar2, b), fetVar), fetVar, 1572870, 30);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            o3wVar2 = o3wVar;
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kcd(mm40Var, o3wVar2, i, b);
        }
    }

    public static final void c(mm40 mm40Var, lzr0 lzr0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        long jM126getWhite200d7_KjU;
        mm40 mm40VarK;
        zx7 zx7Var;
        lzr0Var.getClass();
        nzr0 nzr0Var = lzr0Var.f20919a;
        function1.getClass();
        fetVar.g0(-165558190);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(lzr0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.u(mm40Var, 26.0f, 0.0f, 2), 26.0f);
            int iOrdinal = nzr0Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-187613959);
                jM126getWhite200d7_KjU = afn0.p(fetVar).m126getWhite200d7_KjU();
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-187620637, fetVar, false);
                }
                fetVar.e0(-187616551);
                jM126getWhite200d7_KjU = afn0.p(fetVar).m73getBlack400d7_KjU();
                fetVar.r(false);
            }
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM126getWhite200d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new xar0(function1, (byte) 7);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = fre0.Y(mm40VarQ, (Function1) objP);
            int iOrdinal2 = nzr0Var.ordinal();
            if (iOrdinal2 == 0) {
                mm40VarK = s5x0.K(mm40VarY, 8.0f, 4.0f);
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return;
                }
                mm40VarK = s5x0.J(mm40VarY, 4.0f);
            }
            int iOrdinal3 = lzr0Var.c.ordinal();
            if (iOrdinal3 == 0) {
                zx7Var = gqw0.d;
            } else {
                if (iOrdinal3 != 1) {
                    t9f.b();
                    return;
                }
                zx7Var = gqw0.e;
            }
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            v8q0.a(lzr0Var.b, o2e.e0(jm40.b, "TOURNAMENT_TITLE_CELL_" + lzr0Var.b), afn0.p(fetVar).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var, lzr0Var, function1, i, (byte) 8);
        }
    }

    public static final void d(mm40 mm40Var, kzr0 kzr0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        kzr0Var.getClass();
        fetVar2.g0(-1205189673);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(kzr0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 26.0f);
            nzr0 nzr0Var = nzr0.f24387a;
            fetVar2.e0(1453906430);
            zfn zfnVar = m8m0.f21378a;
            long jM73getBlack400d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m73getBlack400d7_KjU();
            fetVar2.r(false);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 4.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = kzr0Var.f19165a;
            long jM130getWhite600d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU();
            jm40 jm40Var = jm40.b;
            lgb.v(o7k0.n(jm40Var, 16.0f), o7k0.n(jm40Var, 16.0f), str, R.drawable.ic_glyph_circle_globe, jM130getWhite600d7_KjU, gqw0.f1, fetVar2, 196608, 0);
            v8q0.a(kzr0Var.b, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, kzr0Var, i, (byte) 6);
        }
    }

    public static final void e(mm40 mm40Var, tim timVar, v3n v3nVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        float f;
        zhg0 zhg0Var;
        jm40 jm40Var2;
        fet fetVar2 = fetVar;
        timVar.getClass();
        function1.getClass();
        fetVar2.g0(-353088776);
        int i2 = i | 6 | (fetVar2.g(timVar) ? 32 : 16) | (fetVar2.g(v3nVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = timVar.a() == y6n.f42107a;
            boolean z2 = timVar.a() == y6n.b;
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarK0 = q8a.k0(o7k0.d(jm40Var3, 1.0f), enx.b);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zhg0 zhg0Var2 = zhg0.f44392a;
            if (z) {
                fetVar2.e0(-1210460588);
                if (timVar instanceof rim) {
                    fetVar2.e0(-1210404385);
                    zcl zclVar = qmk.f28987a;
                    jm40Var = jm40Var3;
                    int i3 = i2 << 3;
                    int i4 = (i3 & 7168) | (i3 & 896) | 48 | (i3 & 57344);
                    f = 1.0f;
                    zhg0Var = zhg0Var2;
                    mbc.u(zhg0Var2.a(1.0f, s5x0.N(jm40Var, 0.0f, 8.0f, 8.0f, 8.0f, 1), true), nfo.f23446a, (rim) timVar, v3nVar, function1, fetVar2, i4);
                    fetVar2.r(false);
                    fetVar2 = fetVar2;
                } else {
                    jm40Var = jm40Var3;
                    f = 1.0f;
                    zhg0Var = zhg0Var2;
                    if (!(timVar instanceof sim)) {
                        throw b1j.f(1900615534, fetVar2, false);
                    }
                    fetVar2.e0(-1209686456);
                    zcl zclVar2 = qmk.f28987a;
                    fetVar2 = fetVar2;
                    qcc.o(zhg0Var.a(1.0f, s5x0.N(jm40Var, 0.0f, 8.0f, 8.0f, 8.0f, 1), true), nfo.f23446a, ((sim) timVar).b, v3nVar, fetVar2, ((i2 << 3) & 7168) | 48);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var3;
                f = 1.0f;
                zhg0Var = zhg0Var2;
                fetVar2.e0(-1209064720);
                qxw.o(fetVar2, zhg0Var.a(1.0f, jm40Var, true));
                fetVar2.r(false);
            }
            int i5 = i2 << 3;
            int i6 = i5 & 7168;
            jm40 jm40Var4 = jm40Var;
            a(jm40Var4, timVar.c(), timVar.b(), v3nVar, fetVar2, i6 | 6);
            fet fetVar3 = fetVar2;
            if (z2) {
                fetVar3.e0(-1208686892);
                if (timVar instanceof rim) {
                    fetVar3.e0(-1208630689);
                    zcl zclVar3 = qmk.f28987a;
                    jm40Var2 = jm40Var4;
                    mbc.u(zhg0Var.a(f, s5x0.N(jm40Var4, 8.0f, 8.0f, 0.0f, 8.0f, 4), true), nfo.b, (rim) timVar, v3nVar, function1, fetVar3, (i5 & 896) | 48 | i6 | (i5 & 57344));
                    fetVar3.r(false);
                    fetVar2 = fetVar3;
                } else {
                    jm40Var2 = jm40Var4;
                    if (!(timVar instanceof sim)) {
                        throw b1j.f(1900672750, fetVar3, false);
                    }
                    fetVar3.e0(-1207912760);
                    zcl zclVar4 = qmk.f28987a;
                    fetVar2 = fetVar3;
                    qcc.o(zhg0Var.a(f, s5x0.N(jm40Var2, 8.0f, 8.0f, 0.0f, 8.0f, 4), true), nfo.b, ((sim) timVar).b, v3nVar, fetVar2, i6 | 48);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                jm40Var2 = jm40Var4;
                fetVar2 = fetVar3;
                fetVar2.e0(-1207291024);
                qxw.o(fetVar2, zhg0Var.a(f, jm40Var2, true));
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var2;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new blw(mm40Var2, timVar, v3nVar, function1, i, (byte) 1);
        }
    }

    public static final void f(mm40 mm40Var, boolean z, v3n v3nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1753351011);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(v3nVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, i120.Q(o7k0.s(mm40Var, z ? 1.0f : 0.0f), v3nVar.b().f(fetVar), jd8.n));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx((Object) mm40Var, z, (Object) v3nVar, i, (byte) 13);
        }
    }

    public static final void g(lc00 lc00Var, utp0 utp0Var, m9s m9sVar) {
        String str;
        String str2;
        String str3;
        String str4 = utp0Var.b;
        String str5 = utp0Var.f36265a;
        m9sVar.getClass();
        List list = utp0Var.e;
        int size = list.size();
        String str6 = "";
        if (1 <= size && size < 10) {
            lc00Var.add(new psv("TEKKEN_HEADER_KEY", R.string.round_statistics));
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((ytp0) it.next()).f43232a));
            }
            lc00Var.add(new g8o0(arrayList));
            String str7 = utp0Var.c;
            if (!kotlin.text.c.x(str7, ujn.h, false)) {
                if (str7.length() != 0) {
                    List list2 = u0d.f34849a;
                    if (!u0d.c(str7)) {
                        str7 = String.format(Locale.ENGLISH, StringsKt.O(str7, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str7}, 2));
                    }
                }
                str7 = "";
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ytp0) it2.next()).c.equals(str5) ? "1" : "0");
            }
            lc00Var.add(new j8o0(R.drawable.cybergame_synthetic_tekken_first_bg, "TEKKEN_FIRST_TEAM_KEY", str5, str7, arrayList2));
            String str8 = utp0Var.d;
            if (kotlin.text.c.x(str8, ujn.h, false)) {
                str3 = str8;
            } else {
                if (str8.length() != 0) {
                    List list3 = u0d.f34849a;
                    if (!u0d.c(str8)) {
                        str6 = String.format(Locale.ENGLISH, StringsKt.O(str8, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str8}, 2));
                    }
                }
                str3 = str6;
            }
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ytp0) it3.next()).c.equals(str4) ? "1" : "0");
            }
            lc00Var.add(new j8o0(R.drawable.cybergame_synthetic_tekken_second_bg, "TEKKEN_SECOND_TEAM_KEY", str4, str3, arrayList3));
            return;
        }
        qqs qqsVar = m9sVar.h;
        List list4 = qqsVar.c;
        int size2 = qqsVar.c.size();
        if (1 > size2 || size2 >= 10) {
            return;
        }
        lc00Var.add(new psv("TEKKEN_HEADER_KEY", R.string.round_statistics));
        ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((ve90) it4.next()).f37273a);
        }
        lc00Var.add(new g8o0(arrayList4));
        String str9 = m9sVar.i;
        String str10 = (String) CollectionsKt.firstOrNull(m9sVar.m);
        if (str10 == null) {
            str10 = "";
        }
        if (kotlin.text.c.x(str10, ujn.h, false)) {
            str = str10;
        } else {
            if (str10.length() != 0) {
                List list5 = u0d.f34849a;
                if (!u0d.c(str10)) {
                    str10 = String.format(Locale.ENGLISH, StringsKt.O(str10, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str10}, 2));
                    str = str10;
                }
            }
            str = "";
        }
        ArrayList arrayList5 = new ArrayList(r3d.q(list4, 10));
        Iterator it5 = list4.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((ve90) it5.next()).b);
        }
        lc00Var.add(new j8o0(R.drawable.cybergame_synthetic_tekken_first_bg, "TEKKEN_FIRST_TEAM_KEY", str9, str, arrayList5));
        String str11 = m9sVar.j;
        String str12 = (String) CollectionsKt.firstOrNull(m9sVar.n);
        if (str12 == null) {
            str12 = "";
        }
        if (kotlin.text.c.x(str12, ujn.h, false)) {
            str2 = str12;
        } else {
            if (str12.length() != 0) {
                List list6 = u0d.f34849a;
                if (!u0d.c(str12)) {
                    str6 = String.format(Locale.ENGLISH, StringsKt.O(str12, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str12}, 2));
                }
            }
            str2 = str6;
        }
        ArrayList arrayList6 = new ArrayList(r3d.q(list4, 10));
        Iterator it6 = list4.iterator();
        while (it6.hasNext()) {
            arrayList6.add(((ve90) it6.next()).c);
        }
        lc00Var.add(new j8o0(R.drawable.cybergame_synthetic_tekken_second_bg, "TEKKEN_SECOND_TEAM_KEY", str11, str2, arrayList6));
    }

    public static ArrayList h(tns0 tns0Var) {
        tns0Var.getClass();
        List listC = kotlin.collections.a.c(tns0Var);
        List list = tns0Var.h;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((tns0) it.next()));
        }
        return CollectionsKt.q0(listC, r3d.r(arrayList));
    }

    public static final void i(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(Separators.QUESTION);
            if (i2 < i - 1) {
                sb.append(Separators.COMMA);
            }
        }
    }

    public static final long j(qtv0 qtv0Var) {
        qtv0Var.getClass();
        if (qtv0Var instanceof ptv0) {
            long j = ((ptv0) qtv0Var).f27584a;
            if (j != 16) {
                return j;
            }
            pz40 pz40Var = s6t0.f31722a;
            return s6t0.b().f33626a.getSeparator();
        }
        if (qtv0Var.equals(otv0.f25849a)) {
            pz40 pz40Var2 = s6t0.f31722a;
            return StaticColors.INSTANCE.m129getWhite400d7_KjU();
        }
        t9f.b();
        return 0L;
    }

    public static final String k(String str, List list, List list2) {
        Object next;
        Object next2;
        list.getClass();
        list2.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            String str2 = (String) obj;
            if (str2.length() > 0 && !str2.equals("0")) {
                arrayList.add(obj);
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            f2h f2hVar = (f2h) next;
            if (f2hVar.f8812a.length() > 0 && arrayList.contains(f2hVar.f8812a)) {
                break;
            }
        }
        f2h f2hVar2 = (f2h) next;
        if (f2hVar2 == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                f2h f2hVar3 = (f2h) next2;
                if (f2hVar3.c.length() > 0 && kotlin.text.c.o(f2hVar3.c, str)) {
                    break;
                }
            }
            f2hVar2 = (f2h) next2;
        }
        String str3 = f2hVar2 != null ? f2hVar2.d : null;
        return str3 == null ? "" : str3;
    }

    public static int l(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static final List m(ljg ljgVar) {
        ljgVar.getClass();
        return q3d.j(ljgVar.b, ljgVar.c);
    }

    public static ColorStateList n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (r(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i != 2) {
                if (i >= 28 && i <= 31) {
                    return ColorStateList.valueOf(typedValue.data);
                }
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = b5d.f1998a;
                try {
                    return b5d.a(resources, resources.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    return null;
                }
            }
            v4i0.j(typedValue, "Failed to resolve attribute at index 1: ");
        }
        return null;
    }

    public static zz2 o(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        zz2 zz2VarG;
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new zz2((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                zz2VarG = zz2.g(typedArray.getResourceId(i, 0), theme, typedArray.getResources());
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                zz2VarG = null;
            }
            if (zz2VarG != null) {
                return zz2VarG;
            }
        }
        return new zz2((Shader) null, (ColorStateList) null, 0);
    }

    public static int p(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !r(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static String q(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final vh0 v(gza0 gza0Var) {
        gza0Var.getClass();
        return new vh0(gza0Var.f12173a, gza0Var.b, "", "", 0, 0L, 0L, 0L, false, false, "", gza0Var.c, gza0Var.e, gza0Var.f);
    }

    public static final csr w(s9v0 s9v0Var) {
        s9v0Var.getClass();
        esr esrVarT = eeq.T(s9v0Var.b);
        Long l = s9v0Var.c;
        long jLongValue = l != null ? l.longValue() : 0L;
        Double d = s9v0Var.e;
        bsr bsrVar = new bsr(esrVarT, jLongValue, d != null ? d.doubleValue() : 0.0d);
        String str = s9v0Var.d;
        if (str == null) {
            str = "";
        }
        return new csr(bsrVar, str, dsr.b, 0L);
    }

    public static final yoq0 x(qf1 qf1Var) {
        int i;
        int i2;
        qf1Var.getClass();
        vf1 vf1Var = qf1Var.f28607a;
        uf1 uf1Var = uf1.f35557a;
        boolean zD = Intrinsics.d(vf1Var, uf1Var);
        sf1 sf1Var = sf1.f32097a;
        rf1 rf1Var = rf1.f30364a;
        tf1 tf1Var = tf1.f33845a;
        if (zD) {
            i = R.string.onboarding_aggregator_promo_title_competitions;
        } else if (Intrinsics.d(vf1Var, tf1Var)) {
            i = R.string.onboarding_aggregator_promo_title_bonuses;
        } else if (Intrinsics.d(vf1Var, rf1Var)) {
            i = R.string.onboarding_aggregator_promo_title_promocode;
        } else {
            if (!Intrinsics.d(vf1Var, sf1Var)) {
                t9f.b();
                return null;
            }
            i = R.string.onboarding_aggregator_promo_title_benefits;
        }
        if (Intrinsics.d(vf1Var, uf1Var)) {
            i2 = R.string.onboarding_aggregator_promo_descriptions_competitions;
        } else if (Intrinsics.d(vf1Var, tf1Var)) {
            i2 = R.string.onboarding_aggregator_promo_descriptions_bonuses;
        } else if (Intrinsics.d(vf1Var, rf1Var)) {
            i2 = R.string.onboarding_aggregator_promo_descriptions_promocode;
        } else {
            if (!Intrinsics.d(vf1Var, sf1Var)) {
                t9f.b();
                return null;
            }
            i2 = R.string.onboarding_aggregator_promo_descriptions_benefits;
        }
        return new yoq0(i, i2, qf1Var.b, true);
    }

    public static final yoq0 y(jp1 jp1Var) {
        jp1Var.getClass();
        kp1 kp1Var = jp1Var.f16878a;
        kp1 kp1Var2 = kp1.f18655a;
        if (!Intrinsics.d(kp1Var, kp1Var2)) {
            t9f.b();
            return null;
        }
        if (Intrinsics.d(kp1Var, kp1Var2)) {
            return new yoq0(R.string.section_slots, R.string.section_slots_description_onboarding, jp1Var.b, true);
        }
        t9f.b();
        return null;
    }

    public static final yoq0 z(ez1 ez1Var) {
        int i;
        int i2;
        ez1Var.getClass();
        hz1 hz1Var = ez1Var.f8650a;
        fz1 fz1Var = fz1.f10386a;
        boolean zD = Intrinsics.d(hz1Var, fz1Var);
        gz1 gz1Var = gz1.f12157a;
        if (zD) {
            i = R.string.tournaments;
        } else {
            if (!Intrinsics.d(hz1Var, gz1Var)) {
                t9f.b();
                return null;
            }
            i = R.string.referee_tour;
        }
        if (Intrinsics.d(hz1Var, fz1Var)) {
            i2 = R.string.tournaments_description_onboarding;
        } else {
            if (!Intrinsics.d(hz1Var, gz1Var)) {
                t9f.b();
                return null;
            }
            i2 = R.string.referee_tour_description_onboarding;
        }
        return new yoq0(i, i2, ez1Var.b, true);
    }

    public Task M(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        zcw0 zcw0Var;
        boolean z;
        ikt0 ikt0Var = new ikt0();
        ikt0Var.f14945a = this;
        synchronized (firebaseAuth) {
            zcw0Var = firebaseAuth.j;
        }
        if (zcw0Var != null) {
            synchronized (zcw0Var.f44186a) {
                try {
                    jiw0 jiw0Var = (jiw0) zcw0Var.c;
                    z = jiw0Var != null && jiw0Var.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                return zcw0Var.c(str, Boolean.FALSE, recaptchaAction).continueWithTask(ikt0Var).continueWithTask(new h0q0(str, zcw0Var, recaptchaAction, ikt0Var));
            }
        }
        Task taskN = N(null);
        fht0 fht0Var = new fht0();
        fht0Var.f9559a = recaptchaAction;
        fht0Var.b = firebaseAuth;
        fht0Var.c = str;
        fht0Var.d = ikt0Var;
        return taskN.continueWithTask(fht0Var);
    }

    public abstract Task N(String str);

    public abstract void t(int i);

    public abstract void u(Typeface typeface, boolean z);
}
