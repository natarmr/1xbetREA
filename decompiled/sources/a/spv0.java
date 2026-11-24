package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class spv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32603a;
    public final /* synthetic */ upv0 b;
    public final /* synthetic */ qpg0 c;

    public /* synthetic */ spv0(upv0 upv0Var, qpg0 qpg0Var, byte b) {
        this.f32603a = b;
        this.b = upv0Var;
        this.c = qpg0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32603a;
        qpg0 qpg0Var = this.c;
        upv0 upv0Var = this.b;
        gx3 gx3Var = (gx3) obj;
        switch (b) {
            case 0:
                gx3Var.getClass();
                upv0Var.a(qpg0Var, gx3Var);
                break;
            default:
                gx3Var.getClass();
                upv0Var.b(qpg0Var, gx3Var);
                break;
        }
        return Unit.f46060a;
    }
}
