package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.tile_matching.presentation.views.TileMatchingCoeffView;
import org.xplatform.tile_matching.presentation.views.TileMatchingGameFieldView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class teq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final teq0 f33834a = new teq0(1, w5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/tile_matching/databinding/FragmentTileMatchingBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.blackout;
        View viewF = yum0.f(view, R.id.blackout);
        if (viewF != null) {
            i = R.id.blastGameFieldBackground;
            ImageView imageView = (ImageView) yum0.f(view, R.id.blastGameFieldBackground);
            if (imageView != null) {
                i = R.id.coeffFive;
                TileMatchingCoeffView tileMatchingCoeffView = (TileMatchingCoeffView) yum0.f(view, R.id.coeffFive);
                if (tileMatchingCoeffView != null) {
                    i = R.id.coeffFour;
                    TileMatchingCoeffView tileMatchingCoeffView2 = (TileMatchingCoeffView) yum0.f(view, R.id.coeffFour);
                    if (tileMatchingCoeffView2 != null) {
                        i = R.id.coeffOne;
                        TileMatchingCoeffView tileMatchingCoeffView3 = (TileMatchingCoeffView) yum0.f(view, R.id.coeffOne);
                        if (tileMatchingCoeffView3 != null) {
                            i = R.id.coeffSix;
                            TileMatchingCoeffView tileMatchingCoeffView4 = (TileMatchingCoeffView) yum0.f(view, R.id.coeffSix);
                            if (tileMatchingCoeffView4 != null) {
                                i = R.id.coeffThree;
                                TileMatchingCoeffView tileMatchingCoeffView5 = (TileMatchingCoeffView) yum0.f(view, R.id.coeffThree);
                                if (tileMatchingCoeffView5 != null) {
                                    i = R.id.coeffTwo;
                                    TileMatchingCoeffView tileMatchingCoeffView6 = (TileMatchingCoeffView) yum0.f(view, R.id.coeffTwo);
                                    if (tileMatchingCoeffView6 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = R.id.gameField;
                                        TileMatchingGameFieldView tileMatchingGameFieldView = (TileMatchingGameFieldView) yum0.f(view, R.id.gameField);
                                        if (tileMatchingGameFieldView != null) {
                                            i = R.id.odysseyGameFieldBackground;
                                            ImageView imageView2 = (ImageView) yum0.f(view, R.id.odysseyGameFieldBackground);
                                            if (imageView2 != null) {
                                                i = R.id.tvCombination;
                                                TextView textView = (TextView) yum0.f(view, R.id.tvCombination);
                                                if (textView != null) {
                                                    i = R.id.txtPlaceBet;
                                                    TextView textView2 = (TextView) yum0.f(view, R.id.txtPlaceBet);
                                                    if (textView2 != null) {
                                                        return new w5r(constraintLayout, viewF, imageView, tileMatchingCoeffView, tileMatchingCoeffView2, tileMatchingCoeffView3, tileMatchingCoeffView4, tileMatchingCoeffView5, tileMatchingCoeffView6, constraintLayout, tileMatchingGameFieldView, imageView2, textView, textView2);
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
