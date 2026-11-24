package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes6.dex */
public final class ex00 extends FrameLayout implements kdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8553a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final uil j;
    public final FrameLayout k;
    public final AppCompatImageView l;
    public final AppCompatImageView m;
    public final DsSeparator n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex00(Context context) {
        super(context, null, R.attr.toolBarStyle);
        context.getClass();
        this.f8553a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_24);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_96);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_56);
        this.g = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.h = getResources().getDimensionPixelSize(R.dimen.size_48);
        this.i = getResources().getDimensionPixelSize(R.dimen.size_1);
        uil uilVar = new uil(context);
        uilVar.setTag("DSNavigationBarPopularAmountView");
        uilVar.setId(jmu0.d());
        this.j = uilVar;
        this.k = new FrameLayout(context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(jmu0.d());
        appCompatImageView.setTag("DSNavigationBarPopularLogoImageView");
        this.l = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setTag("DSNavigationBarPopularSearchView");
        appCompatImageView2.setId(jmu0.d());
        appCompatImageView2.setImageResource(R.drawable.ic_glyph_search);
        appCompatImageView2.setColorFilter(m5d.b(R.attr.uikitSecondary, context));
        this.m = appCompatImageView2;
        DsSeparator dsSeparator = new DsSeparator(context, null, 6, 0);
        dsSeparator.setId(jmu0.d());
        dsSeparator.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
        this.n = dsSeparator;
        addView(appCompatImageView);
        addView(uilVar);
        addView(dsSeparator);
    }

    @Override // a.kdb0
    public final void a(boolean z) {
        this.n.setVisibility(z ? 0 : 8);
    }

    @Override // a.kdb0
    public String getVisibleText() {
        return this.j.getVisibleAmount();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        AppCompatImageView appCompatImageView = this.l;
        int measuredWidth = appCompatImageView.getMeasuredWidth();
        int measuredHeight = appCompatImageView.getMeasuredHeight();
        int i7 = this.c;
        int i8 = (i5 / 2) - (measuredHeight / 2);
        jmu0.f(i7, i8, measuredWidth + i7, measuredHeight + i8, appCompatImageView, this);
        int layoutDirection = getLayoutDirection();
        FrameLayout frameLayout = this.k;
        if (layoutDirection == 0) {
            frameLayout.setScaleX(1.0f);
        } else {
            frameLayout.setScaleX(-1.0f);
        }
        int measuredWidth2 = frameLayout.getMeasuredWidth();
        int measuredHeight2 = frameLayout.getMeasuredHeight();
        int i9 = this.b;
        int i10 = (i6 - measuredWidth2) - i9;
        AppCompatImageView appCompatImageView2 = this.m;
        int measuredWidth3 = appCompatImageView2.getMeasuredWidth();
        int measuredHeight3 = appCompatImageView2.getMeasuredHeight();
        int i11 = (measuredHeight2 - measuredHeight3) / 2;
        int i12 = this.f / 2;
        int i13 = measuredHeight2 / 2;
        jmu0.f(i10, i12 - i13, i10 + measuredWidth2, i13 + i12, frameLayout, this);
        int i14 = (measuredWidth2 - measuredWidth3) / 2;
        appCompatImageView2.layout(i14, i11, measuredWidth3 + i14, i11 + measuredHeight3);
        uil uilVar = this.j;
        int measuredWidth4 = uilVar.getMeasuredWidth();
        int measuredHeight4 = uilVar.getMeasuredHeight();
        int i15 = i12 - (measuredHeight4 / 2);
        int i16 = i15 + measuredHeight4;
        int measuredWidth5 = appCompatImageView2.getVisibility() == 0 ? ((i6 - this.f8553a) - frameLayout.getMeasuredWidth()) - i9 : i6 - i9;
        jmu0.f(measuredWidth5 - measuredWidth4, i15, measuredWidth5, i16, this.j, this);
        jmu0.f(0, i5, i6, i5 - this.i, this.n, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.e, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.d, Integer.MIN_VALUE);
        AppCompatImageView appCompatImageView = this.l;
        appCompatImageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        AppCompatImageView appCompatImageView2 = this.m;
        int visibility = appCompatImageView2.getVisibility();
        int i3 = this.h;
        if (visibility == 0) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int i4 = this.g;
            int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            this.k.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            appCompatImageView2.measure(iMakeMeasureSpec5, iMakeMeasureSpec6);
        }
        int measuredWidth = appCompatImageView.getMeasuredWidth();
        int visibility2 = appCompatImageView2.getVisibility();
        int i5 = this.c;
        int iMakeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec((visibility2 == 0 ? (((size - i5) - measuredWidth) - this.f8553a) - i3 : (size - i5) - measuredWidth) - i5, Integer.MIN_VALUE);
        int i6 = this.f;
        this.j.measure(iMakeMeasureSpec7, View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.i, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i6));
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
        AppCompatImageView appCompatImageView = this.l;
        if (z) {
            appCompatImageView.setImageResource(((hx00) jx00Var).f13790a);
            return;
        }
        if (!(jx00Var instanceof ix00)) {
            t9f.b();
            return;
        }
        ix00 ix00Var = (ix00) jx00Var;
        int i = ix00Var.b;
        String str = ix00Var.f15517a;
        gbe0 gbe0VarA = o5k0.a(appCompatImageView.getContext());
        k1x k1xVar = new k1x(appCompatImageView.getContext());
        k1xVar.c = str;
        t1x.h(k1xVar, appCompatImageView);
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
        this.j.setOnClickListener(new c0(function0, (byte) 8));
    }

    @Override // a.kdb0
    public void setOnSearchIconClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.m.setOnClickListener(new c0(function0, (byte) 9));
    }

    @Override // a.kdb0
    public void setSearchIconVisibility(boolean z) {
        AppCompatImageView appCompatImageView = this.m;
        FrameLayout frameLayout = this.k;
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
