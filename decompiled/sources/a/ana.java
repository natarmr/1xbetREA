package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ana implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1140a;
    public final /* synthetic */ j9m0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ana(j9m0 j9m0Var, int i, byte b) {
        this.f1140a = b;
        this.b = j9m0Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1140a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                rq8.C(this.b, fetVar, x8x.L(this.c | 1));
                break;
            default:
                xf0.p(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }
}
