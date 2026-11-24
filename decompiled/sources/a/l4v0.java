package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l4v0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jiy f19428a;
    private final ugi0 descriptor;

    public l4v0(jiy jiyVar) {
        jiyVar.getClass();
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.WebSocketRequest.PingRequest", this, 1);
        zna0Var.j("$type", true);
        this.descriptor = zna0Var;
        this.f19428a = jiyVar;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = this.descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new n4v0(i, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n4v0 n4v0Var = (n4v0) obj;
        n4v0Var.getClass();
        ugi0 ugi0Var = this.descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.p(ugi0Var, 0, okx.f25427a, n4v0Var.f22916a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return new jiy[]{this.f19428a};
    }
}
