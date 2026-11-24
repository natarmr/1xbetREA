package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dla implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dla f6268a;
    private static final ugi0 descriptor;

    static {
        dla dlaVar = new dla();
        f6268a = dlaVar;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.data.model.CardResponse", dlaVar, 14);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("constId", true);
        zna0Var.j("startTs", true);
        zna0Var.j("countryId", true);
        zna0Var.j("sport", true);
        zna0Var.j("subSport", true);
        zna0Var.j("liga", true);
        zna0Var.j("opponent1", true);
        zna0Var.j("opponent2", true);
        zna0Var.j("event", true);
        zna0Var.j("advice", true);
        zna0Var.j("kind", true);
        zna0Var.j("scores", true);
        zna0Var.j("fullName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(bkl0.f2755a);
        jiy jiyVarJ5 = mrv.j0(k3n0.f17628a);
        jiy jiyVarJ6 = mrv.j0(hiz.f13138a);
        xhp0 xhp0Var = xhp0.f40906a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(xhp0Var), mrv.j0(xhp0Var), mrv.j0(fgo.f9501a), mrv.j0(w40.f38521a), mrv.j0(okxVar), mrv.j0(y5h0.f42046a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Integer num2 = null;
        y40 y40Var = null;
        aho ahoVar = null;
        g6h0 g6h0Var = null;
        hip0 hip0Var = null;
        int i = 0;
        String str = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        vkl0 vkl0Var = null;
        w3n0 w3n0Var = null;
        jiz jizVar = null;
        hip0 hip0Var2 = null;
        boolean z = true;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num6;
                    z = false;
                    y40Var = y40Var;
                    num4 = num4;
                    num6 = num;
                    num2 = num2;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num6);
                    i |= 1;
                    num3 = num3;
                    y40Var = y40Var;
                    num4 = num4;
                    num6 = num;
                    num2 = num2;
                    break;
                case 1:
                    num2 = num2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num3);
                    i |= 2;
                    num4 = num4;
                    num2 = num2;
                    break;
                case 2:
                    num2 = num2;
                    num4 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num4);
                    i |= 4;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 3:
                    num5 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num5);
                    i |= 8;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 4:
                    vkl0Var = (vkl0) bldVarA.e(ugi0Var, 4, bkl0.f2755a, vkl0Var);
                    i |= 16;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 5:
                    w3n0Var = (w3n0) bldVarA.e(ugi0Var, 5, k3n0.f17628a, w3n0Var);
                    i |= 32;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 6:
                    jizVar = (jiz) bldVarA.e(ugi0Var, 6, hiz.f13138a, jizVar);
                    i |= 64;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 7:
                    hip0Var2 = (hip0) bldVarA.e(ugi0Var, 7, xhp0.f40906a, hip0Var2);
                    i |= 128;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 8:
                    hip0Var = (hip0) bldVarA.e(ugi0Var, 8, xhp0.f40906a, hip0Var);
                    i |= 256;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 9:
                    ahoVar = (aho) bldVarA.e(ugi0Var, 9, fgo.f9501a, ahoVar);
                    i |= 512;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 10:
                    y40Var = (y40) bldVarA.e(ugi0Var, 10, w40.f38521a, y40Var);
                    i |= 1024;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 11:
                    num2 = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num2);
                    i |= 2048;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 12:
                    g6h0Var = (g6h0) bldVarA.e(ugi0Var, 12, y5h0.f42046a, g6h0Var);
                    i |= 4096;
                    num3 = num3;
                    num4 = num4;
                    break;
                case 13:
                    str = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str);
                    i |= 8192;
                    num3 = num3;
                    num4 = num4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num7 = num2;
        Integer num8 = num6;
        bldVarA.c(ugi0Var);
        return new fla(i, num8, num3, num4, num5, vkl0Var, w3n0Var, jizVar, hip0Var2, hip0Var, ahoVar, y40Var, num7, g6h0Var, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fla flaVar = (fla) obj;
        flaVar.getClass();
        String str = flaVar.n;
        g6h0 g6h0Var = flaVar.m;
        Integer num = flaVar.l;
        y40 y40Var = flaVar.k;
        aho ahoVar = flaVar.j;
        hip0 hip0Var = flaVar.i;
        hip0 hip0Var2 = flaVar.h;
        jiz jizVar = flaVar.g;
        w3n0 w3n0Var = flaVar.f;
        vkl0 vkl0Var = flaVar.e;
        Integer num2 = flaVar.d;
        Integer num3 = flaVar.c;
        Integer num4 = flaVar.b;
        Integer num5 = flaVar.f9728a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || vkl0Var != null) {
            cldVarA.p(ugi0Var, 4, bkl0.f2755a, vkl0Var);
        }
        if (cldVarA.u(ugi0Var) || w3n0Var != null) {
            cldVarA.p(ugi0Var, 5, k3n0.f17628a, w3n0Var);
        }
        if (cldVarA.u(ugi0Var) || jizVar != null) {
            cldVarA.p(ugi0Var, 6, hiz.f13138a, jizVar);
        }
        if (cldVarA.u(ugi0Var) || hip0Var2 != null) {
            cldVarA.p(ugi0Var, 7, xhp0.f40906a, hip0Var2);
        }
        if (cldVarA.u(ugi0Var) || hip0Var != null) {
            cldVarA.p(ugi0Var, 8, xhp0.f40906a, hip0Var);
        }
        if (cldVarA.u(ugi0Var) || ahoVar != null) {
            cldVarA.p(ugi0Var, 9, fgo.f9501a, ahoVar);
        }
        if (cldVarA.u(ugi0Var) || y40Var != null) {
            cldVarA.p(ugi0Var, 10, w40.f38521a, y40Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || g6h0Var != 0) {
            cldVarA.p(ugi0Var, 12, y5h0.f42046a, g6h0Var);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
