package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eae0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7461a;
    public final /* synthetic */ fae0 b;
    public final /* synthetic */ qpg0 c;

    public /* synthetic */ eae0(fae0 fae0Var, qpg0 qpg0Var, byte b) {
        this.f7461a = b;
        this.b = fae0Var;
        this.c = qpg0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7461a;
        qpg0 qpg0Var = this.c;
        fae0 fae0Var = this.b;
        gx3 gx3Var = (gx3) obj;
        switch (b) {
            case 0:
                gx3Var.getClass();
                fae0Var.a(qpg0Var, gx3Var);
                break;
            default:
                gx3Var.getClass();
                fae0Var.b(qpg0Var, gx3Var);
                break;
        }
        return Unit.f46060a;
    }
}
