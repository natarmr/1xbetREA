package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fya implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10349a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ fya(Function1 function1, boolean z, byte b) {
        this.f10349a = b;
        this.c = function1;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10349a;
        boolean z = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                if (z) {
                    function1.invoke(rxa.f31255a);
                } else {
                    function1.invoke(ixa.f15532a);
                }
                break;
            case 1:
                if (z) {
                    function1.invoke(z420.f43748a);
                }
                break;
            case 2:
                function1.invoke(z ? h420.f12413a : p420.f26329a);
                break;
            default:
                function1.invoke(Boolean.valueOf(!z));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fya(boolean z, Function1 function1, byte b) {
        this.f10349a = b;
        this.b = z;
        this.c = function1;
    }
}
