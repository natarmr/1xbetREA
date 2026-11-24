package org.xplatform.uikit.components.lottie;

import a.a8z;
import a.bqd0;
import a.c4m0;
import a.dnq;
import a.dyb;
import a.e3c;
import a.f7k;
import a.fnq;
import a.gbv;
import a.hny;
import a.ihu0;
import a.ijf0;
import a.j9x;
import a.k9v;
import a.ktt0;
import a.lbk;
import a.m5d;
import a.maz;
import a.mbz;
import a.n0o0;
import a.pgi0;
import a.qos;
import a.r3w;
import a.ra10;
import a.rx00;
import a.slb;
import a.t010;
import a.vb3;
import a.vne;
import a.wb10;
import a.wez;
import a.xb10;
import a.yb10;
import a.yje;
import a.z0i;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final class LottieView extends ConstraintLayout {
    public static final /* synthetic */ int o1 = 0;
    public final a8z A;
    public final ValueAnimator B;
    public final ValueAnimator f1;
    public final boolean g1;
    public final boolean h1;
    public final boolean i1;
    public final float j1;
    public String k1;
    public Integer l1;
    public Integer m1;
    public c4m0 n1;
    public final LottieAnimationView q;
    public final TextView r;
    public final TextView s;
    public final DsButton t;
    public final n0o0 u;
    public final int v;
    public final n0o0 w;
    public final int x;
    public final z0i y;
    public final vb3 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public LottieView(Context context, AttributeSet attributeSet, int i) {
        byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b2 = 0;
        super(context, attributeSet, 0);
        View.inflate(context, getLayoutId(), this);
        View viewFindViewById = findViewById(R.id.lottieView);
        viewFindViewById.getClass();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        this.q = lottieAnimationView;
        View viewFindViewById2 = findViewById(R.id.tvMessage);
        viewFindViewById2.getClass();
        this.r = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tvCountDownMessage);
        viewFindViewById3.getClass();
        this.s = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.bButton);
        viewFindViewById4.getClass();
        this.t = (DsButton) viewFindViewById4;
        this.u = maz.b(new mbz(this, context, (byte) 15));
        int iM = f7k.M(96);
        this.v = iM;
        this.w = maz.b(new rx00(this, (byte) 5));
        this.x = f7k.M(16);
        this.y = new z0i(this, b);
        this.z = new vb3(this, b);
        this.A = maz.a(wez.b, new t010((byte) 24));
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.vb10
            public final /* synthetic */ LottieView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                byte b3 = b2;
                LottieView lottieView = this.b;
                switch (b3) {
                    case 0:
                        int i2 = LottieView.o1;
                        valueAnimator2.getClass();
                        LottieAnimationView lottieAnimationView2 = lottieView.q;
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        animatedValue.getClass();
                        jmu0.l(((Integer) animatedValue).intValue(), 0, 13, lottieAnimationView2);
                        break;
                    default:
                        int i3 = LottieView.o1;
                        valueAnimator2.getClass();
                        LottieAnimationView lottieAnimationView3 = lottieView.q;
                        ViewGroup.LayoutParams layoutParams = lottieAnimationView3.getLayoutParams();
                        if (layoutParams == null) {
                            hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        } else {
                            a3e a3eVar = (a3e) layoutParams;
                            Object animatedValue2 = valueAnimator2.getAnimatedValue();
                            animatedValue2.getClass();
                            int iIntValue = ((Integer) animatedValue2).intValue();
                            ((ViewGroup.MarginLayoutParams) a3eVar).width = iIntValue;
                            ((ViewGroup.MarginLayoutParams) a3eVar).height = iIntValue;
                            lottieAnimationView3.setLayoutParams(a3eVar);
                        }
                        break;
                }
            }
        });
        this.B = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        final byte b3 = 1;
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.vb10
            public final /* synthetic */ LottieView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                byte b4 = b3;
                LottieView lottieView = this.b;
                switch (b4) {
                    case 0:
                        int i2 = LottieView.o1;
                        valueAnimator3.getClass();
                        LottieAnimationView lottieAnimationView2 = lottieView.q;
                        Object animatedValue = valueAnimator3.getAnimatedValue();
                        animatedValue.getClass();
                        jmu0.l(((Integer) animatedValue).intValue(), 0, 13, lottieAnimationView2);
                        break;
                    default:
                        int i3 = LottieView.o1;
                        valueAnimator3.getClass();
                        LottieAnimationView lottieAnimationView3 = lottieView.q;
                        ViewGroup.LayoutParams layoutParams = lottieAnimationView3.getLayoutParams();
                        if (layoutParams == null) {
                            hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        } else {
                            a3e a3eVar = (a3e) layoutParams;
                            Object animatedValue2 = valueAnimator3.getAnimatedValue();
                            animatedValue2.getClass();
                            int iIntValue = ((Integer) animatedValue2).intValue();
                            ((ViewGroup.MarginLayoutParams) a3eVar).width = iIntValue;
                            ((ViewGroup.MarginLayoutParams) a3eVar).height = iIntValue;
                            lottieAnimationView3.setLayoutParams(a3eVar);
                        }
                        break;
                }
            }
        });
        this.f1 = valueAnimator2;
        this.i1 = true;
        this.k1 = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.Q, 0, 0);
        setLottieAnimation(String.valueOf(ktt0.p(typedArrayObtainStyledAttributes, context, 3)));
        setText(String.valueOf(ktt0.p(typedArrayObtainStyledAttributes, context, 6)));
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 1);
        int iIntValue = numL != null ? numL.intValue() : m5d.b(R.attr.uikitSecondary, context);
        Integer numL2 = ktt0.l(typedArrayObtainStyledAttributes, 5);
        B(numL2 != null ? numL2.intValue() : m5d.b(R.attr.uikitSecondary, context), iIntValue);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, this.g1);
        this.g1 = z;
        this.i1 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.h1 = typedArrayObtainStyledAttributes.getBoolean(4, this.h1);
        this.j1 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        int i2 = Build.VERSION.SDK_INT;
        lottieAnimationView.setRenderMode((i2 == 26 || i2 == 27) ? ijf0.c : ijf0.f14871a);
        if (z) {
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new yb10(this, b3));
                return;
            }
            C(true);
            int maxLottieHeight = getMaxLottieHeight();
            D(maxLottieHeight >= iM ? maxLottieHeight : iM, false);
        }
    }

    public static Window A(Context context) {
        Window window;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            return window;
        }
        context.getClass();
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return A(baseContext);
    }

    private final int getLayoutId() {
        return R.layout.lottie_view;
    }

    private final vne getMainScope() {
        return (vne) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMaxLottieHeight() {
        return ((Number) this.w.getValue()).intValue();
    }

    private final int getNavBarHeight() {
        return ((Number) this.u.getValue()).intValue();
    }

    private final int getSnackHeight() {
        View viewFindViewById = getRootView().findViewById(R.id.snackBarView);
        if (viewFindViewById != null) {
            return viewFindViewById.getHeight();
        }
        return 0;
    }

    private final int getYLocation() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return iArr[1];
    }

    private final void setButtonText(int i) {
        CharSequence text = getContext().getText(i);
        text.getClass();
        DsButton dsButton = this.t;
        dsButton.l(text);
        dsButton.setVisibility(text.length() > 0 ? 0 : 8);
    }

    private final void setLottieAnimation(String str) {
        if (str == null || !StringsKt.O(str, "lottie", false) || Intrinsics.d(this.k1, str)) {
            return;
        }
        this.k1 = str;
        LottieAnimationView lottieAnimationView = this.q;
        lottieAnimationView.setAnimation(str);
        if (lottieAnimationView.getVisibility() != 0 || lottieAnimationView.h.i()) {
            return;
        }
        lottieAnimationView.h();
    }

    public static final Unit y(Function0 function0, LottieView lottieView, ra10 ra10Var, View view) {
        view.getClass();
        function0.invoke();
        long j = ra10Var.e;
        TextView textView = lottieView.s;
        textView.animate().alpha(1.0f);
        byte b = 0;
        textView.setVisibility(0);
        c4m0 c4m0Var = lottieView.n1;
        byte b2 = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            lottieView.n1 = slb.U(new dnq(new fnq(new fnq(e3c.t(4, j), new wb10(lottieView, yjeVar, b2)), new xb10(lottieView, yjeVar, b2), (byte) 4), new gbv(lottieView, yjeVar, (byte) 5), b), lottieView.getMainScope());
        }
        return Unit.f46060a;
    }

    public static AppBarLayout z(ViewParent viewParent) {
        AppBarLayout appBarLayout;
        if (viewParent == null) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = viewParent instanceof CoordinatorLayout ? (CoordinatorLayout) viewParent : null;
        return (coordinatorLayout == null || (appBarLayout = (AppBarLayout) pgi0.j(pgi0.h(new ihu0(coordinatorLayout), j9x.B))) == null) ? z(viewParent.getParent()) : appBarLayout;
    }

    public final void B(int i, int i2) {
        this.r.setTextColor(i);
        this.s.setTextColor(i2);
    }

    public final void C(boolean z) {
        DsButton dsButton = this.t;
        TextView textView = this.r;
        boolean z2 = this.i1;
        LottieAnimationView lottieAnimationView = this.q;
        if (z2) {
            lottieAnimationView.animate().alpha(z ? 1.0f : 0.0f);
            textView.animate().alpha(1.0f);
            dsButton.animate().alpha(1.0f).getClass();
        } else {
            lottieAnimationView.setAlpha(z ? 1.0f : 0.0f);
            textView.setAlpha(1.0f);
            dsButton.setAlpha(1.0f);
        }
    }

    public final void D(int i, boolean z) {
        long j = z ? 150L : 0L;
        ValueAnimator valueAnimator = this.f1;
        valueAnimator.setDuration(j);
        valueAnimator.setIntValues(this.q.getHeight(), i);
        valueAnimator.start();
    }

    public final void E() {
        int height;
        Integer num;
        int yLocation = getYLocation();
        int height2 = getRootView().getHeight();
        int snackHeight = getSnackHeight();
        boolean z = this.h1;
        if (z) {
            height = getHeight();
        } else {
            Rect rect = new Rect();
            ViewParent parent = getParent();
            parent.getClass();
            ((ViewGroup) parent).getWindowVisibleDisplayFrame(rect);
            int i = rect.bottom;
            int navBarHeight = (height2 - getNavBarHeight()) - snackHeight;
            if (i > navBarHeight) {
                i = navBarHeight;
            }
            height = i - yLocation;
        }
        int height3 = this.t.getHeight() + this.r.getHeight();
        int i2 = this.x;
        int i3 = height3 + i2;
        Integer num2 = this.l1;
        if (z) {
            if (num2 != null && num2.intValue() == height && (num = this.m1) != null && num.intValue() == i3) {
                return;
            }
        } else if (num2 != null && num2.intValue() == height) {
            return;
        }
        this.m1 = Integer.valueOf(i3);
        int i4 = this.v;
        int i5 = i4 + i3;
        int maxLottieHeight = getMaxLottieHeight() + i3;
        boolean z2 = true;
        boolean z3 = i5 < height;
        int i6 = height - i3;
        int maxLottieHeight2 = getMaxLottieHeight();
        if (i6 > maxLottieHeight2) {
            i6 = maxLottieHeight2;
        }
        if (i6 >= i4) {
            i4 = i6;
        }
        Integer num3 = this.l1;
        D(i4, num3 == null || num3.intValue() != 0);
        int i7 = (int) (((height2 / 2) - yLocation) - ((1.0f - this.j1) * maxLottieHeight));
        int i8 = height - maxLottieHeight;
        int i9 = z3 ? 0 : (height - i5) + i2;
        if (i7 > i8) {
            i7 = i8;
        }
        if (i7 >= i9) {
            i9 = i7;
        }
        Integer num4 = this.l1;
        if (num4 != null && num4.intValue() == 0) {
            z2 = false;
        }
        long j = z2 ? 150L : 0L;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setDuration(j);
        ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        valueAnimator.setIntValues(marginLayoutParams != null ? marginLayoutParams.topMargin : 0, i9);
        valueAnimator.start();
        C(z3);
        this.l1 = Integer.valueOf(height);
    }

    public final void F() {
        if (this.g1 || this.l1 == null || getVisibility() != 0) {
            return;
        }
        Object parent = getParent();
        parent.getClass();
        if (((View) parent).getVisibility() == 0) {
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new yb10(this, (byte) 2));
            } else {
                E();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getRootView().getViewTreeObserver().addOnGlobalLayoutListener(this.y);
        AppBarLayout appBarLayoutZ = z(getParent());
        if (appBarLayoutZ != null) {
            appBarLayoutZ.a(this.z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.y);
        AppBarLayout appBarLayoutZ = z(getParent());
        if (appBarLayoutZ != null) {
            appBarLayoutZ.f(this.z);
        }
        e3c.n(this.n1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Integer num = this.m1;
        int height = this.t.getHeight() + this.r.getHeight() + this.x;
        if ((num != null && num.intValue() == height) || !this.h1) {
            return;
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new yb10(this, (byte) 0));
        } else {
            E();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == 0 || i2 == 0) {
            return;
        }
        int i5 = this.l1;
        if (i5 == null) {
            i5 = 0;
        }
        this.l1 = i5;
        F();
    }

    public final void setButtonClick(Function0<Unit> function0) {
        function0.getClass();
        dyb.O(this.t, new r3w(function0, (byte) 2));
    }

    public final void setButtonHorizontalPadding(int i) {
        DsButton dsButton = this.t;
        dsButton.setPadding(i, dsButton.getTop(), i, dsButton.getBottom());
    }

    public final void setButtonPaddingHorizontal(int i) {
        DsButton dsButton = this.t;
        dsButton.setPadding(i, dsButton.getPaddingTop(), i, dsButton.getPaddingBottom());
    }

    public final void setButtonWidthLayoutParams(int i) {
        DsButton dsButton = this.t;
        ViewGroup.LayoutParams layoutParams = dsButton.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.width = i;
            dsButton.setLayoutParams(layoutParams);
        }
    }

    @lbk
    public final void setJson(int i) {
        String string = getResources().getString(i);
        string.getClass();
        setLottieAnimation(string);
    }

    public final void setText(String str) {
        TextView textView = this.r;
        textView.setText(str);
        textView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LottieAnimationView lottieAnimationView = this.q;
            if (lottieAnimationView.getVisibility() != 0 || lottieAnimationView.h.i()) {
                return;
            }
            lottieAnimationView.h();
        }
    }

    public final void v(ra10 ra10Var) {
        ra10Var.getClass();
        e3c.n(this.n1);
        this.l1 = 0;
        setLottieAnimation(getResources().getString(ra10Var.f30112a));
        setText(ra10Var.b);
        setButtonText(ra10Var.c);
        Function0<Unit> function0 = ra10Var.d;
        if (function0 != null) {
            setButtonClick(function0);
        }
    }

    public final void w(ra10 ra10Var) {
        ra10Var.getClass();
        this.l1 = 0;
        setLottieAnimation(getResources().getString(ra10Var.f30112a));
        setText(ra10Var.b);
        setButtonText(ra10Var.c);
        Function0 function0 = ra10Var.d;
        if (function0 != null) {
            dyb.O(this.t, new k9v((Object) function0, (Object) this, (Object) ra10Var, (byte) 22));
        }
    }

    public final void x(ra10 ra10Var, Function0 function0) {
        ra10Var.getClass();
        v(ra10Var);
        TextView textView = this.s;
        textView.animate().alpha(1.0f);
        byte b = 0;
        textView.setVisibility(0);
        e3c.n(this.n1);
        yje yjeVar = null;
        this.n1 = slb.U(new dnq(new fnq(new fnq(e3c.t(4, ra10Var.e), new wb10(this, yjeVar, b)), new xb10(this, yjeVar, b), (byte) 4), new qos(this, function0, (yje) null), b), getMainScope());
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LottieView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LottieView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
