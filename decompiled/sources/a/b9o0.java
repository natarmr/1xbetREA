package a;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b9o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9o0 f2221a;
    public final ArrayList b = new ArrayList();
    public pfx c;
    public pfx d;
    public int e;

    public b9o0(ViewGroup viewGroup) {
        View childAt;
        pfx pfxVar = pfx.e;
        this.c = pfxVar;
        this.d = pfxVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a9o0 a9o0Var = new a9o0(this, viewGroup.getContext(), viewGroup);
        this.f2221a = a9o0Var;
        a9o0Var.setVisibility(8);
        a9o0Var.setWillNotDraw(true);
        b0l0 b0l0Var = new b0l0(this, (byte) 13);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(a9o0Var, b0l0Var);
        div0.a(a9o0Var, new yly(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(a9o0Var, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new j14(viewGroup, a9o0Var, (byte) 5));
        }
    }
}
