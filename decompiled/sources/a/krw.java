package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class krw extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final String o;
    public final long p;
    public final reu q;
    public final i1w0 r;
    public final m1e s;
    public final mne t;
    public c4m0 u;

    public krw(String str, long j, reu reuVar, duj dujVar, ocl oclVar, i1w0 i1w0Var, m1e m1eVar, ctf0 ctf0Var, mne mneVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        kdw kdwVar = new kdw((byte) 11);
        cz czVar = new cz(ctf0Var, oclVar, (byte) 17);
        rwj rwjVar = mneVar.f22085a;
        super(null, kdwVar, czVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = reuVar;
        this.r = i1w0Var;
        this.s = m1eVar;
        this.t = mneVar;
    }

    public final void M(boolean z) {
        mie0 mie0Var = new mie0();
        sac.V(jiu0.a(this), new okw(mie0Var, this, (byte) 8), null, this.t.b, new ys8((Object) mie0Var, (Object) this, z, (yje) null, (byte) 16), 10);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        yqw yqwVar = (yqw) obj;
        yqwVar.getClass();
        if (yqwVar.equals(rqw.f30952a)) {
            if (((crw) D()).d.isEmpty()) {
                return;
            }
            H(new x2w((byte) 24));
            return;
        }
        if (yqwVar instanceof xqw) {
            String str = ((xqw) yqwVar).f41341a;
            List<epw> list = ((crw) D()).d;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (epw epwVarA : list) {
                if (epwVarA.f8207a.equals(str)) {
                    epwVarA = epw.a(epwVarA, !epwVarA.k);
                }
                arrayList.add(epwVarA);
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((epw) it.next()).k != ((crw) D()).e) {
                        }
                    } else if (!((crw) D()).d.isEmpty()) {
                        H(new x2w((byte) 24));
                    }
                }
            } else if (!((crw) D()).d.isEmpty()) {
                H(new x2w((byte) 24));
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, crw.a((crw) value, false, false, false, arrayList, false, 23)));
            return;
        }
        boolean z = yqwVar instanceof sqw;
        i1w0 i1w0Var = this.r;
        Object obj2 = null;
        Object[] objArr = 0;
        if (z) {
            String str2 = ((sqw) yqwVar).f32648a;
            for (Object obj3 : ((crw) D()).d) {
                if (((epw) obj3).f8207a.equals(str2)) {
                    obj2 = obj3;
                    break;
                }
            }
            epw epwVar = (epw) obj2;
            if (epwVar != null) {
                i1w0Var.d(new okw(epwVar, this, (byte) 9));
                return;
            }
            return;
        }
        byte b = 0;
        if (!yqwVar.equals(tqw.f34398a)) {
            if (yqwVar.equals(uqw.f36137a)) {
                M(true);
                return;
            }
            if (yqwVar.equals(vqw.f37872a)) {
                c4m0 c4m0Var = this.u;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.u = sac.T(new fnq(this.s.b(), new irw(this, objArr == true ? 1 : 0, b), (byte) 4), d5c.S(jiu0.a(this), this.t.b), jrw.h);
                    return;
                }
                return;
            }
            if (!yqwVar.equals(wqw.f39612a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var2 = this.u;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
                return;
            }
            return;
        }
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
