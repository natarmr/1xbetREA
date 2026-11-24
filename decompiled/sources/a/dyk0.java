package a;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes5.dex */
public final class dyk0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hyk0 f6898a;

    public dyk0(hyk0 hyk0Var) {
        this.f6898a = hyk0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        iiy[] iiyVarArr = hyk0.U1;
        hyk0 hyk0Var = this.f6898a;
        hyk0Var.G0().i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        hyk0Var.G0().b.b(hyk0Var.G0().f.getTop(), hyk0Var.G0().d.getTop(), hyk0Var.G0().e.getLeft());
        hyk0Var.G0().i.setAnimationEndListener(new byk0(hyk0Var, (byte) 2));
        yje yjeVar = null;
        if (!hyk0Var.R1) {
            int i = -(hyk0Var.G0().i.getHeight() - hyk0Var.G0().i.getWidth());
            tyk0 tyk0VarH0 = hyk0Var.H0();
            sac.V(jiu0.a(tyk0VarH0), new ejk0((byte) 12), null, null, new kbh0(tyk0VarH0, new dav0(i), yjeVar, (byte) 24), 14);
        }
        tyk0 tyk0VarH1 = hyk0Var.H0();
        int iOrdinal = tyk0VarH1.d.a().ordinal();
        if (iOrdinal == 0) {
            sac.V(jiu0.a(tyk0VarH1), new gvj0(1, tyk0VarH1, tyk0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, tyk0VarH1.v.f22085a, new oyk0(tyk0VarH1, null, (byte) 2), 10);
        } else if (iOrdinal == 1) {
            tyk0VarH1.F();
            tyk0VarH1.w();
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            tyk0VarH1.F();
        }
        hyk0Var.H0().C = true;
    }
}
