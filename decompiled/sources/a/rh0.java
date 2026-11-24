package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30463a;
    public final /* synthetic */ di0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ rh0(di0 di0Var, Function1 function1, int i, byte b) {
        this.f30463a = b;
        this.b = di0Var;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30463a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x8f.b(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                qjj.a(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                eeq.a(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 3:
                ntr.b(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                knx.b(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
