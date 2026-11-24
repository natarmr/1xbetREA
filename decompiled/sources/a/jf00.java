package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jf00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16401a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ oea0 c;

    public /* synthetic */ jf00(Function1 function1, oea0 oea0Var, byte b) {
        this.f16401a = b;
        this.b = function1;
        this.c = oea0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16401a;
        oea0 oea0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(oea0Var.f25114a);
                break;
            default:
                function1.invoke(oea0Var.f25114a);
                break;
        }
        return Unit.f46060a;
    }
}
