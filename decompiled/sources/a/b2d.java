package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b2d implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1846a;
    public final /* synthetic */ float b;

    public /* synthetic */ b2d(float f, byte b) {
        this.f1846a = b;
        this.b = f;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:81:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0084 A[SYNTHETIC] */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pu90 pu90VarS;
        Iterator it;
        Integer numValueOf;
        byte b = this.f1846a;
        Integer numValueOf2 = null;
        float f = this.b;
        list.getClass();
        switch (b) {
            case 0:
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new e6c((byte) 26));
                }
                int iT = vj30Var.T(f);
                kie0 kie0Var = new kie0();
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    pj30 pj30Var = (pj30) list.get(i);
                    Object objI0 = mrv.i0(pj30Var);
                    if (Intrinsics.d(objI0, "TOOLBAR_CONTAINER_KEY")) {
                        pu90VarS = pj30Var.S(p4e.b(j, 0, 0, 0, Integer.MAX_VALUE, 3));
                        kie0Var.f18333a = pu90VarS.b;
                    } else if (Intrinsics.d(objI0, "TAB_CONTENT_KEY")) {
                        int iH = (p4e.h(j) - kie0Var.f18333a) + iT;
                        if (iH < 0) {
                            iH = 0;
                        }
                        int i2 = p4e.i(j);
                        if (!((i2 >= 0) & (iH >= 0))) {
                            zcx.a("width and height must be >= 0");
                        }
                        pu90VarS = pj30Var.S(r4e.h(i2, i2, iH, iH));
                    } else {
                        pu90VarS = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 11));
                    }
                    arrayList.add(pu90VarS);
                }
                return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new hf4(arrayList, kie0Var, iT, (byte) 1));
            case 1:
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    pj30 pj30Var2 = (pj30) list.get(i3);
                    if (Intrinsics.d(mrv.i0(pj30Var2), RemoteMessageConst.Notification.CONTENT)) {
                        pu90 pu90VarS2 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 11));
                        int iB = si30.b(p4e.h(j) + f);
                        int i4 = iB >= 0 ? iB : 0;
                        return vj30.x(vj30Var, p4e.i(j), i4, new n7(pu90VarS2, i4, (byte) 11));
                    }
                }
                qf00.b("Collection contains no element matching the predicate.");
                csj.b();
                return null;
            case 2:
                zcl zclVar = qmk.f28987a;
                int iT2 = vj30Var.T(8.0f);
                pu90 pu90VarS3 = ((pj30) list.get(0)).S(j);
                pu90 pu90VarS4 = ((pj30) list.get(1)).S(p4e.b(j, 0, 0, 0, 0, 14));
                int iMax = Math.max(vj30Var.T(f) + (p4e.i(j) - pu90VarS4.f27604a), vj30Var.T(f));
                int i5 = p4e.i(j);
                int i6 = iMax > i5 ? i5 : iMax;
                pu90 pu90VarS5 = ((pj30) list.get(2)).S(p4e.b(j, i6, i6, 0, 0, 8));
                int i7 = pu90VarS3.b + iT2;
                int iMax2 = Math.max(pu90VarS5.b, pu90VarS4.b);
                int i8 = p4e.i(j) - pu90VarS4.f27604a;
                return vj30.x(vj30Var, p4e.i(j), iMax2 + i7, new k7m(pu90VarS5, i7, pu90VarS4, i8 < 0 ? 0 : i8, pu90VarS3));
            default:
                int iT3 = vj30Var.T(f);
                ArrayList<pu90> arrayList2 = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((pj30) it2.next()).S(p4e.b(j, 0, 0, 0, 0, 14)));
                }
                ArrayList arrayList3 = new ArrayList();
                int i9 = 0;
                for (pu90 pu90Var : arrayList2) {
                    arrayList3.add(Integer.valueOf(i9));
                    i9 += pu90Var.f27604a + iT3;
                    if (i9 > p4e.i(j)) {
                        it = arrayList2.iterator();
                        if (it.hasNext()) {
                            numValueOf2 = Integer.valueOf(((pu90) it.next()).b);
                            while (it.hasNext()) {
                                numValueOf = Integer.valueOf(((pu90) it.next()).b);
                                if (numValueOf2.compareTo(numValueOf) < 0) {
                                    numValueOf2 = numValueOf;
                                }
                            }
                        }
                        return vj30.x(vj30Var, p4e.i(j), numValueOf2 != null ? numValueOf2.intValue() : 0, new x5q(arrayList3, arrayList2, (byte) 1));
                    }
                }
                it = arrayList2.iterator();
                if (it.hasNext()) {
                    numValueOf2 = Integer.valueOf(((pu90) it.next()).b);
                    while (it.hasNext()) {
                        numValueOf = Integer.valueOf(((pu90) it.next()).b);
                        if (numValueOf2.compareTo(numValueOf) < 0) {
                            numValueOf2 = numValueOf;
                        }
                    }
                }
                return vj30.x(vj30Var, p4e.i(j), numValueOf2 != null ? numValueOf2.intValue() : 0, new x5q(arrayList3, arrayList2, (byte) 1));
        }
    }
}
