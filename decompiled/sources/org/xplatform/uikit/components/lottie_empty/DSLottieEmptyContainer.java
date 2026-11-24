package org.xplatform.uikit.components.lottie_empty;

import a.a8z;
import a.ccf;
import a.ihu0;
import a.jgu0;
import a.jhu0;
import a.jkm;
import a.maz;
import a.pfx;
import a.rgu0;
import a.vef;
import a.w3d;
import a.wez;
import a.xiv0;
import a.z0i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes6.dex */
public final class DSLottieEmptyContainer extends FrameLayout {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47249a;
    public final z0i b;
    public final a8z c;

    /* JADX WARN: Illegal instructions before constructor call */
    public DSLottieEmptyContainer(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.b = new z0i(this, (byte) 0);
        this.c = maz.a(wez.b, new vef(context, attributeSet, (byte) 15));
        addView(getChildView());
    }

    public static Window c(Context context) {
        Window window;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            return window;
        }
        context.getClass();
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return c(baseContext);
    }

    public static final void d(DSLottieEmptyContainer dSLottieEmptyContainer) {
        if (dSLottieEmptyContainer.getVisibility() == 0) {
            Object parent = dSLottieEmptyContainer.getParent();
            parent.getClass();
            if (((View) parent).getVisibility() != 0 || dSLottieEmptyContainer.getAvailableChildHeight() == dSLottieEmptyContainer.f47249a) {
                return;
            }
            dSLottieEmptyContainer.getHandler().post(new ccf((Object) dSLottieEmptyContainer, (byte) 3));
        }
    }

    private final int getAvailableChildHeight() {
        return Math.min(getKeyboardTopYLocation(), getSnackTopYLocation()) - getTopYLocation();
    }

    private final DsLottieEmpty getChildView() {
        return (DsLottieEmpty) this.c.getValue();
    }

    private final int getContainerHeight() {
        int yLocation = getYLocation();
        int height = getRootView().getHeight();
        int snackHeight = getSnackHeight();
        Rect rect = new Rect();
        ViewParent parent = getParent();
        parent.getClass();
        ((ViewGroup) parent).getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom;
        int navBarHeight = (height - getNavBarHeight()) - snackHeight;
        if (i > navBarHeight) {
            i = navBarHeight;
        }
        return i - yLocation;
    }

    private final int getKeyboardTopYLocation() {
        Rect rect = new Rect();
        ViewParent parent = getParent();
        parent.getClass();
        ((ViewGroup) parent).getWindowVisibleDisplayFrame(rect);
        return rect.bottom;
    }

    private final int getNavBarHeight() {
        Object obj;
        pfx pfxVarI;
        Context context = getContext();
        context.getClass();
        View decorView = c(context).getDecorView();
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(decorView);
        int i = (xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(2)) == null) ? 0 : pfxVarI.d;
        View rootView = getRootView();
        rootView.getClass();
        Iterator it = new ihu0((ViewGroup) rootView).iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            View view = (View) next;
            view.getClass();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            jhu0 jhu0Var = viewGroup != null ? new jhu0(viewGroup) : null;
            if (jhu0Var == null || !jhu0Var.hasNext()) {
                while (!it.hasNext() && !arrayList.isEmpty()) {
                    it = (Iterator) CollectionsKt.d0(arrayList);
                    w3d.z(arrayList);
                }
            } else {
                arrayList.add(it);
                it = jhu0Var;
            }
            View view2 = (View) next;
            if ((view2 instanceof DsTabBar) && view2.getVisibility() == 0) {
                obj = next;
                break;
            }
        }
        View view3 = (View) obj;
        return i + (view3 != null ? view3.getHeight() : 0);
    }

    private final int getSnackHeight() {
        View viewFindViewById = getRootView().findViewById(R.id.snackBarView);
        if (viewFindViewById != null) {
            return viewFindViewById.getHeight();
        }
        return 0;
    }

    private final int getSnackTopYLocation() {
        View viewFindViewById = getRootView().findViewById(R.id.snackBarView);
        if (viewFindViewById == null || viewFindViewById.getVisibility() != 0) {
            return getRootView().getHeight();
        }
        ViewParent parent = viewFindViewById.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return getRootView().getHeight();
        }
        int i = -((int) viewGroup.getTranslationY());
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return getRootView().getHeight() - (viewFindViewById.getMeasuredHeight() + ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + i));
    }

    private final int getTopYLocation() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return iArr[1];
    }

    private final int getYLocation() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return iArr[1];
    }

    public final void a(jkm jkmVar) {
        jkmVar.getClass();
        getChildView().d(jkmVar);
    }

    public final void b(jkm jkmVar, long j, Function0 function0) {
        jkmVar.getClass();
        getChildView().e(jkmVar, j, function0);
    }

    public final AppCompatTextView getCaption() {
        return getChildView().getCaption();
    }

    public final AppCompatTextView getSubtitle() {
        return getChildView().getSubtitle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getRootView().getViewTreeObserver().addOnGlobalLayoutListener(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = View.MeasureSpec.getSize(i) - paddingRight;
        int size2 = View.MeasureSpec.getSize(i2) - paddingBottom;
        if (size2 <= 0) {
            size2 = getContainerHeight() - paddingBottom;
        }
        int availableChildHeight = getAvailableChildHeight();
        this.f47249a = availableChildHeight;
        int iMin = Math.min(availableChildHeight - paddingBottom, size2);
        getChildView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        setTag("lottie");
        setMeasuredDimension(size + paddingRight, size2 + paddingBottom);
    }

    public final void setButtonOnClickListener(Function0<Unit> function0) {
        function0.getClass();
        getChildView().setButtonOnClickListener(function0);
    }

    public final void setCenterInParent(boolean z) {
        getChildView().setCenterInParent(z);
    }

    public final void setSubtitleText(CharSequence charSequence) {
        getChildView().setSubtitleText(charSequence);
    }

    public final void setSubtitleVisible(boolean z) {
        getChildView().setSubtitleVisible(z);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        getChildView().setVisibility(i);
    }

    public final void setButtonOnClickListener(View.OnClickListener onClickListener) {
        getChildView().setButtonOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DSLottieEmptyContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DSLottieEmptyContainer(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
