package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class b61 extends w3k {
    public final p7m0 A;
    public c4m0 B;
    public final p7m0 C;
    public final vzg0 c;
    public final lr1 d;
    public final AggregatorScreenModel e;
    public final s91 f;
    public final oeg0 g;
    public final b4j h;
    public final ix0 i;
    public final hs60 j;
    public final ix0 k;
    public final je l;
    public final b4j m;
    public final m2c n;
    public final mne o;
    public final b8u p;
    public final duj q;
    public final xru r;
    public final nou s;
    public final kd30 t;
    public final j2j u;
    public final ba50 v;
    public long w;
    public boolean x;
    public final boolean y;
    public final ol60 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b61(vzg0 vzg0Var, lr1 lr1Var, AggregatorScreenModel aggregatorScreenModel, s91 s91Var, oeg0 oeg0Var, b4j b4jVar, ix0 ix0Var, hs60 hs60Var, ix0 ix0Var2, je jeVar, b4j b4jVar2, m2c m2cVar, kc60 kc60Var, mne mneVar, b8u b8uVar, duj dujVar, xru xruVar, nou nouVar, kd30 kd30Var, m1e m1eVar, j2j j2jVar, f3j f3jVar, bb6 bb6Var, ctf0 ctf0Var, pru pruVar, ba50 ba50Var) {
        pao0 pao0Var;
        lc00 lc00VarA;
        super(vzg0Var, q3d.j(j2jVar, f3jVar));
        dvj dvjVar = mneVar.b;
        lr1Var.getClass();
        s91Var.getClass();
        oeg0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        ba50Var.getClass();
        this.c = vzg0Var;
        this.d = lr1Var;
        this.e = aggregatorScreenModel;
        this.f = s91Var;
        this.g = oeg0Var;
        this.h = b4jVar;
        this.i = ix0Var;
        this.j = hs60Var;
        this.k = ix0Var2;
        this.l = jeVar;
        this.m = b4jVar2;
        this.n = m2cVar;
        this.o = mneVar;
        this.p = b8uVar;
        this.q = dujVar;
        this.r = xruVar;
        this.s = nouVar;
        this.t = kd30Var;
        this.u = j2jVar;
        this.v = ba50Var;
        this.x = true;
        sff0 sff0VarA = pruVar.a();
        hl1 hl1Var = sff0VarA.b;
        boolean z = hl1Var.C;
        this.y = z;
        f61 f61Var = hl1Var.f13233a;
        boolean z2 = f61Var.d;
        boolean z3 = f61Var.f;
        this.z = new ol60(3);
        boolean z4 = f61Var.d;
        boolean z5 = f61Var.f;
        int iOrdinal = sff0VarA.S0.ordinal();
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
        if (z) {
            lc00 lc00VarB = kotlin.collections.a.b();
            lsm0 lsm0Var = ctf0Var.b;
            int iA = bb6Var.a(lsm0Var.a(R.string.icon_virtual_tab_bar, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
            lc00VarB.add(new oao0("FAVORITES_TAB_TAG", lsm0Var.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_favourite_active, null, false, null));
            lc00VarB.add(new oao0("MY_VIRTUAL_TAB_TAG", lsm0Var.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_virtual, iA != 0 ? Integer.valueOf(iA) : null, true, null));
            lc00VarB.add(new oao0("AGGREGATOR_CATEGORIES_TAB_TAG", lsm0Var.a(R.string.categories, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_categories, null, false, null));
            lc00VarA = kotlin.collections.a.a(lc00VarB);
        } else {
            lc00 lc00VarB2 = kotlin.collections.a.b();
            lsm0 lsm0Var2 = ctf0Var.b;
            int iA2 = bb6Var.a(lsm0Var2.a(R.string.icon_aggregator_tab_bar, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
            oao0 oao0Var = new oao0("PROMO_TAB_TAG", lsm0Var2.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_promo_aggregator, null, false, null);
            oao0 oao0Var2 = new oao0("FAVORITES_AGGREGATOR_TAB_TAG", lsm0Var2.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_favourite_active, null, false, null);
            oao0 oao0Var3 = new oao0("MY_AGGREGATOR_TAB_TAG", lsm0Var2.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_cards, iA2 != 0 ? Integer.valueOf(iA2) : null, true, null);
            oao0 oao0Var4 = new oao0("PROVIDERS_AGGREGATOR_TAB_TAG", lsm0Var2.a(R.string.providers, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_providers, null, false, null);
            oao0 oao0Var5 = new oao0("AGGREGATOR_CATEGORIES_TAB_TAG", lsm0Var2.a(R.string.categories, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_categories, null, false, null);
            lc00VarB2.add(oao0Var2);
            lc00VarB2.add(oao0Var3);
            lc00VarB2.add(oao0Var5);
            if (z2) {
                lc00VarB2.add(0, oao0Var);
            }
            if (z3) {
                lc00VarB2.add(3, oao0Var4);
            }
            lc00VarA = kotlin.collections.a.a(lc00VarB2);
        }
        this.A = q7m0.a(new nao0(lc00VarA, z4, z5, pao0Var, z));
        this.C = q7m0.a(Boolean.TRUE);
        s91Var.c.clear();
        s91Var.e.n(ir1.c);
        yje yjeVar = null;
        sac.T(new fnq(dtb.z(new fnq(kc60Var.a(), new y51(this, null), (byte) 4), 1), new x51(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), dvjVar), z51.h);
        sac.T(new fnq(m1eVar.b(), new w51(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), dvjVar), a61.h);
        j2jVar.x();
        sac.V(jiu0.a(this), new m51(this, (byte) 2), null, mneVar.b, new w51(this, null, (byte) 2), 10);
    }

    public static void x(b61 b61Var, lr1 lr1Var, boolean z, AggregatorScreenModel aggregatorScreenModel, int i) {
        tm1 tm1Var;
        FragmentScreen fragmentScreenW;
        AggregatorScreenModel aggregatorScreenModel2 = (i & 4) != 0 ? new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511) : aggregatorScreenModel;
        boolean z2 = (i & 8) != 0 ? z : true;
        boolean z3 = (i & 16) != 0 ? z2 : false;
        b61Var.getClass();
        lr1Var.getClass();
        aggregatorScreenModel2.getClass();
        boolean zEquals = aggregatorScreenModel2.equals(new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511));
        s91 s91Var = b61Var.f;
        if (zEquals) {
            s91.d(s91Var, lr1Var, z2, z3, 2);
            return;
        }
        gx3 gx3Var = s91Var.c;
        rl1 rl1Var = s91Var.f31829a;
        tm1 tm1Var2 = aggregatorScreenModel2.d;
        if (Intrinsics.d(tm1Var2, gm1.f11520a)) {
            return;
        }
        ir1 ir1Var = ir1.c;
        if (lr1Var.equals(ir1Var)) {
            return;
        }
        boolean z4 = tm1Var2 instanceof lm1;
        ehf0 ehf0Var = s91Var.b;
        if (z4) {
            hr1 hr1Var = lr1Var instanceof hr1 ? (hr1) lr1Var : null;
            lm1 lm1Var = new lm1(hr1Var != null ? hr1Var.d : nw80.t.getId());
            String str = aggregatorScreenModel2.f46283a;
            String str2 = aggregatorScreenModel2.b;
            long j = aggregatorScreenModel2.c;
            wgh0 wgh0Var = aggregatorScreenModel2.e;
            long j2 = aggregatorScreenModel2.f;
            long j3 = aggregatorScreenModel2.g;
            String str3 = aggregatorScreenModel2.h;
            boolean z5 = aggregatorScreenModel2.i;
            str.getClass();
            str2.getClass();
            wgh0Var.getClass();
            str3.getClass();
            AggregatorScreenModel aggregatorScreenModel3 = new AggregatorScreenModel(str, str2, j, lm1Var, wgh0Var, j2, j3, str3, z5);
            tm1Var = tm1Var2;
            fragmentScreenW = ehf0Var.w(tm1Var, aggregatorScreenModel3, false);
        } else {
            tm1Var = tm1Var2;
            fragmentScreenW = ehf0Var.w(tm1Var, aggregatorScreenModel2, false);
        }
        boolean z6 = tm1Var instanceof sm1;
        boolean z7 = !(z6 && aggregatorScreenModel2.i) && (z6 || (tm1Var != null && (((tm1Var instanceof lm1) || (tm1Var instanceof hm1) || (tm1Var instanceof im1)) && Intrinsics.d(s91Var.e.getValue(), ir1Var) && gx3Var.isEmpty())));
        if (gx3Var.put(lr1Var.f20507a.name(), Boolean.TRUE) != null) {
            rl1Var.g(lr1Var);
            rl1Var.h(lr1Var, fragmentScreenW);
            return;
        }
        if (z7) {
            rl1Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (fragmentScreenW instanceof DialogScreen) {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenW)));
            } else {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenW)));
            }
            ListIterator listIterator = rl1Var.c().d(copyOnWriteArrayList).listIterator(0);
            while (true) {
                paw pawVar = (paw) listIterator;
                if (!pawVar.hasNext()) {
                    break;
                } else {
                    rl1Var.a((oe50) pawVar.next());
                }
            }
        } else {
            rl1Var.h(lr1Var, fragmentScreenW);
        }
        s91Var.e(lr1Var);
    }

    public final void w(boolean z) {
        if (z) {
            e9s0.f7438a.clear();
            uo0.f35987a.clear();
        }
        i1w0 i1w0VarC = this.g.c();
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

    public final void y() {
        sac.V(jiu0.a(this), new eo0((byte) 18), null, this.o.b, new w51(this, null, (byte) 1), 10);
    }
}
