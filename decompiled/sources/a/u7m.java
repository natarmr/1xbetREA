package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u7m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35191a;
    public final /* synthetic */ r7m b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ u7m(r7m r7mVar, Function0 function0, int i, byte b) {
        this.f35191a = b;
        this.b = r7mVar;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35191a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                fxb.e(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                dyb.h(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
