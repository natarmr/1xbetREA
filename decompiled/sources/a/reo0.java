package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class reo0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30346a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ deo0 c;

    public /* synthetic */ reo0(Function1 function1, deo0 deo0Var, byte b) {
        this.f30346a = b;
        this.b = function1;
        this.c = deo0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30346a;
        deo0 deo0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(deo0Var.f5959a);
                break;
            default:
                function1.invoke(deo0Var.f5959a);
                break;
        }
        return Unit.f46060a;
    }
}
