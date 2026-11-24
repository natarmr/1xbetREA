package a;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class j80 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n80 f16063a;

    public j80(n80 n80Var) {
        this.f16063a = n80Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        jdk0 jdk0Var = n80.U1;
        n80 n80Var = this.f16063a;
        n80Var.G0().f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n80Var.G0().f.setAnimationEndListener$african_roulette(new h80(n80Var, (byte) 2));
        if (!n80Var.R1) {
            int i = -(n80Var.G0().f.getHeight() - n80Var.G0().f.getWidth());
            u90 u90VarH0 = n80Var.H0();
            sac.V(jiu0.a(u90VarH0), new b5((byte) 17), null, null, new l1(u90VarH0, new n90(i), null, (byte) 12), 14);
        }
        n80Var.H0().v = true;
        u90 u90VarH1 = n80Var.H0();
        int iOrdinal = u90VarH1.e.a().ordinal();
        if (iOrdinal == 0) {
            u90VarH1.H(new j90(false));
            return;
        }
        if (iOrdinal == 1) {
            u90VarH1.I();
            u90VarH1.w();
        } else if (iOrdinal == 2) {
            u90VarH1.I();
        } else {
            t9f.b();
        }
    }
}
