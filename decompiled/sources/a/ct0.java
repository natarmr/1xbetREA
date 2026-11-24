package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ct0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4913a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ pe0 c;

    public /* synthetic */ ct0(Function1 function1, pe0 pe0Var, byte b) {
        this.f4913a = b;
        this.b = function1;
        this.c = pe0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4913a;
        pe0 pe0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                if (function1 != null) {
                    function1.invoke(pe0Var);
                }
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(pe0Var);
                }
                break;
            case 2:
                if (function1 != null) {
                    function1.invoke(pe0Var);
                }
                break;
            case 3:
                if (function1 != null) {
                    function1.invoke(pe0Var);
                }
                break;
            default:
                if (function1 != null) {
                    function1.invoke(pe0Var);
                }
                break;
        }
        return Unit.f46060a;
    }
}
