package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;

/* JADX INFO: loaded from: classes4.dex */
public final class tam0 extends w46 {
    public final vzg0 b;
    public final StatisticBlocksParams c;
    public final mne d;
    public final ewu e;
    public final zsi0 f;
    public final ctf0 g;
    public final oeg0 h;
    public final g2v i;
    public final p7m0 j;
    public final p7m0 k;
    public final ol60 l;
    public final ArrayList m;
    public ArrayList n;
    public List o;
    public final LinkedHashSet p;

    public tam0(vzg0 vzg0Var, StatisticBlocksParams statisticBlocksParams, mne mneVar, ewu ewuVar, zsi0 zsi0Var, ctf0 ctf0Var, oeg0 oeg0Var, g2v g2vVar) {
        t9m0 t9m0Var;
        ctf0Var.getClass();
        oeg0Var.getClass();
        this.b = vzg0Var;
        this.c = statisticBlocksParams;
        this.d = mneVar;
        this.e = ewuVar;
        this.f = zsi0Var;
        this.g = ctf0Var;
        this.h = oeg0Var;
        this.i = g2vVar;
        byte b = 0;
        this.j = q7m0.a(new aam0(iun.f15405a, false, false));
        this.k = q7m0.a(Boolean.FALSE);
        this.l = new ol60(3);
        List list = statisticBlocksParams.f;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            yje yjeVar = null;
            if (!it.hasNext()) {
                this.m = arrayList;
                this.n = new ArrayList();
                this.o = iun.f15405a;
                this.p = new LinkedHashSet();
                sac.V(jiu0.a(this), new q9m0(this, (byte) 2), null, this.d.f22085a, new sam0(this, yjeVar, b), 10);
                return;
            }
            int iIntValue = ((Number) it.next()).intValue();
            Iterator it2 = t9m0.h2.iterator();
            do {
                if (!it2.hasNext()) {
                    v4i0.o("Collection contains no element matching the predicate.");
                    throw null;
                }
                t9m0Var = (t9m0) it2.next();
            } while (t9m0Var.f33572a != iIntValue);
            arrayList.add(t9m0Var);
        }
    }

    public static ArrayList w(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            iam0 iam0Var = (iam0) obj;
            arrayList2.add(new StatisticBlockModel(iam0Var.f14445a, i, iam0Var.c));
            i = i2;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043 A[LOOP:1: B:14:0x003d->B:16:0x0043, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    public final void A() {
        p7m0 p7m0Var;
        Object value;
        boolean z;
        ArrayList arrayList;
        Iterator it;
        do {
            p7m0Var = this.k;
            value = p7m0Var.getValue();
            ((Boolean) value).getClass();
            ArrayList arrayList2 = this.n;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        ArrayList arrayList3 = this.n;
                        arrayList = new ArrayList(r3d.q(arrayList3, 10));
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((iam0) it.next()).f14445a.f33572a));
                        }
                        if (arrayList.equals(this.c.f)) {
                            z = false;
                        }
                    } else if (!((iam0) it2.next()).c) {
                    }
                    z = true;
                }
            } else {
                ArrayList arrayList4 = this.n;
                arrayList = new ArrayList(r3d.q(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((iam0) it.next()).f14445a.f33572a));
                }
                if (arrayList.equals(this.c.f)) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } while (!p7m0Var.m(value, Boolean.valueOf(z)));
    }

    public final void x() {
        i1w0 i1w0VarC = this.h.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void y() {
        p7m0 p7m0Var;
        Object value;
        pb10 pb10VarJ;
        do {
            p7m0Var = this.j;
            value = p7m0Var.getValue();
            StatisticBlocksParams statisticBlocksParams = this.c;
            long j = statisticBlocksParams.c;
            if (j == 40) {
                pb10VarJ = ozb.J(statisticBlocksParams.d, pb10.v);
            } else {
                pb10VarJ = j == 189 ? pb10.r : pb10.v;
            }
        } while (!p7m0Var.m(value, new bam0(g2v.d(this.i, pb10VarJ, null, null, R.string.data_retrieval_error, 0, null, 478))));
    }

    public final void z() {
        Object value;
        boolean z;
        List list;
        p7m0 p7m0Var = this.j;
        Object value2 = p7m0Var.getValue();
        aam0 aam0Var = value2 instanceof aam0 ? (aam0) value2 : null;
        if (aam0Var == null) {
            return;
        }
        do {
            value = p7m0Var.getValue();
            z = !Intrinsics.d(this.n, this.o);
            list = aam0Var.b;
            list.getClass();
        } while (!p7m0Var.m(value, new aam0(list, z, false)));
    }
}
