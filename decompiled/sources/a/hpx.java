package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hpx implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hpx f13462a;
    private static final ugi0 descriptor;

    static {
        hpx hpxVar = new hpx();
        f13462a = hpxVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.online_call.impl.data.rating_dialog.models.IsCallExistResponse", hpxVar, 5);
        zna0Var.j("isExist", true);
        zna0Var.j("errorId", true);
        zna0Var.j(RemoteMessageConst.MessageBody.MSG, true);
        zna0Var.j("detailedMsg", true);
        zna0Var.j("dt", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(sm8.f32432a);
        jiy jiyVarJ1 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        Long l = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else if (iF == 3) {
                str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new jpx(i, bool, num, l, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jpx jpxVar = (jpx) obj;
        jpxVar.getClass();
        Long l = jpxVar.e;
        String str = jpxVar.d;
        String str2 = jpxVar.c;
        Integer num = jpxVar.b;
        Boolean bool = jpxVar.f16922a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
