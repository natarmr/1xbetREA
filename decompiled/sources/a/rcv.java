package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rcv implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rcv f30259a;
    private static final ugi0 descriptor;

    static {
        rcv rcvVar = new rcv();
        f30259a = rcvVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.grand_prix.data.models.GrandPrixStatisticResponse", rcvVar, 2);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(mcv.f21567a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        ocv ocvVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                ocvVar = (ocv) bldVarA.e(ugi0Var, 1, mcv.f21567a, ocvVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new tcv(i, num, ocvVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tcv tcvVar = (tcv) obj;
        tcvVar.getClass();
        ocv ocvVar = tcvVar.b;
        Integer num = tcvVar.f33737a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || ocvVar != null) {
            cldVarA.p(ugi0Var, 1, mcv.f21567a, ocvVar);
        }
        cldVarA.c(ugi0Var);
    }
}
