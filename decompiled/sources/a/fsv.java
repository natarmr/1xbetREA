package a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class fsv extends xhe0 {
    public final nq8 u;
    public final Function2 v;
    public final RecyclerView w;
    public final qmk0 x;

    /* JADX WARN: Illegal instructions before constructor call */
    public fsv(nq8 nq8Var, Function2 function2, RecyclerView recyclerView, d930 d930Var) {
        d930Var.getClass();
        RecyclerView recyclerView2 = (RecyclerView) nq8Var.b;
        super(recyclerView2);
        this.u = nq8Var;
        this.v = function2;
        this.w = recyclerView;
        this.x = new qmk0(recyclerView2.getResources().getDimensionPixelOffset(R.dimen.space_6), recyclerView2.getResources().getDimensionPixelOffset(R.dimen.space_8), 0, recyclerView2.getResources().getDimensionPixelOffset(R.dimen.space_8), 0, 0, null, null, 468);
    }

    public final void t(int i, int i2) {
        nq8 nq8Var = this.u;
        yge0 adapter = ((RecyclerView) nq8Var.c).getAdapter();
        ArrayList arrayList = null;
        ybc ybcVar = adapter instanceof ybc ? (ybc) adapter : null;
        if (ybcVar == null) {
            return;
        }
        List<p6t0> list = (List) ybcVar.f;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (p6t0 p6t0Var : list) {
                p6t0Var.getClass();
                arrayList2.add((ifo0) p6t0Var);
            }
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            int i3 = 0;
            for (Object obj : arrayList2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList3.add(ifo0.c((ifo0) obj, i3 == i));
                i3 = i4;
            }
            arrayList = arrayList3;
        }
        ybcVar.f = arrayList;
        ybcVar.g();
        ((RecyclerView) nq8Var.c).y0(i);
        this.v.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
