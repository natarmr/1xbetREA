package a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class w4d extends FrameLayout implements kao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38537a;
    public Function1 b;
    public final vqc c;
    public final ArrayList d;
    public List e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4d(Context context, boolean z) {
        super(context, null);
        context.getClass();
        this.f38537a = z;
        this.c = new vqc((Object) this, (byte) 6);
        this.d = new ArrayList(5);
        this.e = iun.f15405a;
        this.f = getResources().getDimensionPixelOffset(R.dimen.space_2);
        this.g = getResources().getDimensionPixelOffset(R.dimen.size_56);
        this.h = z ? context.getColor(R.color.static_background_content) : m5d.b(R.attr.uikitBackgroundContent, context);
    }

    @Override // a.kao0
    public final void a(String str, boolean z) {
        Object next;
        str.getClass();
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((View) next).getTag(), str));
        wak0 wak0Var = next instanceof wak0 ? (wak0) next : null;
        if (wak0Var != null) {
            wak0Var.a(z);
            wak0Var.b(this.h);
        }
    }

    @Override // a.kao0
    public final void b(int i, String str) {
        Object next;
        str.getClass();
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((View) next).getTag(), str));
        KeyEvent.Callback callback = (View) next;
        xoe xoeVar = callback instanceof xoe ? (xoe) callback : null;
        if (xoeVar != null) {
            xoeVar.setCount(Integer.valueOf(i));
        }
        wak0 wak0Var = callback instanceof wak0 ? (wak0) callback : null;
        if (wak0Var != null) {
            wak0Var.b(this.h);
        }
    }

    public final void c(View view) {
        for (View view2 : this.d) {
            if (view2 instanceof wak0) {
                ((wak0) view2).setSelect(view2 == view);
            }
            if (view2 instanceof fxy) {
                ((fxy) view2).setSelect(view2 == view);
            }
        }
    }

    public int getMaxItemHeight() {
        return this.i;
    }

    @Override // a.kao0
    public String getSelectedTabTag() {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((View) next).isSelected());
        View view = (View) next;
        Object tag = view != null ? view.getTag() : null;
        String str = tag instanceof String ? (String) tag : null;
        return str == null ? "" : str;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = paddingLeft;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = this.g;
            w4d w4dVar = this;
            jmu0.f(i6, i7 - measuredHeight, i6 + measuredWidth, i7, childAt, w4dVar);
            i6 += measuredWidth + w4dVar.f;
            i5++;
            this = w4dVar;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = this.e.size();
        int size2 = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size2 - ((size - 1) * this.f)) / size, 1073741824);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            measureChild((View) it.next(), iMakeMeasureSpec, i2);
        }
        setMeasuredDimension(size2, this.g);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setClickable(z);
        }
    }

    @Override // a.kao0
    public void setMaxItemHeight(int i) {
        if (i > this.i) {
            this.i = i;
        }
    }

    @Override // a.kao0
    public void setOnTabClickListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.b = function1;
    }

    @Override // a.kao0
    public void setSelectedTab(String str) {
        Object next;
        str.getClass();
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((View) next).getTag(), str));
        View view = (View) next;
        if (view == null) {
            return;
        }
        c(view);
    }

    public void setTabs(List<oao0> list) {
        list.getClass();
        this.e = list;
        for (oao0 oao0Var : list) {
            Context context = getContext();
            context.getClass();
            wak0 wak0Var = new wak0(context, this.f38537a);
            wak0Var.setTag(oao0Var.f24938a);
            wak0Var.setIcon(epv0.U(oao0Var.c, wak0Var.getContext()));
            wak0Var.setText(oao0Var.b);
            wak0Var.setTabSelectListener(this.c);
            this.d.add(wak0Var);
            addView(wak0Var);
        }
    }
}
