package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class msu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mne f22339a;
    public final sjl0 b;

    public msu(mne mneVar, sjl0 sjl0Var) {
        sjl0Var.getClass();
        this.f22339a = mneVar;
        this.b = sjl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(cxk0 cxk0Var, zje zjeVar) {
        lsu lsuVar;
        if (zjeVar instanceof lsu) {
            lsuVar = (lsu) zjeVar;
            int i = lsuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lsuVar.k = i - Integer.MIN_VALUE;
            } else {
                lsuVar = new lsu(this, zjeVar);
            }
        } else {
            lsuVar = new lsu(this, zjeVar);
        }
        Object objD0 = lsuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = lsuVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            yni0 yni0Var = new yni0();
            List list = cxk0Var.f5126a;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                axq.t(((d0t) it.next()).v, arrayList);
            }
            yni0Var.addAll(arrayList);
            List list2 = cxk0Var.b;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                axq.t(((d0t) it2.next()).v, arrayList2);
            }
            yni0Var.addAll(arrayList2);
            List list3 = cxk0Var.c;
            ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                axq.t(((d2w) it3.next()).d(), arrayList3);
            }
            yni0Var.addAll(arrayList3);
            yni0 yni0VarA = cui0.a(yni0Var);
            dvj dvjVar = this.f22339a.b;
            u5u u5uVar = new u5u(this, yni0VarA, yjeVar, (byte) 5);
            lsuVar.k = 1;
            objD0 = qjj.d0(dvjVar, u5uVar, lsuVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        List list4 = (List) objD0;
        lc00 lc00VarB = kotlin.collections.a.b();
        if (!list4.isEmpty()) {
            lc00VarB.add(aok0.f1205a);
            lc00VarB.addAll(list4);
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public Object b(long j, zje zjeVar) {
        return qjj.d0(this.f22339a.b, new ey((Object) this, j, (yje) null, (byte) 26), zjeVar);
    }

    public msu(sjl0 sjl0Var, mne mneVar) {
        sjl0Var.getClass();
        this.b = sjl0Var;
        this.f22339a = mneVar;
    }
}
