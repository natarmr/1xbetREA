package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ev10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8448a;
    public final /* synthetic */ hv10 b;

    public /* synthetic */ ev10(hv10 hv10Var, byte b) {
        this.f8448a = b;
        this.b = hv10Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x012d  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8448a;
        yje yjeVar = null;
        hv10 hv10Var = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                String str = (String) obj2;
                atz atzVar = hv10.X1;
                str.getClass();
                w220 w220VarI0 = hv10Var.I0();
                i8i.D("option", "history", (kt2) w220VarI0.R0.b, "bet_placed_success_click");
                w220VarI0.Q0.i(zm7.HISTORY);
                w220VarI0.J0.q();
                pmi0.i(w220VarI0.Y0);
                int iHashCode = str.hashCode();
                if (iHashCode != -1119119882) {
                    if (iHashCode != 2020783) {
                        if (iHashCode == 2581046 && str.equals("TOTO")) {
                            bj5 bj5Var = s77.b;
                            w220VarI0.F(new za50(1, 4, jLongValue, 0L));
                        } else {
                            bj5 bj5Var2 = s77.b;
                            w220VarI0.F(new za50(0, 4, jLongValue, 0L));
                        }
                    } else if (str.equals("AUTO")) {
                        bj5 bj5Var3 = s77.b;
                        w220VarI0.F(new za50(2, 4, jLongValue, 0L));
                    } else {
                        bj5 bj5Var4 = s77.b;
                        w220VarI0.F(new za50(0, 4, jLongValue, 0L));
                    }
                } else if (str.equals("JACKPOT")) {
                    bj5 bj5Var5 = s77.b;
                    w220VarI0.F(new za50(6, 4, jLongValue, 0L));
                } else {
                    bj5 bj5Var6 = s77.b;
                    w220VarI0.F(new za50(0, 4, jLongValue, 0L));
                }
                break;
            case 1:
                ((Long) obj).getClass();
                atz atzVar2 = hv10.X1;
                ((String) obj2).getClass();
                w220 w220VarI1 = hv10Var.I0();
                i8i.D("option", "continue", (kt2) w220VarI1.R0.b, "bet_placed_success_click");
                w220VarI1.Q0.i(zm7.CONTINUE);
                pmi0.i(w220VarI1.Y0);
                break;
            case 2:
                ((Long) obj).getClass();
                atz atzVar3 = hv10.X1;
                ((String) obj2).getClass();
                w220 w220VarI2 = hv10Var.I0();
                i8i.D("option", "share", (kt2) w220VarI2.R0.b, "bet_placed_success_click");
                w220VarI2.Q0.i(zm7.SHARE);
                sac.V(jiu0.a(w220VarI2), new yw10(1, w220VarI2, w220.class, "processSaveBetError", "processSaveBetError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, null, new o120(w220VarI2, yjeVar, (byte) 14), 14);
                break;
            default:
                clz clzVar = (clz) obj;
                blz blzVar = (blz) obj2;
                atz atzVar4 = hv10.X1;
                clzVar.getClass();
                blzVar.getClass();
                w220 w220VarI3 = hv10Var.I0();
                if (w220VarI3.c1.b.f13233a.j) {
                    sac.V(jiu0.a(w220VarI3), t220.f33196a, null, null, new q120(w220VarI3, yjeVar, (byte) 1), 14);
                }
                clzVar.x().f(blzVar);
                break;
        }
        return Unit.f46060a;
    }
}
