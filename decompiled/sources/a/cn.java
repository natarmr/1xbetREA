package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4631a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ cn(int i, l7m0 l7m0Var, Function1 function1) {
        this.f4631a = (byte) 2;
        this.b = l7m0Var;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f4631a) {
            case 0:
                num.intValue();
                dj8.r(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                num.intValue();
                y860.c(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                num.getClass();
                jar0.z(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 3:
                num.intValue();
                saj.o(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 4:
                num.intValue();
                dwi0.j(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 5:
                num.intValue();
                kc5.X(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 6:
                num.intValue();
                jd8.r(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 7:
                num.getClass();
                oja0.q(this.b, this.d, this.c, fetVar, x8x.L(1));
                break;
            case 8:
                num.intValue();
                s5x0.n(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 9:
                num.intValue();
                cfx0.h(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 10:
                num.intValue();
                wb.j(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 11:
                num.intValue();
                ny9.h(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                num.intValue();
                y9a.o(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cn(l7m0 l7m0Var, int i, Function1 function1, int i2) {
        this.f4631a = (byte) 7;
        this.b = l7m0Var;
        this.d = i;
        this.c = function1;
    }

    public /* synthetic */ cn(l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f4631a = b;
        this.b = l7m0Var;
        this.c = function1;
        this.d = i;
    }
}
