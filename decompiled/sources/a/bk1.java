package a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class bk1 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public final je A;
    public final cyu B;
    public bby C;
    public final ctf0 o;
    public final pw70 p;
    public final xex q;
    public final zn00 r;
    public final ali s;
    public final oeg0 t;
    public final duj u;
    public final mne v;
    public final u58 w;
    public final ix0 x;
    public final b4j y;
    public final j2j z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public bk1(dgu dguVar, final ctf0 ctf0Var, final iqt iqtVar, soc socVar, m1e m1eVar, final long j, final long j2, final rj1 rj1Var, final int i, pw70 pw70Var, xex xexVar, zn00 zn00Var, ali aliVar, oeg0 oeg0Var, duj dujVar, mne mneVar, kc60 kc60Var, u58 u58Var, ix0 ix0Var, b4j b4jVar, j2j j2jVar, je jeVar, cyu cyuVar, final pru pruVar) {
        Object value;
        ctf0Var.getClass();
        m1eVar.getClass();
        pw70Var.getClass();
        oeg0Var.getClass();
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        yje yjeVar = null;
        super(new Function0() { // from class: a.sj1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                sff0 sff0VarA = pruVar.a();
                boolean zA = iqtVar.f15225a.a();
                long j3 = j;
                Long lValueOf = Long.valueOf(j3);
                c0o c0oVar = nw80.f1;
                if (c0oVar != null && c0oVar.isEmpty()) {
                    lValueOf = null;
                    break;
                }
                Iterator it = c0oVar.iterator();
                do {
                    if (!it.hasNext()) {
                        lValueOf = null;
                        break;
                    }
                } while (((nw80) it.next()).getId() != j3);
                return new j8d0(lValueOf != null ? lValueOf.longValue() : nw80.t.getId(), j2, ctf0Var.b.a(R.string.available_games_title, Arrays.copyOf(new Object[0], 0)), zA, i, rj1Var, sff0VarA.b.C, d8d0.f5642a, xun.f41520a, sff0VarA, null);
            }
        }, cvm0.p(vs10Var, dvjVar), new uc(ctf0Var, (byte) 13), (yzn0) null);
        this.o = ctf0Var;
        this.p = pw70Var;
        this.q = xexVar;
        this.r = zn00Var;
        this.s = aliVar;
        this.t = oeg0Var;
        this.u = dujVar;
        this.v = mneVar;
        this.w = u58Var;
        this.x = ix0Var;
        this.y = b4jVar;
        this.z = j2jVar;
        this.A = jeVar;
        this.B = cyuVar;
        vzg0 vzg0Var = new vzg0();
        j2jVar.f7878a = this;
        j2jVar.b = vzg0Var;
        socVar.b();
        sac.T(new fnq(j2jVar.y, new vj1(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), dvjVar), zj1.h);
        sac.T(new fnq(m1eVar.b(), new pa((Object) this, yjeVar, (byte) 17), (byte) 4), d5c.S(jiu0.a(this), dvjVar), yj1.h);
        sac.T(new fnq(kc60Var.a(), new vj1(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), ak1.h);
        fk80 fk80Var = new fk80(dguVar.o(((j8d0) D()).f16078a, iun.f15405a, kotlin.collections.a.c(String.valueOf(((j8d0) D()).b)), "", "", "", ((j8d0) D()).f != rj1.b ? (byte) 0 : (byte) 1, 16), jiu0.a(this), dvjVar);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, j8d0.a((j8d0) value, false, null, null, fk80Var, 2047)));
        sac.T(new fnq(fk80Var.g, new i8(2, this, bk1.class, "onPagingStateChange", "onPagingStateChange(Lorg/xplatform/aggregator/core/paging/presentation/PagingLoadState;)V", 4, (byte) 15), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new wa(this, yjeVar, (byte) 3));
        M();
    }

    public final void M() {
        sac.T(new fnq(this.s.o(), new vj1(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.v.b), wj1.h);
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void x(a8d0 a8d0Var) {
        Iterable iterable;
        Object next;
        Object next2;
        a8d0Var.getClass();
        final byte b = 0;
        if (a8d0Var.equals(y7d0.f42147a)) {
            fk80 fk80Var = ((j8d0) D()).k;
            if (fk80Var != null) {
                fk80Var.a(false);
                return;
            }
            return;
        }
        if (a8d0Var.equals(u7d0.f35180a)) {
            O();
            return;
        }
        if (a8d0Var.equals(z7d0.f43914a)) {
            O();
            return;
        }
        boolean z = a8d0Var instanceof x7d0;
        mne mneVar = this.v;
        if (z) {
            long j = ((x7d0) a8d0Var).f40409a;
            e8d0 e8d0Var = ((j8d0) D()).h;
            List list = e8d0Var instanceof b8d0 ? ((b8d0) e8d0Var).f2151a : iun.f15405a;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((mlr) next2).f22006a != j);
            mlr mlrVar = (mlr) next2;
            if (mlrVar == null) {
                return;
            }
            long j2 = mlrVar.c;
            int iIndexOf = list.indexOf(mlrVar);
            int iOrdinal = ((j8d0) D()).f.ordinal();
            u58 u58Var = this.w;
            if (iOrdinal != 0) {
                cyu cyuVar = this.B;
                if (iOrdinal != 1) {
                    int i = (int) mlrVar.f22006a;
                    int i2 = ((j8d0) D()).e;
                    Integer numValueOf = iIndexOf >= 0 ? Integer.valueOf(iIndexOf + 1) : null;
                    s1p s1pVar = (s1p) cyuVar.f5196a;
                    yni0 yni0Var = new yni0();
                    yni0Var.add(new i1p(i, (byte) 2));
                    yni0Var.add(new i1p(i2, (byte) 0));
                    if (numValueOf != null) {
                        yni0Var.add(new i1p(numValueOf.intValue(), (byte) 1));
                    }
                    yni0Var.add(new h1p(j2, (byte) 0));
                    yni0Var.add(new j1p("search_aggregator_providers", (byte) 0));
                    s1pVar.a(cui0.a(yni0Var), 3019L);
                } else {
                    long j3 = mlrVar.f22006a;
                    u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, j3, "menu_aggregator_providers", Integer.valueOf(((j8d0) D()).e), Long.valueOf(((j8d0) D()).b), iIndexOf >= 0 ? Integer.valueOf(iIndexOf + 1) : null, null, 32));
                    int i3 = (int) j3;
                    int i4 = ((j8d0) D()).e;
                    y1p y1pVar = y1p.MAIN;
                    this.x.a(i3, i4, iIndexOf >= 0 ? Integer.valueOf(iIndexOf + 1) : null, "menu_aggregator_providers", null);
                    int i5 = ((j8d0) D()).e;
                    Integer numValueOf2 = iIndexOf >= 0 ? Integer.valueOf(iIndexOf + 1) : null;
                    s1p s1pVar2 = (s1p) cyuVar.f5196a;
                    yni0 yni0Var2 = new yni0();
                    yni0Var2.add(new i1p(i3, (byte) 2));
                    yni0Var2.add(new i1p(i5, (byte) 0));
                    if (numValueOf2 != null) {
                        yni0Var2.add(new i1p(numValueOf2.intValue(), (byte) 1));
                    }
                    yni0Var2.add(new h1p(j2, (byte) 0));
                    yni0Var2.add(new j1p("menu_aggregator_providers", (byte) 0));
                    s1pVar2.a(cui0.a(yni0Var2), 3019L);
                }
            } else {
                u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, mlrVar.f22006a, "search_aggregator_providers", Integer.valueOf(((j8d0) D()).e), Long.valueOf(((j8d0) D()).b), iIndexOf >= 0 ? Integer.valueOf(iIndexOf + 1) : null, null, 32));
            }
            this.C = bww.R(jiu0.a(this), this.C, null, mneVar.f22085a, new Function1(this) { // from class: a.tj1
                public final /* synthetic */ bk1 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b2 = b;
                    bk1 bk1Var = this.b;
                    Throwable th = (Throwable) obj;
                    switch (b2) {
                        case 0:
                            th.getClass();
                            bk1Var.u.b(th, new xg1((byte) 2));
                            break;
                        default:
                            th.getClass();
                            boolean z2 = th instanceof jfp;
                            ctf0 ctf0Var = bk1Var.o;
                            if (z2) {
                                bk1Var.G(new h8d0(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                            } else {
                                bk1Var.G(new g8d0(jwb.G(th, ctf0Var)));
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, null, new l1(this, mlrVar, null, (byte) 26), 42);
            return;
        }
        yje yjeVar = null;
        if (a8d0Var instanceof w7d0) {
            w7d0 w7d0Var = (w7d0) a8d0Var;
            long j4 = w7d0Var.f38667a;
            boolean z2 = w7d0Var.b;
            if (((j8d0) D()).h instanceof b8d0) {
                e8d0 e8d0Var2 = ((j8d0) D()).h;
                e8d0Var2.getClass();
                iterable = ((b8d0) e8d0Var2).f2151a;
            } else {
                iterable = iun.f15405a;
            }
            Iterator it2 = iterable.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((mlr) next).f22006a != j4);
            mlr mlrVar2 = (mlr) next;
            if (mlrVar2 == null) {
                return;
            }
            final byte b2 = 1;
            sac.V(jiu0.a(this), new Function1(this) { // from class: a.tj1
                public final /* synthetic */ bk1 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    bk1 bk1Var = this.b;
                    Throwable th = (Throwable) obj;
                    switch (b3) {
                        case 0:
                            th.getClass();
                            bk1Var.u.b(th, new xg1((byte) 2));
                            break;
                        default:
                            th.getClass();
                            boolean z3 = th instanceof jfp;
                            ctf0 ctf0Var = bk1Var.o;
                            if (z3) {
                                bk1Var.G(new h8d0(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                            } else {
                                bk1Var.G(new g8d0(jwb.G(th, ctf0Var)));
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, null, mneVar.b, new xj1(z2, (Object) this, (Object) mlrVar2, yjeVar, (byte) 0), 10);
            return;
        }
        if (!a8d0Var.equals(v7d0.f36919a)) {
            boolean zEquals = a8d0Var.equals(s7d0.f31745a);
            j2j j2jVar = this.z;
            if (zEquals) {
                j2jVar.v();
                return;
            } else if (a8d0Var.equals(t7d0.f33461a)) {
                j2jVar.x();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0VarC = this.t.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void O() {
        fk80 fk80Var = ((j8d0) D()).k;
        if (fk80Var != null) {
            sac.V(fk80Var.b, new xj80(1, fk80Var, fk80.class, "setErrorState", "setErrorState(Ljava/lang/Throwable;)V", 0, (byte) 2), null, fk80Var.c, new c670(fk80Var, null, (byte) 8), 10);
        }
        M();
    }
}
