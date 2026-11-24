package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qja0 extends i3t0 {
    public static final /* synthetic */ int r = 0;
    public final yfu o;
    public final zlt0 p;
    public final String q;

    public qja0(yfu yfuVar, nmo nmoVar, zlt0 zlt0Var, String str, mne mneVar) {
        str.getClass();
        qw80 qw80Var = new qw80((Object) nmoVar, (Object) str, (byte) 22);
        pja0 pja0Var = pja0.f27080a;
        rwj rwjVar = mneVar.f22085a;
        super(null, qw80Var, pja0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = yfuVar;
        this.p = zlt0Var;
        this.q = str;
        i3t0.K(this, null, new er90((byte) 28), new m91(this, null, (byte) 16), 1);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void x(kja0 kja0Var) {
        Object next;
        Object next2;
        int i;
        Object next3;
        kja0Var.getClass();
        super.x(kja0Var);
        int i2 = kja0Var.f18378a.f30532a;
        zlt0 zlt0Var = this.p;
        zlt0Var.getClass();
        String str = this.q;
        str.getClass();
        List listG = zlt0Var.g(str, true);
        List listG2 = zlt0Var.g(str, false);
        eja0 eja0Var = (eja0) ((z220) zlt0Var.b).d;
        ArrayList<k5i0> arrayList = eja0Var.c;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k5i0) next).b.equals(str));
        if (((k5i0) next) != null) {
            Iterator it2 = listG.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((m5i0) next2).f21221a != i2);
            m5i0 m5i0Var = (m5i0) next2;
            if (m5i0Var != null) {
                Iterator it3 = listG2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!((m5i0) next3).c.equals(m5i0Var.c));
                m5i0 m5i0Var2 = (m5i0) next3;
                if (m5i0Var2 != null) {
                    i = m5i0Var2.f21221a;
                } else {
                    i = -1;
                }
            } else {
                i = -1;
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            for (k5i0 k5i0Var : arrayList) {
                String str2 = k5i0Var.b;
                String str3 = k5i0Var.b;
                if (str2.equals(str)) {
                    k5i0Var = new k5i0(i2, str3);
                } else if (i != -1) {
                    k5i0Var = new k5i0(i, str3);
                }
                arrayList2.add(k5i0Var);
            }
            eja0Var.f7900a.o(null, arrayList2);
            ArrayList arrayList3 = eja0Var.c;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
        }
    }
}
