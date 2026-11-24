package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.toto_bet.tirage.presentation.screen.TotoBetDsTirageScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rir0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30558a;
    public final /* synthetic */ njr0 b;

    public /* synthetic */ rir0(njr0 njr0Var, byte b) {
        this.f30558a = b;
        this.b = njr0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30558a;
        njr0 njr0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                njr0Var.y.b(th, new efr0((byte) 3));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new TotoBetDsTirageScreen(njr0Var.i.f4960a.r().c.name(), njr0Var.i.f4960a.r().f20312a));
                break;
        }
        return Unit.f46060a;
    }
}
