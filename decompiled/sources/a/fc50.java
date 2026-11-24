package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class fc50 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9294a;
    public final int b;
    public final ImageView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc50(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f9294a = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_56);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setTag("DSNavigationBarBackButtonImageView");
        imageView.setImageResource(R.drawable.ic_glyph_arrow_left);
        this.c = imageView;
        addView(imageView);
        setTag("DSNavigationBarBackButton");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int i6 = this.f9294a;
        int i7 = (i5 - i6) / 2;
        int i8 = (i5 - i6) / 2;
        jmu0.f(i7, i8, i7 + i6, i8 + i6, this.c, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f9294a;
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int i4 = this.b;
        setMeasuredDimension(View.MeasureSpec.getSize(i4), View.MeasureSpec.getSize(i4));
    }

    public final void setBackIconTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.c.setImageTintList(colorStateList);
        }
    }

    public final void setOnBackIconClickListener(Function1<? super View, Unit> function1) {
        function1.getClass();
        this.c.setOnClickListener(new xp3(function1, (byte) 5));
    }
}
