package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class yis0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42711a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ cjs0 c;

    public /* synthetic */ yis0(Function1 function1, cjs0 cjs0Var, byte b) {
        this.f42711a = b;
        this.b = function1;
        this.c = cjs0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42711a;
        cjs0 cjs0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(Long.valueOf(cjs0Var.f4475a));
                break;
            default:
                function1.invoke(Long.valueOf(cjs0Var.f4475a));
                break;
        }
        return Unit.f46060a;
    }
}
