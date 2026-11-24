package a;

import android.javax.sip.message.Response;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import org.xplatform.special_event.impl.main.presentation.model.SpecialEventTabs;

/* JADX INFO: loaded from: classes5.dex */
public final class n92 extends i3t0 {
    public static final IntRange h0 = new IntRange(0, 20, 1);
    public final crc A;
    public final m1e B;
    public final fmt0 C;
    public final stb0 D;
    public final ntb0 E;
    public final otb0 F;
    public final o470 G;
    public final ugf0 H;
    public final roi0 I;
    public final duj J;
    public final do20 K;
    public final eyg0 L;
    public final f7u M;
    public final zlu N;
    public final i6m0 O;
    public final reu P;
    public final i6m0 Q;
    public final n4u R;
    public final hcp0 S;
    public final ivn T;
    public final qv2 U;
    public final pwi V;
    public final yiu W;
    public final sff0 X;
    public c4m0 Y;
    public bby Z;
    public bby a0;
    public c4m0 b0;
    public c4m0 c0;
    public c4m0 d0;
    public bby e0;
    public c4m0 f0;
    public c4m0 g0;
    public final vzg0 o;
    public final i1w0 p;
    public final hpk0 q;
    public final mne r;
    public final lrc s;
    public final yhi t;
    public final uyu u;
    public final brc v;
    public final yo4 w;
    public final clc x;
    public final zie0 y;
    public final zr1 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public n92(vzg0 vzg0Var, i1w0 i1w0Var, hpk0 hpk0Var, svu svuVar, ctf0 ctf0Var, mne mneVar, kuu kuuVar, g2v g2vVar, lrc lrcVar, yhi yhiVar, uyu uyuVar, brc brcVar, yo4 yo4Var, clc clcVar, zie0 zie0Var, zr1 zr1Var, crc crcVar, m1e m1eVar, fmt0 fmt0Var, stb0 stb0Var, ntb0 ntb0Var, otb0 otb0Var, o470 o470Var, ugf0 ugf0Var, roi0 roi0Var, duj dujVar, do20 do20Var, eyg0 eyg0Var, f7u f7uVar, zlu zluVar, i6m0 i6m0Var, reu reuVar, i6m0 i6m0Var2, n4u n4uVar, hcp0 hcp0Var, ivn ivnVar, qv2 qv2Var, pwi pwiVar, yiu yiuVar, r9u r9uVar, pru pruVar, lbu lbuVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        crcVar.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        super(new h92((Object) pruVar, (Object) svuVar, (Object) g2vVar, (Object) kuuVar, (Object) hpk0Var, (Object) vzg0Var, (Object) lbuVar, (Object) r9uVar, (byte) 0), cvm0.p(vs10Var, vs10Var), new uc(ctf0Var, (byte) 18), (yzn0) null);
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = hpk0Var;
        this.r = mneVar;
        this.s = lrcVar;
        this.t = yhiVar;
        this.u = uyuVar;
        this.v = brcVar;
        this.w = yo4Var;
        this.x = clcVar;
        this.y = zie0Var;
        this.z = zr1Var;
        this.A = crcVar;
        this.B = m1eVar;
        this.C = fmt0Var;
        this.D = stb0Var;
        this.E = ntb0Var;
        this.F = otb0Var;
        this.G = o470Var;
        this.H = ugf0Var;
        this.I = roi0Var;
        this.J = dujVar;
        this.K = do20Var;
        this.L = eyg0Var;
        this.M = f7uVar;
        this.N = zluVar;
        this.O = i6m0Var;
        this.P = reuVar;
        this.Q = i6m0Var2;
        this.R = n4uVar;
        this.S = hcp0Var;
        this.T = ivnVar;
        this.U = qv2Var;
        this.V = pwiVar;
        this.W = yiuVar;
        this.X = pruVar.a();
    }

    public final void M() {
        brc brcVar = this.v;
        brcVar.f3073a.b.f31721a.r();
        brcVar.b.b.f23010a.r();
        brcVar.c.b.f36841a.r();
        this.A.f4838a.d.f14742a.remove(Integer.valueOf(((d92) D()).b.f2186a));
        ((iqp0) this.s.b).f15220a.d.remove(Integer.valueOf(((d92) D()).b.f2186a));
        ((ConcurrentHashMap) ((w1e0) this.K.f6397a).d.f43005a).remove(Integer.valueOf(((d92) D()).b.f2186a));
    }

    public final void N() {
        bby bbyVar = this.a0;
        byte b = 1;
        if ((bbyVar == null || !bbyVar.isActive()) && ((d92) D()).b.h) {
            this.a0 = i3t0.K(this, null, null, new j92(this, null, b), 3);
        }
    }

