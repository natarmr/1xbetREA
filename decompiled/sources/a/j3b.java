package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j3b implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j3b f15822a;
    private static final ugi0 descriptor;

    static {
        j3b j3bVar = new j3b();
        f15822a = j3bVar;
        zna0 zna0Var = new zna0("org.xplatform.banners.impl.data.models.CategoryBannerResponse", j3bVar, 12);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("mainImage", true);
        zna0Var.j("previewImage", true);
        zna0Var.j("bigSquareImage", true);
        zna0Var.j("verticalImage", true);
        zna0Var.j("horizontalImage", true);
        zna0Var.j("squareImage", true);
        zna0Var.j("title", true);
        zna0Var.j("typeId", true);
        zna0Var.j("deepLink", true);
        zna0Var.j("header", true);
        zna0Var.j("subHeader", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str = str;
                    break;
                case 0:
                    num2 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    z = z;
                    str = str;
                    break;
                case 1:
                    str4 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str4);
                    i |= 2;
                    z = z;
                    num2 = num2;
                    break;
                case 2:
                    str5 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str5);
                    i |= 4;
                    z = z;
                    num2 = num2;
                    break;
                case 3:
                    str6 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str6);
                    i |= 8;
                    z = z;
                    num2 = num2;
                    break;
                case 4:
                    str7 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str7);
                    i |= 16;
                    z = z;
                    num2 = num2;
                    break;
                case 5:
                    str8 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str8);
                    i |= 32;
                    z = z;
                    num2 = num2;
                    break;
                case 6:
                    str9 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str9);
                    i |= 64;
                    z = z;
                    num2 = num2;
                    break;
                case 7:
                    str10 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str10);
                    i |= 128;
                    z = z;
                    num2 = num2;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    z = z;
                    num2 = num2;
                    break;
                case 9:
                    str3 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str3);
                    i |= 512;
                    z = z;
                    num2 = num2;
                    break;
                case 10:
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i |= 1024;
                    z = z;
                    num2 = num2;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    z = z;
                    num2 = num2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new l3b(i, num2, str4, str5, str6, str7, str8, str9, str10, num, str3, str2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l3b l3bVar = (l3b) obj;
        l3bVar.getClass();
        String str = l3bVar.l;
        String str2 = l3bVar.k;
        String str3 = l3bVar.j;
        Integer num = l3bVar.i;
        String str4 = l3bVar.h;
        String str5 = l3bVar.g;
        String str6 = l3bVar.f;
        String str7 = l3bVar.e;
        String str8 = l3bVar.d;
        String str9 = l3bVar.c;
        String str10 = l3bVar.b;
        Integer num2 = l3bVar.f19350a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
