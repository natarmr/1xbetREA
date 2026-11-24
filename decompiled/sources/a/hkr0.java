package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hkr0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hkr0 f13221a = new hkr0(1, jkr0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/toto_bet/impl/databinding/TotoBetMakeBetDsBottomsheetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.toto_bet_make_bet_ds_bottomsheet, (ViewGroup) null, false);
        int i = R.id.background;
        View viewF = yum0.f(viewInflate, R.id.background);
        if (viewF != null) {
            i = R.id.end;
            if (((Guideline) yum0.f(viewInflate, R.id.end)) != null) {
                i = R.id.guideline4;
                if (((Guideline) yum0.f(viewInflate, R.id.guideline4)) != null) {
                    i = R.id.outcomeCountTv;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.outcomeCountTv);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.segmentedGroup;
                        DsSegmentedGroup dsSegmentedGroup = (DsSegmentedGroup) yum0.f(viewInflate, R.id.segmentedGroup);
                        if (dsSegmentedGroup != null) {
                            i = R.id.start;
                            if (((Guideline) yum0.f(viewInflate, R.id.start)) != null) {
                                i = R.id.tvStatus;
                                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvStatus);
                                if (textView2 != null) {
                                    i = R.id.tvTeams;
                                    if (((TextView) yum0.f(viewInflate, R.id.tvTeams)) != null) {
                                        i = R.id.viewPager;
                                        ViewPager2 viewPager2 = (ViewPager2) yum0.f(viewInflate, R.id.viewPager);
                                        if (viewPager2 != null) {
                                            return new jkr0(constraintLayout, viewF, textView, dsSegmentedGroup, textView2, viewPager2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
