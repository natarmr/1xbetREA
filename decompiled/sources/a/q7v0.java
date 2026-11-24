package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ufc.api.weight_class_rating.UfcWeightClassRatingParams;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q7v0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28270a;
    public final /* synthetic */ s7v0 b;

    public /* synthetic */ q7v0(s7v0 s7v0Var, byte b) {
        this.f28270a = b;
        this.b = s7v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28270a;
        s7v0 s7v0Var = this.b;
        switch (b) {
            case 0:
                wxs0 wxs0Var = s7v0.P1;
                ComponentCallbacks2 application = s7v0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(t7v0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof t7v0)) {
                        ze3Var = null;
                    }
                    t7v0 t7v0Var = (t7v0) ze3Var;
                    if (t7v0Var != null) {
                        UfcWeightClassRatingParams ufcWeightClassRatingParams = (UfcWeightClassRatingParams) s7v0Var.L1.n(s7v0Var, s7v0.Q1[0]);
                        i1w0 i1w0VarF = a4n0.f(s7v0Var);
                        i1w0VarF.getClass();
                        cad cadVar = t7v0Var.f33485a;
                        gii0 gii0Var = t7v0Var.b;
                        g2v g2vVar = t7v0Var.c;
                        m1e m1eVar = t7v0Var.d;
                        ctf0 ctf0Var = t7v0Var.e;
                        kys0 kys0Var = t7v0Var.f;
                        gii0Var.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        return new nzi(cadVar, ufcWeightClassRatingParams, i1w0VarF, gii0Var, g2vVar, m1eVar, ctf0Var, kys0Var);
                    }
                }
                jf4.n(b1j.i(t7v0.class, "Cannot create dependency "));
                return null;
            case 1:
                wxs0 wxs0Var2 = s7v0.P1;
                fiu0 fiu0Var = s7v0Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                wxs0 wxs0Var3 = s7v0.P1;
                ((k3t0) s7v0Var.N1.getValue()).x(i7v0.f14313a);
                return Unit.f46060a;
            default:
                wxs0 wxs0Var4 = s7v0.P1;
                ((k3t0) s7v0Var.N1.getValue()).x(h7v0.f12595a);
                return Unit.f46060a;
        }
    }
}
