package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ax4 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ax4 f1606a;
    private static final ugi0 descriptor;

    static {
        ax4 ax4Var = new ax4();
        f1606a = ax4Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.history.data.model.autobet.AutoBetInfoByDateRequest", ax4Var, 7);
        zna0Var.j("Language", false);
        zna0Var.j("CfView", false);
        zna0Var.j("BonusUserId", false);
        zna0Var.j("AutoBetStatuses", false);
        zna0Var.j("DateFrom", false);
        zna0Var.j("DateTo", false);
        zna0Var.j("SortVers", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = cx4.h;
        okx okxVar = okx.f25427a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{ysm0.f43175a, okxVar, s710Var, a8zVarArr[3].getValue(), s710Var, s710Var, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = cx4.h;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        List list = null;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    jR = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    jR2 = bldVarA.r(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jR3 = bldVarA.r(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iJ2 = bldVarA.j(ugi0Var, 6);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new cx4(i, strX, iJ, jR, list, jR2, jR3, iJ2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cx4 cx4Var = (cx4) obj;
        cx4Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = cx4.h;
        cldVarA.z(ugi0Var, 0, cx4Var.f5107a);
        cldVarA.i(1, cx4Var.b, ugi0Var);
        cldVarA.n(ugi0Var, 2, cx4Var.c);
        cldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), cx4Var.d);
        cldVarA.n(ugi0Var, 4, cx4Var.e);
        cldVarA.n(ugi0Var, 5, cx4Var.f);
        cldVarA.i(6, cx4Var.g, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
