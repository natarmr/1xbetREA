package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tu implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34527a = 1;
    public final /* synthetic */ xu b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34527a;
        xu xuVar = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                gfk0 gfk0Var = xu.Q1;
                xuVar.G0(x8x.L(1), fetVar);
                break;
            default:
                int iIntValue = num.intValue();
                gfk0 gfk0Var2 = xu.Q1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xuVar.G0(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
