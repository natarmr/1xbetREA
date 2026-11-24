package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class eqz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8258a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ w95 c;

    public /* synthetic */ eqz(Function1 function1, w95 w95Var, byte b) {
        this.f8258a = b;
        this.b = function1;
        this.c = w95Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8258a;
        w95 w95Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new xpz(w95Var));
                break;
            default:
                function1.invoke(new xpz(w95Var));
                break;
        }
        return Unit.f46060a;
    }
}
