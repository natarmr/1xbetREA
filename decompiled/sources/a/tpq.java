package a;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class tpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ypq f34346a;
    public final AndroidComposeView b;
    public final iz40 c;
    public final iz40 d;
    public boolean e;

    public tpq(ypq ypqVar, AndroidComposeView androidComposeView) {
        this.f34346a = ypqVar;
        this.b = androidComposeView;
        iz40 iz40Var = v1h0.f36630a;
        this.c = new iz40();
        this.d = new iz40();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        wej wejVar = new wej(0, this, tpq.class, "invalidateNodes", "invalidateNodes()V", 0, (byte) 16);
        vy40 vy40Var = this.b.Q1;
        if (!vy40Var.e(wejVar)) {
            vy40Var.a(wejVar);
        }
        this.e = true;
    }
}
