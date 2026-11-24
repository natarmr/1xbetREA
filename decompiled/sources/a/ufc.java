package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ufc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35571a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ or70 c;

    public /* synthetic */ ufc(Function1 function1, or70 or70Var, byte b) {
        this.f35571a = b;
        this.b = function1;
        this.c = or70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35571a;
        or70 or70Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new sgc(or70Var.f25722a));
                break;
            default:
                function1.invoke(new sgc(or70Var.f25722a));
                break;
        }
        return Unit.f46060a;
    }
}
