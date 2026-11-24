package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.xplatform.swipex.impl.navigation.SwipexScreenFactoryImpl$getSwipexScreen$1;

/* JADX INFO: loaded from: classes6.dex */
public final class bvn0 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public final s31 A;
    public final e41 B;
    public final g9m0 C;
    public c4m0 D;
    public final vzg0 o;
    public final rrd p;
    public final mne q;
    public final ok50 r;
    public final mi9 s;
    public final svu t;
    public final yfu u;
    public final i1w0 v;
    public final dq00 w;
    public final kvu x;
    public final mxt y;
    public final mxt z;

    public bvn0(vzg0 vzg0Var, rrd rrdVar, mne mneVar, ok50 ok50Var, mi9 mi9Var, svu svuVar, yfu yfuVar, i1w0 i1w0Var, dq00 dq00Var, u3q u3qVar, g2v g2vVar, kvu kvuVar, mxt mxtVar, mxt mxtVar2, s31 s31Var, e41 e41Var, ctf0 ctf0Var, g9m0 g9m0Var) {
        Object value;
        gvn0 gvn0Var;
        ctf0Var.getClass();
        o0k0 o0k0Var = new o0k0((Object) vzg0Var, (Object) g2vVar, (byte) 21);
        h0j0 h0j0Var = new h0j0(ctf0Var, (byte) 10);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, o0k0Var, h0j0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = vzg0Var;
        this.p = rrdVar;
        this.q = mneVar;
        this.r = ok50Var;
        this.s = mi9Var;
        this.t = svuVar;
        this.u = yfuVar;
        this.v = i1w0Var;
        this.w = dq00Var;
        this.x = kvuVar;
        this.y = mxtVar;
        this.z = mxtVar2;
        this.A = s31Var;
        this.B = e41Var;
        this.C = g9m0Var;
        long j = u3qVar.f35010a;
        if (j != -1) {
            long j2 = u3qVar.b;
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                gvn0Var = (gvn0) value;
                this.f.getClass();
            } while (!p7m0Var.m(value, gvn0.a(gvn0Var, false, false, false, false, null, null, eui0.g(gvn0Var.g, cui0.b(new roo(j, j2))), 191)));
        }
        P();
        sac.R(jiu0.a(this), vun0.f38057a, null, rwjVar, new wun0(this, null, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0187 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182  */
    /* JADX WARN: Code duplicated, block: B:78:0x018d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0102 A[SYNTHETIC] */
    public final Object M(zje zjeVar) {
        xun0 xun0Var;
        List list;
        List list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        List list3;
        Iterator it;
        int i;
        boolean z2;
        List list4;
        Iterator it2;
        int i2;
        if (zjeVar instanceof xun0) {
            xun0Var = (xun0) zjeVar;
            int i3 = xun0Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xun0Var.m = i3 - Integer.MIN_VALUE;
            } else {
                xun0Var = new xun0(this, zjeVar);
            }
        } else {
            xun0Var = new xun0(this, zjeVar);
        }
        Object objL = xun0Var.k;
        wne wneVar = wne.f39444a;
        int i4 = xun0Var.m;
        if (i4 == 0) {
            z1x.P(objL);
            xun0Var.m = 1;
            objL = this.y.f22575a.l(xun0Var);
            if (objL != wneVar) {
            }
            return wneVar;
        }
        if (i4 == 1) {
            z1x.P(objL);
        } else {
            if (i4 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = xun0Var.j;
            list = xun0Var.i;
            z1x.P(objL);
        }
        arrayList = new ArrayList();
        for (Object obj : (Iterable) objL) {
            if (((hpn0) obj).f) {
                arrayList.add(obj);
            }
        }
        List listA0 = CollectionsKt.A0(CollectionsKt.A0(arrayList, new mjf0((byte) 26)), new mjf0((byte) 27));
        List list5 = ((gvn0) D()).f;
        arrayList2 = new ArrayList();
        for (Object obj2 : list5) {
            if (((hpn0) obj2).f) {
                arrayList2.add(obj2);
            }
        }
        List listA1 = CollectionsKt.A0(CollectionsKt.A0(arrayList2, new mjf0((byte) 28)), new mjf0((byte) 29));
        if (Intrinsics.d(list2, list) || !Intrinsics.d(listA1, listA0)) {
            z = true;
        } else {
            z = false;
        }
        list3 = ((gvn0) D()).e;
        if (list3 == null && list3.isEmpty()) {
            i = 0;
        } else {
            it = list3.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((epn0) it.next()).f && (i = i + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
        }
        if (i < 1) {
            z2 = z;
        } else {
            list4 = ((gvn0) D()).f;
            if (list4 == null && list4.isEmpty()) {
                i2 = 0;
            } else {
                it2 = list4.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if (!((hpn0) it2.next()).f && (i2 = i2 + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
            if (i2 >= 1) {
                if (z) {
                }
            }
        }
        return Boolean.valueOf(z2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : (Iterable) objL) {
            if (((epn0) obj3).f) {
                arrayList3.add(obj3);
            }
        }
        List listA2 = CollectionsKt.A0(arrayList3, new mjf0((byte) 24));
        List list6 = ((gvn0) D()).e;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list6) {
            if (((epn0) obj4).f) {
                arrayList4.add(obj4);
            }
        }
        List listA3 = CollectionsKt.A0(arrayList4, new mjf0((byte) 25));
        xun0Var.i = listA2;
        xun0Var.j = listA3;
        xun0Var.m = 2;
        Object objV = this.x.f18971a.v(xun0Var);
        if (objV != wneVar) {
            list = listA2;
            objL = objV;
            list2 = listA3;
            arrayList = new ArrayList();
            while (r10.hasNext()) {
                if (((hpn0) obj).f) {
                    arrayList.add(obj);
                }
            }
            List listA4 = CollectionsKt.A0(CollectionsKt.A0(arrayList, new mjf0((byte) 26)), new mjf0((byte) 27));
            List list7 = ((gvn0) D()).f;
            arrayList2 = new ArrayList();
            while (r2.hasNext()) {
                if (((hpn0) obj2).f) {
                    arrayList2.add(obj2);
                }
            }
            List listA5 = CollectionsKt.A0(CollectionsKt.A0(arrayList2, new mjf0((byte) 28)), new mjf0((byte) 29));
            if (Intrinsics.d(list2, list)) {
                z = true;
            } else {
                z = true;
            }
            list3 = ((gvn0) D()).e;
            if (list3 == null) {
                it = list3.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((epn0) it.next()).f) {
                    }
                }
            } else {
                it = list3.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((epn0) it.next()).f) {
                    }
                }
            }
            if (i < 1) {
                list4 = ((gvn0) D()).f;
                if (list4 == null) {
                    it2 = list4.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (!((hpn0) it2.next()).f) {
                        }
                    }
                } else {
                    it2 = list4.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (!((hpn0) it2.next()).f) {
                        }
                    }
                }
                if (i2 >= 1) {
                    if (z) {
                    }
                }
            } else if (z) {
            }
            return Boolean.valueOf(z2);
        }
        return wneVar;
    }

    public final ArrayList N() {
        List list = ((gvn0) D()).e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((epn0) obj).f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ArrayList O() {
        List list = ((gvn0) D()).f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((hpn0) obj).f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void P() {
        Object value;
        if (!((gvn0) D()).f11984a) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, gvn0.a((gvn0) value, false, true, false, false, null, null, null, 253)));
        }
        v3c.N(this.D);
        this.D = sac.R(jiu0.a(this), new ttn0(this, (byte) 2), new jfm0(this, (byte) 19), this.q.b, new wbl0(this, null, (byte) 3));
    }

    public final void Q() {
        List listL0 = CollectionsKt.L0(((gvn0) D()).e);
        rzg0 rzg0Var = rzg0.b;
        kiy kiyVarA = sre0.a(epn0.class);
        KTypeProjection.c.getClass();
        KTypeProjection kTypeProjectionA = piy.a(kiyVarA);
        tre0 tre0Var = sre0.f32672a;
        jiy jiyVarB0 = n6x.b0(tre0Var.k(tre0Var.b(List.class), Collections.singletonList(kTypeProjectionA), false));
        vzg0 vzg0Var = this.o;
        a8k0.J(vzg0Var, "CHAMPS_KEY", listL0, jiyVarB0, rzg0Var);
        a8k0.J(vzg0Var, "SPORTS_KEY", CollectionsKt.L0(((gvn0) D()).f), n6x.b0(tre0Var.k(tre0Var.b(List.class), Collections.singletonList(piy.a(sre0.a(hpn0.class))), false)), rzg0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(zje zjeVar) {
        yun0 yun0Var;
        Object value;
        if (zjeVar instanceof yun0) {
            yun0Var = (yun0) zjeVar;
            int i = yun0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yun0Var.k = i - Integer.MIN_VALUE;
            } else {
                yun0Var = new yun0(this, zjeVar);
            }
        } else {
            yun0Var = new yun0(this, zjeVar);
        }
        Object objJ = yun0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = yun0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objJ);
            yun0Var.k = 1;
            rrd rrdVar = this.p;
            rrdVar.getClass();
            objJ = d5c.J(yun0Var, new atj(rrdVar, yjeVar, (byte) 28));
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        int iOrdinal = ((o0o0) objJ).ordinal();
        if (iOrdinal == 0) {
            G(x6t0.f40381a);
        } else if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, gvn0.a((gvn0) value, true, false, false, false, null, null, null, 254)));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S(zje zjeVar) {
        zun0 zun0Var;
        Object value;
        if (zjeVar instanceof zun0) {
            zun0Var = (zun0) zjeVar;
            int i = zun0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zun0Var.k = i - Integer.MIN_VALUE;
            } else {
                zun0Var = new zun0(this, zjeVar);
            }
        } else {
            zun0Var = new zun0(this, zjeVar);
        }
        Object objM = zun0Var.i;
        Object obj = wne.f39444a;
        int i2 = zun0Var.k;
        if (i2 == 0) {
            z1x.P(objM);
            zun0Var.k = 1;
            objM = M(zun0Var);
            if (objM == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objM);
        }
        boolean zBooleanValue = ((Boolean) objM).booleanValue();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, gvn0.a((gvn0) value, false, false, false, zBooleanValue, null, null, null, 247)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object T(zje zjeVar) {
        avn0 avn0Var;
        Object value;
        gvn0 gvn0Var;
        Object value2;
        if (zjeVar instanceof avn0) {
            avn0Var = (avn0) zjeVar;
            int i = avn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                avn0Var.k = i - Integer.MIN_VALUE;
            } else {
                avn0Var = new avn0(this, zjeVar);
            }
        } else {
            avn0Var = new avn0(this, zjeVar);
        }
        Object obj = avn0Var.i;
        Object obj2 = wne.f39444a;
        int i2 = avn0Var.k;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (i2 == 0) {
            z1x.P(obj);
            List listD0 = CollectionsKt.D0(((gvn0) D()).f, 3);
            ArrayList<hpn0> arrayList = new ArrayList(r3d.q(listD0, 10));
            Iterator it = listD0.iterator();
            while (it.hasNext()) {
                arrayList.add(hpn0.a((hpn0) it.next(), true));
            }
            for (hpn0 hpn0Var : arrayList) {
                H(new uun0(hpn0Var.f13452a, hpn0Var.f, hpn0Var.c));
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                gvn0Var = (gvn0) value;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, gvn0.a(gvn0Var, false, false, false, false, null, CollectionsKt.q0(arrayList, CollectionsKt.O(gvn0Var.f, 3)), null, 223)));
            List list = ((gvn0) D()).e;
            mi9 mi9Var = this.s;
            mi9Var.getClass();
            list.getClass();
            mi9Var.f21833a.a(list);
            List list2 = ((gvn0) D()).f;
            ok50 ok50Var = this.r;
            ok50Var.getClass();
            list2.getClass();
            ((z220) ok50Var.f25390a).b(list2);
            ArrayList arrayListO = O();
            ArrayList arrayListN = N();
            avn0Var.k = 1;
            dq00 dq00Var = this.w;
            Object objD0 = qjj.d0(((mne) dq00Var.c).b, new qkb0(dq00Var, arrayListN, arrayListO, null, (byte) 10), avn0Var);
            if (objD0 != wne.f39444a) {
                objD0 = Unit.f46060a;
            }
            if (objD0 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value2, gvn0.a((gvn0) value2, false, false, true, false, null, null, null, 251)));
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ovn0 ovn0Var = (ovn0) obj;
        ovn0Var.getClass();
        super.x(ovn0Var);
        if (!(ovn0Var instanceof hvn0)) {
            boolean z = ovn0Var instanceof jvn0;
            yje yjeVar = null;
            mne mneVar = this.q;
            if (z) {
                sac.R(jiu0.a(this), new rgn0((byte) 13), null, mneVar.b, new agn0((Object) this, yjeVar, (byte) 19));
                return;
            }
            if (ovn0Var instanceof lvn0) {
                sac.R(jiu0.a(this), new rgn0((byte) 14), null, mneVar.f22085a, new lcl0(this, ((lvn0) ovn0Var).f20723a, yjeVar, (byte) 10));
                return;
            }
            if (ovn0Var instanceof mvn0) {
                t3q t3qVar = ((mvn0) ovn0Var).f22466a;
                H(new k87((byte) 1, t3qVar.f33281a, t3qVar.d));
                Set set = ((gvn0) D()).g;
                rzg0 rzg0Var = rzg0.b;
                kiy kiyVarA = sre0.a(roo.class);
                KTypeProjection.c.getClass();
                KTypeProjection kTypeProjectionA = piy.a(kiyVarA);
                tre0 tre0Var = sre0.f32672a;
                jiy jiyVarB0 = n6x.b0(tre0Var.k(tre0Var.b(Set.class), Collections.singletonList(kTypeProjectionA), false));
                a8k0.J(this.o, "EXPANDED_IDS_KEY", set, jiyVarB0, rzg0Var);
                return;
            }
            if (ovn0Var instanceof kvn0) {
                sac.R(jiu0.a(this), new rgn0((byte) 15), null, mneVar.f22085a, new lcl0(this, ((kvn0) ovn0Var).f18964a, yjeVar, (byte) 9));
                return;
            } else if (ovn0Var instanceof ivn0) {
                sac.R(jiu0.a(this), new rgn0((byte) 12), null, mneVar.f22085a, new wun0(this, yjeVar, (byte) 1));
                return;
            } else if (ovn0Var instanceof nvn0) {
                P();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!((gvn0) D()).c) {
            return;
        }
        i1w0 i1w0Var = this.v;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.C.getClass();
        k0w0VarI.c(new SwipexScreenFactoryImpl$getSwipexScreen$1());
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
