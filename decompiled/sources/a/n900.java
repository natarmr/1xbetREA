package a;

import android.content.Context;
import android.graphics.PointF;
import android.javax.sip.message.Response;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.android.HwBuildEx;

/* JADX INFO: loaded from: classes6.dex */
public final class n900 extends she0 {
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public final float k;
    public int l;
    public int m;

    public n900(Context context) {
        context.getClass();
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // a.she0
    public final PointF a(int i) {
        Object obj = this.c;
        if (obj instanceof rhe0) {
            return ((rhe0) obj).a(i);
        }
        return null;
    }

    @Override // a.she0
    public final void d(int i, int i2, the0 the0Var, qhe0 qhe0Var) {
        the0Var.getClass();
        if (this.b.n.I() == 0) {
            h();
            return;
        }
        int i3 = this.l;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.l = i4;
        int i5 = this.m;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.m = i7;
        if (i4 == 0 && i7 == 0) {
            PointF pointFA = a(this.f32207a);
            if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
                qhe0Var.d = this.f32207a;
                h();
            } else {
                she0.b(pointFA);
                this.l = (int) (pointFA.x * 10000.0f);
                this.m = (int) (10000.0f * pointFA.y);
                qhe0Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(HwBuildEx.VersionCodes.CUR_DEVELOPMENT) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // a.she0
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    @Override // a.she0
    public final void g(View view, the0 the0Var, qhe0 qhe0Var) {
        int i;
        view.getClass();
        the0Var.getClass();
        androidx.recyclerview.widget.b bVar = this.c;
        int i2 = 0;
        if (bVar == null || !bVar.r()) {
            i = 0;
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            hhe0 hhe0Var = (hhe0) layoutParams;
            int iR = androidx.recyclerview.widget.b.R(view) - ((ViewGroup.MarginLayoutParams) hhe0Var).topMargin;
            int iL = androidx.recyclerview.widget.b.L(view) + ((ViewGroup.MarginLayoutParams) hhe0Var).bottomMargin;
            int paddingTop = bVar.getPaddingTop();
            int paddingBottom = (bVar.o - bVar.getPaddingBottom()) - paddingTop;
            int i3 = iL - iR;
            int iD = i3 > paddingBottom ? 0 : hne.d(paddingBottom, i3, 2, paddingTop);
            int i4 = i3 + iD;
            i = iD - iR;
            if (i <= 0 && (i = i4 - iL) >= 0) {
                i = 0;
            }
        }
        androidx.recyclerview.widget.b bVar2 = this.c;
        if (bVar2 != null && bVar2.q()) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.getClass();
            hhe0 hhe0Var2 = (hhe0) layoutParams2;
            int iN = androidx.recyclerview.widget.b.N(view) - ((ViewGroup.MarginLayoutParams) hhe0Var2).leftMargin;
            int iQ = androidx.recyclerview.widget.b.Q(view) + ((ViewGroup.MarginLayoutParams) hhe0Var2).rightMargin;
            int paddingStart = bVar2.getPaddingStart();
            int paddingEnd = (bVar2.n - bVar2.getPaddingEnd()) - paddingStart;
            int i5 = iQ - iN;
            int iD2 = i5 > paddingEnd ? 0 : hne.d(paddingEnd, i5, 2, paddingStart);
            int i6 = i5 + iD2;
            int i7 = iD2 - iN;
            if (i7 > 0) {
                i2 = i7;
            } else {
                int i8 = i6 - iQ;
                if (i8 < 0) {
                    i2 = i8;
                }
            }
        }
        int iCeil = (int) Math.ceil(((double) ((int) Math.ceil(Math.abs(i != 0 ? i : i2) * this.k))) / 0.3356d);
        if (iCeil > 0) {
            qhe0Var.b(-i2, -i, Math.max(Response.BAD_REQUEST, iCeil), this.j);
        }
    }

    @Override // a.she0
    public final void e() {
    }
}
