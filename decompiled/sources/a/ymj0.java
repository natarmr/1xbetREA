package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ymj0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ymj0 f42892a = new ymj0(1, dnj0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bethistory/impl/databinding/ShareCouponHistoryFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnRefreshData;
        MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.btnRefreshData);
        if (materialButton != null) {
            i = R.id.btnSave;
            MaterialButton materialButton2 = (MaterialButton) yum0.f(view, R.id.btnSave);
            if (materialButton2 != null) {
                i = R.id.btnShare;
                MaterialButton materialButton3 = (MaterialButton) yum0.f(view, R.id.btnShare);
                if (materialButton3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.errorInfoView;
                    LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.errorInfoView);
                    if (linearLayout != null) {
                        i = R.id.groupButtons;
                        Group group = (Group) yum0.f(view, R.id.groupButtons);
                        if (group != null) {
                            i = R.id.guideline;
                            if (((Guideline) yum0.f(view, R.id.guideline)) != null) {
                                i = R.id.ivBack;
                                ImageView imageView = (ImageView) yum0.f(view, R.id.ivBack);
                                if (imageView != null) {
                                    i = R.id.ivCoupon;
                                    SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) yum0.f(view, R.id.ivCoupon);
                                    if (subsamplingScaleImageView != null) {
                                        i = R.id.lottieEmptyView;
                                        LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                                        if (lottieView != null) {
                                            i = R.id.progress;
                                            ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.progress);
                                            if (progressBar != null) {
                                                i = R.id.svContainer;
                                                if (((NestedScrollView) yum0.f(view, R.id.svContainer)) != null) {
                                                    return new dnj0(constraintLayout, materialButton, materialButton2, materialButton3, linearLayout, group, imageView, subsamplingScaleImageView, lottieView, progressBar);
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
