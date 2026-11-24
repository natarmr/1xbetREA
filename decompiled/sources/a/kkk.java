package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kkk implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kkk f18444a;
    private static final ugi0 descriptor;

    static {
        kkk kkkVar = new kkk();
        f18444a = kkkVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.dice_poker.DicePokerResponse", kkkVar, 7);
        zna0Var.j("P1", true);
        zna0Var.j("PC1", true);
        zna0Var.j("P2", true);
        zna0Var.j("PC2", true);
        zna0Var.j("STATE", true);
        zna0Var.j("C1", true);
        zna0Var.j("C2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    i |= 4;
                    break;
                case 3:
                    l4 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l4);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    break;
                case 5:
                    str = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str2);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new mkk(i, num, l, l2, l3, l4, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mkk mkkVar = (mkk) obj;
        mkkVar.getClass();
        String str = mkkVar.g;
        String str2 = mkkVar.f;
        Integer num = mkkVar.e;
        Long l = mkkVar.d;
        Long l2 = mkkVar.c;
        Long l3 = mkkVar.b;
        Long l4 = mkkVar.f21947a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
