package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ktl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18872a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ itl c;

    public /* synthetic */ ktl(Function1 function1, itl itlVar, byte b) {
        this.f18872a = b;
        this.b = function1;
        this.c = itlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18872a;
        itl itlVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(itlVar.b);
                break;
            default:
                function1.invoke(itlVar.b);
                break;
        }
        return Unit.f46060a;
    }
}
