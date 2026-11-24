package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gjo0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gjo0 f11410a;
    private static final ugi0 descriptor;

    static {
        gjo0 gjo0Var = new gjo0();
        f11410a = gjo0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.stagetable.data.common.model.TableContentResponse", gjo0Var, 2);
        zna0Var.j("groups", true);
        zna0Var.j("table", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) ijo0.c[0].getValue()), mrv.j0(lko0.f20210a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ijo0.c;
        boolean z = true;
        int i = 0;
        List list = null;
        tko0 tko0Var = null;
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
                tko0Var = (tko0) bldVarA.e(ugi0Var, 1, lko0.f20210a, tko0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ijo0(i, list, tko0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ijo0 ijo0Var = (ijo0) obj;
        ijo0Var.getClass();
        tko0 tko0Var = ijo0Var.b;
        List list = ijo0Var.f14884a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ijo0.c;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || tko0Var != null) {
            cldVarA.p(ugi0Var, 1, lko0.f20210a, tko0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
