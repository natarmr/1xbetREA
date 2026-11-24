package a;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f9k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9157a;
    public final /* synthetic */ p9k b;

    public /* synthetic */ f9k(p9k p9kVar, byte b) {
        this.f9157a = b;
        this.b = p9kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        String message;
        Object value2;
        Object value3;
        byte b = this.f9157a;
        p9k p9kVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                boolean z = th instanceof zhi0;
                h9k h9kVar = h9k.f12681a;
                if (z) {
                    kuw kuwVar = ((zhi0) th).c;
                    if ((kuwVar != i2o.LimitChangeFailed && kuwVar != i2o.LimitChangeAlreadyExist && kuwVar != i2o.DayDepositLimitInvalidRange && kuwVar != i2o.WeekDepositLimitInvalidRange && kuwVar != i2o.CannotChangePreviouslySetLimit && kuwVar != i2o.LimitChangeFailedByVerificationStatus) || (message = th.getMessage()) == null || StringsKt.W(message)) {
                        p9kVar.y(h9kVar);
                    } else {
                        String message2 = th.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        p9kVar.y(new i9k(message2));
                    }
                } else {
                    p9kVar.y(h9kVar);
                }
                p7m0 p7m0Var = p9kVar.o;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, l9k.f19656a));
                break;
            case 1:
                th.getClass();
                if (th instanceof NoSuchElementException) {
                    sac.V(jiu0.a(p9kVar), new f9k(p9kVar, (byte) 2), null, null, new fr9(p9kVar, null, (byte) 16), 14);
                } else {
                    p7m0 p7m0Var2 = p9kVar.o;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, new m9k(p9kVar.n)));
                }
                break;
            default:
                th.getClass();
                p7m0 p7m0Var3 = p9kVar.o;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, new m9k(p9kVar.n)));
                break;
        }
        return Unit.f46060a;
    }
}
