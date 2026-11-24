package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d880 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5634a;
    public final /* synthetic */ n880 b;

    public /* synthetic */ d880(n880 n880Var, byte b) {
        this.f5634a = b;
        this.b = n880Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f5634a;
        n880 n880Var = this.b;
        switch (b) {
            case 0:
                d7a d7aVar = (d7a) obj;
                d7aVar.getClass();
                n880Var.G(new t780(d7aVar));
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                p7m0 p7m0Var = n880Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    n880Var.f.getClass();
                } while (!p7m0Var.m(value, y780.a((y780) value, null, 0, null, null, null, null, null, null, null, null, false, null, false, false, true, true, 49151)));
                break;
        }
        return Unit.f46060a;
    }
}
