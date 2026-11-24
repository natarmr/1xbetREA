package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class puh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27617a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ j240 c;

    public /* synthetic */ puh(Function1 function1, j240 j240Var, byte b) {
        this.f27617a = b;
        this.b = function1;
        this.c = j240Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27617a;
        j240 j240Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new huh((lvh) j240Var.f15765a));
                break;
            case 1:
                function1.invoke(new wpw((gqw) j240Var.f15765a));
                break;
            case 2:
                function1.invoke(new rqd0((xsd0) j240Var.f15765a));
                break;
            case 3:
                function1.invoke(new m5a0((w8a0) j240Var.f15765a));
                break;
            default:
                function1.invoke(new plv0((wkv0) j240Var.f15765a));
                break;
        }
        return Unit.f46060a;
    }
}
