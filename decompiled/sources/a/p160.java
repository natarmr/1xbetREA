package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class p160 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26185a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ fdp c;

    public /* synthetic */ p160(Function1 function1, fdp fdpVar, byte b) {
        this.f26185a = b;
        this.b = function1;
        this.c = fdpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26185a;
        fdp fdpVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new wy50(((edp) fdpVar).f7629a.f38935a));
                break;
            case 1:
                wcp wcpVar = ((edp) fdpVar).f7629a;
                function1.invoke(new ty50(wcpVar.f38935a, wcpVar.e));
                break;
            case 2:
                function1.invoke(new nb80(((edp) fdpVar).f7629a.f38935a));
                break;
            default:
                wcp wcpVar2 = ((edp) fdpVar).f7629a;
                function1.invoke(new ib80(wcpVar2.f38935a, wcpVar2.e));
                break;
        }
        return Unit.f46060a;
    }
}
