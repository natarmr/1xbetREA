package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aqq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1310a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ awr0 c;

    public /* synthetic */ aqq0(Function1 function1, awr0 awr0Var, byte b) {
        this.f1310a = b;
        this.b = function1;
        this.c = awr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1310a;
        awr0 awr0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(Integer.valueOf(awr0Var.f1589a));
                dyb.u0();
                return Boolean.TRUE;
            case 1:
                dyb.Q(new aqq0(function1, awr0Var, (byte) 0));
                return Unit.f46060a;
            case 2:
                dyb.Q(new aqq0(function1, awr0Var, (byte) 3));
                return Unit.f46060a;
            default:
                function1.invoke(Integer.valueOf(awr0Var.f1589a));
                dyb.u0();
                return Boolean.TRUE;
        }
    }
}
