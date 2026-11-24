package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qtl extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qtl f29304a = new qtl(1, vfk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/uikit/databinding/DesignSystemBottomSheetParentViewBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.design_system_bottom_sheet_parent_view, (ViewGroup) null, false);
        int i = R.id.additionalTopContainer;
        FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate, R.id.additionalTopContainer);
        if (frameLayout != null) {
            FrameLayout frameLayout2 = (FrameLayout) viewInflate;
            i = R.id.bottomContainer;
            FrameLayout frameLayout3 = (FrameLayout) yum0.f(viewInflate, R.id.bottomContainer);
            if (frameLayout3 != null) {
                i = R.id.container;
                LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.container);
                if (linearLayout != null) {
                    i = R.id.middleContainer;
                    FrameLayout frameLayout4 = (FrameLayout) yum0.f(viewInflate, R.id.middleContainer);
                    if (frameLayout4 != null) {
                        i = R.id.progressView;
                        if (((FrameLayout) yum0.f(viewInflate, R.id.progressView)) != null) {
                            i = R.id.topContainer;
                            FrameLayout frameLayout5 = (FrameLayout) yum0.f(viewInflate, R.id.topContainer);
                            if (frameLayout5 != null) {
                                i = R.id.topView;
                                View viewF = yum0.f(viewInflate, R.id.topView);
                                if (viewF != null) {
                                    return new vfk(frameLayout2, frameLayout, frameLayout3, linearLayout, frameLayout4, frameLayout5, viewF);
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
