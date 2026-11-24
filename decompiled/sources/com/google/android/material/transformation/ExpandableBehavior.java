package com.google.android.material.transformation;

import a.ano;
import a.smo;
import a.yke;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends yke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45584a = 0;

    public ExpandableBehavior() {
    }

    @Override // a.yke
    public abstract boolean f(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.yke
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (ano) view2;
        boolean z = ((FloatingActionButton) obj).o.b;
        int i = this.f45584a;
        if (z) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        boolean z2 = ((FloatingActionButton) obj).o.b;
        this.f45584a = z2 ? 1 : 2;
        x((View) obj, view, z2, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.yke
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        ano anoVar;
        if (!view.isLaidOut()) {
            List listK = coordinatorLayout.k(view);
            int size = listK.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    anoVar = null;
                    break;
                }
                View view2 = (View) listK.get(i2);
                if (f(coordinatorLayout, view, view2)) {
                    anoVar = (ano) view2;
                    break;
                }
                i2++;
            }
            if (anoVar != null) {
                boolean z = ((FloatingActionButton) anoVar).o.b;
                int i3 = this.f45584a;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.f45584a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new smo(this, view, i4, anoVar));
                }
            }
        }
        return false;
    }

    public abstract void x(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
