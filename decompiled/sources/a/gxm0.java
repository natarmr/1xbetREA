package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class gxm0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12083a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ mxm0 c;

    public /* synthetic */ gxm0(Function1 function1, mxm0 mxm0Var, byte b) {
        this.f12083a = b;
        this.b = function1;
        this.c = mxm0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12083a;
        mxm0 mxm0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((mvl) obj).getClass();
                function1.invoke(new dxm0(mxm0Var.f22563a));
                break;
            default:
                ((mvl) obj).getClass();
                function1.invoke(new dxm0(mxm0Var.f22563a));
                break;
        }
        return Unit.f46060a;
    }
}
