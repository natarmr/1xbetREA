package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lmf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lmf0 f20294a;
    private static final ugi0 descriptor;

    static {
        lmf0 lmf0Var = new lmf0();
        f20294a = lmf0Var;
        zna0 zna0Var = new zna0("org.xplatform.analytics.data.logger.RequestErrorLogger.Error", lmf0Var, 1);
        zna0Var.j("Error", true);
        zna0Var.k(new iy(new String[]{"error"}, (byte) 25));
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(qcy.f28507a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        mcy mcyVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                mcyVar = (mcy) bldVarA.e(ugi0Var, 0, qcy.f28507a, mcyVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new nmf0(i, mcyVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nmf0 nmf0Var = (nmf0) obj;
        nmf0Var.getClass();
        mcy mcyVar = nmf0Var.f23769a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(mcyVar, ncy.c(""))) {
            cldVarA.p(ugi0Var, 0, qcy.f28507a, mcyVar);
        }
        cldVarA.c(ugi0Var);
    }
}
