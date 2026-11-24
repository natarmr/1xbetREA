package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class r840 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30008a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ i740 c;

    public /* synthetic */ r840(Function1 function1, i740 i740Var, byte b) {
        this.f30008a = b;
        this.b = function1;
        this.c = i740Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30008a;
        i740 i740Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new t740(i740Var));
                break;
            default:
                function1.invoke(new r740(i740Var.b));
                break;
        }
        return Unit.f46060a;
    }
}
