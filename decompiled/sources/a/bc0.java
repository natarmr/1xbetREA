package a;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;
import org.xplatform.main_menu.impl.presentation.common.views.AggregatorBanner;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2331a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bc0(Object obj, byte b) {
        this.f2331a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        siq fixedWebView;
        byte b = this.f2331a;
        Object obj = this.b;
        switch (b) {
            case 0:
                view.getClass();
                AggregatorBanner aggregatorBanner = (AggregatorBanner) obj;
                if (aggregatorBanner.r) {
                    x0x.s(aggregatorBanner);
                }
                break;
            case 1:
                rz2 rz2Var = (rz2) obj;
                Context context = view.getContext();
                if (!rz2Var.d) {
                    context.getApplicationContext().registerComponentCallbacks(rz2Var.f);
                    rz2Var.d = true;
                }
                break;
            case 3:
                view.getClass();
                bj5 bj5Var = bib.X1;
                ((bib) obj).K0();
                break;
            case 4:
                cxn cxnVar = (cxn) obj;
                AccessibilityManager accessibilityManager = cxnVar.t;
                if (cxnVar.u != null && accessibilityManager != null && cxnVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(cxnVar.u);
                    break;
                }
                break;
            case 5:
                view.getViewTreeObserver().addOnDrawListener((uhq) obj);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = rgu0.f30456a;
                view2.requestApplyInsets();
                break;
            case 9:
                view.getClass();
                break;
            case 10:
                view.getClass();
                l590 l590Var = (l590) obj;
                FixedWebView fixedWebView2 = l590Var.N1;
                if (fixedWebView2 != null && (fixedWebView = fixedWebView2.getFixedWebView()) != null) {
                    l590Var.J0(fixedWebView);
                    l590Var.H0();
                    break;
                }
                break;
            case 11:
                view.getClass();
                rl70 rl70Var = qwc0.Z1;
                ((qwc0) obj).K0();
                break;
            case 12:
                view.getClass();
                jh70 jh70Var = kxc0.Y1;
                ((kxc0) obj).K0();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f2331a) {
            case 0:
                view.getClass();
                AggregatorBanner aggregatorBanner = (AggregatorBanner) this.b;
                if (aggregatorBanner.r) {
                    x0x.O(aggregatorBanner);
                    return;
                }
                return;
            case 1:
                rz2 rz2Var = (rz2) this.b;
                Context context = view.getContext();
                if (rz2Var.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(rz2Var.f);
                    rz2Var.d = false;
                }
                ehf0 ehf0Var = rz2Var.e;
                if (ehf0Var != null) {
                    synchronized (ehf0Var) {
                        try {
                            hz40 hz40Var = (hz40) ehf0Var.b;
                            if (hz40Var != null) {
                                hz40Var.a();
                            }
                            ehf0Var.c = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                rz2Var.e = null;
                return;
            case 2:
                wva wvaVar = (wva) this.b;
                ViewTreeObserver viewTreeObserver = wvaVar.y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        wvaVar.y = view.getViewTreeObserver();
                    }
                    wvaVar.y.removeGlobalOnLayoutListener(wvaVar.j);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                view.getClass();
                return;
            case 4:
                cxn cxnVar = (cxn) this.b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = cxnVar.u;
                if (touchExplorationStateChangeListener == null || (accessibilityManager = cxnVar.t) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                return;
            case 5:
                view.removeOnAttachStateChangeListener(this);
                return;
            case 6:
                return;
            case 7:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.b;
                xwv xwvVar = hideBottomViewOnScrollBehavior.h;
                if (xwvVar == null || (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) == null) {
                    return;
                }
                accessibilityManager2.removeTouchExplorationStateChangeListener(xwvVar);
                hideBottomViewOnScrollBehavior.h = null;
                return;
            case 8:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.b;
                xwv xwvVar2 = hideViewOnScrollBehavior.c;
                if (xwvVar2 == null || (accessibilityManager3 = hideViewOnScrollBehavior.b) == null) {
                    return;
                }
                accessibilityManager3.removeTouchExplorationStateChangeListener(xwvVar2);
                hideViewOnScrollBehavior.c = null;
                return;
            case 9:
                view.getClass();
                view.removeOnLayoutChangeListener((vv5) this.b);
                view.removeOnAttachStateChangeListener(this);
                return;
            case 10:
                view.getClass();
                ((l590) this.b).O1 = false;
                return;
            case 11:
                view.getClass();
                return;
            case 12:
                view.getClass();
                return;
            case 13:
                h4m0 h4m0Var = (h4m0) this.b;
                ViewTreeObserver viewTreeObserver2 = h4m0Var.p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        h4m0Var.p = view.getViewTreeObserver();
                    }
                    h4m0Var.p.removeGlobalOnLayoutListener(h4m0Var.j);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((c4m0) this.b).cancel(null);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }
}
