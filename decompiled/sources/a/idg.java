package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class idg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final idg f14584a;
    private static final ugi0 descriptor;

    static {
        idg idgVar = new idg();
        f14584a = idgVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.regular.data.model.CyberChampPrizeDistributionResponse", idgVar, 3);
        zna0Var.j("place", true);
        zna0Var.j("prize", true);
        zna0Var.j("team", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(okx.f25427a), mrv.j0(mdg.f21595a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        odg odgVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                odgVar = (odg) bldVarA.e(ugi0Var, 2, mdg.f21595a, odgVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new kdg(i, str, num, odgVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kdg kdgVar = (kdg) obj;
        kdgVar.getClass();
        odg odgVar = kdgVar.c;
        Integer num = kdgVar.b;
        String str = kdgVar.f18106a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || odgVar != null) {
            cldVarA.p(ugi0Var, 2, mdg.f21595a, odgVar);
        }
        cldVarA.c(ugi0Var);
    }
}
