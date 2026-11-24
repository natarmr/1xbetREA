package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_control.AmountCurrencyView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class ajl extends FrameLayout implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f981a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public boolean i;
    public CharSequence j;
    public boolean k;
    public final AmountCurrencyView l;
    public final AppCompatTextView m;
    public final DsButton n;
    public final DsShimmerView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajl(Context context) {
        super(context, null);
        context.getClass();
        this.f981a = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_18);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_20);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_38);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_128);
        this.g = getResources().getDimensionPixelSize(R.dimen.size_160);
        this.h = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.size_56), 1073741824);
        this.j = "";
        this.k = true;
        AmountCurrencyView amountCurrencyView = new AmountCurrencyView(context, null);
        amountCurrencyView.b(context, R.style.TextStyle_Title_Medium_XL_TextPrimary, null, Float.valueOf(amountCurrencyView.getResources().getDimension(R.dimen.text_14)));
        amountCurrencyView.setId(R.id.dsAmountCurrency);
        this.l = amountCurrencyView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        cem0.n(R.style.TextStyle_Caption_Regular_L_Secondary, appCompatTextView);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setGravity(8388611);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextAlignment(5);
        this.m = appCompatTextView;
        DsButton dsButton = new DsButton(context, null, 6, 0);
        dsButton.setButtonSize(eul.MEDIUM);
        this.n = dsButton;
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.radius_16));
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context)));
        dsShimmerView.setBackground(gradientDrawable);
        this.o = dsShimmerView;
        addView(appCompatTextView);
        addView(amountCurrencyView);
        addView(dsButton);
        addView(dsShimmerView);
        x0x.s(this);
    }

    @Override // a.qe
    public final void a(boolean z) {
        AmountCurrencyView amountCurrencyView = this.l;
        DsShimmerView dsShimmerView = this.o;
        if (z) {
            x0x.s(this);
            dsShimmerView.setVisibility(0);
            amountCurrencyView.setVisibility(8);
        } else {
            x0x.O(this);
            dsShimmerView.setVisibility(8);
            amountCurrencyView.setVisibility(0);
        }
    }

    @Override // a.qe
    public final void b(boolean z) {
        this.n.setLoading(z);
    }

    @Override // a.qe
    public CharSequence getVisibleAmount() {
        return this.l.getVisibleText();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        ajl ajlVar;
        jmu0.f(i, i2, i3, this.b, this.m, this);
        if (this.k) {
            ajlVar = this;
            jmu0.f(i, i4 - this.e, this.f + i, i4, this.o, ajlVar);
            i5 = i4;
        } else {
            i5 = i4;
            ajlVar = this;
            int i6 = i5 - ajlVar.c;
            AmountCurrencyView amountCurrencyView = ajlVar.l;
            int measuredHeight = i6 - (amountCurrencyView.getMeasuredHeight() / 2);
            jmu0.f(i, measuredHeight, amountCurrencyView.getMeasuredWidth() + i, amountCurrencyView.getMeasuredHeight() + measuredHeight, amountCurrencyView, ajlVar);
        }
        if (ajlVar.i) {
            DsButton dsButton = ajlVar.n;
            jmu0.f(i3 - dsButton.getMeasuredWidth(), i5 - dsButton.getMeasuredHeight(), i3, i5, dsButton, ajlVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.i;
        DsButton dsButton = this.n;
        if (z) {
            dsButton.measure(View.MeasureSpec.makeMeasureSpec(this.g, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dsButton.getButtonHeight(), 1073741824));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - dsButton.getMeasuredWidth()) - (this.i ? this.f981a : 0), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
        this.l.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.o.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(size, this.h);
    }

    @Override // a.qe
    public void setAmountCurrencyMargin(int i) {
        this.l.setAmountCurrencyMargin(i);
    }

    @Override // a.qe
    public void setAmountCurrencyVisible(boolean z) {
        this.l.setVisibility(z ? 0 : 8);
    }

    @Override // a.qe
    public void setButtonEnabled(boolean z) {
        this.n.setEnabled(z);
    }

    @Override // a.qe
    public void setButtonIconAutoMirrored(boolean z) {
        this.n.setIconAutoMirrored(z);
    }

    @Override // a.qe
    public void setButtonIconRes(int i) {
        this.n.i(i);
    }

    @Override // a.qe
    public void setButtonStyle(ful fulVar) {
        fulVar.getClass();
        DsButton dsButton = this.n;
        dsButton.setButtonStyle(fulVar);
        dsButton.h();
    }

    @Override // a.qe
    public void setButtonText(CharSequence charSequence) {
        charSequence.getClass();
        this.n.l(charSequence);
    }

    @Override // a.qe
    public void setButtonType(gul gulVar) {
        gulVar.getClass();
        DsButton dsButton = this.n;
        dsButton.getClass();
        if (dsButton.e == gulVar) {
            return;
        }
        dsButton.e = gulVar;
        if (gulVar.c) {
            dsButton.a();
        } else {
            AppCompatImageView appCompatImageView = dsButton.l;
            if (appCompatImageView != null) {
                dsButton.removeView(appCompatImageView);
                dsButton.l = null;
            }
        }
        dsButton.g();
    }

    @Override // a.qe
    public void setButtonVisible(boolean z) {
        this.n.setVisibility(this.i && z ? 0 : 8);
    }

    @Override // a.qe
    public void setClickListener(View.OnClickListener onClickListener) {
        this.n.setOnClickListener(onClickListener);
    }

    @Override // a.qe
    public void setHasButton(boolean z) {
        this.i = z;
        this.n.setVisibility(z ? 0 : 8);
    }

    @Override // a.qe
    public void setLabel(CharSequence charSequence) {
        charSequence.getClass();
        setId(R.id.dsAccountInfoLarge);
        this.j = charSequence;
        this.m.setText(charSequence);
        setContentDescription(this.j);
    }

    @Override // a.qe
    public void setModel(ke keVar) {
        keVar.getClass();
        this.l.a(keVar.f18129a, keVar.b);
        x0x.O(this);
        this.o.setVisibility(8);
        this.k = false;
    }
}
