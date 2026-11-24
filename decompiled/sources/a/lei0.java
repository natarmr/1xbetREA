package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lei0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lei0 f19904a;
    private static final ugi0 descriptor;

    static {
        lei0 lei0Var = new lei0();
        f19904a = lei0Var;
        zna0 zna0Var = new zna0("TextMessage", lei0Var, 5);
        zna0Var.j(ParameterNames.TEXT, true);
        zna0Var.j("command", true);
        zna0Var.j("createdDate", false);
        zna0Var.j("keyForLocalStore", false);
        zna0Var.j("sendWithError", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(z7d.f43913a), mrv.j0(yej.f42489a), ysm0Var, mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        b8d b8dVar = null;
        Date date = null;
        String strX = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                b8dVar = (b8d) bldVarA.e(ugi0Var, 1, z7d.f43913a, b8dVar);
                i |= 2;
            } else if (iF == 2) {
                date = (Date) bldVarA.e(ugi0Var, 2, yej.f42489a, date);
                i |= 4;
            } else if (iF == 3) {
                strX = bldVarA.x(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new nei0(i, str, b8dVar, date, strX, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nei0 nei0Var = (nei0) obj;
        nei0Var.getClass();
        b8d b8dVar = nei0Var.c;
        String str = nei0Var.b;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || b8dVar != null) {
            cldVarA.p(ugi0Var, 1, z7d.f43913a, b8dVar);
        }
        cldVarA.p(ugi0Var, 2, yej.f42489a, nei0Var.d);
        cldVarA.z(ugi0Var, 3, nei0Var.e);
        cldVarA.p(ugi0Var, 4, sm8.f32432a, nei0Var.f);
        cldVarA.c(ugi0Var);
    }
}
