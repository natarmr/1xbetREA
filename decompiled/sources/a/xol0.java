package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xol0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41227a;
    public final /* synthetic */ apl0 b;

    public /* synthetic */ xol0(apl0 apl0Var, byte b) {
        this.f41227a = b;
        this.b = apl0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41227a;
        apl0 apl0Var = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                gle0 gle0Var = apl0.P1;
                uidVar.getClass();
                apl0Var.H0().x(new pol0(uidVar));
                return Unit.f46060a;
            default:
                gpl0 gpl0Var = (gpl0) obj;
                gle0 gle0Var2 = apl0.P1;
                gpl0Var.getClass();
                if (gpl0Var instanceof fpl0) {
                    ujd ujdVarD = ((sui) apl0Var.K1.getValue()).m.d();
                    x1x.x(ujdVarD);
                    ujdVarD.b(apl0Var, ((fpl0) gpl0Var).f9934a);
                } else {
                    if (!(gpl0Var instanceof epl0)) {
                        t9f.b();
                        return null;
                    }
                    View viewQ0 = apl0Var.q0();
                    j120.X(viewQ0);
                    viewQ0.requestFocus();
                }
                apl0Var.H0().x(lol0.f20398a);
                return Unit.f46060a;
        }
    }
}
