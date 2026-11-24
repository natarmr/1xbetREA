package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e6a0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7272a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ h6a0 c;

    public /* synthetic */ e6a0(Function2 function2, h6a0 h6a0Var, byte b) {
        this.f7272a = b;
        this.b = function2;
        this.c = h6a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7272a;
        h6a0 h6a0Var = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new e6a0(function2, h6a0Var, (byte) 3)).a();
                break;
            case 1:
                function2.invoke(Long.valueOf(h6a0Var.f12521a), Boolean.valueOf(h6a0Var.d));
                break;
            case 2:
                fxb.D(ivb0.b, new e6a0(function2, h6a0Var, (byte) 1)).a();
                break;
            default:
                function2.invoke(Long.valueOf(h6a0Var.f12521a), Boolean.valueOf(h6a0Var.d));
                break;
        }
        return Unit.f46060a;
    }
}
