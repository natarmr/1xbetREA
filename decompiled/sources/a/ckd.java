package a;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ckd extends c2 {
    public final vne c;
    public Function2 d;
    public q99 e;
    public c4m0 f;
    public boolean g;

    public ckd(vne vneVar, ssb0 ssb0Var) {
        super(ssb0Var);
        this.c = vneVar;
        byte b = 2;
        this.d = new p23(b, null, b);
    }

    @Override // a.c2
    public final void A() {
        x();
        if (super.u()) {
            this.g = true;
            this.e = vtb.d(-2, i99.f14377a, null, 4);
            this.f = qjj.W(this.c, null, null, new jtb(this, null, (byte) 9), 3);
        }
    }

    public final void Q(boolean z) {
        c4m0 c4m0Var;
        if (!z && super.u() && (c4m0Var = this.f) != null && !c4m0Var.isActive()) {
            x();
        }
        ((v62) this.f3600a).f(z);
        ((qb5) this.b).i(z);
    }

    @Override // a.c2
    public final void x() {
        q99 q99Var = this.e;
        if (q99Var != null) {
            q99Var.e(new CancellationException("onBack cancelled"), true);
        }
        c4m0 c4m0Var = this.f;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // a.c2
    public final void y() {
        if (this.e != null && !this.g) {
            x();
        }
        yje yjeVar = null;
        if (this.e == null) {
            this.g = false;
            this.e = vtb.d(-2, i99.f14377a, null, 4);
            this.f = qjj.W(this.c, null, null, new jtb(this, yjeVar, (byte) 9), 3);
        }
        q99 q99Var = this.e;
        if (q99Var != null) {
            q99Var.d(null);
        }
        this.g = false;
    }

    @Override // a.c2
    public final void z(pb5 pb5Var) {
        q99 q99Var = this.e;
        if (q99Var != null) {
            q99Var.f(pb5Var);
        }
    }
}
