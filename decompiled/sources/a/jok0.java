package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jok0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jok0 f16862a;
    private static final ugi0 descriptor;

    static {
        jok0 jok0Var = new jok0();
        f16862a = jok0Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.api.main.domain.eventinfo.model.SpecialEventInfoModel", jok0Var, 21);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("title", false);
        zna0Var.j("dateStart", false);
        zna0Var.j("dateEnd", false);
        zna0Var.j("eventStyle", false);
        zna0Var.j("sportId", false);
        zna0Var.j("subSportId", false);
        zna0Var.j("imageFromStatic", false);
        zna0Var.j("hasFinals", false);
        zna0Var.j("scheduleContentOrderIds", false);
        zna0Var.j("myGamesContentOrderIds", false);
        zna0Var.j("statisticContentOrderIds", false);
        zna0Var.j("tournamentContentOrderIds", false);
        zna0Var.j("customSportIcon", false);
        zna0Var.j("customChampIcon", false);
        zna0Var.j("topIcon", false);
        zna0Var.j("bannerCategoryId", false);
        zna0Var.j("hasTimer", false);
        zna0Var.j("socialNets", false);
        zna0Var.j("location", false);
        zna0Var.j("overrideImagesId", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = lok0.v;
        okx okxVar = okx.f25427a;
        ysm0 ysm0Var = ysm0.f43175a;
        s710 s710Var = s710.f31729a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{okxVar, ysm0Var, s710Var, s710Var, a8zVarArr[4].getValue(), s710Var, s710Var, sm8Var, sm8Var, a8zVarArr[9].getValue(), a8zVarArr[10].getValue(), a8zVarArr[11].getValue(), a8zVarArr[12].getValue(), sm8Var, sm8Var, sm8Var, okxVar, sm8Var, mrv.j0((jiy) a8zVarArr[18].getValue()), a8zVarArr[19].getValue(), ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        int i2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lok0.v;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        long jR4 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        oho ohoVar = null;
        List list6 = null;
        int i3 = 0;
        int iJ = 0;
        String strX = null;
        boolean zB = false;
        boolean zB2 = false;
        boolean z = true;
        boolean zB3 = false;
        boolean zB4 = false;
        boolean zB5 = false;
        int iJ2 = 0;
        boolean zB6 = false;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    strX = strX;
                    z = false;
                    strX = strX;
                    break;
                case 0:
                    strX = strX;
                    i3 |= 1;
                    iJ = bldVarA.j(ugi0Var, 0);
                    strX = strX;
                    break;
                case 1:
                    iJ = iJ;
                    strX = bldVarA.x(ugi0Var, 1);
                    i3 |= 2;
                    iJ = iJ;
                    break;
                case 2:
                    iJ = iJ;
                    jR = bldVarA.r(ugi0Var, 2);
                    i3 |= 4;
                    iJ = iJ;
                    break;
                case 3:
                    iJ = iJ;
                    jR2 = bldVarA.r(ugi0Var, 3);
                    i3 |= 8;
                    iJ = iJ;
                    break;
                case 4:
                    iJ = iJ;
                    strX = strX;
                    ohoVar = (oho) bldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), ohoVar);
                    i3 |= 16;
                    iJ = iJ;
                    strX = strX;
                    break;
                case 5:
                    iJ = iJ;
                    jR3 = bldVarA.r(ugi0Var, 5);
                    i3 |= 32;
                    iJ = iJ;
                    break;
                case 6:
                    iJ = iJ;
                    jR4 = bldVarA.r(ugi0Var, 6);
                    i3 |= 64;
                    iJ = iJ;
                    break;
                case 7:
                    iJ = iJ;
                    zB = bldVarA.B(ugi0Var, 7);
                    i3 |= 128;
                    iJ = iJ;
                    break;
                case 8:
                    iJ = iJ;
                    zB2 = bldVarA.B(ugi0Var, 8);
                    i3 |= 256;
                    iJ = iJ;
                    break;
                case 9:
                    iJ = iJ;
                    strX = strX;
                    list6 = (List) bldVarA.m(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list6);
                    i3 |= 512;
                    iJ = iJ;
                    strX = strX;
                    break;
                case 10:
                    iJ = iJ;
                    strX = strX;
                    list4 = (List) bldVarA.m(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list4);
                    i3 |= 1024;
                    iJ = iJ;
                    strX = strX;
                    break;
                case 11:
                    iJ = iJ;
                    strX = strX;
                    list3 = (List) bldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list3);
                    i3 |= 2048;
                    iJ = iJ;
                    strX = strX;
                    break;
                case 12:
                    iJ = iJ;
                    strX = strX;
                    list2 = (List) bldVarA.m(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list2);
                    i3 |= 4096;
                    iJ = iJ;
                    strX = strX;
                    break;
                case 13:
                    iJ = iJ;
                    zB3 = bldVarA.B(ugi0Var, 13);
                    i3 |= 8192;
                    iJ = iJ;
                    break;
                case 14:
                    iJ = iJ;
                    zB4 = bldVarA.B(ugi0Var, 14);
                    i3 |= 16384;
                    iJ = iJ;
                    break;
                case 15:
                    zB5 = bldVarA.B(ugi0Var, 15);
                    i = 32768;
                    i3 |= i;
                    iJ = iJ;
                    break;
                case 16:
                    iJ2 = bldVarA.j(ugi0Var, 16);
                    i = 65536;
                    i3 |= i;
                    iJ = iJ;
                    break;
                case 17:
                    zB6 = bldVarA.B(ugi0Var, 17);
                    i = 131072;
                    i3 |= i;
                    iJ = iJ;
                    break;
                case 18:
                    list = (List) bldVarA.e(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), list);
                    i2 = 262144;
                    i3 |= i2;
                    iJ = iJ;
                    strX = strX;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    list5 = (List) bldVarA.m(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list5);
                    i2 = 524288;
                    i3 |= i2;
                    iJ = iJ;
                    strX = strX;
                    break;
                case 20:
                    strX2 = bldVarA.x(ugi0Var, 20);
                    i = 1048576;
                    i3 |= i;
                    iJ = iJ;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new lok0(i3, iJ, strX, jR, jR2, ohoVar, jR3, jR4, zB, zB2, list6, list4, list3, list2, zB3, zB4, zB5, iJ2, zB6, list, list5, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lok0 lok0Var = (lok0) obj;
        lok0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = lok0.v;
        cldVarA.i(0, lok0Var.f20396a, ugi0Var);
        cldVarA.z(ugi0Var, 1, lok0Var.b);
        cldVarA.n(ugi0Var, 2, lok0Var.c);
        cldVarA.n(ugi0Var, 3, lok0Var.d);
        cldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), lok0Var.e);
        cldVarA.n(ugi0Var, 5, lok0Var.f);
        cldVarA.n(ugi0Var, 6, lok0Var.g);
        cldVarA.x(ugi0Var, 7, lok0Var.h);
        cldVarA.x(ugi0Var, 8, lok0Var.i);
        cldVarA.m(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), lok0Var.j);
        cldVarA.m(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), lok0Var.k);
        cldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), lok0Var.l);
        cldVarA.m(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), lok0Var.m);
        cldVarA.x(ugi0Var, 13, lok0Var.n);
        cldVarA.x(ugi0Var, 14, lok0Var.o);
        cldVarA.x(ugi0Var, 15, lok0Var.p);
        cldVarA.i(16, lok0Var.q, ugi0Var);
        cldVarA.x(ugi0Var, 17, lok0Var.r);
        cldVarA.p(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), lok0Var.s);
        cldVarA.m(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), lok0Var.t);
        cldVarA.z(ugi0Var, 20, lok0Var.u);
        cldVarA.c(ugi0Var);
    }
}
