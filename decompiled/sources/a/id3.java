package a;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class id3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14563a;
    public final /* synthetic */ pd3 b;

    public /* synthetic */ id3(pd3 pd3Var, byte b) {
        this.f14563a = b;
        this.b = pd3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.f14563a;
        pd3 pd3Var = this.b;
        switch (b) {
            case 0:
                if ((pd3Var.y1 & 1) != 0) {
                    pd3Var.M(0);
                }
                if ((pd3Var.y1 & 4096) != 0) {
                    pd3Var.M(108);
                }
                pd3Var.x1 = false;
                pd3Var.y1 = 0;
                break;
            default:
                pd3Var.v.showAtLocation(pd3Var.u, 55, 0, 0);
                zju0 zju0Var = pd3Var.x;
                if (zju0Var != null) {
                    zju0Var.b();
                }
                if (pd3Var.y && (viewGroup = pd3Var.z) != null && viewGroup.isLaidOut()) {
                    pd3Var.u.setAlpha(0.0f);
                    zju0 zju0VarA = rgu0.a(pd3Var.u);
                    zju0VarA.a(1.0f);
                    pd3Var.x = zju0VarA;
                    zju0VarA.d(new jd3(this, (byte) 0));
                } else {
                    pd3Var.u.setAlpha(1.0f);
                    pd3Var.u.setVisibility(0);
                }
                break;
        }
    }
}
