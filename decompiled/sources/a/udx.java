package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class udx implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35500a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ udx(mm40 mm40Var, l7m0 l7m0Var, int i, byte b) {
        this.f35500a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35500a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wdx.g(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
            case 1:
                xdx.b(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
            case 2:
                ydx.c(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
            default:
                zdx.d(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }
}
