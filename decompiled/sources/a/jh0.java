package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16502a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ nh0 c;

    public /* synthetic */ jh0(Function1 function1, nh0 nh0Var, byte b) {
        this.f16502a = b;
        this.b = function1;
        this.c = nh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16502a;
        nh0 nh0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                if (function1 != null) {
                    function1.invoke(Long.valueOf(nh0Var.f23509a));
                }
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(Long.valueOf(nh0Var.f23509a));
                }
                break;
            case 2:
                if (function1 != null) {
                    function1.invoke(Long.valueOf(nh0Var.f23509a));
                }
                break;
            case 3:
                if (function1 != null) {
                    function1.invoke(Long.valueOf(nh0Var.f23509a));
                }
                break;
            default:
                if (function1 != null) {
                    function1.invoke(Long.valueOf(nh0Var.f23509a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
