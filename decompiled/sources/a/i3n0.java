package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i3n0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i3n0 f14106a;
    private static final ugi0 descriptor;

    static {
        i3n0 i3n0Var = new i3n0();
        f14106a = i3n0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.games.SubSportResponse", i3n0Var, 2);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new u3n0(i, num, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        u3n0 u3n0Var = (u3n0) obj;
        u3n0Var.getClass();
        String str = u3n0Var.b;
        Integer num = u3n0Var.f35005a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
