package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class jkr0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f16685a;
    public final View b;
    public final TextView c;
    public final DsSegmentedGroup d;
    public final TextView e;
    public final ViewPager2 f;

    public jkr0(ConstraintLayout constraintLayout, View view, TextView textView, DsSegmentedGroup dsSegmentedGroup, TextView textView2, ViewPager2 viewPager2) {
        this.f16685a = constraintLayout;
        this.b = view;
        this.c = textView;
        this.d = dsSegmentedGroup;
        this.e = textView2;
        this.f = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f16685a;
    }
}
