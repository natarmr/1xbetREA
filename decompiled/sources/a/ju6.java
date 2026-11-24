package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ju6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ long k;
    public final /* synthetic */ ou6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju6(long j, ou6 ou6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j;
        this.l = ou6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                ju6 ju6Var = new ju6(this.k, this.l, yjeVar, (byte) 0);
                ju6Var.j = obj;
                return ju6Var;
            case 1:
                ju6 ju6Var2 = new ju6(this.k, this.l, yjeVar, (byte) 1);
                ju6Var2.j = obj;
                return ju6Var2;
            default:
                ju6 ju6Var3 = new ju6(this.k, this.l, yjeVar, (byte) 2);
                ju6Var3.j = obj;
                return ju6Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qpg0 qpg0Var = (qpg0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((ju6) create(qpg0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        pu6 pu6Var;
        pu6 pu6Var2;
        byte b = this.i;
        long j = this.k;
        qpg0 qpg0Var = (qpg0) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = qpg0Var.Z0("select * from bet_events where game_id = ? order by game_id ASC limit 1");
                try {
                    xpg0VarZ0.o(1, j);
                    int iP = x0x.P(xpg0VarZ0, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ0, "game_id");
                    int iP3 = x0x.P(xpg0VarZ0, "main_game_id");
                    int iP4 = x0x.P(xpg0VarZ0, "player_id");
                    int iP5 = x0x.P(xpg0VarZ0, "sport_id");
                    int iP6 = x0x.P(xpg0VarZ0, "player_name");
                    int iP7 = x0x.P(xpg0VarZ0, "game_match_name");
                    int iP8 = x0x.P(xpg0VarZ0, "first_opponent_first_img");
                    int iP9 = x0x.P(xpg0VarZ0, "first_opponent_second_img");
                    int iP10 = x0x.P(xpg0VarZ0, "second_opponent_first_img");
                    int iP11 = x0x.P(xpg0VarZ0, "second_opponent_second_img");
                    int iP12 = x0x.P(xpg0VarZ0, "group_name");
                    int iP13 = x0x.P(xpg0VarZ0, "champ_name");
                    int iP14 = x0x.P(xpg0VarZ0, "express_number");
                    int iP15 = x0x.P(xpg0VarZ0, "coefficient");
                    int iP16 = x0x.P(xpg0VarZ0, RemoteMessageConst.MessageBody.PARAM);
                    int iP17 = x0x.P(xpg0VarZ0, "time_start");
                    int iP18 = x0x.P(xpg0VarZ0, "vid");
                    int iP19 = x0x.P(xpg0VarZ0, "full_name");
                    int iP20 = x0x.P(xpg0VarZ0, "name");
                    int iP21 = x0x.P(xpg0VarZ0, "kind");
                    int iP22 = x0x.P(xpg0VarZ0, Payload.TYPE);
                    int iP23 = x0x.P(xpg0VarZ0, "players_duel_game");
                    int iP24 = x0x.P(xpg0VarZ0, "coupon_entry_feature_id");
                    int iP25 = x0x.P(xpg0VarZ0, "first_opponent_name");
                    int iP26 = x0x.P(xpg0VarZ0, "second_opponent_name");
                    int iP27 = x0x.P(xpg0VarZ0, "opponents_full_name");
                    int iP28 = x0x.P(xpg0VarZ0, "tournament_stage");
                    int iP29 = x0x.P(xpg0VarZ0, "teams_number");
                    int iP30 = x0x.P(xpg0VarZ0, "game_type");
                    int iP31 = x0x.P(xpg0VarZ0, "game_vid");
                    int iP32 = x0x.P(xpg0VarZ0, "group_id");
                    int iP33 = x0x.P(xpg0VarZ0, "option_lower_cf");
                    int iP34 = x0x.P(xpg0VarZ0, "option_lower_cf_view");
                    int iP35 = x0x.P(xpg0VarZ0, "coupon_type_vid");
                    int iP36 = x0x.P(xpg0VarZ0, "builder_game_type");
                    int iP37 = x0x.P(xpg0VarZ0, "builder_game_vid");
                    int iP38 = x0x.P(xpg0VarZ0, "builder_period");
                    int iP39 = x0x.P(xpg0VarZ0, "builder_coef_available");
                    if (xpg0VarZ0.W0()) {
                        long j2 = xpg0VarZ0.getLong(iP);
                        long j3 = xpg0VarZ0.getLong(iP2);
                        long j4 = xpg0VarZ0.getLong(iP3);
                        long j5 = xpg0VarZ0.getLong(iP4);
                        long j6 = xpg0VarZ0.getLong(iP5);
                        String strJ0 = xpg0VarZ0.J0(iP6);
                        String strJ1 = xpg0VarZ0.J0(iP7);
                        String strJ2 = xpg0VarZ0.J0(iP8);
                        String strJ3 = xpg0VarZ0.J0(iP9);
                        String strJ4 = xpg0VarZ0.J0(iP10);
                        String strJ5 = xpg0VarZ0.J0(iP11);
                        String strJ6 = xpg0VarZ0.J0(iP12);
                        String strJ7 = xpg0VarZ0.J0(iP13);
                        long j7 = xpg0VarZ0.getLong(iP14);
                        String strJ8 = xpg0VarZ0.J0(iP15);
                        double d = xpg0VarZ0.getDouble(iP16);
                        long j8 = xpg0VarZ0.getLong(iP17);
                        String strJ9 = xpg0VarZ0.J0(iP18);
                        String strJ10 = xpg0VarZ0.J0(iP19);
                        String strJ11 = xpg0VarZ0.J0(iP20);
                        int i = (int) xpg0VarZ0.getLong(iP21);
                        art artVar = this.l.b;
                        toy.b.getClass();
                        pu6Var = new pu6(j2, j3, j4, j5, j6, strJ0, strJ1, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, j7, strJ8, d, j8, strJ9, strJ10, strJ11, sqt.h(i), xpg0VarZ0.getLong(iP22), xpg0VarZ0.J0(iP23), (int) xpg0VarZ0.getLong(iP24), xpg0VarZ0.J0(iP25), xpg0VarZ0.J0(iP26), xpg0VarZ0.J0(iP27), xpg0VarZ0.J0(iP28), (int) xpg0VarZ0.getLong(iP29), xpg0VarZ0.J0(iP30), xpg0VarZ0.J0(iP31), xpg0VarZ0.getLong(iP32), xpg0VarZ0.getDouble(iP33), xpg0VarZ0.J0(iP34), (int) xpg0VarZ0.getLong(iP35), (int) xpg0VarZ0.getLong(iP36), (int) xpg0VarZ0.getLong(iP37), (int) xpg0VarZ0.getLong(iP38), (int) xpg0VarZ0.getLong(iP39));
                        break;
                    } else {
                        pu6Var = null;
                    }
                    return pu6Var;
                } finally {
                    xpg0VarZ0.close();
                }
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ1 = qpg0Var.Z0("select * from bet_events where id = ? order by id ASC limit 1");
                try {
                    xpg0VarZ1.o(1, j);
                    int iP40 = x0x.P(xpg0VarZ1, ParameterNames.ID);
                    int iP41 = x0x.P(xpg0VarZ1, "game_id");
                    int iP42 = x0x.P(xpg0VarZ1, "main_game_id");
                    int iP43 = x0x.P(xpg0VarZ1, "player_id");
                    int iP44 = x0x.P(xpg0VarZ1, "sport_id");
                    int iP45 = x0x.P(xpg0VarZ1, "player_name");
                    int iP46 = x0x.P(xpg0VarZ1, "game_match_name");
                    int iP47 = x0x.P(xpg0VarZ1, "first_opponent_first_img");
                    int iP48 = x0x.P(xpg0VarZ1, "first_opponent_second_img");
                    int iP49 = x0x.P(xpg0VarZ1, "second_opponent_first_img");
                    int iP50 = x0x.P(xpg0VarZ1, "second_opponent_second_img");
                    int iP51 = x0x.P(xpg0VarZ1, "group_name");
                    int iP52 = x0x.P(xpg0VarZ1, "champ_name");
                    int iP53 = x0x.P(xpg0VarZ1, "express_number");
                    int iP54 = x0x.P(xpg0VarZ1, "coefficient");
                    int iP55 = x0x.P(xpg0VarZ1, RemoteMessageConst.MessageBody.PARAM);
                    int iP56 = x0x.P(xpg0VarZ1, "time_start");
                    int iP57 = x0x.P(xpg0VarZ1, "vid");
                    int iP58 = x0x.P(xpg0VarZ1, "full_name");
                    int iP59 = x0x.P(xpg0VarZ1, "name");
                    int iP60 = x0x.P(xpg0VarZ1, "kind");
                    int iP61 = x0x.P(xpg0VarZ1, Payload.TYPE);
                    int iP62 = x0x.P(xpg0VarZ1, "players_duel_game");
                    int iP63 = x0x.P(xpg0VarZ1, "coupon_entry_feature_id");
                    int iP64 = x0x.P(xpg0VarZ1, "first_opponent_name");
                    int iP65 = x0x.P(xpg0VarZ1, "second_opponent_name");
                    int iP66 = x0x.P(xpg0VarZ1, "opponents_full_name");
                    int iP67 = x0x.P(xpg0VarZ1, "tournament_stage");
                    int iP68 = x0x.P(xpg0VarZ1, "teams_number");
                    int iP69 = x0x.P(xpg0VarZ1, "game_type");
                    int iP70 = x0x.P(xpg0VarZ1, "game_vid");
                    int iP71 = x0x.P(xpg0VarZ1, "group_id");
                    int iP72 = x0x.P(xpg0VarZ1, "option_lower_cf");
                    int iP73 = x0x.P(xpg0VarZ1, "option_lower_cf_view");
                    int iP74 = x0x.P(xpg0VarZ1, "coupon_type_vid");
                    int iP75 = x0x.P(xpg0VarZ1, "builder_game_type");
                    int iP76 = x0x.P(xpg0VarZ1, "builder_game_vid");
                    int iP77 = x0x.P(xpg0VarZ1, "builder_period");
                    int iP78 = x0x.P(xpg0VarZ1, "builder_coef_available");
                    if (xpg0VarZ1.W0()) {
                        long j9 = xpg0VarZ1.getLong(iP40);
                        long j10 = xpg0VarZ1.getLong(iP41);
                        long j11 = xpg0VarZ1.getLong(iP42);
                        long j12 = xpg0VarZ1.getLong(iP43);
                        long j13 = xpg0VarZ1.getLong(iP44);
                        String strJ12 = xpg0VarZ1.J0(iP45);
                        String strJ13 = xpg0VarZ1.J0(iP46);
                        String strJ14 = xpg0VarZ1.J0(iP47);
                        String strJ15 = xpg0VarZ1.J0(iP48);
                        String strJ16 = xpg0VarZ1.J0(iP49);
                        String strJ17 = xpg0VarZ1.J0(iP50);
                        String strJ18 = xpg0VarZ1.J0(iP51);
                        String strJ19 = xpg0VarZ1.J0(iP52);
                        long j14 = xpg0VarZ1.getLong(iP53);
                        String strJ20 = xpg0VarZ1.J0(iP54);
                        double d2 = xpg0VarZ1.getDouble(iP55);
                        long j15 = xpg0VarZ1.getLong(iP56);
                        String strJ21 = xpg0VarZ1.J0(iP57);
                        String strJ22 = xpg0VarZ1.J0(iP58);
                        String strJ23 = xpg0VarZ1.J0(iP59);
                        int i2 = (int) xpg0VarZ1.getLong(iP60);
                        art artVar2 = this.l.b;
                        toy.b.getClass();
                        pu6Var2 = new pu6(j9, j10, j11, j12, j13, strJ12, strJ13, strJ14, strJ15, strJ16, strJ17, strJ18, strJ19, j14, strJ20, d2, j15, strJ21, strJ22, strJ23, sqt.h(i2), xpg0VarZ1.getLong(iP61), xpg0VarZ1.J0(iP62), (int) xpg0VarZ1.getLong(iP63), xpg0VarZ1.J0(iP64), xpg0VarZ1.J0(iP65), xpg0VarZ1.J0(iP66), xpg0VarZ1.J0(iP67), (int) xpg0VarZ1.getLong(iP68), xpg0VarZ1.J0(iP69), xpg0VarZ1.J0(iP70), xpg0VarZ1.getLong(iP71), xpg0VarZ1.getDouble(iP72), xpg0VarZ1.J0(iP73), (int) xpg0VarZ1.getLong(iP74), (int) xpg0VarZ1.getLong(iP75), (int) xpg0VarZ1.getLong(iP76), (int) xpg0VarZ1.getLong(iP77), (int) xpg0VarZ1.getLong(iP78));
                        break;
                    } else {
                        pu6Var2 = null;
                    }
                    return pu6Var2;
                } finally {
                    xpg0VarZ1.close();
                }
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ2 = qpg0Var.Z0("select * from bet_events where id != ? order by id");
                try {
                    xpg0VarZ2.o(1, j);
                    int iP79 = x0x.P(xpg0VarZ2, ParameterNames.ID);
                    int iP80 = x0x.P(xpg0VarZ2, "game_id");
                    int iP81 = x0x.P(xpg0VarZ2, "main_game_id");
                    int iP82 = x0x.P(xpg0VarZ2, "player_id");
                    int iP83 = x0x.P(xpg0VarZ2, "sport_id");
                    int iP84 = x0x.P(xpg0VarZ2, "player_name");
                    int iP85 = x0x.P(xpg0VarZ2, "game_match_name");
                    int iP86 = x0x.P(xpg0VarZ2, "first_opponent_first_img");
                    int iP87 = x0x.P(xpg0VarZ2, "first_opponent_second_img");
                    int iP88 = x0x.P(xpg0VarZ2, "second_opponent_first_img");
                    int iP89 = x0x.P(xpg0VarZ2, "second_opponent_second_img");
                    int iP90 = x0x.P(xpg0VarZ2, "group_name");
                    int iP91 = x0x.P(xpg0VarZ2, "champ_name");
                    int iP92 = x0x.P(xpg0VarZ2, "express_number");
                    int iP93 = x0x.P(xpg0VarZ2, "coefficient");
                    int iP94 = x0x.P(xpg0VarZ2, RemoteMessageConst.MessageBody.PARAM);
                    int iP95 = x0x.P(xpg0VarZ2, "time_start");
                    int iP96 = x0x.P(xpg0VarZ2, "vid");
                    int iP97 = x0x.P(xpg0VarZ2, "full_name");
                    int iP98 = x0x.P(xpg0VarZ2, "name");
                    int iP99 = x0x.P(xpg0VarZ2, "kind");
                    int iP100 = x0x.P(xpg0VarZ2, Payload.TYPE);
                    int iP101 = x0x.P(xpg0VarZ2, "players_duel_game");
                    int iP102 = x0x.P(xpg0VarZ2, "coupon_entry_feature_id");
                    int iP103 = x0x.P(xpg0VarZ2, "first_opponent_name");
                    int iP104 = x0x.P(xpg0VarZ2, "second_opponent_name");
                    int iP105 = x0x.P(xpg0VarZ2, "opponents_full_name");
                    int iP106 = x0x.P(xpg0VarZ2, "tournament_stage");
                    int iP107 = x0x.P(xpg0VarZ2, "teams_number");
                    int iP108 = x0x.P(xpg0VarZ2, "game_type");
                    int iP109 = x0x.P(xpg0VarZ2, "game_vid");
                    int iP110 = x0x.P(xpg0VarZ2, "group_id");
                    int iP111 = x0x.P(xpg0VarZ2, "option_lower_cf");
                    int iP112 = x0x.P(xpg0VarZ2, "option_lower_cf_view");
                    int iP113 = x0x.P(xpg0VarZ2, "coupon_type_vid");
                    int iP114 = x0x.P(xpg0VarZ2, "builder_game_type");
                    int iP115 = x0x.P(xpg0VarZ2, "builder_game_vid");
                    int iP116 = x0x.P(xpg0VarZ2, "builder_period");
                    int iP117 = x0x.P(xpg0VarZ2, "builder_coef_available");
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ2.W0()) {
                        long j16 = xpg0VarZ2.getLong(iP79);
                        long j17 = xpg0VarZ2.getLong(iP80);
                        long j18 = xpg0VarZ2.getLong(iP81);
                        long j19 = xpg0VarZ2.getLong(iP82);
                        long j20 = xpg0VarZ2.getLong(iP83);
                        String strJ24 = xpg0VarZ2.J0(iP84);
                        String strJ25 = xpg0VarZ2.J0(iP85);
                        String strJ26 = xpg0VarZ2.J0(iP86);
                        String strJ27 = xpg0VarZ2.J0(iP87);
                        String strJ28 = xpg0VarZ2.J0(iP88);
                        String strJ29 = xpg0VarZ2.J0(iP89);
                        String strJ30 = xpg0VarZ2.J0(iP90);
                        String strJ31 = xpg0VarZ2.J0(iP91);
                        long j21 = xpg0VarZ2.getLong(iP92);
                        int i3 = iP79;
                        int i4 = iP93;
                        String strJ32 = xpg0VarZ2.J0(i4);
                        iP93 = i4;
                        int i5 = iP94;
                        double d3 = xpg0VarZ2.getDouble(i5);
                        iP94 = i5;
                        int i6 = iP95;
                        long j22 = xpg0VarZ2.getLong(i6);
                        iP95 = i6;
                        int i7 = iP96;
                        String strJ33 = xpg0VarZ2.J0(i7);
                        iP96 = i7;
                        int i8 = iP97;
                        String strJ34 = xpg0VarZ2.J0(i8);
                        iP97 = i8;
                        int i9 = iP98;
                        String strJ35 = xpg0VarZ2.J0(i9);
                        iP98 = i9;
                        int i10 = iP84;
                        int i11 = iP99;
                        int i12 = iP83;
                        int i13 = (int) xpg0VarZ2.getLong(i11);
                        art artVar3 = this.l.b;
                        toy.b.getClass();
                        toy toyVarH = sqt.h(i13);
                        int i14 = iP100;
                        long j23 = xpg0VarZ2.getLong(i14);
                        int i15 = iP101;
                        String strJ36 = xpg0VarZ2.J0(i15);
                        iP100 = i14;
                        iP101 = i15;
                        int i16 = iP102;
                        int i17 = (int) xpg0VarZ2.getLong(i16);
                        int i18 = iP103;
                        String strJ37 = xpg0VarZ2.J0(i18);
                        iP102 = i16;
                        int i19 = iP104;
                        String strJ38 = xpg0VarZ2.J0(i19);
                        iP104 = i19;
                        int i20 = iP105;
                        String strJ39 = xpg0VarZ2.J0(i20);
                        iP105 = i20;
                        int i21 = iP106;
                        String strJ40 = xpg0VarZ2.J0(i21);
                        iP106 = i21;
                        iP103 = i18;
                        int i22 = iP107;
                        int i23 = (int) xpg0VarZ2.getLong(i22);
                        int i24 = iP108;
                        String strJ41 = xpg0VarZ2.J0(i24);
                        iP107 = i22;
                        int i25 = iP109;
                        String strJ42 = xpg0VarZ2.J0(i25);
                        iP109 = i25;
                        int i26 = iP110;
                        long j24 = xpg0VarZ2.getLong(i26);
                        iP110 = i26;
                        int i27 = iP111;
                        double d4 = xpg0VarZ2.getDouble(i27);
                        iP111 = i27;
                        int i28 = iP112;
                        String strJ43 = xpg0VarZ2.J0(i28);
                        iP112 = i28;
                        iP108 = i24;
                        int i29 = iP113;
                        iP113 = i29;
                        int i30 = iP114;
                        int i31 = iP82;
                        int i32 = iP115;
                        int i33 = iP116;
                        int i34 = iP117;
                        arrayList.add(new pu6(j16, j17, j18, j19, j20, strJ24, strJ25, strJ26, strJ27, strJ28, strJ29, strJ30, strJ31, j21, strJ32, d3, j22, strJ33, strJ34, strJ35, toyVarH, j23, strJ36, i17, strJ37, strJ38, strJ39, strJ40, i23, strJ41, strJ42, j24, d4, strJ43, (int) xpg0VarZ2.getLong(i29), (int) xpg0VarZ2.getLong(i30), (int) xpg0VarZ2.getLong(i32), (int) xpg0VarZ2.getLong(i33), (int) xpg0VarZ2.getLong(i34)));
                        iP83 = i12;
                        iP82 = i31;
                        iP114 = i30;
                        iP115 = i32;
                        iP116 = i33;
                        iP79 = i3;
                        iP99 = i11;
                        iP117 = i34;
                        iP84 = i10;
                    }
                    xpg0VarZ2.close();
                    return arrayList;
                } catch (Throwable th) {
                    xpg0VarZ2.close();
                    throw th;
                }
        }
    }
}
