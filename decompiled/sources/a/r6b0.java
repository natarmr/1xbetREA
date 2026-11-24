package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class r6b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29928a;
    public final /* synthetic */ u6b0 b;

    public /* synthetic */ r6b0(u6b0 u6b0Var, byte b) {
        this.f29928a = b;
        this.b = u6b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29928a;
        u6b0 u6b0Var = this.b;
        switch (b) {
            case 0:
                xi70 xi70Var = u6b0.e2;
                sbb0 sbb0VarJ0 = u6b0Var.J0();
                sbb0VarJ0.T.f11237a.a(xun.f41520a, 12657L);
                sbb0VarJ0.U.f44322a.c("notification_permission_show");
                return Unit.f46060a;
            default:
                return u6b0Var;
        }
    }
}
