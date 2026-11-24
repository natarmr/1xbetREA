package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lrw implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lrw f20550a;
    private static final ugi0 descriptor;

    static {
        lrw lrwVar = new lrw();
        f20550a = lrwVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.horses_race_menu.data.model.HorsesResponse", lrwVar, 5);
        zna0Var.j("dateStart", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("menu", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("title", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = nrw.f;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(okx.f25427a), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = nrw.f;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Long l = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else if (iF == 3) {
                num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new nrw(i, num, l, str, str2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nrw nrwVar = (nrw) obj;
        nrwVar.getClass();
        String str = nrwVar.e;
        Integer num = nrwVar.d;
        List list = nrwVar.c;
        String str2 = nrwVar.b;
        Long l = nrwVar.f24025a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = nrw.f;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
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
