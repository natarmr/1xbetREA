package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pg5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26938a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ql5 c;

    public /* synthetic */ pg5(Function1 function1, ql5 ql5Var, byte b) {
        this.f26938a = b;
        this.b = function1;
        this.c = ql5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26938a;
        ql5 ql5Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                dyb.Q(new pg5(function1, ql5Var, (byte) 3));
                return Unit.f46060a;
            case 1:
                dyb.Q(new pg5(function1, ql5Var, (byte) 2));
                return Unit.f46060a;
            case 2:
                function1.invoke(ql5Var);
                dyb.u0();
                return Boolean.TRUE;
            default:
                function1.invoke(ql5Var);
                dyb.u0();
                return Boolean.TRUE;
        }
    }
}
