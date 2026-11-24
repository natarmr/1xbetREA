package org.xplatform.uikit.components.snackbar;

import a.c0;
import a.hny;
import a.mjj0;
import a.ydk0;
import a.yum0;
import a.zkk;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSnackBarView extends ConstraintLayout {
    public static final /* synthetic */ int s = 0;
    public final zkk q;
    public final ydk0 r;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsSnackBarView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.snackbarStyle);
        LayoutInflater.from(context).inflate(R.layout.snackbar_layout, this);
        int i2 = R.id.barrier;
        if (((Barrier) yum0.f(this, R.id.barrier)) != null) {
            i2 = R.id.cancelIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(this, R.id.cancelIcon);
            if (appCompatImageView != null) {
                i2 = R.id.constraintLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(this, R.id.constraintLayout);
                if (constraintLayout != null) {
                    i2 = R.id.flAction;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(this, R.id.flAction);
                    if (frameLayout != null) {
                        i2 = R.id.guideline;
                        if (((Guideline) yum0.f(this, R.id.guideline)) != null) {
                            i2 = R.id.infoIcon;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) yum0.f(this, R.id.infoIcon);
                            if (appCompatImageView2 != null) {
                                i2 = R.id.subtitle;
                                TextView textView = (TextView) yum0.f(this, R.id.subtitle);
                                if (textView != null) {
                                    i2 = R.id.title;
                                    TextView textView2 = (TextView) yum0.f(this, R.id.title);
                                    if (textView2 != null) {
                                        i2 = R.id.tvActionLabel;
                                        TextView textView3 = (TextView) yum0.f(this, R.id.tvActionLabel);
                                        if (textView3 != null) {
                                            this.q = new zkk(this, appCompatImageView, constraintLayout, frameLayout, appCompatImageView2, textView, textView2, textView3);
                                            ydk0 ydk0Var = new ydk0(this);
                                            ydk0Var.a(new mjj0(0.0f, 2.0f, context.getColor(R.color.static_black_4)));
                                            ydk0Var.a(new mjj0(8.0f, 24.0f, context.getColor(R.color.static_black_8)));
                                            this.r = ydk0Var;
                                            float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.radius_8);
                                            float dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.radius_16);
                                            ydk0Var.e = dimensionPixelSize;
                                            ydk0Var.f = dimensionPixelSize;
                                            ydk0Var.g = dimensionPixelSize;
                                            ydk0Var.h = dimensionPixelSize2;
                                            int i3 = (int) dimensionPixelSize;
                                            setPadding(i3, i3, i3, (int) dimensionPixelSize2);
                                            if (isAttachedToWindow()) {
                                                invalidate();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.radius_16);
        float dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.radius_8);
        int width = getWidth();
        int height = getHeight();
        ydk0 ydk0Var = this.r;
        ydk0Var.getClass();
        RectF rectF = ydk0Var.d;
        rectF.set(ydk0Var.e + 0.0f, dimensionPixelSize2 + ydk0Var.f, width - ydk0Var.g, height - ydk0Var.h);
        Paint paint = ydk0Var.b;
        paint.clearShadowLayer();
        paint.setColor(0);
        for (mjj0 mjj0Var : ydk0Var.c) {
            float f = mjj0Var.b;
            int i = mjj0Var.c;
            paint.setShadowLayer(f, 0.0f, mjj0Var.f21898a, i);
            canvas.drawRoundRect(rectF, dimensionPixelSize, dimensionPixelSize, paint);
            paint.setColor(i);
        }
        paint.clearShadowLayer();
        super.dispatchDraw(canvas);
    }

    public final void setCancelAction(Function0<Unit> function0) {
        function0.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_12);
        zkk zkkVar = this.q;
        TextView textView = (TextView) zkkVar.e;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
        textView.setLayoutParams(marginLayoutParams);
        ((FrameLayout) zkkVar.g).setVisibility(0);
        ((FrameLayout) zkkVar.g).setOnClickListener(new c0(function0, (byte) 4));
    }

    public final void setIcon(int i) {
        ((AppCompatImageView) this.q.i).setImageResource(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        zkk zkkVar = this.q;
        zkkVar.d.setVisibility(0);
        zkkVar.d.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        ((TextView) this.q.e).setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSnackBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSnackBarView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
