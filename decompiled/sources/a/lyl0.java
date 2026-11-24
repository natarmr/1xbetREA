package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lyl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20867a;
    public final /* synthetic */ syl0 b;

    public /* synthetic */ lyl0(syl0 syl0Var, byte b) {
        this.f20867a = b;
        this.b = syl0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20867a;
        syl0 syl0Var = this.b;
        switch (b) {
            case 0:
                eke0 eke0Var = syl0.f2;
                syl0Var.H0().x(pzl0.f27852a);
                return Unit.f46060a;
            case 1:
                eke0 eke0Var2 = syl0.f2;
                ComponentCallbacks2 application = syl0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(hgp0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof hgp0)) {
                        ze3Var = null;
                    }
                    hgp0 hgp0Var = (hgp0) ze3Var;
                    if (hgp0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(syl0Var);
                        khf0 khf0Var = syl0Var.K1;
                        iiy[] iiyVarArr = syl0.g2;
                        return hgp0Var.a(i1w0VarF, (TypeStageId) khf0Var.n(syl0Var, iiyVarArr[0]), syl0Var.L1.n(syl0Var, iiyVarArr[1]).longValue(), syl0Var.M1.n(syl0Var, iiyVarArr[2]).longValue(), syl0Var.N1.n(syl0Var, iiyVarArr[3]).longValue());
                    }
                }
                jf4.n(b1j.i(hgp0.class, "Cannot create dependency "));
                return null;
            default:
                eke0 eke0Var3 = syl0.f2;
                fiu0 fiu0Var = syl0Var.Y1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
