package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.presentation.TransferScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class djs0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6203a;
    public final /* synthetic */ gjs0 b;

    public /* synthetic */ djs0(gjs0 gjs0Var, byte b) {
        this.f6203a = b;
        this.b = gjs0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6203a;
        gjs0 gjs0Var = this.b;
        switch (b) {
            case 0:
                j6m0 j6m0Var = gjs0.R1;
                ComponentCallbacks2 application = gjs0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(hjs0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof hjs0)) {
                        ze3Var = null;
                    }
                    hjs0 hjs0Var = (hjs0) ze3Var;
                    if (hjs0Var != null) {
                        TransferScreenParams transferScreenParams = (TransferScreenParams) gjs0Var.O1.n(gjs0Var, gjs0.S1[0]);
                        cad cadVar = hjs0Var.f13176a;
                        pyg pygVar = hjs0Var.e;
                        iip iipVar = hjs0Var.h;
                        g2v g2vVar = hjs0Var.g;
                        m1e m1eVar = hjs0Var.b;
                        gii0 gii0Var = hjs0Var.c;
                        oeg0 oeg0Var = hjs0Var.d;
                        ctf0 ctf0Var = hjs0Var.f;
                        wdk0 wdk0Var = hjs0Var.i;
                        kt2 kt2Var = hjs0Var.j;
                        zr1 zr1Var = hjs0Var.k;
                        pygVar.getClass();
                        iipVar.getClass();
                        m1eVar.getClass();
                        gii0Var.getClass();
                        oeg0Var.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        kt2Var.getClass();
                        return new gyi(cadVar, pygVar, iipVar, transferScreenParams, g2vVar, m1eVar, gii0Var, ctf0Var, wdk0Var, kt2Var, zr1Var);
                    }
                }
                jf4.n(b1j.i(hjs0.class, "Cannot create dependency "));
                return null;
            case 1:
                j6m0 j6m0Var2 = gjs0.R1;
                fiu0 fiu0Var = gjs0Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                j6m0 j6m0Var3 = gjs0.R1;
                gjs0Var.G0().x(eis0.f7875a);
                return Unit.f46060a;
            case 3:
                j6m0 j6m0Var4 = gjs0.R1;
                gjs0Var.G0().x(cis0.f4428a);
                return Unit.f46060a;
            default:
                j6m0 j6m0Var5 = gjs0.R1;
                gjs0Var.G0().x(bis0.f2672a);
                return Unit.f46060a;
        }
    }
}
