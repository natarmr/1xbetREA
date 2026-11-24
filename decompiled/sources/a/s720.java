package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import org.xplatform.make_bet.impl.presentation.view.OptionBetLabelView;
import org.xplatform.ui_core.AnimatedCoefficientView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class s720 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollView f31730a;
    public final View b;
    public final DsButton c;
    public final DsButton d;
    public final DsButton e;
    public final Group f;
    public final AnimatedCoefficientView g;
    public final Group h;
    public final Group i;
    public final Group j;
    public final ConstraintLayout k;
    public final LinearLayout l;
    public final AnimatedCoefficientView m;
    public final ConstraintLayout n;
    public final AnimatedCoefficientView o;
    public final OptionBetLabelView p;
    public final Space q;
    public final CoordinatorLayout r;
    public final DsSegmentedGroup s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final View x;
    public final ViewPager2 y;

    public s720(NestedScrollView nestedScrollView, View view, DsButton dsButton, DsButton dsButton2, DsButton dsButton3, Group group, AnimatedCoefficientView animatedCoefficientView, Group group2, Group group3, Group group4, ConstraintLayout constraintLayout, LinearLayout linearLayout, AnimatedCoefficientView animatedCoefficientView2, ConstraintLayout constraintLayout2, AnimatedCoefficientView animatedCoefficientView3, OptionBetLabelView optionBetLabelView, Space space, CoordinatorLayout coordinatorLayout, DsSegmentedGroup dsSegmentedGroup, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2, ViewPager2 viewPager2) {
        this.f31730a = nestedScrollView;
        this.b = view;
        this.c = dsButton;
        this.d = dsButton2;
        this.e = dsButton3;
        this.f = group;
        this.g = animatedCoefficientView;
        this.h = group2;
        this.i = group3;
        this.j = group4;
        this.k = constraintLayout;
        this.l = linearLayout;
        this.m = animatedCoefficientView2;
        this.n = constraintLayout2;
        this.o = animatedCoefficientView3;
        this.p = optionBetLabelView;
        this.q = space;
        this.r = coordinatorLayout;
        this.s = dsSegmentedGroup;
        this.t = textView;
        this.u = textView2;
        this.v = textView3;
        this.w = textView4;
        this.x = view2;
        this.y = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31730a;
    }
}
