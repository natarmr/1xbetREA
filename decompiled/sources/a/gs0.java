package a;

import a.m1r;
import a.qi1;
import a.ufx;
import android.gov.nist.core.Separators;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class gs0 extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public final b5c A;
    public final fuu B;
    public final phf0 C;
    public bby D;
    public bby E;
    public bby F;
    public final long o;
    public final duj p;
    public final oeg0 q;
    public final ctf0 r;
    public final mne s;
    public final u58 t;
    public final ix0 u;
    public final irc v;
    public final prc w;
    public final xoc x;
    public final e1u y;
    public final hsj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(vzg0 vzg0Var, long j, duj dujVar, oeg0 oeg0Var, ctf0 ctf0Var, m1e m1eVar, mne mneVar, u58 u58Var, ix0 ix0Var, wyu wyuVar, irc ircVar, prc prcVar, uyu uyuVar, pru pruVar, bzt bztVar, xoc xocVar, e1u e1uVar, hsj hsjVar, b5c b5cVar, fuu fuuVar, phf0 phf0Var) {
        super(vzg0Var, new as0((Object) pruVar, (Object) bztVar, (Object) wyuVar, j, (byte) 0), cvm0.p(mneVar.c, mneVar.f22085a), new uc(ctf0Var, (byte) 4));
        oeg0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        this.o = j;
        this.p = dujVar;
        this.q = oeg0Var;
        this.r = ctf0Var;
        this.s = mneVar;
        this.t = u58Var;
        this.u = ix0Var;
        this.v = ircVar;
        this.w = prcVar;
        this.x = xocVar;
        this.y = e1uVar;
        this.z = hsjVar;
        this.A = b5cVar;
        this.B = fuuVar;
        this.C = phf0Var;
        yje yjeVar = null;
        byte b = 12;
        fnq fnqVar = new fnq(dtb.z(m1eVar.b(), 1), new pa(this, yjeVar, b), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        sac.T(fnqVar, d5c.S(bvcVarA, dvjVar), es0.h);
        sac.T(new fnq(dtb.z(uyuVar.f36509a.h(), 1), new qa(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), dvjVar), fs0.h);
    }

    public final j4b M(x2q x2qVar, List list) {
        Object next;
        String str = x2qVar.f40181a;
        List list2 = x2qVar.d;
        if (Intrinsics.d(str, "dopInfo2")) {
            if (list2 != null && list2.isEmpty()) {
                x2qVar = x2q.a(x2qVar, CollectionsKt.r0(list2, new o3q("0", this.r.b.a(R.string.all, Arrays.copyOf(new Object[0], 0)))));
                break;
            }
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    x2qVar = x2q.a(x2qVar, CollectionsKt.r0(list2, new o3q("0", this.r.b.a(R.string.all, Arrays.copyOf(new Object[0], 0)))));
                    break;
                }
            } while (!Intrinsics.d(((l3q) it.next()).getId(), "0"));
        }
        String str2 = x2qVar.f40181a;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.d(((x2q) next).f40181a, str2));
        x2q x2qVar2 = (x2q) next;
        List list3 = x2qVar2 != null ? x2qVar2.d : null;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList.add(((l3q) it3.next()).getId());
        }
        Set setP0 = CollectionsKt.P0(arrayList);
        if (setP0.isEmpty()) {
            setP0 = Intrinsics.d(str2, "dopInfo2") ? cui0.b("0") : xun.f41520a;
        }
        return new j4b(x2qVar, setP0);
    }

    public final void N(boolean z) {
        bby bbyVar = this.D;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.D = sac.V(jiu0.a(this), new zr0(this, (byte) 1), null, this.s.b, new ds0(z, this, yjeVar, (byte) 0), 10);
    }

    public final void O(boolean z) {
        bby bbyVar = this.F;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.F = sac.V(jiu0.a(this), new zr0(this, (byte) 0), null, this.s.b, new ds0(z, this, yjeVar, (byte) 1), 10);
    }

    public final void P(boolean z) {
        bby bbyVar = this.E;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        byte b = 2;
        this.E = sac.V(jiu0.a(this), new zr0(this, b), null, this.s.b, new ds0(z, this, yjeVar, b), 10);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x020a A[LOOP:3: B:86:0x0201->B:88:0x020a, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.ArrayList] */
    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void x(bq0 bq0Var) {
        ?? arrayList;
        i1w0 i1w0VarC;
        ListIterator listIteratorP;
        paw pawVar;
        String str;
        x2q x2qVar;
        List list;
        x2q x2qVar2;
        Object value;
        bq0Var.getClass();
        super.x(bq0Var);
        if (bq0Var.equals(qp0.f29093a)) {
            E();
            return;
        }
        if (bq0Var.equals(rp0.f30863a)) {
            N(true);
            O(true);
            P(true);
            return;
        }
        if (bq0Var.equals(wp0.f39522a)) {
            R();
            return;
        }
        String str2 = null;
        Object obj = null;
        str2 = null;
        if (bq0Var.equals(zp0.f44738a)) {
            ur0 ur0Var = (ur0) D();
            ur0Var.getClass();
            rlk0 rlk0Var = ur0Var.c;
            nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
            if (nlk0Var == null) {
                return;
            }
            G(new tr0(nlk0Var.f23732a, nlk0Var.b));
            return;
        }
        if (bq0Var instanceof aq0) {
            String str3 = ((aq0) bq0Var).f1274a;
            ur0 ur0Var2 = (ur0) D();
            ur0Var2.getClass();
            rlk0 rlk0Var2 = ur0Var2.c;
            nlk0 nlk0Var2 = rlk0Var2 instanceof nlk0 ? (nlk0) rlk0Var2 : null;
            if (nlk0Var2 == null) {
                return;
            }
            for (Object obj2 : nlk0Var2.f23732a) {
                if (Intrinsics.d(((AggregatorSortingOptionModel) obj2).f46274a, str3)) {
                    obj = obj2;
                    break;
                }
            }
            AggregatorSortingOptionModel aggregatorSortingOptionModel = (AggregatorSortingOptionModel) obj;
            if (aggregatorSortingOptionModel == null) {
                return;
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, ur0.a((ur0) value, null, nlk0.a(nlk0Var2, aggregatorSortingOptionModel), null, null, 251)));
            return;
        }
        boolean z = bq0Var instanceof up0;
        byte b = 23;
        byte b2 = 0;
        ix0 ix0Var = this.u;
        if (z) {
            up0 up0Var = (up0) bq0Var;
            String str4 = up0Var.f36037a;
            long j = up0Var.b;
            u5d0 u5d0VarL = ffb0.L((ur0) D());
            if (u5d0VarL != null && (x2qVar2 = u5d0VarL.f35088a) != null) {
                str2 = x2qVar2.f40181a;
            }
            if (!Intrinsics.d(str4, str2)) {
                String strValueOf = String.valueOf(j);
                ix0Var.getClass();
                strValueOf.getClass();
                ix0Var.f15516a.a(cui0.b(new j1p(strValueOf, (byte) 0)), 3075L);
                H(new bs0(str4, j, b2));
                return;
            }
            if (j == -1) {
                R();
                return;
            }
            String strValueOf2 = String.valueOf(j);
            u5d0 u5d0VarL2 = ffb0.L((ur0) D());
            if (u5d0VarL2 == null) {
                return;
            }
            H(new mz7(u5d0VarL2, strValueOf2, b));
            return;
        }
        boolean zEquals = bq0Var.equals(sp0.f32567a);
        p0w0 p0w0Var = p0w0.f26173a;
        oeg0 oeg0Var = this.q;
        prc prcVar = this.w;
        if (zEquals) {
            u5d0 u5d0VarL3 = ffb0.L((ur0) D());
            if (u5d0VarL3 == null || (x2qVar = u5d0VarL3.f35088a) == null || (list = x2qVar.d) == null) {
                arrayList = iun.f15405a;
            } else {
                arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((l3q) it.next()).getId());
                }
            }
            ?? r11 = arrayList;
            u58 u58Var = this.t;
            u58Var.getClass();
            kt2 kt2Var = u58Var.f35083a;
            r11.getClass();
            i8i.D("provider_id", CollectionsKt.b0(r11, null, null, null, null, 63), kt2Var, "game_filter_aggregator_prov_choose");
            ix0Var.getClass();
            ix0Var.f15516a.a(cui0.b(new j1p(CollectionsKt.b0(r11, Separators.COMMA, null, null, null, 62), (byte) 0)), 3074L);
            long id = nw80.b.getId();
            long j2 = this.o;
            if (j2 != id) {
                str = j2 == nw80.f24223a.getId() ? "live_filters" : "slots_filters";
                S(false);
                this.A.f1996a.b.e = true;
                ((jr0) prcVar.b).b.c = null;
                i1w0VarC = oeg0Var.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0VarC.a((oe50) pawVar.next());
                    }
                }
            }
            i8i.D("screen", str, kt2Var, "game_page_filter_call");
            S(false);
            this.A.f1996a.b.e = true;
            ((jr0) prcVar.b).b.c = null;
            i1w0VarC = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC);
            listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0VarC, copyOnWriteArrayListQ2, 0);
            while (true) {
                pawVar = (paw) listIteratorP;
                if (pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            if (bq0Var.equals(xp0.f41245a)) {
                ((jr0) prcVar.b).b.c = null;
                H(new o00(this, (byte) 9));
                return;
            }
            if (!bq0Var.equals(tp0.f34308a)) {
                if (bq0Var.equals(yp0.f43008a)) {
                    if (((ur0) D()).b instanceof t5q) {
                        N(true);
                    }
                    if (((ur0) D()).c instanceof plk0) {
                        P(true);
                    }
                    if (((ur0) D()).d instanceof w5d0) {
                        O(true);
                        return;
                    }
                    return;
                }
                if (!(bq0Var instanceof vp0)) {
                    t9f.b();
                    return;
                }
                String str5 = ((vp0) bq0Var).f37789a;
                u5d0 u5d0VarL4 = ffb0.L((ur0) D());
                if (u5d0VarL4 == null) {
                    return;
                }
                H(new mz7(u5d0VarL4, str5, b));
                return;
            }
            ((jr0) prcVar.b).b.c = null;
            i1w0 i1w0VarC2 = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0VarC2);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0Var), i1w0VarC2, copyOnWriteArrayListQ3, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }

    public final void R() {
        S(true);
        this.u.f15516a.a(xun.f41520a, 3159L);
        u58 u58Var = this.t;
        u58Var.getClass();
        long id = nw80.f24223a.getId();
        final long j = this.o;
        if (j == id) {
            u58Var.f35083a.c("game_filter_aggregator_provider_call");
        }
        i1w0 i1w0VarC = this.q.c();
        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
        k0w0VarI.h(new FragmentScreen(j) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorProvidersScreen

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f46291a;

            {
                this.f46291a = j;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                qi1.P1.getClass();
                qi1 qi1Var = new qi1();
                qi1Var.M1.j(qi1Var, qi1.Q1[1], this.f46291a);
                return qi1Var;
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF45455a() {
                return ufx.C(this);
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            /* JADX INFO: renamed from: g */
            public final /* bridge */ boolean getB() {
                return true;
            }
        });
        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void S(boolean z) {
        AggregatorSortingOptionModel aggregatorSortingOptionModel;
        a4x a4xVar;
        AggregatorSortingOptionModel aggregatorSortingOptionModel2;
        ur0 ur0Var = (ur0) D();
        ur0Var.getClass();
        v5q v5qVar = ur0Var.b;
        x2q x2qVar = null;
        r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
        Iterable<j4b> iterable = r5qVar != null ? r5qVar.f29900a : null;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (j4b j4bVar : iterable) {
            x2q x2qVar2 = j4bVar.f15876a;
            List list = x2qVar2.d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (j4bVar.b.contains(((l3q) obj).getId())) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(x2q.a(x2qVar2, arrayList2));
        }
        u5d0 u5d0VarL = ffb0.L((ur0) D());
        List listK = q3d.k(u5d0VarL != null ? u5d0VarL.f35088a : null);
        ur0 ur0Var2 = (ur0) D();
        ur0Var2.getClass();
        rlk0 rlk0Var = ur0Var2.c;
        nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
        String str = (nlk0Var == null || (a4xVar = nlk0Var.f23732a) == null || (aggregatorSortingOptionModel2 = (AggregatorSortingOptionModel) CollectionsKt.firstOrNull(a4xVar)) == null) ? null : aggregatorSortingOptionModel2.b;
        if (nlk0Var != null && (aggregatorSortingOptionModel = nlk0Var.b) != null) {
            if (Intrinsics.d(aggregatorSortingOptionModel.b, str)) {
                aggregatorSortingOptionModel = null;
            }
            if (aggregatorSortingOptionModel != null) {
                x2qVar = new x2q("sorting", "sorting_name", w3q.d, kotlin.collections.a.c(new slk0(aggregatorSortingOptionModel.b, aggregatorSortingOptionModel.f46274a, aggregatorSortingOptionModel.c, aggregatorSortingOptionModel.d)));
            }
        }
        mi1 mi1Var = new mi1(this.o, CollectionsKt.q0(CollectionsKt.q0(arrayList, listK), q3d.k(x2qVar)));
        if (!z) {
            this.v.a(mi1Var);
            return;
        }
        xoc xocVar = this.x;
        xocVar.getClass();
        ap0 ap0Var = xocVar.f41210a.b;
        ap0Var.getClass();
        ap0Var.c = mi1Var;
    }
}
