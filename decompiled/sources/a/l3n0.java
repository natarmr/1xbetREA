package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l3n0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3n0 f19366a;
    private static final ugi0 descriptor;

    static {
        l3n0 l3n0Var = new l3n0();
        f19366a = l3n0Var;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.sport.SubSportResponse", l3n0Var, 4);
        zna0Var.j("subSportId", true);
        zna0Var.j("name", true);
        zna0Var.j("img", true);
        zna0Var.j("imgNew", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(ysm0.f43175a), mrv.j0(zel0.f44258a), mrv.j0((jiy) x3n0.e[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = x3n0.e;
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        dfl0 dfl0Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                dfl0Var = (dfl0) bldVarA.e(ugi0Var, 2, zel0.f44258a, dfl0Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new x3n0(i, l, str, dfl0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x3n0 x3n0Var = (x3n0) obj;
        x3n0Var.getClass();
        List list = x3n0Var.d;
        dfl0 dfl0Var = x3n0Var.c;
        String str = x3n0Var.b;
        Long l = x3n0Var.f40230a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = x3n0.e;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || dfl0Var != null) {
            cldVarA.p(ugi0Var, 2, zel0.f44258a, dfl0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
