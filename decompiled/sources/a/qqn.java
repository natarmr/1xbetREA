package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qqn implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qqn f29174a;
    private static final ugi0 descriptor;

    static {
        qqn qqnVar = new qqn();
        f29174a = qqnVar;
        zna0 zna0Var = new zna0("org.xplatform.personal.impl.data.models.EditProfileResponse", qqnVar, 3);
        zna0Var.j("Message", true);
        zna0Var.j("MessageId", true);
        zna0Var.j("Form", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(okx.f25427a), mrv.j0(zpn.f44767a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        bqn bqnVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                bqnVar = (bqn) bldVarA.e(ugi0Var, 2, zpn.f44767a, bqnVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new sqn(i, str, num, bqnVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sqn sqnVar = (sqn) obj;
        sqnVar.getClass();
        bqn bqnVar = sqnVar.c;
        Integer num = sqnVar.b;
        String str = sqnVar.f32637a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bqnVar != null) {
            cldVarA.p(ugi0Var, 2, zpn.f44767a, bqnVar);
        }
        cldVarA.c(ugi0Var);
    }
}
