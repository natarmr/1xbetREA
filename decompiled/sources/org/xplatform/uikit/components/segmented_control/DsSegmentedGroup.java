package org.xplatform.uikit.components.segmented_control;

import a.aim;
import a.bqd0;
import a.hgn;
import a.ihu0;
import a.ivb0;
import a.jf4;
import a.ktt0;
import a.kul0;
import a.lqm;
import a.lul0;
import a.nqm;
import a.ofn;
import a.pgi0;
import a.q3d;
import a.ske;
import a.tje;
import a.v4i0;
import a.vvh0;
import a.ymx;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.xbet.client1.R;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSegmentedGroup extends LinearLayout {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47260a;
    public final boolean b;
    public int c;
    public final int d;
    public final Drawable e;
    public final Rect f;
    public final hgn g;
    public final kul0 h;
    public int i;
    public final lqm j;
    public final ArrayList k;
    public Function1 l;
    public Function1 m;
    public ymx n;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsSegmentedGroup(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.segmentGroupStyle, 0);
        this.f47260a = -1;
        this.c = -1;
        this.d = R.style.Widget_DSSegmentedItem;
        this.f = new Rect();
        hgn hgnVar = new hgn();
        hgnVar.f13023a = 0.0f;
        this.g = hgnVar;
        this.j = new lqm(this, (byte) 1);
        this.k = new ArrayList();
        this.m = new aim((byte) 13);
        this.n = ivb0.b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.i0, R.attr.segmentGroupStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(3);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.e = drawableMutate;
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 4);
        if (numL != null) {
            int iIntValue = numL.intValue();
            if (drawableMutate != null) {
                drawableMutate.setTint(iIntValue);
            }
        }
        this.d = typedArrayObtainStyledAttributes.getResourceId(2, R.style.Widget_DSSegmentedItem);
        this.f47260a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.b = typedArrayObtainStyledAttributes.getBoolean(1, this.b);
        typedArrayObtainStyledAttributes.recycle();
        if (drawableMutate != null) {
            kul0 kul0Var = new kul0(hgnVar);
            lul0 lul0Var = new lul0();
            lul0Var.a(1.0f);
            lul0Var.b(400.0f);
            kul0Var.m = lul0Var;
            ofn ofnVar = new ofn() { // from class: a.mqm
                @Override // a.ofn
                public final void h(float f) {
                    DsSegmentedGroup dsSegmentedGroup = this.f22232a;
                    Rect rect = dsSegmentedGroup.f;
                    int i2 = (int) f;
                    rect.left = i2;
                    rect.right = i2 + dsSegmentedGroup.i;
                    Drawable drawable2 = dsSegmentedGroup.e;
                    if (drawable2 != null) {
                        drawable2.setBounds(rect);
                    }
                    dsSegmentedGroup.invalidate();
                }
            };
            if (kul0Var.f) {
                v4i0.p("Error: Update listeners must be added beforethe animation.");
                throw null;
            }
            ArrayList arrayList = kul0Var.l;
            if (!arrayList.contains(ofnVar)) {
                arrayList.add(ofnVar);
            }
            this.h = kul0Var;
        }
    }

    public static void a(DsSegmentedGroup dsSegmentedGroup, vvh0 vvh0Var, boolean z, int i) {
        int size = dsSegmentedGroup.k.size();
        if ((i & 4) != 0) {
            z = false;
        }
        dsSegmentedGroup.b(dsSegmentedGroup.e(vvh0Var, z), size, vvh0Var);
    }

    public static /* synthetic */ void c(DsSegmentedGroup dsSegmentedGroup, View view, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = dsSegmentedGroup.k.size();
        }
        dsSegmentedGroup.b(view, i, null);
    }

    public static final Unit d(DsSegmentedGroup dsSegmentedGroup, DsSegmentItem dsSegmentItem) {
        Function1 function1;
        dsSegmentItem.getClass();
        int i = 0;
        for (Object obj : dsSegmentedGroup.getSegmentedViews()) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            if (Intrinsics.d((DsSegmentItem) obj, dsSegmentItem) && (function1 = dsSegmentedGroup.m) != null) {
                function1.invoke(Integer.valueOf(i));
            }
            i = i2;
        }
        return Unit.f46060a;
    }

    public static void f(DsSegmentedGroup dsSegmentedGroup, Function1 function1) {
        ymx ymxVar = dsSegmentedGroup.n;
        dsSegmentedGroup.getClass();
        ymxVar.getClass();
        dsSegmentedGroup.n = ymxVar;
        dsSegmentedGroup.l = function1;
    }

    private final Sequence<DsSegmentItem> getSegmentedViews() {
        return pgi0.h(new ihu0(this), ske.w);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        c(this, view, 0, 6);
    }

    public final void b(View view, int i, vvh0 vvh0Var) {
        DsSegmentItem dsSegmentItem = view instanceof DsSegmentItem ? (DsSegmentItem) view : null;
        if (dsSegmentItem == null) {
            jf4.o("Only DsSegmentItem instances can be added to DsSegmentedGroup");
            return;
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        if (i <= size) {
            size = i;
        }
        byte b = 0;
        if (size < 0) {
            size = 0;
        }
        if (vvh0Var == null) {
            vvh0Var = new vvh0();
            vvh0Var.a(dsSegmentItem.getText());
            vvh0Var.b = dsSegmentItem;
            dsSegmentItem.setText(vvh0Var.f38099a);
        }
        arrayList.add(size, vvh0Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        super.addView(dsSegmentItem, i, layoutParams);
        ymx ymxVar = this.n;
        ymxVar.getClass();
        dsSegmentItem.p = ymxVar;
        lqm lqmVar = this.j;
        dsSegmentItem.n = lqmVar;
        ymx ymxVar2 = this.n;
        lqm lqmVar2 = new lqm(this, b);
        ymxVar2.getClass();
        dsSegmentItem.p = ymxVar2;
        dsSegmentItem.o = lqmVar2;
        if (dsSegmentItem.isSelected()) {
            lqmVar.invoke(dsSegmentItem);
        }
    }

    public final DsSegmentItem e(vvh0 vvh0Var, boolean z) {
        DsSegmentItem dsSegmentItem = new DsSegmentItem(new tje(getContext(), this.d), null);
        vvh0Var.b = dsSegmentItem;
        dsSegmentItem.setText(vvh0Var.f38099a);
        if (z) {
            dsSegmentItem.k(true, false);
        }
        return dsSegmentItem;
    }

    public final void g(boolean z) {
        Object obj;
        Sequence<DsSegmentItem> segmentedViews = getSegmentedViews();
        segmentedViews.getClass();
        Iterator it = segmentedViews.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            obj = next;
        } else {
            obj = null;
        }
        DsSegmentItem dsSegmentItem = (DsSegmentItem) obj;
        Object objJ = pgi0.j(getSegmentedViews());
        for (DsSegmentItem dsSegmentItem2 : getSegmentedViews()) {
            if (dsSegmentItem2.isSelected()) {
                DsSegmentItem dsSegmentItem3 = (DsSegmentItem) objJ;
                if (dsSegmentItem3 != null) {
                    dsSegmentItem3.j(false, z);
                }
                dsSegmentItem2.j(false, z);
            } else {
                dsSegmentItem2.j(true ^ (dsSegmentItem2 == dsSegmentItem), z);
            }
            objJ = dsSegmentItem2;
        }
    }

    public final List<vvh0> getSegments() {
        return this.k;
    }

    public final int getSegmentsSize() {
        return this.k.size();
    }

    public final int getSelectedPosition() {
        int i = 0;
        for (Object obj : getSegmentedViews()) {
            if (i < 0) {
                q3d.p();
                throw null;
            }
            if (((DsSegmentItem) obj).isSelected()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void h(DsSegmentItem dsSegmentItem, boolean z) {
        int i = 0;
        for (Object obj : getSegmentedViews()) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            DsSegmentItem dsSegmentItem2 = (DsSegmentItem) obj;
            if (Intrinsics.d(dsSegmentItem2, dsSegmentItem)) {
                Function1 function1 = this.l;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i));
                }
            } else {
                dsSegmentItem2.k(false, z);
            }
            i = i2;
        }
    }

    public final void i(DsSegmentItem dsSegmentItem, boolean z) {
        if (!dsSegmentItem.isLaidOut() || dsSegmentItem.isLayoutRequested()) {
            dsSegmentItem.addOnLayoutChangeListener(new nqm(dsSegmentItem, this, z));
            return;
        }
        int x = (int) dsSegmentItem.getX();
        this.i = dsSegmentItem.getWidth();
        Rect rect = this.f;
        if (!rect.isEmpty() && z) {
            kul0 kul0Var = this.h;
            if (kul0Var != null) {
                kul0Var.a(x);
                return;
            }
            return;
        }
        dsSegmentItem.getHeight();
        rect.set(x, (int) dsSegmentItem.getY(), dsSegmentItem.getWidth() + x, dsSegmentItem.getHeight() + ((int) dsSegmentItem.getY()));
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.g.f13023a = x;
        dsSegmentItem.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f47260a;
        if (i3 >= 0 && View.MeasureSpec.getSize(i) > i3 && this.b) {
            i = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        view.getClass();
        DsSegmentItem dsSegmentItem = (DsSegmentItem) view;
        ymx ymxVar = this.n;
        ymxVar.getClass();
        dsSegmentItem.p = ymxVar;
        Object obj = null;
        dsSegmentItem.n = null;
        ArrayList arrayList = this.k;
        for (Object obj2 : arrayList) {
            if (((vvh0) obj2).b == dsSegmentItem) {
                obj = obj2;
                break;
            }
        }
        int iIndexOf = arrayList.indexOf((vvh0) obj);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
            if (arrayList.isEmpty()) {
                return;
            }
            int i = iIndexOf - 1;
            if (i < 0) {
                i = 0;
            }
            setSelectedPosition(i);
        }
    }

    public final void setOnSegmentClickedAndSelectedListener(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.m = function1;
    }

    public final void setSelectedPosition(int i) {
        Object next;
        Sequence<DsSegmentItem> segmentedViews = getSegmentedViews();
        segmentedViews.getClass();
        if (i >= 0) {
            Iterator it = segmentedViews.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int i3 = i2 + 1;
                if (i == i2) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        } else {
            next = null;
            break;
        }
        DsSegmentItem dsSegmentItem = (DsSegmentItem) next;
        if (dsSegmentItem != null) {
            if (this.c < 0) {
                dsSegmentItem.k(true, false);
                h(dsSegmentItem, false);
                i(dsSegmentItem, false);
                g(false);
            }
            dsSegmentItem.setSelected(true);
            this.c = i;
        }
    }

    public final void setSelectionPositionWithAnimation(int i) {
        DsSegmentItem dsSegmentItem;
        setSelectedPosition(i);
        vvh0 vvh0Var = (vvh0) CollectionsKt.W(i, this.k);
        if (vvh0Var == null || (dsSegmentItem = vvh0Var.b) == null) {
            return;
        }
        h(dsSegmentItem, true);
        i(dsSegmentItem, true);
    }

    public final void setSelectorColor(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(getContext().getColor(i));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        c(this, view, i, 4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        view.getClass();
        c(this, view, 0, 6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        c(this, view, i, 4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSegmentedGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSegmentedGroup(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
