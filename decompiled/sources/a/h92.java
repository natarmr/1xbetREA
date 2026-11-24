package a;

import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;
import org.xplatform.cyber.game.lol.api.LolScreenParams;
import org.xplatform.cyber.game.universal.api.EsportsUniversalScreenParams;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;
import org.xplatform.special_event.impl.main.presentation.model.SpecialEventTabs;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h92 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12656a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ h92(pru pruVar, f7u f7uVar, n4u n4uVar, vzg0 vzg0Var, RegistrationDefaultScreenParams registrationDefaultScreenParams, rqt rqtVar, lbu lbuVar, bzt bztVar, g2v g2vVar) {
        this.f12656a = (byte) 8;
        this.c = pruVar;
        this.d = f7uVar;
        this.e = n4uVar;
        this.h = vzg0Var;
        this.f = registrationDefaultScreenParams;
        this.i = lbuVar;
        this.g = bztVar;
        this.b = g2vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        gps zosVar;
        gps zosVar2;
        gps zosVar3;
        byte b = this.f12656a;
        Object obj = this.b;
        Object obj2 = this.g;
        Object obj3 = this.i;
        Object obj4 = this.f;
        Object obj5 = this.h;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                hpk0 hpk0Var = (hpk0) obj2;
                vzg0 vzg0Var = (vzg0) obj5;
                lbu lbuVar = (lbu) obj3;
                r9u r9uVar = (r9u) obj;
                sff0 sff0VarA = ((pru) obj8).a();
                boolean zL = ((svu) obj7).l();
                boolean zF = ((rrc) ((g2v) obj6).f10580a).F();
                lok0 lok0VarA = ((kuu) obj4).a(hpk0Var.f13447a);
                ArrayList arrayListQ0 = CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(lok0VarA.j, lok0VarA.k), lok0VarA.l), lok0VarA.m);
                if (arrayListQ0.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = arrayListQ0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                        } else if (((Number) it.next()).intValue() == 10) {
                            z = true;
                        }
                    }
                }
                e92 e92Var = new e92(hpk0Var.c);
                b92 b92Var = new b92(hpk0Var.f13447a, hpk0Var.c, zL, lok0VarA, zF, false, sff0VarA.J1, z);
                SpecialEventTabs specialEventTabs = (SpecialEventTabs) vzg0Var.a("SELECTED_TAB_POSITION_KEY");
                if (specialEventTabs == null) {
                    specialEventTabs = SpecialEventTabs.SCHEDULE;
                }
                List listC = kotlin.collections.a.c(SpecialEventTabs.SCHEDULE);
                dxh0 dxh0VarP = ufx.P(sff0VarA);
                iun iunVar = iun.f15405a;
                lwk0 lwk0Var = new lwk0(specialEventTabs, listC, dxh0VarP, iunVar, iunVar, iunVar, iunVar);
                boolean zJ = lbuVar.j();
                long j = lok0VarA.c;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new d92(e92Var, b92Var, lwk0Var, iunVar, zJ, wi50.f39198a, null, j, 0L, null, j1q0Var.f15748a.d(ygpVar));
            case 1:
                zri zriVar = (zri) obj8;
                wyu wyuVar = (wyu) obj7;
                r9u r9uVar2 = (r9u) obj;
                zlt0 zlt0Var = (zlt0) obj6;
                reu reuVar = (reu) obj4;
                ctf0 ctf0Var = (ctf0) obj2;
                iqt iqtVar = (iqt) obj5;
                lk5 lk5Var = (lk5) obj3;
                char c = h97.A((wyu) zriVar.b, uaq0.f35345a) ? 'l' : 'd';
                md5 md5Var = new md5(((ntu) zriVar.c).a() + "/static/img/android/BottomBet/backgrounds/betconstructor/en/01-" + c + ".png", !s9m0.j(wyuVar.a()) ? R.drawable.bet_game_info_dark_them_bg : R.drawable.bet_game_info_light_theme_bg);
                ygp ygpVar2 = ygp.t;
                r9uVar2.getClass();
                j1q0 j1q0Var2 = r9uVar2.f30104a;
                j1q0Var2.getClass();
                my6 my6Var = new my6(md5Var, new j580("", "", j1q0Var2.f15748a.d(ygpVar2)), new kur(new ww20(""), new j43("", "", c0d.f3518a, false)));
                bn5 bn5Var = new bn5(new ke("", ""), false, new ql5(0L, 0.0d, false, false, 0L, "", "", 0, txs0.b, "", "", false, ""), true);
                ex6 ex6Var = new ex6(new a8q0("", 0L, 6), new ww6(-1.0d, 0.0d, 1.0d, -1.0d, -1.0d, "", false, new qz4(9.99999999999999E12d, zlt0Var.j()), true, false, false, true, true));
                boolean z2 = reuVar.c().f24244a;
                lsm0 lsm0Var = ctf0Var.b;
                lsm0 lsm0Var2 = ctf0Var.b;
                return new c820(my6Var, do7.f6402a, bn5Var, new svj0(ex6Var, new nnb0(true, lsm0Var2.a(reuVar.c().f24244a ? R.string.summary_possible_win : R.string.history_possible_win, Arrays.copyOf(new Object[0], 0)), ""), new lwo0(0.0d, lsm0Var.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), iun.f15405a, z2, true)), new jfc0(new azc0(androidx.compose.runtime.e.e(null), lsm0Var2.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), false, false, false), wyc0.b, new rlc0(0.0d, "", "", 0.0d, 0.0d, !reuVar.c().f24244a, false, false), false, false), null, iqtVar.f15225a.a(), false, false, false, true, lk5Var.c(j820.e), jg7.i);
            case 2:
                r9u r9uVar3 = (r9u) obj;
                wyu wyuVar2 = (wyu) obj5;
                BetInfoScreenModel betInfoScreenModel = (BetInfoScreenModel) obj3;
                sff0 sff0VarA2 = ((pru) obj8).a();
                gx7 gx7Var = sff0VarA2.f32117a;
                v8d v8dVarA = ((czt) obj7).f5239a.a();
                List listA = ((luu) obj6).f20692a.a();
                iun iunVar2 = iun.f15405a;
                ygp ygpVar3 = ygp.c;
                r9uVar3.getClass();
                j1q0 j1q0Var3 = r9uVar3.f30104a;
                j1q0Var3.getClass();
                m1q0 m1q0Var = j1q0Var3.f15748a;
                boolean zD = m1q0Var.d(ygpVar3);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                boolean z3 = gx7Var.b.h;
                boolean z4 = gx7Var.h;
                boolean z5 = sff0VarA2.J1;
                boolean zJ2 = ((ntu) obj4).f24118a.f15748a.j();
                boolean z6 = ((yiu) obj2).a() || sff0VarA2.O1;
                gm7 gm7Var = gx7Var.f12063a;
                return new rc7(q9x.f28370a, false, betInfoScreenModel, null, listA, w760.f38657a, iunVar2, null, iunVar2, iunVar2, z3, z4, lunVar, zD, zJ2, z5, z6, gm7Var.m, gm7Var.k, false, false, false, 0L, wyuVar2.a(), v8dVarA.T, 0L, v8dVarA.y, m1q0Var.d(ygp.t) && cy7.c());
            case 3:
                vzg0 vzg0Var2 = (vzg0) obj5;
                e1u e1uVar = (e1u) obj6;
                CyberGameDotaScreenParams cyberGameDotaScreenParams = (CyberGameDotaScreenParams) obj4;
                ctf0 ctf0Var2 = (ctf0) obj2;
                r9u r9uVar4 = (r9u) obj;
                boolean zJ3 = ((lbu) obj3).j();
                sff0 sff0VarA3 = ((pru) obj8).a();
                List listA2 = ((luu) obj7).f20692a.a();
                Boolean bool = (Boolean) vzg0Var2.a("auto_start_stream_enabled_key");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : e1uVar.f();
                gps gpsVar = (gps) vzg0Var2.a("game_request_state_key");
                if (gpsVar == null) {
                    long j2 = cyberGameDotaScreenParams.f46514a;
                    bek bekVar = sip.f32274a;
                    boolean z7 = cyberGameDotaScreenParams.b;
                    bekVar.getClass();
                    zosVar = new zos(j2, bek.f(z7), cyberGameDotaScreenParams.e);
                } else {
                    zosVar = gpsVar;
                }
                lel0.Companion.getClass();
                ypl0 ypl0Var = new ypl0(0L, "", kel0.a());
                bqr bqrVar = new bqr(0L, 0L, "");
                iun iunVar3 = iun.f15405a;
                xus xusVar = new xus("", false, -1, new owq0(iunVar3, iunVar3, false), null);
                aal aalVar = aal.TOTAL_VALUE;
                z6l z6lVar = new z6l(1L, 4L, 5L, 7L, new o4i0("", ""), iunVar3, true);
                da10 da10Var = da10.DEFAULT_ERROR;
                ArrayList arrayListW = e3c.w(e9l.f, ctf0Var2.j());
                ArrayList arrayList = new ArrayList(r3d.q(arrayListW, 10));
                Iterator it2 = arrayListW.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((e9l) it2.next()).f7427a);
                }
                iun iunVar4 = iun.f15405a;
                boolean z8 = cyberGameDotaScreenParams.f;
                ygp ygpVar4 = ygp.t;
                r9uVar4.getClass();
                j1q0 j1q0Var4 = r9uVar4.f30104a;
                j1q0Var4.getClass();
                return new f9l(cyberGameDotaScreenParams, zosVar, ilr.b, null, ypl0Var, bqrVar, xusVar, zJ3, false, z6lVar, da10Var, iunVar3, arrayList, !zJ3, false, iunVar4, sff0VarA3, listA2, false, z8, zBooleanValue, null, 0, 0, null, j1q0Var4.f15748a.d(ygpVar4));
            case 4:
                vzg0 vzg0Var3 = (vzg0) obj5;
                e1u e1uVar2 = (e1u) obj4;
                EsportsUniversalScreenParams esportsUniversalScreenParams = (EsportsUniversalScreenParams) obj2;
                svu svuVar = (svu) obj7;
                r9u r9uVar5 = (r9u) obj;
                boolean zJ4 = ((lbu) obj3).j();
                sff0 sff0VarA4 = ((pru) obj8).a();
                List listA3 = ((luu) obj6).f20692a.a();
                Boolean bool2 = (Boolean) vzg0Var3.a("auto_start_stream_enabled_key");
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : e1uVar2.f();
                gps gpsVar2 = (gps) vzg0Var3.a("game_request_state_key");
                if (gpsVar2 == null) {
                    long j3 = esportsUniversalScreenParams.f46523a;
                    bek bekVar2 = sip.f32274a;
                    boolean z9 = esportsUniversalScreenParams.b;
                    bekVar2.getClass();
                    zosVar2 = new zos(j3, bek.f(z9), esportsUniversalScreenParams.d);
                } else {
                    zosVar2 = gpsVar2;
                }
                lel0.Companion.getClass();
                ypl0 ypl0Var2 = new ypl0(0L, "", kel0.a());
                bqr bqrVar2 = new bqr(0L, 0L, "");
                iun iunVar5 = iun.f15405a;
                long j4 = esportsUniversalScreenParams.j;
                String str = esportsUniversalScreenParams.i;
                boolean z10 = esportsUniversalScreenParams.h;
                boolean zL2 = svuVar.l();
                ygp ygpVar5 = ygp.t;
                r9uVar5.getClass();
                j1q0 j1q0Var5 = r9uVar5.f30104a;
                j1q0Var5.getClass();
                return new l6o(esportsUniversalScreenParams, zosVar2, ilr.b, null, ypl0Var2, bqrVar2, new xus("", false, -1, new owq0(iunVar5, iunVar5, false), null), zJ4, false, da10.DEFAULT_ERROR, !zJ4, false, iunVar5, j4, str, sff0VarA4, listA3, false, z10, zBooleanValue2, null, null, zL2, 1L, false, j1q0Var5.f15748a.d(ygpVar5));
            case 5:
                vzg0 vzg0Var4 = (vzg0) obj5;
                e1u e1uVar3 = (e1u) obj6;
                LolScreenParams lolScreenParams = (LolScreenParams) obj4;
                ctf0 ctf0Var3 = (ctf0) obj2;
                r9u r9uVar6 = (r9u) obj;
                boolean zJ5 = ((lbu) obj3).j();
                sff0 sff0VarA5 = ((pru) obj8).a();
                List listA4 = ((luu) obj7).f20692a.a();
                Boolean bool3 = (Boolean) vzg0Var4.a("auto_start_stream_enabled_key");
                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : e1uVar3.f();
                gps gpsVar3 = (gps) vzg0Var4.a("game_request_state_key");
                if (gpsVar3 == null) {
                    long j5 = lolScreenParams.f46516a;
                    bek bekVar3 = sip.f32274a;
                    boolean z11 = lolScreenParams.b;
                    bekVar3.getClass();
                    zosVar3 = new zos(j5, bek.f(z11), lolScreenParams.e);
                } else {
                    zosVar3 = gpsVar3;
                }
                lel0.Companion.getClass();
                ypl0 ypl0Var3 = new ypl0(0L, "", kel0.a());
                bqr bqrVar3 = new bqr(0L, 0L, "");
                iun iunVar6 = iun.f15405a;
                xus xusVar2 = new xus("", false, -1, new owq0(iunVar6, iunVar6, false), null);
                x510 x510Var = x510.STATISTIC;
                g310 g310Var = new g310(1L, 3L, 5L, 7L, new o4i0("", ""), iunVar6, true);
                mz00 mz00Var = new mz00(0);
                da10 da10Var2 = da10.DEFAULT_ERROR;
                ArrayList arrayListT = efx.t(n310.g, ctf0Var3.j());
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayListT, 10));
                Iterator it3 = arrayListT.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((n310) it3.next()).f22827a);
                }
                iun iunVar7 = iun.f15405a;
                boolean z12 = lolScreenParams.f;
                ygp ygpVar6 = ygp.t;
                r9uVar6.getClass();
                j1q0 j1q0Var6 = r9uVar6.f30104a;
                j1q0Var6.getClass();
                return new m310(lolScreenParams, zosVar3, ilr.b, null, ypl0Var3, bqrVar3, xusVar2, zJ5, false, g310Var, mz00Var, da10Var2, iunVar6, arrayList2, !zJ5, false, iunVar7, sff0VarA5, listA4, false, z12, zBooleanValue3, null, null, j1q0Var6.f15748a.d(ygpVar6));
            case 6:
                zlt0 zlt0Var2 = (zlt0) obj4;
                reu reuVar2 = (reu) obj2;
                ctf0 ctf0Var4 = (ctf0) obj5;
                pru pruVar = (pru) obj8;
                iqt iqtVar2 = (iqt) obj3;
                lk5 lk5Var2 = (lk5) obj;
                ly6 ly6Var = new ly6(new ld5("", !h97.A((wyu) obj7, uaq0.f35345a) ? R.drawable.bet_game_info_dark_them_bg : R.drawable.bet_game_info_light_theme_bg), new htv(false, false, "", ((m0k0) obj6).f20959a != 40 ? R.drawable.ic_glyph_category_new : R.drawable.ic_glyph_cyber_gamepad, "", jye.INVISIBLE), new f580("", false), new jur(new tw20("", 0L), l5n0.f19467a, new j43("", "", c0d.f3518a, false), wbs0.IS_NOT_VISIBLE, fho.f9552a), new f0d("", "", false), null, false);
                an5 an5Var = new an5(new ke("", ""), false, new ql5(0L, 0.0d, false, false, 0L, "", "", 0, txs0.b, "", "", false, ""), new g40(-1.0d, e40.f7159a), true);
                dx6 dx6Var = new dx6(new a8q0("", 0L, 6), new vw6(-1.0d, 0.0d, 1.0d, -1.0d, -1.0d, "", false, false, new AutoMaxUiModel(9.99999999999999E12d, zlt0Var2.j()), true, false, false, false, true, true, false));
                boolean z13 = reuVar2.c().f24244a;
                lsm0 lsm0Var3 = ctf0Var4.b;
                lsm0 lsm0Var4 = ctf0Var4.b;
                String strA = lsm0Var3.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0));
                String strA2 = lsm0Var4.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0));
                iun iunVar8 = iun.f15405a;
                return new b820(ly6Var, co7.b, an5Var, new rvj0(dx6Var, new mnb0(true, lsm0Var4.a(reuVar2.c().f24244a ? R.string.summary_possible_win : R.string.history_possible_win, Arrays.copyOf(new Object[0], 0)), ""), new kwo0(0.0d, strA, strA2, iunVar8, z13, true), new mnd0(false, 0.0d, 0.0d, 0.0d, "", pruVar.a().f32117a.f12063a.r), null), new czc0(new tyc0(androidx.compose.runtime.e.e(null), lsm0Var4.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), false, false), yyc0.b, new qlc0(0.0d, "", "", 0.0d, 0.0d, false, false, false), false, false), new gx4(new a8q0("", 0L, 6), new xyc(new BigDecimal(String.valueOf(-1.0d)), new BigDecimal(String.valueOf(1.01d)), new BigDecimal(String.valueOf(0.1d)), new BigDecimal(String.valueOf(1.01d)), new BigDecimal("999.999"), false, false), new dx6(new a8q0("", 0L, 6), new vw6(-1.0d, 0.0d, 1.0d, -1.0d, -1.0d, "", false, false, new AutoMaxUiModel(9.99999999999999E12d, zlt0Var2.j()), true, false, false, false, true, true, false)), new kwo0(0.0d, lsm0Var4.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), iunVar8, reuVar2.c().f24244a, true), new mnb0(true, lsm0Var4.a(reuVar2.c().f24244a ? R.string.summary_possible_win : R.string.history_possible_win, Arrays.copyOf(new Object[0], 0)), "")), null, iqtVar2.f15225a.a(), false, false, false, true, lk5Var2.c(j820.f16066a));
            case 7:
                jtj jtjVar = (jtj) obj8;
                FinBetInfoModel finBetInfoModel = (FinBetInfoModel) obj7;
                wyu wyuVar3 = (wyu) obj6;
                ctf0 ctf0Var5 = (ctf0) obj4;
                reu reuVar3 = (reu) obj2;
                iqt iqtVar3 = (iqt) obj5;
                ua20 ua20Var = (ua20) obj3;
                uzc uzcVar = ((k7u) obj).f17841a;
                int i = finBetInfoModel.f46646a;
                double d = finBetInfoModel.c;
                finBetInfoModel.e.getClass();
                char c2 = h97.A((wyu) jtjVar.b, uaq0.f35345a) ? 'l' : 'd';
                kd5 kd5Var = new kd5(((ntu) jtjVar.c).a() + "/static/img/android/BottomBet/backgrounds/finbets/en/" + i + "-" + c2 + ".png", !s9m0.j(wyuVar3.a()) ? R.drawable.defolt_dark : R.drawable.defolt_light);
                int i2 = cy7.f5159a;
                String strE = cy7.e(finBetInfoModel.d);
                lsm0 lsm0Var5 = ctf0Var5.b;
                lsm0 lsm0Var6 = ctf0Var5.b;
                String strA3 = lsm0Var5.a(R.string.level, Arrays.copyOf(new Object[0], 0));
                int id = uzcVar.b().getId();
                pek pekVar = jvn.f17210a;
                pekVar.getClass();
                jvn jvnVarK = pek.k(id);
                p3u0 p3u0Var = p3u0.e;
                String strC = ahb.C(jvnVarK, d, p3u0Var);
                int id2 = uzcVar.b().getId();
                pekVar.getClass();
                j43 j43Var = new j43(strC, ahb.C(pek.k(id2), d, p3u0Var), c0d.f3518a, false);
                double d2 = finBetInfoModel.f;
                double d3 = finBetInfoModel.c;
                return new sg20(finBetInfoModel, new ky6(kd5Var, new iur(strE, strA3, j43Var, d2, d3, d3)), new ym5(new ke("", ""), false, new ql5(0L, 0.0d, false, false, 0L, "", "", 0, txs0.b, "", "", false, ""), true), bo7.f2918a, new qvj0(new cx6(new a8q0("", 0L, 6), new uw6(-1.0d, 0.0d, 1.0d, -1.0d, "", true, false, true, false, false, true, true, true)), new lnb0(true, lsm0Var6.a(R.string.history_possible_win, Arrays.copyOf(new Object[0], 0)), ""), new jwo0(0.0d, lsm0Var6.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), iun.f15405a, reuVar3.c().f24244a, true), new d0d(d, 0.0d)), new ifc0(new azc0(androidx.compose.runtime.e.e(null), lsm0Var6.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), false, false, false), wyc0.b, new plc0(0.0d, "", "", 0.0d, 0.0d, false, false, false), false, false, true, false), ua20Var, false, false, iqtVar3.f15225a.a(), 0);
            default:
                vzg0 vzg0Var5 = (vzg0) obj5;
                RegistrationDefaultScreenParams registrationDefaultScreenParams = (RegistrationDefaultScreenParams) obj4;
                g2v g2vVar = (g2v) obj;
                sff0 sff0VarA6 = ((pru) obj8).a();
                cne0 cne0VarP = ((f7u) obj7).p();
                ((n4u) obj6).e();
                iun iunVar9 = iun.f15405a;
                lun lunVar2 = lun.f20680a;
                lunVar2.getClass();
                return new aye0(false, true, false, iunVar9, iunVar9, lunVar2, iunVar9, q1f0.a(bdx.o0(vzg0Var5), null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, registrationDefaultScreenParams.f46869a, -1, 63), lunVar2, lunVar2, registrationDefaultScreenParams.f46869a, rqt.f(sff0VarA6.k), sff0VarA6, null, iunVar9, false, ((lbu) obj3).j(), ((bzt) obj2).f3488a.a(), null, null, null, null, null, null, null, null, cne0VarP, bdx.o0(vzg0Var5).f, g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.refresh_data, 0L, 0L, 862));
        }
    }

    public /* synthetic */ h92(lbu lbuVar, pru pruVar, luu luuVar, vzg0 vzg0Var, e1u e1uVar, Parcelable parcelable, ctf0 ctf0Var, r9u r9uVar, byte b) {
        this.f12656a = b;
        this.i = lbuVar;
        this.c = pruVar;
        this.d = luuVar;
        this.h = vzg0Var;
        this.e = e1uVar;
        this.f = parcelable;
        this.g = ctf0Var;
        this.b = r9uVar;
    }

    public /* synthetic */ h92(lbu lbuVar, pru pruVar, luu luuVar, vzg0 vzg0Var, e1u e1uVar, EsportsUniversalScreenParams esportsUniversalScreenParams, svu svuVar, r9u r9uVar) {
        this.f12656a = (byte) 4;
        this.i = lbuVar;
        this.c = pruVar;
        this.e = luuVar;
        this.h = vzg0Var;
        this.f = e1uVar;
        this.g = esportsUniversalScreenParams;
        this.d = svuVar;
        this.b = r9uVar;
    }

    public /* synthetic */ h92(pru pruVar, czt cztVar, luu luuVar, r9u r9uVar, ntu ntuVar, yiu yiuVar, wyu wyuVar, BetInfoScreenModel betInfoScreenModel) {
        this.f12656a = (byte) 2;
        this.c = pruVar;
        this.d = cztVar;
        this.e = luuVar;
        this.b = r9uVar;
        this.f = ntuVar;
        this.g = yiuVar;
        this.h = wyuVar;
        this.i = betInfoScreenModel;
    }

    public /* synthetic */ h92(zri zriVar, wyu wyuVar, r9u r9uVar, zlt0 zlt0Var, reu reuVar, ctf0 ctf0Var, iqt iqtVar, lk5 lk5Var) {
        this.f12656a = (byte) 1;
        this.c = zriVar;
        this.d = wyuVar;
        this.b = r9uVar;
        this.e = zlt0Var;
        this.f = reuVar;
        this.g = ctf0Var;
        this.h = iqtVar;
        this.i = lk5Var;
    }

    public /* synthetic */ h92(wyu wyuVar, m0k0 m0k0Var, zlt0 zlt0Var, reu reuVar, ctf0 ctf0Var, pru pruVar, iqt iqtVar, lk5 lk5Var) {
        this.f12656a = (byte) 6;
        this.d = wyuVar;
        this.e = m0k0Var;
        this.f = zlt0Var;
        this.g = reuVar;
        this.h = ctf0Var;
        this.c = pruVar;
        this.i = iqtVar;
        this.b = lk5Var;
    }

    public /* synthetic */ h92(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.f12656a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.b = obj8;
    }
}
