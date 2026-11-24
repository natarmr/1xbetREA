package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uns0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uns0 f35979a;
    private static final ugi0 descriptor;

    static {
        uns0 uns0Var = new uns0();
        f35979a = uns0Var;
        zna0 zna0Var = new zna0("org.xplatform.rules.api.data.models.TranslationResponse", uns0Var, 9);
        zna0Var.j("title", true);
        zna0Var.j("title_loc", true);
        zna0Var.j("descr", true);
        zna0Var.j("descr_loc", true);
        zna0Var.j("img", true);
        zna0Var.j("style", true);
        zna0Var.j("href", true);
        zna0Var.j(ParameterNames.INFO, true);
        zna0Var.j(Payload.TYPE, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = wns0.j;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(zsw.f44927a), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wns0.j;
        String str = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String str2 = null;
        Map map = null;
        String str3 = null;
        Map map2 = null;
        String str4 = null;
        String str5 = null;
        btw btwVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    break;
                case 3:
                    map2 = (Map) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), map2);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str5);
                    i |= 32;
                    break;
                case 6:
                    btwVar = (btw) bldVarA.e(ugi0Var, 6, zsw.f44927a, btwVar);
                    i |= 64;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new wns0(i, str2, map, str3, map2, str4, str5, btwVar, list, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wns0 wns0Var = (wns0) obj;
        wns0Var.getClass();
        String str = wns0Var.i;
        List list = wns0Var.h;
        btw btwVar = wns0Var.g;
        String str2 = wns0Var.f;
        String str3 = wns0Var.e;
        Map map = wns0Var.d;
        String str4 = wns0Var.c;
        Map map2 = wns0Var.b;
        String str5 = wns0Var.f39463a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wns0.j;
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || map2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(btwVar, new btw())) {
            cldVarA.p(ugi0Var, 6, zsw.f44927a, btwVar);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(list, iun.f15405a)) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
