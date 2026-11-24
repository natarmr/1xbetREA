package a;

import android.javax.sip.message.Response;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import org.xplatform.special_event.impl.main.presentation.model.SpecialEventTabs;

/* JADX INFO: loaded from: classes5.dex */
public final class tpk0 extends i3t0 {
    public static final IntRange Z = new IntRange(0, 20, 1);
    public final zie0 A;
    public final zr1 B;
    public final crc C;
    public final m1e D;
    public final fmt0 E;
    public final i6m0 F;
    public final reu G;
    public final stb0 H;
    public final ntb0 I;
    public final otb0 J;
    public final o470 K;
    public final ugf0 L;
    public final roi0 M;
    public final duj N;
    public final do20 O;
    public final pwi P;
    public final yiu Q;
    public final sff0 R;
    public c4m0 S;
    public bby T;
    public c4m0 U;
    public bby V;
    public final c4m0 W;
    public bby X;
    public c4m0 Y;
    public final vzg0 o;
    public final i1w0 p;
    public final hpk0 q;
    public final mne r;
    public final lrc s;
    public final yhi t;
    public final uyu u;
    public final e1u v;
    public final n4u w;
    public final brc x;
    public final yo4 y;
    public final clc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpk0(vzg0 vzg0Var, i1w0 i1w0Var, hpk0 hpk0Var, svu svuVar, ctf0 ctf0Var, mne mneVar, kuu kuuVar, g2v g2vVar, lrc lrcVar, yhi yhiVar, uyu uyuVar, e1u e1uVar, n4u n4uVar, brc brcVar, yo4 yo4Var, clc clcVar, zie0 zie0Var, zr1 zr1Var, crc crcVar, m1e m1eVar, fmt0 fmt0Var, i6m0 i6m0Var, reu reuVar, reu reuVar2, stb0 stb0Var, ntb0 ntb0Var, otb0 otb0Var, o470 o470Var, ugf0 ugf0Var, roi0 roi0Var, duj dujVar, do20 do20Var, pwi pwiVar, yiu yiuVar, eyg0 eyg0Var, pru pruVar) {
        super(vzg0Var, new bg0(pruVar, svuVar, g2vVar, kuuVar, hpk0Var, vzg0Var, (byte) 18), cvm0.p(mneVar.f22085a, mneVar.c), new h0j0(ctf0Var, (byte) 5));
        i1w0Var.getClass();
        ctf0Var.getClass();
        crcVar.getClass();
        m1eVar.getClass();
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = hpk0Var;
        this.r = mneVar;
        this.s = lrcVar;
        this.t = yhiVar;
        this.u = uyuVar;
        this.v = e1uVar;
        this.w = n4uVar;
        this.x = brcVar;
        this.y = yo4Var;
        this.z = clcVar;
        this.A = zie0Var;
        this.B = zr1Var;
        this.C = crcVar;
        this.D = m1eVar;
        this.E = fmt0Var;
        this.F = i6m0Var;
        this.G = reuVar;
        this.H = stb0Var;
        this.I = ntb0Var;
        this.J = otb0Var;
        this.K = o470Var;
        this.L = ugf0Var;
        this.M = roi0Var;
        this.N = dujVar;
        this.O = do20Var;
        this.P = pwiVar;
        this.Q = yiuVar;
        this.R = pruVar.a();
        int i = hpk0Var.f13447a;
        fok0 fok0Var = ((gok0) eyg0Var.b).f11635a;
        if (fok0Var.f9885a.a().getInt("SPECIAL_EVENT_ID_PREF_KEY", 0) != i) {
            fok0Var.f9885a.e(i, "SPECIAL_EVENT_ID_PREF_KEY");
        }
        O();
        c4m0 c4m0Var = this.W;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.W = i3t0.L(this, new dnq(new fnq(new i89(((d5m0) reuVar2.b).f5514a.f3779a, (byte) 22), new yg1((Object) this, yjeVar, (byte) 29), (byte) 4), new sye0(this, yjeVar, (byte) 9), (byte) 1), null, null, 3);
        }
    }

    public final void M() {
        brc brcVar = this.x;
        brcVar.f3073a.b.f31721a.r();
        brcVar.b.b.f23010a.r();
        brcVar.c.b.f36841a.r();
        this.C.f4838a.d.f14742a.remove(Integer.valueOf(((jpk0) D()).f16907a));
        ((iqp0) this.s.b).f15220a.d.remove(Integer.valueOf(((jpk0) D()).f16907a));
        ((ConcurrentHashMap) ((w1e0) this.O.f6397a).d.f43005a).remove(Integer.valueOf(((jpk0) D()).f16907a));
    }

    public final void N() {
        bby bbyVar = this.X;
        if ((bbyVar == null || !bbyVar.isActive()) && ((jpk0) D()).h.f) {
            this.X = i3t0.K(this, null, null, new opk0(this, null, (byte) 2), 3);
        }
    }

    public final void O() {
        if (((jpk0) D()).h.f15168a != 40) {
            return;
        }
        sac.i0(jiu0.a(this), tpk0.class.getSimpleName().concat(".preloadCyberInfo"), 3, 0L, null, null, new z8b0(this, null, (byte) 23), null, this.r.c, new npk0(this, (byte) 0), null, Response.DOES_NOT_EXIST_ANYWHERE);
    }

    public final void P() {
        c4m0 c4m0Var = this.U;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.U = i3t0.L(this, new p6d(new div(this.v.a(), (byte) 1), new div(this.w.d(), (byte) 2), new sch(((jpk0) D()).h.e, this, null, (byte) 2), b), null, null, 3);
        }
    }

    @Override // a.diu0
    public final void v() {
        M();
        p7m0 p7m0Var = ((d5m0) this.G.b).f5514a.f3779a;
        v3c.N(this.S);
        v3c.N(this.Y);
        v3c.N(this.T);
        v3c.N(this.X);
        v3c.N(this.U);
        v3c.N(this.V);
        v3c.N(this.W);
        this.E.a(true);
        this.t.c();
        this.P.m();
        ((gok0) this.z.b).f11635a.f9885a.h("SPECIAL_EVENT_ID_PREF_KEY");
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Pair pair;
        zok0 zok0Var = (zok0) obj;
        zok0Var.getClass();
        super.x(zok0Var);
        boolean z = zok0Var instanceof yok0;
        vzg0 vzg0Var = this.o;
        zr1 zr1Var = this.B;
        yo4 yo4Var = this.y;
        byte b = 1;
        if (z) {
            int i = ((yok0) zok0Var).f42991a;
            int i2 = ((jpk0) D()).f16907a;
            SpecialEventTabs specialEventTabs = (SpecialEventTabs) CollectionsKt.W(i, ((jpk0) D()).g.b);
            if (specialEventTabs != null) {
                int iOrdinal = specialEventTabs.ordinal();
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
            SpecialEventTabs specialEventTabs2 = (SpecialEventTabs) ((jpk0) D()).g.b.get(i);
            p7m0 p7m0Var = this.i.f25029a;
            while (true) {
                Object value = p7m0Var.getValue();
                value.getClass();
                jpk0 jpk0Var = (jpk0) value;
                this.f.getClass();
                SpecialEventTabs specialEventTabs3 = specialEventTabs2;
                if (p7m0Var.m(value, jpk0.a(jpk0Var, null, null, null, 0L, lwk0.a(jpk0Var.g, specialEventTabs2, null, null, null, null, null, 126), false, 1983))) {
                    vzg0Var.e("SELECTED_TAB_POSITION_KEY", specialEventTabs3);
                    return;
                }
                specialEventTabs2 = specialEventTabs3;
            }
        } else {
            boolean zEquals = zok0Var.equals(wok0.f39502a);
            byte b2 = 0;
            i1w0 i1w0Var = this.p;
            if (!zEquals) {
                if (zok0Var.equals(xok0.f41225a)) {
                    SpecialEventTabs specialEventTabs4 = (SpecialEventTabs) vzg0Var.a("SELECTED_TAB_POSITION_KEY");
                    if (specialEventTabs4 == null) {
                        specialEventTabs4 = SpecialEventTabs.SCHEDULE;
                    }
                    String str = specialEventTabs4.f46968a;
                    yo4Var.m(str);
                    zr1Var.q(str);
                    i1w0Var.d(new npk0(this, b));
                    return;
                }
                yje yjeVar = null;
                if (zok0Var.equals(uok0.f36021a)) {
                    c4m0 c4m0Var = this.Y;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        this.Y = i3t0.L(this, new fnq(this.u.f36509a.h(), new bai0(this, yjeVar, (byte) 26), (byte) 4), null, null, 3);
                    }
                    bby bbyVar = this.V;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        this.V = ((jpk0) D()).i ? i3t0.K(this, null, null, new opk0(this, yjeVar, b), 3) : null;
                    }
                    c4m0 c4m0Var2 = this.S;
                    if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                        this.S = i3t0.L(this, new fnq(this.D.b(), new tmg0(this, yjeVar, (byte) 19), (byte) 4), null, null, 3);
                        return;
                    }
                    return;
                }
                if (zok0Var.equals(tok0.f34289a)) {
                    v3c.N(this.Y);
                    v3c.N(this.S);
                    v3c.N(this.V);
                    v3c.N(this.W);
                    v3c.N(this.T);
                    v3c.N(this.X);
                    v3c.N(this.U);
                    this.t.c();
                    this.P.m();
                    return;
                }
                if (!zok0Var.equals(vok0.f37772a)) {
                    t9f.b();
                    return;
                }
                v3c.N(this.T);
                v3c.N(this.X);
                v3c.N(this.U);
                this.E.a(true);
                bby bbyVar2 = this.T;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    this.T = i3t0.K(this, null, null, new opk0(this, yjeVar, b2), 3);
                }
                N();
                P();
                O();
                return;
            }
            M();
            LinkedHashMap linkedHashMap = xnk0.f41174a;
            int i3 = ((jpk0) D()).f16907a;
            hpk0 hpk0Var = this.q;
            xnk0.a(i3, hpk0Var.d);
            LinkedHashMap linkedHashMap2 = xbv0.f40619a;
            xbv0.a(((jpk0) D()).f16907a, hpk0Var.d);
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
}
