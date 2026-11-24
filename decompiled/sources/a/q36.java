package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q36 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28036a;
    public final /* synthetic */ p36 b;

    public /* synthetic */ q36(p36 p36Var, byte b) {
        this.f28036a = b;
        this.b = p36Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28036a;
        p36 p36Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                sje sjeVar = p36Var.h;
                zvw.I(sjeVar.f32300a);
                if (!Intrinsics.d(th.getMessage(), "PROPHYLAXIS_CANCEL")) {
                    sac.V(sjeVar, w36.f38486a, null, null, new xw5(th, p36Var, null, (byte) 5), 14);
                }
                break;
            default:
                th.getClass();
                if (!Intrinsics.d(th.getMessage(), "PROPHYLAXIS_CANCEL")) {
                    p36Var.k.g(c56.f3755a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
