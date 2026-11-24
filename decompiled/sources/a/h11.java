package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h11 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12259a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ lh80 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ h11(mm40 mm40Var, l7m0 l7m0Var, lh80 lh80Var, Function1 function1, int i, byte b) {
        this.f12259a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = lh80Var;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12259a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                qjj.b(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(7);
                knx.c(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
