package androidx.core.view.insets;

import a.apj0;
import a.b9o0;
import a.i2d0;
import a.jf4;
import a.p4d;
import a.twn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45357a;
    public i2d0 b;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f45357a = new ArrayList();
    }

    private b9o0 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof b9o0) {
            return (b9o0) tag;
        }
        b9o0 b9o0Var = new b9o0(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, b9o0Var);
        return b9o0Var;
    }

    public final void a() {
        ArrayList arrayList = this.f45357a;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        b9o0 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.b = new i2d0(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.b.f14042a.size() <= 0) {
            return;
        }
        p4d p4dVar = (p4d) this.b.f14042a.get(0);
        getContext();
        p4dVar.getClass();
        jf4.o(twn.m(0, "Unexpected side: "));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != c) {
            i2d0 i2d0Var = this.b;
            int childCount = getChildCount() - (i2d0Var != null ? i2d0Var.f14042a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.b != null) {
            removeViews(getChildCount() - this.b.f14042a.size(), this.b.f14042a.size());
            int size = this.b.f14042a.size();
            i2d0 i2d0Var = this.b;
            if (size > 0) {
                ((p4d) i2d0Var.f14042a.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = i2d0Var.f14042a;
            if (!i2d0Var.f) {
                i2d0Var.f = true;
                i2d0Var.b.b.remove(i2d0Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((p4d) arrayList.get(size2)).c = null;
                }
                arrayList.clear();
            }
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof b9o0) {
            b9o0 b9o0Var = (b9o0) tag;
            if (b9o0Var.b.isEmpty()) {
                b9o0Var.f2221a.post(new apj0(b9o0Var, (byte) 10));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<p4d> list) {
        ArrayList arrayList = this.f45357a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.f45357a = new ArrayList();
    }
}
