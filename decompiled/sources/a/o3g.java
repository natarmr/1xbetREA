package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o3g implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o3g f24583a;
    private static final ugi0 descriptor;

    static {
        o3g o3gVar = new o3g();
        f24583a = o3gVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.cs.CyberCSMatchesStatisticMatchResponse", o3gVar, 5);
        zna0Var.j("map", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("rounds", true);
        zna0Var.j("overtime", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = q3g.f;
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        a4g a4gVar = a4g.f222a;
        return new jiy[]{jiyVarJ0, mrv.j0(a4gVar), mrv.j0(a4gVar), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = q3g.f;
        boolean z = true;
        int i = 0;
        String str = null;
        c4g c4gVar = null;
        c4g c4gVar2 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                c4gVar = (c4g) bldVarA.e(ugi0Var, 1, a4g.f222a, c4gVar);
                i |= 2;
            } else if (iF == 2) {
                c4gVar2 = (c4g) bldVarA.e(ugi0Var, 2, a4g.f222a, c4gVar2);
                i |= 4;
            } else if (iF == 3) {
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new q3g(i, str, c4gVar, c4gVar2, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q3g q3gVar = (q3g) obj;
        q3gVar.getClass();
        List list = q3gVar.e;
        List list2 = q3gVar.d;
        c4g c4gVar = q3gVar.c;
        c4g c4gVar2 = q3gVar.b;
        String str = q3gVar.f28051a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = q3g.f;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || c4gVar2 != null) {
            cldVarA.p(ugi0Var, 1, a4g.f222a, c4gVar2);
        }
        if (cldVarA.u(ugi0Var) || c4gVar != null) {
            cldVarA.p(ugi0Var, 2, a4g.f222a, c4gVar);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
