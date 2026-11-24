package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jgx implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16500a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ hh80 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ xdr h;
    public final /* synthetic */ int i;

    public /* synthetic */ jgx(mm40 mm40Var, pz40 pz40Var, xcz xczVar, hh80 hh80Var, Function1 function1, Function1 function2, xdr xdrVar, int i, byte b) {
        this.f16500a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = xczVar;
        this.e = hh80Var;
        this.f = function1;
        this.g = function2;
        this.h = xdrVar;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16500a;
        int i = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                vvw.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xvw.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                zvw.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                cww.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xww.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
