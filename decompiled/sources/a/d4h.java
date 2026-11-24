package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d4h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d4h f5455a;
    private static final ugi0 descriptor;

    static {
        d4h d4hVar = new d4h();
        f5455a = d4hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.lol.CyberLolPlayerStatisticResponse", d4hVar, 9);
        zna0Var.j("wins", true);
        zna0Var.j("losses", true);
        zna0Var.j("kills", true);
        zna0Var.j("deaths", true);
        zna0Var.j("assists", true);
        zna0Var.j("goldEarned", true);
        zna0Var.j("baronKills", true);
        zna0Var.j("dragonKills", true);
        zna0Var.j("towerKills", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(okxVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        Float f = null;
        Integer num = null;
        Integer num2 = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Integer num3 = null;
        Float f5 = null;
        Float f6 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    f2 = (Float) bldVarA.e(ugi0Var, 2, klq.f18504a, f2);
                    i |= 4;
                    break;
                case 3:
                    f3 = (Float) bldVarA.e(ugi0Var, 3, klq.f18504a, f3);
                    i |= 8;
                    break;
                case 4:
                    f4 = (Float) bldVarA.e(ugi0Var, 4, klq.f18504a, f4);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num3);
                    i |= 32;
                    break;
                case 6:
                    f5 = (Float) bldVarA.e(ugi0Var, 6, klq.f18504a, f5);
                    i |= 64;
                    break;
                case 7:
                    f6 = (Float) bldVarA.e(ugi0Var, 7, klq.f18504a, f6);
                    i |= 128;
                    break;
                case 8:
                    f = (Float) bldVarA.e(ugi0Var, 8, klq.f18504a, f);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new f4h(i, num, num2, f2, f3, f4, num3, f5, f6, f);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f4h f4hVar = (f4h) obj;
        f4hVar.getClass();
        Float f = f4hVar.i;
        Float f2 = f4hVar.h;
        Float f3 = f4hVar.g;
        Integer num = f4hVar.f;
        Float f4 = f4hVar.e;
        Float f5 = f4hVar.d;
        Float f6 = f4hVar.c;
        Integer num2 = f4hVar.b;
        Integer num3 = f4hVar.f8913a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || f6 != null) {
            cldVarA.p(ugi0Var, 2, klq.f18504a, f6);
        }
        if (cldVarA.u(ugi0Var) || f5 != null) {
            cldVarA.p(ugi0Var, 3, klq.f18504a, f5);
        }
        if (cldVarA.u(ugi0Var) || f4 != null) {
            cldVarA.p(ugi0Var, 4, klq.f18504a, f4);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 6, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 7, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 8, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
