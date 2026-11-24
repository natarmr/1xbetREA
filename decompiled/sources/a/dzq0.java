package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dzq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dzq0 f6952a;
    private static final ugi0 descriptor;

    static {
        dzq0 dzq0Var = new dzq0();
        f6952a = dzq0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.feed.data.model.TopChampResponse", dzq0Var, 6);
        zna0Var.j("liga", true);
        zna0Var.j("countryId", true);
        zna0Var.j("sport", true);
        zna0Var.j("subSport", true);
        zna0Var.j("gamesCount", true);
        zna0Var.j("globalChampId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(uz5.f36520a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        j26 j26Var = j26.f15767a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(j26Var), mrv.j0(j26Var), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        wz5 wz5Var = null;
        Integer num = null;
        l26 l26Var = null;
        l26 l26Var2 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    wz5Var = (wz5) bldVarA.e(ugi0Var, 0, uz5.f36520a, wz5Var);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    l26Var = (l26) bldVarA.e(ugi0Var, 2, j26.f15767a, l26Var);
                    i |= 4;
                    break;
                case 3:
                    l26Var2 = (l26) bldVarA.e(ugi0Var, 3, j26.f15767a, l26Var2);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num3);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new fzq0(i, wz5Var, num, l26Var, l26Var2, num2, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fzq0 fzq0Var = (fzq0) obj;
        fzq0Var.getClass();
        Integer num = fzq0Var.f;
        Integer num2 = fzq0Var.e;
        l26 l26Var = fzq0Var.d;
        l26 l26Var2 = fzq0Var.c;
        Integer num3 = fzq0Var.b;
        wz5 wz5Var = fzq0Var.f10421a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || wz5Var != null) {
            cldVarA.p(ugi0Var, 0, uz5.f36520a, wz5Var);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l26Var2 != null) {
            cldVarA.p(ugi0Var, 2, j26.f15767a, l26Var2);
        }
        if (cldVarA.u(ugi0Var) || l26Var != null) {
            cldVarA.p(ugi0Var, 3, j26.f15767a, l26Var);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
