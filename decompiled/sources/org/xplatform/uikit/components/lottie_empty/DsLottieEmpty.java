package org.xplatform.uikit.components.lottie_empty;

import a.a8z;
import a.bby;
import a.bqd0;
import a.c4m0;
import a.cjl;
import a.dnq;
import a.dpl;
import a.dyb;
import a.e3c;
import a.fkm;
import a.fnq;
import a.gkm;
import a.hkm;
import a.hne;
import a.hsj;
import a.ikm;
import a.jkm;
import a.jmu0;
import a.ktt0;
import a.m5d;
import a.maz;
import a.ndm;
import a.ntl;
import a.okm;
import a.q3d;
import a.rj;
import a.ryl;
import a.slb;
import a.t9f;
import a.vne;
import a.wez;
import a.wx4;
import a.yje;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class DsLottieEmpty extends ViewGroup {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47250a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final a8z g;
    public okm h;
    public ikm i;
    public String j;
    public int k;
    public boolean l;
    public hsj m;
    public final a8z n;
    public final a8z o;
    public final a8z p;
    public final a8z q;
    public final a8z r;
    public final a8z s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsLottieEmpty(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        context.getClass();
        ndm ndmVar = new ndm((byte) 14);
        wez wezVar = wez.b;
        this.f47250a = maz.a(wezVar, ndmVar);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.extra_large_horizontal_margin_dynamic);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_108);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_256);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_56);
        byte b = 5;
        this.g = maz.a(wezVar, new ntl(this, b));
        this.h = okm.d;
        this.i = ikm.f14933a;
        this.j = "";
        this.l = true;
        this.n = maz.a(wezVar, new ryl(context, (byte) 4));
        this.o = maz.a(wezVar, new ryl(context, b));
        this.p = maz.a(wezVar, new ryl(context, (byte) 6));
        this.q = maz.a(wezVar, new ryl(context, (byte) 7));
        this.r = maz.a(wezVar, new ryl(context, (byte) 8));
        this.s = maz.a(wezVar, new ryl(context, (byte) 9));
        dpl dplVar = new dpl((Object) this, (Object) context, (byte) 10);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.P, 0, 0);
        dplVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setTag("DSLottieEmptyTestTag");
    }

    public static final Unit c(DsLottieEmpty dsLottieEmpty, Context context, TypedArray typedArray) {
        typedArray.getClass();
        okm okmVar = okm.f25411a;
        dsLottieEmpty.setStyleType((okm) okm.f.get(typedArray.getInt(9, 0)));
        ikm ikmVar = ikm.f14933a;
        dsLottieEmpty.setColorType((ikm) ikm.d.get(typedArray.getInt(3, 0)));
        dsLottieEmpty.setTitleVisible(typedArray.getBoolean(8, true));
        dsLottieEmpty.setSubtitleVisible(typedArray.getBoolean(7, true));
        dsLottieEmpty.setCaptionVisible(typedArray.getBoolean(6, true));
        dsLottieEmpty.setButtonVisible(typedArray.getBoolean(5, true));
        Drawable drawable = typedArray.getDrawable(4);
        if (drawable != null) {
            dsLottieEmpty.getIconView().setImageDrawable(drawable);
        }
        String strP = ktt0.p(typedArray, context, 11);
        if (strP != null) {
            dsLottieEmpty.setTitleText(strP);
        }
        String strP2 = ktt0.p(typedArray, context, 10);
        if (strP2 != null) {
            dsLottieEmpty.setSubtitleText(strP2);
        }
        String strP3 = ktt0.p(typedArray, context, 2);
        if (strP3 != null) {
            dsLottieEmpty.setCaptionText(strP3);
        }
        String strP4 = ktt0.p(typedArray, context, 1);
        if (strP4 != null) {
            dsLottieEmpty.setButtonText(strP4);
        }
        if (dsLottieEmpty.h == okmVar) {
            dsLottieEmpty.setLottieAnimation(typedArray.getString(12));
        }
        dsLottieEmpty.l = typedArray.getBoolean(0, true);
        return Unit.f46060a;
    }

    public static final Unit f(Function0 function0, DsLottieEmpty dsLottieEmpty, long j, jkm jkmVar, DsButton dsButton) {
        function0.invoke();
        dsLottieEmpty.getCaptionView().animate().alpha(1.0f);
        byte b = 0;
        dsLottieEmpty.getCaptionView().setVisibility(0);
        bby countDownTimerJob = dsLottieEmpty.getCountDownTimerJob();
        byte b2 = 1;
        if (countDownTimerJob != null && countDownTimerJob.isActive()) {
            return Unit.f46060a;
        }
        yje yjeVar = null;
        dsLottieEmpty.m = new hsj(dsLottieEmpty, slb.U(new dnq(new fnq(new fnq(e3c.t(4, j), new gkm(dsButton, yjeVar, b2)), new hkm(dsLottieEmpty, yjeVar, b2), (byte) 4), new rj(dsButton, dsLottieEmpty, yjeVar, (byte) 20), b), dsLottieEmpty.getMainScope()), jkmVar);
        return Unit.f46060a;
    }

    private final DsButton getButton() {
        return (DsButton) this.r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView getCaptionView() {
        return (AppCompatTextView) this.s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bby getCountDownTimerJob() {
        hsj hsjVar = this.m;
        if (hsjVar != null) {
            return (c4m0) hsjVar.f13586a;
        }
        return null;
    }

    private final AppCompatImageView getIconView() {
        return (AppCompatImageView) this.o.getValue();
    }

    private final LottieAnimationView getLottieView() {
        return (LottieAnimationView) this.n.getValue();
    }

    private final int getLottieWidth() {
        return ((Number) this.g.getValue()).intValue();
    }

    private final vne getMainScope() {
        return (vne) this.f47250a.getValue();
    }

    private final AppCompatTextView getSubtitleView() {
        return (AppCompatTextView) this.q.getValue();
    }

    private final AppCompatTextView getTitleView() {
        return (AppCompatTextView) this.p.getValue();
    }

    private final void setLottieAnimation(String str) {
        if (str == null || !StringsKt.O(str, "lottie", false) || Intrinsics.d(this.j, str)) {
            return;
        }
        this.j = str;
        getLottieView().setAnimation(str);
        if (getLottieView().getVisibility() != 0 || getLottieView().h.i()) {
            return;
        }
        getLottieView().h();
    }

    public final void d(jkm jkmVar) {
        jkmVar.getClass();
        g(jkmVar, "");
        setButtonOnClickListener(jkmVar.g);
    }

    public final void e(jkm jkmVar, long j, Function0 function0) {
        jkmVar.getClass();
        hsj hsjVar = this.m;
        yje yjeVar = null;
        if (Intrinsics.d(hsjVar != null ? (jkm) hsjVar.b : null, jkmVar)) {
            return;
        }
        e3c.n(getCountDownTimerJob());
        DsButton button = getButton();
        String string = getContext().getString(R.string.update_again_after_v2, String.valueOf(j));
        string.getClass();
        g(jkmVar, string);
        byte b = 0;
        button.setEnabled(false);
        getCaptionView().animate().alpha(1.0f);
        getCaptionView().setVisibility(0);
        this.m = new hsj(this, slb.U(new dnq(new fnq(new fnq(e3c.t(4, j), new gkm(button, yjeVar, b)), new hkm(this, yjeVar, b), (byte) 4), new wx4(button, this, function0, null), b), getMainScope()), jkmVar);
        Function0 function1 = jkmVar.g;
        if (function1 != null) {
            setButtonOnClickListener(new fkm((byte) 0, j, function1, this, jkmVar, button));
        }
    }

    public final void g(jkm jkmVar, String str) {
        setStyleType(jkmVar.f16676a);
        setColorType(jkmVar.b);
        int iOrdinal = jkmVar.f16676a.ordinal();
        if (iOrdinal == 0) {
            setLottie(jkmVar.c);
        } else if (iOrdinal == 1) {
            setIcon(jkmVar.d);
        }
        String string = getContext().getString(R.string.empty_str);
        string.getClass();
        setTitleText(string);
        setTitleVisible(!StringsKt.W(string));
        String string2 = getContext().getString(jkmVar.e);
        string2.getClass();
        setSubtitleText(string2);
        setSubtitleVisible(!StringsKt.W(string2));
        String string3 = getContext().getString(R.string.empty_str);
        string3.getClass();
        if (str.length() > 0) {
            setCaptionText(str);
        } else {
            setCaptionText(string3);
        }
        setCaptionVisible(!StringsKt.W(string3));
        String string4 = getContext().getString(jkmVar.f);
        string4.getClass();
        setButtonText(string4);
        setButtonVisible(!StringsKt.W(string4));
    }

    public final AppCompatTextView getCaption() {
        return getCaptionView();
    }

    public final AppCompatTextView getSubtitle() {
        return getSubtitleView();
    }

    public final void h(int i, int i2) {
        if (i2 > 0) {
            setMeasuredDimension(i, i2);
        } else {
            setMeasuredDimension(i, (this.d * 2) + this.k);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        e3c.n(getCountDownTimerJob());
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0155  */
    /* JADX WARN: Code duplicated, block: B:37:0x015f  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredHeight;
        int visibility;
        int i6;
        int i7;
        int paddingStart = ((i3 - i) - getPaddingStart()) - getPaddingEnd();
        int iMax = Math.max(getPaddingTop(), this.l ? ((i4 - i2) - this.k) / 2 : 0);
        okm okmVar = this.h;
        okm okmVar2 = okm.f25411a;
        int i8 = this.d;
        if (okmVar != okmVar2 || getLottieView().getVisibility() != 0) {
            if (this.h == okm.b && getIconView().getVisibility() == 0) {
                i5 = iMax + i8;
                int measuredWidth = getIconView().getMeasuredWidth();
                measuredHeight = getIconView().getMeasuredHeight();
                int iD = hne.d(paddingStart, measuredWidth, 2, getPaddingStart());
                getIconView().layout(iD, i5, measuredWidth + iD, i5 + measuredHeight);
            }
            visibility = getTitleView().getVisibility();
            i6 = this.e;
            if (visibility == 0) {
                int i9 = iMax + i8;
                int measuredWidth2 = getTitleView().getMeasuredWidth();
                int measuredHeight2 = getTitleView().getMeasuredHeight();
                int iD2 = hne.d(paddingStart, measuredWidth2, 2, getPaddingStart());
                getTitleView().layout(iD2, i9, measuredWidth2 + iD2, i9 + measuredHeight2);
                if (getSubtitleView().getVisibility() == 0) {
                    i7 = i6;
                } else {
                    i7 = i8;
                }
                iMax = i9 + measuredHeight2 + i7;
            }
            if (getSubtitleView().getVisibility() == 0) {
                if (getTitleView().getVisibility() != 0) {
                    i6 = i8;
                }
                int i10 = iMax + i6;
                int measuredWidth3 = getSubtitleView().getMeasuredWidth();
                int measuredHeight3 = getSubtitleView().getMeasuredHeight();
                int iD3 = hne.d(paddingStart, measuredWidth3, 2, getPaddingStart());
                getSubtitleView().layout(iD3, i10, measuredWidth3 + iD3, i10 + measuredHeight3);
                iMax = i10 + measuredHeight3 + i8;
            }
            if (getButton().getVisibility() == 0) {
                if (getCaptionView().getVisibility() == 0) {
                    int i11 = iMax + i8;
                    int measuredWidth4 = getCaptionView().getMeasuredWidth();
                    int measuredHeight4 = getCaptionView().getMeasuredHeight();
                    int iD4 = hne.d(paddingStart, measuredWidth4, 2, getPaddingStart());
                    getCaptionView().layout(iD4, i11, measuredWidth4 + iD4, measuredHeight4 + i11);
                    return;
                }
                return;
            }
            int i12 = iMax + i8;
            int measuredWidth5 = getButton().getMeasuredWidth();
            int measuredHeight5 = getButton().getMeasuredHeight();
            int iD5 = hne.d(paddingStart, measuredWidth5, 2, getPaddingStart());
            getButton().layout(iD5, i12, measuredWidth5 + iD5, i12 + measuredHeight5);
            int i13 = measuredHeight5 + i8 + i12;
            int measuredWidth6 = getCaptionView().getMeasuredWidth();
            int measuredHeight6 = getCaptionView().getMeasuredHeight();
            int iD6 = hne.d(paddingStart, measuredWidth6, 2, getPaddingStart());
            getCaptionView().layout(iD6, i13, measuredWidth6 + iD6, measuredHeight6 + i13);
        }
        i5 = iMax + i8;
        int measuredWidth7 = getLottieView().getMeasuredWidth();
        measuredHeight = getLottieView().getMeasuredHeight();
        int iD7 = hne.d(paddingStart, measuredWidth7, 2, getPaddingStart());
        getLottieView().layout(iD7, i5, measuredWidth7 + iD7, i5 + measuredHeight);
        iMax = i5 + measuredHeight + i8;
        visibility = getTitleView().getVisibility();
        i6 = this.e;
        if (visibility == 0) {
            int i14 = iMax + i8;
            int measuredWidth8 = getTitleView().getMeasuredWidth();
            int measuredHeight7 = getTitleView().getMeasuredHeight();
            int iD8 = hne.d(paddingStart, measuredWidth8, 2, getPaddingStart());
            getTitleView().layout(iD8, i14, measuredWidth8 + iD8, i14 + measuredHeight7);
            if (getSubtitleView().getVisibility() == 0) {
                i7 = i6;
            } else {
                i7 = i8;
            }
            iMax = i14 + measuredHeight7 + i7;
        }
        if (getSubtitleView().getVisibility() == 0) {
            if (getTitleView().getVisibility() != 0) {
                i6 = i8;
            }
            int i15 = iMax + i6;
            int measuredWidth9 = getSubtitleView().getMeasuredWidth();
            int measuredHeight8 = getSubtitleView().getMeasuredHeight();
            int iD9 = hne.d(paddingStart, measuredWidth9, 2, getPaddingStart());
            getSubtitleView().layout(iD9, i15, measuredWidth9 + iD9, i15 + measuredHeight8);
            iMax = i15 + measuredHeight8 + i8;
        }
        if (getButton().getVisibility() == 0) {
            if (getCaptionView().getVisibility() == 0) {
                int i16 = iMax + i8;
                int measuredWidth10 = getCaptionView().getMeasuredWidth();
                int measuredHeight9 = getCaptionView().getMeasuredHeight();
                int iD10 = hne.d(paddingStart, measuredWidth10, 2, getPaddingStart());
                getCaptionView().layout(iD10, i16, measuredWidth10 + iD10, measuredHeight9 + i16);
                return;
            }
            return;
        }
        int i17 = iMax + i8;
        int measuredWidth11 = getButton().getMeasuredWidth();
        int measuredHeight10 = getButton().getMeasuredHeight();
        int iD11 = hne.d(paddingStart, measuredWidth11, 2, getPaddingStart());
        getButton().layout(iD11, i17, measuredWidth11 + iD11, i17 + measuredHeight10);
        int i18 = measuredHeight10 + i8 + i17;
        int measuredWidth12 = getCaptionView().getMeasuredWidth();
        int measuredHeight11 = getCaptionView().getMeasuredHeight();
        int iD12 = hne.d(paddingStart, measuredWidth12, 2, getPaddingStart());
        getCaptionView().layout(iD12, i18, measuredWidth12 + iD12, measuredHeight11 + i18);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.h == okm.d) {
            h(size, size2);
            return;
        }
        List listJ = q3d.j(getTitleView(), getSubtitleView(), getButton());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((View) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListR0 = CollectionsKt.r0(arrayList, getCaptionView());
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        Iterator it = arrayListR0.iterator();
        while (it.hasNext()) {
            ((View) it.next()).measure(View.MeasureSpec.makeMeasureSpec(paddingStart, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int visibility = getTitleView().getVisibility();
        int i3 = this.e;
        int i4 = this.d;
        int measuredHeight = visibility == 0 ? getTitleView().getMeasuredHeight() + i4 + (getSubtitleView().getVisibility() == 0 ? i3 : i4) : 0;
        if (getSubtitleView().getVisibility() == 0) {
            if (getTitleView().getVisibility() != 0) {
                i3 = i4;
            }
            measuredHeight = getSubtitleView().getMeasuredHeight() + i3 + measuredHeight + i4;
        }
        if (getButton().getVisibility() == 0) {
            measuredHeight = getCaptionView().getMeasuredHeight() + i4 + getButton().getMeasuredHeight() + i4 + i4 + measuredHeight;
        } else if (getCaptionView().getVisibility() == 0) {
            measuredHeight += getCaptionView().getMeasuredHeight() + i4 + i4;
        }
        this.k = measuredHeight;
        if (this.h == okm.c) {
            h(size, size2);
            return;
        }
        int paddingTop = (((size2 > 0 ? size2 : Integer.MAX_VALUE) - measuredHeight) - getPaddingTop()) - getPaddingBottom();
        int iOrdinal = this.h.ordinal();
        if (iOrdinal == 0) {
            int i5 = i4 * 2;
            int i6 = paddingTop - i5;
            z = i6 >= this.b;
            getLottieView().setVisibility(z ? 0 : 8);
            if (z) {
                int iIntValue = ((Number) CollectionsKt.l0(q3d.j(Integer.valueOf(this.c), Integer.valueOf(i6), Integer.valueOf(getLottieWidth())))).intValue();
                LottieAnimationView lottieView = getLottieView();
                int lottieWidth = getLottieWidth();
                AtomicLong atomicLong = jmu0.f16783a;
                lottieView.getClass();
                lottieView.measure(View.MeasureSpec.makeMeasureSpec(lottieWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824));
                this.k = getLottieView().getMeasuredHeight() + i5 + this.k;
            }
        } else if (iOrdinal == 1) {
            int i7 = i4 * 2;
            int i8 = paddingTop - i7;
            int i9 = this.f;
            z = i8 >= i9;
            getIconView().setVisibility(z ? 0 : 8);
            if (z) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                getIconView().measure(iMakeMeasureSpec, iMakeMeasureSpec);
                this.k = i7 + i9 + this.k;
            }
        }
        h(size, size2);
    }

    public final void setButtonOnClickListener(Function0<Unit> function0) {
        if (function0 != null) {
            dyb.O(getButton(), new cjl(function0, (byte) 15));
        } else {
            getButton().setOnClickListener(null);
        }
    }

    public final void setButtonText(int i) {
        String string = getContext().getString(i);
        string.getClass();
        setButtonText(string);
    }

    public final void setButtonVisible(boolean z) {
        getButton().setVisibility(z ? 0 : 8);
    }

    public final void setCaptionText(CharSequence charSequence) {
        getCaptionView().setText(charSequence);
    }

    public final void setCaptionVisible(boolean z) {
        getCaptionView().setVisibility(z ? 0 : 8);
    }

    public final void setCenterInParent(boolean z) {
        this.l = z;
        requestLayout();
    }

    public final void setColorType(ikm ikmVar) {
        ikmVar.getClass();
        if (this.i == ikmVar) {
            return;
        }
        this.i = ikmVar;
        int iOrdinal = ikmVar.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            getIconView().setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary60, context)));
            Context context2 = getContext();
            context2.getClass();
            getTitleView().setTextColor(m5d.b(R.attr.uikitTextPrimary, context2));
            Context context3 = getContext();
            context3.getClass();
            int iB = m5d.b(R.attr.uikitSecondary, context3);
            getSubtitleView().setTextColor(iB);
            getCaptionView().setTextColor(iB);
            getButton().d(R.style.DSButton_Large_Primary);
            return;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return;
        }
        Context context4 = getContext();
        context4.getClass();
        TypedValue typedValue = m5d.f21214a;
        getIconView().setImageTintList(ColorStateList.valueOf(context4.getColor(R.color.static_white_60)));
        Context context5 = getContext();
        context5.getClass();
        getTitleView().setTextColor(context5.getColor(R.color.static_white));
        Context context6 = getContext();
        context6.getClass();
        int color = context6.getColor(R.color.static_white_80);
        getSubtitleView().setTextColor(color);
        getCaptionView().setTextColor(color);
        getButton().d(R.style.DSButton_Large_WarningStatic);
    }

    public final void setIcon(int i) {
        getIconView().setImageResource(i);
    }

    public final void setLottie(int i) {
        setLottieAnimation(getResources().getString(i));
    }

    public final void setStyleType(okm okmVar) {
        okmVar.getClass();
        if (this.h == okmVar) {
            return;
        }
        removeAllViewsInLayout();
        this.h = okmVar;
        int iOrdinal = okmVar.ordinal();
        if (iOrdinal == 0) {
            addView(getLottieView());
            addView(getTitleView());
            addView(getSubtitleView());
            addView(getButton());
            addView(getCaptionView());
            return;
        }
        if (iOrdinal == 1) {
            addView(getIconView());
            addView(getTitleView());
            addView(getSubtitleView());
            addView(getButton());
            addView(getCaptionView());
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        addView(getTitleView());
        addView(getSubtitleView());
        addView(getButton());
        addView(getCaptionView());
    }

    public final void setSubtitleText(CharSequence charSequence) {
        getSubtitleView().setText(charSequence);
    }

    public final void setSubtitleVisible(boolean z) {
        getSubtitleView().setVisibility(z ? 0 : 8);
    }

    public final void setTitleText(CharSequence charSequence) {
        getTitleView().setText(charSequence);
    }

    public final void setTitleVisible(boolean z) {
        getTitleView().setVisibility(z ? 0 : 8);
    }

    public final void setCaptionText(int i) {
        getCaptionView().setText(i);
    }

    public final void setIcon(Drawable drawable) {
        getIconView().setImageDrawable(drawable);
    }

    public final void setSubtitleText(int i) {
        getSubtitleView().setText(i);
    }

    public final void setTitleText(int i) {
        getTitleView().setText(i);
    }

    public final void setLottie(String str) {
        str.getClass();
        setLottieAnimation(str);
    }

    public final void setButtonText(CharSequence charSequence) {
        charSequence.getClass();
        getButton().l(charSequence);
    }

    public final void setButtonOnClickListener(View.OnClickListener onClickListener) {
        DsButton button = getButton();
        if (onClickListener != null) {
            dyb.O(button, new dpl((Object) onClickListener, (Object) button, (byte) 11));
        } else {
            button.setOnClickListener(null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsLottieEmpty(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsLottieEmpty(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ DsLottieEmpty(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
