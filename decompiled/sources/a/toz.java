package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class toz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34307a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ y95 c;

    public /* synthetic */ toz(Function1 function1, y95 y95Var, byte b) {
        this.f34307a = b;
        this.b = function1;
        this.c = y95Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34307a;
        y95 y95Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new loz(y95Var));
                break;
            default:
                function1.invoke(new loz(y95Var));
                break;
        }
        return Unit.f46060a;
    }
}
