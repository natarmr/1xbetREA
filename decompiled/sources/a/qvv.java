package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qvv implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29407a;
    public final /* synthetic */ egk0 b;

    public /* synthetic */ qvv(egk0 egk0Var, byte b) {
        this.f29407a = b;
        this.b = egk0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f29407a;
        egk0 egk0Var = this.b;
        long jLongValue = ((Long) obj).longValue();
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = iIntValue & 6;
        switch (b) {
            case 0:
                if (i == 0) {
                    iIntValue |= fetVar.f(jLongValue) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    egk0Var.m(jLongValue);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (i == 0) {
                    iIntValue |= fetVar.f(jLongValue) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    egk0Var.m(jLongValue);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
