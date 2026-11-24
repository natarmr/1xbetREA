package a;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class uon0 extends pvm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36025a;
    public int b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public uon0(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    @Override // a.pvm0
    public final void A(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        yk50 yk50Var;
        this.b = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            byte b = swipeDismissBehavior.e;
            if (b != 2 && (b != 0 ? b != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.f36025a;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f36025a;
                    if (left < i2) {
                        i = this.f36025a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f36025a - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f36025a) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f36025a;
                    if (left < i2) {
                        i = this.f36025a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f36025a - width;
                }
                z = true;
            } else {
                i = this.f36025a;
            }
        }
        if (swipeDismissBehavior.f45561a.n(i, view.getTop())) {
            view.postOnAnimation(new hii0(swipeDismissBehavior, view, z));
        } else {
            if (!z || (yk50Var = swipeDismissBehavior.b) == null) {
                return;
            }
            yk50Var.h(view);
        }
    }

    @Override // a.pvm0
    public final boolean C(View view, int i) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.x(view);
    }

    @Override // a.pvm0
    public final int m(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        byte b = this.c.e;
        if (b == 0) {
            width = this.f36025a;
            if (z) {
                width -= view.getWidth();
                width2 = this.f36025a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i2 = this.f36025a;
            if (b != 1) {
                width = i2 - view.getWidth();
                width2 = this.f36025a + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i2;
                width = i2;
            } else {
                width = i2 - view.getWidth();
                width2 = this.f36025a;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // a.pvm0
    public final int u(View view) {
        return view.getWidth();
    }

    @Override // a.pvm0
    public final void x(View view, int i) {
        this.b = i;
        this.f36025a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // a.pvm0
    public final void y(int i) {
        yk50 yk50Var = this.c.b;
        if (yk50Var != null) {
            d46 d46Var = ((g46) yk50Var.b).u;
            if (i == 0) {
                n660.q().F(d46Var);
            } else if (i == 1 || i == 2) {
                n660.q().C(d46Var);
            }
        }
    }

    @Override // a.pvm0
    public final void z(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float fAbs = Math.abs(i - this.f36025a);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }
}
