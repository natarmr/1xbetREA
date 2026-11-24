package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class lu6 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ long j;
    public final /* synthetic */ byte k;
    public final /* synthetic */ double l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ ou6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lu6(long j, int i, double d, long j2, long j3, ou6 ou6Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = j;
        this.k = i;
        this.l = d;
        this.m = j2;
        this.n = j3;
        this.o = ou6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        lu6 lu6Var = new lu6(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
        lu6Var.i = obj;
        return lu6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        pu6 pu6Var;
        qpg0 qpg0Var = (qpg0) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        xpg0 xpg0VarZ0 = qpg0Var.Z0("select * from bet_events where game_id = ? and kind = ? and param = ? and player_Id = ? and type = ? order by game_id ASC limit 1");
        try {
            xpg0VarZ0.o(1, this.j);
            xpg0VarZ0.o(2, this.k);
            xpg0VarZ0.p(this.l, 3);
            xpg0VarZ0.o(4, this.m);
            xpg0VarZ0.o(5, this.n);
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
                String strJ8 = xpg0VarZ0.J0(iP15);
                double d = xpg0VarZ0.getDouble(iP16);
                long j7 = xpg0VarZ0.getLong(iP17);
                String strJ9 = xpg0VarZ0.J0(iP18);
                String strJ10 = xpg0VarZ0.J0(iP19);
                String strJ11 = xpg0VarZ0.J0(iP20);
                int i = (int) xpg0VarZ0.getLong(iP21);
                toy.b.getClass();
                pu6Var = new pu6(j, j2, j3, j4, j5, strJ0, strJ1, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, j6, strJ8, d, j7, strJ9, strJ10, strJ11, sqt.h(i), xpg0VarZ0.getLong(iP22), xpg0VarZ0.J0(iP23), (int) xpg0VarZ0.getLong(iP24), xpg0VarZ0.J0(iP25), xpg0VarZ0.J0(iP26), xpg0VarZ0.J0(iP27), xpg0VarZ0.J0(iP28), (int) xpg0VarZ0.getLong(iP29), xpg0VarZ0.J0(iP30), xpg0VarZ0.J0(iP31), xpg0VarZ0.getLong(iP32), xpg0VarZ0.getDouble(iP33), xpg0VarZ0.J0(iP34), (int) xpg0VarZ0.getLong(iP35), (int) xpg0VarZ0.getLong(iP36), (int) xpg0VarZ0.getLong(iP37), (int) xpg0VarZ0.getLong(iP38), (int) xpg0VarZ0.getLong(iP39));
            } else {
                pu6Var = null;
            }
            return pu6Var;
        } finally {
            xpg0VarZ0.close();
        }
    }
}
