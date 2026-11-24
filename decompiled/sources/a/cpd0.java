package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cpd0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4740a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ xdr e;
    public final /* synthetic */ int f;

    public /* synthetic */ cpd0(mm40 mm40Var, boolean z, Function0 function0, xdr xdrVar, int i, byte b) {
        this.f4740a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = function0;
        this.e = xdrVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4740a) {
            case 0:
                ((Integer) obj2).getClass();
                bww.o(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xvw.l(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
        }
        return Unit.f46060a;
    }
}
