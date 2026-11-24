package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class anr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1168a;
    public final /* synthetic */ dnr b;

    public /* synthetic */ anr(dnr dnrVar, byte b) {
        this.f1168a = b;
        this.b = dnrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1168a;
        dnr dnrVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                List list = (List) obj2;
                ddk ddkVar = dnr.c2;
                list.getClass();
                dnrVar.I0().x(new pmr(iIntValue, list));
                break;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ddk ddkVar2 = dnr.c2;
                dnrVar.I0().x(new nmr(zBooleanValue, jLongValue));
                break;
            default:
                long jLongValue2 = ((Long) obj).longValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ddk ddkVar3 = dnr.c2;
                dnrVar.I0().x(new nmr(zBooleanValue2, jLongValue2));
                break;
        }
        return Unit.f46060a;
    }
}
