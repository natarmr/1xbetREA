package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class reh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final reh f30334a;
    private static final ugi0 descriptor;

    static {
        reh rehVar = new reh();
        f30334a = rehVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.stagetable.CyberStageTableInfoResponse", rehVar, 1);
        zna0Var.j("table", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(wdh.f38973a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ydh ydhVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                ydhVar = (ydh) bldVarA.e(ugi0Var, 0, wdh.f38973a, ydhVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new teh(i, ydhVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        teh tehVar = (teh) obj;
        tehVar.getClass();
        ydh ydhVar = tehVar.f33820a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ydhVar != null) {
            cldVarA.p(ugi0Var, 0, wdh.f38973a, ydhVar);
        }
        cldVarA.c(ugi0Var);
    }
}
