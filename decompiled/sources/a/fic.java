package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class fic implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9580a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ twm0 c;

    public /* synthetic */ fic(Function1 function1, twm0 twm0Var, byte b) {
        this.f9580a = b;
        this.b = function1;
        this.c = twm0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9580a;
        twm0 twm0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((mvl) obj).getClass();
                function1.invoke(Long.valueOf(twm0Var.f34658a));
                break;
            default:
                ((mvl) obj).getClass();
                function1.invoke(Long.valueOf(twm0Var.f34658a));
                break;
        }
        return Unit.f46060a;
    }
}
