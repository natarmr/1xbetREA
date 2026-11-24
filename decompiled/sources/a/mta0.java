package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mta0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22362a;
    public final /* synthetic */ nta0 b;

    public /* synthetic */ mta0(nta0 nta0Var, byte b) {
        this.f22362a = b;
        this.b = nta0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22362a;
        nta0 nta0Var = this.b;
        switch (b) {
            case 0:
                int i = nta0.m2;
                ComponentCallbacks2 application = nta0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(pta0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof pta0)) {
                        ze3Var = null;
                    }
                    pta0 pta0Var = (pta0) ze3Var;
                    if (pta0Var != null) {
                        ocl oclVar = pta0Var.c;
                        knf0 knf0Var = pta0Var.e;
                        gii0 gii0Var = pta0Var.d;
                        cad cadVar = pta0Var.b;
                        ctf0 ctf0Var = pta0Var.f27555a;
                        xv20 xv20Var = pta0Var.f;
                        duj dujVar = pta0Var.g;
                        xv20Var.getClass();
                        knf0Var.getClass();
                        gii0Var.getClass();
                        ctf0Var.getClass();
                        return new poi(cadVar, xv20Var, oclVar, knf0Var, gii0Var, dujVar);
                    }
                }
                jf4.n(b1j.i(pta0.class, "Cannot create dependency "));
                return null;
            case 1:
                return new fiu0(Collections.singletonMap(ota0.class, ((poi) nta0Var.k2.getValue()).g));
            default:
                int i2 = nta0.m2;
                ((k3t0) nta0Var.l2.getValue()).x(lqa0.f20478a);
                return Unit.f46060a;
        }
    }
}
