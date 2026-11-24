package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class prh0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final prh0 f27465a;
    private static final ugi0 descriptor;

    static {
        prh0 prh0Var = new prh0();
        f27465a = prh0Var;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.models.SecurityLevelGetResponse.TypeSecurityItemResponse", prh0Var, 6);
        zna0Var.j("Phone", true);
        zna0Var.j("ChangePass", true);
        zna0Var.j("SecretQuestion", true);
        zna0Var.j("TwoFA", true);
        zna0Var.j("PersonalData", true);
        zna0Var.j("OffAuthEmail", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        srh0 srh0Var = srh0.f32676a;
        return new jiy[]{mrv.j0(srh0Var), mrv.j0(srh0Var), mrv.j0(srh0Var), mrv.j0(srh0Var), mrv.j0(srh0Var), mrv.j0(srh0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        urh0 urh0Var = null;
        urh0 urh0Var2 = null;
        urh0 urh0Var3 = null;
        urh0 urh0Var4 = null;
        urh0 urh0Var5 = null;
        urh0 urh0Var6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    urh0Var = (urh0) bldVarA.e(ugi0Var, 0, srh0.f32676a, urh0Var);
                    i |= 1;
                    break;
                case 1:
                    urh0Var2 = (urh0) bldVarA.e(ugi0Var, 1, srh0.f32676a, urh0Var2);
                    i |= 2;
                    break;
                case 2:
                    urh0Var3 = (urh0) bldVarA.e(ugi0Var, 2, srh0.f32676a, urh0Var3);
                    i |= 4;
                    break;
                case 3:
                    urh0Var4 = (urh0) bldVarA.e(ugi0Var, 3, srh0.f32676a, urh0Var4);
                    i |= 8;
                    break;
                case 4:
                    urh0Var5 = (urh0) bldVarA.e(ugi0Var, 4, srh0.f32676a, urh0Var5);
                    i |= 16;
                    break;
                case 5:
                    urh0Var6 = (urh0) bldVarA.e(ugi0Var, 5, srh0.f32676a, urh0Var6);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new rrh0(i, urh0Var, urh0Var2, urh0Var3, urh0Var4, urh0Var5, urh0Var6);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rrh0 rrh0Var = (rrh0) obj;
        rrh0Var.getClass();
        urh0 urh0Var = rrh0Var.f;
        urh0 urh0Var2 = rrh0Var.e;
        urh0 urh0Var3 = rrh0Var.d;
        urh0 urh0Var4 = rrh0Var.c;
        urh0 urh0Var5 = rrh0Var.b;
        urh0 urh0Var6 = rrh0Var.f30984a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || urh0Var6 != null) {
            cldVarA.p(ugi0Var, 0, srh0.f32676a, urh0Var6);
        }
        if (cldVarA.u(ugi0Var) || urh0Var5 != null) {
            cldVarA.p(ugi0Var, 1, srh0.f32676a, urh0Var5);
        }
        if (cldVarA.u(ugi0Var) || urh0Var4 != null) {
            cldVarA.p(ugi0Var, 2, srh0.f32676a, urh0Var4);
        }
        if (cldVarA.u(ugi0Var) || urh0Var3 != null) {
            cldVarA.p(ugi0Var, 3, srh0.f32676a, urh0Var3);
        }
        if (cldVarA.u(ugi0Var) || urh0Var2 != null) {
            cldVarA.p(ugi0Var, 4, srh0.f32676a, urh0Var2);
        }
        if (cldVarA.u(ugi0Var) || urh0Var != null) {
            cldVarA.p(ugi0Var, 5, srh0.f32676a, urh0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
