package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vyr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vyr0 f38263a;
    private static final ugi0 descriptor;

    static {
        vyr0 vyr0Var = new vyr0();
        f38263a = vyr0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.TournamentCardResponse.Counter", vyr0Var, 4);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("eventDt", true);
        zna0Var.j("secondsToExpire", true);
        zna0Var.j("title", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(azr0.f1734a);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        zyr0 zyr0Var = null;
        Long l = null;
        Long l2 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                zyr0Var = (zyr0) bldVarA.e(ugi0Var, 0, azr0.f1734a, zyr0Var);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else if (iF == 2) {
                l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new xyr0(i, zyr0Var, l, l2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xyr0 xyr0Var = (xyr0) obj;
        xyr0Var.getClass();
        String str = xyr0Var.d;
        Long l = xyr0Var.c;
        Long l2 = xyr0Var.b;
        zyr0 zyr0Var = xyr0Var.f41719a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || zyr0Var != null) {
            cldVarA.p(ugi0Var, 0, azr0.f1734a, zyr0Var);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
