package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.toolbar.base.styles.NavigationBarSavedState;

/* JADX INFO: loaded from: classes6.dex */
public final class qrq0 extends FrameLayout implements s96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29222a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public boolean g;
    public String h;
    public Function0 i;
    public Function1 j;
    public View k;
    public final DsSearchField l;
    public final rsq0 m;
    public final fc50 n;
    public final jc50 o;
    public final View p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrq0(Context context) {
        super(context, null, R.attr.toolBarStyle);
        context.getClass();
        this.f29222a = getResources().getDimensionPixelSize(R.dimen.size_56);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_48);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_1);
        this.h = "";
        this.i = new joq0((byte) 4);
        View view = new View(context);
        view.setId(jmu0.d());
        this.k = view;
        DsSearchField dsSearchField = new DsSearchField(context, null, 6);
        dsSearchField.setId(jmu0.d());
        dsSearchField.setVisibility(8);
        this.l = dsSearchField;
        rsq0 rsq0Var = new rsq0(context);
        rsq0Var.setId(jmu0.d());
        this.m = rsq0Var;
        fc50 fc50Var = new fc50(context);
        fc50Var.setId(jmu0.d());
        this.n = fc50Var;
        jc50 jc50Var = new jc50(context);
        jc50Var.setId(jmu0.d());
        this.o = jc50Var;
        View view2 = new View(context);
        view2.setId(jmu0.d());
        this.p = view2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, bqd0.i, R.attr.toolBarStyle, 0);
        ColorStateList colorStateListM = ktt0.m(12, context, typedArrayObtainStyledAttributes);
        if (colorStateListM != null) {
            setTextColor(colorStateListM);
            fc50Var.setBackIconTint(colorStateListM);
            setTitleIconVisible(typedArrayObtainStyledAttributes.getBoolean(8, true));
            rsq0Var.setChevronColor(colorStateListM);
        }
        setSeparatorColor(typedArrayObtainStyledAttributes.getColor(6, m5d.b(R.attr.uikitSeparator60, context)));
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 0);
        if (numL != null) {
            setNavigationBarBackground(numL.intValue());
        }
        typedArrayObtainStyledAttributes.recycle();
        addView(rsq0Var);
        addView(fc50Var);
        addView(jc50Var);
        addView(dsSearchField);
        addView(view2);
    }

    @Override // a.s96
    public final void a(boolean z) {
        this.p.setVisibility(z ? 0 : 8);
    }

    @Override // a.s96
    public final ukm b(String str) {
        return this.o.b(str);
    }

    @Override // a.s96
    public final void c(Function0 function0) {
        function0.getClass();
        dyb.O(this.n, new b8q0((Object) this, (Object) function0, (byte) 10));
    }

    @Override // a.s96
    public final void d(TextWatcher textWatcher) {
        textWatcher.getClass();
        this.l.getEditText().removeTextChangedListener(textWatcher);
    }

    @Override // a.s96
    public final void e() {
        this.l.setText("");
    }

    @Override // a.s96
    public final void f(TextWatcher textWatcher) {
        textWatcher.getClass();
        this.l.b(textWatcher);
    }

    @Override // a.s96
    public final void g(ypm ypmVar) {
        ypm ypmVar2 = ypm.f43038a;
        ypm ypmVar3 = ypm.b;
        boolean zContains = q3d.j(ypmVar2, ypmVar3).contains(ypmVar);
        boolean z = ypmVar == ypmVar3;
        DsSearchField dsSearchField = this.l;
        if (zContains && dsSearchField.getVisibility() == 0) {
            return;
        }
        dsSearchField.setVisibility(zContains ? 0 : 8);
        int i = !zContains ? 0 : 8;
        rsq0 rsq0Var = this.m;
        rsq0Var.setVisibility(i);
        if (zContains) {
            if (z) {
                post(new apj0((Object) this, (byte) 18));
                return;
            }
            return;
        }
        rsq0Var.setVisibility(0);
        View view = this.k;
        if (view != null) {
            view.setVisibility(0);
        }
        dsSearchField.setVisibility(8);
        dsSearchField.c();
        this.o.a();
        requestLayout();
        Function1 function1 = this.j;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // a.s96
    public CharSequence getSubTitle() {
        return "";
    }

    @Override // a.s96
    public CharSequence getTitle() {
        return this.m.getTitle();
    }

    @Override // a.s96
    public final void h(Function0 function0) {
        this.o.f = function0;
    }

    public final void i() {
        this.m.setVisibility(8);
        View view = this.k;
        if (view != null) {
            view.setVisibility(8);
        }
        DsSearchField dsSearchField = this.l;
        dsSearchField.setVisibility(0);
        dsSearchField.f();
        this.o.c();
        requestLayout();
        Function1 function1 = this.j;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        fc50 fc50Var = this.n;
        int measuredWidth = fc50Var.getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() / 2) - (fc50Var.getMeasuredHeight() / 2);
        jmu0.f(0, measuredHeight, measuredWidth, measuredHeight + measuredWidth, this.n, this);
        jc50 jc50Var = this.o;
        int measuredWidth2 = jc50Var.getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth3 = getMeasuredWidth() - measuredWidth2;
        jmu0.f(measuredWidth3, 0, measuredWidth3 + measuredWidth2, measuredHeight2, this.o, this);
        int measuredWidth4 = fc50Var.getMeasuredWidth();
        int measuredWidth5 = jc50Var.getMeasuredWidth();
        rsq0 rsq0Var = this.m;
        int measuredWidth6 = rsq0Var.getMeasuredWidth();
        int measuredHeight3 = (getMeasuredHeight() / 2) - (rsq0Var.getMeasuredHeight() / 2);
        int measuredWidth7 = getMeasuredWidth() - measuredWidth5;
        int measuredWidth8 = (getMeasuredWidth() - measuredWidth6) / 2;
        int i7 = this.d;
        int i8 = measuredWidth4 + i7;
        if (measuredWidth8 < i8) {
            measuredWidth8 = i8;
        }
        int i9 = measuredWidth7 - measuredWidth6;
        int i10 = measuredWidth8 > i9 ? i9 : measuredWidth8;
        jmu0.f(i10, measuredHeight3, measuredWidth6 + i10, rsq0Var.getMeasuredHeight() + measuredHeight3, rsq0Var, this);
        View view = this.k;
        if (view != null) {
            int measuredWidth9 = fc50Var.getMeasuredWidth();
            int measuredWidth10 = jc50Var.getMeasuredWidth();
            int measuredWidth11 = view.getMeasuredWidth();
            int measuredHeight4 = view.getMeasuredHeight();
            int measuredHeight5 = (getMeasuredHeight() / 2) - (measuredHeight4 / 2);
            int measuredWidth12 = getMeasuredWidth() - measuredWidth10;
            int measuredWidth13 = (getMeasuredWidth() - measuredWidth11) / 2;
            int i11 = measuredWidth9 + i7;
            if (measuredWidth13 < i11) {
                measuredWidth13 = i11;
            }
            int i12 = measuredWidth12 - measuredWidth11;
            int i13 = measuredWidth13 > i12 ? i12 : measuredWidth13;
            jmu0.f(i13, measuredHeight5, measuredWidth11 + i13, measuredHeight4 + measuredHeight5, view, this);
        }
        int measuredWidth14 = fc50Var.getMeasuredWidth() + i7;
        int measuredWidth15 = (getMeasuredWidth() - measuredWidth14) - jc50Var.getMeasuredWidth();
        DsSearchField dsSearchField = this.l;
        int measuredHeight6 = dsSearchField.getMeasuredHeight();
        int measuredHeight7 = ((i6 - dsSearchField.getMeasuredHeight()) / 2) + this.e;
        int measuredWidth16 = measuredWidth14 + ((measuredWidth15 - dsSearchField.getMeasuredWidth()) / 2);
        jmu0.f(measuredWidth16, measuredHeight7, dsSearchField.getMeasuredWidth() + measuredWidth16, measuredHeight6 + measuredHeight7, this.l, this);
        jmu0.f(0, i6, i5, i6 - this.f, this.p, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        fc50 fc50Var = this.n;
        int measuredWidth = getMeasuredWidth() - (fc50Var.getMeasuredWidth() + this.c);
        jc50 jc50Var = this.o;
        int childCount = jc50Var.getChildCount();
        int i4 = 0;
        while (true) {
            i3 = this.f29222a;
            if (i4 >= childCount) {
                break;
            }
            View childAt = jc50Var.getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth / jc50Var.getChildCount(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
            i4++;
        }
        jc50Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int i5 = this.e;
        int i6 = i3 - i5;
        fc50Var.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        int measuredWidth2 = (size - fc50Var.getMeasuredWidth()) - jc50Var.getMeasuredWidth();
        int i7 = this.d;
        int i8 = measuredWidth2 - i7;
        if (i8 > 0) {
            this.m.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
        }
        View view = this.k;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(((size - fc50Var.getMeasuredWidth()) - jc50Var.getMeasuredWidth()) - (i7 * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int measuredWidth3 = ((getMeasuredWidth() - ((fc50Var.getMeasuredWidth() + i7) + i7)) - jc50Var.getMeasuredWidth()) - i5;
        if (measuredWidth3 > 0) {
            this.l.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        this.p.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
        setMeasuredDimension(size, View.resolveSize(i3, i2));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        NavigationBarSavedState navigationBarSavedState = (NavigationBarSavedState) parcelable;
        super.onRestoreInstanceState(navigationBarSavedState.getSuperState());
        if (navigationBarSavedState.f47280a) {
            this.o.c();
            g(ypm.f43038a);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        NavigationBarSavedState navigationBarSavedState = parcelableOnSaveInstanceState != null ? new NavigationBarSavedState(parcelableOnSaveInstanceState) : null;
        if (navigationBarSavedState != null) {
            navigationBarSavedState.f47280a = this.l.getVisibility() == 0;
        }
        return navigationBarSavedState;
    }

    @Override // a.s96
    public void setBackIconColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.n.setBackIconTint(colorStateList);
    }

    @Override // a.s96
    public void setCursorOnSearchFiledVisible(boolean z) {
        this.l.setCursorVisible(z);
    }

    public void setCustomView(View view) {
        view.getClass();
        this.g = true;
        View view2 = this.k;
        if (view2 != null) {
            removeView(view2);
        }
        this.k = view;
        addView(view);
        requestLayout();
    }

    public void setMaxLines(int i) {
        this.m.setMaxLines(i);
    }

    @Override // a.s96
    public void setNavigationBarBackground(int i) {
        setBackgroundColor(i);
    }

    @Override // a.s96
    public void setNavigationBarButtons(ArrayList<gc50> arrayList) {
        arrayList.getClass();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (gc50 gc50Var : arrayList) {
            if (gc50Var.e) {
                gc50Var.d = new h3q0((Object) this, (byte) 19);
            }
            arrayList2.add(Unit.f46060a);
        }
        this.o.d(arrayList, new ec40((byte) 25));
    }

    @Override // a.s96
    public void setNavigationBarButtonsColorStateList(ColorStateList colorStateList) {
        this.o.setNavigationBarButtonsColorStateList(colorStateList);
    }

    @Override // a.s96
    public void setNavigationBarDrawableBackground(Drawable drawable) {
        setBackground(drawable);
    }

    @Override // a.s96
    public void setOnHideSearchBarClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.i = function0;
    }

    @Override // a.s96
    public void setOnSearchViewExpandedStateChangedListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.j = function1;
    }

    @Override // a.s96
    public void setOnTitlesClickListener(Function0<Unit> function0) {
        function0.getClass();
        dyb.N(this.m, ymx.INTERVAL_400, new vpj0(function0, (byte) 9));
    }

    @Override // a.s96
    public void setSearchFieldHint(CharSequence charSequence) {
        this.h = String.valueOf(charSequence);
        this.l.setHint(charSequence);
    }

    @Override // a.s96
    public void setSearchFieldText(CharSequence charSequence) {
        this.l.setText(charSequence);
    }

    public void setSeparatorColor(int i) {
        this.p.setBackgroundColor(i);
    }

    @Override // a.s96
    public void setSubTitle(CharSequence charSequence) {
        charSequence.getClass();
    }

    public final void setTextColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.m.setTextColor(colorStateList);
    }

    @Override // a.s96
    public void setTitle(CharSequence charSequence) {
        int i = this.l.getVisibility() == 0 ? 8 : 0;
        rsq0 rsq0Var = this.m;
        rsq0Var.setVisibility(i);
        rsq0Var.setTitle(charSequence);
    }

    @Override // a.s96
    public void setTitleChevronColor(int i) {
        this.m.setChevronColor(i);
    }

    @Override // a.s96
    public void setTitleColor(int i) {
        rsq0 rsq0Var = this.m;
        rsq0Var.setTextColor(i);
        rsq0Var.setChevronColor(i);
    }

    @Override // a.s96
    public void setTitleIconVisible(boolean z) {
        this.m.setChevronVisibility(z);
    }

    @Override // a.s96
    public void setTitleVisible(boolean z) {
        this.m.setVisibility(z ? 0 : 8);
    }

    @Override // a.s96
    public void setSubTitleColor(int i) {
    }

    @Override // a.s96
    public void setSubtitleVisible(boolean z) {
    }
}
