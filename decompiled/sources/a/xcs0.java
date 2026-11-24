package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xcs0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40663a;
    public final /* synthetic */ zcs0 b;

    public /* synthetic */ xcs0(zcs0 zcs0Var, byte b) {
        this.f40663a = b;
        this.b = zcs0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40663a;
        pk2 pk2Var = pk2.f27116a;
        ok2 ok2Var = ok2.f25386a;
        zcs0 zcs0Var = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = zcs0.O1;
                ComponentCallbacks2 application = zcs0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(dep.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof dep)) {
                        ze3Var = null;
                    }
                    dep depVar = (dep) ze3Var;
                    if (depVar != null) {
                        return depVar.a(a4n0.f(zcs0Var));
                    }
                }
                jf4.n(b1j.i(dep.class, "Cannot create dependency "));
                return null;
            case 1:
                s2m0 s2m0Var2 = zcs0.O1;
                return new q0h0((ngi) zcs0Var.H0().C.get());
            case 2:
                s2m0 s2m0Var3 = zcs0.O1;
                zcs0Var.G0().x(pk2Var);
                return Unit.f46060a;
            case 3:
                s2m0 s2m0Var4 = zcs0.O1;
                zcs0Var.G0().x(ok2Var);
                return Unit.f46060a;
            case 4:
                s2m0 s2m0Var5 = zcs0.O1;
                zcs0Var.G0().x(kk2.f18416a);
                return Unit.f46060a;
            case 5:
                s2m0 s2m0Var6 = zcs0.O1;
                zcs0Var.G0().x(pk2Var);
                return Unit.f46060a;
            default:
                s2m0 s2m0Var7 = zcs0.O1;
                zcs0Var.G0().x(ok2Var);
                return Unit.f46060a;
        }
    }
}
