package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class htj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f13637a;
    public final int b;
    public final ImageView c;
    public final ImageView d;
    public final int e;
    public final int f;
    public final int g;

    public htj(ViewGroup viewGroup, int i, int i2, int i3) {
        viewGroup.getClass();
        this.f13637a = viewGroup;
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.b = viewGroup.getResources().getDimensionPixelSize(R.dimen.size_40);
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setTag("DsCouponCardCancelBtn");
        Context context = imageView.getContext();
        context.getClass();
        imageView.setColorFilter(m5d.b(R.attr.uikitPrimary, context));
        imageView.setImageDrawable(imageView.getContext().getDrawable(i));
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        wgm0.r(imageView, viewGroup, R.dimen.size_40, R.dimen.size_40);
        this.c = imageView;
        ImageView imageView2 = new ImageView(viewGroup.getContext());
        imageView2.setTag("DsCouponCardMoveBtn");
        Context context2 = imageView2.getContext();
        context2.getClass();
        imageView2.setColorFilter(m5d.b(R.attr.uikitPrimary, context2));
        imageView2.setImageDrawable(imageView2.getContext().getDrawable(R.drawable.ic_glyph_move_vertical_large));
        imageView2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        wgm0.r(imageView2, viewGroup, R.dimen.size_40, R.dimen.size_40);
        this.d = imageView2;
        this.e = viewGroup.getResources().getDimensionPixelSize(R.dimen.size_40);
        this.f = viewGroup.getResources().getDimensionPixelSize(i2);
        this.g = viewGroup.getResources().getDimensionPixelSize(i3);
    }

    public int a() {
        int visibility = this.c.getVisibility();
        int i = this.b;
        int i2 = visibility == 0 ? i : 0;
        return this.d.getVisibility() == 0 ? i2 + i : i2;
    }

    public void b(int i, int i2) {
        ImageView imageView = this.c;
        int visibility = imageView.getVisibility();
        ViewGroup viewGroup = this.f13637a;
        int i3 = this.b;
        if (visibility == 0) {
            ViewGroup viewGroup2 = this.f13637a;
            jmu0.f(viewGroup2.getMeasuredWidth() - i3, i - (i3 / 2), viewGroup.getMeasuredWidth(), (i3 / 2) + i, imageView, viewGroup2);
        }
        ImageView imageView2 = this.d;
        if (imageView2.getVisibility() == 0) {
            ViewGroup viewGroup3 = this.f13637a;
            jmu0.f(viewGroup3.getMeasuredWidth() - i3, i2 - (i3 / 2), viewGroup.getMeasuredWidth(), (i3 / 2) + i2, imageView2, viewGroup3);
        }
    }

    public final void c() {
        int i = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(this.f, 1073741824);
        this.c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.d.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
    }

    public final void d(Function1 function1) {
        wc2 wc2Var = new wc2(function1, (byte) 26);
        ImageView imageView = this.c;
        dyb.c0(imageView, wc2Var);
        imageView.setVisibility(function1 != null ? 0 : 8);
    }

    public final void e(Function1 function1) {
        wc2 wc2Var = new wc2(function1, (byte) 27);
        ImageView imageView = this.d;
        dyb.c0(imageView, wc2Var);
        imageView.setVisibility(function1 != null ? 0 : 8);
    }
}
