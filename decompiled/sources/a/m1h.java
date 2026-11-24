package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m1h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1h f21007a;
    private static final ugi0 descriptor;

    static {
        m1h m1hVar = new m1h();
        f21007a = m1hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.dota.CyberIndividualHeroStatisticResponse", m1hVar, 9);
        zna0Var.j("KL", true);
        zna0Var.j("DT", true);
        zna0Var.j("AS", true);
        zna0Var.j("LH", true);
        zna0Var.j("DN", true);
        zna0Var.j("NW", true);
        zna0Var.j("GM", true);
        zna0Var.j("XM", true);
        zna0Var.j("GL", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num2 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    break;
                case 1:
                    num3 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num3);
                    i |= 2;
                    break;
                case 2:
                    num4 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num4);
                    i |= 4;
                    break;
                case 3:
                    num5 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num5);
                    i |= 8;
                    break;
                case 4:
                    num6 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num6);
                    i |= 16;
                    break;
                case 5:
                    num7 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num7);
                    i |= 32;
                    break;
                case 6:
                    num8 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num8);
                    i |= 64;
                    break;
                case 7:
                    num9 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num9);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new o1h(i, num2, num3, num4, num5, num6, num7, num8, num9, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o1h o1hVar = (o1h) obj;
        o1hVar.getClass();
        Integer num = o1hVar.i;
        Integer num2 = o1hVar.h;
        Integer num3 = o1hVar.g;
        Integer num4 = o1hVar.f;
        Integer num5 = o1hVar.e;
        Integer num6 = o1hVar.d;
        Integer num7 = o1hVar.c;
        Integer num8 = o1hVar.b;
        Integer num9 = o1hVar.f24480a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num9 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num9);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
