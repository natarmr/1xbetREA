package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.components.badges.DsBadge;

/* JADX INFO: loaded from: classes6.dex */
public final class if5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14670a;
    public final Function0 b;
    public DsBadge c;
    public int d;
    public int e;
    public int f;
    public Integer g;
    public int h;
    public boolean i;
    public vf5 j;

    public if5(View view, Function0 function0) {
        view.getClass();
        this.f14670a = view;
        this.b = function0;
        this.d = 8388693;
    }

    public final void a(vf5 vf5Var) {
        if (vf5Var != null) {
            i(vf5Var);
            g(vf5Var);
        }
        DsBadge dsBadge = this.c;
        if (dsBadge != null) {
            dsBadge.setVisibility(vf5Var != null ? 0 : 8);
        }
        this.j = vf5Var;
    }

    public final void b(TypedArray typedArray) {
        int i = typedArray.getInt(7, -1);
        Integer numValueOf = Integer.valueOf(i);
        if (i == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i8m0 i8m0Var = (i8m0) tx3.G(numValueOf.intValue(), i8m0.values());
            if (i8m0Var != null) {
                vf5 vf5Var = vf5.g;
                i(vf5Var);
                g(vf5Var);
                DsBadge dsBadge = this.c;
                if (dsBadge != null) {
                    dsBadge.setImageResource(i8m0Var.f14347a);
                }
                DsBadge dsBadge2 = this.c;
                if (dsBadge2 != null) {
                    dsBadge2.setVisibility(0);
                }
                this.j = vf5Var;
            }
        }
        int i2 = typedArray.getInt(0, -1);
        Integer numValueOf2 = i2 != -1 ? Integer.valueOf(i2) : null;
        if (numValueOf2 != null) {
            vf5 vf5Var2 = (vf5) tx3.G(numValueOf2.intValue(), vf5.values());
            if (vf5Var2 != null) {
                a(vf5Var2);
            }
        }
    }

    public final void c(vf5 vf5Var, int i, int i2) {
        if (vf5Var != null) {
            i(vf5Var);
            h(vf5Var, i, i2);
        }
        DsBadge dsBadge = this.c;
        if (dsBadge != null) {
            dsBadge.setVisibility(vf5Var != null ? 0 : 8);
        }
        this.j = vf5Var;
    }

    public final void d(i8m0 i8m0Var, int i, int i2) {
        if (i8m0Var != null) {
            vf5 vf5Var = vf5.g;
            i(vf5Var);
            h(vf5Var, i, i2);
            DsBadge dsBadge = this.c;
            if (dsBadge != null) {
                dsBadge.setImageResource(i8m0Var.f14347a);
            }
        }
        DsBadge dsBadge2 = this.c;
        if (dsBadge2 != null) {
            dsBadge2.setVisibility(i8m0Var != null ? 0 : 8);
        }
        this.j = vf5.g;
    }

    public final void e(int i) {
        Context context = this.f14670a.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.f);
        this.d = typedArrayObtainStyledAttributes.getInt(1, this.d);
        this.e = ktt0.q(typedArrayObtainStyledAttributes, 2, 5);
        this.f = ktt0.q(typedArrayObtainStyledAttributes, 4, 6);
        b(typedArrayObtainStyledAttributes);
        DsBadge dsBadge = this.c;
        if (dsBadge != null) {
            dsBadge.d(this.d, this.e, this.f);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(AttributeSet attributeSet, int i) {
        Context context = this.f14670a.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.f, i, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, this.d);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.e = ktt0.q(typedArrayObtainStyledAttributes, 2, 5);
        this.f = ktt0.q(typedArrayObtainStyledAttributes, 4, 6);
        this.g = ktt0.l(typedArrayObtainStyledAttributes, 8);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g(vf5 vf5Var) {
        if (this.c == null) {
            Integer[] numArr = DsBadge.e;
            View view = this.f14670a;
            Context context = view.getContext();
            context.getClass();
            DsBadge dsBadgeB = ahb.B(context, vf5Var);
            jmu0.g(dsBadgeB);
            int measuredWidth = dsBadgeB.getMeasuredWidth();
            int measuredHeight = dsBadgeB.getMeasuredHeight();
            int i = this.h;
            if (i > 0) {
                this.e = ((measuredWidth - i) / 2) + this.e;
                this.f = ((measuredHeight - i) / 2) + this.f;
            }
            this.c = dsBadgeB;
            dsBadgeB.d(this.d, this.e, this.f);
            Integer num = this.g;
            if (num != null) {
                int iIntValue = num.intValue();
                DsBadge dsBadge = this.c;
                if (dsBadge != null) {
                    dsBadge.d.e(iIntValue);
                }
            }
            DsBadge dsBadge2 = this.c;
            if (dsBadge2 != null) {
                dsBadge2.a(view, this.b);
            }
            if (vf5Var == vf5.l) {
                k();
            }
        }
    }

    public final void h(vf5 vf5Var, int i, int i2) {
        if (this.c == null) {
            Integer[] numArr = DsBadge.e;
            View view = this.f14670a;
            Context context = view.getContext();
            context.getClass();
            DsBadge dsBadgeB = ahb.B(context, vf5Var);
            jmu0.g(dsBadgeB);
            int measuredWidth = dsBadgeB.getMeasuredWidth();
            int measuredHeight = dsBadgeB.getMeasuredHeight();
            int i3 = this.h;
            if (i3 > 0) {
                this.e = ((measuredWidth - i3) / 2) + this.e;
                this.f = ((measuredHeight - i3) / 2) + this.f;
            }
            this.c = dsBadgeB;
            dsBadgeB.d(this.d, i, i2);
            DsBadge dsBadge = this.c;
            if (dsBadge != null) {
                dsBadge.a(view, this.b);
            }
            if (vf5Var == vf5.l) {
                k();
            }
        }
    }

    public final void i(vf5 vf5Var) {
        if (this.j != vf5Var) {
            DsBadge dsBadge = this.c;
            if (dsBadge != null) {
                View view = this.f14670a;
                view.getClass();
                dsBadge.d.c(view);
            }
            this.c = null;
        }
    }

    public final void j(int i) {
        this.i = true;
        DsBadge dsBadge = this.c;
        if (dsBadge != null) {
            tl60.a(dsBadge, new le3(dsBadge, this, i, (byte) 1));
        }
    }

    public final void k() {
        DsBadge dsBadge;
        if (this.j != vf5.l || this.i) {
            return;
        }
        ViewParent parent = this.f14670a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || (dsBadge = this.c) == null) {
            return;
        }
        tl60.a(dsBadge, new hf5(dsBadge, this, viewGroup, (byte) 1));
    }
}
