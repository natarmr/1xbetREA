package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.powerofpower.timer.PowerOfPowerTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x5o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x5o f40327a = new x5o(3, o6o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticPowerOfPowerTimerItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_power_of_power_timer_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            PowerOfPowerTimerView powerOfPowerTimerView = (PowerOfPowerTimerView) viewInflate;
            return new o6o0(powerOfPowerTimerView, powerOfPowerTimerView);
        }
        hny.u("rootView");
        return null;
    }
}
