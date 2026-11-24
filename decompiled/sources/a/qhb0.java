package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qhb0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28729a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ ugd e;

    public /* synthetic */ qhb0(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, ugd ugdVar, int i, byte b) {
        this.f28729a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = function1;
        this.e = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28729a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(3073);
                k9x.n(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(3073);
                jar0.J(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(3073);
                jpm0.f(this.b, this.c, this.d, this.e, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
