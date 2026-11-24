package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class fuv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10184a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ z3a0 c;
    public final /* synthetic */ ztv d;

    public /* synthetic */ fuv(Function1 function1, z3a0 z3a0Var, ztv ztvVar, byte b) {
        this.f10184a = b;
        this.b = function1;
        this.c = z3a0Var;
        this.d = ztvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10184a;
        ztv ztvVar = this.d;
        z3a0 z3a0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new ptv(z3a0Var, ztvVar.b, !z3a0Var.i));
                break;
            default:
                function1.invoke(new ptv(z3a0Var, ztvVar.b, !z3a0Var.i));
                break;
        }
        return Unit.f46060a;
    }
}
