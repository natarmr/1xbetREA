package a;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ts60 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ts60 f34447a;
    private static final ugi0 descriptor;

    static {
        ts60 ts60Var = new ts60();
        f34447a = ts60Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.models.OneXGamesByGameIdsRequestOld", ts60Var, 7);
        zna0Var.j("UI", false);
        zna0Var.j("WH", false);
        zna0Var.j("LG", false);
        zna0Var.j("RF", false);
        zna0Var.j("GR", false);
        zna0Var.j("GEO", false);
        zna0Var.j("GIDS", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = vs60.h;
        okx okxVar = okx.f25427a;
        return new jiy[]{s710.f31729a, okxVar, ysm0.f43175a, okxVar, okxVar, okxVar, a8zVarArr[6].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = vs60.h;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        long jR = 0;
        Set set = null;
        String strX = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iJ2 = bldVarA.j(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ3 = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iJ4 = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    set = (Set) bldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), set);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new vs60(i, jR, iJ, strX, iJ2, iJ3, iJ4, set);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vs60 vs60Var = (vs60) obj;
        vs60Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = vs60.h;
        cldVarA.n(ugi0Var, 0, vs60Var.f37934a);
        cldVarA.i(1, vs60Var.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, vs60Var.c);
        cldVarA.i(3, vs60Var.d, ugi0Var);
        cldVarA.i(4, vs60Var.e, ugi0Var);
        cldVarA.i(5, vs60Var.f, ugi0Var);
        cldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), vs60Var.g);
        cldVarA.c(ugi0Var);
    }
}
