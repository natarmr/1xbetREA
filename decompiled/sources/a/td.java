package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_control.AmountCurrencyView;

/* JADX INFO: loaded from: classes6.dex */
public final class td extends FrameLayout implements fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33740a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final AmountCurrencyView f;
    public final View g;
    public final View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(Context context) {
        super(context, null);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.f33740a = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = dimensionPixelSize2;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.size_20);
        this.c = dimensionPixelSize4;
        this.d = hne.D(dimensionPixelSize, dimensionPixelSize4, dimensionPixelSize2, dimensionPixelSize3);
        this.e = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.size_24), 1073741824);
        AmountCurrencyView amountCurrencyView = new AmountCurrencyView(context, null);
        amountCurrencyView.b(context, R.style.TextStyle_Caption_Medium_L_TextPrimary, null, null);
        this.f = amountCurrencyView;
        View view = new View(context);
        view.setId(jmu0.d());
        view.setBackground(epv0.U(R.drawable.ic_account_control_icon_round, context));
        this.g = view;
        View view2 = new View(context);
        view2.setId(jmu0.d());
        view2.setBackground(epv0.U(R.drawable.account_control_primary_background, context));
        this.h = view2;
        addView(view2);
        addView(amountCurrencyView);
        addView(view);
    }

    @Override // a.fe
    public CharSequence getVisibleText() {
        return this.f.getVisibleText();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight() / 2;
        View view = this.g;
        int measuredHeight2 = measuredHeight - (view.getMeasuredHeight() / 2);
        int measuredWidth = view.getMeasuredWidth();
        int i5 = this.f33740a;
        int i6 = measuredWidth + i5;
        jmu0.f(i5, measuredHeight2, i6, view.getMeasuredHeight() + measuredHeight2, view, this);
        int i7 = this.b + i6;
        AmountCurrencyView amountCurrencyView = this.f;
        jmu0.f(i7, 0, amountCurrencyView.getMeasuredWidth() + i7, amountCurrencyView.getMeasuredHeight(), this.f, this);
        View view2 = this.h;
        jmu0.f(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight(), view2, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.d;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - i3, 1073741824);
        AmountCurrencyView amountCurrencyView = this.f;
        int i4 = this.e;
        amountCurrencyView.measure(iMakeMeasureSpec, i4);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(amountCurrencyView.getMeasuredWidth() + i3, 1073741824);
        int i5 = this.c;
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        this.h.measure(iMakeMeasureSpec2, i4);
        setMeasuredDimension(iMakeMeasureSpec2, i4);
    }

    @Override // a.fe
    public void setBackground(ColorStateList colorStateList) {
        colorStateList.getClass();
        jmu0.j(this.h, colorStateList);
    }

    @Override // a.fe
    public void setModel(sd sdVar) {
        sdVar.getClass();
        this.f.a(sdVar.f32009a, sdVar.b);
    }
}
