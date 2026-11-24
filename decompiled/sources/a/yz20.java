package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yz20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43497a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ xdr g;
    public final /* synthetic */ xdr h;
    public final /* synthetic */ xdr i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ int k;

    public /* synthetic */ yz20(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, Function1 function1, Function1 function2, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, Function1 function3, int i, byte b) {
        this.f43497a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = xczVar;
        this.e = function1;
        this.f = function2;
        this.g = xdrVar;
        this.h = xdrVar2;
        this.i = xdrVar3;
        this.j = function3;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43497a) {
            case 0:
                ((Integer) obj2).getClass();
                x9x.l(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, x8x.L(this.k | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kcx.i(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, x8x.L(this.k | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ucx.m(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, x8x.L(this.k | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                bdx.j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, x8x.L(this.k | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vdx.i(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, x8x.L(this.k | 1));
                break;
        }
        return Unit.f46060a;
    }
}
