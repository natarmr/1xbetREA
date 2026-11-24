package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vag implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vag f37085a;
    private static final ugi0 descriptor;

    static {
        vag vagVar = new vag();
        f37085a = vagVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.calendar.impl.data.cyber.model.CyberCalendarTournamentResponse", vagVar, 14);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("subSportId", true);
        zna0Var.j("feedId", true);
        zna0Var.j("name", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("location", true);
        zna0Var.j("prizePool", true);
        zna0Var.j("tier", true);
        zna0Var.j("teams", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("beginAtStamp", true);
        zna0Var.j("endAtStamp", true);
        zna0Var.j("globalId", true);
        zna0Var.j("lngSideLeft", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = xag.o;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xag.o;
        Long l2 = null;
        Long l3 = null;
        String str = null;
        List list = null;
        Long l4 = null;
        Integer num = null;
        int i = 0;
        Boolean bool = null;
        Long l5 = null;
        Long l6 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l7 = null;
        boolean z = true;
        Long l8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l8;
                    z = false;
                    l3 = l3;
                    l6 = l6;
                    l8 = l;
                    l2 = l2;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l8);
                    i |= 1;
                    l5 = l5;
                    l3 = l3;
                    l6 = l6;
                    l8 = l;
                    l2 = l2;
                    break;
                case 1:
                    l2 = l2;
                    l5 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l5);
                    i |= 2;
                    l6 = l6;
                    l2 = l2;
                    break;
                case 2:
                    l2 = l2;
                    l6 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l6);
                    i |= 4;
                    l5 = l5;
                    l2 = l2;
                    break;
                case 3:
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 6:
                    l7 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l7);
                    i |= 64;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 7:
                    num = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num);
                    i |= 128;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 8:
                    list = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
                    i |= 256;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 9:
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i |= 512;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 10:
                    l3 = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l3);
                    i |= 1024;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 11:
                    l2 = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l2);
                    i |= 2048;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 12:
                    l4 = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l4);
                    i |= 4096;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 13:
                    bool = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool);
                    i |= 8192;
                    l5 = l5;
                    l6 = l6;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l9 = l2;
        Long l10 = l8;
        bldVarA.c(ugi0Var);
        return new xag(i, l10, l5, l6, str2, str3, str4, l7, num, list, str, l3, l9, l4, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xag xagVar = (xag) obj;
        xagVar.getClass();
        Boolean bool = xagVar.n;
        Long l = xagVar.m;
        Long l2 = xagVar.l;
        Long l3 = xagVar.k;
        String str = xagVar.j;
        List list = xagVar.i;
        Integer num = xagVar.h;
        Long l4 = xagVar.g;
        String str2 = xagVar.f;
        String str3 = xagVar.e;
        String str4 = xagVar.d;
        Long l5 = xagVar.c;
        Long l6 = xagVar.b;
        Long l7 = xagVar.f40552a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xag.o;
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
