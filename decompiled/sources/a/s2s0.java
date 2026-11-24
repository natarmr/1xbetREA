package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s2s0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31518a;
    public final /* synthetic */ u2s0 b;

    public /* synthetic */ s2s0(u2s0 u2s0Var, byte b) {
        this.f31518a = b;
        this.b = u2s0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31518a;
        u2s0 u2s0Var = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = u2s0.X1;
                u2s0Var.H0().w();
                return Unit.f46060a;
            case 1:
                s2m0 s2m0Var2 = u2s0.X1;
                i1w0 i1w0VarF = a4n0.f(u2s0Var);
                cyi cyiVar = u2s0Var.M1;
                if (cyiVar != null) {
                    return new ry3(i1w0VarF, cyiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                s2m0 s2m0Var3 = u2s0.X1;
                ComponentCallbacks2 application = u2s0Var.n0().getApplication();
                if (!(application instanceof vmv)) {
                    e9d0.v(u2s0Var, "Can not find dependencies provider for ");
                    return null;
                }
                ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                if (applicationLoader.c() == null) {
                    e9d0.v(u2s0Var, "Can not find dependencies provider for ");
                    return null;
                }
                g8i g8iVarC = applicationLoader.c();
                if (g8iVarC != null) {
                    return new dyi(new qud(), g8iVarC);
                }
                hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.DailyTournamentDependencies");
                return null;
            case 3:
                s2m0 s2m0Var4 = u2s0.X1;
                return new vb3(u2s0Var, (byte) 3);
            default:
                s2m0 s2m0Var5 = u2s0.X1;
                return new xp6(u2s0Var, (byte) 15);
        }
    }
}
