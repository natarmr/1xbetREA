package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneCellGameView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tp3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34312a;
    public final /* synthetic */ ayq b;
    public final /* synthetic */ wp3 c;

    public /* synthetic */ tp3(ayq ayqVar, wp3 wp3Var, byte b) {
        this.f34312a = b;
        this.b = ayqVar;
        this.c = wp3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        bby bbyVar;
        byte b = this.f34312a;
        yje yjeVar = null;
        byte b2 = 1;
        wp3 wp3Var = this.c;
        ayq ayqVar = this.b;
        byte b3 = 0;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = wp3.O1;
                ayqVar.b.C(false);
                kq3 kq3VarH0 = wp3Var.H0();
                sac.V(jiu0.a(kq3VarH0), new bk2(1, kq3VarH0, kq3.class, "handleAppleFortuneError", "handleAppleFortuneError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, kq3VarH0.f.b, new fq3(kq3VarH0, yjeVar, b3), 10);
                break;
            case 1:
                iiy[] iiyVarArr2 = wp3.O1;
                AppleFortuneCellGameView appleFortuneCellGameView = ayqVar.b;
                appleFortuneCellGameView.s.setEnabled(true);
                appleFortuneCellGameView.v(true);
                kq3 kq3VarH1 = wp3Var.H0();
                sac.V(jiu0.a(kq3VarH1), new bk2(1, kq3VarH1, kq3.class, "handleAppleFortuneError", "handleAppleFortuneError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, kq3VarH1.f.b, new gq3(kq3VarH1, yjeVar, b3), 10);
                break;
            default:
                iiy[] iiyVarArr3 = wp3.O1;
                AppleFortuneCellGameView appleFortuneCellGameView2 = ayqVar.b;
                appleFortuneCellGameView2.v(false);
                kq3 kq3VarH2 = wp3Var.H0();
                if (kq3VarH2.d.a() && ((bbyVar = kq3VarH2.t) == null || !bbyVar.isActive())) {
                    kq3VarH2.t = sac.V(jiu0.a(kq3VarH2), new bk2(1, kq3VarH2, kq3.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, kq3VarH2.f.f22085a, new fq3(kq3VarH2, yjeVar, b2), 10);
                }
                appleFortuneCellGameView2.s.setEnabled(false);
                break;
        }
        return Unit.f46060a;
    }
}
