package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s170 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31441a = 1;
    public final /* synthetic */ q070 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ s170(q070 q070Var, Function1 function1) {
        this.b = q070Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31441a;
        Function1 function1 = this.c;
        q070 q070Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                bsr0.x(q070Var, function1, fetVar, x8x.L(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bsr0.x(q070Var, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ s170(q070 q070Var, Function1 function1, int i) {
        this.b = q070Var;
        this.c = function1;
    }
}
