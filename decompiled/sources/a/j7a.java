package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j7a implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j7a f16030a;
    public static final zna0 b;

    static {
        j7a j7aVar = new j7a();
        f16030a = j7aVar;
        zna0 zna0Var = new zna0("org.xplatform.captcha.impl.data.model.CaptchaTaskResponse", j7aVar, 4);
        zna0Var.j("count", true);
        zna0Var.j("image", true);
        zna0Var.j("letCount", true);
        zna0Var.j(Payload.TYPE, true);
        b = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        zna0 zna0Var = b;
        bld bldVarA = rkjVar.a(zna0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(zna0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(zna0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(zna0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(zna0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                num3 = (Integer) bldVarA.e(zna0Var, 3, okx.f25427a, num3);
                i |= 8;
            }
        }
        bldVarA.c(zna0Var);
        return new l7a(i, num, num2, num3, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l7a l7aVar = (l7a) obj;
        l7aVar.getClass();
        Integer num = l7aVar.d;
        Integer num2 = l7aVar.c;
        String str = l7aVar.b;
        Integer num3 = l7aVar.f19549a;
        zna0 zna0Var = b;
        cld cldVarA = bwnVar.a(zna0Var);
        if (cldVarA.u(zna0Var) || num3 != null) {
            cldVarA.p(zna0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(zna0Var) || str != null) {
            cldVarA.p(zna0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(zna0Var) || num2 != null) {
            cldVarA.p(zna0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(zna0Var) || num != null) {
            cldVarA.p(zna0Var, 3, okx.f25427a, num);
        }
        cldVarA.c(zna0Var);
    }
}
