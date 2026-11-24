package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hsr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hsr0 f13598a;
    private static final ugi0 descriptor;

    static {
        hsr0 hsr0Var = new hsr0();
        f13598a = hsr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_jackpot.impl.data.model.TotoJackpotTypesResponse", hsr0Var, 1);
        zna0Var.j("JackpotTypes", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) jsr0.b[0].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jsr0.b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new jsr0(i, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jsr0 jsr0Var = (jsr0) obj;
        jsr0Var.getClass();
        List list = jsr0Var.f17068a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jsr0.b;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
