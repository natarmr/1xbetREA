package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class loq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final loq0 f20405a = new loq0(1, qjk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/onboarding/impl/databinding/DialogTipsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_tips, (ViewGroup) null, false);
        int i = R.id.btnAccept;
        MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.btnAccept);
        if (materialButton != null) {
            i = R.id.btnNext;
            MaterialButton materialButton2 = (MaterialButton) yum0.f(viewInflate, R.id.btnNext);
            if (materialButton2 != null) {
                i = R.id.btnSkip;
                MaterialButton materialButton3 = (MaterialButton) yum0.f(viewInflate, R.id.btnSkip);
                if (materialButton3 != null) {
                    i = R.id.container;
                    if (((MaterialCardView) yum0.f(viewInflate, R.id.container)) != null) {
                        i = R.id.flButtonsContainer;
                        if (((FrameLayout) yum0.f(viewInflate, R.id.flButtonsContainer)) != null) {
                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                            i = R.id.tlTips;
                            TabLayout tabLayout = (TabLayout) yum0.f(viewInflate, R.id.tlTips);
                            if (tabLayout != null) {
                                i = R.id.viewRounded;
                                View viewF = yum0.f(viewInflate, R.id.viewRounded);
                                if (viewF != null) {
                                    i = R.id.vpTips;
                                    ViewPager2 viewPager2 = (ViewPager2) yum0.f(viewInflate, R.id.vpTips);
                                    if (viewPager2 != null) {
                                        return new qjk(frameLayout, materialButton, materialButton2, materialButton3, frameLayout, tabLayout, viewF, viewPager2);
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
