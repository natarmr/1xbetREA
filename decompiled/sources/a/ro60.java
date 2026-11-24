package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ro60 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ro60 f30822a;
    private static final ugi0 descriptor;

    static {
        ro60 ro60Var = new ro60();
        f30822a = ro60Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.models.OneXGameWorkStatusResponseOld", ro60Var, 2);
        zna0Var.j("GI", true);
        zna0Var.j(TokenNames.S, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(xpv0.f41285a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        uo60 uo60Var = null;
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
                uo60Var = (uo60) bldVarA.e(ugi0Var, 1, xpv0.f41285a, uo60Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new vo60(i, l, uo60Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vo60 vo60Var = (vo60) obj;
        vo60Var.getClass();
        uo60 uo60Var = vo60Var.b;
        Long l = vo60Var.f37751a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || uo60Var != null) {
            cldVarA.p(ugi0Var, 1, xpv0.f41285a, uo60Var);
        }
        cldVarA.c(ugi0Var);
    }
}
