package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kd6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd6 f18091a;
    private static final ugi0 descriptor;

    static {
        kd6 kd6Var = new kd6();
        f18091a = kd6Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.additional_info.data.BetAdditionalInfoResponse", kd6Var, 10);
        zna0Var.j("Sport", true);
        zna0Var.j("ChampName", true);
        zna0Var.j("Opp1Images", true);
        zna0Var.j("Opp1Name", true);
        zna0Var.j("Opp2Images", true);
        zna0Var.j("Opp2Name", true);
        zna0Var.j("IsFinished", true);
        zna0Var.j("Score", true);
        zna0Var.j("TeamNumber", true);
        zna0Var.j("OppNumber", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = md6.k;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0((jiy) a8zVarArr[2].getValue());
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0((jiy) a8zVarArr[4].getValue());
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(sm8.f32432a);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = md6.k;
        Integer num = null;
        Integer num2 = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Long l = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        List list2 = null;
        String str4 = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new md6(i, l, str2, list, str3, list2, str4, bool, str, num2, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        md6 md6Var = (md6) obj;
        md6Var.getClass();
        Integer num = md6Var.j;
        Integer num2 = md6Var.i;
        String str = md6Var.h;
        Boolean bool = md6Var.g;
        String str2 = md6Var.f;
        List list = md6Var.e;
        String str3 = md6Var.d;
        List list2 = md6Var.c;
        String str4 = md6Var.b;
        Long l = md6Var.f21582a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = md6.k;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
