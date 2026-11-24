package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class mpn extends i3t0 {
    public static final /* synthetic */ int K = 0;
    public final lbu A;
    public final m1e B;
    public final pq C;
    public final eu90 D;
    public final ort E;
    public final je F;
    public final bn6 G;
    public c4m0 H;
    public c4m0 I;
    public bby J;
    public final long o;
    public final boolean p;
    public final long q;
    public final i1w0 r;
    public final ctf0 s;
    public final rtu t;
    public final ieu u;
    public final g45 v;
    public final npx w;
    public final ag3 x;
    public final duj y;
    public final ik4 z;

    public mpn(long j, boolean z, long j2, i1w0 i1w0Var, mne mneVar, ctf0 ctf0Var, rtu rtuVar, ieu ieuVar, g45 g45Var, npx npxVar, ag3 ag3Var, duj dujVar, ik4 ik4Var, lbu lbuVar, edu eduVar, r9u r9uVar, m1e m1eVar, pq pqVar, eu90 eu90Var, ort ortVar, bzt bztVar, je jeVar, bn6 bn6Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        g8l g8lVar = new g8l(eduVar, r9uVar, bztVar, (byte) 9);
        bcn bcnVar = new bcn(ctf0Var, (byte) 2);
        rwj rwjVar = mneVar.f22085a;
        super(null, g8lVar, bcnVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = j;
        this.p = z;
        this.q = j2;
        this.r = i1w0Var;
        this.s = ctf0Var;
        this.t = rtuVar;
        this.u = ieuVar;
        this.v = g45Var;
        this.w = npxVar;
        this.x = ag3Var;
        this.y = dujVar;
        this.z = ik4Var;
        this.A = lbuVar;
        this.B = m1eVar;
        this.C = pqVar;
        this.D = eu90Var;
        this.E = ortVar;
        this.F = jeVar;
        this.G = bn6Var;
        lsm0 lsm0Var = ctf0Var.b;
        G(new epn(new DialogFields((CharSequence) lsm0Var.a(R.string.coupon_edit_dialog_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var.a(R.string.edit_event_dialog_description, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "EDIT_EVENT_INITIAL_ALERT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488)));
    }

    public final void M() {
        bby bbyVar = this.J;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        c4m0 c4m0Var = this.I;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.H;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
    }

    public final neo N(xgl0 xgl0Var) throws zon {
        ion ionVar;
        Object next;
        Object obj;
        long j = xgl0Var.f;
        long j2 = xgl0Var.e;
        double d = xgl0Var.b;
        double d2 = xgl0Var.c;
        String str = xgl0Var.d;
        byte b = xgl0Var.g;
        long j3 = xgl0Var.h;
        oon oonVar = ((ipn) D()).d;
        jon jonVar = oonVar instanceof jon ? (jon) oonVar : null;
        if (jonVar != null && (ionVar = jonVar.b) != null) {
            Iterator it = ionVar.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((oeo) next).b != j);
            oeo oeoVar = (oeo) next;
            if (oeoVar != null) {
                Iterator it2 = oeoVar.h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next2 = it2.next();
                    neo neoVar = (neo) next2;
                    Iterator it3 = it2;
                    long j4 = j;
                    if (neoVar.b == j4 && neoVar.f23395a == j2 && neoVar.k == d && neoVar.m == d2 && Intrinsics.d(neoVar.p, str) && neoVar.d.f36034a == b && neoVar.c == j3) {
                        obj = next2;
                        break;
                    }
                    it2 = it3;
                    j = j4;
                }
                neo neoVar2 = (neo) obj;
                if (neoVar2 != null) {
                    return neoVar2;
                }
            }
        }
        throw new zon();
    }

    public final void O() {
        if (this.A.j()) {
            return;
        }
        ctf0 ctf0Var = this.s;
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        G(new epn(new DialogFields((CharSequence) lsm0Var.a(R.string.attention, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var.a(R.string.coupon_record_already_exists, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528)));
    }

    public final void P(neo neoVar) throws zon {
        Object next;
        Object value;
        ArrayList arrayListN0;
        npx npxVar = this.w;
        npxVar.getClass();
        es esVar = npxVar.f23932a;
        List listI = esVar.i();
        Iterator it = listI.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (neoVar.c != ((pln) next).c);
        pln plnVar = (pln) next;
        if (plnVar == null) {
            throw new zon();
        }
        int iIndexOf = listI.indexOf(plnVar);
        if (iIndexOf == -1) {
            throw new zon();
        }
        long j = neoVar.b;
        String str = neoVar.p;
        long j2 = neoVar.f23395a;
        long j3 = plnVar.c;
        long j4 = plnVar.d;
        double d = neoVar.k;
        long j5 = neoVar.h;
        boolean z = plnVar.g;
        boolean z2 = neoVar.f;
        String str2 = neoVar.q;
        String strL = (str2.length() <= 0 || str.length() <= 0) ? "" : kng0.l(str2, ": ", str);
        long j6 = neoVar.u;
        String str3 = strL;
        String str4 = plnVar.k;
        double d2 = neoVar.m;
        pln plnVar2 = new pln(j, j2, j3, j4, d, j5, z, z2, str3, j6, str4, d2, d2, neoVar.n, neoVar.g, plnVar.p, plnVar.q, plnVar.r, plnVar.s, plnVar.t, plnVar.u, plnVar.v, plnVar.w, neoVar.v, "", neoVar.t, plnVar.A);
        sln slnVar = (sln) esVar.f8305a;
        slnVar.getClass();
        p7m0 p7m0Var = slnVar.b;
        do {
            value = p7m0Var.getValue();
            Collection collection = (List) value;
            if (collection == null) {
                collection = iun.f15405a;
            }
            arrayListN0 = CollectionsKt.N0(collection);
            arrayListN0.set(iIndexOf, plnVar2);
        } while (!p7m0Var.m(value, arrayListN0));
        kt2 kt2Var = this.x.f809a;
        long j7 = this.q;
        Pair pair = new Pair("sport_id", Long.valueOf(j7));
        long j8 = this.o;
        kt2Var.a("coupon_market_change", xp20.f(pair, new Pair("game_id", Long.valueOf(j8))));
        this.z.f14907a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j7), new i1p((byte) 0, j8)}), 3218L);
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        p0w0 p0w0Var;
        boolean z;
        gon gonVar = (gon) obj;
        gonVar.getClass();
        super.x(gonVar);
        boolean zEquals = gonVar.equals(ynn.f42949a);
        p0w0 p0w0Var2 = p0w0.f26173a;
        i1w0 i1w0Var = this.r;
        if (zEquals) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var2), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            fpn fpnVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (gonVar.equals(znn.f44685a)) {
                c4m0 c4m0Var = this.H;
                if (c4m0Var != null ? c4m0Var.isActive() : false) {
                    return;
                }
                i3t0.K(this, null, null, new lpn(this, null), 3);
                return;
            }
            if (!(gonVar instanceof aon)) {
                if (gonVar instanceof bon) {
                    H(new a21((byte) 13, ((bon) gonVar).f2941a));
                    return;
                }
                if (!(gonVar instanceof con)) {
                    if (gonVar instanceof eon) {
                        i3t0.K(this, null, null, new uw(this, ((eon) gonVar).f8145a, objArr2 == true ? 1 : 0, (byte) 3), 3);
                        return;
                    }
                    if (gonVar.equals(fon.f9890a)) {
                        i3t0.K(this, null, null, new kpn(this, objArr == true ? 1 : 0, (byte) 0), 3);
                        return;
                    }
                    if (gonVar.equals(don.f6423a)) {
                        M();
                        return;
                    } else if (gonVar.equals(xnn.f41177a)) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                con conVar = (con) gonVar;
                long j = conVar.b;
                bn6 bn6Var = this.G;
                long j2 = this.o;
                bn6Var.f(j2, j);
                this.F.i(j2, j);
                gho ghoVar = conVar.f4709a;
                ctf0 ctf0Var = this.s;
                ctf0Var.getClass();
                int iOrdinal = ghoVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        lsm0 lsm0Var = ctf0Var.b;
                        fpnVar = new fpn(lsm0Var.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.auto_sub_description, Arrays.copyOf(new Object[0], 0)));
                    } else if (iOrdinal == 2) {
                        lsm0 lsm0Var2 = ctf0Var.b;
                        fpnVar = new fpn(lsm0Var2.a(R.string.optibet_market_info_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.optibet_market_desc, Arrays.copyOf(new Object[0], 0)));
                    } else if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    } else {
                        lsm0 lsm0Var3 = ctf0Var.b;
                        fpnVar = new fpn(lsm0Var3.a(R.string.each_way_dialog_title, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.each_way_description, Arrays.copyOf(new Object[0], 0)));
                    }
                }
                if (fpnVar != null) {
                    G(fpnVar);
                    return;
                }
                return;
            }
            wgl0 wgl0Var = ((aon) gonVar).f1210a;
            try {
                if ((((ipn) D()).d instanceof jon) && (wgl0Var instanceof vgl0)) {
                    neo neoVarN = N(((vgl0) wgl0Var).f37387a);
                    pq pqVar = this.C;
                    long j3 = neoVarN.c;
                    long j4 = neoVarN.f23395a;
                    double d = neoVarN.k;
                    long j5 = neoVarN.h;
                    String str = neoVarN.p;
                    String str2 = neoVarN.n;
                    iun iunVar = iun.f15405a;
                    str.getClass();
                    str2.getClass();
                    iunVar.getClass();
                    List listI = pqVar.f27394a.i();
                    if (listI == null || !listI.isEmpty()) {
                        Iterator it = listI.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                pln plnVar = (pln) it.next();
                                p0w0Var = p0w0Var2;
                                try {
                                    if (plnVar.c == j3 && plnVar.b == j4 && plnVar.e == d && plnVar.f == j5) {
                                        z = true;
                                    } else {
                                        p0w0Var2 = p0w0Var;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } else {
                                z = false;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        O();
                        return;
                    } else {
                        P(neoVarN);
                        return;
                    }
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                p0w0Var = p0w0Var2;
            }
            this.y.b(th, new mxm(this, (byte) 25));
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
