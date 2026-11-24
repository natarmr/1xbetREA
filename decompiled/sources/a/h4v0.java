package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h4v0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jiy f12453a;
    private final ugi0 descriptor;

    public h4v0(jiy jiyVar) {
        jiyVar.getClass();
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.WebSocketRequest.ClientRequestWithoutResponse", this, 3);
        zna0Var.j("target", true);
        zna0Var.j("payload", true);
        zna0Var.j("$type", true);
        this.descriptor = zna0Var;
        this.f12453a = jiyVar;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(this.f12453a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = this.descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Object objE = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                objE = bldVarA.e(ugi0Var, 1, this.f12453a, objE);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new j4v0(i, str, objE, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j4v0 j4v0Var = (j4v0) obj;
        j4v0Var.getClass();
        Object obj2 = j4v0Var.b;
        String str = j4v0Var.f15903a;
        ugi0 ugi0Var = this.descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || obj2 != null) {
            cldVarA.p(ugi0Var, 1, this.f12453a, obj2);
        }
        cldVarA.p(ugi0Var, 2, okx.f25427a, j4v0Var.c);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return new jiy[]{this.f12453a};
    }
}
