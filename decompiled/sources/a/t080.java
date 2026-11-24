package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t080 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t080 f33107a;
    private static final ugi0 descriptor;

    static {
        t080 t080Var = new t080();
        f33107a = t080Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.OperationRequest", t080Var, 3);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("rt", false);
        zna0Var.j("pl", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, v080.f36569a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        x080 x080Var = null;
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
                x080Var = (x080) bldVarA.m(ugi0Var, 2, v080.f36569a, x080Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new y080(i, strX, strX2, x080Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y080 y080Var = (y080) obj;
        y080Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, y080Var.f41795a);
        cldVarA.z(ugi0Var, 1, y080Var.b);
        cldVarA.m(ugi0Var, 2, v080.f36569a, y080Var.c);
        cldVarA.c(ugi0Var);
    }
}
