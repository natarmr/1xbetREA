package a;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.recycler.managers.ExpandableLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class wmo extends l900 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmo(ExpandableLayoutManager expandableLayoutManager, Context context) {
        super(context);
        this.q = (byte) 0;
        context.getClass();
        this.r = expandableLayoutManager;
    }

    @Override // a.she0
    public PointF a(int i) {
        switch (this.q) {
            case 0:
                return ((ExpandableLayoutManager) this.r).a(i);
            default:
                return super.a(i);
        }
    }

    @Override // a.l900, a.she0
    public void g(View view, the0 the0Var, qhe0 qhe0Var) {
        byte b = this.q;
        DecelerateInterpolator decelerateInterpolator = this.j;
        Object obj = this.r;
        switch (b) {
            case 1:
                tk80 tk80Var = (tk80) obj;
                int[] iArrC = tk80Var.c(tk80Var.f7722a.getLayoutManager(), view);
                int i = iArrC[0];
                int i2 = iArrC[1];
                int iCeil = (int) Math.ceil(((double) m(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
                if (iCeil > 0) {
                    qhe0Var.b(i, i2, iCeil, decelerateInterpolator);
                }
                break;
            case 2:
                efk0 efk0Var = (efk0) obj;
                RecyclerView recyclerView = efk0Var.f7722a;
                if (recyclerView != null) {
                    int[] iArrC2 = efk0Var.c(recyclerView.getLayoutManager(), view);
                    int i3 = iArrC2[0];
                    int i4 = iArrC2[1];
                    int iCeil2 = (int) Math.ceil(((double) m(Math.max(Math.abs(i3), Math.abs(i4)))) / 0.3356d);
                    if (iCeil2 > 0) {
                        qhe0Var.b(i3, i4, iCeil2, decelerateInterpolator);
                    }
                    break;
                }
                break;
            default:
                super.g(view, the0Var, qhe0Var);
                break;
        }
    }

    @Override // a.l900
    public int k(View view, int i) {
        switch (this.q) {
            case 0:
                view.getClass();
                return super.k(view, i) + 24;
            default:
                return super.k(view, i);
        }
    }

    @Override // a.l900
    public float l(DisplayMetrics displayMetrics) {
        int i;
        switch (this.q) {
            case 1:
                i = displayMetrics.densityDpi;
                break;
            case 2:
                i = displayMetrics.densityDpi;
                break;
            default:
                return super.l(displayMetrics);
        }
        return 100.0f / i;
    }

    @Override // a.l900
    public int m(int i) {
        switch (this.q) {
            case 0:
                int iM = super.m(i);
                if (iM < 120) {
                    return 120;
                }
                return iM;
            case 1:
                return Math.min(100, super.m(i));
            default:
                return super.m(i);
        }
    }

    @Override // a.l900
    public int n() {
        switch (this.q) {
            case 0:
                return -1;
            default:
                return super.n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmo(efk0 efk0Var, Context context, byte b) {
        super(context);
        this.q = b;
        this.r = efk0Var;
    }
}
