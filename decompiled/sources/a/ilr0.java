package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ilr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ilr0 f14993a;
    private static final ugi0 descriptor;

    static {
        ilr0 ilr0Var = new ilr0();
        f14993a = ilr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_bet.tirage.data.model.TotoBetTirageItemResponse", ilr0Var, 12);
        zna0Var.j("TiragNumber", true);
        zna0Var.j("TiragStatus", true);
        zna0Var.j("StringTiragStatus", true);
        zna0Var.j("Jackpot", true);
        zna0Var.j("Pool", true);
        zna0Var.j("PrizeFund", true);
        zna0Var.j("CountBets", true);
        zna0Var.j("CountApproved", true);
        zna0Var.j("CountVariants", true);
        zna0Var.j("CountUnique", true);
        zna0Var.j("TimeUntilEndReception", true);
        zna0Var.j("ReportFiles", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = klr0.m;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710.f31729a), mrv.j0((jiy) a8zVarArr[11].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = klr0.m;
        List list = null;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        boolean z = true;
        Integer num3 = null;
        int i = 0;
        Integer num4 = null;
        Integer num5 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    list = list;
                    break;
                case 0:
                    num4 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num4);
                    i |= 1;
                    z = z;
                    list = list;
                    break;
                case 1:
                    num5 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num5);
                    i |= 2;
                    z = z;
                    num4 = num4;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    z = z;
                    num4 = num4;
                    break;
                case 3:
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    z = z;
                    num4 = num4;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    z = z;
                    num4 = num4;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    z = z;
                    num4 = num4;
                    break;
                case 6:
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i |= 64;
                    z = z;
                    num4 = num4;
                    break;
                case 7:
                    num3 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num3);
                    i |= 128;
                    z = z;
                    num4 = num4;
                    break;
                case 8:
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i |= 256;
                    z = z;
                    num4 = num4;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    z = z;
                    num4 = num4;
                    break;
                case 10:
                    l = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l);
                    i |= 1024;
                    z = z;
                    num4 = num4;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    z = z;
                    num4 = num4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new klr0(i, num4, num5, str, str2, str3, str4, num6, num3, num2, num, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        klr0 klr0Var = (klr0) obj;
        klr0Var.getClass();
        List list = klr0Var.l;
        Long l = klr0Var.k;
        Integer num = klr0Var.j;
        Integer num2 = klr0Var.i;
        Integer num3 = klr0Var.h;
        Integer num4 = klr0Var.g;
        String str = klr0Var.f;
        String str2 = klr0Var.e;
        String str3 = klr0Var.d;
        String str4 = klr0Var.c;
        Integer num5 = klr0Var.b;
        Integer num6 = klr0Var.f18506a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = klr0.m;
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
