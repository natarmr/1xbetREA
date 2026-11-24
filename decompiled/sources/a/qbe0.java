package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qbe0 implements s7k0 {
    public final View b;

    public qbe0(View view) {
        this.b = view;
    }

    public static umk a(int i, int i2, int i3) {
        if (i == -2) {
            return smk.f32450a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            rmk.a(i4);
            return new rmk(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        rmk.a(i5);
        return new rmk(i5);
    }

    public final f7k0 b() {
        View view = this.b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        umk umkVarA = a(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (umkVarA == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        umk umkVarA2 = a(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (umkVarA2 == null) {
            return null;
        }
        return new f7k0(umkVarA, umkVarA2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbe0) && Intrinsics.d(this.b, ((qbe0) obj).b);
    }

    @Override // a.s7k0
    public final Object f(yje yjeVar) {
        f7k0 f7k0VarB = b();
        if (f7k0VarB != null) {
            return f7k0VarB;
        }
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        yku0 yku0Var = new yku0(this, viewTreeObserver, n5aVar);
        viewTreeObserver.addOnPreDrawListener(yku0Var);
        n5aVar.t(new xg((Object) this, (Object) viewTreeObserver, (Object) yku0Var, (byte) 14));
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.b + ", subtractPadding=true)";
    }
}
