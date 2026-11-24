package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class lqe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqe(int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                lqe lqeVar = new lqe(this.k, yjeVar, (byte) 0);
                lqeVar.j = obj;
                return lqeVar;
            default:
                lqe lqeVar2 = new lqe(this.k, yjeVar, (byte) 1);
                lqeVar2.j = obj;
                return lqeVar2;
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
        return ((lqe) create(qpg0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.i;
        int i = this.k;
        qpg0 qpg0Var = (qpg0) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = qpg0Var.Z0("select * from country where country.id == ?");
                try {
                    xpg0VarZ0.o(1, i);
                    int iP = x0x.P(xpg0VarZ0, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ0, "country_name");
                    int iP3 = x0x.P(xpg0VarZ0, "country_phone_code");
                    int iP4 = x0x.P(xpg0VarZ0, "country_code");
                    int iP5 = x0x.P(xpg0VarZ0, "country_currency_id");
                    int iP6 = x0x.P(xpg0VarZ0, "country_image");
                    int iP7 = x0x.P(xpg0VarZ0, "phone_mask_max_length");
                    int iP8 = x0x.P(xpg0VarZ0, "phone_mask_min_length");
                    int iP9 = x0x.P(xpg0VarZ0, "phone_mask");
                    if (!xpg0VarZ0.W0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'org.xplatform.onexdatabase.entity.CountryEntity'.");
                    }
                    oqe oqeVar = new oqe((int) xpg0VarZ0.getLong(iP), xpg0VarZ0.J0(iP2), (int) xpg0VarZ0.getLong(iP3), xpg0VarZ0.J0(iP4), xpg0VarZ0.getLong(iP5), xpg0VarZ0.J0(iP6), (int) xpg0VarZ0.getLong(iP7), (int) xpg0VarZ0.getLong(iP8), xpg0VarZ0.J0(iP9));
                    xpg0VarZ0.close();
                    return oqeVar;
                } catch (Throwable th) {
                    xpg0VarZ0.close();
                    throw th;
                }
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ1 = qpg0Var.Z0("delete from last_action where id = (select id from last_action where type = ? order by date asc limit 1)");
                try {
                    xpg0VarZ1.o(1, i);
                    xpg0VarZ1.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ1.close();
                }
        }
    }
}
