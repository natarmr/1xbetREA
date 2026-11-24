package a;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yli0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42844a;
    public final /* synthetic */ imi0 b;

    public /* synthetic */ yli0(imi0 imi0Var, byte b) {
        this.f42844a = b;
        this.b = imi0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        String message;
        byte b = this.f42844a;
        imi0 imi0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                if (th instanceof NoSuchElementException) {
                    imi0Var.w();
                } else {
                    p7m0 p7m0Var = imi0Var.l;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, new fmi0(imi0Var.k)));
                }
                break;
            default:
                th.getClass();
                boolean z = th instanceof zhi0;
                ami0 ami0Var = ami0.f1110a;
                if (z) {
                    kuw kuwVar = ((zhi0) th).c;
                    if ((kuwVar != i2o.LimitChangeFailed && kuwVar != i2o.CannotChangePreviouslySetLimit && kuwVar != i2o.CannotChangeTimeLimitForNow && kuwVar != i2o.LimitChangeFailedByVerificationStatus) || (message = th.getMessage()) == null || StringsKt.W(message)) {
                        imi0Var.y(ami0Var);
                    } else {
                        String message2 = th.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        imi0Var.y(new bmi0(message2));
                    }
                } else {
                    imi0Var.y(ami0Var);
                }
                p7m0 p7m0Var2 = imi0Var.l;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, emi0.f8048a));
                break;
        }
        return Unit.f46060a;
    }
}
