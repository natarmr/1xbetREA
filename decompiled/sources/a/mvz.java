package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mvz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22479a;
    public final /* synthetic */ qvz b;

    public /* synthetic */ mvz(qvz qvzVar, byte b) {
        this.f22479a = b;
        this.b = qvzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f22479a;
        qvz qvzVar = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = qvzVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    qvzVar.f.getClass();
                } while (!p7m0Var.m(value, gvz.a((gvz) value, null, null, 0, false, false, null, null, Response.SERVICE_UNAVAILABLE)));
                break;
            case 1:
                p7m0 p7m0Var2 = qvzVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    qvzVar.f.getClass();
                } while (!p7m0Var2.m(value2, gvz.a((gvz) value2, null, null, 0, false, false, null, null, Response.SERVICE_UNAVAILABLE)));
                break;
            default:
                p7m0 p7m0Var3 = qvzVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    qvzVar.f.getClass();
                } while (!p7m0Var3.m(value3, gvz.a((gvz) value3, null, null, 0, false, false, null, null, Response.SERVICE_UNAVAILABLE)));
                break;
        }
        return Unit.f46060a;
    }
}
