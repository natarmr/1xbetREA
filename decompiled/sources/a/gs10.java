package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.section.impl.championships.regular.presentation.world_cup.tournament_info.ExpandableTextView;
import org.xplatform.ui_core.GradientTextView;
import org.xplatform.uikit.components.accordion.DsAccordion;

/* JADX INFO: loaded from: classes5.dex */
public final class gs10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f11807a;
    public final ConstraintLayout b;
    public final ConstraintLayout c;
    public final DsAccordion d;
    public final ConstraintLayout e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final ExpandableTextView i;
    public final TextView j;
    public final GradientTextView k;
    public final TextView l;
    public final ConstraintLayout m;

    public gs10(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, DsAccordion dsAccordion, ConstraintLayout constraintLayout4, TextView textView, TextView textView2, TextView textView3, ExpandableTextView expandableTextView, TextView textView4, GradientTextView gradientTextView, TextView textView5, ConstraintLayout constraintLayout5) {
        this.f11807a = constraintLayout;
        this.b = constraintLayout2;
        this.c = constraintLayout3;
        this.d = dsAccordion;
        this.e = constraintLayout4;
        this.f = textView;
        this.g = textView2;
        this.h = textView3;
        this.i = expandableTextView;
        this.j = textView4;
        this.k = gradientTextView;
        this.l = textView5;
        this.m = constraintLayout5;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11807a;
    }
}
