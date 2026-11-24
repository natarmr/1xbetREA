package a;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.StickyHeaderLayoutManager;
import org.xplatform.lucky_wheel.presentation.views.WheelView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoTabsContainerView;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;

/* JADX INFO: loaded from: classes6.dex */
public final class w23 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38431a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w23(Object obj, byte b) {
        this.f38431a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.f38431a;
        Object obj = this.b;
        switch (b) {
            case 0:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ((ngh) obj).invoke(view);
                return;
            case 1:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ((org.xplatform.app_start.impl.presentation.view.content.partner.b) obj).a();
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                int i9 = ApplicationActivity.F1;
                ((ApplicationActivity) obj).I(false);
                return;
            case 3:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                iyq iyqVar = (iyq) obj;
                FrameLayout frameLayout = iyqVar.c;
                iyqVar.b.getBarcodeView().setFramingRectSize(new g7k0(frameLayout.getWidth(), frameLayout.getHeight()));
                return;
            case 4:
                throw null;
            case 5:
                view.removeOnLayoutChangeListener(this);
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.scrollBy(0, -1);
                recyclerView.scrollBy(0, 1);
                return;
            case 6:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ((DsCellLeftIcon) obj).k.k();
                return;
            case 7:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                View cellLeftView = ((DsMenuCell) obj).getCellLeftView();
                DsCellLeftIcon dsCellLeftIcon = cellLeftView instanceof DsCellLeftIcon ? (DsCellLeftIcon) cellLeftView : null;
                if (dsCellLeftIcon != null) {
                    dsCellLeftIcon.k.k();
                    return;
                }
                return;
            case 8:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ((t7o0) obj).d.fullScroll(130);
                return;
            case 9:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) obj;
                int i10 = MatchInfoContainerView.t1;
                if (matchInfoContainerView.G()) {
                    MatchInfoTabsContainerView matchInfoTabsContainerView = matchInfoContainerView.getBinding().f;
                    int height = matchInfoTabsContainerView.getHeight();
                    ViewGroup.LayoutParams layoutParams = matchInfoTabsContainerView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    float f = -(height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
                    matchInfoTabsContainerView.setTranslationY(f);
                    matchInfoContainerView.getBinding().i.setTranslationY(f);
                    return;
                }
                return;
            case 10:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                MatchInfoTabsContainerView matchInfoTabsContainerView2 = (MatchInfoTabsContainerView) obj;
                matchInfoTabsContainerView2.d.b = matchInfoTabsContainerView2.getMeasuredHeight();
                return;
            case 11:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                vcc.f0(i120.V(new Pair("PICKER_DIALOG_TAG", Boolean.TRUE)), (ao90) obj, "PICKER_DIALOG_TAG");
                return;
            case 12:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                vcc.f0(i120.V(new Pair("PICKER_DIALOG_TAG", Boolean.TRUE)), (zo90) obj, "PICKER_DIALOG_TAG");
                return;
            case 13:
                androidx.appcompat.widget.d dVar = (androidx.appcompat.widget.d) obj;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = dVar.p;
                View view2 = dVar.x;
                if (view2.getWidth() > 1) {
                    Resources resources = dVar.getContext().getResources();
                    int paddingLeft = dVar.r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z = cmu0.f4626a;
                    boolean z2 = dVar.getLayoutDirection() == 1;
                    int dimensionPixelSize = dVar.q1 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchView$SearchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i11 = rect.left;
                    searchView$SearchAutoComplete.setDropDownHorizontalOffset(z2 ? -i11 : paddingLeft - (i11 + dimensionPixelSize));
                    searchView$SearchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            case 14:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                cge0 cge0Var = ddl0.V1;
                s96 s96Var = ((ddl0) obj).G0().e.b;
                ukm ukmVarB = s96Var != null ? s96Var.b("SEARCH_NAV_ITEM_KEY") : null;
                if (ukmVarB != null) {
                    ukmVarB.setNavigationBarButtonEnable(true);
                    return;
                }
                return;
            case 15:
                view.removeOnLayoutChangeListener(this);
                iab iabVar = ((j2m0) obj).f15787a;
                if (iabVar != null) {
                    ((TableViewImpl) iabVar.g).getCellLayoutManager().C1();
                    return;
                } else {
                    Intrinsics.h("binding");
                    throw null;
                }
            case 16:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                StickyHeaderLayoutManager stickyHeaderLayoutManager = (StickyHeaderLayoutManager) obj;
                int i12 = stickyHeaderLayoutManager.n1;
                if (i12 != -1) {
                    stickyHeaderLayoutManager.w1(i12, stickyHeaderLayoutManager.o1);
                    stickyHeaderLayoutManager.n1 = -1;
                    stickyHeaderLayoutManager.o1 = Integer.MIN_VALUE;
                    return;
                }
                return;
            case 17:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                j6m0 j6m0Var = vvn0.W1;
                ((vvn0) obj).G0();
                return;
            case 18:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                TaxExpandableSpoiler taxExpandableSpoiler = (TaxExpandableSpoiler) obj;
                if (taxExpandableSpoiler.b == evo0.b) {
                    taxExpandableSpoiler.c(taxExpandableSpoiler.getBinding().d);
                    taxExpandableSpoiler.getBinding().b.setExpanded(true);
                    return;
                } else {
                    taxExpandableSpoiler.b(taxExpandableSpoiler.getBinding().d);
                    taxExpandableSpoiler.getBinding().b.setExpanded(false);
                    return;
                }
            default:
                view.removeOnLayoutChangeListener(this);
                int i13 = WheelView.i;
                ((WheelView) obj).b();
                return;
        }
    }
}
