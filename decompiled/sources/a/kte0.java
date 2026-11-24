package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kte0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kte0 f18862a;
    private static final ugi0 descriptor;

    static {
        kte0 kte0Var = new kte0();
        f18862a = kte0Var;
        zna0 zna0Var = new zna0("org.xplatform.feature.online_call.impl.data.rating_dialog.models.RegisterCallUserFeedbackResponse", kte0Var, 4);
        zna0Var.j("errorId", true);
        zna0Var.j(RemoteMessageConst.MessageBody.MSG, true);
        zna0Var.j("detailedMsg", true);
        zna0Var.j("dt", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Long l = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new mte0(i, num, l, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mte0 mte0Var = (mte0) obj;
        mte0Var.getClass();
        Long l = mte0Var.d;
        String str = mte0Var.c;
        String str2 = mte0Var.b;
        Integer num = mte0Var.f22367a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
