package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tx4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34679a;
    public final /* synthetic */ fy4 b;

    public /* synthetic */ tx4(fy4 fy4Var, byte b) {
        this.f34679a = b;
        this.b = fy4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34679a;
        yje yjeVar = null;
        fy4 fy4Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                b1j.z(str, (Throwable) obj);
                fy4Var.a0.f(new fw4(new xdk0(rek0.b, str, null, null, null, null, 124)));
                break;
            case 1:
                ol60 ol60Var = fy4Var.a0;
                Throwable th = (Throwable) obj;
                String str2 = (String) obj2;
                rek0 rek0Var = rek0.b;
                b1j.z(str2, th);
                if (th instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th;
                    kuw kuwVar = zhi0Var.c;
                    if (kuwVar == i2o.q) {
                        ol60Var.f(new hw4(str2));
                    } else if (kuwVar == i2o.BetExistsError) {
                        ol60Var.f(new ew4(str2));
                    } else if (kuwVar == i2o.A || kuwVar == i2o.GameIsNotInLine || kuwVar == i2o.EventParameterChanged) {
                        String message = zhi0Var.getMessage();
                        if (message != null) {
                            str2 = message;
                        }
                        sac.V(jiu0.a(fy4Var), new ij4((byte) 12), null, fy4Var.g.b, new cm3(fy4Var, str2, yjeVar, (byte) 14), 10);
                    } else if (kuwVar == i2o.CoefficientBlockCode || kuwVar == i2o.GameLocked || kuwVar == i2o.Locked) {
                        ((nb7) fy4Var.J.f20392a.b).b = true;
                        fy4Var.J(new sx4(fy4Var, (byte) 3));
                    } else {
                        ol60Var.f(new fw4(new xdk0(rek0Var, str2, null, null, null, null, 124)));
                    }
                } else if (hic.C(th)) {
                    ctf0 ctf0Var = fy4Var.l;
                    ol60Var.f(new fw4(new xdk0(pek0.f26859a, ctf0Var.f(R.string.no_connection_title_with_hyphen, new Object[0]), ctf0Var.f(R.string.no_connection_description, new Object[0]), null, null, null, 120)));
                } else {
                    ol60Var.f(new fw4(new xdk0(rek0Var, str2, null, null, null, null, 124)));
                }
                break;
            default:
                ((Throwable) obj).printStackTrace();
                p7m0 p7m0Var = fy4Var.X;
                p7m0Var.getClass();
                p7m0Var.o(null, fm5.f9768a);
                break;
        }
        return Unit.f46060a;
    }
}
