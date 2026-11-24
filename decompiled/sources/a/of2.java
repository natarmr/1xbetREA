package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class of2 extends i3t0 {
    public final vzg0 o;
    public final i1w0 p;
    public final qrc q;
    public final hru r;
    public final qrc s;
    public final s31 t;
    public final cyu u;
    public bby v;

    /* JADX WARN: Illegal instructions before constructor call */
    public of2(vzg0 vzg0Var, i1w0 i1w0Var, mne mneVar, ctf0 ctf0Var, pru pruVar, qrc qrcVar, hru hruVar, qrc qrcVar2, s31 s31Var, cyu cyuVar) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new nf2(pruVar, vzg0Var, (byte) 0), cvm0.p(rwjVar, rwjVar), new uc(ctf0Var, (byte) 21), (yzn0) null);
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = qrcVar;
        this.r = hruVar;
        this.s = qrcVar2;
        this.t = s31Var;
        this.u = cyuVar;
    }

    @Override // a.diu0
    public final void v() {
        ((u5g0) this.s.f29203a.f24171a).f35093a.n(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        wgh0 wgh0Var;
        Object value3;
        Object value4;
        Object value5;
        b9g0 b9g0Var;
        Object value6;
        ye2 ye2Var = (ye2) obj;
        ye2Var.getClass();
        boolean z = ye2Var instanceof xe2;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        byte b = 2;
        vzg0 vzg0Var = this.o;
        if (z) {
            int i = ((xe2) ye2Var).f40723a;
            b9g0.f2207a.getClass();
            if (i == 0) {
                b9g0Var = b9g0.b;
            } else if (i == 1) {
                b9g0Var = b9g0.c;
            } else {
                if (i != 2) {
                    throw new ss3();
                }
                b9g0Var = b9g0.d;
            }
            b9g0 b9g0Var2 = b9g0Var;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value6 = p7m0Var.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value6, jf2.a((jf2) value6, b9g0Var2, null, false, false, null, 254)));
            vzg0Var.e("SELECTED_TAB_KEY", b9g0Var2);
            return;
        }
        Object[] objArr = 0;
        if (ye2Var.equals(re2.f30315a)) {
            Calendar calendar = ((jf2) D()).h;
            G(new gf2(calendar != null ? calendar.getTime() : null));
            return;
        }
        if (ye2Var.equals(pe2.f26829a)) {
            if (((jf2) D()).f16404a != b9g0.d && ((jf2) D()).f) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(((jf2) D()).e);
                Set setKeySet = ((jf2) D()).e.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setKeySet) {
                    if (((b9g0) obj2) != b9g0.d) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashMap.remove((b9g0) it.next());
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value5 = p7m0Var2.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value5, jf2.a((jf2) value5, null, linkedHashMap, false, false, null, 207)));
                vzg0Var.e("SEARCH_QUERY_MAP_KEY", linkedHashMap);
                return;
            }
            i1w0 i1w0Var = this.p;
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
            if (ye2Var instanceof ue2) {
                String str = ((ue2) ye2Var).f35506a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(((jf2) D()).e);
                b9g0 b9g0Var3 = ((jf2) D()).f16404a;
                b9g0 b9g0Var4 = b9g0.b;
                if (b9g0Var3 == b9g0Var4 || b9g0Var3 == b9g0.c) {
                    linkedHashMap2.put(b9g0Var4, str);
                    linkedHashMap2.put(b9g0.c, str);
                } else {
                    linkedHashMap2.put(b9g0Var3, str);
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var3.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value4, jf2.a((jf2) value4, null, linkedHashMap2, false, false, null, 239)));
                vzg0Var.e("SEARCH_QUERY_MAP_KEY", linkedHashMap2);
                return;
            }
            if (ye2Var.equals(we2.f38998a)) {
                int iOrdinal = ((jf2) D()).f16404a.ordinal();
                if (iOrdinal == 0) {
                    wgh0Var = wgh0.SPORT_RESULTS_HISTORY;
                } else if (iOrdinal == 1) {
                    wgh0Var = wgh0.SPORT_RESULTS_LIVE;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    wgh0Var = wgh0.SPORT_RESULTS_SEARCH;
                }
                this.t.g(wgh0Var);
                this.u.C(wgh0Var.f39117a);
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value3, jf2.a((jf2) value3, null, null, true, false, null, 223)));
                return;
            }
            if (ye2Var.equals(me2.f21624a)) {
                E();
                return;
            }
            if (ye2Var.equals(se2.f32057a)) {
                G(ff2.f9431a);
                return;
            }
            if (ye2Var instanceof te2) {
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var5.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value2, jf2.a((jf2) value2, null, null, false, ((te2) ye2Var).f33798a, null, 191)));
                vzg0Var.e("SHOW_MULTISELECT_KEY", Boolean.valueOf(((te2) ye2Var).f33798a));
                return;
            }
            if (!(ye2Var instanceof qe2)) {
                if (!(ye2Var instanceof ve2)) {
                    if (!ye2Var.equals(ne2.f23362a)) {
                        if (ye2Var.equals(oe2.f25102a)) {
                            return;
                        }
                        t9f.b();
                        return;
                    } else {
                        bby bbyVar = this.v;
                        if (bbyVar == null || !bbyVar.isActive()) {
                            this.v = i3t0.K(this, null, null, new m91(this, objArr == true ? 1 : 0, b), 3);
                            return;
                        }
                        return;
                    }
                }
                b9g0 b9g0Var5 = b9g0.d;
                String str2 = ((ve2) ye2Var).f37261a;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(((jf2) D()).e);
                lme0 lme0Var = b9g0.f2207a;
                lme0 lme0Var2 = b9g0.f2207a;
                linkedHashMap3.put(b9g0Var5, str2);
                p7m0 p7m0Var6 = ocjVar.f25029a;
                do {
                    value = p7m0Var6.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var6.m(value, jf2.a((jf2) value, null, linkedHashMap3, false, false, null, 239)));
                vzg0Var.e("SEARCH_QUERY_MAP_KEY", linkedHashMap3);
                return;
            }
            qe2 qe2Var = (qe2) ye2Var;
            int i2 = qe2Var.f28561a;
            int i3 = qe2Var.b;
            int i4 = qe2Var.c;
            Calendar calendar2 = Calendar.getInstance();
            int i5 = calendar2.get(11);
            int i6 = calendar2.get(12);
            int i7 = calendar2.get(13);
            Calendar calendar3 = Calendar.getInstance();
            calendar3.set(i2, i3, i4, i5, i6, i7);
            vzg0Var.e("CHOOSEN_DATE_KEY", calendar3);
            p7m0 p7m0Var7 = ocjVar.f25029a;
            while (true) {
                Object value7 = p7m0Var7.getValue();
                value7.getClass();
                oyg0Var.getClass();
                Calendar calendar4 = calendar3;
                if (p7m0Var7.m(value7, jf2.a((jf2) value7, null, null, false, false, calendar4, 127))) {
                    Date time = calendar4.getTime();
                    time.getClass();
                    this.q.a(time, false);
                    return;
                }
                calendar3 = calendar4;
            }
        }
    }
}
