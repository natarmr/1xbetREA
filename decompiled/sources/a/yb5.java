package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yb5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42324a;
    public final /* synthetic */ ob50 b;

    public /* synthetic */ yb5(ob50 ob50Var, byte b) {
        this.f42324a = b;
        this.b = ob50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42324a;
        ob50 ob50Var = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob50Var.a(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob50Var.a(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob50Var.a(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob50Var.a(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
