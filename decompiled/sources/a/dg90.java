package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dg90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6033a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ xdr d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ int f;

    public /* synthetic */ dg90(mm40 mm40Var, pz40 pz40Var, xdr xdrVar, ugd ugdVar, int i, byte b) {
        this.f6033a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = xdrVar;
        this.e = ugdVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6033a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                b5x.m(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                q5x.r(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                n6x.d(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                d7x.f(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                b5x.m(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                d7x.f(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                n6x.d(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                q5x.r(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
