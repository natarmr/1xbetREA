package a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class upm0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6e f36073a;
    public final jru b;
    public final ieu c;
    public final f7u d;
    public final SparseArray e;
    public final SparseArray f;
    public final Rect g;

    public upm0(d6e d6eVar) {
        htz htzVar = new htz();
        sek sekVar = new sek();
        jru jruVar = new jru(htzVar);
        ieu ieuVar = new ieu(d6eVar, htzVar);
        f7u f7uVar = new f7u(d6eVar, ieuVar, htzVar, sekVar);
        this.f36073a = d6eVar;
        this.b = jruVar;
        this.c = ieuVar;
        this.d = f7uVar;
        this.e = new SparseArray();
        this.f = new SparseArray();
        this.g = new Rect();
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        super.f(rect, view, recyclerView, the0Var);
        int iU = RecyclerView.U(view);
        if (iU != -1 && this.d.m(iU, htz.e(recyclerView))) {
            View viewC = this.c.c(recyclerView, iU);
            int iD = htz.d(recyclerView);
            Rect rect2 = this.g;
            sek.p(rect2, viewC);
            if (iD == 1) {
                rect.top = viewC.getHeight() + rect2.top + rect2.bottom;
            } else {
                rect.left = viewC.getWidth() + rect2.left + rect2.right;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:59:0x017f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0185  */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    @Override // a.fhe0
    public final void h(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        int left;
        int i;
        Rect rect;
        int i2;
        int i3;
        int top;
        int iMax;
        RecyclerView recyclerView2;
        View viewE;
        int iU;
        View viewE2;
        View viewC;
        int iD;
        int iG;
        int left2;
        int iH;
        int top2;
        f7u f7uVar = this.d;
        Rect rect2 = (Rect) f7uVar.d;
        canvas.getClass();
        the0Var.getClass();
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0 || this.f36073a.d() <= 0) {
            return;
        }
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = recyclerView.getChildAt(i4);
            int iU2 = RecyclerView.U(childAt);
            if (iU2 != -1) {
                childAt.getClass();
                int iD2 = htz.d(recyclerView);
                sek.p(rect2, childAt);
                if (iD2 == 1) {
                    left = childAt.getTop();
                    i = rect2.top;
                } else {
                    left = childAt.getLeft();
                    i = rect2.left;
                }
                boolean z = left <= i && ((d6e) f7uVar.b).C(iU2) >= 0;
                if (z || f7uVar.m(iU2, htz.e(recyclerView))) {
                    View viewC2 = this.c.c(recyclerView, iU2);
                    if (z) {
                        SparseArray sparseArray = this.f;
                        rect = (Rect) sparseArray.get(iU2);
                        if (rect == null) {
                            rect = new Rect();
                            sparseArray.put(iU2, rect);
                        }
                    } else {
                        SparseArray sparseArray2 = this.e;
                        rect = (Rect) sparseArray2.get(iU2);
                        if (rect == null) {
                            rect = new Rect();
                            sparseArray2.put(iU2, rect);
                        }
                    }
                    ieu ieuVar = (ieu) f7uVar.c;
                    Rect rect3 = (Rect) f7uVar.e;
                    int iD3 = htz.d(recyclerView);
                    sek.p(rect2, viewC2);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i3 = marginLayoutParams.leftMargin;
                        i2 = marginLayoutParams.topMargin;
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                    if (iD3 == 1) {
                        iMax = (childAt.getLeft() - i3) + rect2.left;
                        top = Math.max(((childAt.getTop() - i2) - viewC2.getHeight()) - rect2.bottom, f7u.h(recyclerView) + rect2.top);
                    } else {
                        top = rect2.top + (childAt.getTop() - i2);
                        iMax = Math.max(((childAt.getLeft() - i3) - viewC2.getWidth()) - rect2.right, f7u.g(recyclerView) + rect2.left);
                    }
                    rect.set(iMax, top, viewC2.getWidth() + iMax, viewC2.getHeight() + top);
                    if (z && (viewE = f7uVar.e(recyclerView, viewC2)) != null && (iU = RecyclerView.U(viewE)) != -1) {
                        boolean zE = htz.e(recyclerView);
                        if (iU > 0 && f7uVar.m(iU, zE)) {
                            View viewC3 = ieuVar.c(recyclerView, iU);
                            sek.p(rect2, viewC3);
                            sek.p(rect3, viewC2);
                            if (htz.d(recyclerView) == 1) {
                                if (((viewE.getTop() - rect2.bottom) - viewC3.getHeight()) - rect2.top < viewC2.getBottom() + recyclerView.getPaddingTop() + rect3.top + rect3.bottom) {
                                    viewE2 = f7uVar.e(recyclerView, viewC2);
                                    if (viewE2 != null) {
                                        viewC = ieuVar.c(recyclerView, RecyclerView.U(viewE2));
                                        iD = htz.d(recyclerView);
                                        sek.p(rect2, viewC);
                                        sek.p(rect3, viewC2);
                                        if (iD == 1) {
                                            iH = f7u.h(recyclerView) + rect3.top + rect3.bottom;
                                            top2 = ((((viewE2.getTop() - viewC.getHeight()) - rect2.bottom) - rect2.top) - viewC2.getHeight()) - iH;
                                            if (top2 < iH) {
                                                rect.top += top2;
                                            }
                                        } else {
                                            iG = f7u.g(recyclerView) + rect3.left + rect3.right;
                                            left2 = ((((viewE2.getLeft() - viewC.getWidth()) - rect2.right) - rect2.left) - viewC2.getWidth()) - iG;
                                            if (left2 < iG) {
                                                rect.left += left2;
                                            }
                                        }
                                    }
                                }
                            } else if (((viewE.getLeft() - rect2.right) - viewC3.getWidth()) - rect2.left < viewC2.getRight() + recyclerView.getPaddingLeft() + rect3.left + rect3.right) {
                                viewE2 = f7uVar.e(recyclerView, viewC2);
                                if (viewE2 != null) {
                                    viewC = ieuVar.c(recyclerView, RecyclerView.U(viewE2));
                                    iD = htz.d(recyclerView);
                                    sek.p(rect2, viewC);
                                    sek.p(rect3, viewC2);
                                    if (iD == 1) {
                                        iH = f7u.h(recyclerView) + rect3.top + rect3.bottom;
                                        top2 = ((((viewE2.getTop() - viewC.getHeight()) - rect2.bottom) - rect2.top) - viewC2.getHeight()) - iH;
                                        if (top2 < iH) {
                                            rect.top += top2;
                                        }
                                    } else {
                                        iG = f7u.g(recyclerView) + rect3.left + rect3.right;
                                        left2 = ((((viewE2.getLeft() - viewC.getWidth()) - rect2.right) - rect2.left) - viewC2.getWidth()) - iG;
                                        if (left2 < iG) {
                                            rect.left += left2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Rect rect4 = (Rect) this.b.b;
                    canvas.save();
                    androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null && (recyclerView2 = layoutManager.b) != null && recyclerView2.h) {
                        sek.p(rect4, viewC2);
                        if (htz.d(recyclerView) == 1) {
                            rect4.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (recyclerView.getWidth() - recyclerView.getPaddingRight()) - rect4.right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                        } else {
                            rect4.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - rect4.bottom);
                        }
                        canvas.clipRect(rect4);
                    }
                    canvas.translate(rect.left, rect.top);
                    viewC2.draw(canvas);
                    canvas.restore();
                }
            }
            i4++;
            childCount = childCount;
        }
    }
}
