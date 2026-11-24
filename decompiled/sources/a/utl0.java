package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class utl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36261a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ xdr d;
    public final /* synthetic */ xdr e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ ugd g;
    public final /* synthetic */ int h;

    public /* synthetic */ utl0(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, int i, byte b) {
        this.f36261a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = xdrVar;
        this.e = xdrVar2;
        this.f = ugdVar2;
        this.g = ugdVar3;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36261a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                fww.p(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                cww.n(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
