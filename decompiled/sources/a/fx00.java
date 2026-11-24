package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes6.dex */
public final class fx00 extends FrameLayout implements kdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10286a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final uil j;
    public final View k;
    public final DsSeparator l;
    public final AppCompatImageView m;
    public final ImageView n;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx00(Context context) {
        super(context, null, R.attr.toolBarStyle);
        context.getClass();
        this.f10286a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_96);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_44);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_64);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.size_16);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.space_20);
        this.g = dimensionPixelSize4;
        this.h = getResources().getDimensionPixelSize(R.dimen.size_56);
        this.i = getResources().getDimensionPixelSize(R.dimen.size_1);
        uil uilVar = new uil(context);
        uilVar.setTag("DSNavigationBarPopularAmountView");
        uilVar.setId(jmu0.d());
        this.j = uilVar;
        View view = new View(context);
        view.setId(jmu0.d());
        view.setBackgroundResource(R.drawable.logo_search_background);
        this.k = view;
        DsSeparator dsSeparator = new DsSeparator(context, null, 6, 0);
        dsSeparator.setId(jmu0.d());
        dsSeparator.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
        this.l = dsSeparator;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setTag("DSNavigationBarPopularSearchView");
        appCompatImageView.setId(jmu0.d());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize4, dimensionPixelSize4);
        appCompatImageView.setForegroundGravity(3);
        appCompatImageView.setMaxWidth(dimensionPixelSize);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        appCompatImageView.setImageResource(R.drawable.ic_glyph_search);
        appCompatImageView.setColorFilter(m5d.b(R.attr.uikitTextPrimary, context));
        appCompatImageView.setLayoutParams(layoutParams);
        this.m = appCompatImageView;
        ImageView imageView = new ImageView(context);
        imageView.setTag("DSNavigationBarPopularLogoImageView");
        imageView.setId(jmu0.d());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, dimensionPixelSize3);
        imageView.setForegroundGravity(17);
        imageView.setMaxWidth(dimensionPixelSize2);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(R.drawable.logo_popular_new_1xbet_light);
        imageView.setLayoutParams(layoutParams2);
        this.n = imageView;
        this.o = true;
        addView(uilVar);
        addView(view);
        addView(imageView);
        addView(appCompatImageView);
        addView(dsSeparator);
    }

    @Override // a.kdb0
    public final void a(boolean z) {
        this.l.setVisibility(z ? 0 : 8);
    }

    @Override // a.kdb0
    public String getVisibleText() {
        return this.j.getVisibleAmount();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i4 - i2;
        int i7 = i3 - i;
        ImageView imageView = this.n;
        int measuredWidth = imageView.getMeasuredWidth();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_16);
        AppCompatImageView appCompatImageView = this.m;
        int measuredWidth2 = appCompatImageView.getVisibility() == 0 ? appCompatImageView.getMeasuredWidth() : 0;
        int visibility = appCompatImageView.getVisibility();
        int i8 = this.d;
        int i9 = this.c;
        int iD = visibility == 0 ? hne.D(i8, measuredWidth2, measuredWidth, i8) : i9 + measuredWidth + i9;
        int layoutDirection = getLayoutDirection();
        int i10 = this.b;
        int i11 = this.f10286a;
        if (layoutDirection == 0 && appCompatImageView.getVisibility() == 0) {
            i5 = i9;
        } else {
            i5 = ((getLayoutDirection() != 0 || appCompatImageView.getVisibility() == 0) && getLayoutDirection() != 0 && appCompatImageView.getVisibility() == 0) ? i10 : i11;
        }
        int i12 = (i7 - iD) + measuredWidth2 + i5;
        int i13 = this.h;
        int i14 = (i13 - dimensionPixelSize) / 2;
        jmu0.f(i12, i14, measuredWidth + i12, dimensionPixelSize + i14, imageView, this);
        int measuredWidth3 = appCompatImageView.getMeasuredWidth();
        int measuredWidth4 = imageView.getMeasuredWidth();
        View view = this.k;
        int measuredHeight = view.getMeasuredHeight();
        int iD2 = hne.D(i8, measuredWidth3, measuredWidth4, i8);
        int i15 = measuredWidth4 + i9 + i9;
        if (appCompatImageView.getVisibility() != 0) {
            iD2 = i15;
        }
        int i16 = (i7 - iD2) - i10;
        int i17 = (i6 - measuredHeight) / 2;
        jmu0.f(i16, i17, iD2 + i16, measuredHeight + i17, view, this);
        if (getLayoutDirection() == 0) {
            appCompatImageView.setScaleX(1.0f);
        } else {
            appCompatImageView.setScaleX(-1.0f);
        }
        int measuredWidth5 = imageView.getMeasuredWidth();
        int measuredWidth6 = appCompatImageView.getMeasuredWidth();
        int iD3 = hne.D(i8, measuredWidth6, measuredWidth5, i8);
        int i18 = measuredWidth5 + i9 + i9;
        if (appCompatImageView.getVisibility() != 0) {
            iD3 = i18;
        }
        int measuredHeight2 = appCompatImageView.getMeasuredHeight();
        int i19 = (i7 - iD3) + i11;
        int i20 = (i6 - measuredHeight2) / 2;
        jmu0.f(i19, i20, measuredWidth6 + i19, measuredHeight2 + i20, appCompatImageView, this);
        uil uilVar = this.j;
        int measuredHeight3 = uilVar.getMeasuredHeight();
        int measuredWidth7 = uilVar.getMeasuredWidth();
        int i21 = (i13 - measuredHeight3) / 2;
        int i22 = this.b;
        jmu0.f(i22, i21, measuredWidth7 + i22, i21 + measuredHeight3, this.j, this);
        jmu0.f(0, i6, i7, i6 - this.i, this.l, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setTag("LogoRightPopularNavigationBar");
        AppCompatImageView appCompatImageView = this.m;
        int visibility = appCompatImageView.getVisibility();
        int i3 = this.g;
        if (visibility == 0) {
            appCompatImageView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        View view = this.k;
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.o ? this.f : this.e, 1073741824));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_64);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_16);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize2, 1073741824);
        ImageView imageView = this.n;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int i4 = this.c;
        int i5 = this.b;
        int measuredWidth = imageView.getMeasuredWidth() + i3 + i4 + i5 + i4;
        int measuredWidth2 = imageView.getMeasuredWidth() + i4 + i4;
        boolean z = this.o;
        int i6 = this.d;
        this.j.measure(View.MeasureSpec.makeMeasureSpec((z ? (size - i6) - measuredWidth : (size - i6) - measuredWidth2) - i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.l.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.i, 1073741824));
        setMeasuredDimension(size, this.h);
    }

    @Override // a.kdb0
    public void setAccountControlStyle(String str) {
        str.getClass();
        this.j.setStyle(str);
    }

    @Override // a.kdb0
    public void setAmountVisibility(boolean z) {
        uil uilVar = this.j;
        uilVar.setClickable(z);
        uilVar.setVisibility(!z ? 4 : 0);
    }

    @Override // a.kdb0
    public void setLogo(jx00 jx00Var) {
        jx00Var.getClass();
        boolean z = jx00Var instanceof hx00;
        ImageView imageView = this.n;
        if (z) {
            imageView.setImageResource(((hx00) jx00Var).f13790a);
            return;
        }
        if (!(jx00Var instanceof ix00)) {
            t9f.b();
            return;
        }
        ix00 ix00Var = (ix00) jx00Var;
        int i = ix00Var.b;
        String str = ix00Var.f15517a;
        gbe0 gbe0VarA = o5k0.a(imageView.getContext());
        k1x k1xVar = new k1x(imageView.getContext());
        k1xVar.c = str;
        t1x.h(k1xVar, imageView);
        t1x.f(k1xVar, i);
        t1x.c(k1xVar, i);
        gbe0VarA.a(k1xVar.a());
    }

    @Override // a.kdb0
    public void setModel(sd sdVar) {
        sdVar.getClass();
        this.j.setModel(sdVar);
    }

    @Override // a.kdb0
    public void setOnAmountClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.j.setOnClickListener(new c0(function0, (byte) 11));
    }

    @Override // a.kdb0
    public void setOnSearchIconClickListener(Function0<Unit> function0) {
        function0.getClass();
        if (this.o) {
            this.k.setOnClickListener(new c0(function0, (byte) 10));
        }
    }

    @Override // a.kdb0
    public void setSearchIconVisibility(boolean z) {
        this.m.setVisibility(z ? 0 : 8);
        this.o = z;
    }
}
