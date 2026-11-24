package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.powerofpower.table.PowerOfPowerColumnView;
import org.xplatform.cyber.game.universal.impl.presentation.powerofpower.table.PowerOfPowerScrollableTableView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w5o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w5o f38593a = new w5o(3, kqb0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/PowerOfPowerTableItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.power_of_power_table_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.heroesColumn;
        PowerOfPowerColumnView powerOfPowerColumnView = (PowerOfPowerColumnView) yum0.f(viewInflate, R.id.heroesColumn);
        if (powerOfPowerColumnView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            int i2 = R.id.scrollView;
            if (((HorizontalScrollView) yum0.f(viewInflate, R.id.scrollView)) != null) {
                i2 = R.id.scrollableTable;
                PowerOfPowerScrollableTableView powerOfPowerScrollableTableView = (PowerOfPowerScrollableTableView) yum0.f(viewInflate, R.id.scrollableTable);
                if (powerOfPowerScrollableTableView != null) {
                    return new kqb0(linearLayout, powerOfPowerColumnView, powerOfPowerScrollableTableView);
                }
            }
            i = i2;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
