package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ckt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ckt0 f4525a;
    private static final ugi0 descriptor;

    static {
        ckt0 ckt0Var = new ckt0();
        f4525a = ckt0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.UpdateFeedbackRequiredWSEvent.PreviousFeedback", ckt0Var, 2);
        zna0Var.j("rate", true);
        zna0Var.j("resolved", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ag9.f814a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Byte b = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                b = (Byte) bldVarA.e(ugi0Var, 0, ag9.f814a, b);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ekt0(i, b, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ekt0 ekt0Var = (ekt0) obj;
        ekt0Var.getClass();
        Boolean bool = ekt0Var.b;
        Byte b = ekt0Var.f7969a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || b != null) {
            cldVarA.p(ugi0Var, 0, ag9.f814a, b);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
