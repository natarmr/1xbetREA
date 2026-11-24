package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yig implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yig f42688a;
    private static final ugi0 descriptor;

    static {
        yig yigVar = new yig();
        f42688a = yigVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.champs.navigation.CyberChampsRoute", yigVar, 1);
        zna0Var.j("feedKind", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ajg.b[0].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ajg.b;
        boolean z = true;
        int i = 0;
        sip sipVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                sipVar = (sip) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), sipVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new ajg(i, sipVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ajg ajgVar = (ajg) obj;
        ajgVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) ajg.b[0].getValue(), ajgVar.f974a);
        cldVarA.c(ugi0Var);
    }
}
