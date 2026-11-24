package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hzb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13900a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ rzb c;

    public /* synthetic */ hzb(Function1 function1, rzb rzbVar, byte b) {
        this.f13900a = b;
        this.b = function1;
        this.c = rzbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13900a;
        rzb rzbVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new w8f0(rzbVar.f31351a));
                break;
            default:
                function1.invoke(new w8f0(rzbVar.f31351a));
                break;
        }
        return Unit.f46060a;
    }
}
