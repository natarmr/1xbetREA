package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dyj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6897a;
    public final /* synthetic */ xk80 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ dyj(xk80 xk80Var, l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f6897a = b;
        this.b = xk80Var;
        this.c = l7m0Var;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6897a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                obc.y(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            case 1:
                gco.a(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            case 2:
                gco.b(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                gco.c(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
