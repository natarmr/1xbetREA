package a;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y9k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42251a;
    public final /* synthetic */ iak b;

    public /* synthetic */ y9k(iak iakVar, byte b) {
        this.f42251a = b;
        this.b = iakVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        String message;
        Object value2;
        Object value3;
        byte b = this.f42251a;
        iak iakVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                boolean z = th instanceof zhi0;
                aak aakVar = aak.f529a;
                if (z) {
                    kuw kuwVar = ((zhi0) th).c;
                    if ((kuwVar != i2o.LimitChangeFailed && kuwVar != i2o.LimitChangeAlreadyExist && kuwVar != i2o.LimitChangeFailedByVerificationStatus) || (message = th.getMessage()) == null || StringsKt.W(message)) {
                        iakVar.x(aakVar);
                    } else {
                        String message2 = th.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        iakVar.x(new bak(message2));
                    }
                } else {
                    iakVar.x(aakVar);
                }
                p7m0 p7m0Var = iakVar.n;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, eak.f7469a));
                break;
            case 1:
                th.getClass();
                if (th instanceof NoSuchElementException) {
                    sac.V(jiu0.a(iakVar), new y9k(iakVar, (byte) 2), null, null, new fr9(iakVar, null, (byte) 17), 14);
                } else {
                    p7m0 p7m0Var2 = iakVar.n;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, new fak(iakVar.m)));
                }
                break;
            default:
                th.getClass();
                p7m0 p7m0Var3 = iakVar.n;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, new fak(iakVar.m)));
                break;
        }
        return Unit.f46060a;
    }
}
