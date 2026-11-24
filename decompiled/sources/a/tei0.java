package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tei0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tei0 f33823a;
    private static final ugi0 descriptor;

    static {
        tei0 tei0Var = new tei0();
        f33823a = tei0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.SendMessageRequest.TextMessageRequest", tei0Var, 2);
        zna0Var.j(ParameterNames.TEXT, false);
        zna0Var.j("command", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, mrv.j0(uei0.f35530a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        wei0 wei0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                wei0Var = (wei0) bldVarA.e(ugi0Var, 1, uei0.f35530a, wei0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new yei0(i, strX, wei0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yei0 yei0Var = (yei0) obj;
        yei0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, yei0Var.f42488a);
        cldVarA.p(ugi0Var, 1, uei0.f35530a, yei0Var.b);
        cldVarA.c(ugi0Var);
    }
}
