package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zbv0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44136a;
    public final /* synthetic */ ccv0 b;

    public /* synthetic */ zbv0(ccv0 ccv0Var, byte b) {
        this.f44136a = b;
        this.b = ccv0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44136a;
        ccv0 ccv0Var = this.b;
        switch (b) {
            case 0:
                uxs0 uxs0Var = ccv0.Q1;
                ccv0Var.H0().x(rav0.f30155a);
                return Unit.f46060a;
            case 1:
                pzi pziVar = ccv0Var.K1;
                if (pziVar != null) {
                    return new q0h0(pziVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                uxs0 uxs0Var2 = ccv0.Q1;
                ComponentCallbacks2 application = ccv0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(fcv0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof fcv0)) {
                        ze3Var = null;
                    }
                    fcv0 fcv0Var = (fcv0) ze3Var;
                    if (fcv0Var != null) {
                        int i = ccv0Var.G0().f46980a;
                        i1w0 i1w0VarF = a4n0.f(ccv0Var);
                        LinkedHashMap linkedHashMap = xbv0.f40619a;
                        String strB = xbv0.b(ccv0Var.G0().f46980a, efx.v(ccv0Var).f4046a);
                        Application application2 = ccv0Var.n0().getApplication();
                        application2.getClass();
                        ozi oziVarC = xbv0.c(application2, strB);
                        i1w0VarF.getClass();
                        cad cadVar = fcv0Var.f9329a;
                        ctf0 ctf0Var = fcv0Var.b;
                        duj dujVar = fcv0Var.c;
                        gst0 gst0Var = fcv0Var.d;
                        btt0 btt0Var = fcv0Var.e;
                        b3c0 b3c0Var = fcv0Var.f;
                        m1e m1eVar = fcv0Var.g;
                        pru pruVar = fcv0Var.h;
                        bzt bztVar = fcv0Var.i;
                        ewk ewkVar = fcv0Var.j;
                        ctf0Var.getClass();
                        gst0Var.getClass();
                        btt0Var.getClass();
                        b3c0Var.getClass();
                        m1eVar.getClass();
                        ewkVar.getClass();
                        return new qzi(cadVar, oziVarC, Integer.valueOf(i), i1w0VarF, ctf0Var, dujVar, gst0Var, m1eVar, pruVar, bztVar, ewkVar);
                    }
                }
                jf4.n(b1j.i(fcv0.class, "Cannot create dependency "));
                return null;
            case 3:
                uxs0 uxs0Var3 = ccv0.Q1;
                ccv0Var.H0().x(pav0.f26675a);
                return Unit.f46060a;
            case 4:
                uxs0 uxs0Var4 = ccv0.Q1;
                ccv0Var.H0().x(oav0.f24949a);
                return Unit.f46060a;
            default:
                uxs0 uxs0Var5 = ccv0.Q1;
                ccv0Var.H0().x(qav0.f28416a);
                return Unit.f46060a;
        }
    }
}
