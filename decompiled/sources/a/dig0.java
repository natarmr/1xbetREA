package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dig0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dig0 f6137a;
    private static final ugi0 descriptor;

    static {
        dig0 dig0Var = new dig0();
        f6137a = dig0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.RpcProps", dig0Var, 2);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("props", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0((jiy) fig0.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fig0.c;
        boolean z = true;
        int i = 0;
        String str = null;
        Map map = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                map = (Map) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new fig0(i, str, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fig0 fig0Var = (fig0) obj;
        fig0Var.getClass();
        Map map = fig0Var.b;
        String str = fig0Var.f9586a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fig0.c;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
