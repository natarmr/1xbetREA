package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kpn0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kpn0 f18684a = new kpn0(1, lj60.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/swipex/impl/databinding/OnboardingDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.onboarding_dialog, (ViewGroup) null, false);
        int i = R.id.btn_next;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.btn_next);
        if (dsButton != null) {
            i = R.id.btnSkip;
            DsButton dsButton2 = (DsButton) yum0.f(viewInflate, R.id.btnSkip);
            if (dsButton2 != null) {
                i = R.id.indicator;
                TabLayout tabLayout = (TabLayout) yum0.f(viewInflate, R.id.indicator);
                if (tabLayout != null) {
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    i = R.id.viewPagerPreview;
                    ViewPager2 viewPager2 = (ViewPager2) yum0.f(viewInflate, R.id.viewPagerPreview);
                    if (viewPager2 != null) {
                        i = R.id.viewRounded;
                        View viewF = yum0.f(viewInflate, R.id.viewRounded);
                        if (viewF != null) {
                            return new lj60(frameLayout, dsButton, dsButton2, tabLayout, viewPager2, viewF);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
