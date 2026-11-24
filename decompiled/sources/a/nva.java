package a;

import android.view.View;
import androidx.media3.ui.PlayerControlView;
import kotlin.jvm.functions.Function1;
import org.xplatform.feature.fin_bet.impl.presentation.view.CarriageContainer;
import org.xplatform.games_section.feature.weekly_reward.presentation.custom_veiw.DaysProgressView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nva implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24180a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nva(Object obj, int i, byte b) {
        this.f24180a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object value;
        byte b = this.f24180a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                CarriageContainer carriageContainer = (CarriageContainer) obj;
                int i2 = CarriageContainer.f;
                carriageContainer.setupViewIndex(i);
                carriageContainer.d.invoke(Integer.valueOf(i));
                break;
            case 1:
                kud kudVar = dbe.k2;
                ibe ibeVarU0 = ((dbe) obj).U0();
                h9e0 h9e0Var = new h9e0(i + 1);
                p7m0 p7m0Var = ibeVarU0.b;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, hbe.a((hbe) value, null, h9e0Var, 1)));
                break;
            case 2:
                int i3 = DaysProgressView.b;
                ((Function1) obj).invoke(Integer.valueOf(i));
                break;
            case 3:
                ox50 ox50Var = (ox50) obj;
                rh60 rh60Var = ox50Var.b;
                if (rh60Var != null) {
                    if ((ox50Var.c ? null : rh60Var) != null) {
                        ox50Var.c = true;
                        ox50Var.d = i;
                        rh60Var.c(i);
                    }
                }
                break;
            default:
                b1a0 b1a0Var = (b1a0) obj;
                PlayerControlView playerControlView = b1a0Var.g;
                if (i != b1a0Var.f) {
                    playerControlView.setPlaybackSpeed(b1a0Var.e[i]);
                }
                playerControlView.r.dismiss();
                break;
        }
    }
}
