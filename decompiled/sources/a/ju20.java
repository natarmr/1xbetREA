package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ju20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17131a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ uv20 c;
    public final /* synthetic */ xdr d;
    public final /* synthetic */ xdr e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ ju20(mm40 mm40Var, uv20 uv20Var, xdr xdrVar, xdr xdrVar2, Function1 function1, int i, byte b) {
        this.f17131a = b;
        this.b = mm40Var;
        this.c = uv20Var;
        this.d = xdrVar;
        this.e = xdrVar2;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17131a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                j0x.f(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                q0x.k(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                s0x.k(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                g1x.c(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                x1x.h(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
