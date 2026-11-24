package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uq1 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uq1 f36095a;
    private static final ugi0 descriptor;

    static {
        uq1 uq1Var = new uq1();
        f36095a = uq1Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.category.data.models.AggregatorSpecialBannerResponse", uq1Var, 4);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("image", true);
        zna0Var.j(ParameterNames.TEXT, true);
        zna0Var.j("navigation", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), vp1.f37790a, xq1.f41292a, mrv.j0(sq1.f32610a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        xp1 xp1Var = null;
        zq1 zq1Var = null;
        rq1 rq1Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                xp1Var = (xp1) bldVarA.m(ugi0Var, 1, vp1.f37790a, xp1Var);
                i |= 2;
            } else if (iF == 2) {
                zq1Var = (zq1) bldVarA.m(ugi0Var, 2, xq1.f41292a, zq1Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                rq1Var = (rq1) bldVarA.e(ugi0Var, 3, sq1.f32610a, rq1Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new wq1(i, l, xp1Var, zq1Var, rq1Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wq1 wq1Var = (wq1) obj;
        wq1Var.getClass();
        rq1 rq1Var = wq1Var.d;
        zq1 zq1Var = wq1Var.c;
        xp1 xp1Var = wq1Var.b;
        Long l = wq1Var.f39568a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(xp1Var, new xp1())) {
            cldVarA.m(ugi0Var, 1, vp1.f37790a, xp1Var);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(zq1Var, new zq1())) {
            cldVarA.m(ugi0Var, 2, xq1.f41292a, zq1Var);
        }
        if (cldVarA.u(ugi0Var) || rq1Var != null) {
            cldVarA.p(ugi0Var, 3, sq1.f32610a, rq1Var);
        }
        cldVarA.c(ugi0Var);
    }
}
