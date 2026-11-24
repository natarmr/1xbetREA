package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rw1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31198a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ rw1(pz40 pz40Var, Function1 function1) {
        this.f31198a = (byte) 0;
        this.c = pz40Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31198a;
        pz40 pz40Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                function1.invoke(((Boolean) pz40Var.getValue()).booleanValue() ? frl.f10024a : frl.b);
                break;
            case 1:
                function1.invoke(pz40Var.getValue());
                break;
            case 2:
                function1.invoke(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                break;
            case 3:
                function1.invoke(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                break;
            case 4:
                if (function1 != null) {
                    function1.invoke(pz40Var.getValue());
                }
                break;
            default:
                function1.invoke(a6f0.f315a);
                if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ rw1(Function1 function1, pz40 pz40Var, byte b) {
        this.f31198a = b;
        this.b = function1;
        this.c = pz40Var;
    }
}
