package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mna implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22079a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ona c;

    public /* synthetic */ mna(Function1 function1, ona onaVar, byte b) {
        this.f22079a = b;
        this.b = function1;
        this.c = onaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22079a;
        ona onaVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(onaVar);
                break;
            default:
                function1.invoke(onaVar);
                break;
        }
        return Unit.f46060a;
    }
}
