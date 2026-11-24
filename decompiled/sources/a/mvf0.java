package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mvf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mvf0 f22454a;
    private static final ugi0 descriptor;

    static {
        mvf0 mvf0Var = new mvf0();
        f22454a = mvf0Var;
        zna0 zna0Var = new zna0("org.xplatform.responsible_game.impl.data.response.rules.ResponsibleRulesInfoItemResponse", mvf0Var, 4);
        zna0Var.j("title", true);
        zna0Var.j(ParameterNames.INFO, true);
        zna0Var.j("descr", true);
        zna0Var.j("href", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ovf0.e;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(ysm0Var), mrv.j0(gvf0.f11972a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ovf0.e;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        ivf0 ivf0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                ivf0Var = (ivf0) bldVarA.e(ugi0Var, 3, gvf0.f11972a, ivf0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ovf0(i, str, list, str2, ivf0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ovf0 ovf0Var = (ovf0) obj;
        ovf0Var.getClass();
        ivf0 ivf0Var = ovf0Var.d;
        String str = ovf0Var.c;
        List list = ovf0Var.b;
        String str2 = ovf0Var.f25923a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ovf0.e;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || ivf0Var != null) {
            cldVarA.p(ugi0Var, 3, gvf0.f11972a, ivf0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
