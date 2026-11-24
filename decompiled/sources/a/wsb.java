package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wsb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39682a;
    public final /* synthetic */ zsb b;

    public /* synthetic */ wsb(zsb zsbVar, byte b) {
        this.f39682a = b;
        this.b = zsbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39682a;
        zsb zsbVar = this.b;
        switch (b) {
            case 0:
                yk5 yk5Var = zsb.n2;
                ((atb) obj).getClass();
                vcc.f0(i120.U(), zsbVar, "CHANGE_VALUE_BS_DIALOG_REQUEST_KEY");
                qcc.Q(zsbVar);
                break;
            default:
                x5q0 x5q0Var = (x5q0) obj;
                yk5 yk5Var2 = zsb.n2;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    zsbVar.P0().x(new rsb(((w5q0) x5q0Var).f38596a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
