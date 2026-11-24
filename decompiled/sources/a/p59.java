package a;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p59 implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26394a;
    public final /* synthetic */ yx5 b;

    public /* synthetic */ p59(yx5 yx5Var, byte b) {
        this.f26394a = b;
        this.b = yx5Var;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        byte b = this.f26394a;
        yx5 yx5Var = this.b;
        switch (b) {
            case 0:
                cl5 cl5Var = r59.P1;
                jar0.V(((r59) yx5Var).n0(), true);
                break;
            default:
                kl5 kl5Var = j79.O1;
                jar0.V(((j79) yx5Var).n0(), true);
                break;
        }
    }
}
