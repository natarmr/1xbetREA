package a;

import com.huawei.hms.push.AttributionReporter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jo2 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jo2 f16837a;
    private static final ugi0 descriptor;

    static {
        jo2 jo2Var = new jo2();
        f16837a = jo2Var;
        zna0 zna0Var = new zna0("org.xplatform.app_update.impl.data.models.AlternatePathResponse", jo2Var, 5);
        zna0Var.j("countryIds", true);
        zna0Var.j(AttributionReporter.APP_VERSION, true);
        zna0Var.j("updateURL", true);
        zna0Var.j("forceUpdateVersionList", true);
        zna0Var.j("minAppVersion", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = lo2.f;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[0].getValue());
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lo2.f;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
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
                list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
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
        return new lo2(i, str, str2, str3, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lo2 lo2Var = (lo2) obj;
        lo2Var.getClass();
        String str = lo2Var.e;
        List list = lo2Var.d;
        String str2 = lo2Var.c;
        String str3 = lo2Var.b;
        List list2 = lo2Var.f20370a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = lo2.f;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
