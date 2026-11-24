package a;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ewq0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8540a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ ewq0(Toolbar toolbar, byte b) {
        this.f8540a = b;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f8540a;
        Toolbar toolbar = this.b;
        switch (b) {
            case 0:
                fwq0 fwq0Var = toolbar.p1;
                hz30 hz30Var = fwq0Var == null ? null : fwq0Var.b;
                if (hz30Var != null) {
                    hz30Var.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
