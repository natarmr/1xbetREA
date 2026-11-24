package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jwm0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jwm0 f17258a;
    private static final ugi0 descriptor;

    static {
        jwm0 jwm0Var = new jwm0();
        f17258a = jwm0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.games.SubGameScoresResponse", jwm0Var, 6);
        zna0Var.j("fullScore", true);
        zna0Var.j("extendedScore", true);
        zna0Var.j("periodScores", true);
        zna0Var.j("fullScoreDetail", true);
        zna0Var.j("subScore", true);
        zna0Var.j("serve", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(dso.f6620a), mrv.j0((jiy) lwm0.g[2].getValue()), mrv.j0(obr.f24996a), mrv.j0(kzm0.f19159a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lwm0.g;
        boolean z = true;
        int i = 0;
        String str = null;
        hso hsoVar = null;
        List list = null;
        sbr sbrVar = null;
        qzm0 qzm0Var = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    hsoVar = (hso) bldVarA.e(ugi0Var, 1, dso.f6620a, hsoVar);
                    i |= 2;
                    break;
                case 2:
                    list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    sbrVar = (sbr) bldVarA.e(ugi0Var, 3, obr.f24996a, sbrVar);
                    i |= 8;
                    break;
                case 4:
                    qzm0Var = (qzm0) bldVarA.e(ugi0Var, 4, kzm0.f19159a, qzm0Var);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new lwm0(i, str, hsoVar, list, sbrVar, qzm0Var, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lwm0 lwm0Var = (lwm0) obj;
        lwm0Var.getClass();
        Integer num = lwm0Var.f;
        qzm0 qzm0Var = lwm0Var.e;
        sbr sbrVar = lwm0Var.d;
        List list = lwm0Var.c;
        hso hsoVar = lwm0Var.b;
        String str = lwm0Var.f20772a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = lwm0.g;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || hsoVar != null) {
            cldVarA.p(ugi0Var, 1, dso.f6620a, hsoVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || sbrVar != null) {
            cldVarA.p(ugi0Var, 3, obr.f24996a, sbrVar);
        }
        if (cldVarA.u(ugi0Var) || qzm0Var != null) {
            cldVarA.p(ugi0Var, 4, kzm0.f19159a, qzm0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
