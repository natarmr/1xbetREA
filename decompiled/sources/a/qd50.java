package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qd50 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qd50 f28519a = new qd50(3, yc50.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/settings/impl/databinding/NavigationBarSubtitleLayoutBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.navigation_bar_subtitle_layout, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) viewInflate;
            return new yc50(dsNavigationBarBasic, dsNavigationBarBasic);
        }
        hny.u("rootView");
        return null;
    }
}
