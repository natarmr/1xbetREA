package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nx70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24270a;
    public final /* synthetic */ ox70 b;

    public /* synthetic */ nx70(ox70 ox70Var, byte b) {
        this.f24270a = b;
        this.b = ox70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24270a;
        ox70 ox70Var = this.b;
        switch (b) {
            case 0:
                mi70 mi70Var = ox70.n2;
                ComponentCallbacks2 application = ox70Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(vx70.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof vx70)) {
                        ze3Var = null;
                    }
                    vx70 vx70Var = (vx70) ze3Var;
                    if (vx70Var != null) {
                        return new ymi(vx70Var.f38187a, (jvp0) ox70Var.m2.n(ox70Var, ox70.o2[0]));
                    }
                }
                jf4.n(b1j.i(vx70.class, "Cannot create dependency "));
                return null;
            case 1:
                mi70 mi70Var2 = ox70.n2;
                return new q0h0((xmi) ((ymi) ox70Var.k2.getValue()).c.get());
            case 2:
                mi70 mi70Var3 = ox70.n2;
                ox70Var.P0().x(sx70.f32962a);
                return Unit.f46060a;
            default:
                mi70 mi70Var4 = ox70.n2;
                ox70Var.P0().x(rx70.f31251a);
                return Unit.f46060a;
        }
    }
}
