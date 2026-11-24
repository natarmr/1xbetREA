package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bvm0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3285a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ rwm0 c;

    public /* synthetic */ bvm0(Function1 function1, rwm0 rwm0Var, byte b) {
        this.f3285a = b;
        this.b = function1;
        this.c = rwm0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3285a;
        rwm0 rwm0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new bvm0(function1, rwm0Var, (byte) 1)).a();
                break;
            default:
                function1.invoke(new wy20(rwm0Var.b));
                break;
        }
        return Unit.f46060a;
    }
}
