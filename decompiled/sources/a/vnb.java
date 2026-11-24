package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class vnb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37711a;
    public final /* synthetic */ xnb b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ vnb(xnb xnbVar, Function1 function1, byte b) {
        this.f37711a = b;
        this.b = xnbVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37711a;
        Function1 function1 = this.c;
        xnb xnbVar = this.b;
        switch (b) {
            case 0:
                ql5 ql5Var = (ql5) obj;
                ql5Var.getClass();
                kj5 kj5Var = xnb.w2;
                xnbVar.S0().x(ql5Var, xnbVar.q2.n(xnbVar, xnb.x2[6]).booleanValue());
                function1.invoke(ql5Var);
                break;
            default:
                ql5 ql5Var2 = (ql5) obj;
                ql5Var2.getClass();
                kj5 kj5Var2 = xnb.w2;
                xnbVar.S0().x(ql5Var2, xnbVar.q2.n(xnbVar, xnb.x2[6]).booleanValue());
                function1.invoke(ql5Var2);
                break;
        }
        return Unit.f46060a;
    }
}
