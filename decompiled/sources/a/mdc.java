package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class mdc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21589a;
    public final /* synthetic */ wpq b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ x95 d;

    public /* synthetic */ mdc(wpq wpqVar, Function1 function1, x95 x95Var, byte b) {
        this.f21589a = b;
        this.b = wpqVar;
        this.c = function1;
        this.d = x95Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21589a;
        x95 x95Var = this.d;
        Function1 function1 = this.c;
        wpq wpqVar = this.b;
        switch (b) {
            case 0:
                ((ypq) wpqVar).b(false);
                function1.invoke(new cdc(x95Var));
                break;
            default:
                ((ypq) wpqVar).b(false);
                function1.invoke(new cdc(x95Var));
                break;
        }
        return Unit.f46060a;
    }
}
