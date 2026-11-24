package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class n9x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23161a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ jax c;

    public /* synthetic */ n9x(Function2 function2, jax jaxVar, byte b) {
        this.f23161a = b;
        this.b = function2;
        this.c = jaxVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23161a;
        jax jaxVar = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((hax) jaxVar).getClass();
                function2.invoke(bool, ch00.SHORT_STATISTIC);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                function2.invoke(bool2, ((fax) jaxVar).f9230a);
                break;
        }
        return Unit.f46060a;
    }
}
