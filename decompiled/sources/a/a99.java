package a;

import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;

/* JADX INFO: loaded from: classes6.dex */
public final class a99 extends FrameLayout implements kao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f466a;
    public Function1 b;
    public Function0 c;
    public final ok50 d;
    public final ArrayList e;
    public List f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final LinkedHashMap r;
    public final LinkedHashMap s;
    public final LinkedHashMap t;
    public final LinkedHashMap u;
    public final Drawable v;
    public final ObjectAnimator w;
    public int x;
    public y89 y;
    public y89 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a99(Context context, boolean z) {
        super(context, null);
        context.getClass();
        this.f466a = z;
        this.c = new ej8((byte) 9);
        this.d = new ok50(this);
        this.e = new ArrayList(5);
        this.f = iun.f15405a;
        this.g = getResources().getDimensionPixelOffset(R.dimen.size_56);
        this.h = getResources().getDimensionPixelOffset(R.dimen.size_36);
        this.i = getResources().getDimensionPixelOffset(R.dimen.space_10);
        this.j = getResources().getDimensionPixelOffset(R.dimen.space_12);
        this.k = getResources().getDimensionPixelOffset(R.dimen.size_24);
        this.l = getResources().getDimensionPixelOffset(R.dimen.size_8);
        this.m = getResources().getDimensionPixelOffset(R.dimen.size_12);
        this.n = getResources().getDimensionPixelOffset(R.dimen.size_40);
        this.o = getResources().getDimensionPixelOffset(R.dimen.min_selected_navigation_tab_width);
        xh xhVar = new xh(this, (byte) 4);
        int color = z ? context.getColor(R.color.static_white_10) : m5d.b(R.attr.uikitBackground, context);
        this.p = color;
        this.q = z ? context.getColor(R.color.static_background_content) : m5d.b(R.attr.uikitBackgroundContent, context);
        this.r = new LinkedHashMap();
        this.s = new LinkedHashMap();
        this.t = new LinkedHashMap();
        this.u = new LinkedHashMap();
        Drawable drawable = getResources().getDrawable(R.drawable.rounded_full, context.getTheme());
        if (Build.VERSION.SDK_INT >= 29) {
            if (drawable != null) {
                kw2.g();
                drawable.setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_IN));
            }
        } else if (drawable != null) {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.getClass();
        this.v = drawableMutate;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(drawableMutate, "bounds", new RectEvaluator(), new Rect());
        objectAnimatorOfObject.setDuration(300L);
        objectAnimatorOfObject.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfObject.addUpdateListener(new fd5(this, (byte) 2));
        objectAnimatorOfObject.addListener(xhVar);
        this.w = objectAnimatorOfObject;
        setWillNotDraw(false);
    }

    @Override // a.kao0
    public final void a(String str, boolean z) {
        Object next;
        str.getClass();
        Iterator it = this.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((y89) next).getTag(), str));
        wak0 wak0Var = next instanceof wak0 ? (wak0) next : null;
        if (wak0Var != null) {
            wak0Var.a(z);
            wak0Var.b(c(wak0Var == this.y));
        }
    }

    @Override // a.kao0
    public final void b(int i, String str) {
        Object next;
        str.getClass();
        Iterator it = this.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((y89) next).getTag(), str));
        y89 y89Var = (y89) next;
        if (y89Var != null) {
            y89Var.setCount(Integer.valueOf(i));
        }
        if (y89Var != null) {
            int iC = c(y89Var == this.y);
            y89Var.m.i(iC);
            if5 if5Var = y89Var.n;
            if5Var.g = Integer.valueOf(iC);
            DsBadge dsBadge = if5Var.c;
            if (dsBadge != null) {
                dsBadge.d.e(iC);
            }
        }
    }

    public final int c(boolean z) {
        boolean z2 = this.f466a;
        int i = this.q;
        return (!z2 && z) ? this.p : i;
    }

    public final int d(y89 y89Var) {
        Integer numValueOf;
        y89 y89Var2 = this.y;
        LinkedHashMap linkedHashMap = this.t;
        if (y89Var2 == null) {
            Integer num = (Integer) linkedHashMap.get("NON_SELECTED_TAB_KEY");
            numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        } else if (y89Var2 != y89Var) {
            Object tag = y89Var2.getTag();
            numValueOf = (Integer) linkedHashMap.get(tag != null ? tag : "NON_SELECTED_TAB_KEY");
        } else {
            Object tag2 = y89Var2.getTag();
            numValueOf = (Integer) this.s.get(tag2 != null ? tag2 : "NON_SELECTED_TAB_KEY");
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final void e() {
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (i < childCount) {
            Object obj = this.e.get(i);
            obj.getClass();
            y89 y89Var = (y89) obj;
            int iD = d(y89Var);
            y89Var.setCalculatedWidth(iD);
            if (y89Var == this.y) {
                g(y89Var, i2);
            }
            int i3 = i2 + iD;
            int left = y89Var.getLeft();
            int right = y89Var.getRight();
            if (this.z == null) {
                y89Var.layout(i2, 0, i3, this.g);
            } else {
                y89Var.getAnimator().addUpdateListener(new z89(left, i2, right, i3, y89Var));
                y89Var.getAnimator().start();
            }
            i++;
            i2 = i3;
        }
    }

    public final void f() {
        int childCount = getChildCount() - 1;
        int i = 0;
        while (-1 < childCount) {
            Object obj = this.e.get(childCount);
            obj.getClass();
            y89 y89Var = (y89) obj;
            int iD = d(y89Var);
            y89Var.setCalculatedWidth(iD);
            if (y89Var == this.y) {
                g(y89Var, i);
            }
            int i2 = i + iD;
            int left = y89Var.getLeft();
            int right = y89Var.getRight();
            if (this.z == null) {
                y89Var.layout(i, 0, i2, this.g);
            } else {
                y89Var.getAnimator().addUpdateListener(new z89(left, i, right, i2, y89Var));
                y89Var.getAnimator().start();
            }
            childCount--;
            i = i2;
        }
    }

    public final void g(y89 y89Var, int i) {
        Object tag;
        Object tag2 = y89Var.getTag();
        LinkedHashMap linkedHashMap = this.r;
        Rect rect = (Rect) linkedHashMap.get(tag2);
        if (rect == null) {
            y89 y89Var2 = this.y;
            if (y89Var2 == null || (tag = y89Var2.getTag()) == null) {
                tag = "NON_SELECTED_TAB_KEY";
            }
            Integer num = (Integer) this.s.get(tag);
            int iIntValue = num != null ? num.intValue() : 0;
            int i2 = this.h;
            int i3 = this.i;
            rect = new Rect(i, i3, iIntValue + i, i2 + i3);
            linkedHashMap.put(y89Var.getTag(), rect);
        }
        Drawable drawable = this.v;
        if (!Intrinsics.d(drawable.getBounds(), new Rect())) {
            Object[] objArr = {drawable.getBounds(), rect};
            ObjectAnimator objectAnimator = this.w;
            objectAnimator.setObjectValues(objArr);
            objectAnimator.start();
            return;
        }
        drawable.setBounds(rect);
        y89 y89Var3 = this.y;
        if (y89Var3 != null) {
            int iC = c(true);
            y89Var3.m.i(iC);
            if5 if5Var = y89Var3.n;
            if5Var.g = Integer.valueOf(iC);
            DsBadge dsBadge = if5Var.c;
            if (dsBadge != null) {
                dsBadge.d.e(iC);
            }
        }
        invalidate();
    }

    public int getMaxItemHeight() {
        return this.x;
    }

    @Override // a.kao0
    public String getSelectedTabTag() {
        Object next;
        Iterator it = this.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((y89) next).isSelected());
        y89 y89Var = (y89) next;
        Object tag = y89Var != null ? y89Var.getTag() : null;
        String str = tag instanceof String ? (String) tag : null;
        return str == null ? "" : str;
    }

    public final Map<Object, Integer> getTitleTabWidths() {
        return this.u;
    }

    public final void h(View view) {
        this.z = this.y;
        this.y = view instanceof y89 ? (y89) view : null;
        for (y89 y89Var : this.e) {
            boolean zD = Intrinsics.d(y89Var, view);
            y89Var.setSelect(zD);
            int iC = c(zD);
            y89Var.m.i(iC);
            if5 if5Var = y89Var.n;
            if5Var.g = Integer.valueOf(iC);
            DsBadge dsBadge = if5Var.c;
            if (dsBadge != null) {
                dsBadge.d.e(iC);
            }
        }
        if (getLayoutDirection() == 0) {
            e();
        } else {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ObjectAnimator objectAnimator = this.w;
        objectAnimator.removeAllListeners();
        objectAnimator.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        this.v.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 0) {
            e();
        } else {
            f();
        }
        this.c.invoke();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.j + this.k + this.l + this.m;
        int size2 = (size - ((this.f.size() - 1) * this.n)) - i3;
        Integer numValueOf = Integer.valueOf(size / this.f.size());
        LinkedHashMap linkedHashMap = this.t;
        linkedHashMap.put("NON_SELECTED_TAB_KEY", numValueOf);
        for (y89 y89Var : this.e) {
            int iMeasureText = (int) y89Var.getDescriptionView().getPaint().measureText(y89Var.getDescriptionView().getText().toString());
            if (iMeasureText > size2) {
                iMeasureText = size2;
            }
            int i4 = this.o;
            if (iMeasureText >= i4 - i3) {
                i4 = iMeasureText + i3;
            }
            this.s.put(y89Var.getTag(), Integer.valueOf(i4));
            this.u.put(y89Var.getTag(), Integer.valueOf(iMeasureText));
            linkedHashMap.put(y89Var.getTag(), Integer.valueOf((size - i4) / (this.f.size() - 1)));
            measureChild(y89Var, i, i2);
        }
        setMeasuredDimension(size, this.g);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((y89) it.next()).setClickable(z);
        }
    }

    @Override // a.kao0
    public void setMaxItemHeight(int i) {
        if (i > this.x) {
            this.x = i;
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
        Iterator it = this.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((y89) next).getTag(), str));
        y89 y89Var = (y89) next;
        if (y89Var == null) {
            return;
        }
        if (getMeasuredWidth() == 0) {
            this.c = new gj4(this, y89Var, (byte) 23);
        } else {
            h(y89Var);
        }
    }

    public void setTabs(List<oao0> list) {
        list.getClass();
        this.f = list;
        for (oao0 oao0Var : list) {
            Context context = getContext();
            context.getClass();
            y89 y89Var = new y89(context, this.f466a);
            y89Var.setTag(oao0Var.f24938a);
            y89Var.setIcon(epv0.U(oao0Var.c, y89Var.getContext()));
            y89Var.setText(oao0Var.b);
            y89Var.setTabSelectListener(this.d);
            this.e.add(y89Var);
            addView(y89Var);
        }
    }
}
