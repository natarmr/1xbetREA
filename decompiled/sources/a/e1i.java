package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class e1i extends FrameLayout implements xoe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7037a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final AppCompatImageView j;
    public final if5 k;
    public final yoe l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1i(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f7037a = "generate";
        this.b = getResources().getDimensionPixelSize(R.dimen.size_4);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_48);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_36);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_4);
        ybg0 ybg0Var = ybg0.f42342a;
        this.i = m5d.b(R.attr.uikitStaticWhite, context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(jmu0.d());
        appCompatImageView.setBackground(null);
        this.j = appCompatImageView;
        this.k = new if5(appCompatImageView, null);
        this.l = new yoe(appCompatImageView, null);
        setTag("DSRightNavigationBarButton");
        addView(appCompatImageView);
    }

    public final String getButtonIconId() {
        return this.f7037a;
    }

    public final boolean getNavigationBarButtonEnabled() {
        return this.j.isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.c;
        int i6 = ((i3 - i) - i5) / 2;
        int i7 = ((i4 - i2) - i5) / 2;
        jmu0.f(i6, i7, i6 + i5, i7 + i5, this.j, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.d;
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i3));
        int i4 = this.c;
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    public void setBadgeBackgroundTint(int i) {
        this.k.j(i);
    }

    public void setBadgeVisible(boolean z) {
        DsBadge dsBadge = this.k.c;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
    }

    public final void setButtonAlpha(float f) {
        this.j.setAlpha(f);
        invalidate();
    }

    public final void setButtonIconId(String str) {
        str.getClass();
        this.f7037a = str;
    }

    public final void setButtonScale(float f) {
        setScaleX(f);
        setScaleY(f);
        invalidate();
    }

    public final void setButtonTranslationY(float f) {
        setTranslationY(f);
        invalidate();
    }

    @Override // a.xoe
    public void setCount(Integer num) {
        this.l.e(num, this.g, this.f);
    }

    public final void setCounterStyle(r0m r0mVar) {
        r0mVar.getClass();
        yoe yoeVar = this.l;
        yoeVar.getClass();
        yoeVar.d = r0mVar;
    }

    public final void setCounterVisible(boolean z) {
        DsCounter dsCounter = this.l.c;
        if (dsCounter != null) {
            dsCounter.setVisibility(z ? 0 : 8);
        }
    }

    public final void setNavigationBarButtonAlpha(boolean z) {
        this.j.setAlpha(z ? 0.5f : 1.0f);
    }

    public final void setNavigationBarButtonBackgroundTint(Integer num) {
        if (num != null) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            Context context = getContext();
            context.getClass();
            paint.setColor(m5d.b(num.intValue(), context));
            int i = this.e;
            shapeDrawable.setIntrinsicWidth(i);
            shapeDrawable.setIntrinsicHeight(i);
            int i2 = this.b;
            setBackground(new InsetDrawable((Drawable) shapeDrawable, i2, i2, i2, i2));
        }
    }

    public final void setNavigationBarButtonEnable(boolean z) {
        this.j.setEnabled(z);
        setEnabled(z);
    }

    public final void setNavigationBarButtonImageDrawable(Drawable drawable) {
        this.j.setImageDrawable(drawable);
        requestLayout();
    }

    public final void setNavigationBarButtonImageResource(int i) {
        this.j.setImageResource(i);
        requestLayout();
    }

    public final void setNavigationBarButtonStyle(ybg0 ybg0Var) {
        ColorStateList colorStateListValueOf;
        ybg0Var.getClass();
        int iOrdinal = ybg0Var.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitPrimary, context));
        } else if (iOrdinal != 1) {
            t9f.b();
            return;
        } else {
            Context context2 = getContext();
            context2.getClass();
            colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2));
        }
        this.j.setImageTintList(colorStateListValueOf);
        requestLayout();
    }

    public final void setNavigationBarButtonTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.j.setImageTintList(colorStateList);
        }
    }

    public final void setOnNavigationBarButtonClickListener(Function0<Unit> function0) {
        function0.getClass();
        dyb.c0(this, new y(function0, (byte) 26));
    }

    public final void setNavigationBarButtonBackgroundTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.setTintList(colorStateList);
            int i = this.e;
            shapeDrawable.setIntrinsicWidth(i);
            shapeDrawable.setIntrinsicHeight(i);
            int i2 = this.b;
            setBackground(new InsetDrawable((Drawable) shapeDrawable, i2, i2, i2, i2));
        }
    }
}
