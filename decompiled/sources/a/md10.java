package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class md10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final md10 f21575a;
    private static final ugi0 descriptor;

    static {
        md10 md10Var = new md10();
        f21575a = md10Var;
        zna0 zna0Var = new zna0("org.xplatform.lotto.impl.data.models.LottoResponse", md10Var, 5);
        zna0Var.j("Games", true);
        zna0Var.j("FrameUrl", true);
        zna0Var.j("ConvertMessage", true);
        zna0Var.j("ErrorId", true);
        zna0Var.j("Message", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) od10.f[0].getValue());
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = od10.f;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
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
                num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
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
        return new od10(i, num, str, str2, str3, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        od10 od10Var = (od10) obj;
        od10Var.getClass();
        String str = od10Var.e;
        Integer num = od10Var.d;
        String str2 = od10Var.c;
        String str3 = od10Var.b;
        List list = od10Var.f25056a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = od10.f;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
