package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nib0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23577a;
    public final /* synthetic */ qib0 b;

    public /* synthetic */ nib0(qib0 qib0Var, byte b) {
        this.f23577a = b;
        this.b = qib0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23577a;
        eib0 eib0Var = eib0.f7851a;
        qib0 qib0Var = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = qib0.Q1;
                qib0Var.H0().x(fib0.f9579a);
                return Unit.f46060a;
            case 1:
                rl70 rl70Var2 = qib0.Q1;
                qib0Var.H0().x(eib0Var);
                return Unit.f46060a;
            case 2:
                rl70 rl70Var3 = qib0.Q1;
                qib0Var.H0().x(eib0Var);
                return Unit.f46060a;
            case 3:
                rl70 rl70Var4 = qib0.Q1;
                fiu0 fiu0Var = qib0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                rl70 rl70Var5 = qib0.Q1;
                lma0 lma0Var = new lma0(qib0Var, (byte) 11);
                iib0 iib0Var = new iib0(jtv.w);
                byte b2 = 3;
                gbn gbnVar = new gbn(new kui0(b2), new gsh0(b2, (byte) 8), new wvi0((byte) 2), ynh0.o);
                dp dpVar = iib0Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new kui0((byte) 4), new gsh0(b2, (byte) 9), new wvi0(b2), ynh0.p));
                dpVar.b(new gbn(new kui0((byte) 0), new gsh0(b2, (byte) 5), new rai0(lma0Var, (byte) 7), ynh0.l));
                return iib0Var;
            default:
                rl70 rl70Var6 = qib0.Q1;
                qib0Var.H0().x(dib0.f6130a);
                return Unit.f46060a;
        }
    }
}
