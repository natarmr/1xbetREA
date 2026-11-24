package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
public final class jgb extends w46 {
    public final i1w0 b;
    public final duj c;
    public final kki d;
    public final g2v e;
    public final m1e f;
    public final ctf0 g;
    public final r9u h;
    public final long i;
    public final p7m0 j;
    public final p7m0 k;
    public final qoj0 l;
    public final eme m;
    public c4m0 n;
    public final p7m0 o;
    public zz2 p;
    public boolean q;
    public final ivn r;
    public final duj s;
    public final eyg0 t;
    public final TypeStageId u;
    public final long v;
    public final ctf0 w;
    public final r9u x;
    public final vjp y;

    public jgb(ivn ivnVar, duj dujVar, eyg0 eyg0Var, TypeStageId typeStageId, long j, ctf0 ctf0Var, r9u r9uVar, vjp vjpVar, pru pruVar, g2v g2vVar, kki kkiVar, i1w0 i1w0Var, m1e m1eVar) {
        ctf0Var.getClass();
        r9uVar.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.b = i1w0Var;
        this.c = dujVar;
        this.d = kkiVar;
        this.e = g2vVar;
        this.f = m1eVar;
        this.g = ctf0Var;
        this.h = r9uVar;
        this.i = j;
        this.j = q7m0.a(s26.f31487a);
        this.k = q7m0.a(m26.f21041a);
        byte b = 2;
        this.l = roj0.b(1, 0, i99.b, 2);
        this.m = fxb.J(pruVar.a().g.t);
        p7m0 p7m0VarA = q7m0.a("");
        this.o = p7m0VarA;
        this.q = true;
        ymx ymxVar = ymx.INTERVAL_100;
        yje yjeVar = null;
        slb.U(new fnq(sj3.S(p7m0VarA, 500L), new cm3(this, yjeVar, (byte) 22), (byte) 4), jiu0.a(this));
        this.r = ivnVar;
        this.s = dujVar;
        this.t = eyg0Var;
        this.u = typeStageId;
        this.v = j;
        this.w = ctf0Var;
        this.x = r9uVar;
        this.y = vjpVar;
        hie0 hie0Var = new hie0();
        c4m0 c4m0Var = this.n;
        hie0Var.f13108a = c4m0Var == null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.n = slb.U(new fnq(new dnq(this.f.b(), new rj((Object) this, yjeVar, (byte) 3), (byte) 1), new xw5(this, hie0Var, yjeVar, b), (byte) 4), jiu0.a(this));
        }
    }

    public static final List A(Map map) {
        return CollectionsKt.A0(r3d.r(map.values()), new vt5((byte) 4));
    }

    public static final boolean B(String str, String str2) {
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.SLASH, Separators.SP}, false, 0, 6, null);
        if (listSplit$default == null || !listSplit$default.isEmpty()) {
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                if (kotlin.text.c.x((String) it.next(), str2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void C() {
        zz2 zz2Var = this.p;
        if (zz2Var == null) {
            return;
        }
        byte b = 3;
        sac.V(jiu0.a(this), new h26(b), null, null, new xw5(this, zz2Var, null, b), 14);
    }

    public final void w() {
        i1w0 i1w0Var = this.b;
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

    public final a1m0 x(a1m0 a1m0Var) {
        v5l0 v5l0VarE = this.y.e();
        ctf0 ctf0Var = this.w;
        boolean zH = ctf0Var.h();
        Map map = a1m0Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Iterable<lk50> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
            for (lk50 lk50Var : iterable) {
                mk50 mk50VarC = g1x.C(lk50Var, zH);
                ygp ygpVar = ygp.B;
                r9u r9uVar = this.x;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                arrayList.add(new pab(lk50Var, mk50VarC, dub.q0(mk50VarC, ctf0Var, v5l0VarE, j1q0Var.f15748a.d(ygpVar)), v5l0VarE));
            }
            linkedHashMap.put(key, arrayList);
        }
        Iterator it = a1m0Var.f77a.iterator();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                a1m0 a1m0Var2 = a1m0Var.d;
                return a1m0.a(a1m0Var, linkedHashMap, a1m0Var2 != null ? x(a1m0Var2) : null, i, 3);
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            List list = (List) linkedHashMap.get((String) next);
            if (list != null && !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    mk50 mk50Var = ((pab) it2.next()).b;
                    if (dub.l0(mk50Var) && mk50Var.f21928a.length() > 0 && mk50Var.b.length() > 0) {
                        i = i2;
                        break;
                    }
                }
            }
            i2 = i3;
        }
    }

    public final void y() {
        eme emeVar = eme.c;
        boolean z = this.q;
        Object o26Var = this.m == emeVar ? new o26(z) : new n26(z);
        p7m0 p7m0Var = this.k;
        p7m0Var.getClass();
        p7m0Var.o(null, o26Var);
    }

    public final void z() {
        m26 m26Var = this.m == eme.c ? m26.c : m26.b;
        p7m0 p7m0Var = this.k;
        p7m0Var.getClass();
        p7m0Var.o(null, m26Var);
        this.p = new zz2(this, iun.f15405a);
        C();
    }
}
