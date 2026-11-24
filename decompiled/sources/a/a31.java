package a;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a31 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a31 f150a;
    private static final ugi0 descriptor;

    static {
        a31 a31Var = new a31();
        f150a = a31Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.response.AggregatorHistoryResponse", a31Var, 3);
        zna0Var.j("betInfos", true);
        zna0Var.j("errorId", true);
        zna0Var.j(CrashHianalyticsData.MESSAGE, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) h31.d[0].getValue()), okx.f25427a, mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = h31.d;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        List list = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new h31(i, iJ, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        h31 h31Var = (h31) obj;
        h31Var.getClass();
        String str = h31Var.c;
        int i = h31Var.b;
        List list = h31Var.f12363a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = h31.d;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(1, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
