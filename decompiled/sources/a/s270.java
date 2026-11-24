package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s270 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31490a = 1;
    public final /* synthetic */ dd50 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ s270(dd50 dd50Var, Function1 function1) {
        this.b = dd50Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31490a;
        Function1 function1 = this.c;
        dd50 dd50Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                rsr0.L(dd50Var, function1, fetVar, x8x.L(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rsr0.L(dd50Var, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ s270(dd50 dd50Var, Function1 function1, int i) {
        this.b = dd50Var;
        this.c = function1;
    }
}
