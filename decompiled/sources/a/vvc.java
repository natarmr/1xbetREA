package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vvc implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vvc f38091a;
    private static final ugi0 descriptor;

    static {
        vvc vvcVar = new vvc();
        f38091a = vvcVar;
        zna0 zna0Var = new zna0("org.xplatform.banners.impl.data.models.CmsBannerResponse", vvcVar, 13);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("mainImage", true);
        zna0Var.j("previewImage", true);
        zna0Var.j("bigSquareImage", true);
        zna0Var.j("verticalImage", true);
        zna0Var.j("horizontalImage", true);
        zna0Var.j("squareImage", true);
        zna0Var.j("title", true);
        zna0Var.j("typeId", true);
        zna0Var.j("header", true);
        zna0Var.j("subHeader", true);
        zna0Var.j(RemoteMessageConst.Notification.CONTENT, true);
        zna0Var.j("deepLink", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        int i = 0;
        Integer num2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str2 = str2;
                    str = str;
                    break;
                case 0:
                    num2 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    str2 = str2;
                    str = str;
                    break;
                case 1:
                    str = str;
                    str5 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str5);
                    i |= 2;
                    num2 = num2;
                    str = str;
                    break;
                case 2:
                    str6 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str6);
                    i |= 4;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 3:
                    str7 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str7);
                    i |= 8;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 4:
                    str8 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str8);
                    i |= 16;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 5:
                    str9 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str9);
                    i |= 32;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 6:
                    str10 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str10);
                    i |= 64;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 7:
                    str11 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str11);
                    i |= 128;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 9:
                    str3 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str3);
                    i |= 512;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 10:
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i |= 1024;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    num2 = num2;
                    str5 = str5;
                    break;
                case 12:
                    str4 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str4);
                    i |= 4096;
                    num2 = num2;
                    str5 = str5;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str12 = str2;
        bldVarA.c(ugi0Var);
        return new xvc(i, num2, str5, str6, str7, str8, str9, str10, str11, num, str3, str12, str, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xvc xvcVar = (xvc) obj;
        xvcVar.getClass();
        String str = xvcVar.m;
        String str2 = xvcVar.l;
        String str3 = xvcVar.k;
        String str4 = xvcVar.j;
        Integer num = xvcVar.i;
        String str5 = xvcVar.h;
        String str6 = xvcVar.g;
        String str7 = xvcVar.f;
        String str8 = xvcVar.e;
        String str9 = xvcVar.d;
        String str10 = xvcVar.c;
        String str11 = xvcVar.b;
        Integer num2 = xvcVar.f41552a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
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
        cldVarA.c(ugi0Var);
    }
}
