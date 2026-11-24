package a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinChoiceView;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinWheelView;

/* JADX INFO: loaded from: classes5.dex */
public final class x4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40280a;
    public final SpinAndWinChoiceView b;
    public final AppCompatButton c;
    public final Guideline d;
    public final Guideline e;
    public final Guideline f;
    public final RecyclerView g;
    public final TextView h;
    public final SpinAndWinWheelView i;

    public x4r(ConstraintLayout constraintLayout, SpinAndWinChoiceView spinAndWinChoiceView, AppCompatButton appCompatButton, Guideline guideline, Guideline guideline2, Guideline guideline3, RecyclerView recyclerView, TextView textView, SpinAndWinWheelView spinAndWinWheelView) {
        this.f40280a = constraintLayout;
        this.b = spinAndWinChoiceView;
        this.c = appCompatButton;
        this.d = guideline;
        this.e = guideline2;
        this.f = guideline3;
        this.g = recyclerView;
        this.h = textView;
        this.i = spinAndWinWheelView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40280a;
    }
}
