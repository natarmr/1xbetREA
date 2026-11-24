package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qhc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28730a;
    public final /* synthetic */ wpq b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ qhc(wpq wpqVar, Function1 function1, byte b) {
        this.f28730a = b;
        this.b = wpqVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28730a;
        Function1 function1 = this.c;
        wpq wpqVar = this.b;
        switch (b) {
            case 0:
                ((ypq) wpqVar).b(false);
                function1.invoke(ihc.f14773a);
                break;
            default:
                ((ypq) wpqVar).b(false);
                function1.invoke(g5y.f10738a);
                break;
        }
        return Unit.f46060a;
    }
}
