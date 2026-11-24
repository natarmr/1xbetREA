package a;

import android.content.Intent;
import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w220 extends w46 {
    public final qv2 A;
    public final gu90 A0;
    public final ol60 A1;
    public final kut B;
    public final vpt B0;
    public final p7m0 B1;
    public final mne C;
    public final exu C0;
    public final psc D;
    public final vpt D0;
    public final g2v E;
    public final cr E0;
    public final onv F;
    public final iqx F0;
    public final dq00 G;
    public final hqx G0;
    public final eyg0 H;
    public final jcl H0;
    public final pyu I;
    public final z220 I0;
    public final tqt J;
    public final c5k J0;
    public final h760 K;
    public final uuz K0;
    public final bj5 L;
    public final uuz L0;
    public final ywq0 M;
    public final uuz M0;
    public final fqu N;
    public final yfu N0;
    public final fqu O;
    public final reu O0;
    public final fqu P;
    public final h3c P0;
    public final u8u Q;
    public final x20 Q0;
    public final vkr0 R;
    public final mii0 R0;
    public final u8u S;
    public final m3c S0;
    public final nhu T;
    public final m3c T0;
    public final yfu U;
    public final ba50 U0;
    public final lef0 V;
    public final x4u V0;
    public final jw20 W;
    public final bzu W0;
    public final fpc X;
    public final ctf0 X0;
    public final cyu Y;
    public final pmi0 Y0;
    public final ieu Z;
    public final obe Z0;
    public final yuu a0;
    public final r9u a1;
    public final m1e b;
    public final ciu b0;
    public final sje b1;
    public final ort c;
    public final xqc c0;
    public final sff0 c1;
    public final suk d;
    public final lme0 d0;
    public final v8d d1;
    public final pzu e;
    public final duj e0;
    public c4m0 e1;
    public final eqx f;
    public final ivn f0;
    public final c4m0 f1;
    public final pmi g;
    public final n4u g0;
    public bby g1;
    public final rou h;
    public final fhj h0;
    public bby h1;
    public final rjo i;
    public final jlx i0;
    public bby i1;
    public final ugf0 j;
    public final urt j0;
    public bby j1;
    public final g090 k;
    public final ix0 k0;
    public bby k1;
    public final v6j0 l;
    public final erj l0;
    public bby l1;
    public final hs00 m;
    public final jw20 m0;
    public bby m1;
    public final c5k n;
    public final rpc n0;
    public bby n1;
    public final o470 o;
    public final rrc o0;
    public bby o1;
    public final kt2 p;
    public final rrc p0;
    public bby p1;
    public final ag3 q;
    public final f4v q0;
    public c4m0 q1;
    public final rv3 r;
    public final fvt0 r0;
    public bby r1;
    public final ouu s;
    public final vzg0 s0;
    public c4m0 s1;
    public final lfu t;
    public final art t0;
    public bby t1;
    public final hpi0 u;
    public final xfu u0;
    public c4m0 u1;
    public final xex v;
    public final edu v0;
    public bby v1;
    public final xsu w;
    public final rpt w0;
    public boolean w1;
    public final lpc x;
    public final k52 x0;
    public final ol60 x1;
    public final m2c y;
    public final ni9 y0;
    public final ol60 y1;
    public final ccl z;
    public final uqx z0;
    public final p7m0 z1;

    public w220(bzt bztVar, pru pruVar, m1e m1eVar, ort ortVar, suk sukVar, pzu pzuVar, eqx eqxVar, pmi pmiVar, rou rouVar, rjo rjoVar, ugf0 ugf0Var, g090 g090Var, v6j0 v6j0Var, hs00 hs00Var, c5k c5kVar, o470 o470Var, kt2 kt2Var, ag3 ag3Var, rv3 rv3Var, ouu ouuVar, lfu lfuVar, hpi0 hpi0Var, xex xexVar, xsu xsuVar, lpc lpcVar, lbu lbuVar, m2c m2cVar, ccl cclVar, qv2 qv2Var, kut kutVar, mne mneVar, psc pscVar, g2v g2vVar, onv onvVar, dq00 dq00Var, eyg0 eyg0Var, pyu pyuVar, tqt tqtVar, h760 h760Var, bj5 bj5Var, ywq0 ywq0Var, fqu fquVar, fqu fquVar2, fqu fquVar3, u8u u8uVar, vkr0 vkr0Var, u8u u8uVar2, nhu nhuVar, yfu yfuVar, lef0 lef0Var, jw20 jw20Var, fpc fpcVar, cyu cyuVar, ieu ieuVar, yuu yuuVar, ciu ciuVar, xqc xqcVar, lme0 lme0Var, duj dujVar, ivn ivnVar, n4u n4uVar, fhj fhjVar, jlx jlxVar, urt urtVar, ix0 ix0Var, erj erjVar, jw20 jw20Var2, rpc rpcVar, rrc rrcVar, rrc rrcVar2, f4v f4vVar, fvt0 fvt0Var, vzg0 vzg0Var, art artVar, xfu xfuVar, edu eduVar, rpt rptVar, k52 k52Var, ni9 ni9Var, uqx uqxVar, gu90 gu90Var, vpt vptVar, exu exuVar, vpt vptVar2, toc tocVar, cr crVar, iqx iqxVar, hqx hqxVar, jcl jclVar, z220 z220Var, c5k c5kVar2, bbw0 bbw0Var, uuz uuzVar, uuz uuzVar2, uuz uuzVar3, yfu yfuVar2, reu reuVar, h3c h3cVar, x20 x20Var, mii0 mii0Var, m3c m3cVar, m3c m3cVar2, ba50 ba50Var, x4u x4uVar, bzu bzuVar, ctf0 ctf0Var, pmi0 pmi0Var, obe obeVar, bb6 bb6Var, n4u n4uVar2, qho qhoVar, r9u r9uVar) {
        pao0 pao0Var;
        int i;
        int i2;
        String string;
        m1eVar.getClass();
        v6j0Var.getClass();
        kt2Var.getClass();
        rv3Var.getClass();
        h760Var.getClass();
        ba50Var.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.b = m1eVar;
        this.c = ortVar;
        this.d = sukVar;
        this.e = pzuVar;
        this.f = eqxVar;
        this.g = pmiVar;
        this.h = rouVar;
        this.i = rjoVar;
        this.j = ugf0Var;
        this.k = g090Var;
        this.l = v6j0Var;
        this.m = hs00Var;
        this.n = c5kVar;
        this.o = o470Var;
        this.p = kt2Var;
        this.q = ag3Var;
        this.r = rv3Var;
        this.s = ouuVar;
        this.t = lfuVar;
        this.u = hpi0Var;
        this.v = xexVar;
        this.w = xsuVar;
        this.x = lpcVar;
        this.y = m2cVar;
        this.z = cclVar;
        this.A = qv2Var;
        this.B = kutVar;
        this.C = mneVar;
        this.D = pscVar;
        this.E = g2vVar;
        this.F = onvVar;
        this.G = dq00Var;
        this.H = eyg0Var;
        this.I = pyuVar;
        this.J = tqtVar;
        this.K = h760Var;
        this.L = bj5Var;
        this.M = ywq0Var;
        this.N = fquVar;
        this.O = fquVar2;
        this.P = fquVar3;
        this.Q = u8uVar;
        this.R = vkr0Var;
        this.S = u8uVar2;
        this.T = nhuVar;
        this.U = yfuVar;
        this.V = lef0Var;
        this.W = jw20Var;
        this.X = fpcVar;
        this.Y = cyuVar;
        this.Z = ieuVar;
        this.a0 = yuuVar;
        this.b0 = ciuVar;
        this.c0 = xqcVar;
        this.d0 = lme0Var;
        this.e0 = dujVar;
        this.f0 = ivnVar;
        this.g0 = n4uVar;
        this.h0 = fhjVar;
        this.i0 = jlxVar;
        this.j0 = urtVar;
        this.k0 = ix0Var;
        this.l0 = erjVar;
        this.m0 = jw20Var2;
        this.n0 = rpcVar;
        this.o0 = rrcVar;
        this.p0 = rrcVar2;
        this.q0 = f4vVar;
        this.r0 = fvt0Var;
        this.s0 = vzg0Var;
        this.t0 = artVar;
        this.u0 = xfuVar;
        this.v0 = eduVar;
        this.w0 = rptVar;
        this.x0 = k52Var;
        this.y0 = ni9Var;
        this.z0 = uqxVar;
        this.A0 = gu90Var;
        this.B0 = vptVar;
        this.C0 = exuVar;
        this.D0 = vptVar2;
        this.E0 = crVar;
        this.F0 = iqxVar;
        this.G0 = hqxVar;
        this.H0 = jclVar;
        this.I0 = z220Var;
        this.J0 = c5kVar2;
        this.K0 = uuzVar;
        this.L0 = uuzVar2;
        this.M0 = uuzVar3;
        this.N0 = yfuVar2;
        this.O0 = reuVar;
        this.P0 = h3cVar;
        this.Q0 = x20Var;
        this.R0 = mii0Var;
        this.S0 = m3cVar;
        this.T0 = m3cVar2;
        this.U0 = ba50Var;
        this.V0 = x4uVar;
        this.W0 = bzuVar;
        this.X0 = ctf0Var;
        this.Y0 = pmi0Var;
        this.Z0 = obeVar;
        this.a1 = r9uVar;
        this.b1 = d5c.a(kotlin.coroutines.e.c(qem0.e(), mneVar.b));
        sff0 sff0VarA = pruVar.a();
        this.c1 = sff0VarA;
        this.d1 = bztVar.f3488a.a();
        this.x1 = new ol60(3);
        this.y1 = new ol60(3);
        this.z1 = q7m0.a(new lm7(0L));
        this.A1 = new ol60(3);
        Boolean bool = (Boolean) vzg0Var.a("IS_TAB_BAR_VISIBLE");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int iOrdinal = sff0VarA.S0.ordinal();
        yje yjeVar = null;
        if (iOrdinal == 0) {
            pao0Var = pao0.f26664a;
        } else if (iOrdinal == 1) {
            pao0Var = pao0.e;
        } else if (iOrdinal == 2) {
            pao0Var = pao0.b;
        } else if (iOrdinal == 3) {
            pao0Var = pao0.c;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                throw null;
            }
            pao0Var = pao0.d;
        }
        lsm0 lsm0Var = ctf0Var.b;
        oao0 oao0Var = new oao0("POPULAR_TAG", lsm0Var.a(R.string.popular, Arrays.copyOf(new Object[0], 0)), qhoVar.b(R.drawable.ic_glyph_popular), null, false, null);
        oao0 oao0Var2 = new oao0("FAVORITES_TAG", lsm0Var.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), qhoVar.b(R.drawable.ic_glyph_favourite_active), null, false, null);
        String strA = lsm0Var.a(R.string.coupon, Arrays.copyOf(new Object[0], 0));
        int iOrdinal2 = pao0Var.ordinal();
        if (iOrdinal2 == 0) {
            i = R.drawable.ic_glyph_coupon;
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2 || iOrdinal2 == 3) {
            i = R.drawable.ic_glyph_coupon_alt;
        } else {
            if (iOrdinal2 != 4) {
                t9f.b();
                throw null;
            }
            i = R.drawable.ic_glyph_coupon;
        }
        int iB = qhoVar.b(i);
        int iA = bb6Var.a(lsm0Var.a(R.string.icon_logo_tab_bar, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
        Integer numValueOf = iA != 0 ? Integer.valueOf(iA) : null;
        if (sff0VarA.T1) {
            n4uVar2.e();
            StringBuilder sb = new StringBuilder(ujn.h);
            i2 = 0;
            if (StringsKt.O("static/img/ImgDefault/graphic_elements/android/1357/popular_coupon.png", ujn.h, false)) {
                sb.setLength(i2);
                sb.append("static/img/ImgDefault/graphic_elements/android/1357/popular_coupon.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/graphic_elements/android/1357/popular_coupon.png", "https://", false)) {
                i2 = 0;
                sb.setLength(i2);
                sb.append("static/img/ImgDefault/graphic_elements/android/1357/popular_coupon.png");
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                i2 = 0;
                sb.append(StringsKt.y0("static/img/ImgDefault/graphic_elements/android/1357/popular_coupon.png", '/'));
            }
            string = sb.toString();
        } else {
            i2 = 0;
            string = null;
        }
        oao0 oao0Var3 = new oao0("COUPON_TAG", strA, iB, numValueOf, true, string);
        oao0 oao0Var4 = new oao0("HISTORY_TAG", lsm0Var.a(R.string.history, Arrays.copyOf(new Object[i2], i2)), qhoVar.b(R.drawable.ic_glyph_history), null, false, null);
        oao0 oao0Var5 = new oao0("MENU_TAG", lsm0Var.a(R.string.menu, Arrays.copyOf(new Object[i2], i2)), qhoVar.b(R.drawable.ic_glyph_menu), null, false, null);
        this.B1 = q7m0.a(new mao0(zBooleanValue, new lao0(CollectionsKt.q0(kotlin.collections.a.c(oao0Var), lbuVar.j() ? kotlin.collections.a.c(oao0Var5) : q3d.j(oao0Var2, oao0Var3, oao0Var4, oao0Var5)), pao0Var)));
        tocVar.f34277a.f33539a.p = 0;
        c4m0 c4m0Var = this.f1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.f1 = sac.T(new fnq(this.b.b(), new o120(this, yjeVar, (byte) 9), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), b220.h);
        }
        ((vwb0) ((rrd) bbw0Var.b).f).g("TEMPORARY_BALANCE_ID", 0L);
        w(new ffd(this, null, (byte) 21));
    }

    public final void A() {
        bby bbyVar;
        bby bbyVar2 = this.p1;
        yje yjeVar = null;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.p1) != null) {
            bbyVar.cancel(null);
        }
        bvc bvcVarA = jiu0.a(this);
        u8u u8uVar = this.Q;
        twz twzVar = (twz) ((xfu) u8uVar.c).f40810a;
        long jMax = Math.max(twzVar.c.e - (System.currentTimeMillis() - twzVar.c.f), 0L);
        nhu nhuVar = (nhu) u8uVar.b;
        uen uenVar = wen.b;
        this.p1 = sac.b0(bvcVarA, Math.min(jMax, Math.max(wen.e(ibc.v0(5, bfn.MINUTES)) - (System.currentTimeMillis() - nhuVar.f23552a.c.h), 0L)), TimeUnit.MILLISECONDS, this.C.b, new m120(this, (byte) 7), new q120(this, yjeVar, (byte) 0));
    }

    public final void B() {
        boolean z = this.c1.f0;
        c4m0 c4m0Var = this.s1;
        byte b = 1;
        if ((c4m0Var == null || !c4m0Var.isActive()) && z && this.c.f25751a.a()) {
            this.t0.getClass();
            yje yjeVar = null;
            this.s1 = sac.T(new fnq(new vsg0(new p23(2, yjeVar, (byte) 7)), new o120(this, yjeVar, (byte) 5), (byte) 4), jiu0.a(this), new r120(this, yjeVar, b));
        }
    }

    public final void C(boolean z) {
        sff0 sff0Var = this.c1;
        ucq ucqVar = sff0Var.f;
        boolean z2 = ucqVar.d;
        boolean z3 = ucqVar.g;
        boolean z4 = ucqVar.q;
        boolean z5 = ucqVar.o;
        if (this.c.f25751a.a()) {
            if (sff0Var.f.d ? this.T.f23552a.c.i : ((dzz) this.b0.b.b).h) {
                return;
            }
            yje yjeVar = null;
            mne mneVar = this.C;
            byte b = 1;
            if (z2) {
                bby bbyVar = this.r1;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.r1 = sac.V(jiu0.a(this), new m120(this, b), null, mneVar.b, new fj3((diu0) this, z, yjeVar, (byte) 12), 10);
                    return;
                }
                return;
            }
            if (z3) {
                bby bbyVar2 = this.v1;
                if ((bbyVar2 == null || !bbyVar2.isActive()) && !this.w1) {
                    this.v1 = sac.V(jiu0.a(this), new m120(this, (byte) 3), null, mneVar.b, new o120(this, yjeVar, (byte) 7), 10);
                    return;
                }
                return;
            }
            if (z4) {
                bby bbyVar3 = this.v1;
                if ((bbyVar3 == null || !bbyVar3.isActive()) && !this.w1) {
                    this.v1 = sac.V(jiu0.a(this), new m120(this, (byte) 4), null, mneVar.b, new o120(this, yjeVar, (byte) 8), 10);
                    return;
                }
                return;
            }
            if (z5) {
                bby bbyVar4 = this.r1;
                if (bbyVar4 == null || !bbyVar4.isActive()) {
                    this.r1 = sac.V(jiu0.a(this), new m120(this, (byte) 2), null, mneVar.b, new a220((Object) this, z, yjeVar, (byte) 0), 10);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(zje zjeVar) {
        y120 y120Var;
        Object g0g0Var;
        m2c0 m2c0Var;
        ugf0 ugf0Var;
        double d;
        boolean z;
        w220 w220Var;
        m2c0 m2c0Var2;
        if (zjeVar instanceof y120) {
            y120Var = (y120) zjeVar;
            int i = y120Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                y120Var.m = i - Integer.MIN_VALUE;
            } else {
                y120Var = new y120(this, zjeVar);
            }
        } else {
            y120Var = new y120(this, zjeVar);
        }
        Object objA = y120Var.k;
        wne wneVar = wne.f39444a;
        int i2 = y120Var.m;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = this.c.f25751a.f11847a.a();
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (j0g0.a(g0g0Var) != null) {
                    return Unit.f46060a;
                }
                krt0 krt0Var = (krt0) g0g0Var;
                long j = krt0Var.f18785a;
                this.p.d(j);
                this.r.e(j);
                E();
                if (Math.abs(krt0Var.d) > 1000.0d && this.d1.e) {
                    y120Var.m = 1;
                    c5k c5kVar = this.n;
                    if (((b6w0) c5kVar.f3775a).b((String) ((zf3) ((zjh0) c5kVar.b)).e.getValue(), y120Var) != wneVar) {
                    }
                }
                return wneVar;
            }
            if (i2 == 1) {
                z1x.P(objA);
            } else {
                if (i2 == 2) {
                    this = y120Var.i;
                    z1x.P(objA);
                    m2c0Var = (m2c0) objA;
                    ugf0Var = this.j;
                    d = m2c0Var.k0;
                    z = m2c0Var.I;
                    y120Var.i = this;
                    y120Var.j = m2c0Var;
                    y120Var.m = 3;
                    if (ugf0Var.d0(d, y120Var, z) != wneVar) {
                        w220Var = this;
                        m2c0Var2 = m2c0Var;
                    }
                    return wneVar;
                }
                if (i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m2c0Var2 = y120Var.j;
                w220Var = y120Var.i;
                z1x.P(objA);
            }
            ni9 ni9Var = w220Var.y0;
            ((vwb0) ni9Var.f23572a.e).f(m2c0Var2.l0, "max_coupon_size_key");
            e0g0 e0g0Var3 = j0g0.b;
            return Unit.f46060a;
            e0g0 e0g0Var4 = j0g0.b;
            rou rouVar = this.h;
            y120Var.i = this;
            y120Var.m = 2;
            objA = rouVar.a(false, y120Var);
            if (objA != wneVar) {
                m2c0Var = (m2c0) objA;
                ugf0Var = this.j;
                d = m2c0Var.k0;
                z = m2c0Var.I;
                y120Var.i = this;
                y120Var.j = m2c0Var;
                y120Var.m = 3;
                if (ugf0Var.d0(d, y120Var, z) != wneVar) {
                    w220Var = this;
                    m2c0Var2 = m2c0Var;
                    ni9 ni9Var2 = w220Var.y0;
                    ((vwb0) ni9Var2.f23572a.e).f(m2c0Var2.l0, "max_coupon_size_key");
                    e0g0 e0g0Var5 = j0g0.b;
                    return Unit.f46060a;
                }
            }
            return wneVar;
        } catch (Throwable unused) {
            e0g0 e0g0Var6 = j0g0.b;
        }
    }

    public final void E() {
        if (this.o1 == null) {
            this.o1 = sac.V(jiu0.a(this), z120.f43598a, null, this.C.b, new o120(this, null, (byte) 6), 10);
        }
    }

    public final void F(za50 za50Var) {
        sac.V(jiu0.a(this), new m120(this, (byte) 8), null, this.C.f22085a, new xr10(this, za50Var, null, (byte) 2), 10);
        za50 za50Var2 = new za50(0, 7, 0L, 0L);
        ouu ouuVar = this.s;
        ouu.o(ouuVar, za50Var2, null, 4);
        ((qe50) ouuVar.b).a(new za50(0, 7, 0L, 0L), false);
    }

    public final void G(boolean z) {
        sac.h0(jiu0.a(this), w220.class.getSimpleName().concat(".plugCustomerIO"), 3, new n220(this, z, null), this.C.b, new m120(this, (byte) 0), null, 144);
    }

    public final void H() {
        bby bbyVar = this.i1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.i1 = sac.V(jiu0.a(this), new m120(this, (byte) 9), null, this.C.b, new o120(this, null, (byte) 15), 10);
        }
    }

    public final void I() {
        bby bbyVar;
        bby bbyVar2;
        bby bbyVar3 = this.h1;
        byte b = 23;
        yje yjeVar = null;
        byte b2 = 1;
        if (bbyVar3 == null || !bbyVar3.isActive()) {
            this.h1 = sac.V(jiu0.a(this), new m120(this, (byte) 5), null, this.C.f22085a, new fhq(this, yjeVar, b), 10);
        }
        if (this.c.f25751a.a()) {
            sff0 sff0Var = this.c1;
            ucq ucqVar = sff0Var.f;
            boolean z = sff0Var.v;
            boolean z2 = ucqVar.e;
            boolean z3 = ucqVar.j;
            byte b3 = 2;
            byte b4 = 0;
            sje sjeVar = this.b1;
            if (!z2) {
                boolean z4 = ucqVar.q;
                if (z4) {
                    if (z3 && z4 && ((bbyVar2 = this.l1) == null || !bbyVar2.isActive())) {
                        this.l1 = sac.V(sjeVar, new p610((byte) 25), null, null, new o120(this, yjeVar, b3), 14);
                    }
                } else if (z3 && !z && ((bbyVar = this.l1) == null || !bbyVar.isActive())) {
                    this.l1 = sac.V(sjeVar, new p610((byte) 26), null, null, new o120(this, yjeVar, b2), 14);
                }
            } else if (z3 && z2) {
                sac.V(sjeVar, new p610((byte) 21), null, null, new r120(this, yjeVar, b4), 14);
            }
            B();
            C(false);
            ucq ucqVar2 = sff0Var.f;
            if (ucqVar2.j && z && !ucqVar2.e) {
                bby bbyVar4 = this.m1;
                if (bbyVar4 == null || !bbyVar4.isActive()) {
                    this.m1 = sac.V(sjeVar, new p610(b), null, null, new mq10(this, yjeVar, b3), 14);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J(zje zjeVar) throws Throwable {
        s220 s220Var;
        ol60 ol60Var;
        m2c0 m2c0Var;
        double d;
        boolean z;
        m2c0 m2c0Var2;
        if (zjeVar instanceof s220) {
            s220Var = (s220) zjeVar;
            int i = s220Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s220Var.l = i - Integer.MIN_VALUE;
            } else {
                s220Var = new s220(this, zjeVar);
            }
        } else {
            s220Var = new s220(this, zjeVar);
        }
        Object objX = s220Var.j;
        wne wneVar = wne.f39444a;
        int i2 = s220Var.l;
        kt2 kt2Var = this.p;
        yje yjeVar = null;
        ort ortVar = this.c;
        if (i2 == 0) {
            z1x.P(objX);
            if (!ortVar.f25751a.a()) {
                return Unit.f46060a;
            }
            ol60Var = this.x1;
            s220Var.i = ol60Var;
            s220Var.l = 1;
            objX = this.g.x(s220Var);
            if (objX != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            ol60Var = (ol60) s220Var.i;
            z1x.P(objX);
        } else {
            if (i2 == 2) {
                z1x.P(objX);
                m2c0Var = (m2c0) objX;
                ((j51) new yk50((j51) ((h7i) this.r0.f10231a).k).b).f15912a.clear();
                this.q0.d();
                kt2Var.d(m2c0Var.S);
                d = m2c0Var.k0;
                z = m2c0Var.I;
                s220Var.i = m2c0Var;
                s220Var.l = 3;
                if (this.j.d0(d, s220Var, z) != wneVar) {
                    m2c0Var2 = m2c0Var;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m2c0Var2 = (m2c0) s220Var.i;
            z1x.P(objX);
        }
        ((vwb0) this.y0.f23572a.e).f(m2c0Var2.l0, "max_coupon_size_key");
        C(true);
        B();
        return Unit.f46060a;
        ol60Var.f(new a9h0(((Number) objX).intValue()));
        ((emg0) ((pzu) this.p0.b).f27863a).f8045a.clear();
        this.n0.a();
        this.o0.E();
        long jB = ortVar.b();
        kt2Var.d(jB);
        this.r.e(jB);
        E();
        G(true);
        if (this.d1.f) {
            fhj fhjVar = this.h0;
            q7d0 q7d0Var = (q7d0) fhjVar.b;
            if (!axq.z(q7d0Var, "PREF_SENDED", false)) {
                ApplicationLoader applicationLoader = ApplicationLoader.v1;
                ApplicationLoader applicationLoaderN = xf0.N();
                Intent intentQ = j120.Q(applicationLoaderN);
                if (intentQ != null) {
                    Intent intentPutExtra = intentQ.putExtra("OPEN_PAYMENT", true);
                    intentPutExtra.getClass();
                    String string = applicationLoaderN.getString(R.string.first_deposit_bonus_action);
                    string.getClass();
                    y660 y660Var = new y660(string, intentPutExtra, klx.f18512a);
                    t760 t760VarA = ((h760) fhjVar.f9543a).a();
                    Intent intent = new Intent();
                    intent.putExtra("LOCAL_NOTIFICATION_TYPE", sr00.e);
                    String string2 = applicationLoaderN.getString(R.string.app_name);
                    string2.getClass();
                    String string3 = applicationLoaderN.getString(R.string.first_deposit_bonus);
                    string3.getClass();
                    t760.a(t760VarA, intent, string2, string3, 134217728, null, null, null, 0, kotlin.collections.a.c(y660Var), 752);
                    q7d0Var.d("PREF_SENDED", true);
                }
            }
        }
        bby bbyVar = this.t1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.t1 = sac.V(jiu0.a(this), u220.f34927a, null, null, new r120(this, yjeVar, (byte) 5), 14);
        }
        s220Var.i = null;
        s220Var.l = 2;
        objX = this.f.a(s220Var);
        if (objX != wneVar) {
            m2c0Var = (m2c0) objX;
            ((j51) new yk50((j51) ((h7i) this.r0.f10231a).k).b).f15912a.clear();
            this.q0.d();
            kt2Var.d(m2c0Var.S);
            d = m2c0Var.k0;
            z = m2c0Var.I;
            s220Var.i = m2c0Var;
            s220Var.l = 3;
            if (this.j.d0(d, s220Var, z) != wneVar) {
                m2c0Var2 = m2c0Var;
                ((vwb0) this.y0.f23572a.e).f(m2c0Var2.l0, "max_coupon_size_key");
                C(true);
                B();
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    public final void w(Function1 function1) {
        sac.V(jiu0.a(this), new m120(this, (byte) 10), null, this.C.b, new a2f(function1, null, (byte) 2), 10);
    }

    public final void x() {
        boolean z = this.c1.B0;
        bby bbyVar = this.j1;
        byte b = 0;
        boolean z2 = (bbyVar == null || bbyVar.isActive()) ? false : true;
        if (z) {
            ygp ygpVar = ygp.u;
            r9u r9uVar = this.a1;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (j1q0Var.f15748a.d(ygpVar) && z2) {
                this.j1 = sac.V(jiu0.a(this), null, null, this.C.b, new o120(this, null, b), 11);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0088 A[PHI: r4
  0x0088: PHI (r4v7 a.sw00) = (r4v6 a.sw00), (r4v6 a.sw00), (r4v13 a.sw00) binds: [B:34:0x007a, B:36:0x0084, B:24:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134 A[Catch: Exception -> 0x0137, TryCatch #1 {Exception -> 0x0137, blocks: (B:67:0x011b, B:69:0x0134, B:74:0x013c, B:76:0x0142, B:80:0x017a, B:79:0x0178), top: B:120:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0139  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c A[Catch: Exception -> 0x0137, TryCatch #1 {Exception -> 0x0137, blocks: (B:67:0x011b, B:69:0x0134, B:74:0x013c, B:76:0x0142, B:80:0x017a, B:79:0x0178), top: B:120:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0178 A[Catch: Exception -> 0x0137, TryCatch #1 {Exception -> 0x0137, blocks: (B:67:0x011b, B:69:0x0134, B:74:0x013c, B:76:0x0142, B:80:0x017a, B:79:0x0178), top: B:120:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:89:0x01de  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:95:0x020f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0210  */
    /* JADX WARN: Code duplicated, block: B:99:0x0219 A[Catch: all -> 0x022d, TryCatch #2 {all -> 0x022d, blocks: (B:21:0x0048, B:97:0x0211, B:99:0x0219, B:101:0x021d, B:103:0x0225, B:104:0x022a, B:93:0x01f1), top: B:118:0x002b }] */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024a, code lost:
    
        if (r0 == r3) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(a.zje r21) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w220.y(a.zje):java.lang.Object");
    }

    public final void z() {
        bby bbyVar;
        bby bbyVar2 = this.p1;
        yje yjeVar = null;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.p1) != null) {
            bbyVar.cancel(null);
        }
        bvc bvcVarA = jiu0.a(this);
        ieu ieuVar = this.Z;
        dzz dzzVar = (dzz) ((ciu) ieuVar.c).b.b;
        long jMax = Math.max(dzzVar.c - (System.currentTimeMillis() - dzzVar.f), 0L);
        fpc fpcVar = (fpc) ieuVar.b;
        uen uenVar = wen.b;
        this.p1 = sac.f0(bvcVarA, Math.min(jMax, Math.max(wen.e(ibc.v0(5, bfn.MINUTES)) - (System.currentTimeMillis() - ((dzz) fpcVar.f9921a.b).g), 0L)), TimeUnit.MILLISECONDS, null, new m120(this, (byte) 6), new o120(this, yjeVar, (byte) 3), 36);
    }
}
