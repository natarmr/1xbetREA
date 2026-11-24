package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fzf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fzf0 f10405a;
    private static final ugi0 descriptor;

    static {
        fzf0 fzf0Var = new fzf0();
        f10405a = fzf0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.RestorePasswordRequest", fzf0Var, 3);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("rt", false);
        zna0Var.j("pl", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, izf0.f15632a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        kzf0 kzf0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                kzf0Var = (kzf0) bldVarA.m(ugi0Var, 2, izf0.f15632a, kzf0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new mzf0(i, strX, strX2, kzf0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mzf0 mzf0Var = (mzf0) obj;
        mzf0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, mzf0Var.f22653a);
        cldVarA.z(ugi0Var, 1, mzf0Var.b);
        cldVarA.m(ugi0Var, 2, izf0.f15632a, mzf0Var.c);
        cldVarA.c(ugi0Var);
    }
}
