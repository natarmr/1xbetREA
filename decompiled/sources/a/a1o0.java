package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.CrystalFieldInfoView;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalFieldView;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalPlayerLogView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class a1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f81a;
    public final ImageView b;
    public final SyntheticTimerView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final CrystalFieldView h;
    public final CrystalFieldInfoView i;
    public final CrystalPlayerLogView j;
    public final CrystalPlayerLogView k;

    public a1o0(ConstraintLayout constraintLayout, ImageView imageView, SyntheticTimerView syntheticTimerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, CrystalFieldView crystalFieldView, CrystalFieldInfoView crystalFieldInfoView, CrystalPlayerLogView crystalPlayerLogView, CrystalPlayerLogView crystalPlayerLogView2) {
        this.f81a = constraintLayout;
        this.b = imageView;
        this.c = syntheticTimerView;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = crystalFieldView;
        this.i = crystalFieldInfoView;
        this.j = crystalPlayerLogView;
        this.k = crystalPlayerLogView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f81a;
    }
}
