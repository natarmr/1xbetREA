package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w0c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38343a;
    public final /* synthetic */ a1c0 b;

    public /* synthetic */ w0c0(a1c0 a1c0Var, byte b) {
        this.f38343a = b;
        this.b = a1c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38343a;
        a1c0 a1c0Var = this.b;
        switch (b) {
            case 0:
                iqt0 iqt0Var = (iqt0) obj;
                rl70 rl70Var = a1c0.O1;
                iqt0Var.getClass();
                a1c0Var.H0().x(new m0c0(iqt0Var));
                break;
            case 1:
                rue0 rue0Var = (rue0) obj;
                rl70 rl70Var2 = a1c0.O1;
                rue0Var.getClass();
                a1c0Var.H0().x(new q0c0(rue0Var));
                break;
            default:
                nk90 nk90Var = (nk90) obj;
                rl70 rl70Var3 = a1c0.O1;
                nk90Var.getClass();
                a1c0Var.H0().x(new p0c0(nk90Var));
                break;
        }
        return Unit.f46060a;
    }
}
