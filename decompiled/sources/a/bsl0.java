package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bsl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3136a = 0;
    public final /* synthetic */ nsl0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ bsl0(nsl0 nsl0Var, Function1 function1) {
        this.b = nsl0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3136a;
        Function1 function1 = this.c;
        nsl0 nsl0Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o050.e(null, nsl0Var.i, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                o050.D(nsl0Var, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bsl0(nsl0 nsl0Var, Function1 function1, int i) {
        this.b = nsl0Var;
        this.c = function1;
    }
}
