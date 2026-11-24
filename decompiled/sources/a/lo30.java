package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lo30 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20372a;
    public final /* synthetic */ ip00 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ lo30(ip00 ip00Var, Function0 function0, byte b) {
        this.f20372a = b;
        this.b = ip00Var;
        this.c = function0;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f20372a;
        Function0 function0 = this.c;
        ip00 ip00Var = this.b;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ju70.e(mm40Var, ip00Var.f, function0, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ju70.e(mm40Var, ip00Var.f, function0, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ju70.e(mm40Var, ip00Var.f, function0, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ju70.e(mm40Var, ip00Var.f, function0, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
            default:
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ju70.e(mm40Var, ip00Var.f, function0, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
