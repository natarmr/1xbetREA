package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.statistic.grand_prix.presentation.model.SeasonItemUIModel;

/* JADX INFO: loaded from: classes6.dex */
public final class ndv extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final String o;
    public final mne p;
    public final i1w0 q;
    public final pyu r;
    public final n1u s;
    public final n1u t;
    public final fvt0 u;
    public final n1u v;
    public final yfu w;
    public final duj x;
    public bby y;
    public bby z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndv(ctf0 ctf0Var, String str, mne mneVar, i1w0 i1w0Var, pyu pyuVar, n1u n1uVar, n1u n1uVar2, fvt0 fvt0Var, n1u n1uVar3, yfu yfuVar, ocl oclVar, m1e m1eVar, duj dujVar) {
        super(null, new ldv((byte) 0), new cz(ctf0Var, oclVar, (byte) 15), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = str;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = pyuVar;
        this.s = n1uVar;
        this.t = n1uVar2;
        this.u = fvt0Var;
        this.v = n1uVar3;
        this.w = yfuVar;
        this.x = dujVar;
        sac.T(new fnq(m1eVar.a(), new mdv(this, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
        M(false);
    }

    public final void M(boolean z) {
        bby bbyVar = this.y;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.y = sac.V(jiu0.a(this), new vft(1, this, ndv.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 7), null, this.p.b, new ys8(z, (Object) this, (yje) null, (byte) 11), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        yje yjeVar;
        Object next;
        zcv zcvVar = (zcv) obj;
        zcvVar.getClass();
        super.x(zcvVar);
        if (zcvVar.equals(ycv.f42402a)) {
            E();
            return;
        }
        if (!zcvVar.equals(ucv.f35451a)) {
            if (zcvVar.equals(vcv.f37206a)) {
                List<ajh0> list = ((fdv) D()).d;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (ajh0 ajh0Var : list) {
                    ajh0Var.getClass();
                    arrayList.add(new SeasonItemUIModel(ajh0Var.f976a, ajh0Var.b, ajh0Var.c));
                }
                G(new edv(arrayList));
                return;
            }
            if (zcvVar.equals(wcv.f38943a)) {
                M(true);
                return;
            }
            if (!(zcvVar instanceof xcv)) {
                t9f.b();
                return;
            }
            String str = ((xcv) zcvVar).f40667a;
            Iterator it = ((pcv) this.s.f22769a.c).f26777a.iterator();
            do {
                yjeVar = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ajh0) next).c);
            ajh0 ajh0Var2 = (ajh0) next;
            String str2 = ajh0Var2 != null ? ajh0Var2.f976a : "";
            if (str2.equals(str) || str2.length() == 0) {
                return;
            }
            sac.V(jiu0.a(this), new umu((byte) 7), null, this.p.b, new u5u(this, str, yjeVar, (byte) 9), 10);
            return;
        }
        ((pcv) ((dgu) this.u.f10231a).c).f26777a.clear();
        i1w0 i1w0Var = this.q;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
