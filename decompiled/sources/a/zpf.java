package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zpf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zpf f44757a;
    private static final ugi0 descriptor;

    static {
        zpf zpfVar = new zpf();
        f44757a = zpfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.counterstrike.impl.data.model.duel.Cs2PlayerDuelResponse", zpfVar, 8);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("nick", true);
        zna0Var.j("name", true);
        zna0Var.j("age", true);
        zna0Var.j("country", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("team", true);
        zna0Var.j("stats", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(hqf.f13484a), mrv.j0(eqf.f8235a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        jqf jqfVar = null;
        gqf gqfVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    jqfVar = (jqf) bldVarA.e(ugi0Var, 6, hqf.f13484a, jqfVar);
                    i |= 64;
                    break;
                case 7:
                    gqfVar = (gqf) bldVarA.e(ugi0Var, 7, eqf.f8235a, gqfVar);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new bqf(i, l, str, str2, num, str3, str4, jqfVar, gqfVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bqf bqfVar = (bqf) obj;
        bqfVar.getClass();
        gqf gqfVar = bqfVar.h;
        jqf jqfVar = bqfVar.g;
        String str = bqfVar.f;
        String str2 = bqfVar.e;
        Integer num = bqfVar.d;
        String str3 = bqfVar.c;
        String str4 = bqfVar.b;
        Long l = bqfVar.f3026a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || jqfVar != null) {
            cldVarA.p(ugi0Var, 6, hqf.f13484a, jqfVar);
        }
        if (cldVarA.u(ugi0Var) || gqfVar != null) {
            cldVarA.p(ugi0Var, 7, eqf.f8235a, gqfVar);
        }
        cldVarA.c(ugi0Var);
    }
}
