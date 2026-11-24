package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ac6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f614a;
    public final /* synthetic */ gc6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ac6(gc6 gc6Var, int i) {
        this.f614a = (byte) 0;
        this.b = gc6Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f614a) {
            case 0:
                num.getClass();
                jd8.k(this.b, fetVar, x8x.L(this.c | 1));
                break;
            case 1:
                num.intValue();
                jd8.l(this.b, fetVar, x8x.L(this.c | 1));
                break;
            case 2:
                num.intValue();
                dj8.I(this.b, fetVar, x8x.L(this.c | 1));
                break;
            case 3:
                num.intValue();
                dj8.H(this.b, fetVar, x8x.L(this.c | 1));
                break;
            default:
                num.intValue();
                dj8.w(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ac6(gc6 gc6Var, int i, byte b) {
        this.f614a = b;
        this.b = gc6Var;
        this.c = i;
    }
}
