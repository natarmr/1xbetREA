package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class td60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33751a;
    public final /* synthetic */ ywv0 b;

    public /* synthetic */ td60(ywv0 ywv0Var, byte b) {
        this.f33751a = b;
        this.b = ywv0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33751a;
        boolean z = false;
        ywv0 ywv0Var = this.b;
        switch (b) {
            case 0:
                cvv0 cvv0VarF = ywv0Var.c.f();
                if (cvv0VarF != null) {
                    return Integer.valueOf(cvv0VarF.f);
                }
                return null;
            case 1:
                return Boolean.valueOf(ywv0Var.d.f());
            case 2:
                return new avv0(ywv0Var.b.l());
            case 3:
                return pvm0.s(ywv0Var).f3395a;
            case 4:
                return pvm0.s(ywv0Var).b;
            case 5:
                return Boolean.valueOf(pvm0.s(ywv0Var).f != stv0.c);
            case 6:
                return (ssv0) ((hgk0) ((pz40) ywv0Var.b.c)).getValue();
            case 7:
                if (pvm0.s(ywv0Var).f != stv0.c && !((Boolean) ((hgk0) ((pz40) ywv0Var.f.c)).getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                ywv0Var.i.x();
                return Unit.f46060a;
            default:
                ywv0Var.i.x();
                return Unit.f46060a;
        }
    }
}
