package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i36 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14082a;
    public final /* synthetic */ p36 b;

    public /* synthetic */ i36(p36 p36Var, byte b) {
        this.f14082a = b;
        this.b = p36Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14082a;
        p36 p36Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                if (!Intrinsics.d(th.getMessage(), "PROPHYLAXIS_CANCEL")) {
                    p36Var.k.g(c56.f3755a);
                }
                break;
            default:
                th.getClass();
                sje sjeVar = p36Var.h;
                zvw.I(sjeVar.f32300a);
                if (!Intrinsics.d(th.getMessage(), "PROPHYLAXIS_CANCEL")) {
                    sac.V(sjeVar, o36.f24568a, null, null, new xw5(th, p36Var, null, (byte) 4), 14);
                }
                break;
        }
        return Unit.f46060a;
    }
}
