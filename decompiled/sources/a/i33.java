package a;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i33 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bhu0 f14078a;
    public final /* synthetic */ e7z b;

    public i33(bhu0 bhu0Var, e7z e7zVar) {
        this.f14078a = bhu0Var;
        this.b = e7zVar;
    }

    @Override // a.tj30
    public final int a(cnx cnxVar, List list, int i) {
        bhu0 bhu0Var = this.f14078a;
        ViewGroup.LayoutParams layoutParams = bhu0Var.getLayoutParams();
        layoutParams.getClass();
        bhu0Var.measure(k33.m(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return bhu0Var.getMeasuredHeight();
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        bhu0 bhu0Var = this.f14078a;
        if (bhu0Var.getChildCount() == 0) {
            return vj30.x(vj30Var, p4e.k(j), p4e.j(j), new sy2((byte) 10));
        }
        if (p4e.k(j) != 0) {
            bhu0Var.getChildAt(0).setMinimumWidth(p4e.k(j));
        }
        if (p4e.j(j) != 0) {
            bhu0Var.getChildAt(0).setMinimumHeight(p4e.j(j));
        }
        int iK = p4e.k(j);
        int i = p4e.i(j);
        ViewGroup.LayoutParams layoutParams = bhu0Var.getLayoutParams();
        layoutParams.getClass();
        int iM = k33.m(iK, i, layoutParams.width);
        int iJ = p4e.j(j);
        int iH = p4e.h(j);
        ViewGroup.LayoutParams layoutParams2 = bhu0Var.getLayoutParams();
        layoutParams2.getClass();
        bhu0Var.measure(iM, k33.m(iJ, iH, layoutParams2.height));
        return vj30.x(vj30Var, bhu0Var.getMeasuredWidth(), bhu0Var.getMeasuredHeight(), new d33(bhu0Var, this.b, (byte) 2));
    }

    @Override // a.tj30
    public final int c(cnx cnxVar, List list, int i) {
        bhu0 bhu0Var = this.f14078a;
        ViewGroup.LayoutParams layoutParams = bhu0Var.getLayoutParams();
        layoutParams.getClass();
        bhu0Var.measure(k33.m(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return bhu0Var.getMeasuredHeight();
    }

    @Override // a.tj30
    public final int d(cnx cnxVar, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        bhu0 bhu0Var = this.f14078a;
        ViewGroup.LayoutParams layoutParams = bhu0Var.getLayoutParams();
        layoutParams.getClass();
        bhu0Var.measure(iMakeMeasureSpec, k33.m(0, i, layoutParams.height));
        return bhu0Var.getMeasuredWidth();
    }

    @Override // a.tj30
    public final int e(cnx cnxVar, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        bhu0 bhu0Var = this.f14078a;
        ViewGroup.LayoutParams layoutParams = bhu0Var.getLayoutParams();
        layoutParams.getClass();
        bhu0Var.measure(iMakeMeasureSpec, k33.m(0, i, layoutParams.height));
        return bhu0Var.getMeasuredWidth();
    }
}
