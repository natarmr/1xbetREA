package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tcc implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33713a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ tcc(Function2 function2, byte b) {
        this.f33713a = b;
        this.b = function2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f33713a;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    function2.invoke(fetVar, 6);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                u4s u4sVar = (u4s) obj;
                ((Integer) obj2).getClass();
                u4sVar.getClass();
                function2.invoke(u4sVar, (String) obj3);
                break;
            case 2:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    function2.invoke(fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                u4s u4sVar2 = (u4s) obj;
                ((Integer) obj2).getClass();
                u4sVar2.getClass();
                function2.invoke(u4sVar2, (String) obj3);
                break;
        }
        return Unit.f46060a;
    }
}
