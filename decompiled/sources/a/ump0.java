package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ump0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ump0 f35929a;
    private static final ugi0 descriptor;

    static {
        ump0 ump0Var = new ump0();
        f35929a = ump0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.team_details.transfer.data.model.TeamTransferResponse", ump0Var, 6);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("role", true);
        zna0Var.j("roleGroup", true);
        zna0Var.j("feedId", true);
        zna0Var.j("hasStat", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710.f31729a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new wmp0(i, bool, l, str, str2, str3, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wmp0 wmp0Var = (wmp0) obj;
        wmp0Var.getClass();
        Boolean bool = wmp0Var.f;
        Long l = wmp0Var.e;
        String str = wmp0Var.d;
        String str2 = wmp0Var.c;
        String str3 = wmp0Var.b;
        String str4 = wmp0Var.f39416a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
