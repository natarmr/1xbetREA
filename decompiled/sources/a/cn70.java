package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cn70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4641a;
    public final /* synthetic */ to70 b;

    public /* synthetic */ cn70(to70 to70Var, byte b) {
        this.f4641a = b;
        this.b = to70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4641a;
        to70 to70Var = this.b;
        switch (b) {
            case 0:
                if (d5c.R(jiu0.a(to70Var))) {
                    to70Var.A();
                }
                break;
            default:
                if (to70Var.f.c() && to70Var.i.a()) {
                    to70Var.w(yy5.f43451a);
                } else {
                    to70Var.C.a(false);
                    ly5 ly5Var = to70Var.T;
                    if (ly5Var != null) {
                        to70Var.w(ly5Var);
                    }
                    to70Var.F(un70.f35948a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
