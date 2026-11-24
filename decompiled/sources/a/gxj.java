package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gxj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12080a;
    public final /* synthetic */ nxj b;
    public final /* synthetic */ rnk0 c;

    public /* synthetic */ gxj(nxj nxjVar, rnk0 rnk0Var, byte b) {
        this.f12080a = b;
        this.b = nxjVar;
        this.c = rnk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f12080a;
        rnk0 rnk0Var = this.c;
        nxj nxjVar = this.b;
        switch (b) {
            case 0:
                nxjVar.a(rnk0Var);
                break;
            case 1:
                if (nxjVar.b.contains(rnk0Var)) {
                    tnk0 tnk0Var = rnk0Var.f30792a;
                    View view = rnk0Var.c.l1;
                    view.getClass();
                    tnk0Var.a(view, nxjVar.f24286a);
                }
                break;
            default:
                nxjVar.b.remove(rnk0Var);
                nxjVar.c.remove(rnk0Var);
                break;
        }
    }
}
