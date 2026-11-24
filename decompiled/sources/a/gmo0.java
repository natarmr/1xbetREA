package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gmo0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gmo0 f11550a;
    private static final ugi0 descriptor;

    static {
        gmo0 gmo0Var = new gmo0();
        f11550a = gmo0Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.medal_statistic.data.models.TableTitleResponse", gmo0Var, 2);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("ratingValueCol", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0((jiy) mmo0.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mmo0.c;
        boolean z = true;
        int i = 0;
        Long l = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new mmo0(i, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mmo0 mmo0Var = (mmo0) obj;
        mmo0Var.getClass();
        List list = mmo0Var.b;
        Long l = mmo0Var.f22050a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mmo0.c;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
