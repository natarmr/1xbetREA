package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.SwipexCardsRecyclerView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.chips.DsChips;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uvn0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uvn0 f36359a = new uvn0(1, wvn0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/swipex/impl/databinding/SwipexFragmentBinding;", 0);

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
                i = R.id.cardStack;
                SwipexCardsRecyclerView swipexCardsRecyclerView = (SwipexCardsRecyclerView) yum0.f(view, R.id.cardStack);
                if (swipexCardsRecyclerView != null) {
                    i = R.id.dislikeButton;
                    DsButton dsButton = (DsButton) yum0.f(view, R.id.dislikeButton);
                    if (dsButton != null) {
                        i = R.id.editor;
                        ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.editor);
                        if (constraintLayout != null) {
                            i = R.id.emptyCardWithLoader;
                            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.emptyCardWithLoader);
                            if (frameLayout != null) {
                                i = R.id.filterChips;
                                DsChips dsChips = (DsChips) yum0.f(view, R.id.filterChips);
                                if (dsChips != null) {
                                    i = R.id.glyphIcon;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.glyphIcon);
                                    if (appCompatImageView != null) {
                                        i = R.id.likeButton;
                                        DsButton dsButton2 = (DsButton) yum0.f(view, R.id.likeButton);
                                        if (dsButton2 != null) {
                                            i = R.id.lottieEmptyView;
                                            LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                                            if (lottieView != null) {
                                                i = R.id.onBoardingCardPlaceholder;
                                                View viewF = yum0.f(view, R.id.onBoardingCardPlaceholder);
                                                if (viewF != null) {
                                                    i = R.id.settingFilterGroup;
                                                    Group group = (Group) yum0.f(view, R.id.settingFilterGroup);
                                                    if (group != null) {
                                                        i = R.id.settingFilterView;
                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) yum0.f(view, R.id.settingFilterView);
                                                        if (appCompatImageView2 != null) {
                                                            i = R.id.settingGradient;
                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) yum0.f(view, R.id.settingGradient);
                                                            if (appCompatImageView3 != null) {
                                                                i = R.id.toolbar;
                                                                ComposeView composeView = (ComposeView) yum0.f(view, R.id.toolbar);
                                                                if (composeView != null) {
                                                                    return new wvn0((ConstraintLayout) view, textView, textView2, swipexCardsRecyclerView, dsButton, constraintLayout, frameLayout, dsChips, appCompatImageView, dsButton2, lottieView, viewF, group, appCompatImageView2, appCompatImageView3, composeView);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
