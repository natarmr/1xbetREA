package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uqt implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uqt f36133a;
    private static final ugi0 descriptor;

    static {
        uqt uqtVar = new uqt();
        f36133a = uqtVar;
        zna0 zna0Var = new zna0("org.xplatform.responsible_game.impl.data.limits.models.GetAvailableLimitsResponse", uqtVar, 4);
        zna0Var.j("group", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("availableValues", true);
        zna0Var.j("measure", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = wqt.e;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wqt.e;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new wqt(i, num, str, str2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wqt wqtVar = (wqt) obj;
        wqtVar.getClass();
        String str = wqtVar.d;
        List list = wqtVar.c;
        Integer num = wqtVar.b;
        String str2 = wqtVar.f39608a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wqt.e;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
