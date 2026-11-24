package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p82 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26534a;
    public final /* synthetic */ y82 b;

    public /* synthetic */ p82(y82 y82Var, byte b) {
        this.f26534a = b;
        this.b = y82Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26534a;
        y82 y82Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                qek0 qek0Var = y82.V1;
                if (zBooleanValue) {
                    y82Var.I0().x(c82.f3891a);
                }
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                qek0 qek0Var2 = y82.V1;
                y82Var.I0().x(new h82(jLongValue));
                break;
        }
        return Unit.f46060a;
    }
}
