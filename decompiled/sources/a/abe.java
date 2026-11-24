package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class abe extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final abe f573a = new abe(1, iik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/consultantchat/impl/databinding/DialogConsultantChatRateBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_consultant_chat_rate, (ViewGroup) null, false);
        int i = R.id.centerVerticalLine;
        if (((Guideline) yum0.f(viewInflate, R.id.centerVerticalLine)) != null) {
            i = R.id.hintIssueSolved;
            if (((TextView) yum0.f(viewInflate, R.id.hintIssueSolved)) != null) {
                i = R.id.hintStars;
                if (((TextView) yum0.f(viewInflate, R.id.hintStars)) != null) {
                    i = R.id.issueChoiceLineBottom;
                    if (((Guideline) yum0.f(viewInflate, R.id.issueChoiceLineBottom)) != null) {
                        i = R.id.issueContainerNegative;
                        ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewInflate, R.id.issueContainerNegative);
                        if (constraintLayout != null) {
                            i = R.id.issueContainerPositive;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewInflate, R.id.issueContainerPositive);
                            if (constraintLayout2 != null) {
                                i = R.id.issueImageNegative;
                                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.issueImageNegative);
                                if (imageView != null) {
                                    i = R.id.issueImagePositive;
                                    ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.issueImagePositive);
                                    if (imageView2 != null) {
                                        i = R.id.issueSolvedLineTop;
                                        if (((Guideline) yum0.f(viewInflate, R.id.issueSolvedLineTop)) != null) {
                                            i = R.id.issueTextNegative;
                                            if (((TextView) yum0.f(viewInflate, R.id.issueTextNegative)) != null) {
                                                i = R.id.issueTextPositive;
                                                if (((TextView) yum0.f(viewInflate, R.id.issueTextPositive)) != null) {
                                                    i = R.id.rateButton;
                                                    Button button = (Button) yum0.f(viewInflate, R.id.rateButton);
                                                    if (button != null) {
                                                        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                        i = R.id.star1;
                                                        if (((ImageView) yum0.f(viewInflate, R.id.star1)) != null) {
                                                            i = R.id.star2;
                                                            if (((ImageView) yum0.f(viewInflate, R.id.star2)) != null) {
                                                                i = R.id.star3;
                                                                if (((ImageView) yum0.f(viewInflate, R.id.star3)) != null) {
                                                                    i = R.id.star4;
                                                                    if (((ImageView) yum0.f(viewInflate, R.id.star4)) != null) {
                                                                        i = R.id.star5;
                                                                        if (((ImageView) yum0.f(viewInflate, R.id.star5)) != null) {
                                                                            i = R.id.stars;
                                                                            LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.stars);
                                                                            if (linearLayout != null) {
                                                                                return new iik(nestedScrollView, constraintLayout, constraintLayout2, imageView, imageView2, button, linearLayout);
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
