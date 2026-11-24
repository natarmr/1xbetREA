package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rn3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30768a;
    public final /* synthetic */ tn3 b;

    public /* synthetic */ rn3(tn3 tn3Var, byte b) {
        this.f30768a = b;
        this.b = tn3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30768a;
        tn3 tn3Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                hfk0 hfk0Var = tn3.c2;
                view.getClass();
                tn3Var.x0();
                break;
            default:
                hfk0 hfk0Var2 = tn3.c2;
                view.getClass();
                fo3 fo3Var = (fo3) tn3Var.b2.getValue();
                bby bbyVar = fo3Var.f;
                if (bbyVar == null || !bbyVar.isActive()) {
                    fo3Var.f = sac.V(jiu0.a(fo3Var), new b33(fo3Var, (byte) 6), null, fo3Var.e.c, new y32(fo3Var, null), 10);
                }
                break;
        }
        return Unit.f46060a;
    }
}
