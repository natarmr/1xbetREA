package a;

import android.widget.ImageView;
import androidx.media3.ui.PlayerControlView;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class y0a0 extends i26 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ PlayerControlView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0a0(PlayerControlView playerControlView, byte b) {
        super(playerControlView);
        this.g = b;
        this.h = playerControlView;
    }

    @Override // a.i26
    public void C(f1a0 f1a0Var, int i) {
        switch (this.g) {
            case 1:
                super.C(f1a0Var, i);
                if (i > 0) {
                    g1a0 g1a0Var = (g1a0) ((List) this.e).get(i - 1);
                    f1a0Var.v.setVisibility(g1a0Var.f10503a.e[g1a0Var.b] ? 0 : 4);
                }
                break;
            default:
                super.C(f1a0Var, i);
                break;
        }
    }

    @Override // a.i26
    public final void D(f1a0 f1a0Var) {
        boolean z;
        switch (this.g) {
            case 0:
                f1a0Var.u.setText(R.string.exo_track_selection_auto);
                my90 my90Var = this.h.Q1;
                my90Var.getClass();
                f1a0Var.v.setVisibility(H(((ulo) my90Var).v()) ? 4 : 0);
                f1a0Var.f40887a.setOnClickListener(new l910(this, (byte) 16));
                break;
            default:
                f1a0Var.u.setText(R.string.exo_track_selection_none);
                int i = 0;
                while (true) {
                    if (i < ((List) this.e).size()) {
                        g1a0 g1a0Var = (g1a0) ((List) this.e).get(i);
                        if (g1a0Var.f10503a.e[g1a0Var.b]) {
                            z = false;
                        } else {
                            i++;
                        }
                    } else {
                        z = true;
                    }
                }
                f1a0Var.v.setVisibility(z ? 0 : 4);
                f1a0Var.f40887a.setOnClickListener(new l910(this, (byte) 18));
                break;
        }
    }

    @Override // a.i26
    public final void F(String str) {
        switch (this.g) {
            case 0:
                ((String[]) this.h.m.f)[1] = str;
                break;
        }
    }

    public boolean H(scs0 scs0Var) {
        for (int i = 0; i < ((List) this.e).size(); i++) {
            if (scs0Var.w.containsKey(((g1a0) ((List) this.e).get(i)).f10503a.b)) {
                return true;
            }
        }
        return false;
    }

    public void I(List list) {
        PlayerControlView playerControlView = this.h;
        ImageView imageView = playerControlView.g1;
        boolean z = false;
        for (int i = 0; i < ((rcf0) list).d; i++) {
            g1a0 g1a0Var = (g1a0) ((rcf0) list).get(i);
            if (g1a0Var.f10503a.e[g1a0Var.b]) {
                z = true;
                break;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? playerControlView.I1 : playerControlView.J1);
            imageView.setContentDescription(z ? playerControlView.K1 : playerControlView.L1);
        }
        this.e = list;
    }

    @Override // a.i26, a.yge0
    public /* bridge */ /* synthetic */ void n(xhe0 xhe0Var, int i) {
        switch (this.g) {
            case 1:
                C((f1a0) xhe0Var, i);
                break;
            default:
                super.n(xhe0Var, i);
                break;
        }
    }

    private final void J(String str) {
    }
}
