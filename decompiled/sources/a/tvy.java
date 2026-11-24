package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tvy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34624a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ xkp c;

    public /* synthetic */ tvy(Function1 function1, xkp xkpVar, byte b) {
        this.f34624a = b;
        this.b = function1;
        this.c = xkpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34624a;
        xkp xkpVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new zlp(xkpVar.f41039a, xkpVar.c));
                break;
            case 1:
                function1.invoke(new zlp(xkpVar.f41039a, xkpVar.c));
                break;
            case 2:
                function1.invoke(new zlp(xkpVar.f41039a, xkpVar.c));
                break;
            case 3:
                function1.invoke(new zlp(xkpVar.f41039a, xkpVar.c));
                break;
            default:
                function1.invoke(new zlp(xkpVar.f41039a, xkpVar.c));
                break;
        }
        return Unit.f46060a;
    }
}
