package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uo50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35995a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ it50 c;

    public /* synthetic */ uo50(Function2 function2, it50 it50Var, byte b) {
        this.f35995a = b;
        this.b = function2;
        this.c = it50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35995a;
        it50 it50Var = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                function2.invoke(Integer.valueOf(it50Var.f15340a), Integer.valueOf(it50Var.b));
                break;
            default:
                function2.invoke(Integer.valueOf(it50Var.f15340a), Integer.valueOf(it50Var.b));
                break;
        }
        return Unit.f46060a;
    }
}
