package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oof0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25593a;
    public final /* synthetic */ vof0 b;

    public /* synthetic */ oof0(vof0 vof0Var, byte b) {
        this.f25593a = b;
        this.b = vof0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wof0 wof0Var;
        byte b = this.f25593a;
        vof0 vof0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                iiy[] iiyVarArr = vof0.O1;
                vof0Var.I0().B(iIntValue, false);
                break;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                iiy[] iiyVarArr2 = vof0.O1;
                vof0Var.I0().B(iIntValue2, true);
                break;
            case 2:
                iiy[] iiyVarArr3 = vof0.O1;
                ((View) obj).getClass();
                aqf0 aqf0VarI0 = vof0Var.I0();
                bby bbyVar = aqf0VarI0.x;
                if (bbyVar == null || !bbyVar.isActive()) {
                    vqf0 vqf0Var = aqf0VarI0.y;
                    aqf0VarI0.y(false, (vqf0Var == null || (wof0Var = vqf0Var.b) == null) ? false : wof0Var.h);
                    aqf0VarI0.x = sac.i0(jiu0.a(aqf0VarI0), "ResidentGameViewModel.getWin", 5, 5L, q3d.j(oqt0.class, ff5.class, zhi0.class, qct.class), null, new k6d0(aqf0VarI0, null, (byte) 12), null, aqf0VarI0.s.b, new aif0(1, aqf0VarI0, aqf0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, 592);
                }
                break;
            default:
                iiy[] iiyVarArr4 = vof0.O1;
                ((mrf0) obj).getClass();
                vof0Var.I0().C();
                break;
        }
        return Unit.f46060a;
    }
}
