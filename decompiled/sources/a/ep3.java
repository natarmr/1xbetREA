package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ep3 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ep3 f8166a;
    private static final ugi0 descriptor;

    static {
        ep3 ep3Var = new ep3();
        f8166a = ep3Var;
        zna0 zna0Var = new zna0("org.xplatform.apple_fortune.data.models.requests.AppleFortuneActionRequest", ep3Var, 5);
        zna0Var.j("UI", false);
        zna0Var.j("AN", false);
        zna0Var.j("CE", false);
        zna0Var.j("LG", false);
        zna0Var.j("VU", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = gp3.f;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = gp3.f;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        String str = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else if (iF == 3) {
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
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
        return new gp3(i, num, num2, l, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gp3 gp3Var = (gp3) obj;
        gp3Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = gp3.f;
        cldVarA.p(ugi0Var, 0, s710.f31729a, gp3Var.f11663a);
        okx okxVar = okx.f25427a;
        cldVarA.p(ugi0Var, 1, okxVar, gp3Var.b);
        cldVarA.p(ugi0Var, 2, okxVar, gp3Var.c);
        cldVarA.p(ugi0Var, 3, ysm0.f43175a, gp3Var.d);
        cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), gp3Var.e);
        cldVarA.c(ugi0Var);
    }
}
