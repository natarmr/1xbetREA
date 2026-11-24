package a;

import android.text.BidiFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import org.xplatform.bethistory.history.domain.model.BetHistoryFilterItemModel;

/* JADX INFO: loaded from: classes3.dex */
public final class wnm0 extends w46 {
    public final s77 b;
    public final sys0 c;
    public final aau d;
    public final b4j e;
    public final ctf0 f;
    public final au0 g;
    public final ArrayList h;
    public final ArrayList i;
    public final p7m0 j;
    public final p7m0 k;
    public final qoj0 l;

    public wnm0(s77 s77Var, sys0 sys0Var, wti wtiVar, aau aauVar, b4j b4jVar, ctf0 ctf0Var, au0 au0Var) {
        int i;
        Object value;
        ctf0Var.getClass();
        this.b = s77Var;
        this.c = sys0Var;
        this.d = aauVar;
        this.e = b4jVar;
        this.f = ctf0Var;
        this.g = au0Var;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.i = arrayList2;
        this.j = q7m0.a(new o9h0(false, false));
        this.k = q7m0.a(vie.f37473a);
        this.l = ckb.F();
        ArrayList arrayListQ = wtiVar.q(sys0Var, s77Var);
        arrayList.clear();
        arrayList.addAll(arrayListQ);
        arrayList2.clear();
        arrayList2.addAll(arrayListQ);
        Object obj = null;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((BetHistoryFilterItemModel) it.next()).b && (i = i + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
        }
        if (i == 1) {
            for (Object obj2 : arrayList) {
                if (((BetHistoryFilterItemModel) obj2).b) {
                    obj = obj2;
                    break;
                }
            }
            BetHistoryFilterItemModel betHistoryFilterItemModel = (BetHistoryFilterItemModel) obj;
            if (betHistoryFilterItemModel != null) {
                y(betHistoryFilterItemModel);
            }
        }
        z();
        p7m0 p7m0Var = this.j;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, o9h0.a((o9h0) value, arrayList.size() == i, false, 2)));
    }

    public final void w() {
        p7m0 p7m0Var;
        Object value;
        boolean z = !sj3.n0(this.h, this.i);
        do {
            p7m0Var = this.j;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, o9h0.a((o9h0) value, false, z, 1)));
    }

    public final void x() {
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(BetHistoryFilterItemModel.a((BetHistoryFilterItemModel) it.next(), false, true, 3));
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        z();
    }

    public final void y(BetHistoryFilterItemModel betHistoryFilterItemModel) {
        ArrayList arrayList = this.h;
        arrayList.set(arrayList.indexOf(betHistoryFilterItemModel), BetHistoryFilterItemModel.a(betHistoryFilterItemModel, true, false, 1));
        z();
    }

    public final void z() {
        ArrayList<BetHistoryFilterItemModel> arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (BetHistoryFilterItemModel betHistoryFilterItemModel : arrayList) {
            betHistoryFilterItemModel.getClass();
            ctf0 ctf0Var = this.f;
            ctf0Var.getClass();
            int i = cy7.f5159a;
            arrayList2.add(new x3q(betHistoryFilterItemModel, (BidiFormatter.getInstance().isRtl(ctf0Var.f(feb.X(betHistoryFilterItemModel.f46411a), new Object[0])) || !cy7.c()) ? 8388611 : 8388613));
        }
        tie tieVar = new tie(arrayList2);
        p7m0 p7m0Var = this.k;
        p7m0Var.getClass();
        p7m0Var.o(null, tieVar);
    }
}
