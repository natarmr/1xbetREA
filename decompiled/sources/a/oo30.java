package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oo30 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25573a;
    public final /* synthetic */ vcd b;

    public /* synthetic */ oo30(vcd vcdVar, byte b) {
        this.f25573a = b;
        this.b = vcdVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        switch (this.f25573a) {
            case 0:
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x4d0.s(mm40Var, this.b, gqw0.b, fetVar, (iIntValue & 14) | 384, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mm40Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x4d0.s(mm40Var2, this.b, null, fetVar2, iIntValue2 & 14, 4);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mm40Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x4d0.s(mm40Var3, this.b, gqw0.b, fetVar3, (iIntValue3 & 14) | 384, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                mm40Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(mm40Var4) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x4d0.s(mm40Var4, this.b, gqw0.e, fetVar4, (iIntValue4 & 14) | 384, 0);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                mm40 mm40Var5 = (mm40) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                mm40Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(mm40Var5) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x4d0.s(mm40Var5, this.b, gqw0.h, fetVar5, (iIntValue5 & 14) | 384, 0);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
