package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsAchievementParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k7p0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17835a;
    public final /* synthetic */ m7p0 b;

    public /* synthetic */ k7p0(m7p0 m7p0Var, byte b) {
        this.f17835a = b;
        this.b = m7p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17835a;
        m7p0 m7p0Var = this.b;
        switch (b) {
            case 0:
                s9m0 s9m0Var = m7p0.P1;
                fiu0 fiu0Var = m7p0Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                s9m0 s9m0Var2 = m7p0.P1;
                ComponentCallbacks2 application = m7p0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(n7p0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof n7p0)) {
                        ze3Var = null;
                    }
                    n7p0 n7p0Var = (n7p0) ze3Var;
                    if (n7p0Var != null) {
                        TeamDetailsAchievementParams teamDetailsAchievementParams = (TeamDetailsAchievementParams) m7p0Var.O1.n(m7p0Var, m7p0.Q1[0]);
                        ctf0 ctf0Var = n7p0Var.f23052a;
                        gii0 gii0Var = n7p0Var.b;
                        pyg pygVar = n7p0Var.c;
                        cad cadVar = n7p0Var.d;
                        m1e m1eVar = n7p0Var.e;
                        g2v g2vVar = n7p0Var.f;
                        ctf0Var.getClass();
                        gii0Var.getClass();
                        m1eVar.getClass();
                        pygVar.getClass();
                        return new jwi(pygVar, cadVar, teamDetailsAchievementParams, ctf0Var, gii0Var, m1eVar, g2vVar);
                    }
                }
                jf4.n(b1j.i(n7p0.class, "Cannot create dependency "));
                return null;
            case 2:
                s9m0 s9m0Var3 = m7p0.P1;
                ((k3t0) m7p0Var.M1.getValue()).x(b7p0.f2120a);
                return Unit.f46060a;
            default:
                s9m0 s9m0Var4 = m7p0.P1;
                ((k3t0) m7p0Var.M1.getValue()).x(a7p0.f383a);
                return Unit.f46060a;
        }
    }
}
