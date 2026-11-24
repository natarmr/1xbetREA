package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iwl0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iwl0 f15495a;
    private static final ugi0 descriptor;

    static {
        iwl0 iwl0Var = new iwl0();
        f15495a = iwl0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.StadiumInfoResponse.StadiumInfo", iwl0Var, 14);
        zna0Var.j("address", true);
        zna0Var.j("name", true);
        zna0Var.j("capacity", true);
        zna0Var.j("covering", true);
        zna0Var.j("city", true);
        zna0Var.j("architect", true);
        zna0Var.j("oldName", true);
        zna0Var.j("category", true);
        zna0Var.j("history", true);
        zna0Var.j("opened", true);
        zna0Var.j("zipCode", true);
        zna0Var.j("phone", true);
        zna0Var.j("website", true);
        zna0Var.j("images", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = kwl0.o;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[13].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = kwl0.o;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        List list = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = true;
        String str14 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str14;
                    z = false;
                    str3 = str3;
                    str9 = str9;
                    str14 = str;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str14);
                    i |= 1;
                    str8 = str8;
                    str3 = str3;
                    str9 = str9;
                    str14 = str;
                    str2 = str2;
                    break;
                case 1:
                    str9 = str9;
                    str8 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str8);
                    i |= 2;
                    str2 = str2;
                    str9 = str9;
                    break;
                case 2:
                    str2 = str2;
                    str9 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str9);
                    i |= 4;
                    str8 = str8;
                    str2 = str2;
                    break;
                case 3:
                    str10 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str10);
                    i |= 8;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 4:
                    str11 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str11);
                    i |= 16;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 5:
                    str12 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str12);
                    i |= 32;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 6:
                    str13 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str13);
                    i |= 64;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 7:
                    str7 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str7);
                    i |= 128;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 8:
                    str5 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str5);
                    i |= 256;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 9:
                    str4 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str4);
                    i |= 512;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 10:
                    str3 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str3);
                    i |= 1024;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 11:
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i |= 2048;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 12:
                    str6 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str6);
                    i |= 4096;
                    str8 = str8;
                    str9 = str9;
                    break;
                case 13:
                    list = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
                    i |= 8192;
                    str8 = str8;
                    str9 = str9;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str15 = str2;
        String str16 = str14;
        bldVarA.c(ugi0Var);
        return new kwl0(i, str16, str8, str9, str10, str11, str12, str13, str7, str5, str4, str3, str15, str6, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kwl0 kwl0Var = (kwl0) obj;
        kwl0Var.getClass();
        List list = kwl0Var.n;
        String str = kwl0Var.m;
        String str2 = kwl0Var.l;
        String str3 = kwl0Var.k;
        String str4 = kwl0Var.j;
        String str5 = kwl0Var.i;
        String str6 = kwl0Var.h;
        String str7 = kwl0Var.g;
        String str8 = kwl0Var.f;
        String str9 = kwl0Var.e;
        String str10 = kwl0Var.d;
        String str11 = kwl0Var.c;
        String str12 = kwl0Var.b;
        String str13 = kwl0Var.f19007a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = kwl0.o;
        if (cldVarA.u(ugi0Var) || str13 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str13);
        }
        if (cldVarA.u(ugi0Var) || str12 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str12);
        }
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
