package org.xplatform.uikit.components.account_selection;

import a.b1;
import a.bqd0;
import a.by7;
import a.cem0;
import a.cjl;
import a.djl;
import a.dyb;
import a.ejl;
import a.fjl;
import a.hc3;
import a.hny;
import a.ivb0;
import a.jg;
import a.ktt0;
import a.m5d;
import a.maz;
import a.n0o0;
import a.ngh;
import a.yg3;
import a.ymx;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class DsAccountSelection extends ConstraintLayout {
    public static final /* synthetic */ int z = 0;
    public final jg q;
    public final n0o0 r;
    public final n0o0 s;
    public final int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final ngh y;

    /* JADX WARN: Code duplicated, block: B:52:0x0178 A[PHI: r0
  0x0178: PHI (r0v3 int) = 
  (r0v2 int)
  (r0v7 int)
  (r0v8 int)
  (r0v9 int)
  (r0v10 int)
  (r0v11 int)
  (r0v12 int)
  (r0v13 int)
  (r0v14 int)
  (r0v15 int)
 binds: [B:7:0x0029, B:9:0x0034, B:11:0x003f, B:13:0x004a, B:15:0x0055, B:17:0x0060, B:19:0x006b, B:21:0x0076, B:23:0x0081, B:25:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public DsAccountSelection(Context context, AttributeSet attributeSet, int i) throws Throwable {
        Throwable th;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.accountSelectionStyle);
        LayoutInflater.from(context).inflate(R.layout.account_selection_layout, this);
        int i2 = R.id.accountAmount;
        TextView textView = (TextView) yum0.f(this, R.id.accountAmount);
        if (textView != null) {
            i2 = R.id.accountAndIconFlow;
            Flow flow = (Flow) yum0.f(this, R.id.accountAndIconFlow);
            if (flow != null) {
                i2 = R.id.accountInfoFlow;
                Flow flow2 = (Flow) yum0.f(this, R.id.accountInfoFlow);
                if (flow2 != null) {
                    i2 = R.id.accountMainFlow;
                    Flow flow3 = (Flow) yum0.f(this, R.id.accountMainFlow);
                    if (flow3 != null) {
                        i2 = R.id.accountSelectionTitle;
                        if (((LinearLayout) yum0.f(this, R.id.accountSelectionTitle)) != null) {
                            i2 = R.id.accountTitle;
                            TextView textView2 = (TextView) yum0.f(this, R.id.accountTitle);
                            if (textView2 != null) {
                                i2 = R.id.accountsButton;
                                ImageView imageView = (ImageView) yum0.f(this, R.id.accountsButton);
                                if (imageView != null) {
                                    i2 = R.id.iconLayout;
                                    FrameLayout frameLayout = (FrameLayout) yum0.f(this, R.id.iconLayout);
                                    if (frameLayout != null) {
                                        i2 = R.id.refreshMainIcon;
                                        ImageView imageView2 = (ImageView) yum0.f(this, R.id.refreshMainIcon);
                                        if (imageView2 != null) {
                                            i2 = R.id.refreshSmallIcon;
                                            ImageView imageView3 = (ImageView) yum0.f(this, R.id.refreshSmallIcon);
                                            if (imageView3 != null) {
                                                i2 = R.id.separator;
                                                th = null;
                                                View viewF = yum0.f(this, R.id.separator);
                                                if (viewF != null) {
                                                    i2 = R.id.topUpButton;
                                                    DsButton dsButton = (DsButton) yum0.f(this, R.id.topUpButton);
                                                    if (dsButton != null) {
                                                        this.q = new jg(this, textView, flow, flow2, flow3, textView2, imageView, frameLayout, imageView2, imageView3, viewF, dsButton);
                                                        this.r = maz.b(new yg3(context, (byte) 25));
                                                        this.s = maz.b(new yg3(context, (byte) 26));
                                                        this.t = R.style.DSButton_Small_Primary;
                                                        ngh nghVar = new ngh(this, context, (byte) 24);
                                                        this.y = nghVar;
                                                        setPadding(getResources().getDimensionPixelOffset(R.dimen.space_16), getResources().getDimensionPixelOffset(R.dimen.space_8), getResources().getDimensionPixelOffset(R.dimen.space_16), getPaddingBottom());
                                                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, bqd0.d, R.attr.accountSelectionStyle, 0);
                                                        nghVar.invoke(typedArrayObtainStyledAttributes);
                                                        typedArrayObtainStyledAttributes.recycle();
                                                        dsButton.setMaxWidth(getResources().getDimensionPixelSize(R.dimen.size_160));
                                                        int i3 = this.w;
                                                        byte b = 1;
                                                        dsButton.setMinimumWidth((i3 == 0 && this.v == 0) ? getResources().getDimensionPixelSize(R.dimen.size_80) : (i3 == 1 && this.v == 1) ? getResources().getDimensionPixelSize(R.dimen.size_80) : getResources().getDimensionPixelSize(R.dimen.size_56));
                                                        if (!isLaidOut() || isLayoutRequested()) {
                                                            addOnLayoutChangeListener(new ejl(this, b));
                                                            return;
                                                        }
                                                        int i4 = p() ? 8388613 : 8388611;
                                                        textView2.setGravity(i4);
                                                        textView.setGravity(i4);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                th = null;
                                            }
                                        } else {
                                            th = null;
                                        }
                                    } else {
                                        th = null;
                                    }
                                } else {
                                    th = null;
                                }
                            } else {
                                th = null;
                            }
                        } else {
                            th = null;
                        }
                    } else {
                        th = null;
                    }
                } else {
                    th = null;
                }
            } else {
                th = null;
            }
        } else {
            th = null;
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw th;
    }

    public static final Unit B(Function0 function0, DsAccountSelection dsAccountSelection, View view) {
        view.getClass();
        function0.invoke();
        Animation rotationAnimationRtl = dsAccountSelection.p() ? dsAccountSelection.getRotationAnimationRtl() : dsAccountSelection.getRotationAnimation();
        int i = dsAccountSelection.x;
        jg jgVar = dsAccountSelection.q;
        if (i == 0) {
            ((ImageView) jgVar.j).startAnimation(rotationAnimationRtl);
        } else {
            ((ImageView) jgVar.i).startAnimation(rotationAnimationRtl);
        }
        return Unit.f46060a;
    }

    private final Animation getRotationAnimation() {
        return (Animation) this.r.getValue();
    }

    private final Animation getRotationAnimationRtl() {
        return (Animation) this.s.getValue();
    }

    private final void setAccountTitleType(int i) {
        jg jgVar = this.q;
        TextView textView = jgVar.c;
        byte b = 0;
        textView.setVisibility(i != 0 ? 0 : 8);
        int i2 = R.attr.uikitStaticWhite;
        if (i == 1) {
            cem0.n(R.style.TextStyle_Caption_Regular_M, textView);
            if (this.u != 1) {
                i2 = R.attr.uikitSecondary;
            }
            Context context = getContext();
            context.getClass();
            textView.setTextColor(m5d.b(i2, context));
        } else if (i == 2) {
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new ejl(this, b));
            } else {
                ((Flow) jgVar.f).setVerticalGap(getResources().getDimensionPixelSize(R.dimen.space_2));
                ImageView imageView = (ImageView) jgVar.i;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.size_2));
                marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.size_12));
                imageView.setLayoutParams(marginLayoutParams);
                ImageView imageView2 = (ImageView) jgVar.j;
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                if (layoutParams2 == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.size_8));
                    imageView2.setLayoutParams(marginLayoutParams2);
                }
            }
            cem0.n(R.style.TextStyle_Caption_Medium_L, textView);
            if (this.u != 1) {
                i2 = R.attr.uikitPrimary;
            }
            Context context2 = getContext();
            context2.getClass();
            textView.setTextColor(m5d.b(i2, context2));
            Context context3 = textView.getContext();
            context3.getClass();
            Drawable drawable = context3.getDrawable(R.drawable.ic_glyph_chevron_down_small);
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            int dimensionPixelSize = context3.getResources().getDimensionPixelSize(R.dimen.size_12);
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            }
            if (drawableMutate != null) {
                drawableMutate.setTint(m5d.b(i2, context3));
            }
            int dimensionPixelSize2 = textView.getResources().getDimensionPixelSize(R.dimen.space_2);
            boolean z2 = by7.c().f3402a;
            Drawable drawable2 = z2 ? drawableMutate : null;
            if (z2) {
                drawableMutate = null;
            }
            textView.setCompoundDrawables(drawable2, null, drawableMutate, null);
            textView.setCompoundDrawablePadding(dimensionPixelSize2);
        }
        this.v = i;
    }

    private final void setAccountValueTextStyle(int i) {
        TextView textView = this.q.b;
        if (i == 1) {
            cem0.n(R.style.TextStyle_Headline_Medium, textView);
        } else {
            cem0.n(R.style.TextStyle_Text_Medium, textView);
        }
    }

    private final void setBackgroundType(int i) {
        jg jgVar = this.q;
        Flow flow = (Flow) jgVar.e;
        ImageView imageView = (ImageView) jgVar.i;
        flow.setBackground(null);
        ((ImageView) jgVar.j).setBackground(null);
        FrameLayout frameLayout = (FrameLayout) jgVar.k;
        frameLayout.setBackground(null);
        Flow flow2 = (Flow) jgVar.g;
        flow2.setBackground(null);
        ImageView imageView2 = (ImageView) jgVar.h;
        byte b = 0;
        imageView2.setVisibility(i == 2 ? 8 : 0);
        if (this.u == 1) {
            Context context = getContext();
            context.getClass();
            imageView2.setColorFilter(m5d.b(R.attr.uikitStaticWhite, context));
        }
        int i2 = R.attr.uikitBackground;
        int i3 = R.attr.uikitStaticBlack60;
        if (i == 0) {
            if (this.u == 1) {
                i2 = R.attr.uikitStaticBlack60;
            }
            w(flow, i2);
        } else if (i != 1) {
            flow.setBackground(null);
        } else {
            int i4 = this.u;
            if (i4 == 1) {
                i2 = R.attr.uikitStaticBlack60;
            }
            if (i4 != 1) {
                i3 = R.attr.uikitSecondaryButtonBackground;
            }
            w(frameLayout, i3);
            w(flow2, i2);
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new djl(jgVar, this, b));
            } else {
                flow.setHorizontalGap(getResources().getDimensionPixelOffset(R.dimen.space_8));
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int iMin = Math.min(frameLayout.getWidth(), frameLayout.getHeight());
                layoutParams.width = iMin;
                layoutParams.height = iMin;
                frameLayout.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                layoutParams2.getClass();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.gravity = 17;
                imageView.setLayoutParams(layoutParams3);
            }
        }
        this.w = i;
    }

    private final void setRemoveAccountDescriptionEndPadding(boolean z2) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new fjl(z2, this, (byte) 1));
            return;
        }
        int dimensionPixelOffset = z2 ? 0 : getResources().getDimensionPixelOffset(R.dimen.space_8);
        boolean zP = p();
        jg jgVar = this.q;
        if (zP) {
            ((Flow) jgVar.g).setPaddingLeft(dimensionPixelOffset);
        } else {
            ((Flow) jgVar.g).setPaddingRight(dimensionPixelOffset);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setRemoveAccountDescriptionStartPadding(boolean z2) {
        Object[] objArr = 0;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new fjl(z2, this, objArr == true ? 1 : 0));
            return;
        }
        int dimensionPixelOffset = z2 ? 0 : getResources().getDimensionPixelOffset(R.dimen.space_8);
        boolean zP = p();
        jg jgVar = this.q;
        if (zP) {
            ((Flow) jgVar.g).setPaddingRight(dimensionPixelOffset);
        } else {
            ((Flow) jgVar.g).setPaddingLeft(dimensionPixelOffset);
        }
    }

    private final void setSeparatorVisible(boolean z2) {
        this.q.l.setVisibility(z2 ? 0 : 8);
    }

    private final void setUpUpdateIcon(int i) {
        boolean zIsLaidOut = isLaidOut();
        jg jgVar = this.q;
        if (!zIsLaidOut || isLayoutRequested()) {
            addOnLayoutChangeListener(new hc3(i, jgVar, this));
            return;
        }
        boolean z2 = i == 0;
        ImageView imageView = (ImageView) jgVar.j;
        ImageView imageView2 = (ImageView) jgVar.i;
        imageView.setVisibility(z2 ? 0 : 8);
        if (i == 0) {
            int i2 = p() ? R.drawable.ic_glyph_wallet_alt_subtract_rtl : R.drawable.ic_glyph_wallet_alt_subtract;
            int i3 = p() ? R.drawable.ic_glyph_update_rtl : R.drawable.ic_glyph_update;
            imageView2.setImageResource(i2);
            imageView.setImageResource(i3);
        } else {
            imageView2.setImageResource(p() ? R.drawable.ic_glyph_reload_rtl : R.drawable.ic_glyph_reload);
        }
        if (this.u == 1) {
            Context context = getContext();
            context.getClass();
            imageView2.setColorFilter(m5d.b(R.attr.uikitStaticWhite, context));
            Context context2 = getContext();
            context2.getClass();
            imageView.setColorFilter(m5d.b(R.attr.uikitStaticWhite, context2));
        }
    }

    private final void setUpdateFivefoldIconStyle(int i) {
        int i2 = R.attr.uikitStaticWhite;
        jg jgVar = this.q;
        if (i == 0) {
            ((ImageView) jgVar.i).setImageResource(R.drawable.ic_glyph_reload);
            if (this.u == 1) {
                ((ImageView) jgVar.i).setColorFilter(R.attr.uikitStaticWhite);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        ((ImageView) jgVar.i).setImageResource(R.drawable.ic_glyph_reload);
        if (this.u != 1) {
            i2 = R.attr.uikitSecondaryButtonForeground;
        }
        ImageView imageView = (ImageView) jgVar.i;
        Context context = getContext();
        context.getClass();
        imageView.setColorFilter(m5d.b(i2, context));
    }

    private final void setUpdateIconType(int i) {
        setUpUpdateIcon(i);
        this.x = i;
    }

    public static final Unit u(DsAccountSelection dsAccountSelection, Context context, TypedArray typedArray) {
        typedArray.getClass();
        dsAccountSelection.u = typedArray.getInt(5, dsAccountSelection.u);
        dsAccountSelection.setAccountTitleType(typedArray.getInt(2, 0));
        dsAccountSelection.setBackgroundType(typedArray.getInt(4, 0));
        dsAccountSelection.setSeparatorVisible(typedArray.getBoolean(10, true));
        dsAccountSelection.setUpdateFivefoldIconStyle(typedArray.getInt(13, 0));
        jg jgVar = dsAccountSelection.q;
        ((DsButton) jgVar.m).d(typedArray.getResourceId(11, dsAccountSelection.t));
        dsAccountSelection.setAccountValueTextStyle(typedArray.getInt(3, 0));
        dsAccountSelection.setUpdateIconType(typedArray.getInt(14, 0));
        dsAccountSelection.setRemoveAccountDescriptionStartPadding(typedArray.getBoolean(9, false));
        dsAccountSelection.setRemoveAccountDescriptionEndPadding(typedArray.getBoolean(8, false));
        int dimensionPixelOffset = typedArray.getResources().getDimensionPixelOffset(R.dimen.space_8);
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(7, dimensionPixelOffset);
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(6, dimensionPixelOffset);
        ImageView imageView = (ImageView) jgVar.i;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = typedArray.getResources().getDimensionPixelSize(dsAccountSelection.x == 2 ? R.dimen.space_20 : R.dimen.space_24);
        marginLayoutParams.height = dimensionPixelSize;
        marginLayoutParams.width = dimensionPixelSize;
        marginLayoutParams.setMarginStart(dimensionPixelOffset2);
        marginLayoutParams.setMarginEnd(dimensionPixelOffset3);
        imageView.setLayoutParams(marginLayoutParams);
        String strP = ktt0.p(typedArray, context, 12);
        if (strP != null) {
            dsAccountSelection.setTopUpButtonTitle(strP);
        }
        String strP2 = ktt0.p(typedArray, context, 1);
        if (strP2 != null) {
            dsAccountSelection.setAccountTitle(strP2);
        }
        return Unit.f46060a;
    }

    public static void v(DsAccountSelection dsAccountSelection, Function0 function0, int i) {
        ymx ymxVar = ivb0.b;
        byte b = 0;
        byte b2 = 1;
        boolean z2 = (i & 2) == 0;
        ymxVar.getClass();
        jg jgVar = dsAccountSelection.q;
        if (z2) {
            dyb.b0((Flow) jgVar.g, ymxVar, new cjl(function0, b));
        } else {
            dyb.N((Flow) jgVar.g, ymxVar, new cjl(function0, b2));
        }
    }

    public static void w(View view, int i) {
        view.setBackgroundResource(R.drawable.rounded_background_10);
        Context context = view.getContext();
        context.getClass();
        view.setBackgroundTintList(ColorStateList.valueOf(m5d.b(i, context)));
    }

    public static void z(DsAccountSelection dsAccountSelection, Function0 function0) {
        dsAccountSelection.y(ivb0.b, false, function0);
    }

    public final void A(ymx ymxVar, Function0 function0) {
        ymxVar.getClass();
        dyb.N((FrameLayout) this.q.k, ymxVar, new ngh(function0, this, (byte) 25));
    }

    public final void setAccountTitle(CharSequence charSequence) {
        charSequence.getClass();
        this.q.c.setText(charSequence);
    }

    public final void setColorType(int i) {
        this.u = i;
    }

    public final void setStyle(int i) {
        Context context = getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.d);
        this.y.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setTopUpButtonTitle(CharSequence charSequence) {
        charSequence.getClass();
        ((DsButton) this.q.m).l(charSequence);
    }

    public final void x(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        String str = ((Object) charSequence) + Separators.SP + ((Object) charSequence2);
        jg jgVar = this.q;
        TextView textView = jgVar.b;
        TextView textView2 = jgVar.b;
        textView.setText(str);
        if (this.u == 1) {
            Context context = getContext();
            context.getClass();
            textView2.setTextColor(m5d.b(R.attr.uikitStaticWhite, context));
        }
        textView2.post(new b1(this, charSequence2, str, (byte) 14));
    }

    public final void y(ymx ymxVar, boolean z2, Function0 function0) {
        ymxVar.getClass();
        jg jgVar = this.q;
        if (z2) {
            dyb.b0((DsButton) jgVar.m, ymxVar, new cjl(function0, (byte) 2));
        } else {
            dyb.N((DsButton) jgVar.m, ymxVar, new cjl(function0, (byte) 3));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsAccountSelection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsAccountSelection(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
