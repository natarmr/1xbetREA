package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldCellGameView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mfl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21699a;
    public final /* synthetic */ tzq b;
    public final /* synthetic */ qfl c;

    public /* synthetic */ mfl(tzq tzqVar, qfl qflVar, byte b) {
        this.f21699a = b;
        this.b = tzqVar;
        this.c = qflVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        bby bbyVar;
        byte b = this.f21699a;
        yje yjeVar = null;
        byte b2 = 1;
        qfl qflVar = this.c;
        tzq tzqVar = this.b;
        byte b3 = 0;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = qfl.O1;
                tzqVar.b.C(false);
                cgl cglVarH0 = qflVar.H0();
                sac.V(jiu0.a(cglVarH0), new k0l(1, cglVarH0, cgl.class, "handleDragonGoldError", "handleDragonGoldError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, cglVarH0.f.b, new yfl(cglVarH0, yjeVar, b3), 10);
                break;
            case 1:
                iiy[] iiyVarArr2 = qfl.O1;
                DragonsGoldCellGameView dragonsGoldCellGameView = tzqVar.b;
                dragonsGoldCellGameView.s.setEnabled(true);
                dragonsGoldCellGameView.v(true);
                cgl cglVarH1 = qflVar.H0();
                sac.V(jiu0.a(cglVarH1), new k0l(1, cglVarH1, cgl.class, "handleDragonGoldError", "handleDragonGoldError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, cglVarH1.f.b, new zfl(cglVarH1, yjeVar, b3), 10);
                break;
            default:
                iiy[] iiyVarArr3 = qfl.O1;
                DragonsGoldCellGameView dragonsGoldCellGameView2 = tzqVar.b;
                dragonsGoldCellGameView2.v(false);
                cgl cglVarH2 = qflVar.H0();
                if (cglVarH2.d.a() && ((bbyVar = cglVarH2.u) == null || !bbyVar.isActive())) {
                    cglVarH2.u = sac.V(jiu0.a(cglVarH2), new k0l(1, cglVarH2, cgl.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, cglVarH2.f.c, new yfl(cglVarH2, yjeVar, b2), 10);
                }
                dragonsGoldCellGameView2.s.setEnabled(false);
                break;
        }
        return Unit.f46060a;
    }
}
