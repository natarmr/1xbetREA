package a;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class i14 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13978a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public i14(Function0 function0, k14 k14Var, View view) {
        this.f13978a = (byte) 0;
        this.d = function0;
        this.c = k14Var;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.f13978a;
        Object obj = this.c;
        Object obj2 = this.d;
        View view2 = this.b;
        switch (b) {
            case 0:
                k14 k14Var = (k14) obj;
                view.getClass();
                Function0 function0 = (Function0) obj2;
                View view3 = function0 != null ? (View) function0.invoke() : null;
                k14Var.h = new WeakReference(view3);
                gq80.b0(k14Var.f17500a, this.b, view3, k14Var.b, k14Var.c, k14Var.d);
                Integer num = k14Var.g;
                if (num != null) {
                    k14Var.e(num.intValue());
                } else {
                    Object parent = view2.getParent();
                    k14Var.f(parent instanceof View ? (View) parent : null, view3);
                }
                view2.getViewTreeObserver().addOnPreDrawListener(k14Var.k);
                if (!view2.isAttachedToWindow()) {
                    k14Var.c(view2);
                } else {
                    view2.addOnAttachStateChangeListener(new i14(view2, k14Var, view2));
                }
                break;
            case 1:
                view.getClass();
                break;
            case 2:
                view.getClass();
                view2.removeOnAttachStateChangeListener(this);
                ((ViewPager2) obj2).e(((bus) obj).f3248a, false);
                break;
            default:
                view.getClass();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.f13978a;
        Object obj = this.c;
        Object obj2 = this.d;
        View view2 = this.b;
        view.getClass();
        switch (b) {
            case 0:
                break;
            case 1:
                view2.removeOnAttachStateChangeListener(this);
                ((k14) obj).c((View) obj2);
                break;
            case 2:
                break;
            default:
                view2.removeOnAttachStateChangeListener(this);
                zie0 zie0Var = hxf0.V1;
                ((hxf0) obj2).G0().d.c((da0) obj);
                break;
        }
    }

    public /* synthetic */ i14(View view, Object obj, Object obj2, byte b) {
        this.f13978a = b;
        this.b = view;
        this.d = obj;
        this.c = obj2;
    }

    public i14(View view, k14 k14Var, View view2) {
        this.f13978a = (byte) 1;
        this.b = view;
        this.c = k14Var;
        this.d = view2;
    }
}
