package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xod0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41213a;
    public final /* synthetic */ epd0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xdr d;

    public /* synthetic */ xod0(epd0 epd0Var, Function1 function1, xdr xdrVar, int i, byte b) {
        this.f41213a = b;
        this.b = epd0Var;
        this.c = function1;
        this.d = xdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41213a;
        xdr xdrVar = this.d;
        Function1 function1 = this.c;
        epd0 epd0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                bww.n(epd0Var, function1, xdrVar, fetVar, x8x.L(7));
                break;
            default:
                xvw.k(epd0Var, function1, xdrVar, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
