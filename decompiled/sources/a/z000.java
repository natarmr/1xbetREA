package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class z000 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43542a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g100 c;

    public /* synthetic */ z000(Function1 function1, g100 g100Var, byte b) {
        this.f43542a = b;
        this.b = function1;
        this.c = g100Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43542a;
        g100 g100Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new pzz(((mzz) g100Var).f22674a));
                break;
            default:
                function1.invoke(new pzz(((mzz) g100Var).f22674a));
                break;
        }
        return Unit.f46060a;
    }
}
