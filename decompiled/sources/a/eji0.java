package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eji0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eji0 f7912a;
    private static final ugi0 descriptor;

    static {
        eji0 eji0Var = new eji0();
        f7912a = eji0Var;
        zna0 zna0Var = new zna0("com.google.firebase.sessions.SessionData", eji0Var, 3);
        zna0Var.j("sessionDetails", false);
        zna0Var.j("backgroundTime", true);
        zna0Var.j("processDataMap", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{nji0.f23639a, mrv.j0(mgq0.f21756a), mrv.j0((jiy) gji0.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = gji0.d;
        boolean z = true;
        int i = 0;
        pji0 pji0Var = null;
        pgq0 pgq0Var = null;
        Map map = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                pji0Var = (pji0) bldVarA.m(ugi0Var, 0, nji0.f23639a, pji0Var);
                i |= 1;
            } else if (iF == 1) {
                pgq0Var = (pgq0) bldVarA.e(ugi0Var, 1, mgq0.f21756a, pgq0Var);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                map = (Map) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new gji0(i, pji0Var, pgq0Var, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gji0 gji0Var = (gji0) obj;
        gji0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = gji0.d;
        nji0 nji0Var = nji0.f23639a;
        pji0 pji0Var = gji0Var.f11398a;
        Map map = gji0Var.c;
        pgq0 pgq0Var = gji0Var.b;
        cldVarA.m(ugi0Var, 0, nji0Var, pji0Var);
        if (cldVarA.u(ugi0Var) || pgq0Var != null) {
            cldVarA.p(ugi0Var, 1, mgq0.f21756a, pgq0Var);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
