package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kac implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17955a;
    public final /* synthetic */ abi0 b;

    public /* synthetic */ kac(abi0 abi0Var, byte b) {
        this.f17955a = b;
        this.b = abi0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17955a;
        boolean z = true;
        abi0 abi0Var = this.b;
        switch (b) {
            case 0:
                hps0 hps0Var = (hps0) obj;
                hps0Var.getClass();
                jp80 jp80Var = (jp80) hps0Var;
                jp80Var.p = true;
                jp80Var.o.invoke(abi0Var);
                s0x.S(jp80Var);
                return Boolean.FALSE;
            default:
                ez2 ez2Var = (ez2) obj;
                Boolean boolValueOf = ez2Var.f8652a.isToggle() ? Boolean.valueOf(ez2Var.f8652a.getToggleValue()) : null;
                if (boolValueOf != null) {
                    yai0.i(abi0Var, boolValueOf.booleanValue() ? evq0.f8484a : evq0.b);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
