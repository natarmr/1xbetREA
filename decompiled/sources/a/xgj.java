package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class xgj extends w46 {
    public final ouu b;
    public final znt c;
    public final gbi d;
    public final mne e;
    public final ctf0 f;
    public final p7m0 g;
    public final ol60 h;
    public boolean i;
    public boolean j;
    public List k;

    public xgj(i1w0 i1w0Var, ouu ouuVar, znt zntVar, gbi gbiVar, mne mneVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ouuVar;
        this.c = zntVar;
        this.d = gbiVar;
        this.e = mneVar;
        this.f = ctf0Var;
        iun iunVar = iun.f15405a;
        this.g = q7m0.a(new ugj("", "", iunVar, "", iunVar));
        this.h = new ol60(3);
        this.k = iunVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object w(boolean z, zje zjeVar) {
        vgj vgjVar;
        Object next;
        if (zjeVar instanceof vgj) {
            vgjVar = (vgj) zjeVar;
            int i = vgjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vgjVar.k = i - Integer.MIN_VALUE;
            } else {
                vgjVar = new vgj(this, zjeVar);
            }
        } else {
            vgjVar = new vgj(this, zjeVar);
        }
        vgj vgjVar2 = vgjVar;
        Object obj = vgjVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = vgjVar2.k;
        ol60 ol60Var = this.h;
        if (i2 == 0) {
            z1x.P(obj);
            if (z) {
                List list = this.k;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(vfc.M((qhj) it.next(), this.j));
                }
                gwe gweVar = gwe.DAY_EXPRESS;
                Iterator it2 = this.k.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((qhj) next).s == 0);
                qhj qhjVar = (qhj) next;
                long j = qhjVar != null ? qhjVar.s : 0L;
                vgjVar2.k = 1;
                if (this.d.B(arrayList, gweVar, j, vgjVar2) == wneVar) {
                    return wneVar;
                }
            } else {
                ol60Var.f(rgj.f30439a);
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        if (this.i) {
            ol60Var.f(qgj.f28687a);
            xa50 xa50Var = new xa50();
            ouu ouuVar = this.b;
            ouu.o(ouuVar, xa50Var, null, 4);
            ((qe50) ouuVar.b).a(new xa50(), false);
        } else {
            ol60Var.f(sgj.f32163a);
        }
        return Unit.f46060a;
    }
}
