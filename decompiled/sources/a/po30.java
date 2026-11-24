package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class po30 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27313a;
    public final /* synthetic */ mx80 b;

    public /* synthetic */ po30(mx80 mx80Var, byte b) {
        this.f27313a = b;
        this.b = mx80Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f27313a;
        mx80 mx80Var = this.b;
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
                    x9x.q(mm40Var, mx80Var, fetVar, iIntValue & 14);
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
                    x9x.q(mm40Var, mx80Var, fetVar, iIntValue & 14);
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
                    x9x.q(mm40Var, mx80Var, fetVar, iIntValue & 14);
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
                    x9x.q(mm40Var, mx80Var, fetVar, iIntValue & 14);
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
                    x9x.q(mm40Var, mx80Var, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
