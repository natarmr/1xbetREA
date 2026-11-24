package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fo2 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fo2 f9861a;
    private static final ugi0 descriptor;

    static {
        fo2 fo2Var = new fo2();
        f9861a = fo2Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.mainfeed.AlterVideoZoneResponse", fo2Var, 4);
        zna0Var.j("gameId", true);
        zna0Var.j("constId", true);
        zna0Var.j("videoId", true);
        zna0Var.j("zonePlay", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0.f43175a), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String str = null;
        Long l3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ho2(i, l, l2, str, l3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ho2 ho2Var = (ho2) obj;
        ho2Var.getClass();
        Long l = ho2Var.d;
        String str = ho2Var.c;
        Long l2 = ho2Var.b;
        Long l3 = ho2Var.f13372a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
