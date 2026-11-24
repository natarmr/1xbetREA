package org.xplatform.feature.balance_management_old.impl.presentation.view;

import a.aqd0;
import a.dc3;
import a.epv0;
import a.hny;
import a.j5d;
import a.jmu0;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class TransactionButton extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46643a;
    public final dc3 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public TransactionButton(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_pay_in_pay_out_button, (ViewGroup) this, false);
        addView(viewInflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i2 = R.id.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewInflate, R.id.ivIcon);
        if (appCompatImageView != null) {
            i2 = R.id.tvDescription;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvDescription);
            if (textView != null) {
                this.b = new dc3(constraintLayout, constraintLayout, appCompatImageView, textView, (byte) 19);
                if (attributeSet != null) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.B);
                    typedArrayObtainStyledAttributes.getClass();
                    this.f46643a = typedArrayObtainStyledAttributes.getInt(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void setColorForViews(int i) {
        dc3 dc3Var = this.b;
        AppCompatImageView appCompatImageView = (AppCompatImageView) dc3Var.d;
        TypedValue typedValue = j5d.f15927a;
        Context context = getContext();
        context.getClass();
        jmu0.j(appCompatImageView, ColorStateList.valueOf(j5d.a(context, i, false)));
        TextView textView = (TextView) dc3Var.e;
        Context context2 = getContext();
        context2.getClass();
        textView.setTextColor(ColorStateList.valueOf(j5d.a(context2, i, false)));
    }

    public final void a() {
        dc3 dc3Var = this.b;
        int i = this.f46643a;
        if (i == 0) {
            ((AppCompatImageView) dc3Var.d).setImageResource(R.drawable.ic_glyph_replenish);
            ((AppCompatImageView) dc3Var.d).setBackground(epv0.U(R.drawable.white_circle, getContext()));
            ((TextView) dc3Var.e).setText(getContext().getString(R.string.top_up));
            ((ConstraintLayout) dc3Var.c).setBackground(epv0.U(R.drawable.background_pay_in_button, getContext()));
            setColorForViews(R.attr.uikitCommerce);
            return;
        }
        if (i != 1) {
            return;
        }
        ((AppCompatImageView) dc3Var.d).setImageResource(R.drawable.ic_glyph_minus_small);
        ((AppCompatImageView) dc3Var.d).setBackground(epv0.U(R.drawable.white_circle, getContext()));
        ((TextView) dc3Var.e).setText(getContext().getString(R.string.withdraw_money));
        ((ConstraintLayout) dc3Var.c).setBackground(epv0.U(R.drawable.background_pay_out_button, getContext()));
        setColorForViews(R.attr.uikitPrimary);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    public final void setEnabledState(boolean z) {
        setEnabled(z);
        if (z) {
            a();
            return;
        }
        dc3 dc3Var = this.b;
        ((ConstraintLayout) dc3Var.c).setBackground(epv0.U(R.drawable.transaction_button_disabled_background, getContext()));
        AppCompatImageView appCompatImageView = (AppCompatImageView) dc3Var.d;
        TypedValue typedValue = j5d.f15927a;
        Context context = getContext();
        context.getClass();
        appCompatImageView.setColorFilter(j5d.a(context, R.attr.uikitStaticWhite40, false));
        setColorForViews(R.attr.uikitSecondary20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransactionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransactionButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
