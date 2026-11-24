package a;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wfn0;", "La/sik;", "<init>", "()V", "a/s2m0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wfn0 extends sik {
    public final khf0 Y1 = new khf0("SUCCESS_BET_STRING_MODEL");
    public final khf0 Z1 = new khf0("SUCCESS_BET_ALERT_MODEL");
    public final yzn0 a2 = new yzn0("BET_DONE_ICON_STYLE");
    public final yzn0 b2 = new yzn0("BET_DONE_SCREEN_STYLE");
    public final a8z c2 = maz.a(wez.b, new vfn0(this, 0));
    public final a8z d2 = xbc.a0(this, sre0.f32672a.b(sgn0.class), null, new vfn0(this, 1), 14);
    public static final /* synthetic */ iiy[] f2 = {new ez40(wfn0.class, "successBetStringModel", "getSuccessBetStringModel()Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;", 0), new ez40(wfn0.class, "successBetAlertModel", "getSuccessBetAlertModel()Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;", 0), new ez40(wfn0.class, "betDoneIconStyle", "getBetDoneIconStyle()Lorg/xplatform/remoteconfig/domain/models/BetDoneIconStyle;", 0), new ez40(wfn0.class, "betDoneScreenStyle", "getBetDoneScreenStyle()Lorg/xplatform/remoteconfig/domain/models/BetDoneScreenStyle;", 0)};
    public static final s2m0 e2 = new s2m0();
    public static final String g2 = wfn0.class.getName();

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.i(composeView, null, new ugd(-775017403, true, new abn0(this, (byte) 3)));
        return composeView;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        View decorView;
        super.g0();
        Dialog dialog = this.S1;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setGravity(17);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawableResource(R.color.static_transparent);
            }
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                window3.setWindowAnimations(R.style.Widget_Dialog_AlertDialogAnimation);
            }
            Window window4 = dialog.getWindow();
            if (window4 != null && (decorView = window4.getDecorView()) != null) {
                WeakHashMap weakHashMap = rgu0.f30456a;
                decorView.setElevation(0.0f);
            }
            dialog.setCanceledOnTouchOutside(false);
            E0(false);
            Window window5 = dialog.getWindow();
            if (window5 != null) {
                window5.setLayout(Math.min(G().getDimensionPixelSize(R.dimen.size_400), G().getDisplayMetrics().widthPixels - (G().getDimensionPixelSize(R.dimen.space_16) * 2)), -2);
            }
        }
    }
}
