package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v9c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37029a;
    public final /* synthetic */ x9c0 b;

    public /* synthetic */ v9c0(x9c0 x9c0Var, byte b) {
        this.f37029a = b;
        this.b = x9c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37029a;
        x9c0 x9c0Var = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = x9c0.Q1;
                x9c0Var.H0().x(w8c0.f38716a);
                return Unit.f46060a;
            case 1:
                rl70 rl70Var2 = x9c0.Q1;
                ComponentCallbacks2 application = x9c0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(z9c0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof z9c0)) {
                        ze3Var = null;
                    }
                    z9c0 z9c0Var = (z9c0) ze3Var;
                    if (z9c0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(x9c0Var);
                        i1w0VarF.getClass();
                        btt0 btt0Var = z9c0Var.d;
                        b4j b4jVar = z9c0Var.b;
                        wgu wguVar = z9c0Var.f;
                        ctf0 ctf0Var = z9c0Var.g;
                        mne mneVar = z9c0Var.c;
                        duj dujVar = z9c0Var.h;
                        rpt rptVar = z9c0Var.e;
                        gii0 gii0Var = z9c0Var.i;
                        ii iiVar = z9c0Var.k;
                        m1e m1eVar = z9c0Var.j;
                        knf0 knf0Var = z9c0Var.f44010a;
                        x20 x20Var = z9c0Var.l;
                        wdk0 wdk0Var = z9c0Var.m;
                        iiVar.getClass();
                        m1eVar.getClass();
                        btt0Var.getClass();
                        wguVar.getClass();
                        knf0Var.getClass();
                        ctf0Var.getClass();
                        gii0Var.getClass();
                        wdk0Var.getClass();
                        return new qpi(iiVar, i1w0VarF, m1eVar, btt0Var, b4jVar, rptVar, knf0Var, mneVar, ctf0Var, dujVar, gii0Var, x20Var, wdk0Var);
                    }
                }
                jf4.n(b1j.i(z9c0.class, "Cannot create dependency "));
                return null;
            case 2:
                opi opiVar = x9c0Var.N1;
                if (opiVar != null) {
                    return new q0h0(opiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                rl70 rl70Var3 = x9c0.Q1;
                x9c0Var.H0().x(e9c0.f7414a);
                return Unit.f46060a;
            default:
                rl70 rl70Var4 = x9c0.Q1;
                x9c0Var.H0().x(f9c0.f9148a);
                return Unit.f46060a;
        }
    }
}
