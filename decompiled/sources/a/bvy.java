package a;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class bvy extends q4 {
    public Function2 f;

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        avy avyVar = (avy) xhe0Var;
        rvy rvyVar = (rvy) A(i);
        n0o0 n0o0Var = avyVar.u;
        fvy fvyVar = (fvy) n0o0Var.getValue();
        rvyVar.getClass();
        fvyVar.setModel(rvyVar);
        ((fvy) n0o0Var.getValue()).setOnClickListener(new n2j0(this, rvyVar, avyVar, (byte) 3));
    }

    @Override // a.yge0
    public final void o(xhe0 xhe0Var, int i, List list) {
        avy avyVar = (avy) xhe0Var;
        n0o0 n0o0Var = avyVar.u;
        list.getClass();
        if (list.isEmpty()) {
            n(avyVar, i);
            return;
        }
        bkq bkqVar = new bkq(lgi0.c(pgi0.p(new c5q(new sx3(list, (byte) 1), false, new eoh0((byte) 25)), new djx((byte) 15)), new eoh0((byte) 23)));
        while (bkqVar.hasNext()) {
            Object next = bkqVar.next();
            if (next != null) {
                if (next instanceof nvy) {
                    ((fvy) n0o0Var.getValue()).setLabel(((nvy) next).f24210a);
                } else if (next instanceof ovy) {
                    ovy ovyVar = (ovy) next;
                    ((fvy) n0o0Var.getValue()).a(ovyVar.f25947a, ovyVar.b);
                }
            }
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        context.getClass();
        return new avy(new fvy(context));
    }
}
