package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nbi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23242a;
    public final /* synthetic */ rbi0 b;

    public /* synthetic */ nbi0(rbi0 rbi0Var, byte b) {
        this.f23242a = b;
        this.b = rbi0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23242a;
        rbi0 rbi0Var = this.b;
        switch (b) {
            case 0:
                iqt0 iqt0Var = (iqt0) obj;
                gle0 gle0Var = rbi0.U1;
                iqt0Var.getClass();
                rbi0Var.I0().i.a(iqt0Var);
                break;
            case 1:
                gle0 gle0Var2 = rbi0.U1;
                ((View) obj).getClass();
                ldi0 ldi0VarI0 = rbi0Var.I0();
                nr nrVar = ldi0VarI0.n;
                ym4 ym4VarA = ldi0VarI0.A();
                nrVar.getClass();
                kt2 kt2Var = (kt2) nrVar.b;
                jo20 jo20Var = new jo20();
                jo20Var.put("option", "authenticator");
                if (ym4VarA != ym4.SKIP) {
                    jo20Var.put("point", ym4VarA.f42869a);
                }
                kt2Var.a("acc_add_phone_code_send", jo20Var.b());
                ldi0VarI0.H(hfi0.AUTHENTICATOR);
                bby bbyVar = ldi0VarI0.F;
                if (bbyVar == null || !bbyVar.isActive()) {
                    ldi0VarI0.F = sac.V(jiu0.a(ldi0VarI0), bdi0.f2401a, null, null, new cdi0(null, ldi0VarI0), 14);
                }
                break;
            case 2:
                gle0 gle0Var3 = rbi0.U1;
                ((View) obj).getClass();
                ldi0 ldi0VarI1 = rbi0Var.I0();
                nr nrVar2 = ldi0VarI1.n;
                ym4 ym4VarA2 = ldi0VarI1.A();
                nrVar2.getClass();
                kt2 kt2Var2 = (kt2) nrVar2.b;
                jo20 jo20Var2 = new jo20();
                jo20Var2.put("option", "sms");
                if (ym4VarA2 != ym4.SKIP) {
                    jo20Var2.put("point", ym4VarA2.f42869a);
                }
                kt2Var2.a("acc_add_phone_code_send", jo20Var2.b());
                ldi0VarI1.H(hfi0.SMS);
                ldi0VarI1.E();
                break;
            case 3:
                gle0 gle0Var4 = rbi0.U1;
                ((View) obj).getClass();
                ldi0 ldi0VarI2 = rbi0Var.I0();
                nr nrVar3 = ldi0VarI2.n;
                ym4 ym4VarA3 = ldi0VarI2.A();
                nrVar3.getClass();
                kt2 kt2Var3 = (kt2) nrVar3.b;
                jo20 jo20Var3 = new jo20();
                jo20Var3.put("option", "voice_sms");
                if (ym4VarA3 != ym4.SKIP) {
                    jo20Var3.put("point", ym4VarA3.f42869a);
                }
                kt2Var3.a("acc_add_phone_code_send", jo20Var3.b());
                ldi0VarI2.H(hfi0.VOICE_SMS);
                ldi0VarI2.I.f(sci0.f31988a);
                break;
            case 4:
                gle0 gle0Var5 = rbi0.U1;
                ((View) obj).getClass();
                ldi0 ldi0VarI3 = rbi0Var.I0();
                nr nrVar4 = ldi0VarI3.n;
                ym4 ym4VarA4 = ldi0VarI3.A();
                nrVar4.getClass();
                kt2 kt2Var4 = (kt2) nrVar4.b;
                jo20 jo20Var4 = new jo20();
                jo20Var4.put("option", "telegram");
                if (ym4VarA4 != ym4.SKIP) {
                    jo20Var4.put("point", ym4VarA4.f42869a);
                }
                kt2Var4.a("acc_add_phone_code_send", jo20Var4.b());
                ldi0VarI3.H(hfi0.TELEGRAM);
                ldi0VarI3.I.f(rci0.f30241a);
                break;
            default:
                gle0 gle0Var6 = rbi0.U1;
                ((View) obj).getClass();
                ldi0 ldi0VarI4 = rbi0Var.I0();
                nr nrVar5 = ldi0VarI4.n;
                ym4 ym4VarA5 = ldi0VarI4.A();
                nrVar5.getClass();
                kt2 kt2Var5 = (kt2) nrVar5.b;
                jo20 jo20Var5 = new jo20();
                jo20Var5.put("option", "сall_code");
                if (ym4VarA5 != ym4.SKIP) {
                    jo20Var5.put("point", ym4VarA5.f42869a);
                }
                kt2Var5.a("acc_add_phone_code_send", jo20Var5.b());
                ldi0VarI4.H(hfi0.FLASH_CALL);
                ldi0VarI4.I.f(lci0.f19802a);
                break;
        }
        return Unit.f46060a;
    }
}
