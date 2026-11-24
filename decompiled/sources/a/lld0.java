package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lld0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lld0 f20242a = new lld0(1, q3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/widget/impl/databinding/FragmentQuickAvailableBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.container;
        if (((ConstraintLayout) yum0.f(view, R.id.container)) != null) {
            i = R.id.gridQuick;
            if (((ConstraintLayout) yum0.f(view, R.id.gridQuick)) != null) {
                i = R.id.labelImage;
                if (((AppCompatImageView) yum0.f(view, R.id.labelImage)) != null) {
                    i = R.id.navigationBar;
                    DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                    if (dsNavigationBar != null) {
                        i = R.id.recyclerCategoryChoice;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerCategoryChoice);
                        if (recyclerView != null) {
                            i = R.id.sectionFour;
                            View viewF = yum0.f(view, R.id.sectionFour);
                            if (viewF != null) {
                                zwx zwxVarA = zwx.a(viewF);
                                i = R.id.sectionOne;
                                View viewF2 = yum0.f(view, R.id.sectionOne);
                                if (viewF2 != null) {
                                    zwx zwxVarA2 = zwx.a(viewF2);
                                    i = R.id.sectionThree;
                                    View viewF3 = yum0.f(view, R.id.sectionThree);
                                    if (viewF3 != null) {
                                        zwx zwxVarA3 = zwx.a(viewF3);
                                        i = R.id.sectionTwo;
                                        View viewF4 = yum0.f(view, R.id.sectionTwo);
                                        if (viewF4 != null) {
                                            zwx zwxVarA4 = zwx.a(viewF4);
                                            i = R.id.title;
                                            if (((AppCompatTextView) yum0.f(view, R.id.title)) != null) {
                                                i = R.id.titlePreview;
                                                if (((DsHeader) yum0.f(view, R.id.titlePreview)) != null) {
                                                    i = R.id.widgetPreviewLayout;
                                                    if (((MaterialCardView) yum0.f(view, R.id.widgetPreviewLayout)) != null) {
                                                        return new q3r((LinearLayout) view, dsNavigationBar, recyclerView, zwxVarA, zwxVarA2, zwxVarA3, zwxVarA4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
