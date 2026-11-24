package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hr6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13515a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ hq6 c;

    public /* synthetic */ hr6(Function1 function1, hq6 hq6Var, byte b) {
        this.f13515a = b;
        this.b = function1;
        this.c = hq6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13515a;
        hq6 hq6Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new oq6(hq6Var.f13471a));
                break;
            default:
                function1.invoke(new oq6(hq6Var.b));
                break;
        }
        return Unit.f46060a;
    }
}
