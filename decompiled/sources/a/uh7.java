package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uh7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uh7 f35663a;
    private static final ugi0 descriptor;

    static {
        uh7 uh7Var = new uh7();
        f35663a = uh7Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.zip.data.model.BetPlayerZipResponse", uh7Var, 2);
        zna0Var.j(TokenNames.I, true);
        zna0Var.j("N", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
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
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new wh7(i, l, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wh7 wh7Var = (wh7) obj;
        wh7Var.getClass();
        String str = wh7Var.b;
        Long l = wh7Var.f39152a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
