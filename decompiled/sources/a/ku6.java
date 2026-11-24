package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ku6 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;
    public final /* synthetic */ ou6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku6(long j, int i, ou6 ou6Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = j;
        this.k = i;
        this.l = ou6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ku6 ku6Var = new ku6(this.j, this.k, this.l, yjeVar);
        ku6Var.i = obj;
        return ku6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ku6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        qpg0 qpg0Var = (qpg0) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        xpg0 xpg0VarZ0 = qpg0Var.Z0("select * from bet_events where game_id = ? and coupon_type_vid != ? order by game_id");
        try {
            xpg0VarZ0.o(1, this.j);
            xpg0VarZ0.o(2, this.k);
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
                int i = iP;
                int i2 = iP15;
                String strJ8 = xpg0VarZ0.J0(i2);
                iP15 = i2;
                int i3 = iP16;
                double d = xpg0VarZ0.getDouble(i3);
                iP16 = i3;
                int i4 = iP17;
                long j7 = xpg0VarZ0.getLong(i4);
                iP17 = i4;
                int i5 = iP18;
                String strJ9 = xpg0VarZ0.J0(i5);
                iP18 = i5;
                int i6 = iP19;
                String strJ10 = xpg0VarZ0.J0(i6);
                iP19 = i6;
                int i7 = iP20;
                String strJ11 = xpg0VarZ0.J0(i7);
                iP20 = i7;
                int i8 = iP3;
                int i9 = iP21;
                int i10 = iP2;
                int i11 = (int) xpg0VarZ0.getLong(i9);
                art artVar = this.l.b;
                toy.b.getClass();
                toy toyVarH = sqt.h(i11);
                int i12 = iP22;
                long j8 = xpg0VarZ0.getLong(i12);
                int i13 = iP23;
                String strJ12 = xpg0VarZ0.J0(i13);
                iP22 = i12;
                iP23 = i13;
                int i14 = iP24;
                int i15 = (int) xpg0VarZ0.getLong(i14);
                int i16 = iP25;
                String strJ13 = xpg0VarZ0.J0(i16);
                iP24 = i14;
                int i17 = iP26;
                String strJ14 = xpg0VarZ0.J0(i17);
                iP26 = i17;
                int i18 = iP27;
                String strJ15 = xpg0VarZ0.J0(i18);
                iP27 = i18;
                int i19 = iP28;
                String strJ16 = xpg0VarZ0.J0(i19);
                iP28 = i19;
                iP25 = i16;
                int i20 = iP29;
                int i21 = (int) xpg0VarZ0.getLong(i20);
                int i22 = iP30;
                String strJ17 = xpg0VarZ0.J0(i22);
                iP29 = i20;
                int i23 = iP31;
                String strJ18 = xpg0VarZ0.J0(i23);
                iP31 = i23;
                int i24 = iP32;
                long j9 = xpg0VarZ0.getLong(i24);
                iP32 = i24;
                int i25 = iP33;
                double d2 = xpg0VarZ0.getDouble(i25);
                iP33 = i25;
                int i26 = iP34;
                String strJ19 = xpg0VarZ0.J0(i26);
                iP34 = i26;
                iP30 = i22;
                int i27 = iP35;
                iP35 = i27;
                int i28 = iP36;
                int i29 = iP4;
                int i30 = iP37;
                int i31 = iP38;
                int i32 = iP39;
                arrayList.add(new pu6(j, j2, j3, j4, j5, strJ0, strJ1, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, j6, strJ8, d, j7, strJ9, strJ10, strJ11, toyVarH, j8, strJ12, i15, strJ13, strJ14, strJ15, strJ16, i21, strJ17, strJ18, j9, d2, strJ19, (int) xpg0VarZ0.getLong(i27), (int) xpg0VarZ0.getLong(i28), (int) xpg0VarZ0.getLong(i30), (int) xpg0VarZ0.getLong(i31), (int) xpg0VarZ0.getLong(i32)));
                iP4 = i29;
                iP36 = i28;
                iP37 = i30;
                iP38 = i31;
                iP = i;
                iP3 = i8;
                iP39 = i32;
                iP2 = i10;
                iP21 = i9;
            }
            xpg0VarZ0.close();
            return arrayList;
        } catch (Throwable th) {
            xpg0VarZ0.close();
            throw th;
        }
    }
}
