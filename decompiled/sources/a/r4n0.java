package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.toolbar.base.styles.NavigationBarSavedState;

/* JADX INFO: loaded from: classes6.dex */
public final class r4n0 extends FrameLayout implements s96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29844a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public String h;
    public Function0 i;
    public Function1 j;
    public final DsSearchField k;
    public final cfn0 l;
    public final fc50 m;
    public final jc50 n;
    public final View o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4n0(Context context) {
        super(context, null, R.attr.toolBarStyle);
        context.getClass();
        this.f29844a = getResources().getDimensionPixelSize(R.dimen.size_56);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_10);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_1);
        this.h = "";
        this.i = new x9m0((byte) 25);
        DsSearchField dsSearchField = new DsSearchField(context, null, 6);
        dsSearchField.setId(jmu0.d());
        dsSearchField.setVisibility(8);
        this.k = dsSearchField;
        cfn0 cfn0Var = new cfn0(context);
        cfn0Var.setId(jmu0.d());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        cfn0Var.setLayoutParams(layoutParams);
        this.l = cfn0Var;
        fc50 fc50Var = new fc50(context);
        fc50Var.setId(jmu0.d());
        this.m = fc50Var;
        jc50 jc50Var = new jc50(context);
        jc50Var.setId(jmu0.d());
        this.n = jc50Var;
        View view = new View(context);
        view.setId(jmu0.d());
        this.o = view;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, bqd0.i, R.attr.toolBarStyle, 0);
        ColorStateList colorStateListM = ktt0.m(12, context, typedArrayObtainStyledAttributes);
        if (colorStateListM != null) {
            setTextColor(colorStateListM);
            fc50Var.setBackIconTint(colorStateListM);
            setTitleIconVisible(typedArrayObtainStyledAttributes.getBoolean(8, true));
            cfn0Var.getTitleTextView().setChevronColor(colorStateListM);
        }
        setSeparatorColor(typedArrayObtainStyledAttributes.getColor(6, m5d.b(R.attr.uikitSeparator60, context)));
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 0);
        if (numL != null) {
            setNavigationBarBackground(numL.intValue());
        }
        typedArrayObtainStyledAttributes.recycle();
        addView(cfn0Var);
        addView(fc50Var);
        addView(jc50Var);
        addView(dsSearchField);
        addView(view);
    }

    @Override // a.s96
    public final void a(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    @Override // a.s96
    public final ukm b(String str) {
        return this.n.b(str);
    }

    @Override // a.s96
    public final void c(Function0 function0) {
        function0.getClass();
        dyb.O(this.m, new u5l0((Object) this, (Object) function0, (byte) 25));
    }

    @Override // a.s96
    public final void d(TextWatcher textWatcher) {
        textWatcher.getClass();
        this.k.getEditText().removeTextChangedListener(textWatcher);
    }

    @Override // a.s96
    public final void e() {
        this.k.setText("");
    }

    @Override // a.s96
    public final void f(TextWatcher textWatcher) {
        textWatcher.getClass();
        this.k.b(textWatcher);
    }

    @Override // a.s96
    public final void g(ypm ypmVar) {
        ypm ypmVar2 = ypm.f43038a;
        ypm ypmVar3 = ypm.b;
        boolean zContains = q3d.j(ypmVar2, ypmVar3).contains(ypmVar);
        boolean z = ypmVar == ypmVar3;
        DsSearchField dsSearchField = this.k;
        if (zContains && dsSearchField.getVisibility() == 0) {
            return;
        }
        dsSearchField.setVisibility(zContains ? 0 : 8);
        int i = !zContains ? 0 : 8;
        cfn0 cfn0Var = this.l;
        cfn0Var.setVisibility(i);
        if (zContains) {
            if (z) {
                post(new apj0((Object) this, (byte) 4));
            }
        } else {
            cfn0Var.setVisibility(0);
            dsSearchField.setVisibility(8);
            dsSearchField.c();
            this.n.a();
            requestLayout();
        }
    }

    @Override // a.s96
    public CharSequence getSubTitle() {
        CharSequence text = this.l.getSubTitleTextView().getText();
        text.getClass();
        return text;
    }

    @Override // a.s96
    public CharSequence getTitle() {
        return this.l.getTitleTextView().getTitle();
    }

    @Override // a.s96
    public final void h(Function0 function0) {
        this.n.f = function0;
    }

    public final void i() {
        this.l.setVisibility(8);
        DsSearchField dsSearchField = this.k;
        dsSearchField.setVisibility(0);
        dsSearchField.f();
        this.n.c();
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
        fc50 fc50Var = this.m;
        int measuredWidth = fc50Var.getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() / 2) - (fc50Var.getMeasuredHeight() / 2);
        jmu0.f(0, measuredHeight, measuredWidth, measuredHeight + measuredWidth, this.m, this);
        jc50 jc50Var = this.n;
        jmu0.f(getMeasuredWidth() - jc50Var.getMeasuredWidth(), 0, getMeasuredWidth(), getMeasuredHeight(), this.n, this);
        int measuredWidth2 = fc50Var.getMeasuredWidth();
        int measuredWidth3 = jc50Var.getMeasuredWidth();
        cfn0 cfn0Var = this.l;
        int measuredWidth4 = cfn0Var.getMeasuredWidth();
        int measuredHeight2 = (getMeasuredHeight() - cfn0Var.getMeasuredHeight()) / 2;
        int measuredWidth5 = getMeasuredWidth() - measuredWidth3;
        int measuredWidth6 = (getMeasuredWidth() - measuredWidth4) / 2;
        int i7 = this.b;
        int i8 = measuredWidth2 + i7;
        if (measuredWidth6 < i8) {
            measuredWidth6 = i8;
        }
        int i9 = measuredWidth5 - measuredWidth4;
        int i10 = measuredWidth6 > i9 ? i9 : measuredWidth6;
        jmu0.f(i10, measuredHeight2, measuredWidth4 + i10, cfn0Var.getMeasuredHeight() + measuredHeight2, cfn0Var, this);
        int measuredWidth7 = fc50Var.getMeasuredWidth() + i7;
        int measuredWidth8 = (getMeasuredWidth() - measuredWidth7) - jc50Var.getMeasuredWidth();
        DsSearchField dsSearchField = this.k;
        int measuredHeight3 = dsSearchField.getMeasuredHeight();
        int measuredHeight4 = ((i6 - dsSearchField.getMeasuredHeight()) / 2) + this.c;
        int measuredWidth9 = measuredWidth7 + ((measuredWidth8 - dsSearchField.getMeasuredWidth()) / 2);
        jmu0.f(measuredWidth9, measuredHeight4, dsSearchField.getMeasuredWidth() + measuredWidth9, measuredHeight3 + measuredHeight4, this.k, this);
        jmu0.f(0, i6, i5, i6 - this.f, this.o, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        fc50 fc50Var = this.m;
        measureChild(fc50Var, View.MeasureSpec.makeMeasureSpec(fc50Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(fc50Var.getMeasuredHeight(), 1073741824));
        int measuredWidth = getMeasuredWidth() - (fc50Var.getMeasuredWidth() + this.e);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        jc50 jc50Var = this.n;
        jc50Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int childCount = jc50Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = jc50Var.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth / this.g, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        }
        int measuredWidth2 = fc50Var.getMeasuredWidth();
        int measuredWidth3 = jc50Var.getMeasuredWidth();
        int i4 = this.c;
        int i5 = measuredWidth3 == 0 ? (size - measuredWidth2) - i4 : ((size - measuredWidth2) - measuredWidth3) - this.d;
        if (i5 > 0) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            cfn0 cfn0Var = this.l;
            cfn0Var.measure(iMakeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(cfn0Var.getMeasuredHeight(), 1073741824));
        }
        int measuredWidth4 = fc50Var.getMeasuredWidth();
        int i6 = this.b;
        int measuredWidth5 = ((getMeasuredWidth() - ((measuredWidth4 + i6) + i6)) - jc50Var.getMeasuredWidth()) - i4;
        if (measuredWidth5 > 0) {
            this.k.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth5, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        this.o.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
        setMeasuredDimension(size, View.resolveSize(this.f29844a, i2));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        NavigationBarSavedState navigationBarSavedState = (NavigationBarSavedState) parcelable;
        super.onRestoreInstanceState(navigationBarSavedState.getSuperState());
        if (navigationBarSavedState.f47280a) {
            this.n.c();
            g(ypm.f43038a);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        NavigationBarSavedState navigationBarSavedState = parcelableOnSaveInstanceState != null ? new NavigationBarSavedState(parcelableOnSaveInstanceState) : null;
        if (navigationBarSavedState != null) {
            navigationBarSavedState.f47280a = this.k.getVisibility() == 0;
        }
        return navigationBarSavedState;
    }

    @Override // a.s96
    public void setBackIconColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.m.setBackIconTint(colorStateList);
    }

    @Override // a.s96
    public void setCursorOnSearchFiledVisible(boolean z) {
        this.k.setCursorVisible(z);
    }

    public void setCustomView(View view) {
        view.getClass();
    }

    public void setMaxLines(int i) {
        this.l.setMaxLines(i);
    }

    @Override // a.s96
    public void setNavigationBarBackground(int i) {
        setBackgroundColor(i);
    }

    @Override // a.s96
    public void setNavigationBarButtons(ArrayList<gc50> arrayList) {
        arrayList.getClass();
        this.g = arrayList.size();
        this.n.d(arrayList, new jfm0(this, (byte) 7));
    }

    @Override // a.s96
    public void setNavigationBarButtonsColorStateList(ColorStateList colorStateList) {
        this.n.setNavigationBarButtonsColorStateList(colorStateList);
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
        dyb.N(this.l, ymx.INTERVAL_400, new vpj0(function0, (byte) 4));
    }

    @Override // a.s96
    public void setSearchFieldHint(CharSequence charSequence) {
        this.h = String.valueOf(charSequence);
        this.k.setHint(charSequence);
    }

    @Override // a.s96
    public void setSearchFieldText(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    public void setSeparatorColor(int i) {
        this.o.setBackgroundColor(i);
    }

    @Override // a.s96
    public void setSubTitle(CharSequence charSequence) {
        charSequence.getClass();
        this.l.setSubTitle(charSequence);
        requestLayout();
    }

    @Override // a.s96
    public void setSubTitleColor(int i) {
        this.l.getSubTitleTextView().setTextColor(i);
    }

    @Override // a.s96
    public void setSubtitleVisible(boolean z) {
        this.l.setSubtitleVisible(z);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        cfn0 cfn0Var = this.l;
        cfn0Var.getTitleTextView().setTextColor(colorStateList);
        cfn0Var.getSubTitleTextView().setTextColor(colorStateList);
        TextView subTitleTextView = cfn0Var.getSubTitleTextView();
        subTitleTextView.getClass();
        subTitleTextView.setCompoundDrawableTintList(colorStateList);
    }

    @Override // a.s96
    public void setTitle(CharSequence charSequence) {
        this.l.setTitle(charSequence);
        requestLayout();
    }

    @Override // a.s96
    public void setTitleChevronColor(int i) {
        this.l.getTitleTextView().setChevronColor(i);
    }

    @Override // a.s96
    public void setTitleColor(int i) {
        this.l.getTitleTextView().setTextColor(i);
    }

    @Override // a.s96
    public void setTitleIconVisible(boolean z) {
        this.l.getTitleTextView().setChevronVisibility(z);
    }

    @Override // a.s96
    public void setTitleVisible(boolean z) {
        this.l.setTitleVisible(z);
    }
}
