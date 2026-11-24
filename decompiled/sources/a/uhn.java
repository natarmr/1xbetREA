package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.eastern_nights.presentation.views.EasternNightsCellGameView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uhn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35688a;
    public final /* synthetic */ uzq b;
    public final /* synthetic */ whn c;

    public /* synthetic */ uhn(uzq uzqVar, whn whnVar, byte b) {
        this.f35688a = b;
        this.b = uzqVar;
        this.c = whnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        bby bbyVar;
        byte b = this.f35688a;
        yje yjeVar = null;
        byte b2 = 1;
        byte b3 = 0;
        whn whnVar = this.c;
        uzq uzqVar = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = whn.O1;
                uzqVar.b.C(false);
                kin kinVarH0 = whnVar.H0();
                sac.V(jiu0.a(kinVarH0), new k0l(1, kinVarH0, kin.class, "handleEasternNightsError", "handleEasternNightsError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, kinVarH0.f.b, new gin(kinVarH0, yjeVar, b3), 10);
                break;
            case 1:
                iiy[] iiyVarArr2 = whn.O1;
                EasternNightsCellGameView easternNightsCellGameView = uzqVar.b;
                easternNightsCellGameView.s.setEnabled(true);
                easternNightsCellGameView.v(true);
                p7m0 p7m0Var = whnVar.H0().y;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                break;
            default:
                iiy[] iiyVarArr3 = whn.O1;
                EasternNightsCellGameView easternNightsCellGameView2 = uzqVar.b;
                easternNightsCellGameView2.v(false);
                kin kinVarH1 = whnVar.H0();
                if (kinVarH1.d.a() && ((bbyVar = kinVarH1.t) == null || !bbyVar.isActive())) {
                    kinVarH1.t = sac.V(jiu0.a(kinVarH1), new hin(1, kinVarH1, kin.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, kinVarH1.f.c, new gin(kinVarH1, yjeVar, b2), 10);
                }
                easternNightsCellGameView2.s.setEnabled(false);
                break;
        }
        return Unit.f46060a;
    }
}
