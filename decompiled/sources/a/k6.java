package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class k6 extends FrameLayout implements kao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17742a;
    public Function1 b;
    public final h03 c;
    public final ArrayList d;
    public List e;
    public final int f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(Context context, boolean z) {
        super(context, null);
        context.getClass();
        this.f17742a = z;
        this.c = new h03((Object) this, (byte) 2);
        this.d = new ArrayList(5);
        this.e = iun.f15405a;
        this.f = getResources().getDimensionPixelOffset(R.dimen.space_2);
        this.g = z ? m5d.b(R.attr.uikitStaticBackgroundContent, context) : m5d.b(R.attr.uikitBackgroundContent, context);
        setClipChildren(false);
        setClipToPadding(false);
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
            wak0Var.b(this.g);
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
        int i2 = this.g;
        if (wak0Var != null) {
            wak0Var.b(i2);
        }
        fxy fxyVar = callback instanceof fxy ? (fxy) callback : null;
        if (fxyVar != null) {
            fxyVar.k.i(i2);
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
        return this.h;
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
            int height = this.getHeight() - measuredHeight;
            k6 k6Var = this;
            jmu0.f(i6, height, i6 + measuredWidth, height + measuredHeight, childAt, k6Var);
            i6 += measuredWidth + k6Var.f;
            i5++;
            this = k6Var;
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
        setMeasuredDimension(size2, getMaxItemHeight());
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
        if (i > this.h) {
            this.h = i;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.wak0, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.fxy, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.k6, android.view.View, android.view.ViewGroup] */
    public void setTabs(List<oao0> list) {
        ?? wak0Var;
        list.getClass();
        this.e = list;
        for (oao0 oao0Var : list) {
            boolean z = oao0Var.e;
            String str = oao0Var.b;
            int i = oao0Var.c;
            String str2 = oao0Var.f24938a;
            boolean z2 = this.f17742a;
            h03 h03Var = this.c;
            if (z) {
                Context context = getContext();
                context.getClass();
                wak0Var = new fxy(context, z2);
                wak0Var.setTag(str2);
                String str3 = oao0Var.f;
                if (str3 != null) {
                    Drawable drawableU = epv0.U(i, wak0Var.getContext());
                    ImageView imageView = wak0Var.l;
                    gbe0 gbe0VarA = o5k0.a(imageView.getContext());
                    k1x k1xVar = new k1x(imageView.getContext());
                    k1xVar.c = str3;
                    t1x.h(k1xVar, imageView);
                    t1x.d(k1xVar, drawableU);
                    t1x.g(k1xVar, drawableU);
                    k1xVar.e = new zpu(drawableU, wak0Var, (byte) 15);
                    gbe0VarA.a(k1xVar.a());
                } else {
                    wak0Var.setIcon(epv0.U(i, wak0Var.getContext()));
                }
                wak0Var.setText(str);
                wak0Var.setTabSelectListener(h03Var);
            } else {
                Context context2 = getContext();
                context2.getClass();
                wak0Var = new wak0(context2, z2);
                wak0Var.setTag(str2);
                wak0Var.setIcon(epv0.U(i, wak0Var.getContext()));
                wak0Var.setText(str);
                wak0Var.setTabSelectListener(h03Var);
            }
            this.d.add(wak0Var);
            addView(wak0Var);
        }
    }
}
