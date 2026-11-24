package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ego implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ego f7774a;
    private static final ugi0 descriptor;

    static {
        ego egoVar = new ego();
        f7774a = egoVar;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.who_win.data.model.response.EventResponse", egoVar, 10);
        zna0Var.j("shortGroupId", true);
        zna0Var.j("groupId", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("parameter", true);
        zna0Var.j("player", true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("blocked", true);
        zna0Var.j("gameId", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tgo.f33922a), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(sm8.f32432a), mrv.j0(okxVar), mrv.j0(ngo.f23496a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        rgo rgoVar = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        Long l = null;
        Integer num2 = null;
        Integer num3 = null;
        Double d = null;
        vgo vgoVar = null;
        Double d2 = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    vgoVar = (vgo) bldVarA.e(ugi0Var, 4, tgo.f33922a, vgoVar);
                    i |= 16;
                    break;
                case 5:
                    d2 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d2);
                    i |= 32;
                    break;
                case 6:
                    str = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                case 9:
                    rgoVar = (rgo) bldVarA.e(ugi0Var, 9, ngo.f23496a, rgoVar);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new zgo(i, l, num2, num3, d, vgoVar, d2, str, bool, num, rgoVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zgo zgoVar = (zgo) obj;
        zgoVar.getClass();
        rgo rgoVar = zgoVar.j;
        Integer num = zgoVar.i;
        Boolean bool = zgoVar.h;
        String str = zgoVar.g;
        Double d = zgoVar.f;
        vgo vgoVar = zgoVar.e;
        Double d2 = zgoVar.d;
        Integer num2 = zgoVar.c;
        Integer num3 = zgoVar.b;
        Long l = zgoVar.f44354a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || vgoVar != null) {
            cldVarA.p(ugi0Var, 4, tgo.f33922a, vgoVar);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || rgoVar != null) {
            cldVarA.p(ugi0Var, 9, ngo.f23496a, rgoVar);
        }
        cldVarA.c(ugi0Var);
    }
}
