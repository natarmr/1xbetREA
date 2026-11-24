package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t9r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t9r f33581a;
    private static final ugi0 descriptor;

    static {
        t9r t9rVar = new t9r();
        f33581a = t9rVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.fruit_blast.FruitBlastStepInfoResponse", t9rVar, 3);
        zna0Var.j("MAP", true);
        zna0Var.j("NFB", true);
        zna0Var.j("WL", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = v9r.d;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = v9r.d;
        boolean z = true;
        int i = 0;
        List list = null;
        Map map = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                map = (Map) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new v9r(i, list, list2, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        v9r v9rVar = (v9r) obj;
        v9rVar.getClass();
        List list = v9rVar.c;
        Map map = v9rVar.b;
        List list2 = v9rVar.f37048a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = v9r.d;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
