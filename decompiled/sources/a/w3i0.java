package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w3i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38504a;
    public final /* synthetic */ y3i0 b;

    public /* synthetic */ w3i0(y3i0 y3i0Var, byte b) {
        this.f38504a = b;
        this.b = y3i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38504a;
        y3i0 y3i0Var = this.b;
        switch (b) {
            case 0:
                lme0 lme0Var = y3i0.n2;
                ComponentCallbacks2 application = y3i0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(z3i0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof z3i0)) {
                        ze3Var = null;
                    }
                    z3i0 z3i0Var = (z3i0) ze3Var;
                    if (z3i0Var != null) {
                        return new fti(y3i0Var.P0(), z3i0Var.f43720a);
                    }
                }
                jf4.n(b1j.i(z3i0.class, "Cannot create dependency "));
                return null;
            case 1:
                return new q0h0((eti) ((fti) y3i0Var.l2.getValue()).c.get());
            default:
                lme0 lme0Var2 = y3i0.n2;
                ((k3t0) y3i0Var.m2.getValue()).x(u3i0.f34998a);
                return Unit.f46060a;
        }
    }
}
