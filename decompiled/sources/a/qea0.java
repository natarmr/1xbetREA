package a;

import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;

/* JADX INFO: loaded from: classes.dex */
public final class qea0 implements ky90, View.OnClickListener, i1a0, a1a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amq0 f28575a = new amq0();
    public Object b;
    public final /* synthetic */ PlayerView c;

    public qea0(PlayerView playerView) {
        this.c = playerView;
    }

    @Override // a.ky90
    public final void C(dtf dtfVar) {
        SubtitleView subtitleView = this.c.i;
        if (subtitleView != null) {
            subtitleView.setCues(dtfVar.f6653a);
        }
    }

    @Override // a.ky90
    public final void E(rds0 rds0Var) {
        PlayerView playerView = this.c;
        my90 my90Var = playerView.s;
        my90Var.getClass();
        ulo uloVar = (ulo) my90Var;
        bmq0 bmq0VarN = uloVar.w(17) ? uloVar.n() : bmq0.f2849a;
        if (bmq0VarN.p()) {
            this.b = null;
        } else {
            boolean zW = uloVar.w(30);
            amq0 amq0Var = this.f28575a;
            if (!zW || uloVar.o().f30305a.isEmpty()) {
                Object obj = this.b;
                if (obj != null) {
                    int iB = bmq0VarN.b(obj);
                    if (iB != -1) {
                        if (uloVar.j() == bmq0VarN.f(iB, amq0Var, false).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                this.b = bmq0VarN.f(uloVar.k(), amq0Var, true).b;
            }
        }
        playerView.n(false);
    }

    @Override // a.ky90
    public final void a(qfu0 qfu0Var) {
        PlayerView playerView;
        my90 my90Var;
        if (qfu0Var.equals(qfu0.d) || (my90Var = (playerView = this.c).s) == null || ((ulo) my90Var).s() == 1) {
            return;
        }
        playerView.j();
    }

    @Override // a.ky90
    public final void f(int i) {
        int i2 = PlayerView.j1;
        PlayerView playerView = this.c;
        playerView.k();
        playerView.m();
        if (!playerView.c() || !playerView.g1) {
            playerView.e(false);
            return;
        }
        PlayerControlView playerControlView = playerView.l;
        if (playerControlView != null) {
            playerControlView.f();
        }
    }

    @Override // a.ky90
    public final void l() {
        PlayerView playerView = this.c;
        View view = playerView.c;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.a()) {
                playerView.b();
                return;
            }
            ImageView imageView = playerView.g;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.j1;
        this.c.i();
    }

    @Override // a.ky90
    public final void q(int i, int i2) {
        PlayerView playerView = this.c;
        View view = playerView.d;
        if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.i1) {
            tea0 tea0Var = playerView.f;
            tea0Var.getClass();
            playerView.o.post(new b1(tea0Var, (SurfaceView) view, new wss(playerView, (byte) 16), (byte) 22));
        }
    }

    @Override // a.ky90
    public final void u(int i, ly90 ly90Var, ly90 ly90Var2) {
        PlayerControlView playerControlView;
        int i2 = PlayerView.j1;
        PlayerView playerView = this.c;
        if (playerView.c() && playerView.g1 && (playerControlView = playerView.l) != null) {
            playerControlView.f();
        }
    }

    @Override // a.ky90
    public final void x(int i, boolean z) {
        int i2 = PlayerView.j1;
        PlayerView playerView = this.c;
        playerView.k();
        if (!playerView.c() || !playerView.g1) {
            playerView.e(false);
            return;
        }
        PlayerControlView playerControlView = playerView.l;
        if (playerControlView != null) {
            playerControlView.f();
        }
    }
}
