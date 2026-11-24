package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xlc implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xlc f41065a;
    private static final ugi0 descriptor;

    static {
        xlc xlcVar = new xlc();
        f41065a = xlcVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.common.data.leaderboard.model.ClassRankingResponse", xlcVar, 4);
        zna0Var.j("weightClass", true);
        zna0Var.j(CommonConstant.KEY_GENDER, true);
        zna0Var.j("champion", true);
        zna0Var.j("fighters", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(f8v0.f9128a), mrv.j0(ysm0.f43175a), mrv.j0(kwp.f19013a), mrv.j0((jiy) zlc.e[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zlc.e;
        boolean z = true;
        int i = 0;
        e8v0 e8v0Var = null;
        String str = null;
        mwp mwpVar = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                e8v0Var = (e8v0) bldVarA.e(ugi0Var, 0, f8v0.f9128a, e8v0Var);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                mwpVar = (mwp) bldVarA.e(ugi0Var, 2, kwp.f19013a, mwpVar);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new zlc(i, e8v0Var, str, mwpVar, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zlc zlcVar = (zlc) obj;
        zlcVar.getClass();
        List list = zlcVar.d;
        mwp mwpVar = zlcVar.c;
        String str = zlcVar.b;
        e8v0 e8v0Var = zlcVar.f44573a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zlc.e;
        if (cldVarA.u(ugi0Var) || e8v0Var != null) {
            cldVarA.p(ugi0Var, 0, f8v0.f9128a, e8v0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || mwpVar != null) {
            cldVarA.p(ugi0Var, 2, kwp.f19013a, mwpVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
