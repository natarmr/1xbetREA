package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v3f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36730a;
    public final /* synthetic */ z3f0 b;

    public /* synthetic */ v3f0(z3f0 z3f0Var, byte b) {
        this.f36730a = b;
        this.b = z3f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36730a;
        z3f0 z3f0Var = this.b;
        switch (b) {
            case 0:
                iqt0 iqt0Var = (iqt0) obj;
                zie0 zie0Var = z3f0.Y1;
                iqt0Var.getClass();
                z3f0Var.H0().x(new v2f0(iqt0Var));
                break;
            case 1:
                zie0 zie0Var2 = z3f0.Y1;
                ((jtl) obj).getClass();
                z3f0Var.H0().x(i3f0.f14094a);
                break;
            default:
                zie0 zie0Var3 = z3f0.Y1;
                z3f0Var.H0().x(new j3f0((ghk0) obj));
                break;
        }
        return Unit.f46060a;
    }
}
