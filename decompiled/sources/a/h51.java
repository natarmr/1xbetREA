package a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/h51;", "La/of80;", "<init>", "()V", "a/pek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h51 extends of80 {
    public final s0r Y1;
    public static final /* synthetic */ iiy[] a2 = {new j0d0(h51.class, "binding", "getBinding()Lorg/xplatform/aggregator/game/impl/databinding/AggregatorLoadingGameDialogBinding;", 0)};
    public static final pek0 Z1 = new pek0();

    public h51() {
        super(R.layout.aggregator_loading_game_dialog);
        this.Y1 = ltt0.o(this, g51.f10694a);
    }

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        hgd hgdVar = new hgd(o0(), this.M1);
        Window window = hgdVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            bcm0.x(window, false);
        }
        hgdVar.setCancelable(false);
        bdx.O(hgdVar.k(), this, new eo0((byte) 16));
        return hgdVar;
    }

    @Override // a.of80
    public final void J0() {
        Window window;
        Dialog dialog = this.S1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Context context = dialog.getContext();
        context.getClass();
        ofm0.A(window, context, R.color.static_transparent, R.color.static_transparent, false, false);
    }

    @Override // a.of80, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F0(2, R.style.AppTheme_Overlay_Dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        Window window;
        view.getClass();
        Dialog dialog = this.S1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            bcm0.x(window, false);
        }
        Object objN = this.Y1.n(a2[0], this);
        objN.getClass();
        pkd.h(((i51) objN).b, new owp0(this), null, bsr0.f3146a);
    }
}
