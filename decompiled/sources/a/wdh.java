package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wdh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wdh f38973a;
    private static final ugi0 descriptor;

    static {
        wdh wdhVar = new wdh();
        f38973a = wdhVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.stagetable.CyberStageInternalTableInfoResponse", wdhVar, 2);
        zna0Var.j("groups", true);
        zna0Var.j("table", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) ydh.c[0].getValue()), mrv.j0(jeh.f16374a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ydh.c;
        boolean z = true;
        int i = 0;
        List list = null;
        leh lehVar = null;
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
                lehVar = (leh) bldVarA.e(ugi0Var, 1, jeh.f16374a, lehVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ydh(i, list, lehVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ydh ydhVar = (ydh) obj;
        ydhVar.getClass();
        leh lehVar = ydhVar.b;
        List list = ydhVar.f42437a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ydh.c;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || lehVar != null) {
            cldVarA.p(ugi0Var, 1, jeh.f16374a, lehVar);
        }
        cldVarA.c(ugi0Var);
    }
}
