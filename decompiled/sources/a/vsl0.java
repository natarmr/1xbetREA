package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xplatform.feed.navigation.SportFilterScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class vsl0 extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public final f4u A;
    public final jtj B;
    public final b4j C;
    public final je D;
    public bby E;
    public final vzg0 o;
    public final SportFilterScreenParams p;
    public final mne q;
    public final duj r;
    public final i1w0 s;
    public final s31 t;
    public final cyu u;
    public final vqc v;
    public final eyg0 w;
    public final ani0 x;
    public final hsj y;
    public final vjp z;

    /* JADX WARN: Illegal instructions before constructor call */
    public vsl0(vzg0 vzg0Var, SportFilterScreenParams sportFilterScreenParams, mne mneVar, duj dujVar, i1w0 i1w0Var, s31 s31Var, cyu cyuVar, vqc vqcVar, eyg0 eyg0Var, ani0 ani0Var, hsj hsjVar, vjp vjpVar, f4u f4uVar, jtj jtjVar, ctf0 ctf0Var, b4j b4jVar, je jeVar, g2v g2vVar) {
        ctf0Var.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, new o0k0((Object) vzg0Var, (Object) vjpVar, (byte) 12), new o20(g2vVar, ctf0Var, (byte) 26), cvm0.p(vs10Var, rwjVar), null);
        this.o = vzg0Var;
        this.p = sportFilterScreenParams;
        this.q = mneVar;
        this.r = dujVar;
        this.s = i1w0Var;
        this.t = s31Var;
        this.u = cyuVar;
        this.v = vqcVar;
        this.w = eyg0Var;
        this.x = ani0Var;
        this.y = hsjVar;
        this.z = vjpVar;
        this.A = f4uVar;
        this.B = jtjVar;
        this.C = b4jVar;
        this.D = jeVar;
        sac.V(jiu0.a(this), new kcl0(1, this, vsl0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, rwjVar, new wbl0(this, null, (byte) 1), 10);
        N(((lsl0) D()).e);
    }

    public final long[] M() {
        return (long[]) this.o.a("SAVED_STATE_CHECKED_SPORT_IDS_LIST");
    }

    public final void N(String str) {
        sac.V(jiu0.a(this), new kcl0(1, this, vsl0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, this.q.f22085a, new wbl0(this, str, null, (byte) 2), 10);
    }

    public final void O(j1i0 j1i0Var, List list) {
        String strV0 = kpb.v0(this.p.f46674a);
        String str = j1i0Var.f15736a;
        this.C.r(strV0, list, str, null);
        this.D.q(strV0, list, str, null);
    }

    public final void P() {
        bby bbyVar = this.E;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.E = sac.V(jiu0.a(this), new kcl0(1, this, vsl0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, null, new tmg0(this, null, (byte) 21), 14);
        }
    }

    public final void Q() {
        if (((lsl0) D()).k.isEmpty()) {
            return;
        }
        long[] jArrM = M();
        List listF0 = jArrM != null ? tx3.f0(jArrM) : null;
        if (listF0 == null) {
            listF0 = iun.f15405a;
        }
        if (listF0.isEmpty()) {
            G(hsl0.f13591a);
            return;
        }
        eyg0 eyg0Var = this.w;
        eyg0Var.getClass();
        w5z w5zVar = (w5z) eyg0Var.b;
        n660 n660Var = (n660) w5zVar.b;
        n660Var.j();
        n660Var.b(listF0);
        List listL0 = CollectionsKt.L0((CopyOnWriteArrayList) n660Var.b);
        q7d0 q7d0Var = (q7d0) w5zVar.d;
        vby vbyVar = (vby) w5zVar.e;
        vbyVar.getClass();
        q7d0Var.g("SAVED_SPORTS_ID", vbyVar.d(new zw3(s710.f31729a, (byte) 0), listL0));
        List list = ((lsl0) D()).k;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((msl0) it.next()).f22327a));
        }
        ani0 ani0Var = this.x;
        ani0Var.getClass();
        ((q7d0) ((n660) ((w5z) ani0Var.f1155a).b).f22981a).g("SPORTS_POSITION", CollectionsKt.b0(arrayList, Separators.COMMA, null, null, new f8l0((byte) 2), 30));
        i1w0 i1w0Var = this.s;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:104:0x020a  */
    /* JADX WARN: Code duplicated, block: B:105:0x020c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0214  */
    /* JADX WARN: Code duplicated, block: B:115:0x024c A[LOOP:6: B:112:0x021f->B:115:0x024c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [a.diu0, a.i3t0, a.vsl0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        boolean z;
        long[] jArrM;
        int length;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        p7m0 p7m0Var;
        Object value2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object value3;
        Object value4;
        rrl0 rrl0Var = (rrl0) obj;
        rrl0Var.getClass();
        if (rrl0Var instanceof frl0) {
            P();
            return;
        }
        if (rrl0Var instanceof erl0) {
            P();
            return;
        }
        boolean z7 = rrl0Var instanceof orl0;
        cyu cyuVar = this.u;
        s31 s31Var = this.t;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        vzg0 vzg0Var = this.o;
        if (z7) {
            s31Var.g(wgh0.SPORT_DOMESTIC);
            cyuVar.C("sport_domestic");
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, lsl0.a((lsl0) value4, null, null, true, false, false, false, false, null, null, 8187)));
            vzg0Var.e("SAVED_STATE_SEARCH_EXPANDED", Boolean.TRUE);
            return;
        }
        if (rrl0Var instanceof irl0) {
            O(j1i0.CLEAR, iun.f15405a);
            G(gsl0.f11837a);
            return;
        }
        ?? arrayList5 = 0;
        if (rrl0Var instanceof crl0) {
            long[] jArrM2 = M();
            if (jArrM2 != null) {
                arrayList5 = new ArrayList(jArrM2.length);
                for (int iC = 0; iC < jArrM2.length; iC = w6x.c((int) jArrM2[iC], iC, 1, arrayList5)) {
                }
            }
            if (arrayList5 == 0) {
                arrayList5 = iun.f15405a;
            }
            O(j1i0.APPLY, arrayList5);
            Q();
            return;
        }
        if (rrl0Var instanceof hrl0) {
            String str = ((hrl0) rrl0Var).f13537a;
            vzg0Var.e("SAVED_STATE_SEARCH_QUERY", str);
            if (StringsKt.u0(str).toString().length() > 0) {
                s31Var.h(wgh0.SPORT_DOMESTIC, str, null);
                xgh0 xgh0Var = xgh0.UNKNOWN;
                cyuVar.D(null, "sport_domestic", str);
            }
            N(str);
            return;
        }
        if (rrl0Var instanceof qrl0) {
            qrl0 qrl0Var = (qrl0) rrl0Var;
            int i = qrl0Var.f29217a;
            int i2 = qrl0Var.b;
            if (i == i2 || !((lsl0) D()).g) {
                return;
            }
            ArrayList arrayListN0 = CollectionsKt.N0(((lsl0) D()).k);
            if (arrayListN0.size() > i && arrayListN0.size() > i2) {
                arrayListN0.add(i2, (msl0) arrayListN0.remove(i));
            }
            List listL0 = CollectionsKt.L0(arrayListN0);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, lsl0.a((lsl0) value3, null, null, false, false, false, false, false, listL0, listL0, 5119)));
            return;
        }
        if (rrl0Var instanceof krl0) {
            G(dsl0.f6617a);
            return;
        }
        if (rrl0Var instanceof lrl0) {
            O(j1i0.RESET, iun.f15405a);
            G(isl0.f15310a);
            return;
        }
        if (rrl0Var instanceof prl0) {
            msl0 msl0Var = ((prl0) rrl0Var).f27472a;
            long[] jArrM3 = M();
            if (jArrM3 == null) {
                jArrM3 = new long[0];
            }
            int i3 = this.z.f37540a.a().L.c;
            boolean z8 = msl0Var.c;
            long j = msl0Var.f22327a;
            if (z8) {
                ArrayList arrayList6 = new ArrayList();
                for (long j2 : jArrM3) {
                    if (j2 != j) {
                        arrayList6.add(Long.valueOf(j2));
                    }
                }
                vzg0Var.e("SAVED_STATE_CHECKED_SPORT_IDS_LIST", CollectionsKt.M0(arrayList6));
            } else {
                if (jArrM3.length < i3) {
                    int length2 = jArrM3.length;
                    long[] jArrCopyOf = Arrays.copyOf(jArrM3, length2 + 1);
                    jArrCopyOf[length2] = j;
                    vzg0Var.e("SAVED_STATE_CHECKED_SPORT_IDS_LIST", jArrCopyOf);
                    z = true;
                }
                jArrM = M();
                if (jArrM != null) {
                    length = jArrM.length;
                } else {
                    length = 0;
                }
                if (length < i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                List<msl0> list = ((lsl0) D()).k;
                arrayList = new ArrayList(r3d.q(list, 10));
                for (msl0 msl0Var2 : list) {
                    if (msl0Var2.f22327a == j) {
                        z5 = z;
                    } else {
                        z5 = msl0Var2.c;
                    }
                    if (!z5 || z2) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    arrayList.add(msl0.c(msl0Var2, z5, z6, null, 19));
                }
                List<msl0> list2 = ((lsl0) D()).l;
                arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (msl0 msl0Var3 : list2) {
                    if (msl0Var3.f22327a == j) {
                        z3 = z;
                    } else {
                        z3 = msl0Var3.c;
                    }
                    if (!z3 || z2) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    arrayList2.add(msl0.c(msl0Var3, z3, z4, null, 19));
                }
                p7m0Var = ocjVar.f25029a;
                while (true) {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    arrayList3 = arrayList2;
                    arrayList4 = arrayList;
                    if (p7m0Var.m(value2, lsl0.a((lsl0) value2, null, null, false, false, false, false, false, arrayList4, arrayList3, 5119))) {
                        return;
                    }
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                }
            }
            z = false;
            jArrM = M();
            if (jArrM != null) {
                length = jArrM.length;
            } else {
                length = 0;
            }
            if (length < i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            List<msl0> list3 = ((lsl0) D()).k;
            arrayList = new ArrayList(r3d.q(list3, 10));
            while (r3.hasNext()) {
                if (msl0Var2.f22327a == j) {
                    z5 = z;
                } else {
                    z5 = msl0Var2.c;
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                arrayList.add(msl0.c(msl0Var2, z5, z6, null, 19));
            }
            List<msl0> list4 = ((lsl0) D()).l;
            arrayList2 = new ArrayList(r3d.q(list4, 10));
            while (r2.hasNext()) {
                if (msl0Var3.f22327a == j) {
                    z3 = z;
                } else {
                    z3 = msl0Var3.c;
                }
                if (z3) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                arrayList2.add(msl0.c(msl0Var3, z3, z4, null, 19));
            }
            p7m0Var = ocjVar.f25029a;
            while (true) {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                if (p7m0Var.m(value2, lsl0.a((lsl0) value2, null, null, false, false, false, false, false, arrayList4, arrayList3, 5119))) {
                    return;
                }
                arrayList = arrayList4;
                arrayList2 = arrayList3;
            }
        } else if (rrl0Var instanceof grl0) {
            i1w0 i1w0Var = this.s;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!(rrl0Var instanceof jrl0)) {
                if (rrl0Var instanceof drl0) {
                    Q();
                    return;
                }
                if (rrl0Var instanceof mrl0) {
                    sac.V(jiu0.a(this), new kcl0(1, this, vsl0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, this.q.b, new see(this, null), 10);
                    return;
                }
                if (rrl0Var instanceof nrl0) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value = p7m0Var4.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value, lsl0.a((lsl0) value, null, null, false, false, false, false, false, null, null, 7935)));
                    return;
                }
                if (!(rrl0Var instanceof brl0)) {
                    if (rrl0Var instanceof arl0) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                List list5 = ((lsl0) D()).k;
                ArrayList arrayList7 = new ArrayList(r3d.q(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList7.add(Long.valueOf(((msl0) it.next()).f22327a));
                }
                vzg0Var.e("SAVED_STATE_ITEMS_ORDER_LIST", CollectionsKt.M0(arrayList7));
                return;
            }
            if (((lsl0) D()).k.isEmpty()) {
                return;
            }
            ((n660) ((w5z) this.v.b).b).j();
            List list6 = ((lsl0) D()).k;
            ArrayList arrayList8 = new ArrayList(r3d.q(list6, 10));
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                arrayList8.add(msl0.c((msl0) it2.next(), false, false, null, 19));
            }
            List list7 = ((lsl0) D()).l;
            ArrayList arrayList9 = new ArrayList(r3d.q(list7, 10));
            Iterator it3 = list7.iterator();
            while (it3.hasNext()) {
                arrayList9.add(msl0.c((msl0) it3.next(), false, false, null, 19));
            }
            p7m0 p7m0Var5 = ocjVar.f25029a;
            while (true) {
                Object value5 = p7m0Var5.getValue();
                value5.getClass();
                oyg0Var.getClass();
                ArrayList arrayList10 = arrayList8;
                ArrayList arrayList11 = arrayList9;
                if (p7m0Var5.m(value5, lsl0.a((lsl0) value5, null, null, false, false, false, false, false, arrayList10, arrayList11, 5119))) {
                    vzg0Var.e("SAVED_STATE_CHECKED_SPORT_IDS_LIST", new long[0]);
                    return;
                } else {
                    arrayList8 = arrayList10;
                    arrayList9 = arrayList11;
                }
            }
        }
    }
}
