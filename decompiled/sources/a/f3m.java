package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f3m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8870a;
    public final /* synthetic */ b3m b;
    public final /* synthetic */ int c;

    public /* synthetic */ f3m(b3m b3mVar, int i, byte b) {
        this.f8870a = b;
        this.b = b3mVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f8870a) {
            case 0:
                num.intValue();
                ieb.g(this.b, fetVar, x8x.L(this.c | 1));
                break;
            default:
                num.getClass();
                ieb.h(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }
}
