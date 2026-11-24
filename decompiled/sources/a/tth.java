package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.section.impl.championships.regular.presentation.world_cup.tournament_info.ExpandableTextView;
import org.xplatform.ui_core.GradientTextView;
import org.xplatform.uikit.components.accordion.DsAccordion;

/* JADX INFO: loaded from: classes4.dex */
public final class tth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f34509a;
    public final ConstraintLayout b;

    public tth(FrameLayout frameLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, DsAccordion dsAccordion, ConstraintLayout constraintLayout4, LinearLayout linearLayout, ExpandableTextView expandableTextView, TextView textView5, GradientTextView gradientTextView) {
        this.f34509a = frameLayout;
        this.b = constraintLayout2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34509a;
    }
}
