package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yzp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43527a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ixp0 c;

    public /* synthetic */ yzp0(mm40 mm40Var, ixp0 ixp0Var, byte b) {
        this.f43527a = b;
        this.b = mm40Var;
        this.c = ixp0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43527a;
        ixp0 ixp0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rsm0.h(mm40Var, ixp0Var, null, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                num.getClass();
                qsm0.h(mm40Var, ixp0Var, fetVar, x8x.L(1));
                break;
            case 2:
                int iIntValue2 = num.intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rsm0.h(mm40Var, ixp0Var, null, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                qsm0.i(mm40Var, ixp0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ yzp0(mm40 mm40Var, ixp0 ixp0Var, int i, byte b) {
        this.f43527a = b;
        this.b = mm40Var;
        this.c = ixp0Var;
    }
}
