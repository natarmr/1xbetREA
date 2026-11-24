package a;

import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jfu f28749a;
    public final n0o0 b;
    public final n0o0 c;

    public qho(jfu jfuVar, us00 us00Var) {
        this.f28749a = jfuVar;
        final byte b = 0;
        this.b = maz.b(new Function0(this) { // from class: a.pho
            public final /* synthetic */ qho b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                qho qhoVar = this.b;
                switch (b2) {
                    case 0:
                        return qhoVar.f28749a.f16447a.a().t1;
                    default:
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Long lT0 = StringsKt.t0(qhoVar.c().b);
                        long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                        Long lT1 = StringsKt.t0(qhoVar.c().c);
                        long jLongValue2 = lT1 != null ? lT1.longValue() : 0L;
                        boolean z = false;
                        if (jLongValue <= jCurrentTimeMillis && jCurrentTimeMillis <= jLongValue2) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final byte b2 = 1;
        this.c = maz.b(new Function0(this) { // from class: a.pho
            public final /* synthetic */ qho b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                qho qhoVar = this.b;
                switch (b3) {
                    case 0:
                        return qhoVar.f28749a.f16447a.a().t1;
                    default:
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Long lT0 = StringsKt.t0(qhoVar.c().b);
                        long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                        Long lT1 = StringsKt.t0(qhoVar.c().c);
                        long jLongValue2 = lT1 != null ? lT1.longValue() : 0L;
                        boolean z = false;
                        if (jLongValue <= jCurrentTimeMillis && jCurrentTimeMillis <= jLongValue2) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    public final void a() {
        if (!((Boolean) this.c.getValue()).booleanValue() || c().f44319a == yfw.DEFAULT || c().f44319a == yfw.HALLOWEEN || c().f44319a == yfw.BLACK_FRIDAY) {
            return;
        }
        yfw yfwVar = c().f44319a;
    }

    public final int b(int i) {
        if (((Boolean) this.c.getValue()).booleanValue() && c().f44319a != yfw.DEFAULT) {
            if (c().f44319a == yfw.HALLOWEEN) {
                if (i == R.drawable.ic_glyph_popular) {
                    return R.drawable.ic_glyph_hw_popular;
                }
                if (i == R.drawable.ic_glyph_favourite_active) {
                    return R.drawable.ic_glyph_hw_favourite;
                }
                if (i == R.drawable.ic_glyph_history) {
                    return R.drawable.ic_glyph_hw_history;
                }
                if (i == R.drawable.ic_glyph_menu) {
                    return R.drawable.ic_glyph_hw_menu;
                }
                if (i == R.drawable.ic_glyph_coupon || i == R.drawable.ic_glyph_coupon_alt) {
                    return R.drawable.ic_glyph_hw_coupon;
                }
                if (i == R.drawable.ic_glyph_live) {
                    return R.drawable.ic_glyph_hw_live;
                }
                if (i == R.drawable.ic_glyph_line) {
                    return R.drawable.ic_glyph_hw_calendar;
                }
                if (i == R.drawable.ic_glyph_express) {
                    return R.drawable.ic_glyph_hw_express;
                }
                if (i == R.drawable.ic_glyph_stream) {
                    return R.drawable.ic_glyph_hw_stream;
                }
                if (i == R.drawable.ic_glyph_cyber_gamepad) {
                    return R.drawable.ic_glyph_hw_cyber;
                }
                if (i == R.drawable.ic_glyph_results) {
                    return R.drawable.ic_glyph_hw_results;
                }
                if (i == R.drawable.ic_glyph_bets_on_yours) {
                    return R.drawable.ic_glyph_hw_bets_on_yours;
                }
                if (i == R.drawable.ic_glyph_cards) {
                    return R.drawable.ic_glyph_hw_cards;
                }
                if (i == R.drawable.ic_glyph_categories) {
                    return R.drawable.ic_glyph_hw_categories;
                }
                if (i == R.drawable.ic_glyph_tournaments) {
                    return R.drawable.ic_glyph_hw_tournaments;
                }
                if (i == R.drawable.ic_glyph_promo_aggregator) {
                    return R.drawable.ic_glyph_hw_promo_aggregator;
                }
                if (i == R.drawable.ic_glyph_tv_bet) {
                    return R.drawable.ic_glyph_hw_tv_bet;
                }
                if (i == R.drawable.ic_glyph_providers) {
                    return R.drawable.ic_glyph_hw_providers;
                }
                if (i == R.drawable.ic_glyph_promo_games) {
                    return R.drawable.ic_glyph_hw_promo_games;
                }
                if (i == R.drawable.ic_glyph_cashback) {
                    return R.drawable.ic_glyph_hw_cashback;
                }
                if (i == R.drawable.ic_glyph_shopping_bag) {
                    return R.drawable.ic_glyph_hw_shopping_bag;
                }
                if (i == R.drawable.ic_glyph_toto) {
                    return R.drawable.ic_glyph_hw_toto;
                }
                if (i == R.drawable.ic_glyph_financial) {
                    return R.drawable.ic_glyph_hw_financial;
                }
                if (i == R.drawable.ic_glyph_betconstructor) {
                    return R.drawable.ic_glyph_hw_betconstructor;
                }
                if (i == R.drawable.ic_glyph_qr_scanning) {
                    return R.drawable.ic_glyph_hw_qr_scanning;
                }
                if (i == R.drawable.ic_glyph_notification_active) {
                    return R.drawable.ic_glyph_hw_notification;
                }
                if (i == R.drawable.ic_glyph_support) {
                    return R.drawable.ic_glyph_hw_support;
                }
                if (i == R.drawable.ic_glyph_info || i == R.drawable.ic_glyph_info_circle_filled) {
                    return R.drawable.ic_glyph_hw_info;
                }
                if (i == R.drawable.ic_glyph_authenticator) {
                    return R.drawable.ic_glyph_hw_authenticator;
                }
                if (i == R.drawable.ic_glyph_balloons) {
                    return R.drawable.ic_glyph_hw_events;
                }
                if (i == R.drawable.ic_glyph_top) {
                    return R.drawable.ic_glyph_hw_top;
                }
                if (i == R.drawable.ic_glyph_sport) {
                    return R.drawable.ic_glyph_hw_sport;
                }
                if (i == R.drawable.ic_glyph_games) {
                    return R.drawable.ic_glyph_hw_games;
                }
                if (i == R.drawable.ic_glyph_other) {
                    return R.drawable.ic_glyph_hw_other;
                }
                if (i == R.drawable.ic_glyph_slots) {
                    return R.drawable.ic_glyph_hw_slots;
                }
                if (i == R.drawable.ic_glyph_peak) {
                    return R.drawable.ic_glyph_hw_peak;
                }
                if (i == R.drawable.ic_glyph_circle_profile) {
                    return R.drawable.ic_glyph_hw_circle_profile;
                }
                if (i == R.drawable.ic_glyph_swipex) {
                    return R.drawable.ic_glyph_hw_1xswipe;
                }
                if (i == R.drawable.ic_glyph_cart) {
                    return R.drawable.ic_glyph_hw_cart;
                }
                if (i == R.drawable.ic_glyph_lock) {
                    return R.drawable.ic_glyph_hw_lock;
                }
                if (i == R.drawable.ic_glyph_1xlive) {
                    return R.drawable.ic_glyph_hw_1xlive;
                }
                if (i == R.drawable.ic_glyph_telegram) {
                    return R.drawable.ic_glyph_hw_telegram;
                }
                if (i == R.drawable.ic_glyph_loto) {
                    return R.drawable.ic_glyph_hw_loto;
                }
                if (i == R.drawable.ic_glyph_fast_bet) {
                    return R.drawable.ic_glyph_hw_fast_bet;
                }
                if (i == R.drawable.ic_glyph_championship_live) {
                    return R.drawable.ic_glyph_hw_championship_live;
                }
                if (i == R.drawable.ic_glyph_championship_line) {
                    return R.drawable.ic_glyph_hw_championship_line;
                }
                if (i == R.drawable.ic_glyph_champions_club) {
                    return R.drawable.ic_glyph_hw_champions_club;
                }
                if (i == R.drawable.ic_glyph_polybet) {
                    return R.drawable.ic_glyph_hw_polybet;
                }
                if (i == R.drawable.ic_glyph_team) {
                    return R.drawable.ic_glyph_hw_team;
                }
                if (i == R.drawable.ic_glyph_ufc) {
                    return R.drawable.ic_glyph_hw_ufc;
                }
                if (i == R.drawable.ic_xbet_dark) {
                    return R.drawable.ic_xbet_dark_halloween;
                }
                if (i == R.drawable.ic_xbet_light) {
                    return R.drawable.ic_xbet_light_halloween;
                }
            } else if (c().f44319a == yfw.BLACK_FRIDAY) {
                if (i == R.drawable.ic_glyph_circle_profile) {
                    return R.drawable.ic_glyph_bf_circle_profile;
                }
                if (i == R.drawable.ic_glyph_coupon || i == R.drawable.ic_glyph_coupon_alt) {
                    return R.drawable.ic_glyph_bf_coupon;
                }
                if (i == R.drawable.ic_xbet_dark) {
                    return R.drawable.ic_xbet_dark_black_friday;
                }
                if (i == R.drawable.ic_xbet_light) {
                    return R.drawable.ic_xbet_light_black_friday;
                }
            } else if (c().f44319a == yfw.HOLI) {
                if (i == R.drawable.ic_glyph_circle_profile) {
                    return R.drawable.ic_glyph_profile_circle_holi;
                }
                if (i == R.drawable.ic_glyph_coupon || i == R.drawable.ic_glyph_coupon_alt) {
                    return R.drawable.ic_glyph_coupon_holi;
                }
                if (i == R.drawable.ic_xbet_dark) {
                    return R.drawable.ic_xbet_dark_holi;
                }
                if (i == R.drawable.ic_xbet_light) {
                    return R.drawable.ic_xbet_light_holi;
                }
            } else if (c().f44319a == yfw.NEW_YEAR) {
                if (i == R.drawable.ic_glyph_popular) {
                    return R.drawable.ic_glyph_popular_ny;
                }
                if (i == R.drawable.ic_glyph_favourite_active) {
                    return R.drawable.ic_glyph_favourite_ny;
                }
                if (i == R.drawable.ic_glyph_history) {
                    return R.drawable.ic_glyph_history_ny;
                }
                if (i == R.drawable.ic_glyph_menu) {
                    return R.drawable.ic_glyph_menu_ny;
                }
                if (i == R.drawable.ic_glyph_coupon || i == R.drawable.ic_glyph_coupon_alt) {
                    return R.drawable.ic_glyph_coupon_ny;
                }
                if (i == R.drawable.ic_glyph_live) {
                    return R.drawable.ic_glyph_live_ny;
                }
                if (i == R.drawable.ic_glyph_line) {
                    return R.drawable.ic_glyph_calendar_ny;
                }
                if (i == R.drawable.ic_glyph_express) {
                    return R.drawable.ic_glyph_express_ny;
                }
                if (i == R.drawable.ic_glyph_stream) {
                    return R.drawable.ic_glyph_stream_ny;
                }
                if (i == R.drawable.ic_glyph_cyber_gamepad) {
                    return R.drawable.ic_glyph_cyber_ny;
                }
                if (i == R.drawable.ic_glyph_results) {
                    return R.drawable.ic_glyph_results_ny;
                }
                if (i == R.drawable.ic_glyph_bets_on_yours) {
                    return R.drawable.ic_glyph_bets_on_yours_ny;
                }
                if (i == R.drawable.ic_glyph_cards) {
                    return R.drawable.ic_glyph_cards_ny;
                }
                if (i == R.drawable.ic_glyph_categories) {
                    return R.drawable.ic_glyph_categories_ny;
                }
                if (i == R.drawable.ic_glyph_tournaments) {
                    return R.drawable.ic_glyph_tournaments_ny;
                }
                if (i == R.drawable.ic_glyph_promo_aggregator) {
                    return R.drawable.ic_glyph_promo_aggregator_ny;
                }
                if (i == R.drawable.ic_glyph_tv_bet) {
                    return R.drawable.ic_glyph_tv_bet_ny;
                }
                if (i == R.drawable.ic_glyph_providers) {
                    return R.drawable.ic_glyph_providers_ny;
                }
                if (i == R.drawable.ic_glyph_promo_games) {
                    return R.drawable.ic_glyph_promo_games_ny;
                }
                if (i == R.drawable.ic_glyph_cashback) {
                    return R.drawable.ic_glyph_cashback_ny;
                }
                if (i == R.drawable.ic_glyph_shopping_bag) {
                    return R.drawable.ic_glyph_shopping_bag_ny;
                }
                if (i == R.drawable.ic_glyph_toto) {
                    return R.drawable.ic_glyph_toto_ny;
                }
                if (i == R.drawable.ic_glyph_financial) {
                    return R.drawable.ic_glyph_financial_ny;
                }
                if (i == R.drawable.ic_glyph_betconstructor) {
                    return R.drawable.ic_glyph_betconstructor_ny;
                }
                if (i == R.drawable.ic_glyph_qr_scanning) {
                    return R.drawable.ic_glyph_qr_scanning_ny;
                }
                if (i == R.drawable.ic_glyph_notification_active) {
                    return R.drawable.ic_glyph_notification_ny;
                }
                if (i == R.drawable.ic_glyph_support) {
                    return R.drawable.ic_glyph_support_ny;
                }
                if (i == R.drawable.ic_glyph_info || i == R.drawable.ic_glyph_info_circle_filled) {
                    return R.drawable.ic_glyph_info_ny;
                }
                if (i == R.drawable.ic_glyph_authenticator) {
                    return R.drawable.ic_glyph_authenticator_ny;
                }
                if (i == R.drawable.ic_glyph_balloons) {
                    return R.drawable.ic_glyph_events_ny;
                }
                if (i == R.drawable.ic_glyph_top) {
                    return R.drawable.ic_glyph_top_ny;
                }
                if (i == R.drawable.ic_glyph_sport) {
                    return R.drawable.ic_glyph_sport_ny;
                }
                if (i == R.drawable.ic_glyph_games) {
                    return R.drawable.ic_glyph_games_ny;
                }
                if (i == R.drawable.ic_glyph_other) {
                    return R.drawable.ic_glyph_other_ny;
                }
                if (i == R.drawable.ic_glyph_slots) {
                    return R.drawable.ic_glyph_slots_ny;
                }
                if (i == R.drawable.ic_glyph_peak) {
                    return R.drawable.ic_glyph_peak_ny;
                }
                if (i == R.drawable.ic_glyph_circle_profile) {
                    return R.drawable.ic_glyph_circle_profile_ny;
                }
                if (i == R.drawable.ic_glyph_swipex) {
                    return R.drawable.ic_glyph_1xswipe_ny;
                }
                if (i == R.drawable.ic_glyph_cart) {
                    return R.drawable.ic_glyph_cart_ny;
                }
                if (i == R.drawable.ic_glyph_champions_club) {
                    return R.drawable.ic_glyph_champions_club_ny;
                }
                if (i == R.drawable.ic_glyph_polybet) {
                    return R.drawable.ic_glyph_polybet_ny;
                }
                if (i == R.drawable.ic_glyph_team) {
                    return R.drawable.ic_glyph_team_ny;
                }
                if (i == R.drawable.ic_glyph_ufc) {
                    return R.drawable.ic_glyph_ufc_ny;
                }
                if (i == R.drawable.ic_glyph_lock) {
                    return R.drawable.ic_glyph_lock_ny;
                }
                if (i == R.drawable.ic_glyph_fast_bet) {
                    return R.drawable.ic_glyph_fast_bet_ny;
                }
                if (i == R.drawable.ic_glyph_1xlive) {
                    return R.drawable.ic_glyph_1xlive_ny;
                }
                if (i == R.drawable.ic_glyph_loto) {
                    return R.drawable.ic_glyph_loto_ny;
                }
                if (i == R.drawable.ic_glyph_telegram) {
                    return R.drawable.ic_glyph_telegram_ny;
                }
                if (i == R.drawable.ic_glyph_championship_live) {
                    return R.drawable.ic_glyph_championship_live_ny;
                }
                if (i == R.drawable.ic_glyph_championship_line) {
                    return R.drawable.ic_glyph_championship_line_ny;
                }
                if (i == R.drawable.ic_xbet_dark) {
                    return R.drawable.ic_xbet_dark_ny;
                }
                if (i == R.drawable.ic_xbet_light) {
                    return R.drawable.ic_xbet_light_ny;
                }
            } else if (c().f44319a == yfw.CHINESE_NEW_YEAR) {
                if (i == R.drawable.ic_glyph_coupon) {
                    return R.drawable.ic_glyph_coupon_ny_cn;
                }
                if (i == R.drawable.ic_glyph_circle_profile) {
                    return R.drawable.ic_glyph_circle_profile_ny_cn;
                }
                if (i == R.drawable.ic_xbet_dark) {
                    return R.drawable.ic_xbet_dark_ny_cn;
                }
                if (i == R.drawable.ic_xbet_light) {
                    return R.drawable.ic_xbet_light_ny_cn;
                }
            }
        }
        return i;
    }

    public final zfw c() {
        return (zfw) this.b.getValue();
    }
}
