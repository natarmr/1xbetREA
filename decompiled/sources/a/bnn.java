package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class bnn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2892a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ qln c;

    public /* synthetic */ bnn(Function1 function1, qln qlnVar, byte b) {
        this.f2892a = b;
        this.b = function1;
        this.c = qlnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2892a;
        qln qlnVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new xjn(qlnVar.f28943a));
                break;
            case 1:
                function1.invoke(new zjn(qlnVar.f28943a));
                break;
            case 2:
                function1.invoke(new akn(qlnVar.f28943a));
                break;
            default:
                function1.invoke(new yjn(qlnVar.f28943a));
                break;
        }
        return Unit.f46060a;
    }
}
