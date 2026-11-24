package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_control.AmountCurrencyView;

/* JADX INFO: loaded from: classes6.dex */
public final class xd extends FrameLayout implements fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40672a;
    public final int b;
    public final int c;
    public final int d;
    public final AmountCurrencyView e;
    public final TextView f;
    public final View g;
    public final View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(Context context) {
        super(context, null);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.f40672a = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_6);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.size_20);
        this.b = dimensionPixelSize3;
        this.c = hne.D(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2);
        this.d = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.size_28), 1073741824);
        AmountCurrencyView amountCurrencyView = new AmountCurrencyView(context, null);
        amountCurrencyView.setVisibility(8);
        amountCurrencyView.b(context, R.style.TextStyle_Text_Bold_CommerceForeground, Float.valueOf(amountCurrencyView.getResources().getDimension(R.dimen.text_14)), Float.valueOf(amountCurrencyView.getResources().getDimension(R.dimen.text_12)));
        this.e = amountCurrencyView;
        TextView textView = new TextView(context);
        textView.setMaxLines(1);
        textView.setVisibility(8);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        cem0.n(R.style.TextStyle_Text_Bold_CommerceForeground, textView);
        aem0.r(textView, 10, 16, 1, 2);
        this.f = textView;
        View view = new View(context);
        view.setId(jmu0.d());
        view.setBackground(epv0.U(R.drawable.ic_account_control_senery, context));
        this.g = view;
        View view2 = new View(context);
        view2.setId(jmu0.d());
        view2.setBackground(epv0.U(R.drawable.account_control_senary_background, context));
        this.h = view2;
        addView(view2);
        addView(amountCurrencyView);
        addView(textView);
        addView(view);
    }

    @Override // a.fe
    public CharSequence getVisibleText() {
        return this.e.getVisibleText();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight() / 2;
        View view = this.g;
        int measuredHeight2 = measuredHeight - (view.getMeasuredHeight() / 2);
        int measuredWidth = view.getMeasuredWidth();
        int i5 = this.f40672a;
        int i6 = measuredWidth + i5;
        jmu0.f(i5, measuredHeight2, i6, view.getMeasuredHeight() + measuredHeight2, view, this);
        int i7 = this.f40672a;
        int i8 = i6 + i7;
        AmountCurrencyView amountCurrencyView = this.e;
        jmu0.f(i8, 0, amountCurrencyView.getMeasuredWidth() + i8, amountCurrencyView.getMeasuredHeight(), this.e, this);
        int i9 = i6 + i7;
        TextView textView = this.f;
        jmu0.f(i9, 0, textView.getMeasuredWidth() + i9, textView.getMeasuredHeight(), textView, this);
        View view2 = this.h;
        jmu0.f(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight(), view2, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.c;
        int i4 = size - i3;
        AmountCurrencyView amountCurrencyView = this.e;
        int visibility = amountCurrencyView.getVisibility();
        int i5 = this.d;
        if (visibility == 0) {
            amountCurrencyView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i5);
            measuredWidth = amountCurrencyView.getMeasuredWidth();
        } else {
            TextView textView = this.f;
            if (textView.getVisibility() == 0) {
                textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
                measuredWidth = textView.getMeasuredWidth();
            } else {
                measuredWidth = 0;
            }
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 + measuredWidth, 1073741824);
        int i6 = this.b;
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        this.h.measure(iMakeMeasureSpec, i5);
        setMeasuredDimension(iMakeMeasureSpec, i5);
    }

    @Override // a.fe
    public void setBackground(ColorStateList colorStateList) {
        colorStateList.getClass();
        jmu0.j(this.h, colorStateList);
    }

    @Override // a.fe
    public void setModel(sd sdVar) {
        sdVar.getClass();
        String str = sdVar.f32009a;
        String str2 = sdVar.c;
        String str3 = sdVar.f32009a;
        boolean z = str.length() > 0 && Intrinsics.c(kotlin.text.b.i(str3), 0.0d);
        int i = z ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i);
        int i2 = z ? 8 : 0;
        AmountCurrencyView amountCurrencyView = this.e;
        amountCurrencyView.setVisibility(i2);
        if (!z) {
            amountCurrencyView.a(str3, sdVar.b);
        } else {
            if (Intrinsics.d(textView.getText().toString(), str2)) {
                return;
            }
            textView.setText(str2);
            requestLayout();
        }
    }
}
