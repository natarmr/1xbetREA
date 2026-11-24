package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gu6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ int k;
    public final /* synthetic */ ou6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gu6(int i, ou6 ou6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = i;
        this.l = ou6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                gu6 gu6Var = new gu6(this.k, this.l, yjeVar, (byte) 0);
                gu6Var.j = obj;
                return gu6Var;
            default:
                gu6 gu6Var2 = new gu6(this.k, this.l, yjeVar, (byte) 1);
                gu6Var2.j = obj;
                return gu6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qpg0 qpg0Var = (qpg0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((gu6) create(qpg0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.i;
        int i = this.k;
        switch (b) {
            case 0:
                qpg0 qpg0Var = (qpg0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = qpg0Var.Z0("select * from bet_events where coupon_type_vid = ?");
                try {
                    xpg0VarZ0.o(1, i);
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
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ0.W0()) {
                        long j = xpg0VarZ0.getLong(iP);
                        long j2 = xpg0VarZ0.getLong(iP2);
                        long j3 = xpg0VarZ0.getLong(iP3);
                        long j4 = xpg0VarZ0.getLong(iP4);
                        long j5 = xpg0VarZ0.getLong(iP5);
                        String strJ0 = xpg0VarZ0.J0(iP6);
                        String strJ1 = xpg0VarZ0.J0(iP7);
                        String strJ2 = xpg0VarZ0.J0(iP8);
                        String strJ3 = xpg0VarZ0.J0(iP9);
                        String strJ4 = xpg0VarZ0.J0(iP10);
                        String strJ5 = xpg0VarZ0.J0(iP11);
                        String strJ6 = xpg0VarZ0.J0(iP12);
                        String strJ7 = xpg0VarZ0.J0(iP13);
                        long j6 = xpg0VarZ0.getLong(iP14);
                        int i2 = iP13;
                        int i3 = iP15;
                        String strJ8 = xpg0VarZ0.J0(i3);
                        iP15 = i3;
                        int i4 = iP16;
                        double d = xpg0VarZ0.getDouble(i4);
                        iP16 = i4;
                        int i5 = iP17;
                        long j7 = xpg0VarZ0.getLong(i5);
                        iP17 = i5;
                        int i6 = iP18;
                        String strJ9 = xpg0VarZ0.J0(i6);
                        iP18 = i6;
                        int i7 = iP19;
                        String strJ10 = xpg0VarZ0.J0(i7);
                        iP19 = i7;
                        int i8 = iP20;
                        String strJ11 = xpg0VarZ0.J0(i8);
                        iP20 = i8;
                        int i9 = iP6;
                        int i10 = iP21;
                        int i11 = iP5;
                        int i12 = (int) xpg0VarZ0.getLong(i10);
                        art artVar = this.l.b;
                        toy.b.getClass();
                        toy toyVarH = sqt.h(i12);
                        int i13 = iP22;
                        long j8 = xpg0VarZ0.getLong(i13);
                        int i14 = iP23;
                        String strJ12 = xpg0VarZ0.J0(i14);
                        iP22 = i13;
                        iP23 = i14;
                        int i15 = iP24;
                        int i16 = (int) xpg0VarZ0.getLong(i15);
                        int i17 = iP25;
                        String strJ13 = xpg0VarZ0.J0(i17);
                        iP24 = i15;
                        int i18 = iP26;
                        String strJ14 = xpg0VarZ0.J0(i18);
                        iP26 = i18;
                        int i19 = iP27;
                        String strJ15 = xpg0VarZ0.J0(i19);
                        iP27 = i19;
                        int i20 = iP28;
                        String strJ16 = xpg0VarZ0.J0(i20);
                        iP28 = i20;
                        iP25 = i17;
                        int i21 = iP29;
                        int i22 = (int) xpg0VarZ0.getLong(i21);
                        int i23 = iP30;
                        String strJ17 = xpg0VarZ0.J0(i23);
                        iP29 = i21;
                        int i24 = iP31;
                        String strJ18 = xpg0VarZ0.J0(i24);
                        iP31 = i24;
                        int i25 = iP32;
                        long j9 = xpg0VarZ0.getLong(i25);
                        iP32 = i25;
                        int i26 = iP33;
                        double d2 = xpg0VarZ0.getDouble(i26);
                        iP33 = i26;
                        int i27 = iP34;
                        String strJ19 = xpg0VarZ0.J0(i27);
                        iP34 = i27;
                        iP30 = i23;
                        int i28 = iP35;
                        iP35 = i28;
                        int i29 = iP36;
                        int i30 = iP4;
                        int i31 = iP37;
                        int i32 = iP38;
                        int i33 = iP39;
                        arrayList.add(new pu6(j, j2, j3, j4, j5, strJ0, strJ1, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, j6, strJ8, d, j7, strJ9, strJ10, strJ11, toyVarH, j8, strJ12, i16, strJ13, strJ14, strJ15, strJ16, i22, strJ17, strJ18, j9, d2, strJ19, (int) xpg0VarZ0.getLong(i28), (int) xpg0VarZ0.getLong(i29), (int) xpg0VarZ0.getLong(i31), (int) xpg0VarZ0.getLong(i32), (int) xpg0VarZ0.getLong(i33)));
                        iP5 = i11;
                        iP4 = i30;
                        iP36 = i29;
                        iP37 = i31;
                        iP38 = i32;
                        iP13 = i2;
                        iP21 = i10;
                        iP39 = i33;
                        iP6 = i9;
                    }
                    xpg0VarZ0.close();
                    return arrayList;
                } catch (Throwable th) {
                    xpg0VarZ0.close();
                    throw th;
                }
            default:
                qpg0 qpg0Var2 = (qpg0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ1 = qpg0Var2.Z0("select * from bet_events where coupon_type_vid != ?");
                try {
                    xpg0VarZ1.o(1, i);
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
                    ArrayList arrayList2 = new ArrayList();
                    while (xpg0VarZ1.W0()) {
                        long j10 = xpg0VarZ1.getLong(iP40);
                        long j11 = xpg0VarZ1.getLong(iP41);
                        long j12 = xpg0VarZ1.getLong(iP42);
                        long j13 = xpg0VarZ1.getLong(iP43);
                        long j14 = xpg0VarZ1.getLong(iP44);
                        String strJ20 = xpg0VarZ1.J0(iP45);
                        String strJ21 = xpg0VarZ1.J0(iP46);
                        String strJ22 = xpg0VarZ1.J0(iP47);
                        String strJ23 = xpg0VarZ1.J0(iP48);
                        String strJ24 = xpg0VarZ1.J0(iP49);
                        String strJ25 = xpg0VarZ1.J0(iP50);
                        String strJ26 = xpg0VarZ1.J0(iP51);
                        String strJ27 = xpg0VarZ1.J0(iP52);
                        long j15 = xpg0VarZ1.getLong(iP53);
                        int i34 = iP52;
                        int i35 = iP54;
                        String strJ28 = xpg0VarZ1.J0(i35);
                        iP54 = i35;
                        int i36 = iP55;
                        double d3 = xpg0VarZ1.getDouble(i36);
                        iP55 = i36;
                        int i37 = iP56;
                        long j16 = xpg0VarZ1.getLong(i37);
                        iP56 = i37;
                        int i38 = iP57;
                        String strJ29 = xpg0VarZ1.J0(i38);
                        iP57 = i38;
                        int i39 = iP58;
                        String strJ30 = xpg0VarZ1.J0(i39);
                        iP58 = i39;
                        int i40 = iP59;
                        String strJ31 = xpg0VarZ1.J0(i40);
                        iP59 = i40;
                        int i41 = iP45;
                        int i42 = iP60;
                        int i43 = iP44;
                        int i44 = (int) xpg0VarZ1.getLong(i42);
                        art artVar2 = this.l.b;
                        toy.b.getClass();
                        toy toyVarH2 = sqt.h(i44);
                        int i45 = iP61;
                        long j17 = xpg0VarZ1.getLong(i45);
                        int i46 = iP62;
                        String strJ32 = xpg0VarZ1.J0(i46);
                        iP61 = i45;
                        iP62 = i46;
                        int i47 = iP63;
                        int i48 = (int) xpg0VarZ1.getLong(i47);
                        int i49 = iP64;
                        String strJ33 = xpg0VarZ1.J0(i49);
                        iP63 = i47;
                        int i50 = iP65;
                        String strJ34 = xpg0VarZ1.J0(i50);
                        iP65 = i50;
                        int i51 = iP66;
                        String strJ35 = xpg0VarZ1.J0(i51);
                        iP66 = i51;
                        int i52 = iP67;
                        String strJ36 = xpg0VarZ1.J0(i52);
                        iP67 = i52;
                        iP64 = i49;
                        int i53 = iP68;
                        int i54 = (int) xpg0VarZ1.getLong(i53);
                        int i55 = iP69;
                        String strJ37 = xpg0VarZ1.J0(i55);
                        iP68 = i53;
                        int i56 = iP70;
                        String strJ38 = xpg0VarZ1.J0(i56);
                        iP70 = i56;
                        int i57 = iP71;
                        long j18 = xpg0VarZ1.getLong(i57);
                        iP71 = i57;
                        int i58 = iP72;
                        double d4 = xpg0VarZ1.getDouble(i58);
                        iP72 = i58;
                        int i59 = iP73;
                        String strJ39 = xpg0VarZ1.J0(i59);
                        iP73 = i59;
                        iP69 = i55;
                        int i60 = iP74;
                        iP74 = i60;
                        int i61 = iP75;
                        int i62 = iP43;
                        int i63 = iP76;
                        int i64 = iP77;
                        int i65 = iP78;
                        arrayList2.add(new pu6(j10, j11, j12, j13, j14, strJ20, strJ21, strJ22, strJ23, strJ24, strJ25, strJ26, strJ27, j15, strJ28, d3, j16, strJ29, strJ30, strJ31, toyVarH2, j17, strJ32, i48, strJ33, strJ34, strJ35, strJ36, i54, strJ37, strJ38, j18, d4, strJ39, (int) xpg0VarZ1.getLong(i60), (int) xpg0VarZ1.getLong(i61), (int) xpg0VarZ1.getLong(i63), (int) xpg0VarZ1.getLong(i64), (int) xpg0VarZ1.getLong(i65)));
                        iP44 = i43;
                        iP43 = i62;
                        iP75 = i61;
                        iP76 = i63;
                        iP77 = i64;
                        iP52 = i34;
                        iP60 = i42;
                        iP78 = i65;
                        iP45 = i41;
                    }
                    xpg0VarZ1.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    xpg0VarZ1.close();
                    throw th2;
                }
        }
    }
}
