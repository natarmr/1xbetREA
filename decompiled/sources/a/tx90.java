package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tx90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tx90 f34686a;
    private static final ugi0 descriptor;

    static {
        tx90 tx90Var = new tx90();
        f34686a = tx90Var;
        zna0 zna0Var = new zna0("org.xplatform.data.betting.sport_game.responses.PlayZoneConfigResponse.Sport", tx90Var, 4);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("v", true);
        zna0Var.j("device", true);
        zna0Var.j("test", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = vx90.e;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = vx90.e;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        String[] strArr = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                strArr = (String[]) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), strArr);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new vx90(i, num, num2, strArr, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vx90 vx90Var = (vx90) obj;
        vx90Var.getClass();
        Integer num = vx90Var.d;
        String[] strArr = vx90Var.c;
        Integer num2 = vx90Var.b;
        Integer num3 = vx90Var.f38190a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = vx90.e;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || strArr != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), strArr);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
