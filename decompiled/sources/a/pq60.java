package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pq60 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pq60 f27400a;
    private static final ugi0 descriptor;

    static {
        pq60 pq60Var = new pq60();
        f27400a = pq60Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.OneXGamesActionResult", pq60Var, 5);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("name", false);
        zna0Var.j("desc", false);
        zna0Var.j("UM", false);
        zna0Var.j("fGActionList", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = rq60.f;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{okx.f25427a, ysm0Var, ysm0Var, sm8.f32432a, a8zVarArr[4].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = rq60.f;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        String strX = null;
        String strX2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX2 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                zB = bldVarA.B(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new rq60(i, iJ, strX, strX2, zB, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rq60 rq60Var = (rq60) obj;
        rq60Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = rq60.f;
        cldVarA.i(0, rq60Var.f30917a, ugi0Var);
        cldVarA.z(ugi0Var, 1, rq60Var.b);
        cldVarA.z(ugi0Var, 2, rq60Var.c);
        cldVarA.x(ugi0Var, 3, rq60Var.d);
        cldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), rq60Var.e);
        cldVarA.c(ugi0Var);
    }
}
