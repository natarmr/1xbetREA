package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class srq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final srq0 f32692a;
    private static final ugi0 descriptor;

    static {
        srq0 srq0Var = new srq0();
        f32692a = srq0Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.medal_statistic.data.models.TitleRatingValueColResponse", srq0Var, 5);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("isOffset", true);
        zna0Var.j("title", true);
        zna0Var.j("rowSpan", true);
        zna0Var.j("colSpan", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(sm8.f32432a), mrv.j0(ysm0.f43175a), mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else if (iF == 3) {
                l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                l3 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l3);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new urq0(i, bool, l, l2, l3, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        urq0 urq0Var = (urq0) obj;
        urq0Var.getClass();
        Long l = urq0Var.e;
        Long l2 = urq0Var.d;
        String str = urq0Var.c;
        Boolean bool = urq0Var.b;
        Long l3 = urq0Var.f36177a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
