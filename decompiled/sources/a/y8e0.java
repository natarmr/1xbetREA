package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y8e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y8e0 f42191a;
    private static final ugi0 descriptor;

    static {
        y8e0 y8e0Var = new y8e0();
        f42191a = y8e0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.rating.impl.rating_statistic.data.model.RatingTitleColResponse", y8e0Var, 6);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("isOffset", true);
        zna0Var.j("group", true);
        zna0Var.j("title", true);
        zna0Var.j("rowSpan", true);
        zna0Var.j("colSpan", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(sm8.f32432a), mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Boolean bool = null;
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num4);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new a9e0(i, num, bool, num2, str, num3, num4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a9e0 a9e0Var = (a9e0) obj;
        a9e0Var.getClass();
        Integer num = a9e0Var.f;
        Integer num2 = a9e0Var.e;
        String str = a9e0Var.d;
        Integer num3 = a9e0Var.c;
        Boolean bool = a9e0Var.b;
        Integer num4 = a9e0Var.f472a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
