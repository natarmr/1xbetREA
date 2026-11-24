package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uv80 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uv80 f36336a;
    private static final ugi0 descriptor;

    static {
        uv80 uv80Var = new uv80();
        f36336a = uv80Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.ParticipantTypingWSEvent", uv80Var, 3);
        zna0Var.j("action", true);
        zna0Var.j("chatId", true);
        zna0Var.j("fromId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(vv80.f38088a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        xv80 xv80Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                xv80Var = (xv80) bldVarA.e(ugi0Var, 0, vv80.f38088a, xv80Var);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new zv80(i, xv80Var, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zv80 zv80Var = (zv80) obj;
        zv80Var.getClass();
        String str = zv80Var.c;
        String str2 = zv80Var.b;
        xv80 xv80Var = zv80Var.f45044a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || xv80Var != null) {
            cldVarA.p(ugi0Var, 0, vv80.f38088a, xv80Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
