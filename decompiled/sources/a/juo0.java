package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class juo0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final juo0 f17166a;
    private static final ugi0 descriptor;

    static {
        juo0 juo0Var = new juo0();
        f17166a = juo0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.daily_tasks.impl.data.model.TaskConditionResponse", juo0Var, 2);
        zna0Var.j("conditionKind", true);
        zna0Var.j(CommonConstant.ReqAccessTokenParam.STATE_LABEL, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(yqd.f43070a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        ard ardVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                ardVar = (ard) bldVarA.e(ugi0Var, 1, yqd.f43070a, ardVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new luo0(i, num, ardVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        luo0 luo0Var = (luo0) obj;
        luo0Var.getClass();
        ard ardVar = luo0Var.b;
        Integer num = luo0Var.f20683a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || ardVar != null) {
            cldVarA.p(ugi0Var, 1, yqd.f43070a, ardVar);
        }
        cldVarA.c(ugi0Var);
    }
}
