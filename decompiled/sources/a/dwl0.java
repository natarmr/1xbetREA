package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dwl0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dwl0 f6806a;
    private static final ugi0 descriptor;

    static {
        dwl0 dwl0Var = new dwl0();
        f6806a = dwl0Var;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.championship.data.stadium.model.StadiumInfoResponse", dwl0Var, 15);
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
        zna0Var.j("countryId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = mwl0.p;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        String str2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mwl0.p;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        List list = null;
        Integer num = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = true;
        String str14 = null;
        String str15 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str14;
                    z = false;
                    str4 = str4;
                    str10 = str10;
                    str14 = str;
                    str3 = str3;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str14);
                    i |= 1;
                    str4 = str4;
                    str9 = str9;
                    str10 = str10;
                    str14 = str;
                    str3 = str3;
                    break;
                case 1:
                    str2 = str10;
                    str15 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str15);
                    i |= 2;
                    str9 = str9;
                    str10 = str2;
                    str3 = str3;
                    break;
                case 2:
                    str2 = str10;
                    str9 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str9);
                    i |= 4;
                    str10 = str2;
                    str3 = str3;
                    break;
                case 3:
                    str3 = str3;
                    str10 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str10);
                    i |= 8;
                    str9 = str9;
                    str3 = str3;
                    break;
                case 4:
                    str11 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str11);
                    i |= 16;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 5:
                    str12 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str12);
                    i |= 32;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 6:
                    str13 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str13);
                    i |= 64;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 7:
                    str8 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str8);
                    i |= 128;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 8:
                    str6 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str6);
                    i |= 256;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 9:
                    str5 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str5);
                    i |= 512;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 10:
                    str4 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str4);
                    i |= 1024;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 11:
                    str3 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str3);
                    i |= 2048;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 12:
                    str7 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str7);
                    i |= 4096;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 13:
                    list = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
                    i |= 8192;
                    str9 = str9;
                    str10 = str10;
                    break;
                case 14:
                    num = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num);
                    i |= 16384;
                    str9 = str9;
                    str10 = str10;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str16 = str3;
        String str17 = str10;
        bldVarA.c(ugi0Var);
        return new mwl0(i, str14, str15, str9, str17, str11, str12, str13, str8, str6, str5, str4, str16, str7, list, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mwl0 mwl0Var = (mwl0) obj;
        mwl0Var.getClass();
        Integer num = mwl0Var.o;
        List list = mwl0Var.n;
        String str = mwl0Var.m;
        String str2 = mwl0Var.l;
        String str3 = mwl0Var.k;
        String str4 = mwl0Var.j;
        String str5 = mwl0Var.i;
        String str6 = mwl0Var.h;
        String str7 = mwl0Var.g;
        String str8 = mwl0Var.f;
        String str9 = mwl0Var.e;
        String str10 = mwl0Var.d;
        String str11 = mwl0Var.c;
        String str12 = mwl0Var.b;
        String str13 = mwl0Var.f22510a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mwl0.p;
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
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
