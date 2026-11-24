package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ern implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ern f8291a;
    private static final ugi0 descriptor;

    static {
        ern ernVar = new ern();
        f8291a = ernVar;
        zna0 zna0Var = new zna0("org.xplatform.personal.impl.data.models.EditSettingsRequest.NotificationsRequest", ernVar, 5);
        zna0Var.j("NotifyNewsEmail", false);
        zna0Var.j("NotifyBetEmail", false);
        zna0Var.j("NotifyAdsSMS", false);
        zna0Var.j("NotifyDep", false);
        zna0Var.j("NotifyNewsCall", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, okxVar, okxVar, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        int iJ5 = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ2 = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                iJ3 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                iJ4 = bldVarA.j(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                iJ5 = bldVarA.j(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new grn(i, iJ, iJ2, iJ3, iJ4, iJ5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        grn grnVar = (grn) obj;
        grnVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, grnVar.f11788a, ugi0Var);
        cldVarA.i(1, grnVar.b, ugi0Var);
        cldVarA.i(2, grnVar.c, ugi0Var);
        cldVarA.i(3, grnVar.d, ugi0Var);
        cldVarA.i(4, grnVar.e, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
