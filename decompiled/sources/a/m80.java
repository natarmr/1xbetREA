package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteGameField;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteWheel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m80 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m80 f21345a = new m80(1, oxq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/african_roulette/databinding/FragmentAfricanRouletteBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.barrierBottom;
        if (((Barrier) yum0.f(view, R.id.barrierBottom)) != null) {
            i = R.id.btnPlay;
            AppCompatButton appCompatButton = (AppCompatButton) yum0.f(view, R.id.btnPlay);
            if (appCompatButton != null) {
                i = R.id.gameField;
                AfricanRouletteGameField africanRouletteGameField = (AfricanRouletteGameField) yum0.f(view, R.id.gameField);
                if (africanRouletteGameField != null) {
                    i = R.id.glBottom;
                    if (((Guideline) yum0.f(view, R.id.glBottom)) != null) {
                        i = R.id.glCenter;
                        if (((Guideline) yum0.f(view, R.id.glCenter)) != null) {
                            i = R.id.glTop;
                            if (((Guideline) yum0.f(view, R.id.glTop)) != null) {
                                i = R.id.llBetInfo;
                                if (((LinearLayout) yum0.f(view, R.id.llBetInfo)) != null) {
                                    i = R.id.rvBet;
                                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvBet);
                                    if (recyclerView != null) {
                                        i = R.id.txtBet;
                                        if (((TextView) yum0.f(view, R.id.txtBet)) != null) {
                                            i = R.id.txtBetSum;
                                            TextView textView = (TextView) yum0.f(view, R.id.txtBetSum);
                                            if (textView != null) {
                                                i = R.id.wheel;
                                                AfricanRouletteWheel africanRouletteWheel = (AfricanRouletteWheel) yum0.f(view, R.id.wheel);
                                                if (africanRouletteWheel != null) {
                                                    return new oxq((ConstraintLayout) view, appCompatButton, africanRouletteGameField, recyclerView, textView, africanRouletteWheel);
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
