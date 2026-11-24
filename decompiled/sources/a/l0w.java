package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class l0w extends i3t0 {
    public final HistoryTypeModel o;
    public final f8w p;
    public final ugf0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0w(HistoryTypeModel historyTypeModel, f8w f8wVar, mne mneVar, pru pruVar, ctf0 ctf0Var, hnu hnuVar, ugf0 ugf0Var) {
        super(null, new mr0(pruVar, hnuVar, historyTypeModel, f8wVar, (byte) 16), new bcn(ctf0Var, (byte) 21), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = historyTypeModel;
        this.p = f8wVar;
        this.q = ugf0Var;
        M();
    }

    public final void M() {
        boolean z;
        boolean z2;
        Object value;
        unm0 unm0Var;
        if (this.o != HistoryTypeModel.AGGREGATOR) {
            return;
        }
        List listD0 = CollectionsKt.D0(((unm0) D()).f35971a, 2);
        if (listD0 != null && listD0.isEmpty()) {
            z = true;
            break;
        }
        Iterator it = listD0.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!((h0w) it.next()).b) {
                z = false;
                break;
            }
        }
        List listE0 = CollectionsKt.E0(2, ((unm0) D()).f35971a);
        if (listE0 != null && listE0.isEmpty()) {
            z2 = true;
            break;
        }
        Iterator it2 = listE0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = true;
                break;
            } else if (!((h0w) it2.next()).b) {
                z2 = false;
                break;
            }
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            unm0Var = (unm0) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, unm0.a(unm0Var, null, false, (z && z2) ? false : true, false, false, false, 247)));
    }

    public final ArrayList N(boolean z) {
        List list = ((unm0) D()).f35971a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h0w.a((h0w) it.next(), z));
        }
        return arrayList;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        boolean z;
        Object value;
        boolean z2;
        boolean z3;
        Object value2;
        Object value3;
        boolean z4;
        boolean z5;
        Object value4;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object value5;
        unm0 unm0Var;
        Object value6;
        a0w a0wVar = (a0w) obj;
        a0wVar.getClass();
        super.x(a0wVar);
        boolean z10 = a0wVar instanceof yzv;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        HistoryTypeModel historyTypeModel = this.o;
        if (z10) {
            jvw jvwVar = ((yzv) a0wVar).f43534a;
            List<h0w> list = ((unm0) D()).f35971a;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (h0w h0wVarA : list) {
                if (Intrinsics.d(h0wVarA.f12253a, jvwVar)) {
                    h0wVarA = h0w.a(h0wVarA, !h0wVarA.b);
                }
                arrayList.add(h0wVarA);
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value6 = p7m0Var.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value6, unm0.a((unm0) value6, arrayList, false, false, false, false, false, 254)));
        } else if (a0wVar.equals(xzv.f41772a)) {
            if (((unm0) D()).f35971a.equals(((unm0) D()).b)) {
                G(b0w.f1779a);
            } else {
                this.q.f0(((unm0) D()).f35971a, historyTypeModel, this.p);
                G(c0w.f3543a);
            }
        } else if (a0wVar.equals(wzv.f40037a)) {
            List list2 = ((unm0) D()).b;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(h0w.a((h0w) it.next(), true));
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, unm0.a((unm0) value3, arrayList2, false, false, false, true, true, 158)));
        } else if (a0wVar instanceof zzv) {
            ato0 ato0Var = ((zzv) a0wVar).f45273a;
            if (ato0Var instanceof xso0) {
                List list3 = ((unm0) D()).f35971a;
                if (list3.isEmpty()) {
                    z3 = true;
                    break;
                }
                Iterator it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((h0w) it2.next()).b) {
                            z3 = false;
                            break;
                        }
                    } else {
                        z3 = true;
                        break;
                    }
                }
                boolean z11 = !z3;
                ArrayList arrayListN = !z3 ? N(true) : N(false);
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value2, unm0.a((unm0) value2, arrayListN, z11, false, z11, false, false, 234)));
            } else if (ato0Var instanceof yso0) {
                List listE0 = CollectionsKt.E0(2, ((unm0) D()).f35971a);
                if (listE0 != null && listE0.isEmpty()) {
                    z2 = true;
                    break;
                }
                Iterator it3 = listE0.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (!((h0w) it3.next()).b) {
                            z2 = false;
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                boolean z12 = !z2;
                List listD0 = CollectionsKt.D0(((unm0) D()).f35971a, 2);
                ArrayList arrayList3 = new ArrayList(r3d.q(listE0, 10));
                Iterator it4 = listE0.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(h0w.a((h0w) it4.next(), z12));
                }
                ArrayList arrayListQ0 = CollectionsKt.q0(listD0, arrayList3);
                p7m0 p7m0Var4 = ocjVar.f25029a;
                while (true) {
                    Object value7 = p7m0Var4.getValue();
                    value7.getClass();
                    oyg0Var.getClass();
                    boolean z13 = z12;
                    if (p7m0Var4.m(value7, unm0.a((unm0) value7, arrayListQ0, false, false, false, false, z13, 190))) {
                        break;
                    } else {
                        z12 = z13;
                    }
                }
            } else {
                if (!(ato0Var instanceof zso0)) {
                    t9f.b();
                    return;
                }
                List listD1 = CollectionsKt.D0(((unm0) D()).f35971a, 2);
                if (listD1 != null && listD1.isEmpty()) {
                    z = true;
                    break;
                }
                Iterator it5 = listD1.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        if (!((h0w) it5.next()).b) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                boolean z14 = !z;
                ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                Iterator it6 = listD1.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(h0w.a((h0w) it6.next(), z14));
                }
                ArrayList arrayListQ1 = CollectionsKt.q0(arrayList4, CollectionsKt.E0(2, ((unm0) D()).f35971a));
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value, unm0.a((unm0) value, arrayListQ1, false, false, false, z14, false, 222)));
            }
        }
        if (k0w.f17488a[historyTypeModel.ordinal()] == 1) {
            List listD2 = CollectionsKt.D0(((unm0) D()).f35971a, 2);
            if (listD2 != null && listD2.isEmpty()) {
                z6 = false;
                break;
            }
            Iterator it7 = listD2.iterator();
            while (true) {
                if (it7.hasNext()) {
                    if (((h0w) it7.next()).b) {
                        z6 = true;
                        break;
                    }
                } else {
                    z6 = false;
                    break;
                }
            }
            List listD3 = CollectionsKt.D0(((unm0) D()).f35971a, 2);
            if (listD3 != null && listD3.isEmpty()) {
                z7 = true;
                break;
            }
            Iterator it8 = listD3.iterator();
            while (true) {
                if (it8.hasNext()) {
                    if (!((h0w) it8.next()).b) {
                        z7 = false;
                        break;
                    }
                } else {
                    z7 = true;
                    break;
                }
            }
            List listE1 = CollectionsKt.E0(2, ((unm0) D()).f35971a);
            if (listE1 != null && listE1.isEmpty()) {
                z8 = false;
                break;
            }
            Iterator it9 = listE1.iterator();
            while (true) {
                if (it9.hasNext()) {
                    if (((h0w) it9.next()).b) {
                        z8 = true;
                        break;
                    }
                } else {
                    z8 = false;
                    break;
                }
            }
            List listE2 = CollectionsKt.E0(2, ((unm0) D()).f35971a);
            if (listE2 != null && listE2.isEmpty()) {
                z9 = true;
                break;
            }
            Iterator it10 = listE2.iterator();
            while (true) {
                if (it10.hasNext()) {
                    if (!((h0w) it10.next()).b) {
                        z9 = false;
                        break;
                    }
                } else {
                    z9 = true;
                    break;
                }
            }
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value5 = p7m0Var6.getValue();
                value5.getClass();
                unm0Var = (unm0) value5;
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value5, unm0.a(unm0Var, null, z6 && z8, false, false, z7, z9, 155)));
        } else {
            List list4 = ((unm0) D()).f35971a;
            if (list4.isEmpty()) {
                z4 = false;
                break;
            }
            Iterator it11 = list4.iterator();
            while (true) {
                if (it11.hasNext()) {
                    if (((h0w) it11.next()).b) {
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            List list5 = ((unm0) D()).f35971a;
            if (list5.isEmpty()) {
                z5 = true;
                break;
            }
            Iterator it12 = list5.iterator();
            while (true) {
                if (it12.hasNext()) {
                    if (!((h0w) it12.next()).b) {
                        z5 = false;
                        break;
                    }
                } else {
                    z5 = true;
                    break;
                }
            }
            p7m0 p7m0Var7 = ocjVar.f25029a;
            do {
                value4 = p7m0Var7.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var7.m(value4, unm0.a((unm0) value4, null, z4, false, z5, false, false, 235)));
        }
        M();
    }
}
