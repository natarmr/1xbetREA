package a;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xtc0 extends q4 {
    public final int f;
    public final m0x g;
    public final Integer h;
    public Function2 i;

    public xtc0(int i, m0x m0xVar, Integer num) {
        super(ek5.g);
        this.f = i;
        this.g = m0xVar;
        this.h = num;
        this.i = null;
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        euc0 euc0Var = (euc0) A(i);
        n0o0 n0o0Var = ((wtc0) xhe0Var).u;
        kuc0 kuc0Var = (kuc0) n0o0Var.getValue();
        euc0Var.getClass();
        kuc0Var.a(euc0Var, this.g);
        if (euc0Var instanceof euc0) {
            ((kuc0) n0o0Var.getValue()).setOnClickListener(new h4c0(this, euc0Var, i, (byte) 1));
        }
    }

    @Override // a.yge0
    public final void o(xhe0 xhe0Var, int i, List list) {
        wtc0 wtc0Var = (wtc0) xhe0Var;
        n0o0 n0o0Var = wtc0Var.u;
        list.getClass();
        if (list.isEmpty()) {
            n(wtc0Var, i);
            return;
        }
        bkq bkqVar = new bkq(lgi0.c(pgi0.p(new sx3(list, (byte) 1), new ljc0((byte) 11)), new eoh0((byte) 23)));
        while (bkqVar.hasNext()) {
            Object next = bkqVar.next();
            if (next != null) {
                if (next instanceof huc0) {
                    ((kuc0) n0o0Var.getValue()).setLabel(((huc0) next).f13674a);
                } else if (next instanceof iuc0) {
                    iuc0 iuc0Var = (iuc0) next;
                    ((kuc0) n0o0Var.getValue()).b(iuc0Var.f15390a, this.g, iuc0Var.c, iuc0Var.d);
                }
            }
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        Integer num = this.h;
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(viewGroup.getContext(), num != null ? num.intValue() : R.style.Widget_PromoStoreCollectionItem)).inflate(this.f == 0 ? R.layout.promo_store_collection_horizontal_item : R.layout.promo_store_collection_vertical_item, viewGroup, false);
        viewInflate.getClass();
        return new wtc0(viewInflate);
    }
}
