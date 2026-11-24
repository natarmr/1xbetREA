package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c6m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3823a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ v5m c;

    public /* synthetic */ c6m(Function1 function1, v5m v5mVar, byte b) {
        this.f3823a = b;
        this.b = function1;
        this.c = v5mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3823a;
        v5m v5mVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(Long.valueOf(v5mVar.f36832a));
                break;
            case 1:
                function1.invoke(Long.valueOf(v5mVar.f36832a));
                break;
            default:
                function1.invoke(Long.valueOf(v5mVar.f36832a));
                break;
        }
        return Unit.f46060a;
    }
}
