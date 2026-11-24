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
public final class zw00 extends FrameLayout implements kdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45084a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final FrameLayout h;
    public final uil i;
    public final ImageView j;
    public final AppCompatImageView k;
    public final DsSeparator l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw00(Context context) {
        super(context, null, R.attr.toolBarStyle);
        context.getClass();
        this.f45084a = getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_96);
        this.b = dimensionPixelSize;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_24);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_56);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_1);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.g = getResources().getDimensionPixelSize(R.dimen.size_48);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        uil uilVar = new uil(context);
        uilVar.setTag("DSNavigationBarPopularAmountView");
        uilVar.setId(jmu0.d());
        this.i = uilVar;
        ImageView imageView = new ImageView(context);
        imageView.setId(jmu0.d());
        imageView.setTag("DSNavigationBarPopularLogoView");
        imageView.setMaxWidth(dimensionPixelSize);
        this.j = imageView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setTag("DSNavigationBarPopularSearchView");
        appCompatImageView.setId(jmu0.d());
        appCompatImageView.setImageResource(R.drawable.ic_glyph_search);
        appCompatImageView.setColorFilter(m5d.b(R.attr.uikitSecondary, context));
        this.k = appCompatImageView;
        DsSeparator dsSeparator = new DsSeparator(context, null, 6, 0);
        dsSeparator.setId(jmu0.d());
        dsSeparator.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
        this.l = dsSeparator;
        addView(imageView);
        addView(uilVar);
        addView(frameLayout);
        addView(appCompatImageView);
        addView(dsSeparator);
    }

    @Override // a.kdb0
    public final void a(boolean z) {
        this.l.setVisibility(z ? 0 : 8);
    }

    @Override // a.kdb0
    public String getVisibleText() {
        return this.i.getVisibleAmount();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        uil uilVar = this.i;
        int measuredWidth = uilVar.getMeasuredWidth();
        ImageView imageView = this.j;
        int measuredWidth2 = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        int measuredHeight2 = uilVar.getMeasuredHeight();
        int i7 = this.f45084a;
        int i8 = measuredWidth + i7;
        int i9 = (i5 - measuredHeight2) / 2;
        int iMax = Math.max((i6 / 2) - (measuredWidth2 / 2), i8 + i7);
        int i10 = (i5 - measuredHeight) / 2;
        jmu0.f(i7, i9, i8, measuredHeight2 + i9, this.i, this);
        jmu0.f(iMax, i10, iMax + measuredWidth2, i10 + measuredHeight, imageView, this);
        float f = getLayoutDirection() == 1 ? -1.0f : 1.0f;
        AppCompatImageView appCompatImageView = this.k;
        appCompatImageView.setScaleX(f);
        FrameLayout frameLayout = this.h;
        int measuredWidth3 = frameLayout.getMeasuredWidth();
        int measuredHeight3 = frameLayout.getMeasuredHeight();
        int measuredWidth4 = appCompatImageView.getMeasuredWidth();
        int measuredHeight4 = appCompatImageView.getMeasuredHeight();
        int i11 = (i6 - measuredWidth3) - this.f45084a;
        int i12 = (this.d - measuredHeight3) / 2;
        jmu0.f(i11, i12, i11 + measuredWidth3, i12 + measuredHeight3, frameLayout, this);
        int iD = hne.d(measuredWidth3, measuredWidth4, 2, frameLayout.getLeft());
        int iD2 = hne.d(measuredHeight3, measuredHeight4, 2, frameLayout.getTop());
        appCompatImageView.layout(iD, iD2, measuredWidth4 + iD, measuredHeight4 + iD2);
        jmu0.f(0, i5 - this.e, i6, i5, this.l, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.b, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.c, Integer.MIN_VALUE);
        ImageView imageView = this.j;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        AppCompatImageView appCompatImageView = this.k;
        if (appCompatImageView.getVisibility() == 0) {
            int i3 = this.g;
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int i4 = this.f;
            int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            this.h.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            appCompatImageView.measure(iMakeMeasureSpec5, iMakeMeasureSpec6);
        }
        int measuredWidth = ((size / 2) - (imageView.getMeasuredWidth() / 2)) - this.f45084a;
        if (measuredWidth < 0) {
            measuredWidth = 0;
        }
        this.i.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.l.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e, 1073741824));
        setMeasuredDimension(size, this.d);
    }

    @Override // a.kdb0
    public void setAccountControlStyle(String str) {
        str.getClass();
        this.i.setStyle(str);
    }

    @Override // a.kdb0
    public void setAmountVisibility(boolean z) {
        uil uilVar = this.i;
        uilVar.setClickable(z);
        uilVar.setVisibility(!z ? 4 : 0);
    }

    @Override // a.kdb0
    public void setLogo(jx00 jx00Var) {
        jx00Var.getClass();
        boolean z = jx00Var instanceof hx00;
        ImageView imageView = this.j;
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
        this.i.setModel(sdVar);
    }

    @Override // a.kdb0
    public void setOnAmountClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.i.setOnClickListener(new c0(function0, (byte) 7));
    }

    @Override // a.kdb0
    public void setOnSearchIconClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.k.setOnClickListener(new c0(function0, (byte) 6));
    }

    @Override // a.kdb0
    public void setSearchIconVisibility(boolean z) {
        AppCompatImageView appCompatImageView = this.k;
        FrameLayout frameLayout = this.h;
        if (!z) {
            if (frameLayout.getParent() != null) {
                removeView(frameLayout);
            }
            appCompatImageView.setVisibility(8);
        } else {
            if (frameLayout.getParent() == null) {
                frameLayout.addView(appCompatImageView);
                addView(frameLayout);
            }
            appCompatImageView.setVisibility(0);
        }
    }
}
