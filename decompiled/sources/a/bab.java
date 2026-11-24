package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bab implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bab f2249a;
    private static final ugi0 descriptor;

    static {
        bab babVar = new bab();
        f2249a = babVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.stagetable.data.common.model.CellResponse", babVar, 5);
        zna0Var.j("value", true);
        zna0Var.j("isOffset", true);
        zna0Var.j("contentType", true);
        zna0Var.j("contentIconType", true);
        zna0Var.j("competitorId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) fab.f[0].getValue());
        jiy jiyVarJ1 = mrv.j0(sm8.f32432a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fab.f;
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
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else if (iF == 3) {
                num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new fab(i, bool, num, num2, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fab fabVar = (fab) obj;
        fabVar.getClass();
        String str = fabVar.e;
        Integer num = fabVar.d;
        Integer num2 = fabVar.c;
        Boolean bool = fabVar.b;
        List list = fabVar.f9200a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fab.f;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
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
