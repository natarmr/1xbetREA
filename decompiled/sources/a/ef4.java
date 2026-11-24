package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef4 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7704a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ ugd c;

    public /* synthetic */ ef4(ugd ugdVar, ugd ugdVar2, byte b) {
        this.f7704a = b;
        this.b = ugdVar;
        this.c = ugdVar2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f7704a;
        ugd ugdVar = this.c;
        zhg0 zhg0Var = zhg0.f44392a;
        ugd ugdVar2 = this.b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.h(zBooleanValue) ? 4 : 2;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.X();
                } else if (zBooleanValue) {
                    fetVar.e0(-51943950);
                    ugdVar2.F(zhg0Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-51864590);
                    ugdVar.F(zhg0Var, fetVar, 0);
                    fetVar.r(false);
                }
                break;
            default:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.h(zBooleanValue) ? 4 : 2;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.X();
                } else if (zBooleanValue) {
                    fetVar.e0(1006580327);
                    ugdVar2.F(zhg0Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1006659687);
                    ugdVar.F(zhg0Var, fetVar, 0);
                    fetVar.r(false);
                }
                break;
        }
        return Unit.f46060a;
    }
}
