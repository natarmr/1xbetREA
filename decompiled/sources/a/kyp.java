package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kyp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kyp f19117a;
    private static final ugi0 descriptor;

    static {
        kyp kypVar = new kyp();
        f19117a = kypVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.game.data.fighter.model.FighterStatsListResponse", kypVar, 2);
        zna0Var.j("error", true);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(shi0.f32214a), mrv.j0((jiy) myp.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = myp.c;
        boolean z = true;
        int i = 0;
        uhi0 uhi0Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                uhi0Var = (uhi0) bldVarA.e(ugi0Var, 0, shi0.f32214a, uhi0Var);
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
        return new myp(i, uhi0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        myp mypVar = (myp) obj;
        mypVar.getClass();
        List list = mypVar.b;
        uhi0 uhi0Var = mypVar.f22612a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = myp.c;
        if (cldVarA.u(ugi0Var) || uhi0Var != null) {
            cldVarA.p(ugi0Var, 0, shi0.f32214a, uhi0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
