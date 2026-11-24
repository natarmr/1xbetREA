package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y820 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42175a = 1;
    public final /* synthetic */ b920 b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42175a;
        b920 b920Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                htz htzVar = b920.U1;
                b920Var.H0(x8x.L(1), fetVar);
                break;
            default:
                int iIntValue = num.intValue();
                htz htzVar2 = b920.U1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b920Var.H0(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
