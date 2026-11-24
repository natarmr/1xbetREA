package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class p850 extends i3t0 {
    public static final /* synthetic */ int p0 = 0;
    public final wgu A;
    public final x0u B;
    public final a6u C;
    public final soc D;
    public final yfu E;
    public final p4u F;
    public final xfu G;
    public final bwl H;
    public final f7u I;
    public final g3j J;
    public final rpt K;
    public final pmi L;
    public final a6u M;
    public final ytt N;
    public final xex O;
    public final zn00 P;
    public final eyg0 Q;
    public final r8i R;
    public final xfu S;
    public final lrc T;
    public final u58 U;
    public final s64 V;
    public final s91 W;
    public final gg5 X;
    public final erc Y;
    public final ix0 Z;
    public final e41 a0;
    public final s31 b0;
    public final vd1 c0;
    public final ix0 d0;
    public final ctf0 e0;
    public final yo4 f0;
    public final pw70 g0;
    public final duj h0;
    public final s31 i0;
    public final cyu j0;
    public final ali k0;
    public final z220 l0;
    public final cmt m0;
    public final LinkedHashMap n0;
    public final oeg0 o;
    public final LinkedHashMap o0;
    public final mne p;
    public final nc0 q;
    public final kb0 r;
    public final zri s;
    public final oif0 t;
    public final xmt u;
    public final pyt v;
    public final hsj w;
    public final ytt x;
    public final ieu y;
    public final rou z;

    /* JADX WARN: Illegal instructions before constructor call */
    public p850(oeg0 oeg0Var, mne mneVar, nc0 nc0Var, kb0 kb0Var, zri zriVar, oif0 oif0Var, xmt xmtVar, pyt pytVar, pru pruVar, hsj hsjVar, ytt yttVar, ieu ieuVar, rou rouVar, wgu wguVar, x0u x0uVar, a6u a6uVar, soc socVar, yfu yfuVar, p4u p4uVar, xfu xfuVar, bwl bwlVar, f7u f7uVar, iqt iqtVar, jqt jqtVar, g3j g3jVar, rpt rptVar, pmi pmiVar, a6u a6uVar2, ytt yttVar2, xex xexVar, zn00 zn00Var, eyg0 eyg0Var, r8i r8iVar, xfu xfuVar2, lrc lrcVar, m1e m1eVar, u58 u58Var, s64 s64Var, s91 s91Var, gg5 gg5Var, erc ercVar, ix0 ix0Var, e41 e41Var, s31 s31Var, vd1 vd1Var, ix0 ix0Var2, ctf0 ctf0Var, bzt bztVar, yo4 yo4Var, pw70 pw70Var, duj dujVar, s31 s31Var2, cyu cyuVar, ali aliVar, z220 z220Var, cmt cmtVar, q250 q250Var) {
        oeg0Var.getClass();
        wguVar.getClass();
        m1eVar.getClass();
        s91Var.getClass();
        ctf0Var.getClass();
        pw70Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        yje yjeVar = null;
        super(new ng0(pruVar, zriVar, iqtVar, bztVar, q250Var), g090VarP, new v510(ctf0Var, (byte) 11), (yzn0) null);
        this.o = oeg0Var;
        this.p = mneVar;
        this.q = nc0Var;
        this.r = kb0Var;
        this.s = zriVar;
        this.t = oif0Var;
        this.u = xmtVar;
        this.v = pytVar;
        this.w = hsjVar;
        this.x = yttVar;
        this.y = ieuVar;
        this.z = rouVar;
        this.A = wguVar;
        this.B = x0uVar;
        this.C = a6uVar;
        this.D = socVar;
        this.E = yfuVar;
        this.F = p4uVar;
        this.G = xfuVar;
        this.H = bwlVar;
        this.I = f7uVar;
        this.J = g3jVar;
        this.K = rptVar;
        this.L = pmiVar;
        this.M = a6uVar2;
        this.N = yttVar2;
        this.O = xexVar;
        this.P = zn00Var;
        this.Q = eyg0Var;
        this.R = r8iVar;
        this.S = xfuVar2;
        this.T = lrcVar;
        this.U = u58Var;
        this.V = s64Var;
        this.W = s91Var;
        this.X = gg5Var;
        this.Y = ercVar;
        this.Z = ix0Var;
        this.a0 = e41Var;
        this.b0 = s31Var;
        this.c0 = vd1Var;
        this.d0 = ix0Var2;
        this.e0 = ctf0Var;
        this.f0 = yo4Var;
        this.g0 = pw70Var;
        this.h0 = dujVar;
        this.i0 = s31Var2;
        this.j0 = cyuVar;
        this.k0 = aliVar;
        this.l0 = z220Var;
        this.m0 = cmtVar;
        this.n0 = new LinkedHashMap();
        this.o0 = new LinkedHashMap();
        dvj dvjVar = mneVar.b;
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        byte b = 1;
        i3t0.F(this, kb0Var, null, new z650(this, b), new o240((byte) 22), 117);
        byte b2 = 4;
        sac.T(new fnq(jqtVar.a(), new g850(this, yjeVar, (byte) 2), b2), d5c.S(jiu0.a(this), dvjVar), o850.h);
        sac.T(new fnq(m1eVar.a(), new g850(this, yjeVar, b), b2), d5c.S(jiu0.a(this), dvjVar), n850.h);
    }

    public static String S(Integer num, Integer num2) {
        if (num2 != null && num2.intValue() == 847) {
            return "last_played";
        }
        if (num2 != null && num2.intValue() == 825) {
            return "mc_favorite";
        }
        if (num2 != null && num2.intValue() == 824) {
            return "mc_recommended";
        }
        int id = (int) nw80.f24223a.getId();
        if (num != null && num.intValue() == id) {
            return "live_aggregator_popular";
        }
        int id2 = (int) nw80.b.getId();
        if (num != null && num.intValue() == id2) {
            return "slots_popular";
        }
        int id3 = (int) nw80.k.getId();
        if (num != null && num.intValue() == id3) {
            return "crash_popular";
        }
        return null;
    }

    public static int T(Integer num, Integer num2) {
        if (num2 != null && num2.intValue() == 847) {
            return 8116;
        }
        if (num2 != null && num2.intValue() == 825) {
            return 8124;
        }
        if (num2 != null && num2.intValue() == 824) {
            return 8114;
        }
        int id = (int) nw80.f24223a.getId();
        if (num != null && num.intValue() == id) {
            return 8119;
        }
        int id2 = (int) nw80.b.getId();
        if (num != null && num.intValue() == id2) {
            return 8118;
        }
        nw80.k.getId();
        return 0;
    }

    public final void M(bby bbyVar, String str) {
        this.n0.put(str, bbyVar);
    }

    public final void N(g650 g650Var, bby bbyVar) {
        this.o0.put(g650Var, bbyVar);
    }

    public final ArrayList O() {
        c0o c0oVar = e650.o;
        ArrayList arrayList = new ArrayList();
        c0oVar.getClass();
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            bby bbyVar = (bby) this.o0.get((e650) y2Var.next());
            if (bbyVar != null) {
                arrayList.add(bbyVar);
            }
        }
        return arrayList;
    }

    public final jge P(String str) {
        Object next;
        Iterator it = ((p650) D()).h.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((jge) next).getKey(), str)) {
                return (jge) next;
            }
        }
        next = null;
        return (jge) next;
    }

    public final bby Q(g650 g650Var) {
        return (bby) this.o0.get(g650Var);
    }

    public final bby R(String str) {
        return (bby) this.n0.get(str);
    }

    public final void U(Throwable th) {
        this.h0.b(th, new ba30(this, th, (byte) 18));
    }

    public final boolean V(String str) {
        bby bbyVarR = R(str);
        return bbyVarR != null && bbyVarR.isActive();
    }

    public final void W() {
        f650 f650Var = f650.b;
        bby bbyVarQ = Q(f650Var);
        if (bbyVarQ == null || !bbyVarQ.isActive()) {
            N(f650Var, sac.V(jiu0.a(this), new z650(this, (byte) 0), new y650(this, (byte) 2), null, new j940((Object) this, (yje) null, (byte) 8), 12));
        }
    }

    public final void X() {
        for (jge jgeVar : ((p650) D()).h) {
            if (jgeVar != null) {
                boolean z = jgeVar instanceof yfe;
                final byte b = 6;
                final byte b2 = 0;
                mne mneVar = this.p;
                yje yjeVar = null;
                if (z) {
                    final ha8 ha8Var = ((yfe) jgeVar).f42537a;
                    if (!V(ha8Var.getKey())) {
                        M(sac.X(jiu0.a(this), 4L, mneVar.b, new Function1(this) { // from class: a.a750
                            public final /* synthetic */ p850 b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b3 = b;
                                byte b4 = 7;
                                ha8 ha8Var2 = ha8Var;
                                p850 p850Var = this.b;
                                Throwable th = (Throwable) obj;
                                switch (b3) {
                                    case 0:
                                        th.getClass();
                                        p850Var.H(new l750(ha8Var2.getKey(), ha8Var2, (byte) 7));
                                        break;
                                    case 1:
                                        th.getClass();
                                        p850Var.H(new b850(ha8Var2.getKey(), (byte) 8));
                                        break;
                                    case 2:
                                        th.getClass();
                                        p850Var.H(new b850(ha8Var2.getKey(), b4));
                                        break;
                                    case 3:
                                        th.getClass();
                                        p850Var.H(new b850(ha8Var2.getKey(), (byte) 6));
                                        break;
                                    case 4:
                                        th.getClass();
                                        p850Var.H(new b850(ha8Var2.getKey(), (byte) 4));
                                        break;
                                    case 5:
                                        th.getClass();
                                        p850Var.H(new l750(ha8Var2.getKey(), ha8Var2, (byte) 5));
                                        break;
                                    default:
                                        th.getClass();
                                        p850Var.H(new b850(ha8Var2.getKey(), (byte) 2));
                                        p850Var.b0(ha8Var2.getKey());
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, new c850(this, ha8Var, yjeVar, b2)), ha8Var.getKey());
                    }
                } else {
                    final byte b3 = 3;
                    if (jgeVar instanceof ege) {
                        final ha8 ha8Var2 = ((ege) jgeVar).f7760a;
                        if (!V(ha8Var2.getKey())) {
                            M(sac.V(jiu0.a(this), new Function1(this) { // from class: a.a750
                                public final /* synthetic */ p850 b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    byte b4 = b3;
                                    byte b5 = 7;
                                    ha8 ha8Var3 = ha8Var2;
                                    p850 p850Var = this.b;
                                    Throwable th = (Throwable) obj;
                                    switch (b4) {
                                        case 0:
                                            th.getClass();
                                            p850Var.H(new l750(ha8Var3.getKey(), ha8Var3, (byte) 7));
                                            break;
                                        case 1:
                                            th.getClass();
                                            p850Var.H(new b850(ha8Var3.getKey(), (byte) 8));
                                            break;
                                        case 2:
                                            th.getClass();
                                            p850Var.H(new b850(ha8Var3.getKey(), b5));
                                            break;
                                        case 3:
                                            th.getClass();
                                            p850Var.H(new b850(ha8Var3.getKey(), (byte) 6));
                                            break;
                                        case 4:
                                            th.getClass();
                                            p850Var.H(new b850(ha8Var3.getKey(), (byte) 4));
                                            break;
                                        case 5:
                                            th.getClass();
                                            p850Var.H(new l750(ha8Var3.getKey(), ha8Var3, (byte) 5));
                                            break;
                                        default:
                                            th.getClass();
                                            p850Var.H(new b850(ha8Var3.getKey(), (byte) 2));
                                            p850Var.b0(ha8Var3.getKey());
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, new Function0(this) { // from class: a.b750
                                public final /* synthetic */ p850 b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    byte b4 = b3;
                                    ha8 ha8Var3 = ha8Var2;
                                    p850 p850Var = this.b;
                                    switch (b4) {
                                        case 0:
                                            p850Var.b0(ha8Var3.getKey());
                                            break;
                                        case 1:
                                            p850Var.b0(ha8Var3.getKey());
                                            break;
                                        case 2:
                                            p850Var.b0(ha8Var3.getKey());
                                            break;
                                        case 3:
                                            p850Var.b0(ha8Var3.getKey());
                                            break;
                                        case 4:
                                            p850Var.b0(ha8Var3.getKey());
                                            break;
                                        case 5:
                                            p850Var.b0(ha8Var3.getKey());
                                            break;
                                        default:
                                            p850Var.b0(ha8Var3.getKey());
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, mneVar.b, new mt00(this, ha8Var2, yjeVar, (byte) 23), 8), ha8Var2.getKey());
                        }
                    } else if (jgeVar instanceof ige) {
                        ige igeVar = (ige) jgeVar;
                        final ha8 ha8Var3 = igeVar.f14731a;
                        if (!V(ha8Var3.getKey())) {
                            M(sac.V(jiu0.a(this), new rw40(this, igeVar, b), new Function0(this) { // from class: a.b750
                                public final /* synthetic */ p850 b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    byte b4 = b;
                                    ha8 ha8Var4 = ha8Var3;
                                    p850 p850Var = this.b;
                                    switch (b4) {
                                        case 0:
                                            p850Var.b0(ha8Var4.getKey());
                                            break;
                                        case 1:
                                            p850Var.b0(ha8Var4.getKey());
                                            break;
                                        case 2:
                                            p850Var.b0(ha8Var4.getKey());
                                            break;
                                        case 3:
                                            p850Var.b0(ha8Var4.getKey());
                                            break;
                                        case 4:
                                            p850Var.b0(ha8Var4.getKey());
                                            break;
                                        case 5:
                                            p850Var.b0(ha8Var4.getKey());
                                            break;
                                        default:
                                            p850Var.b0(ha8Var4.getKey());
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, mneVar.b, new g850(this, yjeVar, b2), 8), ha8Var3.getKey());
                        }
                    } else {
                        final byte b4 = 1;
                        final byte b5 = 4;
                        if (jgeVar instanceof zfe) {
                            ha8 ha8Var4 = ((zfe) jgeVar).f44298a;
                            if (!V(ha8Var4.getKey())) {
                                M(sac.T(new fnq(new m430(new fnq(this.L.w(), new j940((Object) this, yjeVar, (byte) 10)), this, b3), new f850(this, ha8Var4, yjeVar, b5), b5), d5c.S(jiu0.a(this), mneVar.b), new c850(this, ha8Var4, yjeVar, b4)), ha8Var4.getKey());
                            }
                        } else {
                            byte b6 = 9;
                            if (jgeVar instanceof age) {
                                age ageVar = (age) jgeVar;
                                f650 f650Var = f650.c;
                                bby bbyVarQ = Q(f650Var);
                                if (bbyVarQ == null || !bbyVarQ.isActive() || ((p650) D()).n) {
                                    N(f650Var, sac.T(new fnq(new fnq(this.C.t(), new h750(this, yjeVar, (byte) 8)), new xr10((Object) this, yjeVar, (byte) 21), b5), d5c.S(jiu0.a(this), mneVar.b), new h750(this, yjeVar, b6)));
                                }
                                final ha8 ha8Var5 = ageVar.f819a;
                                if (!V(ha8Var5.getKey())) {
                                    M(sac.V(jiu0.a(this), new Function1(this) { // from class: a.a750
                                        public final /* synthetic */ p850 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            byte b7 = b5;
                                            byte b8 = 7;
                                            ha8 ha8Var6 = ha8Var5;
                                            p850 p850Var = this.b;
                                            Throwable th = (Throwable) obj;
                                            switch (b7) {
                                                case 0:
                                                    th.getClass();
                                                    p850Var.H(new l750(ha8Var6.getKey(), ha8Var6, (byte) 7));
                                                    break;
                                                case 1:
                                                    th.getClass();
                                                    p850Var.H(new b850(ha8Var6.getKey(), (byte) 8));
                                                    break;
                                                case 2:
                                                    th.getClass();
                                                    p850Var.H(new b850(ha8Var6.getKey(), b8));
                                                    break;
                                                case 3:
                                                    th.getClass();
                                                    p850Var.H(new b850(ha8Var6.getKey(), (byte) 6));
                                                    break;
                                                case 4:
                                                    th.getClass();
                                                    p850Var.H(new b850(ha8Var6.getKey(), (byte) 4));
                                                    break;
                                                case 5:
                                                    th.getClass();
                                                    p850Var.H(new l750(ha8Var6.getKey(), ha8Var6, (byte) 5));
                                                    break;
                                                default:
                                                    th.getClass();
                                                    p850Var.H(new b850(ha8Var6.getKey(), (byte) 2));
                                                    p850Var.b0(ha8Var6.getKey());
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, new Function0(this) { // from class: a.b750
                                        public final /* synthetic */ p850 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            byte b7 = b5;
                                            ha8 ha8Var6 = ha8Var5;
                                            p850 p850Var = this.b;
                                            switch (b7) {
                                                case 0:
                                                    p850Var.b0(ha8Var6.getKey());
                                                    break;
                                                case 1:
                                                    p850Var.b0(ha8Var6.getKey());
                                                    break;
                                                case 2:
                                                    p850Var.b0(ha8Var6.getKey());
                                                    break;
                                                case 3:
                                                    p850Var.b0(ha8Var6.getKey());
                                                    break;
                                                case 4:
                                                    p850Var.b0(ha8Var6.getKey());
                                                    break;
                                                case 5:
                                                    p850Var.b0(ha8Var6.getKey());
                                                    break;
                                                default:
                                                    p850Var.b0(ha8Var6.getKey());
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, mneVar.b, new hk40((Object) this, (Object) ageVar, (Object) ha8Var5, yjeVar, (byte) 7), 8), ha8Var5.getKey());
                                }
                            } else {
                                final byte b7 = 5;
                                if (jgeVar instanceof bge) {
                                    final ha8 ha8Var6 = ((bge) jgeVar).f2550a;
                                    if (!V(ha8Var6.getKey())) {
                                        M(sac.V(jiu0.a(this), new Function1(this) { // from class: a.a750
                                            public final /* synthetic */ p850 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                byte b8 = b7;
                                                byte b9 = 7;
                                                ha8 ha8Var7 = ha8Var6;
                                                p850 p850Var = this.b;
                                                Throwable th = (Throwable) obj;
                                                switch (b8) {
                                                    case 0:
                                                        th.getClass();
                                                        p850Var.H(new l750(ha8Var7.getKey(), ha8Var7, (byte) 7));
                                                        break;
                                                    case 1:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var7.getKey(), (byte) 8));
                                                        break;
                                                    case 2:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var7.getKey(), b9));
                                                        break;
                                                    case 3:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var7.getKey(), (byte) 6));
                                                        break;
                                                    case 4:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var7.getKey(), (byte) 4));
                                                        break;
                                                    case 5:
                                                        th.getClass();
                                                        p850Var.H(new l750(ha8Var7.getKey(), ha8Var7, (byte) 5));
                                                        break;
                                                    default:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var7.getKey(), (byte) 2));
                                                        p850Var.b0(ha8Var7.getKey());
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, new Function0(this) { // from class: a.b750
                                            public final /* synthetic */ p850 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                byte b8 = b7;
                                                ha8 ha8Var7 = ha8Var6;
                                                p850 p850Var = this.b;
                                                switch (b8) {
                                                    case 0:
                                                        p850Var.b0(ha8Var7.getKey());
                                                        break;
                                                    case 1:
                                                        p850Var.b0(ha8Var7.getKey());
                                                        break;
                                                    case 2:
                                                        p850Var.b0(ha8Var7.getKey());
                                                        break;
                                                    case 3:
                                                        p850Var.b0(ha8Var7.getKey());
                                                        break;
                                                    case 4:
                                                        p850Var.b0(ha8Var7.getKey());
                                                        break;
                                                    case 5:
                                                        p850Var.b0(ha8Var7.getKey());
                                                        break;
                                                    default:
                                                        p850Var.b0(ha8Var7.getKey());
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, mneVar.b, new o3s((Object) this, (Object) ha8Var6, yjeVar, (byte) 22), 8), ha8Var6.getKey());
                                    }
                                } else if (jgeVar instanceof cge) {
                                    final ha8 ha8Var7 = ((cge) jgeVar).f4307a;
                                    if (!V(ha8Var7.getKey())) {
                                        M(sac.V(jiu0.a(this), new Function1(this) { // from class: a.a750
                                            public final /* synthetic */ p850 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                byte b8 = b2;
                                                byte b9 = 7;
                                                ha8 ha8Var8 = ha8Var7;
                                                p850 p850Var = this.b;
                                                Throwable th = (Throwable) obj;
                                                switch (b8) {
                                                    case 0:
                                                        th.getClass();
                                                        p850Var.H(new l750(ha8Var8.getKey(), ha8Var8, (byte) 7));
                                                        break;
                                                    case 1:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var8.getKey(), (byte) 8));
                                                        break;
                                                    case 2:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var8.getKey(), b9));
                                                        break;
                                                    case 3:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var8.getKey(), (byte) 6));
                                                        break;
                                                    case 4:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var8.getKey(), (byte) 4));
                                                        break;
                                                    case 5:
                                                        th.getClass();
                                                        p850Var.H(new l750(ha8Var8.getKey(), ha8Var8, (byte) 5));
                                                        break;
                                                    default:
                                                        th.getClass();
                                                        p850Var.H(new b850(ha8Var8.getKey(), (byte) 2));
                                                        p850Var.b0(ha8Var8.getKey());
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, new Function0(this) { // from class: a.b750
                                            public final /* synthetic */ p850 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                byte b8 = b2;
                                                ha8 ha8Var8 = ha8Var7;
                                                p850 p850Var = this.b;
                                                switch (b8) {
                                                    case 0:
                                                        p850Var.b0(ha8Var8.getKey());
                                                        break;
                                                    case 1:
                                                        p850Var.b0(ha8Var8.getKey());
                                                        break;
                                                    case 2:
                                                        p850Var.b0(ha8Var8.getKey());
                                                        break;
                                                    case 3:
                                                        p850Var.b0(ha8Var8.getKey());
                                                        break;
                                                    case 4:
                                                        p850Var.b0(ha8Var8.getKey());
                                                        break;
                                                    case 5:
                                                        p850Var.b0(ha8Var8.getKey());
                                                        break;
                                                    default:
                                                        p850Var.b0(ha8Var8.getKey());
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, mneVar.b, new e850(this, ha8Var7, null), 8), ha8Var7.getKey());
                                    }
                                } else if (jgeVar instanceof dge) {
                                    ha8 ha8Var8 = ((dge) jgeVar).f6037a;
                                    if (!V(ha8Var8.getKey())) {
                                        nw80 nw80Var = ((aj0) ha8Var8.a()).c;
                                        M(sac.T(new fnq(((p650) D()).j ? new wk30(this.v.b(c9x.O(nw80Var.getId())), b5) : new wk30(this.u.a(nw80Var.getId()), b7), new f850(this, ha8Var8, yjeVar, b2), b5), d5c.S(jiu0.a(this), mneVar.b), new f850(this, ha8Var8, yjeVar, b4)), ha8Var8.getKey());
                                    }
                                } else {
                                    final byte b8 = 2;
                                    if (jgeVar instanceof fge) {
                                        final ha8 ha8Var9 = ((fge) jgeVar).f9487a;
                                        if (!V(ha8Var9.getKey())) {
                                            M(sac.V(jiu0.a(this), new Function1(this) { // from class: a.a750
                                                public final /* synthetic */ p850 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    byte b9 = b8;
                                                    byte b10 = 7;
                                                    ha8 ha8Var10 = ha8Var9;
                                                    p850 p850Var = this.b;
                                                    Throwable th = (Throwable) obj;
                                                    switch (b9) {
                                                        case 0:
                                                            th.getClass();
                                                            p850Var.H(new l750(ha8Var10.getKey(), ha8Var10, (byte) 7));
                                                            break;
                                                        case 1:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var10.getKey(), (byte) 8));
                                                            break;
                                                        case 2:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var10.getKey(), b10));
                                                            break;
                                                        case 3:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var10.getKey(), (byte) 6));
                                                            break;
                                                        case 4:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var10.getKey(), (byte) 4));
                                                            break;
                                                        case 5:
                                                            th.getClass();
                                                            p850Var.H(new l750(ha8Var10.getKey(), ha8Var10, (byte) 5));
                                                            break;
                                                        default:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var10.getKey(), (byte) 2));
                                                            p850Var.b0(ha8Var10.getKey());
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, new Function0(this) { // from class: a.b750
                                                public final /* synthetic */ p850 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b9 = b8;
                                                    ha8 ha8Var10 = ha8Var9;
                                                    p850 p850Var = this.b;
                                                    switch (b9) {
                                                        case 0:
                                                            p850Var.b0(ha8Var10.getKey());
                                                            break;
                                                        case 1:
                                                            p850Var.b0(ha8Var10.getKey());
                                                            break;
                                                        case 2:
                                                            p850Var.b0(ha8Var10.getKey());
                                                            break;
                                                        case 3:
                                                            p850Var.b0(ha8Var10.getKey());
                                                            break;
                                                        case 4:
                                                            p850Var.b0(ha8Var10.getKey());
                                                            break;
                                                        case 5:
                                                            p850Var.b0(ha8Var10.getKey());
                                                            break;
                                                        default:
                                                            p850Var.b0(ha8Var10.getKey());
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, mneVar.b, new j940(ha8Var9, this, yjeVar, b6), 8), ha8Var9.getKey());
                                        }
                                    } else if (jgeVar instanceof gge) {
                                        final ha8 ha8Var10 = ((gge) jgeVar).f11249a;
                                        if (!V(ha8Var10.getKey())) {
                                            M(sac.V(jiu0.a(this), new Function1(this) { // from class: a.a750
                                                public final /* synthetic */ p850 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    byte b9 = b4;
                                                    byte b10 = 7;
                                                    ha8 ha8Var11 = ha8Var10;
                                                    p850 p850Var = this.b;
                                                    Throwable th = (Throwable) obj;
                                                    switch (b9) {
                                                        case 0:
                                                            th.getClass();
                                                            p850Var.H(new l750(ha8Var11.getKey(), ha8Var11, (byte) 7));
                                                            break;
                                                        case 1:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var11.getKey(), (byte) 8));
                                                            break;
                                                        case 2:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var11.getKey(), b10));
                                                            break;
                                                        case 3:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var11.getKey(), (byte) 6));
                                                            break;
                                                        case 4:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var11.getKey(), (byte) 4));
                                                            break;
                                                        case 5:
                                                            th.getClass();
                                                            p850Var.H(new l750(ha8Var11.getKey(), ha8Var11, (byte) 5));
                                                            break;
                                                        default:
                                                            th.getClass();
                                                            p850Var.H(new b850(ha8Var11.getKey(), (byte) 2));
                                                            p850Var.b0(ha8Var11.getKey());
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, new Function0(this) { // from class: a.b750
                                                public final /* synthetic */ p850 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b9 = b4;
                                                    ha8 ha8Var11 = ha8Var10;
                                                    p850 p850Var = this.b;
                                                    switch (b9) {
                                                        case 0:
                                                            p850Var.b0(ha8Var11.getKey());
                                                            break;
                                                        case 1:
                                                            p850Var.b0(ha8Var11.getKey());
                                                            break;
                                                        case 2:
                                                            p850Var.b0(ha8Var11.getKey());
                                                            break;
                                                        case 3:
                                                            p850Var.b0(ha8Var11.getKey());
                                                            break;
                                                        case 4:
                                                            p850Var.b0(ha8Var11.getKey());
                                                            break;
                                                        case 5:
                                                            p850Var.b0(ha8Var11.getKey());
                                                            break;
                                                        default:
                                                            p850Var.b0(ha8Var11.getKey());
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, mneVar.b, new my9(this, ha8Var10, null), 8), ha8Var10.getKey());
                                        }
                                    } else if (jgeVar instanceof hge) {
                                        ha8 ha8Var11 = ((hge) jgeVar).f13014a;
                                        if (!V(ha8Var11.getKey())) {
                                            M(sac.T(new fnq(this.M.v(), new f850(this, ha8Var11, yjeVar, b8), b5), d5c.S(jiu0.a(this), mneVar.b), new f850(this, ha8Var11, yjeVar, b3)), ha8Var11.getKey());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            t9f.b();
            return;
        }
    }

    public final void Y(boolean z) {
        e650 e650Var = e650.k;
        bby bbyVarQ = Q(e650Var);
        N(e650Var, bww.R(jiu0.a(this), bbyVarQ, O(), this.p.f22085a, k850.f17857a, new y650(this, (byte) 15), new l850(this, z, null, (byte) 1), 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object Z(myr0 myr0Var, zje zjeVar) {
        m850 m850Var;
        myr0 myr0Var2 = myr0Var;
        if (zjeVar instanceof m850) {
            m850Var = (m850) zjeVar;
            int i = m850Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                m850Var.l = i - Integer.MIN_VALUE;
            } else {
                m850Var = new m850(this, zjeVar);
            }
        } else {
            m850Var = new m850(this, zjeVar);
        }
        Object obj = m850Var.j;
        wne wneVar = wne.f39444a;
        int i2 = m850Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            boolean z = myr0Var2.d instanceof jyr0;
            if (myr0Var2.b != z1s0.b || z) {
                this.W.c(new AggregatorScreenModel(null, null, 0L, new qm1(myr0Var2.f22617a, s9s0.f31863a, myr0Var2.f.f13873a, false), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
            } else {
                aue0 aue0Var = aue0.d;
                m850Var.i = myr0Var2;
                m850Var.l = 1;
                if (this.N.a(aue0Var, m850Var) == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        myr0Var2 = m850Var.i;
        z1x.P(obj);
        this.o.c().d(new rw40(this, myr0Var2, (byte) 7));
        return Unit.f46060a;
    }

    public final void a0(g650 g650Var) {
        this.o0.remove(g650Var);
    }

    public final void b0(String str) {
        this.n0.remove(str);
    }

    public final String c0(int i, Integer num) {
        List listR;
        Integer numValueOf = Integer.valueOf(i + 1);
        if (!((p650) D()).n) {
            numValueOf = null;
        }
        Integer num2 = numValueOf;
        if (num != null && num.intValue() == 825) {
            listR = hne.r(825L, "category");
        } else if (num != null && num.intValue() == 847) {
            listR = hne.r(0L, "recent");
        } else {
            listR = (num != null && num.intValue() == 824) ? hne.r(824L, "category") : iun.f15405a;
        }
        return this.Q.k(new lu0(0L, num2, ((p650) D()).n ? "my_aggregator" : "my_aggregator_anonim", listR));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object next2;
        Object next3;
        s150 s150Var = (s150) obj;
        s150Var.getClass();
        boolean z = s150Var instanceof r150;
        byte b = 6;
        byte b2 = 0;
        eb0 eb0Var = eb0.f7494a;
        mne mneVar = this.p;
        ?? r7 = 0;
        Object obj2 = null;
        Object obj3 = null;
        byte b3 = 1;
        if (!z) {
            if (!(s150Var instanceof v050)) {
                t9f.b();
                return;
            }
            v050 v050Var = (v050) s150Var;
            if (v050Var instanceof p050) {
                String str = ((p050) v050Var).f26133a;
                f650 f650Var = f650.f;
                bby bbyVarQ = Q(f650Var);
                if (bbyVarQ == null || !bbyVarQ.isActive()) {
                    N(f650Var, sac.V(jiu0.a(this), k750.f17802a, new y650(this, (byte) 13), mneVar.b, new m750(this, str, r7, b2), 8));
                    return;
                }
                return;
            }
            if (v050Var instanceof q050) {
                i3t0.A(this, this.J, q2j.f28000a, mneVar.b, null, 4);
                i3t0.A(this, this.r, eb0Var, mneVar.b, null, 4);
                return;
            }
            if (v050Var instanceof s050) {
                f650 f650Var2 = f650.e;
                bby bbyVarQ2 = Q(f650Var2);
                if (bbyVarQ2 == null || !bbyVarQ2.isActive()) {
                    N(f650Var2, sac.V(jiu0.a(this), h850.f12611a, new y650(this, (byte) 0), mneVar.b, new h750(this, r7, b), 8));
                    return;
                }
                return;
            }
            boolean z2 = v050Var instanceof t050;
            erc ercVar = this.Y;
            if (z2) {
                ercVar.a(false);
                return;
            }
            if (v050Var instanceof u050) {
                W();
                ercVar.a(true);
                return;
            } else if (v050Var instanceof r050) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        r150 r150Var = (r150) s150Var;
        boolean z3 = r150Var instanceof w050;
        gg5 gg5Var = this.X;
        u58 u58Var = this.U;
        if (z3) {
            w050 w050Var = (w050) r150Var;
            int i = w050Var.f38334a;
            String str2 = w050Var.b;
            Iterator it = ((p650) D()).h.iterator();
            do {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
            } while (!Intrinsics.d(((jge) next3).getKey(), str2));
            if (!(next3 instanceof dge)) {
                next3 = null;
            }
            dge dgeVar = (dge) next3;
            if (dgeVar != null) {
                ha8 ha8Var = dgeVar.f6037a;
                if (ha8Var instanceof da8) {
                    Iterator it2 = CollectionsKt.S0((Iterable) ((da8) ha8Var).b).iterator();
                    while (true) {
                        iil iilVar = (iil) it2;
                        if (!iilVar.b.hasNext()) {
                            break;
                        }
                        Object next4 = iilVar.next();
                        if (((lr5) ((IndexedValue) next4).b).f20512a == i) {
                            obj2 = next4;
                            break;
                        }
                    }
                    IndexedValue indexedValue = (IndexedValue) obj2;
                    if (indexedValue != null) {
                        int i2 = indexedValue.f46061a;
                        lr5 lr5Var = (lr5) indexedValue.b;
                        int i3 = lr5Var.f20512a;
                        String strY = c3x.y(lr5Var.h, lr5Var.j);
                        int i4 = indexedValue.f46061a;
                        mi0 mi0Var = ((p650) D()).f26438a;
                        mi0 mi0Var2 = mi0.MY_VIRTUAL;
                        if (mi0Var == mi0Var2) {
                            this.f0.o(i3, i4, null, strY, "main_screen");
                        }
                        String str3 = ((p650) D()).f26438a == mi0Var2 ? "aggregator_virtual" : "my_aggregator";
                        u58Var.h(Integer.valueOf(i3), Integer.valueOf(i2), str3);
                        gg5Var.n(Integer.valueOf(i3), Integer.valueOf(i2), str3);
                        this.q.y(lr5Var, indexedValue.f46061a, "", jiu0.a(this), new f340(1, this, p850.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (r150Var instanceof a150) {
            String str4 = ((a150) r150Var).f54a;
            e650 e650Var = e650.c;
            N(e650Var, bww.R(jiu0.a(this), Q(e650Var), O(), mneVar.f22085a, i750.f14276a, new y650(this, (byte) 6), new j750(this, str4, r7, b2), 8));
            return;
        }
        byte b4 = 4;
        if (r150Var instanceof b150) {
            t150 t150Var = ((b150) r150Var).f1792a;
            if (((p650) D()).n) {
                return;
            }
            e650 e650Var2 = e650.d;
            N(e650Var2, bww.R(jiu0.a(this), Q(e650Var2), O(), mneVar.f22085a, t750.f33451a, new y650(this, (byte) 4), new u750(this, t150Var, r7, b2), 8));
            return;
        }
        if (r150Var instanceof l150) {
            t150 t150Var2 = ((l150) r150Var).f19233a;
            if (((p650) D()).n) {
                return;
            }
            e650 e650Var3 = e650.e;
            N(e650Var3, bww.R(jiu0.a(this), Q(e650Var3), O(), mneVar.f22085a, x750.f40398a, new y650(this, (byte) 7), new u750(this, t150Var2, r7, b3), 8));
            return;
        }
        byte b5 = 5;
        if (r150Var instanceof c150) {
            e650 e650Var4 = e650.b;
            N(e650Var4, bww.R(jiu0.a(this), Q(e650Var4), O(), mneVar.f22085a, z750.f43902a, new y650(this, (byte) 17), new h750(this, r7, b5), 8));
            return;
        }
        if (r150Var instanceof q150) {
            i3t0.A(this, this.r, eb0Var, mneVar.b, null, 4);
            return;
        }
        if (r150Var instanceof e150) {
            e650 e650Var5 = e650.m;
            N(e650Var5, bww.R(jiu0.a(this), Q(e650Var5), O(), mneVar.f22085a, q750.f28234a, new y650(this, (byte) 14), new h750(this, r7, b3), 8));
            return;
        }
        if (r150Var instanceof y050) {
            ((p650) D()).getClass();
            return;
        }
        if (r150Var instanceof g150) {
            g150 g150Var = (g150) r150Var;
            long j = g150Var.f10494a;
            String str5 = g150Var.b;
            e650 e650Var6 = e650.f;
            bby bbyVarQ3 = Q(e650Var6);
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = mneVar.f22085a;
            byte b6 = 0;
            N(e650Var6, bww.R(bvcVarA, bbyVarQ3, O(), rwjVar, new r750(1, this, p850.class, "handleError", "handleError(Ljava/lang/Throwable;)V", b6, (byte) 0), new y650(this, (byte) 5), new s750(this, str5, j, null, b6), 8));
            return;
        }
        if (r150Var instanceof f150) {
            f150 f150Var = (f150) r150Var;
            long j2 = f150Var.f8749a;
            String str6 = f150Var.b;
            Iterator it3 = ((p650) D()).h.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!Intrinsics.d(((jge) next2).getKey(), str6));
            if (!(next2 instanceof age)) {
                next2 = null;
            }
            age ageVar = (age) next2;
            if (ageVar != null) {
                ha8 ha8Var2 = ageVar.f819a;
                if (ha8Var2 instanceof da8) {
                    da8 da8Var = (da8) ha8Var2;
                    Object obj4 = da8Var.f5734a;
                    Iterator it4 = CollectionsKt.S0((Iterable) da8Var.b).iterator();
                    while (true) {
                        iil iilVar2 = (iil) it4;
                        if (!iilVar2.b.hasNext()) {
                            break;
                        }
                        Object next5 = iilVar2.next();
                        if (((mlr) ((IndexedValue) next5).b).f22006a == j2) {
                            obj3 = next5;
                            break;
                        }
                    }
                    IndexedValue indexedValue2 = (IndexedValue) obj3;
                    if (indexedValue2 != null) {
                        int i5 = indexedValue2.f46061a;
                        mlr mlrVar = (mlr) indexedValue2.b;
                        boolean zContains = ((p650) D()).i.contains(Long.valueOf(j2));
                        xi0 xi0Var = (xi0) obj4;
                        Integer num = xi0Var.h;
                        Integer num2 = xi0Var.c;
                        int iT = T(num, num2);
                        String strS = S(xi0Var.h, num2);
                        boolean zContains2 = ((p650) D()).i.contains(Long.valueOf(j2));
                        this.U.j(j2, ((p650) D()).i.contains(Long.valueOf(j2)), Integer.valueOf(iT), "my_aggregator", strS);
                        this.Z.h((int) j2, Integer.valueOf(iT), "my_aggregator", strS, !zContains2);
                        sac.V(jiu0.a(this), new f340(1, this, p850.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, mneVar.b, new hoe(this, i5, xi0Var.c, zContains, mlrVar, iT, null), 10);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (r150Var instanceof h150) {
            String str7 = ((h150) r150Var).f12266a;
            Iterator it5 = ((p650) D()).h.iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (!Intrinsics.d(((jge) next).getKey(), str7));
            bge bgeVar = (bge) (next instanceof bge ? next : 0);
            if (bgeVar != null) {
                ha8 ha8Var3 = bgeVar.f2550a;
                if (ha8Var3 instanceof da8) {
                    b1j.r(530, this.a0.f7161a, 11992L);
                    i8i.D("jackpot_id", "530", this.b0.f31532a, "jackpot_call");
                    this.q.y(((g8y) ((da8) ha8Var3).b).b, 0, this.Q.k(new lu0(0L, 1, ((p650) D()).n ? "my_aggregator" : "my_aggregator_anonim", hne.r(0L, "jackpot"))), jiu0.a(this), new r750(1, this, p850.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1));
                    return;
                }
                return;
            }
            return;
        }
        byte b7 = 2;
        if (r150Var instanceof d150) {
            String str8 = ((d150) r150Var).f5294a;
            e650 e650Var7 = e650.i;
            N(e650Var7, bww.R(jiu0.a(this), Q(e650Var7), O(), mneVar.f22085a, o750.f24769a, new y650(this, (byte) 8), new j750(this, str8, r7, b7), 8));
            return;
        }
        if (r150Var instanceof x050) {
            String str9 = ((x050) r150Var).f40055a;
            e650 e650Var8 = e650.h;
            N(e650Var8, bww.R(jiu0.a(this), Q(e650Var8), O(), mneVar.f22085a, n750.f23025a, new y650(this, (byte) 16), new j750(this, str9, r7, b3), 8));
            return;
        }
        if ((r150Var instanceof j150) || (r150Var instanceof i150)) {
            Y(false);
            return;
        }
        byte b8 = 3;
        if (!(r150Var instanceof k150)) {
            if (r150Var instanceof m150) {
                W();
                return;
            }
            if (r150Var instanceof n150) {
                e650 e650Var9 = e650.j;
                N(e650Var9, bww.R(jiu0.a(this), Q(e650Var9), O(), mneVar.f22085a, y750.f42135a, new y650(this, (byte) 18), new h750(this, r7, b4), 8));
                return;
            }
            if (r150Var instanceof o150) {
                u58Var.f35083a.c("my_aggregator_spin_anon");
                gg5Var.f11237a.a(xun.f41520a, 11111L);
                return;
            }
            if (r150Var instanceof z050) {
                e650 e650Var10 = e650.f7265a;
                N(e650Var10, bww.R(jiu0.a(this), Q(e650Var10), O(), mneVar.f22085a, g750.f10799a, new y650(this, (byte) 3), new h750(this, r7, b2), 8));
                return;
            } else {
                if (!(r150Var instanceof p150)) {
                    t9f.b();
                    return;
                }
                p150 p150Var = (p150) r150Var;
                long j3 = p150Var.f26184a;
                String str10 = p150Var.b;
                e650 e650Var11 = e650.g;
                N(e650Var11, bww.R(jiu0.a(this), Q(e650Var11), O(), mneVar.f22085a, a850.f409a, new y650(this, (byte) 9), new s750(this, str10, j3, null, (byte) 1), 8));
                return;
            }
        }
        k150 k150Var = (k150) r150Var;
        String str11 = k150Var.f17503a;
        String str12 = k150Var.b;
        int iHashCode = str11.hashCode();
        if (iHashCode == 782052589) {
            if (str11.equals("BONUSES")) {
                e650 e650Var12 = e650.l;
                N(e650Var12, bww.R(jiu0.a(this), Q(e650Var12), O(), mneVar.f22085a, w750.f38655a, new y650(this, (byte) 11), new h750(this, r7, b8), 8));
                return;
            }
            return;
        }
        if (iHashCode != 807116442) {
            if (iHashCode == 1489292093 && str11.equals("PROMO_CODE")) {
                e650 e650Var13 = e650.l;
                N(e650Var13, bww.R(jiu0.a(this), Q(e650Var13), O(), mneVar.f22085a, v750.f36907a, new y650(this, (byte) 10), new h750(this, r7, b7), 8));
                return;
            }
            return;
        }
        if (str11.equals("CASHBACK")) {
            f650 f650Var3 = f650.g;
            bby bbyVarQ4 = Q(f650Var3);
            if (bbyVarQ4 == null || !bbyVarQ4.isActive()) {
                N(f650Var3, sac.V(jiu0.a(this), new rw40(this, str12, b5), new y650(this, (byte) 12), mneVar.b, new m750(this, str12, r7, b3), 8));
            }
        }
    }
}
