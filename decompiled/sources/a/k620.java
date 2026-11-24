package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import org.xplatform.ui_core.AnimatedCoefficientView;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class k620 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17747a;
    public final View b;
    public final AnimatedCoefficientView c;
    public final DsSegmentedGroup d;
    public final TextView e;
    public final ViewPager2 f;

    public k620(ConstraintLayout constraintLayout, View view, AnimatedCoefficientView animatedCoefficientView, DsSegmentedGroup dsSegmentedGroup, TextView textView, ViewPager2 viewPager2) {
        this.f17747a = constraintLayout;
        this.b = view;
        this.c = animatedCoefficientView;
        this.d = dsSegmentedGroup;
        this.e = textView;
        this.f = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17747a;
    }
}
