package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cvy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5052a;
    public final /* synthetic */ xdr b;

    public /* synthetic */ cvy(xdr xdrVar, byte b) {
        this.f5052a = b;
        this.b = xdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5052a;
        xdr xdrVar = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                l.longValue();
                xdrVar.F(l, 1, (String) obj2);
                break;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                kj5 kj5Var = uo5.b;
                xdrVar.F(num, 11, (String) obj2);
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xdrVar.F(o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3), fetVar, 6);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
