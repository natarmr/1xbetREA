package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vhb0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vhb0 f37422a;
    private static final ugi0 descriptor;

    static {
        vhb0 vhb0Var = new vhb0();
        f37422a = vhb0Var;
        zna0 zna0Var = new zna0("org.xplatform.data.betting.searching.models.PopularSearchResponse.PopularTeamResponse", vhb0Var, 4);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("images", true);
        zna0Var.j("subSportId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = xhb0.e;
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xhb0.e;
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String str = null;
        List list = null;
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
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new xhb0(i, l, l2, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xhb0 xhb0Var = (xhb0) obj;
        xhb0Var.getClass();
        Long l = xhb0Var.d;
        List list = xhb0Var.c;
        String str = xhb0Var.b;
        Long l2 = xhb0Var.f40882a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xhb0.e;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
