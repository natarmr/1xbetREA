package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22066a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ mn(Function1 function1, Function0 function0) {
        this.f22066a = (byte) 0;
        this.c = function1;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22066a;
        Function1 function1 = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function1.invoke("");
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                function1.invoke(u94.f35264a);
                break;
            case 2:
                function0.invoke();
                function1.invoke(fa4.f9188a);
                break;
            case 3:
                function0.invoke();
                function1.invoke(na4.f23173a);
                break;
            default:
                function0.invoke();
                function1.invoke(ga4.f10948a);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mn(Function0 function0, Function1 function1, byte b) {
        this.f22066a = b;
        this.b = function0;
        this.c = function1;
    }
}
