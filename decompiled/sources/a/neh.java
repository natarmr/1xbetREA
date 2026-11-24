package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class neh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final neh f23385a;
    private static final ugi0 descriptor;

    static {
        neh nehVar = new neh();
        f23385a = nehVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.stagetable.CyberStageTableGroupResponse", nehVar, 2);
        zna0Var.j("title", true);
        zna0Var.j("table", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(jeh.f16374a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        leh lehVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                lehVar = (leh) bldVarA.e(ugi0Var, 1, jeh.f16374a, lehVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new peh(i, str, lehVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        peh pehVar = (peh) obj;
        pehVar.getClass();
        leh lehVar = pehVar.b;
        String str = pehVar.f26852a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || lehVar != null) {
            cldVarA.p(ugi0Var, 1, jeh.f16374a, lehVar);
        }
        cldVarA.c(ugi0Var);
    }
}
