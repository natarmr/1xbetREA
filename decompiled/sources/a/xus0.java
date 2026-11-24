package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xus0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41527a;
    public final /* synthetic */ dvs0 b;

    public /* synthetic */ xus0(dvs0 dvs0Var, byte b) {
        this.f41527a = b;
        this.b = dvs0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41527a;
        yje yjeVar = null;
        dvs0 dvs0Var = this.b;
        switch (b) {
            case 0:
                g9m0 g9m0Var = dvs0.Q1;
                dvs0Var.H0().j.f(new xvs0(mvs0.f22472a));
                return Unit.f46060a;
            case 1:
                g9m0 g9m0Var2 = dvs0.Q1;
                dvs0Var.H0().j.f(v3c.R(dvs0Var.D(), "com.google.android.apps.authenticator2") ? vvs0.f38118a : wvs0.f39855a);
                return Unit.f46060a;
            case 2:
                g9m0 g9m0Var3 = dvs0.Q1;
                dws0 dws0VarH0 = dvs0Var.H0();
                if (((bws0) dws0VarH0.i.getValue()).f) {
                    bby bbyVar = dws0VarH0.k;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        dws0VarH0.k = sac.V(jiu0.a(dws0VarH0), new las0(1, dws0VarH0, dws0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 7), new qir0(dws0VarH0, (byte) 24), dws0VarH0.b.b, new cws0(dws0VarH0, yjeVar, (byte) 0), 8);
                    }
                } else {
                    dws0VarH0.j.f(uvs0.f36364a);
                }
                return Unit.f46060a;
            case 3:
                g9m0 g9m0Var4 = dvs0.Q1;
                ComponentCallbacks2 application = dvs0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(evs0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof evs0)) {
                        ze3Var = null;
                    }
                    evs0 evs0Var = (evs0) ze3Var;
                    if (evs0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(dvs0Var);
                        i1w0VarF.getClass();
                        return new kyi(evs0Var.f8488a, evs0Var.b, i1w0VarF);
                    }
                }
                jf4.n(b1j.i(evs0.class, "Cannot create dependency "));
                return null;
            case 4:
                g9m0 g9m0Var5 = dvs0.Q1;
                return (jyi) ((kyi) dvs0Var.N1.getValue()).d.get();
            default:
                g9m0 g9m0Var6 = dvs0.Q1;
                dvs0 dvs0Var2 = this.b;
                wdk0 wdk0Var = (wdk0) ((kyi) dvs0Var2.N1.getValue()).f19105a.h;
                x1x.y(wdk0Var);
                rek0 rek0Var = rek0.b;
                String strH = dvs0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), dvs0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
        }
    }
}
