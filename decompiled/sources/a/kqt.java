package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kqt implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kqt f18736a;
    private static final ugi0 descriptor;

    static {
        kqt kqtVar = new kqt();
        f18736a = kqtVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.history.GetAutoBetInfoNewHistoryByDatesRequest", kqtVar, 7);
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
        a8z[] a8zVarArr = mqt.h;
        okx okxVar = okx.f25427a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{ysm0.f43175a, okxVar, mrv.j0(s710Var), a8zVarArr[3].getValue(), s710Var, s710Var, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mqt.h;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        Long l = null;
        List list = null;
        long jR = 0;
        long jR2 = 0;
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
                    l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    jR = bldVarA.r(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jR2 = bldVarA.r(ugi0Var, 5);
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
        return new mqt(i, strX, iJ, l, list, jR, jR2, iJ2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mqt mqtVar = (mqt) obj;
        mqtVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mqt.h;
        cldVarA.z(ugi0Var, 0, mqtVar.f22240a);
        cldVarA.i(1, mqtVar.b, ugi0Var);
        cldVarA.p(ugi0Var, 2, s710.f31729a, mqtVar.c);
        cldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), mqtVar.d);
        cldVarA.n(ugi0Var, 4, mqtVar.e);
        cldVarA.n(ugi0Var, 5, mqtVar.f);
        cldVarA.i(6, mqtVar.g, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
