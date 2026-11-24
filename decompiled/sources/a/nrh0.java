package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nrh0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nrh0 f24001a;
    private static final ugi0 descriptor;

    static {
        nrh0 nrh0Var = new nrh0();
        f24001a = nrh0Var;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.models.SecurityLevelGetResponse", nrh0Var, 12);
        zna0Var.j("CurrentAmout", true);
        zna0Var.j("LastDayChangePass", true);
        zna0Var.j("DayChangePassCount", true);
        zna0Var.j("ProtectionWeight", true);
        zna0Var.j("ProtectionType", true);
        zna0Var.j("ProtectionState", true);
        zna0Var.j("TotalAmout", true);
        zna0Var.j("TypeSecurity", true);
        zna0Var.j("IsAvailablePromo", true);
        zna0Var.j("NextAvailableDayPromo", true);
        zna0Var.j("LastDayPromo", true);
        zna0Var.j("Title", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(prh0.f27465a), mrv.j0(sm8.f32432a), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        Integer num = null;
        Integer num2 = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        rrh0 rrh0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str = str;
                    break;
                case 0:
                    num3 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num3);
                    i |= 1;
                    z = z;
                    str = str;
                    break;
                case 1:
                    num4 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num4);
                    i |= 2;
                    z = z;
                    num3 = num3;
                    break;
                case 2:
                    num5 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num5);
                    i |= 4;
                    z = z;
                    num3 = num3;
                    break;
                case 3:
                    num6 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num6);
                    i |= 8;
                    z = z;
                    num3 = num3;
                    break;
                case 4:
                    num7 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num7);
                    i |= 16;
                    z = z;
                    num3 = num3;
                    break;
                case 5:
                    num8 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num8);
                    i |= 32;
                    z = z;
                    num3 = num3;
                    break;
                case 6:
                    num9 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num9);
                    i |= 64;
                    z = z;
                    num3 = num3;
                    break;
                case 7:
                    rrh0Var = (rrh0) bldVarA.e(ugi0Var, 7, prh0.f27465a, rrh0Var);
                    i |= 128;
                    z = z;
                    num3 = num3;
                    break;
                case 8:
                    bool = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool);
                    i |= 256;
                    z = z;
                    num3 = num3;
                    break;
                case 9:
                    num2 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num2);
                    i |= 512;
                    z = z;
                    num3 = num3;
                    break;
                case 10:
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i |= 1024;
                    z = z;
                    num3 = num3;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    z = z;
                    num3 = num3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new vrh0(i, num3, num4, num5, num6, num7, num8, num9, rrh0Var, bool, num2, num, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vrh0 vrh0Var = (vrh0) obj;
        vrh0Var.getClass();
        String str = vrh0Var.l;
        Integer num = vrh0Var.k;
        Integer num2 = vrh0Var.j;
        Boolean bool = vrh0Var.i;
        rrh0 rrh0Var = vrh0Var.h;
        Integer num3 = vrh0Var.g;
        Integer num4 = vrh0Var.f;
        Integer num5 = vrh0Var.e;
        Integer num6 = vrh0Var.d;
        Integer num7 = vrh0Var.c;
        Integer num8 = vrh0Var.b;
        Integer num9 = vrh0Var.f37898a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num9 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num9);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || rrh0Var != null) {
            cldVarA.p(ugi0Var, 7, prh0.f27465a, rrh0Var);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
