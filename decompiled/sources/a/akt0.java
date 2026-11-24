package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class akt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final akt0 f1039a;
    private static final ugi0 descriptor;

    static {
        akt0 akt0Var = new akt0();
        f1039a = akt0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.UpdateFeedbackRequiredWSEvent", akt0Var, 3);
        zna0Var.j("chatId", true);
        zna0Var.j("dialogId", true);
        zna0Var.j("previous", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ckt0.f4525a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        ekt0 ekt0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                ekt0Var = (ekt0) bldVarA.e(ugi0Var, 2, ckt0.f4525a, ekt0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new fkt0(i, str, str2, ekt0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fkt0 fkt0Var = (fkt0) obj;
        fkt0Var.getClass();
        ekt0 ekt0Var = fkt0Var.c;
        String str = fkt0Var.b;
        String str2 = fkt0Var.f9710a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || ekt0Var != null) {
            cldVarA.p(ugi0Var, 2, ckt0.f4525a, ekt0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
