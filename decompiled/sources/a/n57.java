package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class n57 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22929a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ qgv0 c;

    public /* synthetic */ n57(Function1 function1, qgv0 qgv0Var, byte b) {
        this.f22929a = b;
        this.b = function1;
        this.c = qgv0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22929a;
        qgv0 qgv0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new i37(qgv0Var.f));
                break;
            case 1:
                function1.invoke(new i37(qgv0Var.f));
                break;
            case 2:
                function1.invoke(new i37(qgv0Var.f));
                break;
            default:
                function1.invoke(new i37(qgv0Var.f));
                break;
        }
        return Unit.f46060a;
    }
}
