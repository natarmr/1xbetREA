package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20505a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ lr0(byte b, int i, a4x a4xVar, Function1 function1) {
        this.f20505a = b;
        this.b = a4xVar;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f20505a) {
            case 0:
                num.getClass();
                j2e.u(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                num.intValue();
                bkb.A(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                num.intValue();
                bkb.o(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 3:
                num.intValue();
                o2e.q(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 4:
                num.intValue();
                qzb.v(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 5:
                num.intValue();
                kcx.f(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                num.intValue();
                o2e.N(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
