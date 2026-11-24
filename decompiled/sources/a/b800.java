package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import org.xplatform.ui_core.viewcomponents.views.FrozenRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class b800 extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp f2134a;
    public final /* synthetic */ gkz b;
    public final /* synthetic */ gkz c;

    public b800(cp cpVar, gkz gkzVar, gkz gkzVar2) {
        this.f2134a = cpVar;
        this.b = gkzVar;
        this.c = gkzVar2;
    }

    @Override // a.lhe0
    public final void d(RecyclerView recyclerView, int i, int i2) {
        yfu0 yfu0Var = this.f2134a.u;
        int i3 = 0;
        View childAt = ((ssx) yfu0Var).d.getChildAt(0);
        if (childAt != null) {
            yz3 yz3Var = this.c.e;
            RecyclerView recyclerView2 = ((ssx) yfu0Var).d;
            int iU = RecyclerView.U(childAt);
            int i4 = -1;
            if (iU == -1) {
                return;
            }
            yz3 yz3Var2 = this.b.e;
            if (yz3Var2.f.get(iU) instanceof v700) {
                FrozenRecyclerView frozenRecyclerView = ((ssx) yfu0Var).c;
                List list = yz3Var.f;
                list.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((z700) it.next()) instanceof r700) {
                        i4 = i3;
                        break;
                    }
                    i3++;
                }
                frozenRecyclerView.y0(i4);
                return;
            }
            if (yz3Var2.f.get(iU) instanceof w700) {
                FrozenRecyclerView frozenRecyclerView2 = ((ssx) yfu0Var).c;
                List list2 = yz3Var.f;
                list2.getClass();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((z700) it2.next()) instanceof s700) {
                        i4 = i3;
                        break;
                    }
                    i3++;
                }
                frozenRecyclerView2.y0(i4);
                return;
            }
            if (yz3Var2.f.get(iU) instanceof x700) {
                FrozenRecyclerView frozenRecyclerView3 = ((ssx) yfu0Var).c;
                List list3 = yz3Var.f;
                list3.getClass();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (((z700) it3.next()) instanceof t700) {
                        i4 = i3;
                        break;
                    }
                    i3++;
                }
                frozenRecyclerView3.y0(i4);
            }
        }
    }
}
