package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ra5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30117a;
    public final /* synthetic */ ua5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ra5(ua5 ua5Var, int i, byte b) {
        this.f30117a = b;
        this.b = ua5Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30117a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                mrv.n(this.b, fetVar, x8x.L(this.c | 1));
                break;
            case 1:
                mrv.o(this.b, fetVar, x8x.L(this.c | 1));
                break;
            default:
                cjx.x(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }
}
