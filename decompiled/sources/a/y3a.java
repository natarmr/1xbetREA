package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y3a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41941a;
    public final /* synthetic */ d4a b;

    public /* synthetic */ y3a(d4a d4aVar, byte b) {
        this.f41941a = b;
        this.b = d4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f41941a;
        d4a d4aVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                th.printStackTrace();
                d4aVar.C(u0k0.f34858a);
                break;
            default:
                th.getClass();
                th.printStackTrace();
                d4aVar.C(t0k0.f33124a);
                p7m0 p7m0Var = d4aVar.l;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, wub0.a((wub0) value, false, 3)));
                p7m0 p7m0Var2 = d4aVar.m;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, ike.a((ike) value2, true, 0, 0, 0, 0.0f, false, false, false, false, false, 4094)));
                break;
        }
        return Unit.f46060a;
    }
}
