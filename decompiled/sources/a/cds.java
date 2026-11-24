package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cds implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cds f4176a;
    private static final ugi0 descriptor;

    static {
        cds cdsVar = new cds();
        f4176a = cdsVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.GameImageInfo", cdsVar, 4);
        zna0Var.j("rect", false);
        zna0Var.j("square", false);
        zna0Var.j("circle", false);
        zna0Var.j("imageVariant", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        eds edsVar = eds.f7632a;
        return new jiy[]{edsVar, edsVar, edsVar, o2x.f24552a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        lz60 lz60Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                gds gdsVar = (gds) bldVarA.m(ugi0Var, 0, eds.f7632a, str != null ? new gds(str) : null);
                str = gdsVar != null ? gdsVar.f11116a : null;
                i |= 1;
            } else if (iF == 1) {
                gds gdsVar2 = (gds) bldVarA.m(ugi0Var, 1, eds.f7632a, str2 != null ? new gds(str2) : null);
                str2 = gdsVar2 != null ? gdsVar2.f11116a : null;
                i |= 2;
            } else if (iF == 2) {
                gds gdsVar3 = (gds) bldVarA.m(ugi0Var, 2, eds.f7632a, str3 != null ? new gds(str3) : null);
                str3 = gdsVar3 != null ? gdsVar3.f11116a : null;
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                lz60Var = (lz60) bldVarA.m(ugi0Var, 3, o2x.f24552a, lz60Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new hds(i, str, str2, str3, lz60Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hds hdsVar = (hds) obj;
        hdsVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        eds edsVar = eds.f7632a;
        cldVarA.m(ugi0Var, 0, edsVar, new gds(hdsVar.f12884a));
        cldVarA.m(ugi0Var, 1, edsVar, new gds(hdsVar.b));
        cldVarA.m(ugi0Var, 2, edsVar, new gds(hdsVar.c));
        cldVarA.m(ugi0Var, 3, o2x.f24552a, hdsVar.d);
        cldVarA.c(ugi0Var);
    }
}
