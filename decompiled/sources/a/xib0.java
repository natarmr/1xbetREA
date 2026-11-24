package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class xib0 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final ini0 o;
    public final ini0 p;
    public final zri0 q;
    public final i1w0 r;
    public final mne s;
    public final oqx t;
    public final zri0 u;
    public final nw20 v;
    public final dq00 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xib0(xrt xrtVar, gmu gmuVar, puu puuVar, lsn lsnVar, ini0 ini0Var, ini0 ini0Var2, zri0 zri0Var, i1w0 i1w0Var, pru pruVar, lbu lbuVar, ctf0 ctf0Var, mne mneVar, oqx oqxVar, qqx qqxVar, zri0 zri0Var2, nw20 nw20Var, dq00 dq00Var) {
        super(null, new pg1((Object) pruVar, (Object) lbuVar, (Object) puuVar, (Object) xrtVar, (Object) gmuVar, (Object) lsnVar, (Object) qqxVar, (byte) 12), new iv80(ctf0Var, (byte) 5), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = ini0Var;
        this.p = ini0Var2;
        this.q = zri0Var;
        this.r = i1w0Var;
        this.s = mneVar;
        this.t = oqxVar;
        this.u = zri0Var2;
        this.v = nw20Var;
        this.w = dq00Var;
        sac.V(jiu0.a(this), wib0.f39207a, null, mneVar.c, new c670(this, null, (byte) 19), 10);
        gx3 gx3VarM = M();
        ArrayList arrayList = new ArrayList(gx3VarM.c);
        Iterator it = ((ax3) gx3VarM.entrySet()).iterator();
        while (true) {
            dx3 dx3Var = (dx3) it;
            if (!dx3Var.hasNext()) {
                break;
            }
            dx3Var.next();
            arrayList.add(((jib0) dx3Var.getKey()).a(((Boolean) dx3Var.getValue()).booleanValue()));
        }
        nw20Var.b = arrayList;
        dq00 dq00Var2 = this.w;
        gx3 gx3VarM2 = M();
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(gx3VarM2.c));
        for (Map.Entry entry : (ax3) gx3VarM2.entrySet()) {
            linkedHashMap.put(w9x.Q((jib0) entry.getKey()), entry.getValue());
        }
        dq00Var2.getClass();
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList2.add(((lib0) entry2.getKey()).a(((Boolean) entry2.getValue()).booleanValue()));
        }
        dq00Var2.c = arrayList2;
    }

    public final gx3 M() {
        gx3 gx3Var = new gx3(0);
        gx3Var.put(jib0.d, Boolean.valueOf(((uib0) D()).f));
        gx3Var.put(jib0.b, Boolean.valueOf(((uib0) D()).d));
        gx3Var.put(jib0.c, Boolean.valueOf(((uib0) D()).e));
        gx3Var.put(jib0.f16566a, Boolean.valueOf(((uib0) D()).b));
        return gx3Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        hib0 hib0Var = (hib0) obj;
        hib0Var.getClass();
        super.x(hib0Var);
        if (hib0Var.equals(cib0.f4404a)) {
            E();
            return;
        }
        if (hib0Var.equals(fib0.f9579a)) {
            G(tib0.f34000a);
            return;
        }
        boolean zEquals = hib0Var.equals(dib0.f6130a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        zri0 zri0Var = this.u;
        ini0 ini0Var = this.p;
        ini0 ini0Var2 = this.o;
        zri0 zri0Var2 = this.q;
        if (zEquals) {
            ((of6) zri0Var2.f44855a.f24171a).f25150a.d("showSportFeed", true);
            q7d0 q7d0Var = ((of6) ini0Var2.f15076a.f24171a).f25150a;
            q7d0Var.d("showBannerFeed", true);
            q7d0Var.d("bannerFeedManuallyChanged", true);
            ((of6) ini0Var.f15076a.f24171a).f25150a.d("SHOW_ONE_X_GAMES_SLIDER", true);
            sac.V(jiu0.a(this), wib0.f39207a, null, this.s.c, new c670(this, null, (byte) 19), 10);
            ((of6) zri0Var.f44855a.f24171a).f25150a.d("IS_POPULAR_PERSONALIZATION_TOGGLE_ENABLE", true);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, uib0.a((uib0) value2, false, true, true, true, true, 1989)));
            return;
        }
        if (hib0Var.equals(eib0.f7851a)) {
            gx3 gx3VarM = M();
            nw20 nw20Var = this.v;
            nw20Var.getClass();
            ArrayList arrayList = new ArrayList(gx3VarM.c);
            Iterator it = ((ax3) gx3VarM.entrySet()).iterator();
            while (true) {
                dx3 dx3Var = (dx3) it;
                if (!dx3Var.hasNext()) {
                    break;
                }
                dx3Var.next();
                arrayList.add(((jib0) dx3Var.getKey()).a(((Boolean) dx3Var.getValue()).booleanValue()));
            }
            LinkedHashSet linkedHashSetB0 = CollectionsKt.B0(arrayList, CollectionsKt.P0((List) nw20Var.b));
            if (!linkedHashSetB0.isEmpty()) {
                ((kt2) nw20Var.f24215a).a("acc_settings_popular_change", wp20.b(new Pair("option", linkedHashSetB0)));
            }
            gx3 gx3VarM2 = M();
            LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(gx3VarM2.c));
            Iterator it2 = ((ax3) gx3VarM2.entrySet()).iterator();
            while (true) {
                dx3 dx3Var2 = (dx3) it2;
                if (!dx3Var2.hasNext()) {
                    break;
                }
                dx3Var2.next();
                linkedHashMap.put(w9x.Q((jib0) dx3Var2.getKey()), dx3Var2.getValue());
            }
            dq00 dq00Var = this.w;
            dq00Var.getClass();
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add(((lib0) entry.getKey()).a(((Boolean) entry.getValue()).booleanValue()));
            }
            LinkedHashSet linkedHashSetB1 = CollectionsKt.B0(arrayList2, CollectionsKt.P0((List) dq00Var.c));
            if (!linkedHashSetB1.isEmpty()) {
                s1p s1pVar = (s1p) dq00Var.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : linkedHashSetB1) {
                    if (((String) obj2).length() > 0) {
                        arrayList3.add(obj2);
                    }
                }
                b1j.v(CollectionsKt.b0(arrayList3, ", ", null, null, null, 62), s1pVar, 11161L);
            }
            i1w0 i1w0Var = this.r;
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
            if (!(hib0Var instanceof gib0)) {
                t9f.b();
                return;
            }
            gib0 gib0Var = (gib0) hib0Var;
            boolean z = gib0Var.f11337a;
            int iOrdinal = gib0Var.b.ordinal();
            if (iOrdinal == 0) {
                boolean z2 = z;
                ((of6) zri0Var.f44855a.f24171a).f25150a.d("IS_POPULAR_PERSONALIZATION_TOGGLE_ENABLE", z2);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                    boolean z3 = z2;
                    if (p7m0Var2.m(value3, uib0.a((uib0) value3, false, z3, false, false, false, 2045))) {
                        return;
                    } else {
                        z2 = z3;
                    }
                }
            } else if (iOrdinal == 1) {
                boolean z4 = z;
                ((of6) zri0Var2.f44855a.f24171a).f25150a.d("showSportFeed", z4);
                p7m0 p7m0Var3 = ocjVar.f25029a;
                while (true) {
                    Object value4 = p7m0Var3.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                    boolean z5 = z4;
                    if (p7m0Var3.m(value4, uib0.a((uib0) value4, false, false, z5, false, false, 2039))) {
                        return;
                    } else {
                        z4 = z5;
                    }
                }
            } else {
                if (iOrdinal == 2) {
                    q7d0 q7d0Var2 = ((of6) ini0Var2.f15076a.f24171a).f25150a;
                    q7d0Var2.d("showBannerFeed", z);
                    q7d0Var2.d("bannerFeedManuallyChanged", true);
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value = p7m0Var4.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value, uib0.a((uib0) value, false, false, false, z, false, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
                    return;
                }
                if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
                ((of6) ini0Var.f15076a.f24171a).f25150a.d("SHOW_ONE_X_GAMES_SLIDER", z);
                p7m0 p7m0Var5 = ocjVar.f25029a;
                while (true) {
                    Object value5 = p7m0Var5.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                    boolean z6 = z;
                    if (p7m0Var5.m(value5, uib0.a((uib0) value5, false, false, false, false, z6, 2015))) {
                        return;
                    } else {
                        z = z6;
                    }
                }
            }
        }
    }
}
