package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view.RussianLottoBarrelsView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a6o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a6o f325a = new a6o(3, t7o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticRussianLottoViewItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_russian_lotto_view_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.firstBilet;
        View viewF = yum0.f(viewInflate, R.id.firstBilet);
        if (viewF != null) {
            vd7 vd7VarA = vd7.a(viewF);
            i = R.id.russianLottoBarrels;
            RussianLottoBarrelsView russianLottoBarrelsView = (RussianLottoBarrelsView) yum0.f(viewInflate, R.id.russianLottoBarrels);
            if (russianLottoBarrelsView != null) {
                ScrollView scrollView = (ScrollView) yum0.f(viewInflate, R.id.scrollView);
                i = R.id.secondBilet;
                View viewF2 = yum0.f(viewInflate, R.id.secondBilet);
                if (viewF2 != null) {
                    vd7 vd7VarA2 = vd7.a(viewF2);
                    i = R.id.syntheticTimerView;
                    SyntheticTimerView syntheticTimerView = (SyntheticTimerView) yum0.f(viewInflate, R.id.syntheticTimerView);
                    if (syntheticTimerView != null) {
                        i = R.id.tvWinnerTitle;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvWinnerTitle);
                        if (textView != null) {
                            return new t7o0((ConstraintLayout) viewInflate, vd7VarA, russianLottoBarrelsView, scrollView, vd7VarA2, syntheticTimerView, textView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
