package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ptl implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27570a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public ptl(View view, stl stlVar, Boolean bool) {
        this.b = view;
        this.c = stlVar;
        this.d = bool;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int dimensionPixelSize;
        pfx pfxVarI;
        byte b = this.f27570a;
        Object obj = this.d;
        View view = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredHeight = view.getMeasuredHeight();
                stl stlVar = (stl) obj2;
                int dimensionPixelSize2 = stlVar.G().getDimensionPixelSize(R.dimen.space_12);
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.d(bool, bool2)) {
                    dimensionPixelSize = stlVar.G().getDimensionPixelSize(R.dimen.space_20);
                } else if (Intrinsics.d(bool, Boolean.FALSE) || bool == null) {
                    dimensionPixelSize = measuredHeight + dimensionPixelSize2;
                } else {
                    t9f.b();
                }
                iiy[] iiyVarArr = stl.f2;
                LinearLayout linearLayout = stlVar.P0().d;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = dimensionPixelSize;
                    linearLayout.setLayoutParams(marginLayoutParams);
                    if (Intrinsics.d(bool, bool2)) {
                        View viewO0 = stlVar.O0();
                        if (viewO0 != null) {
                            viewO0.setAlpha(0.0f);
                        }
                    } else if (Intrinsics.d(bool, Boolean.FALSE) || bool == null) {
                        View viewO1 = stlVar.O0();
                        if (viewO1 != null) {
                            viewO1.setAlpha(1.0f);
                        }
                    } else {
                        t9f.b();
                    }
                }
                break;
            default:
                rrm rrmVar = (rrm) obj2;
                f46 f46Var = rrmVar.i;
                if (!f46Var.isAttachedToWindow()) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    wdk0 wdk0Var = (wdk0) obj;
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    xiv0 xiv0VarA = jgu0.a(f46Var);
                    wdk0Var.m(rrmVar, (f46Var.getRootView().getHeight() - ((xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(2)) == null) ? 0 : pfxVarI.d)) - f46Var.getResources().getDimensionPixelSize(R.dimen.size_16));
                }
                break;
        }
    }

    public ptl(rrm rrmVar, View view, wdk0 wdk0Var) {
        this.c = rrmVar;
        this.b = view;
        this.d = wdk0Var;
    }
}
