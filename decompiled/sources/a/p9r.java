package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p9r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9r f26621a;
    private static final ugi0 descriptor;

    static {
        p9r p9rVar = new p9r();
        f26621a = p9rVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.fruit_blast.FruitBlastResultResponse", p9rVar, 3);
        zna0Var.j("CI", true);
        zna0Var.j("ST", true);
        zna0Var.j("BN", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = r9r.d;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(t9r.f33581a), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = r9r.d;
        boolean z = true;
        int i = 0;
        Map map = null;
        v9r v9rVar = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                map = (Map) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), map);
                i |= 1;
            } else if (iF == 1) {
                v9rVar = (v9r) bldVarA.e(ugi0Var, 1, t9r.f33581a, v9rVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new r9r(i, map, v9rVar, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        r9r r9rVar = (r9r) obj;
        r9rVar.getClass();
        List list = r9rVar.c;
        v9r v9rVar = r9rVar.b;
        Map map = r9rVar.f30098a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = r9r.d;
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || v9rVar != null) {
            cldVarA.p(ugi0Var, 1, t9r.f33581a, v9rVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
