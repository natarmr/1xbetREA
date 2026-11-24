package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oe4 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25106a;
    public final /* synthetic */ if4 b;
    public final /* synthetic */ wpq c;
    public final /* synthetic */ pkk0 d;
    public final /* synthetic */ ze4 e;

    public /* synthetic */ oe4(if4 if4Var, wpq wpqVar, pkk0 pkk0Var, ze4 ze4Var, byte b) {
        this.f25106a = b;
        this.b = if4Var;
        this.c = wpqVar;
        this.d = pkk0Var;
        this.e = ze4Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        switch (this.f25106a) {
            case 0:
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                qek0 qek0Var = ze4.g2;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if4 if4Var = this.b;
                    j120.f((iIntValue & 14) | 432, u1c.M(1275524574, new un6(if4Var, (byte) 22), fetVar), u1c.M(1425665917, new oe4(if4Var, this.c, this.d, this.e, (byte) 1), fetVar), fetVar, mm40Var);
                } else {
                    fetVar.X();
                }
                break;
            default:
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                qek0 qek0Var2 = ze4.g2;
                mm40Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    wul wulVar = this.b.b;
                    wpq wpqVar = this.c;
                    boolean zI = fetVar2.i(wpqVar);
                    pkk0 pkk0Var = this.d;
                    boolean zG = zI | fetVar2.g(pkk0Var);
                    ze4 ze4Var = this.e;
                    boolean zI2 = zG | fetVar2.i(ze4Var);
                    Object objP = fetVar2.P();
                    if (zI2 || objP == ukd.f35823a) {
                        objP = new ue4(wpqVar, pkk0Var, ze4Var, (byte) 1);
                        fetVar2.o0(objP);
                    }
                    qzb.n(mm40Var2, wulVar, (Function0) objP, fetVar2, iIntValue2 & 14, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
