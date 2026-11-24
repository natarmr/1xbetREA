package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ayb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ayb f1663a;
    private static final ugi0 descriptor;

    static {
        ayb aybVar = new ayb();
        f1663a = aybVar;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.ChatResponse", aybVar, 2);
        zna0Var.j("chat", true);
        zna0Var.j("users", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(axb.f1616a), mrv.j0((jiy) cyb.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = cyb.c;
        boolean z = true;
        int i = 0;
        cxb cxbVar = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                cxbVar = (cxb) bldVarA.e(ugi0Var, 0, axb.f1616a, cxbVar);
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
        return new cyb(i, cxbVar, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cyb cybVar = (cyb) obj;
        cybVar.getClass();
        List list = cybVar.b;
        cxb cxbVar = cybVar.f5165a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = cyb.c;
        if (cldVarA.u(ugi0Var) || cxbVar != null) {
            cldVarA.p(ugi0Var, 0, axb.f1616a, cxbVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
