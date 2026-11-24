package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ut60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36243a;
    public final /* synthetic */ xt60 b;

    public /* synthetic */ ut60(xt60 xt60Var, byte b) {
        this.f36243a = b;
        this.b = xt60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36243a;
        xt60 xt60Var = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = xt60.V1;
                return qxw.y(xt60Var);
            case 1:
                xuz xuzVar2 = xt60.V1;
                androidx.fragment.app.e eVarF = xt60Var.F();
                String strN = xt60Var.K1.n(xt60Var, xt60.W1[0]);
                strN.getClass();
                o2t.c(eVarF, GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance.f46723a, strN);
                xt60Var.G0().x(at60.f1421a);
                return Unit.f46060a;
            case 2:
                xuz xuzVar3 = xt60.V1;
                fiu0 fiu0Var = xt60Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                xuz xuzVar4 = xt60.V1;
                ComponentCallbacks2 application = xt60Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(zya.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof zya)) {
                        ze3Var = null;
                    }
                    zya zyaVar = (zya) ze3Var;
                    if (zyaVar != null) {
                        return zyaVar.a(a4n0.f(xt60Var));
                    }
                }
                jf4.n(b1j.i(zya.class, "Cannot create dependency "));
                return null;
            case 4:
                xuz xuzVar5 = xt60.V1;
                xt60Var.G0().x(jt60.f17085a);
                return Unit.f46060a;
            case 5:
                xuz xuzVar6 = xt60.V1;
                xt60Var.G0().x(dt60.f6646a);
                return Unit.f46060a;
            default:
                xuz xuzVar7 = xt60.V1;
                xt60Var.G0().x(ct60.f4920a);
                return Unit.f46060a;
        }
    }
}
