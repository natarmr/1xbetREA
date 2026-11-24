package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y1v0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41879a;
    public final /* synthetic */ a2v0 b;

    public /* synthetic */ y1v0(a2v0 a2v0Var, byte b) {
        this.f41879a = b;
        this.b = a2v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41879a;
        a2v0 a2v0Var = this.b;
        switch (b) {
            case 0:
                svs0 svs0Var = a2v0.g2;
                vcc.f0(i120.U(), a2v0Var, a2v0Var.S0().f3643a);
                a2v0Var.z0(false, false, false);
                return Unit.f46060a;
            case 1:
                svs0 svs0Var2 = a2v0.g2;
                ComponentCallbacks2 application = a2v0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(b2v0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof b2v0)) {
                        ze3Var = null;
                    }
                    b2v0 b2v0Var = (b2v0) ze3Var;
                    if (b2v0Var != null) {
                        c2v0 c2v0VarS0 = a2v0Var.S0();
                        ntu ntuVar = b2v0Var.f1874a;
                        vby vbyVar = b2v0Var.b;
                        g2v g2vVar = b2v0Var.c;
                        pyu pyuVar = b2v0Var.d;
                        l6a l6aVar = b2v0Var.e;
                        mne mneVar = b2v0Var.f;
                        vbyVar.getClass();
                        l6aVar.getClass();
                        return new izi(mneVar, ntuVar, pyuVar, g2vVar, c2v0VarS0);
                    }
                }
                jf4.n(b1j.i(b2v0.class, "Cannot create dependency "));
                return null;
            default:
                return new fiu0(Collections.singletonMap(h2v0.class, ((izi) a2v0Var.c2.getValue()).f));
        }
    }
}
