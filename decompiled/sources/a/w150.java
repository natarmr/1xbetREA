package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w150 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38382a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ k250 c;

    public /* synthetic */ w150(Function1 function1, k250 k250Var, byte b) {
        this.f38382a = b;
        this.b = function1;
        this.c = k250Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38382a;
        k250 k250Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                ((String) obj2).getClass();
                function1.invoke(new p150(jLongValue, ((i250) k250Var).f14033a));
                break;
            default:
                function1.invoke(new w050(((Number) obj).intValue(), ((e250) k250Var).f7069a));
                break;
        }
        return Unit.f46060a;
    }
}
