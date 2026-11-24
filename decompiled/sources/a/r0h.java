package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.chips.DsChipGroup;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r0h extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0h f29629a = new r0h(3, wah0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/special_event/impl/databinding/ScrollableChipsGroupBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.scrollable_chips_group, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        DsChipGroup dsChipGroup = (DsChipGroup) yum0.f(viewInflate, R.id.chipsGroup);
        if (dsChipGroup != null) {
            return new wah0((HorizontalScrollView) viewInflate, dsChipGroup);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.chipsGroup)));
        return null;
    }
}
