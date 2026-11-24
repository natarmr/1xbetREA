package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class np3 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final np3 f23893a;
    private static final ugi0 descriptor;

    static {
        np3 np3Var = new np3();
        f23893a = np3Var;
        zna0 zna0Var = new zna0("org.xplatform.apple_fortune.data.models.requests.AppleFortuneCurrentWinRequest", np3Var, 4);
        zna0Var.j("UI", false);
        zna0Var.j("AN", false);
        zna0Var.j("LG", false);
        zna0Var.j("VU", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(okx.f25427a), mrv.j0(ysm0.f43175a), mrv.j0((jiy) pp3.e[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pp3.e;
        boolean z = true;
        int i = 0;
        Integer num = null;
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
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new pp3(i, num, l, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pp3 pp3Var = (pp3) obj;
        pp3Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pp3.e;
        cldVarA.p(ugi0Var, 0, s710.f31729a, pp3Var.f27356a);
        cldVarA.p(ugi0Var, 1, okx.f25427a, pp3Var.b);
        cldVarA.p(ugi0Var, 2, ysm0.f43175a, pp3Var.c);
        cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), pp3Var.d);
        cldVarA.c(ugi0Var);
    }
}
