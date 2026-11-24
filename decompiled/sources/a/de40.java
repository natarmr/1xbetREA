package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class de40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5930a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ cq90 c;

    public /* synthetic */ de40(Function1 function1, cq90 cq90Var, byte b) {
        this.f5930a = b;
        this.b = function1;
        this.c = cq90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5930a;
        cq90 cq90Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(Integer.valueOf(((aq90) cq90Var).f1287a));
                break;
            default:
                function1.invoke(Integer.valueOf(((aq90) cq90Var).f1287a));
                break;
        }
        return Unit.f46060a;
    }
}
