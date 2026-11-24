package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class xm00 extends w46 {
    public final duj b;
    public final ctf0 c;
    public final gxu d;
    public final mne e;
    public final gbi f;
    public final p7m0 g;
    public final ol60 h;
    public bby i;

    public xm00(duj dujVar, ctf0 ctf0Var, gxu gxuVar, mne mneVar, gbi gbiVar) {
        ctf0Var.getClass();
        this.b = dujVar;
        this.c = ctf0Var;
        this.d = gxuVar;
        this.e = mneVar;
        this.f = gbiVar;
        this.g = q7m0.a(rm00.f30722a);
        this.h = new ol60(1, i99.b);
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.i;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object w(cm00 cm00Var, String str, zje zjeVar) {
        um00 um00Var;
        if (zjeVar instanceof um00) {
            um00Var = (um00) zjeVar;
            int i = um00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                um00Var.k = i - Integer.MIN_VALUE;
            } else {
                um00Var = new um00(this, zjeVar);
            }
        } else {
            um00Var = new um00(this, zjeVar);
        }
        Object obj = um00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = um00Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            ArrayList arrayList = cm00Var.h;
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(tdc.b0((am00) it.next()));
            }
            List list = cm00Var.i;
            boolean z = cm00Var.f4585a;
            double d = cm00Var.b;
            long j = cm00Var.c;
            double d2 = cm00Var.d;
            int i3 = cm00Var.e;
            boolean z2 = cm00Var.g;
            List list2 = cm00Var.j;
            um00Var.k = 1;
            if (this.f.C(arrayList2, list, z, d, j, d2, i3, z2, str, list2, um00Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.h.f(lm00.f20272a);
        return Unit.f46060a;
    }
}
