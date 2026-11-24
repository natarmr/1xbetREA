package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsResultsParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rap0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30148a;
    public final /* synthetic */ sap0 b;

    public /* synthetic */ rap0(sap0 sap0Var, byte b) {
        this.f30148a = b;
        this.b = sap0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30148a;
        sap0 sap0Var = this.b;
        switch (b) {
            case 0:
                j6m0 j6m0Var = sap0.R1;
                fiu0 fiu0Var = sap0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                j6m0 j6m0Var2 = sap0.R1;
                ComponentCallbacks2 application = sap0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(tap0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof tap0)) {
                        ze3Var = null;
                    }
                    tap0 tap0Var = (tap0) ze3Var;
                    if (tap0Var != null) {
                        TeamDetailsResultsParams teamDetailsResultsParams = (TeamDetailsResultsParams) sap0Var.Q1.n(sap0Var, sap0.S1[0]);
                        i1w0 i1w0VarF = a4n0.f(sap0Var);
                        i1w0VarF.getClass();
                        g2v g2vVar = tap0Var.f33624a;
                        ctf0 ctf0Var = tap0Var.b;
                        m1e m1eVar = tap0Var.c;
                        gii0 gii0Var = tap0Var.d;
                        knf0 knf0Var = tap0Var.e;
                        wiu wiuVar = tap0Var.f;
                        wdk0 wdk0Var = tap0Var.g;
                        cad cadVar = tap0Var.h;
                        roi0 roi0Var = tap0Var.i;
                        rrc rrcVar = tap0Var.j;
                        pyg pygVar = tap0Var.k;
                        epi0 epi0Var = tap0Var.l;
                        pru pruVar = tap0Var.m;
                        ctf0Var.getClass();
                        m1eVar.getClass();
                        gii0Var.getClass();
                        knf0Var.getClass();
                        wdk0Var.getClass();
                        pygVar.getClass();
                        return new lwi(cadVar, roi0Var, rrcVar, epi0Var, teamDetailsResultsParams, i1w0VarF, g2vVar, ctf0Var, m1eVar, gii0Var, knf0Var, wiuVar, wdk0Var, pruVar);
                    }
                }
                jf4.n(b1j.i(tap0.class, "Cannot create dependency "));
                return null;
            case 2:
                j6m0 j6m0Var3 = sap0.R1;
                sap0Var.G0().x(gap0.f10980a);
                return Unit.f46060a;
            default:
                j6m0 j6m0Var4 = sap0.R1;
                sap0Var.G0().x(fap0.f9221a);
                return Unit.f46060a;
        }
    }
}
