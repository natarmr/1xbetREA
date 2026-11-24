package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vv80 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vv80 f38088a;
    private static final ugi0 descriptor;

    static {
        vv80 vv80Var = new vv80();
        f38088a = vv80Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.ParticipantTypingWSEvent.Action", vv80Var, 1);
        zna0Var.j("$type", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new xv80(i, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xv80 xv80Var = (xv80) obj;
        xv80Var.getClass();
        String str = xv80Var.f41547a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
