package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nja implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nja f23625a;
    private static final ugi0 descriptor;

    static {
        nja njaVar = new nja();
        f23625a = njaVar;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.data.model.CardListResponse", njaVar, 3);
        zna0Var.j("cards", true);
        zna0Var.j("switchFilter", true);
        zna0Var.j("timestamp", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) pja.d[0].getValue()), mrv.j0(sm8.f32432a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pja.d;
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new pja(i, bool, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pja pjaVar = (pja) obj;
        pjaVar.getClass();
        Long l = pjaVar.c;
        Boolean bool = pjaVar.b;
        List list = pjaVar.f27079a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pja.d;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
