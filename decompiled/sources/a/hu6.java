package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hu6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu6(long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                hu6 hu6Var = new hu6(this.k, yjeVar, (byte) 0);
                hu6Var.j = obj;
                return hu6Var;
            case 1:
                hu6 hu6Var2 = new hu6(this.k, yjeVar, (byte) 1);
                hu6Var2.j = obj;
                return hu6Var2;
            case 2:
                hu6 hu6Var3 = new hu6(this.k, yjeVar, (byte) 2);
                hu6Var3.j = obj;
                return hu6Var3;
            case 3:
                hu6 hu6Var4 = new hu6(this.k, yjeVar, (byte) 3);
                hu6Var4.j = obj;
                return hu6Var4;
            case 4:
                hu6 hu6Var5 = new hu6(this.k, yjeVar, (byte) 4);
                hu6Var5.j = obj;
                return hu6Var5;
            case 5:
                hu6 hu6Var6 = new hu6(this.k, yjeVar, (byte) 5);
                hu6Var6.j = obj;
                return hu6Var6;
            case 6:
                hu6 hu6Var7 = new hu6(this.k, yjeVar, (byte) 6);
                hu6Var7.j = obj;
                return hu6Var7;
            case 7:
                hu6 hu6Var8 = new hu6(this.k, yjeVar, (byte) 7);
                hu6Var8.j = obj;
                return hu6Var8;
            case 8:
                hu6 hu6Var9 = new hu6(this.k, yjeVar, (byte) 8);
                hu6Var9.j = obj;
                return hu6Var9;
            case 9:
                hu6 hu6Var10 = new hu6(this.k, yjeVar, (byte) 9);
                hu6Var10.j = obj;
                return hu6Var10;
            default:
                hu6 hu6Var11 = new hu6(this.k, yjeVar, (byte) 10);
                hu6Var11.j = obj;
                return hu6Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((hu6) create((rch0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hu6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        long j;
        long j2;
        byte b = this.i;
        Object rcoVar = null;
        long j3 = this.k;
        switch (b) {
            case 0:
                qpg0 qpg0Var = (qpg0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = qpg0Var.Z0("select count(*) from bet_events where game_id = ?");
                try {
                    xpg0VarZ0.o(1, j3);
                    if (xpg0VarZ0.W0()) {
                        j = xpg0VarZ0.getLong(0);
                        break;
                    } else {
                        j = 0;
                    }
                    return new Long(j);
                } finally {
                    xpg0VarZ0.close();
                }
            case 1:
                qpg0 qpg0Var2 = (qpg0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ1 = qpg0Var2.Z0("select count(*) from bet_events where main_game_id = ?");
                try {
                    xpg0VarZ1.o(1, j3);
                    if (xpg0VarZ1.W0()) {
                        j2 = xpg0VarZ1.getLong(0);
                        break;
                    } else {
                        j2 = 0;
                    }
                    return new Long(j2);
                } finally {
                    xpg0VarZ1.close();
                }
            case 2:
                qpg0 qpg0Var3 = (qpg0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ2 = qpg0Var3.Z0("delete from bet_events where id = ?");
                try {
                    xpg0VarZ2.o(1, j3);
                    xpg0VarZ2.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ2.close();
                }
            case 3:
                qpg0 qpg0Var4 = (qpg0) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ3 = qpg0Var4.Z0("select * from currencies where id = ?");
                try {
                    xpg0VarZ3.o(1, j3);
                    int iP = x0x.P(xpg0VarZ3, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ3, "code");
                    int iP3 = x0x.P(xpg0VarZ3, "name");
                    int iP4 = x0x.P(xpg0VarZ3, "top");
                    int iP5 = x0x.P(xpg0VarZ3, "ruble_to_currency_rate");
                    int iP6 = x0x.P(xpg0VarZ3, "symbol");
                    int iP7 = x0x.P(xpg0VarZ3, "min_out_deposit");
                    int iP8 = x0x.P(xpg0VarZ3, "min_out_deposit_electron");
                    int iP9 = x0x.P(xpg0VarZ3, "min_sum_bets");
                    int iP10 = x0x.P(xpg0VarZ3, "round");
                    int iP11 = x0x.P(xpg0VarZ3, "registration_hidden");
                    int iP12 = x0x.P(xpg0VarZ3, "crypto");
                    int iP13 = x0x.P(xpg0VarZ3, "initialBet");
                    int iP14 = x0x.P(xpg0VarZ3, "betStep");
                    if (!xpg0VarZ3.W0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'org.xplatform.onexdatabase.entity.CurrencyEntity'.");
                    }
                    tuf tufVar = new tuf(xpg0VarZ3.getLong(iP), xpg0VarZ3.J0(iP2), xpg0VarZ3.J0(iP3), ((int) xpg0VarZ3.getLong(iP4)) != 0, xpg0VarZ3.getDouble(iP5), xpg0VarZ3.J0(iP6), xpg0VarZ3.getDouble(iP7), xpg0VarZ3.getDouble(iP8), xpg0VarZ3.getDouble(iP9), (int) xpg0VarZ3.getLong(iP10), ((int) xpg0VarZ3.getLong(iP11)) != 0, ((int) xpg0VarZ3.getLong(iP12)) != 0, xpg0VarZ3.getDouble(iP13), xpg0VarZ3.getDouble(iP14));
                    xpg0VarZ3.close();
                    return tufVar;
                } catch (Throwable th) {
                    xpg0VarZ3.close();
                    throw th;
                }
            case 4:
                qpg0 qpg0Var5 = (qpg0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ4 = qpg0Var5.Z0("select * from currencies where id = ?");
                try {
                    xpg0VarZ4.o(1, j3);
                    int iP15 = x0x.P(xpg0VarZ4, ParameterNames.ID);
                    int iP16 = x0x.P(xpg0VarZ4, "code");
                    int iP17 = x0x.P(xpg0VarZ4, "name");
                    int iP18 = x0x.P(xpg0VarZ4, "top");
                    int iP19 = x0x.P(xpg0VarZ4, "ruble_to_currency_rate");
                    int iP20 = x0x.P(xpg0VarZ4, "symbol");
                    int iP21 = x0x.P(xpg0VarZ4, "min_out_deposit");
                    int iP22 = x0x.P(xpg0VarZ4, "min_out_deposit_electron");
                    int iP23 = x0x.P(xpg0VarZ4, "min_sum_bets");
                    int iP24 = x0x.P(xpg0VarZ4, "round");
                    int iP25 = x0x.P(xpg0VarZ4, "registration_hidden");
                    int iP26 = x0x.P(xpg0VarZ4, "crypto");
                    int iP27 = x0x.P(xpg0VarZ4, "initialBet");
                    int iP28 = x0x.P(xpg0VarZ4, "betStep");
                    if (!xpg0VarZ4.W0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'org.xplatform.onexdatabase.entity.CurrencyEntity'.");
                    }
                    tuf tufVar2 = new tuf(xpg0VarZ4.getLong(iP15), xpg0VarZ4.J0(iP16), xpg0VarZ4.J0(iP17), ((int) xpg0VarZ4.getLong(iP18)) != 0, xpg0VarZ4.getDouble(iP19), xpg0VarZ4.J0(iP20), xpg0VarZ4.getDouble(iP21), xpg0VarZ4.getDouble(iP22), xpg0VarZ4.getDouble(iP23), (int) xpg0VarZ4.getLong(iP24), ((int) xpg0VarZ4.getLong(iP25)) != 0, ((int) xpg0VarZ4.getLong(iP26)) != 0, xpg0VarZ4.getDouble(iP27), xpg0VarZ4.getDouble(iP28));
                    xpg0VarZ4.close();
                    return tufVar2;
                } catch (Throwable th2) {
                    xpg0VarZ4.close();
                    throw th2;
                }
            case 5:
                qpg0 qpg0Var6 = (qpg0) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ5 = qpg0Var6.Z0("select * from events where id = ?");
                try {
                    xpg0VarZ5.o(1, j3);
                    int iP29 = x0x.P(xpg0VarZ5, ParameterNames.ID);
                    int iP30 = x0x.P(xpg0VarZ5, "name");
                    int iP31 = x0x.P(xpg0VarZ5, "type_param");
                    int iP32 = x0x.P(xpg0VarZ5, "special_type");
                    if (!xpg0VarZ5.W0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'org.xplatform.onexdatabase.entity.EventDbModel'.");
                    }
                    obo oboVar = new obo(xpg0VarZ5.J0(iP30), (int) xpg0VarZ5.getLong(iP31), (int) xpg0VarZ5.getLong(iP32), xpg0VarZ5.getLong(iP29));
                    xpg0VarZ5.close();
                    return oboVar;
                } catch (Throwable th3) {
                    xpg0VarZ5.close();
                    throw th3;
                }
            case 6:
                qpg0 qpg0Var7 = (qpg0) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ6 = qpg0Var7.Z0("select * from event_groups where id = ?");
                try {
                    xpg0VarZ6.o(1, j3);
                    int iP33 = x0x.P(xpg0VarZ6, ParameterNames.ID);
                    int iP34 = x0x.P(xpg0VarZ6, "name");
                    int iP35 = x0x.P(xpg0VarZ6, "position");
                    int iP36 = x0x.P(xpg0VarZ6, "count_cols");
                    int iP37 = x0x.P(xpg0VarZ6, "has_auto_sub");
                    if (xpg0VarZ6.W0()) {
                        rcoVar = new rco(xpg0VarZ6.getLong(iP33), xpg0VarZ6.getLong(iP35), xpg0VarZ6.getLong(iP36), xpg0VarZ6.J0(iP34), ((int) xpg0VarZ6.getLong(iP37)) != 0);
                    }
                    return rcoVar;
                } finally {
                    xpg0VarZ6.close();
                }
            case 7:
                qpg0 qpg0Var8 = (qpg0) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ7 = qpg0Var8.Z0("DELETE FROM market_filter WHERE id = ?");
                try {
                    xpg0VarZ7.o(1, j3);
                    xpg0VarZ7.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ7.close();
                }
            case 8:
                qpg0 qpg0Var9 = (qpg0) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ8 = qpg0Var9.Z0("SELECT * FROM quick_bet_settings_table WHERE balanceId = ?");
                try {
                    xpg0VarZ8.o(1, j3);
                    return xpg0VarZ8.W0() ? new ind0(xpg0VarZ8.getLong(x0x.P(xpg0VarZ8, "balanceId")), xpg0VarZ8.getDouble(x0x.P(xpg0VarZ8, "firstValue")), xpg0VarZ8.getDouble(x0x.P(xpg0VarZ8, "secondValue")), xpg0VarZ8.getDouble(x0x.P(xpg0VarZ8, "thirdValue"))) : null;
                } finally {
                    xpg0VarZ8.close();
                }
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                sch0 sch0Var = ((rch0) this.j).f30239a;
                sch0Var.d(sch0Var.k, j3, 1);
                return Unit.f46060a;
            default:
                qpg0 qpg0Var10 = (qpg0) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ9 = qpg0Var10.Z0("select * from sports where id=?");
                try {
                    xpg0VarZ9.o(1, j3);
                    int iP38 = x0x.P(xpg0VarZ9, ParameterNames.ID);
                    int iP39 = x0x.P(xpg0VarZ9, "name");
                    int iP40 = x0x.P(xpg0VarZ9, "team");
                    int iP41 = x0x.P(xpg0VarZ9, "short_name");
                    int iP42 = x0x.P(xpg0VarZ9, "cyber");
                    int iP43 = x0x.P(xpg0VarZ9, "background");
                    int iP44 = x0x.P(xpg0VarZ9, "image_small");
                    int iP45 = x0x.P(xpg0VarZ9, "image_popular");
                    int iP46 = x0x.P(xpg0VarZ9, "background_tablet");
                    int iP47 = x0x.P(xpg0VarZ9, "background_champ_default");
                    int iP48 = x0x.P(xpg0VarZ9, "background_champ_tablet_default");
                    int iP49 = x0x.P(xpg0VarZ9, "background_champ_header_default");
                    int iP50 = x0x.P(xpg0VarZ9, "background_champ_header_tablet_default");
                    int iP51 = x0x.P(xpg0VarZ9, "game_background");
                    int iP52 = x0x.P(xpg0VarZ9, "sub_sports");
                    int iP53 = x0x.P(xpg0VarZ9, "image_champ_small");
                    int iP54 = x0x.P(xpg0VarZ9, "feed_image_vertical");
                    int iP55 = x0x.P(xpg0VarZ9, "feed_image_horizontal");
                    int iP56 = x0x.P(xpg0VarZ9, "feed_image_square");
                    int iP57 = x0x.P(xpg0VarZ9, "discipline_icon_3d");
                    int iP58 = x0x.P(xpg0VarZ9, "esports_event_focus_discipline_header");
                    int iP59 = x0x.P(xpg0VarZ9, "esports_header_focus_discipline_header");
                    int iP60 = x0x.P(xpg0VarZ9, "default_opponent_header");
                    int iP61 = x0x.P(xpg0VarZ9, "default_opponent_header_tablet");
                    if (!xpg0VarZ9.W0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'org.xplatform.onexdatabase.entity.SportEntity'.");
                    }
                    h5l0 h5l0Var = new h5l0(xpg0VarZ9.getLong(iP38), xpg0VarZ9.J0(iP39), xpg0VarZ9.J0(iP40), xpg0VarZ9.J0(iP41), ((int) xpg0VarZ9.getLong(iP42)) != 0, xpg0VarZ9.J0(iP43), xpg0VarZ9.J0(iP44), xpg0VarZ9.J0(iP45), xpg0VarZ9.J0(iP46), xpg0VarZ9.J0(iP47), xpg0VarZ9.J0(iP48), xpg0VarZ9.J0(iP49), xpg0VarZ9.J0(iP50), xpg0VarZ9.J0(iP51), xpg0VarZ9.J0(iP52), xpg0VarZ9.J0(iP53), xpg0VarZ9.J0(iP54), xpg0VarZ9.J0(iP55), xpg0VarZ9.J0(iP56), xpg0VarZ9.J0(iP57), xpg0VarZ9.J0(iP58), xpg0VarZ9.J0(iP59), xpg0VarZ9.J0(iP60), xpg0VarZ9.J0(iP61));
                    xpg0VarZ9.close();
                    return h5l0Var;
                } catch (Throwable th4) {
                    xpg0VarZ9.close();
                    throw th4;
                }
        }
    }
}
