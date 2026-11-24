package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qqf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qqf0 f29164a;
    private static final ugi0 descriptor;

    static {
        qqf0 qqf0Var = new qqf0();
        f29164a = qqf0Var;
        zna0 zna0Var = new zna0("org.xplatform.resident.data.model.request.ResidentMakeActionRequest", qqf0Var, 5);
        zna0Var.j("WH", false);
        zna0Var.j("LG", false);
        zna0Var.j("AN", false);
        zna0Var.j("CE", false);
        zna0Var.j("GI", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{okxVar, ysm0Var, okxVar, jiyVarJ0, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        Integer num = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                iJ2 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new sqf0(i, iJ, strX, iJ2, num, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sqf0 sqf0Var = (sqf0) obj;
        sqf0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, sqf0Var.f32628a, ugi0Var);
        cldVarA.z(ugi0Var, 1, sqf0Var.b);
        cldVarA.i(2, sqf0Var.c, ugi0Var);
        cldVarA.p(ugi0Var, 3, okx.f25427a, sqf0Var.d);
        cldVarA.z(ugi0Var, 4, sqf0Var.e);
        cldVarA.c(ugi0Var);
    }
}
