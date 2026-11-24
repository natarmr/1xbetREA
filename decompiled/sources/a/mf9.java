package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mf9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mf9 f21683a;
    private static final ugi0 descriptor;

    static {
        mf9 mf9Var = new mf9();
        f21683a = mf9Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.ButtonsResponse", mf9Var, 6);
        zna0Var.j("excludedButton", true);
        zna0Var.j("participateButton", true);
        zna0Var.j("participateThroughProviderButton", true);
        zna0Var.j("rulesButton", true);
        zna0Var.j("youAlreadyParticipatingButton", true);
        zna0Var.j("detailsButton", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        fe9 fe9Var = fe9.f9395a;
        return new jiy[]{mrv.j0(fe9Var), mrv.j0(fe9Var), mrv.j0(fe9Var), mrv.j0(fe9Var), mrv.j0(fe9Var), mrv.j0(fe9Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        he9 he9Var = null;
        he9 he9Var2 = null;
        he9 he9Var3 = null;
        he9 he9Var4 = null;
        he9 he9Var5 = null;
        he9 he9Var6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    he9Var = (he9) bldVarA.e(ugi0Var, 0, fe9.f9395a, he9Var);
                    i |= 1;
                    break;
                case 1:
                    he9Var2 = (he9) bldVarA.e(ugi0Var, 1, fe9.f9395a, he9Var2);
                    i |= 2;
                    break;
                case 2:
                    he9Var3 = (he9) bldVarA.e(ugi0Var, 2, fe9.f9395a, he9Var3);
                    i |= 4;
                    break;
                case 3:
                    he9Var4 = (he9) bldVarA.e(ugi0Var, 3, fe9.f9395a, he9Var4);
                    i |= 8;
                    break;
                case 4:
                    he9Var5 = (he9) bldVarA.e(ugi0Var, 4, fe9.f9395a, he9Var5);
                    i |= 16;
                    break;
                case 5:
                    he9Var6 = (he9) bldVarA.e(ugi0Var, 5, fe9.f9395a, he9Var6);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new of9(i, he9Var, he9Var2, he9Var3, he9Var4, he9Var5, he9Var6);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        of9 of9Var = (of9) obj;
        of9Var.getClass();
        he9 he9Var = of9Var.f;
        he9 he9Var2 = of9Var.e;
        he9 he9Var3 = of9Var.d;
        he9 he9Var4 = of9Var.c;
        he9 he9Var5 = of9Var.b;
        he9 he9Var6 = of9Var.f25153a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || he9Var6 != null) {
            cldVarA.p(ugi0Var, 0, fe9.f9395a, he9Var6);
        }
        if (cldVarA.u(ugi0Var) || he9Var5 != null) {
            cldVarA.p(ugi0Var, 1, fe9.f9395a, he9Var5);
        }
        if (cldVarA.u(ugi0Var) || he9Var4 != null) {
            cldVarA.p(ugi0Var, 2, fe9.f9395a, he9Var4);
        }
        if (cldVarA.u(ugi0Var) || he9Var3 != null) {
            cldVarA.p(ugi0Var, 3, fe9.f9395a, he9Var3);
        }
        if (cldVarA.u(ugi0Var) || he9Var2 != null) {
            cldVarA.p(ugi0Var, 4, fe9.f9395a, he9Var2);
        }
        if (cldVarA.u(ugi0Var) || he9Var != null) {
            cldVarA.p(ugi0Var, 5, fe9.f9395a, he9Var);
        }
        cldVarA.c(ugi0Var);
    }
}
