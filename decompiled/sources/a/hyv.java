package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hyv extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hyv f13878a = new hyv(1, rxq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bethistory/impl/databinding/FragmentAggregatorFilterNewBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.betTypeContainer;
        LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.betTypeContainer);
        if (linearLayout != null) {
            i = R.id.betTypeTitle;
            if (((TextView) yum0.f(view, R.id.betTypeTitle)) != null) {
                i = R.id.btnApply;
                MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.btnApply);
                if (materialButton != null) {
                    i = R.id.btnContainer;
                    if (((ConstraintLayout) yum0.f(view, R.id.btnContainer)) != null) {
                        i = R.id.btnReset;
                        MaterialButton materialButton2 = (MaterialButton) yum0.f(view, R.id.btnReset);
                        if (materialButton2 != null) {
                            i = R.id.gameTypeContainer;
                            LinearLayout linearLayout2 = (LinearLayout) yum0.f(view, R.id.gameTypeContainer);
                            if (linearLayout2 != null) {
                                i = R.id.gameTypeTitle;
                                if (((TextView) yum0.f(view, R.id.gameTypeTitle)) != null) {
                                    i = R.id.rvBetType;
                                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvBetType);
                                    if (recyclerView != null) {
                                        i = R.id.rvGameType;
                                        RecyclerView recyclerView2 = (RecyclerView) yum0.f(view, R.id.rvGameType);
                                        if (recyclerView2 != null) {
                                            i = R.id.toolbar;
                                            DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.toolbar);
                                            if (dsNavigationBar != null) {
                                                return new rxq((ConstraintLayout) view, linearLayout, materialButton, materialButton2, linearLayout2, recyclerView, recyclerView2, dsNavigationBar);
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
