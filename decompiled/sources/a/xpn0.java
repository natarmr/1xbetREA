package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.SwipexCardsRecyclerView;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xpn0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xpn0 f41278a = new xpn0(1, ywn0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/swipex/impl/databinding/SwipexOnboardingFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.betSumTitle;
        TextView textView = (TextView) yum0.f(view, R.id.betSumTitle);
        if (textView != null) {
            i = R.id.betSumValue;
            TextView textView2 = (TextView) yum0.f(view, R.id.betSumValue);
            if (textView2 != null) {
                i = R.id.btnNext;
                DsButton dsButton = (DsButton) yum0.f(view, R.id.btnNext);
                if (dsButton != null) {
                    i = R.id.cardStack;
                    SwipexCardsRecyclerView swipexCardsRecyclerView = (SwipexCardsRecyclerView) yum0.f(view, R.id.cardStack);
                    if (swipexCardsRecyclerView != null) {
                        i = R.id.dislikeButton;
                        DsButton dsButton2 = (DsButton) yum0.f(view, R.id.dislikeButton);
                        if (dsButton2 != null) {
                            i = R.id.editor;
                            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.editor);
                            if (constraintLayout != null) {
                                i = R.id.glyphIcon;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.glyphIcon);
                                if (appCompatImageView != null) {
                                    i = R.id.ivClose;
                                    ImageView imageView = (ImageView) yum0.f(view, R.id.ivClose);
                                    if (imageView != null) {
                                        i = R.id.ivDescription;
                                        ImageView imageView2 = (ImageView) yum0.f(view, R.id.ivDescription);
                                        if (imageView2 != null) {
                                            i = R.id.ivDescriptionForEditor;
                                            ImageView imageView3 = (ImageView) yum0.f(view, R.id.ivDescriptionForEditor);
                                            if (imageView3 != null) {
                                                i = R.id.likeButton;
                                                DsButton dsButton3 = (DsButton) yum0.f(view, R.id.likeButton);
                                                if (dsButton3 != null) {
                                                    i = R.id.tvDescription;
                                                    TextView textView3 = (TextView) yum0.f(view, R.id.tvDescription);
                                                    if (textView3 != null) {
                                                        i = R.id.tvDescriptionForEditor;
                                                        TextView textView4 = (TextView) yum0.f(view, R.id.tvDescriptionForEditor);
                                                        if (textView4 != null) {
                                                            i = R.id.tvTitle;
                                                            if (((TextView) yum0.f(view, R.id.tvTitle)) != null) {
                                                                return new ywn0((ConstraintLayout) view, textView, textView2, dsButton, swipexCardsRecyclerView, dsButton2, constraintLayout, appCompatImageView, imageView, imageView2, imageView3, dsButton3, textView3, textView4);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
