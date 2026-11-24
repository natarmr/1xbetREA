package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.special_event.impl.results.presentation.model.ResultsScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w5g0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38583a;
    public final /* synthetic */ y5g0 b;

    public /* synthetic */ w5g0(y5g0 y5g0Var, byte b) {
        this.f38583a = b;
        this.b = y5g0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38583a;
        y5g0 y5g0Var = this.b;
        switch (b) {
            case 0:
                gle0 gle0Var = y5g0.Q1;
                ComponentCallbacks2 application = y5g0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(z5g0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof z5g0)) {
                        ze3Var = null;
                    }
                    z5g0 z5g0Var = (z5g0) ze3Var;
                    if (z5g0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(y5g0Var);
                        ResultsScreenParams resultsScreenParamsG0 = y5g0Var.G0();
                        LinkedHashMap linkedHashMap = xnk0.f41174a;
                        String strB = xnk0.b(y5g0Var.G0().f46971a, efx.v(y5g0Var).f4046a);
                        Application application2 = y5g0Var.n0().getApplication();
                        application2.getClass();
                        cui cuiVarC = xnk0.c(application2, strB);
                        LinkedHashMap linkedHashMap2 = n8l0.f23096a;
                        Application application3 = y5g0Var.n0().getApplication();
                        application3.getClass();
                        lui luiVarC = n8l0.c(application3, n8l0.b(y5g0Var.G0().f46971a, efx.v(y5g0Var).f4046a, y5g0.S1), "RESULTS_SPORT_FILTER_IDS_PREF_KEY", y5g0Var.G0().f46971a);
                        i1w0VarF.getClass();
                        zx10 zx10Var = z5g0Var.b;
                        cad cadVar = z5g0Var.f43814a;
                        m1e m1eVar = z5g0Var.c;
                        gst0 gst0Var = z5g0Var.e;
                        b3c0 b3c0Var = z5g0Var.f;
                        ctf0 ctf0Var = z5g0Var.d;
                        ugf0 ugf0Var = z5g0Var.g;
                        wiu wiuVar = z5g0Var.h;
                        bzt bztVar = z5g0Var.i;
                        pru pruVar = z5g0Var.j;
                        iip iipVar = z5g0Var.k;
                        r9u r9uVar = z5g0Var.l;
                        ewk ewkVar = z5g0Var.m;
                        iipVar.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        gst0Var.getClass();
                        b3c0Var.getClass();
                        r9uVar.getClass();
                        ewkVar.getClass();
                        return new hsi(zx10Var, cuiVarC, ugf0Var, cadVar, luiVarC, iipVar, resultsScreenParamsG0, i1w0VarF, m1eVar, ctf0Var, gst0Var, b3c0Var, wiuVar, bztVar, pruVar, r9uVar, ewkVar);
                    }
                }
                jf4.n(b1j.i(z5g0.class, "Cannot create dependency "));
                return null;
            case 1:
                gle0 gle0Var2 = y5g0.Q1;
                return new q0h0((fsi) ((hsi) y5g0Var.M1.getValue()).t.get());
            case 2:
                gle0 gle0Var3 = y5g0.Q1;
                y5g0Var.H0().x(g5g0.f10716a);
                return Unit.f46060a;
            default:
                gle0 gle0Var4 = y5g0.Q1;
                y5g0Var.H0().x(e5g0.f7233a);
                return Unit.f46060a;
        }
    }
}
