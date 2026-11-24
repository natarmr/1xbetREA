package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hgr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hgr f13026a;
    private static final ugi0 descriptor;

    static {
        hgr hgrVar = new hgr();
        f13026a = hgrVar;
        zna0 zna0Var = new zna0("GPWebAppSetActiveUserAccount", hgrVar, 3);
        zna0Var.j("requestId", true);
        zna0Var.j("accountId", false);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), s710.f31729a, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        String str = null;
        String strX = null;
        long jR = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new jgr(i, jR, str, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jgr jgrVar = (jgr) obj;
        jgrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(jgrVar, cldVarA, ugi0Var);
        long j = jgrVar.c;
        String str = jgrVar.d;
        cldVarA.n(ugi0Var, 1, j);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppSetActiveUserAccount")) {
            cldVarA.z(ugi0Var, 2, str);
        }
        cldVarA.c(ugi0Var);
    }
}
