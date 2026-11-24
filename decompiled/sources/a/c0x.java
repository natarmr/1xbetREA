package a;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import java.util.WeakHashMap;
import org.xplatform.ui_core.circleindicator.CircleIndicator;
import org.xplatform.ui_core.viewcomponents.views.SwipeBackLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class c0x extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3545a;
    public final int b;
    public final int c;
    public final uk5 d;

    public c0x(int i, Context context, List list) {
        super(context, R.style.Theme.Black.NoTitleBar);
        this.f3545a = list;
        this.b = i;
        this.c = org.xbet.client1.R.drawable.ic_glyph_stadium;
        View viewInflate = LayoutInflater.from(context).inflate(org.xbet.client1.R.layout.gallery_view, (ViewGroup) null, false);
        int i2 = org.xbet.client1.R.id.gallery_indicator;
        CircleIndicator circleIndicator = (CircleIndicator) yum0.f(viewInflate, org.xbet.client1.R.id.gallery_indicator);
        if (circleIndicator != null) {
            i2 = org.xbet.client1.R.id.gallery_view_pager;
            ViewPager viewPager = (ViewPager) yum0.f(viewInflate, org.xbet.client1.R.id.gallery_view_pager);
            if (viewPager != null) {
                i2 = org.xbet.client1.R.id.ivClose;
                ImageView imageView = (ImageView) yum0.f(viewInflate, org.xbet.client1.R.id.ivClose);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i2 = org.xbet.client1.R.id.swipeBack;
                    SwipeBackLayout swipeBackLayout = (SwipeBackLayout) yum0.f(viewInflate, org.xbet.client1.R.id.swipeBack);
                    if (swipeBackLayout != null) {
                        this.d = new uk5(constraintLayout, circleIndicator, viewPager, imageView, constraintLayout, swipeBackLayout);
                        requestWindowFeature(1);
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.clearFlags(2);
        uk5 uk5Var = this.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) uk5Var.b;
        SwipeBackLayout swipeBackLayout = (SwipeBackLayout) uk5Var.f;
        ViewPager viewPager = (ViewPager) uk5Var.d;
        setContentView(constraintLayout);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) uk5Var.b;
        constraintLayout2.getClass();
        bzu bzuVar = new bzu(this, (byte) 14);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(constraintLayout2, bzuVar);
        if (cy7.c()) {
            viewPager.setRotationY(180.0f);
        }
        ((ImageView) uk5Var.g).setOnClickListener(new q10(this, (byte) 26));
        swipeBackLayout.setDoOnFinish(new bdv(this, (byte) 28));
        swipeBackLayout.setDoOnSwipeBack(new xxv(this, (byte) 15));
        ((ConstraintLayout) uk5Var.e).setOnTouchListener(new jw5(this, (byte) 8));
        List list = this.f3545a;
        viewPager.setAdapter(new b0x(this, list));
        if (list.size() > 1) {
            ((CircleIndicator) uk5Var.c).setViewPager(viewPager);
        }
        int i = this.b;
        if (i <= 0 || i >= list.size()) {
            return;
        }
        viewPager.setCurrentItem(i);
    }
}
