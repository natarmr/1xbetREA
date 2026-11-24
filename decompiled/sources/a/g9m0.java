package a;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class g9m0 {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.h1 || !(view instanceof vbo0)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        vbo0 vbo0Var = (vbo0) view;
        int contentWidth = vbo0Var.getContentWidth();
        int contentHeight = vbo0Var.getContentHeight();
        int iL = (int) afn0.l(24, vbo0Var.getContext());
        if (contentWidth < iL) {
            contentWidth = iL;
        }
        int right = (vbo0Var.getRight() + vbo0Var.getLeft()) / 2;
        int bottom = (vbo0Var.getBottom() + vbo0Var.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static ulr0 b(int i) {
        Object next;
        c0o c0oVar = ulr0.l;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((ulr0) next).f35888a != i);
        ulr0 ulr0Var = (ulr0) next;
        return ulr0Var == null ? ulr0.NONE : ulr0Var;
    }

    public static yto0 c(long j) {
        Object next;
        c0o c0oVar = yto0.e;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((yto0) next).f43230a != j);
        yto0 yto0Var = (yto0) next;
        return yto0Var == null ? yto0.UNKNOWN : yto0Var;
    }

    public static ano0 d(Integer num) {
        if (num != null && num.intValue() == 26) {
            return ano0.b;
        }
        if (num != null && num.intValue() == 71) {
            return ano0.c;
        }
        return (num != null && num.intValue() == 70) ? ano0.d : ano0.e;
    }

    public static fks0 e(String str) {
        Object next;
        c0o c0oVar = fks0.f;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!Intrinsics.d(((fks0) next).name(), str));
        fks0 fks0Var = (fks0) next;
        return fks0Var == null ? fks0.Empty : fks0Var;
    }

    public void f(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(n73.c((int) rectFA.left, f, (int) rectFA2.left), drawable.getBounds().top, n73.c((int) rectFA.right, f, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
