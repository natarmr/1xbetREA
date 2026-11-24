package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b36 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1887a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ b36(boolean z, pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f1887a = b;
        this.b = z;
        this.c = pz40Var;
        this.d = pz40Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1887a;
        pz40 pz40Var = this.d;
        pz40 pz40Var2 = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                iqq iqqVar = (iqq) obj;
                iqqVar.getClass();
                boolean zBooleanValue = ((Boolean) pz40Var2.getValue()).booleanValue();
                pz40Var2.setValue(Boolean.valueOf(iqqVar.b()));
                if (!zBooleanValue && iqqVar.b() && z) {
                    a8q0 a8q0Var = (a8q0) pz40Var.getValue();
                    int length = ((a8q0) pz40Var.getValue()).f440a.b.length();
                    pz40Var.setValue(a8q0.a(a8q0Var, null, s7n0.e(length, length), 5));
                }
                break;
            default:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                pz40Var2.setValue(Boolean.valueOf(a9q0Var.m(0)));
                pz40Var.setValue(new daq0((((Boolean) pz40Var2.getValue()).booleanValue() || !z) ? qmk.u : qmk.w));
                break;
        }
        return Unit.f46060a;
    }
}
