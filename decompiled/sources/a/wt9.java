package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wt9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39730a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ wt9(int i, int i2, Function1 function1) {
        this.f39730a = (byte) 0;
        this.c = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f39730a) {
            case 0:
                num.getClass();
                hmw0.M(this.c, this.b, fetVar, x8x.L(1));
                break;
            case 1:
                num.getClass();
                ay3.x(this.b, fetVar, x8x.L(this.c | 1));
                break;
            case 2:
                num.intValue();
                y9a.A(this.b, fetVar, x8x.L(this.c | 1));
                break;
            case 3:
                num.intValue();
                rsr0.d(this.b, fetVar, x8x.L(this.c | 1));
                break;
            case 4:
                num.intValue();
                vbw0.q(this.b, fetVar, x8x.L(this.c | 1));
                break;
            default:
                num.getClass();
                wb.w(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ wt9(Function1 function1, int i) {
        this.f39730a = (byte) 1;
        this.b = function1;
        this.c = i;
    }

    public /* synthetic */ wt9(Function1 function1, int i, byte b) {
        this.f39730a = b;
        this.b = function1;
        this.c = i;
    }
}
