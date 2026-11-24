package org.xplatform.tile_matching.presentation.views;

import a.bkx;
import a.iun;
import a.kie0;
import a.kkx;
import a.l1e0;
import a.ozp0;
import a.r3d;
import a.s470;
import a.xdq0;
import a.yip0;
import a.zdq0;
import a.zgp0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xplatform.tile_matching.presentation.views.TileMatchingGameFieldView;

/* JADX INFO: loaded from: classes6.dex */
public final class TileMatchingGameFieldView extends ViewGroup {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47117a;
    public List b;
    public List c;
    public final ArrayList d;
    public Function0 e;
    public s470 f;
    public Function2 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public TileMatchingGameFieldView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        iun iunVar = iun.f15405a;
        this.b = iunVar;
        this.c = iunVar;
        this.d = new ArrayList();
        this.e = new ozp0((byte) 21);
        this.f = s470.FRUIT_BLAST;
        this.g = new zgp0((byte) 28);
    }

    public final void a() {
        if (this.b.isEmpty() || ((zdq0) CollectionsKt.d0(this.b)).getY() != 0.0f) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        Iterator it = l1e0.o(0, 5).iterator();
        int i = 0;
        while (((kkx) it).hasNext()) {
            ((bkx) it).nextInt();
            Iterator it2 = l1e0.o(0, 5).iterator();
            while (((kkx) it2).hasNext()) {
                ((bkx) it2).nextInt();
                zdq0 zdq0Var = (zdq0) this.b.get(i);
                int i2 = this.f47117a;
                zdq0Var.layout(paddingLeft, paddingTop, paddingLeft + i2, i2 + paddingTop);
                zdq0Var.setY(paddingTop);
                paddingLeft += this.f47117a;
                i++;
            }
            paddingTop += this.f47117a;
            paddingLeft = getPaddingLeft();
        }
    }

    public final void b(List list) {
        final yip0 yip0Var = new yip0((Object) this, (Object) list, (byte) 13);
        final kie0 kie0Var = new kie0();
        for (final zdq0 zdq0Var : this.b) {
            final float y = zdq0Var.getY();
            zdq0Var.h(getMeasuredHeight() + y, new Function0() { // from class: a.req0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = TileMatchingGameFieldView.h;
                    zdq0 zdq0Var2 = zdq0Var;
                    zdq0Var2.setY(y);
                    zdq0Var2.setVisibility(8);
                    kie0 kie0Var2 = kie0Var;
                    int i2 = kie0Var2.f18333a + 1;
                    kie0Var2.f18333a = i2;
                    if (i2 == 25) {
                        yip0Var.invoke();
                    }
                    return Unit.f46060a;
                }
            });
        }
    }

    public final void c() {
        Object next;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((zdq0) it.next()).i();
        }
        for (xdq0 xdq0Var : r3d.r(this.c)) {
            Iterator it2 = this.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                zdq0 zdq0Var = (zdq0) next;
                if (zdq0Var.getRow$tile_matching() == xdq0Var.b && zdq0Var.getColumn$tile_matching() == xdq0Var.c) {
                    break;
                }
            }
            zdq0 zdq0Var2 = (zdq0) next;
            if (zdq0Var2 != null) {
                zdq0Var2.g();
            }
        }
    }

    public final void d(List list) {
        Object next;
        for (zdq0 zdq0Var : this.b) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                xdq0 xdq0Var = (xdq0) next;
                if (xdq0Var.b == zdq0Var.getRow$tile_matching() && xdq0Var.c == zdq0Var.getColumn$tile_matching()) {
                    break;
                }
            }
            xdq0 xdq0Var2 = (xdq0) next;
            if (xdq0Var2 != null) {
                zdq0Var.setType$tile_matching(xdq0Var2.f40708a);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 5;
        this.f47117a = measuredWidth;
        setMeasuredDimension(getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + (measuredWidth * 5));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f47117a, 1073741824);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            measureChild((zdq0) it.next(), iMakeMeasureSpec, iMakeMeasureSpec);
        }
    }

    public final void setCells$tile_matching(List<xdq0> list) {
        list.getClass();
        d(list);
    }

    public final void setWinCells$tile_matching(List<? extends List<xdq0>> list) {
        list.getClass();
        this.c = list;
        c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileMatchingGameFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileMatchingGameFieldView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
