package a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fwq0 implements c040 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ox30 f10271a;
    public hz30 b;
    public final /* synthetic */ Toolbar c;

    public fwq0(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // a.c040
    public final void a(Context context, ox30 ox30Var) {
        hz30 hz30Var;
        ox30 ox30Var2 = this.f10271a;
        if (ox30Var2 != null && (hz30Var = this.b) != null) {
            ox30Var2.d(hz30Var);
        }
        this.f10271a = ox30Var;
    }

    @Override // a.c040
    public final boolean b(fzm0 fzm0Var) {
        return false;
    }

    @Override // a.c040
    public final void e() {
        if (this.b != null) {
            ox30 ox30Var = this.f10271a;
            if (ox30Var != null) {
                int size = ox30Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f10271a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            h(this.b);
        }
    }

    @Override // a.c040
    public final boolean g(hz30 hz30Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = hz30Var.getActionView();
        toolbar.i = actionView;
        this.b = hz30Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            gwq0 gwq0Var = new gwq0();
            gwq0Var.f12039a = (toolbar.n & 112) | 8388611;
            gwq0Var.b = (byte) 2;
            toolbar.i.setLayoutParams(gwq0Var);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((gwq0) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f45299a) {
                toolbar.removeViewAt(childCount);
                toolbar.h1.add(childAt);
            }
        }
        toolbar.requestLayout();
        hz30Var.C = true;
        hz30Var.n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof o1d) {
            ((o1d) callback).onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // a.c040
    public final boolean h(hz30 hz30Var) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof o1d) {
            ((o1d) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.h1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        hz30Var.C = false;
        hz30Var.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // a.c040
    public final boolean i() {
        return false;
    }

    @Override // a.c040
    public final void c(ox30 ox30Var, boolean z) {
    }
}
