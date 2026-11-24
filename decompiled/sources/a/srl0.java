package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feed.navigation.SportFilterScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class srl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32683a;
    public final /* synthetic */ url0 b;

    public /* synthetic */ srl0(url0 url0Var, byte b) {
        this.f32683a = b;
        this.b = url0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32683a;
        url0 url0Var = this.b;
        switch (b) {
            case 0:
                cge0 cge0Var = url0.R1;
                url0Var.G0().x(frl0.f10025a);
                return Unit.f46060a;
            case 1:
                cge0 cge0Var2 = url0.R1;
                url0Var.G0().x(drl0.f6566a);
                return Unit.f46060a;
            case 2:
                cge0 cge0Var3 = url0.R1;
                url0Var.G0().x(grl0.f11785a);
                return Unit.f46060a;
            case 3:
                cge0 cge0Var4 = url0.R1;
                url0Var.G0().x(jrl0.f17008a);
                return Unit.f46060a;
            case 4:
                cge0 cge0Var5 = url0.R1;
                url0Var.G0().x(mrl0.f22279a);
                return Unit.f46060a;
            case 5:
                cge0 cge0Var6 = url0.R1;
                ComponentCallbacks2 application = url0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(vrl0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof vrl0)) {
                        ze3Var = null;
                    }
                    vrl0 vrl0Var = (vrl0) ze3Var;
                    if (vrl0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(url0Var);
                        SportFilterScreenParams sportFilterScreenParams = (SportFilterScreenParams) url0Var.Q1.n(url0Var, url0.S1[1]);
                        i1w0VarF.getClass();
                        mne mneVar = vrl0Var.f37905a;
                        g2v g2vVar = vrl0Var.b;
                        wdk0 wdk0Var = vrl0Var.c;
                        duj dujVar = vrl0Var.d;
                        s31 s31Var = vrl0Var.e;
                        cyu cyuVar = vrl0Var.f;
                        ii iiVar = vrl0Var.g;
                        ctf0 ctf0Var = vrl0Var.h;
                        iip iipVar = vrl0Var.i;
                        b4j b4jVar = vrl0Var.j;
                        je jeVar = vrl0Var.k;
                        iipVar.getClass();
                        wdk0Var.getClass();
                        iiVar.getClass();
                        ctf0Var.getClass();
                        return new uui(mneVar, iipVar, i1w0VarF, g2vVar, wdk0Var, dujVar, s31Var, cyuVar, iiVar, ctf0Var, sportFilterScreenParams, b4jVar, jeVar);
                    }
                }
                jf4.n(b1j.i(vrl0.class, "Cannot create dependency "));
                return null;
            default:
                tui tuiVar = url0Var.M1;
                if (tuiVar != null) {
                    return new q0h0(tuiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
