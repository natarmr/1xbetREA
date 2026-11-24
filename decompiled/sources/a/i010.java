package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i010 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i010 f13930a;
    private static final ugi0 descriptor;

    static {
        i010 i010Var = new i010();
        f13930a = i010Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.cyber_info.lol.data.model.LolGroupTeamResponse.Score", i010Var, 3);
        zna0Var.j("wins", true);
        zna0Var.j("loses", true);
        zna0Var.j("winrate", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new k010(i, d, num, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k010 k010Var = (k010) obj;
        k010Var.getClass();
        Double d = k010Var.c;
        Integer num = k010Var.b;
        Integer num2 = k010Var.f17442a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