    public final void O() {
        c4m0 c4m0Var = this.c0;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            int i = ((d92) D()).b.f2186a;
            boolean z = ((d92) D()).f instanceof wi50;
            f7u f7uVar = this.M;
            f7uVar.getClass();
            ylu yluVar = new ylu(f7uVar, z, new hie0(), i, null);
            yje yjeVar = null;
            this.c0 = i3t0.L(this, new dnq(new fnq(bkb.h0(8L, TimeUnit.SECONDS, yluVar), new i92(this, yjeVar, (byte) 2), (byte) 4), new l92(this, yjeVar, (byte) 0), (byte) 0), null, null, 3);
        }
    }

    public final void P() {
        c4m0 c4m0Var = this.d0;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            byte b2 = 3;
            yje yjeVar = null;
            this.d0 = i3t0.L(this, new dnq(new fnq(aoq.c((qoj0) this.N.f44599a.b.b, new o7a(b2, yjeVar, b)), new i92(this, yjeVar, b2), (byte) 4), new l92(this, yjeVar, b), (byte) 1), null, null, 3);
        }
    }

    public final void Q() {
        if (((d92) D()).b.d.f != 40) {
            return;
        }
        sac.i0(jiu0.a(this), n92.class.getSimpleName().concat(".preloadCyberInfo"), 3, 0L, null, null, new ya(this, null, (byte) 5), null, this.r.c, new g92(this, (byte) 2), null, Response.DOES_NOT_EXIST_ANYWHERE);
    }

    @Override // a.diu0
    public final void v() {
        M();
        v3c.N(this.Y);
        v3c.N(this.b0);
        v3c.N(this.c0);
        v3c.N(this.d0);
        v3c.N(this.e0);
        v3c.N(this.f0);
        this.Q.f14248a.f5514a.b = false;
        v3c.N(this.g0);
        v3c.N(this.Z);
        v3c.N(this.a0);
        this.C.a(true);
        this.t.c();
        this.V.m();
        ((gok0) this.x.b).f11635a.f9885a.h("SPECIAL_EVENT_ID_PREF_KEY");
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        uf50 uf50Var;
        boolean z;
        boolean z2;
        boolean z3;
        Object value;
        d92 d92Var;
        Pair pair;
        i82 i82Var = (i82) obj;
        i82Var.getClass();
        super.x(i82Var);
        if (i82Var.equals(z72.f43897a)) {
            v3c.N(this.b0);
            v3c.N(this.c0);
            v3c.N(this.d0);
            v3c.N(this.e0);
            v3c.N(this.Z);
            v3c.N(this.a0);
            v3c.N(this.Y);
            this.t.c();
            this.V.m();
            return;
        }
        boolean zEquals = i82Var.equals(b82.f2137a);
        mne mneVar = this.r;
        yje yjeVar = null;
        byte b = 1;
        if (zEquals) {
            c4m0 c4m0Var = this.b0;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.b0 = i3t0.L(this, new fnq(this.u.f36509a.h(), new i92(this, yjeVar, b), (byte) 4), mneVar.f22085a, null, 2);
            }
            c4m0 c4m0Var2 = this.Y;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.Y = i3t0.L(this, new fnq(this.B.b(), new wa(this, yjeVar, (byte) 5), (byte) 4), mneVar.f22085a, null, 2);
                return;
            }
            return;
        }
        byte b2 = 0;
        if (i82Var.equals(c82.f3891a)) {
            v3c.N(this.Z);
            v3c.N(this.a0);
            this.C.a(true);
            O();
            P();
            bby bbyVar = this.Z;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.Z = i3t0.K(this, null, null, new j92(this, yjeVar, b2), 3);
            }
            N();
            Q();
            return;
        }
        boolean zEquals2 = i82Var.equals(d82.f5622a);
        i1w0 i1w0Var = this.p;
        hpk0 hpk0Var = this.q;
        if (!zEquals2) {
            boolean zEquals3 = i82Var.equals(g82.f10844a);
            zr1 zr1Var = this.z;
            yo4 yo4Var = this.w;
            vzg0 vzg0Var = this.o;
            if (zEquals3) {
                SpecialEventTabs specialEventTabs = (SpecialEventTabs) vzg0Var.a("SELECTED_TAB_POSITION_KEY");
                if (specialEventTabs == null) {
                    specialEventTabs = SpecialEventTabs.SCHEDULE;
                }
                String str = specialEventTabs.f46968a;
                yo4Var.m(str);
                zr1Var.q(str);
                i1w0Var.d(new g92(this, b));
                return;
            }
            if (i82Var instanceof h82) {
                int i = (int) ((h82) i82Var).f12605a;
                int i2 = hpk0Var.f13447a;
                SpecialEventTabs specialEventTabs2 = (SpecialEventTabs) CollectionsKt.W(i, ((d92) D()).c.b);
                if (specialEventTabs2 != null) {
                    int iOrdinal = specialEventTabs2.ordinal();
                    if (iOrdinal == 0) {
                        pair = new Pair(fqk0.SCHEDULE, znk0.SCHEDULE);
                    } else if (iOrdinal == 1) {
                        pair = new Pair(fqk0.MY_GAMES, znk0.MY_GAMES);
                    } else if (iOrdinal == 2) {
                        pair = new Pair(fqk0.STATISTIC, znk0.STATISTIC);
                    } else {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return;
                        }
                        pair = new Pair(fqk0.TOURNAMENT, znk0.TOURNAMENT);
                    }
                    fqk0 fqk0Var = (fqk0) pair.f46059a;
                    znk0 znk0Var = (znk0) pair.b;
                    yo4Var.s(i2, fqk0Var);
                    zr1Var.w(i2, znk0Var);
                }
                SpecialEventTabs specialEventTabs3 = (SpecialEventTabs) ((d92) D()).c.b.get(i);
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    d92Var = (d92) value;
                    this.f.getClass();
                } while (!p7m0Var.m(value, d92.a(d92Var, null, lwk0.a(d92Var.c, specialEventTabs3, null, null, null, null, null, 126), null, null, null, 0L, null, 2043)));
                vzg0Var.e("SELECTED_TAB_POSITION_KEY", specialEventTabs3);
                return;
            }
            if (!i82Var.equals(a82.f403a)) {
                if (i82Var instanceof e82) {
                    e82 e82Var = (e82) i82Var;
                    sac.V(jiu0.a(this), new ln1(1, this, n92.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, mneVar.c, new ey((byte) 5, e82Var.f7353a, null, this, e82Var.b), 10);
                    return;
                }
                if (!i82Var.equals(f82.f9087a)) {
                    t9f.b();
                    return;
                }
                yi50 yi50Var = ((d92) D()).f;
                xi50 xi50Var = yi50Var instanceof xi50 ? (xi50) yi50Var : null;
                if (xi50Var == null || (uf50Var = xi50Var.f40928a) == null) {
                    return;
                }
                i3t0.K(this, null, null, new r72(this, uf50Var, yjeVar, b), 3);
                return;
            }
            int i3 = hpk0Var.f13447a;
            fok0 fok0Var = ((gok0) this.L.b).f11635a;
            if (fok0Var.f9885a.a().getInt("SPECIAL_EVENT_ID_PREF_KEY", 0) != i3) {
                fok0Var.f9885a.e(i3, "SPECIAL_EVENT_ID_PREF_KEY");
            }
            lok0 lok0Var = ((d92) D()).b.d;
            List list = lok0Var.k;
            List list2 = lok0Var.m;
            List list3 = lok0Var.l;
            boolean zIsEmpty = list.isEmpty();
            IntRange intRange = h0;
            if (!zIsEmpty && (list == null || !list.isEmpty())) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    int i4 = intRange.f46068a;
                    if (iIntValue <= intRange.b && i4 <= iIntValue) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (!list3.isEmpty() && !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    int iIntValue2 = ((Number) it2.next()).intValue();
                    int i5 = intRange.f46068a;
                    if (iIntValue2 <= intRange.b && i5 <= iIntValue2) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if (list2.isEmpty() || list2.isEmpty()) {
                z3 = false;
            } else {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    int iIntValue3 = ((Number) it3.next()).intValue();
                    int i6 = intRange.f46068a;
                    if (iIntValue3 <= intRange.b && i6 <= iIntValue3) {
                        z3 = true;
                    }
                }
                z3 = false;
            }
            Q();
            v3c.N(this.g0);
            this.g0 = i3t0.L(this, new fnq(this.R.b(), new i92(this, yjeVar, b2), (byte) 4), null, null, 3);
            H(new oh20(lok0Var, z, z2, z3, (byte) 2));
            return;
        }
        M();
        LinkedHashMap linkedHashMap = xnk0.f41174a;
        int i7 = hpk0Var.f13447a;
        String str2 = hpk0Var.d;
        xnk0.a(i7, str2);
        LinkedHashMap linkedHashMap2 = xbv0.f40619a;
        xbv0.a(hpk0Var.f13447a, str2);
        i1w0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayList, 0);
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
