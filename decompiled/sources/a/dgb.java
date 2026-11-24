package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dgb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6035a;
    public final /* synthetic */ hgb b;

    public /* synthetic */ dgb(hgb hgbVar, byte b) {
        this.f6035a = b;
        this.b = hgbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6035a;
        hgb hgbVar = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = hgbVar.Q1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                kl5 kl5Var = hgb.c2;
                ComponentCallbacks2 application = hgbVar.n0().getApplication();
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
                        i1w0 i1w0VarF = a4n0.f(hgbVar);
                        khf0 khf0Var = hgbVar.O1;
                        iiy[] iiyVarArr = hgb.d2;
                        return hgp0Var.a(i1w0VarF, (TypeStageId) khf0Var.n(hgbVar, iiyVarArr[1]), hgbVar.N1.n(hgbVar, iiyVarArr[0]).longValue(), -1L, 0L);
                    }
                }
                jf4.n(b1j.i(hgp0.class, "Cannot create dependency "));
                return null;
            case 2:
                kl5 kl5Var2 = hgb.c2;
                hgbVar.H0().w();
                return Unit.f46060a;
            case 3:
                kl5 kl5Var3 = hgb.c2;
                hgbVar.H0().w();
                return Unit.f46060a;
            case 4:
                kl5 kl5Var4 = hgb.c2;
                hgbVar.H0().y();
                return Unit.f46060a;
            default:
                kl5 kl5Var5 = hgb.c2;
                hgbVar.H0().z();
                return Unit.f46060a;
        }
    }
}
