package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.features.notification_settings.impl.navigation.PushNotificationSettingsScreens$PushNotificationSettingsFragmentScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class pmb0 extends i3t0 {
    public static final /* synthetic */ int D0 = 0;
    public final mne A;
    public c4m0 A0;
    public final poq0 B;
    public c4m0 B0;
    public final yjv C;
    public bby C0;
    public final s64 D;
    public final cmt E;
    public final zg F;
    public final roi0 G;
    public final sd60 H;
    public final exu I;
    public final upt J;
    public final yfu K;
    public final bwl L;
    public final ouu M;
    public final l7k N;
    public final cyu O;
    public final gg5 P;
    public final eke0 Q;
    public final ytt R;
    public final bmt S;
    public final ymi0 T;
    public final yfu U;
    public final jfu V;
    public final rou W;
    public final drm0 X;
    public final w5z Y;
    public final ljf0 Z;
    public final rl70 a0;
    public final ymi0 b0;
    public final bmt c0;
    public final ymi0 d0;
    public final bmt e0;
    public final svs0 f0;
    public final hou g0;
    public final nw20 h0;
    public final dq00 i0;
    public final e1u j0;
    public final daf k0;
    public final zpu l0;
    public final j910 m0;
    public final c8c n0;
    public final ctf0 o;
    public final oqx o0;
    public final ih5 p;
    public final yox p0;
    public final u58 q;
    public final r9u q0;
    public final vqc r;
    public final jqt r0;
    public final uyu s;
    public final iqt s0;
    public final i1w0 t;
    public final pv00 t0;
    public final v88 u;
    public c4m0 u0;
    public final phf0 v;
    public c4m0 v0;
    public final duj w;
    public bby w0;
    public final zpu x;
    public bby x0;
    public final bf3 y;
    public c4m0 y0;
    public final esg0 z;
    public c4m0 z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public pmb0(vzg0 vzg0Var, ctf0 ctf0Var, ih5 ih5Var, u58 u58Var, vqc vqcVar, uyu uyuVar, i1w0 i1w0Var, v88 v88Var, phf0 phf0Var, duj dujVar, zpu zpuVar, bf3 bf3Var, esg0 esg0Var, mne mneVar, poq0 poq0Var, yjv yjvVar, s64 s64Var, cmt cmtVar, zg zgVar, roi0 roi0Var, sd60 sd60Var, exu exuVar, upt uptVar, e1u e1uVar, yfu yfuVar, bwl bwlVar, ouu ouuVar, bzt bztVar, l7k l7kVar, cyu cyuVar, gg5 gg5Var, eke0 eke0Var, ytt yttVar, kl5 kl5Var, bmt bmtVar, ymi0 ymi0Var, yfu yfuVar2, jfu jfuVar, rou rouVar, drm0 drm0Var, mi70 mi70Var, w5z w5zVar, ljf0 ljf0Var, rl70 rl70Var, ymi0 ymi0Var2, bmt bmtVar2, ymi0 ymi0Var3, bmt bmtVar3, svs0 svs0Var, hou houVar, nw20 nw20Var, dq00 dq00Var, qho qhoVar, e1u e1uVar2, daf dafVar, zpu zpuVar2, j910 j910Var, c8c c8cVar, pru pruVar, lbu lbuVar, oqx oqxVar, yox yoxVar, r9u r9uVar, jqt jqtVar, iqt iqtVar, rdd rddVar, pv00 pv00Var, n4u n4uVar) {
        ctf0Var.getClass();
        c8cVar.getClass();
        vs10 vs10Var = mneVar.c;
        byte b = 1;
        super(vzg0Var, new tg4((Object) pruVar, (Object) bztVar, (Object) c8cVar, (Object) lbuVar, (Object) jfuVar, (Object) iqtVar, (Object) n4uVar, (byte) 11), cvm0.p(vs10Var, vs10Var), new zlb0(ctf0Var, qhoVar, kl5Var, b));
        this.o = ctf0Var;
        this.p = ih5Var;
        this.q = u58Var;
        this.r = vqcVar;
        this.s = uyuVar;
        this.t = i1w0Var;
        this.u = v88Var;
        this.v = phf0Var;
        this.w = dujVar;
        this.x = zpuVar;
        this.y = bf3Var;
        this.z = esg0Var;
        this.A = mneVar;
        this.B = poq0Var;
        this.C = yjvVar;
        this.D = s64Var;
        this.E = cmtVar;
        this.F = zgVar;
        this.G = roi0Var;
        this.H = sd60Var;
        this.I = exuVar;
        this.J = uptVar;
        this.K = yfuVar;
        this.L = bwlVar;
        this.M = ouuVar;
        this.N = l7kVar;
        this.O = cyuVar;
        this.P = gg5Var;
        this.Q = eke0Var;
        this.R = yttVar;
        this.S = bmtVar;
        this.T = ymi0Var;
        this.U = yfuVar2;
        this.V = jfuVar;
        this.W = rouVar;
        this.X = drm0Var;
        this.Y = w5zVar;
        this.Z = ljf0Var;
        this.a0 = rl70Var;
        this.b0 = ymi0Var2;
        this.c0 = bmtVar2;
        this.d0 = ymi0Var3;
        this.e0 = bmtVar3;
        this.f0 = svs0Var;
        this.g0 = houVar;
        this.h0 = nw20Var;
        this.i0 = dq00Var;
        this.j0 = e1uVar2;
        this.k0 = dafVar;
        this.l0 = zpuVar2;
        this.m0 = j910Var;
        this.n0 = c8cVar;
        this.o0 = oqxVar;
        this.p0 = yoxVar;
        this.q0 = r9uVar;
        this.r0 = jqtVar;
        this.s0 = iqtVar;
        this.t0 = pv00Var;
        sac.T(new fnq(new l0f(vtb.N(((tj60) rddVar.f30285a.f24171a).b), (byte) 2), new jmb0(this, null, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foe.h);
    }

    public final void M() {
        if (this.n0.a()) {
            q7d0 q7d0Var = (q7d0) ((nw20) this.I.f8596a.b).f24215a;
            q7d0Var.getClass();
            if (q7d0Var.a().contains("PUSH_TRACKING")) {
                return;
            }
            this.J.a(true);
            i3t0.K(this, this.A.f22085a, null, new hmb0(this, null, (byte) 1), 2);
        }
    }

    public final void N() {
        if (((olb0) D()).e) {
            e3c.n(this.B0);
            this.B0 = i3t0.L(this, new fnq(this.U.e(), new jmb0(this, null, (byte) 2), (byte) 4), null, new fmb0(this, (byte) 3), 1);
        }
    }

    public final y1p O() {
        int iOrdinal = ((olb0) D()).b.ordinal();
        if (iOrdinal == 0) {
            return y1p.POPULAR_NEW_TOP;
        }
        if (iOrdinal == 1) {
            return y1p.POPULAR_NEW_SPORT;
        }
        if (iOrdinal == 2) {
            return y1p.POPULAR_NEW_ESPORTS;
        }
        if (iOrdinal == 3) {
            return ((olb0) D()).k.q ? y1p.POPULAR_NEW_VIRTUAL : y1p.POPULAR_NEW_AGGREGATOR;
        }
        if (iOrdinal == 4) {
            return y1p.POPULAR_NEW_XGAMES;
        }
        t9f.b();
        return null;
    }

    public final void P(amb0 amb0Var) {
        m1b0 m1b0Var;
        int iOrdinal = amb0Var.ordinal();
        if (iOrdinal == 0) {
            m1b0Var = m1b0.TOP;
        } else if (iOrdinal == 1) {
            m1b0Var = m1b0.SPORT;
        } else if (iOrdinal == 2) {
            m1b0Var = m1b0.ESPORTS;
        } else if (iOrdinal == 3) {
            m1b0Var = ((olb0) D()).k.q ? m1b0.VIRTUAL : m1b0.AGGREGATOR;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return;
            }
            m1b0Var = m1b0.ONE_X_GAMES;
        }
        gg5 gg5Var = this.P;
        gg5Var.getClass();
        gg5Var.f11237a.a(cui0.b(new j1p(m1b0Var.f21000a, (byte) 0)), 3098L);
        int iOrdinal2 = amb0Var.ordinal();
        u58 u58Var = this.q;
        if (iOrdinal2 == 0) {
            i8i.D("point", "Top", u58Var.f35083a, "popular_menu_gotopage");
            return;
        }
        if (iOrdinal2 == 1) {
            i8i.D("point", "Sport", u58Var.f35083a, "popular_menu_gotopage");
            return;
        }
        if (iOrdinal2 == 2) {
            i8i.D("point", "Esports", u58Var.f35083a, "popular_menu_gotopage");
            this.r.k(pzb.C(new peb0((byte) 16)));
        } else {
            if (iOrdinal2 != 3) {
                if (iOrdinal2 == 4) {
                    i8i.D("point", "1xGames", u58Var.f35083a, "popular_menu_gotopage");
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (((olb0) D()).k.q) {
                i8i.D("point", "Virtual", u58Var.f35083a, "popular_menu_gotopage");
            } else {
                i8i.D("point", "Aggregator", u58Var.f35083a, "popular_menu_gotopage");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(zje zjeVar) {
        omb0 omb0Var;
        c4m0 c4m0Var;
        if (zjeVar instanceof omb0) {
            omb0Var = (omb0) zjeVar;
            int i = omb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                omb0Var.k = i - Integer.MIN_VALUE;
            } else {
                omb0Var = new omb0(this, zjeVar);
            }
        } else {
            omb0Var = new omb0(this, zjeVar);
        }
        Object objA = omb0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = omb0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objA);
            if (((olb0) D()).d) {
                omb0Var.k = 1;
                objA = this.W.a(false, omb0Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                e3c.n(this.v0);
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        if (((m2c0) objA).t0 && ((c4m0Var = this.v0) == null || !c4m0Var.isActive())) {
            this.v0 = i3t0.L(this, bkb.h0(1L, TimeUnit.SECONDS, new imb0(this, yjeVar, (byte) 3)), null, null, 3);
        }
        return Unit.f46060a;
    }

    public final void R() {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            this.z.Z(false);
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            thA.printStackTrace();
        }
    }

    @Override // a.diu0
    public final void v() {
        e3c.n(this.u0);
        e3c.n(this.v0);
        e3c.n(this.w0);
        e3c.n(this.x0);
        e3c.n(this.y0);
        e3c.n(this.z0);
        e3c.n(this.A0);
        e3c.n(this.B0);
        e3c.n(this.C0);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0465  */
    /* JADX WARN: Code duplicated, block: B:16:0x0082  */
    /* JADX WARN: Code duplicated, block: B:194:0x06e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v55, types: [a.lne, a.yje, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57, types: [a.lne, a.yje, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object value;
        amb0 amb0Var;
        amb0 amb0Var2;
        y1p y1pVar;
        int i;
        boolean z;
        p7m0 p7m0Var;
        Object value2;
        olb0 olb0Var;
        boolean z2;
        Object value3;
        Object value4;
        olb0 olb0Var2;
        Object value5;
        Object value6;
        olb0 olb0Var3;
        bby bbyVar;
        final boolean z3;
        final List list;
        Object value7;
        byte b;
        ?? r3;
        ?? r4;
        int i2;
        iya0 iya0Var = (iya0) obj;
        iya0Var.getClass();
        super.x(iya0Var);
        boolean z4 = iya0Var instanceof hxa0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        ouu ouuVar = this.M;
        r9u r9uVar = this.q0;
        zg zgVar = this.F;
        if (z4) {
            final boolean z5 = ((hxa0) iya0Var).f13806a;
            M();
            boolean z6 = ((olb0) D()).k.u;
            if (((rrc) this.j0.b).H() < 33 || z6) {
                R();
            } else {
                G(new hjb0());
            }
            poq0 poq0Var = this.B;
            final boolean zR = poq0Var.f27342a.d().r(fk60.POPULAR_OLD_OS);
            if (this.x.l() && this.s0.f15225a.a()) {
                ygp ygpVar = ygp.i;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                if (j1q0Var.f15748a.d(ygpVar)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            final boolean zR2 = poq0Var.f27342a.d().r(fk60.POPULAR_OLD_DEVICE);
            List listB = this.V.b();
            if (((olb0) D()).k.o) {
                list = listB;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listB) {
                    if (!q3d.j(amb0.AGGREGATOR, amb0.ONE_X_GAMES).contains((amb0) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                list = arrayList;
            }
            H(new Function2() { // from class: a.gmb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    olb0 olb0Var4 = (olb0) obj4;
                    ((oyg0) obj3).getClass();
                    olb0Var4.getClass();
                    bib0 bib0VarA = bib0.a(olb0Var4.k, false, z5, 33030143);
                    return olb0.a(olb0Var4, list, null, null, false, false, null, 0L, 0L, false, idb0.a(olb0Var4.j, false, z3, false, zR, false, zR2, 45), bib0VarA, null, 6654);
                }
            });
            amb0 amb0Var3 = (amb0) CollectionsKt.U(list);
            if (((olb0) D()).m) {
                b = 3;
                r3 = 0;
            } else {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value7 = p7m0Var2.getValue();
                    value7.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value7, olb0.a((olb0) value7, null, null, null, false, false, null, 0L, 0L, false, null, null, null, 4095)));
                P(amb0Var3);
                zgVar.f44322a.b("settings_new_popular", "1");
                boolean z7 = ((olb0) D()).k.u;
                daf dafVar = this.k0;
                ezc ezcVarA = ((vyt) dafVar.g).a();
                gm7 gm7Var = ((pru) dafVar.m).a().f32117a.f12063a;
                boolean z8 = ezcVarA == ezc.CONFIRM_ANY_CHANGE;
                boolean z9 = ezcVarA == ezc.ACCEPT_ANY_CHANGE;
                boolean z10 = ezcVarA == ezc.ACCEPT_INCREASE;
                boolean z11 = z7 && ((vpt) dafVar.b).a() && ua80.x(((ost0) ((pyu) dafVar.c).f27815a).f25798a.f35876a, "subscribeOnBetUpdates", false);
                boolean zA = ((dnv) dafVar.d).a();
                boolean z12 = gm7Var.i;
                boolean z13 = z12 && ua80.x(((czu) dafVar.e).f5240a.f25798a.f35876a, "dropOnScoreChange", false);
                boolean z14 = z12 && ua80.x(((env) dafVar.f).f8113a.f25798a.f35876a, "fromLineToLive", false);
                boolean zA2 = ((dzu) dafVar.h).a();
                boolean zX = ua80.x(((ost0) ((g2v) dafVar.j).f10580a).f25798a.f35876a, "autoMaximum", false);
                boolean z15 = gm7Var.h && ua80.x(((fnv) dafVar.k).f9856a.f25798a.f35876a, "vipBet", false);
                boolean zK = ((pyu) dafVar.l).k();
                boolean zA3 = ((czu) dafVar.i).a();
                boolean z16 = z11;
                gx3 gx3Var = new gx3(0);
                gx3Var.put(wa20.f38809a, Boolean.valueOf(z8));
                gx3Var.put(wa20.b, Boolean.valueOf(z9));
                gx3Var.put(wa20.c, Boolean.valueOf(z10));
                gx3Var.put(wa20.i, Boolean.valueOf(zX));
                gx3Var.put(wa20.d, Boolean.valueOf(z16));
                gx3 gx3Var2 = new gx3(0);
                gx3Var2.put(wa20.e, Boolean.valueOf(zA));
                gx3Var2.put(wa20.f, Boolean.valueOf(z13));
                gx3Var2.put(wa20.g, Boolean.valueOf(z14));
                gx3 gx3Var3 = new gx3(0);
                gx3Var3.put(wa20.h, Boolean.valueOf(zA2));
                gx3Var3.put(wa20.j, Boolean.valueOf(z15));
                gx3Var3.put(wa20.k, Boolean.valueOf(zK));
                gx3Var3.put(wa20.l, Boolean.valueOf(zA3));
                gx3 gx3Var4 = new gx3(0);
                gx3Var4.put(va20.f37064a, gx3Var);
                gx3Var4.put(va20.b, gx3Var2);
                gx3Var4.put(va20.c, gx3Var3);
                LinkedHashMap linkedHashMapJ = xp20.j(xp20.j(gx3Var, gx3Var2), gx3Var3);
                LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(linkedHashMapJ.size()));
                for (Map.Entry entry : linkedHashMapJ.entrySet()) {
                    Object key = entry.getKey();
                    key.getClass();
                    linkedHashMap.put(m8x.x0((wa20) key), entry.getValue());
                }
                if (!gx3Var4.isEmpty()) {
                    zpu zpuVar = this.l0;
                    zpuVar.getClass();
                    ArrayList arrayListF = zpu.f(va20.f37064a, gx3Var4);
                    ArrayList arrayListF2 = zpu.f(va20.b, gx3Var4);
                    ArrayList arrayListF3 = zpu.f(va20.c, gx3Var4);
                    gx3 gx3Var5 = new gx3(0);
                    if (!arrayListF.isEmpty()) {
                        gx3Var5.put("option", arrayListF);
                    }
                    if (!arrayListF2.isEmpty()) {
                        gx3Var5.put("action", arrayListF2);
                    }
                    if (!arrayListF3.isEmpty()) {
                        gx3Var5.put("point", arrayListF3);
                    }
                    if (!gx3Var5.isEmpty()) {
                        ((kt2) zpuVar.b).a("user_bet_settings", gx3Var5);
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    j910 j910Var = this.m0;
                    j910Var.getClass();
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        arrayList2.add(((xa20) entry2.getKey()).a(((Boolean) entry2.getValue()).booleanValue()));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (((String) obj3).length() > 0) {
                            arrayList3.add(obj3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        ((s1p) j910Var.b).a(cui0.b(new j1p(CollectionsKt.b0(arrayList3, ", ", null, null, null, 62), (byte) 0)), 11016L);
                    }
                }
                b = 3;
                r3 = 0;
                i3t0.K(this, null, null, new hmb0(this, null == true ? 1 : 0, b), 3);
            }
            e3c.n(this.z0);
            this.z0 = i3t0.L(this, new fnq(this.s.f36509a.h(), new jmb0(this, r3, b), (byte) 4), r3, r3, b);
            if (((olb0) D()).k.o || ((olb0) D()).k.h) {
                e3c.n(this.A0);
                r4 = 0;
                byte b2 = 0;
                this.A0 = i3t0.L(this, new fnq(this.v.m(), new jmb0(this, null == true ? 1 : 0, b2), (byte) 4), null, new fmb0(this, b2), 1);
            } else {
                r4 = 0;
            }
            i3t0.L(this, new fnq(new va(((qe50) ouuVar.b).b, (byte) 21), new imb0(this, r4, (byte) 2), (byte) 4), r4, r4, 3);
            i3t0.L(this, new fnq(new i89(((qp) ((bbw0) this.K.f42558a).b).f29092a, (byte) 22), new imb0(this, r4, (byte) 1), (byte) 4), r4, r4, 3);
            w5z w5zVar = this.Y;
            if (((iqt) w5zVar.d).f15225a.a()) {
                boolean z17 = ((pru) w5zVar.f38604a).a().c1;
                boolean zA4 = ((vpt) w5zVar.b).a();
                boolean zX2 = ua80.x((vwb0) ((nw20) ((upt) w5zVar.e).f36083a.b).b, "SHOWED_NOTIFICATION_KEY", false);
                vwb0 vwb0Var = (vwb0) ((nw20) ((exu) w5zVar.c).f8596a.b).b;
                vwb0Var.getClass();
                long j = vwb0Var.b().getLong("SWITCH_OFF_TIME_KEY", 0L);
                boolean z18 = j > 0 && Calendar.getInstance().getTimeInMillis() - j > 86400000;
                if (!z17 || zA4 || !z18 || zX2) {
                    i2 = 1;
                } else {
                    G(fjb0.f9632a);
                    i2 = 1;
                    ((vwb0) ((nw20) ((dq00) this.Z.f20148a).b).b).e("SHOWED_NOTIFICATION_KEY", true);
                }
            } else {
                i2 = 1;
            }
            byte b3 = 2;
            i3t0.K(this, null, new fmb0(this, b3), new hmb0(this, null, b3), i2);
            return;
        }
        yje yjeVar = null;
        byte b4 = 13;
        if (iya0Var instanceof oxa0) {
            i3t0.K(this, null, null, new hmb0(this, yjeVar, (byte) 0), 3);
            e3c.n(this.y0);
            this.y0 = i3t0.L(this, new fnq(this.r0.a(), new a220(this, yjeVar, (byte) 9), (byte) 4), null, null, 3);
            N();
            e3c.n(this.C0);
            this.C0 = i3t0.F(this, this.C, null, null, new j3b0(b4), 119);
            return;
        }
        if (iya0Var instanceof pxa0) {
            e3c.n(this.y0);
            return;
        }
        if (iya0Var instanceof ixa0) {
            M();
            ygp ygpVar2 = ygp.i;
            r9uVar.getClass();
            j1q0 j1q0Var2 = r9uVar.f30104a;
            j1q0Var2.getClass();
            if (j1q0Var2.f15748a.d(ygpVar2) && ((olb0) D()).k.r == lxw.b && ((olb0) D()).k.g && ((bbyVar = this.x0) == null || !bbyVar.isActive())) {
                this.x0 = i3t0.K(this, null, null, new bu(this, null, b4), 3);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            q7d0 q7d0Var = (q7d0) this.e0.f2853a.b;
            q7d0Var.getClass();
            if (jCurrentTimeMillis - q7d0Var.a().getLong("ALERT_TAX_INFO_TIME_SHOWED_KEY", 0L) <= 86400000 || !((olb0) D()).k.s) {
                return;
            }
            G(gjb0.f11390a);
            return;
        }
        if (iya0Var instanceof gxa0) {
            E();
            return;
        }
        if (iya0Var instanceof mxa0) {
            mxa0 mxa0Var = (mxa0) iya0Var;
            String str = mxa0Var.f22545a;
            G(new bjb0(String.format(Locale.ENGLISH, mxa0Var.b, Arrays.copyOf(new Object[]{str}, 1)), str));
            return;
        }
        if (iya0Var instanceof qxa0) {
            ((q7d0) this.d0.f42890a.b).f("ALERT_TAX_INFO_TIME_SHOWED_KEY", System.currentTimeMillis());
            return;
        }
        if (iya0Var instanceof nxa0) {
            e3c.n(this.u0);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value5 = p7m0Var3.getValue();
                value5.getClass();
                oyg0Var.getClass();
                q7x.F(oyg0Var, 0L, "KEY_AUTH_OFFER_TIMER");
            } while (!p7m0Var3.m(value5, olb0.a((olb0) value5, null, null, null, false, false, null, 0L, 0L, false, null, null, null, 8127)));
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value6 = p7m0Var4.getValue();
                value6.getClass();
                olb0Var3 = (olb0) value6;
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value6, olb0.a(olb0Var3, null, null, null, false, false, null, 0L, 0L, false, c9x.J(olb0Var3.j, bdb0.f2391a, false), null, null, 7679)));
            return;
        }
        if (iya0Var instanceof jxa0) {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value4 = p7m0Var5.getValue();
                value4.getClass();
                olb0Var2 = (olb0) value4;
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value4, olb0.a(olb0Var2, null, null, null, false, false, null, 0L, 0L, false, idb0.a(olb0Var2.j, false, false, false, false, false, false, 119), null, null, 7679)));
            return;
        }
        if (iya0Var instanceof rxa0) {
            if (((olb0) D()).k.t) {
                nqd nqdVar = rv00.z;
                if (((olb0) D()).i) {
                    z2 = true;
                } else {
                    zn00 zn00Var = this.S.f2853a;
                    if (nqdVar.b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!((olb0) D()).k.l || z2) {
                    return;
                }
                int i3 = ((olb0) D()).k.m;
                boolean z19 = ((olb0) D()).k.n;
                ctf0 ctf0Var = this.o;
                G(new ejb0(z19 ? ctf0Var.b.a(R.string.min_age_casino_alert_message_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)) : ctf0Var.b.a(R.string.min_age_alert_with_params_message_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1))));
                p7m0 p7m0Var6 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var6.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                    q7x.F(oyg0Var, Boolean.TRUE, "MIN_AGE_DIALOG_SHOWED");
                } while (!p7m0Var6.m(value3, olb0.a((olb0) value3, null, null, null, false, false, null, 0L, 0L, true, null, null, null, 7935)));
                zn00 zn00Var2 = this.T.f42890a;
                nqdVar.b = true;
                return;
            }
            return;
        }
        boolean z20 = iya0Var instanceof kxa0;
        gg5 gg5Var = this.P;
        if (z20) {
            gg5Var.f11237a.a(xun.f41520a, 12657L);
            zgVar.f44322a.c("notification_permission_show");
            return;
        }
        if (iya0Var instanceof lxa0) {
            this.t0.m(((lxa0) iya0Var).f20805a);
            return;
        }
        boolean z21 = iya0Var instanceof sxa0;
        cmt cmtVar = this.E;
        i1w0 i1w0Var = this.t;
        if (z21) {
            String str2 = ((olb0) D()).b == amb0.ONE_X_GAMES ? "popular_new_ihgames" : O().f41868a;
            ih5 ih5Var = this.p;
            ih5Var.getClass();
            i8i.D("screen", str2, ih5Var.f14765a, "deposit_call");
            this.N.b(O().f41868a, cmtVar.g());
            v88.b(this.u, i1w0Var, 0L, 6);
            return;
        }
        if (iya0Var instanceof txa0) {
            i3t0.K(this, null, new fmb0(this, (byte) 1), new hmb0(this, null, (byte) 4), 1);
            return;
        }
        if (iya0Var instanceof uxa0) {
            ((qe50) ouuVar.b).a(new za50(0, 7, 0L, 0L), false);
            return;
        }
        if (iya0Var instanceof bya0) {
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            this.a0.getClass();
            k0w0VarI.h(new PushNotificationSettingsScreens$PushNotificationSettingsFragmentScreen());
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else if (iya0Var instanceof vxa0) {
            b1j.v("verification", gg5Var.f11237a, 12373L);
            zgVar.f44322a.a("alert_verif_bonus_click", wp20.b(new Pair("action", "verification")));
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new f1w0(drm0.e(this.X))), i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        } else {
            if (iya0Var.equals(wxa0.f39923a)) {
                b1j.v("later", gg5Var.f11237a, 12373L);
                i8i.D("action", "later", zgVar.f44322a, "alert_verif_bonus_click");
                return;
            }
            if (iya0Var.equals(xxa0.f41648a)) {
                gg5Var.f11237a.a(xun.f41520a, 12371L);
                zgVar.f44322a.c("alert_verif_bonus_show");
                return;
            }
            boolean z22 = iya0Var instanceof yxa0;
            s64 s64Var = this.D;
            if (z22) {
                int iOrdinal = ((olb0) D()).b.ordinal();
                if (iOrdinal == 0) {
                    i8i.D("screen", "popular_new_top", zgVar.f44322a, "login_page_call");
                } else if (iOrdinal == 1) {
                    i8i.D("screen", "popular_new_sport", zgVar.f44322a, "login_page_call");
                } else if (iOrdinal == 2) {
                    i8i.D("screen", "popular_new_esports", zgVar.f44322a, "login_page_call");
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return;
                    }
                    i8i.D("screen", "popular_new_games", zgVar.f44322a, "login_page_call");
                } else if (((olb0) D()).k.q) {
                    i8i.D("screen", "popular_new_virtual", zgVar.f44322a, "login_page_call");
                } else {
                    i8i.D("screen", "popular_new_aggregator", zgVar.f44322a, "login_page_call");
                }
                s64Var.c(O().f41868a);
                i3t0.K(this, null, null, new hmb0(this, null, (byte) 5), 3);
                return;
            }
            oyg0 oyg0Var2 = oyg0Var;
            if (iya0Var instanceof cya0) {
                hdb0 hdb0Var = ((cya0) iya0Var).f5164a;
                if (!hdb0Var.equals(cdb0.f4154a)) {
                    if (hdb0Var.equals(gdb0.f11097a)) {
                        z = false;
                        ((of6) this.G.f30839a).f25150a.d("SHOW_BOTTOM_SHEET", false);
                    }
                    p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        olb0Var = (olb0) value2;
                        oyg0Var2.getClass();
                    } while (!p7m0Var.m(value2, olb0.a(olb0Var, null, null, null, false, false, null, 0L, 0L, false, c9x.J(olb0Var.j, hdb0Var, z), null, null, 7679)));
                    return;
                }
                this.y.f2481a.d("KZ_GREETING_SHOWED", true);
                z = false;
                p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    olb0Var = (olb0) value2;
                    oyg0Var2.getClass();
                } while (!p7m0Var.m(value2, olb0.a(olb0Var, null, null, null, false, false, null, 0L, 0L, false, c9x.J(olb0Var.j, hdb0Var, z), null, null, 7679)));
                return;
            }
            if (iya0Var instanceof aya0) {
                R();
                this.J.a(true);
                i3t0.K(this, this.A.f22085a, null, new hmb0(this, null, (byte) 6), 2);
                b1j.v("allow", gg5Var.f11237a, 12659L);
                i8i.D("action", "allow", zgVar.f44322a, "notification_permission_click");
                return;
            }
            if (iya0Var instanceof zxa0) {
                b1j.v("deny", gg5Var.f11237a, 12659L);
                i8i.D("action", "deny", zgVar.f44322a, "notification_permission_click");
                return;
            }
            if (iya0Var instanceof dya0) {
                int iOrdinal2 = ((olb0) D()).b.ordinal();
                if (iOrdinal2 == 0) {
                    i8i.D("screen", "popular_new_top", zgVar.f44322a, "reg_page_call");
                } else if (iOrdinal2 == 1) {
                    i8i.D("screen", "popular_new_sport", zgVar.f44322a, "reg_page_call");
                } else if (iOrdinal2 == 2) {
                    i8i.D("screen", "popular_new_esports", zgVar.f44322a, "reg_page_call");
                } else if (iOrdinal2 != 3) {
                    if (iOrdinal2 != 4) {
                        t9f.b();
                        return;
                    }
                    i8i.D("screen", "popular_new_games", zgVar.f44322a, "reg_page_call");
                } else if (((olb0) D()).k.q) {
                    i8i.D("screen", "popular_new_virtual", zgVar.f44322a, "reg_page_call");
                } else {
                    i8i.D("screen", "popular_new_aggregator", zgVar.f44322a, "reg_page_call");
                }
                s64Var.d(O(), cmtVar.g());
                bby bbyVar2 = this.w0;
                if (bbyVar2 != null) {
                    i = 1;
                    if (bbyVar2.isActive()) {
                        return;
                    }
                } else {
                    i = 1;
                }
                this.w0 = i3t0.K(this, null, new fmb0(this, (byte) 4), new hmb0(this, null, (byte) 7), i);
                return;
            }
            if (iya0Var instanceof fya0) {
                int iOrdinal3 = ((olb0) D()).b.ordinal();
                if (iOrdinal3 == 0) {
                    i8i.D("screen", "popular_new_top", zgVar.f44322a, "search_call");
                } else if (iOrdinal3 == 1) {
                    i8i.D("screen", "popular_new_sport", zgVar.f44322a, "search_call");
                } else if (iOrdinal3 == 2) {
                    i8i.D("screen", "popular_new_esports", zgVar.f44322a, "search_call");
                } else if (iOrdinal3 != 3) {
                    if (iOrdinal3 != 4) {
                        t9f.b();
                        return;
                    }
                    i8i.D("screen", "popular_new_games", zgVar.f44322a, "search_call");
                } else if (((olb0) D()).k.q) {
                    i8i.D("screen", "popular_new_virtual", zgVar.f44322a, "search_call");
                } else {
                    i8i.D("screen", "popular_new_aggregator", zgVar.f44322a, "search_call");
                }
                int iOrdinal4 = ((olb0) D()).b.ordinal();
                if (iOrdinal4 == 0) {
                    y1pVar = y1p.POPULAR_NEW_TOP;
                } else if (iOrdinal4 == 1) {
                    y1pVar = y1p.POPULAR_NEW_SPORT;
                } else if (iOrdinal4 == 2) {
                    y1pVar = y1p.POPULAR_NEW_ESPORTS;
                } else if (iOrdinal4 == 3) {
                    y1pVar = ((olb0) D()).k.q ? y1p.POPULAR_NEW_VIRTUAL : y1p.POPULAR_NEW_AGGREGATOR;
                } else {
                    if (iOrdinal4 != 4) {
                        t9f.b();
                        return;
                    }
                    y1pVar = y1p.POPULAR_NEW_XGAMES;
                }
                this.O.C(y1pVar.f41868a);
                i1w0Var.d(new fmb0(this, (byte) 5));
                return;
            }
            if (!(iya0Var instanceof hya0)) {
                if (iya0Var instanceof gya0) {
                    i3t0.A(this, this.C, akv.f1041a, null, null, 6);
                    return;
                }
                if (!(iya0Var instanceof eya0)) {
                    t9f.b();
                    return;
                }
                ylb0 ylb0Var = ((eya0) iya0Var).f8620a;
                Iterator it = ((olb0) D()).f25444a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    amb0Var = (amb0) next;
                    if (ylb0Var.equals(tlb0.f34134a)) {
                        amb0Var2 = amb0.AGGREGATOR;
                    } else if (ylb0Var.equals(ulb0.f35864a)) {
                        amb0Var2 = amb0.CYBER;
                    } else if (ylb0Var.equals(vlb0.f37614a)) {
                        amb0Var2 = amb0.ONE_X_GAMES;
                    } else if (ylb0Var.equals(wlb0.f39346a)) {
                        amb0Var2 = amb0.SPORT;
                    } else {
                        if (!ylb0Var.equals(xlb0.f41064a)) {
                            t9f.b();
                            return;
                        }
                        amb0Var2 = amb0.TOP;
                    }
                } while (amb0Var != amb0Var2);
                amb0 amb0Var4 = (amb0) next;
                if (amb0Var4 == null || amb0Var4 == ((olb0) D()).b) {
                    return;
                }
                p7m0 p7m0Var7 = ocjVar.f25029a;
                do {
                    value = p7m0Var7.getValue();
                    value.getClass();
                    oyg0Var2.getClass();
                    q7x.F(oyg0Var2, amb0Var4, "KEY_CURRENT_TAB");
                } while (!p7m0Var7.m(value, olb0.a((olb0) value, null, amb0Var4, null, false, false, null, 0L, 0L, false, null, null, null, 8189)));
                P(amb0Var4);
                return;
            }
            amb0 amb0Var5 = (amb0) ((olb0) D()).f25444a.get(((hya0) iya0Var).f13851a);
            if (amb0Var5 == ((olb0) D()).b) {
                return;
            }
            p7m0 p7m0Var8 = ocjVar.f25029a;
            while (true) {
                Object value8 = p7m0Var8.getValue();
                value8.getClass();
                oyg0Var2.getClass();
                oyg0 oyg0Var3 = oyg0Var2;
                q7x.F(oyg0Var3, amb0Var5, "KEY_CURRENT_TAB");
                amb0 amb0Var6 = amb0Var5;
                if (p7m0Var8.m(value8, olb0.a((olb0) value8, null, amb0Var6, null, false, false, null, 0L, 0L, false, null, null, null, 8189))) {
                    P(amb0Var6);
                    return;
                } else {
                    oyg0Var2 = oyg0Var3;
                    amb0Var5 = amb0Var6;
                }
            }
        }
    }
}
