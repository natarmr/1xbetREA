package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.cyber.game.counterstrike.impl.presentation.statistic.tablet.Cs2StatisticTabletView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jnf extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jnf f16808a = new jnf(3, eth.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/counterstrike/impl/databinding/CybergameCs2StatisticTabletItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cybergame_cs2_statistic_tablet_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            return new eth((Cs2StatisticTabletView) viewInflate);
        }
        hny.u("rootView");
        return null;
    }
}
