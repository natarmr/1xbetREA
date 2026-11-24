package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xst implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xst f41432a;
    private static final ugi0 descriptor;

    static {
        xst xstVar = new xst();
        f41432a = xstVar;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.request.GetBetInfoHistoryWithSummaryByGlobalChamp", xstVar, 11);
        zna0Var.j("Language", true);
        zna0Var.j("CfView", true);
        zna0Var.j("BonusUserId", true);
        zna0Var.j("Count", true);
        zna0Var.j("BetStatuses", true);
        zna0Var.j("LastBetId", true);
        zna0Var.j("CalculateSaleInfo", true);
        zna0Var.j("OnlyBetsForSale", true);
        zna0Var.j("PartnerId", true);
        zna0Var.j("CalculateSummaryInfo", true);
        zna0Var.j("GlobalChampId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = zst.l;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0((jiy) a8zVarArr[4].getValue());
        jiy jiyVarJ5 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(sm8Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = zst.l;
        String str = null;
        Boolean bool = null;
        Integer num = null;
        boolean z = true;
        Boolean bool2 = null;
        int i = 0;
        String str2 = null;
        Integer num2 = null;
        Long l = null;
        Integer num3 = null;
        List list = null;
        Long l2 = null;
        Boolean bool3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    l2 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l2);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool3);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool2);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new zst(i, str2, num2, l, num3, list, l2, bool3, bool2, num, bool, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zst zstVar = (zst) obj;
        zstVar.getClass();
        String str = zstVar.k;
        Boolean bool = zstVar.j;
        Integer num = zstVar.i;
        Boolean bool2 = zstVar.h;
        Boolean bool3 = zstVar.g;
        Long l = zstVar.f;
        List list = zstVar.e;
        Integer num2 = zstVar.d;
        Long l2 = zstVar.c;
        Integer num3 = zstVar.b;
        String str2 = zstVar.f44921a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zst.l;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
