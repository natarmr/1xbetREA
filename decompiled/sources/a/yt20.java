package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yt20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43197a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ eao c;
    public final /* synthetic */ a4x d;
    public final /* synthetic */ xdr e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ yt20(mm40 mm40Var, eao eaoVar, a4x a4xVar, xdr xdrVar, Function1 function1, Function1 function2, int i, byte b) {
        this.f43197a = b;
        this.b = mm40Var;
        this.c = eaoVar;
        this.d = a4xVar;
        this.e = xdrVar;
        this.f = function1;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43197a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                bww.f(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                cww.d(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                xww.h(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
