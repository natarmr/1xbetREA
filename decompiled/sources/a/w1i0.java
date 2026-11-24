package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w1i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38401a;
    public final /* synthetic */ x1i0 b;

    public /* synthetic */ w1i0(x1i0 x1i0Var, byte b) {
        this.f38401a = b;
        this.b = x1i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38401a;
        x1i0 x1i0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = x1i0.n2;
                ComponentCallbacks2 application = x1i0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(y1i0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof y1i0)) {
                        ze3Var = null;
                    }
                    y1i0 y1i0Var = (y1i0) ze3Var;
                    if (y1i0Var != null) {
                        return new bti(x1i0Var.P0(), y1i0Var.f41856a);
                    }
                }
                jf4.n(b1j.i(y1i0.class, "Cannot create dependency "));
                return null;
            case 1:
                return new q0h0((ati) ((bti) x1i0Var.l2.getValue()).c.get());
            default:
                zie0 zie0Var2 = x1i0.n2;
                x1i0Var.Q0().x(s1i0.f31457a);
                return Unit.f46060a;
        }
    }
}
