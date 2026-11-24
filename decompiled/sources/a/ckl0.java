package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ckl0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ckl0 f4513a;
    private static final ugi0 descriptor;

    static {
        ckl0 ckl0Var = new ckl0();
        f4513a = ckl0Var;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.sport.SportResponse", ckl0Var, 8);
        zna0Var.j("sportId", true);
        zna0Var.j("name", true);
        zna0Var.j("command", true);
        zna0Var.j("shortName", true);
        zna0Var.j("isCyber", true);
        zna0Var.j("subSports", true);
        zna0Var.j("img", true);
        zna0Var.j("imgNew", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = wkl0.i;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a), mrv.j0((jiy) a8zVarArr[5].getValue()), mrv.j0(zel0.f44258a), mrv.j0((jiy) a8zVarArr[7].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wkl0.i;
        Object obj = null;
        boolean z = true;
        List list = null;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        List list2 = null;
        dfl0 dfl0Var = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    dfl0Var = (dfl0) bldVarA.e(ugi0Var, 6, zel0.f44258a, dfl0Var);
                    i |= 64;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new wkl0(i, l, str, str2, str3, bool, list2, dfl0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wkl0 wkl0Var = (wkl0) obj;
        wkl0Var.getClass();
        List list = wkl0Var.h;
        dfl0 dfl0Var = wkl0Var.g;
        List list2 = wkl0Var.f;
        Boolean bool = wkl0Var.e;
        String str = wkl0Var.d;
        String str2 = wkl0Var.c;
        String str3 = wkl0Var.b;
        Long l = wkl0Var.f39312a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wkl0.i;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || dfl0Var != null) {
            cldVarA.p(ugi0Var, 6, zel0.f44258a, dfl0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
