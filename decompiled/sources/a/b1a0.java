package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class b1a0 extends yge0 {
    public final String[] d;
    public final float[] e;
    public int f;
    public final /* synthetic */ PlayerControlView g;

    public b1a0(PlayerControlView playerControlView, String[] strArr, float[] fArr) {
        this.g = playerControlView;
        this.d = strArr;
        this.e = fArr;
    }

    @Override // a.yge0
    public final int d() {
        return this.d.length;
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        f1a0 f1a0Var = (f1a0) xhe0Var;
        View view = f1a0Var.v;
        View view2 = f1a0Var.f40887a;
        String[] strArr = this.d;
        if (i < strArr.length) {
            f1a0Var.u.setText(strArr[i]);
        }
        byte b = 4;
        if (i == this.f) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new nva(this, i, b));
    }

    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        return new f1a0(LayoutInflater.from(this.g.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
