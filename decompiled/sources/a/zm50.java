package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zm50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zm50 f44608a;
    private static final ugi0 descriptor;

    static {
        zm50 zm50Var = new zm50();
        f44608a = zm50Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.NewPlaceAuthRequest", zm50Var, 3);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("rt", false);
        zna0Var.j("pl", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, bn50.f2866a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        dn50 dn50Var = null;
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
                dn50Var = (dn50) bldVarA.m(ugi0Var, 2, bn50.f2866a, dn50Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new en50(i, strX, strX2, dn50Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        en50 en50Var = (en50) obj;
        en50Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, en50Var.f8076a);
        cldVarA.z(ugi0Var, 1, en50Var.b);
        cldVarA.m(ugi0Var, 2, bn50.f2866a, en50Var.c);
        cldVarA.c(ugi0Var);
    }
}
