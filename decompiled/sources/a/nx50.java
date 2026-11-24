package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class nx50 extends ViewGroup implements sps0, dqs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24266a;
    public rh60 b;
    public int c;
    public mx50 d;
    public int e;

    private final void setAlphaToChests(float f) {
        IntRange intRangeO = l1e0.o(0, getChildCount());
        ArrayList arrayList = new ArrayList();
        for (Object obj : intRangeO) {
            if (((Number) obj).intValue() != this.f24266a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getChildAt(((Number) it.next()).intValue()).setAlpha(f);
        }
    }

    @Override // a.dqs0
    public final void a(int i, int i2, cym0 cym0Var) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            ((z9c) childAt).b();
        }
        View childAt2 = getChildAt(i);
        childAt2.getClass();
        setAlphaToChests(0.35f);
        ((z9c) childAt2).d(i2, cym0Var);
    }

    @Override // a.dqs0
    public final void b(boolean z) {
        egi0 egi0VarA = igi0.a((Function2) phu0.M(this).b);
        while (egi0VarA.hasNext()) {
            ((View) egi0VarA.next()).setEnabled(z);
        }
    }

    @Override // a.sps0
    public final void c() {
        this.d = mx50.f22536a;
    }

    @Override // a.dqs0
    public final void d(int i, int i2) {
        this.d = mx50.c;
        this.f24266a = i;
        View childAt = getChildAt(i);
        childAt.getClass();
        z9c z9cVar = (z9c) childAt;
        setAlphaToChests(0.35f);
        ((ImageView) z9cVar.f44009a.c).setImageResource(i2 > 0 ? R.drawable.ic_chest_gold : R.drawable.ic_chest_empty);
        z9cVar.f = y9c.f42237a;
    }

    @Override // a.sps0
    public final void f() {
        this.d = mx50.c;
        this.b.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.c;
        Iterator it = l1e0.o(0, 3).iterator();
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            ((bkx) it).nextInt();
            Iterator it2 = l1e0.o(0, 3).iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                ((bkx) it2).nextInt();
                int i9 = i7 + 1;
                View childAt = getChildAt(i7);
                int i10 = this.e;
                childAt.layout(i8, i6, i8 + i10, i10 + i6);
                i8 += this.e + i5;
                i7 = i9;
            }
            i6 += this.e + i5;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.c;
        int i4 = (measuredWidth - (i3 * 2)) / 3;
        this.e = i4;
        int i5 = (i3 * 2) + (i4 * 3);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        setMeasuredDimension(getMeasuredWidth(), i5);
        Iterator it = l1e0.o(0, getChildCount()).iterator();
        while (it.hasNext()) {
            measureChild(getChildAt(((bkx) it).nextInt()), iMakeMeasureSpec, iMakeMeasureSpec);
        }
    }

    @Override // a.dqs0
    public final void reset() {
        setAlphaToChests(1.0f);
        View childAt = getChildAt(this.f24266a);
        childAt.getClass();
        ((z9c) childAt).b();
    }

    @Override // a.dqs0
    public void setOnSelectedListener(rh60 rh60Var) {
        rh60Var.getClass();
        this.b = rh60Var;
    }
}
