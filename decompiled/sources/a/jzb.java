package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jzb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17403a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ tzb c;

    public /* synthetic */ jzb(Function1 function1, tzb tzbVar, byte b) {
        this.f17403a = b;
        this.b = function1;
        this.c = tzbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17403a;
        tzb tzbVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new u2f0(tzbVar.f34797a));
                break;
            default:
                function1.invoke(new u2f0(tzbVar.f34797a));
                break;
        }
        return Unit.f46060a;
    }
}
