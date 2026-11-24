package a;

import kotlin.Unit;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class tv9 implements xdr {
    public static final tv9 b = new tv9(0);
    public static final tv9 c = new tv9(1);
    public static final tv9 d = new tv9(2);
    public static final tv9 e = new tv9(3);
    public static final tv9 f = new tv9(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34588a;

    public /* synthetic */ tv9(byte b2) {
        this.f34588a = b2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        switch (this.f34588a) {
            case 0:
                try {
                    ohs0.B((Response) obj2);
                    break;
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused) {
                }
                return Unit.f46060a;
            case 1:
                odk0 odk0Var = (odk0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(odk0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    kcx.t(odk0Var, null, null, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                if (obj != null) {
                    hny.b();
                    return null;
                }
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(null) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ucx.J(iIntValue2 & 14, fetVar2);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            default:
                return null;
        }
    }
}
