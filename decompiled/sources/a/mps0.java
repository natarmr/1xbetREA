package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.treasure.presentation.views.NineTreasuresView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mps0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mps0 f22192a = new mps0(1, i6r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bonus_games/impl/databinding/FragmentTreasureBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.guidelineTop;
        if (((Guideline) yum0.f(view, R.id.guidelineTop)) != null) {
            i = R.id.previewImage;
            ImageView imageView = (ImageView) yum0.f(view, R.id.previewImage);
            if (imageView != null) {
                i = R.id.progress;
                if (((FrameLayout) yum0.f(view, R.id.progress)) != null) {
                    i = R.id.treasures;
                    NineTreasuresView nineTreasuresView = (NineTreasuresView) yum0.f(view, R.id.treasures);
                    if (nineTreasuresView != null) {
                        return new i6r((ConstraintLayout) view, imageView, nineTreasuresView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
