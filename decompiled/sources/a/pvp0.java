package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pvp0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27674a;
    public final /* synthetic */ qvp0 b;

    public /* synthetic */ pvp0(qvp0 qvp0Var, byte b) {
        this.f27674a = b;
        this.b = qvp0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27674a;
        qvp0 qvp0Var = this.b;
        switch (b) {
            case 0:
                int i = qvp0.m2;
                ComponentCallbacks2 application = qvp0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(vvp0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof vvp0)) {
                        ze3Var = null;
                    }
                    vvp0 vvp0Var = (vvp0) ze3Var;
                    if (vvp0Var != null) {
                        return new uwi(vvp0Var.f38113a);
                    }
                }
                jf4.n(b1j.i(vvp0.class, "Cannot create dependency "));
                return null;
            case 1:
                int i2 = qvp0.m2;
                return new q0h0((twi) ((uwi) qvp0Var.k2.getValue()).b.get());
            case 2:
                int i3 = qvp0.m2;
                ((k3t0) qvp0Var.l2.getValue()).x(svp0.f32880a);
                return Unit.f46060a;
            default:
                int i4 = qvp0.m2;
                ((k3t0) qvp0Var.l2.getValue()).x(tvp0.f34612a);
                return Unit.f46060a;
        }
    }
}
