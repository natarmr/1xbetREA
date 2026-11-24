package a;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class mfk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21698a;
    public final ofk b;

    public /* synthetic */ mfk(ofk ofkVar, byte b) {
        this.f21698a = b;
        this.b = ofkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection<i3d0> collectionT;
        Collection<p3d0> collectionT2;
        tek tekVar;
        byte b = this.f21698a;
        ofk ofkVar = this.b;
        switch (b) {
            case 0:
                g950 g950Var = (g950) obj;
                g950Var.getClass();
                LinkedHashMap linkedHashMap = ofkVar.f25174a;
                sfy sfyVar = i3d0.z;
                sfyVar.getClass();
                pfk pfkVar = ofkVar.i;
                byte[] bArr = (byte[]) linkedHashMap.get(g950Var);
                if (bArr == null || (collectionT = pgi0.t(lgi0.d(new kch(sfyVar, new ByteArrayInputStream(bArr), pfkVar, (byte) 1)))) == null) {
                    collectionT = iun.f15405a;
                }
                ArrayList arrayList = new ArrayList(collectionT.size());
                for (i3d0 i3d0Var : collectionT) {
                    xq30 xq30Var = (xq30) pfkVar.b.i;
                    i3d0Var.getClass();
                    sfk sfkVarF = xq30Var.f(i3d0Var);
                    if (!pfkVar.r(sfkVarF)) {
                        sfkVarF = null;
                    }
                    if (sfkVarF != null) {
                        arrayList.add(sfkVarF);
                    }
                }
                pfkVar.j(g950Var, arrayList);
                return d5c.I(arrayList);
            case 1:
                g950 g950Var2 = (g950) obj;
                g950Var2.getClass();
                LinkedHashMap linkedHashMap2 = ofkVar.b;
                sfy sfyVar2 = p3d0.g1;
                sfyVar2.getClass();
                pfk pfkVar2 = ofkVar.i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(g950Var2);
                if (bArr2 == null || (collectionT2 = pgi0.t(lgi0.d(new kch(sfyVar2, new ByteArrayInputStream(bArr2), pfkVar2, (byte) 1)))) == null) {
                    collectionT2 = iun.f15405a;
                }
                ArrayList arrayList2 = new ArrayList(collectionT2.size());
                for (p3d0 p3d0Var : collectionT2) {
                    xq30 xq30Var2 = (xq30) pfkVar2.b.i;
                    p3d0Var.getClass();
                    arrayList2.add(xq30Var2.g(p3d0Var, false));
                }
                pfkVar2.k(g950Var2, arrayList2);
                return d5c.I(arrayList2);
            default:
                g950 g950Var3 = (g950) obj;
                g950Var3.getClass();
                g45 g45Var = ofkVar.i.b;
                byte[] bArr3 = (byte[]) ofkVar.c.get(g950Var3);
                if (bArr3 == null) {
                    return null;
                }
                c4d0 c4d0Var = (c4d0) c4d0.q.a(new ByteArrayInputStream(bArr3), (sso) ((f6i) g45Var.f10647a).r);
                if (c4d0Var == null) {
                    return null;
                }
                xq30 xq30Var3 = (xq30) g45Var.i;
                g45 g45Var2 = xq30Var3.f41296a;
                h950 h950Var = (h950) g45Var2.b;
                roi0 roi0Var = (roi0) g45Var2.d;
                List<p2d0> list = c4d0Var.k;
                list.getClass();
                ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                for (p2d0 p2d0Var : list) {
                    ehf0 ehf0Var = xq30Var3.b;
                    p2d0Var.getClass();
                    arrayList3.add(ehf0Var.d(p2d0Var, h950Var));
                }
                g93 i93Var = arrayList3.isEmpty() ? ujn.c : new i93(arrayList3, (byte) 0);
                o4d0 o4d0Var = (o4d0) njq.d.e(c4d0Var.d);
                switch (o4d0Var == null ? -1 : v4d0.b[o4d0Var.ordinal()]) {
                    case 1:
                        tekVar = uek.d;
                        tekVar.getClass();
                        break;
                    case 2:
                        tekVar = uek.f35533a;
                        tekVar.getClass();
                        break;
                    case 3:
                        tekVar = uek.b;
                        tekVar.getClass();
                        break;
                    case 4:
                        tekVar = uek.c;
                        tekVar.getClass();
                        break;
                    case 5:
                        tekVar = uek.e;
                        tekVar.getClass();
                        break;
                    case 6:
                        tekVar = uek.f;
                        tekVar.getClass();
                        break;
                    default:
                        tekVar = uek.f35533a;
                        tekVar.getClass();
                        break;
                }
                tfk tfkVar = new tfk((eu00) ((f6i) g45Var2.f10647a).e, (vjj) g45Var2.c, i93Var, ydx.L(h950Var, c4d0Var.e), tekVar, c4d0Var, (h950) g45Var2.b, roi0Var, (xbu0) g45Var2.e, (hfk) g45Var2.g);
                List list2 = c4d0Var.f;
                list2.getClass();
                qgd qgdVar = (qgd) g45Var2.h(tfkVar, list2, (h950) g45Var2.b, (roi0) g45Var2.d, (xbu0) g45Var2.e, (e28) g45Var2.f).h;
                tfkVar.s1(qgdVar.E(), qgdVar.Z(m8x.A0(c4d0Var, roi0Var), false), qgdVar.Z(m8x.P(c4d0Var, roi0Var), false));
                return tfkVar;
        }
    }
}
