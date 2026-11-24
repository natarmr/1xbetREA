package a;

import android.javax.sip.header.WarningHeader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vng0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37717a;
    public final /* synthetic */ aog0 b;

    public /* synthetic */ vng0(aog0 aog0Var, byte b) {
        this.f37717a = b;
        this.b = aog0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ong0 ong0Var;
        Object value2;
        ong0 ong0Var2;
        Object value3;
        ong0 ong0Var3;
        byte b = this.f37717a;
        aog0 aog0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                aog0Var.s.b(th, new vtf0((byte) 24));
                break;
            default:
                duj dujVar = aog0Var.s;
                ocj ocjVar = aog0Var.i;
                oyg0 oyg0Var = aog0Var.f;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                byte b2 = 25;
                if (th2 instanceof kcy) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var.getValue();
                        value3.getClass();
                        ong0Var3 = (ong0) value3;
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value3, ong0.a(ong0Var3, ong0Var3.e, iun.f15405a, null, false, WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD)));
                    dujVar.b(th2, new vtf0(b2));
                } else if (th2 instanceof ff5) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        ong0Var2 = (ong0) value2;
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value2, ong0.a(ong0Var2, ong0Var2.f, iun.f15405a, null, true, WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD)));
                } else {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        ong0Var = (ong0) value;
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value, ong0.a(ong0Var, ong0Var.e, iun.f15405a, null, false, WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD)));
                    dujVar.b(th2, new vtf0(b2));
                }
                break;
        }
        return Unit.f46060a;
    }
}
