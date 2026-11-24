package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nq00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23935a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ xdr d;
    public final /* synthetic */ xdr e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ ugd g;

    public /* synthetic */ nq00(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, int i, byte b) {
        this.f23935a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = xdrVar;
        this.e = xdrVar2;
        this.f = ugdVar2;
        this.g = ugdVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23935a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(221239);
                g7x.d(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(221239);
                k7x.j(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(221239);
                l7x.o(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(221239);
                m7x.c(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(221239);
                n7x.c(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(221239);
                o5n0.d(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL6);
                break;
        }
        return Unit.f46060a;
    }
}
