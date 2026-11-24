package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class frn0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final frn0 f10027a;
    private static final ugi0 descriptor;

    static {
        frn0 frn0Var = new frn0();
        f10027a = frn0Var;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.domain.model.SwipeXSportWithChampsModel", frn0Var, 9);
        zna0Var.j("sportId", false);
        zna0Var.j("sportName", false);
        zna0Var.j("subSportId", false);
        zna0Var.j("subSportName", false);
        zna0Var.j("champsCount", false);
        zna0Var.j("selected", false);
        zna0Var.j("imageUrl", false);
        zna0Var.j("isCyber", false);
        zna0Var.j("champs", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = hrn0.j;
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{s710Var, ysm0Var, s710Var, ysm0Var, okx.f25427a, sm8Var, ysm0Var, sm8Var, a8zVarArr[8].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = hrn0.j;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        boolean zB2 = false;
        long jR = 0;
        long jR2 = 0;
        List list = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    jR2 = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX2 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zB = bldVarA.B(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strX3 = bldVarA.x(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zB2 = bldVarA.B(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) bldVarA.m(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new hrn0(i, jR, strX, jR2, strX2, iJ, zB, strX3, zB2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hrn0 hrn0Var = (hrn0) obj;
        hrn0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = hrn0.j;
        cldVarA.n(ugi0Var, 0, hrn0Var.f13540a);
        cldVarA.z(ugi0Var, 1, hrn0Var.b);
        cldVarA.n(ugi0Var, 2, hrn0Var.c);
        cldVarA.z(ugi0Var, 3, hrn0Var.d);
        cldVarA.i(4, hrn0Var.e, ugi0Var);
        cldVarA.x(ugi0Var, 5, hrn0Var.f);
        cldVarA.z(ugi0Var, 6, hrn0Var.g);
        cldVarA.x(ugi0Var, 7, hrn0Var.h);
        cldVarA.m(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), hrn0Var.i);
        cldVarA.c(ugi0Var);
    }
}
