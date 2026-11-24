package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.AnimatedCoefficientView;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wp6 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wp6 f39529a = new wp6(1, k620.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bet_constructor/impl/databinding/MakeBetBottomDsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.make_bet_bottom_ds, (ViewGroup) null, false);
        int i = R.id.coefBackground;
        View viewF = yum0.f(viewInflate, R.id.coefBackground);
        if (viewF != null) {
            i = R.id.coefView;
            AnimatedCoefficientView animatedCoefficientView = (AnimatedCoefficientView) yum0.f(viewInflate, R.id.coefView);
            if (animatedCoefficientView != null) {
                i = R.id.tabLayout;
                DsSegmentedGroup dsSegmentedGroup = (DsSegmentedGroup) yum0.f(viewInflate, R.id.tabLayout);
                if (dsSegmentedGroup != null) {
                    i = R.id.tvStatus;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.tvStatus);
                    if (textView != null) {
                        i = R.id.tvTeamsName;
                        if (((TextView) yum0.f(viewInflate, R.id.tvTeamsName)) != null) {
                            i = R.id.vpContent;
                            ViewPager2 viewPager2 = (ViewPager2) yum0.f(viewInflate, R.id.vpContent);
                            if (viewPager2 != null) {
                                return new k620((ConstraintLayout) viewInflate, viewF, animatedCoefficientView, dsSegmentedGroup, textView, viewPager2);
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
