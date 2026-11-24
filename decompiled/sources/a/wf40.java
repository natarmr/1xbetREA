package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.toolbar.base.styles.NavigationBarSavedState;

/* JADX INFO: loaded from: classes6.dex */
public final class wf40 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39051a;
    public wc50 b;
    public final int c;
    public final int d;
    public final int e;
    public Function1 f;
    public View g;
    public final ssq0 h;
    public final yrb0 i;
    public final q4n0 j;
    public final DsSearchField k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf40(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f39051a = "";
        this.b = wc50.f38910a;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_16);
        ssq0 ssq0Var = new ssq0(context);
        ssq0Var.setId(jmu0.d());
        this.h = ssq0Var;
        yrb0 yrb0Var = new yrb0(context);
        yrb0Var.setId(jmu0.d());
        this.i = yrb0Var;
        q4n0 q4n0Var = new q4n0(context);
        q4n0Var.setId(jmu0.d());
        this.j = q4n0Var;
        DsSearchField dsSearchField = new DsSearchField(context, null, 6);
        dsSearchField.setId(jmu0.d());
        dsSearchField.setVisibility(8);
        this.k = dsSearchField;
    }

    public final void a(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() - measuredHeight) / 2;
        ViewParent parent = getParent();
        DsNavigationBar dsNavigationBar = parent instanceof DsNavigationBar ? (DsNavigationBar) parent : null;
        if (dsNavigationBar == null) {
            return;
        }
        int leftContainerWidth$uikit = dsNavigationBar.getLeftContainerWidth$uikit();
        int rightContainerWidth$uikit = dsNavigationBar.getRightContainerWidth$uikit();
        int measuredWidth2 = getMeasuredWidth() - this.e;
        int measuredWidth3 = getRootView().getMeasuredWidth();
        int i = this.d;
        if (rightContainerWidth$uikit == 0) {
            int i2 = (measuredWidth3 - measuredWidth) / 2;
            if (i2 >= leftContainerWidth$uikit + i) {
                i = i2 - leftContainerWidth$uikit;
            }
        } else if (measuredWidth < measuredWidth2) {
            int measuredWidth4 = getMeasuredWidth();
            int i3 = ((measuredWidth3 - measuredWidth) / 2) - leftContainerWidth$uikit;
            i = i3 + measuredWidth > measuredWidth4 ? (measuredWidth4 - measuredWidth) - i : i3;
        }
        int i4 = i;
        jmu0.f(i4, measuredHeight2, i4 + measuredWidth, measuredHeight2 + measuredHeight, view, this);
    }

    public final void b() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setVisibility(8);
        } else if (iOrdinal == 1) {
            this.i.setVisibility(8);
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            this.j.setVisibility(8);
        }
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
        }
        DsSearchField dsSearchField = this.k;
        dsSearchField.setVisibility(0);
        dsSearchField.f();
        Function1 function1 = this.f;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public final void c() {
        View view = this.g;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            view.setVisibility(8);
            this.h.setVisibility(0);
            this.i.setVisibility(0);
            this.j.setVisibility(0);
        }
        this.g = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(ypm ypmVar) {
        ypm ypmVar2 = ypm.f43038a;
        ypm ypmVar3 = ypm.b;
        boolean zContains = q3d.j(ypmVar2, ypmVar3).contains(ypmVar);
        boolean z = ypmVar == ypmVar3;
        DsSearchField dsSearchField = this.k;
        if (zContains && dsSearchField.getVisibility() == 0) {
            return;
        }
        dsSearchField.setVisibility(zContains ? 0 : 8);
        int iOrdinal = this.b.ordinal();
        ssq0 ssq0Var = this.h;
        yrb0 yrb0Var = this.i;
        q4n0 q4n0Var = this.j;
        if (iOrdinal == 0) {
            ssq0Var.setVisibility(!zContains ? 0 : 8);
        } else if (iOrdinal == 1) {
            yrb0Var.setVisibility(!zContains ? 0 : 8);
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            q4n0Var.setVisibility(!zContains ? 0 : 8);
        }
        if (zContains) {
            if (!z) {
                Function1 function1 = this.f;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
            String strValueOf = String.valueOf(dsSearchField.getEditText().getText());
            if (strValueOf.length() > 0) {
                dsSearchField.setText(strValueOf);
                dsSearchField.getEditText().setSelection(strValueOf.length());
            } else {
                dsSearchField.setHint(this.f39051a);
                dsSearchField.getEditText().setSelection(strValueOf.length());
            }
            post(new wss(this, (byte) 12));
            return;
        }
        int iOrdinal2 = this.b.ordinal();
        if (iOrdinal2 == 0) {
            ssq0Var.setVisibility(0);
        } else if (iOrdinal2 == 1) {
            yrb0Var.setVisibility(0);
        } else {
            if (iOrdinal2 != 2) {
                t9f.b();
                return;
            }
            q4n0Var.setVisibility(0);
        }
        View view = this.g;
        if (view != null) {
            view.setVisibility(0);
        }
        dsSearchField.setVisibility(8);
        dsSearchField.c();
        Function1 function2 = this.f;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE);
        }
    }

    public final CharSequence getSubTitle() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return "";
        }
        if (iOrdinal == 1) {
            return this.i.getPreTitle();
        }
        if (iOrdinal == 2) {
            return this.j.getSubTitle();
        }
        t9f.b();
        return null;
    }

    public final CharSequence getTitle() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return this.h.getTitle();
        }
        if (iOrdinal == 1) {
            return this.i.getTitle();
        }
        if (iOrdinal == 2) {
            return this.j.getTitle();
        }
        t9f.b();
        return null;
    }

    public final Integer getTitleCurrentColor() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return Integer.valueOf(this.h.getCurrentTextColor());
        }
        if (iOrdinal == 1) {
            return Integer.valueOf(this.i.getTitleCurrentColor());
        }
        if (iOrdinal == 2) {
            return Integer.valueOf(this.j.getTitleCurrentColor());
        }
        t9f.b();
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            ssq0 ssq0Var = this.h;
            int measuredWidth = ssq0Var.getMeasuredWidth();
            int measuredHeight = ssq0Var.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() - measuredHeight) / 2;
            ViewParent parent = getParent();
            DsNavigationBar dsNavigationBar = parent instanceof DsNavigationBar ? (DsNavigationBar) parent : null;
            if (dsNavigationBar != null) {
                int leftContainerWidth$uikit = dsNavigationBar.getLeftContainerWidth$uikit();
                int rightContainerWidth$uikit = dsNavigationBar.getRightContainerWidth$uikit();
                int measuredWidth2 = getMeasuredWidth() - this.e;
                int measuredWidth3 = getRootView().getMeasuredWidth();
                int measuredWidth4 = this.d;
                if (rightContainerWidth$uikit == 0) {
                    int i6 = (measuredWidth3 - measuredWidth) / 2;
                    if (i6 >= leftContainerWidth$uikit + measuredWidth4) {
                        measuredWidth4 = i6 - leftContainerWidth$uikit;
                    }
                } else if (measuredWidth < measuredWidth2) {
                    measuredWidth4 = ((measuredWidth3 - measuredWidth) / 2) - leftContainerWidth$uikit;
                    if (measuredWidth4 + measuredWidth > getMeasuredWidth()) {
                        measuredWidth4 = getMeasuredWidth() - measuredWidth;
                    }
                }
                jmu0.f(measuredWidth4, measuredHeight2, measuredWidth + measuredWidth4, measuredHeight2 + measuredHeight, this.h, this);
            }
        } else if (iOrdinal == 1) {
            a(this.i);
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            a(this.j);
        }
        int i7 = this.d;
        int measuredHeight3 = this.k.getMeasuredHeight();
        int i8 = this.c;
        jmu0.f(i7, i8, i5 - i7, measuredHeight3 + i8, this.k, this);
        View view = this.g;
        if (view != null) {
            int measuredWidth5 = (getMeasuredWidth() - view.getMeasuredWidth()) / 2;
            int measuredWidth6 = view.getMeasuredWidth() + measuredWidth5;
            int measuredHeight4 = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            jmu0.f(measuredWidth5, measuredHeight4, measuredWidth6, view.getMeasuredHeight() + measuredHeight4, view, this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.e;
        int i4 = size - i3;
        int size2 = View.MeasureSpec.getSize(i2);
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
        } else if (iOrdinal == 1) {
            this.i.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            this.j.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
        }
        View view = this.g;
        if (view != null) {
            measureChild(view, i, i2);
        }
        this.k.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - i3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        setTag("MiddleNavigationBarContainerView");
        setMeasuredDimension(View.MeasureSpec.getSize(i), size2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        NavigationBarSavedState navigationBarSavedState = (NavigationBarSavedState) parcelable;
        super.onRestoreInstanceState(navigationBarSavedState.getSuperState());
        if (navigationBarSavedState.f47280a) {
            d(ypm.f43038a);
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

    public final void setCursorOnSearchFiledVisible(boolean z) {
        this.k.setCursorVisible(z);
    }

    public final void setCustomView(View view) {
        view.getClass();
        c();
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        view.setVisibility(0);
        addView(view);
        this.g = view;
    }

    public final void setMaxLines(int i) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setMaxLines(i);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setMaxLines(i);
        } else if (iOrdinal == 2) {
            this.j.setMaxLines(i);
        } else {
            t9f.b();
        }
    }

    public final void setNavigationBarStyle(wc50 wc50Var) {
        wc50Var.getClass();
        this.b = wc50Var;
        removeAllViewsInLayout();
        int iOrdinal = wc50Var.ordinal();
        if (iOrdinal == 0) {
            addView(this.h);
        } else if (iOrdinal == 1) {
            addView(this.i);
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            addView(this.j);
        }
        addView(this.k);
    }

    public final void setOnSearchViewExpandedStateChangedListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.f = function1;
    }

    public final void setOnTitlesClickListener(Function0<Unit> function0) {
        boolean chevronVisibility;
        function0.getClass();
        int iOrdinal = this.b.ordinal();
        yrb0 yrb0Var = this.i;
        ssq0 ssq0Var = this.h;
        q4n0 q4n0Var = this.j;
        if (iOrdinal == 0) {
            chevronVisibility = ssq0Var.getChevronVisibility();
        } else if (iOrdinal == 1) {
            chevronVisibility = yrb0Var.getChevronVisibility();
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            chevronVisibility = q4n0Var.getChevronVisibility();
        }
        int iOrdinal2 = this.b.ordinal();
        if (iOrdinal2 == 0) {
            if (chevronVisibility) {
                dyb.c0(this, new r3w(function0, (byte) 10));
                ssq0Var.setOnTitlesClickListener(new a2z(function0, (byte) 10));
                return;
            }
            return;
        }
        if (iOrdinal2 == 1) {
            if (chevronVisibility) {
                dyb.c0(this, new r3w(function0, (byte) 9));
                yrb0Var.setOnTitlesClickListener(new a2z(function0, (byte) 9));
                return;
            }
            return;
        }
        if (iOrdinal2 != 2) {
            t9f.b();
        } else if (chevronVisibility) {
            dyb.c0(this, new r3w(function0, (byte) 11));
            q4n0Var.setOnTitlesClickListener(new a2z(function0, (byte) 11));
        }
    }

    public final void setSearchFieldHint(CharSequence charSequence) {
        this.f39051a = String.valueOf(charSequence);
        this.k.setHint(charSequence);
    }

    public final void setSearchFieldText(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    public final void setSubTitle(CharSequence charSequence) {
        charSequence.getClass();
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                this.i.setSubTitle(charSequence);
            } else if (iOrdinal == 2) {
                this.j.setSubTitle(charSequence);
            } else {
                t9f.b();
            }
        }
    }

    public final void setSubTitleColor(int i) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                this.i.setPreTitleColor(i);
            } else if (iOrdinal == 2) {
                this.j.setSubTitleColor(i);
            } else {
                t9f.b();
            }
        }
    }

    public final void setSubTitleVisible(boolean z) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                this.i.setSubtitleVisible(z);
            } else if (iOrdinal == 2) {
                this.j.setSubtitleVisible(z);
            } else {
                t9f.b();
            }
        }
    }

    public final void setTitleAlpha(float f) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setTitleAlpha(f);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setTitleAlpha(f);
        } else if (iOrdinal == 2) {
            this.j.setTitleAlpha(f);
        } else {
            t9f.b();
        }
    }

    public final void setTitleChevronColor(ColorStateList colorStateList) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setChevronColor(colorStateList);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setChevronColor(colorStateList);
        } else if (iOrdinal == 2) {
            this.j.setChevronColor(colorStateList);
        } else {
            t9f.b();
        }
    }

    public final void setTitleColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setTextColor(colorStateList);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setTitleTextColor(colorStateList);
        } else if (iOrdinal == 2) {
            this.j.setTitleTextColor(colorStateList);
        } else {
            t9f.b();
        }
    }

    public final void setTitleIconVisible(boolean z) {
        setClickable(z);
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setChevronVisibility(z);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setChevronVisibility(z);
        } else if (iOrdinal == 2) {
            this.j.setChevronVisibility(z);
        } else {
            t9f.b();
        }
    }

    public final void setTitleScale(float f) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setTitleScale(f);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setTitleScale(f);
        } else if (iOrdinal == 2) {
            this.j.setTitleScale(f);
        } else {
            t9f.b();
        }
    }

    public final void setTitleTranslationY(float f) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setTitleTranslationY(f);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setTitleTranslationY(f);
        } else if (iOrdinal == 2) {
            this.j.setTitleTranslationY(f);
        } else {
            t9f.b();
        }
    }

    public final void setTitleVisible(boolean z) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setVisibility(z ? 0 : 8);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setTitleVisible(z);
        } else if (iOrdinal == 2) {
            this.j.setTitleVisible(z);
        } else {
            t9f.b();
        }
    }

    public final void setTitleChevronColor(int i) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setChevronColor(i);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setChevronColor(i);
        } else if (iOrdinal == 2) {
            this.j.setChevronColor(i);
        } else {
            t9f.b();
        }
    }

    public final void setTitleColor(int i) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            this.h.setTextColor(i);
            return;
        }
        if (iOrdinal == 1) {
            this.i.setTitleTextColor(i);
        } else if (iOrdinal == 2) {
            this.j.setTitleTextColor(i);
        } else {
            t9f.b();
        }
    }
}
