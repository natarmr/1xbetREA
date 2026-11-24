package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g8h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g8h f10863a;
    private static final ugi0 descriptor;

    static {
        g8h g8hVar = new g8h();
        f10863a = g8hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.CyberMatchTeamPlayerResponse", g8hVar, 16);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("heroId", true);
        zna0Var.j("heroName", true);
        zna0Var.j("heroImageS3", true);
        zna0Var.j("gpm", true);
        zna0Var.j("xpm", true);
        zna0Var.j("kills", true);
        zna0Var.j("deaths", true);
        zna0Var.j("assists", true);
        zna0Var.j("items", true);
        zna0Var.j("abilities", true);
        zna0Var.j("neutralItems", true);
        zna0Var.j("supportItems", true);
        zna0Var.j("killTargets", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = i8h.q;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0((jiy) a8zVarArr[12].getValue()), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0((jiy) a8zVarArr[15].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        Long l2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = i8h.q;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List list2 = null;
        Integer num4 = null;
        int i = 0;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        Long l3 = null;
        String str = null;
        String str2 = null;
        Integer num5 = null;
        boolean z = true;
        Long l4 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l2 = l4;
                    z = false;
                    num = num;
                    str = str;
                    l4 = l2;
                    list = list;
                    break;
                case 0:
                    l2 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l4);
                    i |= 1;
                    num = num;
                    l3 = l3;
                    str = str;
                    l4 = l2;
                    list = list;
                    break;
                case 1:
                    l = l3;
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i |= 2;
                    str4 = str4;
                    l3 = l;
                    list = list;
                    str = str;
                    break;
                case 2:
                    l = l3;
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i |= 4;
                    l3 = l;
                    list = list;
                    str = str;
                    break;
                case 3:
                    list = list;
                    str = str;
                    l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                    i |= 8;
                    list = list;
                    str = str;
                    break;
                case 4:
                    list = list;
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    i |= 16;
                    l3 = l3;
                    list = list;
                    break;
                case 5:
                    str2 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str2);
                    i |= 32;
                    l3 = l3;
                    str = str;
                    break;
                case 6:
                    num5 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num5);
                    i |= 64;
                    l3 = l3;
                    str = str;
                    break;
                case 7:
                    num4 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num4);
                    i |= 128;
                    l3 = l3;
                    str = str;
                    break;
                case 8:
                    num3 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num3);
                    i |= 256;
                    l3 = l3;
                    str = str;
                    break;
                case 9:
                    num2 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num2);
                    i |= 512;
                    l3 = l3;
                    str = str;
                    break;
                case 10:
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i |= 1024;
                    l3 = l3;
                    str = str;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    l3 = l3;
                    str = str;
                    break;
                case 12:
                    list2 = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list2);
                    i |= 4096;
                    l3 = l3;
                    str = str;
                    break;
                case 13:
                    list3 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list3);
                    i |= 8192;
                    l3 = l3;
                    str = str;
                    break;
                case 14:
                    list4 = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list4);
                    i |= 16384;
                    l3 = l3;
                    str = str;
                    break;
                case 15:
                    list5 = (List) bldVarA.e(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list5);
                    i |= 32768;
                    l3 = l3;
                    str = str;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list6 = list;
        String str5 = str;
        bldVarA.c(ugi0Var);
        return new i8h(i, l4, str3, str4, l3, str5, str2, num5, num4, num3, num2, num, list6, list2, list3, list4, list5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        i8h i8hVar = (i8h) obj;
        i8hVar.getClass();
        List list = i8hVar.p;
        List list2 = i8hVar.o;
        List list3 = i8hVar.n;
        List list4 = i8hVar.m;
        List list5 = i8hVar.l;
        Integer num = i8hVar.k;
        Integer num2 = i8hVar.j;
        Integer num3 = i8hVar.i;
        Integer num4 = i8hVar.h;
        Integer num5 = i8hVar.g;
        String str = i8hVar.f;
        String str2 = i8hVar.e;
        Long l = i8hVar.d;
        String str3 = i8hVar.c;
        String str4 = i8hVar.b;
        Long l2 = i8hVar.f14337a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = i8h.q;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
