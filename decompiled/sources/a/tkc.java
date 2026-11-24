package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tkc implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tkc f34088a;
    private static final ugi0 descriptor;

    static {
        tkc tkcVar = new tkc();
        f34088a = tkcVar;
        zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.CityResponse", tkcVar, 5);
        zna0Var.j("count", true);
        zna0Var.j("lastUpdate", true);
        zna0Var.j("items", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("title", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) ykc.f[2].getValue());
        jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, s710.f31729a, jiyVarJ0, okxVar, jiyVarJ1};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ykc.f;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        long jR = 0;
        String str = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else if (iF == 3) {
                iJ2 = bldVarA.j(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new ykc(i, iJ, iJ2, jR, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ykc ykcVar = (ykc) obj;
        ykcVar.getClass();
        String str = ykcVar.e;
        int i = ykcVar.d;
        List list = ykcVar.c;
        long j = ykcVar.b;
        int i2 = ykcVar.f42782a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ykc.f;
        if (cldVarA.u(ugi0Var) || i2 != 0) {
            cldVarA.i(0, i2, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || j != 0) {
            cldVarA.n(ugi0Var, 1, j);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(3, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
