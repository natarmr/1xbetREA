package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lk90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lk90 f20190a;
    private static final ugi0 descriptor;

    static {
        lk90 lk90Var = new lk90();
        f20190a = lk90Var;
        zna0 zna0Var = new zna0("org.xplatform.personal.impl.presentation.gender.models.PersonalGenderChoice", lk90Var, 2);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("name", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new nk90(i, iJ, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nk90 nk90Var = (nk90) obj;
        nk90Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, nk90Var.f23672a, ugi0Var);
        cldVarA.z(ugi0Var, 1, nk90Var.b);
        cldVarA.c(ugi0Var);
    }
}
