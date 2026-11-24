package org.xplatform.uikit_sport.sport_cell.middle;

import a.a8z;
import a.cem0;
import a.cqd0;
import a.g2l0;
import a.hny;
import a.hrf0;
import a.huh0;
import a.ktt0;
import a.maz;
import a.o0k0;
import a.t9f;
import a.wez;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class SportCellMiddleView extends LinearLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47298a;
    public int b;
    public int c;
    public final int d;
    public final int e;
    public final a8z f;
    public final a8z g;
    public final huh0 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public SportCellMiddleView(Context context, AttributeSet attributeSet, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.sportCellMiddleStyle);
        this.b = R.style.TextStyle_Text_Regular_TextPrimary;
        this.c = -1;
        this.d = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_6);
        hrf0 hrf0Var = new hrf0(context, (byte) 4);
        wez wezVar = wez.b;
        this.f = maz.a(wezVar, hrf0Var);
        this.g = maz.a(wezVar, new o0k0((Object) context, (Object) this, (byte) 8));
        huh0 huh0Var = new huh0(this, context, (byte) 27);
        this.h = huh0Var;
        addView(getTitleTextView());
        addView(getSubtitleTextView());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.f, R.attr.sportCellMiddleStyle, 0);
        huh0Var.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final Unit a(SportCellMiddleView sportCellMiddleView, Context context, TypedArray typedArray) {
        String string;
        String string2;
        typedArray.getClass();
        sportCellMiddleView.setTitleTextStyle(typedArray.getResourceId(4, sportCellMiddleView.b));
        sportCellMiddleView.setTitleMaxLines(typedArray.getInteger(2, sportCellMiddleView.c));
        String strP = ktt0.p(typedArray, context, 3);
        if ((strP == null || (string = strP.toString()) == null) && (string = typedArray.getString(3)) == null) {
            string = sportCellMiddleView.getTitleTextView().getText().toString();
        }
        sportCellMiddleView.setTitleText(string);
        sportCellMiddleView.f47298a = typedArray.getBoolean(0, sportCellMiddleView.f47298a);
        String strP2 = ktt0.p(typedArray, context, 1);
        if ((strP2 == null || (string2 = strP2.toString()) == null) && (string2 = typedArray.getString(1)) == null) {
            string2 = sportCellMiddleView.getSubtitleTextView().getText().toString();
        }
        sportCellMiddleView.setSubtitleText(string2);
        return Unit.f46060a;
    }

    private final AppCompatTextView getSubtitleTextView() {
        return (AppCompatTextView) this.g.getValue();
    }

    private final AppCompatTextView getTitleTextView() {
        return (AppCompatTextView) this.f.getValue();
    }

    private final void setTitleMaxLines(int i2) {
        this.c = i2;
        getTitleTextView().setMaxLines(i2);
    }

    private final void setTitleTextStyle(int i2) {
        this.b = i2;
        cem0.n(i2, getTitleTextView());
    }

    public final CharSequence getSubtitleText() {
        return getSubtitleTextView().getText();
    }

    public final AppCompatTextView getTitle() {
        return getTitleTextView();
    }

    public final CharSequence getTitleText() {
        return getTitleTextView().getText();
    }

    public final void setStyle(g2l0 g2l0Var) {
        int i2;
        g2l0Var.getClass();
        switch (g2l0Var.ordinal()) {
            case 0:
                i2 = R.style.Widget_SportCell_SportCellMiddle_Static_S;
                break;
            case 1:
                i2 = R.style.Widget_SportCell_SportCellMiddle_Static_M;
                break;
            case 2:
                i2 = R.style.Widget_SportCell_SportCellMiddle_Static_L;
                break;
            case 3:
                i2 = R.style.Widget_SportCell_SportCellMiddle_Static_XL;
                break;
            case 4:
                i2 = R.style.Widget_SportCell_SportCellMiddle_Dynamic_S;
                break;
            case 5:
                i2 = R.style.Widget_SportCell_SportCellMiddle_Dynamic_M;
                break;
            case 6:
                i2 = R.style.Widget_SportCell_SportCellMiddle_Dynamic_L;
                break;
            default:
                t9f.b();
        }
        Context context = getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, cqd0.f);
        this.h.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        int iOrdinal = g2l0Var.ordinal();
        int i3 = this.e;
        switch (iOrdinal) {
            case 0:
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
                setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                } else {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.height = getResources().getDimensionPixelSize(R.dimen.size_40);
                    setLayoutParams(layoutParams2);
                }
                break;
            case 1:
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
                setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                if (layoutParams3 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                } else {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.height = getResources().getDimensionPixelSize(R.dimen.size_48);
                    setLayoutParams(layoutParams4);
                }
                break;
            case 2:
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
                setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
                if (layoutParams5 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                } else {
                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                    layoutParams6.height = getResources().getDimensionPixelSize(R.dimen.size_64);
                    setLayoutParams(layoutParams6);
                }
                break;
            case 3:
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
                setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams7 = getLayoutParams();
                if (layoutParams7 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                } else {
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                    layoutParams8.height = getResources().getDimensionPixelSize(R.dimen.size_66);
                    setLayoutParams(layoutParams8);
                }
                break;
            case 4:
                setPadding(getPaddingLeft(), i3, getPaddingRight(), i3);
                setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.size_40));
                ViewGroup.LayoutParams layoutParams9 = getLayoutParams();
                if (layoutParams9 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                } else {
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
                    layoutParams10.height = -2;
                    setLayoutParams(layoutParams10);
                }
                break;
            case 5:
                setPadding(getPaddingLeft(), i3, getPaddingRight(), i3);
                setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.size_48));
                ViewGroup.LayoutParams layoutParams11 = getLayoutParams();
                if (layoutParams11 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                } else {
                    FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
                    layoutParams12.height = -2;
                    setLayoutParams(layoutParams12);
                }
                break;
            case 6:
                setPadding(getPaddingLeft(), i3, getPaddingRight(), i3);
                setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.size_64));
                ViewGroup.LayoutParams layoutParams13 = getLayoutParams();
                if (layoutParams13 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                } else {
                    FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) layoutParams13;
                    layoutParams14.height = -2;
                    setLayoutParams(layoutParams14);
                }
                break;
            default:
                t9f.b();
                break;
        }
    }

    public final void setSubtitleText(String str) {
        str.getClass();
        getSubtitleTextView().setText(str);
        getSubtitleTextView().setVisibility(this.f47298a && !StringsKt.W(str) ? 0 : 8);
    }

    public final void setTitleText(String str) {
        str.getClass();
        getTitleTextView().setText(str);
    }

    public final void setTitleText(int i2) {
        getTitleTextView().setText(i2);
    }

    public final void setSubtitleText(int i2) {
        getSubtitleTextView().setText(i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCellMiddleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCellMiddleView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
