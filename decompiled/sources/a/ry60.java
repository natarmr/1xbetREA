package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ry60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31299a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ uvi0 c;

    public /* synthetic */ ry60(Function1 function1, uvi0 uvi0Var, byte b) {
        this.f31299a = b;
        this.b = function1;
        this.c = uvi0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31299a;
        uvi0 uvi0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(uvi0Var.f36350a);
                break;
            case 1:
                function1.invoke(uvi0Var.f36350a);
                break;
            case 2:
                function1.invoke(uvi0Var.f36350a);
                break;
            default:
                function1.invoke(uvi0Var.f36350a);
                break;
        }
        return Unit.f46060a;
    }
}
