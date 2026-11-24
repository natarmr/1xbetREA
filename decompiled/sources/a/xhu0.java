package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.bonus_games.impl.lottery.presentation.views.ErasableView;

/* JADX INFO: loaded from: classes3.dex */
public final class xhu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40913a;
    public final View b;
    public final ErasableView c;
    public final TextView d;

    public xhu0(ConstraintLayout constraintLayout, View view, ErasableView erasableView, TextView textView) {
        this.f40913a = constraintLayout;
        this.b = view;
        this.c = erasableView;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40913a;
    }
}
