package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s620 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s620 f31681a = new s620(1, c6q.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetDialogMakeBetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fin_bet_dialog_make_bet, (ViewGroup) null, false);
        int i = R.id.segmentedGroup;
        DsSegmentedGroup dsSegmentedGroup = (DsSegmentedGroup) yum0.f(viewInflate, R.id.segmentedGroup);
        if (dsSegmentedGroup != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
            i = R.id.tvUnauthText;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvUnauthText);
            if (textView != null) {
                i = R.id.vpContent;
                ViewPager2 viewPager2 = (ViewPager2) yum0.f(viewInflate, R.id.vpContent);
                if (viewPager2 != null) {
                    return new c6q(coordinatorLayout, dsSegmentedGroup, coordinatorLayout, textView, viewPager2);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
