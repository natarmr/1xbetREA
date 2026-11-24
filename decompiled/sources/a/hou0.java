package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualCategoryDisciplinesParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hou0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13411a;
    public final /* synthetic */ jou0 b;

    public /* synthetic */ hou0(jou0 jou0Var, byte b) {
        this.f13411a = b;
        this.b = jou0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13411a;
        jou0 jou0Var = this.b;
        switch (b) {
            case 0:
                sxs0 sxs0Var = jou0.R1;
                ComponentCallbacks2 application = jou0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(knu0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof knu0)) {
                        ze3Var = null;
                    }
                    knu0 knu0Var = (knu0) ze3Var;
                    if (knu0Var != null) {
                        VirtualCategoryDisciplinesParams virtualCategoryDisciplinesParams = (VirtualCategoryDisciplinesParams) jou0Var.M1.n(jou0Var, jou0.S1[0]);
                        duj dujVar = knu0Var.f18602a;
                        g2v g2vVar = knu0Var.b;
                        cad cadVar = knu0Var.c;
                        gii0 gii0Var = knu0Var.d;
                        oeg0 oeg0Var = knu0Var.e;
                        pyg pygVar = knu0Var.f;
                        ctf0 ctf0Var = knu0Var.g;
                        knf0 knf0Var = knu0Var.h;
                        iip iipVar = knu0Var.j;
                        sjl0 sjl0Var = knu0Var.k;
                        m1e m1eVar = knu0Var.i;
                        pygVar.getClass();
                        iipVar.getClass();
                        gii0Var.getClass();
                        m1eVar.getClass();
                        oeg0Var.getClass();
                        ctf0Var.getClass();
                        knf0Var.getClass();
                        sjl0Var.getClass();
                        return new czi(cadVar, pygVar, dujVar, g2vVar, m1eVar, ctf0Var, virtualCategoryDisciplinesParams, sjl0Var);
                    }
                }
                jf4.n(b1j.i(knu0.class, "Cannot create dependency "));
                return null;
            case 1:
                sxs0 sxs0Var2 = jou0.R1;
                fiu0 fiu0Var = jou0Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                sxs0 sxs0Var3 = jou0.R1;
                ((k3t0) jou0Var.O1.getValue()).x(wnu0.f39465a);
                return Unit.f46060a;
        }
    }
}
