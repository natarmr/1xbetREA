package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tj3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj3(String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.k;
        switch (b) {
            case 0:
                tj3 tj3Var = new tj3(str, yjeVar, (byte) 0);
                tj3Var.j = obj;
                return tj3Var;
            case 1:
                tj3 tj3Var2 = new tj3(str, yjeVar, (byte) 1);
                tj3Var2.j = obj;
                return tj3Var2;
            case 2:
                tj3 tj3Var3 = new tj3(str, yjeVar, (byte) 2);
                tj3Var3.j = obj;
                return tj3Var3;
            default:
                tj3 tj3Var4 = new tj3(str, yjeVar, (byte) 3);
                tj3Var4.j = obj;
                return tj3Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tj3) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tj3) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((tj3) create((hfp) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tj3) create((vb6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.i;
        String str = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = ((qpg0) obj2).Z0("select `key`, value from strings where locale = ?");
                try {
                    xpg0VarZ0.z(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ0.W0()) {
                        arrayList.add(new pj3(xpg0VarZ0.J0(0), xpg0VarZ0.J0(1)));
                    }
                    xpg0VarZ0.close();
                    return arrayList;
                } catch (Throwable th) {
                    xpg0VarZ0.close();
                    throw th;
                }
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ1 = ((qpg0) obj2).Z0("select * from currencies where code = ?");
                try {
                    xpg0VarZ1.z(1, str);
                    int iP = x0x.P(xpg0VarZ1, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ1, "code");
                    int iP3 = x0x.P(xpg0VarZ1, "name");
                    int iP4 = x0x.P(xpg0VarZ1, "top");
                    int iP5 = x0x.P(xpg0VarZ1, "ruble_to_currency_rate");
                    int iP6 = x0x.P(xpg0VarZ1, "symbol");
                    int iP7 = x0x.P(xpg0VarZ1, "min_out_deposit");
                    int iP8 = x0x.P(xpg0VarZ1, "min_out_deposit_electron");
                    int iP9 = x0x.P(xpg0VarZ1, "min_sum_bets");
                    int iP10 = x0x.P(xpg0VarZ1, "round");
                    int iP11 = x0x.P(xpg0VarZ1, "registration_hidden");
                    int iP12 = x0x.P(xpg0VarZ1, "crypto");
                    int iP13 = x0x.P(xpg0VarZ1, "initialBet");
                    int iP14 = x0x.P(xpg0VarZ1, "betStep");
                    if (!xpg0VarZ1.W0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'org.xplatform.onexdatabase.entity.CurrencyEntity'.");
                    }
                    tuf tufVar = new tuf(xpg0VarZ1.getLong(iP), xpg0VarZ1.J0(iP2), xpg0VarZ1.J0(iP3), ((int) xpg0VarZ1.getLong(iP4)) != 0, xpg0VarZ1.getDouble(iP5), xpg0VarZ1.J0(iP6), xpg0VarZ1.getDouble(iP7), xpg0VarZ1.getDouble(iP8), xpg0VarZ1.getDouble(iP9), (int) xpg0VarZ1.getLong(iP10), ((int) xpg0VarZ1.getLong(iP11)) != 0, ((int) xpg0VarZ1.getLong(iP12)) != 0, xpg0VarZ1.getDouble(iP13), xpg0VarZ1.getDouble(iP14));
                    xpg0VarZ1.close();
                    return tufVar;
                } catch (Throwable th2) {
                    xpg0VarZ1.close();
                    throw th2;
                }
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(Intrinsics.d(((hfp) obj2).f12981a, str));
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(Intrinsics.d(((vb6) obj2).f37126a, str));
        }
    }
}
