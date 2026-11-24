package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vjr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vjr0 f37544a;
    private static final ugi0 descriptor;

    static {
        vjr0 vjr0Var = new vjr0();
        f37544a = vjr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_bet.makebet.data.model.request.TotoBetGameOutcomeRequest", vjr0Var, 2);
        zna0Var.j("gameId", false);
        zna0Var.j("outcome", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0((jiy) xjr0.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xjr0.c;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new xjr0(i, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xjr0 xjr0Var = (xjr0) obj;
        xjr0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xjr0.c;
        cldVarA.p(ugi0Var, 0, okx.f25427a, xjr0Var.f41001a);
        cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), xjr0Var.b);
        cldVarA.c(ugi0Var);
    }
}
