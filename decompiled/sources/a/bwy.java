package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bwy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3350a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ olp c;

    public /* synthetic */ bwy(Function1 function1, olp olpVar, byte b) {
        this.f3350a = b;
        this.b = function1;
        this.c = olpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3350a;
        olp olpVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new rmp(olpVar.f25467a, olpVar.c, olpVar.m, olpVar.b));
                break;
            case 1:
                function1.invoke(new hmp(olpVar.f25467a));
                break;
            case 2:
                function1.invoke(new hmp(olpVar.f25467a));
                break;
            case 3:
                function1.invoke(new rmp(olpVar.f25467a, olpVar.c, olpVar.m, olpVar.b));
                break;
            case 4:
                function1.invoke(new rmp(olpVar.f25467a, olpVar.c, olpVar.m, olpVar.b));
                break;
            case 5:
                function1.invoke(new hmp(olpVar.f25467a));
                break;
            case 6:
                function1.invoke(new emp(olpVar.f25467a));
                break;
            case 7:
                function1.invoke(new rmp(olpVar.f25467a, olpVar.c, olpVar.m, olpVar.b));
                break;
            case 8:
                function1.invoke(new hmp(olpVar.f25467a));
                break;
            default:
                function1.invoke(new ylp(new npn(olpVar.f25467a, olpVar.c, Long.valueOf(olpVar.d), false), !olpVar.j.f16728a));
                break;
        }
        return Unit.f46060a;
    }
}
