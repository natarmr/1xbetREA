package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aul0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1485a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xdr d;
    public final /* synthetic */ xdr e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ ugd g;
    public final /* synthetic */ ugd h;

    public /* synthetic */ aul0(mm40 mm40Var, boolean z, xdr xdrVar, xdr xdrVar2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, int i, byte b) {
        this.f1485a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = xdrVar;
        this.e = xdrVar2;
        this.f = ugdVar;
        this.g = ugdVar2;
        this.h = ugdVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1485a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1794049);
                xww.p(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1794049);
                qxw.q(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
