package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nzb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24364a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ ugd e;

    public /* synthetic */ nzb(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, int i, byte b) {
        this.f24364a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = ugdVar2;
        this.e = ugdVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24364a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(3505);
                ozb.f(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(3505);
                pzb.b(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(3505);
                qzb.d(this.b, this.c, this.d, this.e, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(3505);
                vdx.n(this.b, this.c, this.d, this.e, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }
}
