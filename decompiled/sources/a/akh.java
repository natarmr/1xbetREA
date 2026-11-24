package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class akh implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1022a;
    public final /* synthetic */ lwv0 b;

    public /* synthetic */ akh(lwv0 lwv0Var, byte b) {
        this.f1022a = b;
        this.b = lwv0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f1022a;
        lwv0 lwv0Var = this.b;
        switch (b) {
            case 0:
                pwv0 pwv0Var = (pwv0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Number) obj3).intValue();
                pwv0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(pwv0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    jar0.c.j(pwv0Var, lwv0Var, fetVar, Integer.valueOf(iIntValue & 14));
                } else {
                    fetVar.X();
                }
                break;
            default:
                pwv0 pwv0Var2 = (pwv0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                pwv0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(pwv0Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    knx.f.j(pwv0Var2, lwv0Var, fetVar2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
