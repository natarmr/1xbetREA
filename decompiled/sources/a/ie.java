package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_control.AmountCurrencyView;

/* JADX INFO: loaded from: classes6.dex */
public final class ie extends FrameLayout implements fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14608a;
    public final int b;
    public final int c;
    public final int d;
    public final AmountCurrencyView e;
    public final View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(Context context) {
        super(context, null);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.f14608a = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_20);
        this.b = dimensionPixelSize2;
        this.c = dimensionPixelSize2 + dimensionPixelSize;
        this.d = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.size_24), 1073741824);
        AmountCurrencyView amountCurrencyView = new AmountCurrencyView(context, null);
        amountCurrencyView.b(context, R.style.TextStyle_Headline_Bold_TextPrimary, Float.valueOf(amountCurrencyView.getResources().getDimension(R.dimen.text_16)), Float.valueOf(amountCurrencyView.getResources().getDimension(R.dimen.text_12)));
        this.e = amountCurrencyView;
        View view = new View(context);
        view.setId(jmu0.d());
        view.setBackground(epv0.U(R.drawable.ic_account_control_icon_round, context));
        this.f = view;
        addView(amountCurrencyView);
        addView(view);
    }

    @Override // a.fe
    public CharSequence getVisibleText() {
        return this.e.getVisibleText();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight() / 2;
        View view = this.f;
        int measuredHeight2 = measuredHeight - (view.getMeasuredHeight() / 2);
        int measuredWidth = view.getMeasuredWidth();
        jmu0.f(0, measuredHeight2, measuredWidth, view.getMeasuredHeight() + measuredHeight2, view, this);
        int i5 = this.f14608a + measuredWidth;
        AmountCurrencyView amountCurrencyView = this.e;
        jmu0.f(i5, 0, amountCurrencyView.getMeasuredWidth() + i5, amountCurrencyView.getMeasuredHeight(), this.e, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.c;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - i3, 1073741824);
        AmountCurrencyView amountCurrencyView = this.e;
        int i4 = this.d;
        amountCurrencyView.measure(iMakeMeasureSpec, i4);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(amountCurrencyView.getMeasuredWidth() + i3, 1073741824);
        int i5 = this.b;
        this.f.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        setMeasuredDimension(iMakeMeasureSpec2, i4);
    }

    @Override // a.fe
    public void setBackground(ColorStateList colorStateList) {
        colorStateList.getClass();
    }

    @Override // a.fe
    public void setModel(sd sdVar) {
        sdVar.getClass();
        this.e.a(sdVar.f32009a, sdVar.b);
    }
}
