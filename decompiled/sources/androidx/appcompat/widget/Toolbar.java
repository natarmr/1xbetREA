package androidx.appcompat.widget;

import a.a4n0;
import a.ani0;
import a.blj;
import a.cmu0;
import a.drm0;
import a.epv0;
import a.ewq0;
import a.f7;
import a.fwq0;
import a.gwq0;
import a.hwq0;
import a.hz30;
import a.k8v;
import a.l1r;
import a.ma3;
import a.mqd0;
import a.mx2;
import a.njn0;
import a.ox30;
import a.qkg0;
import a.rgu0;
import a.rwq0;
import a.wh;
import a.xi;
import a.ywu;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f45299a;
    public AppCompatTextView b;
    public AppCompatTextView c;
    public AppCompatImageButton d;
    public AppCompatImageView e;
    public final Drawable f;
    public boolean f1;
    public final CharSequence g;
    public final ArrayList g1;
    public AppCompatImageButton h;
    public final ArrayList h1;
    public View i;
    public final int[] i1;
    public Context j;
    public final ywu j1;
    public int k;
    public ArrayList k1;
    public int l;
    public hwq0 l1;
    public int m;
    public final ani0 m1;
    public final int n;
    public rwq0 n1;
    public final int o;
    public xi o1;
    public int p;
    public fwq0 p1;
    public int q;
    public boolean q1;
    public int r;
    public ma3 r1;
    public int s;
    public OnBackInvokedDispatcher s1;
    public qkg0 t;
    public boolean t1;
    public int u;
    public final mx2 u1;
    public int v;
    public final int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();
        public int c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.w = 8388627;
        this.g1 = new ArrayList();
        this.h1 = new ArrayList();
        this.i1 = new int[2];
        this.j1 = new ywu(new ewq0(this, (byte) 1));
        this.k1 = new ArrayList();
        this.m1 = new ani0((Object) this);
        this.u1 = new mx2(this, (byte) 28);
        Context context2 = getContext();
        int[] iArr = mqd0.y;
        ywu ywuVarY = ywu.y(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        rgu0.n(this, context, iArr, attributeSet, (TypedArray) ywuVarY.c, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) ywuVarY.c;
        this.l = typedArray.getResourceId(40, 0);
        this.m = typedArray.getResourceId(31, 0);
        this.w = typedArray.getInteger(0, 8388627);
        this.n = typedArray.getInteger(3, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(34, 0);
        dimensionPixelOffset = typedArray.hasValue(39) ? typedArray.getDimensionPixelOffset(39, dimensionPixelOffset) : dimensionPixelOffset;
        this.s = dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        this.q = dimensionPixelOffset;
        this.p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(37, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(36, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(38, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(35, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.s = dimensionPixelOffset5;
        }
        this.o = typedArray.getDimensionPixelSize(15, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(8, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(9, 0);
        d();
        qkg0 qkg0Var = this.t;
        qkg0Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            qkg0Var.e = dimensionPixelSize;
            qkg0Var.f28883a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            qkg0Var.f = dimensionPixelSize2;
            qkg0Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            qkg0Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.u = typedArray.getDimensionPixelOffset(11, Integer.MIN_VALUE);
        this.v = typedArray.getDimensionPixelOffset(7, Integer.MIN_VALUE);
        this.f = ywuVarY.n(5);
        this.g = typedArray.getText(4);
        CharSequence text = typedArray.getText(33);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(30);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.j = getContext();
        setPopupTheme(typedArray.getResourceId(21, 0));
        Drawable drawableN = ywuVarY.n(18);
        if (drawableN != null) {
            setNavigationIcon(drawableN);
        }
        CharSequence text3 = typedArray.getText(17);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableN2 = ywuVarY.n(13);
        if (drawableN2 != null) {
            setLogo(drawableN2);
        }
        CharSequence text4 = typedArray.getText(14);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(41)) {
            setTitleTextColor(ywuVarY.m(41));
        }
        if (typedArray.hasValue(32)) {
            setSubtitleTextColor(ywuVarY.m(32));
        }
        if (typedArray.hasValue(16)) {
            l(typedArray.getResourceId(16, 0));
        }
        ywuVarY.A();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new njn0(getContext());
    }

    public static gwq0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof gwq0;
        if (z) {
            gwq0 gwq0Var = (gwq0) layoutParams;
            gwq0 gwq0Var2 = new gwq0(gwq0Var);
            gwq0Var2.b = (byte) 0;
            gwq0Var2.b = gwq0Var.b;
            return gwq0Var2;
        }
        if (z) {
            gwq0 gwq0Var3 = new gwq0((gwq0) layoutParams);
            gwq0Var3.b = (byte) 0;
            return gwq0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            gwq0 gwq0Var4 = new gwq0(layoutParams);
            gwq0Var4.b = (byte) 0;
            return gwq0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        gwq0 gwq0Var5 = new gwq0(marginLayoutParams);
        gwq0Var5.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) gwq0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) gwq0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) gwq0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) gwq0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return gwq0Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                gwq0 gwq0Var = (gwq0) childAt.getLayoutParams();
                if (gwq0Var.b == 0 && s(childAt)) {
                    int i3 = gwq0Var.f12039a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            gwq0 gwq0Var2 = (gwq0) childAt2.getLayoutParams();
            if (gwq0Var2.b == 0 && s(childAt2)) {
                int i5 = gwq0Var2.f12039a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        gwq0 gwq0VarH;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gwq0VarH = new gwq0();
        } else {
            gwq0VarH = !checkLayoutParams(layoutParams) ? h(layoutParams) : (gwq0) layoutParams;
        }
        gwq0VarH.b = (byte) 1;
        if (!z || this.i == null) {
            addView(view, gwq0VarH);
        } else {
            view.setLayoutParams(gwq0VarH);
            this.h1.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            gwq0 gwq0Var = new gwq0();
            gwq0Var.f12039a = (this.n & 112) | 8388611;
            gwq0Var.b = (byte) 2;
            this.h.setLayoutParams(gwq0Var);
            this.h.setOnClickListener(new wh(this, (byte) 5));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof gwq0);
    }

    public final void d() {
        if (this.t == null) {
            qkg0 qkg0Var = new qkg0();
            qkg0Var.f28883a = 0;
            qkg0Var.b = 0;
            qkg0Var.c = Integer.MIN_VALUE;
            qkg0Var.d = Integer.MIN_VALUE;
            qkg0Var.e = 0;
            qkg0Var.f = 0;
            qkg0Var.g = false;
            qkg0Var.h = false;
            this.t = qkg0Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f45299a;
        if (actionMenuView.p == null) {
            ox30 ox30Var = (ox30) actionMenuView.getMenu();
            if (this.p1 == null) {
                this.p1 = new fwq0(this);
            }
            this.f45299a.setExpandedActionViewsExclusive(true);
            ox30Var.b(this.p1, this.j);
            t();
        }
    }

    public final void f() {
        if (this.f45299a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f45299a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.f45299a.setOnMenuItemClickListener(this.m1);
            ActionMenuView actionMenuView2 = this.f45299a;
            drm0 drm0Var = new drm0(this);
            actionMenuView2.getClass();
            actionMenuView2.u = drm0Var;
            gwq0 gwq0Var = new gwq0();
            gwq0Var.f12039a = (this.n & 112) | 8388613;
            this.f45299a.setLayoutParams(gwq0Var);
            b(this.f45299a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            gwq0 gwq0Var = new gwq0();
            gwq0Var.f12039a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(gwq0Var);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gwq0();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        gwq0 gwq0Var = new gwq0(context, attributeSet);
        gwq0Var.f12039a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mqd0.b);
        gwq0Var.f12039a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        gwq0Var.b = (byte) 0;
        return gwq0Var;
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        qkg0 qkg0Var = this.t;
        if (qkg0Var != null) {
            return qkg0Var.g ? qkg0Var.f28883a : qkg0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        qkg0 qkg0Var = this.t;
        if (qkg0Var != null) {
            return qkg0Var.f28883a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        qkg0 qkg0Var = this.t;
        if (qkg0Var != null) {
            return qkg0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        qkg0 qkg0Var = this.t;
        if (qkg0Var != null) {
            return qkg0Var.g ? qkg0Var.b : qkg0Var.f28883a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ox30 ox30Var;
        ActionMenuView actionMenuView = this.f45299a;
        return (actionMenuView == null || (ox30Var = actionMenuView.p) == null || !ox30Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f45299a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public xi getOuterActionMenuPresenter() {
        return this.o1;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f45299a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public blj getWrapper() {
        Drawable drawable;
        rwq0 rwq0Var = this.n1;
        if (rwq0Var == null) {
            rwq0Var = new rwq0();
            rwq0Var.n = 0;
            rwq0Var.f31228a = this;
            rwq0Var.h = getTitle();
            rwq0Var.i = getSubtitle();
            rwq0Var.g = rwq0Var.h != null;
            rwq0Var.f = getNavigationIcon();
            ywu ywuVarY = ywu.y(R.attr.actionBarStyle, 0, getContext(), null, mqd0.f22220a);
            TypedArray typedArray = (TypedArray) ywuVarY.c;
            rwq0Var.o = ywuVarY.n(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                rwq0Var.g = true;
                rwq0Var.h = text;
                if ((rwq0Var.b & 8) != 0) {
                    setTitle(text);
                    if (rwq0Var.g) {
                        rgu0.p(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                rwq0Var.i = text2;
                if ((rwq0Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableN = ywuVarY.n(20);
            if (drawableN != null) {
                rwq0Var.e = drawableN;
                rwq0Var.c();
            }
            Drawable drawableN2 = ywuVarY.n(17);
            if (drawableN2 != null) {
                rwq0Var.d = drawableN2;
                rwq0Var.c();
            }
            if (rwq0Var.f == null && (drawable = rwq0Var.o) != null) {
                rwq0Var.f = drawable;
                if ((rwq0Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            rwq0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = rwq0Var.c;
                if (view != null && (rwq0Var.b & 16) != 0) {
                    removeView(view);
                }
                rwq0Var.c = viewInflate;
                if (viewInflate != null && (rwq0Var.b & 16) != 0) {
                    addView(viewInflate);
                }
                rwq0Var.a(rwq0Var.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.t.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.l = resourceId2;
                AppCompatTextView appCompatTextView = this.b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.m = resourceId3;
                AppCompatTextView appCompatTextView2 = this.c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            ywuVarY.A();
            if (R.string.abc_action_bar_up_description != rwq0Var.n) {
                rwq0Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = rwq0Var.n;
                    rwq0Var.j = i != 0 ? getContext().getString(i) : null;
                    rwq0Var.b();
                }
            }
            rwq0Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new k8v(rwq0Var));
            this.n1 = rwq0Var;
        }
        return rwq0Var;
    }

    public final int i(View view, int i) {
        gwq0 gwq0Var = (gwq0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = gwq0Var.f12039a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gwq0Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) gwq0Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) gwq0Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void l(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void m() {
        Iterator it = this.k1.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.j1.c).iterator();
        while (it2.hasNext()) {
            ((l1r) it2.next()).f19270a.n();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.k1 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.h1.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        gwq0 gwq0Var = (gwq0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) gwq0Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int i4 = i(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i4, iMax + measuredWidth, view.getMeasuredHeight() + i4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gwq0Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.u1);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1 = false;
        }
        if (!this.f1) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        gwq0 gwq0Var;
        gwq0 gwq0Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iO2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        AppCompatImageView appCompatImageView;
        View view;
        ActionMenuView actionMenuView;
        AppCompatImageButton appCompatImageButton;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.i1;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = rgu0.f30456a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (s(this.d)) {
            AppCompatImageButton appCompatImageButton2 = this.d;
            if (z3) {
                iP = p(appCompatImageButton2, i26, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(appCompatImageButton2, paddingLeft, iMin2, iArr);
            }
            if (s(this.h)) {
                appCompatImageButton = this.h;
                if (z3) {
                    iP = p(appCompatImageButton, iP, iMin2, iArr);
                } else {
                    iO = o(appCompatImageButton, iO, iMin2, iArr);
                }
            }
            if (s(this.f45299a)) {
                actionMenuView = this.f45299a;
                if (z3) {
                    iO = o(actionMenuView, iO, iMin2, iArr);
                } else {
                    iP = p(actionMenuView, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i26 - currentContentInsetRight);
            if (s(this.i)) {
                view = this.i;
                if (z3) {
                    iMin = p(view, iMin, iMin2, iArr);
                } else {
                    iMax = o(view, iMax, iMin2, iArr);
                }
            }
            if (s(this.e)) {
                appCompatImageView = this.e;
                if (z3) {
                    iMin = p(appCompatImageView, iMin, iMin2, iArr);
                } else {
                    iMax = o(appCompatImageView, iMax, iMin2, iArr);
                }
            }
            zS = s(this.b);
            zS2 = s(this.c);
            if (zS) {
                gwq0 gwq0Var3 = (gwq0) this.b.getLayoutParams();
                measuredHeight = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gwq0Var3).topMargin + ((ViewGroup.MarginLayoutParams) gwq0Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                gwq0 gwq0Var4 = (gwq0) this.c.getLayoutParams();
                measuredHeight = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gwq0Var4).topMargin + ((ViewGroup.MarginLayoutParams) gwq0Var4).bottomMargin + measuredHeight;
            }
            if (zS || zS2) {
                if (zS) {
                    appCompatTextView = this.b;
                } else {
                    appCompatTextView = this.c;
                }
                if (zS2) {
                    appCompatTextView2 = this.c;
                } else {
                    appCompatTextView2 = this.b;
                }
                gwq0Var = (gwq0) appCompatTextView.getLayoutParams();
                gwq0Var2 = (gwq0) appCompatTextView2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zS && this.b.getMeasuredWidth() > 0) || (zS2 && this.c.getMeasuredWidth() > 0);
                i6 = this.w & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gwq0Var).topMargin + this.r;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) gwq0Var).topMargin + this.r;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) gwq0Var).bottomMargin;
                        i17 = this.s;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gwq0Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gwq0Var2).bottomMargin) - this.s) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.p;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zS) {
                        gwq0 gwq0Var5 = (gwq0) this.b.getLayoutParams();
                        int measuredWidth2 = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gwq0Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zS2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((gwq0) this.c.getLayoutParams())).topMargin;
                        this.c.layout(iMin - this.c.getMeasuredWidth(), i28, iMin, this.c.getMeasuredHeight() + i28);
                        i13 = iMin - this.q;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.p;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zS) {
                        gwq0 gwq0Var6 = (gwq0) this.b.getLayoutParams();
                        int measuredWidth3 = this.b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gwq0Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zS2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((gwq0) this.c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.c.getMeasuredWidth() + iMax;
                        this.c.layout(iMax, i30, measuredWidth4, this.c.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.q;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.g1;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                gwq0 gwq0Var7 = (gwq0) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) gwq0Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) gwq0Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iO2) {
                if (i25 > iMin) {
                    iO2 = i24 - (i25 - iMin);
                } else {
                    iO2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i26;
        if (s(this.h)) {
            appCompatImageButton = this.h;
            if (z3) {
                iP = p(appCompatImageButton, iP, iMin2, iArr);
            } else {
                iO = o(appCompatImageButton, iO, iMin2, iArr);
            }
        }
        if (s(this.f45299a)) {
            actionMenuView = this.f45299a;
            if (z3) {
                iO = o(actionMenuView, iO, iMin2, iArr);
            } else {
                iP = p(actionMenuView, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i26 - currentContentInsetRight2);
        if (s(this.i)) {
            view = this.i;
            if (z3) {
                iMin = p(view, iMin, iMin2, iArr);
            } else {
                iMax = o(view, iMax, iMin2, iArr);
            }
        }
        if (s(this.e)) {
            appCompatImageView = this.e;
            if (z3) {
                iMin = p(appCompatImageView, iMin, iMin2, iArr);
            } else {
                iMax = o(appCompatImageView, iMax, iMin2, iArr);
            }
        }
        zS = s(this.b);
        zS2 = s(this.c);
        if (zS) {
            gwq0 gwq0Var8 = (gwq0) this.b.getLayoutParams();
            measuredHeight = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gwq0Var8).topMargin + ((ViewGroup.MarginLayoutParams) gwq0Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            gwq0 gwq0Var9 = (gwq0) this.c.getLayoutParams();
            measuredHeight = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gwq0Var9).topMargin + ((ViewGroup.MarginLayoutParams) gwq0Var9).bottomMargin + measuredHeight;
        }
        if (zS) {
            if (zS) {
                appCompatTextView = this.b;
            } else {
                appCompatTextView = this.c;
            }
            if (zS2) {
                appCompatTextView2 = this.c;
            } else {
                appCompatTextView2 = this.b;
            }
            gwq0Var = (gwq0) appCompatTextView.getLayoutParams();
            gwq0Var2 = (gwq0) appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.w & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gwq0Var).topMargin + this.r;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) gwq0Var).topMargin + this.r;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) gwq0Var).bottomMargin;
                    i17 = this.s;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gwq0Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gwq0Var2).bottomMargin) - this.s) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.p;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zS) {
                    gwq0 gwq0Var10 = (gwq0) this.b.getLayoutParams();
                    int measuredWidth5 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gwq0Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((gwq0) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i211, iMin, this.c.getMeasuredHeight() + i211);
                    i13 = iMin - this.q;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.p;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zS) {
                    gwq0 gwq0Var11 = (gwq0) this.b.getLayoutParams();
                    int measuredWidth6 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gwq0Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((gwq0) this.c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i35, measuredWidth7, this.c.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.q;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zS) {
                appCompatTextView = this.b;
            } else {
                appCompatTextView = this.c;
            }
            if (zS2) {
                appCompatTextView2 = this.c;
            } else {
                appCompatTextView2 = this.b;
            }
            gwq0Var = (gwq0) appCompatTextView.getLayoutParams();
            gwq0Var2 = (gwq0) appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.w & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gwq0Var).topMargin + this.r;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) gwq0Var).topMargin + this.r;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) gwq0Var).bottomMargin;
                    i17 = this.s;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gwq0Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gwq0Var2).bottomMargin) - this.s) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.p;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zS) {
                    gwq0 gwq0Var12 = (gwq0) this.b.getLayoutParams();
                    int measuredWidth8 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gwq0Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((gwq0) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i214, iMin, this.c.getMeasuredHeight() + i214);
                    i13 = iMin - this.q;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.p;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zS) {
                    gwq0 gwq0Var13 = (gwq0) this.b.getLayoutParams();
                    int measuredWidth9 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gwq0Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((gwq0) this.c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i36, measuredWidth10, this.c.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.q;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.g1;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax;
        while (i18 < size) {
            iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            gwq0 gwq0Var14 = (gwq0) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) gwq0Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) gwq0Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iO2) {
            if (i25 > iMin) {
                iO2 = i24 - (i25 - iMin);
            } else {
                iO2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = cmu0.f4626a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.d)) {
            r(this.d, i, 0, i2, this.o);
            iJ = j(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, k(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.h)) {
            r(this.h, i, 0, i2, this.o);
            iJ = j(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        Object[] objArr2 = objArr;
        int[] iArr = this.i1;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (s(this.f45299a)) {
            r(this.f45299a, i, iMax3, i2, this.o);
            iJ2 = j(this.f45299a) + this.f45299a.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f45299a) + this.f45299a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f45299a.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iJ2);
        if (s(this.i)) {
            iMax5 += q(this.i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, k(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (s(this.e)) {
            iMax5 += q(this.e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, k(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((gwq0) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.r + this.s;
        int i7 = this.p + this.q;
        if (s(this.b)) {
            q(this.b, i, i5 + i7, i2, i6, iArr);
            int iJ3 = j(this.b) + this.b.getMeasuredWidth();
            iK = k(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.c)) {
            iMax2 = Math.max(iMax2, q(this.c, i, i5 + i7, i2, iK + i6, iArr));
            iK += k(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        if (s(this.b) || s(this.c)) {
            iK += i6;
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.q1) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45367a);
        ActionMenuView actionMenuView = this.f45299a;
        ox30 ox30Var = actionMenuView != null ? actionMenuView.p : null;
        int i = savedState.c;
        if (i != 0 && this.p1 != null && ox30Var != null && (menuItemFindItem = ox30Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.d) {
            mx2 mx2Var = this.u1;
            removeCallbacks(mx2Var);
            post(mx2Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        qkg0 qkg0Var = this.t;
        boolean z = i == 1;
        if (z == qkg0Var.g) {
            return;
        }
        qkg0Var.g = z;
        if (!qkg0Var.h) {
            qkg0Var.f28883a = qkg0Var.e;
            qkg0Var.b = qkg0Var.f;
            return;
        }
        if (z) {
            int i2 = qkg0Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = qkg0Var.e;
            }
            qkg0Var.f28883a = i2;
            int i3 = qkg0Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = qkg0Var.f;
            }
            qkg0Var.b = i3;
            return;
        }
        int i4 = qkg0Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = qkg0Var.e;
        }
        qkg0Var.f28883a = i4;
        int i5 = qkg0Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = qkg0Var.f;
        }
        qkg0Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        xi xiVar;
        hz30 hz30Var;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        fwq0 fwq0Var = this.p1;
        if (fwq0Var != null && (hz30Var = fwq0Var.b) != null) {
            savedState.c = hz30Var.f13889a;
        }
        ActionMenuView actionMenuView = this.f45299a;
        savedState.d = (actionMenuView == null || (xiVar = actionMenuView.t) == null || !xiVar.k()) ? false : true;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        gwq0 gwq0Var = (gwq0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) gwq0Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int i4 = i(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i4, iMax, view.getMeasuredHeight() + i4);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gwq0Var).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.t1 != z) {
            this.t1 = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.h;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.h;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.q1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.u) {
            this.u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.e;
        if (drawable != null) {
            if (appCompatImageView == null) {
                appCompatImageView = new AppCompatImageView(getContext());
                this.e = appCompatImageView;
            }
            if (!n(appCompatImageView)) {
                b(this.e, true);
            }
        } else if (appCompatImageView != null && n(appCompatImageView)) {
            removeView(this.e);
            this.h1.remove(this.e);
        }
        AppCompatImageView appCompatImageView2 = this.e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            a4n0.l(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.d;
            if (appCompatImageButton != null && n(appCompatImageButton)) {
                removeView(this.d);
                this.h1.remove(this.d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(hwq0 hwq0Var) {
        this.l1 = hwq0Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f45299a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.c;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        } else if (appCompatTextView != null && n(appCompatTextView)) {
            removeView(this.c);
            this.h1.remove(this.c);
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.b;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!n(this.b)) {
                b(this.b, true);
            }
        } else if (appCompatTextView != null && n(appCompatTextView)) {
            removeView(this.b);
            this.h1.remove(this.b);
        }
        AppCompatTextView appCompatTextView3 = this.b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherB = f7.b(this);
            fwq0 fwq0Var = this.p1;
            byte b = 0;
            boolean z = (fwq0Var == null || fwq0Var.b == null || onBackInvokedDispatcherB == null || !isAttachedToWindow() || !this.t1) ? false : true;
            if (!z || this.s1 != null) {
                if (z || (onBackInvokedDispatcher = this.s1) == null) {
                    return;
                }
                f7.A(onBackInvokedDispatcher, this.r1);
                this.s1 = null;
                return;
            }
            ma3 ma3Var = this.r1;
            if (ma3Var == null) {
                ma3 ma3Var2 = new ma3(new ewq0(this, b), (byte) 6);
                this.r1 = ma3Var2;
                ma3Var = ma3Var2;
            }
            f7.z(onBackInvokedDispatcherB, ma3Var);
            this.s1 = onBackInvokedDispatcherB;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(epv0.U(i, getContext()));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(epv0.U(i, getContext()));
    }

    public void setLogo(int i) {
        setLogo(epv0.U(i, getContext()));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
