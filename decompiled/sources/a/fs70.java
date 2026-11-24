package a;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class fs70 extends po8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gs70 f10052a;

    public fs70(gs70 gs70Var) {
        this.f10052a = gs70Var;
    }

    @Override // a.po8
    public final void b(View view, float f) {
        if (f < 0.0f) {
            nh70 nh70Var = gs70.r2;
            gs70 gs70Var = this.f10052a;
            gs70Var.P0().x(bs70.f3115a);
            gs70Var.L0().N(3);
            gs70Var.L0().L = false;
        }
    }

    @Override // a.po8
    public final void c(View view, int i) {
    }
}
