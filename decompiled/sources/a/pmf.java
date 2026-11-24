package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pmf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27230a;
    public final /* synthetic */ rhv0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ pmf(rhv0 rhv0Var, Function1 function1, byte b) {
        this.f27230a = b;
        this.b = rhv0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27230a;
        Function1 function1 = this.c;
        rhv0 rhv0Var = this.b;
        ox oxVar = (ox) obj;
        switch (b) {
            case 0:
                oxVar.getClass();
                function1.invoke(new yjf(oxVar, (int) (((yez) rhv0Var).b() >> 32)));
                break;
            case 1:
                oxVar.getClass();
                function1.invoke(new g1l(oxVar, (int) (((yez) rhv0Var).b() >> 32)));
                break;
            case 2:
                oxVar.getClass();
                function1.invoke(new hy00(oxVar, (int) (((yez) rhv0Var).b() >> 32)));
                break;
            default:
                oxVar.getClass();
                function1.invoke(new vwt0(oxVar, (int) (((yez) rhv0Var).b() >> 32)));
                break;
        }
        return Unit.f46060a;
    }
}
