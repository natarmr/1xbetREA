package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zm80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44613a;
    public final /* synthetic */ w6n b;
    public final /* synthetic */ k5a0 c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ zm80(w6n w6nVar, k5a0 k5a0Var, Function2 function2, byte b) {
        this.f44613a = b;
        this.b = w6nVar;
        this.c = k5a0Var;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44613a;
        Function2 function2 = this.d;
        k5a0 k5a0Var = this.c;
        w6n w6nVar = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b5a0 b5a0Var = (b5a0) k5a0Var;
                    slb.s(mrv.k0(hap.b(w6nVar, b5a0Var.d, (k6z) fetVar.k(bmd.n)), "FAVORITE_ICON"), b5a0Var, function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b5a0 b5a0Var2 = (b5a0) k5a0Var;
                    slb.s(mrv.k0(hap.b(w6nVar, b5a0Var2.d, (k6z) fetVar.k(bmd.n)), "FAVORITE_ICON"), b5a0Var2, function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b5a0 b5a0Var3 = (b5a0) k5a0Var;
                    slb.s(mrv.k0(hap.b(w6nVar, b5a0Var3.d, (k6z) fetVar.k(bmd.n)), "FAVORITE_ICON"), b5a0Var3, function2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
