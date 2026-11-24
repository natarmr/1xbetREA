package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wow implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39518a;
    public final /* synthetic */ yow b;

    public /* synthetic */ wow(yow yowVar, byte b) {
        this.f39518a = b;
        this.b = yowVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        byte b = this.f39518a;
        yow yowVar = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                p7m0 p7m0Var = yowVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    yowVar.f.getClass();
                } while (!p7m0Var.m(value, low.a((low) value, false, true, 12)));
                break;
            default:
                int i = yow.v;
                p7m0 p7m0Var2 = yowVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    yowVar.f.getClass();
                } while (!p7m0Var2.m(value2, low.a((low) value2, false, true, 12)));
                break;
        }
        return Unit.f46060a;
    }
}
