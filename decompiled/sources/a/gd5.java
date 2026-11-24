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
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class gd5 extends FrameLayout implements kao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11090a;
    public Function1 b;
    public gj4 c;
    public final bbw0 d;
    public final ArrayList e;
    public List f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final LinkedHashMap n;
    public final Drawable o;
    public final ObjectAnimator p;
    public int q;
    public wak0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd5(Context context, boolean z) {
        super(context, null);
        context.getClass();
        this.f11090a = z;
        this.d = new bbw0((Object) this, (byte) 8);
        this.e = new ArrayList(5);
        this.f = iun.f15405a;
        this.g = getResources().getDimensionPixelOffset(R.dimen.space_2);
        this.h = getResources().getDimensionPixelOffset(R.dimen.size_56);
        this.i = getResources().getDimensionPixelOffset(R.dimen.size_28);
        this.j = getResources().getDimensionPixelOffset(R.dimen.size_48);
        this.k = getResources().getDimensionPixelOffset(R.dimen.space_2);
        xh xhVar = new xh(this, (byte) 2);
        int color = z ? context.getColor(R.color.static_white_10) : m5d.b(R.attr.uikitBackground, context);
        this.l = color;
        this.m = z ? context.getColor(R.color.uikit_background_content_night) : m5d.b(R.attr.uikitBackgroundContent, context);
        this.n = new LinkedHashMap();
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
        this.o = drawableMutate;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(drawableMutate, "bounds", new RectEvaluator(), new Rect());
        objectAnimatorOfObject.setDuration(300L);
        objectAnimatorOfObject.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfObject.addUpdateListener(new fd5(this, (byte) 0));
        objectAnimatorOfObject.addListener(xhVar);
        this.p = objectAnimatorOfObject;
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
        } while (!Intrinsics.d(((View) next).getTag(), str));
        wak0 wak0Var = next instanceof wak0 ? (wak0) next : null;
        if (wak0Var != null) {
            wak0Var.a(z);
            wak0Var.b(c(wak0Var == this.r));
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
        } while (!Intrinsics.d(((View) next).getTag(), str));
        KeyEvent.Callback callback = (View) next;
        xoe xoeVar = callback instanceof xoe ? (xoe) callback : null;
        if (xoeVar != null) {
            xoeVar.setCount(Integer.valueOf(i));
        }
        wak0 wak0Var = callback instanceof wak0 ? (wak0) callback : null;
        if (wak0Var != null) {
            wak0Var.b(c(Intrinsics.d(callback, this.r)));
        }
    }

    public final int c(boolean z) {
        boolean z2 = this.f11090a;
        int i = this.m;
        return (!z2 && z) ? this.l : i;
    }

    public final void d(View view) {
        this.r = view instanceof wak0 ? (wak0) view : null;
        Rect rect = (Rect) this.n.get(view.getTag());
        if (rect == null) {
            this.c = new gj4(this, view, (byte) 9);
            return;
        }
        Drawable drawable = this.o;
        if (Intrinsics.d(drawable.getBounds(), new Rect())) {
            drawable.setBounds(rect);
            wak0 wak0Var = this.r;
            if (wak0Var != null) {
                wak0Var.b(c(true));
            }
            invalidate();
        } else {
            Object[] objArr = {drawable.getBounds(), rect};
            ObjectAnimator objectAnimator = this.p;
            objectAnimator.setObjectValues(objArr);
            objectAnimator.start();
        }
        for (View view2 : this.e) {
            wak0 wak0Var2 = view2 instanceof wak0 ? (wak0) view2 : null;
            boolean zD = Intrinsics.d(view2, view);
            if (wak0Var2 != null) {
                wak0Var2.setSelect(zD);
            }
            if (wak0Var2 != null) {
                wak0Var2.b(c(zD));
            }
        }
    }

    public int getMaxItemHeight() {
        return this.q;
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
        } while (!((View) next).isSelected());
        View view = (View) next;
        Object tag = view != null ? view.getTag() : null;
        String str = tag instanceof String ? (String) tag : null;
        return str == null ? "" : str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ObjectAnimator objectAnimator = this.p;
        objectAnimator.removeAllListeners();
        objectAnimator.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        this.o.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int layoutDirection = getLayoutDirection();
        int i5 = this.g;
        int i6 = this.i;
        LinkedHashMap linkedHashMap = this.n;
        int i7 = this.k;
        ArrayList arrayList = this.e;
        int i8 = 0;
        int i9 = this.h;
        int i10 = 2;
        int i11 = this.j;
        if (layoutDirection != 0) {
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (-1 >= childCount) {
                    break;
                }
                Object obj = arrayList.get(childCount);
                obj.getClass();
                View view = (View) obj;
                int measuredWidth = view.getMeasuredWidth();
                int i12 = i8 + measuredWidth;
                int measuredHeight = i9 - view.getMeasuredHeight();
                view.layout(i8, measuredHeight, i12, i9);
                int i13 = measuredHeight - i7;
                int iD = hne.d(i12, i8, 2, i8) - (i11 / 2);
                linkedHashMap.put(view.getTag(), new Rect(iD, i13, iD + i11, i13 + i6));
                i8 += measuredWidth + i5;
            }
        } else {
            int childCount2 = getChildCount();
            int i14 = 0;
            while (i8 < childCount2) {
                Object obj2 = arrayList.get(i8);
                obj2.getClass();
                View view2 = (View) obj2;
                int measuredWidth2 = view2.getMeasuredWidth();
                int i15 = i14 + measuredWidth2;
                int measuredHeight2 = i9 - view2.getMeasuredHeight();
                view2.layout(i14, measuredHeight2, i15, i9);
                int i16 = measuredHeight2 - i7;
                int iD2 = hne.d(i15, i14, i10, i14) - (i11 / 2);
                int i17 = i5;
                linkedHashMap.put(view2.getTag(), new Rect(iD2, i16, iD2 + i11, i16 + i6));
                i14 += measuredWidth2 + i17;
                i8++;
                childCount2 = childCount2;
                i5 = i17;
                i10 = 2;
            }
        }
        gj4 gj4Var = this.c;
        if (gj4Var != null) {
            gj4Var.invoke();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = this.f.size();
        int size2 = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size2 - ((size - 1) * this.g)) / size, 1073741824);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            measureChild((View) it.next(), iMakeMeasureSpec, i2);
        }
        setMeasuredDimension(size2, this.h);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setClickable(z);
        }
    }

    @Override // a.kao0
    public void setMaxItemHeight(int i) {
        if (i > this.q) {
            this.q = i;
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
        } while (!Intrinsics.d(((View) next).getTag(), str));
        View view = (View) next;
        if (view == null) {
            return;
        }
        d(view);
    }

    public void setTabs(List<oao0> list) {
        list.getClass();
        this.f = list;
        for (oao0 oao0Var : list) {
            Context context = getContext();
            context.getClass();
            wak0 wak0Var = new wak0(context, this.f11090a);
            wak0Var.setTag(oao0Var.f24938a);
            wak0Var.setIcon(epv0.U(oao0Var.c, wak0Var.getContext()));
            wak0Var.setText(oao0Var.b);
            wak0Var.setTabSelectListener(this.d);
            wak0Var.i = false;
            this.e.add(wak0Var);
            addView(wak0Var);
        }
    }
}
