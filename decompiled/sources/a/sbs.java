package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sbs extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public final rl70 A;
    public bby B;
    public c4m0 C;
    public final jtj o;
    public final m1e p;
    public final duj q;
    public final long r;
    public final String s;
    public final mne t;
    public final ctf0 u;
    public final i1w0 v;
    public final fhj w;
    public final wyu x;
    public final f7u y;
    public final jwu z;

    public sbs(jtj jtjVar, m1e m1eVar, duj dujVar, long j, String str, uyu uyuVar, mne mneVar, ctf0 ctf0Var, ocl oclVar, i1w0 i1w0Var, weu weuVar, fhj fhjVar, qzt qztVar, wyu wyuVar, f7u f7uVar, jwu jwuVar, rl70 rl70Var, r9u r9uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        xvo xvoVar = new xvo(j, ctf0Var, weuVar, str, qztVar, fhjVar, wyuVar);
        byte b = 3;
        xuh xuhVar = new xuh(oclVar, r9uVar, b);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, xvoVar, xuhVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = jtjVar;
        this.p = m1eVar;
        this.q = dujVar;
        this.r = j;
        this.s = str;
        this.t = mneVar;
        this.u = ctf0Var;
        this.v = i1w0Var;
        this.w = fhjVar;
        this.x = wyuVar;
        this.y = f7uVar;
        this.z = jwuVar;
        this.A = rl70Var;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new j0s(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), rbs.h);
        sac.T(new fnq(f7uVar.n(str), new g6g((Object) this, (Object) qztVar.a(), yjeVar, (byte) 22), (byte) 4), jiu0.a(this), qbs.h);
        O();
    }

    public final void M(boolean z) {
        Object value;
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            if (z) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, uas.a((uas) value, false, true, false, null, null, false, null, null, 2043)));
            }
            sac.V(jiu0.a(this), new h2s(1, this, sbs.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, this.t.b, new gc1((Object) this, (yje) null, (byte) 8), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object N(zje zjeVar) {
        nbs nbsVar;
        ArrayList arrayList;
        vim rimVar;
        sbs sbsVar = this;
        if (zjeVar instanceof nbs) {
            nbsVar = (nbs) zjeVar;
            int i = nbsVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbsVar.l = i - Integer.MIN_VALUE;
            } else {
                nbsVar = new nbs(sbsVar, zjeVar);
            }
        } else {
            nbsVar = new nbs(sbsVar, zjeVar);
        }
        Object obj = nbsVar.j;
        wne wneVar = wne.f39444a;
        int i2 = nbsVar.l;
        int i3 = 1;
        Throwable th = null;
        if (i2 == 0) {
            ArrayList arrayListT = twn.t(obj);
            boolean z = ((uas) sbsVar.D()).h && ((uas) sbsVar.D()).i;
            nbsVar.i = arrayListT;
            nbsVar.l = 1;
            Serializable serializableJ = sbsVar.o.j(nbsVar, sbsVar.s, z, true);
            if (serializableJ == wneVar) {
                return wneVar;
            }
            arrayList = arrayListT;
            obj = serializableJ;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = nbsVar.i;
            z1x.P(obj);
        }
        Map map = (Map) obj;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            int i4 = 0;
            for (Object obj2 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    Throwable th2 = th;
                    q3d.p();
                    throw th2;
                }
                mas masVar = (mas) obj2;
                zdm0 zdm0Var = ((uas) sbsVar.D()).j;
                ydm0 ydm0Var = zdm0Var instanceof ydm0 ? (ydm0) zdm0Var : th;
                Object obj3 = ydm0Var != 0 ? ydm0Var.b : th;
                tdm0 tdm0Var = obj3 instanceof tdm0 ? (tdm0) obj3 : th;
                Object obj4 = tdm0Var != 0 ? tdm0Var.c.f44686a : th;
                if (obj4 == null) {
                    obj4 = "";
                }
                int size = list.size() - i3;
                masVar.getClass();
                String str2 = masVar.c;
                ufp0 ufp0Var = masVar.g;
                Throwable th3 = th;
                b9a0 b9a0Var = masVar.f21474a;
                b9a0 b9a0Var2 = masVar.d;
                Iterator it2 = it;
                y6n y6nVar = Intrinsics.d(ufp0Var.f35586a, obj4) ? y6n.f42107a : y6n.b;
                ggm ggmVar = i4 == 0 ? size == 0 ? ggm.c : ggm.f11256a : i4 == size ? ggm.b : ggm.d;
                b9a0 b9a0Var3 = b9a0.g;
                boolean zD = Intrinsics.d(b9a0Var2, b9a0Var3);
                String str3 = masVar.b;
                String str4 = masVar.e;
                if (zD) {
                    rimVar = new sim(str3, str4, str2, y6nVar, ggmVar, masVar.h);
                } else {
                    rimVar = new rim(str3, str4, fxb.N(b9a0Var2), !Intrinsics.d(b9a0Var, b9a0Var3) ? fxb.N(b9a0Var) : th3, str2, dub.p0(ufp0Var), y6nVar, ggmVar, masVar.h);
                }
                arrayList3.add(rimVar);
                sbsVar = this;
                i4 = i5;
                th = th3;
                it = it2;
                i3 = 1;
            }
            Iterator it3 = it;
            Throwable th4 = th;
            if (!arrayList3.isEmpty()) {
                arrayList.add(new uim(str));
                arrayList.addAll(arrayList3);
            }
            arrayList2.add(Unit.f46060a);
            sbsVar = this;
            th = th4;
            it = it3;
            i3 = 1;
        }
        return arrayList;
    }

    public final void O() {
        this.C = sac.T(new fnq(this.p.a(), new obs(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.t.f22085a), pbs.h);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        dbs dbsVar = (dbs) obj;
        dbsVar.getClass();
        super.x(dbsVar);
        boolean z = dbsVar instanceof xas;
        i1w0 i1w0Var = this.v;
        if (!z) {
            if (dbsVar instanceof abs) {
                M(true);
                return;
            }
            if (dbsVar instanceof yas) {
                long j = ((yas) dbsVar).f42315a;
                if (j == 0) {
                    H(new t4s((byte) 17));
                    M(((uas) D()).f.isEmpty());
                    return;
                } else {
                    if (j == 1) {
                        H(new t4s((byte) 18));
                        M(((uas) D()).f.isEmpty());
                        return;
                    }
                    return;
                }
            }
            if (dbsVar.equals(cbs.f4075a)) {
                c4m0 c4m0Var = this.C;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                bby bbyVar = this.B;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                    return;
                }
                return;
            }
            if (dbsVar.equals(bbs.f2322a)) {
                O();
                return;
            }
            if (!(dbsVar instanceof zas)) {
                t9f.b();
                return;
            }
            String str = ((zas) dbsVar).f44082a;
            if (str.length() == 0) {
                return;
            }
            i1w0Var.d(new f3s(this, str, (byte) 4));
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
