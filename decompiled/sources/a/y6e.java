package a;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class y6e extends LinearLayoutManager {
    public final /* synthetic */ byte g1 = 0;
    public final /* synthetic */ Object h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6e(e7e e7eVar) {
        super(e7eVar.D());
        this.h1 = e7eVar;
        y1(true);
    }

    @Override // androidx.recyclerview.widget.b
    public boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        switch (this.g1) {
            case 1:
                return false;
            default:
                return super.E0(recyclerView, view, rect, z, z2);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public void R0(RecyclerView recyclerView, the0 the0Var, int i) {
        switch (this.g1) {
            case 0:
                if (i != -1) {
                    n900 n900Var = new n900(((e7e) this.h1).o0());
                    n900Var.f32207a = i;
                    S0(n900Var);
                }
                break;
            default:
                super.R0(recyclerView, the0Var, i);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public boolean T0() {
        switch (this.g1) {
            case 0:
                return false;
            default:
                return super.T0();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void U0(the0 the0Var, int[] iArr) {
        switch (this.g1) {
            case 1:
                ViewPager2 viewPager2 = (ViewPager2) this.h1;
                int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
                if (offscreenPageLimit != -1) {
                    int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
                    iArr[0] = pageSize;
                    iArr[1] = pageSize;
                } else {
                    super.U0(the0Var, iArr);
                }
                break;
            default:
                super.U0(the0Var, iArr);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public void j0(msj msjVar, the0 the0Var, k7 k7Var) {
        switch (this.g1) {
            case 1:
                super.j0(msjVar, the0Var, k7Var);
                ((ViewPager2) this.h1).t.getClass();
                break;
            default:
                super.j0(msjVar, the0Var, k7Var);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b
    public void k0(msj msjVar, the0 the0Var, View view, k7 k7Var) {
        int iT;
        int iT2;
        switch (this.g1) {
            case 1:
                ViewPager2 viewPager2 = (ViewPager2) ((ViewPager2) this.h1).t.d;
                if (viewPager2.getOrientation() == 1) {
                    viewPager2.g.getClass();
                    iT = androidx.recyclerview.widget.b.T(view);
                } else {
                    iT = 0;
                }
                if (viewPager2.getOrientation() == 0) {
                    viewPager2.g.getClass();
                    iT2 = androidx.recyclerview.widget.b.T(view);
                } else {
                    iT2 = 0;
                }
                k7Var.l(j7.a(false, iT, 1, iT2, 1));
                break;
            default:
                super.k0(msjVar, the0Var, view, k7Var);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public void s0(msj msjVar, the0 the0Var) {
        switch (this.g1) {
            case 0:
                msjVar.getClass();
                try {
                    super.s0(msjVar, the0Var);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                super.s0(msjVar, the0Var);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b
    public boolean y0(msj msjVar, the0 the0Var, int i, Bundle bundle) {
        switch (this.g1) {
            case 1:
                ((ViewPager2) this.h1).t.getClass();
                break;
        }
        return super.y0(msjVar, the0Var, i, bundle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6e(ViewPager2 viewPager2, Context context) {
        super(context);
        this.h1 = viewPager2;
    }
}
