package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t7m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33475a;
    public final /* synthetic */ c8m b;
    public final /* synthetic */ r7m c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ t7m(c8m c8mVar, r7m r7mVar, Function0 function0, int i, byte b) {
        this.f33475a = b;
        this.b = c8mVar;
        this.c = r7mVar;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33475a;
        int i = this.e;
        Function0 function0 = this.d;
        r7m r7mVar = this.c;
        c8m c8mVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fxb.t(c8mVar, r7mVar, function0, fetVar, x8x.L(i | 1));
                break;
            default:
                dyb.A(c8mVar, r7mVar, function0, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
