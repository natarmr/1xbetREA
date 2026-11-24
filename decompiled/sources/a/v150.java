package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class v150 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36613a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ k250 c;

    public /* synthetic */ v150(Function1 function1, k250 k250Var, byte b) {
        this.f36613a = b;
        this.b = function1;
        this.c = k250Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36613a;
        k250 k250Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                function1.invoke(new f150(st0Var.f32750a, ((a250) k250Var).f108a));
                break;
            case 1:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                function1.invoke(new g150(st0Var2.f32750a, ((a250) k250Var).f108a));
                break;
            case 2:
                function1.invoke(new g150(((Number) obj).longValue(), ((g250) k250Var).f10546a));
                break;
            case 3:
                function1.invoke(new p150(((Number) obj).longValue(), ((h250) k250Var).f12315a));
                break;
            default:
                function1.invoke(new g150(((Number) obj).longValue(), ((j250) k250Var).f15766a));
                break;
        }
        return Unit.f46060a;
    }
}
