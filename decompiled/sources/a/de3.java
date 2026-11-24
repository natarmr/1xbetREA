package a;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import org.xplatform.bonus_games.impl.lottery.presentation.views.LotteryView;

/* JADX INFO: loaded from: classes.dex */
public final class de3 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5927a;
    public final /* synthetic */ Object b;

    public /* synthetic */ de3(Object obj, byte b) {
        this.f5927a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        int measuredHeight;
        byte b = this.f5927a;
        Object obj = this.b;
        switch (b) {
            case 0:
                androidx.appcompat.widget.b bVar = (androidx.appcompat.widget.b) obj;
                if (!bVar.getInternalPopup().f()) {
                    bVar.f.m(bVar.getTextDirection(), bVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver2 = bVar.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                ie3 ie3Var = (ie3) obj;
                androidx.appcompat.widget.b bVar2 = ie3Var.h1;
                if (bVar2.isAttachedToWindow() && bVar2.getGlobalVisibleRect(ie3Var.f1)) {
                    ie3Var.c();
                    ie3Var.q();
                } else {
                    ie3Var.dismiss();
                }
                break;
            case 2:
                wva wvaVar = (wva) obj;
                ArrayList arrayList = wvaVar.i;
                if (wvaVar.f() && arrayList.size() > 0 && !((vva) arrayList.get(0)).f38089a.y) {
                    View view = wvaVar.p;
                    if (view == null || !view.isShown()) {
                        wvaVar.dismiss();
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((vva) it.next()).f38089a.q();
                        }
                    }
                    break;
                }
                break;
            case 3:
                axe axeVar = (axe) obj;
                axeVar.I0();
                axeVar.q0().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
            case 4:
                uil uilVar = (uil) obj;
                ViewParent parent = uilVar.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                int height = ((view2 != null ? view2.getHeight() : 0) - uilVar.getHeight()) / 2;
                ViewParent parent2 = uilVar.getParent();
                parent2.getClass();
                wgm0.x(height, uilVar, parent2);
                break;
            case 5:
                LotteryView lotteryView = (LotteryView) obj;
                lotteryView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                for (int i = 0; i < 8; i++) {
                    Object obj2 = lotteryView.f46440a[i];
                    obj2.getClass();
                    View view3 = (View) obj2;
                    if (view3 != lotteryView.b) {
                        lotteryView.a(view3, i);
                    }
                }
                break;
            case 6:
                i820 i820Var = (i820) obj;
                if (i820Var.l1 != null) {
                    i820Var.G0().g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ConstraintLayout constraintLayout = i820Var.G0().g;
                    if (constraintLayout.getHeight() > 0) {
                        measuredHeight = constraintLayout.getHeight();
                    } else {
                        constraintLayout.measure(View.MeasureSpec.makeMeasureSpec(i820Var.G0().f26112a.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        measuredHeight = constraintLayout.getMeasuredHeight();
                    }
                    Fragment fragment = i820Var.y;
                    axe axeVar2 = fragment instanceof axe ? (axe) fragment : null;
                    if (axeVar2 != null) {
                        axeVar2.Q0(measuredHeight);
                    }
                }
                break;
            default:
                h4m0 h4m0Var = (h4m0) obj;
                a040 a040Var = h4m0Var.i;
                if (h4m0Var.f() && !a040Var.y) {
                    View view4 = h4m0Var.n;
                    if (view4 == null || !view4.isShown()) {
                        h4m0Var.dismiss();
                    } else {
                        a040Var.q();
                    }
                    break;
                }
                break;
        }
    }
}
