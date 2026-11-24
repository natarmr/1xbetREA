package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e4v0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jiy f7202a;
    private final ugi0 descriptor;

    public e4v0(jiy jiyVar) {
        jiyVar.getClass();
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.WebSocketRequest.ClientRequest", this, 4);
        zna0Var.j("target", true);
        zna0Var.j("invocationId", true);
        zna0Var.j("payload", true);
        zna0Var.j("$type", true);
        this.descriptor = zna0Var;
        this.f7202a = jiyVar;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(this.f7202a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = this.descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Object objE = null;
        Integer num2 = null;
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
            } else if (iF == 2) {
                objE = bldVarA.e(ugi0Var, 2, this.f7202a, objE);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new g4v0(i, str, num, objE, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        g4v0 g4v0Var = (g4v0) obj;
        g4v0Var.getClass();
        Object obj2 = g4v0Var.c;
        Integer num = g4v0Var.b;
        String str = g4v0Var.f10687a;
        ugi0 ugi0Var = this.descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || obj2 != null) {
            cldVarA.p(ugi0Var, 2, this.f7202a, obj2);
        }
        cldVarA.p(ugi0Var, 3, okx.f25427a, g4v0Var.d);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return new jiy[]{this.f7202a};
    }
}
