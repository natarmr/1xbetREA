package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x4a0 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40256a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ x4a0(Function2 function2, byte b) {
        this.f40256a = b;
        this.b = function2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pu90 pu90VarS;
        byte b = this.f40256a;
        int i = 0;
        Function2 function2 = this.b;
        Integer num = null;
        list.getClass();
        switch (b) {
            case 0:
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new er90((byte) 11));
                }
                if (function2 == null) {
                    int size = list.size();
                    while (i < size) {
                        pj30 pj30Var = (pj30) list.get(i);
                        if (Intrinsics.d(mrv.i0(pj30Var), "LOGO")) {
                            pu90 pu90VarS2 = pj30Var.S(j);
                            return vj30.x(vj30Var, pu90VarS2.f27604a, pu90VarS2.b, new cam(pu90VarS2, (byte) 21));
                        }
                        i++;
                    }
                    qf00.b("Collection contains no element matching the predicate.");
                    csj.b();
                    return null;
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iE = 0;
                while (iE < size2) {
                    iE = w6x.e((pj30) list.get(iE), j, arrayList, iE, 1);
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i2 = ((pu90) it.next()).f27604a;
                while (it.hasNext()) {
                    int i3 = ((pu90) it.next()).f27604a;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i4 = ((pu90) it2.next()).b;
                while (it2.hasNext()) {
                    int i5 = ((pu90) it2.next()).b;
                    if (i4 < i5) {
                        i4 = i5;
                    }
                }
                return vj30.x(vj30Var, i2, i4, new uy2(arrayList, (byte) 9));
            case 1:
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new er90((byte) 12));
                }
                if (function2 == null) {
                    int size3 = list.size();
                    while (i < size3) {
                        pj30 pj30Var2 = (pj30) list.get(i);
                        if (Intrinsics.d(mrv.i0(pj30Var2), "LOGO")) {
                            pu90 pu90VarS3 = pj30Var2.S(j);
                            return vj30.x(vj30Var, pu90VarS3.f27604a, pu90VarS3.b, new cam(pu90VarS3, (byte) 22));
                        }
                        i++;
                    }
                    qf00.b("Collection contains no element matching the predicate.");
                    csj.b();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size4 = list.size();
                int iE2 = 0;
                while (iE2 < size4) {
                    iE2 = w6x.e((pj30) list.get(iE2), j, arrayList2, iE2, 1);
                }
                Iterator it3 = arrayList2.iterator();
                if (!it3.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i6 = ((pu90) it3.next()).f27604a;
                while (it3.hasNext()) {
                    int i7 = ((pu90) it3.next()).f27604a;
                    if (i6 < i7) {
                        i6 = i7;
                    }
                }
                Iterator it4 = arrayList2.iterator();
                if (!it4.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i8 = ((pu90) it4.next()).b;
                while (it4.hasNext()) {
                    int i9 = ((pu90) it4.next()).b;
                    if (i8 < i9) {
                        i8 = i9;
                    }
                }
                return vj30.x(vj30Var, i6, i8, new uy2(arrayList2, (byte) 10));
            case 2:
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new er90((byte) 13));
                }
                if (function2 == null) {
                    int size5 = list.size();
                    while (i < size5) {
                        pj30 pj30Var3 = (pj30) list.get(i);
                        if (Intrinsics.d(mrv.i0(pj30Var3), "LOGO")) {
                            pu90 pu90VarS4 = pj30Var3.S(j);
                            return vj30.x(vj30Var, pu90VarS4.f27604a, pu90VarS4.b, new cam(pu90VarS4, (byte) 23));
                        }
                        i++;
                    }
                    qf00.b("Collection contains no element matching the predicate.");
                    csj.b();
                    return null;
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                int size6 = list.size();
                int iE3 = 0;
                while (iE3 < size6) {
                    iE3 = w6x.e((pj30) list.get(iE3), j, arrayList3, iE3, 1);
                }
                Iterator it5 = arrayList3.iterator();
                if (!it5.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i10 = ((pu90) it5.next()).f27604a;
                while (it5.hasNext()) {
                    int i11 = ((pu90) it5.next()).f27604a;
                    if (i10 < i11) {
                        i10 = i11;
                    }
                }
                Iterator it6 = arrayList3.iterator();
                if (!it6.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i12 = ((pu90) it6.next()).b;
                while (it6.hasNext()) {
                    int i13 = ((pu90) it6.next()).b;
                    if (i12 < i13) {
                        i12 = i13;
                    }
                }
                return vj30.x(vj30Var, i10, i12, new uy2(arrayList3, (byte) 11));
            case 3:
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new er90((byte) 14));
                }
                if (function2 == null) {
                    int size7 = list.size();
                    while (i < size7) {
                        pj30 pj30Var4 = (pj30) list.get(i);
                        if (Intrinsics.d(mrv.i0(pj30Var4), "LOGO")) {
                            pu90 pu90VarS5 = pj30Var4.S(j);
                            return vj30.x(vj30Var, pu90VarS5.f27604a, pu90VarS5.b, new cam(pu90VarS5, (byte) 24));
                        }
                        i++;
                    }
                    qf00.b("Collection contains no element matching the predicate.");
                    csj.b();
                    return null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size8 = list.size();
                int iE4 = 0;
                while (iE4 < size8) {
                    iE4 = w6x.e((pj30) list.get(iE4), j, arrayList4, iE4, 1);
                }
                Iterator it7 = arrayList4.iterator();
                if (!it7.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i14 = ((pu90) it7.next()).f27604a;
                while (it7.hasNext()) {
                    int i15 = ((pu90) it7.next()).f27604a;
                    if (i14 < i15) {
                        i14 = i15;
                    }
                }
                Iterator it8 = arrayList4.iterator();
                if (!it8.hasNext()) {
                    itt0.a();
                    return null;
                }
                int i16 = ((pu90) it8.next()).b;
                while (it8.hasNext()) {
                    int i17 = ((pu90) it8.next()).b;
                    if (i16 < i17) {
                        i16 = i17;
                    }
                }
                return vj30.x(vj30Var, i14, i16, new uy2(arrayList4, (byte) 12));
            default:
                ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    pj30 pj30Var5 = (pj30) it9.next();
                    if (pj30Var5.n() instanceof w0v0) {
                        pu90VarS = pj30Var5.S(p4e.a(0, p4e.i(j), 0, p4e.h(j)));
                    } else {
                        int i18 = p4e.i(j);
                        if (i18 < 0) {
                            zcx.a("width must be >= 0");
                        }
                        pu90VarS = pj30Var5.S(r4e.h(i18, i18, 0, Integer.MAX_VALUE));
                    }
                    arrayList5.add(pu90VarS);
                }
                List listO = function2 != null ? CollectionsKt.O(arrayList5, 1) : arrayList5;
                Iterator it10 = listO.iterator();
                if (it10.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((pu90) it10.next()).f27604a);
                    while (true) {
                        num = numValueOf;
                        while (true) {
                            if (it10.hasNext()) {
                                numValueOf = Integer.valueOf(((pu90) it10.next()).f27604a);
                                if (num.compareTo(numValueOf) < 0) {
                                }
                            }
                        }
                    }
                }
                int iIntValue = num != null ? num.intValue() : 0;
                Iterator it11 = listO.iterator();
                while (it11.hasNext()) {
                    i += ((pu90) it11.next()).b;
                }
                return vj30.x(vj30Var, iIntValue, i, new g18(arrayList5, function2, iIntValue, (byte) 17));
        }
    }
}
