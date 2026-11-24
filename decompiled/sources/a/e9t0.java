package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e9t0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7440a;
    public final /* synthetic */ g9t0 b;

    public /* synthetic */ e9t0(g9t0 g9t0Var, byte b) {
        this.f7440a = b;
        this.b = g9t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7440a;
        g9t0 g9t0Var = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                svs0 svs0Var = g9t0.U1;
                uidVar.getClass();
                g9t0Var.G0().x(new k8t0(uidVar));
                break;
            case 1:
                v8t0 v8t0Var = (v8t0) obj;
                svs0 svs0Var2 = g9t0.U1;
                v8t0Var.getClass();
                g9t0Var.G0().x(v8t0Var);
                break;
            default:
                bem bemVar = (bem) obj;
                svs0 svs0Var3 = g9t0.U1;
                bemVar.getClass();
                g9t0Var.G0().x(new l8t0(bemVar));
                break;
        }
        return Unit.f46060a;
    }
}
