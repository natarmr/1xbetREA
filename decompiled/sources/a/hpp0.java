package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hpp0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13454a;
    public final /* synthetic */ jpp0 b;

    public /* synthetic */ hpp0(jpp0 jpp0Var, byte b) {
        this.f13454a = b;
        this.b = jpp0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13454a;
        jpp0 jpp0Var = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = jpp0.O1;
                ComponentCallbacks2 application = jpp0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(y4b.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof y4b)) {
                        ze3Var = null;
                    }
                    y4b y4bVar = (y4b) ze3Var;
                    if (y4bVar != null) {
                        return y4bVar.a(a4n0.f(jpp0Var));
                    }
                }
                jf4.n(b1j.i(y4b.class, "Cannot create dependency "));
                return null;
            case 1:
                s2m0 s2m0Var2 = jpp0.O1;
                return new q0h0((xbi) ((aci) jpp0Var.L1.getValue()).Y.get());
            case 2:
                s2m0 s2m0Var3 = jpp0.O1;
                jpp0Var.G0().x(oh2.f25244a);
                return Unit.f46060a;
            default:
                s2m0 s2m0Var4 = jpp0.O1;
                jpp0Var.G0().x(nh2.f23512a);
                return Unit.f46060a;
        }
    }
}
