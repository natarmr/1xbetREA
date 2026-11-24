package org.xplatform.main_menu.impl.presentation.common.views;

import a.ac0;
import a.aem0;
import a.bc0;
import a.c0o;
import a.cy7;
import a.enm;
import a.f7k;
import a.m5d;
import a.n0x;
import a.r0x;
import a.t90;
import a.t9f;
import a.x0x;
import a.xpd0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes.dex */
public final class AggregatorBanner extends FrameLayout {
    public static final /* synthetic */ int s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsShimmerView f46768a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatImageView d;
    public final r0x e;
    public final ColorDrawable f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final Drawable m;
    public final GradientDrawable n;
    public final ac0 o;
    public final int p;
    public int q;
    public boolean r;

    /* JADX WARN: Illegal instructions before constructor call */
    public AggregatorBanner(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ImageView.ScaleType scaleType;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        byte b = 0;
        super(context, attributeSet, 0, R.style.AggregatorBanner_Line);
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        this.f46768a = dsShimmerView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        this.c = appCompatTextView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.d = appCompatImageView;
        this.e = new r0x(appCompatImageView);
        this.f = new ColorDrawable(context.getColor(R.color.static_gray));
        this.i = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xpd0.f41264a, 0, R.style.AggregatorBanner_Line);
        typedArrayObtainStyledAttributes.getClass();
        ac0 ac0Var = ac0.f604a;
        int i3 = typedArrayObtainStyledAttributes.getInt(7, 1);
        c0o c0oVar = ac0.d;
        ac0 ac0Var2 = (ac0) ((i3 < 0 || i3 >= c0oVar.b()) ? ac0.b : c0oVar.get(i3));
        this.o = ac0Var2;
        this.l = f7k.M(typedArrayObtainStyledAttributes.getInt(0, getResources().getDimensionPixelSize(R.dimen.radius_16)));
        this.g = typedArrayObtainStyledAttributes.getColor(1, getContext().getColor(R.color.static_gray));
        this.h = typedArrayObtainStyledAttributes.getColor(2, getContext().getColor(R.color.static_gray));
        this.m = typedArrayObtainStyledAttributes.getDrawable(3);
        this.n = typedArrayObtainStyledAttributes.getBoolean(8, false) ? new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{getContext().getColor(R.color.static_black_80), getContext().getColor(R.color.static_transparent)}) : null;
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
        setPlaceHolderIconDrawableVisibility(false);
        dsShimmerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        addOnAttachStateChangeListener(new bc0(this, b));
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.text_12);
        a(appCompatTextView, getContext().getColor(R.color.static_white), getResources().getDimensionPixelSize(R.dimen.line_height_18), dimensionPixelSize3, dimensionPixelSize2);
        appCompatTextView.setVisibility(8);
        appCompatTextView.setTextDirection(5);
        int iOrdinal = ac0Var2.ordinal();
        if (iOrdinal == 0) {
            i2 = 80;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                throw null;
            }
            i2 = 16;
        }
        appCompatTextView.setGravity(i2);
        a(appCompatTextView2, getContext().getColor(R.color.static_white_80), dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize3);
        appCompatTextView2.setVisibility(8);
        appCompatTextView2.setTextDirection(5);
        appCompatTextView2.setGravity(16);
        appCompatImageView.setAdjustViewBounds(true);
        int iOrdinal2 = ac0Var2.ordinal();
        if (iOrdinal2 == 0) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            if (iOrdinal2 != 1) {
                t9f.b();
                throw null;
            }
            scaleType = cy7.c() ? ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_END;
        }
        appCompatImageView.setScaleType(scaleType);
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        setWillNotDraw(false);
    }

    public static void a(AppCompatTextView appCompatTextView, int i, int i2, int i3, int i4) {
        appCompatTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        appCompatTextView.setTextColor(i);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setLineHeight(i2);
        appCompatTextView.setMaxLines(2);
        if (i4 > i3) {
            aem0.r(appCompatTextView, i3, i4, 1, 0);
        } else {
            appCompatTextView.setTextSize(0, i4);
        }
    }

    private final int getPlaceholderColor() {
        CharSequence text = this.b.getText();
        text.getClass();
        if (text.length() == 0) {
            CharSequence text2 = this.c.getText();
            text2.getClass();
            if (text2.length() == 0) {
                return this.h;
            }
        }
        return this.g;
    }

    private final void setPlaceHolderIconDrawableVisibility(boolean z) {
        int i = z ? R.attr.uikitSecondary40 : R.attr.uikitStaticTransparent;
        Drawable drawable = this.m;
        if (drawable != null) {
            Context context = getContext();
            context.getClass();
            drawable.setTint(m5d.b(i, context));
        }
    }

    public final void b(AppCompatTextView appCompatTextView, int i) {
        int i2 = this.q;
        int i3 = this.j;
        if (i2 != 1) {
            appCompatTextView.layout(i3, i, appCompatTextView.getMeasuredWidth() + i3, appCompatTextView.getMeasuredHeight() + i);
        } else {
            int measuredWidth = getMeasuredWidth() - i3;
            appCompatTextView.layout(measuredWidth - appCompatTextView.getMeasuredWidth(), i, measuredWidth, appCompatTextView.getMeasuredHeight() + i);
        }
    }

    public final void c(Throwable th) {
        String message;
        if (th != null && (message = th.getMessage()) != null) {
            System.out.println((Object) message);
        }
        CharSequence text = this.b.getText();
        text.getClass();
        if (text.length() == 0) {
            CharSequence text2 = this.c.getText();
            text2.getClass();
            if (text2.length() == 0) {
                this.f.setTint(getPlaceholderColor());
                invalidate();
            }
        }
        this.d.setImageDrawable(null);
    }

    public final void d(Bitmap bitmap) {
        setPlaceHolderIconDrawableVisibility(false);
        AppCompatImageView appCompatImageView = this.d;
        int measuredHeight = appCompatImageView.getMeasuredHeight() / 2;
        if (bitmap == null) {
            c(null);
            return;
        }
        this.f.setTint(bitmap.getPixel(2, measuredHeight));
        invalidate();
        appCompatImageView.setImageBitmap(bitmap);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        GradientDrawable gradientDrawable;
        canvas.getClass();
        AppCompatTextView appCompatTextView = this.b;
        if (Intrinsics.d(view, appCompatTextView) && (gradientDrawable = this.n) != null && !this.r) {
            CharSequence text = appCompatTextView.getText();
            text.getClass();
            if (text.length() > 0) {
                gradientDrawable.draw(canvas);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        canvas.getClass();
        super.onDraw(canvas);
        ColorDrawable colorDrawable = this.f;
        Rect bounds = colorDrawable.getBounds();
        bounds.getClass();
        Path path = new Path();
        RectF rectF = new RectF(bounds.left, bounds.top, bounds.right, bounds.bottom);
        float f = this.l;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        colorDrawable.draw(canvas);
        if (this.r || (drawable = this.m) == null) {
            return;
        }
        drawable.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.r;
        AppCompatImageView appCompatImageView = this.d;
        if (z2) {
            this.f46768a.layout(0, 0, getMeasuredWidth(), appCompatImageView.getMeasuredHeight());
            return;
        }
        int iOrdinal = this.o.ordinal();
        AppCompatTextView appCompatTextView = this.b;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            boolean z3 = appCompatTextView.getVisibility() == 0;
            AppCompatTextView appCompatTextView2 = this.c;
            if (appCompatTextView2.getVisibility() != 0) {
                b(appCompatTextView, (getMeasuredHeight() - appCompatTextView.getMeasuredHeight()) / 2);
            } else if (z3) {
                int measuredHeight = appCompatTextView.getMeasuredHeight() + this.k;
                int measuredHeight2 = (getMeasuredHeight() - (appCompatTextView2.getMeasuredHeight() + measuredHeight)) / 2;
                b(appCompatTextView, measuredHeight2);
                b(appCompatTextView2, measuredHeight2 + measuredHeight);
            } else {
                b(appCompatTextView2, (getMeasuredHeight() - appCompatTextView2.getMeasuredHeight()) / 2);
            }
        } else {
            int measuredHeight3 = getMeasuredHeight() - this.p;
            int measuredHeight4 = measuredHeight3 - appCompatTextView.getMeasuredHeight();
            int measuredWidth = appCompatTextView.getMeasuredWidth();
            int i5 = this.j;
            appCompatTextView.layout(i5, measuredHeight4, measuredWidth + i5, measuredHeight3);
        }
        appCompatImageView.layout(0, 0, getMeasuredWidth(), appCompatImageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        this.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        GradientDrawable gradientDrawable = this.n;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.i, getMeasuredWidth(), getMeasuredHeight());
        }
        Drawable drawable = this.m;
        if (drawable != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_24);
            int measuredWidth = (getMeasuredWidth() - dimensionPixelSize) / 2;
            int measuredHeight = (getMeasuredHeight() - dimensionPixelSize) / 2;
            drawable.setBounds(measuredWidth, measuredHeight, measuredWidth + dimensionPixelSize, dimensionPixelSize + measuredHeight);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        this.f46768a.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        AppCompatTextView appCompatTextView = this.b;
        boolean z = appCompatTextView.getVisibility() == 0;
        AppCompatTextView appCompatTextView2 = this.c;
        boolean z2 = appCompatTextView2.getVisibility() == 0;
        if (z || z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((size - this.j) - this.p, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
            if (z) {
                appCompatTextView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            }
            if (z2) {
                appCompatTextView2.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.q != i) {
            this.q = i;
            AppCompatImageView appCompatImageView = this.d;
            ImageView.ScaleType scaleType = appCompatImageView.getScaleType();
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.FIT_START;
            if (scaleType == scaleType2 && i == 0) {
                appCompatImageView.setScaleType(ImageView.ScaleType.FIT_END);
            } else if (appCompatImageView.getScaleType() == ImageView.ScaleType.FIT_END && i == 1) {
                appCompatImageView.setScaleType(scaleType2);
            }
            invalidate();
            requestLayout();
        }
    }

    public final void setImageUrl(String str) {
        str.getClass();
        setPlaceHolderIconDrawableVisibility(true);
        this.f.setTint(getPlaceholderColor());
        r0x r0xVar = this.e;
        r0xVar.getClass();
        AppCompatImageView appCompatImageView = this.d;
        appCompatImageView.getClass();
        appCompatImageView.setColorFilter((ColorFilter) null);
        int i = 0;
        int i2 = 1;
        Class<AggregatorBanner> cls = AggregatorBanner.class;
        r0x.h(r0xVar.f29650a, new enm((Object) r0xVar, (Object) new n0x(str), (Object) new t90(i2, this, cls, "onLoadSuccessImage", "onLoadSuccessImage(Landroid/graphics/Bitmap;)Z", i, (byte) 3), (Object) new t90(i2, this, cls, "onLoadFailedImage", "onLoadFailedImage(Ljava/lang/Throwable;)Z", i, (byte) 4), (byte) 12));
    }

    public final void setLooksLikeShimmer(boolean z) {
        DsShimmerView dsShimmerView = this.f46768a;
        AppCompatTextView appCompatTextView = this.c;
        AppCompatTextView appCompatTextView2 = this.b;
        AppCompatImageView appCompatImageView = this.d;
        if (z) {
            this.r = true;
            appCompatImageView.setVisibility(8);
            appCompatTextView2.setVisibility(8);
            appCompatTextView.setVisibility(8);
            addView(dsShimmerView);
            if (isAttachedToWindow()) {
                x0x.s(this);
                return;
            }
            return;
        }
        this.r = false;
        appCompatImageView.setVisibility(0);
        CharSequence text = appCompatTextView2.getText();
        text.getClass();
        appCompatTextView2.setVisibility(text.length() > 0 ? 0 : 8);
        CharSequence text2 = appCompatTextView.getText();
        text2.getClass();
        appCompatTextView.setVisibility(text2.length() > 0 ? 0 : 8);
        removeView(dsShimmerView);
        if (isAttachedToWindow()) {
            x0x.O(this);
        }
    }

    public final void setSubtitle(String str) {
        str.getClass();
        if (this.o == ac0.f604a) {
            return;
        }
        AppCompatTextView appCompatTextView = this.c;
        appCompatTextView.setText(str);
        boolean z = str.length() > 0;
        if (z != (appCompatTextView.getVisibility() == 0) && !this.r) {
            appCompatTextView.setVisibility(z ? 0 : 8);
        }
        this.b.setMaxLines(z ? 1 : 2);
    }

    public final void setTitle(String str) {
        str.getClass();
        AppCompatTextView appCompatTextView = this.b;
        appCompatTextView.setText(str);
        boolean z = str.length() > 0;
        if (z == (appCompatTextView.getVisibility() == 0) || this.r) {
            return;
        }
        appCompatTextView.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AggregatorBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AggregatorBanner(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
