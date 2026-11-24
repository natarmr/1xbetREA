package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h13 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12262a;
    public final Object b;
    public final Object c;

    public /* synthetic */ h13(Object obj, Object obj2, byte b) {
        this.f12262a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        ArrayList arrayList;
        Pair pair;
        long j2;
        pu90 pu90VarS;
        oyq0 state;
        byte b = this.f12262a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((rmb0) obj).setParentLayoutDirection((k6z) obj2);
                return vj30.x(vj30Var, 0, 0, new sy2((byte) 5));
            case 1:
                long j3 = j;
                list.getClass();
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new er90((byte) 10));
                }
                if (((Function2) obj) == null && ((Function2) obj2) == null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        pj30 pj30Var = (pj30) list.get(i);
                        if (Intrinsics.d(mrv.i0(pj30Var), "LOGO")) {
                            pu90 pu90VarS2 = pj30Var.S(j3);
                            return vj30.x(vj30Var, pu90VarS2.f27604a, pu90VarS2.b, new cam(pu90VarS2, (byte) 20));
                        }
                    }
                    qf00.b("Collection contains no element matching the predicate.");
                    csj.b();
                } else {
                    int size2 = list.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        pj30 pj30Var2 = (pj30) list.get(i2);
                        if (Intrinsics.d(mrv.i0(pj30Var2), "LOGO")) {
                            pu90 pu90VarS3 = pj30Var2.S(j3);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                if (!Intrinsics.d(mrv.i0((pj30) obj3), "LOGO")) {
                                    arrayList2.add(obj3);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(arrayList2.size());
                            int size3 = arrayList2.size();
                            int iE = 0;
                            while (iE < size3) {
                                iE = w6x.e((pj30) arrayList2.get(iE), j, arrayList3, iE, 1);
                            }
                            Iterator it = CollectionsKt.r0(arrayList3, pu90VarS3).iterator();
                            if (it.hasNext()) {
                                int i3 = ((pu90) it.next()).f27604a;
                                while (it.hasNext()) {
                                    int i4 = ((pu90) it.next()).f27604a;
                                    if (i3 < i4) {
                                        i3 = i4;
                                    }
                                }
                                Iterator it2 = CollectionsKt.r0(arrayList3, pu90VarS3).iterator();
                                if (it2.hasNext()) {
                                    int i5 = ((pu90) it2.next()).b;
                                    while (it2.hasNext()) {
                                        int i6 = ((pu90) it2.next()).b;
                                        if (i5 < i6) {
                                            i5 = i6;
                                        }
                                    }
                                    return vj30.x(vj30Var, i3, i5, new ka70(pu90VarS3, arrayList3, (byte) 23));
                                }
                                itt0.a();
                            } else {
                                itt0.a();
                            }
                        } else {
                            i2++;
                            j3 = j;
                        }
                    }
                    qf00.b("Collection contains no element matching the predicate.");
                    csj.b();
                }
                return null;
            case 2:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    Object obj4 = list.get(i7);
                    if (!(((pj30) obj4).n() instanceof p9q0)) {
                        arrayList4.add(obj4);
                    }
                }
                List list2 = (List) ((Function0) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList5 = new ArrayList(list2.size());
                    int size5 = list2.size();
                    int i8 = 0;
                    while (i8 < size5) {
                        jge0 jge0Var = (jge0) list2.get(i8);
                        if (jge0Var != null) {
                            float f = jge0Var.b;
                            float f2 = jge0Var.f16474a;
                            pair = new Pair(((pj30) arrayList4.get(i8)).S(r4e.b(0, (int) Math.floor(jge0Var.c - f2), 0, (int) Math.floor(jge0Var.d - f), 5)), new ikx((((long) Math.round(f2)) << 32) | (((long) Math.round(f)) & 4294967295L)));
                        } else {
                            pair = null;
                        }
                        if (pair != null) {
                            arrayList5.add(pair);
                        }
                        i8++;
                        size5 = size5;
                        obj = obj;
                        list2 = list2;
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                Object obj5 = obj;
                ArrayList arrayList6 = new ArrayList(list.size());
                int size6 = list.size();
                for (int i9 = 0; i9 < size6; i9++) {
                    Object obj6 = list.get(i9);
                    if (((pj30) obj6).n() instanceof p9q0) {
                        arrayList6.add(obj6);
                    }
                }
                return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new wvv(arrayList, aad.V(arrayList6, (Function0) obj5), (byte) 1));
            default:
                list.getClass();
                pj30 pj30Var3 = (pj30) CollectionsKt.firstOrNull(list);
                if (pj30Var3 != null) {
                    j2 = j;
                    pu90VarS = pj30Var3.S(p4e.b(j, 0, 0, 0, 0, 14));
                } else {
                    j2 = j;
                    pu90VarS = null;
                }
                ((agk0) obj2).m((pu90VarS != null ? pu90VarS.b : 0.0f) * (-1.0f));
                nyq0 nyq0Var = (nyq0) obj;
                float fL = (nyq0Var == null || (state = nyq0Var.getState()) == null) ? 0.0f : state.c.l();
                int iB = si30.b((pu90VarS != null ? pu90VarS.b : 0.0f) + fL);
                return vj30.x(vj30Var, p4e.i(j2), iB < 0 ? 0 : iB, new j3d(pu90VarS, fL, (byte) 2));
        }
    }
}
