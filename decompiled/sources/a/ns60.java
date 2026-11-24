package a;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ns60 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ns60 f24039a;
    private static final ugi0 descriptor;

    static {
        ns60 ns60Var = new ns60();
        f24039a = ns60Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.models.OneXGamesByGameIdsNotAuthRequest", ns60Var, 6);
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
        a8z[] a8zVarArr = ps60.g;
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, ysm0.f43175a, okxVar, okxVar, okxVar, a8zVarArr[5].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ps60.g;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        String strX = null;
        Set set = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iJ = bldVarA.j(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iJ2 = bldVarA.j(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iJ3 = bldVarA.j(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ4 = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    set = (Set) bldVarA.m(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), set);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new ps60(i, iJ, strX, iJ2, iJ3, iJ4, set);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ps60 ps60Var = (ps60) obj;
        ps60Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ps60.g;
        cldVarA.i(0, ps60Var.f27500a, ugi0Var);
        cldVarA.z(ugi0Var, 1, ps60Var.b);
        cldVarA.i(2, ps60Var.c, ugi0Var);
        cldVarA.i(3, ps60Var.d, ugi0Var);
        cldVarA.i(4, ps60Var.e, ugi0Var);
        cldVarA.m(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), ps60Var.f);
        cldVarA.c(ugi0Var);
    }
}
