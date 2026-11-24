package org.xplatform.uikit.components.navigation_bar;

import a.acg0;
import a.bcg0;
import a.bqd0;
import a.dfd0;
import a.dpl;
import a.e1i;
import a.hc50;
import a.i8m0;
import a.if5;
import a.j6g0;
import a.jmu0;
import a.jt6;
import a.k0l;
import a.ktt0;
import a.m5d;
import a.mc50;
import a.mjf0;
import a.ndm;
import a.np30;
import a.ntl;
import a.oiz;
import a.q4n0;
import a.r0m;
import a.ssq0;
import a.t9f;
import a.tx3;
import a.unl;
import a.vf5;
import a.wc50;
import a.wf40;
import a.ynk;
import a.yrb0;
import a.zbg0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes6.dex */
public final class DsNavigationBar extends FrameLayout implements mc50 {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47254a;
    public final oiz b;
    public final bcg0 c;
    public final wf40 d;
    public final View e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public Function0 k;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsNavigationBar(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.toolBarStyle);
        wc50 wc50Var = wc50.f38910a;
        oiz oizVar = new oiz(context);
        oizVar.setId(jmu0.d());
        this.b = oizVar;
        bcg0 bcg0Var = new bcg0(context);
        bcg0Var.setId(jmu0.d());
        this.c = bcg0Var;
        wf40 wf40Var = new wf40(context);
        wf40Var.setId(R.id.dsNavigationBarMiddleContainer);
        wf40Var.setOnSearchViewExpandedStateChangedListener(new k0l(1, this, DsNavigationBar.class, "onSearchViewExpandedStateChanged", "onSearchViewExpandedStateChanged(Z)V", 0, (byte) 21));
        this.d = wf40Var;
        View view = new View(context);
        view.setId(jmu0.d());
        this.e = view;
        this.f = getResources().getDimensionPixelSize(R.dimen.size_1);
        this.g = getResources().getDimensionPixelSize(R.dimen.size_56);
        this.h = getResources().getDimensionPixelSize(R.dimen.size_48);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.k = new ndm((byte) 17);
        setTag("DsNavigationBar");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, bqd0.i, 0, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i2 != 0) {
            if (i2 == 1) {
                wc50Var = wc50.b;
            } else if (i2 == 2) {
                wc50Var = wc50.c;
            }
        }
        setNavigationBarButtonsColorStateList(ktt0.m(5, context, typedArrayObtainStyledAttributes));
        wf40Var.setNavigationBarStyle(wc50Var);
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 11);
        setTitle(strP == null ? "" : strP);
        setTitleColor(typedArrayObtainStyledAttributes.getColor(12, m5d.b(R.attr.uikitSecondary, context)));
        setSeparatorColor(typedArrayObtainStyledAttributes.getColor(6, m5d.b(R.attr.uikitSeparator60, context)));
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 0);
        if (numL != null) {
            setNavigationBarBackground(numL.intValue());
        }
        setTitleIconVisible(typedArrayObtainStyledAttributes.getBoolean(8, false));
        CharSequence charSequenceP = ktt0.p(typedArrayObtainStyledAttributes, context, 9);
        setSubTitle(charSequenceP != null ? charSequenceP : "");
        view.setVisibility(typedArrayObtainStyledAttributes.getBoolean(7, false) ? 0 : 8);
        ColorStateList colorStateListM = ktt0.m(5, context, typedArrayObtainStyledAttributes);
        if (colorStateListM == null) {
            colorStateListM = ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context));
            colorStateListM.getClass();
        }
        setBackIconColor(colorStateListM);
        setTitleChevronColor(typedArrayObtainStyledAttributes.getColor(1, m5d.b(R.attr.uikitSecondary, context)));
        typedArrayObtainStyledAttributes.recycle();
        addView(oizVar);
        addView(bcg0Var);
        addView(wf40Var);
        addView(view);
    }

    public final e1i b(String str) {
        Object next;
        bcg0 bcg0Var = this.c;
        bcg0Var.getClass();
        acg0 acg0Var = bcg0Var.d;
        acg0Var.getClass();
        Iterator it = acg0Var.e.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((e1i) next).getButtonIconId(), str)) {
                return (e1i) next;
            }
        }
        next = null;
        return (e1i) next;
    }

    public final void c(String str) {
        Object next;
        bcg0 bcg0Var = this.c;
        bcg0Var.getClass();
        acg0 acg0Var = bcg0Var.d;
        acg0Var.getClass();
        Iterator it = acg0Var.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((e1i) next).getButtonIconId(), str));
        e1i e1iVar = (e1i) next;
        if (e1iVar != null) {
            e1iVar.setVisibility(8);
        }
    }

    public final void d() {
        Iterator it = this.c.d.e.iterator();
        while (it.hasNext()) {
            ((e1i) it.next()).setVisibility(8);
        }
    }

    public final void e(Function1 function1) {
        ynk ynkVar = new ynk(function1, (byte) 27);
        wf40 wf40Var = this.d;
        wf40Var.getClass();
        DsSearchField dsSearchField = wf40Var.k;
        dsSearchField.getEditText().setImeOptions(3);
        TextInputEditText editText = dsSearchField.getEditText();
        np30 np30Var = new np30(wf40Var, (byte) 6);
        editText.getClass();
        editText.setOnEditorActionListener(new dfd0(np30Var, (byte) 3));
        dsSearchField.getEditText().addTextChangedListener(new jt6(ynkVar, (byte) 10));
    }

    public final void f(boolean z) {
        bcg0 bcg0Var = this.c;
        if (!z) {
            bcg0Var.a();
            return;
        }
        acg0 acg0Var = bcg0Var.d;
        ArrayList arrayList = acg0Var.e;
        if (arrayList.contains(acg0Var.h)) {
            arrayList.remove(acg0Var.h);
            acg0Var.f.remove(acg0Var.g);
            acg0Var.removeView(acg0Var.h);
            acg0Var.c = true;
            acg0Var.requestLayout();
        }
    }

    public final void g(String str) {
        Object next;
        bcg0 bcg0Var = this.c;
        bcg0Var.getClass();
        acg0 acg0Var = bcg0Var.d;
        acg0Var.getClass();
        Iterator it = acg0Var.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((e1i) next).getButtonIconId(), str));
        e1i e1iVar = (e1i) next;
        if (e1iVar != null) {
            e1iVar.setVisibility(0);
        }
    }

    public final boolean getForceExitEnable() {
        return this.f47254a;
    }

    public final int getLeftContainerWidth$uikit() {
        return this.b.getMeasuredWidth();
    }

    public final int getNavigationBarWidth$uikit() {
        return getMeasuredWidth();
    }

    public final int getRightContainerActualWidth() {
        return this.c.getButtonsActualWidth();
    }

    public final int getRightContainerWidth$uikit() {
        return this.c.getMeasuredWidth();
    }

    public CharSequence getSubTitle() {
        return this.d.getSubTitle();
    }

    public CharSequence getTitle() {
        return this.d.getTitle();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        oiz oizVar = this.b;
        int measuredWidth = oizVar.getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() / 2) - (oizVar.getMeasuredHeight() / 2);
        jmu0.f(0, measuredHeight, measuredWidth, measuredHeight + measuredWidth, this.b, this);
        bcg0 bcg0Var = this.c;
        int buttonsActualWidth = bcg0Var.getSearchFieldOpenedState() ? bcg0Var.getButtonsActualWidth() : bcg0Var.getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth() - buttonsActualWidth;
        int i7 = measuredWidth2 + buttonsActualWidth;
        int measuredHeight2 = getMeasuredHeight() / 2;
        int i8 = this.h;
        int i9 = measuredHeight2 - (i8 / 2);
        jmu0.f(measuredWidth2, i9, i7, i8 + i9, this.c, this);
        boolean z2 = getLayoutDirection() == 1;
        int right = z2 ? bcg0Var.getRight() : oizVar.getRight();
        int left = z2 ? oizVar.getLeft() : bcg0Var.getLeft();
        wf40 wf40Var = this.d;
        int measuredWidth3 = wf40Var.getMeasuredWidth();
        int measuredHeight3 = wf40Var.getMeasuredHeight();
        int i10 = (((left - right) - measuredWidth3) / 2) + right;
        int measuredHeight4 = (getMeasuredHeight() - measuredHeight3) / 2;
        wf40Var.layout(i10, measuredHeight4, measuredWidth3 + i10, measuredHeight3 + measuredHeight4);
        jmu0.f(0, i6, i5, i6 - this.f, this.e, this);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        Object next;
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.i;
        int i4 = this.g;
        int i5 = i4 - i3;
        oiz oizVar = this.b;
        if (oizVar.getVisibility() == 0) {
            oizVar.measure(View.MeasureSpec.makeMeasureSpec(oizVar.b != null ? oizVar.getMeasuredWidth() : i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (oizVar.getMeasuredWidth() + this.j), Integer.MIN_VALUE);
        int i6 = this.h;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        bcg0 bcg0Var = this.c;
        bcg0Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth2 = oizVar.getMeasuredWidth();
        if (bcg0Var.c != null) {
            measuredWidth = bcg0Var.getMeasuredWidth();
        } else if (bcg0Var.getButtonsActualWidth() > 0) {
            acg0 acg0Var = bcg0Var.d;
            List<e1i> visibleButtons = acg0Var.getVisibleButtons();
            if (visibleButtons.size() == 1) {
                e1i e1iVar = (e1i) CollectionsKt.U(visibleButtons);
                Iterator it = acg0Var.f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(((hc50) next).f12804a, e1iVar.getButtonIconId()));
                hc50 hc50Var = (hc50) next;
                if (hc50Var != null && hc50Var.k) {
                    if (bcg0Var.getSearchFieldOpenedState()) {
                        measuredWidth = 0;
                    } else {
                        measuredWidth = i6;
                    }
                }
            }
            measuredWidth = bcg0Var.getMeasuredWidth();
        } else if (bcg0Var.getSearchFieldOpenedState()) {
            measuredWidth = 0;
        } else {
            measuredWidth = i6;
        }
        this.d.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - measuredWidth2) - measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
        setMeasuredDimension(size, View.resolveSize(i4, i2));
    }

    public final void setBackIconAlpha(float f) {
        this.b.setBackIconAlpha(f);
    }

    public void setBackIconColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.b.setBackIconTint(colorStateList);
    }

    public final void setCursorOnSearchFiledVisible(boolean z) {
        this.d.setCursorOnSearchFiledVisible(z);
    }

    public final void setForceExitEnable(boolean z) {
        this.f47254a = z;
    }

    public void setNavigationBarBackground(int i) {
        setBackgroundColor(i);
    }

    public void setNavigationBarButtons(ArrayList<hc50> arrayList) {
        ntl ntlVar;
        arrayList.getClass();
        arrayList.size();
        ntl ntlVar2 = new ntl(this, (byte) 6);
        j6g0 j6g0Var = new j6g0((byte) 9);
        bcg0 bcg0Var = this.c;
        bcg0Var.getClass();
        arrayList.size();
        acg0 acg0Var = bcg0Var.d;
        acg0Var.getClass();
        acg0Var.removeAllViews();
        List<hc50> listA0 = CollectionsKt.A0(arrayList, new mjf0((byte) 1));
        ArrayList arrayList2 = acg0Var.f;
        arrayList2.clear();
        arrayList2.addAll(listA0);
        ArrayList arrayList3 = acg0Var.e;
        arrayList3.clear();
        for (hc50 hc50Var : listA0) {
            Context context = acg0Var.getContext();
            context.getClass();
            e1i e1iVar = new e1i(context);
            e1iVar.setButtonIconId(hc50Var.f12804a);
            e1iVar.setNavigationBarButtonStyle(hc50Var.b);
            e1iVar.setNavigationBarButtonImageResource(hc50Var.c);
            e1iVar.setNavigationBarButtonAlpha(hc50Var.f);
            i8m0 i8m0Var = hc50Var.j;
            int i = e1iVar.f;
            int i2 = e1iVar.g;
            if5 if5Var = e1iVar.k;
            if (i8m0Var != null) {
                if5Var.d(i8m0Var, i2, i);
            }
            vf5 vf5Var = hc50Var.g;
            if (vf5Var != null) {
                Set setL0 = tx3.l0(new vf5[]{vf5.i, vf5.h});
                ntlVar = ntlVar2;
                Set setL1 = tx3.l0(new vf5[]{vf5.e, vf5.f, vf5.g, vf5.j, vf5.k});
                if (CollectionsKt.L(setL0, vf5Var)) {
                    if5Var.c(vf5Var, e1iVar.h, i);
                } else if (CollectionsKt.L(setL1, vf5Var)) {
                    if5Var.c(vf5Var, i2, i);
                    int i3 = e1iVar.i;
                    if5Var.g = Integer.valueOf(i3);
                    DsBadge dsBadge = if5Var.c;
                    if (dsBadge != null) {
                        dsBadge.d.e(i3);
                    }
                } else {
                    if5Var.a(vf5Var);
                }
            } else {
                ntlVar = ntlVar2;
            }
            r0m r0mVar = hc50Var.i;
            if (r0mVar != null) {
                e1iVar.setCounterStyle(r0mVar);
            }
            Integer num = hc50Var.h;
            if (num != null) {
                e1iVar.setCount(Integer.valueOf(num.intValue()));
            }
            e1iVar.setClickable(hc50Var.e);
            if (hc50Var.k) {
                acg0Var.g = hc50Var;
                acg0Var.h = e1iVar;
                e1iVar.setOnNavigationBarButtonClickListener(new zbg0(ntlVar, j6g0Var, hc50Var, acg0Var, (byte) 0));
            } else {
                e1iVar.setOnNavigationBarButtonClickListener(hc50Var.d);
            }
            arrayList3.add(e1iVar);
            acg0Var.addView(e1iVar);
            ntlVar2 = ntlVar;
        }
    }

    public void setNavigationBarButtonsBackgroundsColor(Integer num) {
        this.c.setButtonsBackgroundsColor(num);
    }

    public void setNavigationBarButtonsColorStateList(ColorStateList colorStateList) {
        this.c.setNavigationBarButtonsColorStateList(colorStateList);
    }

    public void setNavigationBarDrawableBackground(Drawable drawable) {
        setBackground(drawable);
    }

    public final void setNavigationBarStyle(wc50 wc50Var) {
        wc50Var.getClass();
        this.d.setNavigationBarStyle(wc50Var);
    }

    public void setOnHideSearchBarClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.k = function0;
    }

    public void setOnSearchViewExpandedStateChangedListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.d.setOnSearchViewExpandedStateChangedListener(new dpl((Object) this, (Object) function1, (byte) 14));
    }

    public void setOnTitlesClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.d.setOnTitlesClickListener(new unl(function0, (byte) 17));
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.d.setSearchFieldHint(charSequence);
    }

    public void setSearchFieldText(CharSequence charSequence) {
        this.d.setSearchFieldText(charSequence);
    }

    public void setSeparatorColor(int i) {
        this.e.setBackgroundColor(i);
        requestLayout();
    }

    public void setSubTitle(CharSequence charSequence) {
        charSequence.getClass();
        this.d.setSubTitle(charSequence);
    }

    public void setSubTitleColor(int i) {
        this.d.setSubTitleColor(i);
    }

    public void setSubtitleVisible(boolean z) {
        this.d.setSubTitleVisible(z);
    }

    public void setTitle(CharSequence charSequence) {
        charSequence.getClass();
        wf40 wf40Var = this.d;
        yrb0 yrb0Var = wf40Var.i;
        ssq0 ssq0Var = wf40Var.h;
        q4n0 q4n0Var = wf40Var.j;
        DsSearchField dsSearchField = wf40Var.k;
        charSequence.getClass();
        int iOrdinal = wf40Var.b.ordinal();
        if (iOrdinal == 0) {
            ssq0Var.setVisibility(dsSearchField.getVisibility() != 0 ? 0 : 8);
            ssq0Var.setTitle(charSequence);
        } else if (iOrdinal == 1) {
            yrb0Var.setVisibility(dsSearchField.getVisibility() != 0 ? 0 : 8);
            yrb0Var.setTitleText(charSequence);
        } else if (iOrdinal != 2) {
            t9f.b();
        } else {
            q4n0Var.setVisibility(dsSearchField.getVisibility() != 0 ? 0 : 8);
            q4n0Var.setTitleText(charSequence);
        }
    }

    public void setTitleChevronColor(int i) {
        this.d.setTitleChevronColor(i);
    }

    public final void setTitleColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.d.setTitleColor(colorStateList);
    }

    public void setTitleIconVisible(boolean z) {
        this.d.setTitleIconVisible(z);
    }

    public void setTitleLinesCount(int i) {
        this.d.setMaxLines(i);
    }

    public void setTitleVisible(boolean z) {
        this.d.setTitleVisible(z);
    }

    public void setNavigationBarButtonsBackgroundsColor(ColorStateList colorStateList) {
        this.c.setButtonsBackgroundsColor(colorStateList);
    }

    public final void setTitleChevronColor(ColorStateList colorStateList) {
        this.d.setTitleChevronColor(colorStateList);
    }

    public final void setBackIconColor(int i) {
        this.b.setBackIconTint(i);
    }

    public void setTitleColor(int i) {
        this.d.setTitleColor(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsNavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsNavigationBar(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
