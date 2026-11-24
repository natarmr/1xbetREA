package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f550 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8944a;
    public final /* synthetic */ d650 b;

    public /* synthetic */ f550(d650 d650Var, byte b) {
        this.f8944a = b;
        this.b = d650Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8944a;
        d650 d650Var = this.b;
        Throwable th = (Throwable) obj;
        String strG = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                strG.getClass();
                d650Var.getClass();
                p7m0 p7m0Var = d650Var.v;
                p7m0Var.getClass();
                p7m0Var.o(null, kv5.f18939a);
                break;
            default:
                th.getClass();
                strG.getClass();
                if (StringsKt.W(strG)) {
                    strG = jwb.G(th, d650Var.M);
                }
                d650Var.h1.f(new v450(strG));
                break;
        }
        return Unit.f46060a;
    }
}
