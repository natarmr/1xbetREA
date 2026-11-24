package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eeq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eeq0 f7686a = new eeq0(1, x5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/tile_matching/databinding/FragmentTileMatchingGameEndedBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bonusDescriptionText;
        AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(view, R.id.bonusDescriptionText);
        if (appCompatTextView != null) {
            i = R.id.bonusSeparator;
            ImageView imageView = (ImageView) yum0.f(view, R.id.bonusSeparator);
            if (imageView != null) {
                i = R.id.bonusText;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(view, R.id.bonusText);
                if (appCompatTextView2 != null) {
                    i = R.id.changeBetButton;
                    AppCompatButton appCompatButton = (AppCompatButton) yum0.f(view, R.id.changeBetButton);
                    if (appCompatButton != null) {
                        i = R.id.descriptionLayout;
                        if (((LinearLayout) yum0.f(view, R.id.descriptionLayout)) != null) {
                            i = R.id.gameEndedDescriptionText;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) yum0.f(view, R.id.gameEndedDescriptionText);
                            if (appCompatTextView3 != null) {
                                i = R.id.gameEndedTitleText;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) yum0.f(view, R.id.gameEndedTitleText);
                                if (appCompatTextView4 != null) {
                                    i = R.id.playAgainButton;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) yum0.f(view, R.id.playAgainButton);
                                    if (appCompatButton2 != null) {
                                        return new x5r((ConstraintLayout) view, appCompatTextView, imageView, appCompatTextView2, appCompatButton, appCompatTextView3, appCompatTextView4, appCompatButton2);
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
