package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class nj1 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public c4m0 A;
    public bby B;
    public bby C;
    public final qoj0 D;
    public final xoc o;
    public final uyu p;
    public final e1u q;
    public final oeg0 r;
    public final long s;
    public final mne t;
    public final duj u;
    public final m1e v;
    public final u58 w;
    public final au0 x;
    public final jut y;
    public fk80 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(vzg0 vzg0Var, xoc xocVar, uyu uyuVar, e1u e1uVar, wyu wyuVar, oeg0 oeg0Var, long j, mne mneVar, duj dujVar, m1e m1eVar, ctf0 ctf0Var, u58 u58Var, au0 au0Var, bzt bztVar, pru pruVar, jut jutVar, hgh0 hgh0Var) {
        Object value;
        xun xunVar;
        super(vzg0Var, new fj1((byte) 0, j, (Object) pruVar, (Object) hgh0Var, (Object) bztVar, (Object) wyuVar), cvm0.p(mneVar.c, mneVar.f22085a), new uc(ctf0Var, (byte) 12));
        wyuVar.getClass();
        oeg0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = xocVar;
        this.p = uyuVar;
        this.q = e1uVar;
        this.r = oeg0Var;
        this.s = j;
        this.t = mneVar;
        this.u = dujVar;
        this.v = m1eVar;
        this.w = u58Var;
        this.x = au0Var;
        this.y = jutVar;
        byte b = 0;
        yje yjeVar = null;
        this.D = roj0.b(0, 0, null, 7);
        ArrayList arrayList = (ArrayList) vzg0Var.a("SAVED_STATE_CHECKED_SET");
        byte b2 = 1;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((s5d0) it.next()).f31650a);
            }
            Set setP0 = CollectionsKt.P0(arrayList2);
            p7m0 p7m0Var = this.i.f25029a;
            while (true) {
                Object value2 = p7m0Var.getValue();
                value2.getClass();
                this.f.getClass();
                Set set = setP0;
                if (p7m0Var.m(value2, bj1.a((bj1) value2, null, CollectionsKt.P0(arrayList), set, null, false, null, null, false, 4083))) {
                    break;
                } else {
                    setP0 = set;
                }
            }
        } else {
            p7m0 p7m0Var2 = this.i.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                this.f.getClass();
                xunVar = xun.f41520a;
            } while (!p7m0Var2.m(value, bj1.a((bj1) value, null, xunVar, xunVar, null, false, null, null, false, 4083)));
            sac.V(jiu0.a(this), null, null, mneVar.b, new hj1(this, yjeVar, b2), 11);
        }
        sac.T(new fnq(dtb.z(new fnq(this.p.f36509a.h(), new gj1(this, yjeVar, b), (byte) 4), 1), new hj1(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.t.b), ij1.h);
        sac.T(new fnq(sj3.S(this.D, 200L), new gj1(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), this.t.b), mj1.h);
        sac.T(new fnq(dtb.z(this.v.b(), 1), new pa((Object) this, yjeVar, (byte) 16), (byte) 4), d5c.S(jiu0.a(this), this.t.b), lj1.h);
        N();
    }

    public final void M() {
        i1w0 i1w0VarC = this.r.c();
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

    public final void N() {
        c4m0 c4m0Var = this.A;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        fk80 fk80Var = this.z;
        if (fk80Var != null) {
            fk80Var.d();
        }
        k06 k06VarA = this.y.a(((bj1) D()).j, r7x.B(((bj1) D()).e), ((bj1) D()).i, ((bj1) D()).f, ((bj1) D()).l, false);
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.t;
        fk80 fk80Var2 = new fk80(k06VarA, bvcVarA, mneVar.b);
        this.A = sac.T(new fnq(fk80Var2.g, new i8(2, this, nj1.class, "onPagingStateChange", "onPagingStateChange(Lorg/xplatform/aggregator/core/paging/presentation/PagingLoadState;)V", 4, (byte) 14), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new gj1(this, yjeVar, (byte) 1));
        this.z = fk80Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        xun xunVar;
        Object next;
        Object value4;
        gi1 gi1Var = (gi1) obj;
        gi1Var.getClass();
        super.x(gi1Var);
        if (gi1Var instanceof uh1) {
            E();
            return;
        }
        boolean z = gi1Var instanceof wh1;
        byte b = 25;
        mne mneVar = this.t;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        au0 au0Var = this.x;
        u58 u58Var = this.w;
        if (z) {
            if (!((bj1) D()).g) {
                u58Var.f35083a.c("provbrand_filter_back");
                au0Var.f1455a.a(xun.f41520a, 10948L);
                M();
                return;
            } else {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value4, bj1.a((bj1) value4, null, null, null, null, false, null, null, false, 4031)));
                sac.V(jiu0.a(this), kj1.f18363a, null, mneVar.f22085a, new l1(this, "", objArr4 == true ? 1 : 0, b), 10);
                return;
            }
        }
        if (gi1Var instanceof yh1) {
            fk80 fk80Var = this.z;
            if (fk80Var != null) {
                fk80Var.a(false);
                return;
            }
            return;
        }
        if (gi1Var instanceof zh1) {
            zh1 zh1Var = (zh1) gi1Var;
            String str = zh1Var.f44369a;
            boolean z2 = zh1Var.b;
            iie iieVar = ((bj1) D()).f2682a;
            wge wgeVar = iieVar instanceof wge ? (wge) iieVar : null;
            List list = wgeVar != null ? wgeVar.f39112a : null;
            if (list == null) {
                list = iun.f15405a;
            }
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((s5d0) next).f31650a, str));
            s5d0 s5d0Var = (s5d0) next;
            if (s5d0Var == null) {
                return;
            }
            String str2 = s5d0Var.f31650a;
            LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(((bj1) D()).c);
            for (Object obj3 : linkedHashSetO0) {
                if (Intrinsics.d(((s5d0) obj3).f31650a, str)) {
                    obj2 = obj3;
                    break;
                }
            }
            s5d0 s5d0Var2 = (s5d0) obj2;
            if (s5d0Var2 != null) {
                linkedHashSetO0.remove(s5d0Var2);
            } else {
                linkedHashSetO0.add(s5d0Var);
            }
            LinkedHashSet linkedHashSetO1 = CollectionsKt.O0(((bj1) D()).d);
            if (linkedHashSetO1.contains(str)) {
                linkedHashSetO1.remove(str);
            } else {
                linkedHashSetO1.add(str);
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            while (true) {
                Object value5 = p7m0Var2.getValue();
                value5.getClass();
                oyg0Var.getClass();
                q7x.F(oyg0Var, new ArrayList(linkedHashSetO0), "SAVED_STATE_CHECKED_SET");
                LinkedHashSet linkedHashSet = linkedHashSetO1;
                if (p7m0Var2.m(value5, bj1.a((bj1) value5, null, linkedHashSetO0, linkedHashSet, null, false, null, null, false, 4083))) {
                    break;
                } else {
                    linkedHashSetO1 = linkedHashSet;
                }
            }
            if (z2) {
                u58Var.getClass();
                str2.getClass();
                u58Var.f35083a.a("provbrand_filter_off", wp20.b(new Pair("provider_id", str2)));
                Integer intOrNull = StringsKt.toIntOrNull(str2);
                b1j.r(intOrNull != null ? intOrNull.intValue() : 0, au0Var.f1455a, 10951L);
                return;
            }
            u58Var.getClass();
            str2.getClass();
            u58Var.f35083a.a("provbrand_filter_on", wp20.b(new Pair("provider_id", str2)));
            Integer intOrNull2 = StringsKt.toIntOrNull(str2);
            b1j.r(intOrNull2 != null ? intOrNull2.intValue() : 0, au0Var.f1455a, 10950L);
            return;
        }
        if (gi1Var instanceof bi1) {
            N();
            return;
        }
        if (gi1Var.equals(vh1.f37410a)) {
            this.B = bww.R(jiu0.a(this), this.B, null, mneVar.b, jj1.f16600a, null, new l1(this, objArr3 == true ? 1 : 0, (byte) 24), 42);
            return;
        }
        if (gi1Var.equals(ai1.f902a)) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
                xunVar = xun.f41520a;
            } while (!p7m0Var3.m(value3, bj1.a((bj1) value3, null, xunVar, xunVar, null, false, null, null, false, 4083)));
            u58Var.f35083a.c("provbrand_filter_off_all");
            au0Var.f1455a.a(xun.f41520a, 10952L);
            return;
        }
        if (gi1Var instanceof xh1) {
            G(yi1.f42664a);
            return;
        }
        if (gi1Var instanceof ci1) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, bj1.a((bj1) value2, null, null, null, null, true, null, null, false, 4031)));
            return;
        }
        if (gi1Var instanceof di1) {
            sac.V(jiu0.a(this), kj1.f18363a, null, mneVar.f22085a, new l1(this, ((di1) gi1Var).f6118a, objArr2 == true ? 1 : 0, b), 10);
            return;
        }
        if (gi1Var instanceof ei1) {
            this.C = bww.R(jiu0.a(this), this.C, null, null, null, null, new hj1(this, objArr == true ? 1 : 0, (byte) 2), 62);
            return;
        }
        if (!(gi1Var instanceof fi1)) {
            t9f.b();
            return;
        }
        uzb0 uzb0Var = ((fi1) gi1Var).f9565a;
        if (((bj1) D()).e != uzb0Var) {
            String strA = r7x.A(uzb0Var);
            u58Var.getClass();
            u58Var.f35083a.a("provbrand_filter_sort", wp20.b(new Pair("option", strA)));
            String strA2 = r7x.A(uzb0Var);
            au0Var.getClass();
            au0Var.f1455a.a(cui0.b(new j1p(strA2, (byte) 0)), 10949L);
            int i = ((bj1) D()).e != uzb0Var ? 1 : 0;
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value = p7m0Var5.getValue();
                value.getClass();
                oyg0Var.getClass();
                q7x.F(oyg0Var, uzb0Var, "SAVED_STATE_LAST_SORT_TYPE");
            } while (!p7m0Var5.m(value, bj1.a((bj1) value, null, null, null, uzb0Var, false, null, null, false, 4079)));
            if (i != 0) {
                N();
            }
        }
    }
}
