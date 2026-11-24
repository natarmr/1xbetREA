package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class vuv extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public c4m0 A;
    public bby B;
    public c4m0 C;
    public bby D;
    public final String o;
    public final long p;
    public final ctf0 q;
    public final mne r;
    public final i1w0 s;
    public final m1e t;
    public final jwu u;
    public final f7u v;
    public final qzt w;
    public final fhj x;
    public final xeu y;
    public final xeu z;

    public vuv(String str, long j, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, ocl oclVar, m1e m1eVar, jwu jwuVar, f7u f7uVar, weu weuVar, qzt qztVar, fhj fhjVar, uyu uyuVar, wyu wyuVar, xeu xeuVar, xeu xeuVar2, xeu xeuVar3, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        xvo xvoVar = new xvo(weuVar, str, qztVar, ctf0Var, fhjVar, j, wyuVar, (byte) 3);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 4);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, xvoVar, xuhVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = ctf0Var;
        this.r = mneVar;
        this.s = i1w0Var;
        this.t = m1eVar;
        this.u = jwuVar;
        this.v = f7uVar;
        this.w = qztVar;
        this.x = fhjVar;
        this.y = xeuVar;
        this.z = xeuVar3;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new suv(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), uuv.h);
        O();
        N();
        sac.T(new fnq(vtb.M(((auv) xeuVar2.f40761a.b).f1497a), new suv(this, yjeVar, (byte) 1), (byte) 4), jiu0.a(this), new pfl(2, this, vuv.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 22));
        P();
    }

    public static int M(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((z3a0) obj).i) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((z3a0) it.next()).h.size();
        }
        return size;
    }

    public final void N() {
        c4m0 c4m0Var = this.A;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.A = sac.T(new fnq(this.t.a(), new quv(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.r.f22085a), ruv.h);
        }
    }

    public final void O() {
        c4m0 c4m0Var = this.C;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.C = sac.T(new fnq(this.v.n(this.o), new suv(this, null, (byte) 0), (byte) 4), jiu0.a(this), tuv.h);
        }
    }

    public final void P() {
        bby bbyVar = this.B;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.B = sac.a0(jiu0.a(this), ibc.w0(30L, bfn.SECONDS), this.r.b, null, new quv(this, yjeVar, (byte) 2), 4);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ztv ztvVar;
        int iIndexOf;
        vuv vuvVar = this;
        ttv ttvVar = (ttv) obj;
        ttvVar.getClass();
        if (ttvVar instanceof qtv) {
            vuvVar.O();
            vuvVar.P();
            return;
        }
        if (ttvVar.equals(otv.f25848a)) {
            i1w0 i1w0Var = vuvVar.s;
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
        } else {
            if (!(ttvVar instanceof ptv)) {
                if (!(ttvVar instanceof rtv)) {
                    if (ttvVar instanceof stv) {
                        vuvVar.N();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                c4m0 c4m0Var = vuvVar.A;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                bby bbyVar = vuvVar.B;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                    return;
                }
                return;
            }
            ptv ptvVar = (ptv) ttvVar;
            lgp0 lgp0Var = ptvVar.b;
            z3a0 z3a0Var = ptvVar.f27583a;
            boolean z = ptvVar.c;
            List list = ((guv) vuvVar.D()).d;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ztv ztvVar2 = (ztv) it.next();
                lgp0 lgp0Var2 = ztvVar2.b;
                nep0 nep0Var = ztvVar2.f44982a;
                a4x a4xVar = nep0Var.b;
                if (lgp0Var2 != lgp0Var || (iIndexOf = a4xVar.indexOf(z3a0Var)) == -1) {
                    ztvVar = ztvVar2;
                } else {
                    ArrayList arrayListN0 = CollectionsKt.N0(a4xVar);
                    z3a0 z3a0Var2 = (z3a0) arrayListN0.get(iIndexOf);
                    String str = z3a0Var2.f43710a;
                    String str2 = z3a0Var2.b;
                    int i = z3a0Var2.c;
                    int i2 = z3a0Var2.d;
                    String str3 = z3a0Var2.e;
                    bre breVar = z3a0Var2.f;
                    String str4 = z3a0Var2.g;
                    List list2 = z3a0Var2.h;
                    String str5 = z3a0Var2.j;
                    str5.getClass();
                    arrayListN0.set(iIndexOf, new z3a0(str, str2, i, i2, str3, breVar, str4, list2, z, str5));
                    int iM = M(arrayListN0);
                    i4 i4VarR0 = dyb.r0(arrayListN0);
                    String str6 = nep0Var.f23398a;
                    int i3 = nep0Var.c;
                    i4VarR0.getClass();
                    ztvVar = new ztv(new nep0(i3, i4VarR0, str6), ztvVar2.b, iM);
                }
                arrayList.add(ztvVar);
                vuvVar = this;
                it = it;
                lgp0Var = lgp0Var;
                z3a0Var = z3a0Var;
            }
            p7m0 p7m0Var = vuvVar.i.f25029a;
            while (true) {
                Object value = p7m0Var.getValue();
                value.getClass();
                vuvVar.f.getClass();
                ArrayList arrayList2 = arrayList;
                if (p7m0Var.m(value, guv.a((guv) value, false, false, arrayList2, null, null, 55))) {
                    return;
                } else {
                    arrayList = arrayList2;
                }
            }
        }
    }
}
