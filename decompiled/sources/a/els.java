package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class els implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final els f8016a;
    private static final ugi0 descriptor;

    static {
        els elsVar = new els();
        f8016a = elsVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.lol.GameLogItemResponse", elsVar, 4);
        zna0Var.j("MI", true);
        zna0Var.j("NU", true);
        zna0Var.j("SD", true);
        zna0Var.j("LT", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(b3h.f1904a), mrv.j0(okxVar), mrv.j0(e3h.f7134a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        a3h a3hVar = null;
        Integer num2 = null;
        d3h d3hVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                a3hVar = (a3h) bldVarA.e(ugi0Var, 1, b3h.f1904a, a3hVar);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                d3hVar = (d3h) bldVarA.e(ugi0Var, 3, e3h.f7134a, d3hVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new gls(i, num, a3hVar, num2, d3hVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gls glsVar = (gls) obj;
        glsVar.getClass();
        d3h d3hVar = glsVar.d;
        Integer num = glsVar.c;
        a3h a3hVar = glsVar.b;
        Integer num2 = glsVar.f11509a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || a3hVar != null) {
            cldVarA.p(ugi0Var, 1, b3h.f1904a, a3hVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d3hVar != null) {
            cldVarA.p(ugi0Var, 3, e3h.f7134a, d3hVar);
        }
        cldVarA.c(ugi0Var);
    }
}
