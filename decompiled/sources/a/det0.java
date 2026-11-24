package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class det0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5967a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ de80 c;

    public /* synthetic */ det0(Function2 function2, de80 de80Var, byte b) {
        this.f5967a = b;
        this.b = function2;
        this.c = de80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5967a;
        de80 de80Var = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                dyb.Q(new det0(function2, de80Var, (byte) 1));
                return Unit.f46060a;
            default:
                function2.invoke(Integer.valueOf(de80Var.c), Long.valueOf(de80Var.d));
                dyb.u0();
                return Boolean.TRUE;
        }
    }
}
