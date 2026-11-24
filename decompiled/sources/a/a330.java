package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a330 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f154a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ ugd f;

    public /* synthetic */ a330(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, xdr xdrVar, ugd ugdVar3, int i) {
        this.b = mm40Var;
        this.d = ugdVar;
        this.e = ugdVar2;
        this.c = xdrVar;
        this.f = ugdVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f154a) {
            case 0:
                ((Integer) obj2).getClass();
                xdx.d(x8x.L(25009), this.d, this.e, this.f, this.c, (fet) obj, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                m7x.k(x8x.L(28033), this.d, this.e, this.f, this.c, (fet) obj, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ a330(mm40 mm40Var, xdr xdrVar, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, int i) {
        this.b = mm40Var;
        this.c = xdrVar;
        this.d = ugdVar;
        this.e = ugdVar2;
        this.f = ugdVar3;
    }
}
