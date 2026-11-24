package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zjg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44480a;
    public final /* synthetic */ xk80 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ zjg(xk80 xk80Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, int i, byte b) {
        this.f44480a = b;
        this.b = xk80Var;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44480a) {
            case 0:
                ((Integer) obj2).intValue();
                ntr.W(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                frv.a(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                frv.a(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                frv.b(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                cfx0.y(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
        }
        return Unit.f46060a;
    }
}
