package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ny60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24316a;
    public final /* synthetic */ py60 b;

    public /* synthetic */ ny60(py60 py60Var, byte b) {
        this.f24316a = b;
        this.b = py60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24316a;
        py60 py60Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = py60.P1;
                ((k3t0) py60Var.O1.getValue()).x(gy60.f12112a);
                return Unit.f46060a;
            case 1:
                iiy[] iiyVarArr2 = py60.P1;
                ComponentCallbacks2 application = py60Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(h3q.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof h3q)) {
                        ze3Var = null;
                    }
                    h3q h3qVar = (h3q) ze3Var;
                    if (h3qVar != null) {
                        a4n0.f(py60Var).getClass();
                        iw20 iw20Var = h3qVar.i;
                        cad cadVar = h3qVar.g;
                        duj dujVar = h3qVar.f12397a;
                        m1e m1eVar = h3qVar.b;
                        bw60 bw60Var = h3qVar.p;
                        oeg0 oeg0Var = h3qVar.c;
                        ctf0 ctf0Var = h3qVar.d;
                        r9u r9uVar = h3qVar.m;
                        ii iiVar = h3qVar.e;
                        wdk0 wdk0Var = h3qVar.f;
                        uyn uynVar = h3qVar.h;
                        jtj jtjVar = h3qVar.j;
                        lbu lbuVar = h3qVar.k;
                        hs60 hs60Var = h3qVar.l;
                        hnu hnuVar = h3qVar.n;
                        b8u b8uVar = h3qVar.o;
                        gw60 gw60Var = h3qVar.q;
                        bw60Var.getClass();
                        m1eVar.getClass();
                        oeg0Var.getClass();
                        r9uVar.getClass();
                        ctf0Var.getClass();
                        iiVar.getClass();
                        wdk0Var.getClass();
                        return new ehi(iw20Var, cadVar, dujVar, uynVar, ctf0Var, jtjVar, lbuVar, hs60Var, hnuVar, b8uVar, gw60Var);
                    }
                }
                jf4.n(b1j.i(h3q.class, "Cannot create dependency "));
                return null;
            default:
                iiy[] iiyVarArr3 = py60.P1;
                fiu0 fiu0Var = py60Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
