package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sej implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32079a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ulq0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ sej(boolean z, ulq0 ulq0Var, Function1 function1, Function1 function2, byte b) {
        this.f32079a = b;
        this.b = z;
        this.c = ulq0Var;
        this.d = function1;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32079a;
        Function1 function1 = this.e;
        Function1 function2 = this.d;
        ulq0 ulq0Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z && ulq0Var != ulq0.b) {
                    function2.invoke(am.b);
                    function1.invoke(ifj.b);
                }
                break;
            default:
                if (z && ulq0Var == ulq0.f35886a) {
                    function2.invoke(am.f1086a);
                    function1.invoke(ifj.b);
                }
                break;
        }
        return Unit.f46060a;
    }
}
