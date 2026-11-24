package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g5j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10721a = 0;
    public final /* synthetic */ i5j b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10721a;
        i5j i5jVar = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                iiy[] iiyVarArr = i5j.O1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i5jVar.G0(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                iiy[] iiyVarArr2 = i5j.O1;
                i5jVar.G0(x8x.L(1), fetVar);
                break;
        }
        return Unit.f46060a;
    }
}
