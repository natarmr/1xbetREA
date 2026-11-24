package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class us10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36188a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ hvk0 c;

    public /* synthetic */ us10(Function1 function1, hvk0 hvk0Var, byte b) {
        this.f36188a = b;
        this.b = function1;
        this.c = hvk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36188a;
        hvk0 hvk0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                o0h o0hVar = (o0h) hvk0Var;
                function1.invoke(new qqk0(o0hVar.b, o0hVar.c, o0hVar.g));
                break;
            default:
                n010 n010Var = (n010) hvk0Var;
                function1.invoke(new qqk0(n010Var.b, n010Var.c, n010Var.f));
                break;
        }
        return Unit.f46060a;
    }
}
