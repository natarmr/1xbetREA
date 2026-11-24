package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class euq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8434a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ehm0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ euq(mm40 mm40Var, ehm0 ehm0Var, boolean z, Function1 function1, int i, byte b) {
        this.f8434a = b;
        this.b = mm40Var;
        this.c = ehm0Var;
        this.d = z;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8434a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                ibc.w(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                wzb.z(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
