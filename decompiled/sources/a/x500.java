package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x500 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x500 f40290a;
    private static final ugi0 descriptor;

    static {
        x500 x500Var = new x500();
        f40290a = x500Var;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.data.model.LineGameEventResponse", x500Var, 5);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("player", true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("parameter", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        jiy jiyVarJ1 = mrv.j0(q9a0.f28338a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        jaa0 jaa0Var = null;
        Double d = null;
        String str = null;
        Double d2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                jaa0Var = (jaa0) bldVarA.e(ugi0Var, 1, q9a0.f28338a, jaa0Var);
                i |= 2;
            } else if (iF == 2) {
                d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                i |= 4;
            } else if (iF == 3) {
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new z500(i, num, jaa0Var, d, str, d2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z500 z500Var = (z500) obj;
        z500Var.getClass();
        Double d = z500Var.e;
        String str = z500Var.d;
        Double d2 = z500Var.c;
        jaa0 jaa0Var = z500Var.b;
        Integer num = z500Var.f43797a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || jaa0Var != null) {
            cldVarA.p(ugi0Var, 1, q9a0.f28338a, jaa0Var);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
