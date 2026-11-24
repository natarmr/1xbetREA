package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qcg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qcg f28482a;
    private static final ugi0 descriptor;

    static {
        qcg qcgVar = new qcg();
        f28482a = qcgVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.regular.data.model.CyberChampImagesResponse", qcgVar, 2);
        zna0Var.j("feedId", true);
        zna0Var.j("images", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(g3x.f10634a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        i3x i3xVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                i3xVar = (i3x) bldVarA.e(ugi0Var, 1, g3x.f10634a, i3xVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new scg(i, l, i3xVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        scg scgVar = (scg) obj;
        scgVar.getClass();
        i3x i3xVar = scgVar.b;
        Long l = scgVar.f31984a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || i3xVar != null) {
            cldVarA.p(ugi0Var, 1, g3x.f10634a, i3xVar);
        }
        cldVarA.c(ugi0Var);
    }
}
