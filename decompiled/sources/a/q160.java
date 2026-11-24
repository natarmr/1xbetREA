package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class q160 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27937a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ sbs0 c;

    public /* synthetic */ q160(Function1 function1, sbs0 sbs0Var, byte b) {
        this.f27937a = b;
        this.b = function1;
        this.c = sbs0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27937a;
        sbs0 sbs0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                qbs0 qbs0Var = sbs0Var.f31951a;
                qbs0Var.getClass();
                function1.invoke(new qy50(qbs0Var));
                break;
            case 1:
                qbs0 qbs0Var2 = sbs0Var.f31951a;
                qbs0Var2.getClass();
                function1.invoke(new py50(qbs0Var2));
                break;
            default:
                qbs0 qbs0Var3 = sbs0Var.f31951a;
                qbs0Var3.getClass();
                function1.invoke(new vy50(qbs0Var3));
                break;
        }
        return Unit.f46060a;
    }
}
