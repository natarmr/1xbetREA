package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nxw implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nxw f24302a;
    private static final ugi0 descriptor;

    static {
        nxw nxwVar = new nxw();
        f24302a = nxwVar;
        zna0 zna0Var = new zna0("org.xplatform.social.impl.socials.firebase_auth.entity.identities.Identities", nxwVar, 2);
        zna0Var.j("twitter.com", false);
        zna0Var.k(new iy(new String[]{"apple.com"}, (byte) 21));
        zna0Var.j("email", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = pxw.c;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pxw.c;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new pxw(i, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pxw pxwVar = (pxw) obj;
        pxwVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pxw.c;
        jiy jiyVar = (jiy) a8zVarArr[0].getValue();
        List list = pxwVar.f27776a;
        List list2 = pxwVar.b;
        cldVarA.p(ugi0Var, 0, jiyVar, list);
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        cldVarA.c(ugi0Var);
    }
}
