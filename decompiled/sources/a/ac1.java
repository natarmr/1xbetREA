package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ac1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f606a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ ac1(kc1 kc1Var, byte b) {
        this.f606a = b;
        this.b = kc1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f606a;
        mb1 mb1Var = mb1.f21483a;
        kc1 kc1Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                kc1Var.P(gq80.k0(th));
                break;
            case 1:
                th.getClass();
                kc1Var.G(mb1Var);
                break;
            default:
                th.getClass();
                kc1Var.G(mb1Var);
                break;
        }
        return Unit.f46060a;
    }
}
