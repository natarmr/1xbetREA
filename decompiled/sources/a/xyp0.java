package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;

/* JADX INFO: loaded from: classes6.dex */
public final class xyp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vyp0 f41715a;
    public final knf0 b;
    public final typ0 c;
    public final kuy d;

    public xyp0(vyp0 vyp0Var, knf0 knf0Var, typ0 typ0Var, kuy kuyVar) {
        knf0Var.getClass();
        typ0Var.getClass();
        kuyVar.getClass();
        this.f41715a = vyp0Var;
        this.b = knf0Var;
        this.c = typ0Var;
        this.d = kuyVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [a.lun, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map] */
    public final Object a(String str, zje zjeVar) {
        wyp0 wyp0Var;
        ?? linkedHashMap;
        uyp0 uyp0Var;
        String str2;
        TennisSurfaceType tennisSurfaceTypeE;
        if (zjeVar instanceof wyp0) {
            wyp0Var = (wyp0) zjeVar;
            int i = wyp0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wyp0Var.k = i - Integer.MIN_VALUE;
            } else {
                wyp0Var = new wyp0(this, zjeVar);
            }
        } else {
            wyp0Var = new wyp0(this, zjeVar);
        }
        wyp0 wyp0Var2 = wyp0Var;
        Object objA = wyp0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = wyp0Var2.k;
        typ0 typ0Var = this.c;
        if (i2 == 0) {
            z1x.P(objA);
            mxp0 mxp0Var = typ0Var.f34767a;
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            if (mxp0Var.equals(new mxp0(lunVar))) {
                String strA = this.d.a();
                knf0 knf0Var = this.b;
                knf0Var.getClass();
                int iB = knf0Var.b();
                wyp0Var2.k = 1;
                objA = ((uxp0) this.f41715a.f38260a.invoke()).a("application/vnd.xenvelop+json", strA, str, 1, iB, wyp0Var2);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        List<azp0> list = ((pxp0) ((dx5) objA).a()).f27763a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (azp0 azp0Var : list) {
                azp0Var.getClass();
                String str3 = azp0Var.f1730a;
                if (str3 == null || (str2 = azp0Var.b) == null) {
                    uyp0Var = null;
                } else {
                    if (str2.length() == 0) {
                        tennisSurfaceTypeE = TennisSurfaceType.ALL;
                    } else {
                        TennisSurfaceType.b.getClass();
                        tennisSurfaceTypeE = m6m0.e(str2);
                    }
                    qii0 qii0Var = azp0Var.c;
                    if (qii0Var == null) {
                        jf4.k(null);
                        return null;
                    }
                    nii0 nii0Var = new nii0(fxb.I(qii0Var.f28795a), fxb.I(qii0Var.b), fxb.I(qii0Var.c), fxb.I(qii0Var.d), fxb.I(qii0Var.e), fxb.I(qii0Var.f), fxb.I(qii0Var.g), fxb.I(qii0Var.h), fxb.I(qii0Var.i), fxb.I(qii0Var.j));
                    mag0 mag0Var = azp0Var.d;
                    if (mag0Var == null) {
                        jf4.k(null);
                        return null;
                    }
                    uyp0Var = new uyp0(str3, tennisSurfaceTypeE, nii0Var, new jag0(fxb.I(mag0Var.f21456a), fxb.I(mag0Var.b), fxb.I(mag0Var.c), fxb.I(mag0Var.d), fxb.I(mag0Var.e), fxb.I(mag0Var.f), fxb.I(mag0Var.g), fxb.I(mag0Var.h)));
                }
                if (uyp0Var != null) {
                    arrayList.add(uyp0Var);
                }
            }
            linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                String str4 = ((uyp0) obj).f36503a;
                Object arrayList2 = linkedHashMap.get(str4);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(str4, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
        } else {
            linkedHashMap = lun.f20680a;
            linkedHashMap.getClass();
        }
        mxp0 mxp0Var2 = new mxp0(linkedHashMap);
        typ0Var.getClass();
        typ0Var.f34767a = mxp0Var2;
        return Unit.f46060a;
    }
}
