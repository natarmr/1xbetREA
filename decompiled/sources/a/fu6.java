package a;

/* JADX INFO: loaded from: classes5.dex */
public final class fu6 extends ulb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10146a;

    public fu6(ou6 ou6Var) {
        this.f10146a = (byte) 0;
    }

    @Override // a.ulb
    public final void C(xpg0 xpg0Var, Object obj) {
        switch (this.f10146a) {
            case 0:
                pu6 pu6Var = (pu6) obj;
                xpg0Var.getClass();
                pu6Var.getClass();
                long j = pu6Var.f27599a;
                xpg0Var.o(1, j);
                xpg0Var.o(2, pu6Var.b);
                xpg0Var.o(3, pu6Var.c);
                xpg0Var.o(4, pu6Var.d);
                xpg0Var.o(5, pu6Var.e);
                xpg0Var.z(6, pu6Var.f);
                xpg0Var.z(7, pu6Var.g);
                xpg0Var.z(8, pu6Var.h);
                xpg0Var.z(9, pu6Var.i);
                xpg0Var.z(10, pu6Var.j);
                xpg0Var.z(11, pu6Var.k);
                xpg0Var.z(12, pu6Var.l);
                xpg0Var.z(13, pu6Var.m);
                xpg0Var.o(14, pu6Var.n);
                xpg0Var.z(15, pu6Var.o);
                xpg0Var.p(pu6Var.p, 16);
                xpg0Var.o(17, pu6Var.q);
                xpg0Var.z(18, pu6Var.r);
                xpg0Var.z(19, pu6Var.s);
                xpg0Var.z(20, pu6Var.t);
                xpg0Var.o(21, pu6Var.u.f34306a);
                xpg0Var.o(22, pu6Var.v);
                xpg0Var.z(23, pu6Var.w);
                xpg0Var.o(24, pu6Var.x);
                xpg0Var.z(25, pu6Var.y);
                xpg0Var.z(26, pu6Var.z);
                xpg0Var.z(27, pu6Var.A);
                xpg0Var.z(28, pu6Var.B);
                xpg0Var.o(29, pu6Var.C);
                xpg0Var.z(30, pu6Var.D);
                xpg0Var.z(31, pu6Var.E);
                xpg0Var.o(32, pu6Var.F);
                xpg0Var.p(pu6Var.G, 33);
                xpg0Var.z(34, pu6Var.H);
                xpg0Var.o(35, pu6Var.I);
                xpg0Var.o(36, pu6Var.J);
                xpg0Var.o(37, pu6Var.K);
                xpg0Var.o(38, pu6Var.L);
                xpg0Var.o(39, pu6Var.M);
                xpg0Var.o(40, j);
                break;
            case 1:
                dm90 dm90Var = (dm90) obj;
                xpg0Var.getClass();
                dm90Var.getClass();
                long j2 = dm90Var.f6312a;
                xpg0Var.o(1, j2);
                xpg0Var.o(2, dm90Var.b);
                xpg0Var.o(3, dm90Var.c);
                xpg0Var.z(4, dm90Var.d);
                xpg0Var.o(5, j2);
                break;
            default:
                skt sktVar = (skt) obj;
                xpg0Var.getClass();
                sktVar.getClass();
                long j3 = sktVar.f32368a;
                xpg0Var.o(1, j3);
                xpg0Var.z(2, sktVar.b);
                xpg0Var.o(3, sktVar.c);
                xpg0Var.z(4, sktVar.d);
                xpg0Var.o(5, sktVar.e);
                xpg0Var.z(6, sktVar.f);
                xpg0Var.o(7, j3);
                break;
        }
    }

    @Override // a.ulb
    public final String I() {
        switch (this.f10146a) {
            case 0:
                return "UPDATE OR ABORT `bet_events` SET `id` = ?,`game_id` = ?,`main_game_id` = ?,`player_id` = ?,`sport_id` = ?,`player_name` = ?,`game_match_name` = ?,`first_opponent_first_img` = ?,`first_opponent_second_img` = ?,`second_opponent_first_img` = ?,`second_opponent_second_img` = ?,`group_name` = ?,`champ_name` = ?,`express_number` = ?,`coefficient` = ?,`param` = ?,`time_start` = ?,`vid` = ?,`full_name` = ?,`name` = ?,`kind` = ?,`type` = ?,`players_duel_game` = ?,`coupon_entry_feature_id` = ?,`first_opponent_name` = ?,`second_opponent_name` = ?,`opponents_full_name` = ?,`tournament_stage` = ?,`teams_number` = ?,`game_type` = ?,`game_vid` = ?,`group_id` = ?,`option_lower_cf` = ?,`option_lower_cf_view` = ?,`coupon_type_vid` = ?,`builder_game_type` = ?,`builder_game_vid` = ?,`builder_period` = ?,`builder_coef_available` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `country` SET `id` = ?,`phone_mask_max_length` = ?,`phone_mask_min_length` = ?,`phone_mask` = ? WHERE `id` = ?";
            default:
                return "UPDATE `country` SET `id` = ?,`country_name` = ?,`country_phone_code` = ?,`country_code` = ?,`country_currency_id` = ?,`country_image` = ? WHERE `id` = ?";
        }
    }

    public /* synthetic */ fu6(byte b) {
        this.f10146a = b;
    }
}
