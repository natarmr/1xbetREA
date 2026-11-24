package a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;
import org.xplatform.ui_core.circleindicator.CircleIndicator;

/* JADX INFO: loaded from: classes3.dex */
public final class gz6 extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12165a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gz6(Object obj, byte b) {
        this.f12165a = b;
        this.b = obj;
    }

    @Override // a.lhe0
    public void b(RecyclerView recyclerView, int i) {
        View viewE;
        switch (this.f12165a) {
            case 0:
                hz6 hz6Var = (hz6) this.b;
                zz2 zz2Var = hz6Var.h2;
                if (i != 1 && (viewE = hz6Var.e2.e(recyclerView.getLayoutManager())) != null) {
                    int iU = RecyclerView.U(viewE);
                    Integer numValueOf = Integer.valueOf(iU);
                    yje yjeVar = null;
                    if (iU == -1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        iiy[] iiyVarArr = hz6.q2;
                        zz2Var.I(hz6Var, iiyVarArr[2], iIntValue);
                        b07 b07VarU0 = hz6Var.U0();
                        int iIntValue2 = zz2Var.n(hz6Var, iiyVarArr[2]).intValue();
                        if (b07VarU0.u != iIntValue2) {
                            b07VarU0.u = iIntValue2;
                            rg5 rg5Var = (rg5) CollectionsKt.W(iIntValue2, b07VarU0.v);
                            if (rg5Var != null) {
                                b07VarU0.z(new tz6(true));
                                byte b = 0;
                                sac.V(jiu0.a(b07VarU0), new iz6(b07VarU0, b), null, b07VarU0.e.f22085a, new zz6(b07VarU0, rg5Var, yjeVar, b), 10);
                            }
                        }
                        hz6Var.L0().d.setHighlighted(zz2Var.n(hz6Var, iiyVarArr[2]).intValue());
                    }
                    break;
                }
                break;
        }
    }

    @Override // a.lhe0
    public void d(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        byte b = this.f12165a;
        Object obj = this.b;
        switch (b) {
            case 1:
                CircleIndicator circleIndicator = (CircleIndicator) obj;
                androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
                int i3 = CircleIndicator.o;
                circleIndicator.b(circleIndicator.e(layoutManager) == -1 ? circleIndicator.l : circleIndicator.e(recyclerView.getLayoutManager()));
                break;
            case 2:
                m0p m0pVar = (m0p) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i4 = m0pVar.f20965a;
                int iComputeVerticalScrollRange = m0pVar.s.computeVerticalScrollRange();
                int i5 = m0pVar.r;
                m0pVar.t = iComputeVerticalScrollRange - i5 > 0 && i5 >= i4;
                int iComputeHorizontalScrollRange = m0pVar.s.computeHorizontalScrollRange();
                int i6 = m0pVar.q;
                boolean z2 = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i4;
                m0pVar.u = z2;
                boolean z3 = m0pVar.t;
                if (z3 || z2) {
                    if (z3) {
                        float f = i5;
                        m0pVar.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                        m0pVar.k = Math.min(i5, (i5 * i5) / iComputeVerticalScrollRange);
                    }
                    if (m0pVar.u) {
                        float f2 = iComputeHorizontalScrollOffset;
                        float f3 = i6;
                        m0pVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                        m0pVar.n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
                    }
                    byte b2 = m0pVar.v;
                    if (b2 == 0 || b2 == 1) {
                        m0pVar.l(1);
                    }
                } else if (m0pVar.v != 0) {
                    m0pVar.l(0);
                }
                break;
            case 3:
                if (i2 > 0) {
                    androidx.recyclerview.widget.b layoutManager2 = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                    if (linearLayoutManager != null) {
                        ((Function1) obj).invoke(new w7e0(linearLayoutManager.h1(), linearLayoutManager.S()));
                        break;
                    }
                }
                break;
            case 4:
                u3s0 u3s0Var = (u3s0) obj;
                iiy[] iiyVarArr = u3s0.R1;
                View view = u3s0Var.G0().c;
                View view2 = u3s0Var.G0().b;
                z = recyclerView.computeVerticalScrollOffset() != 0;
                view.setVisibility(z ? 0 : 8);
                view2.setVisibility(z ? 8 : 0);
                break;
            case 5:
                z8s0 z8s0Var = (z8s0) obj;
                iiy[] iiyVarArr2 = z8s0.U1;
                View view3 = z8s0Var.G0().d;
                View view4 = z8s0Var.G0().c;
                z = recyclerView.computeVerticalScrollOffset() != 0;
                view3.setVisibility(z ? 0 : 8);
                view4.setVisibility(z ? 8 : 0);
                break;
            case 6:
                vju0 vju0Var = (vju0) obj;
                vju0.v(recyclerView, (BracketItemView) vju0Var.u.d, vju0Var.d());
                break;
        }
    }
}
