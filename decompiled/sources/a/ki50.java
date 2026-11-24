package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ki50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ki50 f18321a;
    private static final ugi0 descriptor;

    static {
        ki50 ki50Var = new ki50();
        f18321a = ki50Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.main.alt_design_l.data.nearest_game_details.model.NearestGameDetailsTableStatItemResponse", ki50Var, 4);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("s1", true);
        zna0Var.j("s2", true);
        zna0Var.j("name", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new mi50(i, l, str, str2, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mi50 mi50Var = (mi50) obj;
        mi50Var.getClass();
        String str = mi50Var.d;
        String str2 = mi50Var.c;
        String str3 = mi50Var.b;
        Long l = mi50Var.f21827a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
