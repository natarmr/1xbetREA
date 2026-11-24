package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.presentation.views.tax_message.TaxMessageView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ym70 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ym70 f42874a = new ym70(1, zk70.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/core/databinding/OnexGameHolderFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.background_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.background_image);
        if (appCompatImageView != null) {
            i = R.id.game_holder_toolbar;
            if (((FrameLayout) yum0.f(view, R.id.game_holder_toolbar)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.gradient_bottom_layout;
                if (((ImageView) yum0.f(view, R.id.gradient_bottom_layout)) != null) {
                    i = R.id.gradient_top_layout;
                    if (((ImageView) yum0.f(view, R.id.gradient_top_layout)) != null) {
                        i = R.id.info_container;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.info_container);
                        if (frameLayout != null) {
                            i = R.id.info_text;
                            TextView textView = (TextView) yum0.f(view, R.id.info_text);
                            if (textView != null) {
                                i = R.id.onex_holder_balance_container;
                                if (((FrameLayout) yum0.f(view, R.id.onex_holder_balance_container)) != null) {
                                    i = R.id.onex_holder_bonus_free_game_container;
                                    FrameLayout frameLayout2 = (FrameLayout) yum0.f(view, R.id.onex_holder_bonus_free_game_container);
                                    if (frameLayout2 != null) {
                                        i = R.id.onex_holder_end_game_container;
                                        FrameLayout frameLayout3 = (FrameLayout) yum0.f(view, R.id.onex_holder_end_game_container);
                                        if (frameLayout3 != null) {
                                            i = R.id.onex_holder_game_container;
                                            FrameLayout frameLayout4 = (FrameLayout) yum0.f(view, R.id.onex_holder_game_container);
                                            if (frameLayout4 != null) {
                                                i = R.id.onex_holder_game_title_container;
                                                if (((FrameLayout) yum0.f(view, R.id.onex_holder_game_title_container)) != null) {
                                                    i = R.id.onex_holder_menu_container;
                                                    FrameLayout frameLayout5 = (FrameLayout) yum0.f(view, R.id.onex_holder_menu_container);
                                                    if (frameLayout5 != null) {
                                                        i = R.id.vTaxMessage;
                                                        TaxMessageView taxMessageView = (TaxMessageView) yum0.f(view, R.id.vTaxMessage);
                                                        if (taxMessageView != null) {
                                                            return new zk70(constraintLayout, appCompatImageView, constraintLayout, frameLayout, textView, frameLayout2, frameLayout3, frameLayout4, frameLayout5, taxMessageView);
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
