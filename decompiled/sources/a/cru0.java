package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cru0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4862a;
    public final /* synthetic */ eru0 b;

    public /* synthetic */ cru0(eru0 eru0Var, byte b) {
        this.f4862a = b;
        this.b = eru0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4862a;
        eru0 eru0Var = this.b;
        switch (b) {
            case 0:
                wxs0 wxs0Var = eru0.Q1;
                ComponentCallbacks2 application = eru0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(lnu0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof lnu0)) {
                        ze3Var = null;
                    }
                    lnu0 lnu0Var = (lnu0) ze3Var;
                    if (lnu0Var != null) {
                        g2v g2vVar = lnu0Var.f20364a;
                        cad cadVar = lnu0Var.b;
                        m1e m1eVar = lnu0Var.c;
                        gii0 gii0Var = lnu0Var.d;
                        oeg0 oeg0Var = lnu0Var.e;
                        pyg pygVar = lnu0Var.f;
                        ctf0 ctf0Var = lnu0Var.g;
                        pmi pmiVar = lnu0Var.h;
                        knf0 knf0Var = lnu0Var.i;
                        iip iipVar = lnu0Var.j;
                        vqc vqcVar = lnu0Var.k;
                        sjl0 sjl0Var = lnu0Var.l;
                        pygVar.getClass();
                        iipVar.getClass();
                        m1eVar.getClass();
                        sjl0Var.getClass();
                        gii0Var.getClass();
                        oeg0Var.getClass();
                        ctf0Var.getClass();
                        knf0Var.getClass();
                        return new bzi(cadVar, pygVar, g2vVar, m1eVar, gii0Var, oeg0Var, ctf0Var, pmiVar, knf0Var, vqcVar);
                    }
                }
                jf4.n(b1j.i(lnu0.class, "Cannot create dependency "));
                return null;
            case 1:
                wxs0 wxs0Var2 = eru0.Q1;
                fiu0 fiu0Var = eru0Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                wxs0 wxs0Var3 = eru0.Q1;
                ((k3t0) eru0Var.N1.getValue()).x(squ0.f32645a);
                return Unit.f46060a;
        }
    }
}
