package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class c7s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3879a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ haj c;

    public /* synthetic */ c7s(Function1 function1, haj hajVar, byte b) {
        this.f3879a = b;
        this.b = function1;
        this.c = hajVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3879a;
        haj hajVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new l6s(((Boolean) obj).booleanValue(), ((aaj) hajVar).f527a));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((caj) hajVar).getClass();
                function1.invoke(new l6s(zBooleanValue, jaj.SHORT_STATISTIC));
                break;
        }
        return Unit.f46060a;
    }
}
