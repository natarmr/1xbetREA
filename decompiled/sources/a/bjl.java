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
public final class bjl extends FrameLayout implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2712a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public boolean g;
    public boolean h;
    public final AmountCurrencyView i;
    public final AppCompatTextView j;
    public final DsButton k;
    public final DsShimmerView l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjl(Context context) {
        super(context, null);
        context.getClass();
        this.f2712a = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_18);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_160);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_18);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_92);
        this.f = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.size_36), 1073741824);
        this.h = true;
        AmountCurrencyView amountCurrencyView = new AmountCurrencyView(context, null);
        amountCurrencyView.setId(R.id.amountCurrency);
        amountCurrencyView.b(context, R.style.TextStyle_Headline_Medium_TextPrimary, null, Float.valueOf(amountCurrencyView.getResources().getDimension(R.dimen.text_14)));
        this.i = amountCurrencyView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(View.generateViewId());
        cem0.n(R.style.TextStyle_Caption_Regular_L_Secondary, appCompatTextView);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setGravity(8388611);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setTag("DsAccountInfoSmallLabel");
        this.j = appCompatTextView;
        DsButton dsButton = new DsButton(context, null, 6, 0);
        dsButton.setTag("DsAccountInfoSmallButton");
        dsButton.setButtonSize(eul.MEDIUM);
        this.k = dsButton;
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        dsShimmerView.setId(View.generateViewId());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.radius_36));
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context)));
        dsShimmerView.setBackground(gradientDrawable);
        this.l = dsShimmerView;
        addView(appCompatTextView);
        addView(amountCurrencyView);
        addView(dsButton);
        addView(dsShimmerView);
        x0x.s(this);
    }

    @Override // a.qe
    public final void a(boolean z) {
        AmountCurrencyView amountCurrencyView = this.i;
        DsShimmerView dsShimmerView = this.l;
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
        this.k.setLoading(z);
    }

    @Override // a.qe
    public CharSequence getVisibleAmount() {
        return this.i.getVisibleText();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AppCompatTextView appCompatTextView = this.j;
        jmu0.f(i, i2, appCompatTextView.getMeasuredWidth() + i, this.b, appCompatTextView, this);
        if (this.h) {
            jmu0.f(i, i4 - this.d, i + this.e, i4, this.l, this);
        } else {
            AmountCurrencyView amountCurrencyView = this.i;
            jmu0.f(i, i4 - amountCurrencyView.getMeasuredHeight(), amountCurrencyView.getMeasuredWidth() + i, i4, amountCurrencyView, this);
        }
        if (this.g) {
            DsButton dsButton = this.k;
            jmu0.f(i3 - dsButton.getMeasuredWidth(), i2, i3, i4, dsButton, this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.g;
        DsButton dsButton = this.k;
        if (z) {
            dsButton.measure(View.MeasureSpec.makeMeasureSpec(this.c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dsButton.getButtonHeight() - getPaddingTop(), 1073741824));
        }
        int measuredWidth = (size - dsButton.getMeasuredWidth()) - (this.g ? this.f2712a : 0);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int paddingTop = getPaddingTop();
        int i3 = this.b;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3 - paddingTop, 1073741824);
        this.i.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.l.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.j.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - getPaddingTop(), 1073741824));
        setMeasuredDimension(size, this.f);
    }

    @Override // a.qe
    public void setAmountCurrencyMargin(int i) {
        this.i.setAmountCurrencyMargin(i);
    }

    @Override // a.qe
    public void setAmountCurrencyVisible(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }

    @Override // a.qe
    public void setButtonEnabled(boolean z) {
        DsButton dsButton = this.k;
        dsButton.setEnabled(z);
        dsButton.h();
    }

    @Override // a.qe
    public void setButtonIconAutoMirrored(boolean z) {
        this.k.setIconAutoMirrored(z);
    }

    @Override // a.qe
    public void setButtonIconRes(int i) {
        this.k.i(i);
    }

    @Override // a.qe
    public void setButtonStyle(ful fulVar) {
        fulVar.getClass();
        DsButton dsButton = this.k;
        dsButton.setButtonStyle(fulVar);
        dsButton.h();
    }

    @Override // a.qe
    public void setButtonText(CharSequence charSequence) {
        charSequence.getClass();
        this.k.l(charSequence);
    }

    @Override // a.qe
    public void setButtonType(gul gulVar) {
        gulVar.getClass();
        DsButton dsButton = this.k;
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
        this.k.setVisibility(this.g && z ? 0 : 8);
    }

    @Override // a.qe
    public void setClickListener(View.OnClickListener onClickListener) {
        this.k.setOnClickListener(onClickListener);
    }

    @Override // a.qe
    public void setHasButton(boolean z) {
        this.g = z;
        this.k.setVisibility(z ? 0 : 8);
    }

    @Override // a.qe
    public void setLabel(CharSequence charSequence) {
        charSequence.getClass();
        this.j.setText(charSequence);
    }

    @Override // a.qe
    public void setModel(ke keVar) {
        keVar.getClass();
        this.i.a(keVar.f18129a, keVar.b);
        x0x.O(this);
        this.l.setVisibility(8);
        this.h = false;
    }
}
