package a;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class xob extends rms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41208a = false;
    public final ViewGroup b;

    public xob(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // a.rms0, a.dms0
    public final void a() {
        v2n0.q(this.b, false);
    }

    @Override // a.rms0, a.dms0
    public final void b(gms0 gms0Var) {
        if (!this.f41208a) {
            v2n0.q(this.b, false);
        }
        gms0Var.I(this);
    }

    @Override // a.rms0, a.dms0
    public final void d() {
        v2n0.q(this.b, true);
    }

    @Override // a.rms0, a.dms0
    public final void g(gms0 gms0Var) {
        v2n0.q(this.b, false);
        this.f41208a = true;
    }
}
