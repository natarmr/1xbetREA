package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u07 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u07 f34842a;
    private static final ugi0 descriptor;

    static {
        u07 u07Var = new u07();
        f34842a = u07Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.BetHighlightDataWrapper", u07Var, 5);
        zna0Var.j("Id", true);
        zna0Var.j("Success", true);
        zna0Var.j("Error", true);
        zna0Var.j("ErrorCode", true);
        zna0Var.j("Value", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = w07.f;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(sm8.f32432a), mrv.j0(ysm0.f43175a), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = w07.f;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else if (iF == 3) {
                num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new w07(i, bool, num, num2, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w07 w07Var = (w07) obj;
        w07Var.getClass();
        List list = w07Var.e;
        Integer num = w07Var.d;
        String str = w07Var.c;
        Boolean bool = w07Var.b;
        Integer num2 = w07Var.f38336a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = w07.f;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
