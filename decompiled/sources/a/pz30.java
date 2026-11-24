package a;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class pz30 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zx10 f27826a;
    public final ActionProvider b;

    public pz30(sz30 sz30Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        zx10 zx10Var = this.f27826a;
        if (zx10Var != null) {
            ox30 ox30Var = ((hz30) zx10Var.f45137a).n;
            ox30Var.h = true;
            ox30Var.p(true);
        }
    }
}
