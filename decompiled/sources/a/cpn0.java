package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cpn0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpn0 f4757a;
    private static final ugi0 descriptor;

    static {
        cpn0 cpn0Var = new cpn0();
        f4757a = cpn0Var;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.domain.model.SwipeXFilterChampModel", cpn0Var, 6);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("name", false);
        zna0Var.j("image", false);
        zna0Var.j("sportId", false);
        zna0Var.j("subSportId", false);
        zna0Var.j("selected", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{okx.f25427a, ysm0Var, ysm0Var, s710Var, s710Var, sm8.f32432a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        String strX = null;
        String strX2 = null;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iJ = bldVarA.j(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX2 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    jR = bldVarA.r(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    jR2 = bldVarA.r(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zB = bldVarA.B(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new epn0(i, iJ, jR, jR2, strX, strX2, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        epn0 epn0Var = (epn0) obj;
        epn0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, epn0Var.f8198a, ugi0Var);
        cldVarA.z(ugi0Var, 1, epn0Var.b);
        cldVarA.z(ugi0Var, 2, epn0Var.c);
        cldVarA.n(ugi0Var, 3, epn0Var.d);
        cldVarA.n(ugi0Var, 4, epn0Var.e);
        cldVarA.x(ugi0Var, 5, epn0Var.f);
        cldVarA.c(ugi0Var);
    }
}
