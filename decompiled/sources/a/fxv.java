package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fxv implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fxv f10330a;
    private static final ugi0 descriptor;

    static {
        fxv fxvVar = new fxv();
        f10330a = fxvVar;
        zna0 zna0Var = new zna0("org.xplatform.prophylaxis.impl.prophylaxis.data.models.HighLoadResponse", fxvVar, 2);
        zna0Var.j(CommonConstant.ReqAccessTokenParam.STATE_LABEL, true);
        zna0Var.j("projects", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(sm8.f32432a), mrv.j0((jiy) hxv.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = hxv.c;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new hxv(i, bool, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hxv hxvVar = (hxv) obj;
        hxvVar.getClass();
        List list = hxvVar.b;
        Boolean bool = hxvVar.f13830a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = hxv.c;
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
