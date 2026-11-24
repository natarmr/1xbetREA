package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c02 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c02 f3503a;
    private static final ugi0 descriptor;

    static {
        c02 c02Var = new c02();
        f3503a = c02Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.game.impl.game.data.models.AggregatorWebResponse", c02Var, 5);
        zna0Var.j("Games", true);
        zna0Var.j("FrameUrl", true);
        zna0Var.j("ConvertMessage", true);
        zna0Var.j("ErrorId", true);
        zna0Var.j("Message", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) e02.f[0].getValue());
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), okx.f25427a, mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = e02.f;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else if (iF == 3) {
                iJ = bldVarA.j(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new e02(i, list, str, str2, iJ, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e02 e02Var = (e02) obj;
        e02Var.getClass();
        String str = e02Var.e;
        int i = e02Var.d;
        String str2 = e02Var.c;
        String str3 = e02Var.b;
        List list = e02Var.f6969a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = e02.f;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(3, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
