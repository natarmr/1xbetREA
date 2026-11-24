package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class shi0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final shi0 f32214a;
    private static final ugi0 descriptor;

    static {
        shi0 shi0Var = new shi0();
        f32214a = shi0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexcore.data.errors.ServerError", shi0Var, 7);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("title", true);
        byte b = 26;
        zna0Var.k(new iy(new String[]{"ErrorMessage"}, b));
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("invalidFields", true);
        zna0Var.k(new iy(new String[]{"invalid_fields"}, b));
        zna0Var.j("detail", true);
        zna0Var.j("params", true);
        zna0Var.j("errorCode", true);
        zna0Var.k(new iy(new String[]{"error_code"}, (byte) 26));
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = uhi0.h;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[5].getValue()), mrv.j0(x0o.f40079a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = uhi0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        List list = null;
        String str3 = null;
        Map map = null;
        w0o w0oVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    map = (Map) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), map);
                    i |= 32;
                    break;
                case 6:
                    w0oVar = (w0o) bldVarA.e(ugi0Var, 6, x0o.f40079a, w0oVar);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new uhi0(i, str, str2, num, list, str3, map, w0oVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uhi0 uhi0Var = (uhi0) obj;
        uhi0Var.getClass();
        w0o w0oVar = uhi0Var.g;
        Map map = uhi0Var.f;
        String str = uhi0Var.e;
        List list = uhi0Var.d;
        Integer num = uhi0Var.c;
        String str2 = uhi0Var.b;
        String str3 = uhi0Var.f35681a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = uhi0.h;
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || w0oVar != null) {
            cldVarA.p(ugi0Var, 6, x0o.f40079a, w0oVar);
        }
        cldVarA.c(ugi0Var);
    }
}
