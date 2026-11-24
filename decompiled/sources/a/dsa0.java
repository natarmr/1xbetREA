package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dsa0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6604a;
    public final /* synthetic */ fsa0 b;

    public /* synthetic */ dsa0(fsa0 fsa0Var, byte b) {
        this.f6604a = b;
        this.b = fsa0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6604a;
        fsa0 fsa0Var = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                nh70 nh70Var = fsa0.V1;
                uidVar.getClass();
                fsa0Var.G0().x(new qra0(uidVar));
                break;
            default:
                asa0 asa0Var = (asa0) obj;
                nh70 nh70Var2 = fsa0.V1;
                asa0Var.getClass();
                fsa0Var.G0().x(asa0Var);
                break;
        }
        return Unit.f46060a;
    }
}
