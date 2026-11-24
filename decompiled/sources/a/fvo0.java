package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class fvo0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxExpandableSpoiler f10225a;
    public final DsAccordion b;
    public final ImageView c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final ConstraintLayout f;
    public final DsShimmerView g;
    public final TextView h;
    public final TextView i;

    public fvo0(TaxExpandableSpoiler taxExpandableSpoiler, DsAccordion dsAccordion, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout, DsShimmerView dsShimmerView, TextView textView, TextView textView2) {
        this.f10225a = taxExpandableSpoiler;
        this.b = dsAccordion;
        this.c = imageView;
        this.d = linearLayout;
        this.e = linearLayout2;
        this.f = constraintLayout;
        this.g = dsShimmerView;
        this.h = textView;
        this.i = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10225a;
    }
}
