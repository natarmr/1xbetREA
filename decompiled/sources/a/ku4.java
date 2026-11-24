package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.authenticator.impl.util.NotificationTypeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class ku4 extends w46 {
    public static final qq4 J;
    public final p7m0 A;
    public NotificationTypeInfo B;
    public NotificationPeriodInfo C;
    public bby D;
    public c4m0 E;
    public c4m0 F;
    public final ArrayList G;
    public final n0o0 H;
    public final xae0 I;
    public final rek0 b;
    public final suk c;
    public final oif0 d;
    public final dkj e;
    public final tvd f;
    public final cu g;
    public final dkj h;
    public final m1e i;
    public final viu j;
    public final x1u k;
    public final rou l;
    public final myb m;
    public final myb n;
    public final mq4 o;
    public final yo4 p;
    public final i1w0 q;
    public final ouu r;
    public final duj s;
    public final g2v t;
    public final zr1 u;
    public final ol60 v;
    public final p7m0 w;
    public final p7m0 x;
    public final p7m0 y;
    public final p7m0 z;

    static {
        iun iunVar = iun.f15405a;
        J = new qq4(iunVar, iunVar);
    }

    public ku4(vzg0 vzg0Var, rek0 rek0Var, suk sukVar, oif0 oif0Var, dkj dkjVar, tvd tvdVar, cu cuVar, tvd tvdVar2, dkj dkjVar2, m1e m1eVar, viu viuVar, x1u x1uVar, String str, rou rouVar, myb mybVar, myb mybVar2, mq4 mq4Var, r080 r080Var, yo4 yo4Var, i1w0 i1w0Var, ouu ouuVar, mne mneVar, duj dujVar, g2v g2vVar, zr1 zr1Var) {
        m1eVar.getClass();
        this.b = rek0Var;
        this.c = sukVar;
        this.d = oif0Var;
        this.e = dkjVar;
        this.f = tvdVar;
        this.g = cuVar;
        this.h = dkjVar2;
        this.i = m1eVar;
        this.j = viuVar;
        this.k = x1uVar;
        this.l = rouVar;
        this.m = mybVar;
        this.n = mybVar2;
        this.o = mq4Var;
        this.p = yo4Var;
        this.q = i1w0Var;
        this.r = ouuVar;
        this.s = dujVar;
        this.t = g2vVar;
        this.u = zr1Var;
        this.v = new ol60(3);
        p7m0 p7m0VarA = q7m0.a(J);
        this.w = p7m0VarA;
        p7m0 p7m0VarA2 = q7m0.a(wt4.f39721a);
        this.x = p7m0VarA2;
        Boolean bool = Boolean.FALSE;
        p7m0 p7m0VarA3 = q7m0.a(bool);
        this.y = p7m0VarA3;
        p7m0 p7m0VarA4 = q7m0.a(bool);
        this.z = p7m0VarA4;
        p7m0 p7m0VarA5 = q7m0.a(iun.f15405a);
        this.A = p7m0VarA5;
        this.B = new NotificationTypeInfo();
        this.C = new NotificationPeriodInfo();
        this.G = new ArrayList();
        this.H = maz.b(new lt4(this, (byte) 2));
        c00 c00Var = new c00(new gmq[]{p7m0VarA, p7m0VarA2, vtb.N(tvdVar2.f34593a.c.f13614a), p7m0VarA5, p7m0VarA3, p7m0VarA4}, this, (byte) 16);
        sje sjeVarS = d5c.S(jiu0.a(this), mneVar.b);
        lak0 lak0Var = lak0.c;
        this.I = vtb.h0(c00Var, sjeVarS, kpj0.b, new vs4(lak0Var, lak0Var, false, false, false, true, false, false));
        sac.V(jiu0.a(this), bu4.f3213a, null, mneVar.b, new au4(this, null, (byte) 1), 10);
    }

    public final void A(boolean z) {
        bby bbyVar;
        bby bbyVar2 = this.D;
        if (bbyVar2 == null || !bbyVar2.isActive() || z) {
            yje yjeVar = null;
            if (z && (bbyVar = this.D) != null) {
                bbyVar.cancel(null);
            }
            this.D = sac.Y(jiu0.a(this), 8L, null, new it4(this, (byte) 0), new y32(this, yjeVar, (byte) 25), 4);
        }
    }

    public final ArrayList B(qq4 qq4Var, List list) {
        Date time;
        Date date;
        Object next;
        List list2 = qq4Var.f29149a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((ap4) obj).j > 0) {
                arrayList.add(obj);
            }
        }
        int iOrdinal = this.C.f46354a.ordinal();
        if (iOrdinal == 1) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.add(6, -7);
            time = gregorianCalendar.getTime();
            time.getClass();
            date = new Date();
        } else if (iOrdinal != 2) {
            time = new Date(this.C.c);
            date = new Date(this.C.d);
        } else {
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.add(2, -1);
            time = gregorianCalendar2.getTime();
            time.getClass();
            date = new Date();
        }
        if (this.C.f46354a != q760.ALL_TIME) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Date date2 = ((ap4) obj2).k;
                if (date2.after(time) && date2.before(date)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        List listA0 = CollectionsKt.A0(arrayList, new s7f((byte) 23));
        ArrayList arrayList3 = new ArrayList(r3d.q(listA0, 10));
        for (Iterator it = listA0.iterator(); it.hasNext(); it = it) {
            ap4 ap4Var = (ap4) it.next();
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.d(((gt4) next).f11863a, ap4Var.b));
            gt4 gt4Var = (gt4) next;
            String str = gt4Var != null ? gt4Var.d : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            double d = gt4Var != null ? gt4Var.c : 0.0d;
            ap4Var.getClass();
            va80 va80Var = ap4Var.i;
            String strU = cww.u(va80Var);
            String str3 = ap4Var.f1232a;
            String str4 = ap4Var.d;
            int i = ap4Var.j;
            String str5 = ap4Var.f;
            String str6 = ap4Var.g;
            arrayList3.add(new xo4(str3, ap4Var.l, str4, str2, d, i, str5, va80Var, str6, ap4Var.b, ap4Var.c, ap4Var.e, ap4Var.k, ua80.i(strU, " (", str6, Separators.RPAREN)));
        }
        return arrayList3;
    }

    public final ArrayList C(qq4 qq4Var, a860 a860Var) {
        List list = qq4Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((hq4) obj).j == a860Var) {
                arrayList.add(obj);
            }
        }
        List listA0 = CollectionsKt.A0(x(arrayList), new s7f((byte) 24));
        ArrayList arrayList2 = new ArrayList(r3d.q(listA0, 10));
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            arrayList2.add(hew0.U((hq4) it.next()));
        }
        return arrayList2;
    }

    public final void D() {
        i1w0 i1w0Var = this.q;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                this.r.q(new bb50(false), true);
                return;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    public final void E() {
        this.v.f(nt4.f24078a);
    }

    public final void F(String str) {
        if (str.length() > 0) {
            this.v.f(new pt4(str));
        }
    }

    public final void G(xt4 xt4Var) {
        p7m0 p7m0Var = this.x;
        p7m0Var.getClass();
        p7m0Var.o(null, xt4Var);
    }

    public final void w() {
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

    public final List x(List list) {
        Date time;
        Date date;
        int iOrdinal = this.C.f46354a.ordinal();
        if (iOrdinal == 1) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.add(6, -7);
            time = gregorianCalendar.getTime();
            time.getClass();
            date = new Date();
        } else if (iOrdinal != 2) {
            time = new Date(this.C.c);
            date = new Date(this.C.d);
        } else {
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.add(2, -1);
            time = gregorianCalendar2.getTime();
            time.getClass();
            date = new Date();
        }
        if (this.C.f46354a == q760.ALL_TIME) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Date date2 = ((hq4) obj).h;
            if (date2.after(time) && date2.before(date)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int y(Date date) {
        int time = (int) ((date.getTime() - new Date(new Date().getTime() - ((long) (((int) ((this.j.a() - System.currentTimeMillis()) / 1000)) * (-1000)))).getTime()) / 1000);
        if (time < 0) {
            return 0;
        }
        return time;
    }

    public final Integer z(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(y(((ap4) it.next()).l)));
        }
        return (Integer) CollectionsKt.g0(arrayList);
    }
}
