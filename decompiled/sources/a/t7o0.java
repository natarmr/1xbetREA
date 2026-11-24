package a;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view.RussianLottoBarrelsView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class t7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33478a;
    public final vd7 b;
    public final RussianLottoBarrelsView c;
    public final ScrollView d;
    public final vd7 e;
    public final SyntheticTimerView f;
    public final TextView g;

    public t7o0(ConstraintLayout constraintLayout, vd7 vd7Var, RussianLottoBarrelsView russianLottoBarrelsView, ScrollView scrollView, vd7 vd7Var2, SyntheticTimerView syntheticTimerView, TextView textView) {
        this.f33478a = constraintLayout;
        this.b = vd7Var;
        this.c = russianLottoBarrelsView;
        this.d = scrollView;
        this.e = vd7Var2;
        this.f = syntheticTimerView;
        this.g = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33478a;
    }
}
