package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jwj0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17254a;
    public final /* synthetic */ xxj0 b;

    public /* synthetic */ jwj0(xxj0 xxj0Var, byte b) {
        this.f17254a = b;
        this.b = xxj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        byte b = this.f17254a;
        yje yjeVar = null;
        xxj0 xxj0Var = this.b;
        switch (b) {
            case 0:
                ol60 ol60Var = xxj0Var.q0;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                rek0 rek0Var = rek0.b;
                b1j.z(str, th);
                if (th instanceof zhi0) {
                    mne mneVar = xxj0Var.d;
                    kuw kuwVar = ((zhi0) th).c;
                    if (kuwVar == i2o.q) {
                        ol60Var.f(new vuj0(str));
                    } else if (kuwVar == i2o.BetExistsError) {
                        ol60Var.f(new suj0(str));
                    } else if (kuwVar == i2o.CoefficientBlockCode || kuwVar == i2o.GameLocked || kuwVar == i2o.Locked) {
                        ((nb7) xxj0Var.I.f20392a.b).b = true;
                        xxj0Var.V(new iwj0(xxj0Var, (byte) 6));
                    } else if (kuwVar == i2o.CoefficientChangeCode) {
                        sac.V(jiu0.a(xxj0Var), new thj0((byte) 13), null, mneVar.b, new kbh0(xxj0Var, str, yjeVar, (byte) 13), 10);
                    } else if (kuwVar == i2o.A || kuwVar == i2o.GameIsNotInLine || kuwVar == i2o.WrongGameBet) {
                        sac.V(jiu0.a(xxj0Var), new thj0((byte) 11), null, mneVar.b, new bai0(xxj0Var, str, yjeVar, (byte) 19), 10);
                    } else {
                        ol60Var.f(new tuj0(new xdk0(rek0Var, str, null, null, null, null, 124)));
                    }
                } else if (hic.C(th)) {
                    xxj0Var.R();
                } else {
                    ol60Var.f(new tuj0(new xdk0(rek0Var, str, null, null, null, null, 124)));
                }
                break;
            case 1:
                String str2 = (String) obj2;
                b1j.z(str2, (Throwable) obj);
                xxj0Var.q0.f(new tuj0(new xdk0(rek0.b, str2, null, null, null, null, 124)));
                break;
            case 2:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = xxj0Var.D0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, exo.a((exo) value, false, false, true, 15)));
                break;
            default:
                ((Throwable) obj).printStackTrace();
                p7m0 p7m0Var2 = xxj0Var.r0;
                p7m0Var2.getClass();
                p7m0Var2.o(null, fm5.f9768a);
                break;
        }
        return Unit.f46060a;
    }
}
