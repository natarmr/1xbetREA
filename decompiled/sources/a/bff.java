package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.crystal.presentation.views.CrystalFieldView;
import org.xplatform.crystal.presentation.views.CrystalStatusView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bff extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bff f2498a = new bff(1, zef.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/crystal/databinding/CrystalFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.backgroundImageView;
        if (((ImageView) yum0.f(view, R.id.backgroundImageView)) != null) {
            i = R.id.crystalField;
            CrystalFieldView crystalFieldView = (CrystalFieldView) yum0.f(view, R.id.crystalField);
            if (crystalFieldView != null) {
                i = R.id.crystalStatus;
                CrystalStatusView crystalStatusView = (CrystalStatusView) yum0.f(view, R.id.crystalStatus);
                if (crystalStatusView != null) {
                    i = R.id.guideline;
                    if (((Guideline) yum0.f(view, R.id.guideline)) != null) {
                        i = R.id.previewCrystalField;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.previewCrystalField);
                        if (frameLayout != null) {
                            i = R.id.progress;
                            if (((FrameLayout) yum0.f(view, R.id.progress)) != null) {
                                i = R.id.statusContainer;
                                if (((FrameLayout) yum0.f(view, R.id.statusContainer)) != null) {
                                    return new zef((ConstraintLayout) view, crystalFieldView, crystalStatusView, frameLayout);
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
