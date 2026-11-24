package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class blw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2813a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ tim c;
    public final /* synthetic */ v3n d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ blw(mm40 mm40Var, tim timVar, v3n v3nVar, Function1 function1, int i, byte b) {
        this.f2813a = b;
        this.b = mm40Var;
        this.c = timVar;
        this.d = v3nVar;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2813a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                ebc.D(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                zsm0.e(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
