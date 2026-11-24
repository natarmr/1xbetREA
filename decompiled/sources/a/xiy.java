package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xiy implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xiy f40969a;
    private static final ugi0 descriptor;

    static {
        xiy xiyVar = new xiy();
        f40969a = xiyVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.kabaddi_top_players.data.models.response.KabaddiPlayerResponse", xiyVar, 4);
        zna0Var.j("playerId", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("image", true);
        zna0Var.j("statistics", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(s710.f31729a), mrv.j0(ysm0Var), mrv.j0(cjy.f4482a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Long l = null;
        String str2 = null;
        ejy ejyVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                ejyVar = (ejy) bldVarA.e(ugi0Var, 3, cjy.f4482a, ejyVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ziy(i, str, l, str2, ejyVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ziy ziyVar = (ziy) obj;
        ziyVar.getClass();
        ejy ejyVar = ziyVar.d;
        String str = ziyVar.c;
        Long l = ziyVar.b;
        String str2 = ziyVar.f44460a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || ejyVar != null) {
            cldVarA.p(ugi0Var, 3, cjy.f4482a, ejyVar);
        }
        cldVarA.c(ugi0Var);
    }
}
