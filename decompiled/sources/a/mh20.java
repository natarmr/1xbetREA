package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mh20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21770a;
    public final /* synthetic */ ln20 b;

    public /* synthetic */ mh20(ln20 ln20Var, byte b) {
        this.f21770a = b;
        this.b = ln20Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21770a;
        ln20 ln20Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ln20Var.n0.a(th);
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ln20Var.n0.a(th2);
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ln20Var.n0.a(th3);
                break;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                k820 k820Var = ln20Var.n0;
                k820Var.getClass();
                mh20 mh20Var = k820Var.d;
                mh20Var.invoke(ob20.f24957a);
                if (th4 instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th4;
                    int errorCode = zhi0Var.c.getErrorCode();
                    mii0 mii0Var = k820Var.f17853a;
                    String strValueOf = String.valueOf(errorCode);
                    strValueOf.getClass();
                    i8i.D("error_code", strValueOf, (kt2) mii0Var.b, "finbet_bet_error");
                    b1j.r(errorCode, k820Var.b.f44833a, 3355L);
                    kuw kuwVar = zhi0Var.c;
                    if (kuwVar == i2o.TryAgainLaterError) {
                        rek0 rek0Var = rek0.b;
                        String message = th4.getMessage();
                        mh20Var.invoke(new zb20(new xdk0(rek0Var, message == null ? "" : message, null, null, null, null, 124)));
                    } else if (kuwVar == i2o.BetExistsError) {
                        String message2 = th4.getMessage();
                        mh20Var.invoke(new sb20(message2 != null ? message2 : ""));
                    } else if (kuwVar == i2o.q) {
                        String message3 = th4.getMessage();
                        mh20Var.invoke(new bc20(message3 != null ? message3 : ""));
                    } else {
                        k820Var.a(th4);
                    }
                } else {
                    k820Var.a(th4);
                }
                break;
            case 4:
                yc20 yc20Var = (yc20) obj;
                yc20Var.getClass();
                ln20Var.G(yc20Var);
                break;
            default:
                Throwable th5 = (Throwable) obj;
                bby bbyVar = ln20Var.m0;
                duj dujVar = ln20Var.V;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                dujVar.b(th5, new eh20(ln20Var, (byte) 3));
                dujVar.b(th5, new eh20(ln20Var, (byte) 2));
                break;
        }
        return Unit.f46060a;
    }
}
