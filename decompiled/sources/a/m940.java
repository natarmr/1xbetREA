package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bonuses.impl.navigation.BonusesScreenFactoryImpl$getBonusesScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.feature.promo_aggregator.impl.navigation.PromoCheckAggregatorFragmentScreen;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoListScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class m940 extends i3t0 {
    public static final /* synthetic */ int U = 0;
    public final grj A;
    public final mne B;
    public final duj C;
    public final erc D;
    public final g5k E;
    public final pru F;
    public final fuj0 G;
    public final jh70 H;
    public final hzg I;
    public final uzc0 J;
    public final ahu K;
    public final r990 L;
    public final v6k M;
    public final ouu N;
    public final s9m0 O;
    public final h3c P;
    public final uf3 Q;
    public c4m0 R;
    public bby S;
    public bby T;
    public final i1w0 o;
    public final o470 p;
    public final b4j q;
    public final je r;
    public final m1e s;
    public final qgd t;
    public final peg0 u;
    public final qv2 v;
    public final oct w;
    public final jh70 x;
    public final vjp y;
    public final ctf0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public m940(vzg0 vzg0Var, i1w0 i1w0Var, o470 o470Var, b4j b4jVar, je jeVar, sa10 sa10Var, m1e m1eVar, qgd qgdVar, peg0 peg0Var, qv2 qv2Var, oct octVar, jh70 jh70Var, vjp vjpVar, ctf0 ctf0Var, grj grjVar, mne mneVar, duj dujVar, erc ercVar, g5k g5kVar, pru pruVar, fuj0 fuj0Var, jh70 jh70Var2, hzg hzgVar, uzc0 uzc0Var, ahu ahuVar, r990 r990Var, v6k v6kVar, ouu ouuVar, s9m0 s9m0Var, h3c h3cVar, uf3 uf3Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new gj30((byte) 25), cvm0.p(rwjVar, rwjVar), new ytz(ctf0Var, sa10Var, (byte) 3), (yzn0) null);
        this.o = i1w0Var;
        this.p = o470Var;
        this.q = b4jVar;
        this.r = jeVar;
        this.s = m1eVar;
        this.t = qgdVar;
        this.u = peg0Var;
        this.v = qv2Var;
        this.w = octVar;
        this.x = jh70Var;
        this.y = vjpVar;
        this.z = ctf0Var;
        this.A = grjVar;
        this.B = mneVar;
        this.C = dujVar;
        this.D = ercVar;
        this.E = g5kVar;
        this.F = pruVar;
        this.G = fuj0Var;
        this.H = jh70Var2;
        this.I = hzgVar;
        this.J = uzc0Var;
        this.K = ahuVar;
        this.L = r990Var;
        this.M = v6kVar;
        this.N = ouuVar;
        this.O = s9m0Var;
        this.P = h3cVar;
        this.Q = uf3Var;
    }

    public final void M() {
        bby bbyVar = this.S;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.S = sac.V(jiu0.a(this), new f940(this, (byte) 6), null, this.B.f22085a, new k940(this, null, (byte) 2), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x040b  */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        List list;
        Object value2;
        Object value3;
        long j;
        Object value4;
        n940 n940Var;
        Object value5;
        v740 v740Var = (v740) obj;
        v740Var.getClass();
        boolean z = v740Var instanceof u740;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            e3c.n(this.S);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, n940.a((n940) value5, null, true, null, null, 13)));
            M();
            return;
        }
        if (v740Var instanceof m740) {
            G(u840.f35218a);
            return;
        }
        boolean z2 = v740Var instanceof t740;
        byte b = 4;
        final byte b2 = 0;
        mne mneVar = this.B;
        final byte b3 = 1;
        je jeVar = this.r;
        b4j b4jVar = this.q;
        if (!z2) {
            yje yjeVar = null;
            if (v740Var instanceof n740) {
                String str = ((n740) v740Var).f23024a;
                b4jVar.f1961a.c("msg_promocode_copy_call");
                jeVar.f16351a.a(xun.f41520a, 3139L);
                G(new t840(str));
                return;
            }
            if (v740Var instanceof r740) {
                String str2 = ((r740) v740Var).f29961a;
                b4jVar.f1961a.c("msg_open");
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, n940.a((n940) value3, null, false, null, kotlin.collections.a.c(str2), 7)));
                G(new x840(false));
                return;
            }
            if (v740Var instanceof o740) {
                b4jVar.f1961a.c("msg_open");
                d940 d940Var = ((n940) D()).f23121a;
                a940 a940Var = d940Var instanceof a940 ? (a940) d940Var : null;
                if (a940Var == null || (list = a940Var.f459a) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((z540) it.next()).b);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value2, n940.a((n940) value2, null, false, null, arrayList, 7)));
                G(new x840(true));
                return;
            }
            if (v740Var instanceof p740) {
                List list2 = ((n940) D()).d;
                if (list2.isEmpty()) {
                    return;
                }
                b4jVar.f1961a.c("msg_delete");
                jeVar.f16351a.a(xun.f41520a, 3069L);
                byte b4 = 0;
                sac.V(jiu0.a(this), new f940(this, b4), null, mneVar.b, new j940(this, list2, yjeVar, b4), 10);
                return;
            }
            if (v740Var instanceof q740) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, n940.a((n940) value, null, false, null, iun.f15405a, 7)));
                return;
            }
            if (v740Var instanceof s740) {
                b4jVar.f1961a.c("msg_promocode_close");
                jeVar.f16351a.a(xun.f41520a, 3141L);
                return;
            }
            if (v740Var instanceof k740) {
                c4m0 c4m0Var = this.R;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.R = sac.T(new fnq(this.s.b(), new k940(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foe.h);
                    return;
                }
                return;
            }
            if (v740Var instanceof l740) {
                e3c.n(this.R);
                e3c.n(this.S);
                return;
            } else if (v740Var.equals(j740.f16023a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i740 i740Var = ((t740) v740Var).f33449a;
        final t440 t440Var = i740Var.h;
        if (t440Var instanceof i440) {
            long j2 = ((i440) t440Var).f14128a;
            xuz xuzVar = r040.b;
            ab50 ab50Var = new ab50(4);
            ouu ouuVar = this.N;
            ouuVar.getClass();
            ouuVar.q(ab50Var, true);
            ouuVar.M(ab50Var).d(new g940(this, j2, (byte) 0));
            return;
        }
        boolean z3 = t440Var instanceof d440;
        i1w0 i1w0Var = this.o;
        if (z3) {
            i1w0Var.d(new Function1(this) { // from class: a.h940
                public final /* synthetic */ m940 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b5 = b2;
                    t440 t440Var2 = t440Var;
                    m940 m940Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b5) {
                        case 0:
                            k0w0Var.getClass();
                            d440 d440Var = (d440) t440Var2;
                            k0w0Var.h(m940Var.u.q(new fr1(new fs80(null, d440Var.b, null, kotlin.collections.a.c(Long.valueOf(d440Var.f5437a)), 0L, false, 117), q91.d)));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            k0w0Var.h(m940Var.u.q(new fr1(new fs80(null, ((g440) t440Var2).f10646a, null, null, 0L, false, 125), q91.d)));
                            break;
                        default:
                            k0w0Var.getClass();
                            k0w0Var.h(m940Var.u.q(new jr1(new evc0(false, ((h440) t440Var2).f12417a))));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        boolean z4 = t440Var instanceof e440;
        byte b5 = 3;
        peg0 peg0Var = this.u;
        final byte b6 = 2;
        if (z4) {
            switch (((e440) t440Var).f7165a.ordinal()) {
                case 0:
                    i1w0Var.d(new f940(this, b5));
                    break;
                case 1:
                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI.h(peg0Var.q(new jr1()));
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                        break;
                    }
                    break;
                case 2:
                    i1w0Var.d(new f940(this, b));
                    break;
                case 3:
                    k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI2.h(peg0Var.q(new hr1(-10L, 2)));
                    ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                        break;
                    }
                    break;
                case 4:
                    i1w0Var.d(new f940(this, (byte) 5));
                    break;
                case 5:
                    k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                    this.H.getClass();
                    k0w0VarI3.h(new PromoCheckAggregatorFragmentScreen(0, 0));
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO3;
                        if (pawVar3.hasNext()) {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                        break;
                    }
                    break;
                case 6:
                    break;
                default:
                    t9f.b();
                    break;
            }
            return;
        }
        if (t440Var instanceof g440) {
            i1w0Var.d(new Function1(this) { // from class: a.h940
                public final /* synthetic */ m940 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b7 = b3;
                    t440 t440Var2 = t440Var;
                    m940 m940Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b7) {
                        case 0:
                            k0w0Var.getClass();
                            d440 d440Var = (d440) t440Var2;
                            k0w0Var.h(m940Var.u.q(new fr1(new fs80(null, d440Var.b, null, kotlin.collections.a.c(Long.valueOf(d440Var.f5437a)), 0L, false, 117), q91.d)));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            k0w0Var.h(m940Var.u.q(new fr1(new fs80(null, ((g440) t440Var2).f10646a, null, null, 0L, false, 125), q91.d)));
                            break;
                        default:
                            k0w0Var.getClass();
                            k0w0Var.h(m940Var.u.q(new jr1(new evc0(false, ((h440) t440Var2).f12417a))));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (t440Var instanceof h440) {
            i1w0Var.d(new Function1(this) { // from class: a.h940
                public final /* synthetic */ m940 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b7 = b6;
                    t440 t440Var2 = t440Var;
                    m940 m940Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj2;
                    switch (b7) {
                        case 0:
                            k0w0Var.getClass();
                            d440 d440Var = (d440) t440Var2;
                            k0w0Var.h(m940Var.u.q(new fr1(new fs80(null, d440Var.b, null, kotlin.collections.a.c(Long.valueOf(d440Var.f5437a)), 0L, false, 117), q91.d)));
                            break;
                        case 1:
                            k0w0Var.getClass();
                            k0w0Var.h(m940Var.u.q(new fr1(new fs80(null, ((g440) t440Var2).f10646a, null, null, 0L, false, 125), q91.d)));
                            break;
                        default:
                            k0w0Var.getClass();
                            k0w0Var.h(m940Var.u.q(new jr1(new evc0(false, ((h440) t440Var2).f12417a))));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            return;
        }
        if (t440Var instanceof m440) {
            String str3 = ((m440) t440Var).f21150a;
            if (kotlin.text.c.x(str3, this.z.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0)), false)) {
                this.A.a(str3);
                return;
            } else {
                G(new w840(str3));
                return;
            }
        }
        if (t440Var instanceof r440) {
            r440 r440Var = (r440) t440Var;
            long j3 = r440Var.f29819a;
            long jA = s470.LUCKY_WHEEL.a();
            oct octVar = this.w;
            FragmentScreen fragmentScreenE = j3 == jA ? octVar.e() : oct.f(octVar, r440Var.f29819a, null, 0, null, null, 30);
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            if (fragmentScreenE instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenE)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenE)));
            }
            ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar4 = (paw) listIteratorO4;
                if (!pawVar4.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar4.next());
                }
            }
        } else {
            if (t440Var instanceof o440) {
                final o440 o440Var = (o440) t440Var;
                int iOrdinal = o440Var.e.ordinal();
                if (iOrdinal == 0) {
                    i1w0Var.d(new Function1(this) { // from class: a.i940
                        public final /* synthetic */ m940 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b7 = b2;
                            o440 o440Var2 = o440Var;
                            m940 m940Var = this.b;
                            k0w0 k0w0Var = (k0w0) obj2;
                            switch (b7) {
                                case 0:
                                    k0w0Var.getClass();
                                    k0w0Var.h(m940Var.y.b(o440Var2.d ? j700.b : j700.f16016a, new d8h0(3, null), cui0.b(Long.valueOf(o440Var2.b)), -1L, ""));
                                    break;
                                default:
                                    k0w0Var.getClass();
                                    k0w0Var.h(m940Var.y.b(o440Var2.d ? j700.b : j700.f16016a, new m8h0("", xun.f41520a, false), cui0.b(Long.valueOf(o440Var2.c)), o440Var2.b, ""));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    return;
                }
                if (iOrdinal == 1) {
                    i1w0Var.d(new Function1(this) { // from class: a.i940
                        public final /* synthetic */ m940 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b7 = b3;
                            o440 o440Var2 = o440Var;
                            m940 m940Var = this.b;
                            k0w0 k0w0Var = (k0w0) obj2;
                            switch (b7) {
                                case 0:
                                    k0w0Var.getClass();
                                    k0w0Var.h(m940Var.y.b(o440Var2.d ? j700.b : j700.f16016a, new d8h0(3, null), cui0.b(Long.valueOf(o440Var2.b)), -1L, ""));
                                    break;
                                default:
                                    k0w0Var.getClass();
                                    k0w0Var.h(m940Var.y.b(o440Var2.d ? j700.b : j700.f16016a, new m8h0("", xun.f41520a, false), cui0.b(Long.valueOf(o440Var2.c)), o440Var2.b, ""));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    return;
                } else if (iOrdinal == 2) {
                    sac.V(jiu0.a(this), null, null, mneVar.f22085a, new j940(this, o440Var, null, b6), 11);
                    return;
                } else {
                    if (iOrdinal == 3) {
                        return;
                    }
                    t9f.b();
                    return;
                }
            }
            if (t440Var instanceof p440) {
                int iOrdinal2 = ((p440) t440Var).f26333a.ordinal();
                if (iOrdinal2 == 0) {
                    i1w0Var.d(new f940(this, b3));
                    return;
                }
                if (iOrdinal2 == 1) {
                    i1w0Var.d(new f940(this, b6));
                    return;
                }
                if (iOrdinal2 == 2) {
                    k0w0 k0w0VarI4 = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI4.h(oct.f(this.w, 0L, null, 0, null, null, 31));
                    ListIterator listIteratorO5 = b1j.o(i1w0Var, k0w0VarI4.f17489a, 0);
                    while (true) {
                        paw pawVar5 = (paw) listIteratorO5;
                        if (!pawVar5.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar5.next());
                        }
                    }
                } else if (iOrdinal2 == 3) {
                    k0w0 k0w0VarI5 = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI5.h(peg0Var.q(new hr1(0L, 3)));
                    ListIterator listIteratorO6 = b1j.o(i1w0Var, k0w0VarI5.f17489a, 0);
                    while (true) {
                        paw pawVar6 = (paw) listIteratorO6;
                        if (!pawVar6.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar6.next());
                        }
                    }
                } else {
                    if (iOrdinal2 != 4) {
                        return;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    this.t.getClass();
                    FragmentScreen bonusesScreenFactoryImpl$getBonusesScreen$1 = new BonusesScreenFactoryImpl$getBonusesScreen$1();
                    if (bonusesScreenFactoryImpl$getBonusesScreen$1 instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) bonusesScreenFactoryImpl$getBonusesScreen$1)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(bonusesScreenFactoryImpl$getBonusesScreen$1)));
                    }
                    ListIterator listIteratorO7 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar7 = (paw) listIteratorO7;
                        if (!pawVar7.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar7.next());
                        }
                    }
                }
            } else {
                if (t440Var instanceof c440) {
                    String str4 = ((c440) t440Var).f3707a;
                    String str5 = i740Var.b;
                    bby bbyVar = this.T;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        b4jVar.getClass();
                        str4.getClass();
                        b4jVar.f1961a.a("msg_promocode_activate_call", wp20.b(new Pair("promocode", str4)));
                        jeVar.getClass();
                        b1j.v(str4, jeVar.f16351a, 3138L);
                        p7m0 p7m0Var5 = ocjVar.f25029a;
                        do {
                            value4 = p7m0Var5.getValue();
                            value4.getClass();
                            n940Var = (n940) value4;
                            oyg0Var.getClass();
                        } while (!p7m0Var5.m(value4, n940.a(n940Var, null, false, eui0.h(n940Var.c, str5), null, 11)));
                        this.T = sac.V(jiu0.a(this), new k9v(this, str5, str4, (byte) 29), new a540(this, str5, b3), mneVar.f22085a, new mw20((Object) this, (Object) str4, (Object) str5, (yje) null, (byte) 24), 8);
                        return;
                    }
                    return;
                }
                yje yjeVar2 = null;
                if (t440Var instanceof j440) {
                    j440 j440Var = (j440) t440Var;
                    yto0 yto0Var = j440Var.f;
                    int i = j440Var.g;
                    int iOrdinal3 = yto0Var.ordinal();
                    hzg hzgVar = this.I;
                    if (iOrdinal3 == 0) {
                        CyberGamesPage cyberGamesPageD = org.xplatform.cyber.section.api.domain.entity.d.d(i);
                        if (cyberGamesPageD.equals(CyberGamesPage.Real.INSTANCE)) {
                            j = j440Var.c;
                            if (j < 0) {
                                j = j440Var.b;
                            }
                        } else {
                            j = j440Var.b;
                        }
                        ((uzg) hzgVar).c(j, cyberGamesPageD, k1g.OPEN_REGULAR);
                        return;
                    }
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 == 2) {
                            sac.V(jiu0.a(this), null, null, mneVar.f22085a, new j940(j440Var, this, (yje) null), 11);
                            return;
                        } else {
                            if (iOrdinal3 == 3) {
                                return;
                            }
                            t9f.b();
                            return;
                        }
                    }
                    CyberGamesPage cyberGamesPageD2 = org.xplatform.cyber.section.api.domain.entity.d.d(i);
                    if (this.F.a().c.p.contains(Long.valueOf(j440Var.d))) {
                        ((uzg) hzgVar).g();
                        return;
                    }
                    long j4 = j440Var.b;
                    long j5 = j440Var.d;
                    byte b7 = cyberGamesPageD2.f46556a;
                    k1g k1gVar = k1g.OPEN_REGULAR;
                    ((uzg) hzgVar).f("", j4, j5, b7);
                    return;
                }
                if (t440Var instanceof k440) {
                    sac.V(jiu0.a(this), new f940(this, (byte) 7), null, mneVar.f22085a, new k940(this, yjeVar2, (byte) 0), 10);
                    return;
                }
                if (t440Var instanceof q440) {
                    k0w0 k0w0VarI6 = cs0.i(i1w0Var, i1w0Var);
                    this.x.getClass();
                    k0w0VarI6.h(new PromoScreenFactoryImpl$getPromoListScreen$1());
                    ListIterator listIteratorO8 = b1j.o(i1w0Var, k0w0VarI6.f17489a, 0);
                    while (true) {
                        paw pawVar8 = (paw) listIteratorO8;
                        if (!pawVar8.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar8.next());
                        }
                    }
                } else {
                    if (t440Var instanceof f440) {
                        sac.V(jiu0.a(this), l940.f19634a, null, mneVar.b, new yg1(((f440) t440Var).f8895a, this, (yje) null), 10);
                        return;
                    }
                    if (!(t440Var instanceof s440)) {
                        if ((t440Var instanceof n440) || t440Var.equals(l440.f19387a)) {
                            return;
                        }
                        t9f.b();
                        return;
                    }
                    int i2 = (int) ((s440) t440Var).f31588a;
                    k0w0 k0w0VarI7 = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI7.h(uzc0.c(this.J, i2));
                    ListIterator listIteratorO9 = b1j.o(i1w0Var, k0w0VarI7.f17489a, 0);
                    while (true) {
                        paw pawVar9 = (paw) listIteratorO9;
                        if (!pawVar9.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar9.next());
                        }
                    }
                }
            }
        }
    }
}
