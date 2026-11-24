package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ku40 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18896a;
    public final /* synthetic */ ju40 b;

    public /* synthetic */ ku40(ju40 ju40Var, byte b) {
        this.f18896a = b;
        this.b = ju40Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f18896a;
        ju40 ju40Var = this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? fetVar.g(obj) : fetVar.i(obj) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.F(ju40Var, fetVar.m(), obj, false);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? fetVar.g(obj) : fetVar.i(obj) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.F(ju40Var, fetVar.m(), obj, false);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
