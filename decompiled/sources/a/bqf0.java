package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bqf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bqf0 f3027a;
    private static final ugi0 descriptor;

    static {
        bqf0 bqf0Var = new bqf0();
        f3027a = bqf0Var;
        zna0 zna0Var = new zna0("org.xplatform.resident.data.model.request.ResidentGetActiveGameRequest", bqf0Var, 3);
        zna0Var.j("VU", true);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{dqf0.d[0].getValue(), ysm0.f43175a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = dqf0.d;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        List list = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new dqf0(i, iJ, strX, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dqf0 dqf0Var = (dqf0) obj;
        dqf0Var.getClass();
        List list = dqf0Var.f6513a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = dqf0.d;
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(list, kotlin.collections.a.c(0L))) {
            cldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        cldVarA.z(ugi0Var, 1, dqf0Var.b);
        cldVarA.i(2, dqf0Var.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
